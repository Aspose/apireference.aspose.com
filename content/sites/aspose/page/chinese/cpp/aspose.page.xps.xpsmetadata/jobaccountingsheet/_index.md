---
title: "Aspose::Page::XPS::XpsMetadata::JobAccountingSheet 类"
linktitle: "JobAccountingSheet"
second_title: "Aspose.Page 适用于 C++"
description: "Aspose::Page::XPS::XpsMetadata::JobAccountingSheet 类。描述作业要输出的记账页。记账页应使用默认的 PageMediaSize 并使用默认的 PageMediaType 输出。记账页应与作业的其余部分隔离。这意味着任何装订或处理选项（例如 JobDuplex、JobStaple 或 JobBinding）不应包含记账页。记账页可以根据实现者''的决定作为作业的第一页或最后一页出现。（C++ 中）。"
type: docs
weight: 4400
url: /zh/cpp/aspose.page.xps.xpsmetadata/jobaccountingsheet/
---
## JobAccountingSheet class


描述要为作业输出的会计表。会计表应使用默认的 [PageMediaSize](../pagemediasize/) 并使用默认的 [PageMediaType](../pagemediatype/) 输出。会计表应与作业的其余部分隔离。这意味着任何装订或处理选项（例如 **JobDuplex**、**JobStaple** 或 **JobBinding**）不应包括会计表。会计表可以在作业的第一页或最后一页出现，由实现者自行决定。[https://docs.microsoft.com/en-us/windows/win32/printdocs/jobaccountingsheet](https://docs.microsoft.com/en-us/windows/win32/printdocs/jobaccountingsheet)。

```cpp
class JobAccountingSheet : public Aspose::Page::XPS::XpsMetadata::Feature,
                           public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem
```

## Nested classes

* Class [JobAccountingSheetOption](./jobaccountingsheetoption/)
## 方法

| 方法 | 描述 |
| --- | --- |
| [JobAccountingSheet](./jobaccountingsheet/)(const System::ArrayPtr\<System::SharedPtr\<JobAccountingSheet::JobAccountingSheetOption\>\>\&) | 创建一个新实例。 |
## 另见

* Class [Feature](../feature/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
