module stock.client {
//    requires lombok;
    requires spring.webflux;
    requires reactor.core;
    requires org.apache.logging.log4j;
    requires spring.boot;
    requires spring.boot.autoconfigure;
    requires spring.context;

    exports com.mechanitis.demo.stockclient;
    opens com.mechanitis.demo.stockclient to spring.core;
}