---
title: "System::Drawing::Imaging::ImageFormat sınıfı"
linktitle: "ImageFormat"
second_title: "Aspose.Page için C++"
description: "System::Drawing::Imaging::ImageFormat sınıfı. Bir görüntünün dosya biçimini temsil eder. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tür bir örnek yığına (stack) veya new operatörüyle oluşturulmamalıdır, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak C++'ta geçirin."
type: docs
weight: 1100
url: /tr/cpp/system.drawing.imaging/imageformat/
---
## ImageFormat class


Bir görüntünün dosya biçimini temsil eder. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tür bir örnek yığına (stack) veya new operatörüyle oluşturulmamalıdır, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirin.

```cpp
class ImageFormat : public System::Object
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [Equals](./equals/)(ImageFormatPtr) const | Geçerli ve belirtilen nesneler tarafından temsil edilen görüntü biçimlerinin eşit olup olmadığını belirler. |
| static [get_Bmp](./get_bmp/)() | Bir [ImageFormat](./) nesnesine işaret eden paylaşımlı bir işaretçi döndürür; bu nesne bitmap görüntü biçimini temsil eder. |
| static [get_Emf](./get_emf/)() | Bir [ImageFormat](./) nesnesine işaret eden paylaşımlı bir işaretçi döndürür; bu nesne geliştirilmiş metafil biçimini temsil eder. |
| static [get_Exif](./get_exif/)() | Bir [ImageFormat](./) nesnesine işaret eden paylaşımlı bir işaretçi döndürür; bu nesne Değiştirilebilir [Image](../../system.drawing/image/) Dosyası (Exif) biçimini temsil eder. |
| static [get_Gif](./get_gif/)() | Bir [ImageFormat](./) nesnesine işaret eden paylaşımlı bir işaretçi döndürür; bu nesne [Graphics](../../system.drawing/graphics/) Değişim Biçimi (GIF) görüntü biçimini temsil eder. |
| [get_Guid](./get_guid/)() const | Geçerli nesne tarafından temsil edilen görüntü biçimiyle ilişkili GUID'i döndürür. |
| static [get_Icon](./get_icon/)() | Bir [ImageFormat](./) nesnesine işaret eden paylaşımlı bir işaretçi döndürür; bu nesne [Windows](../../system.windows/) simge görüntü biçimini temsil eder. |
| static [get_Jpeg](./get_jpeg/)() | Bir [ImageFormat](./) nesnesine işaret eden paylaşımlı bir işaretçi döndürür; bu nesne Ortak Fotoğraf Uzmanları Grubu (JPEG) görüntü biçimini temsil eder. |
| static [get_MemoryBmp](./get_memorybmp/)() | Bir [ImageFormat](./) nesnesine işaret eden paylaşımlı bir işaretçi döndürür; bu nesne bellekteki bitmap biçimini temsil eder. |
| static [get_Png](./get_png/)() | Bir [ImageFormat](./) nesnesine işaret eden paylaşımlı bir işaretçi döndürür; bu nesne W3C Taşınabilir Ağ [Graphics](../../system.drawing/graphics/) (PNG) görüntü biçimini temsil eder. |
| static [get_Tiff](./get_tiff/)() | Bir [ImageFormat](./) nesnesine işaret eden paylaşımlı bir işaretçi döndürür; bu nesne Etiketli [Image](../../system.drawing/image/) Dosya Biçimi (TIFF) görüntü biçimini temsil eder. |
| static [get_Wmf](./get_wmf/)() | Bir [ImageFormat](./) nesnesine işaret eden paylaşımlı bir işaretçi döndürür; bu nesne [Windows](../../system.windows/) metafil (WMF) görüntü biçimini temsil eder. |
| [ImageFormat](./imageformat/)(const System::Guid\&) | Belirtilen GUID ile ilişkili bir görüntü biçimini temsil eden [ImageFormat](./) sınıfının bir örneğini oluşturur. |
| virtual [ToString](./tostring/)() const | Bu [ImageFormat](./) nesnesini insan tarafından okunabilir bir dizeye dönüştürür. |
## Ayrıca Bakınız

* Class [Object](../../system/object/)
* Namespace [System::Drawing::Imaging](../)
* Library [Aspose.Page for C++](../../)
