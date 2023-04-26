---
title: Class DocumentNUp
second_title: Aspose.Page for .NET API 参考
description: Aspose.Page.XPS.XpsMetadata.DocumentNUp 班级. 描述了多个逻辑页面到单个物理表的输出和格式 每个文件都是单独编译的和JobNUpAllDocumentsContiguously 是互斥的由驱动程序决定这些关键字之间的约束处理 https//docs.microsoft.com/enus/windows/win32/printdocs/documentnup
type: docs
weight: 750
url: /zh/net/aspose.page.xps.xpsmetadata/documentnup/
---
## DocumentNUp class

描述了多个逻辑页面到单个物理表的输出和格式。 每个文件都是单独编译的。和[`JobNUpAllDocumentsContiguously`](../jobnupalldocumentscontiguously/) 是互斥的。由驱动程序决定这些关键字之间的约束处理。 https://docs.microsoft.com/en-us/windows/win32/printdocs/documentnup

```csharp
DocumentNUp
```

```csharp
public sealed class DocumentNUp : NUp, IDocumentPrintTicketItem, IJobPrintTicketItem
```

## 构造函数

| 姓名 | 描述 |
| --- | --- |
| [DocumentNUp](documentnup/)(params INUpItem[]) | 创建一个新实例。 |

## 特性

| 姓名 | 描述 |
| --- | --- |
| [Name](../../aspose.page.xps.xpsmetadata/printticketelement/name/) { get; } | 获取元素名称。 |

## 方法

| 姓名 | 描述 |
| --- | --- |
| [Add](../../aspose.page.xps.xpsmetadata/feature/add/)(params IFeatureItem[]) | 将项目列表添加到此功能的项目列表的末尾。 每个必须是一个[`Feature`](../feature/)， 一个[`Option`](../option/)或[`Property`](../property/)实例. |
| [AddPagesPerSheetOption](../../aspose.page.xps.xpsmetadata/documentnup/addpagespersheetoption/)(int) | 添加和选项scored 属性值。 指定每个物理工作表的逻辑页数。 |

### 也可以看看

* class [NUp](../nup/)
* interface [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* interface [IJobPrintTicketItem](../ijobprintticketitem/)
* 命名空间 [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* 部件 [Aspose.Page](../../)


