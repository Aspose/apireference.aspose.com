---
title: FontCharactersMerger.MergeFonts
second_title: Aspose.Font for .NET API Reference
description: FontCharactersMerger method. Merges fonts based on glyphs lists passed. Searches for a character code for every glyph passed and adds found character code with correspondent glyph into resultant new font
type: docs
weight: 30
url: /net/aspose.font.common_fontmerger/fontcharactersmerger/mergefonts/
---
## MergeFonts(GlyphId[], GlyphId[], string) {#mergefonts}

Merges fonts based on glyphs lists passed. Searches for a character code for every glyph passed and adds found character code with correspondent glyph into resultant new font.

```csharp
public abstract Font MergeFonts(GlyphId[] primaryFontGlyphs, GlyphId[] secondaryFontGlyphs, 
    string newFontName)
```

| Parameter | Type | Description |
| --- | --- | --- |
| primaryFontGlyphs | GlyphId[] | List of glyphs to take from primary font |
| secondaryFontGlyphs | GlyphId[] | List of glyphs to take from secondary font |
| newFontName | String | Desired name for resultant font |

### Return Value

Merged font

### See Also

* class [Font](../../../aspose.font/font/)
* class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* class [FontCharactersMerger](../)
* namespace [Aspose.Font.Common_FontMerger](../../../aspose.font.common_fontmerger/)
* assembly [Aspose.Font](../../../)

---

## MergeFonts(uint[], uint[], string) {#mergefonts_2}

Merges fonts based on character codes lists passed. To create desired resultant font just pass symbol codes from original fonts you want to include into resultant font. Glyphs related to codes passed will be found automatically. For example, if you want to include into resultant font glyphs related to letters A and B from first font and glyphs, related to letters C and D from second font, just call this method like this:

```csharp
MergeFonts(new uint[] { 'A', 'B' }, new uint[] { 'C', 'D' }, "NewFont")
```

```csharp
public abstract Font MergeFonts(uint[] primaryFontCharCodes, uint[] secondaryFontCharCodes, 
    string newFontName)
```

| Parameter | Type | Description |
| --- | --- | --- |
| primaryFontCharCodes | UInt32[] | Codes to take from primary font |
| secondaryFontCharCodes | UInt32[] | Codes to take from secondary font |
| newFontName | String | Desired name for resultant font |

### Return Value

Merged font

### See Also

* class [Font](../../../aspose.font/font/)
* class [FontCharactersMerger](../)
* namespace [Aspose.Font.Common_FontMerger](../../../aspose.font.common_fontmerger/)
* assembly [Aspose.Font](../../../)

---

## MergeFonts(IDictionary&lt;uint, GlyphId&gt;, IDictionary&lt;uint, GlyphId&gt;, string) {#mergefonts_1}

This method version designed for cases when you want to set character codes for glyphs in resultant font explicitly. It's not mandatory that code for glyph you provided is included in original font. The sense of code passed is that it will be associated with correspondent glyph identifier in resultant font. So, rule to process every pair passed by dictionary parameter[code, glyph ideitifier] is that only glyph identifer will be taken from original font and then it will be linked with correspondent code in resultant font. It can be helpful when some codes from first font conflict with same codes from second font.

```csharp
public abstract Font MergeFonts(IDictionary<uint, GlyphId> primaryFontDict, 
    IDictionary<uint, GlyphId> secondaryFontDict, string newFontName)
```

| Parameter | Type | Description |
| --- | --- | --- |
| primaryFontDict | IDictionary`2 | Dictionary with pairs [symbol code, glyph identifier] from primary font |
| secondaryFontDict | IDictionary`2 | Dictionary with pairs [symbol code, glyph identifier] from secondary font |
| newFontName | String | Desired name for resultant font |

### Return Value

Merged font

### See Also

* class [Font](../../../aspose.font/font/)
* class [GlyphId](../../../aspose.font.glyphs/glyphid/)
* class [FontCharactersMerger](../)
* namespace [Aspose.Font.Common_FontMerger](../../../aspose.font.common_fontmerger/)
* assembly [Aspose.Font](../../../)


