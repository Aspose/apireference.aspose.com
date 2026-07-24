---
title: "XpsFillRule"
second_title: "Aspose.Page용 Java API 참조"
description: "PathGeometry 요소의 FillRule 속성에 대한 유효한 값."
type: docs
weight: 59
url: /ko/java/com.aspose.xps/xpsfillrule/
---
**Inheritance:**
java.lang.Object, java.lang.Enum
```
public enum XpsFillRule extends Enum<XpsFillRule>
```

PathGeometry 요소의 FillRule 속성에 대한 유효한 값.
## 필드

| 필드 | 설명 |
| --- | --- |
| [EvenOdd](#EvenOdd) | 이 규칙은 캔버스상의 점에 대한 “inside” 여부를, 점에서 무한대까지 임의의 방향으로 광선을 그린 뒤 해당 형태의 세그먼트가 광선을 교차하는 횟수를 계산하여 결정합니다. |
| [NonZero](#NonZero) | 이 규칙은 캔버스상의 점에 대한 “inside” 여부를, 점에서 무한대까지 임의의 방향으로 광선을 그린 뒤 형태의 세그먼트가 광선을 교차하는 위치를 검사하여 결정합니다. |
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
### EvenOdd {#EvenOdd}
```
public static final XpsFillRule EvenOdd
```


이 규칙은 캔버스상의 점에 대한 “inside” 여부를, 점에서 무한대까지 임의의 방향으로 광선을 그린 뒤 해당 형태의 세그먼트가 광선을 교차하는 횟수를 계산하여 결정합니다. 이 횟수가 홀수이면 점은 내부에 있고, 짝수이면 외부에 있습니다.

### NonZero {#NonZero}
```
public static final XpsFillRule NonZero
```


이 규칙은 캔버스상의 점에 대한 “inside” 여부를, 점에서 무한대까지 임의의 방향으로 광선을 그린 뒤 형태의 세그먼트가 광선을 교차하는 위치를 검사하여 결정합니다. 카운트를 0으로 시작하여, 세그먼트가 왼쪽에서 오른쪽으로 광선을 통과할 때마다 1을 더하고, 오른쪽에서 왼쪽으로 통과할 때마다 1을 빼십시오. 교차 횟수를 계산한 후 결과가 0이면 점은 경로 밖에 있으며, 그렇지 않으면 내부에 있습니다.

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
public static XpsFillRule valueOf(String name)
```




**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| 이름 | java.lang.String |  |

**Returns:**
[XpsFillRule](../../com.aspose.xps/xpsfillrule)
### values() {#values--}
```
public static XpsFillRule[] values()
```




**Returns:**
com.aspose.xps.XpsFillRule[]
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

