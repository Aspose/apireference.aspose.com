---
title: XpsTileMode
second_title: Aspose.Page for Java API Reference
description: Valid values of tiling brushes TileMode property.
type: docs
weight: 66
url: /java/com.aspose.xps/xpstilemode/
---
**Inheritance:**
java.lang.Object, java.lang.Enum
```
public enum XpsTileMode extends Enum<XpsTileMode>
```

Valid values of tiling brushes' TileMode property.
## Fields

| Field | Description |
| --- | --- |
| [FlipX](#FlipX) | The tile arrangement is similar to the Tile tile mode, but alternate columns of tiles are flipped horizontally. |
| [FlipXY](#FlipXY) | The tile arrangement is similar to the Tile tile mode, but alternate columns of tiles are flipped horizontally and alternate rows of tiles are flipped vertically. |
| [FlipY](#FlipY) | The tile arrangement is similar to the Tile tile mode, but alternate rows of tiles are flipped vertically. |
| [None](#None) | In this mode, only the single base tile is drawn. |
| [Tile](#Tile) | In this mode, the base tile is drawn and the remaining area is filled by repeating the base tile such that the right edge of each tile abuts the left edge of the next, and the bottom edge of each tile abuts the top edge of the next. |
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
### FlipX {#FlipX}
```
public static final XpsTileMode FlipX
```


The tile arrangement is similar to the Tile tile mode, but alternate columns of tiles are flipped horizontally. The base tile is positioned as specified by the viewport. Tiles in the columns to the left and right of this tile are flipped horizontally.

### FlipXY {#FlipXY}
```
public static final XpsTileMode FlipXY
```


The tile arrangement is similar to the Tile tile mode, but alternate columns of tiles are flipped horizontally and alternate rows of tiles are flipped vertically. The base tile is positioned as specified by the viewport.

### FlipY {#FlipY}
```
public static final XpsTileMode FlipY
```


The tile arrangement is similar to the Tile tile mode, but alternate rows of tiles are flipped vertically. The base tile is positioned as specified by the viewport. Rows above and below are flipped vertically.

### None {#None}
```
public static final XpsTileMode None
```


In this mode, only the single base tile is drawn. The remaining area is left transparent.

### Tile {#Tile}
```
public static final XpsTileMode Tile
```


In this mode, the base tile is drawn and the remaining area is filled by repeating the base tile such that the right edge of each tile abuts the left edge of the next, and the bottom edge of each tile abuts the top edge of the next.

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
public static XpsTileMode valueOf(String name)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| name | java.lang.String |  |

**Returns:**
[XpsTileMode](../../com.aspose.xps/xpstilemode)
### values() {#values--}
```
public static XpsTileMode[] values()
```




**Returns:**
com.aspose.xps.XpsTileMode[]
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

