package com.extend.pay.apiexecutions.service;

import com.extend.pay.apiexecutions.model.request.user.UserInfo;
import com.extend.pay.apiexecutions.model.response.card.virtual.VirtualCardResponse;
import com.extend.pay.apiexecutions.model.response.transaction.TransactionResponse;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Service class for Api Operations.
 *
 * @author Imran Lakhani
 */
@Service
public interface ApiService {

    UserInfo signin(String username, String password);

    List<VirtualCardResponse> getVirtualCards();

    List<TransactionResponse> getTransactions(String cardId);

    TransactionResponse getTransaction(String id);

}
