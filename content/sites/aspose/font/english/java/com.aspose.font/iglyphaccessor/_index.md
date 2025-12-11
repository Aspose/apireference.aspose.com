---
title: IGlyphAccessor
second_title: Aspose.Font for Java API Reference
description: Defines functionality to retrieve specified glyph identifiers and glyphs.
type: docs
weight: 126
url: /java/com.aspose.font/iglyphaccessor/
---```
public interface IGlyphAccessor
```

Defines functionality to retrieve specified glyph identifiers and glyphs.
## Methods

| Method | Description |
| --- | --- |
| [getAllGlyphIds()](#getAllGlyphIds--) | Returns all glyph ids, available in the Font. |
| [getGlyphById(GlyphId id)](#getGlyphById-com.aspose.font.GlyphId-) | Returns glyph by glyph id. |
| [getGlyphIdType()](#getGlyphIdType--) | Glyph id type specification. |
| [getGlyphsForText(String text)](#getGlyphsForText-java.lang.String-) | Get glyphs representation for text. |
### getAllGlyphIds() {#getAllGlyphIds--}
```
public abstract GlyphId[] getAllGlyphIds()
```


Returns all glyph ids, available in the Font. Glyph id is a unique number for a glyph, which is font type dependent. For example: Type1's id is a glyph name, instance of ( GlyphStringId ) class. TTF's id is an int index, instance of ( GlyphUInt32Id ) class.

**Returns:**
com.aspose.font.GlyphId[] - Glyph identifiers.
### getGlyphById(GlyphId id) {#getGlyphById-com.aspose.font.GlyphId-}
```
public abstract Glyph getGlyphById(GlyphId id)
```


Returns glyph by glyph id. Glyph id is a unique number for a glyph, which is font type dependent. GlyphId - derived object. For example: Type1's id is a glyph name, instance of ( GlyphStringId ) class. TTF's id is an int index, instance of ( GlyphUInt32Id ) class.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| id | [GlyphId](../../com.aspose.font/glyphid) | glyph ID. |

**Returns:**
[Glyph](../../com.aspose.font/glyph) - Glyph
### getGlyphIdType() {#getGlyphIdType--}
```
public abstract GlyphIdType getGlyphIdType()
```


Glyph id type specification.

**Returns:**
[GlyphIdType](../../com.aspose.font/glyphidtype) - Id type specification.
### getGlyphsForText(String text) {#getGlyphsForText-java.lang.String-}
```
public abstract GlyphId[] getGlyphsForText(String text)
```


Get glyphs representation for text.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| text | java.lang.String | Input text. |

**Returns:**
com.aspose.font.GlyphId[] - GlyphId array.
