---
title: Aspose::Page::XPS::XpsMetadata::DocumentStaple class
linktitle: DocumentStaple
second_title: Aspose.Page for C++
description: 'Aspose::Page::XPS::XpsMetadata::DocumentStaple class. Describes the stapling characteristics of the output. Each document is stapled separately. The JobStapleAllDocuments and DocumentStaple keywords are mutually exclusive. It is up to the driver to determine constraint handling between these keywords.  in C++.'
type: docs
weight: 2600
url: /cpp/aspose.page.xps.xpsmetadata/documentstaple/
---
## DocumentStaple class


Describes the stapling characteristics of the output. Each document is stapled separately. The [JobStapleAllDocuments](../jobstaplealldocuments/) and [DocumentStaple](./) keywords are mutually exclusive. It is up to the driver to determine constraint handling between these keywords. [https://docs.microsoft.com/en-us/windows/win32/printdocs/documentstaple](https://docs.microsoft.com/en-us/windows/win32/printdocs/documentstaple).

```cpp
class DocumentStaple : public Aspose::Page::XPS::XpsMetadata::Staple,
                       public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem,
                       public Aspose::Page::XPS::XpsMetadata::IDocumentPrintTicketItem
```

## Methods

| Method | Description |
| --- | --- |
| [DocumentStaple](./documentstaple/)(const System::ArrayPtr\<System::SharedPtr\<Staple::StapleOption\>\>\&) | Creates a new instance. |
## See Also

* Class [Staple](../staple/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Class [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
