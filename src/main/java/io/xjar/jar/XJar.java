package io.xjar.jar;

import io.xjar.*;
import io.xjar.key.XKey;
import org.apache.commons.compress.archivers.jar.JarArchiveEntry;

import java.io.*;
import java.util.zip.Deflater;

/**
 * 普通JAR包加解密工具类
 *
 * @author Payne 646742615@qq.com
 * 2018/11/26 11:11
 */
public class XJar implements XConstants {
    /**
     * 加密 普通 JAR 包
     *
     * @param src  原文包
     * @param dest 加密包
     * @param xKey 密钥
     * @throws Exception 加密异常
     */
    public static void encrypt(String src, String dest, XKey xKey) throws Exception {
        encrypt(new File(src), new File(dest), xKey);
    }

    /**
     * 加密 普通 JAR 包
     *
     * @param src  原文包
     * @param dest 加密包
     * @param xKey 密钥
     * @param mode 加密模式
     * @throws Exception 加密异常
     */
    public static void encrypt(String src, String dest, XKey xKey, int mode) throws Exception {
        encrypt(new File(src), new File(dest), xKey, mode);
    }

    /**
     * 加密 普通 JAR 包
     *
     * @param src  原文包
     * @param dest 加密包
     * @param xKey 密钥
     * @throws Exception 加密异常
     */
    public static void encrypt(File src, File dest, XKey xKey) throws Exception {
        XJarEncryptor xJarEncryptor = new XJarEncryptor(new XJdkEncryptor(xKey.getAlgorithm()));
        xJarEncryptor.encrypt(xKey, src, dest);
    }

    /**
     * 加密 普通 JAR 包
     *
     * @param src  原文包
     * @param dest 加密包
     * @param xKey 密钥
     * @param mode 加密模式
     * @throws Exception 加密异常
     */
    public static void encrypt(File src, File dest, XKey xKey, int mode) throws Exception {
        XJarEncryptor xJarEncryptor = new XJarEncryptor(new XJdkEncryptor(xKey.getAlgorithm()), Deflater.DEFLATED, mode);
        xJarEncryptor.encrypt(xKey, src, dest);
    }

    /**
     * 加密 普通 JAR 包
     *
     * @param in   原文包输入流
     * @param out  加密包输出流
     * @param xKey 密钥
     * @throws Exception 加密异常
     */
    public static void encrypt(InputStream in, OutputStream out, XKey xKey) throws Exception {
        XJarEncryptor xJarEncryptor = new XJarEncryptor(new XJdkEncryptor(xKey.getAlgorithm()));
        xJarEncryptor.encrypt(xKey, in, out);
    }

    /**
     * 加密 普通 JAR 包
     *
     * @param in   原文包输入流
     * @param out  加密包输出流
     * @param xKey 密钥
     * @param mode 加密模式
     * @throws Exception 加密异常
     */
    public static void encrypt(InputStream in, OutputStream out, XKey xKey, int mode) throws Exception {
        XJarEncryptor xJarEncryptor = new XJarEncryptor(new XJdkEncryptor(xKey.getAlgorithm()), Deflater.DEFLATED, mode);
        xJarEncryptor.encrypt(xKey, in, out);
    }

    /**
     * 加密 普通 JAR 包
     *
     * @param src    原文包
     * @param dest   加密包
     * @param xKey   密钥
     * @param filter 过滤器
     * @throws Exception 加密异常
     */
    public static void encrypt(String src, String dest, XKey xKey, XEntryFilter<JarArchiveEntry> filter) throws Exception {
        encrypt(new File(src), new File(dest), xKey, filter);
    }

    /**
     * 加密 普通 JAR 包
     *
     * @param src    原文包
     * @param dest   加密包
     * @param xKey   密钥
     * @param mode   加密模式
     * @param filter 过滤器
     * @throws Exception 加密异常
     */
    public static void encrypt(String src, String dest, XKey xKey, int mode, XEntryFilter<JarArchiveEntry> filter) throws Exception {
        encrypt(new File(src), new File(dest), xKey, mode, filter);
    }

