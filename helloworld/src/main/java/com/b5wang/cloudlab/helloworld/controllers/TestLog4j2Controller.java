package com.b5wang.cloudlab.helloworld.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestLog4j2Controller {

    /** log4j2
     * fatal, error, warn, info, debug, trace
     * */
    private static final org.apache.logging.log4j.Logger LOG4J2_LOGGER = org.apache.logging.log4j.LogManager.getLogger(TestLog4j2Controller.class);

    /** slf4j
     * error, warn, info, debug, trace
     * If want fatal, you need create by yourself with marker and specific apender
     *
     * logback is the same api as slf4j. Logback is implementation
     * */
    private static final org.slf4j.Logger SLF4J_LOGGER = org.slf4j.LoggerFactory.getLogger(TestLog4j2Controller.class);

    /** log4j
     *
     * */
    private static final org.apache.log4j.Logger LOG4J_LOGGER = org.apache.log4j.Logger.getLogger(TestLog4j2Controller.class);

    /** JUL
     * SEVERE (highest level)
     * WARNING
     * INFO
     * CONFIG
     * FINE
     * FINER
     * FINEST (lowest level)
     * */
    private static final java.util.logging.Logger JUL_LOGGER = java.util.logging.Logger.getLogger(TestLog4j2Controller.class.getName());

    /** JCL
     * fatal, error, warn, info, debug, trace
     * */
    private static final org.apache.commons.logging.Log JCL_LOG = org.apache.commons.logging.LogFactory.getLog(TestLog4j2Controller.class);

    @GetMapping("/log")
    String log() {
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

        return "Log4j2";
    }
}
