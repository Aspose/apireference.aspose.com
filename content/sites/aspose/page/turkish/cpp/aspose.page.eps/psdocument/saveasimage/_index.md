---
title: "Aspose::Page::EPS::PsDocument::SaveAsImage yöntemi"
linktitle: "SaveAsImage"
second_title: "Aspose.Page için C++"
description: "Aspose::Page::EPS::PsDocument::SaveAsImage yöntemi. PS/EPS dosyasını görüntü dosyasına kaydeder. Çıktı dizini ve dosya adı, giriş PS dosyasındakine aynı olacaktır. Dosya uzantısı, \"options\" parametresindeki görüntü formatına karşılık gelir. Belge, FileStream olmayan bir akışla başlatıldıysa, görüntü dosyası C++'da varsayılan dosya adı şablonu ile geçerli klasöre kaydedilir."
type: docs
weight: 4300
url: /tr/cpp/aspose.page.eps/psdocument/saveasimage/
---
## PsDocument::SaveAsImage(System::SharedPtr\<Device::ImageSaveOptions\>) method


PS/EPS dosyasını görüntü dosyasına kaydeder. Çıktı dizini ve dosya adı, giriş PS dosyasındakilerle aynı olacaktır. Dosya uzantısı, "options" parametresindeki görüntü formatına karşılık gelir. Belge, FileStream olmayan bir akışla başlatıldıysa, görüntü dosyası mevcut klasörde varsayılan dosya adı şablonu ile kaydedilir.

```cpp
void Aspose::Page::EPS::PsDocument::SaveAsImage(System::SharedPtr<Device::ImageSaveOptions> options)
```

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [ImageSaveOptions](../../../aspose.page.eps.device/imagesaveoptions/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::SaveAsImage(System::SharedPtr\<Device::ImageSaveOptions\>, System::String, System::String) method


PS/EPS dosyasını belirtilen dizine, belirtilen dosya adıyla görüntü dosyasına kaydeder. Dosya uzantısı, "options" parametresindeki görüntü formatına karşılık gelir.

```cpp
void Aspose::Page::EPS::PsDocument::SaveAsImage(System::SharedPtr<Device::ImageSaveOptions> options, System::String outDir, System::String fileNameTemplate)
```

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [ImageSaveOptions](../../../aspose.page.eps.device/imagesaveoptions/)
* Class [String](../../../system/string/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
