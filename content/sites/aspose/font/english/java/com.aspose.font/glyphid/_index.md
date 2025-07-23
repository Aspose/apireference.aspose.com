---
title: GlyphId
second_title: Aspose.Font for Java API Reference
description: Represents glyph ids available in the Font.
type: docs
weight: 49
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
| [equals(Object obj)](#equals-java.lang.Object-) | Returns true if two glyph ids are not equal. |
| [getClass()](#getClass--) |  |
| [hashCode()](#hashCode--) | Returns hashcode of object. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [op_Equality(GlyphId obj1, Object obj2)](#op-Equality-com.aspose.font.GlyphId-java.lang.Object-) | Returns true if two glyph ids are equal. |
| [op_Inequality(GlyphId obj1, Object obj2)](#op-Inequality-com.aspose.font.GlyphId-java.lang.Object-) | Returns true if two glyph ids are not equal. |
| [toGlyphStringId()](#toGlyphStringId--) | Virtual cast to GlyphStringId. |
| [toGlyphUInt32Id()](#toGlyphUInt32Id--) | Virtual cast to GlyphUInt32Id. |
| [toString()](#toString--) | Returns string representation the glyph id. |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
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
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### hashCode() {#hashCode--}
```
public abstract int hashCode()
```


Returns hashcode of object.

**Returns:**
int - Hashcode of object.
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




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
### toGlyphStringId() {#toGlyphStringId--}
```
public GlyphStringId toGlyphStringId()
```


Virtual cast to GlyphStringId. GlyphStringId overrides to return instance.

**Returns:**
[GlyphStringId](../../com.aspose.font/glyphstringid) - null
### toGlyphUInt32Id() {#toGlyphUInt32Id--}
```
public GlyphUInt32Id toGlyphUInt32Id()
```


Virtual cast to GlyphUInt32Id. GlyphUInt32Id overrides to return instance.

**Returns:**
[GlyphUInt32Id](../../com.aspose.font/glyphuint32id) - null
### toString() {#toString--}
```
public abstract String toString()
```


Returns string representation the glyph id.

**Returns:**
java.lang.String - glyph identifier
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

