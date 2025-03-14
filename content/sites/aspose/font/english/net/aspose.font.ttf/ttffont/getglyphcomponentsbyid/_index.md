---
title: TtfFont.GetGlyphComponentsById
second_title: Aspose.Font for .NET API Reference
description: TtfFont method. Gets a glyph by glyph identifier passed and fills passed list of glyph identifiers with components of this glyph. Glyph id is a unique number for a glyph which is font type dependent. TTF Font glyph id can be instance of GlyphStringId class or GlyphUInt32Id class. Name string glyph addressing is supported for TTF Fonts via Post table mapping. In case CFF Font inside the CFF structures are used to address glyphs by name
type: docs
weight: 190
url: /net/aspose.font.ttf/ttffont/getglyphcomponentsbyid/
---
## GetGlyphComponentsById(GlyphId, GlyphIdList) {#getglyphcomponentsbyid}

Gets a glyph by glyph identifier passed and fills passed list of glyph identifiers with components of this glyph. Glyph id is a unique number for a glyph, which is font type dependent. TTF Font glyph id can be instance of ([`GlyphStringId`](../../../aspose.font.glyphs/glyphstringid/)) class or ([`GlyphUInt32Id`](../../../aspose.font.glyphs/glyphuint32id/)) class. Name (string) glyph addressing is supported for TTF Fonts via Post table mapping. In case CFF Font inside, the CFF structures are used to address glyphs by name.

```csharp
public virtual void GetGlyphComponentsById(GlyphId id, GlyphIdList componentsToPopulate)
```

| Parameter | Type | Description |
| --- | --- | --- |
| id | GlyphId | Glyph id. |
| componentsToPopulate | GlyphIdList | List of glyph identifiers to fill. |

## Remarks

Empty collection componentsToPopulate should be passed that will contain glyph components id list.

### See Also

* class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* class [GlyphIdList](../../../aspose.font.glyphs/glyphidlist/)
* class [TtfFont](../)
* namespace [Aspose.Font.Ttf](../../../aspose.font.ttf/)
* assembly [Aspose.Font](../../../)

---

## GetGlyphComponentsById(string, GlyphIdList) {#getglyphcomponentsbyid_1}

Gets a glyph by glyph name passed and fills passed list of glyph identifiers with components of this glyph.

```csharp
public void GetGlyphComponentsById(string glyphName, GlyphIdList componentsToPopulate)
```

| Parameter | Type | Description |
| --- | --- | --- |
| glyphName | String | Glyph name. |
| componentsToPopulate | GlyphIdList | List of glyph identifiers to fill. |

## Remarks

Empty collection componentsToPopulate should be passed that will contain glyph components id list.

### See Also

* class [GlyphIdList](../../../aspose.font.glyphs/glyphidlist/)
* class [TtfFont](../)
* namespace [Aspose.Font.Ttf](../../../aspose.font.ttf/)
* assembly [Aspose.Font](../../../)

---

## GetGlyphComponentsById(uint, GlyphIdList) {#getglyphcomponentsbyid_2}

Gets a glyph by glyph index passed and fills passed list of glyph identifiers with components of this glyph.

```csharp
public void GetGlyphComponentsById(uint id, GlyphIdList componentsToPopulate)
```

| Parameter | Type | Description |
| --- | --- | --- |
| id | UInt32 | Glyph index. |
| componentsToPopulate | GlyphIdList | List of glyph identifiers to fill. |

## Remarks

Empty collection componentsToPopulate should be passed that will contain glyph components id list.

### See Also

* class [GlyphIdList](../../../aspose.font.glyphs/glyphidlist/)
* class [TtfFont](../)
* namespace [Aspose.Font.Ttf](../../../aspose.font.ttf/)
* assembly [Aspose.Font](../../../)


