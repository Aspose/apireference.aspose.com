---
title: "System::Drawing::Font sınıfı"
linktitle: "Font"
second_title: "Aspose.Font için C++"
description: "System::Drawing::Font sınıfı. Metin için belirli bir biçimi temsil eder; font yüzü, boyutu ve stil dahil. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tür bir örnek, yığıt üzerinde veya new operatörüyle oluşturulmamalıdır, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 700
url: /tr/cpp/system.drawing/font/
---
## Font class


Metin için belirli bir biçimi temsil eder; font yüzü, boyutu ve stil dahil. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tür bir örnek, yığıt üzerinde veya new operatörüyle oluşturulmamalıdır, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

```cpp
class Font : public System::Object
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [Clone](./clone/)() | Geçerli fontun bir kopyasını döndürür. |
| [Dispose](./dispose/)() | Geçerli nesne tarafından edinilen tüm işletim sistemi kaynaklarını serbest bırakır. |
| [Equals](./equals/)(System::SharedPtr\<System::Object\>) override | Geçerli ve belirtilen nesnelerin aynı olup olmadığını belirler. |
| [Font](./font/)(const SharedPtr\<Font\>\&, FontStyle) | Belirtilen mevcut fontu ve belirtilen font stilini temsil eden yeni bir [Font](./) sınıf örneği oluşturur. |
| [Font](./font/)(const SharedPtr\<FontFamily\>\&, float, FontStyle, GraphicsUnit, uint8_t, bool) | Yeni bir [Font](./) sınıf örneği oluşturur. |
| [Font](./font/)(const SharedPtr\<FontFamily\>\&, float, GraphicsUnit) | Yeni bir [Font](./) sınıf örneği oluşturur. |
| [Font](./font/)(const String\&, float, FontStyle, GraphicsUnit, uint8_t, bool) | Yeni bir [Font](./) sınıf örneği oluşturur. |
| [Font](./font/)(const String\&, float, GraphicsUnit) | Yeni bir [Font](./) sınıf örneği oluşturur. |
| static [FromLogFont](./fromlogfont/)(const SharedPtr\<Object\>\&) | UYGULANMADI. |
| [get_Bold](./get_bold/)() | Geçerli nesne tarafından temsil edilen fontun kalın stilinin uygulanıp uygulanmadığını belirler. |
| [get_FontFamily](./get_fontfamily/)() | Geçerli nesne tarafından temsil edilen fontun font ailesini döndürür. |
| [get_FontStyle](./get_fontstyle/)() | Geçerli nesne tarafından temsil edilen fontun stilini döndürür. |
| [get_GdiCharSet](./get_gdicharset/)() | Geçerli nesne tarafından temsil edilen fontun kullandığı GDI karakter kümesini gösteren bir değeri döndürür. |
| [get_Height](./get_height/)() | Geçerli nesne tarafından temsil edilen fontun satır aralığını piksel cinsinden döndürür. |
| [get_Italic](./get_italic/)() | Geçerli nesne tarafından temsil edilen fontun italik stilinin uygulanıp uygulanmadığını belirler. |
| [get_Name](./get_name/)() | Geçerli nesne tarafından temsil edilen fontun yüz adını döndürür. |
| [get_OriginalFontName](./get_originalfontname/)() | Fontun orijinal olarak belirtilen adını döndürür. |
| [get_Size](./get_size/)() | Geçerli nesne tarafından temsil edilen fontun, Unit özelliği tarafından belirtilen birimlerde ölçülen em boyutunu döndürür. |
| [get_SizeInPoints](./get_sizeinpoints/)() | Geçerli nesne tarafından temsil edilen yazı tipinin em boyutunu puan cinsinden döndürür. |
| [get_Strikeout](./get_strikeout/)() | Geçerli nesne tarafından temsil edilen yazı tipinin üstü çizili stilinin uygulanıp uygulanmadığını belirler. |
| [get_Style](./get_style/)() | Geçerli nesne tarafından temsil edilen yazı tipinin stilini döndürür. |
| [get_Underline](./get_underline/)() | Geçerli nesne tarafından temsil edilen yazı tipinin altı çizili stilinin uygulanıp uygulanmadığını belirler. |
| [get_Unit](./get_unit/)() | Geçerli nesne tarafından temsil edilen yazı tipinin ölçü birimini döndürür. |
| [GetHeight](./getheight/)(const SharedPtr\<Graphics\>\&) | Belirtilen [Graphics](../graphics/) nesnesinin geçerli biriminde, geçerli nesne tarafından temsil edilen yazı tipinin satır aralığını döndürür. |
| [GetHeight](./getheight/)(float) | Belirtilen dikey çözünürlüğe sahip bir görüntüleme cihazına çizildiğinde, geçerli nesne tarafından temsil edilen yazı tipinin yüksekliğini döndürür. |
## Ayrıca Bakınız

* Class [Object](../../system/object/)
* Namespace [System::Drawing](../)
* Library [Aspose.Font for C++](../../)
