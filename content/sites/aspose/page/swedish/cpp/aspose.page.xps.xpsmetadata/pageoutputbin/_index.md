---
title: "Aspose::Page::XPS::XpsMetadata::PageOutputBin-klass"
linktitle: "PageOutputBin"
second_title: "Aspose.Page för C++"
description: "Aspose::Page::XPS::XpsMetadata::PageOutputBin-klass. Beskriver den fullständiga listan över stödjade fack för enheten. Tillåter specifikation av utskriftsfack per sida. Nyckelorden JobOutputBin, DocumentOutputBin och PageOutputBin är ömsesidigt uteslutande; endast ett bör anges i ett PrintTicket‑ eller Print Capabilities‑dokument.  i C++."
type: docs
weight: 11400
url: /sv/cpp/aspose.page.xps.xpsmetadata/pageoutputbin/
---
## PageOutputBin class


Beskriver den fullständiga listan över stödjade fack för enheten. Tillåter specifikation av utskriftsfack per sida. Nyckelorden [JobOutputBin](../joboutputbin/), [DocumentOutputBin](../documentoutputbin/) och [PageOutputBin](./) är ömsesidigt uteslutande; endast ett bör anges i ett [PrintTicket](../printticket/) eller Print Capabilities‑dokument. [https://docs.microsoft.com/en-us/windows/win32/printdocs/pageoutputbin](https://docs.microsoft.com/en-us/windows/win32/printdocs/pageoutputbin).

```cpp
class PageOutputBin : public Aspose::Page::XPS::XpsMetadata::OutputBin,
                      public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem,
                      public Aspose::Page::XPS::XpsMetadata::IDocumentPrintTicketItem,
                      public Aspose::Page::XPS::XpsMetadata::IPagePrintTicketItem
```

## Metoder

| Metod | Beskrivning |
| --- | --- |
| [PageOutputBin](./pageoutputbin/)(const System::ArrayPtr\<System::SharedPtr\<OutputBin::IOutputBinItem\>\>\&) | Skapar en ny instans. |
## Se även

* Class [OutputBin](../outputbin/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Class [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* Class [IPagePrintTicketItem](../ipageprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
