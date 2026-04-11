---
title: ChangeUserInfoSyncResponse
second_title: Aspose.Finance 适用于 .NET API 参考
description: 更改用户信息同步响应类。
type: docs
weight: 5600
url: /zh/net/aspose.finance.ofx.signup/changeuserinfosyncresponse/
---
## ChangeUserInfoSyncResponse class

更改用户信息同步响应类。

```csharp
public class ChangeUserInfoSyncResponse : AbstractSyncResponse
```

## 构造函数

| 名称 | 描述 |
| --- | --- |
| [ChangeUserInfoSyncResponse](changeuserinfosyncresponse)() | 初始化 [`ChangeUserInfoSyncResponse`](../changeuserinfosyncresponse) 类的新实例。 |

## 属性

| 名称 | 描述 |
| --- | --- |
| [ChangeUserInfoTransactionResponses](../../aspose.finance.ofx.signup/changeuserinfosyncresponse/changeuserinfotransactionresponses) { get; set; } | 获取或设置 [`ChangeUserInfoTransactionResponse`](../changeuserinfotransactionresponse) 的集合。 |
| [LostSynchronization](../../aspose.finance.ofx/abstractsyncresponse/lostsynchronization) { get; set; } | 如果同步请求中的令牌早于服务器历史表中的最早条目，则为 Yes。在这种情况下，某些响应已丢失。如果同步请求中的令牌晚于或等于服务器历史表中的令牌，则为 No。 |
| [OfxExtension](../../aspose.finance.ofx.signup/changeuserinfosyncresponse/ofxextension) { get; set; } | 获取或设置 [`OfxExtensionType`](../../aspose.finance.ofx/ofxextensiontype)。 |
| [Token](../../aspose.finance.ofx/abstractsyncresponse/token) { get; set; } | 获取或设置新的同步令牌。 |

### 另请参阅

* class [AbstractSyncResponse](../../aspose.finance.ofx/abstractsyncresponse)
* namespace [Aspose.Finance.Ofx.Signup](../../aspose.finance.ofx.signup)
* assembly [Aspose.Finance](../../)

<!-- 请勿编辑：由 xmldocmd 为 Aspose.Finance.dll 生成 -->