    /**
     * 加密 普通 JAR 包
     *
     * @param src    原文包
     * @param dest   加密包
     * @param xKey   密钥
     * @param filter 过滤器
     * @throws Exception 加密异常
     */
    public static void encrypt(File src, File dest, XKey xKey, XEntryFilter<JarArchiveEntry> filter) throws Exception {
        XJarEncryptor xJarEncryptor = new XJarEncryptor(new XJdkEncryptor(xKey.getAlgorithm()), filter);
        xJarEncryptor.encrypt(xKey, src, dest);
    }

    /**
     * 加密 普通 JAR 包
     *
     * @param src    原文包
     * @param dest   加密包
     * @param xKey   密钥
     * @param mode   加密模式
     * @param filter 过滤器
     * @throws Exception 加密异常
     */
    public static void encrypt(File src, File dest, XKey xKey, int mode, XEntryFilter<JarArchiveEntry> filter) throws Exception {
        XJarEncryptor xJarEncryptor = new XJarEncryptor(new XJdkEncryptor(xKey.getAlgorithm()), Deflater.DEFLATED, mode, filter);
        xJarEncryptor.encrypt(xKey, src, dest);
    }

    /**
     * 加密 普通 JAR 包
     *
     * @param in     原文包输入流
     * @param out    加密包输出流
     * @param xKey   密钥
     * @param filter 过滤器
     * @throws Exception 加密异常
     */
    public static void encrypt(InputStream in, OutputStream out, XKey xKey, XEntryFilter<JarArchiveEntry> filter) throws Exception {
        XJarEncryptor xJarEncryptor = new XJarEncryptor(new XJdkEncryptor(xKey.getAlgorithm()), filter);
        xJarEncryptor.encrypt(xKey, in, out);
    }

    /**
     * 加密 普通 JAR 包
     *
     * @param in     原文包输入流
     * @param out    加密包输出流
     * @param xKey   密钥
     * @param mode   加密模式
     * @param filter 过滤器
     * @throws Exception 加密异常
     */
    public static void encrypt(InputStream in, OutputStream out, XKey xKey, int mode, XEntryFilter<JarArchiveEntry> filter) throws Exception {
        XJarEncryptor xJarEncryptor = new XJarEncryptor(new XJdkEncryptor(xKey.getAlgorithm()), Deflater.DEFLATED, mode, filter);
        xJarEncryptor.encrypt(xKey, in, out);
    }

    /**
     * 加密 普通 JAR 包
     *
     * @param src      原文包
     * @param dest     加密包
     * @param password 密码
     * @throws Exception 加密异常
     */
    public static void encrypt(String src, String dest, String password) throws Exception {
        encrypt(src, dest, password, DEFAULT_ALGORITHM);
    }

    /**
     * 加密 普通 JAR 包
     *
     * @param src       原文包
     * @param dest      加密包
     * @param password  密码
     * @param algorithm 加密算法
     * @throws Exception 加密异常
     */
    public static void encrypt(String src, String dest, String password, String algorithm) throws Exception {
        encrypt(src, dest, password, algorithm, DEFAULT_KEYSIZE);
    }

    /**
     * 加密 普通 JAR 包
     *
     * @param src       原文包
     * @param dest      加密包
     * @param password  密码
     * @param algorithm 加密算法
     * @param keysize   密钥长度
     * @throws Exception 加密异常
     */
    public static void encrypt(String src, String dest, String password, String algorithm, int keysize) throws Exception {
        encrypt(src, dest, password, algorithm, keysize, DEFAULT_IVSIZE);
    }

    /**
     * 加密 普通 JAR 包
     *
     * @param src       原文包
     * @param dest      加密包
     * @param password  密码
     * @param algorithm 加密算法
     * @param keysize   密钥长度
     * @param ivsize    向量长度
     * @throws Exception 加密异常
     */
    public static void encrypt(String src, String dest, String password, String algorithm, int keysize, int ivsize) throws Exception {
        encrypt(new File(src), new File(dest), password, algorithm, keysize, ivsize);
    }

