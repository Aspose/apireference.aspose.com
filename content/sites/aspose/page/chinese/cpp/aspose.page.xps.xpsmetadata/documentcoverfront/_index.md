---
title: "Aspose::Page::XPS::XpsMetadata::DocumentCoverFront 类"
linktitle: "DocumentCoverFront"
second_title: "Aspose.Page 适用于 C++"
description: "Aspose::Page::XPS::XpsMetadata::DocumentCoverFront 类。描述前（起始）封面页。每个文档都有单独的封面页。封面页应使用文档第一页的 PageMediaSize 和 PageMediaType 打印。封面页应根据指定的 Option 集成到处理选项中（例如 DocumentDuplex、DocumentNUp）。  in C++."
type: docs
weight: 1200
url: /zh/cpp/aspose.page.xps.xpsmetadata/documentcoverfront/
---
## DocumentCoverFront class


描述前（起始）封面页。每个文档都有单独的封面页。封面页应使用文档第一页的 [PageMediaSize](../pagemediasize/) 和 [PageMediaType](../pagemediatype/) 打印。封面页应根据指定的 [Option](../option/) 集成到处理选项中（例如 [DocumentDuplex](../documentduplex/)、[DocumentNUp](../documentnup/)）。 [https://docs.microsoft.com/en-us/windows/win32/printdocs/documentcoverfront](https://docs.microsoft.com/en-us/windows/win32/printdocs/documentcoverfront).

```cpp
class DocumentCoverFront : public Aspose::Page::XPS::XpsMetadata::Feature,
                           public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem,
                           public Aspose::Page::XPS::XpsMetadata::IDocumentPrintTicketItem
```

## Nested classes

* Class [CoverFrontOption](./coverfrontoption/)
## 方法

| 方法 | 描述 |
| --- | --- |
| [DocumentCoverFront](./documentcoverfront/)(const System::ArrayPtr\<System::SharedPtr\<DocumentCoverFront::CoverFrontOption\>\>\&) | 创建一个新实例。 |
## 另见

* Class [Feature](../feature/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Class [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
