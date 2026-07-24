---
title: "Aspose::Page::XPS::XpsMetadata::PageWatermark class"
linktitle: "PageWatermark"
second_title: "Aspose.Page voor C++"
description: "Aspose::Page::XPS::XpsMetadata::PageWatermark class. Beschrijft de watermerkinstelling van de uitvoer en de watermerkkenmerken. Watermerken zijn van toepassing op de logische pagina, niet op de fysieke pagina. Bijvoorbeeld, als DocumentDuplex is ingeschakeld, verschijnt er een watermerk op elke NUp-pagina op elk vel. Als DocumentDuplex, PagesPerSheet=2, dan heeft elk vel 2 watermerken.  in C++."
type: docs
weight: 13100
url: /nl/cpp/aspose.page.xps.xpsmetadata/pagewatermark/
---
## PageWatermark class


Beschrijft de watermerkinstelling van de uitvoer en de watermerkkenmerken. Watermerken zijn van toepassing op de logische pagina, niet op de fysieke pagina. Bijvoorbeeld, als [DocumentDuplex](../documentduplex/) is ingeschakeld, verschijnt er een watermerk op elke **[NUp](../nup/)** pagina op elk vel. Als [DocumentDuplex](../documentduplex/), **PagesPerSheet**=2, dan heeft elk vel 2 watermerken. [https://docs.microsoft.com/en-us/windows/win32/printdocs/pagewatermark](https://docs.microsoft.com/en-us/windows/win32/printdocs/pagewatermark).

```cpp
class PageWatermark : public Aspose::Page::XPS::XpsMetadata::Feature,
                      public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem,
                      public Aspose::Page::XPS::XpsMetadata::IDocumentPrintTicketItem,
                      public Aspose::Page::XPS::XpsMetadata::IPagePrintTicketItem
```

## Nested classes

* Class [IPageWatermarkItem](./ipagewatermarkitem/)
* Class [IPageWatermarkOptionItem](./ipagewatermarkoptionitem/)
* Class [Layering](./layering/)
* Class [LayeringOption](./layeringoption/)
* Class [PageWatermarkOption](./pagewatermarkoption/)
## Methoden

| Methode | Beschrijving |
| --- | --- |
| [PageWatermark](./pagewatermark/)(const System::ArrayPtr\<System::SharedPtr\<PageWatermark::IPageWatermarkItem\>\>\&) | Maakt een nieuw exemplaar aan. |
## Zie ook

* Class [Feature](../feature/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Class [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* Class [IPagePrintTicketItem](../ipageprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
