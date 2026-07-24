---
title: "XpsTileMode"
second_title: "Aspose.Page용 Java API 참조"
description: "타일링 브러시의 TileMode 속성에 대한 유효한 값들."
type: docs
weight: 66
url: /ko/java/com.aspose.xps/xpstilemode/
---
**Inheritance:**
java.lang.Object, java.lang.Enum
```
public enum XpsTileMode extends Enum<XpsTileMode>
```

타일링 브러시의 TileMode 속성에 대한 유효한 값입니다.
## 필드

| 필드 | 설명 |
| --- | --- |
| [FlipX](#FlipX) | 타일 배열은 Tile 타일 모드와 유사하지만, 교대로 배치된 열의 타일은 수평으로 뒤집힙니다. |
| [FlipXY](#FlipXY) | 타일 배열은 Tile 타일 모드와 유사하지만, 교대로 배치된 열의 타일은 수평으로, 교대로 배치된 행의 타일은 수직으로 뒤집힙니다. |
| [FlipY](#FlipY) | 타일 배열은 Tile 타일 모드와 유사하지만, 교대로 배치된 행의 타일은 수직으로 뒤집힙니다. |
| [None](#None) | 이 모드에서는 단일 기본 타일만 그려집니다. |
| [Tile](#Tile) | 이 모드에서는 기본 타일을 그린 후, 각 타일의 오른쪽 가장자리가 다음 타일의 왼쪽 가장자리에 맞닿고, 각 타일의 아래쪽 가장자리가 다음 타일의 위쪽 가장자리에 맞닿도록 기본 타일을 반복하여 나머지 영역을 채웁니다. |
## 메서드

| 메서드 | 설명 |
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


타일 배열은 Tile 타일 모드와 유사하지만, 교대로 배치된 열의 타일은 수평으로 뒤집힙니다. 기본 타일은 뷰포트에 지정된 대로 배치됩니다. 이 타일의 왼쪽 및 오른쪽 열에 있는 타일은 수평으로 뒤집힙니다.

### FlipXY {#FlipXY}
```
public static final XpsTileMode FlipXY
```


타일 배열은 Tile 타일 모드와 유사하지만, 교대로 배치된 열의 타일은 수평으로, 교대로 배치된 행의 타일은 수직으로 뒤집힙니다. 기본 타일은 뷰포트에 지정된 대로 배치됩니다.

### FlipY {#FlipY}
```
public static final XpsTileMode FlipY
```


타일 배열은 Tile 타일 모드와 유사하지만, 교대로 배치된 행의 타일은 수직으로 뒤집힙니다. 기본 타일은 뷰포트에 지정된 대로 배치됩니다. 위와 아래 행은 수직으로 뒤집힙니다.

### None {#None}
```
public static final XpsTileMode None
```


이 모드에서는 단일 기본 타일만 그려지고, 나머지 영역은 투명하게 남겨집니다.

### Tile {#Tile}
```
public static final XpsTileMode Tile
```


이 모드에서는 기본 타일을 그린 후, 각 타일의 오른쪽 가장자리가 다음 타일의 왼쪽 가장자리에 맞닿고, 각 타일의 아래쪽 가장자리가 다음 타일의 위쪽 가장자리에 맞닿도록 기본 타일을 반복하여 나머지 영역을 채웁니다.

### <T>valueOf(Class<T> arg0, String arg1) {#-T-valueOf-java.lang.Class-T--java.lang.String-}
```
public static T <T>valueOf(Class<T> arg0, String arg1)
```




**Parameters:**
| 매개변수 | 유형 | 설명 |
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
| 매개변수 | 유형 | 설명 |
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
| 매개변수 | 유형 | 설명 |
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
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| 이름 | java.lang.String |  |

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
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

