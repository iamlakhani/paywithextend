package com.extend.pay.apiexecutions.helper;

import com.extend.pay.apiexecutions.model.request.card.virtual.VirtualCards;
import com.extend.pay.apiexecutions.model.request.transaction.Transaction;
import com.extend.pay.apiexecutions.model.request.transaction.Transactions;
import com.extend.pay.apiexecutions.model.request.user.SignIn;
import com.extend.pay.apiexecutions.model.request.user.UserInfo;
import com.extend.pay.apiexecutions.utils.ApiProperties;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClientResponseException;
import org.springframework.web.client.RestTemplate;

/**
 * Helper class for Rest Template operations.
 *
 * @author Imran Lakhani
 */
@Component
@Slf4j
public class RestTemplateHelper {

    private static final String applicationVersionKey = "Accept";
    private static final String SIGN_IN = "signin";
    private static final String VIRTUAL_CARDS = "virtualcards";
    private static final String TRANSACTIONS = "transactions";
    private static final String TRANSACTION = "transaction";
    private static final String BEARER = "Bearer: ";
    private static final String AUTHORIZATION = "Authorization";

    @Value("${extend.credentials.username}")
    private String username;
    @Value("${extend.credentials.password}")
    private String password;

    @Autowired
    private ApiProperties apiProperties;

    @Autowired
    private RestTemplate restTemplate;

    public ResponseEntity<UserInfo> doSignIn() throws Exception {
        log.info("Sign In called with params: NONE");
        String url = apiProperties.getApis().get(SIGN_IN).getUrl();
        String applicationVersion = apiProperties.getApis().get(SIGN_IN).getVersion();
        return doSignIn(url, applicationVersion, SignIn.builder().email(username).password(password).build());
    }

    public ResponseEntity<UserInfo> doSignIn(String url, String applicationVersion, SignIn signIn) throws Exception {
        log.info("Sign In called with params: url=" + url + ", applicationVersion=" + applicationVersion + ", signIn" + signIn);
        try {
            HttpHeaders httpHeaders = new HttpHeaders();
            httpHeaders.add(applicationVersionKey, applicationVersion);

            HttpEntity httpEntity = new HttpEntity(signIn, httpHeaders);

            ResponseEntity<UserInfo> response = restTemplate.exchange(url, HttpMethod.POST, httpEntity, UserInfo.class);

            log.info("Sign In completed returning response=" + response);
            return response;
        } catch (RestClientResponseException re) {
            log.error("Exception while calling Sign In Service", re);
            throw re;
        } catch (Exception e) {
            log.error("Exception while calling Sign In Service", e);
            throw e;
        }
    }

    public ResponseEntity<VirtualCards> getVirtualCards() throws Exception {
        log.info("Get virtual cards called with params: NONE");
        String url = apiProperties.getApis().get(VIRTUAL_CARDS).getUrl();
        String applicationVersion = apiProperties.getApis().get(VIRTUAL_CARDS).getVersion();
        String token = doSignIn().getBody().getToken();
        return getVirtualCards(url, applicationVersion, token);
    }

    public ResponseEntity<VirtualCards> getVirtualCards(String url, String applicationVersion, String token) throws Exception {
        log.info("Get virtual cards called with params: url=" + url + ", token=" + token + ", applicationVersion=" + applicationVersion);
        try {
            HttpHeaders httpHeaders = new HttpHeaders();
            httpHeaders.add(applicationVersionKey, applicationVersion);
            httpHeaders.add(AUTHORIZATION, BEARER + token);

            HttpEntity httpEntity = new HttpEntity("", httpHeaders);

            ResponseEntity<VirtualCards> response = restTemplate.exchange(url, HttpMethod.GET, httpEntity, VirtualCards.class);

            log.info("Get virtual cards completed returning response=" + response);
            return response;
        } catch (RestClientResponseException re) {
            log.error("Exception while calling Get virtual cards Service", re);
            throw re;
        } catch (Exception e) {
            log.error("Exception while calling Get virtual cards Service", e);
            throw e;
        }
    }

    public ResponseEntity<Transactions> getTransactions(String virtualCardId) throws Exception {
        log.info("Get Transaction called with params: NONE");
        String url = apiProperties.getApis().get(TRANSACTIONS).getUrl();
        String applicationVersion = apiProperties.getApis().get(TRANSACTIONS).getVersion();
        String token = doSignIn().getBody().getToken();
        return getTransactions(url, applicationVersion, token, virtualCardId);
    }

    public ResponseEntity<Transactions> getTransactions(String url, String applicationVersion, String token, String virtualCardId) throws Exception {
        log.info("Get Transactions called with params: url=" + url + ", token=" + token + ", applicationVersion=" + applicationVersion);
        try {
            String urlWithId = url.replace("{id}", virtualCardId);
            HttpHeaders httpHeaders = new HttpHeaders();
            httpHeaders.add(applicationVersionKey, applicationVersion);
            httpHeaders.add(AUTHORIZATION, BEARER + token);

            HttpEntity httpEntity = new HttpEntity("", httpHeaders);

            ResponseEntity<Transactions> response = restTemplate.exchange(urlWithId, HttpMethod.GET, httpEntity, Transactions.class);

            log.info("Get Transactions cards completed returning response=" + response);
            return response;
        } catch (RestClientResponseException re) {
            log.error("Exception while calling Get Transactions Service", re);
            throw re;
        } catch (Exception e) {
            log.error("Exception while calling Get Transactions Service", e);
            throw e;
        }
    }

    public ResponseEntity<Transaction> getTransaction(String id) throws Exception {
        log.info("Get Transaction called with params: NONE");
        String url = apiProperties.getApis().get(TRANSACTION).getUrl();
        String applicationVersion = apiProperties.getApis().get(TRANSACTION).getVersion();
        String token = doSignIn().getBody().getToken();
        return getTransaction(url, applicationVersion, token, id);
    }

    public ResponseEntity<Transaction> getTransaction(String url, String applicationVersion, String token, String id) throws Exception {
        log.info("Get Transactions called with params: url=" + url + ", token=" + token + ", applicationVersion=" + applicationVersion);
        try {
            String urlWithId = url.replace("{id}", id);
            HttpHeaders httpHeaders = new HttpHeaders();
            httpHeaders.add(applicationVersionKey, applicationVersion);
            httpHeaders.add(AUTHORIZATION, BEARER + token);

            HttpEntity httpEntity = new HttpEntity("", httpHeaders);

            ResponseEntity<Transaction> response = restTemplate.exchange(urlWithId, HttpMethod.GET, httpEntity, Transaction.class);

            log.info("Get Transactions cards completed returning response=" + response);
            return response;
        } catch (RestClientResponseException re) {
            log.error("Exception while calling Get Transactions Service", re);
            throw re;
        } catch (Exception e) {
            log.error("Exception while calling Get Transactions Service", e);
            throw e;
        }
    }


}
