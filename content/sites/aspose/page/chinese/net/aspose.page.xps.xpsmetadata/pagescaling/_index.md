---
title: Class PageScaling
second_title: Aspose.Page for .NET API 参考
description: Aspose.Page.XPS.XpsMetadata.PageScaling 班级. 描述输出的缩放特性 https//docs.microsoft.com/enus/windows/win32/printdocs/pagescaling
type: docs
weight: 2480
url: /zh/net/aspose.page.xps.xpsmetadata/pagescaling/
---
## PageScaling class

描述输出的缩放特性。 https://docs.microsoft.com/en-us/windows/win32/printdocs/pagescaling

```csharp
public sealed class PageScaling : Feature, IDocumentPrintTicketItem, IJobPrintTicketItem, 
    IPagePrintTicketItem
```

## 构造函数

| 姓名 | 描述 |
| --- | --- |
| [PageScaling](pagescaling/)(params IPageScalingItem[]) | 创建一个新实例。 |

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
| interface [IPageScalingItem](pagescaling.ipagescalingitem/) | 任何接口`PageScaling`特色项目. |
| class [PageScalingOption](pagescaling.pagescalingoption/) | 描述了`PageScaling`功能选项. |
| class [ScaleOffsetAlignment](pagescaling.scaleoffsetalignment/) | 描述内部特征. |
| class [ScaleOffsetAlignmentOption](pagescaling.scaleoffsetalignmentoption/) | 描述了[`ScaleOffsetAlignment`](../pagescaling.scaleoffsetalignment/) features options. 指定缩放内容的对齐方式。 |

### 也可以看看

* class [Feature](../feature/)
* interface [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* interface [IJobPrintTicketItem](../ijobprintticketitem/)
* interface [IPagePrintTicketItem](../ipageprintticketitem/)
* 命名空间 [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* 部件 [Aspose.Page](../../)


