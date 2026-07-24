---
title: "InterpolationMode"
second_title: "Aspose.Page용 Java API 참조"
description: "이미지를 확대/축소하거나 회전할 때 사용되는 알고리즘을 지정합니다."
type: docs
weight: 20
url: /ko/java/com.aspose.xps.rendering/interpolationmode/
---
**Inheritance:**
java.lang.Object, java.lang.Enum
```
public enum InterpolationMode extends Enum<InterpolationMode>
```

이미지를 확대/축소하거나 회전할 때 사용되는 알고리즘을 지정합니다.
## 필드

| 필드 | 설명 |
| --- | --- |
| [Bicubic](#Bicubic) | 바이큐빅 보간을 지정합니다. |
| [Bilinear](#Bilinear) | 양선형 보간을 지정합니다. |
| [Default](#Default) | 기본 모드를 지정합니다. |
| [High](#High) | 고품질 보간을 지정합니다. |
| [HighQualityBicubic](#HighQualityBicubic) | 고품질 바이큐빅 보간을 지정합니다. |
| [HighQualityBilinear](#HighQualityBilinear) | 고품질 양선형 보간을 지정합니다. |
| [Low](#Low) | 저품질 보간을 지정합니다. |
| [NearestNeighbor](#NearestNeighbor) | 최근접 이웃 보간을 지정합니다. |
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
### Bicubic {#Bicubic}
```
public static final InterpolationMode Bicubic
```


바이큐빅 보간을 지정합니다. 사전 필터링이 수행되지 않습니다. 이 모드는 이미지 크기를 원본 크기의 25% 이하로 축소하는 경우에 적합하지 않습니다.

### Bilinear {#Bilinear}
```
public static final InterpolationMode Bilinear
```


양선형 보간을 지정합니다. 사전 필터링이 수행되지 않습니다. 이 모드는 이미지 크기를 원본 크기의 50% 이하로 축소하는 경우에 적합하지 않습니다.

### Default {#Default}
```
public static final InterpolationMode Default
```


기본 모드를 지정합니다.

### High {#High}
```
public static final InterpolationMode High
```


고품질 보간을 지정합니다.

### HighQualityBicubic {#HighQualityBicubic}
```
public static final InterpolationMode HighQualityBicubic
```


고품질 바이큐빅 보간을 지정합니다. 고품질 축소를 보장하기 위해 사전 필터링이 수행됩니다. 이 모드는 가장 높은 품질의 변환된 이미지를 생성합니다.

### HighQualityBilinear {#HighQualityBilinear}
```
public static final InterpolationMode HighQualityBilinear
```


고품질 양선형 보간을 지정합니다. 고품질 축소를 보장하기 위해 사전 필터링이 수행됩니다.

### Low {#Low}
```
public static final InterpolationMode Low
```


저품질 보간을 지정합니다.

### NearestNeighbor {#NearestNeighbor}
```
public static final InterpolationMode NearestNeighbor
```


최근접 이웃 보간을 지정합니다.

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
public static InterpolationMode valueOf(String name)
```




**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| 이름 | java.lang.String |  |

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

