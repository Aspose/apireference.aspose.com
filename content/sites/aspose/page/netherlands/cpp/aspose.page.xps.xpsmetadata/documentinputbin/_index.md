---
title: "Aspose::Page::XPS::XpsMetadata::DocumentInputBin klasse"
linktitle: "DocumentInputBin"
second_title: "Aspose.Page voor C++"
description: "Aspose::Page::XPS::XpsMetadata::DocumentInputBin klasse. Beschrijft de geïnstalleerde invoerbak in een apparaat of de volledige lijst van ondersteunde bakken voor een apparaat. De trefwoorden JobInputBin, DocumentInputBin en PageInputBin zijn wederzijds exclusief. Beide mogen niet gelijktijdig worden gespecificeerd in een PrintTicket- of Print Capabilities-document.  in C++."
type: docs
weight: 1800
url: /nl/cpp/aspose.page.xps.xpsmetadata/documentinputbin/
---
## DocumentInputBin class


Beschrijft de geïnstalleerde invoerbak in een apparaat of de volledige lijst van ondersteunde bakken voor een apparaat. De trefwoorden [JobInputBin](../jobinputbin/), [DocumentInputBin](./) en [PageInputBin](../pageinputbin/) zijn wederzijds exclusief. Beide mogen niet gelijktijdig worden gespecificeerd in een [PrintTicket](../printticket/) of Print Capabilities-document. [https://docs.microsoft.com/en-us/windows/win32/printdocs/documentinputbin](https://docs.microsoft.com/en-us/windows/win32/printdocs/documentinputbin).

```cpp
class DocumentInputBin : public Aspose::Page::XPS::XpsMetadata::InputBin,
                         public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem,
                         public Aspose::Page::XPS::XpsMetadata::IDocumentPrintTicketItem
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [DocumentInputBin](./documentinputbin/)(const System::ArrayPtr\<System::SharedPtr\<InputBin::IInputBinItem\>\>\&) | Maakt een nieuw exemplaar aan. |
## Zie ook

* Class [InputBin](../inputbin/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Class [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
