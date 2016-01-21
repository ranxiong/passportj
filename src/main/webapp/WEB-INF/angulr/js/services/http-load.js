'use strict';

/*
* 服务器端读取数据
* $q 同步读取数据
*/

angular.module('http.load', [])
	.service('httpLoad', ['$http', '$document', '$q', '$timeout', function ($http, $document, $q, $timeout) {

  	var deferred = $q.defer(); // 声明延后执行，表示要去监控后面的执行
  	var method = 'POST';
  	var URL = ROOT_URL;
  	var token = localStorage.getItem('voyager-influencerToken') || '';
      
    // 参数： 接口名， json或者字符串参数， 发送的数据， 页面蒙板， 提示报错
    this.loadContents = function(url, params, data, loadinghide, ignoreError) {
      var params = params || {};
    	var data = data || {};
    	var loadinghide = loadinghide || false; //默认显示loading时动画
    	var ignoreError = ignoreError || false; //默认不忽略报错提示
      URL += '/' + url;

      $http({
      	method: method,
      	url: URL,
        params: params,
      	data: data,
      	timeout: IS_ONLINE ? 10000 : 0
      }).
      success(function(data, status, headers, config) {  
        deferred.resolve(data);  // 声明执行成功，即http请求数据成功，可以返回数据了  
      }).
      error(function(data, status, headers, config) {  
        deferred.reject(data);   // 声明执行失败，即服务器返回错误  
      });
      return deferred.promise;   // 返回承诺，这里并不是最终数据，而是访问最终数据的API 
  };
}]);