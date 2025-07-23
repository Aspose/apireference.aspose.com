---
title: IFontCharactersMerger
second_title: Aspose.Font for Java API Reference
description: Declares helpers functionality to merge TrueType fonts.
type: docs
weight: 122
url: /java/com.aspose.font/ifontcharactersmerger/
---```
public interface IFontCharactersMerger
```

Declares helpers functionality to merge TrueType fonts. Font which is passed by parameter font1 considered as primary. It means that many characteristics, related to final merged font, such as metrics, encoding structure and others, will be taken from this primary font.
## Methods

| Method | Description |
| --- | --- |
| [mergeFonts(GlyphId[] font1Glyphs, GlyphId[] font2Glyphs, String newFontName)](#mergeFonts-com.aspose.font.GlyphId---com.aspose.font.GlyphId---java.lang.String-) | Merges fonts based on glyphs lists passed. |
| [mergeFonts(int[] font1CharCodes, int[] font2CharCodes, String newFontName)](#mergeFonts-int---int---java.lang.String-) | Merges fonts based on character codes lists passed. |
| [mergeFonts(Map<Integer,GlyphId> font1Dict, Map<Integer,GlyphId> font2Dict, String newFontName)](#mergeFonts-java.util.Map-java.lang.Integer-com.aspose.font.GlyphId--java.util.Map-java.lang.Integer-com.aspose.font.GlyphId--java.lang.String-) | This method version designed for cases when you want to set character codes for glyphs in resultant font explicitly. |
### mergeFonts(GlyphId[] font1Glyphs, GlyphId[] font2Glyphs, String newFontName) {#mergeFonts-com.aspose.font.GlyphId---com.aspose.font.GlyphId---java.lang.String-}
```
public abstract TtfFont mergeFonts(GlyphId[] font1Glyphs, GlyphId[] font2Glyphs, String newFontName)
```


Merges fonts based on glyphs lists passed. Searches for a character code for every glyph passed and add found character code with correspondent glyph into resultant new font.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| font1Glyphs | [GlyphId\[\]](../../com.aspose.font/glyphid) | List of glyphs from first font |
| font2Glyphs | [GlyphId\[\]](../../com.aspose.font/glyphid) | List of glyphs from second font |
| newFontName | java.lang.String | Desired name for resultant font |

**Returns:**
[TtfFont](../../com.aspose.font/ttffont) - Merged font
### mergeFonts(int[] font1CharCodes, int[] font2CharCodes, String newFontName) {#mergeFonts-int---int---java.lang.String-}
```
public abstract TtfFont mergeFonts(int[] font1CharCodes, int[] font2CharCodes, String newFontName)
```


Merges fonts based on character codes lists passed. To create desired resultant font just pass symbol codes from original fonts you want to include into resultant font. Glyphs related to codes passed will be found automatically. For example, if you want to include into resultant font glyphs related to letters A and B from first font and glyphs, related to letters C and D from second font, just call this method like this:  MergeFonts(new uint[] \{ 'A', 'B' \}, new uint[] \{ 'C', 'D' \}, "NewFont") 

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| font1CharCodes | int[] | Codes to take from first font |
| font2CharCodes | int[] | Codes to take from second font |
| newFontName | java.lang.String | Desired name for resultant font |

**Returns:**
[TtfFont](../../com.aspose.font/ttffont) - Merged font
### mergeFonts(Map<Integer,GlyphId> font1Dict, Map<Integer,GlyphId> font2Dict, String newFontName) {#mergeFonts-java.util.Map-java.lang.Integer-com.aspose.font.GlyphId--java.util.Map-java.lang.Integer-com.aspose.font.GlyphId--java.lang.String-}
```
public abstract TtfFont mergeFonts(Map<Integer,GlyphId> font1Dict, Map<Integer,GlyphId> font2Dict, String newFontName)
```


This method version designed for cases when you want to set character codes for glyphs in resultant font explicitly. It's not mandatory that code for glyph you provided is included in original font. The sense of code passed is that it will be associated with correspondent glyph identifier in resultant font. So, rule to process every pair passed by dictionary parameter[code, glyph ideitifier] is that only glyph identifer will be taken from original font and then it will be linked with correspondent code in resultant font. It can be helpful when some codes from first font conflict with same codes from second font.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| font1Dict | java.util.Map<java.lang.Integer,com.aspose.font.GlyphId> | Dictionary with pairs [symbol code, glyph identifier] from first font |
| font2Dict | java.util.Map<java.lang.Integer,com.aspose.font.GlyphId> | Dictionary with pairs [symbol code, glyph identifier] from second font |
| newFontName | java.lang.String | Desired name for resultant font |

**Returns:**
[TtfFont](../../com.aspose.font/ttffont) - Merged font