    /**
     * 加密 普通 JAR 包
     *
     * @param src      原文包
     * @param dest     加密包
     * @param password 密码
     * @throws Exception 加密异常
     */
    public static void encrypt(File src, File dest, String password) throws Exception {
        encrypt(src, dest, password, DEFAULT_ALGORITHM);
    }

    /**
     * 加密 普通 JAR 包
     *
     * @param src       原文包
     * @param dest      加密包
     * @param password  密码
     * @param algorithm 加密算法
     * @throws Exception 加密异常
     */
    public static void encrypt(File src, File dest, String password, String algorithm) throws Exception {
        encrypt(src, dest, password, algorithm, DEFAULT_KEYSIZE);
    }

    /**
     * 加密 普通 JAR 包
     *
     * @param src       原文包
     * @param dest      加密包
     * @param password  密码
     * @param algorithm 加密算法
     * @param keysize   密钥长度
     * @throws Exception 加密异常
     */
    public static void encrypt(File src, File dest, String password, String algorithm, int keysize) throws Exception {
        encrypt(src, dest, password, algorithm, keysize, DEFAULT_IVSIZE);
    }

    /**
     * 加密 普通 JAR 包
     *
     * @param src       原文包
     * @param dest      加密包
     * @param password  密码
     * @param algorithm 加密算法
     * @param keysize   密钥长度
     * @param ivsize    向量长度
     * @throws Exception 加密异常
     */
    public static void encrypt(File src, File dest, String password, String algorithm, int keysize, int ivsize) throws Exception {
        XJarEncryptor xJarEncryptor = new XJarEncryptor(new XJdkEncryptor(algorithm));
        XKey xKey = XKit.key(algorithm, keysize, ivsize, password);
        xJarEncryptor.encrypt(xKey, src, dest);
    }

    /**
     * 加密 普通 JAR 包
     *
     * @param in       原文包输入流
     * @param out      加密包输出流
     * @param password 密码
     * @throws Exception 加密异常
     */
    public static void encrypt(InputStream in, OutputStream out, String password) throws Exception {
        encrypt(in, out, password, DEFAULT_ALGORITHM);
    }

    /**
     * 加密 普通 JAR 包
     *
     * @param in        原文包输入流
     * @param out       加密包输出流
     * @param password  密码
     * @param algorithm 加密算法
     * @throws Exception 加密异常
     */
    public static void encrypt(InputStream in, OutputStream out, String password, String algorithm) throws Exception {
        encrypt(in, out, password, algorithm, DEFAULT_KEYSIZE);
    }

    /**
     * 加密 普通 JAR 包
     *
     * @param in        原文包输入流
     * @param out       加密包输出流
     * @param password  密码
     * @param algorithm 加密算法
     * @param keysize   密钥长度
     * @throws Exception 加密异常
     */
    public static void encrypt(InputStream in, OutputStream out, String password, String algorithm, int keysize) throws Exception {
        encrypt(in, out, password, algorithm, keysize, DEFAULT_IVSIZE);
    }

    /**
     * 加密 普通 JAR 包
     *
     * @param in        原文包输入流
     * @param out       加密包输出流
     * @param password  密码
     * @param algorithm 加密算法
     * @param keysize   密钥长度
     * @param ivsize    向量长度
     * @throws Exception 加密异常
     */
    public static void encrypt(InputStream in, OutputStream out, String password, String algorithm, int keysize, int ivsize) throws Exception {
        XJarEncryptor xJarEncryptor = new XJarEncryptor(new XJdkEncryptor(algorithm));
        XKey xKey = XKit.key(algorithm, keysize, ivsize, password);
        xJarEncryptor.encrypt(xKey, in, out);
    }

    /**
     * 加密 普通 JAR 包
     *
     * @param src      原文包
     * @param dest     加密包
     * @param password 密码
     * @param filter   过滤器
     * @throws Exception 加密异常
     */
    public static void encrypt(String src, String dest, String password, XEntryFilter<JarArchiveEntry> filter) throws Exception {
        encrypt(src, dest, password, DEFAULT_ALGORITHM, filter);
    }

