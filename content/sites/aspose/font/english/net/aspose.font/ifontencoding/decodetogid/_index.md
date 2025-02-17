---
title: IFontEncoding.DecodeToGid
second_title: Aspose.Font for .NET API Reference
description: IFontEncoding method. Decodes a character code and returns glyph id. Glyph id is a unique number for a glyph which is font type dependent. For example Type1s id is a glyph name instance of GlyphStringId class. TTFs id is an int index instance of GlyphUInt32Id class. Note character code is not necessary a unicode. Character code is a char index in Font encoding table
type: docs
weight: 10
url: /net/aspose.font/ifontencoding/decodetogid/
---
## IFontEncoding.DecodeToGid method

Decodes a character code and returns glyph id. Glyph id is a unique number for a glyph, which is font type dependent. For example: Type1's id is a glyph name, instance of ([`GlyphStringId`](../../../aspose.font.glyphs/glyphstringid/)) class. TTF's id is an int index, instance of ([`GlyphUInt32Id`](../../../aspose.font.glyphs/glyphuint32id/)) class. Note: character code is not necessary a unicode. Character code is a char index in Font encoding "table".

```csharp
public GlyphId DecodeToGid(uint charCode)
```

| Parameter | Type | Description |
| --- | --- | --- |
| charCode | UInt32 | Character code to get glyph identifier for. |

### Return Value

Glyph identifier related to charCode passed.

### See Also

* class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* interface [IFontEncoding](../)
* namespace [Aspose.Font](../../../aspose.font/)
* assembly [Aspose.Font](../../../)


