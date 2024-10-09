---
title: Aspose::Page::XPS::XpsMetadata::PageOutputBin class
linktitle: PageOutputBin
second_title: Aspose.Page for C++
description: 'Aspose::Page::XPS::XpsMetadata::PageOutputBin class. Describes the full list of supported bins for the device. Allows specification of output bin on a per page basis. The JobOutputBin, DocumentOutputBin and PageOutputBin keywords are mutually exclusive only one should be specified in a PrintTicket or Print Capabilities document.  in C++.'
type: docs
weight: 11500
url: /cpp/aspose.page.xps.xpsmetadata/pageoutputbin/
---
## PageOutputBin class


Describes the full list of supported bins for the device. Allows specification of output bin on a per page basis. The [JobOutputBin](../joboutputbin/), [DocumentOutputBin](../documentoutputbin/) and [PageOutputBin](./) keywords are mutually exclusive only one should be specified in a [PrintTicket](../printticket/) or Print Capabilities document. [https://docs.microsoft.com/en-us/windows/win32/printdocs/pageoutputbin](https://docs.microsoft.com/en-us/windows/win32/printdocs/pageoutputbin).

```cpp
class PageOutputBin : public Aspose::Page::XPS::XpsMetadata::OutputBin,
                      public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem,
                      public Aspose::Page::XPS::XpsMetadata::IDocumentPrintTicketItem,
                      public Aspose::Page::XPS::XpsMetadata::IPagePrintTicketItem
```

## Methods

| Method | Description |
| --- | --- |
| [PageOutputBin](./pageoutputbin/)(const System::ArrayPtr\<System::SharedPtr\<OutputBin::IOutputBinItem\>\>\&) | Creates a new instance. |
## See Also

* Class [OutputBin](../outputbin/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Class [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* Class [IPagePrintTicketItem](../ipageprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
