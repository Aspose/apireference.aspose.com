---
title: Class Type1Encoding
second_title: Aspose.Font for .NET API Reference
description: Aspose.Font.Type1.Type1Encoding class. Represents Type1 Font encoding
type: docs
weight: 1410
url: /net/aspose.font.type1/type1encoding/
---
## Type1Encoding class

Represents Type1 Font encoding.

```csharp
public class Type1Encoding : IFontEncoding, ISupportsNameAddressing
```

## Methods

| Name | Description |
| --- | --- |
| [DecodeToGid](../../aspose.font.type1/type1encoding/decodetogid/)(uint) | Decodes Gid to unicode. Glyph id is a unique number for a glyph, which is font type dependent. For example: Type1's id is a glyph name, instance of ([`GlyphStringId`](../../aspose.font.glyphs/glyphstringid/)) class. TTF's id is an int index, instance of ([`GlyphUInt32Id`](../../aspose.font.glyphs/glyphuint32id/)) class. |
| [DecodeToGidParameterized](../../aspose.font.type1/type1encoding/decodetogidparameterized/)(IEncodingParameters, uint) | Parameterized decode method. Not supported for Type1 Font type. |
| [Encode](../../aspose.font.type1/type1encoding/encode/)(uint, uint) | Encodes the glyph. For TTF Fonts the character code is unicode. Not supported for Type1 Font types. |
| [GetNameToCharCodeIndex](../../aspose.font.type1/type1encoding/getnametocharcodeindex/)() | Returns name to character code encoding map. Note: Character code is not a unicode. Character code is a char index in Font encoding "table". |
| [GidToUnicode](../../aspose.font.type1/type1encoding/gidtounicode/)(GlyphId) | Decodes Gid to Unicode. Glyph id is a unique number for a glyph, which is font type dependent. For example: Type1's id is a glyph name, instance of ([`GlyphStringId`](../../aspose.font.glyphs/glyphstringid/)) class. TTF's id is an int index, instance of ([`GlyphUInt32Id`](../../aspose.font.glyphs/glyphuint32id/)) class. |
| [UnicodeToGid](../../aspose.font.type1/type1encoding/unicodetogid/)(uint) | Returns GlyphId for unicode. Or notdef if font doesn't contain glyph for the unicode. Glyph id is a unique number for a glyph, which is font type dependent. For example: Type1's id is a glyph name, instance of ([`GlyphStringId`](../../aspose.font.glyphs/glyphstringid/)) class. TTF's id is an int index, instance of ([`GlyphUInt32Id`](../../aspose.font.glyphs/glyphuint32id/)) class. |

### See Also

* interface [IFontEncoding](../../aspose.font/ifontencoding/)
* interface [ISupportsNameAddressing](../../aspose.font/isupportsnameaddressing/)
* namespace [Aspose.Font.Type1](../../aspose.font.type1/)
* assembly [Aspose.Font](../../)


