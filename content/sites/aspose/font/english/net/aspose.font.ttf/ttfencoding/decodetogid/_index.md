---
title: TtfEncoding.DecodeToGid
second_title: Aspose.Font for .NET API Reference
description: TtfEncoding method. TTF Fonts DecodeToGlyphId implementation finds unicode table and returns glyph id for unicode char. Glyph id is a unique number for a glyph which is font type dependent. For example Type1s id is a glyph name instance of GlyphStringId class. TTFs id is an int index instance of GlyphUInt32Id class
type: docs
weight: 10
url: /net/aspose.font.ttf/ttfencoding/decodetogid/
---
## TtfEncoding.DecodeToGid method

TTF Font's DecodeToGlyphId implementation finds unicode table and returns glyph id for unicode char. Glyph id is a unique number for a glyph, which is font type dependent. For example: Type1's id is a glyph name, instance of ([`GlyphStringId`](../../../aspose.font.glyphs/glyphstringid/)) class. TTF's id is an int index, instance of ([`GlyphUInt32Id`](../../../aspose.font.glyphs/glyphuint32id/)) class.

```csharp
public GlyphId DecodeToGid(uint unicode)
```

| Parameter | Type | Description |
| --- | --- | --- |
| unicode | UInt32 | Character code to get glyph identifier for. |

### Return Value

Glyph identifier related to character code passed.

### See Also

* class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* class [TtfEncoding](../)
* namespace [Aspose.Font.Ttf](../../../aspose.font.ttf/)
* assembly [Aspose.Font](../../../)