    /**
     * 加密 普通 JAR 包
     *
     * @param src       原文包
     * @param dest      加密包
     * @param password  密码
     * @param algorithm 加密算法
     * @param filter    过滤器
     * @throws Exception 加密异常
     */
    public static void encrypt(String src, String dest, String password, String algorithm, XEntryFilter<JarArchiveEntry> filter) throws Exception {
        encrypt(src, dest, password, algorithm, DEFAULT_KEYSIZE, filter);
    }

    /**
     * 加密 普通 JAR 包
     *
     * @param src       原文包
     * @param dest      加密包
     * @param password  密码
     * @param algorithm 加密算法
     * @param keysize   密钥长度
     * @param filter    过滤器
     * @throws Exception 加密异常
     */
    public static void encrypt(String src, String dest, String password, String algorithm, int keysize, XEntryFilter<JarArchiveEntry> filter) throws Exception {
        encrypt(src, dest, password, algorithm, keysize, DEFAULT_IVSIZE, filter);
    }

    /**
     * 加密 普通 JAR 包
     *
     * @param src       原文包
     * @param dest      加密包
     * @param password  密码
     * @param algorithm 加密算法
     * @param keysize   密钥长度
     * @param ivsize    向量长度
     * @param filter    过滤器
     * @throws Exception 加密异常
     */
    public static void encrypt(String src, String dest, String password, String algorithm, int keysize, int ivsize, XEntryFilter<JarArchiveEntry> filter) throws Exception {
        encrypt(new File(src), new File(dest), password, algorithm, keysize, ivsize, filter);
    }

    /**
     * 加密 普通 JAR 包
     *
     * @param src      原文包
     * @param dest     加密包
     * @param password 密码
     * @param filter   过滤器
     * @throws Exception 加密异常
     */
    public static void encrypt(File src, File dest, String password, XEntryFilter<JarArchiveEntry> filter) throws Exception {
        encrypt(src, dest, password, DEFAULT_ALGORITHM, filter);
    }

    /**
     * 加密 普通 JAR 包
     *
     * @param src       原文包
     * @param dest      加密包
     * @param password  密码
     * @param algorithm 加密算法
     * @param filter    过滤器
     * @throws Exception 加密异常
     */
    public static void encrypt(File src, File dest, String password, String algorithm, XEntryFilter<JarArchiveEntry> filter) throws Exception {
        encrypt(src, dest, password, algorithm, DEFAULT_KEYSIZE, filter);
    }

    /**
     * 加密 普通 JAR 包
     *
     * @param src       原文包
     * @param dest      加密包
     * @param password  密码
     * @param algorithm 加密算法
     * @param keysize   密钥长度
     * @param filter    过滤器
     * @throws Exception 加密异常
     */
    public static void encrypt(File src, File dest, String password, String algorithm, int keysize, XEntryFilter<JarArchiveEntry> filter) throws Exception {
        encrypt(src, dest, password, algorithm, keysize, DEFAULT_IVSIZE, filter);
    }

    /**
     * 加密 普通 JAR 包
     *
     * @param src       原文包
     * @param dest      加密包
     * @param password  密码
     * @param algorithm 加密算法
     * @param keysize   密钥长度
     * @param ivsize    向量长度
     * @param filter    过滤器
     * @throws Exception 加密异常
     */
    public static void encrypt(File src, File dest, String password, String algorithm, int keysize, int ivsize, XEntryFilter<JarArchiveEntry> filter) throws Exception {
        XJarEncryptor xJarEncryptor = new XJarEncryptor(new XJdkEncryptor(algorithm), filter);
        XKey xKey = XKit.key(algorithm, keysize, ivsize, password);
        xJarEncryptor.encrypt(xKey, src, dest);
    }

    /**
     * 加密 普通 JAR 包
     *
     * @param in       原文包输入流
     * @param out      加密包输出流
     * @param password 密码
     * @param filter   过滤器
     * @throws Exception 加密异常
     */
    public static void encrypt(InputStream in, OutputStream out, String password, XEntryFilter<JarArchiveEntry> filter) throws Exception {
        encrypt(in, out, password, DEFAULT_ALGORITHM, filter);
    }

