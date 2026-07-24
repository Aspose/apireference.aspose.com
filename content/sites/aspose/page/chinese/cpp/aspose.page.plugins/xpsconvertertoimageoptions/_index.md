---
title: "Aspose::Page::Plugins::XpsConverterToImageOptions 类"
linktitle: "XpsConverterToImageOptions"
second_title: "Aspose.Page 适用于 C++"
description: "Aspose::Page::Plugins::XpsConverterToImageOptions 类。表示用于 C++ 中 XpsConverter 插件的 XPS 到图像转换器选项。"
type: docs
weight: 2100
url: /zh/cpp/aspose.page.plugins/xpsconvertertoimageoptions/
---
## XpsConverterToImageOptions class


表示 [XPS](../../aspose.page.xps/) 到图像的转换器选项，适用于 [XpsConverter](../xpsconverter/) 插件。

```cpp
class XpsConverterToImageOptions : public Aspose::Page::Plugins::XpsConverterOptions
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [get_ImageFormat](./get_imageformat/)() const | 获取/设置图像类型。 |
| [get_OperationName](./get_operationname/)() override | 返回操作名称。 |
| [get_PageNumbers](./get_pagenumbers/)() const | 获取/设置要转换的 [XPS](../../aspose.page.xps/) 文档中页码的数组。如果未设置，将转换所有页。 |
| [get_Resolution](./get_resolution/)() const | 获取/设置图像分辨率。 |
| [get_Size](./get_size/)() const | 获取/设置生成图像的尺寸。 |
| [get_SmoothingMode](./get_smoothingmode/)() const | 获取/设置图像渲染的平滑模式。 |
| [set_ImageFormat](./set_imageformat/)(Aspose::Page::Drawing::Imaging::ImageFormat) | 获取/设置图像类型。 |
| [set_PageNumbers](./set_pagenumbers/)(System::ArrayPtr\<int32_t\>) | 获取/设置要转换的 [XPS](../../aspose.page.xps/) 文档中页码的数组。如果未设置，将转换所有页。 |
| [set_Resolution](./set_resolution/)(float) | 获取/设置图像分辨率。 |
| [set_Size](./set_size/)(System::Drawing::Size) | 获取/设置生成图像的尺寸。 |
| [set_SmoothingMode](./set_smoothingmode/)(System::Nullable\<System::Drawing::Drawing2D::SmoothingMode\>) | 获取/设置图像渲染的平滑模式。 |
| [XpsConverterToImageOptions](./xpsconvertertoimageoptions/)() | 使用默认选项初始化 [XpsConverterToImageOptions](./) 对象的新实例。 |
| [XpsConverterToImageOptions](./xpsconvertertoimageoptions/)(Aspose::Page::Drawing::Imaging::ImageFormat) | 使用图像格式初始化 [XpsConverterToImageOptions](./) 对象的新实例。 |
| [XpsConverterToImageOptions](./xpsconvertertoimageoptions/)(System::Drawing::Size) | 使用生成图像的尺寸初始化 [XpsConverterToImageOptions](./) 对象的新实例。 |
| [XpsConverterToImageOptions](./xpsconvertertoimageoptions/)(Aspose::Page::Drawing::Imaging::ImageFormat, System::Drawing::Size) | 使用图像格式和生成图像的尺寸初始化 [XpsConverterToImageOptions](./) 对象的新实例。 |
## 另见

* Class [XpsConverterOptions](../xpsconverteroptions/)
* Namespace [Aspose::Page::Plugins](../)
* Library [Aspose.Page for C++](../../)
