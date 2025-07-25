---
title: Class TtfEncoding
second_title: Aspose.Font for .NET API Reference
description: Aspose.Font.Ttf.TtfEncoding class. Represents TTF Font encoding
type: docs
weight: 850
url: /net/aspose.font.ttf/ttfencoding/
---
## TtfEncoding class

Represents TTF Font encoding.

```csharp
public class TtfEncoding : IFontEncoding
```

## Methods

| Name | Description |
| --- | --- |
| [DecodeToGid](../../aspose.font.ttf/ttfencoding/decodetogid/)(uint) | TTF Font's DecodeToGlyphId implementation finds unicode table and returns glyph id for unicode char. Glyph id is a unique number for a glyph, which is font type dependent. For example: Type1's id is a glyph name, instance of ([`GlyphStringId`](../../aspose.font.glyphs/glyphstringid/)) class. TTF's id is an int index, instance of ([`GlyphUInt32Id`](../../aspose.font.glyphs/glyphuint32id/)) class. |
| [DecodeToGidParameterized](../../aspose.font.ttf/ttfencoding/decodetogidparameterized/)(IEncodingParameters, uint) | Parametrized version allows to use specific CMap table (not unicode). |
| [Encode](../../aspose.font.ttf/ttfencoding/encode/)(uint, uint) | Encodes the glyph. For TTF Fonts the character code is unicode. |
| [GidToUnicode](../../aspose.font.ttf/ttfencoding/gidtounicode/)(GlyphId) | Decodes glyph id to unicode. Glyph id is a unique number for a glyph, which is font type dependent. For example: Type1's id is a glyph name, instance of ([`GlyphStringId`](../../aspose.font.glyphs/glyphstringid/)) class. TTF's id is an int index, instance of ([`GlyphUInt32Id`](../../aspose.font.glyphs/glyphuint32id/)) class. |
| [UnicodeToGid](../../aspose.font.ttf/ttfencoding/unicodetogid/)(uint) | Decodes a unicode and returns glyph id. |

### See Also

* interface [IFontEncoding](../../aspose.font/ifontencoding/)
* namespace [Aspose.Font.Ttf](../../aspose.font.ttf/)
* assembly [Aspose.Font](../../)


