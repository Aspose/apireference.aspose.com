---
title: "Aspose::Page::XPS::XpsMetadata::PageWatermark sınıfı"
linktitle: "PageWatermark"
second_title: "Aspose.Page için C++"
description: "Aspose::Page::XPS::XpsMetadata::PageWatermark sınıfı. Çıktının filigran ayarını ve filigran özelliklerini açıklar. Filigranlar mantıksal sayfaya uygulanır, fiziksel sayfaya değil. Örneğin, DocumentDuplex etkinleştirilmişse, her NUp sayfasında her sayfada bir filigran görünür. DocumentDuplex, PagesPerSheet=2 ise, her sayfada 2 filigran olur.  in C++."
type: docs
weight: 13100
url: /tr/cpp/aspose.page.xps.xpsmetadata/pagewatermark/
---
## PageWatermark class


Çıktının filigran ayarını ve filigran özelliklerini açıklar. Filigranlar mantıksal sayfaya uygulanır, fiziksel sayfaya değil. Örneğin, eğer [DocumentDuplex](../documentduplex/) etkinleştirilmişse, her **[NUp](../nup/)** sayfasında her sayfada bir filigran görünür. Eğer [DocumentDuplex](../documentduplex/), **PagesPerSheet**=2 ise, her sayfada 2 filigran olur. [https://docs.microsoft.com/en-us/windows/win32/printdocs/pagewatermark](https://docs.microsoft.com/en-us/windows/win32/printdocs/pagewatermark).

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
## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [PageWatermark](./pagewatermark/)(const System::ArrayPtr\<System::SharedPtr\<PageWatermark::IPageWatermarkItem\>\>\&) | Yeni bir örnek oluşturur. |
## Ayrıca Bakınız

* Class [Feature](../feature/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Class [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* Class [IPagePrintTicketItem](../ipageprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
