---
title: BankMailSyncRequest
second_title: Aspose.Finance 适用于 .NET API 参考
description: 银行邮件同步请求类。
type: docs
weight: 330
url: /zh/net/aspose.finance.ofx.bank/bankmailsyncrequest/
---
## BankMailSyncRequest class

银行邮件同步请求类。

```csharp
public class BankMailSyncRequest : AbstractSyncRequest
```

## 构造函数

| 名称 | 描述 |
| --- | --- |
| [BankMailSyncRequest](bankmailsyncrequest)() | 初始化 [`BankMailSyncRequest`](../bankmailsyncrequest) 类的新实例。 |

## 属性

| 名称 | 描述 |
| --- | --- |
| [AccountFrom](../../aspose.finance.ofx.bank/bankmailsyncrequest/accountfrom) { get; set; } | 获取或设置 [`BankAccount`](../../aspose.finance.ofx/bankaccount) 或 [`CreditCardAccount`](../../aspose.finance.ofx/creditcardaccount) 的来源。 |
| [BankMailTransactionRequests](../../aspose.finance.ofx.bank/bankmailsyncrequest/bankmailtransactionrequests) { get; set; } | 获取或设置 [`BankMailTransactionRequest`](../bankmailtransactionrequest) 的集合。 |
| [IncludeImages](../../aspose.finance.ofx.bank/bankmailsyncrequest/includeimages) { get; set; } | 如果客户端接受邮件正文中的图片，则为 True；如果客户端不接受邮件正文中的图片，则为 False。 |
| [OfxExtension](../../aspose.finance.ofx.bank/bankmailsyncrequest/ofxextension) { get; set; } | 获取或设置 [`OfxExtensionType`](../../aspose.finance.ofx/ofxextensiontype)。 |
| [Refresh](../../aspose.finance.ofx/abstractsyncrequest/refresh) { get; set; } | 获取或设置是否请求刷新当前状态。 |
| [RejectIfMisssing](../../aspose.finance.ofx/abstractsyncrequest/rejectifmisssing) { get; set; } | 如果是，则在客户端令牌过期时不处理请求。 |
| [Token](../../aspose.finance.ofx/abstractsyncrequest/token) { get; set; } | 获取或设置令牌。 |
| [TokenOnly](../../aspose.finance.ofx/abstractsyncrequest/tokenonly) { get; set; } | 获取或设置是否仅请求当前令牌而不包括历史记录。 |
| [UseHtml](../../aspose.finance.ofx.bank/bankmailsyncrequest/usehtml) { get; set; } | 如果客户端想要 HTML 响应则为 True，如果客户端想要纯文本则为 False |

### 另请参阅

* class [AbstractSyncRequest](../../aspose.finance.ofx/abstractsyncrequest)
* namespace [Aspose.Finance.Ofx.Bank](../../aspose.finance.ofx.bank)
* assembly [Aspose.Finance](../../)

<!-- 请勿编辑：由 xmldocmd 为 Aspose.Finance.dll 生成 -->
