open module book.reservation.main {
    requires spring.boot;
    requires spring.boot.autoconfigure;
    requires com.fasterxml.jackson.annotation;
    requires spring.web;
    requires book.service.connector.main;

    requires org.slf4j;

}