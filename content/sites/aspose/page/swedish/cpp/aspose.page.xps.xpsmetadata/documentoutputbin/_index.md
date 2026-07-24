---
title: "Aspose::Page::XPS::XpsMetadata::DocumentOutputBin klass"
linktitle: "DocumentOutputBin"
second_title: "Aspose.Page för C++"
description: "Aspose::Page::XPS::XpsMetadata::DocumentOutputBin klass. Beskriver den fullständiga listan över stödjade fack för enheten. Tillåter specifikation av utskriftsfack per dokument. Nyckelorden JobOutputBin, DocumentOutputBin och PageOutputBin är ömsesidigt uteslutande; endast en bör anges i ett PrintTicket‑ eller Print‑Capabilities‑dokument.  i C++."
type: docs
weight: 2100
url: /sv/cpp/aspose.page.xps.xpsmetadata/documentoutputbin/
---
## DocumentOutputBin class


Beskriver den fullständiga listan över stödjade fack för enheten. Tillåter specifikation av utskriftsfack per dokument. Nyckelorden [JobOutputBin](../joboutputbin/), [DocumentOutputBin](./) och [PageOutputBin](../pageoutputbin/) är ömsesidigt uteslutande; endast en bör anges i ett [PrintTicket](../printticket/) eller Print‑Capabilities‑dokument. [https://docs.microsoft.com/en-us/windows/win32/printdocs/documentoutputbin](https://docs.microsoft.com/en-us/windows/win32/printdocs/documentoutputbin).

```cpp
class DocumentOutputBin : public Aspose::Page::XPS::XpsMetadata::OutputBin,
                          public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem,
                          public Aspose::Page::XPS::XpsMetadata::IDocumentPrintTicketItem
```

## Metoder

| Metod | Beskrivning |
| --- | --- |
| [DocumentOutputBin](./documentoutputbin/)(const System::ArrayPtr\<System::SharedPtr\<OutputBin::IOutputBinItem\>\>\&) | Skapar en ny instans. |
## Se även

* Class [OutputBin](../outputbin/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Class [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
