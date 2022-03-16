package com.extend.pay.apiexecutions.service.impl;

import com.extend.pay.apiexecutions.helper.BeanUtilHelper;
import com.extend.pay.apiexecutions.helper.RestTemplateHelper;
import com.extend.pay.apiexecutions.model.request.card.virtual.VirtualCards;
import com.extend.pay.apiexecutions.model.request.transaction.Transaction;
import com.extend.pay.apiexecutions.model.request.transaction.Transactions;
import com.extend.pay.apiexecutions.model.request.user.UserInfo;
import com.extend.pay.apiexecutions.model.response.card.virtual.VirtualCardResponse;
import com.extend.pay.apiexecutions.model.response.transaction.TransactionResponse;
import com.extend.pay.apiexecutions.service.ApiService;
import com.extend.pay.apiexecutions.utils.ApiProperties;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Service Implemenration class for {@link ApiService}.
 *
 * @author Imran Lakhani
 */
@Service
@Slf4j
public class ApiServiceImpl implements ApiService {

    private static final String SIGN_IN = "signin";

    @Value("${extend.credentials.username}")
    private String username;
    @Value("${extend.credentials.password}")
    private String password;

    @Autowired
    private ApiProperties apiProperties;

    @Autowired
    private BeanUtilHelper beanUtilHelper;

    @Autowired
    private RestTemplateHelper restTemplateHelper;

    @Override
    public UserInfo signin(String username, String password) {
        String url = apiProperties.getApis().get(SIGN_IN).getUrl();
        String applicationVersion = apiProperties.getApis().get(SIGN_IN).getVersion();
        try {
            return restTemplateHelper.doSignIn().getBody();
        } catch (Exception e) {
            log.error("Error while calling signIn helper class", e);
            return null;
        }
    }

    @Override
    public List<VirtualCardResponse> getVirtualCards() {
        try {
            VirtualCards virtualCards = restTemplateHelper.getVirtualCards().getBody();
            return beanUtilHelper.buildVirtualCardResponse(virtualCards);
        } catch (Exception e) {
            log.error("Error while calling helper class", e);
            return null;
        }
    }

    @Override
    public List<TransactionResponse> getTransactions(String cardId) {
        try {
            Transactions transactions = restTemplateHelper.getTransactions(cardId).getBody();
            return beanUtilHelper.buildTransactionResponses(transactions);
        } catch (Exception e) {
            log.error("Error while calling helper class", e);
            return null;
        }
    }

    @Override
    public TransactionResponse getTransaction(String id) {
        try {
            Transaction transaction = restTemplateHelper.getTransaction(id).getBody();
            return beanUtilHelper.buildTransactionResponse(transaction);
        } catch (Exception e) {
            log.error("Error while calling helper class", e);
            return null;
        }
    }

}
