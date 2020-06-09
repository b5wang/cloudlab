package com.b5wang.cloudlab.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class AppMain {

    /** log4j2
     * fatal, error, warn, info, debug, trace
     * */
    private static final org.apache.logging.log4j.Logger LOG4J2_LOGGER = org.apache.logging.log4j.LogManager.getLogger(AppMain.class);

    /** slf4j
     * error, warn, info, debug, trace
     * If want fatal, you need create by yourself with marker and specific apender
     *
     * logback is the same api as slf4j. Logback is implementation
     * */
    private static final org.slf4j.Logger SLF4J_LOGGER = org.slf4j.LoggerFactory.getLogger(AppMain.class);

    /** log4j
     *
     * */
    private static final org.apache.log4j.Logger LOG4J_LOGGER = org.apache.log4j.Logger.getLogger(AppMain.class);

    /** JUL
     * SEVERE (highest level)
     * WARNING
     * INFO
     * CONFIG
     * FINE
     * FINER
     * FINEST (lowest level)
     * */
    private static final java.util.logging.Logger JUL_LOGGER = java.util.logging.Logger.getLogger(AppMain.class.getName());

    /** JCL
     * fatal, error, warn, info, debug, trace
     * */
    private static final org.apache.commons.logging.Log JCL_LOG = org.apache.commons.logging.LogFactory.getLog(AppMain.class);

    @RequestMapping("/")
    String home() {
        // log4j2
        String log4j2Msg = "log4j2: helloworld is called?!";
        LOG4J2_LOGGER.trace(log4j2Msg);
        LOG4J2_LOGGER.debug(log4j2Msg);
        LOG4J2_LOGGER.info(log4j2Msg);
        LOG4J2_LOGGER.warn(log4j2Msg);
        LOG4J2_LOGGER.error(log4j2Msg);
        LOG4J2_LOGGER.fatal(log4j2Msg);

        // slf4j
        String slf4jMsg = "slf4j: helloworld is called?!";
        SLF4J_LOGGER.trace(slf4jMsg);
        SLF4J_LOGGER.debug(slf4jMsg);
        SLF4J_LOGGER.info(slf4jMsg);
        SLF4J_LOGGER.warn(slf4jMsg);
        SLF4J_LOGGER.error(slf4jMsg);

        // log4j
        String log4jMsg = "log4j: helloworld is called?!";
        LOG4J_LOGGER.trace(log4jMsg);
        LOG4J_LOGGER.debug(log4jMsg);
        LOG4J_LOGGER.info(log4jMsg);
        LOG4J_LOGGER.warn(log4jMsg);
        LOG4J_LOGGER.error(log4jMsg);
        LOG4J_LOGGER.fatal(log4jMsg);

        // JUL
        String julMsg = "JUL: helloworld is called?!";
        JUL_LOGGER.severe(julMsg);
        JUL_LOGGER.warning(julMsg);
        JUL_LOGGER.info(julMsg);
        JUL_LOGGER.config(julMsg);
        JUL_LOGGER.fine(julMsg);
        JUL_LOGGER.finer(julMsg);
        JUL_LOGGER.finest(julMsg);

        // JCL
        String jclMsg = "JCL: helloworld is called?!";
        JCL_LOG.trace(jclMsg);
        JCL_LOG.debug(jclMsg);
        JCL_LOG.info(jclMsg);
        JCL_LOG.warn(jclMsg);
        JCL_LOG.error(jclMsg);
        JCL_LOG.fatal(jclMsg);

        return "minikube: Hello World!";
    }

    public static void main(String[] args) throws Exception {
        // log4j2
        String startingMsgLog4j2 = "log4j2: helloworld app has started?!";
        // Log will not be printed out before spring app start.
        LOG4J2_LOGGER.trace(startingMsgLog4j2);
        LOG4J2_LOGGER.debug(startingMsgLog4j2);
        LOG4J2_LOGGER.info(startingMsgLog4j2);
        LOG4J2_LOGGER.warn(startingMsgLog4j2);
        LOG4J2_LOGGER.error(startingMsgLog4j2);
        LOG4J2_LOGGER.fatal(startingMsgLog4j2);

        SpringApplication.run(AppMain.class, args);

        // log4j2
        String log4j2Msg = "log4j2: helloworld app has started?!";
        LOG4J2_LOGGER.trace(log4j2Msg);
        LOG4J2_LOGGER.debug(log4j2Msg);
        LOG4J2_LOGGER.info(log4j2Msg);
        LOG4J2_LOGGER.warn(log4j2Msg);
        LOG4J2_LOGGER.error(log4j2Msg);
        LOG4J2_LOGGER.fatal(log4j2Msg);

        // slf4j
        String slf4jMsg = "slf4j: helloworld app has started?!";
        SLF4J_LOGGER.trace(slf4jMsg);
        SLF4J_LOGGER.debug(slf4jMsg);
        SLF4J_LOGGER.info(slf4jMsg);
        SLF4J_LOGGER.warn(slf4jMsg);
        SLF4J_LOGGER.error(slf4jMsg);

        // log4j
        String log4jMsg = "log4j: helloworld app has started?!";
        LOG4J_LOGGER.trace(log4jMsg);
        LOG4J_LOGGER.debug(log4jMsg);
        LOG4J_LOGGER.info(log4jMsg);
        LOG4J_LOGGER.warn(log4jMsg);
        LOG4J_LOGGER.error(log4jMsg);
        LOG4J_LOGGER.fatal(log4jMsg);

        // JUL
        String julMsg = "JUL: helloworld app has started?!";
        JUL_LOGGER.finest(julMsg + " - finest");
        JUL_LOGGER.finer(julMsg + " - finer");
        JUL_LOGGER.fine(julMsg + " - fine");
        JUL_LOGGER.config(julMsg + " - config");
        JUL_LOGGER.info(julMsg + " - info");
        JUL_LOGGER.warning(julMsg + " - warning");
        JUL_LOGGER.severe(julMsg + " - severe");

        // JCL
        String jclMsg = "JCL: helloworld app has started?!";
        JCL_LOG.trace(jclMsg);
        JCL_LOG.debug(jclMsg);
        JCL_LOG.info(jclMsg);
        JCL_LOG.warn(jclMsg);
        JCL_LOG.error(jclMsg);
        JCL_LOG.fatal(jclMsg);
    }
}
