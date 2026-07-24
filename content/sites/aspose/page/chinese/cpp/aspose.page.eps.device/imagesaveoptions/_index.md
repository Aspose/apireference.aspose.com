---
title: "Aspose::Page::EPS::Device::ImageSaveOptions 类"
linktitle: "ImageSaveOptions"
second_title: "Aspose.Page 适用于 C++"
description: "Aspose::Page::EPS::Device::ImageSaveOptions 类。此类包含在 C++ 中管理图像保存过程所需的选项。"
type: docs
weight: 100
url: /zh/cpp/aspose.page.eps.device/imagesaveoptions/
---
## ImageSaveOptions class


此类包含管理图像保存过程所需的选项。

```cpp
class ImageSaveOptions : public Aspose::Page::SaveOptions
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [get_ImageFormat](./get_imageformat/)() const | 获取/设置生成图像的图像格式。 |
| [get_Resolution](./get_resolution/)() const | 获取/设置图像分辨率。 |
| [get_SmoothingMode](./get_smoothingmode/)() const | 获取/设置图像渲染的平滑模式。 |
| [get_TryJoinImageFragments](./get_tryjoinimagefragments/)() const | 用于将图像碎片合并为一张图片的标志。 |
| [ImageSaveOptions](./imagesaveoptions/)() | 初始化一个新的 [ImageSaveOptions](./) 类实例，默认标志 [SuppressErrors](../) 为 (true)，[Debug](../) 为 (false)。 |
| [ImageSaveOptions](./imagesaveoptions/)(Aspose::Page::Drawing::Imaging::ImageFormat) | 初始化一个新的 [ImageSaveOptions](./) 实例，使用指定的图像格式。 |
| [ImageSaveOptions](./imagesaveoptions/)(Aspose::Page::Drawing::Size) | 初始化一个新的 [ImageSaveOptions](./) 实例，使用指定的图像大小。 |
| [ImageSaveOptions](./imagesaveoptions/)(Aspose::Page::Drawing::Size, Aspose::Page::Drawing::Imaging::ImageFormat) | 初始化一个新的 [ImageSaveOptions](./) 实例，使用指定的图像大小和图像格式。 |
| [ImageSaveOptions](./imagesaveoptions/)(Aspose::Page::Drawing::Imaging::ImageFormat, bool) | 初始化一个新的 [ImageSaveOptions](./) 实例，使用指定的图像格式。 |
| [ImageSaveOptions](./imagesaveoptions/)(Aspose::Page::Drawing::Size, bool) | 初始化一个新的 [ImageSaveOptions](./) 实例，使用指定的大小。 |
| [ImageSaveOptions](./imagesaveoptions/)(Aspose::Page::Drawing::Size, Aspose::Page::Drawing::Imaging::ImageFormat, bool) | 初始化一个新的 [ImageSaveOptions](./) 实例，使用指定的图像大小和图像格式。 |
| [ImageSaveOptions](./imagesaveoptions/)(bool) | 初始化一个新的 [ImageSaveOptions](./) 实例，默认标志 [Debug](../) 为 (false)。 |
| [set_ImageFormat](./set_imageformat/)(Aspose::Page::Drawing::Imaging::ImageFormat) | 获取/设置生成图像的图像格式。 |
| [set_Resolution](./set_resolution/)(float) | 获取/设置图像分辨率。 |
| [set_SmoothingMode](./set_smoothingmode/)(System::Nullable\<Aspose::Page::Drawing::Drawing2D::SmoothingMode\>) | 获取/设置图像渲染的平滑模式。 |
| [set_TryJoinImageFragments](./set_tryjoinimagefragments/)(bool) | 用于将图像碎片合并为一张图片的标志。 |
## 另见

* Class [SaveOptions](../../aspose.page/saveoptions/)
* Namespace [Aspose::Page::EPS::Device](../)
* Library [Aspose.Page for C++](../../)
