---
title: PaymentMailSyncRequest
second_title: Aspose.Finance 适用于 .NET API 参考
description: 付款邮件同步请求类。
type: docs
weight: 1140
url: /zh/net/aspose.finance.ofx.billpay/paymentmailsyncrequest/
---
## PaymentMailSyncRequest class

付款邮件同步请求类。

```csharp
public class PaymentMailSyncRequest : AbstractSyncRequest
```

## 构造函数

| 名称 | 描述 |
| --- | --- |
| [PaymentMailSyncRequest](paymentmailsyncrequest)() | 初始化一个新的 [`PaymentMailSyncRequest`](../paymentmailsyncrequest) 类的实例。 |

## 属性

| 名称 | 描述 |
| --- | --- |
| [IncludeImages](../../aspose.finance.ofx.billpay/paymentmailsyncrequest/includeimages) { get; set; } | 如果客户端接受邮件正文中的图片，则为 True；如果客户端不接受邮件正文中的图片，则为 False。 |
| [OfxExtension](../../aspose.finance.ofx.billpay/paymentmailsyncrequest/ofxextension) { get; set; } | 获取或设置 [`OfxExtensionType`](../../aspose.finance.ofx/ofxextensiontype)。 |
| [PaymentMailTransactionRequests](../../aspose.finance.ofx.billpay/paymentmailsyncrequest/paymentmailtransactionrequests) { get; set; } | 获取或设置 [`PaymentMailTransactionRequest`](../paymentmailtransactionrequest) 的集合。 |
| [Refresh](../../aspose.finance.ofx/abstractsyncrequest/refresh) { get; set; } | 获取或设置是否请求刷新当前状态。 |
| [RejectIfMisssing](../../aspose.finance.ofx/abstractsyncrequest/rejectifmisssing) { get; set; } | 如果是，则在客户端令牌过期时不处理请求。 |
| [Token](../../aspose.finance.ofx/abstractsyncrequest/token) { get; set; } | 获取或设置令牌。 |
| [TokenOnly](../../aspose.finance.ofx/abstractsyncrequest/tokenonly) { get; set; } | 获取或设置是否仅请求当前令牌而不包括历史记录。 |
| [UseHtml](../../aspose.finance.ofx.billpay/paymentmailsyncrequest/usehtml) { get; set; } | 如果客户端想要 HTML 响应，则为 True；如果客户端想要纯文本，则为 false。 |

### 另请参阅

* class [AbstractSyncRequest](../../aspose.finance.ofx/abstractsyncrequest)
* namespace [Aspose.Finance.Ofx.BillPay](../../aspose.finance.ofx.billpay)
* assembly [Aspose.Finance](../../)

<!-- 请勿编辑：由 xmldocmd 为 Aspose.Finance.dll 生成 -->
