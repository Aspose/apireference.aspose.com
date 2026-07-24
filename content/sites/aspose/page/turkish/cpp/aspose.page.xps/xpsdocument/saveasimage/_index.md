---
title: "Aspose::Page::XPS::XpsDocument::SaveAsImage yöntemi"
linktitle: "SaveAsImage"
second_title: "Aspose.Page için C++"
description: "Aspose::Page::XPS::XpsDocument::SaveAsImage yöntemi. Belgeyi bir görüntü dosyasına kaydeder. Çıktı dizini ve dosya adı, giriş XPS dosyasındakine aynı olacaktır. Dosya uzantısı, \"options\" parametresindeki görüntü formatına karşılık gelir. Belge, FileStream olmayan bir akışla başlatıldıysa, görüntü dosyası C++'da varsayılan dosya adı şablonu ile geçerli klasöre kaydedilir."
type: docs
weight: 5500
url: /tr/cpp/aspose.page.xps/xpsdocument/saveasimage/
---
## XpsDocument::SaveAsImage(System::SharedPtr\<Presentation::Image::ImageSaveOptions\>) method


Belgeyi görüntü dosyasına kaydeder. Çıktı dizini ve dosya adı, giriş [XPS](../../) dosyasından aynı olacaktır. Dosya uzantısı, "options" parametresindeki görüntü formatına karşılık gelir. Belge, FileStream olmayan bir akışla başlatıldıysa, görüntü dosyası varsayılan dosya adı şablonu ile geçerli klasöre kaydedilir.

```cpp
void Aspose::Page::XPS::XpsDocument::SaveAsImage(System::SharedPtr<Presentation::Image::ImageSaveOptions> options)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| seçenekler | System::SharedPtr\<Presentation::Image::ImageSaveOptions\> | Belgeyi bitmap görüntü formatında kaydetmek için seçenekler. |

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [ImageSaveOptions](../../../aspose.page.xps.presentation.image/imagesaveoptions/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
## XpsDocument::SaveAsImage(System::SharedPtr\<Presentation::Image::ImageSaveOptions\>, System::String, System::String) method


Belgeyi belirtilen dizine, belirtilen dosya adıyla görüntü dosyasına kaydeder. Dosya uzantısı, "options" parametresindeki görüntü formatına karşılık gelir.

```cpp
void Aspose::Page::XPS::XpsDocument::SaveAsImage(System::SharedPtr<Presentation::Image::ImageSaveOptions> options, System::String outDir, System::String fileNameTemplate)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| seçenekler | System::SharedPtr\<Presentation::Image::ImageSaveOptions\> | Belgeyi bitmap görüntü formatında kaydetmek için seçenekler. |
| outDir | System::String | Görüntü dosyasının kaydedileceği çıktı dizini. |
| fileNameTemplate | System::String | Görüntü için dosya adı şablonu (uzantısız). Giriş [XPS](../../) dosyası tek sayfalı ise tam olarak dosya adı olur, aksi takdirde "_[n]", burada "n" 0'dan başlayan sayfa numarasıdır, bu ek bu şablona eklenecektir. Dosya uzantısı, "option" parametresindeki görüntü formatına karşılık gelir. |

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [ImageSaveOptions](../../../aspose.page.xps.presentation.image/imagesaveoptions/)
* Class [String](../../../system/string/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
