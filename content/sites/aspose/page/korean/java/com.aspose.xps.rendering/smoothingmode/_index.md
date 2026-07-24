---
title: "SmoothingMode"
second_title: "Aspose.Page용 Java API 참조"
description: "선과 곡선 및 채워진 영역의 가장자리에 스무딩 안티앨리어싱이 적용되는지 지정합니다."
type: docs
weight: 24
url: /ko/java/com.aspose.xps.rendering/smoothingmode/
---
**Inheritance:**
java.lang.Object, java.lang.Enum
```
public enum SmoothingMode extends Enum<SmoothingMode>
```

선과 곡선 및 채워진 영역의 가장자리에 스무딩(앤티앨리어싱)이 적용되는지 여부를 지정합니다.
## 필드

| 필드 | 설명 |
| --- | --- |
| [AntiAlias](#AntiAlias) | 안티앨리어싱 렌더링을 지정합니다. |
| [Default](#Default) | 안티앨리어싱을 사용하지 않음을 지정합니다. |
| [HighQuality](#HighQuality) | 안티앨리어싱 렌더링을 지정합니다. |
| [HighSpeed](#HighSpeed) | 안티앨리어싱을 사용하지 않음을 지정합니다. |
| [None](#None) | 안티앨리어싱을 사용하지 않음을 지정합니다. |
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
### AntiAlias {#AntiAlias}
```
public static final SmoothingMode AntiAlias
```


안티앨리어싱 렌더링을 지정합니다.

### Default {#Default}
```
public static final SmoothingMode Default
```


안티앨리어싱을 사용하지 않음을 지정합니다.

### HighQuality {#HighQuality}
```
public static final SmoothingMode HighQuality
```


안티앨리어싱 렌더링을 지정합니다.

### HighSpeed {#HighSpeed}
```
public static final SmoothingMode HighSpeed
```


안티앨리어싱을 사용하지 않음을 지정합니다.

### None {#None}
```
public static final SmoothingMode None
```


안티앨리어싱을 사용하지 않음을 지정합니다.

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
public static SmoothingMode valueOf(String name)
```




**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| 이름 | java.lang.String |  |

**Returns:**
[SmoothingMode](../../com.aspose.xps.rendering/smoothingmode)
### values() {#values--}
```
public static SmoothingMode[] values()
```




**Returns:**
com.aspose.xps.rendering.SmoothingMode[]
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

