---
title: "Aspose::Page::XPS::Presentation::Image::ImageSaveOptions класс"
linktitle: "ImageSaveOptions"
second_title: "Aspose.Page для C++"
description: "Aspose::Page::XPS::Presentation::Image::ImageSaveOptions класс. Базовый класс для параметров сохранения XPS как изображение в C++."
type: docs
weight: 200
url: /ru/cpp/aspose.page.xps.presentation.image/imagesaveoptions/
---
## ImageSaveOptions class


Базовый класс параметров сохранения XPS‑as‑image.

```cpp
class ImageSaveOptions : public Aspose::Page::SaveOptions,
                         public Aspose::Page::IMultiPageSaveOptions,
                         public Aspose::Page::XPS::Presentation::IPipelineOptions,
                         public Aspose::Page::XPS::Presentation::IEventBasedModificationOptions
```

## Методы

| Метод | Описание |
| --- | --- |
| [get_BatchSize](./get_batchsize/)() override | Указывает размер части страниц, передаваемых от узла к узлу. |
| [get_BeforePageSavingEventHandlers](./get_beforepagesavingeventhandlers/)() override | Коллекция обработчиков событий, выполняющих модификации страницы [XPS](../../aspose.page.xps/) непосредственно перед её сохранением. |
| [get_ImageSize](./get_imagesize/)() const | Получает/устанавливает размер выходных изображений в пикселях. |
| [get_InterpolationMode](./get_interpolationmode/)() const | Получает/устанавливает режим интерполяции. |
| [get_PageNumbers](./get_pagenumbers/)() override | Получает/устанавливает массив номеров страниц для конвертации. |
| [get_Resolution](./get_resolution/)() const | Получает/устанавливает разрешение изображения. |
| [get_SmoothingMode](./get_smoothingmode/)() const | Получает/устанавливает режим сглаживания. |
| [get_TextRenderingHint](./get_textrenderinghint/)() const | Получает/устанавливает подсказку рендеринга текста. |
| [ImageSaveOptions](./imagesaveoptions/)() | Создаёт новый экземпляр параметров. |
| [set_BatchSize](./set_batchsize/)(int32_t) override | Указывает размер части страниц, передаваемых от узла к узлу. |
| [set_ImageSize](./set_imagesize/)(System::Drawing::Size) | Получает/устанавливает размер выходных изображений в пикселях. |
| [set_InterpolationMode](./set_interpolationmode/)(System::Drawing::Drawing2D::InterpolationMode) | Получает/устанавливает режим интерполяции. |
| [set_PageNumbers](./set_pagenumbers/)(System::ArrayPtr\<int32_t\>) override | Получает/устанавливает массив номеров страниц для конвертации. |
| [set_Resolution](./set_resolution/)(float) | Получает/устанавливает разрешение изображения. |
| [set_SmoothingMode](./set_smoothingmode/)(System::Drawing::Drawing2D::SmoothingMode) | Получает/устанавливает режим сглаживания. |
| [set_TextRenderingHint](./set_textrenderinghint/)(System::Drawing::Text::TextRenderingHint) | Получает/устанавливает подсказку рендеринга текста. |
## См. также

* Class [SaveOptions](../../aspose.page/saveoptions/)
* Class [IMultiPageSaveOptions](../../aspose.page/imultipagesaveoptions/)
* Class [IPipelineOptions](../../aspose.page.xps.presentation/ipipelineoptions/)
* Class [IEventBasedModificationOptions](../../aspose.page.xps.presentation/ieventbasedmodificationoptions/)
* Namespace [Aspose::Page::XPS::Presentation::Image](../)
* Library [Aspose.Page for C++](../../)
