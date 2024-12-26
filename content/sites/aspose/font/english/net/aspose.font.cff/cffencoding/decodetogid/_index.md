---
title: CffEncoding.DecodeToGid
second_title: Aspose.Font for .NET API Reference
description: CffEncoding method. Gets Gid for charCode passed. This method designed for a CFF CIDFonts where charCode must be a valid CID value. Glyph id is a unique number for a glyph which is font type dependent. CFF Font glyph id can be instance of GlyphStringId class or GlyphUInt32Id class
type: docs
weight: 10
url: /net/aspose.font.cff/cffencoding/decodetogid/
---
## CffEncoding.DecodeToGid method

Gets Gid for charCode passed. This method designed for a CFF CIDFonts, where charCode must be a valid CID value. Glyph id is a unique number for a glyph, which is font type dependent. CFF Font glyph id can be instance of ([`GlyphStringId`](../../../aspose.font.glyphs/glyphstringid/)) class or ([`GlyphUInt32Id`](../../../aspose.font.glyphs/glyphuint32id/)) class.

```csharp
public GlyphId DecodeToGid(uint charCode)
```

| Parameter | Type | Description |
| --- | --- | --- |
| charCode | UInt32 | Character code(CID) to get glyph identifier for. |

### Return Value

Glyph identifier related to CID passed.

### See Also

* class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* class [CffEncoding](../)
* namespace [Aspose.Font.Cff](../../../aspose.font.cff/)
* assembly [Aspose.Font](../../../)


