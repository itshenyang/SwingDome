package com.sy.snack.Utils;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by wanghuan on 2017/5/7.
 */
public class L {

    private static Logger logger = LogManager.getLogger();

    public static void t(String msg) {
        logger.trace(msg);
    }

    public static void d(String msg) {
        logger.debug(msg);
    }

    public static void i(String msg) {
        logger.info(msg);
    }

    public static void w(String msg) {
        logger.warn(msg);
    }

    public static void e(String msg) {
        logger.error(msg);
    }

    public static void f(String msg) {
        logger.fatal(msg);
    }


    public static void t(String className, String msg) {
        logger.trace(className + " : " + msg);
    }

    public static void d(String className, String msg) {
        logger.debug(className + " : " + msg);
    }

    public static void i(String className, String msg) {
        logger.info(className + " : " + msg);
    }

    public static void w(String className, String msg) {
        logger.warn(className + " : " + msg);
    }

    public static void e(String className, String msg) {
        logger.error(className + " : " + msg);
    }

    public static void f(String className, String msg) {
        logger.fatal(className + " : " + msg);
    }

}
