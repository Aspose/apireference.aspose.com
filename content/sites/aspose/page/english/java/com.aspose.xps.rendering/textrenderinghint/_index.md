---
title: TextRenderingHint
second_title: Aspose.Page for Java API Reference
description: Specifies the quality of text rendering.
type: docs
weight: 26
url: /java/com.aspose.xps.rendering/textrenderinghint/
---
**Inheritance:**
java.lang.Object, java.lang.Enum
```
public enum TextRenderingHint extends Enum<TextRenderingHint>
```

Specifies the quality of text rendering.
## Fields

| Field | Description |
| --- | --- |
| [AntiAlias](#AntiAlias) | Each character is drawn using its antialiased glyph bitmap without hinting. |
| [AntiAliasGridFit](#AntiAliasGridFit) | Each character is drawn using its antialiased glyph bitmap with hinting. |
| [ClearTypeGridFit](#ClearTypeGridFit) | Each character is drawn using its glyph ClearType bitmap with hinting. |
| [SingleBitPerPixel](#SingleBitPerPixel) | Each character is drawn using its glyph bitmap. |
| [SingleBitPerPixelGridFit](#SingleBitPerPixelGridFit) | Each character is drawn using its glyph bitmap. |
| [SystemDefault](#SystemDefault) | Each character is drawn using its glyph bitmap, with the system default rendering hint. |
## Methods

| Method | Description |
| --- | --- |
| [<T>valueOf(Class<T> arg0, String arg1)](#-T-valueOf-java.lang.Class-T--java.lang.String-) |  |
| [compareTo(E arg0)](#compareTo-E-) |  |
| [describeConstable()](#describeConstable--) |  |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getDeclaringClass()](#getDeclaringClass--) |  |
| [hashCode()](#hashCode--) |  |
| [name()](#name--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [ordinal()](#ordinal--) |  |
| [toString()](#toString--) |  |
| [valueOf(String name)](#valueOf-java.lang.String-) |  |
| [values()](#values--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### AntiAlias {#AntiAlias}
```
public static final TextRenderingHint AntiAlias
```


Each character is drawn using its antialiased glyph bitmap without hinting. Better quality due to antialiasing. Stem width differences may be noticeable because hinting is turned off.

### AntiAliasGridFit {#AntiAliasGridFit}
```
public static final TextRenderingHint AntiAliasGridFit
```


Each character is drawn using its antialiased glyph bitmap with hinting. Much better quality due to antialiasing, but at a higher performance cost.

### ClearTypeGridFit {#ClearTypeGridFit}
```
public static final TextRenderingHint ClearTypeGridFit
```


Each character is drawn using its glyph ClearType bitmap with hinting. The highest quality setting. Used to take advantage of ClearType font features.

### SingleBitPerPixel {#SingleBitPerPixel}
```
public static final TextRenderingHint SingleBitPerPixel
```


Each character is drawn using its glyph bitmap. Hinting is not used.

### SingleBitPerPixelGridFit {#SingleBitPerPixelGridFit}
```
public static final TextRenderingHint SingleBitPerPixelGridFit
```


Each character is drawn using its glyph bitmap. Hinting is used to improve character appearance on stems and curvature.

### SystemDefault {#SystemDefault}
```
public static final TextRenderingHint SystemDefault
```


Each character is drawn using its glyph bitmap, with the system default rendering hint. The text will be drawn using whatever font-smoothing settings the user has selected for the system.

### <T>valueOf(Class<T> arg0, String arg1) {#-T-valueOf-java.lang.Class-T--java.lang.String-}
```
public static T <T>valueOf(Class<T> arg0, String arg1)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| arg0 | java.lang.Class<T> |  |
| arg1 | java.lang.String |  |

**Returns:**
T
### compareTo(E arg0) {#compareTo-E-}
```
public final int compareTo(E arg0)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| arg0 | E |  |

**Returns:**
int
### describeConstable() {#describeConstable--}
```
public final Optional<Enum.EnumDesc<E>> describeConstable()
```




**Returns:**
java.util.Optional<java.lang.Enum.EnumDesc<E>>
### equals(Object arg0) {#equals-java.lang.Object-}
```
public final boolean equals(Object arg0)
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
### getDeclaringClass() {#getDeclaringClass--}
```
public final Class<E> getDeclaringClass()
```




**Returns:**
java.lang.Class<E>
### hashCode() {#hashCode--}
```
public final int hashCode()
```




**Returns:**
int
### name() {#name--}
```
public final String name()
```




**Returns:**
java.lang.String
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### ordinal() {#ordinal--}
```
public final int ordinal()
```




**Returns:**
int
### toString() {#toString--}
```
public String toString()
```




**Returns:**
java.lang.String
### valueOf(String name) {#valueOf-java.lang.String-}
```
public static TextRenderingHint valueOf(String name)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| name | java.lang.String |  |

**Returns:**
[TextRenderingHint](../../com.aspose.xps.rendering/textrenderinghint)
### values() {#values--}
```
public static TextRenderingHint[] values()
```




**Returns:**
com.aspose.xps.rendering.TextRenderingHint[]
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

