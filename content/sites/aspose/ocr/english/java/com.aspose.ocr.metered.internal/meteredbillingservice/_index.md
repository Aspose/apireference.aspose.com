---
title: MeteredBillingService
second_title: Aspose.OCR for Java API Reference
description: This internal class is used to handle customers matering state
type: docs
weight: 10
url: /java/com.aspose.ocr.metered.internal/meteredbillingservice/
---

**Inheritance:**
java.lang.Object
```
public class MeteredBillingService
```

This internal class is used to handle customer's matering state
## Constructors

| Constructor | Description |
| --- | --- |
| [MeteredBillingService()](#MeteredBillingService--) |  |
## Methods

| Method | Description |
| --- | --- |
| [getInstance()](#getInstance--) |  |
| [setkey(String subscriptionPublicKey, String subscriptionPrivateKey)](#setkey-java.lang.String-java.lang.String-) | Sets the subscription public and private key |
| [getMeteredState()](#getMeteredState--) | Gets metered state |
| [getCustomerData()](#getCustomerData--) |  |
| [getCustomerCredit()](#getCustomerCredit--) |  |
### MeteredBillingService() {#MeteredBillingService--}
```
public MeteredBillingService()
```


### getInstance() {#getInstance--}
```
public static MeteredBillingService getInstance()
```




**Returns:**
[MeteredBillingService](../../com.aspose.ocr.metered.internal/meteredbillingservice)
### setkey(String subscriptionPublicKey, String subscriptionPrivateKey) {#setkey-java.lang.String-java.lang.String-}
```
public boolean setkey(String subscriptionPublicKey, String subscriptionPrivateKey)
```


Sets the subscription public and private key

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| subscriptionPublicKey | java.lang.String | subscription public key |
| subscriptionPrivateKey | java.lang.String | subscription private key |

**Returns:**
boolean - true if key is set
### getMeteredState() {#getMeteredState--}
```
public static int getMeteredState()
```


Gets metered state

**Returns:**
int - matered state
### getCustomerData() {#getCustomerData--}
```
public double getCustomerData()
```




**Returns:**
double
### getCustomerCredit() {#getCustomerCredit--}
```
public double getCustomerCredit()
```




**Returns:**
double
