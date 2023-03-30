---
title: IFontEncoding.UnicodeToGid
second_title: Aspose.Font for .NET API Reference
description: IFontEncoding method. Decodes a unicode and returns glyph id. Glyph id is a unique number for a glyph which is font type dependent. For example Type1s id is a glyph name instance of GlyphStringId class. TTFs id is an int index instance of GlyphUInt32Id class
type: docs
weight: 50
url: /net/aspose.font/ifontencoding/unicodetogid/
---
## IFontEncoding.UnicodeToGid method

Decodes a unicode and returns glyph id. Glyph id is a unique number for a glyph, which is font type dependent. For example: Type1's id is a glyph name, instance of ([`GlyphStringId`](../../../aspose.font.glyphs/glyphstringid/)) class. TTF's id is an int index, instance of ([`GlyphUInt32Id`](../../../aspose.font.glyphs/glyphuint32id/)) class.

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
* interface [IFontEncoding](../)
* namespace [Aspose.Font](../../ifontencoding/)
* assembly [Aspose.Font](../../../)


