---
title: Aspose::Page::XPS::XpsMetadata::PageInputBin class
linktitle: PageInputBin
second_title: Aspose.Page for C++
description: 'Aspose::Page::XPS::XpsMetadata::PageInputBin class. Describes the installed input bin in a device or the full list of supported bins for a device. Allows specification of input bin on a per page basis. The JobInputBin, DocumentInputBin and PageInputBin keywords are mutually exclusive. Both should not be specified simultaneously in a PrintTicket or Print Capabilities document.  in C++.'
type: docs
weight: 10000
url: /cpp/aspose.page.xps.xpsmetadata/pageinputbin/
---
## PageInputBin class


Describes the installed input bin in a device or the full list of supported bins for a device. Allows specification of input bin on a per page basis. The [JobInputBin](../jobinputbin/), [DocumentInputBin](../documentinputbin/) and [PageInputBin](./) keywords are mutually exclusive. Both should not be specified simultaneously in a [PrintTicket](../printticket/) or Print Capabilities document. [https://docs.microsoft.com/en-us/windows/win32/printdocs/pageinputbin](https://docs.microsoft.com/en-us/windows/win32/printdocs/pageinputbin).

```cpp
class PageInputBin : public Aspose::Page::XPS::XpsMetadata::InputBin,
                     public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem,
                     public Aspose::Page::XPS::XpsMetadata::IDocumentPrintTicketItem,
                     public Aspose::Page::XPS::XpsMetadata::IPagePrintTicketItem
```

## Methods

| Method | Description |
| --- | --- |
| [PageInputBin](./pageinputbin/)(const System::ArrayPtr\<System::SharedPtr\<InputBin::IInputBinItem\>\>\&) | Creates a new instance. |
## See Also

* Class [InputBin](../inputbin/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Class [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* Class [IPagePrintTicketItem](../ipageprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
