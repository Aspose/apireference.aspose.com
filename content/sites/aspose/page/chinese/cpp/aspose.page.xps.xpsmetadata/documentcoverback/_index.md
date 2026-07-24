---
title: "Aspose::Page::XPS::XpsMetadata::DocumentCoverBack 类"
linktitle: "DocumentCoverBack"
second_title: "Aspose.Page 适用于 C++"
description: "Aspose::Page::XPS::XpsMetadata::DocumentCoverBack 类。描述背面（结束）封面页。每个文档都有单独的封面页。封面页应使用用于文档最后一页的 PageMediaSize 和 PageMediaType 打印。封面页应按照指定的 Option 集成到处理选项（如 DocumentDuplex、DocumentNUp）中。  在 C++ 中。"
type: docs
weight: 1000
url: /zh/cpp/aspose.page.xps.xpsmetadata/documentcoverback/
---
## DocumentCoverBack class


描述背面（结束）封面页。每个文档都有单独的封面页。封面页应使用用于文档最后一页的 [PageMediaSize](../pagemediasize/) 和 [PageMediaType](../pagemediatype/) 打印。封面页应按照指定的 [Option](../option/) 集成到处理选项（如 [DocumentDuplex](../documentduplex/)、[DocumentNUp](../documentnup/)）中。 [https://docs.microsoft.com/en-us/windows/win32/printdocs/documentcoverback](https://docs.microsoft.com/en-us/windows/win32/printdocs/documentcoverback)。

```cpp
class DocumentCoverBack : public Aspose::Page::XPS::XpsMetadata::Feature,
                          public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem,
                          public Aspose::Page::XPS::XpsMetadata::IDocumentPrintTicketItem
```

## Nested classes

* Class [CoverBackOption](./coverbackoption/)
## 方法

| 方法 | 描述 |
| --- | --- |
| [DocumentCoverBack](./documentcoverback/)(const System::ArrayPtr\<System::SharedPtr\<DocumentCoverBack::CoverBackOption\>\>\&) | 创建一个新实例。 |
## 另见

* Class [Feature](../feature/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Class [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
