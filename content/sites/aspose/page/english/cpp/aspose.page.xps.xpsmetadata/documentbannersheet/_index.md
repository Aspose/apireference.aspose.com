---
title: Aspose::Page::XPS::XpsMetadata::DocumentBannerSheet class
linktitle: DocumentBannerSheet
second_title: Aspose.Page for C++
description: 'Aspose::Page::XPS::XpsMetadata::DocumentBannerSheet class. Describes the banner sheet to be output for a particular document. The banner sheet should be output on the default PageMediaSize and using the default PageMediaType. The banner sheet should be also isolated from the remainder of the job. This means that any finishing or processing options (such as DocumentDuplex, DocumentStaple, or DocumentBinding) should not include the banner sheet. The banner sheet may or may not be isolated from the remainder of the job. This means that any job finishing or processing options, may include the document banner sheet. The banner sheet should occur as the first sheet of the document.  in C++.'
type: docs
weight: 400
url: /cpp/aspose.page.xps.xpsmetadata/documentbannersheet/
---
## DocumentBannerSheet class


Describes the banner sheet to be output for a particular document. The banner sheet should be output on the default [PageMediaSize](../pagemediasize/) and using the default [PageMediaType](../pagemediatype/). The banner sheet should be also isolated from the remainder of the job. This means that any finishing or processing options (such as [DocumentDuplex](../documentduplex/), [DocumentStaple](../documentstaple/), or [DocumentBinding](../documentbinding/)) should not include the banner sheet. The banner sheet may or may not be isolated from the remainder of the job. This means that any job finishing or processing options, may include the document banner sheet. The banner sheet should occur as the first sheet of the document. [https://docs.microsoft.com/en-us/windows/win32/printdocs/documentbannersheet](https://docs.microsoft.com/en-us/windows/win32/printdocs/documentbannersheet).

```cpp
class DocumentBannerSheet : public Aspose::Page::XPS::XpsMetadata::Feature,
                            public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem,
                            public Aspose::Page::XPS::XpsMetadata::IDocumentPrintTicketItem
```

## Nested classes

* Class [BannerSheetOption](./bannersheetoption/)
## Methods

| Method | Description |
| --- | --- |
| [DocumentBannerSheet](./documentbannersheet/)(const System::ArrayPtr\<System::SharedPtr\<DocumentBannerSheet::BannerSheetOption\>\>\&) | Creates a new instance. |
## See Also

* Class [Feature](../feature/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Class [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
