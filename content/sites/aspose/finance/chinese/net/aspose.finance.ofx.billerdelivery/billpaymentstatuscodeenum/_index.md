---
title: BillPaymentStatusCodeEnum
second_title: Aspose.Finance 适用于 .NET API 参考
description: 账单付款状态代码枚举。
type: docs
weight: 1440
url: /zh/net/aspose.finance.ofx.billerdelivery/billpaymentstatuscodeenum/
---
## BillPaymentStatusCodeEnum enumeration

账单付款状态代码枚举。

```csharp
public enum BillPaymentStatusCodeEnum
```

### 值

| 名称 | 值 | 描述 |
| --- | --- | --- |
| PAIDOUTOFBAND | `0` | 已通过一种不通过 OFX 报告状态的方式为此账单发起付款。此状态表示客户已使用现金或支票直接向账单方付款，或已通过一种不通过 OFX 报告付款状态的方式发起电子付款。 |
| AUTOPAY | `1` | 账单方或服务提供商将根据客户的预授权发起付款，通常是“有效直至取消”的指令且无明确结束日期。在美国，这通常通过循环的预授权 ACH 借记实现，尽管一些账单方提供通过信用卡的预授权自动付款。示例包括用于抵押贷款的每月扣款、从支票账户到信用卡的定期付款，以及许多公用事业提供的自动付款服务（APS）。与 NONE 类似，这可能是账单的初始付款状态。 |
| CANCELLED | `2` | 客户取消了先前已安排的付款。 |
| UNPAYABLE | `3` | 此账单允许的付款工具均不受付款提供商支持。此情况用于账单限制付款仅限于账单目录条目中允许的付款工具子集的场景。如果付款提供商或账单方在注册和账户激活后更改了其支持的付款工具类型，可能会出现此情况。 |
| NONE | `4` | 此账单既未安排付款，也未进行付款。这可能是账单的初始付款状态。 |
| SCHEDULED | `5` | 已安排付款，但尚未对该账单进行处理。 |
| PROCESSED | `6` | 付款已对该账单处理完毕，且无法再取消。 |
| POSTED | `7` | 账单方已在该账单上登记付款。 |

### 另请参阅

* namespace [Aspose.Finance.Ofx.BillerDelivery](../../aspose.finance.ofx.billerdelivery)
* assembly [Aspose.Finance](../../)

<!-- 请勿编辑：由 xmldocmd 为 Aspose.Finance.dll 生成 -->
