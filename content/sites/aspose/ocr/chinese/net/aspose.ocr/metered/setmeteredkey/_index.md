---
title: SetMeteredKey
second_title: Aspose.OCR 适用于 .NET API 参考
description: 设置计量的公钥和私钥。如果在启动应用程序时购买了计量许可证，通常只需调用此 API 即可，足够了。然而，如果始终无法上传消费数据且超过 24 小时，许可证将被设置为评估状态。为避免这种情况，您应定期检查许可证状态；如果处于评估状态，请再次调用此 API。
type: docs
weight: 20
url: /zh/net/aspose.ocr/metered/setmeteredkey/
---
## Metered.SetMeteredKey method

设置计量版的公钥和私钥。如果您购买了计量许可证，在启动应用程序时应调用此 API，通常这已足够。然而，如果始终无法上传消费数据且超过 24 小时，许可证将被设置为评估状态。为避免此情况，您应定期检查许可证状态，如果处于评估状态，请再次调用此 API。

```csharp
public void SetMeteredKey(string publicKey, string privateKey)
```

| Parameter | Type | 描述 |
| --- | --- | --- |
| publicKey | String | 公钥 |
| privateKey | String | 私钥 |

### 另请参见

* class [Metered](../../metered)
* namespace [Aspose.OCR](../../metered)
* assembly [Aspose.OCR](../../../)

<!-- 请勿编辑：由 xmldocmd 为 Aspose.OCR.dll 生成 -->
