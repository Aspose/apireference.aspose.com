---
title: "Aspose::Page::XPS::Presentation::Image::ImageSaveOptions 类"
linktitle: "ImageSaveOptions"
second_title: "Aspose.Page 适用于 C++"
description: "Aspose::Page::XPS::Presentation::Image::ImageSaveOptions 类。C++ 中用于 XPS 转图像保存选项的基础类。"
type: docs
weight: 200
url: /zh/cpp/aspose.page.xps.presentation.image/imagesaveoptions/
---
## ImageSaveOptions class


用于 XPS-as-image 保存选项的基础类。

```cpp
class ImageSaveOptions : public Aspose::Page::SaveOptions,
                         public Aspose::Page::IMultiPageSaveOptions,
                         public Aspose::Page::XPS::Presentation::IPipelineOptions,
                         public Aspose::Page::XPS::Presentation::IEventBasedModificationOptions
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [get_BatchSize](./get_batchsize/)() override | 指定从一个节点传递到另一个节点的页面块的大小。 |
| [get_BeforePageSavingEventHandlers](./get_beforepagesavingeventhandlers/)() override | 在页面保存之前执行修改的事件处理程序集合，用于 [XPS](../../aspose.page.xps/) 页面。 |
| [get_ImageSize](./get_imagesize/)() const | 获取/设置输出图像的尺寸（像素）。 |
| [get_InterpolationMode](./get_interpolationmode/)() const | 获取/设置插值模式。 |
| [get_PageNumbers](./get_pagenumbers/)() override | 获取/设置要转换的页码数组。 |
| [get_Resolution](./get_resolution/)() const | 获取/设置图像分辨率。 |
| [get_SmoothingMode](./get_smoothingmode/)() const | 获取/设置平滑模式。 |
| [get_TextRenderingHint](./get_textrenderinghint/)() const | 获取/设置文本渲染提示。 |
| [ImageSaveOptions](./imagesaveoptions/)() | 创建选项的新实例。 |
| [set_BatchSize](./set_batchsize/)(int32_t) override | 指定从一个节点传递到另一个节点的页面块的大小。 |
| [set_ImageSize](./set_imagesize/)(System::Drawing::Size) | 获取/设置输出图像的尺寸（像素）。 |
| [set_InterpolationMode](./set_interpolationmode/)(System::Drawing::Drawing2D::InterpolationMode) | 获取/设置插值模式。 |
| [set_PageNumbers](./set_pagenumbers/)(System::ArrayPtr\<int32_t\>) override | 获取/设置要转换的页码数组。 |
| [set_Resolution](./set_resolution/)(float) | 获取/设置图像分辨率。 |
| [set_SmoothingMode](./set_smoothingmode/)(System::Drawing::Drawing2D::SmoothingMode) | 获取/设置平滑模式。 |
| [set_TextRenderingHint](./set_textrenderinghint/)(System::Drawing::Text::TextRenderingHint) | 获取/设置文本渲染提示。 |
## 另见

* Class [SaveOptions](../../aspose.page/saveoptions/)
* Class [IMultiPageSaveOptions](../../aspose.page/imultipagesaveoptions/)
* Class [IPipelineOptions](../../aspose.page.xps.presentation/ipipelineoptions/)
* Class [IEventBasedModificationOptions](../../aspose.page.xps.presentation/ieventbasedmodificationoptions/)
* Namespace [Aspose::Page::XPS::Presentation::Image](../)
* Library [Aspose.Page for C++](../../)
