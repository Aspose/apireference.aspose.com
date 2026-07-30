---
title: "Aspose::Font::Sources::FontDefinition sınıfı"
linktitle: "FontDefinition"
second_title: "Aspose.Font için C++"
description: "Aspose::Font::Sources::FontDefinition sınıfı. Yazı tipi dosya seti tanımını temsil eder. Bu sınıf, yazı tipinin iç verileriyle ilgili olmayan alanlar içerir. Bu alanlar, yazı tipinin konumunu ve C++'ta bazı yazı tipi kaynaklarından (dosya, bellek vb.) yüklenmesi için gereken diğer verileri açıklar."
type: docs
weight: 300
url: /tr/cpp/aspose.font.sources/fontdefinition/
---
## FontDefinition class


[Font](../../aspose.font/font/) dosya seti tanımını temsil eder. Bu sınıf, yazı tipinin iç verileriyle ilgili olmayan alanlar içerir. Bu alanlar, yazı tipinin konumunu ve bazı yazı tipi kaynaklarından (dosya, bellek vb.) yüklenmesi için gereken diğer verileri açıklar.

```cpp
class FontDefinition : public System::Object
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [FontDefinition](./fontdefinition/)(Aspose::Font::FontType, System::String, System::SharedPtr\<StreamSource\>) | Tek dosyalı bir [Font](../../aspose.font/font/) tanımı oluşturur. |
| [FontDefinition](./fontdefinition/)(Aspose::Font::FontType, System::SharedPtr\<StreamSource\>) | Tek dosyalı bir [Font](../../aspose.font/font/) tanımı oluşturur. |
| [FontDefinition](./fontdefinition/)(System::String, Aspose::Font::FontType, System::String, System::SharedPtr\<StreamSource\>) | Tek dosyalı bir [Font](../../aspose.font/font/) tanımı oluşturur. |
| [FontDefinition](./fontdefinition/)(Aspose::Font::FontType, System::SharedPtr\<FontFileDefinition\>) | Tek dosyalı bir [Font](../../aspose.font/font/) tanımı oluşturur. |
| [FontDefinition](./fontdefinition/)(System::String, Aspose::Font::FontType, System::SharedPtr\<FontFileDefinition\>) | Tek dosyalı bir [Font](../../aspose.font/font/) tanımı oluşturur. |
| [FontDefinition](./fontdefinition/)(System::String, System::String, Aspose::Font::FontType, System::SharedPtr\<FontFileDefinition\>) | Tek dosyalı bir [Font](../../aspose.font/font/) tanımı oluşturur. |
| [FontDefinition](./fontdefinition/)(Aspose::Font::FontType, System::ArrayPtr\<System::SharedPtr\<FontFileDefinition\>\>) | Çok dosyalı bir [Font](../../aspose.font/font/) tanımı oluşturur. |
| [FontDefinition](./fontdefinition/)(System::String, System::String, Aspose::Font::FontType, System::ArrayPtr\<System::SharedPtr\<FontFileDefinition\>\>) | Çok dosyalı bir [Font](../../aspose.font/font/) tanımı oluşturur. |
| [FontDefinition](./fontdefinition/)(System::SharedPtr\<MultiLanguageString\>, System::SharedPtr\<MultiLanguageString\>, Aspose::Font::FontType, System::SharedPtr\<FontFileDefinition\>) | Çok dosyalı bir [Font](../../aspose.font/font/) tanımı oluşturur. |
| [FontDefinition](./fontdefinition/)(System::SharedPtr\<MultiLanguageString\>, System::SharedPtr\<MultiLanguageString\>, Aspose::Font::FontType, System::ArrayPtr\<System::SharedPtr\<FontFileDefinition\>\>) | Çok dosyalı bir [Font](../../aspose.font/font/) tanımı oluşturur. |
| [get_FileDefinitions](./get_filedefinitions/)() const | Dosya tanımları koleksiyonunu alır. |
| virtual [get_FontName](./get_fontname/)() | [Font](../../aspose.font/font/) adını döndürür. |
| virtual [get_FontNames](./get_fontnames/)() | Alır [Font](../../aspose.font/font/) adlarını bir [MultiLanguageString](../../aspose.font/multilanguagestring/) olarak. |
| [get_FontType](./get_fonttype/)() const | Alır [Font](../../aspose.font/font/) tipini. |
| virtual [get_PostscriptName](./get_postscriptname/)() | Alır postscript [Font](../../aspose.font/font/) adını. |
| [get_PostscriptNames](./get_postscriptnames/)() const | Alır postscript [Font](../../aspose.font/font/) adlarını bir [MultiLanguageString](../../aspose.font/multilanguagestring/) olarak. |
| static [Open](./open/)(System::String, Aspose::Font::FontType) | Döndürür [FontDefinition](./) font dosyası ve font tipi için. |
| static [Open](./open/)(System::SharedPtr\<StreamSource\>, Aspose::Font::FontType) | Döndürür [FontDefinition](./) font akış kaynağı ve font tipi için. |
## Ayrıca Bakınız

* Class [Object](../../system/object/)
* Namespace [Aspose::Font::Sources](../)
* Library [Aspose.Font for C++](../../)
