---
title: Aspose::Page::XPS::XpsMetadata::DocumentHolePunch class
linktitle: DocumentHolePunch
second_title: Aspose.Page for C++
description: 'Aspose::Page::XPS::XpsMetadata::DocumentHolePunch class. Describes the hole punching characteristics of the output. Each document is punched separately. The JobHolePunch and DocumentHolePunch keywords are mutually exclusive. Both should not be specified simultaneously in a PrintTicket or Print Capabilities document.  in C++.'
type: docs
weight: 1500
url: /cpp/aspose.page.xps.xpsmetadata/documentholepunch/
---
## DocumentHolePunch class


Describes the hole punching characteristics of the output. Each document is punched separately. The [JobHolePunch](../jobholepunch/) and [DocumentHolePunch](./) keywords are mutually exclusive. Both should not be specified simultaneously in a [PrintTicket](../printticket/) or Print Capabilities document. [https://docs.microsoft.com/en-us/windows/win32/printdocs/documentholepunch](https://docs.microsoft.com/en-us/windows/win32/printdocs/documentholepunch).

```cpp
class DocumentHolePunch : public Aspose::Page::XPS::XpsMetadata::HolePunch,
                          public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem,
                          public Aspose::Page::XPS::XpsMetadata::IDocumentPrintTicketItem
```

## Methods

| Method | Description |
| --- | --- |
| [DocumentHolePunch](./documentholepunch/)(const System::ArrayPtr\<System::SharedPtr\<HolePunch::HolePunchOption\>\>\&) | Creates a new instance. |
## See Also

* Class [HolePunch](../holepunch/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Class [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
