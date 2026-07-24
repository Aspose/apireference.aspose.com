---
title: "TextRenderingHint"
second_title: "Aspose.Page용 Java API 참조"
description: "텍스트 렌더링 품질을 지정합니다."
type: docs
weight: 25
url: /ko/java/com.aspose.xps.rendering/textrenderinghint/
---
**Inheritance:**
java.lang.Object, java.lang.Enum
```
public enum TextRenderingHint extends Enum<TextRenderingHint>
```

텍스트 렌더링 품질을 지정합니다.
## 필드

| 필드 | 설명 |
| --- | --- |
| [AntiAlias](#AntiAlias) | 각 문자는 힌팅 없이 안티앨리어싱된 글리프 비트맵을 사용하여 그려집니다. |
| [AntiAliasGridFit](#AntiAliasGridFit) | 각 문자는 힌팅을 사용하여 안티앨리어싱된 글리프 비트맵을 사용해 그려집니다. |
| [ClearTypeGridFit](#ClearTypeGridFit) | 각 문자는 힌팅을 사용하여 글리프 ClearType 비트맵을 사용해 그려집니다. |
| [SingleBitPerPixel](#SingleBitPerPixel) | 각 문자는 글리프 비트맵을 사용해 그려집니다. |
| [SingleBitPerPixelGridFit](#SingleBitPerPixelGridFit) | 각 문자는 글리프 비트맵을 사용해 그려집니다. |
| [SystemDefault](#SystemDefault) | 각 문자는 시스템 기본 렌더링 힌트를 사용하여 글리프 비트맵을 그립니다. |
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
public static final TextRenderingHint AntiAlias
```


각 문자는 힌팅 없이 안티앨리어싱된 글리프 비트맵을 사용해 그려집니다. 안티앨리어싱으로 인해 품질이 향상됩니다. 힌팅이 꺼져 있어 줄기 너비 차이가 눈에 띌 수 있습니다.

### AntiAliasGridFit {#AntiAliasGridFit}
```
public static final TextRenderingHint AntiAliasGridFit
```


각 문자는 힌팅을 사용하여 안티앨리어싱된 글리프 비트맵을 사용해 그려집니다. 안티앨리어싱으로 인해 품질이 크게 향상되지만 성능 비용이 더 높습니다.

### ClearTypeGridFit {#ClearTypeGridFit}
```
public static final TextRenderingHint ClearTypeGridFit
```


각 문자는 힌팅을 사용하여 글리프 ClearType 비트맵을 사용해 그려집니다. 최고 품질 설정이며 ClearType 글꼴 기능을 활용합니다.

### SingleBitPerPixel {#SingleBitPerPixel}
```
public static final TextRenderingHint SingleBitPerPixel
```


각 문자는 글리프 비트맵을 사용해 그려집니다. 힌팅이 사용되지 않습니다.

### SingleBitPerPixelGridFit {#SingleBitPerPixelGridFit}
```
public static final TextRenderingHint SingleBitPerPixelGridFit
```


각 문자는 글리프 비트맵을 사용해 그려집니다. 힌팅은 줄기와 곡선에서 문자 모양을 개선하기 위해 사용됩니다.

### SystemDefault {#SystemDefault}
```
public static final TextRenderingHint SystemDefault
```


각 문자는 시스템 기본 렌더링 힌트를 사용하여 글리프 비트맵을 그립니다. 텍스트는 사용자가 시스템에 선택한 폰트 부드럽게 처리 설정에 따라 그려집니다.

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
public static TextRenderingHint valueOf(String name)
```




**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| 이름 | java.lang.String |  |

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

