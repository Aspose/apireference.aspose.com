---
title: Class DocumentBannerSheet
second_title: Aspose.Page for .NET API 参考
description: Aspose.Page.XPS.XpsMetadata.DocumentBannerSheet 班级. 描述要为特定文档输出的标题页标题页应在 default 上输出PageMediaSize并使用默认值PageMediaType.标题页也应该 与作业的其余部分隔离开来这意味着任何整理或处理选项如 DocumentDuplexDocumentStaple 或者DocumentBinding 不应包括标题页标题页可能会或可能不会与作业的其余部分隔离 这意味着任何作业完成或处理选项都可能包括文档标题页 标题页应作为文档的第一页出现 https //docs.microsoft.com/enus/windows/win32/printdocs/documentbannersheet
type: docs
weight: 530
url: /zh/net/aspose.page.xps.xpsmetadata/documentbannersheet/
---
## DocumentBannerSheet class

描述要为特定文档输出的标题页。标题页应在 default 上输出[`PageMediaSize`](../pagemediasize/)并使用默认值[`PageMediaType`](../pagemediatype/).标题页也应该 与作业的其余部分隔离开来。这意味着任何整理或处理选项（如 [`DocumentDuplex`](../documentduplex/),[`DocumentStaple`](../documentstaple/)， 或者[`DocumentBinding`](../documentbinding/)) 不应包括标题页。标题页可能会或可能不会与作业的其余部分隔离。 这意味着任何作业完成或处理选项都可能包括文档标题页。 标题页应作为文档的第一页出现。 https ://docs.microsoft.com/en-us/windows/win32/printdocs/documentbannersheet

```csharp
public sealed class DocumentBannerSheet : Feature, IDocumentPrintTicketItem, IJobPrintTicketItem
```

## 构造函数

| 姓名 | 描述 |
| --- | --- |
| [DocumentBannerSheet](documentbannersheet/)(params BannerSheetOption[]) | 创建一个新实例。 |

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
| class [BannerSheetOption](documentbannersheet.bannersheetoption/) | 代表选项`DocumentBannerSheet`特征. |

### 也可以看看

* class [Feature](../feature/)
* interface [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* interface [IJobPrintTicketItem](../ijobprintticketitem/)
* 命名空间 [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* 部件 [Aspose.Page](../../)


