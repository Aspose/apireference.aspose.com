---
title: Class DocumentDuplex
second_title: Aspose.Page for .NET API 参考
description: Aspose.Page.XPS.XpsMetadata.DocumentDuplex 班级. 描述了输出的双工特性双面功能允许在介质的两面进行 for 打印每个文档单独双面打印 DocumentDuplex 和 JobDuplexAllDocumentsContiguously 是互斥的 由驱动程序决定这些关键字之间的约束处理 https//docs.microsoft.com/enus/windows/win32/printdocs/ documentduplex
type: docs
weight: 690
url: /zh/net/aspose.page.xps.xpsmetadata/documentduplex/
---
## DocumentDuplex class

描述了输出的双工特性。双面功能允许在介质的两面进行 for 打印。每个文档单独双面打印。 DocumentDuplex 和 JobDuplexAllDocumentsContiguously 是互斥的。 由驱动程序决定这些关键字之间的约束处理。 https://docs.microsoft.com/en-us/windows/win32/printdocs/ documentduplex

```csharp
public sealed class DocumentDuplex : Duplex, IDocumentPrintTicketItem, IJobPrintTicketItem
```

## 构造函数

| 姓名 | 描述 |
| --- | --- |
| [DocumentDuplex](documentduplex/)(params DuplexOption[]) | 创建一个新实例。 |

## 特性

| 姓名 | 描述 |
| --- | --- |
| [Name](../../aspose.page.xps.xpsmetadata/printticketelement/name/) { get; } | 获取元素名称。 |

## 方法

| 姓名 | 描述 |
| --- | --- |
| [Add](../../aspose.page.xps.xpsmetadata/feature/add/)(params IFeatureItem[]) | 将项目列表添加到此功能的项目列表的末尾。 每个必须是一个[`Feature`](../feature/)， 一个[`Option`](../option/)或[`Property`](../property/)实例. |

### 也可以看看

* class [Duplex](../duplex/)
* interface [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* interface [IJobPrintTicketItem](../ijobprintticketitem/)
* 命名空间 [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* 部件 [Aspose.Page](../../)


