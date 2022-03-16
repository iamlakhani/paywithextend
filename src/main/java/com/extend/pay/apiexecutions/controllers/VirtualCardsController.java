package com.extend.pay.apiexecutions.controllers;

import com.extend.pay.apiexecutions.model.response.card.virtual.VirtualCardResponse;
import com.extend.pay.apiexecutions.service.ApiService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;
import java.util.List;

/**
 * Controller for Virtual Cards.
 *
 * @author Imran Lakhani
 */
@RestController
@Slf4j
public class VirtualCardsController {

    @Autowired
    private ApiService apiService;

    @GetMapping("/virtualcards")
    public List<VirtualCardResponse> getVirtualCards() {
        long startTime = Instant.now().toEpochMilli();
        log.info("getVirtualCards method started");

        List<VirtualCardResponse> virtualCards = apiService.getVirtualCards();

        log.info("Get Virtual Cards Successfull: virtualCards=" + virtualCards);

        long endTime = Instant.now().toEpochMilli();
        log.info("Method getVirtualCards took time in milliseconds=" + (endTime - startTime));
        return virtualCards;
    }

}