---
title: "Aspose::Page::XPS::XpsMetadata::DocumentStaple klasse"
linktitle: "DocumentStaple"
second_title: "Aspose.Page voor C++"
description: "Aspose::Page::XPS::XpsMetadata::DocumentStaple class. Beschrijft de kenmerken van de stapeling van de uitvoer. Elk document wordt afzonderlijk gestapeld. De JobStapleAllDocuments- en DocumentStaple-sleutelwoorden zijn wederzijds exclusief. Het is aan de driver om de afhandelingsregels tussen deze sleutelwoorden te bepalen.  in C++."
type: docs
weight: 2600
url: /nl/cpp/aspose.page.xps.xpsmetadata/documentstaple/
---
## DocumentStaple class


Beschrijft de kenmerken van de stapeling van de uitvoer. Elk document wordt afzonderlijk gestapeld. De [JobStapleAllDocuments](../jobstaplealldocuments/) en [DocumentStaple](./) sleutelwoorden zijn wederzijds exclusief. Het is aan de driver om de afhandelingsregels tussen deze sleutelwoorden te bepalen. [https://docs.microsoft.com/en-us/windows/win32/printdocs/documentstaple](https://docs.microsoft.com/en-us/windows/win32/printdocs/documentstaple).

```cpp
class DocumentStaple : public Aspose::Page::XPS::XpsMetadata::Staple,
                       public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem,
                       public Aspose::Page::XPS::XpsMetadata::IDocumentPrintTicketItem
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [DocumentStaple](./documentstaple/)(const System::ArrayPtr\<System::SharedPtr\<Staple::StapleOption\>\>\&) | Maakt een nieuw exemplaar aan. |
## Zie ook

* Class [Staple](../staple/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Class [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
