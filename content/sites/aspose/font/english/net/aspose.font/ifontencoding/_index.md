---
title: Interface IFontEncoding
second_title: Aspose.Font for .NET API Reference
description: Aspose.Font.IFontEncoding interface. Defines an interface for Font encoding
type: docs
weight: 460
url: /net/aspose.font/ifontencoding/
---
## IFontEncoding interface

Defines an interface for Font encoding.

```csharp
public interface IFontEncoding
```

## Methods

| Name | Description |
| --- | --- |
| [DecodeToGid](../../aspose.font/ifontencoding/decodetogid/)(uint) | Decodes a character code and returns glyph id. Glyph id is a unique number for a glyph, which is font type dependent. For example: Type1's id is a glyph name, instance of ([`GlyphStringId`](../../aspose.font.glyphs/glyphstringid/)) class. TTF's id is an int index, instance of ([`GlyphUInt32Id`](../../aspose.font.glyphs/glyphuint32id/)) class. Note: character code is not necessary a unicode. Character code is a char index in Font encoding "table". |
| [DecodeToGidParameterized](../../aspose.font/ifontencoding/decodetogidparameterized/)(IEncodingParameters, uint) | Parameterized decode method. Some font types can have multiple encoding algorithms/maps. So, [`IEncodingParameters`](../iencodingparameters/) interface is used to create concrete font encoding parameters. |
| [Encode](../../aspose.font/ifontencoding/encode/)(uint, uint) | Encodes the glyph. For TTF Fonts the charCode is unicode. |
| [GidToUnicode](../../aspose.font/ifontencoding/gidtounicode/)(GlyphId) | Decodes Gid to unicode. Glyph id is a unique number for a glyph, which is font type dependent. For example: Type1's id is a glyph name, instance of ([`GlyphStringId`](../../aspose.font.glyphs/glyphstringid/)) class. TTF's id is an int index, instance of ([`GlyphUInt32Id`](../../aspose.font.glyphs/glyphuint32id/)) class. |
| [UnicodeToGid](../../aspose.font/ifontencoding/unicodetogid/)(uint) | Decodes a unicode and returns glyph id. Glyph id is a unique number for a glyph, which is font type dependent. For example: Type1's id is a glyph name, instance of ([`GlyphStringId`](../../aspose.font.glyphs/glyphstringid/)) class. TTF's id is an int index, instance of ([`GlyphUInt32Id`](../../aspose.font.glyphs/glyphuint32id/)) class. |

### See Also

* namespace [Aspose.Font](../../aspose.font/)
* assembly [Aspose.Font](../../)


