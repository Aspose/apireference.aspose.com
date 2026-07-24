---
title: "Aspose::Page::XPS::Presentation::Image::ImageSaveOptions class"
linktitle: "ImageSaveOptions"
second_title: "Aspose.Page için C++"
description: "Aspose::Page::XPS::Presentation::Image::ImageSaveOptions class. C++'da XPS-yi-görüntü olarak kaydetme seçenekleri için temel sınıf."
type: docs
weight: 200
url: /tr/cpp/aspose.page.xps.presentation.image/imagesaveoptions/
---
## ImageSaveOptions class


XPS-as-image kaydetme seçenekleri için temel sınıf.

```cpp
class ImageSaveOptions : public Aspose::Page::SaveOptions,
                         public Aspose::Page::IMultiPageSaveOptions,
                         public Aspose::Page::XPS::Presentation::IPipelineOptions,
                         public Aspose::Page::XPS::Presentation::IEventBasedModificationOptions
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [get_BatchSize](./get_batchsize/)() override | Düğümden düğüme geçecek sayfa bölümünün boyutunu belirtir. |
| [get_BeforePageSavingEventHandlers](./get_beforepagesavingeventhandlers/)() override | Kaydedilmeden hemen önce bir [XPS](../../aspose.page.xps/) sayfasına değişiklik yapan olay işleyicileri koleksiyonu. |
| [get_ImageSize](./get_imagesize/)() const | Çıktı görüntülerinin piksel cinsinden boyutunu alır/ayarlar. |
| [get_InterpolationMode](./get_interpolationmode/)() const | Enterpolasyon modunu alır/ayarlar. |
| [get_PageNumbers](./get_pagenumbers/)() override | Dönüştürülecek sayfa numaralarının dizisini alır/ayar. |
| [get_Resolution](./get_resolution/)() const | Görüntü çözünürlüğünü alır/ayarlar. |
| [get_SmoothingMode](./get_smoothingmode/)() const | Yumuşatma modunu alır/ayarlar. |
| [get_TextRenderingHint](./get_textrenderinghint/)() const | Metin renderleme ipucunu alır/ayarlar. |
| [ImageSaveOptions](./imagesaveoptions/)() | Seçeneklerin yeni bir örneğini oluşturur. |
| [set_BatchSize](./set_batchsize/)(int32_t) override | Düğümden düğüme geçecek sayfa bölümünün boyutunu belirtir. |
| [set_ImageSize](./set_imagesize/)(System::Drawing::Size) | Çıktı görüntülerinin piksel cinsinden boyutunu alır/ayarlar. |
| [set_InterpolationMode](./set_interpolationmode/)(System::Drawing::Drawing2D::InterpolationMode) | Enterpolasyon modunu alır/ayarlar. |
| [set_PageNumbers](./set_pagenumbers/)(System::ArrayPtr\<int32_t\>) override | Dönüştürülecek sayfa numaralarının dizisini alır/ayar. |
| [set_Resolution](./set_resolution/)(float) | Görüntü çözünürlüğünü alır/ayarlar. |
| [set_SmoothingMode](./set_smoothingmode/)(System::Drawing::Drawing2D::SmoothingMode) | Yumuşatma modunu alır/ayarlar. |
| [set_TextRenderingHint](./set_textrenderinghint/)(System::Drawing::Text::TextRenderingHint) | Metin renderleme ipucunu alır/ayarlar. |
## Ayrıca Bakınız

* Class [SaveOptions](../../aspose.page/saveoptions/)
* Class [IMultiPageSaveOptions](../../aspose.page/imultipagesaveoptions/)
* Class [IPipelineOptions](../../aspose.page.xps.presentation/ipipelineoptions/)
* Class [IEventBasedModificationOptions](../../aspose.page.xps.presentation/ieventbasedmodificationoptions/)
* Namespace [Aspose::Page::XPS::Presentation::Image](../)
* Library [Aspose.Page for C++](../../)