    /**
     * 加密 普通 JAR 包
     *
     * @param in        原文包输入流
     * @param out       加密包输出流
     * @param password  密码
     * @param algorithm 加密算法
     * @param filter    过滤器
     * @throws Exception 加密异常
     */
    public static void encrypt(InputStream in, OutputStream out, String password, String algorithm, XEntryFilter<JarArchiveEntry> filter) throws Exception {
        encrypt(in, out, password, algorithm, DEFAULT_KEYSIZE, filter);
    }

    /**
     * 加密 普通 JAR 包
     *
     * @param in        原文包输入流
     * @param out       加密包输出流
     * @param password  密码
     * @param algorithm 加密算法
     * @param keysize   密钥长度
     * @param filter    过滤器
     * @throws Exception 加密异常
     */
    public static void encrypt(InputStream in, OutputStream out, String password, String algorithm, int keysize, XEntryFilter<JarArchiveEntry> filter) throws Exception {
        encrypt(in, out, password, algorithm, keysize, DEFAULT_IVSIZE, filter);
    }

    /**
     * 加密 普通 JAR 包
     *
     * @param in        原文包输入流
     * @param out       加密包输出流
     * @param password  密码
     * @param algorithm 加密算法
     * @param keysize   密钥长度
     * @param ivsize    向量长度
     * @param filter    过滤器
     * @throws Exception 加密异常
     */
    public static void encrypt(InputStream in, OutputStream out, String password, String algorithm, int keysize, int ivsize, XEntryFilter<JarArchiveEntry> filter) throws Exception {
        XJarEncryptor xJarEncryptor = new XJarEncryptor(new XJdkEncryptor(algorithm), filter);
        XKey xKey = XKit.key(algorithm, keysize, ivsize, password);
        xJarEncryptor.encrypt(xKey, in, out);
    }

    /**
     * 解密 普通 JAR 包
     *
     * @param src  加密包
     * @param dest 解密包
     * @param xKey 密钥
     * @throws Exception 解密异常
     */
    public static void decrypt(String src, String dest, XKey xKey) throws Exception {
        decrypt(new File(src), new File(dest), xKey);
    }

    /**
     * 解密 普通 JAR 包
     *
     * @param src  加密包
     * @param dest 解密包
     * @param xKey 密钥
     * @throws Exception 解密异常
     */
    public static void decrypt(File src, File dest, XKey xKey) throws Exception {
        try (
                InputStream in = new FileInputStream(src);
                OutputStream out = new FileOutputStream(dest)
        ) {
            decrypt(in, out, xKey);
        }
    }

    /**
     * 解密 普通 JAR 包
     *
     * @param in   加密包输入流
     * @param out  解密包输出流
     * @param xKey 密钥
     * @throws Exception 解密异常
     */
    public static void decrypt(InputStream in, OutputStream out, XKey xKey) throws Exception {
        XJarDecryptor xJarDecryptor = new XJarDecryptor(new XJdkDecryptor(xKey.getAlgorithm()));
        xJarDecryptor.decrypt(xKey, in, out);
    }

    /**
     * 解密 普通 JAR 包
     *
     * @param src    加密包
     * @param dest   解密包
     * @param xKey   密钥
     * @param filter 过滤器
     * @throws Exception 解密异常
     */
    public static void decrypt(String src, String dest, XKey xKey, XEntryFilter<JarArchiveEntry> filter) throws Exception {
        decrypt(new File(src), new File(dest), xKey, filter);
    }

    /**
     * 解密 普通 JAR 包
     *
     * @param src    加密包
     * @param dest   解密包
     * @param xKey   密钥
     * @param filter 过滤器
     * @throws Exception 解密异常
     */
    public static void decrypt(File src, File dest, XKey xKey, XEntryFilter<JarArchiveEntry> filter) throws Exception {
        try (
                InputStream in = new FileInputStream(src);
                OutputStream out = new FileOutputStream(dest)
        ) {
            decrypt(in, out, xKey, filter);
        }
    }

