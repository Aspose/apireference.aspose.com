---
title: setMeteredKey
second_title: Aspose.Sildes for PHP via Java API Reference
description: 
type: docs

url: /php-java/aspose.slides/metered/setmeteredkey/
---

## setMeteredKey(String publicKey, String privateKey)  method
Sets metered public and private key.
 If you purchase metered license, when start application, this API should be called, normally, this is enough.
 However, if always fail to upload consumption data and exceed 24 hours, the license will be set to evaluation status,
 to avoid such case, you should regularly check the license status, if it is evaluation status, call this API again.

### Parameters

| Name | Type | Description |
| --- | --- | --- |
| publicKey | String | public key |
| privateKey | String | private key |

### Returns
void


---


