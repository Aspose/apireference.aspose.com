---
title: "kelas Aspose::Page::XPS::XpsMetadata::PageWatermark"
linktitle: "PageWatermark"
second_title: "Aspose.Page untuk C++"
description: "kelas Aspose::Page::XPS::XpsMetadata::PageWatermark. Menjelaskan pengaturan watermark output dan karakteristik watermark. Watermark diterapkan pada halaman logis, bukan halaman fisik. Misalnya, jika DocumentDuplex diaktifkan, watermark akan muncul pada setiap halaman NUp pada setiap lembar. Jika DocumentDuplex, **PagesPerSheet**=2, maka setiap lembar akan memiliki 2 watermark.  dalam C++."
type: docs
weight: 13100
url: /id/cpp/aspose.page.xps.xpsmetadata/pagewatermark/
---
## PageWatermark class


Menjelaskan pengaturan watermark output dan karakteristik watermark. Watermark diterapkan pada halaman logis, bukan halaman fisik. Misalnya, jika [DocumentDuplex](../documentduplex/) diaktifkan, watermark akan muncul pada setiap halaman **[NUp](../nup/)** pada setiap lembar. Jika [DocumentDuplex](../documentduplex/), **PagesPerSheet**=2, maka setiap lembar akan memiliki 2 watermark. [https://docs.microsoft.com/en-us/windows/win32/printdocs/pagewatermark](https://docs.microsoft.com/en-us/windows/win32/printdocs/pagewatermark).

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
## Metode

| Metode | Deskripsi |
| --- | --- |
| [PageWatermark](./pagewatermark/)(const System::ArrayPtr\<System::SharedPtr\<PageWatermark::IPageWatermarkItem\>\>\&) | Membuat instance baru. |
## Lihat Juga

* Class [Feature](../feature/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Class [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* Class [IPagePrintTicketItem](../ipageprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
