---
title: "Aspose::Page::XPS::XpsMetadata::PageWatermark класс"
linktitle: "PageWatermark"
second_title: "Aspose.Page для C++"
description: "Aspose::Page::XPS::XpsMetadata::PageWatermark class. Описывает настройки водяного знака вывода и характеристики водяного знака. Водяные знаки применяются к логической странице, а не к физической странице. Например, если DocumentDuplex включён, водяной знак появится на каждой странице NUp на каждом листе. Если DocumentDuplex, PagesPerSheet=2, то каждый лист будет иметь 2 водяных знака.  in C++."
type: docs
weight: 13100
url: /ru/cpp/aspose.page.xps.xpsmetadata/pagewatermark/
---
## PageWatermark class


Описывает настройки водяного знака вывода и характеристики водяного знака. Водяные знаки применяются к логической странице, а не к физической странице. Например, если [DocumentDuplex](../documentduplex/) включён, водяной знак появится на каждой **[NUp](../nup/)** странице на каждом листе. Если [DocumentDuplex](../documentduplex/), **PagesPerSheet**=2, то каждый лист будет иметь 2 водяных знака. [https://docs.microsoft.com/en-us/windows/win32/printdocs/pagewatermark](https://docs.microsoft.com/en-us/windows/win32/printdocs/pagewatermark).

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
## Методы

| Метод | Описание |
| --- | --- |
| [PageWatermark](./pagewatermark/)(const System::ArrayPtr\<System::SharedPtr\<PageWatermark::IPageWatermarkItem\>\>\&) | Создаёт новый экземпляр. |
## См. также

* Class [Feature](../feature/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Class [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* Class [IPagePrintTicketItem](../ipageprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
