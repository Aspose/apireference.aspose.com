---
title: "Aspose::Page::XPS::XpsMetadata::DocumentOutputBin klasse"
linktitle: "DocumentOutputBin"
second_title: "Aspose.Page voor C++"
description: "Aspose::Page::XPS::XpsMetadata::DocumentOutputBin klasse. Beschrijft de volledige lijst van ondersteunde bakken voor het apparaat. Staat toe om de uitvoerbak per document te specificeren. De trefwoorden JobOutputBin, DocumentOutputBin en PageOutputBin zijn onderling exclusief; er mag er slechts één worden gespecificeerd in een PrintTicket- of Print Capabilities-document.  in C++."
type: docs
weight: 2100
url: /nl/cpp/aspose.page.xps.xpsmetadata/documentoutputbin/
---
## DocumentOutputBin class


Beschrijft de volledige lijst van ondersteunde bakken voor het apparaat. Staat toe om de uitvoerbak per document te specificeren. De [JobOutputBin](../joboutputbin/), [DocumentOutputBin](./) en [PageOutputBin](../pageoutputbin/) trefwoorden zijn onderling exclusief; er mag er slechts één worden gespecificeerd in een [PrintTicket](../printticket/) of Print Capabilities-document. [https://docs.microsoft.com/en-us/windows/win32/printdocs/documentoutputbin](https://docs.microsoft.com/en-us/windows/win32/printdocs/documentoutputbin).

```cpp
class DocumentOutputBin : public Aspose::Page::XPS::XpsMetadata::OutputBin,
                          public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem,
                          public Aspose::Page::XPS::XpsMetadata::IDocumentPrintTicketItem
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [DocumentOutputBin](./documentoutputbin/)(const System::ArrayPtr\<System::SharedPtr\<OutputBin::IOutputBinItem\>\>\&) | Maakt een nieuw exemplaar aan. |
## Zie ook

* Class [OutputBin](../outputbin/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Class [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
