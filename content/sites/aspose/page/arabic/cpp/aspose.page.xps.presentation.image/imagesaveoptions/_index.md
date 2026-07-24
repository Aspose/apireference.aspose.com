---
title: "فئة Aspose::Page::XPS::Presentation::Image::ImageSaveOptions"
linktitle: "ImageSaveOptions"
second_title: "Aspose.Page لـ C++"
description: "فئة Aspose::Page::XPS::Presentation::Image::ImageSaveOptions. فئة أساسية لخيارات حفظ XPS كصورة في C++."
type: docs
weight: 200
url: /ar/cpp/aspose.page.xps.presentation.image/imagesaveoptions/
---
## ImageSaveOptions class


فئة أساسية لخيارات حفظ XPS كصورة.

```cpp
class ImageSaveOptions : public Aspose::Page::SaveOptions,
                         public Aspose::Page::IMultiPageSaveOptions,
                         public Aspose::Page::XPS::Presentation::IPipelineOptions,
                         public Aspose::Page::XPS::Presentation::IEventBasedModificationOptions
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [get_BatchSize](./get_batchsize/)() override | يحدد حجم جزء من الصفحات لتمريره من عقدة إلى أخرى. |
| [get_BeforePageSavingEventHandlers](./get_beforepagesavingeventhandlers/)() override | مجموعة معالجات الأحداث التي تُجري تعديلات على صفحة [XPS](../../aspose.page.xps/) قبل حفظها مباشرةً. |
| [get_ImageSize](./get_imagesize/)() const | يحصل/يضبط حجم الصور الناتجة بالبكسل. |
| [get_InterpolationMode](./get_interpolationmode/)() const | يحصل/يضبط وضع الاستيفاء. |
| [get_PageNumbers](./get_pagenumbers/)() override | يحصل على/يضبط مصفوفة أرقام الصفحات للتحويل. |
| [get_Resolution](./get_resolution/)() const | يحصل/يضبط دقة الصورة. |
| [get_SmoothingMode](./get_smoothingmode/)() const | يحصل/يضبط وضع التنعيم. |
| [get_TextRenderingHint](./get_textrenderinghint/)() const | يحصل/يضبط تلميح عرض النص. |
| [ImageSaveOptions](./imagesaveoptions/)() | ينشئ نسخة جديدة من الخيارات. |
| [set_BatchSize](./set_batchsize/)(int32_t) override | يحدد حجم جزء من الصفحات لتمريره من عقدة إلى أخرى. |
| [set_ImageSize](./set_imagesize/)(System::Drawing::Size) | يحصل/يضبط حجم الصور الناتجة بالبكسل. |
| [set_InterpolationMode](./set_interpolationmode/)(System::Drawing::Drawing2D::InterpolationMode) | يحصل/يضبط وضع الاستيفاء. |
| [set_PageNumbers](./set_pagenumbers/)(System::ArrayPtr\<int32_t\>) override | يحصل على/يضبط مصفوفة أرقام الصفحات للتحويل. |
| [set_Resolution](./set_resolution/)(float) | يحصل/يضبط دقة الصورة. |
| [set_SmoothingMode](./set_smoothingmode/)(System::Drawing::Drawing2D::SmoothingMode) | يحصل/يضبط وضع التنعيم. |
| [set_TextRenderingHint](./set_textrenderinghint/)(System::Drawing::Text::TextRenderingHint) | يحصل/يضبط تلميح عرض النص. |
## انظر أيضًا

* Class [SaveOptions](../../aspose.page/saveoptions/)
* Class [IMultiPageSaveOptions](../../aspose.page/imultipagesaveoptions/)
* Class [IPipelineOptions](../../aspose.page.xps.presentation/ipipelineoptions/)
* Class [IEventBasedModificationOptions](../../aspose.page.xps.presentation/ieventbasedmodificationoptions/)
* Namespace [Aspose::Page::XPS::Presentation::Image](../)
* Library [Aspose.Page for C++](../../)
