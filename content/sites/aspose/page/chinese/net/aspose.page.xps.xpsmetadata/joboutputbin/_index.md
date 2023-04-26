---
title: Class JobOutputBin
second_title: Aspose.Page for .NET API 参考
description: Aspose.Page.XPS.XpsMetadata.JobOutputBin 班级. 描述设备中安装的出纸槽或设备支持的出纸槽的完整列表 JobOutputBinDocumentOutputBin和PageOutputBin keywords 是互斥的只有一个应该在 PrintTicket 或 Print Capabilities 文档中指定 https//docs.microsoft.com/enus/windows/win32/printdocs/joboutputbin
type: docs
weight: 1430
url: /zh/net/aspose.page.xps.xpsmetadata/joboutputbin/
---
## JobOutputBin class

描述设备中安装的出纸槽或设备支持的出纸槽的完整列表。 `JobOutputBin`,[`DocumentOutputBin`](../documentoutputbin/)和[`PageOutputBin`](../pageoutputbin/) keywords 是互斥的，只有一个应该在 PrintTicket 或 Print Capabilities 文档中指定。 https://docs.microsoft.com/en-us/windows/win32/printdocs/joboutputbin

```csharp
public sealed class JobOutputBin : OutputBin, IJobPrintTicketItem
```

## 构造函数

| 姓名 | 描述 |
| --- | --- |
| [JobOutputBin](joboutputbin/)(params IOutputBinItem[]) | 创建一个新实例。 |

## 特性

| 姓名 | 描述 |
| --- | --- |
| [Name](../../aspose.page.xps.xpsmetadata/printticketelement/name/) { get; } | 获取元素名称。 |

## 方法

| 姓名 | 描述 |
| --- | --- |
| [Add](../../aspose.page.xps.xpsmetadata/feature/add/)(params IFeatureItem[]) | 将项目列表添加到此功能的项目列表的末尾。 每个必须是一个[`Feature`](../feature/)， 一个[`Option`](../option/)或[`Property`](../property/)实例. |

### 也可以看看

* class [OutputBin](../outputbin/)
* interface [IJobPrintTicketItem](../ijobprintticketitem/)
* 命名空间 [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* 部件 [Aspose.Page](../../)


