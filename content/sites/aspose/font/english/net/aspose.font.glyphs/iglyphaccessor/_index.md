---
title: Interface IGlyphAccessor
second_title: Aspose.Font for .NET API Reference
description: Aspose.Font.Glyphs.IGlyphAccessor interface. Defines functionality to retrieve specified glyph identifiers and glyphs
type: docs
weight: 420
url: /net/aspose.font.glyphs/iglyphaccessor/
---
## IGlyphAccessor interface

Defines functionality to retrieve specified glyph identifiers and glyphs.

```csharp
public interface IGlyphAccessor
```

## Properties

| Name | Description |
| --- | --- |
| [GlyphIdType](../../aspose.font.glyphs/iglyphaccessor/glyphidtype/) { get; } | Glyph id type specification. |

## Methods

| Name | Description |
| --- | --- |
| [GetAllGlyphIds](../../aspose.font.glyphs/iglyphaccessor/getallglyphids/)() | Returns all glyph ids, available in the Font. Glyph id is a unique number for a glyph, which is font type dependent. For example: Type1's id is a glyph name, instance of ([`GlyphStringId`](../glyphstringid/)) class. TTF's id is an int index, instance of ([`GlyphUInt32Id`](../glyphuint32id/)) class. |
| [GetGlyphById](../../aspose.font.glyphs/iglyphaccessor/getglyphbyid/)(GlyphId) | Returns glyph by glyph id. Glyph id is a unique number for a glyph, which is font type dependent. GlyphId - derived object. For example: Type1's id is a glyph name, instance of ([`GlyphStringId`](../glyphstringid/)) class. TTF's id is an int index, instance of ([`GlyphUInt32Id`](../glyphuint32id/)) class. |
| [GetGlyphsForText](../../aspose.font.glyphs/iglyphaccessor/getglyphsfortext/)(string) | Get glyphs representation for text. |

### See Also

* namespace [Aspose.Font.Glyphs](../../aspose.font.glyphs/)
* assembly [Aspose.Font](../../)


