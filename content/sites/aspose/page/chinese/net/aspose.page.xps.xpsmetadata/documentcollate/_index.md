---
title: Class DocumentCollate
second_title: Aspose.Page for .NET API 参考
description: Aspose.Page.XPS.XpsMetadata.DocumentCollate 班级. 描述输出的整理特性每个文档中的所有页面都会进行整理 DocumentCollate 和 JobCollateAlldocuments 是互斥的 是否同时实现或仅实现这些关键字之一的行为和实现留给驱动程序 https//docs.microsoft.com/enus/windows/win32/printdocs/documentcollate
type: docs
weight: 620
url: /zh/net/aspose.page.xps.xpsmetadata/documentcollate/
---
## DocumentCollate class

描述输出的整理特性。每个文档中的所有页面都会进行整理。 DocumentCollate 和 JobCollateAlldocuments 是互斥的。 是否同时实现或仅实现这些关键字之一的行为和实现留给驱动程序。 https://docs.microsoft.com/en-us/windows/win32/printdocs/documentcollate

```csharp
public sealed class DocumentCollate : Collate, IDocumentPrintTicketItem, IJobPrintTicketItem
```

## 构造函数

| 姓名 | 描述 |
| --- | --- |
| [DocumentCollate](documentcollate/)(params CollateOption[]) |  |

## 特性

| 姓名 | 描述 |
| --- | --- |
| [Name](../../aspose.page.xps.xpsmetadata/printticketelement/name/) { get; } | 获取元素名称。 |

## 方法

| 姓名 | 描述 |
| --- | --- |
| [Add](../../aspose.page.xps.xpsmetadata/feature/add/)(params IFeatureItem[]) | 将项目列表添加到此功能的项目列表的末尾。 每个必须是一个[`Feature`](../feature/)， 一个[`Option`](../option/)或[`Property`](../property/)实例. |

### 也可以看看

* class [Collate](../collate/)
* interface [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* interface [IJobPrintTicketItem](../ijobprintticketitem/)
* 命名空间 [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* 部件 [Aspose.Page](../../)


