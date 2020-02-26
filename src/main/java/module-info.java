module stock.client {
//    requires lombok;
    requires spring.webflux;
    requires reactor.core;
    requires org.apache.logging.log4j;
    requires spring.boot;
    requires spring.boot.autoconfigure;
    requires spring.context;

    requires com.fasterxml.jackson.databind;//required because webflux doesnt export faster jackson..
    requires com.fasterxml.jackson.core;
    requires com.fasterxml.classmate;

    exports com.mechanitis.demo.stockclient to spring.beans, spring.context, stock.ui;
    opens com.mechanitis.demo.stockclient to spring.core;
}