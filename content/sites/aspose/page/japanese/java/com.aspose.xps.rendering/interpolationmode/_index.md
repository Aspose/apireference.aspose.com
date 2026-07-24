---
title: "InterpolationMode"
second_title: "Aspose.Page for Java API リファレンス"
description: "画像が拡大縮小または回転される際に使用されるアルゴリズムを指定します。"
type: docs
weight: 20
url: /ja/java/com.aspose.xps.rendering/interpolationmode/
---
**Inheritance:**
java.lang.Object, java.lang.Enum
```
public enum InterpolationMode extends Enum<InterpolationMode>
```

画像が拡大縮小または回転される際に使用されるアルゴリズムを指定します。
## フィールド

| フィールド | 説明 |
| --- | --- |
| [Bicubic](#Bicubic) | バイキュービック補間を指定します。 |
| [Bilinear](#Bilinear) | 双一次補間を指定します。 |
| [Default](#Default) | デフォルトモードを指定します。 |
| [High](#High) | 高品質補間を指定します。 |
| [HighQualityBicubic](#HighQualityBicubic) | 高品質のバイキュービック補間を指定します。 |
| [HighQualityBilinear](#HighQualityBilinear) | 高品質の双一次補間を指定します。 |
| [Low](#Low) | 低品質補間を指定します。 |
| [NearestNeighbor](#NearestNeighbor) | 最近傍補間を指定します。 |
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
### Bicubic {#Bicubic}
```
public static final InterpolationMode Bicubic
```


バイキュービック補間を指定します。事前フィルタリングは行われません。このモードは画像を元のサイズの25％未満に縮小する場合には適していません。

### Bilinear {#Bilinear}
```
public static final InterpolationMode Bilinear
```


双一次補間を指定します。事前フィルタリングは行われません。このモードは画像を元のサイズの50％未満に縮小する場合には適していません。

### Default {#Default}
```
public static final InterpolationMode Default
```


デフォルトモードを指定します。

### High {#High}
```
public static final InterpolationMode High
```


高品質補間を指定します。

### HighQualityBicubic {#HighQualityBicubic}
```
public static final InterpolationMode HighQualityBicubic
```


高品質のバイキュービック補間を指定します。高品質な縮小を実現するために事前フィルタリングが行われます。このモードは最高品質の変換画像を生成します。

### HighQualityBilinear {#HighQualityBilinear}
```
public static final InterpolationMode HighQualityBilinear
```


高品質の双一次補間を指定します。高品質な縮小を実現するために事前フィルタリングが行われます。

### Low {#Low}
```
public static final InterpolationMode Low
```


低品質補間を指定します。

### NearestNeighbor {#NearestNeighbor}
```
public static final InterpolationMode NearestNeighbor
```


最近傍補間を指定します。

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
public static InterpolationMode valueOf(String name)
```




**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| 名前 | java.lang.String |  |

**Returns:**
[InterpolationMode](../../com.aspose.xps.rendering/interpolationmode)
### values() {#values--}
```
public static InterpolationMode[] values()
```




**Returns:**
com.aspose.xps.rendering.InterpolationMode[]
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

