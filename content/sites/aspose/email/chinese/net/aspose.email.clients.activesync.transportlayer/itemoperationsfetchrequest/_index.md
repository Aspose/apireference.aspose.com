---
title: ItemOperationsFetchRequest
second_title: Aspose.Email for .NET API 参考
description: 包含有关从服务器检索项目的请求
type: docs
weight: 1420
url: /zh/net/aspose.email.clients.activesync.transportlayer/itemoperationsfetchrequest/
---
## ItemOperationsFetchRequest class

包含有关从服务器检索项目的请求。

```csharp
public class ItemOperationsFetchRequest
```

## 构造函数

| 姓名 | 描述 |
| --- | --- |
| [ItemOperationsFetchRequest](itemoperationsfetchrequest)() | 默认构造函数。 |

## 特性

| 姓名 | 描述 |
| --- | --- |
| [CollectionId](../../aspose.email.clients.activesync.transportlayer/itemoperationsfetchrequest/collectionid) { get; set; } | 标识已提取的文件夹。 |
| [FileReference](../../aspose.email.clients.activesync.transportlayer/itemoperationsfetchrequest/filereference) { get; set; } | 指定服务器分配给每个附件的唯一标识符。 在 ItemOperations 请求中，每个 Fetch 只能存在一个 FileReference 标识符。 违反此约束会导致从服务器返回状态元素值 2。 但是，客户端可以通过每个附件使用一个 Fetch 节点来检索多个附件。 |
| [LinkId](../../aspose.email.clients.activesync.transportlayer/itemoperationsfetchrequest/linkid) { get; set; } | 指定服务器分配给特定资源的统一资源标识符 (URI)，例如 Windows SharePoint Services 或 UNC 文档。 LinkId 可用于引用项目的位置。 |
| [LongId](../../aspose.email.clients.activesync.transportlayer/itemoperationsfetchrequest/longid) { get; set; } | 指定服务器为先前搜索响应返回的每个结果分配的唯一标识符。 LongId 值的长度最多为 256 个字符。 |
| [Options](../../aspose.email.clients.activesync.transportlayer/itemoperationsfetchrequest/options) { get; set; } | 包含 ItemOperations.Fetch 操作的选项。 |
| [RemoveRightsManagementProtection](../../aspose.email.clients.activesync.transportlayer/itemoperationsfetchrequest/removerightsmanagementprotection) { get; set; } | 如果存在或为真，则表示客户端正在从电子邮件中删除 IRM 保护。 只有在 ExportAllowed 元素设置为 TRUE 时，才能从电子邮件中删除 IRM 保护。 |
| [ServerId](../../aspose.email.clients.activesync.transportlayer/itemoperationsfetchrequest/serverid) { get; set; } | 指定服务器分配给每个应用了项目操作的对象的唯一标识符。 |
| [Store](../../aspose.email.clients.activesync.transportlayer/itemoperationsfetchrequest/store) { get; set; } | 指定应用父操作的商店的名称。 以下值对 Store 元素有效： - 文档库（Microsoft SharePoint Server 和 UNC 链接） - 邮箱（项目和附件） |

### 也可以看看

* 命名空间 [Aspose.Email.Clients.ActiveSync.TransportLayer](../../aspose.email.clients.activesync.transportlayer)
* 部件 [Aspose.Email](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Email.dll -->
