---
title: WireSyncResponse
second_title: Aspose.Finance 适用于 .NET API 参考
description: 电汇事务同步响应类。
type: docs
weight: 6440
url: /zh/net/aspose.finance.ofx.wiretransfer/wiresyncresponse/
---
## WireSyncResponse class

电汇事务同步响应类。

```csharp
public class WireSyncResponse : AbstractSyncResponse
```

## 构造函数

| 名称 | 描述 |
| --- | --- |
| [WireSyncResponse](wiresyncresponse)() | 初始化一个新的 [`WireSyncResponse`](../wiresyncresponse) 类实例。 |

## 属性

| 名称 | 描述 |
| --- | --- |
| [BankAccountFrom](../../aspose.finance.ofx.wiretransfer/wiresyncresponse/bankaccountfrom) { get; set; } | 获取或设置 [`BankAccount`](../../aspose.finance.ofx/bankaccount) 的来源。 |
| [LostSynchronization](../../aspose.finance.ofx/abstractsyncresponse/lostsynchronization) { get; set; } | 如果同步请求中的令牌早于服务器历史表中的最早条目，则为 Yes。在这种情况下，某些响应已丢失。如果同步请求中的令牌晚于或等于服务器历史表中的令牌，则为 No。 |
| [OfxExtension](../../aspose.finance.ofx.wiretransfer/wiresyncresponse/ofxextension) { get; set; } | 获取或设置 [`OfxExtensionType`](../../aspose.finance.ofx/ofxextensiontype)。 |
| [Token](../../aspose.finance.ofx/abstractsyncresponse/token) { get; set; } | 获取或设置新的同步令牌。 |
| [WireTransactionResponses](../../aspose.finance.ofx.wiretransfer/wiresyncresponse/wiretransactionresponses) { get; set; } | 获取或设置 [`WireTransactionResponse`](../wiretransactionresponse) 的集合。 |

### 另请参阅

* class [AbstractSyncResponse](../../aspose.finance.ofx/abstractsyncresponse)
* namespace [Aspose.Finance.Ofx.WireTransfer](../../aspose.finance.ofx.wiretransfer)
* assembly [Aspose.Finance](../../)

<!-- 请勿编辑：由 xmldocmd 为 Aspose.Finance.dll 生成 -->