    /**
     * 解密 普通 JAR 包
     *
     * @param in     加密包输入流
     * @param out    解密包输出流
     * @param xKey   密钥
     * @param filter 过滤器
     * @throws Exception 解密异常
     */
    public static void decrypt(InputStream in, OutputStream out, XKey xKey, XEntryFilter<JarArchiveEntry> filter) throws Exception {
        XJarDecryptor xJarDecryptor = new XJarDecryptor(new XJdkDecryptor(xKey.getAlgorithm()), filter);
        xJarDecryptor.decrypt(xKey, in, out);
    }

    /**
     * 解密 普通 JAR 包
     *
     * @param src      加密包
     * @param dest     解密包
     * @param password 密码
     * @throws Exception 解密异常
     */
    public static void decrypt(String src, String dest, String password) throws Exception {
        decrypt(src, dest, password, DEFAULT_ALGORITHM);
    }

    /**
     * 解密 普通 JAR 包
     *
     * @param src       加密包
     * @param dest      解密包
     * @param password  密码
     * @param algorithm 加密算法
     * @throws Exception 解密异常
     */
    public static void decrypt(String src, String dest, String password, String algorithm) throws Exception {
        decrypt(src, dest, password, algorithm, DEFAULT_KEYSIZE);
    }

    /**
     * 解密 普通 JAR 包
     *
     * @param src       加密包
     * @param dest      解密包
     * @param password  密码
     * @param algorithm 加密算法
     * @param keysize   密钥长度
     * @throws Exception 解密异常
     */
    public static void decrypt(String src, String dest, String password, String algorithm, int keysize) throws Exception {
        decrypt(src, dest, password, algorithm, keysize, DEFAULT_IVSIZE);
    }

    /**
     * 解密 普通 JAR 包
     *
     * @param src       加密包
     * @param dest      解密包
     * @param password  密码
     * @param algorithm 加密算法
     * @param keysize   密钥长度
     * @param ivsize    向量长度
     * @throws Exception 解密异常
     */
    public static void decrypt(String src, String dest, String password, String algorithm, int keysize, int ivsize) throws Exception {
        decrypt(new File(src), new File(dest), password, algorithm, keysize, ivsize);
    }

    /**
     * 解密 普通 JAR 包
     *
     * @param src      加密包
     * @param dest     解密包
     * @param password 密码
     * @throws Exception 解密异常
     */
    public static void decrypt(File src, File dest, String password) throws Exception {
        decrypt(src, dest, password, DEFAULT_ALGORITHM);
    }

    /**
     * 解密 普通 JAR 包
     *
     * @param src       加密包
     * @param dest      解密包
     * @param password  密码
     * @param algorithm 加密算法
     * @throws Exception 解密异常
     */
    public static void decrypt(File src, File dest, String password, String algorithm) throws Exception {
        decrypt(src, dest, password, algorithm, DEFAULT_KEYSIZE);
    }

    /**
     * 解密 普通 JAR 包
     *
     * @param src       加密包
     * @param dest      解密包
     * @param password  密码
     * @param algorithm 加密算法
     * @param keysize   密钥长度
     * @throws Exception 解密异常
     */
    public static void decrypt(File src, File dest, String password, String algorithm, int keysize) throws Exception {
        decrypt(src, dest, password, algorithm, keysize, DEFAULT_IVSIZE);
    }

    /**
     * 解密 普通 JAR 包
     *
     * @param src       加密包
     * @param dest      解密包
     * @param password  密码
     * @param algorithm 加密算法
     * @param keysize   密钥长度
     * @param ivsize    向量长度
     * @throws Exception 解密异常
     */
    public static void decrypt(File src, File dest, String password, String algorithm, int keysize, int ivsize) throws Exception {
        try (
                InputStream in = new FileInputStream(src);
                OutputStream out = new FileOutputStream(dest)
        ) {
            decrypt(in, out, password, algorithm, keysize, ivsize);
        }
    }

