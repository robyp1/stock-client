
####1 Run server placed in 
* [click here](https://github.com/robyp1/stock-service.git)\
(https://github.com/robyp1/stock-service.git) 
Emits for each symbols (for example 'demo' in link) random prices using Reactive Spring

####2 Then run test *WebClientStockClientIntegrationTest*

It connects and test "stock-service" server
 with spring web http client:
```
15:54:06.899 [reactor-http-nio-1] DEBUG reactor.netty.http.client.HttpClientConnect - [id: 0xb7d02319, L:/127.0.0.1:54565 - R:localhost/127.0.0.1:8080] Handler is being applied: {uri=http://localhost:8080/stocks/EUR, method=GET}
15:54:06.916 [reactor-http-nio-1] DEBUG io.netty.util.Recycler - -Dio.netty.recycler.maxCapacityPerThread: 4096
15:54:06.917 [reactor-http-nio-1] DEBUG io.netty.util.Recycler - -Dio.netty.recycler.maxSharedCapacityFactor: 2
15:54:06.917 [reactor-http-nio-1] DEBUG io.netty.util.Recycler - -Dio.netty.recycler.linkCapacity: 16
15:54:06.917 [reactor-http-nio-1] DEBUG io.netty.util.Recycler - -Dio.netty.recycler.ratio: 8
15:54:06.925 [reactor-http-nio-1] DEBUG reactor.netty.resources.PooledConnectionProvider - [id: 0xb7d02319, L:/127.0.0.1:54565 - R:localhost/127.0.0.1:8080] onStateChange(GET{uri=/stocks/EUR, connection=PooledConnection{channel=[id: 0xb7d02319, L:/127.0.0.1:54565 - R:localhost/127.0.0.1:8080]}}, [request_sent])
15:54:07.960 [reactor-http-nio-1] DEBUG reactor.netty.http.client.HttpClientOperations - [id: 0xb7d02319, L:/127.0.0.1:54565 - R:localhost/127.0.0.1:8080] Received response (auto-read:false) : [transfer-encoding=chunked, Content-Type=text/event-stream;charset=UTF-8]
15:54:07.960 [reactor-http-nio-1] DEBUG reactor.netty.resources.PooledConnectionProvider - [id: 0xb7d02319, L:/127.0.0.1:54565 - R:localhost/127.0.0.1:8080] onStateChange(GET{uri=/stocks/EUR, connection=PooledConnection{channel=[id: 0xb7d02319, L:/127.0.0.1:54565 - R:localhost/127.0.0.1:8080]}}, [response_received])
15:54:07.965 [reactor-http-nio-1] DEBUG org.springframework.web.reactive.function.client.ExchangeFunctions - [62417a16] Response 200 OK
15:54:08.052 [reactor-http-nio-1] DEBUG reactor.netty.channel.FluxReceive - [id: 0xb7d02319, L:/127.0.0.1:54565 - R:localhost/127.0.0.1:8080] Subscribing inbound receiver [pending: 0, cancelled:false, inboundDone: false]
15:54:08.060 [reactor-http-nio-1] DEBUG org.springframework.core.codec.StringDecoder - [62417a16] Decoded "data:{"symbol":"EUR","price":25.608291769253555,"time":"2019-12-19T15:54:07.9359425"}"
15:54:08.060 [reactor-http-nio-1] DEBUG org.springframework.core.codec.StringDecoder - [62417a16] Decoded ""
15:54:08.077 [reactor-http-nio-1] DEBUG org.springframework.http.codec.json.Jackson2JsonDecoder - [62417a16] Decoded [com.mechanitis.demo.stockclient.StockPrice@204c5d06]
15:54:08.986 [reactor-http-nio-1] DEBUG org.springframework.core.codec.StringDecoder - [62417a16] Decoded "data:{"symbol":"EUR","price":94.3886199611531,"time":"2019-12-19T15:54:08.9357283"}"
15:54:08.986 [reactor-http-nio-1] DEBUG org.springframework.core.codec.StringDecoder - [62417a16] Decoded ""
15:54:08.987 [reactor-http-nio-1] DEBUG org.springframework.http.codec.json.Jackson2JsonDecoder - [62417a16] Decoded [com.mechanitis.demo.stockclient.StockPrice@aef27cdc]
15:54:09.944 [reactor-http-nio-1] DEBUG org.springframework.core.codec.StringDecoder - [62417a16] Decoded "data:{"symbol":"EUR","price":15.126334046218448,"time":"2019-12-19T15:54:09.9357721"}"
15:54:09.945 [reactor-http-nio-1] DEBUG org.springframework.core.codec.StringDecoder - [62417a16] Decoded ""
15:54:09.947 [reactor-http-nio-1] DEBUG org.springframework.http.codec.json.Jackson2JsonDecoder - [62417a16] Decoded [com.mechanitis.demo.stockclient.StockPrice@54086430]
15:54:10.943 [reactor-http-nio-1] DEBUG org.springframework.core.codec.StringDecoder - [62417a16] Decoded "data:{"symbol":"EUR","price":63.06089612949014,"time":"2019-12-19T15:54:10.9367539"}"
15:54:10.944 [reactor-http-nio-1] DEBUG org.springframework.core.codec.StringDecoder - [62417a16] Decoded ""
15:54:10.946 [reactor-http-nio-1] DEBUG org.springframework.http.codec.json.Jackson2JsonDecoder - [62417a16] Decoded [com.mechanitis.demo.stockclient.StockPrice@c9a0afbf]
15:54:11.936 [reactor-http-nio-1] DEBUG org.springframework.core.codec.StringDecoder - [62417a16] Decoded "data:{"symbol":"EUR","price":31.57800860516311,"time":"2019-12-19T15:54:11.9354488"}"
15:54:11.936 [reactor-http-nio-1] DEBUG org.springframework.core.codec.StringDecoder - [62417a16] Decoded ""
15:54:11.937 [reactor-http-nio-1] DEBUG org.springframework.http.codec.json.Jackson2JsonDecoder - [62417a16] Decoded [com.mechanitis.demo.stockclient.StockPrice@c7728d6d]
15:54:11.937 [reactor-http-nio-1] DEBUG org.springframework.web.reactive.function.client.ExchangeFunctions - [62417a16] Cancel signal (to close connection)
15:54:11.940 [reactor-http-nio-1] DEBUG reactor.netty.resources.PooledConnectionProvider - [id: 0xb7d02319, L:/127.0.0.1:54565 ! R:localhost/127.0.0.1:8080] Channel closed, now 0 active connections and 0 inactive connections
15:54:11.941 [reactor-http-nio-1] DEBUG reactor.netty.resources.PooledConnectionProvider - [id: 0xb7d02319, L:/127.0.0.1:54565 ! R:localhost/127.0.0.1:8080] onStateChange(GET{uri=/stocks/EUR, connection=PooledConnection{channel=[id: 0xb7d02319, L:/127.0.0.1:54565 ! R:localhost/127.0.0.1:8080]}}, [disconnecting])
15:54:11.942 [reactor-http-nio-1] DEBUG reactor.netty.resources.PooledConnectionProvider - [id: 0xb7d02319, L:/127.0.0.1:54565 ! R:localhost/127.0.0.1:8080] Releasing channel
15:54:11.946 [reactor-http-nio-1] DEBUG reactor.netty.resources.PooledConnectionProvider - [id: 0xb7d02319, L:/127.0.0.1:54565 ! R:localhost/127.0.0.1:8080] Channel cleaned, now 0 active connections and 0 inactive connections


Process finished with exit code 0
```