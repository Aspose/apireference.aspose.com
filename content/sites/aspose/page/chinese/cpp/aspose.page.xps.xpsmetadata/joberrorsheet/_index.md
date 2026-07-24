---
title: "Aspose::Page::XPS::XpsMetadata::JobErrorSheet 类"
linktitle: "JobErrorSheet"
second_title: "Aspose.Page 适用于 C++"
description: "Aspose::Page::XPS::XpsMetadata::JobErrorSheet 类。描述错误纸张的输出。整个作业将只有一张错误纸。错误纸应使用默认的 PageMediaSize 并使用默认的 PageMediaType 输出。错误纸应与作业的其余部分隔离。这意味着任何装订或处理选项（如 JobDuplex、JobStaple 或 JobBinding）都不应包含错误纸。错误纸应作为作业的最后一张纸张出现。 在 C++ 中。"
type: docs
weight: 5300
url: /zh/cpp/aspose.page.xps.xpsmetadata/joberrorsheet/
---
## JobErrorSheet class


描述错误纸张的输出。整个作业将只有一张错误纸。错误纸应使用默认的 [PageMediaSize](../pagemediasize/) 并使用默认的 [PageMediaType](../pagemediatype/) 输出。错误纸应与作业的其余部分隔离。这意味着任何装订或处理选项（如 **JobDuplex**、**JobStaple** 或 **JobBinding**）都不应包含错误纸。错误纸应作为作业的最后一张纸张出现。 [https://docs.microsoft.com/en-us/windows/win32/printdocs/joberrorsheet](https://docs.microsoft.com/en-us/windows/win32/printdocs/joberrorsheet)。

```cpp
class JobErrorSheet : public Aspose::Page::XPS::XpsMetadata::Feature,
                      public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem
```

## Nested classes

* Class [ErrorSheetOption](./errorsheetoption/)
* Class [ErrorSheetWhen](./errorsheetwhen/)
* Class [IJobErrorSheetItem](./ijoberrorsheetitem/)
## 方法

| 方法 | 描述 |
| --- | --- |
| [JobErrorSheet](./joberrorsheet/)(const System::ArrayPtr\<System::SharedPtr\<JobErrorSheet::IJobErrorSheetItem\>\>\&) | 创建一个新实例。 |
## 另见

* Class [Feature](../feature/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
