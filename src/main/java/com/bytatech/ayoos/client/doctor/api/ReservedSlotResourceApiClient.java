package com.bytatech.ayoos.client.doctor.api;

import org.springframework.cloud.openfeign.FeignClient;
import com.bytatech.ayoos.client.doctor.ClientConfiguration;

@FeignClient(name="${doctor.name:doctor}", url="${doctor.url:35.231.213.38:8083/}", configuration = ClientConfiguration.class)
public interface ReservedSlotResourceApiClient extends ReservedSlotResourceApi {
}