---
title: Font
second_title: Aspose.Drawing for .NET API Referansı
description: Yazı tipi yüzü boyutu ve stil öznitelikleri dahil olmak üzere metin için belirli bir biçim tanımlar. Bu sınıf devralınamaz.
type: docs
weight: 500
url: /tr/net/system.drawing/font/
---
## Font class

Yazı tipi yüzü, boyutu ve stil öznitelikleri dahil olmak üzere metin için belirli bir biçim tanımlar. Bu sınıf devralınamaz.

```csharp
public sealed class Font : IDisposable
```

## yapıcılar

| İsim | Tanım |
| --- | --- |
| [Font](font#constructor)(Font, FontStyle) | Yeni bir örneğini başlatır[`Font`](../font) sınıf belirtilen mevcut olanı kullanırFont veFontStyle numaralandırma.. |
| [Font](font#constructor_1)(FontFamily, float) | Yeni bir örneğini başlatır[`Font`](../font) sınıf. |
| [Font](font#constructor_7)(string, float) | Yeni bir örneğini başlatır[`Font`](../font) belirtilen bir boyutu kullanan sınıf. |
| [Font](font#constructor_2)(FontFamily, float, FontStyle) | Yeni bir örneğini başlatır[`Font`](../font) belirli bir boyut ve stil kullanan sınıf.. |
| [Font](font#constructor_6)(FontFamily, float, GraphicsUnit) | Yeni bir örneğini başlatır[`Font`](../font) belirli bir boyut ve birim kullanan sınıf. Stili şu şekilde ayarlar:Regular . |
| [Font](font#constructor_8)(string, float, FontStyle) | Yeni bir örneğini başlatır[`Font`](../font) belirtilen bir boyut ve stil kullanan sınıf. |
| [Font](font#constructor_12)(string, float, GraphicsUnit) | Yeni bir örneğini başlatır[`Font`](../font) belirtilen bir boyut ve birim kullanan sınıf. Stil şu şekilde ayarlandı:Regular . |
| [Font](font#constructor_3)(FontFamily, float, FontStyle, GraphicsUnit) | Yeni bir örneğini başlatır[`Font`](../font) belirtilen bir boyut, stil ve birim kullanan sınıf. |
| [Font](font#constructor_9)(string, float, FontStyle, GraphicsUnit) | Yeni bir örneğini başlatır[`Font`](../font) belirtilen bir boyut, stil ve birim kullanan sınıf. |
| [Font](font#constructor_4)(FontFamily, float, FontStyle, GraphicsUnit, byte) | Yeni bir örneğini başlatır[`Font`](../font) belirtilen bir boyut, stil, birim ve karakter kümesi kullanan sınıf.. |
| [Font](font#constructor_10)(string, float, FontStyle, GraphicsUnit, byte) | Yeni bir örneğini başlatır[`Font`](../font)belirtilen bir boyut, stil, birim ve karakter kümesi kullanan sınıf. |
| [Font](font#constructor_5)(FontFamily, float, FontStyle, GraphicsUnit, byte, bool) | Yeni bir örneğini başlatır[`Font`](../font) belirtilen bir boyut, stil, birim ve karakter kümesi kullanan sınıf.. |
| [Font](font#constructor_11)(string, float, FontStyle, GraphicsUnit, byte, bool) | Yeni bir örneğini başlatır[`Font`](../font) belirtilen boyut, stil, birim ve karakter kümesini kullanan sınıf. |

## Özellikleri

| İsim | Tanım |
| --- | --- |
| [Bold](../../system.drawing/font/bold) { get; } | Bunun olup olmadığını gösteren bir değer alır.Font kalındır. |
| [FontFamily](../../system.drawing/font/fontfamily) { get; } | FontFamily bununla ilişkiliFont . |
| [GdiCharSet](../../system.drawing/font/gdicharset) { get; } | Bu GDI karakter kümesini belirten bir bayt değeri alır.Font kullanır. |
| [GdiVerticalFont](../../system.drawing/font/gdiverticalfont) { get; } | Bunun olup olmadığını gösteren bir değer alır.Font bir GDI dikey yazı tipinden türetilmiştir.. |
| [Height](../../system.drawing/font/height) { get; } | Bu yazı tipinin satır aralığını alır. |
| [IsSystemFont](../../system.drawing/font/issystemfont) { get; } | Yazı tipinin üye olup olmadığını gösteren bir değer alır.SystemFonts . |
| [Italic](../../system.drawing/font/italic) { get; } | Bunun olup olmadığını gösteren bir değer alır.Font italik. |
| [Name](../../system.drawing/font/name) { get; } | Bunun yüz adını alırFont . |
| [OriginalFontName](../../system.drawing/font/originalfontname) { get; } | Başlangıçta belirtilen yazı tipinin adını alır. |
| [Size](../../system.drawing/font/size) { get; } | Bunun em-boyutunu alırFont the tarafından belirtilen birimlerde ölçülürUnit özellik. |
| [SizeInPoints](../../system.drawing/font/sizeinpoints) { get; } | Bunun em-boyutunu puan olarak alırFont . |
| [Strikeout](../../system.drawing/font/strikeout) { get; } | Bunun olup olmadığını gösteren bir değer alır.Font yazı tipi boyunca yatay bir çizgi belirtir. |
| [Style](../../system.drawing/font/style) { get; } | Bunun için stil bilgisi alırFont . |
| [SystemFontName](../../system.drawing/font/systemfontname) { get; } | IsSystemFont özelliği true değerini döndürürse sistem yazı tipinin adını alır. |
| [Underline](../../system.drawing/font/underline) { get; } | Bunun olup olmadığını gösteren bir değer alır.Font altı çizili. |
| [Unit](../../system.drawing/font/unit) { get; } | Bunun için ölçü birimini alırFont . |

## yöntemler

| İsim | Tanım |
| --- | --- |
| [Clone](../../system.drawing/font/clone)() | Bunun tam bir kopyasını oluştururFont . |
| [Dispose](../../system.drawing/font/dispose)() | Bunun kullandığı tüm kaynakları serbest bırakırFont . |
| override [Equals](../../system.drawing/font/equals)(object) | Belirtilen nesnenin birFont ve aynısı varFontFamily , GdiVerticalFont ,GdiCharSet ,Style ,Size , veUnit özellik değerleri bu şekildeFont . |
| override [GetHashCode](../../system.drawing/font/gethashcode)() | Bunun için hash kodunu alırFont . |
| [GetHeight](../../system.drawing/font/getheight#getheight)() | Bu yazı tipinin piksel cinsinden satır aralığını döndürür. |
| [GetHeight](../../system.drawing/font/getheight#getheight_1)(float) | Bunun piksel cinsinden yüksekliğini döndürürFontbelirtilen dikey çözünürlüğe sahip bir cihaza çizildiğinde. |
| [GetHeight](../../system.drawing/font/getheight#getheight_2)(Graphics) | Belirtilen bir birimin geçerli birimindeki satır aralığını döndürürGraphics , bu yazı tipinin. |
| override [ToString](../../system.drawing/font/tostring)() | Bunun insan tarafından okunabilir bir dize temsilini döndürürFont . |

### Ayrıca bakınız

* ad alanı [System.Drawing](../../system.drawing)
* toplantı [Aspose.Drawing](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Drawing.dll -->
