---
title: Aspose::Page::XPS::XpsMetadata::DocumentCoverFront class
linktitle: DocumentCoverFront
second_title: Aspose.Page for C++
description: 'Aspose::Page::XPS::XpsMetadata::DocumentCoverFront class. Describes the front (beginning) cover sheet. Each document will have a separate sheet. The cover sheet should be printed on the PageMediaSize and PageMediaType used for the first page of the document. The cover sheet should be integrated into processing options (such as DocumentDuplex, DocumentNUp) as indicated by the Option specified.  in C++.'
type: docs
weight: 1200
url: /cpp/aspose.page.xps.xpsmetadata/documentcoverfront/
---
## DocumentCoverFront class


Describes the front (beginning) cover sheet. Each document will have a separate sheet. The cover sheet should be printed on the [PageMediaSize](../pagemediasize/) and [PageMediaType](../pagemediatype/) used for the first page of the document. The cover sheet should be integrated into processing options (such as [DocumentDuplex](../documentduplex/), [DocumentNUp](../documentnup/)) as indicated by the [Option](../option/) specified. [https://docs.microsoft.com/en-us/windows/win32/printdocs/documentcoverfront](https://docs.microsoft.com/en-us/windows/win32/printdocs/documentcoverfront).

```cpp
class DocumentCoverFront : public Aspose::Page::XPS::XpsMetadata::Feature,
                           public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem,
                           public Aspose::Page::XPS::XpsMetadata::IDocumentPrintTicketItem
```

## Nested classes

* Class [CoverFrontOption](./coverfrontoption/)
## Methods

| Method | Description |
| --- | --- |
| [DocumentCoverFront](./documentcoverfront/)(const System::ArrayPtr\<System::SharedPtr\<DocumentCoverFront::CoverFrontOption\>\>\&) | Creates a new instance. |
## See Also

* Class [Feature](../feature/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Class [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
