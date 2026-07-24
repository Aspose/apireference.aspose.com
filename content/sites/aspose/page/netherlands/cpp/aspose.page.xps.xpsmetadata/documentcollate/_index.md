---
title: "Aspose::Page::XPS::XpsMetadata::DocumentCollate klasse"
linktitle: "DocumentCollate"
second_title: "Aspose.Page voor C++"
description: "Aspose::Page::XPS::XpsMetadata::DocumentCollate klasse. Beschrijft de samenvoegingskenmerken van de output. Alle pagina's in elk individueel document worden samengevoegd. DocumentCollate en JobCollateAlldocuments zijn wederzijds exclusief. Het gedrag en de implementatie van of beide of slechts één van deze trefwoorden wordt geïmplementeerd, wordt overgelaten aan de driver.  in C++."
type: docs
weight: 800
url: /nl/cpp/aspose.page.xps.xpsmetadata/documentcollate/
---
## DocumentCollate class


Beschrijft de samenvoegingskenmerken van de output. Alle pagina's in elk individueel document worden samengevoegd. [DocumentCollate](./) en JobCollateAlldocuments zijn wederzijds exclusief. Het gedrag en de implementatie van of beide of slechts één van deze trefwoorden wordt geïmplementeerd, wordt overgelaten aan de driver. [https://docs.microsoft.com/en-us/windows/win32/printdocs/documentcollate](https://docs.microsoft.com/en-us/windows/win32/printdocs/documentcollate).

```cpp
class DocumentCollate : public Aspose::Page::XPS::XpsMetadata::Collate,
                        public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem,
                        public Aspose::Page::XPS::XpsMetadata::IDocumentPrintTicketItem
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [DocumentCollate](./documentcollate/)(const System::ArrayPtr\<System::SharedPtr\<Collate::CollateOption\>\>\&) | Maakt een nieuw exemplaar aan. |
## Zie ook

* Class [Collate](../collate/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Class [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
