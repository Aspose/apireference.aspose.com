---
title: Aspose::Font::Type1::Type1Encoding class
linktitle: Type1Encoding
second_title: Aspose.Font for C++
description: 'Aspose::Font::Type1::Type1Encoding class. Represents Type1Font encoding in C++.'
type: docs
weight: 200
url: /cpp/aspose.font.type1/type1encoding/
---
## Type1Encoding class


Represents [Type1](../)[Font](../../aspose.font/font/) encoding.

```cpp
class Type1Encoding : public Aspose::Font::IFontEncoding,
                      public Aspose::Font::ISupportsNameAddressing
```

## Methods

| Method | Description |
| --- | --- |
| [DecodeToGid](./decodetogid/)(uint32_t) override | Decodes Gid to unicode. Glyph id is a unique number for a glyph, which is font type dependent. For example: [Type1](../)'s id is a glyph name, instance of ([GlyphStringId](../)) class. TTF's id is an int index, instance of ([GlyphUInt32Id](../)) class. |
| [DecodeToGidParameterized](./decodetogidparameterized/)(System::SharedPtr\<IEncodingParameters\>, uint32_t) override | Parameterized decode method. Not supported for [Type1](../)[Font](../../aspose.font/font/) type. |
| [Encode](./encode/)(uint32_t, uint32_t) override | Encodes the glyph. For TTF Fonts the character code is unicode. Not supported for [Type1](../)[Font](../../aspose.font/font/) types. |
| [GetNameToCharCodeIndex](./getnametocharcodeindex/)() override | Returns name to character code encoding map. Note: Character code is not a unicode. Character code is a char index in [Font](../../aspose.font/font/) encoding "table". |
| [GidToUnicode](./gidtounicode/)(System::SharedPtr\<Glyphs::GlyphId\>) override | Decodes Gid to Unicode. Glyph id is a unique number for a glyph, which is font type dependent. For example: [Type1](../)'s id is a glyph name, instance of ([GlyphStringId](../)) class. TTF's id is an int index, instance of ([GlyphUInt32Id](../)) class. |
| [UnicodeToGid](./unicodetogid/)(uint32_t) override | Returns GlyphId for unicode. Or notdef if font doesn't contain glyph for the unicode. Glyph id is a unique number for a glyph, which is font type dependent. For example: [Type1](../)'s id is a glyph name, instance of ([GlyphStringId](../)) class. TTF's id is an int index, instance of ([GlyphUInt32Id](../)) class. |
## See Also

* Class [IFontEncoding](../../aspose.font/ifontencoding/)
* Class [ISupportsNameAddressing](../../aspose.font/isupportsnameaddressing/)
* Namespace [Aspose::Font::Type1](../)
* Library [Aspose.Font for C++](../../)
