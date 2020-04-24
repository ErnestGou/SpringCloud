package com.ernest.servicemaster.config.filters;

import org.springframework.cloud.gateway.filter.ratelimit.KeyResolver;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

/**
 * 网关限流过滤器
 * @author Ernest
 * @create 2020-04-24
 * @ClassName UriKeyResolver
 * @version 0.0.1-SNAPSHOT
 */
public class UriKeyResolver implements KeyResolver {

    /**
     * 根据请求的URI限流
     * @param exchange
     * @return
     */
    @Override
    public Mono<String> resolve(ServerWebExchange exchange) {
        return Mono.just(exchange.getRequest().getURI().getPath());
    }
}
