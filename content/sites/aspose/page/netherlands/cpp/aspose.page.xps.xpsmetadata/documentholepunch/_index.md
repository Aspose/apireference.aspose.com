---
title: "Aspose::Page::XPS::XpsMetadata::DocumentHolePunch klasse"
linktitle: "DocumentHolePunch"
second_title: "Aspose.Page voor C++"
description: "Aspose::Page::XPS::XpsMetadata::DocumentHolePunch klasse. Beschrijft de perforatiekenmerken van de uitvoer. Elk document wordt afzonderlijk geperforeerd. De trefwoorden JobHolePunch en DocumentHolePunch zijn onderling exclusief. Beide mogen niet gelijktijdig worden opgegeven in een PrintTicket- of Print Capabilities-document.  in C++."
type: docs
weight: 1500
url: /nl/cpp/aspose.page.xps.xpsmetadata/documentholepunch/
---
## DocumentHolePunch class


Beschrijft de perforatiekenmerken van de uitvoer. Elk document wordt afzonderlijk geperforeerd. De trefwoorden [JobHolePunch](../jobholepunch/) en [DocumentHolePunch](./) zijn onderling exclusief. Beide mogen niet gelijktijdig worden opgegeven in een [PrintTicket](../printticket/) of Print Capabilities-document. [https://docs.microsoft.com/en-us/windows/win32/printdocs/documentholepunch](https://docs.microsoft.com/en-us/windows/win32/printdocs/documentholepunch).

```cpp
class DocumentHolePunch : public Aspose::Page::XPS::XpsMetadata::HolePunch,
                          public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem,
                          public Aspose::Page::XPS::XpsMetadata::IDocumentPrintTicketItem
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [DocumentHolePunch](./documentholepunch/)(const System::ArrayPtr\<System::SharedPtr\<HolePunch::HolePunchOption\>\>\&) | Maakt een nieuw exemplaar aan. |
## Zie ook

* Class [HolePunch](../holepunch/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Class [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
