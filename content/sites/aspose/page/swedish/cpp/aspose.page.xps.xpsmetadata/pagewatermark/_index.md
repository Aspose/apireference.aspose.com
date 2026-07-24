---
title: "Aspose::Page::XPS::XpsMetadata::PageWatermark klass"
linktitle: "PageWatermark"
second_title: "Aspose.Page för C++"
description: "Aspose::Page::XPS::XpsMetadata::PageWatermark-klass. Beskriver vattenstämpelinställningen för utskriften och vattenstämpelns egenskaper. Vattenstämplar tillämpas på den logiska sidan, inte den fysiska sidan. Till exempel, om DocumentDuplex är aktiverat, kommer en vattenstämpel att visas på varje NUp-sida på varje blad. Om DocumentDuplex, PagesPerSheet=2, kommer varje blad att ha 2 vattenstämplar.  i C++."
type: docs
weight: 13100
url: /sv/cpp/aspose.page.xps.xpsmetadata/pagewatermark/
---
## PageWatermark class


Beskriver vattenstämpelinställningen för utskriften och vattenstämpelns egenskaper. Vattenstämplar tillämpas på den logiska sidan, inte den fysiska sidan. Till exempel, om [DocumentDuplex](../documentduplex/) är aktiverat, kommer en vattenstämpel att visas på varje **[NUp](../nup/)** sida på varje blad. Om [DocumentDuplex](../documentduplex/), **PagesPerSheet**=2, kommer varje blad att ha 2 vattenstämplar. [https://docs.microsoft.com/en-us/windows/win32/printdocs/pagewatermark](https://docs.microsoft.com/en-us/windows/win32/printdocs/pagewatermark).

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
## Metoder

| Metod | Beskrivning |
| --- | --- |
| [PageWatermark](./pagewatermark/)(const System::ArrayPtr\<System::SharedPtr\<PageWatermark::IPageWatermarkItem\>\>\&) | Skapar en ny instans. |
## Se även

* Class [Feature](../feature/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Class [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* Class [IPagePrintTicketItem](../ipageprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
