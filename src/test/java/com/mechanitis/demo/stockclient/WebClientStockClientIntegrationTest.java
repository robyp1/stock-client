package com.mechanitis.demo.stockclient;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;

class WebClientStockClientIntegrationTest {

    private static final String SYMBOL = "EUR";
    private WebClient webClient = WebClient.builder().build();

    @Test
    void shouldRetrieveStockPricesFromStockService() {
        WebClientStockClient webClientStockClient = new WebClientStockClient(webClient);
        Flux<StockPrice> prices = webClientStockClient.pricesFor(SYMBOL);
        Assertions.assertNotNull(prices);
        //take the first 5 prices then count if there are at least one returned
        Assertions.assertTrue(prices.take(5).count().block() > 0);
    }
}