---
title: "Aspose::Page::XPS::XpsMetadata::DocumentNUp 类"
linktitle: "DocumentNUp"
second_title: "Aspose.Page 适用于 C++"
description: "Aspose::Page::XPS::XpsMetadata::DocumentNUp 类。描述将多个逻辑页面输出并格式化到单个物理纸张的方式。每个文档分别编译。DocumentNUp 与 JobNUpAllDocumentsContiguously 互斥。具体约束处理方式由驱动程序决定。  在 C++ 中。"
type: docs
weight: 2000
url: /zh/cpp/aspose.page.xps.xpsmetadata/documentnup/
---
## DocumentNUp class


描述将多个逻辑页面输出并格式化到单个物理纸张的方式。每个文档分别编译。**[DocumentNUp](./)** 与 [JobNUpAllDocumentsContiguously](../jobnupalldocumentscontiguously/) 互斥。具体约束处理方式由驱动程序决定。 [https://docs.microsoft.com/en-us/windows/win32/printdocs/documentnup](https://docs.microsoft.com/en-us/windows/win32/printdocs/documentnup)。

```cpp
class DocumentNUp : public Aspose::Page::XPS::XpsMetadata::NUp,
                    public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem,
                    public Aspose::Page::XPS::XpsMetadata::IDocumentPrintTicketItem
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [AddPagesPerSheetOption](./addpagespersheetoption/)(int32_t) | 添加一个带有 **PagesPerSheet** 计分属性值的选项。指定每个物理纸张上的逻辑页面数量。 |
| [DocumentNUp](./documentnup/)(const System::ArrayPtr\<System::SharedPtr\<NUp::INUpItem\>\>\&) | 创建一个新实例。 |
## 另见

* Class [NUp](../nup/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Class [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
