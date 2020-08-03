package com.spring.basics.app.xml;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlBaseApplication
{
    private static Logger LOGGER= LoggerFactory.getLogger(XmlBaseApplication.class);
    public static void main(String args[])
    {
        ClassPathXmlApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        LOGGER.info("Bean Loaded-> {}",(Object) applicationContext.getBeanDefinitionNames());
        XmlPersonDao xmlPersonDao= applicationContext.getBean(XmlPersonDao.class);
        LOGGER.info("{}",xmlPersonDao);
        LOGGER.info("{}",xmlPersonDao.getXmlJdbcConnection());
    }
}
