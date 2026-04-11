---
title: RecurringIntraSyncResponse
second_title: Aspose.Finance 适用于 .NET API 参考
description: 循环内部银行交易同步响应类。
type: docs
weight: 600
url: /zh/net/aspose.finance.ofx.bank/recurringintrasyncresponse/
---
## RecurringIntraSyncResponse class

循环内部银行交易同步响应类。

```csharp
public class RecurringIntraSyncResponse : AbstractSyncResponse
```

## 构造函数

| 名称 | 描述 |
| --- | --- |
| [RecurringIntraSyncResponse](recurringintrasyncresponse)() | 初始化 [`RecurringIntraSyncResponse`](../recurringintrasyncresponse) 类的新实例。 |

## 属性

| 名称 | 描述 |
| --- | --- |
| [AccountFrom](../../aspose.finance.ofx.bank/recurringintrasyncresponse/accountfrom) { get; set; } | 获取或设置 [`BankAccount`](../../aspose.finance.ofx/bankaccount) 或 [`CreditCardAccount`](../../aspose.finance.ofx/creditcardaccount) 或 [`LoanAccount`](../../aspose.finance.ofx/loanaccount) 的来源。 |
| [LostSynchronization](../../aspose.finance.ofx/abstractsyncresponse/lostsynchronization) { get; set; } | 如果同步请求中的令牌早于服务器历史表中的最早条目，则为 Yes。在这种情况下，某些响应已丢失。如果同步请求中的令牌晚于或等于服务器历史表中的令牌，则为 No。 |
| [OfxExtension](../../aspose.finance.ofx.bank/recurringintrasyncresponse/ofxextension) { get; set; } | 获取或设置 [`OfxExtensionType`](../../aspose.finance.ofx/ofxextensiontype)。 |
| [RecurringIntraTransactionResponses](../../aspose.finance.ofx.bank/recurringintrasyncresponse/recurringintratransactionresponses) { get; set; } | 获取或设置 [`RecurringIntraTransactionResponse`](../recurringintratransactionresponse) 的集合。 |
| [Token](../../aspose.finance.ofx/abstractsyncresponse/token) { get; set; } | 获取或设置新的同步令牌。 |

### 另请参阅

* class [AbstractSyncResponse](../../aspose.finance.ofx/abstractsyncresponse)
* namespace [Aspose.Finance.Ofx.Bank](../../aspose.finance.ofx.bank)
* assembly [Aspose.Finance](../../)

<!-- 请勿编辑：由 xmldocmd 为 Aspose.Finance.dll 生成 -->
