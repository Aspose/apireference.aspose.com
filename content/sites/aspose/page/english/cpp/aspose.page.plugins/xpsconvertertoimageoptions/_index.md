---
title: Aspose::Page::Plugins::XpsConverterToImageOptions class
linktitle: XpsConverterToImageOptions
second_title: Aspose.Page for C++
description: 'Aspose::Page::Plugins::XpsConverterToImageOptions class. Represents XPS to Image converter options for XpsConverter plugin in C++.'
type: docs
weight: 2100
url: /cpp/aspose.page.plugins/xpsconvertertoimageoptions/
---
## XpsConverterToImageOptions class


Represents [XPS](../../aspose.page.xps/) to Image converter options for [XpsConverter](../xpsconverter/) plugin.

```cpp
class XpsConverterToImageOptions : public Aspose::Page::Plugins::XpsConverterOptions
```

## Methods

| Method | Description |
| --- | --- |
| [get_ImageFormat](./get_imageformat/)() const | Gets/sets the image type. |
| [get_OperationName](./get_operationname/)() override | Returns operation name. |
| [get_PageNumbers](./get_pagenumbers/)() const | Gets/sets the array of numbers of pages in [XPS](../../aspose.page.xps/) document to convert. If not set all pages will be converted. |
| [get_Resolution](./get_resolution/)() const | Gets/sets the image resolution. |
| [get_Size](./get_size/)() const | Gets/sets the size of the resulting image. |
| [get_SmoothingMode](./get_smoothingmode/)() const | Gets/sets the smoothing mode for rendering image. |
| [set_ImageFormat](./set_imageformat/)(Aspose::Page::Drawing::Imaging::ImageFormat) | Gets/sets the image type. |
| [set_PageNumbers](./set_pagenumbers/)(System::ArrayPtr\<int32_t\>) | Gets/sets the array of numbers of pages in [XPS](../../aspose.page.xps/) document to convert. If not set all pages will be converted. |
| [set_Resolution](./set_resolution/)(float) | Gets/sets the image resolution. |
| [set_Size](./set_size/)(System::Drawing::Size) | Gets/sets the size of the resulting image. |
| [set_SmoothingMode](./set_smoothingmode/)(System::Nullable\<System::Drawing::Drawing2D::SmoothingMode\>) | Gets/sets the smoothing mode for rendering image. |
| [XpsConverterToImageOptions](./xpsconvertertoimageoptions/)() | Initializes new instance of the [XpsConverterToImageOptions](./) object with default options. |
| [XpsConverterToImageOptions](./xpsconvertertoimageoptions/)(Aspose::Page::Drawing::Imaging::ImageFormat) | Initializes new instance of the [XpsConverterToImageOptions](./) object with image format. |
| [XpsConverterToImageOptions](./xpsconvertertoimageoptions/)(System::Drawing::Size) | Initializes new instance of the [XpsConverterToImageOptions](./) object with a size of the resulting image. |
| [XpsConverterToImageOptions](./xpsconvertertoimageoptions/)(Aspose::Page::Drawing::Imaging::ImageFormat, System::Drawing::Size) | Initializes new instance of the [XpsConverterToImageOptions](./) object with image format and a size of the resulting image. |
## See Also

* Class [XpsConverterOptions](../xpsconverteroptions/)
* Namespace [Aspose::Page::Plugins](../)
* Library [Aspose.Page for C++](../../)
