---
title: "Aspose::Page::XPS::XpsMetadata::PageWatermark class"
linktitle: "PageWatermark"
second_title: "Aspose.Page para C++"
description: "Aspose::Page::XPS::XpsMetadata::PageWatermark clase. Describe la configuración de marca de agua de la salida y las características de la marca de agua. Las marcas de agua se aplican a la página lógica, no a la página física. Por ejemplo, si DocumentDuplex está habilitado, una marca de agua aparecerá en cada página NUp en cada hoja. Si DocumentDuplex, PagesPerSheet=2, entonces cada hoja tendrá 2 marcas de agua.  en C++."
type: docs
weight: 13100
url: /es/cpp/aspose.page.xps.xpsmetadata/pagewatermark/
---
## PageWatermark class


Describe la configuración de marca de agua de la salida y las características de la marca de agua. Las marcas de agua se aplican a la página lógica, no a la página física. Por ejemplo, si [DocumentDuplex](../documentduplex/) está habilitado, una marca de agua aparecerá en cada **[NUp](../nup/)** página en cada hoja. Si [DocumentDuplex](../documentduplex/), **PagesPerSheet**=2, entonces cada hoja tendrá 2 marcas de agua. [https://docs.microsoft.com/en-us/windows/win32/printdocs/pagewatermark](https://docs.microsoft.com/en-us/windows/win32/printdocs/pagewatermark).

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
## Métodos

| Método | Descripción |
| --- | --- |
| [PageWatermark](./pagewatermark/)(const System::ArrayPtr\<System::SharedPtr\<PageWatermark::IPageWatermarkItem\>\>\&) | Crea una nueva instancia. |
## Ver también

* Class [Feature](../feature/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Class [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* Class [IPagePrintTicketItem](../ipageprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
