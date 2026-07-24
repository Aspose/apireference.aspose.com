---
title: "Aspose::Page::XPS::XpsMetadata::PageOutputBin klasse"
linktitle: "PageOutputBin"
second_title: "Aspose.Page voor C++"
description: "Aspose::Page::XPS::XpsMetadata::PageOutputBin klasse. Beschrijft de volledige lijst van ondersteunde bakken voor het apparaat. Stelt specificatie van uitvoerbak per pagina mogelijk. De trefwoorden JobOutputBin, DocumentOutputBin en PageOutputBin zijn onderling exclusief; er mag slechts één worden opgegeven in een PrintTicket- of Print Capabilities-document.  in C++."
type: docs
weight: 11400
url: /nl/cpp/aspose.page.xps.xpsmetadata/pageoutputbin/
---
## PageOutputBin class


Beschrijft de volledige lijst van ondersteunde bakken voor het apparaat. Stelt specificatie van uitvoerbak per pagina mogelijk. De trefwoorden [JobOutputBin](../joboutputbin/), [DocumentOutputBin](../documentoutputbin/) en [PageOutputBin](./) zijn onderling exclusief; er mag slechts één worden opgegeven in een [PrintTicket](../printticket/) of Print Capabilities-document. [https://docs.microsoft.com/en-us/windows/win32/printdocs/pageoutputbin](https://docs.microsoft.com/en-us/windows/win32/printdocs/pageoutputbin).

```cpp
class PageOutputBin : public Aspose::Page::XPS::XpsMetadata::OutputBin,
                      public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem,
                      public Aspose::Page::XPS::XpsMetadata::IDocumentPrintTicketItem,
                      public Aspose::Page::XPS::XpsMetadata::IPagePrintTicketItem
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [PageOutputBin](./pageoutputbin/)(const System::ArrayPtr\<System::SharedPtr\<OutputBin::IOutputBinItem\>\>\&) | Maakt een nieuw exemplaar aan. |
## Zie ook

* Class [OutputBin](../outputbin/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Class [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* Class [IPagePrintTicketItem](../ipageprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
