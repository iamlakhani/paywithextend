# Getting Started

This application is made for Extend as per their interview process requirements.

##Pre-Requirements

1. Any java based IDE e.g. IntelliJ, Eclipse etc
2. Java 11
3. CURL Command / Browser or Postman for testing
4. Basic knowledge of Maven, Postman and Java Projects


##Core Components

1. Java 11
2. Spring boot
3. Logger
4. RestTemplate / Http Communication


##Key Points

1. Made in Spring boot with 4 Simple operations of List of Virtual Cards, List of Transactions, Single Transaction.
2. No Authentication is done, so API is open as Highway.
3. I also kept my Login credentials in the application.yml file to make things easier.
4. I have removed my credentials from properties file. If you like to test API you need to provide valid credentials.
5. No Exception handling is done due to time constraint.
6. No Unit tests are written for the same above reason.
7. Can be started simply by executing "mvn spring-boot:run" in terminal window

##How to Run and Test
1. Import project in any Java IDE like IntelliJ.
2. Open application.yml file and provide valid values for extend.credentials.username / extend.credentials.username. 
3. Open Terminal and type "mvn spring-boot:run"
4. Once application is up and running. You can execute below commands to test.
5. curl http://localhost:8080/api/virtualcards
6. curl http://localhost:8080/api/transactions?cardId=vc_232oAoJSiv68EGpuryihWc
7. curl http://localhost:8080/api/transaction?id=txn_914gHUf7QB2825vjLoizSd


##GetVirtualCards

URL: http://localhost:8080/api/virtualcards
Type: GET
Request Body: None
Response: All Virtual Cards related to login credentials.

```json
[
    {
        "id": "vc_232oAoJSiv68EGpuryihWc",
        "status": "ACTIVE",
        "recipientId": "u_24xJ5h21wiC8EIQIxMM9aY",
        "cardholderId": "u_3qzXAzOtScVAT7klV03en6",
        "displayName": "Imran Lakhani",
        "expires": "2023-08-01T00:00:00.000+0000",
        "currency": "USD",
        "limitCents": 5000,
        "balanceCents": 27,
        "spentCents": 4973,
        "lifetimeSpentCents": 4973,
        "last4": "9772",
        "numberFormat": "cardnumber16",
        "validFrom": "2022-03-10T14:53:54.143+0000",
        "validTo": "2022-03-19T04:00:00.000+0000",
        "timezone": "America/New_York",
        "creditCardId": "cc_AEjfTfmE2aa62mexyJUzde",
        "recurs": false,
        "notes": "To be used for take-home interview assignment.\n\nPlease be aware that Amazon purchases authorize the transaction when the item is ready to *ship*.  Transactions will not appear in our system until then.",
        "createdAt": "2022-03-10T14:53:54.141+0000",
        "updatedAt": "2022-03-15T08:00:16.333+0000",
        "hasPlasticCard": false,
        "activeUntil": "2022-03-19T04:00:00.000+0000",
        "companyName": "Extend",
        "creditCardDisplayName": "Take home assignments"
    }
]
```


##GetTransactions

URL: http://localhost:8080/api/transactions?cardId=vc_232oAoJSiv68EGpuryihWc
Type: GET
Request Body: None
Response: All Transactions Related to VC

```json
[
  {
    "id": "txn_94OXRCZltdc81yyz52kYst",
    "source": "VIRTUAL",
    "virtualCardId": "vc_232oAoJSiv68EGpuryihWc",
    "type": "DEBIT",
    "status": "CLEARED",
    "approvalCode": "767599",
    "authBillingAmountCents": 2167,
    "authBillingCurrency": "USD",
    "authMerchantAmountCents": 2167,
    "authMerchantCurrency": "USD",
    "clearingBillingAmountCents": 2167,
    "clearingMerchantAmountCents": 2167,
    "mcc": "5942",
    "mccGroup": "RETAIL",
    "mccDescription": "BOOK STORES",
    "merchantName": "AMZN MKTP US*1Z9Q45820",
    "referenceId": "767599",
    "creditCardId": "cc_AEjfTfmE2aa62mexyJUzde"
  },
  {
    "id": "txn_914gHUf7QB2825vjLoizSd",
    "source": "VIRTUAL",
    "virtualCardId": "vc_232oAoJSiv68EGpuryihWc",
    "type": "DEBIT",
    "status": "CLEARED",
    "approvalCode": "767588",
    "authBillingAmountCents": 2806,
    "authBillingCurrency": "USD",
    "authMerchantAmountCents": 2806,
    "authMerchantCurrency": "USD",
    "clearingBillingAmountCents": 2806,
    "clearingMerchantAmountCents": 2806,
    "mcc": "5942",
    "mccGroup": "RETAIL",
    "mccDescription": "BOOK STORES",
    "merchantName": "AMAZON.COM*1Z42F0W91 A",
    "referenceId": "767588",
    "creditCardId": "cc_AEjfTfmE2aa62mexyJUzde"
  }
]
```



##GetTransaction

URL: http://localhost:8080/api/transaction?id=txn_914gHUf7QB2825vjLoizSd
Type: GET
Request Body: None
Response: Single Transaction Record

```json
{
"id": "txn_914gHUf7QB2825vjLoizSd",
"source": "VIRTUAL",
"virtualCardId": "vc_232oAoJSiv68EGpuryihWc",
"type": "DEBIT",
"status": "CLEARED",
"approvalCode": "767588",
"authBillingAmountCents": 2806,
"authBillingCurrency": "USD",
"authMerchantAmountCents": 2806,
"authMerchantCurrency": "USD",
"clearingBillingAmountCents": 2806,
"clearingMerchantAmountCents": 2806,
"mcc": "5942",
"mccGroup": "RETAIL",
"mccDescription": "BOOK STORES",
"merchantName": "AMAZON.COM*1Z42F0W91 A",
"referenceId": "767588",
"creditCardId": "cc_AEjfTfmE2aa62mexyJUzde"
}
```

Normally nobody bothers to read README till end, I am keeping a fun fact below which I might ask during the interview.

###You know "Fire Trucks Have Water in it" :)


