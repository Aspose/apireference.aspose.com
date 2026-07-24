---
title: "Aspose::Page::XPS::XpsMetadata::JobNUpAllDocumentsContiguously 类"
linktitle: "JobNUpAllDocumentsContiguously"
second_title: "Aspose.Page 适用于 C++"
description: "Aspose::Page::XPS::XpsMetadata::JobNUpAllDocumentsContiguously 类。描述将多个逻辑页面输出到单个物理纸张的方式。作业中的所有文档连续编排在一起。JobNUpAllDocumentsContiguously 与 DocumentNUp 互斥。由驱动程序决定这些关键字之间的约束处理。C++ 中。"
type: docs
weight: 5900
url: /zh/cpp/aspose.page.xps.xpsmetadata/jobnupalldocumentscontiguously/
---
## JobNUpAllDocumentsContiguously class


描述将多个逻辑页面输出到单个物理纸张的方式。作业中的所有文档连续编排在一起。[JobNUpAllDocumentsContiguously](./) 与 [DocumentNUp](../documentnup/) 互斥。由驱动程序决定这些关键字之间的约束处理。[https://docs.microsoft.com/en-us/windows/win32/printdocs/jobnupalldocumentscontiguously](https://docs.microsoft.com/en-us/windows/win32/printdocs/jobnupalldocumentscontiguously)。

```cpp
class JobNUpAllDocumentsContiguously : public Aspose::Page::XPS::XpsMetadata::NUp,
                                       public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [AddPagesPerSheetOption](./addpagespersheetoption/)(int32_t) | 添加一个带有 **PagesPerSheet** 计分属性值的选项。指定每个物理纸张上的逻辑页面数量。 |
| [JobNUpAllDocumentsContiguously](./jobnupalldocumentscontiguously/)(const System::ArrayPtr\<System::SharedPtr\<NUp::INUpItem\>\>\&) | 创建一个新实例。 |
## 另见

* Class [NUp](../nup/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
