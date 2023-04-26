---
title: Class PageWatermark
second_title: Aspose.Page for .NET API 参考
description: Aspose.Page.XPS.XpsMetadata.PageWatermark 班级. 描述输出的水印设置和水印特征水印 apply 到逻辑页面而不是物理页面例如如果DocumentDuplex已启用 水印将出现在每个每张纸上的页面如果DocumentDuplex 2则每张纸会有2个水印 https//docs.microsoft.com/enus/windows/win32/printdocs/pagewatermark
type: docs
weight: 2650
url: /zh/net/aspose.page.xps.xpsmetadata/pagewatermark/
---
## PageWatermark class

描述输出的水印设置和水印特征。水印 apply 到逻辑页面，而不是物理页面。例如，如果[`DocumentDuplex`](../documentduplex/)已启用， 水印将出现在每个每张纸上的页面。如果[`DocumentDuplex`](../documentduplex/), =2，则每张纸会有2个水印。 https://docs.microsoft.com/en-us/windows/win32/printdocs/pagewatermark

```csharp
NUp
```

```csharp
PagesPerSheet
```

```csharp
public sealed class PageWatermark : Feature, IDocumentPrintTicketItem, IJobPrintTicketItem, 
    IPagePrintTicketItem
```

## 构造函数

| 姓名 | 描述 |
| --- | --- |
| [PageWatermark](pagewatermark/)(params IPageWatermarkItem[]) | 创建一个新实例。 |

## 特性

| 姓名 | 描述 |
| --- | --- |
| [Name](../../aspose.page.xps.xpsmetadata/printticketelement/name/) { get; } | 获取元素名称。 |

## 方法

| 姓名 | 描述 |
| --- | --- |
| [Add](../../aspose.page.xps.xpsmetadata/feature/add/)(params IFeatureItem[]) | 将项目列表添加到此功能的项目列表的末尾。 每个必须是一个[`Feature`](../feature/)， 一个[`Option`](../option/)或[`Property`](../property/)实例. |

## 其他成员

| 姓名 | 描述 |
| --- | --- |
| interface [IPageWatermarkItem](pagewatermark.ipagewatermarkitem/) | 任何接口`PageWatermark`特色项目. |
| interface [IPageWatermarkOptionItem](pagewatermark.ipagewatermarkoptionitem/) | 任何接口[`PageWatermarkOption`](../pagewatermark.pagewatermarkoption/)项目. |
| class [Layering](pagewatermark.layering/) | 描述内部特征。定义水印的分层行为。 |
| class [LayeringOption](pagewatermark.layeringoption/) | 描述了[`Layering`](../pagewatermark.layering/)功能选项. |
| class [PageWatermarkOption](pagewatermark.pagewatermarkoption/) | 描述了`PageWatermark`功能选项. |

### 也可以看看

* class [Feature](../feature/)
* interface [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* interface [IJobPrintTicketItem](../ijobprintticketitem/)
* interface [IPagePrintTicketItem](../ipageprintticketitem/)
* 命名空间 [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* 部件 [Aspose.Page](../../)


