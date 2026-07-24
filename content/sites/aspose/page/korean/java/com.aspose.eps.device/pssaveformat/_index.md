---
title: "PsSaveFormat"
second_title: "Aspose.Page용 Java API 참조"
description: "이 열거형에는 사용 가능한 저장 형식 옵션이 포함되어 있습니다."
type: docs
weight: 14
url: /ko/java/com.aspose.eps.device/pssaveformat/
---
**Inheritance:**
java.lang.Object, java.lang.Enum
```
public enum PsSaveFormat extends Enum<PsSaveFormat>
```

이 열거형은 저장 형식의 사용 가능한 옵션을 포함합니다. PS 또는 EPS가 될 수 있습니다. EPS는 1페이지 문서에만 사용되며 PS 파일은 페이지 수에 제한이 없습니다.
## 필드

| 필드 | 설명 |
| --- | --- |
| [EPS](#EPS) | 이 옵션은 결과 문서가 캡슐화된 PostScript(EPS) 파일이어야 함을 나타냅니다. |
| [PS](#PS) | 이 옵션은 결과 문서가 PostScript(PS) 또는 캡슐화된 PostScript(EPS) 파일이어야 함을 나타냅니다. |
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
### EPS {#EPS}
```
public static final PsSaveFormat EPS
```


이 옵션은 결과 문서가 Encapsulated PostScript (EPS) 파일이어야 함을 나타냅니다. 1페이지 문서에만 사용됩니다;

### PS {#PS}
```
public static final PsSaveFormat PS
```


이 옵션은 결과 문서가 PostScript(PS) 또는 캡슐화된 PostScript(EPS) 파일이어야 함을 나타냅니다.

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
public static PsSaveFormat valueOf(String name)
```




**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| 이름 | java.lang.String |  |

**Returns:**
[PsSaveFormat](../../com.aspose.eps.device/pssaveformat)
### values() {#values--}
```
public static PsSaveFormat[] values()
```




**Returns:**
com.aspose.eps.device.PsSaveFormat[]
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

