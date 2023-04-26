---
title: Class PageOutputBin
second_title: Aspose.Page for .NET API 参考
description: Aspose.Page.XPS.XpsMetadata.PageOutputBin 班级. 描述设备支持的 bin 的完整列表允许在每页的基础上指定出纸槽 JobOutputBinDocumentOutputBin和PageOutputBin关键字是 互斥的在 PrintTicket 或 Print Capabilities 文档中只应指定一个 https//docs.microsoft.com/enus/windows/win32/printdocs/pageoutputbin
type: docs
weight: 2330
url: /zh/net/aspose.page.xps.xpsmetadata/pageoutputbin/
---
## PageOutputBin class

描述设备支持的 bin 的完整列表。允许在每页的基础上指定出纸槽。 [`JobOutputBin`](../joboutputbin/),[`DocumentOutputBin`](../documentoutputbin/)和`PageOutputBin`关键字是 互斥的，在 PrintTicket 或 Print Capabilities 文档中只应指定一个。 https://docs.microsoft.com/en-us/windows/win32/printdocs/pageoutputbin

```csharp
public sealed class PageOutputBin : OutputBin, IDocumentPrintTicketItem, IJobPrintTicketItem, 
    IPagePrintTicketItem
```

## 构造函数

| 姓名 | 描述 |
| --- | --- |
| [PageOutputBin](pageoutputbin/)(params IOutputBinItem[]) | 创建一个新实例。 |

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
* interface [IPagePrintTicketItem](../ipageprintticketitem/)
* 命名空间 [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* 部件 [Aspose.Page](../../)


