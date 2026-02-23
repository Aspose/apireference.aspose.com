---
title: Aspose::Page::XPS::Presentation::Image::ImageSaveOptions class
linktitle: ImageSaveOptions
second_title: Aspose.Page for C++
description: 'Aspose::Page::XPS::Presentation::Image::ImageSaveOptions class. Basic class for XPS-as-image saving options in C++.'
type: docs
weight: 200
url: /cpp/aspose.page.xps.presentation.image/imagesaveoptions/
---
## ImageSaveOptions class


Basic class for XPS-as-image saving options.

```cpp
class ImageSaveOptions : public Aspose::Page::SaveOptions,
                         public Aspose::Page::IMultiPageSaveOptions,
                         public Aspose::Page::XPS::Presentation::IPipelineOptions,
                         public Aspose::Page::XPS::Presentation::IEventBasedModificationOptions
```

## Methods

| Method | Description |
| --- | --- |
| [get_BatchSize](./get_batchsize/)() override | Specifies the size of a portion of pages to pass from node to node. |
| [get_BeforePageSavingEventHandlers](./get_beforepagesavingeventhandlers/)() override | The collection of event handlers that performs modifications to an [XPS](../../aspose.page.xps/) page just before it is saved. |
| [get_ImageSize](./get_imagesize/)() const | Gets/sets the size of the output images in pixels. |
| [get_InterpolationMode](./get_interpolationmode/)() const | Gets/sets the interpolation mode. |
| [get_PageNumbers](./get_pagenumbers/)() override | Gets/sets the array of numbers of pages to convert. |
| [get_Resolution](./get_resolution/)() const | Gets/sets the image resolution. |
| [get_SmoothingMode](./get_smoothingmode/)() const | Gets/sets the smoothing mode. |
| [get_TextRenderingHint](./get_textrenderinghint/)() const | Gets/sets the text rendering hint. |
| [ImageSaveOptions](./imagesaveoptions/)() | Creates new instance of options. |
| [set_BatchSize](./set_batchsize/)(int32_t) override | Specifies the size of a portion of pages to pass from node to node. |
| [set_ImageSize](./set_imagesize/)(System::Drawing::Size) | Gets/sets the size of the output images in pixels. |
| [set_InterpolationMode](./set_interpolationmode/)(System::Drawing::Drawing2D::InterpolationMode) | Gets/sets the interpolation mode. |
| [set_PageNumbers](./set_pagenumbers/)(System::ArrayPtr\<int32_t\>) override | Gets/sets the array of numbers of pages to convert. |
| [set_Resolution](./set_resolution/)(float) | Gets/sets the image resolution. |
| [set_SmoothingMode](./set_smoothingmode/)(System::Drawing::Drawing2D::SmoothingMode) | Gets/sets the smoothing mode. |
| [set_TextRenderingHint](./set_textrenderinghint/)(System::Drawing::Text::TextRenderingHint) | Gets/sets the text rendering hint. |
## See Also

* Class [SaveOptions](../../aspose.page/saveoptions/)
* Class [IMultiPageSaveOptions](../../aspose.page/imultipagesaveoptions/)
* Class [IPipelineOptions](../../aspose.page.xps.presentation/ipipelineoptions/)
* Class [IEventBasedModificationOptions](../../aspose.page.xps.presentation/ieventbasedmodificationoptions/)
* Namespace [Aspose::Page::XPS::Presentation::Image](../)
* Library [Aspose.Page for C++](../../)