    /**
     * 解密 普通 JAR 包
     *
     * @param in       加密包输入流
     * @param out      解密包输出流
     * @param password 密码
     * @throws Exception 解密异常
     */
    public static void decrypt(InputStream in, OutputStream out, String password) throws Exception {
        decrypt(in, out, password, DEFAULT_ALGORITHM);
    }

    /**
     * 解密 普通 JAR 包
     *
     * @param in        加密包输入流
     * @param out       解密包输出流
     * @param password  密码
     * @param algorithm 加密算法
     * @throws Exception 解密异常
     */
    public static void decrypt(InputStream in, OutputStream out, String password, String algorithm) throws Exception {
        decrypt(in, out, password, algorithm, DEFAULT_KEYSIZE);
    }

    /**
     * 解密 普通 JAR 包
     *
     * @param in        加密包输入流
     * @param out       解密包输出流
     * @param password  密码
     * @param algorithm 加密算法
     * @param keysize   密钥长度
     * @throws Exception 解密异常
     */
    public static void decrypt(InputStream in, OutputStream out, String password, String algorithm, int keysize) throws Exception {
        decrypt(in, out, password, algorithm, keysize, DEFAULT_IVSIZE);
    }

    /**
     * 解密 普通 JAR 包
     *
     * @param in        加密包输入流
     * @param out       解密包输出流
     * @param password  密码
     * @param algorithm 加密算法
     * @param keysize   密钥长度
     * @param ivsize    向量长度
     * @throws Exception 解密异常
     */
    public static void decrypt(InputStream in, OutputStream out, String password, String algorithm, int keysize, int ivsize) throws Exception {
        XJarDecryptor xJarDecryptor = new XJarDecryptor(new XJdkDecryptor(algorithm));
        XKey xKey = XKit.key(algorithm, keysize, ivsize, password);
        xJarDecryptor.decrypt(xKey, in, out);
    }

    /**
     * 解密 普通 JAR 包
     *
     * @param src      加密包
     * @param dest     解密包
     * @param password 密码
     * @param filter   过滤器
     * @throws Exception 解密异常
     */
    public static void decrypt(String src, String dest, String password, XEntryFilter<JarArchiveEntry> filter) throws Exception {
        decrypt(src, dest, password, DEFAULT_ALGORITHM, filter);
    }

    /**
     * 解密 普通 JAR 包
     *
     * @param src       加密包
     * @param dest      解密包
     * @param password  密码
     * @param algorithm 加密算法
     * @param filter    过滤器
     * @throws Exception 解密异常
     */
    public static void decrypt(String src, String dest, String password, String algorithm, XEntryFilter<JarArchiveEntry> filter) throws Exception {
        decrypt(src, dest, password, algorithm, DEFAULT_KEYSIZE, filter);
    }

    /**
     * 解密 普通 JAR 包
     *
     * @param src       加密包
     * @param dest      解密包
     * @param password  密码
     * @param algorithm 加密算法
     * @param keysize   密钥长度
     * @param filter    过滤器
     * @throws Exception 解密异常
     */
    public static void decrypt(String src, String dest, String password, String algorithm, int keysize, XEntryFilter<JarArchiveEntry> filter) throws Exception {
        decrypt(src, dest, password, algorithm, keysize, DEFAULT_IVSIZE, filter);
    }

    /**
     * 解密 普通 JAR 包
     *
     * @param src       加密包
     * @param dest      解密包
     * @param password  密码
     * @param algorithm 加密算法
     * @param keysize   密钥长度
     * @param ivsize    向量长度
     * @param filter    过滤器
     * @throws Exception 解密异常
     */
    public static void decrypt(String src, String dest, String password, String algorithm, int keysize, int ivsize, XEntryFilter<JarArchiveEntry> filter) throws Exception {
        decrypt(new File(src), new File(dest), password, algorithm, keysize, ivsize, filter);
    }

    /**
     * 解密 普通 JAR 包
     *
     * @param src      加密包
     * @param dest     解密包
     * @param password 密码
     * @param filter   过滤器
     * @throws Exception 解密异常
     */
    public static void decrypt(File src, File dest, String password, XEntryFilter<JarArchiveEntry> filter) throws Exception {
        decrypt(src, dest, password, DEFAULT_ALGORITHM, filter);
    }

