---
title: Class JobErrorSheet
second_title: Aspose.Page for .NET API 参考
description: Aspose.Page.XPS.XpsMetadata.JobErrorSheet 班级. 描述错误表输出整个作业将有一个错误表 error sheet 应该在默认输出PageMediaSize并使用默认值PageMediaType. 错误表应该与作业的其余部分分开这意味着任何整理 or 处理选项例如 或者 不应包含错误表错误表应作为作业的最后一张出现 https//docs.microsoft.com/enus/windows/win32/printdocs/joberrorsheet
type: docs
weight: 1290
url: /zh/net/aspose.page.xps.xpsmetadata/joberrorsheet/
---
## JobErrorSheet class

描述错误表输出。整个作业将有一个错误表。 error sheet 应该在默认输出[`PageMediaSize`](../pagemediasize/)并使用默认值[`PageMediaType`](../pagemediatype/). 错误表应该与作业的其余部分分开。这意味着任何整理 or 处理选项（例如,， 或者) 不应包含错误表。错误表应作为作业的最后一张出现。 https://docs.microsoft.com/en-us/windows/win32/printdocs/joberrorsheet

```csharp
JobDuplex
```

```csharp
JobStaple
```

```csharp
JobBinding
```

```csharp
public sealed class JobErrorSheet : Feature, IJobPrintTicketItem
```

## 构造函数

| 姓名 | 描述 |
| --- | --- |
| [JobErrorSheet](joberrorsheet/)(params IJobErrorSheetItem[]) | 创建一个新实例。 |

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
| class [ErrorSheetOption](joberrorsheet.errorsheetoption/) | 描述了`JobErrorSheet`功能选项. |
| class [ErrorSheetWhen](joberrorsheet.errorsheetwhen/) | 描述内部特征. |
| interface [IJobErrorSheetItem](joberrorsheet.ijoberrorsheetitem/) | 任何接口`JobErrorSheet`特色项目. |

### 也可以看看

* class [Feature](../feature/)
* interface [IJobPrintTicketItem](../ijobprintticketitem/)
* 命名空间 [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* 部件 [Aspose.Page](../../)


