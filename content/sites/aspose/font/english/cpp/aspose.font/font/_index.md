---
title: Aspose::Font::Font class
linktitle: Font
second_title: Aspose.Font for C++
description: 'Aspose::Font::Font class. Represents base Font class in C++.'
type: docs
weight: 300
url: /cpp/aspose.font/font/
---
## Font class


Represents base [Font](./) class.

```cpp
class Font : public virtual Aspose::Font::IFont,
             public Aspose::Font::Glyphs::IGlyphAccessor,
             public Aspose::Font::IFontSaver,
             public Aspose::Font::Licensing::IVentureLicenseTarget
```

## Methods

| Method | Description |
| --- | --- |
| virtual [Convert](./convert/)(Aspose::Font::FontType) | Converts the [Font](./) into another format. |
| virtual [get_Encoding](./get_encoding/)() | Gets [Font](./) encoding. |
| virtual [get_FontDefinition](./get_fontdefinition/)() | Gets [Font](./) definition. |
| virtual [get_FontFamily](./get_fontfamily/)() | Gets or Sets [Font](./) family. |
| virtual [get_FontName](./get_fontname/)() | Gets or Sets [Font](./) face name. |
| virtual [get_FontNames](./get_fontnames/)() | Gets [Font](./) names. |
| [get_FontSaver](./get_fontsaver/)() override | Gets [Font](./) save functionality. |
| virtual [get_FontStyle](./get_fontstyle/)() | Gets [Font](./) style. This is a value computed and represented in generalized type. |
| virtual [get_FontType](./get_fonttype/)() | Gets [Font](./) type. |
| [get_GlyphAccessor](./get_glyphaccessor/)() override | [Font](./) glyph accessor. Retrieves glyphs and glyph identifiers. |
| virtual [get_GlyphIdType](./get_glyphidtype/)() | Glyph id type specification. For consumers who needs to know the 'bytes[]' real type. |
| virtual [get_Metrics](./get_metrics/)() | Gets [Font](./) metrics. |
| virtual [get_NumGlyphs](./get_numglyphs/)() | Gets number of glyphs in the [Font](./). |
| virtual [get_PostscriptNames](./get_postscriptnames/)() | Gets postscript [Font](./) names. |
| virtual [get_Style](./get_style/)() | Gets or Sets [Font](./) style. This is a raw string value provided by [Font](./) file. |
| virtual [GetAllGlyphIds](./getallglyphids/)() | Returns all glyph ids, available in the [Font](./). Glyph id is a unique number for a glyph, which is font type dependent. For example: [Type1](../../aspose.font.type1/)'s id is a glyph name, instance of ([GlyphStringId](../)) class. TTF's id is an int index, instance of ([GlyphUInt32Id](../)) class. |
| virtual [GetGlyphById](./getglyphbyid/)(System::SharedPtr\<Glyphs::GlyphId\>) | Returns glyph by glyph id. Glyph id is a unique number for a glyph, which is font type dependent. GlyphId - derived object. For example: [Type1](../../aspose.font.type1/)'s id is a glyph name, instance of ([GlyphStringId](../)) class. TTF's id is an int index, instance of ([GlyphUInt32Id](../)) class. |
| [GetGlyphsForText](./getglyphsfortext/)(System::String) override | Gets glyphs representation for text. |
| static [Open](./open/)(System::SharedPtr\<Aspose::Font::Sources::FontDefinition\>) | Opens a font, using FontDefinition object. |
| static [Open](./open/)(Aspose::Font::FontType, System::SharedPtr\<Sources::StreamSource\>) | Opens a font, using font type and stream source. |
| static [Open](./open/)(Aspose::Font::FontType, System::String) | Opens a font, using font type and font file name. |
| static [Open](./open/)(Aspose::Font::FontType, System::ArrayPtr\<uint8_t\>) | Opens a font, using font type and font data byte array. |
| [Save](./save/)(System::SharedPtr\<System::IO::Stream\>) override | Saves the [Font](./) into original format. |
| [Save](./save/)(System::String) override | Saves the [Font](./) into original format. |
| [SaveToFormat](./savetoformat/)(System::SharedPtr\<System::IO::Stream\>, FontSavingFormats) override | Saves the [Font](./) into format specified. |
| virtual [set_FontFamily](./set_fontfamily/)(System::String) | Gets or Sets [Font](./) family. |
| virtual [set_FontName](./set_fontname/)(System::String) | Gets or Sets [Font](./) face name. |
| virtual [set_Style](./set_style/)(System::String) | Gets or Sets [Font](./) style. This is a raw string value provided by [Font](./) file. |
## See Also

* Class [IFont](../ifont/)
* Class [IGlyphAccessor](../../aspose.font.glyphs/iglyphaccessor/)
* Class [IFontSaver](../ifontsaver/)
* Class [IVentureLicenseTarget](../../aspose.font.licensing/iventurelicensetarget/)
* Namespace [Aspose::Font](../)
* Library [Aspose.Font for C++](../../)
