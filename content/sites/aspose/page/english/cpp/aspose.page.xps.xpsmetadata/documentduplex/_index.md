---
title: Aspose::Page::XPS::XpsMetadata::DocumentDuplex class
linktitle: DocumentDuplex
second_title: Aspose.Page for C++
description: 'Aspose::Page::XPS::XpsMetadata::DocumentDuplex class. Describes the duplex characteristics of the output. The duplex feature allows for printing on both sides of the media. Each document is duplexed separately. DocumentDuplex and JobDuplexAllDocumentsContiguously are mutually exclusive. It is up to the driver to determine constraint handling between these keywords.  in C++.'
type: docs
weight: 1400
url: /cpp/aspose.page.xps.xpsmetadata/documentduplex/
---
## DocumentDuplex class


Describes the duplex characteristics of the output. The duplex feature allows for printing on both sides of the media. Each document is duplexed separately. [DocumentDuplex](./) and [JobDuplexAllDocumentsContiguously](../jobduplexalldocumentscontiguously/) are mutually exclusive. It is up to the driver to determine constraint handling between these keywords. [https://docs.microsoft.com/en-us/windows/win32/printdocs/documentduplex](https://docs.microsoft.com/en-us/windows/win32/printdocs/documentduplex).

```cpp
class DocumentDuplex : public Aspose::Page::XPS::XpsMetadata::Duplex,
                       public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem,
                       public Aspose::Page::XPS::XpsMetadata::IDocumentPrintTicketItem
```

## Methods

| Method | Description |
| --- | --- |
| [DocumentDuplex](./documentduplex/)(const System::ArrayPtr\<System::SharedPtr\<Duplex::DuplexOption\>\>\&) | Creates a new instance. |
## See Also

* Class [Duplex](../duplex/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Class [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
