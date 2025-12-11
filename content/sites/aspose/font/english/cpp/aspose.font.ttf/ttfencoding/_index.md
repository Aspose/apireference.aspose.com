---
title: Aspose::Font::Ttf::TtfEncoding class
linktitle: TtfEncoding
second_title: Aspose.Font for C++
description: 'Aspose::Font::Ttf::TtfEncoding class. Represents TTF Font encoding in C++.'
type: docs
weight: 400
url: /cpp/aspose.font.ttf/ttfencoding/
---
## TtfEncoding class


Represents TTF [Font](../../aspose.font/font/) encoding.

```cpp
class TtfEncoding : public Aspose::Font::IFontEncoding
```

## Methods

| Method | Description |
| --- | --- |
| [DecodeToGid](./decodetogid/)(uint32_t) override | TTF [Font](../../aspose.font/font/)'s DecodeToGlyphId implementation finds unicode table and returns glyph id for unicode char. Glyph id is a unique number for a glyph, which is font type dependent. For example: [Type1](../../aspose.font.type1/)'s id is a glyph name, instance of ([GlyphStringId](../)) class. TTF's id is an int index, instance of ([GlyphUInt32Id](../)) class. |
| [DecodeToGidParameterized](./decodetogidparameterized/)(System::SharedPtr\<IEncodingParameters\>, uint32_t) override | Parametrized version allows to use specific CMap table (not unicode). |
| [Encode](./encode/)(uint32_t, uint32_t) override | Encodes the glyph. For TTF Fonts the character code is unicode. |
| [GidToUnicode](./gidtounicode/)(System::SharedPtr\<Glyphs::GlyphId\>) override | Decodes glyph id to unicode. Glyph id is a unique number for a glyph, which is font type dependent. For example: [Type1](../../aspose.font.type1/)'s id is a glyph name, instance of ([GlyphStringId](../)) class. TTF's id is an int index, instance of ([GlyphUInt32Id](../)) class. |
| [UnicodeToGid](./unicodetogid/)(uint32_t) override | Decodes a unicode and returns glyph id. |
## See Also

* Class [IFontEncoding](../../aspose.font/ifontencoding/)
* Namespace [Aspose::Font::Ttf](../)
* Library [Aspose.Font for C++](../../)
