---
title: RecurringIntraSyncRequest
second_title: Aspose.Finance 适用于 .NET API 参考
description: 循环内部银行交易同步请求类。
type: docs
weight: 590
url: /zh/net/aspose.finance.ofx.bank/recurringintrasyncrequest/
---
## RecurringIntraSyncRequest class

循环内部银行交易同步请求类。

```csharp
public class RecurringIntraSyncRequest : AbstractSyncRequest
```

## 构造函数

| 名称 | 描述 |
| --- | --- |
| [RecurringIntraSyncRequest](recurringintrasyncrequest)() | 初始化 [`RecurringIntraSyncRequest`](../recurringintrasyncrequest) 类的新实例。 |

## 属性

| 名称 | 描述 |
| --- | --- |
| [AccountFrom](../../aspose.finance.ofx.bank/recurringintrasyncrequest/accountfrom) { get; set; } | 获取或设置 [`BankAccount`](../../aspose.finance.ofx/bankaccount) 或 [`CreditCardAccount`](../../aspose.finance.ofx/creditcardaccount) 或 [`LoanAccount`](../../aspose.finance.ofx/loanaccount) 的来源。 |
| [OfxExtension](../../aspose.finance.ofx.bank/recurringintrasyncrequest/ofxextension) { get; set; } | 获取或设置 [`OfxExtensionType`](../../aspose.finance.ofx/ofxextensiontype)。 |
| [RecurringIntraTransactionRequests](../../aspose.finance.ofx.bank/recurringintrasyncrequest/recurringintratransactionrequests) { get; set; } | 获取或设置 [`RecurringIntraTransactionRequest`](../recurringintratransactionrequest) 的集合。 |
| [Refresh](../../aspose.finance.ofx/abstractsyncrequest/refresh) { get; set; } | 获取或设置是否请求刷新当前状态。 |
| [RejectIfMisssing](../../aspose.finance.ofx/abstractsyncrequest/rejectifmisssing) { get; set; } | 如果是，则在客户端令牌过期时不处理请求。 |
| [Token](../../aspose.finance.ofx/abstractsyncrequest/token) { get; set; } | 获取或设置令牌。 |
| [TokenOnly](../../aspose.finance.ofx/abstractsyncrequest/tokenonly) { get; set; } | 获取或设置是否仅请求当前令牌而不包括历史记录。 |

### 另请参阅

* class [AbstractSyncRequest](../../aspose.finance.ofx/abstractsyncrequest)
* namespace [Aspose.Finance.Ofx.Bank](../../aspose.finance.ofx.bank)
* assembly [Aspose.Finance](../../)

<!-- 请勿编辑：由 xmldocmd 为 Aspose.Finance.dll 生成 -->
