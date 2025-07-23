---
title: TtfLtshTable
second_title: Aspose.Font for Java API Reference
description: Represents Linear Threshold table of the TTF Font file.
type: docs
weight: 102
url: /java/com.aspose.font/ttfltshtable/
---
**Inheritance:**
java.lang.Object, [com.aspose.font.TtfTableBase](../../com.aspose.font/ttftablebase)
```
public class TtfLtshTable extends TtfTableBase
```

Represents Linear Threshold table of the TTF Font file.
## Methods

| Method | Description |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getNumGlyphs()](#getNumGlyphs--) | Gets the number of glyphs (from "numGlyphs" in 'maxp' table). |
| [getOffset()](#getOffset--) | Gets offset from beginning of sfnt. |
| [getTag()](#getTag--) | Gets the table tag. |
| [getTtfTables()](#getTtfTables--) | Reference to TTF table repository. |
| [getVersion()](#getVersion--) | Gets the table version. |
| [getYPel(int glyphNum)](#getYPel-int-) | Returns the vertical pel height for glyph/zero if glyph number is incorrect. |
| [hashCode()](#hashCode--) |  |
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
### getNumGlyphs() {#getNumGlyphs--}
```
public int getNumGlyphs()
```


Gets the number of glyphs (from "numGlyphs" in 'maxp' table).

**Returns:**
int - The number of glyphs (from "numGlyphs" in 'maxp' table).
### getOffset() {#getOffset--}
```
public long getOffset()
```


Gets offset from beginning of sfnt.

**Returns:**
long - Offset from beginning of sfnt.
### getTag() {#getTag--}
```
public static String getTag()
```


Gets the table tag.

**Returns:**
java.lang.String - The table tag.
### getTtfTables() {#getTtfTables--}
```
public TtfTableRepository getTtfTables()
```


Reference to TTF table repository.

**Returns:**
[TtfTableRepository](../../com.aspose.font/ttftablerepository) - Reference to TTF table repository.
### getVersion() {#getVersion--}
```
public int getVersion()
```


Gets the table version.

**Returns:**
int - The table version.
### getYPel(int glyphNum) {#getYPel-int-}
```
public byte getYPel(int glyphNum)
```


Returns the vertical pel height for glyph/zero if glyph number is incorrect.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| glyphNum | int | A glyph number (index). |

**Returns:**
byte - The vertical pel height for glyph/zero if glyph number is incorrect.
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
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

