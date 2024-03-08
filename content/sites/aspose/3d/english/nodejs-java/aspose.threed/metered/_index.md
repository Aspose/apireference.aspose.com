---
title: Metered 
second_title: Aspose.3D for Node.js via Java API Reference
description: 
type: docs

url: /nodejs-java/aspose.threed/metered/
---
## Metered class

  Provides methods to set metered key.


## Methods

### constructor{#constructor}

| Name | Description |
| --- | --- |
| constructor() | Initializes a new instance of this class. | 

 **Result:**



---


### setMeteredKey{#setMeteredKey}

| Name | Description |
| --- | --- |
| setMeteredKey(publicKey, privateKey) | Sets metered public and private key. If you purchase metered license, when start application, this API should be called, normally, this is enough. However, if always fail to upload consumption data and exceed 24 hours, the license will be set to evaluation status, to avoid such case, you should regularly check the license status, if it is evaluation status, call this API again. | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| publicKey | String | public key |
| privateKey | String | private key |

 **Result:**



---


### getConsumptionQuantity{#getConsumptionQuantity}

| Name | Description |
| --- | --- |
| getConsumptionQuantity() | Gets consumption file size | 

 **Result:**
BigDecimal


---


### getConsumptionCredit{#getConsumptionCredit}

| Name | Description |
| --- | --- |
| getConsumptionCredit() | Gets consumption credit | 

 **Result:**
BigDecimal


---



