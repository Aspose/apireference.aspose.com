---
title: Metered.SetMeteredKey
second_title: Aspose.HTML for .NET API Reference
description: Metered SetMeteredKey method. Sets metered public and private key. If you purchase metered license when start application this API should be called normally this is enough. However if always fail to upload consumption data and exceed 24 hours the license will be set to evaluation status to avoid such case you should regularly check the license status if it is evaluation status call this API again
type: docs
weight: 20
url: /net/aspose.html/metered/setmeteredkey/
---
## Metered.SetMeteredKey method

Sets metered public and private key. If you purchase metered license, when start application, this API should be called, normally, this is enough. However, if always fail to upload consumption data and exceed 24 hours, the license will be set to evaluation status, to avoid such case, you should regularly check the license status, if it is evaluation status, call this API again.

```csharp
public void SetMeteredKey(string publicKey, string privateKey)
```

| Parameter | Type | Description |
| --- | --- | --- |
| publicKey | String | public key |
| privateKey | String | private key |

### See Also

* class [Metered](../)
* namespace [Aspose.Html](../../../aspose.html/)
* assembly [Aspose.HTML](../../../)
