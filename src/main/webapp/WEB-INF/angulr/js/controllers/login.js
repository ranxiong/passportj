app.controller('LoginCtrl', ['$scope', 'httpLoad', function($scope, httpLoad) {
	$scope.test = "hello world!";
  $scope.data = {};

	var promise = httpLoad.loadContents('merchant/login.do', {
		'email': 'zhaoyali@dhgate.com',
    'password': '000000'
    });

	promise.then(function(data) {  // 调用承诺API获取数据 .resolve
    $scope.data = data;
    console.log($scope.data);
  }, function(data) {  // 处理错误 .reject
    $scope.data = data;
  });
}]);