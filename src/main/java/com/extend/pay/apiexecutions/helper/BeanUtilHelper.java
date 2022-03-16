package com.extend.pay.apiexecutions.helper;

import com.extend.pay.apiexecutions.model.request.card.virtual.VirtualCard;
import com.extend.pay.apiexecutions.model.request.card.virtual.VirtualCards;
import com.extend.pay.apiexecutions.model.request.transaction.Transaction;
import com.extend.pay.apiexecutions.model.request.transaction.Transactions;
import com.extend.pay.apiexecutions.model.response.card.virtual.VirtualCardResponse;
import com.extend.pay.apiexecutions.model.response.transaction.TransactionResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Helper class for Bean Transformation.
 *
 * @author Imran Lakhani
 */
@Component
@Slf4j
public class BeanUtilHelper {

    public List<VirtualCardResponse> buildVirtualCardResponse(VirtualCards virtualCards) {
        List<VirtualCardResponse> virtualCardResponses = new ArrayList<>();
        VirtualCardResponse virtualCardResponse;
        for (VirtualCard virtualCard : virtualCards.getVirtualCards()) {
            virtualCardResponse = new VirtualCardResponse();
            BeanUtils.copyProperties(virtualCard, virtualCardResponse);
            virtualCardResponses.add(virtualCardResponse);
        }
        return virtualCardResponses;
    }

    public List<TransactionResponse> buildTransactionResponses(Transactions transactions) {
        List<TransactionResponse> transactionResponses = new ArrayList<>();
        TransactionResponse transactionResponse;
        for (Transaction transaction : transactions.getTransactions()) {
            transactionResponse = new TransactionResponse();
            BeanUtils.copyProperties(transaction, transactionResponse);
            transactionResponses.add(transactionResponse);
        }
        return transactionResponses;
    }

    public TransactionResponse buildTransactionResponse(Transaction transaction) {
        TransactionResponse transactionResponse = new TransactionResponse();
        BeanUtils.copyProperties(transaction, transactionResponse);
        return transactionResponse;
    }


}
