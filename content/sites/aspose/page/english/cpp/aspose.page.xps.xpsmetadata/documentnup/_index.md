---
title: Aspose::Page::XPS::XpsMetadata::DocumentNUp class
linktitle: DocumentNUp
second_title: Aspose.Page for C++
description: 'Aspose::Page::XPS::XpsMetadata::DocumentNUp class. Describes the output and format of multiple logical pages to a single physical sheet. Each document is compiled separately. DocumentNUp and JobNUpAllDocumentsContiguously are mutually exclusive. It is up to the driver to determine constraint handling between these keywords.  in C++.'
type: docs
weight: 2000
url: /cpp/aspose.page.xps.xpsmetadata/documentnup/
---
## DocumentNUp class


Describes the output and format of multiple logical pages to a single physical sheet. Each document is compiled separately. **[DocumentNUp](./)** and [JobNUpAllDocumentsContiguously](../jobnupalldocumentscontiguously/) are mutually exclusive. It is up to the driver to determine constraint handling between these keywords. [https://docs.microsoft.com/en-us/windows/win32/printdocs/documentnup](https://docs.microsoft.com/en-us/windows/win32/printdocs/documentnup).

```cpp
class DocumentNUp : public Aspose::Page::XPS::XpsMetadata::NUp,
                    public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem,
                    public Aspose::Page::XPS::XpsMetadata::IDocumentPrintTicketItem
```

## Methods

| Method | Description |
| --- | --- |
| [AddPagesPerSheetOption](./addpagespersheetoption/)(int32_t) | Adds and option with a **PagesPerSheet** scored property value. Specifies the number of logical pages per physical sheet. |
| [DocumentNUp](./documentnup/)(const System::ArrayPtr\<System::SharedPtr\<NUp::INUpItem\>\>\&) | Creates a new instance. |
## See Also

* Class [NUp](../nup/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Class [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
