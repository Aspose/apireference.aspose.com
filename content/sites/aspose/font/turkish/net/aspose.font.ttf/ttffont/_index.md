---
title: TtfFont
second_title: Aspose.Font for .NET API Referansı
description: TrueType Yazı Tipini TTF temsil eder.
type: docs
weight: 630
url: /tr/net/aspose.font.ttf/ttffont/
---
## TtfFont class

TrueType Yazı Tipini (TTF) temsil eder.

```csharp
public class TtfFont : Font
```

## Özellikleri

| İsim | Tanım |
| --- | --- |
| virtual [CffFont](../../aspose.font.ttf/ttffont/cfffont) { get; } | Varsa CFF Yazı Tipi Alır. |
| override [Encoding](../../aspose.font.ttf/ttffont/encoding) { get; } | Yazı Tipi kodlamasını alır. |
| override [FontDefinition](../../aspose.font.ttf/ttffont/fontdefinition) { get; } | Yazı Tipi tanımını alır. |
| override [FontFamily](../../aspose.font.ttf/ttffont/fontfamily) { get; set; } | Yazı Tipi ailesini alır veya ayarlar. |
| override [FontName](../../aspose.font.ttf/ttffont/fontname) { get; set; } | Yazı tipi yüz adını alır veya ayarlar. |
| override [FontNames](../../aspose.font.ttf/ttffont/fontnames) { get; } | Yazı tipi adlarını alır. |
| [FontSaver](../../aspose.font/font/fontsaver) { get; } | Yazı Tipi kaydetme işlevini alır. |
| override [FontStyle](../../aspose.font.ttf/ttffont/fontstyle) { get; } | Yazı tipi stilini alır. Bu, genelleştirilmiş türde hesaplanan ve temsil edilen bir değerdir. |
| override [FontType](../../aspose.font.ttf/ttffont/fonttype) { get; } | Yazı Tipi türünü alır. FontType.TTF değerini döndürür. |
| [GlyphAccessor](../../aspose.font/font/glyphaccessor) { get; } | Yazı tipi glif erişimcisi. Glifleri ve glif tanımlayıcılarını alır. |
| override [GlyphIdType](../../aspose.font.ttf/ttffont/glyphidtype) { get; } | Glif kimliği türü belirtimini alır. |
| [IsSymbolic](../../aspose.font.ttf/ttffont/issymbolic) { get; } | Yazı Tipinin sembolik olması durumunda true değerini döndürür. |
| override [Metrics](../../aspose.font.ttf/ttffont/metrics) { get; } | Yazı Tipi metriklerini alır. |
| override [NumGlyphs](../../aspose.font.ttf/ttffont/numglyphs) { get; } | Font. içindeki gliflerin sayısını alır |
| override [PostscriptNames](../../aspose.font.ttf/ttffont/postscriptnames) { get; } | Postscript Font adlarını alır. |
| override [Style](../../aspose.font.ttf/ttffont/style) { get; set; } | Yazı Tipi stilini alır veya ayarlar. Bu, Yazı Tipi dosyası tarafından sağlanan ham bir dize değeridir. |
| virtual [TtfTables](../../aspose.font.ttf/ttffont/ttftables) { get; } | TTF tablolarını alır. |

## yöntemler

