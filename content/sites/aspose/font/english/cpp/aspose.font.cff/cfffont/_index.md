---
title: Aspose::Font::Cff::CffFont class
linktitle: CffFont
second_title: Aspose.Font for C++
description: 'Aspose::Font::Cff::CffFont class. Represents Compact Font Format (CFF) in C++.'
type: docs
weight: 200
url: /cpp/aspose.font.cff/cfffont/
---
## CffFont class


Represents Compact [Font](../../aspose.font/font/) Format (CFF).

```cpp
class CffFont : public Aspose::Font::Font
```

## Methods

| Method | Description |
| --- | --- |
| [Convert](./convert/)(Aspose::Font::FontType) override | Converts the [Font](../../aspose.font/font/) into another format. |
| [get_CommonFontsSettings](./get_commonfontssettings/)() const | Gets/sets settings common to CFF fonts. These settings are used in different scenarios and can be changed for each individual font. |
| [get_Encoding](./get_encoding/)() override | Gets [Font](../../aspose.font/font/) encoding. |
| [get_FontDefinition](./get_fontdefinition/)() override | Gets [Font](../../aspose.font/font/) definition. |
| [get_FontFamily](./get_fontfamily/)() override | Gets [Font](../../aspose.font/font/) family. The [Font](../../aspose.font/font/) family setter is not implemented yet. |
| [get_FontName](./get_fontname/)() override | Gets [Font](../../aspose.font/font/) face name. |
| [get_FontNames](./get_fontnames/)() override | Get [Font](../../aspose.font/font/) names. |
| [get_FontStyle](./get_fontstyle/)() override | Gets [Font](../../aspose.font/font/) style. This is a value computed and represented in generalized type. |
| [get_FontType](./get_fonttype/)() override | Gets [Font](../../aspose.font/font/) type. Returns [FontType.CFF](../../aspose.font/fonttype/) value. |
| [get_GlyphIdType](./get_glyphidtype/)() override | Gets glyph id type specification. |
| [get_IsCidKeyedFont](./get_iscidkeyedfont/)() | Gets value indicating that the [Font](../../aspose.font/font/) is cid-keyed. |
| [get_Metrics](./get_metrics/)() override | Gets [Font](../../aspose.font/font/) metrics. |
| [get_NumGlyphs](./get_numglyphs/)() override | Gets number of glyphs in the [Font](../../aspose.font/font/). |
| [get_PostscriptNames](./get_postscriptnames/)() override | Gets postscript [Font](../../aspose.font/font/) names. |
| [get_Style](./get_style/)() override | Gets [Font](../../aspose.font/font/) style. This is a raw string value provided by [Font](../../aspose.font/font/) file. |
| [get_TopDictDataProvider](./get_topdictdataprovider/)() | Gets accessor for the first top-level DICT in Top DICT INDEX structure. |
| [GetAllGlyphIds](./getallglyphids/)() override | Returns array of all glyph ids, available in the [Font](../../aspose.font/font/). Glyph id is a unique number for a glyph, which is font type dependent. CFF [Font](../../aspose.font/font/) glyph id can be instance of ([GlyphStringId](../)) class or ([GlyphUInt32Id](../)) class. |
| [GetGlyphById](./getglyphbyid/)(System::SharedPtr\<Glyphs::GlyphId\>) override | Returns glyph by glyph id. Glyph id is a unique number for a glyph, which is font type dependent. CFF [Font](../../aspose.font/font/) glyph id can be instance of ([GlyphStringId](../)) class or ([GlyphUInt32Id](../)) class. |
| [GetGlyphById](./getglyphbyid/)(System::String) | Returns glyph by glyph name. |
| [GetGlyphById](./getglyphbyid/)(uint32_t) | Returns glyph by glyph id. |
| [GetIndexDataProvider](./getindexdataprovider/)(CffDataProviders::CffIndexProviderType) | Gets provider for the specified CFF INDEX structure type. |
| [set_CommonFontsSettings](./set_commonfontssettings/)(System::SharedPtr\<CffFontsSettings\>) | Gets/sets settings common to CFF fonts. These settings are used in different scenarios and can be changed for each individual font. |
| [set_FontFamily](./set_fontfamily/)(System::String) override | Gets [Font](../../aspose.font/font/) family. The [Font](../../aspose.font/font/) family setter is not implemented yet. |
| [set_FontName](./set_fontname/)(System::String) override | Sets [Font](../../aspose.font/font/) face name. |
| [set_Style](./set_style/)(System::String) override | Sets [Font](../../aspose.font/font/) style. This is a raw string value provided by [Font](../../aspose.font/font/) file. |
## See Also

* Class [Font](../../aspose.font/font/)
* Namespace [Aspose::Font::Cff](../)
* Library [Aspose.Font for C++](../../)
