package org.example;

import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;


public class WebApplicationServer {


    public static void main(String[] args) throws LifecycleException {

        Tomcat tomcat = new Tomcat();
        tomcat.setPort(8080);


        tomcat.start();
        tomcat.getServer().await();


    }
}
