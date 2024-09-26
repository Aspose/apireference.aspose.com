---
title: Aspose::Font::Sources::FontDefinition class
linktitle: FontDefinition
second_title: Aspose.Font for C++
description: 'Aspose::Font::Sources::FontDefinition class. Represents Font file set definition. This class contains fields which are not related to font internal data. These fields describe font placement and another data needed to load font from some font source(file, memory, etc) in C++.'
type: docs
weight: 300
url: /cpp/aspose.font.sources/fontdefinition/
---
## FontDefinition class


Represents [Font](../../aspose.font/font/) file set definition. This class contains fields which are not related to font internal data. These fields describe font placement and another data needed to load font from some font source(file, memory, etc).

```cpp
class FontDefinition : public System::Object
```

## Methods

| Method | Description |
| --- | --- |
| [FontDefinition](./fontdefinition/)(Aspose::Font::FontType, System::String, System::SharedPtr\<StreamSource\>) | Creates single-file [Font](../../aspose.font/font/) definition. |
| [FontDefinition](./fontdefinition/)(Aspose::Font::FontType, System::SharedPtr\<StreamSource\>) | Creates single-file [Font](../../aspose.font/font/) definition. |
| [FontDefinition](./fontdefinition/)(System::String, Aspose::Font::FontType, System::String, System::SharedPtr\<StreamSource\>) | Creates single-file [Font](../../aspose.font/font/) definition. |
| [FontDefinition](./fontdefinition/)(Aspose::Font::FontType, System::SharedPtr\<FontFileDefinition\>) | Creates single-file [Font](../../aspose.font/font/) definition. |
| [FontDefinition](./fontdefinition/)(System::String, Aspose::Font::FontType, System::SharedPtr\<FontFileDefinition\>) | Creates single-file [Font](../../aspose.font/font/) definition. |
| [FontDefinition](./fontdefinition/)(System::String, System::String, Aspose::Font::FontType, System::SharedPtr\<FontFileDefinition\>) | Creates single-file [Font](../../aspose.font/font/) definition. |
| [FontDefinition](./fontdefinition/)(Aspose::Font::FontType, System::ArrayPtr\<System::SharedPtr\<FontFileDefinition\>\>) | Creates multi-file [Font](../../aspose.font/font/) definition. |
| [FontDefinition](./fontdefinition/)(System::String, System::String, Aspose::Font::FontType, System::ArrayPtr\<System::SharedPtr\<FontFileDefinition\>\>) | Creates multi-file [Font](../../aspose.font/font/) definition. |
| [FontDefinition](./fontdefinition/)(System::SharedPtr\<MultiLanguageString\>, System::SharedPtr\<MultiLanguageString\>, Aspose::Font::FontType, System::SharedPtr\<FontFileDefinition\>) | Creates multi-file [Font](../../aspose.font/font/) definition. |
| [FontDefinition](./fontdefinition/)(System::SharedPtr\<MultiLanguageString\>, System::SharedPtr\<MultiLanguageString\>, Aspose::Font::FontType, System::ArrayPtr\<System::SharedPtr\<FontFileDefinition\>\>) | Creates multi-file [Font](../../aspose.font/font/) definition. |
| [get_FileDefinitions](./get_filedefinitions/)() const | Gets file definitions collection. |
| virtual [get_FontName](./get_fontname/)() | Returns [Font](../../aspose.font/font/) name. |
| virtual [get_FontNames](./get_fontnames/)() | Gets [Font](../../aspose.font/font/) names as a [MultiLanguageString](../../aspose.font/multilanguagestring/). |
| [get_FontType](./get_fonttype/)() const | Gets [Font](../../aspose.font/font/) type. |
| virtual [get_PostscriptName](./get_postscriptname/)() | Gets postscript [Font](../../aspose.font/font/) name. |
| [get_PostscriptNames](./get_postscriptnames/)() const | Gets postscript [Font](../../aspose.font/font/) names as a [MultiLanguageString](../../aspose.font/multilanguagestring/). |
| static [Open](./open/)(System::String, Aspose::Font::FontType) | Returns [FontDefinition](./) for font file and font type. |
| static [Open](./open/)(System::SharedPtr\<StreamSource\>, Aspose::Font::FontType) | Returns [FontDefinition](./) for font stream source and font type. |
## See Also

* Class [Object](../../system/object/)
* Namespace [Aspose::Font::Sources](../)
* Library [Aspose.Font for C++](../../)
