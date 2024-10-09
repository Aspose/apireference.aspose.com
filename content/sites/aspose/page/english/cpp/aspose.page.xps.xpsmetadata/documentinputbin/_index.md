---
title: Aspose::Page::XPS::XpsMetadata::DocumentInputBin class
linktitle: DocumentInputBin
second_title: Aspose.Page for C++
description: 'Aspose::Page::XPS::XpsMetadata::DocumentInputBin class. Describes the installed input bin in a device or the full list of supported bins for a device. The JobInputBin, DocumentInputBin, and PageInputBin keywords are mutually exclusive. Both should not be specified simultaneously in a PrintTicket or Print Capabilities document.  in C++.'
type: docs
weight: 1800
url: /cpp/aspose.page.xps.xpsmetadata/documentinputbin/
---
## DocumentInputBin class


Describes the installed input bin in a device or the full list of supported bins for a device. The [JobInputBin](../jobinputbin/), [DocumentInputBin](./), and [PageInputBin](../pageinputbin/) keywords are mutually exclusive. Both should not be specified simultaneously in a [PrintTicket](../printticket/) or Print Capabilities document. [https://docs.microsoft.com/en-us/windows/win32/printdocs/documentinputbin](https://docs.microsoft.com/en-us/windows/win32/printdocs/documentinputbin).

```cpp
class DocumentInputBin : public Aspose::Page::XPS::XpsMetadata::InputBin,
                         public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem,
                         public Aspose::Page::XPS::XpsMetadata::IDocumentPrintTicketItem
```

## Methods

| Method | Description |
| --- | --- |
| [DocumentInputBin](./documentinputbin/)(const System::ArrayPtr\<System::SharedPtr\<InputBin::IInputBinItem\>\>\&) | Creates a new instance. |
## See Also

* Class [InputBin](../inputbin/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Class [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
