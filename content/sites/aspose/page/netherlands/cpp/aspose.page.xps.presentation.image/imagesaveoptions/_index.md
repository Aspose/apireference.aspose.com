---
title: "Aspose::Page::XPS::Presentation::Image::ImageSaveOptions class"
linktitle: "ImageSaveOptions"
second_title: "Aspose.Page voor C++"
description: "Aspose::Page::XPS::Presentation::Image::ImageSaveOptions class. Basis‑klasse voor XPS-als-afbeelding opslagopties in C++."
type: docs
weight: 200
url: /nl/cpp/aspose.page.xps.presentation.image/imagesaveoptions/
---
## ImageSaveOptions class


Basis‑klasse voor XPS-als-afbeelding opslagopties.

```cpp
class ImageSaveOptions : public Aspose::Page::SaveOptions,
                         public Aspose::Page::IMultiPageSaveOptions,
                         public Aspose::Page::XPS::Presentation::IPipelineOptions,
                         public Aspose::Page::XPS::Presentation::IEventBasedModificationOptions
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [get_BatchSize](./get_batchsize/)() override | Specificeert de grootte van een deel van pagina's dat van node naar node wordt doorgegeven. |
| [get_BeforePageSavingEventHandlers](./get_beforepagesavingeventhandlers/)() override | De verzameling van gebeurtenishandlers die wijzigingen uitvoert op een [XPS](../../aspose.page.xps/) pagina vlak voordat deze wordt opgeslagen. |
| [get_ImageSize](./get_imagesize/)() const | Haalt op/zet de grootte van de uitvoerafbeeldingen in pixels. |
| [get_InterpolationMode](./get_interpolationmode/)() const | Haalt op/zet de interpolatiemodus. |
| [get_PageNumbers](./get_pagenumbers/)() override | Haalt op/zet de array met paginanummers die moeten worden geconverteerd. |
| [get_Resolution](./get_resolution/)() const | Haalt op/zet de afbeeldingsresolutie. |
| [get_SmoothingMode](./get_smoothingmode/)() const | Haalt op/zet de verzachtingsmodus. |
| [get_TextRenderingHint](./get_textrenderinghint/)() const | Opvragen/instellen van de tekstweergavehint. |
| [ImageSaveOptions](./imagesaveoptions/)() | Maakt een nieuwe instantie van opties aan. |
| [set_BatchSize](./set_batchsize/)(int32_t) override | Specificeert de grootte van een deel van pagina's dat van node naar node wordt doorgegeven. |
| [set_ImageSize](./set_imagesize/)(System::Drawing::Size) | Haalt op/zet de grootte van de uitvoerafbeeldingen in pixels. |
| [set_InterpolationMode](./set_interpolationmode/)(System::Drawing::Drawing2D::InterpolationMode) | Haalt op/zet de interpolatiemodus. |
| [set_PageNumbers](./set_pagenumbers/)(System::ArrayPtr\<int32_t\>) override | Haalt op/zet de array met paginanummers die moeten worden geconverteerd. |
| [set_Resolution](./set_resolution/)(float) | Haalt op/zet de afbeeldingsresolutie. |
| [set_SmoothingMode](./set_smoothingmode/)(System::Drawing::Drawing2D::SmoothingMode) | Haalt op/zet de verzachtingsmodus. |
| [set_TextRenderingHint](./set_textrenderinghint/)(System::Drawing::Text::TextRenderingHint) | Opvragen/instellen van de tekstweergavehint. |
## Zie ook

* Class [SaveOptions](../../aspose.page/saveoptions/)
* Class [IMultiPageSaveOptions](../../aspose.page/imultipagesaveoptions/)
* Class [IPipelineOptions](../../aspose.page.xps.presentation/ipipelineoptions/)
* Class [IEventBasedModificationOptions](../../aspose.page.xps.presentation/ieventbasedmodificationoptions/)
* Namespace [Aspose::Page::XPS::Presentation::Image](../)
* Library [Aspose.Page for C++](../../)
