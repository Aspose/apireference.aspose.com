---
title: Aspose::Page::XPS::XpsMetadata::PageWatermark class
linktitle: PageWatermark
second_title: Aspose.Page for C++
description: 'Aspose::Page::XPS::XpsMetadata::PageWatermark class. Describes the watermark setting of the output and the watermark characteristics. Watermarks apply to the logical page, not the physical page. For example, if DocumentDuplex is enabled, a watermark will appear on each NUp page on each sheet. If DocumentDuplex, PagesPerSheet=2, then each sheet will have 2 watermarks.  in C++.'
type: docs
weight: 13100
url: /cpp/aspose.page.xps.xpsmetadata/pagewatermark/
---
## PageWatermark class


Describes the watermark setting of the output and the watermark characteristics. Watermarks apply to the logical page, not the physical page. For example, if [DocumentDuplex](../documentduplex/) is enabled, a watermark will appear on each **[NUp](../nup/)** page on each sheet. If [DocumentDuplex](../documentduplex/), **PagesPerSheet**=2, then each sheet will have 2 watermarks. [https://docs.microsoft.com/en-us/windows/win32/printdocs/pagewatermark](https://docs.microsoft.com/en-us/windows/win32/printdocs/pagewatermark).

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
## Methods

| Method | Description |
| --- | --- |
| [PageWatermark](./pagewatermark/)(const System::ArrayPtr\<System::SharedPtr\<PageWatermark::IPageWatermarkItem\>\>\&) | Creates a new instance. |
## See Also

* Class [Feature](../feature/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Class [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* Class [IPagePrintTicketItem](../ipageprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
