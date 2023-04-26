---
title: Class DocumentOutputBin
second_title: Aspose.Page for .NET API 参考
description: Aspose.Page.XPS.XpsMetadata.DocumentOutputBin 班级. 描述设备支持的 bin 的完整列表允许在每个文档的基础上指定 output bin这JobOutputBinDocumentOutputBinand PageOutputBin关键字是互斥的只有一个应该在 PrintTicket 或 Print Capabilities 文档中指定 https//docs.microsoft.com/enus/windows/win32/printdocs/documentoutputbin
type: docs
weight: 770
url: /zh/net/aspose.page.xps.xpsmetadata/documentoutputbin/
---
## DocumentOutputBin class

描述设备支持的 bin 的完整列表。允许在每个文档的基础上指定 output bin。这[`JobOutputBin`](../joboutputbin/),`DocumentOutputBin`and [`PageOutputBin`](../pageoutputbin/)关键字是互斥的，只有一个应该在 PrintTicket 或 Print Capabilities 文档中指定。 https://docs.microsoft.com/en-us/windows/win32/printdocs/documentoutputbin

```csharp
public sealed class DocumentOutputBin : OutputBin, IDocumentPrintTicketItem, IJobPrintTicketItem
```

## 构造函数

| 姓名 | 描述 |
| --- | --- |
| [DocumentOutputBin](documentoutputbin/)(params IOutputBinItem[]) | 创建一个新实例。 |

## 特性

| 姓名 | 描述 |
| --- | --- |
| [Name](../../aspose.page.xps.xpsmetadata/printticketelement/name/) { get; } | 获取元素名称。 |

## 方法

| 姓名 | 描述 |
| --- | --- |
| [Add](../../aspose.page.xps.xpsmetadata/feature/add/)(params IFeatureItem[]) | 将项目列表添加到此功能的项目列表的末尾。 每个必须是一个[`Feature`](../feature/)， 一个[`Option`](../option/)或[`Property`](../property/)实例. |

### 也可以看看

* class [OutputBin](../outputbin/)
* interface [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* interface [IJobPrintTicketItem](../ijobprintticketitem/)
* 命名空间 [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* 部件 [Aspose.Page](../../)


