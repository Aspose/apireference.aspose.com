---
title: StatementTransaction
second_title: Aspose.Finance 适用于 .NET API 参考
description: 此类描述单个交易。它标识交易的类型以及交易的发布日期。该类还可以提供额外信息，以帮助客户识别交易的支票号码、收款人名称和备注。交易可以拥有标准行业代码，客户可使用该代码对交易进行分类。
type: docs
weight: 5730
url: /zh/net/aspose.finance.ofx/statementtransaction/
---
## StatementTransaction class

此类描述单个交易。它标识交易的类型以及记账日期。该类还可以提供额外信息，以帮助客户识别交易：支票号码、收款人名称和备注。交易可以包含标准行业分类代码，客户可使用该代码对交易进行分类。

```csharp
public class StatementTransaction
```

## 构造函数

| 名称 | 描述 |
| --- | --- |
| [StatementTransaction](statementtransaction)() | 初始化一个新的 [`StatementTransaction`](../statementtransaction) 类实例。 |

## 属性

| 名称 | 描述 |
| --- | --- |
| [AccountTo](../../aspose.finance.ofx/statementtransaction/accountto) { get; set; } | 获取或设置目标账户，[`BankAccount`](../bankaccount) 或 [`CreditCardAccount`](../creditcardaccount)。 |
| [AvailableDate](../../aspose.finance.ofx/statementtransaction/availabledate) { get; set; } | 获取或设置资金可用的日期（价值日期）。 |
| [CheckNumber](../../aspose.finance.ofx/statementtransaction/checknumber) { get; set; } | 获取或设置支票号码。 |
| [CorrectFinancialInstitutionTransactionId](../../aspose.finance.ofx/statementtransaction/correctfinancialinstitutiontransactionid) { get; set; } | 获取或设置已更正的交易 ID。如果存在，则为先前发送的交易的 FinancialInstitutionTransactionId，该交易被此记录更正。 |
| [CorrectiveAction](../../aspose.finance.ofx/statementtransaction/correctiveaction) { get; set; } | 获取或设置更正操作。 |
| [Currency](../../aspose.finance.ofx/statementtransaction/currency) { get; set; } | 获取或设置[`Currency`](./currency)。 |
| [ExtendedName](../../aspose.finance.ofx/statementtransaction/extendedname) { get; set; } | 获取或设置收款人的扩展名称或交易描述。 |
| [FinancialInstitutionTransactionId](../../aspose.finance.ofx/statementtransaction/financialinstitutiontransactionid) { get; set; } | 获取或设置金融机构颁发的交易 ID。 |
| [ImageDatas](../../aspose.finance.ofx/statementtransaction/imagedatas) { get; set; } | 获取或设置 [`ImageData`](../imagedata) 的集合。 |
| [Investment401kSource](../../aspose.finance.ofx/statementtransaction/investment401ksource) { get; set; } | 获取或设置此交易的现金来源。 |
| [Memo](../../aspose.finance.ofx/statementtransaction/memo) { get; set; } | 获取或设置额外信息。 |
| [Name](../../aspose.finance.ofx/statementtransaction/name) { get; set; } | 获取或设置收款人名称或交易描述。 |
| [OriginCurrency](../../aspose.finance.ofx/statementtransaction/origincurrency) { get; set; } | 获取或设置原始[`Currency`](./currency)。 |
| [Payee](../../aspose.finance.ofx/statementtransaction/payee) { get; set; } | 获取或设置 [`Payee`](./payee)。 |
| [PayeeId](../../aspose.finance.ofx/statementtransaction/payeeid) { get; set; } | 获取或设置收款人标识符（如果可用）。 |
| [PostedDate](../../aspose.finance.ofx/statementtransaction/posteddate) { get; set; } | 获取或设置交易记账到账户的日期。 |
| [ReferenceNumber](../../aspose.finance.ofx/statementtransaction/referencenumber) { get; set; } | 获取或设置唯一标识交易的参考编号。 |
| [ServerTransactionId](../../aspose.finance.ofx/statementtransaction/servertransactionid) { get; set; } | 获取或设置服务器分配的交易 ID。 |
| [StandardIndustrialCode](../../aspose.finance.ofx/statementtransaction/standardindustrialcode) { get; set; } | 获取或设置标准行业代码。 |
| [TransactionAmount](../../aspose.finance.ofx/statementtransaction/transactionamount) { get; set; } | 获取或设置交易金额。 |
| [TransactionType](../../aspose.finance.ofx/statementtransaction/transactiontype) { get; set; } | 获取或设置交易类型。 |
| [UserDate](../../aspose.finance.ofx/statementtransaction/userdate) { get; set; } | 获取或设置用户发起交易的日期（如果已知）。 |

### 另请参阅

* namespace [Aspose.Finance.Ofx](../../aspose.finance.ofx)
* assembly [Aspose.Finance](../../)

<!-- 请勿编辑：由 xmldocmd 为 Aspose.Finance.dll 生成 -->
