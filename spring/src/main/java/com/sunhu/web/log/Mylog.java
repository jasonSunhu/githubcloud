package com.sunhu.web.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2018/6/6.
 */
@Component
public class Mylog {
    private Logger logger = LoggerFactory.getLogger(Mylog.class);
    public void log(){
        logger.info("mylog info level");
        logger.debug("mylog debug level");
        logger.warn("mylog warn level");
        logger.error("mylog error level");
    }
}
