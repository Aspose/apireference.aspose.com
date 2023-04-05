---
title: Class JobPrimaryBannerSheet
second_title: Aspose.Page for .NET API 参考
description: Aspose.Page.XPS.XpsMetadata.JobPrimaryBannerSheet 班级. 描述要为作业输出的标题页标题页应在 default 上输出PageMediaSize并使用默认值PageMediaType.标题页应该 与作业的其余部分隔离开来这意味着任何整理或处理选项如 JobDuplexAllDocumentsContiguouslyJobStapleAllDocuments 或者JobBindAllDocuments  不应包括标题页标题页应作为作业的第一页出现
type: docs
weight: 1470
url: /zh/net/aspose.page.xps.xpsmetadata/jobprimarybannersheet/
---
## JobPrimaryBannerSheet class

描述要为作业输出的标题页。标题页应在 default 上输出[`PageMediaSize`](../pagemediasize/)并使用默认值[`PageMediaType`](../pagemediatype/).标题页应该 与作业的其余部分隔离开来。这意味着任何整理或处理选项（如 [`JobDuplexAllDocumentsContiguously`](../jobduplexalldocumentscontiguously/),[`JobStapleAllDocuments`](../jobstaplealldocuments/)， 或者[`JobBindAllDocuments`](../jobbindalldocuments/) ) 不应包括标题页。标题页应作为作业的第一页出现。

```csharp
public sealed class JobPrimaryBannerSheet : Feature, IJobPrintTicketItem
```

## 构造函数

| 姓名 | 描述 |
| --- | --- |
| [JobPrimaryBannerSheet](jobprimarybannersheet/)(params BannerSheetOption[]) | 创建一个新实例。 |

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
| class [BannerSheetOption](jobprimarybannersheet.bannersheetoption/) | 代表选项`JobPrimaryBannerSheet`特征. |

### 也可以看看

* class [Feature](../feature/)
* interface [IJobPrintTicketItem](../ijobprintticketitem/)
* 命名空间 [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* 部件 [Aspose.Page](../../)


