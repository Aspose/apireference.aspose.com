---
title: "Aspose::Page::XPS::Presentation::Image::ImageSaveOptions klass"
linktitle: "ImageSaveOptions"
second_title: "Aspose.Page för C++"
description: "Aspose::Page::XPS::Presentation::Image::ImageSaveOptions klass. Grundläggande klass för XPS-som-bild sparalternativ i C++."
type: docs
weight: 200
url: /sv/cpp/aspose.page.xps.presentation.image/imagesaveoptions/
---
## ImageSaveOptions class


Grundläggande klass för XPS-som-bild sparalternativ.

```cpp
class ImageSaveOptions : public Aspose::Page::SaveOptions,
                         public Aspose::Page::IMultiPageSaveOptions,
                         public Aspose::Page::XPS::Presentation::IPipelineOptions,
                         public Aspose::Page::XPS::Presentation::IEventBasedModificationOptions
```

## Metoder

| Metod | Beskrivning |
| --- | --- |
| [get_BatchSize](./get_batchsize/)() override | Anger storleken på en del av sidorna som ska överföras från nod till nod. |
| [get_BeforePageSavingEventHandlers](./get_beforepagesavingeventhandlers/)() override | Samlingen av händelsehanterare som utför modifieringar av en [XPS](../../aspose.page.xps/)‑sida precis innan den sparas. |
| [get_ImageSize](./get_imagesize/)() const | Hämtar/sätter storleken på utdata-bilderna i pixlar. |
| [get_InterpolationMode](./get_interpolationmode/)() const | Hämtar/sätter interpolationsläget. |
| [get_PageNumbers](./get_pagenumbers/)() override | Hämtar/ställer in arrayen med sidnummer som ska konverteras. |
| [get_Resolution](./get_resolution/)() const | Hämtar/anger bildupplösningen. |
| [get_SmoothingMode](./get_smoothingmode/)() const | Hämtar/sätter jämningsläget. |
| [get_TextRenderingHint](./get_textrenderinghint/)() const | Hämtar/sätter tipset för textåtergivning. |
| [ImageSaveOptions](./imagesaveoptions/)() | Skapar en ny instans av alternativ. |
| [set_BatchSize](./set_batchsize/)(int32_t) override | Anger storleken på en del av sidorna som ska överföras från nod till nod. |
| [set_ImageSize](./set_imagesize/)(System::Drawing::Size) | Hämtar/sätter storleken på utdata-bilderna i pixlar. |
| [set_InterpolationMode](./set_interpolationmode/)(System::Drawing::Drawing2D::InterpolationMode) | Hämtar/sätter interpolationsläget. |
| [set_PageNumbers](./set_pagenumbers/)(System::ArrayPtr\<int32_t\>) override | Hämtar/ställer in arrayen med sidnummer som ska konverteras. |
| [set_Resolution](./set_resolution/)(float) | Hämtar/anger bildupplösningen. |
| [set_SmoothingMode](./set_smoothingmode/)(System::Drawing::Drawing2D::SmoothingMode) | Hämtar/sätter jämningsläget. |
| [set_TextRenderingHint](./set_textrenderinghint/)(System::Drawing::Text::TextRenderingHint) | Hämtar/sätter tipset för textåtergivning. |
## Se även

* Class [SaveOptions](../../aspose.page/saveoptions/)
* Class [IMultiPageSaveOptions](../../aspose.page/imultipagesaveoptions/)
* Class [IPipelineOptions](../../aspose.page.xps.presentation/ipipelineoptions/)
* Class [IEventBasedModificationOptions](../../aspose.page.xps.presentation/ieventbasedmodificationoptions/)
* Namespace [Aspose::Page::XPS::Presentation::Image](../)
* Library [Aspose.Page for C++](../../)
