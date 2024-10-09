---
title: Aspose::Page::XPS::XpsMetadata::DocumentCoverBack class
linktitle: DocumentCoverBack
second_title: Aspose.Page for C++
description: 'Aspose::Page::XPS::XpsMetadata::DocumentCoverBack class. Describes the back (ending) cover sheet. Each document will have a separate sheet. The cover sheet should be printed on the PageMediaSize and PageMediaType used for the final page of the document. The cover sheet should be integrated into processing options (such as DocumentDuplex, DocumentNUp) as indicated by the Option specified.  in C++.'
type: docs
weight: 1000
url: /cpp/aspose.page.xps.xpsmetadata/documentcoverback/
---
## DocumentCoverBack class


Describes the back (ending) cover sheet. Each document will have a separate sheet. The cover sheet should be printed on the [PageMediaSize](../pagemediasize/) and [PageMediaType](../pagemediatype/) used for the final page of the document. The cover sheet should be integrated into processing options (such as [DocumentDuplex](../documentduplex/), [DocumentNUp](../documentnup/)) as indicated by the [Option](../option/) specified. [https://docs.microsoft.com/en-us/windows/win32/printdocs/documentcoverback](https://docs.microsoft.com/en-us/windows/win32/printdocs/documentcoverback).

```cpp
class DocumentCoverBack : public Aspose::Page::XPS::XpsMetadata::Feature,
                          public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem,
                          public Aspose::Page::XPS::XpsMetadata::IDocumentPrintTicketItem
```

## Nested classes

* Class [CoverBackOption](./coverbackoption/)
## Methods

| Method | Description |
| --- | --- |
| [DocumentCoverBack](./documentcoverback/)(const System::ArrayPtr\<System::SharedPtr\<DocumentCoverBack::CoverBackOption\>\>\&) | Creates a new instance. |
## See Also

* Class [Feature](../feature/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Class [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
