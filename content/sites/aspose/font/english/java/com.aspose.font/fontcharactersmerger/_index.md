---
title: FontCharactersMerger
second_title: Aspose.Font for Java API Reference
description: Declares functionality to merge fonts of different types.
type: docs
weight: 34
url: /java/com.aspose.font/fontcharactersmerger/
---
**Inheritance:**
java.lang.Object
```
public abstract class FontCharactersMerger
```

Declares functionality to merge fonts of different types. Fonts pair is needed for merge operation. One font from this pair is considered as primary. It means that many characteristics, related to final merged font, such as metrics, encoding structure and others, will be taken from this primary font. Another font from this pair (secondary) provides only glyphs for final merged font.
## Methods

| Method | Description |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getPrimaryFont()](#getPrimaryFont--) | Gets primary font. |
| [getSecondaryFont()](#getSecondaryFont--) | Gets secondary font. |
| [hashCode()](#hashCode--) |  |
| [mergeFonts(GlyphId[] primaryFontGlyphs, GlyphId[] secondaryFontGlyphs, String newFontName)](#mergeFonts-com.aspose.font.GlyphId---com.aspose.font.GlyphId---java.lang.String-) | Merges fonts based on glyphs lists passed. |
| [mergeFonts(int[] primaryFontCharCodes, int[] secondaryFontCharCodes, String newFontName)](#mergeFonts-int---int---java.lang.String-) | Merges fonts based on character codes lists passed. |
| [mergeFonts(Map<Integer,GlyphId> primaryFontDict, Map<Integer,GlyphId> secondaryFontDict, String newFontName)](#mergeFonts-java.util.Map-java.lang.Integer-com.aspose.font.GlyphId--java.util.Map-java.lang.Integer-com.aspose.font.GlyphId--java.lang.String-) | This method version is designed for cases when you want to set character codes for glyphs in the resultant font explicitly. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
boolean
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getPrimaryFont() {#getPrimaryFont--}
```
public abstract Font getPrimaryFont()
```


Gets primary font.

**Returns:**
[Font](../../com.aspose.font/font) - The primary font.
### getSecondaryFont() {#getSecondaryFont--}
```
public abstract Font getSecondaryFont()
```


Gets secondary font.

**Returns:**
[Font](../../com.aspose.font/font) - The secondary font.
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### mergeFonts(GlyphId[] primaryFontGlyphs, GlyphId[] secondaryFontGlyphs, String newFontName) {#mergeFonts-com.aspose.font.GlyphId---com.aspose.font.GlyphId---java.lang.String-}
```
public abstract Font mergeFonts(GlyphId[] primaryFontGlyphs, GlyphId[] secondaryFontGlyphs, String newFontName)
```


Merges fonts based on glyphs lists passed. Searches for a character code for every glyph passed and adds found character code with correspondent glyph into resultant new font.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| primaryFontGlyphs | [GlyphId\[\]](../../com.aspose.font/glyphid) | List of glyphs to take from primary font. |
| secondaryFontGlyphs | [GlyphId\[\]](../../com.aspose.font/glyphid) | List of glyphs to take from secondary font. |
| newFontName | java.lang.String | Desired name for resultant font. |

**Returns:**
[Font](../../com.aspose.font/font) - Merged font
### mergeFonts(int[] primaryFontCharCodes, int[] secondaryFontCharCodes, String newFontName) {#mergeFonts-int---int---java.lang.String-}
```
public abstract Font mergeFonts(int[] primaryFontCharCodes, int[] secondaryFontCharCodes, String newFontName)
```


Merges fonts based on character codes lists passed. To create the desired resultant font, just pass symbol codes from original fonts you want to include into the resultant font. Glyphs related to codes passed will be found automatically. For example, if you want to include glyphs related to letters A and B from the first font and glyphs related to letters C and D from the second font, just call this method like this: `mergeFonts(new uint[] { 'A', 'B' }, new uint[] { 'C', 'D' }, "NewFont")`

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| primaryFontCharCodes | int[] | Codes to take from the primary font. |
| secondaryFontCharCodes | int[] | Codes to take from the secondary font. |
| newFontName | java.lang.String | Desired name for the resultant font. |

**Returns:**
[Font](../../com.aspose.font/font) - Merged font.
### mergeFonts(Map<Integer,GlyphId> primaryFontDict, Map<Integer,GlyphId> secondaryFontDict, String newFontName) {#mergeFonts-java.util.Map-java.lang.Integer-com.aspose.font.GlyphId--java.util.Map-java.lang.Integer-com.aspose.font.GlyphId--java.lang.String-}
```
public abstract Font mergeFonts(Map<Integer,GlyphId> primaryFontDict, Map<Integer,GlyphId> secondaryFontDict, String newFontName)
```


This method version is designed for cases when you want to set character codes for glyphs in the resultant font explicitly. It's not mandatory that the code for the glyph you provided is included in the original font. The purpose of the code passed is that it will be associated with the corresponding glyph identifier in the resultant font. Thus, the rule to process every pair passed by the dictionary parameter [code, glyph identifier] is that only the glyph identifier will be taken from the original font and then it will be linked with the corresponding code in the resultant font. This can be helpful when some codes from the first font conflict with the same codes from the second font.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| primaryFontDict | java.util.Map<java.lang.Integer,com.aspose.font.GlyphId> | Dictionary with pairs [symbol code, glyph identifier] from the primary font. |
| secondaryFontDict | java.util.Map<java.lang.Integer,com.aspose.font.GlyphId> | Dictionary with pairs [symbol code, glyph identifier] from the secondary font. |
| newFontName | java.lang.String | Desired name for the resultant font. |

**Returns:**
[Font](../../com.aspose.font/font) - Merged font.
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### toString() {#toString--}
```
public String toString()
```




**Returns:**
java.lang.String
### wait() {#wait--}
```
public final void wait()
```




### wait(long arg0) {#wait-long-}
```
public final native void wait(long arg0)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

