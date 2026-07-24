---
title: "Aspose::Page::XPS::XpsMetadata::PageInputBin klass"
linktitle: "PageInputBin"
second_title: "Aspose.Page för C++"
description: "Aspose::Page::XPS::XpsMetadata::PageInputBin klass. Beskriver den installerade inmatningsbehållaren i en enhet eller den fullständiga listan över stödda behållare för en enhet. Tillåter specifikation av inmatningsbehållare per sida. Nyckelorden JobInputBin, DocumentInputBin och PageInputBin är ömsesidigt uteslutande. Båda bör inte anges samtidigt i ett PrintTicket- eller Print Capabilities-dokument.  i C++."
type: docs
weight: 10000
url: /sv/cpp/aspose.page.xps.xpsmetadata/pageinputbin/
---
## PageInputBin class


Beskriver den installerade inmatningsbehållaren i en enhet eller den fullständiga listan över stödda behållare för en enhet. Tillåter specifikation av inmatningsbehållare per sida. Nyckelorden [JobInputBin](../jobinputbin/), [DocumentInputBin](../documentinputbin/) och [PageInputBin](./) är ömsesidigt uteslutande. Båda bör inte anges samtidigt i ett [PrintTicket](../printticket/) eller Print Capabilities-dokument. [https://docs.microsoft.com/en-us/windows/win32/printdocs/pageinputbin](https://docs.microsoft.com/en-us/windows/win32/printdocs/pageinputbin).

```cpp
class PageInputBin : public Aspose::Page::XPS::XpsMetadata::InputBin,
                     public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem,
                     public Aspose::Page::XPS::XpsMetadata::IDocumentPrintTicketItem,
                     public Aspose::Page::XPS::XpsMetadata::IPagePrintTicketItem
```

## Metoder

| Metod | Beskrivning |
| --- | --- |
| [PageInputBin](./pageinputbin/)(const System::ArrayPtr\<System::SharedPtr\<InputBin::IInputBinItem\>\>\&) | Skapar en ny instans. |
## Se även

* Class [InputBin](../inputbin/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Class [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* Class [IPagePrintTicketItem](../ipageprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
