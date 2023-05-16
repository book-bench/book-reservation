open module com.book.bookreservation {
    requires spring.web;
//    requires spring.boot;
    requires spring.boot.autoconfigure;
    requires spring.beans;
    requires spring.context;
    requires spring.webmvc;
    requires spring.boot;

//    requires jakarta.servlet;

    requires book.connector;
//    requires org.apache.tomcat.embed.core;
//    requires org.apache.tomcat.embed.el;

    requires com.fasterxml.jackson.annotation;

//    exports com.book.bookreservation;

}