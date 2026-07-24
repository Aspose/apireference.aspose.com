---
title: "XpsTileMode"
second_title: "Aspose.Page for Java API リファレンス"
description: "タイルブラシの TileMode プロパティの有効な値。"
type: docs
weight: 66
url: /ja/java/com.aspose.xps/xpstilemode/
---
**Inheritance:**
java.lang.Object, java.lang.Enum
```
public enum XpsTileMode extends Enum<XpsTileMode>
```

タイルブラシの TileMode プロパティの有効な値。
## フィールド

| フィールド | 説明 |
| --- | --- |
| [FlipX](#FlipX) | タイルの配置は Tile タイルモードに似ていますが、交互の列のタイルは水平方向に反転します。 |
| [FlipXY](#FlipXY) | タイルの配置は Tile タイルモードに似っていますが、交互の列のタイルは水平方向に、交互の行のタイルは垂直方向に反転します。 |
| [FlipY](#FlipY) | タイルの配置は Tile タイルモードに似っていますが、交互の行のタイルは垂直方向に反転します。 |
| [None](#None) | このモードでは、単一のベースタイルのみが描画されます。 |
| [Tile](#Tile) | このモードでは、ベースタイルが描画され、残りの領域はベースタイルを繰り返して埋められます。各タイルの右端が次のタイルの左端に、下端が次のタイルの上端に接するように配置されます。 |
## メソッド

| メソッド | 説明 |
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


タイルの配置は Tile タイルモードに似ていますが、交互の列のタイルは水平方向に反転します。ベースタイルはビューポートで指定された位置に配置されます。このタイルの左右の列にあるタイルは水平方向に反転します。

### FlipXY {#FlipXY}
```
public static final XpsTileMode FlipXY
```


タイルの配置は Tile タイルモードに似っていますが、交互の列のタイルは水平方向に、交互の行のタイルは垂直方向に反転します。ベースタイルはビューポートで指定された位置に配置されます。

### FlipY {#FlipY}
```
public static final XpsTileMode FlipY
```


タイルの配置は Tile タイルモードに似っていますが、交互の行のタイルは垂直方向に反転します。ベースタイルはビューポートで指定された位置に配置されます。上下の行は垂直方向に反転します。

### None {#None}
```
public static final XpsTileMode None
```


このモードでは、単一のベースタイルのみが描画されます。残りの領域は透明のままです。

### Tile {#Tile}
```
public static final XpsTileMode Tile
```


このモードでは、ベースタイルが描画され、残りの領域はベースタイルを繰り返して埋められます。各タイルの右端が次のタイルの左端に、下端が次のタイルの上端に接するように配置されます。

### <T>valueOf(Class<T> arg0, String arg1) {#-T-valueOf-java.lang.Class-T--java.lang.String-}
```
public static T <T>valueOf(Class<T> arg0, String arg1)
```




**Parameters:**
| パラメータ | 型 | 説明 |
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
| パラメータ | 型 | 説明 |
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
| パラメータ | 型 | 説明 |
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
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| 名前 | java.lang.String |  |

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
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

