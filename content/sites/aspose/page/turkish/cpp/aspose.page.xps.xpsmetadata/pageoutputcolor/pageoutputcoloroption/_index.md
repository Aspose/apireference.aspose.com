---
title: "Aspose::Page::XPS::XpsMetadata::PageOutputColor::PageOutputColorOption sınıfı"
linktitle: "PageOutputColorOption"
second_title: "Aspose.Page için C++"
description: "Aspose::Page::XPS::XpsMetadata::PageOutputColor::PageOutputColorOption sınıfı. C++'da PageOutputColor özelliği seçeneklerini açıklar."
type: docs
weight: 400
url: /tr/cpp/aspose.page.xps.xpsmetadata/pageoutputcolor/pageoutputcoloroption/
---
## PageOutputColorOption class


[PageOutputColor](../) özelliği seçeneklerini açıklar.

```cpp
class PageOutputColorOption : public Aspose::Page::XPS::XpsMetadata::Option,
                              public Aspose::Page::XPS::XpsMetadata::PageOutputColor::IPageOutputColorItem
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [Add](./add/)(const System::ArrayPtr\<System::SharedPtr\<PageOutputColor::IPageOutputColorOptionItem\>\>\&) | Seçeneğe [IPageOutputColorOptionItem](../ipageoutputcoloroptionitem/) örneklerinden oluşan bir dizi ekler. |
| static [Color](./color/)(int32_t, int32_t) | Çıktının renkli olması gerektiğini belirtir. |
| static [Grayscale](./grayscale/)(int32_t, int32_t) | Çıktının gri tonlamalı olması gerektiğini belirtir. |
| static [Monochrome](./monochrome/)(int32_t, int32_t) | Çıktının tek renk (Siyah) olması gerektiğini belirtir. |
| [PageOutputColorOption](./pageoutputcoloroption/)(System::String, const System::ArrayPtr\<System::SharedPtr\<PageOutputColor::IPageOutputColorOptionItem\>\>\&) | Yeni bir örnek oluşturur. |
## Ayrıca Bakınız

* Class [Option](../../option/)
* Class [IPageOutputColorItem](../ipageoutputcoloritem/)
* Class [PageOutputColor](../)
* Namespace [Aspose::Page::XPS::XpsMetadata](../../)
* Library [Aspose.Page for C++](../../../)
