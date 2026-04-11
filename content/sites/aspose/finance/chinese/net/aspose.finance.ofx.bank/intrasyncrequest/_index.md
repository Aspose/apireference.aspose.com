---
title: IntraSyncRequest
second_title: Aspose.Finance 适用于 .NET API 参考
description: 内部银行交易同步请求类。
type: docs
weight: 490
url: /zh/net/aspose.finance.ofx.bank/intrasyncrequest/
---
## IntraSyncRequest class

内部银行交易同步请求类。

```csharp
public class IntraSyncRequest : AbstractSyncRequest
```

## 构造函数

| 名称 | 描述 |
| --- | --- |
| [IntraSyncRequest](intrasyncrequest)() | 初始化 [`IntraSyncRequest`](../intrasyncrequest) 类的新实例。 |

## 属性

| 名称 | 描述 |
| --- | --- |
| [AccountFrom](../../aspose.finance.ofx.bank/intrasyncrequest/accountfrom) { get; set; } | 获取或设置 [`BankAccount`](../../aspose.finance.ofx/bankaccount) 或 [`CreditCardAccount`](../../aspose.finance.ofx/creditcardaccount) 或 [`LoanAccount`](../../aspose.finance.ofx/loanaccount) 的来源。 |
| [IntraTransactionRequests](../../aspose.finance.ofx.bank/intrasyncrequest/intratransactionrequests) { get; set; } | 获取或设置 [`IntraTransactionRequest`](../intratransactionrequest) 的集合。 |
| [OfxExtension](../../aspose.finance.ofx.bank/intrasyncrequest/ofxextension) { get; set; } | 获取或设置 [`OfxExtensionType`](../../aspose.finance.ofx/ofxextensiontype)。 |
| [Refresh](../../aspose.finance.ofx/abstractsyncrequest/refresh) { get; set; } | 获取或设置是否请求刷新当前状态。 |
| [RejectIfMisssing](../../aspose.finance.ofx/abstractsyncrequest/rejectifmisssing) { get; set; } | 如果是，则在客户端令牌过期时不处理请求。 |
| [Token](../../aspose.finance.ofx/abstractsyncrequest/token) { get; set; } | 获取或设置令牌。 |
| [TokenOnly](../../aspose.finance.ofx/abstractsyncrequest/tokenonly) { get; set; } | 获取或设置是否仅请求当前令牌而不包括历史记录。 |

### 另请参阅

* class [AbstractSyncRequest](../../aspose.finance.ofx/abstractsyncrequest)
* namespace [Aspose.Finance.Ofx.Bank](../../aspose.finance.ofx.bank)
* assembly [Aspose.Finance](../../)

<!-- 请勿编辑：由 xmldocmd 为 Aspose.Finance.dll 生成 -->
