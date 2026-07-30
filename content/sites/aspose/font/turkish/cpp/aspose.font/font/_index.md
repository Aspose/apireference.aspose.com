---
title: "Aspose::Font::Font sınıfı"
linktitle: "Font"
second_title: "Aspose.Font için C++"
description: "Aspose::Font::Font sınıfı. C++'da temel Font sınıfını temsil eder."
type: docs
weight: 400
url: /tr/cpp/aspose.font/font/
---
## Font class


Temel [Font](./) sınıfını temsil eder.

```cpp
class Font : public virtual Aspose::Font::IFont,
             public Aspose::Font::Glyphs::IGlyphAccessor,
             public Aspose::Font::IFontSaver,
             public Aspose::Font::Licensing::IVentureLicenseTarget
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| virtual [Convert](./convert/)(Aspose::Font::FontType) | [Font](./) öğesini başka bir formata dönüştürür. |
| virtual [get_Encoding](./get_encoding/)() | [Font](./) kodlamasını alır. |
| virtual [get_FontDefinition](./get_fontdefinition/)() | [Font](./) tanımını alır. |
| virtual [get_FontFamily](./get_fontfamily/)() | [Font](./) ailesini alır veya ayarlar. |
| virtual [get_FontName](./get_fontname/)() | [Font](./) yüz adını alır veya ayarlar. |
| virtual [get_FontNames](./get_fontnames/)() | [Font](./) adlarını alır. |
| [get_FontSaver](./get_fontsaver/)() override | [Font](./) kaydetme işlevselliğini alır. |
| virtual [get_FontStyle](./get_fontstyle/)() | [Font](./) stilini alır. Bu, genelleştirilmiş bir türde hesaplanan ve temsil edilen bir değerdir. |
| virtual [get_FontType](./get_fonttype/)() | [Font](./) tipini alır. |
| [get_GlyphAccessor](./get_glyphaccessor/)() override | [Font](./) glif erişicisi. Glifleri ve glif tanımlayıcılarını alır. |
| virtual [get_GlyphIdType](./get_glyphidtype/)() | Glif kimliği türü belirtimi. 'bytes[]' gerçek türünü bilmesi gereken tüketiciler için. |
| virtual [get_Metrics](./get_metrics/)() | [Font](./) ölçümlerini alır. |
| virtual [get_NumGlyphs](./get_numglyphs/)() | [Font](./) içindeki glif sayısını alır. |
| virtual [get_PostscriptNames](./get_postscriptnames/)() | Postscript [Font](./) adlarını alır. |
| virtual [get_Style](./get_style/)() | [Font](./) stilini alır veya ayarlar. Bu, [Font](./) dosyası tarafından sağlanan ham bir dize değeridir. |
| virtual [GetAllGlyphIds](./getallglyphids/)() | Mevcut olan tüm glif kimliklerini döndürür, [Font](./) içinde. Glif kimliği, glif için benzersiz bir sayıdır ve yazı tipi türüne bağlıdır. Örneğin: [Type1](../../aspose.font.type1/)'in kimliği bir glif adıdır ve ([GlyphStringId](../)) sınıfının bir örneğidir. TTF'nin kimliği bir int dizinidir ve ([GlyphUInt32Id](../)) sınıfının bir örneğidir. |
| virtual [GetGlyphById](./getglyphbyid/)(System::SharedPtr\<Glyphs::GlyphId\>) | Glif kimliğine göre glifi döndürür. Glif kimliği, glif için benzersiz bir sayıdır ve yazı tipi türüne bağlıdır. GlyphId - türetilmiş nesnedir. Örneğin: [Type1](../../aspose.font.type1/)'in kimliği bir glif adıdır ve ([GlyphStringId](../)) sınıfının bir örneğidir. TTF'nin kimliği bir int dizinidir ve ([GlyphUInt32Id](../)) sınıfının bir örneğidir. |
| [GetGlyphsForText](./getglyphsfortext/)(System::String) override | Metin için glif temsillerini alır. |
| static [Open](./open/)(System::SharedPtr\<Aspose::Font::Sources::FontDefinition\>) | FontDefinition nesnesi kullanarak bir font açar. |
| static [Open](./open/)(Aspose::Font::FontType, System::SharedPtr\<Sources::StreamSource\>) | Font tipini ve akış kaynağını kullanarak bir font açar. |
| static [Open](./open/)(Aspose::Font::FontType, System::String) | Font tipini ve font dosya adını kullanarak bir font açar. |
| static [Open](./open/)(Aspose::Font::FontType, System::ArrayPtr\<uint8_t\>) | Font tipini ve font veri bayt dizisini kullanarak bir font açar. |
| [Save](./save/)(System::SharedPtr\<System::IO::Stream\>) override | [Font](./) öğesini orijinal formatta kaydeder. |
| [Save](./save/)(System::String) override | [Font](./) öğesini orijinal formatta kaydeder. |
| [SaveToFormat](./savetoformat/)(System::SharedPtr\<System::IO::Stream\>, FontSavingFormats) override | [Font](./) öğesini belirtilen formata kaydeder. |
| virtual [set_FontFamily](./set_fontfamily/)(System::String) | [Font](./) ailesini alır veya ayarlar. |
| virtual [set_FontName](./set_fontname/)(System::String) | [Font](./) yüz adını alır veya ayarlar. |
| virtual [set_Style](./set_style/)(System::String) | [Font](./) stilini alır veya ayarlar. Bu, [Font](./) dosyası tarafından sağlanan ham bir dize değeridir. |
## Ayrıca Bakınız

* Class [IFont](../ifont/)
* Class [IGlyphAccessor](../../aspose.font.glyphs/iglyphaccessor/)
* Class [IFontSaver](../ifontsaver/)
* Class [IVentureLicenseTarget](../../aspose.font.licensing/iventurelicensetarget/)
* Namespace [Aspose::Font](../)
* Library [Aspose.Font for C++](../../)
