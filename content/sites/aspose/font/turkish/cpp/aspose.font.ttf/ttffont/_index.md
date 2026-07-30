---
title: "Aspose::Font::Ttf::TtfFont sınıfı"
linktitle: "TtfFont"
second_title: "Aspose.Font için C++"
description: "Aspose::Font::Ttf::TtfFont sınıfı. C++'de TrueType Yazı Tipi (TTF) temsil eder."
type: docs
weight: 600
url: /tr/cpp/aspose.font.ttf/ttffont/
---
## TtfFont class


TrueType [Font](../../aspose.font/font/) (TTF) temsil eder.

```cpp
class TtfFont : public Aspose::Font::Font
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [Convert](./convert/)(Aspose::Font::FontType) override | [Font](../../aspose.font/font/) başka bir formata dönüştürür. |
| [Convert](./convert/)(Aspose::Font::FontType, System::SharedPtr\<System::Collections::Generic::ICollection\<uint32_t\>\>) | [Font](../../aspose.font/font/) sınırlı karakter kümesiyle başka bir formata dönüştürür. |
| virtual [get_CffFont](./get_cfffont/)() | Var ise CFF [Font](../../aspose.font/font/) alır. |
| [get_Encoding](./get_encoding/)() override | [Font](../../aspose.font/font/) kodlamasını alır. |
| [get_FontDefinition](./get_fontdefinition/)() override | [Font](../../aspose.font/font/) tanımını alır. |
| [get_FontFamily](./get_fontfamily/)() override | [Font](../../aspose.font/font/) ailesini alır veya ayarlar. |
| [get_FontName](./get_fontname/)() override | [Font](../../aspose.font/font/) yüz adını alır veya ayarlar. |
| [get_FontNames](./get_fontnames/)() override | [Font](../../aspose.font/font/) adlarını alır. |
| [get_FontStyle](./get_fontstyle/)() override | [Font](../../aspose.font/font/) stilini alır. Bu, genelleştirilmiş bir türde hesaplanan ve temsil edilen bir değerdir. |
| [get_FontType](./get_fonttype/)() override | [Font](../../aspose.font/font/) tipini alır. [FontType.TTF](../../aspose.font/fonttype/) değerini döndürür. |
| [get_GlyphIdType](./get_glyphidtype/)() override | Glif kimliği türü belirtimini alır. |
| [get_IsSymbolic](./get_issymbolic/)() | [Font](../../aspose.font/font/) sembolik ise true döndürür. |
| [get_Metrics](./get_metrics/)() override | [Font](../../aspose.font/font/) ölçümlerini alır. |
| [get_NumGlyphs](./get_numglyphs/)() override | Belirtilen [Font](../../aspose.font/font/) içindeki glif sayısını alır. |
| [get_PostscriptNames](./get_postscriptnames/)() override | Postscript [Font](../../aspose.font/font/) adlarını alır. |
| [get_Style](./get_style/)() override | Belirtilen [Font](../../aspose.font/font/) stilini alır veya ayarlar. Bu, [Font](../../aspose.font/font/) dosyası tarafından sağlanan ham bir dize değeridir. |
| virtual [get_TtfTables](./get_ttftables/)() | TTF tablolarını alır. |
| [GetAllGlyphIds](./getallglyphids/)() override | Belirtilen [Font](../../aspose.font/font/) içinde mevcut olan tüm glif kimliklerinin dizisini döndürür. Glif kimliği, font tipine bağlı olarak bir glif için benzersiz bir sayıdır. TTF [Font](../../aspose.font/font/) glif kimliği, ([GlyphStringId](../)) sınıfının bir örneği veya ([GlyphUInt32Id](../)) sınıfının bir örneği olabilir. İsim (dize) glif adreslemesi, Post tablosu eşlemesi aracılığıyla TTF Fontları için desteklenir. CFF [Font](../../aspose.font/font/) içinde ise, glifler isme göre adreslemek için CFF yapıları kullanılır. |
| [GetGlyphById](./getglyphbyid/)(System::SharedPtr\<Glyphs::GlyphId\>) override | Glif kimliğiyle glifi döndürür. Glif kimliği, font tipine bağlı olarak bir glif için benzersiz bir sayıdır. TTF [Font](../../aspose.font/font/) glif kimliği, ([GlyphStringId](../)) sınıfının bir örneği veya ([GlyphUInt32Id](../)) sınıfının bir örneği olabilir. İsim (dize) glif adreslemesi, Post tablosu eşlemesi aracılığıyla TTF Fontları için desteklenir. CFF [Font](../../aspose.font/font/) içinde ise, glifler isme göre adreslemek için CFF yapıları kullanılır. |
| [GetGlyphById](./getglyphbyid/)(System::String) | Glif adını kullanarak glifi döndürür. İsim (dize) glif adreslemesi, Post tablosu eşlemesi aracılığıyla TTF fontları için desteklenir. CFF [Font](../../aspose.font/font/) içinde ise, glifler isme göre adreslemek için CFF yapıları kullanılır. |
| [GetGlyphById](./getglyphbyid/)(uint32_t) | Glif kimliğiyle glifi döndürür. |
| virtual [GetGlyphComponentsById](./getglyphcomponentsbyid/)(System::SharedPtr\<Glyphs::GlyphId\>, System::SharedPtr\<Glyphs::GlyphIdList\>) | Verilen glif tanımlayıcısıyla bir glif alır ve bu glifin bileşenleriyle verilen glif tanımlayıcıları listesini doldurur. Glif kimliği, font tipine bağlı olarak bir glif için benzersiz bir sayıdır. TTF [Font](../../aspose.font/font/) glif kimliği, ([GlyphStringId](../)) sınıfının bir örneği veya ([GlyphUInt32Id](../)) sınıfının bir örneği olabilir. İsim (dize) glif adreslemesi, Post tablosu eşlemesi aracılığıyla TTF Fontları için desteklenir. CFF [Font](../../aspose.font/font/) içinde ise, glifler isme göre adreslemek için CFF yapıları kullanılır. |
| [GetGlyphComponentsById](./getglyphcomponentsbyid/)(System::String, System::SharedPtr\<Glyphs::GlyphIdList\>) | Verilen glif adıyla bir glif alır ve bu glifin bileşenleriyle verilen glif tanımlayıcıları listesini doldurur. |
| [GetGlyphComponentsById](./getglyphcomponentsbyid/)(uint32_t, System::SharedPtr\<Glyphs::GlyphIdList\>) | Verilen glif indeksiyle bir glif alır ve bu glifin bileşenleriyle verilen glif tanımlayıcıları listesini doldurur. |
| [GetGlyphsForText](./getglyphsfortext/)(System::String) override | Metin için glif temsili al. |
| [set_FontFamily](./set_fontfamily/)(System::String) override | [Font](../../aspose.font/font/) ailesini alır veya ayarlar. |
| [set_FontName](./set_fontname/)(System::String) override | [Font](../../aspose.font/font/) yüz adını alır veya ayarlar. |
| [set_Style](./set_style/)(System::String) override | Belirtilen [Font](../../aspose.font/font/) stilini alır veya ayarlar. Bu, [Font](../../aspose.font/font/) dosyası tarafından sağlanan ham bir dize değeridir. |
## Ayrıca Bakınız

* Class [Font](../../aspose.font/font/)
* Namespace [Aspose::Font::Ttf](../)
* Library [Aspose.Font for C++](../../)
