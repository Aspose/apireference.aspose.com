---
title: Type1Encoding.UnicodeToGid
second_title: Aspose.Font for .NET API Reference
description: Type1Encoding method. Returns GlyphId for unicode. Or notdef if font doesnt contain glyph for the unicode. Glyph id is a unique number for a glyph which is font type dependent. For example Type1s id is a glyph name instance of GlyphStringId class. TTFs id is an int index instance of GlyphUInt32Id class
type: docs
weight: 60
url: /net/aspose.font.type1/type1encoding/unicodetogid/
---
## Type1Encoding.UnicodeToGid method

Returns GlyphId for unicode. Or notdef if font doesn't contain glyph for the unicode. Glyph id is a unique number for a glyph, which is font type dependent. For example: Type1's id is a glyph name, instance of ([`GlyphStringId`](../../../aspose.font.glyphs/glyphstringid/)) class. TTF's id is an int index, instance of ([`GlyphUInt32Id`](../../../aspose.font.glyphs/glyphuint32id/)) class.

```csharp
public GlyphId UnicodeToGid(uint unicode)
```

| Parameter | Type | Description |
| --- | --- | --- |
| unicode | UInt32 | Unicode to get glyph identifier for. |

### Return Value

Glyph identifier related to unicode passed.

### See Also

* class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* class [Type1Encoding](../)
* namespace [Aspose.Font.Type1](../../../aspose.font.type1/)
* assembly [Aspose.Font](../../../)


