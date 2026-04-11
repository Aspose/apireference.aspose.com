---
title: PendingTransaction
second_title: Aspose.Finance 适用于 .NET API 参考
description: 此类描述单个待处理交易。它标识交易的类型以及发起的日期。该类还可以提供额外信息，以帮助客户识别交易的支票号码、收款人名称和备注。
type: docs
weight: 4270
url: /zh/net/aspose.finance.ofx/pendingtransaction/
---
## PendingTransaction class

此类描述单个待处理交易。它标识交易的类型以及发起日期。该类还可以提供额外信息，以帮助客户识别交易：支票号码、收款人名称和备注。

```csharp
public class PendingTransaction
```

## 构造函数

| 名称 | 描述 |
| --- | --- |
| [PendingTransaction](pendingtransaction)() | 初始化一个新的 [`PendingTransaction`](../pendingtransaction) 类实例。 |

## 属性

| 名称 | 描述 |
| --- | --- |
| [Currency](../../aspose.finance.ofx/pendingtransaction/currency) { get; set; } | 获取或设置[`Currency`](./currency)。 |
| [ExpireDate](../../aspose.finance.ofx/pendingtransaction/expiredate) { get; set; } | 获取或设置此交易的冻结到期日期。仅在 TransactionType 为 HOLD 时有效。 |
| [ExtendedName](../../aspose.finance.ofx/pendingtransaction/extendedname) { get; set; } | 获取或设置收款人的扩展名称或交易描述。 |
| [ImageDatas](../../aspose.finance.ofx/pendingtransaction/imagedatas) { get; set; } | 获取或设置 [`ImageData`](../imagedata) 的集合。 |
| [Memo](../../aspose.finance.ofx/pendingtransaction/memo) { get; set; } | 获取或设置额外信息 |
| [Name](../../aspose.finance.ofx/pendingtransaction/name) { get; set; } | 获取或设置收款人名称或交易描述。 |
| [OriginCurrency](../../aspose.finance.ofx/pendingtransaction/origincurrency) { get; set; } | 获取或设置原始[`Currency`](./currency)。 |
| [ReferenceNumber](../../aspose.finance.ofx/pendingtransaction/referencenumber) { get; set; } | 获取或设置交易的参考号（如果有）。 |
| [TransactionAmount](../../aspose.finance.ofx/pendingtransaction/transactionamount) { get; set; } | 获取或设置交易金额。 |
| [TransactionDate](../../aspose.finance.ofx/pendingtransaction/transactiondate) { get; set; } | 获取或设置交易发起的日期。 |
| [TransactionType](../../aspose.finance.ofx/pendingtransaction/transactiontype) { get; set; } | 获取或设置交易类型。 |

### 另请参阅

* namespace [Aspose.Finance.Ofx](../../aspose.finance.ofx)
* assembly [Aspose.Finance](../../)

<!-- 请勿编辑：由 xmldocmd 为 Aspose.Finance.dll 生成 -->
