---
title: IFontCharactersMerger.MergeFonts
second_title: Aspose.Font for .NET API Reference
description: IFontCharactersMerger method. Merges fonts based on glyphs lists passed. Searches for a character code for every glyph passed and add found character code with correspondent glyph into resultant new font
type: docs
weight: 10
url: /net/aspose.font.ttfhelpers/ifontcharactersmerger/mergefonts/
---
## MergeFonts(GlyphId[], GlyphId[], string) {#mergefonts}

Merges fonts based on glyphs lists passed. Searches for a character code for every glyph passed and add found character code with correspondent glyph into resultant new font.

```csharp
public TtfFont MergeFonts(GlyphId[] font1Glyphs, GlyphId[] font2Glyphs, string newFontName)
```

| Parameter | Type | Description |
| --- | --- | --- |
| font1Glyphs | GlyphId[] | List of glyphs from first font |
| font2Glyphs | GlyphId[] | List of glyphs from second font |
| newFontName | String | Desired name for resultant font |

### Return Value

Merged font

### See Also

* class [TtfFont](../../../aspose.font.ttf/ttffont/)
* class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* interface [IFontCharactersMerger](../)
* namespace [Aspose.Font.TtfHelpers](../../../aspose.font.ttfhelpers/)
* assembly [Aspose.Font](../../../)

---

## MergeFonts(uint[], uint[], string) {#mergefonts_2}

Merges fonts based on character codes lists passed. To create desired resultant font just pass symbol codes from original fonts you want to include into resultant font. Glyphs related to codes passed will be found automatically. For example, if you want to include into resultant font glyphs related to letters A and B from first font and glyphs, related to letters C and D from second font, just call this method like this:

```csharp
MergeFonts(new uint[] { 'A', 'B' }, new uint[] { 'C', 'D' }, "NewFont")
```

```csharp
public TtfFont MergeFonts(uint[] font1CharCodes, uint[] font2CharCodes, string newFontName)
```

| Parameter | Type | Description |
| --- | --- | --- |
| font1CharCodes | UInt32[] | Codes to take from first font |
| font2CharCodes | UInt32[] | Codes to take from second font |
| newFontName | String | Desired name for resultant font |

### Return Value

Merged font

### See Also

* class [TtfFont](../../../aspose.font.ttf/ttffont/)
* interface [IFontCharactersMerger](../)
* namespace [Aspose.Font.TtfHelpers](../../../aspose.font.ttfhelpers/)
* assembly [Aspose.Font](../../../)

---

## MergeFonts(IDictionary&lt;uint, GlyphId&gt;, IDictionary&lt;uint, GlyphId&gt;, string) {#mergefonts_1}

This method version designed for cases when you want to set character codes for glyphs in resultant font explicitly. It's not mandatory that code for glyph you provided is included in original font. The sense of code passed is that it will be associated with correspondent glyph identifier in resultant font. So, rule to process every pair passed by dictionary parameter[code, glyph ideitifier] is that only glyph identifer will be taken from original font and then it will be linked with correspondent code in resultant font. It can be helpful when some codes from first font conflict with same codes from second font.

```csharp
public TtfFont MergeFonts(IDictionary<uint, GlyphId> font1Dict, 
    IDictionary<uint, GlyphId> font2Dict, string newFontName)
```

| Parameter | Type | Description |
| --- | --- | --- |
| font1Dict | IDictionary`2 | Dictionary with pairs [symbol code, glyph identifier] from first font |
| font2Dict | IDictionary`2 | Dictionary with pairs [symbol code, glyph identifier] from second font |
| newFontName | String | Desired name for resultant font |

### Return Value

Merged font

### See Also

* class [TtfFont](../../../aspose.font.ttf/ttffont/)
* class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* interface [IFontCharactersMerger](../)
* namespace [Aspose.Font.TtfHelpers](../../../aspose.font.ttfhelpers/)
* assembly [Aspose.Font](../../../)


