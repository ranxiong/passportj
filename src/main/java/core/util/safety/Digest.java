package core.util.safety;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import java.io.File;
import java.security.MessageDigest;

/**
 * TODO 多线程问题
 */
public final class Digest {
    private static char hexDigits[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    private final static String KEY_MD5 = "MD5";
    private final static String KEY_SHA = "SHA";
    private static Digest _digest = null;

    private Digest() {}
    public static Digest getInstance() {
        if (null == _digest) {
            _digest = new Digest();
        }
        return _digest;
    }

    /**
     * base64 编码
     * @param encryptString
     * @return
     */
    public synchronized String encryptBASE64(String encryptString) {
        return (new BASE64Encoder()).encodeBuffer(encryptString.getBytes());
    }

    /**
     * base64 解码
     * @param decryptString
     * @return
     * @throws Exception
     */
    public synchronized String decryptBASE64(String decryptString) throws Exception {
        return new String((new BASE64Decoder()).decodeBuffer(decryptString));
    }

    /**
     * 生成md5字符
     *
     * @param encryptString
     * @return
     * @throws Exception
     */
    public String encryptHexMD5(String encryptString) throws Exception {
        return _encryptHexMD5(encryptString.getBytes());
    }

    /**
     * 生成文件md5
     *
     * @param file
     * @return
     * @throws Exception
     */
    public String encryptHexMD5(File file) throws Exception {
        return "";
    }

    /**
     * @param encryptString
     * @return
     */
    public String encryptHexSHA(String encryptString) throws Exception {
        return _encryptHexSHA(encryptString.getBytes());
    }





    /**
     * 生成摘要
     *
     * @param bytes
     * @param digestKey
     * @return
     * @throws Exception
     */
    private byte[] _encrypt(byte[] bytes, String digestKey) throws Exception {
        MessageDigest digest = MessageDigest.getInstance(digestKey);
        digest.update(bytes);
        return digest.digest();
    }

    /**
     * 字节转换为十六进制字符串
     *
     * @param bytes
     * @return
     */
    private String _encryptHexString(byte[] bytes) {
        StringBuffer stringBuffer = new StringBuffer();
        for (byte byte0 : bytes) {
            stringBuffer.append(hexDigits[byte0 >>> 4 & 0xf]);
            stringBuffer.append(hexDigits[byte0 & 0xf]);
        }
        return stringBuffer.toString();
    }

    /**
     * -------------- md5相关
     *
     * @param bytes
     * @return
     * @throws Exception
     */
    private String _encryptHexMD5(byte[] bytes) throws Exception {
        return _encryptHexString(_encrypt(bytes, KEY_MD5));
    }

    /**
     * 生成sha 16进制字符串
     *
     * @param bytes
     * @return
     * @throws Exception
     */
    private String _encryptHexSHA(byte[] bytes) throws Exception {
        return _encryptHexString(_encrypt(bytes, KEY_SHA));
    }

}
