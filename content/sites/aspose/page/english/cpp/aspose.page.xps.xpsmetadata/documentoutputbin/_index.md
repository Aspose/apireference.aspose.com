---
title: Aspose::Page::XPS::XpsMetadata::DocumentOutputBin class
linktitle: DocumentOutputBin
second_title: Aspose.Page for C++
description: 'Aspose::Page::XPS::XpsMetadata::DocumentOutputBin class. Describes the full list of supported bins for the device. Allows specification of output bin on a per document basis. The JobOutputBin, DocumentOutputBin and PageOutputBin keywords are mutually exclusive only one should be specified in a PrintTicket or Print Capabilities document.  in C++.'
type: docs
weight: 2100
url: /cpp/aspose.page.xps.xpsmetadata/documentoutputbin/
---
## DocumentOutputBin class


Describes the full list of supported bins for the device. Allows specification of output bin on a per document basis. The [JobOutputBin](../joboutputbin/), [DocumentOutputBin](./) and [PageOutputBin](../pageoutputbin/) keywords are mutually exclusive only one should be specified in a [PrintTicket](../printticket/) or Print Capabilities document. [https://docs.microsoft.com/en-us/windows/win32/printdocs/documentoutputbin](https://docs.microsoft.com/en-us/windows/win32/printdocs/documentoutputbin).

```cpp
class DocumentOutputBin : public Aspose::Page::XPS::XpsMetadata::OutputBin,
                          public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem,
                          public Aspose::Page::XPS::XpsMetadata::IDocumentPrintTicketItem
```

## Methods

| Method | Description |
| --- | --- |
| [DocumentOutputBin](./documentoutputbin/)(const System::ArrayPtr\<System::SharedPtr\<OutputBin::IOutputBinItem\>\>\&) | Creates a new instance. |
## See Also

* Class [OutputBin](../outputbin/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Class [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
