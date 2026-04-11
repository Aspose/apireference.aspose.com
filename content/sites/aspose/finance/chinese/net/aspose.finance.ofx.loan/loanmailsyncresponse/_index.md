---
title: LoanMailSyncResponse
second_title: Aspose.Finance 适用于 .NET API 参考
description: 贷款邮件同步响应类。
type: docs
weight: 3890
url: /zh/net/aspose.finance.ofx.loan/loanmailsyncresponse/
---
## LoanMailSyncResponse class

贷款邮件同步响应类。

```csharp
public class LoanMailSyncResponse : AbstractSyncResponse
```

## 构造函数

| 名称 | 描述 |
| --- | --- |
| [LoanMailSyncResponse](loanmailsyncresponse)() | 初始化一个新的实例 [`LoanMailSyncResponse`](../loanmailsyncresponse) 类。 |

## 属性

| 名称 | 描述 |
| --- | --- |
| [LoanAccountFrom](../../aspose.finance.ofx.loan/loanmailsyncresponse/loanaccountfrom) { get; set; } | 获取或设置 [`LoanAccount`](../../aspose.finance.ofx/loanaccount) 的来源。 |
| [LoanMailTransactionResponses](../../aspose.finance.ofx.loan/loanmailsyncresponse/loanmailtransactionresponses) { get; set; } | 获取或设置 [`LoanMailTransactionResponse`](../loanmailtransactionresponse) 的集合。 |
| [LostSynchronization](../../aspose.finance.ofx/abstractsyncresponse/lostsynchronization) { get; set; } | 如果同步请求中的令牌早于服务器历史表中的最早条目，则为 Yes。在这种情况下，某些响应已丢失。如果同步请求中的令牌晚于或等于服务器历史表中的令牌，则为 No。 |
| [OfxExtension](../../aspose.finance.ofx.loan/loanmailsyncresponse/ofxextension) { get; set; } | 获取或设置 [`OfxExtensionType`](../../aspose.finance.ofx/ofxextensiontype)。 |
| [Token](../../aspose.finance.ofx/abstractsyncresponse/token) { get; set; } | 获取或设置新的同步令牌。 |

### 另请参阅

* class [AbstractSyncResponse](../../aspose.finance.ofx/abstractsyncresponse)
* namespace [Aspose.Finance.Ofx.Loan](../../aspose.finance.ofx.loan)
* assembly [Aspose.Finance](../../)

<!-- 请勿编辑：由 xmldocmd 为 Aspose.Finance.dll 生成 -->
