---
title: Aspose::Font::Cff::CffEncoding class
linktitle: CffEncoding
second_title: Aspose.Font for C++
description: 'Aspose::Font::Cff::CffEncoding class. Represents CFF Font encoding in C++.'
type: docs
weight: 100
url: /cpp/aspose.font.cff/cffencoding/
---
## CffEncoding class


Represents CFF [Font](../../aspose.font/font/) encoding.

```cpp
class CffEncoding : public Aspose::Font::IFontEncoding,
                    public Aspose::Font::ISupportsNameAddressing
```

## Methods

| Method | Description |
| --- | --- |
| [DecodeToGid](./decodetogid/)(uint32_t) override | Gets Gid for charCode passed. This method designed for a CFF CIDFonts, where charCode must be a valid CID value. Glyph id is a unique number for a glyph, which is font type dependent. CFF [Font](../../aspose.font/font/) glyph id can be instance of ([GlyphStringId](../)) class or ([GlyphUInt32Id](../)) class. |
| [DecodeToGidParameterized](./decodetogidparameterized/)(System::SharedPtr\<IEncodingParameters\>, uint32_t) override | Parameterized decode method. Not supported for CFF [Font](../../aspose.font/font/) type. |
| [Encode](./encode/)(uint32_t, uint32_t) override | Encodes the glyph. Not supported for CFF [Font](../../aspose.font/font/) types. |
| [GetNameToCharCodeIndex](./getnametocharcodeindex/)() override | Returns name to character code encoding map. Note: character code is not a unicode. Character code is a char index in [Font](../../aspose.font/font/) encoding "table". |
| [GetNameToGidIndex](./getnametogidindex/)() | Returns name to character code encoding map. Note: Character code is not a unicode. Character code is a char index in [Font](../../aspose.font/font/) encoding "table". |
| [GetNameToSidIndex](./getnametosidindex/)() | Returns name to character code encoding map. Note: Character code is not a unicode. Character code is a char index in [Font](../../aspose.font/font/) encoding "table". |
| [GetSidName](./getsidname/)(int32_t) | Gets name for the SID specified. |
| [GidToUnicode](./gidtounicode/)(System::SharedPtr\<Glyphs::GlyphId\>) override | Decodes Gid to unicode. Glyph id is a unique number for a glyph, which is font type dependent. CFF [Font](../../aspose.font/font/) glyph id can be instance of ([GlyphStringId](../)) class or ([GlyphUInt32Id](../)) class. |
| [UnicodeToGid](./unicodetogid/)(uint32_t) override | Decodes a unicode and returns glyph id. Glyph id is a unique number for a glyph, which is font type dependent. CFF [Font](../../aspose.font/font/) glyph id can be instance of ([GlyphStringId](../)) class or ([GlyphUInt32Id](../)) class. |
## See Also

* Class [IFontEncoding](../../aspose.font/ifontencoding/)
* Class [ISupportsNameAddressing](../../aspose.font/isupportsnameaddressing/)
* Namespace [Aspose::Font::Cff](../)
* Library [Aspose.Font for C++](../../)
