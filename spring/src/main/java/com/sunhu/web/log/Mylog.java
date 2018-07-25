package com.sunhu.web.log;

import lombok.extern.log4j.Log4j2;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2018/6/6.
 */
@Component
@Log4j2
public class Mylog {
    //private Logger logger = LoggerFactory.getLogger(Mylog.class);
    public void log(){
        log.info("mylog info level");
        log.debug("mylog debug level");
        log.warn("mylog warn level");
        log.error("mylog error level");
    }
}
