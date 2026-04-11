---
title: AbstractSyncResponse
second_title: Aspose.Finance 适用于 .NET API 参考
description: 所有同步响应相关类的抽象基类
type: docs
weight: 110
url: /zh/net/aspose.finance.ofx/abstractsyncresponse/
---
## AbstractSyncResponse class

所有同步响应相关类的抽象基类

```csharp
public class AbstractSyncResponse : AbstractResponse
```

## 属性

| 名称 | 描述 |
| --- | --- |
| [LostSynchronization](../../aspose.finance.ofx/abstractsyncresponse/lostsynchronization) { get; set; } | 如果同步请求中的令牌早于服务器历史表中的最早条目，则为 Yes。在这种情况下，某些响应已丢失。如果同步请求中的令牌晚于或等于服务器历史表中的令牌，则为 No。 |
| [Token](../../aspose.finance.ofx/abstractsyncresponse/token) { get; set; } | 获取或设置新的同步令牌。 |

### 另请参阅

* class [AbstractResponse](../abstractresponse)
* namespace [Aspose.Finance.Ofx](../../aspose.finance.ofx)
* assembly [Aspose.Finance](../../)

<!-- 请勿编辑：由 xmldocmd 为 Aspose.Finance.dll 生成 -->
