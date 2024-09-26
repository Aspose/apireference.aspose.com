---
title: Aspose::Font::IFontEncoding class
linktitle: IFontEncoding
second_title: Aspose.Font for C++
description: 'Aspose::Font::IFontEncoding class. Defines an interface for Font encoding in C++.'
type: docs
weight: 1300
url: /cpp/aspose.font/ifontencoding/
---
## IFontEncoding class


Defines an interface for [Font](../font/) encoding.

```cpp
class IFontEncoding : public virtual System::Object
```

## Methods

| Method | Description |
| --- | --- |
| virtual [DecodeToGid](./decodetogid/)(uint32_t) | Decodes a character code and returns glyph id. Glyph id is a unique number for a glyph, which is font type dependent. For example: [Type1](../../aspose.font.type1/)'s id is a glyph name, instance of ([GlyphStringId](../)) class. TTF's id is an int index, instance of ([GlyphUInt32Id](../)) class. Note: character code is not necessary a unicode. Character code is a char index in [Font](../font/) encoding "table". |
| virtual [DecodeToGidParameterized](./decodetogidparameterized/)(System::SharedPtr\<IEncodingParameters\>, uint32_t) | Parameterized decode method. |
| virtual [Encode](./encode/)(uint32_t, uint32_t) | Encodes the glyph. For TTF Fonts the charCode is unicode. |
| virtual [GidToUnicode](./gidtounicode/)(System::SharedPtr\<Glyphs::GlyphId\>) | Decodes Gid to unicode. Glyph id is a unique number for a glyph, which is font type dependent. For example: [Type1](../../aspose.font.type1/)'s id is a glyph name, instance of ([GlyphStringId](../)) class. TTF's id is an int index, instance of ([GlyphUInt32Id](../)) class. |
| virtual [UnicodeToGid](./unicodetogid/)(uint32_t) | Decodes a unicode and returns glyph id. Glyph id is a unique number for a glyph, which is font type dependent. For example: [Type1](../../aspose.font.type1/)'s id is a glyph name, instance of ([GlyphStringId](../)) class. TTF's id is an int index, instance of ([GlyphUInt32Id](../)) class. |
## See Also

* Class [Object](../../system/object/)
* Namespace [Aspose::Font](../)
* Library [Aspose.Font for C++](../../)
