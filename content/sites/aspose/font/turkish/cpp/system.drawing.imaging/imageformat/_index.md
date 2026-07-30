---
title: "System::Drawing::Imaging::ImageFormat class"
linktitle: "ImageFormat"
second_title: "Aspose.Font için C++"
description: "System::Drawing::Imaging::ImageFormat sınıfı. Bir görüntünün dosya formatını temsil eder. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tür bir örnek asla yığıt (stack) üzerinde veya new operatörüyle oluşturulmamalıdır, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 1100
url: /tr/cpp/system.drawing.imaging/imageformat/
---
## ImageFormat class


Bir görüntünün dosya formatını temsil eder. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tür bir örnek asla yığıt üzerinde veya new operatörüyle oluşturulmamalıdır, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

```cpp
class ImageFormat : public System::Object
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [Equals](./equals/)(ImageFormatPtr) const | Geçerli ve belirtilen nesneler tarafından temsil edilen görüntü formatlarının eşit olup olmadığını belirler. |
| static [get_Bmp](./get_bmp/)() | Bitmap görüntü formatını temsil eden bir [ImageFormat](./) nesnesine ortak bir işaretçi döndürür. |
| static [get_Emf](./get_emf/)() | Geliştirilmiş metafile formatını temsil eden bir [ImageFormat](./) nesnesine ortak bir işaretçi döndürür. |
| static [get_Exif](./get_exif/)() | Değiştirilebilir [Image](../../system.drawing/image/) Dosyası (Exif) formatını temsil eden bir [ImageFormat](./) nesnesine ortak bir işaretçi döndürür. |
| static [get_Gif](./get_gif/)() | [Graphics](../../system.drawing/graphics/) Değişim Formatı (GIF) görüntü formatını temsil eden bir [ImageFormat](./) nesnesine ortak bir işaretçi döndürür. |
| [get_Guid](./get_guid/)() const | Geçerli nesne tarafından temsil edilen görüntü formatıyla ilişkili GUID'i döndürür. |
| static [get_Icon](./get_icon/)() | [Windows](../../system.windows/) simge görüntü formatını temsil eden bir [ImageFormat](./) nesnesine ortak bir işaretçi döndürür. |
| static [get_Jpeg](./get_jpeg/)() | Joint Photographic Experts Group (JPEG) görüntü formatını temsil eden bir [ImageFormat](./) nesnesine ortak bir işaretçi döndürür. |
| static [get_MemoryBmp](./get_memorybmp/)() | Bellekteki bir bitmap'in formatını temsil eden bir [ImageFormat](./) nesnesine ortak bir işaretçi döndürür. |
| static [get_Png](./get_png/)() | W3C Taşınabilir Ağ [Graphics](../../system.drawing/graphics/) (PNG) görüntü formatını temsil eden bir [ImageFormat](./) nesnesine ortak bir işaretçi döndürür. |
| static [get_Tiff](./get_tiff/)() | Tagged [Image](../../system.drawing/image/) Dosya Formatı (TIFF) görüntü formatını temsil eden bir [ImageFormat](./) nesnesine ortak bir işaretçi döndürür. |
| static [get_Wmf](./get_wmf/)() | [Windows](../../system.windows/) metafile (WMF) görüntü formatını temsil eden bir [ImageFormat](./) nesnesine ortak bir işaretçi döndürür. |
| [ImageFormat](./imageformat/)(const System::Guid\&) | Belirtilen GUID ile ilişkili bir görüntü formatını temsil eden bir [ImageFormat](./) sınıfının örneğini oluşturur. |
| virtual [ToString](./tostring/)() const | Bu [ImageFormat](./) nesnesini insan tarafından okunabilir bir dizeye dönüştürür. |
## Ayrıca Bakınız

* Class [Object](../../system/object/)
* Namespace [System::Drawing::Imaging](../)
* Library [Aspose.Font for C++](../../)
