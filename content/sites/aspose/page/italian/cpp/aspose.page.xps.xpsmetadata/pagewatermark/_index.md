---
title: "Aspose::Page::XPS::XpsMetadata::PageWatermark classe"
linktitle: "PageWatermark"
second_title: "Aspose.Page per C++"
description: "classe Aspose::Page::XPS::XpsMetadata::PageWatermark. Descrive l'impostazione del watermark dell'output e le caratteristiche del watermark. I watermark si applicano alla pagina logica, non a quella fisica. Per esempio, se DocumentDuplex è abilitato, un watermark apparirà su ogni pagina NUp di ogni foglio. Se DocumentDuplex, PagesPerSheet=2, allora ogni foglio avrà 2 watermark.  in C++."
type: docs
weight: 13100
url: /it/cpp/aspose.page.xps.xpsmetadata/pagewatermark/
---
## PageWatermark class


Descrive l'impostazione del watermark dell'output e le caratteristiche del watermark. I watermark si applicano alla pagina logica, non a quella fisica. Per esempio, se [DocumentDuplex](../documentduplex/) è abilitato, un watermark apparirà su ogni **[NUp](../nup/)** pagina di ogni foglio. Se [DocumentDuplex](../documentduplex/), **PagesPerSheet**=2, allora ogni foglio avrà 2 watermark. [https://docs.microsoft.com/en-us/windows/win32/printdocs/pagewatermark](https://docs.microsoft.com/en-us/windows/win32/printdocs/pagewatermark).

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
## Metodi

| Metodo | Descrizione |
| --- | --- |
| [PageWatermark](./pagewatermark/)(const System::ArrayPtr\<System::SharedPtr\<PageWatermark::IPageWatermarkItem\>\>\&) | Crea una nuova istanza. |
## Vedi anche

* Class [Feature](../feature/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Class [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* Class [IPagePrintTicketItem](../ipageprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