| İsim | Tanım |
| --- | --- |
| override [Convert](../../aspose.font.ttf/ttffont/convert)(FontType) | Yazı Tipini başka bir biçime dönüştürür. |
| override [GetAllGlyphIds](../../aspose.font.ttf/ttffont/getallglyphids)() | Font'ta bulunan tüm glif kimliklerinin dizisini döndürür. Glif kimliği, font türüne bağlı olan bir glif için benzersiz bir sayıdır. TTF Font glif kimliği ([`GlyphStringId`](../../aspose.font.glyphs/glyphstringid)) sınıf veya ([`GlyphUInt32Id`](../../aspose.font.glyphs/glyphuint32id) ) class. Ad (dize) glif adresleme, Post tablosu eşleme yoluyla TTF Fontları için desteklenir. CFF Font içinde olması durumunda, glifleri ada göre adreslemek için CFF yapıları kullanılır. |
| override [GetGlyphById](../../aspose.font.ttf/ttffont/getglyphbyid#getglyphbyid)(GlyphId) | Glif kimliğine göre glif döndürür. Glif kimliği, yazı tipi türüne bağlı olan bir glif için benzersiz bir sayıdır. TTF Yazı tipi glif kimliği ([`GlyphStringId`](../../aspose.font.glyphs/glyphstringid)) sınıf veya ([`GlyphUInt32Id`](../../aspose.font.glyphs/glyphuint32id) ) class. Ad (dize) glif adresleme, Post tablosu eşleme yoluyla TTF Fontları için desteklenir. CFF Font içinde olması durumunda, glifleri ada göre adreslemek için CFF yapıları kullanılır. |
| [GetGlyphById](../../aspose.font.ttf/ttffont/getglyphbyid#getglyphbyid_1)(string) | Glif adına göre glif döndürür. Ad (dize) glif adresleme, Posta tablosu eşleme yoluyla TTF fontları için desteklenir. CFF Font'un içinde olması durumunda, glifleri ada göre adreslemek için CFF yapıları kullanılır. |
| [GetGlyphById](../../aspose.font.ttf/ttffont/getglyphbyid#getglyphbyid_2)(uint) | Glif kimliğine göre glif döndürür. |
| virtual [GetGlyphComponentsById](../../aspose.font.ttf/ttffont/getglyphcomponentsbyid#getglyphcomponentsbyid)(GlyphId, GlyphIdList) | Geçilen glif tanımlayıcısına göre bir glif alır ve geçen glif tanımlayıcıları listesini bu glifin bileşenleriyle doldurur. Glif kimliği, yazı tipi türüne bağlı olan bir glif için benzersiz bir sayıdır. TTF Yazı tipi glif kimliği ([`GlyphStringId`](../../aspose.font.glyphs/glyphstringid)) sınıf veya ([`GlyphUInt32Id`](../../aspose.font.glyphs/glyphuint32id) ) class. Ad (dize) glif adresleme, Post tablosu eşleme yoluyla TTF Fontları için desteklenir. CFF Font içinde olması durumunda, glifleri ada göre adreslemek için CFF yapıları kullanılır. |
| [GetGlyphComponentsById](../../aspose.font.ttf/ttffont/getglyphcomponentsbyid#getglyphcomponentsbyid_1)(string, GlyphIdList) | Geçirilen glif adına göre bir glif alır ve geçen glif tanımlayıcıları listesini bu glifin bileşenleriyle doldurur. |
| [GetGlyphComponentsById](../../aspose.font.ttf/ttffont/getglyphcomponentsbyid#getglyphcomponentsbyid_2)(uint, GlyphIdList) | Geçirilen glif indeksine göre bir glif alır ve geçen glif tanımlayıcıları listesini bu glifin bileşenleriyle doldurur. |
| override [GetGlyphsForText](../../aspose.font.ttf/ttffont/getglyphsfortext)(string) | Metin için glif gösterimini alın. |
| virtual [Save](../../aspose.font/font/save)(Stream) | Yazı Tipini orijinal biçime kaydeder. |
| virtual [Save](../../aspose.font/font/save)(string) | Yazı Tipini orijinal biçime kaydeder. |
| [SaveToFormat](../../aspose.font/font/savetoformat)(Stream, FontSavingFormats) | Yazı Tipini belirtilen biçimde kaydeder. |

### Ayrıca bakınız

* class [Font](../../aspose.font/font)
* ad alanı [Aspose.Font.Ttf](../../aspose.font.ttf)
* toplantı [Aspose.Font](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Font.dll -->
