---
title: Class DocumentInputBin
second_title: Aspose.Page for .NET API 参考
description: Aspose.Page.XPS.XpsMetadata.DocumentInputBin 班级. 描述设备中安装的输入箱或设备支持的箱的完整列表 JobInputBinDocumentInputBin  和PageInputBin 关键字是互斥的不应在 PrintTicket 或 Print Capabilities 文档中同时指定两者 https//docs.microsoft.com/enus/windows/win32/printdocs/documentinputbin
type: docs
weight: 740
url: /zh/net/aspose.page.xps.xpsmetadata/documentinputbin/
---
## DocumentInputBin class

描述设备中安装的输入箱或设备支持的箱的完整列表。 [`JobInputBin`](../jobinputbin/),`DocumentInputBin` ， 和[`PageInputBin`](../pageinputbin/) 关键字是互斥的。不应在 PrintTicket 或 Print Capabilities 文档中同时指定两者。 https://docs.microsoft.com/en-us/windows/win32/printdocs/documentinputbin

```csharp
public sealed class DocumentInputBin : InputBin, IDocumentPrintTicketItem, IJobPrintTicketItem
```

## 构造函数

| 姓名 | 描述 |
| --- | --- |
| [DocumentInputBin](documentinputbin/)(params IInputBinItem[]) | 创建一个新实例。 |

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
* 命名空间 [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* 部件 [Aspose.Page](../../)


