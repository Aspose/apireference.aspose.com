---
title: BillStatusCodeEnum
second_title: Aspose.Finance 适用于 .NET API 参考
description: 账单状态代码枚举。
type: docs
weight: 1470
url: /zh/net/aspose.finance.ofx.billerdelivery/billstatuscodeenum/
---
## BillStatusCodeEnum enumeration

账单状态代码枚举。

```csharp
public enum BillStatusCodeEnum
```

### 值

| 名称 | 值 | 描述 |
| --- | --- | --- |
| WITHDRAWN | `0` | 开票方或发布者不再希望显示此账单。 |
| UNDELIVERABLE | `1` | 尝试及时向消费者交付此账单的操作已失败。此状态通常不在向消费者展示账单时使用。然而，使用此状态的通知涵盖了许多有用的情况。 |
| NEW | `2` | 服务器尚未将账单发送给客户端或客户端代理。这是账单的初始状态码。 |
| DELIVERED | `3` | 服务器已将账单发送给客户端或客户端代理。 |
| VIEWED | `4` | 客户已查看账单。表示之前的状态为 DELIVERED。 |
| RETIRED | `5` | 客户不再希望查看此账单。表示之前的状态为 DELIVERED。 |

### 另请参阅

* namespace [Aspose.Finance.Ofx.BillerDelivery](../../aspose.finance.ofx.billerdelivery)
* assembly [Aspose.Finance](../../)

<!-- 请勿编辑：由 xmldocmd 为 Aspose.Finance.dll 生成 -->
