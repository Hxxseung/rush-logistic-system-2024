package com.rush.logistic.client.order_delivery.domain.order.controller.client;

import com.rush.logistic.client.order_delivery.domain.order.controller.client.dto.request.HubRouteInfoReq;
import com.rush.logistic.client.order_delivery.domain.order.controller.client.dto.response.HubResSubWrapper;
import com.rush.logistic.client.order_delivery.domain.order.controller.client.dto.response.HubResWrapper;
import com.rush.logistic.client.order_delivery.domain.order.controller.client.dto.response.HubRouteInfoRes;
import com.rush.logistic.client.order_delivery.global.feign.FeignConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.UUID;

@FeignClient(value = "hub-service", configuration = FeignConfig.class)
public interface HubClient {
    @GetMapping("/api/hubs-routes/createHubToHubRelay")
//    HubResWrapper<HubResSubWrapper<HubRouteInfoRes>> getHubRoute(@RequestParam UUID startHubId, @RequestParam UUID endHubId);
    HubResWrapper<HubResSubWrapper<HubRouteInfoRes>> getHubRoute(@RequestBody HubRouteInfoReq hubRouteInfoReq);
}
