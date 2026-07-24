---
title: "Aspose::Page::XPS::XpsMetadata::PageInputBin klasse"
linktitle: "PageInputBin"
second_title: "Aspose.Page voor C++"
description: "Aspose::Page::XPS::XpsMetadata::PageInputBin klasse. Beschrijft de geïnstalleerde invoerbak in een apparaat of de volledige lijst met ondersteunde bakken voor een apparaat. Stelt toe om de invoerbak per pagina te specificeren. De trefwoorden JobInputBin, DocumentInputBin en PageInputBin zijn onderling exclusief. Beide mogen niet gelijktijdig worden gespecificeerd in een PrintTicket- of Print Capabilities-document.  in C++."
type: docs
weight: 10000
url: /nl/cpp/aspose.page.xps.xpsmetadata/pageinputbin/
---
## PageInputBin class


Beschrijft de geïnstalleerde invoerbak in een apparaat of de volledige lijst met ondersteunde bakken voor een apparaat. Stelt toe om de invoerbak per pagina te specificeren. De [JobInputBin](../jobinputbin/), [DocumentInputBin](../documentinputbin/) en [PageInputBin](./) trefwoorden zijn onderling exclusief. Beide mogen niet gelijktijdig worden gespecificeerd in een [PrintTicket](../printticket/) of Print Capabilities-document. [https://docs.microsoft.com/en-us/windows/win32/printdocs/pageinputbin](https://docs.microsoft.com/en-us/windows/win32/printdocs/pageinputbin).

```cpp
class PageInputBin : public Aspose::Page::XPS::XpsMetadata::InputBin,
                     public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem,
                     public Aspose::Page::XPS::XpsMetadata::IDocumentPrintTicketItem,
                     public Aspose::Page::XPS::XpsMetadata::IPagePrintTicketItem
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [PageInputBin](./pageinputbin/)(const System::ArrayPtr\<System::SharedPtr\<InputBin::IInputBinItem\>\>\&) | Maakt een nieuw exemplaar aan. |
## Zie ook

* Class [InputBin](../inputbin/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Class [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* Class [IPagePrintTicketItem](../ipageprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
