---
title: "Aspose::Font::Cff::CffFont sınıfı"
linktitle: "CffFont"
second_title: "Aspose.Font için C++"
description: "Aspose::Font::Cff::CffFont sınıfı. C++'ta Compact Font Format (CFF) temsil eder."
type: docs
weight: 200
url: /tr/cpp/aspose.font.cff/cfffont/
---
## CffFont class


Compact [Font](../../aspose.font/font/) Formatını (CFF) temsil eder.

```cpp
class CffFont : public Aspose::Font::Font
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [Convert](./convert/)(Aspose::Font::FontType) override | [Font](../../aspose.font/font/) başka bir formata dönüştürür. |
| [get_CommonFontsSettings](./get_commonfontssettings/)() const | CFF yazı tipleri için ortak ayarları alır/ayarlar. Bu ayarlar farklı senaryolarda kullanılır ve her bir yazı tipi için değiştirilebilir. |
| [get_Encoding](./get_encoding/)() override | [Font](../../aspose.font/font/) kodlamasını alır. |
| [get_FontDefinition](./get_fontdefinition/)() override | [Font](../../aspose.font/font/) tanımını alır. |
| [get_FontFamily](./get_fontfamily/)() override | [Font](../../aspose.font/font/) ailesini alır. [Font](../../aspose.font/font/) ailesi ayarlayıcısı henüz uygulanmadı. |
| [get_FontName](./get_fontname/)() override | [Font](../../aspose.font/font/) yüz adını alır. |
| [get_FontNames](./get_fontnames/)() override | [Font](../../aspose.font/font/) adlarını al. |
| [get_FontStyle](./get_fontstyle/)() override | [Font](../../aspose.font/font/) stilini alır. Bu, genelleştirilmiş bir türde hesaplanan ve temsil edilen bir değerdir. |
| [get_FontType](./get_fonttype/)() override | [Font](../../aspose.font/font/) tipini alır. [FontType.CFF](../../aspose.font/fonttype/) değerini döndürür. |
| [get_GlyphIdType](./get_glyphidtype/)() override | Glif kimliği türü belirtimini alır. |
| [get_IsCidKeyedFont](./get_iscidkeyedfont/)() | [Font](../../aspose.font/font/) 'ın cid-keyed olduğunu gösteren değeri alır. |
| [get_Metrics](./get_metrics/)() override | [Font](../../aspose.font/font/) ölçümlerini alır. |
| [get_NumGlyphs](./get_numglyphs/)() override | Belirtilen [Font](../../aspose.font/font/) içindeki glif sayısını alır. |
| [get_PostscriptNames](./get_postscriptnames/)() override | Postscript [Font](../../aspose.font/font/) adlarını alır. |
| [get_Style](./get_style/)() override | [Font](../../aspose.font/font/) stilini alır. Bu, [Font](../../aspose.font/font/) dosyası tarafından sağlanan ham bir dize değeridir. |
| [get_TopDictDataProvider](./get_topdictdataprovider/)() | Top DICT INDEX yapısındaki ilk üst düzey DICT için erişiciyi alır. |
| [GetAllGlyphIds](./getallglyphids/)() override | Mevcut olan [Font](../../aspose.font/font/) içindeki tüm glif kimliklerinin dizisini döndürür. Glif kimliği, glif için benzersiz bir sayıdır ve yazı tipi türüne bağlıdır. CFF [Font](../../aspose.font/font/) glif kimliği, ([GlyphStringId](../)) sınıfının bir örneği ya da ([GlyphUInt32Id](../)) sınıfının bir örneği olabilir. |
| [GetGlyphById](./getglyphbyid/)(System::SharedPtr\<Glyphs::GlyphId\>) override | Glifi glif kimliğine göre döndürür. Glif kimliği, glif için benzersiz bir sayıdır ve yazı tipi türüne bağlıdır. CFF [Font](../../aspose.font/font/) glif kimliği, ([GlyphStringId](../)) sınıfının bir örneği ya da ([GlyphUInt32Id](../)) sınıfının bir örneği olabilir. |
| [GetGlyphById](./getglyphbyid/)(System::String) | Glifi glif adına göre döndürür. |
| [GetGlyphById](./getglyphbyid/)(uint32_t) | Glif kimliğiyle glifi döndürür. |
| [GetIndexDataProvider](./getindexdataprovider/)(CffDataProviders::CffIndexProviderType) | Belirtilen CFF INDEX yapı türü için sağlayıcıyı alır. |
| [set_CommonFontsSettings](./set_commonfontssettings/)(System::SharedPtr\<CffFontsSettings\>) | CFF yazı tipleri için ortak ayarları alır/ayarlar. Bu ayarlar farklı senaryolarda kullanılır ve her bir yazı tipi için değiştirilebilir. |
| [set_FontFamily](./set_fontfamily/)(System::String) override | [Font](../../aspose.font/font/) ailesini alır. [Font](../../aspose.font/font/) ailesi ayarlayıcısı henüz uygulanmadı. |
| [set_FontName](./set_fontname/)(System::String) override | [Font](../../aspose.font/font/) yüz adını ayarlar. |
| [set_Style](./set_style/)(System::String) override | [Font](../../aspose.font/font/) stilini ayarlar. Bu, [Font](../../aspose.font/font/) dosyası tarafından sağlanan ham bir dize değeridir. |
## Ayrıca Bakınız

* Class [Font](../../aspose.font/font/)
* Namespace [Aspose::Font::Cff](../)
* Library [Aspose.Font for C++](../../)
