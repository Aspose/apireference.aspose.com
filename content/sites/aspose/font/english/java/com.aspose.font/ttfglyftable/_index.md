---
title: TtfGlyfTable
second_title: Aspose.Font for Java API Reference
description: Represents glyf table of the TTF font file.
type: docs
weight: 82
url: /java/com.aspose.font/ttfglyftable/
---
**Inheritance:**
java.lang.Object, [com.aspose.font.TtfTableBase](../../com.aspose.font/ttftablebase)
```
public class TtfGlyfTable extends TtfTableBase
```

Represents "glyf" table of the TTF font file.
## Methods

| Method | Description |
| --- | --- |
| [getTag()](#getTag--) | Gets table tag. |
| [containsGlyph(int glyphIndex)](#containsGlyph-int-) | Returns true in case the table contains glyph with glyphIndex. |
| [getGlyph(long glyphIndex)](#getGlyph-long-) | Returns a glyph by glyph index. |
### getTag() {#getTag--}
```
public static String getTag()
```


Gets table tag.

**Returns:**
java.lang.String - Table tag.
### containsGlyph(int glyphIndex) {#containsGlyph-int-}
```
public boolean containsGlyph(int glyphIndex)
```


Returns true in case the table contains glyph with glyphIndex.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| glyphIndex | int | Glyph index. |

**Returns:**
boolean - True if table contains glyph for index specified, false otherwise.
### getGlyph(long glyphIndex) {#getGlyph-long-}
```
public Glyph getGlyph(long glyphIndex)
```


Returns a glyph by glyph index.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| glyphIndex | long | Glyph index. |

**Returns:**
[Glyph](../../com.aspose.font/glyph) - Glyph Glyph related to index specified.
