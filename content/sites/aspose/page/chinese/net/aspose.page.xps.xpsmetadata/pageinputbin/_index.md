---
title: Class PageInputBin
second_title: Aspose.Page for .NET API 参考
description: Aspose.Page.XPS.XpsMetadata.PageInputBin 班级. 描述设备中已安装的输入盒或设备支持的输入盒的完整列表 允许在每页的基础上指定输入盒这JobInputBinDocumentInputBinand PageInputBin关键字是互斥的不应在 PrintTicket 或 Print Capabilities 文档中同时指定两者  https//docs.microsoft.com/enus/windows/win32/printdocs/pageinputbin
type: docs
weight: 2020
url: /zh/net/aspose.page.xps.xpsmetadata/pageinputbin/
---
## PageInputBin class

描述设备中已安装的输入盒或设备支持的输入盒的完整列表。 允许在每页的基础上指定输入盒。这[`JobInputBin`](../jobinputbin/),[`DocumentInputBin`](../documentinputbin/)and `PageInputBin`关键字是互斥的。不应在 PrintTicket 或 Print Capabilities 文档中同时指定两者 。 https://docs.microsoft.com/en-us/windows/win32/printdocs/pageinputbin

```csharp
public sealed class PageInputBin : InputBin, IDocumentPrintTicketItem, IJobPrintTicketItem, 
    IPagePrintTicketItem
```

## 构造函数

| 姓名 | 描述 |
| --- | --- |
| [PageInputBin](pageinputbin/)(params IInputBinItem[]) | 创建一个新实例。 |

## 特性

| 姓名 | 描述 |
| --- | --- |
| [Name](../../aspose.page.xps.xpsmetadata/printticketelement/name/) { get; } | 获取元素名称。 |

## 方法

| 姓名 | 描述 |
| --- | --- |
| [Add](../../aspose.page.xps.xpsmetadata/feature/add/)(params IFeatureItem[]) | 将项目列表添加到此功能的项目列表的末尾。 每个必须是一个[`Feature`](../feature/)， 一个[`Option`](../option/)或[`Property`](../property/)实例. |

### 也可以看看

* class [InputBin](../inputbin/)
* interface [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* interface [IJobPrintTicketItem](../ijobprintticketitem/)
* interface [IPagePrintTicketItem](../ipageprintticketitem/)
* 命名空间 [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* 部件 [Aspose.Page](../../)


