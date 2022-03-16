package com.extend.pay.apiexecutions.controllers;

import com.extend.pay.apiexecutions.model.response.transaction.TransactionResponse;
import com.extend.pay.apiexecutions.service.ApiService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;
import java.util.List;

/**
 * Controller for Transactions.
 *
 * @author Imran Lakhani
 */
@RestController
@Slf4j
public class TransactionsController {

    @Autowired
    private ApiService apiService;

    @GetMapping("/transactions")
    public List<TransactionResponse> getTransactions(@RequestParam String cardId) {
        long startTime = Instant.now().toEpochMilli();
        log.info("getTransactions method started");

        List<TransactionResponse> transactions = apiService.getTransactions(cardId);

        log.info("Get Transactions Successfull: transactions=" + transactions);

        long endTime = Instant.now().toEpochMilli();
        log.info("Method getTransactions took time in milliseconds=" + (endTime - startTime));
        return transactions;
    }


    @GetMapping("/transaction")
    public TransactionResponse getTransaction(@RequestParam String id) {
        long startTime = Instant.now().toEpochMilli();
        log.info("getTransaction method started");

        TransactionResponse transaction = apiService.getTransaction(id);

        log.info("Get Transaction Successfull: transaction=" + transaction);

        long endTime = Instant.now().toEpochMilli();
        log.info("Method getTransaction took time in milliseconds=" + (endTime - startTime));
        return transaction;
    }

}