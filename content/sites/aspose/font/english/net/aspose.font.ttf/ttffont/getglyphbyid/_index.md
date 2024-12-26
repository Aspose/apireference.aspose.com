---
title: TtfFont.GetGlyphById
second_title: Aspose.Font for .NET API Reference
description: TtfFont method. Returns glyph by glyph id. Glyph id is a unique number for a glyph which is font type dependent. TTF Font glyph id can be instance of GlyphStringId class or GlyphUInt32Id class. Name string glyph addressing is supported for TTF Fonts via Post table mapping. In case CFF Font inside the CFF structures are used to address glyphs by name
type: docs
weight: 180
url: /net/aspose.font.ttf/ttffont/getglyphbyid/
---
## GetGlyphById(GlyphId) {#getglyphbyid}

Returns glyph by glyph id. Glyph id is a unique number for a glyph, which is font type dependent. TTF Font glyph id can be instance of ([`GlyphStringId`](../../../aspose.font.glyphs/glyphstringid/)) class or ([`GlyphUInt32Id`](../../../aspose.font.glyphs/glyphuint32id/)) class. Name (string) glyph addressing is supported for TTF Fonts via Post table mapping. In case CFF Font inside, the CFF structures are used to address glyphs by name.

```csharp
public override Glyph GetGlyphById(GlyphId id)
```

| Parameter | Type | Description |
| --- | --- | --- |
| id | GlyphId | Glyph id. |

### Return Value

Glyph.

### See Also

* class [Glyph](../../../aspose.font.glyphs/glyph/)
* class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* class [TtfFont](../)
* namespace [Aspose.Font.Ttf](../../../aspose.font.ttf/)
* assembly [Aspose.Font](../../../)

---

## GetGlyphById(string) {#getglyphbyid_1}

Returns glyph by glyph name. Name (string) glyph addressing is supported for TTF fonts via Post table mapping. In case CFF Font inside, the CFF structures are used to address glyphs by name.

```csharp
public Glyph GetGlyphById(string glyphName)
```

| Parameter | Type | Description |
| --- | --- | --- |
| glyphName | String | Glyph string identifier. |

### Return Value

Glyph.

### See Also

* class [Glyph](../../../aspose.font.glyphs/glyph/)
* class [TtfFont](../)
* namespace [Aspose.Font.Ttf](../../../aspose.font.ttf/)
* assembly [Aspose.Font](../../../)

---

## GetGlyphById(uint) {#getglyphbyid_2}

Returns glyph by glyph id.

```csharp
public Glyph GetGlyphById(uint id)
```

| Parameter | Type | Description |
| --- | --- | --- |
| id | UInt32 | Glyph index. |

### Return Value

Glyph.

### See Also

* class [Glyph](../../../aspose.font.glyphs/glyph/)
* class [TtfFont](../)
* namespace [Aspose.Font.Ttf](../../../aspose.font.ttf/)
* assembly [Aspose.Font](../../../)