    /**
     * 解密 普通 JAR 包
     *
     * @param src       加密包
     * @param dest      解密包
     * @param password  密码
     * @param algorithm 加密算法
     * @param filter    过滤器
     * @throws Exception 解密异常
     */
    public static void decrypt(File src, File dest, String password, String algorithm, XEntryFilter<JarArchiveEntry> filter) throws Exception {
        decrypt(src, dest, password, algorithm, DEFAULT_KEYSIZE, filter);
    }

    /**
     * 解密 普通 JAR 包
     *
     * @param src       加密包
     * @param dest      解密包
     * @param password  密码
     * @param algorithm 加密算法
     * @param keysize   密钥长度
     * @param filter    过滤器
     * @throws Exception 解密异常
     */
    public static void decrypt(File src, File dest, String password, String algorithm, int keysize, XEntryFilter<JarArchiveEntry> filter) throws Exception {
        decrypt(src, dest, password, algorithm, keysize, DEFAULT_IVSIZE, filter);
    }

    /**
     * 解密 普通 JAR 包
     *
     * @param src       加密包
     * @param dest      解密包
     * @param password  密码
     * @param algorithm 加密算法
     * @param keysize   密钥长度
     * @param ivsize    向量长度
     * @param filter    过滤器
     * @throws Exception 解密异常
     */
    public static void decrypt(File src, File dest, String password, String algorithm, int keysize, int ivsize, XEntryFilter<JarArchiveEntry> filter) throws Exception {
        try (
                InputStream in = new FileInputStream(src);
                OutputStream out = new FileOutputStream(dest)
        ) {
            decrypt(in, out, password, algorithm, keysize, ivsize, filter);
        }
    }

    /**
     * 解密 普通 JAR 包
     *
     * @param in       加密包输入流
     * @param out      解密包输出流
     * @param password 密码
     * @param filter   过滤器
     * @throws Exception 解密异常
     */
    public static void decrypt(InputStream in, OutputStream out, String password, XEntryFilter<JarArchiveEntry> filter) throws Exception {
        decrypt(in, out, password, DEFAULT_ALGORITHM, filter);
    }

    /**
     * 解密 普通 JAR 包
     *
     * @param in        加密包输入流
     * @param out       解密包输出流
     * @param password  密码
     * @param algorithm 加密算法
     * @param filter    过滤器
     * @throws Exception 解密异常
     */
    public static void decrypt(InputStream in, OutputStream out, String password, String algorithm, XEntryFilter<JarArchiveEntry> filter) throws Exception {
        decrypt(in, out, password, algorithm, DEFAULT_KEYSIZE, filter);
    }

    /**
     * 解密 普通 JAR 包
     *
     * @param in        加密包输入流
     * @param out       解密包输出流
     * @param password  密码
     * @param algorithm 加密算法
     * @param keysize   密钥长度
     * @param filter    过滤器
     * @throws Exception 解密异常
     */
    public static void decrypt(InputStream in, OutputStream out, String password, String algorithm, int keysize, XEntryFilter<JarArchiveEntry> filter) throws Exception {
        decrypt(in, out, password, algorithm, keysize, DEFAULT_IVSIZE, filter);
    }

    /**
     * 解密 普通 JAR 包
     *
     * @param in        加密包输入流
     * @param out       解密包输出流
     * @param password  密码
     * @param algorithm 加密算法
     * @param keysize   密钥长度
     * @param ivsize    向量长度
     * @param filter    过滤器
     * @throws Exception 解密异常
     */
    public static void decrypt(InputStream in, OutputStream out, String password, String algorithm, int keysize, int ivsize, XEntryFilter<JarArchiveEntry> filter) throws Exception {
        XJarDecryptor xJarDecryptor = new XJarDecryptor(new XJdkDecryptor(algorithm), filter);
        XKey xKey = XKit.key(algorithm, keysize, ivsize, password);
        xJarDecryptor.decrypt(xKey, in, out);
    }

}
