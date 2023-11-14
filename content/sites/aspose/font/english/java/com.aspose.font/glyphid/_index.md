---
title: GlyphId
second_title: Aspose.Font for Java API Reference
description: Represents glyph ids available in the Font.
type: docs
weight: 39
url: /java/com.aspose.font/glyphid/
---
**Inheritance:**
java.lang.Object
```
public abstract class GlyphId
```

Represents glyph ids, available in the Font. Glyph id is a unique number for a glyph, which is font type dependent. For example: Type1's id is a glyph name, instance of ( GlyphStringId ) class. TTF's id is an int index, instance of ( GlyphUInt32Id ) class.
## Methods

| Method | Description |
| --- | --- |
| [toString()](#toString--) | Returns string representation the glyph id. |
| [hashCode()](#hashCode--) | Returns hashcode of object. |
| [op_Equality(GlyphId obj1, Object obj2)](#op-Equality-com.aspose.font.GlyphId-java.lang.Object-) | Returns true if two glyph ids are equal. |
| [op_Inequality(GlyphId obj1, Object obj2)](#op-Inequality-com.aspose.font.GlyphId-java.lang.Object-) | Returns true if two glyph ids are not equal. |
| [equals(Object obj)](#equals-java.lang.Object-) | Returns true if two glyph ids are not equal. |
| [toGlyphUInt32Id()](#toGlyphUInt32Id--) | Virtual cast to GlyphUInt32Id. |
| [toGlyphStringId()](#toGlyphStringId--) | Virtual cast to GlyphStringId. |
### toString() {#toString--}
```
public abstract String toString()
```


Returns string representation the glyph id.

**Returns:**
java.lang.String - glyph identifier
### hashCode() {#hashCode--}
```
public abstract int hashCode()
```


Returns hashcode of object.

**Returns:**
int - Hashcode of object.
### op_Equality(GlyphId obj1, Object obj2) {#op-Equality-com.aspose.font.GlyphId-java.lang.Object-}
```
public static boolean op_Equality(GlyphId obj1, Object obj2)
```


Returns true if two glyph ids are equal.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| obj1 | [GlyphId](../../com.aspose.font/glyphid) | First glyph identifier to compare. |
| obj2 | java.lang.Object | Second glyph identifier to compare. |

**Returns:**
boolean - Comparison result.
### op_Inequality(GlyphId obj1, Object obj2) {#op-Inequality-com.aspose.font.GlyphId-java.lang.Object-}
```
public static boolean op_Inequality(GlyphId obj1, Object obj2)
```


Returns true if two glyph ids are not equal.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| obj1 | [GlyphId](../../com.aspose.font/glyphid) | First glyph identifier to compare. |
| obj2 | java.lang.Object | Second glyph identifier to compare. |

**Returns:**
boolean - Comparison result.
### equals(Object obj) {#equals-java.lang.Object-}
```
public boolean equals(Object obj)
```


Returns true if two glyph ids are not equal.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| obj | java.lang.Object | Glyph identifier to compare with. |

**Returns:**
boolean - Comparison result.
### toGlyphUInt32Id() {#toGlyphUInt32Id--}
```
public GlyphUInt32Id toGlyphUInt32Id()
```


Virtual cast to GlyphUInt32Id. GlyphUInt32Id overrides to return instance.

**Returns:**
[GlyphUInt32Id](../../com.aspose.font/glyphuint32id) - null
### toGlyphStringId() {#toGlyphStringId--}
```
public GlyphStringId toGlyphStringId()
```


Virtual cast to GlyphStringId. GlyphStringId overrides to return instance.

**Returns:**
[GlyphStringId](../../com.aspose.font/glyphstringid) - null
