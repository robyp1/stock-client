package com.mechanitis.demo.stockclient;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;

import java.io.IOException;
import java.time.Duration;

//@Log4j2
public class WebClientStockClient {
    private static final Logger log = LogManager.getLogger(WebClientStockClient.class);
    private final WebClient webClient;

    public WebClientStockClient(WebClient webClient) {
        this.webClient = webClient;
    }

    /**
     * web client http request , get reactive response data json converted in class and returned
     * @param symbol the monetary simbol
     * @return the reactive response Flux of StockPrice
     */
    public Flux<StockPrice> pricesFor(String symbol) {
        return webClient.get()
                .uri("http://localhost:8080/stocks/{symbol}", symbol)
                .retrieve()
                .bodyToFlux(StockPrice.class)
                .retryBackoff(5, Duration.ofSeconds(1), Duration.ofSeconds(20))//retray if filed 5 times between intervals
        .doOnError(IOException.class, e -> log.error(e.getMessage(), e)); //in case of IoException

    }
}
