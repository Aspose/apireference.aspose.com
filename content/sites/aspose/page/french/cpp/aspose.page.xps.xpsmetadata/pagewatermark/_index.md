---
title: "Aspose::Page::XPS::XpsMetadata::PageWatermark classe"
linktitle: "PageWatermark"
second_title: "Aspose.Page pour C++"
description: "Aspose::Page::XPS::XpsMetadata::PageWatermark class. Décrit le paramètre de filigrane de la sortie et les caractéristiques du filigrane. Les filigranes s'appliquent à la page logique, pas à la page physique. Par exemple, si DocumentDuplex est activé, un filigrane apparaîtra sur chaque page NUp de chaque feuille. Si DocumentDuplex, **PagesPerSheet**=2, alors chaque feuille aura 2 filigranes.  en C++."
type: docs
weight: 13100
url: /fr/cpp/aspose.page.xps.xpsmetadata/pagewatermark/
---
## PageWatermark class


Décrit le paramètre de filigrane de la sortie et les caractéristiques du filigrane. Les filigranes s'appliquent à la page logique, pas à la page physique. Par exemple, si [DocumentDuplex](../documentduplex/) est activé, un filigrane apparaîtra sur chaque page **[NUp](../nup/)** de chaque feuille. Si [DocumentDuplex](../documentduplex/), **PagesPerSheet**=2, alors chaque feuille aura 2 filigranes. [https://docs.microsoft.com/en-us/windows/win32/printdocs/pagewatermark](https://docs.microsoft.com/en-us/windows/win32/printdocs/pagewatermark).

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
## Méthodes

| Méthode | Description |
| --- | --- |
| [PageWatermark](./pagewatermark/)(const System::ArrayPtr\<System::SharedPtr\<PageWatermark::IPageWatermarkItem\>\>\&) | Crée une nouvelle instance. |
## Voir aussi

* Class [Feature](../feature/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Class [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* Class [IPagePrintTicketItem](../ipageprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
