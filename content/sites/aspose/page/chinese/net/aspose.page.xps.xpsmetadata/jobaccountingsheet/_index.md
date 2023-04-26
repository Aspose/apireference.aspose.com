---
title: Class JobAccountingSheet
second_title: Aspose.Page for .NET API 参考
description: Aspose.Page.XPS.XpsMetadata.JobAccountingSheet 班级. 描述要为作业输出的会计表核算表应该输出到 default PageMediaSize并使用默认值PageMediaType .会计表应该与工作的其余部分隔离开来这意味着任何整理或处理选项例如  或者  不应包括会计表 会计表可能会出现在作业的第一页或最后一页由实施者自行决定 https//docs.microsoft.com/enus/windows/win32/printdocs/jobaccountingsheet
type: docs
weight: 1140
url: /zh/net/aspose.page.xps.xpsmetadata/jobaccountingsheet/
---
## JobAccountingSheet class

描述要为作业输出的会计表。核算表应该输出到 default [`PageMediaSize`](../pagemediasize/)并使用默认值[`PageMediaType`](../pagemediatype/) .会计表应该与工作的其余部分隔离开来。这意味着任何整理或处理选项（例如 ,， 或者 ) 不应包括会计表。 会计表可能会出现在作业的第一页或最后一页，由实施者自行决定。 https://docs.microsoft.com/en-us/windows/win32/printdocs/jobaccountingsheet

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
public sealed class JobAccountingSheet : Feature, IJobPrintTicketItem
```

## 构造函数

| 姓名 | 描述 |
| --- | --- |
| [JobAccountingSheet](jobaccountingsheet/)(params JobAccountingSheetOption[]) | 创建一个新实例。 |

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
| class [JobAccountingSheetOption](jobaccountingsheet.jobaccountingsheetoption/) | 描述了`JobAccountingSheet`功能选项. |

### 也可以看看

* class [Feature](../feature/)
* interface [IJobPrintTicketItem](../ijobprintticketitem/)
* 命名空间 [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* 部件 [Aspose.Page](../../)


