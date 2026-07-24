---
title: "DimensionF"
second_title: "Aspose.Page용 Java API 참조"
description: "Dimension 클래스는 구성 요소의 너비와 높이를 단일 정밀도(single precision)로 하나의 객체에 캡슐화합니다."
type: docs
weight: 11
url: /ko/java/com.aspose.page/dimensionf/
---
**Inheritance:**
java.lang.Object, java.awt.geom.Dimension2D

**All Implemented Interfaces:**
java.io.Serializable
```
public class DimensionF extends Dimension2D implements Serializable
```

`Dimension` 클래스는 구성 요소의 너비와 높이(단일 정밀도)를 하나의 객체에 캡슐화합니다.

보통 `width`와 `height` 값은 음수가 아닌 정수입니다. 차원을 생성할 수 있는 생성자는 이러한 속성에 음수 값을 설정하는 것을 방지하지 않습니다. `width` 또는 `height` 값이 음수인 경우, 다른 객체에 의해 정의된 일부 메서드의 동작은 정의되지 않습니다.
## 생성자

| 생성자 | 설명 |
| --- | --- |
| [DimensionF()](#DimensionF--) | 너비와 높이가 0인 `Dimension` 인스턴스를 생성합니다. |
| [DimensionF(DimensionF d)](#DimensionF-com.aspose.page.DimensionF-) | 지정된 차원과 동일한 너비와 높이를 갖는 `Dimension` 인스턴스를 생성합니다. |
| [DimensionF(float width, float height)](#DimensionF-float-float-) | `Dimension`을 생성하고 지정된 너비와 높이로 초기화합니다. |
## 필드

| 필드 | 설명 |
| --- | --- |
| [height](#height) | 높이 차원; 음수 값을 사용할 수 있습니다. |
| [width](#width) | 너비 차원; 음수 값을 사용할 수 있습니다. |
## 메서드

| 메서드 | 설명 |
| --- | --- |
| [clone()](#clone--) |  |
| [equals(Object obj)](#equals-java.lang.Object-) | 두 차원 객체가 동일한 값을 갖는지 확인합니다. |
| [getClass()](#getClass--) |  |
| [getHeight()](#getHeight--) | \{@inheritDoc\} |
| [getSize()](#getSize--) | 이 `Dimension` 객체의 크기를 가져옵니다. |
| [getWidth()](#getWidth--) | \{@inheritDoc\} |
| [hashCode()](#hashCode--) | 이 `Dimension`의 해시 코드를 반환합니다. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setSize(DimensionF d)](#setSize-com.aspose.page.DimensionF-) | 이 `Dimension` 객체의 크기를 지정된 크기로 설정합니다. |
| [setSize(double width, double height)](#setSize-double-double-) | 이 `Dimension` 객체의 크기를 이중 정밀도로 지정된 너비와 높이로 설정합니다. |
| [setSize(float width, float height)](#setSize-float-float-) | 이 `Dimension` 객체의 크기를 지정된 너비와 높이로 설정합니다. |
| [setSize(Dimension2D arg0)](#setSize-java.awt.geom.Dimension2D-) |  |
| [toString()](#toString--) | 이 `Dimension` 객체의 `height`와 `width` 필드 값을 문자열 형태로 반환합니다. |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### DimensionF() {#DimensionF--}
```
public DimensionF()
```


너비와 높이가 0인 `Dimension` 인스턴스를 생성합니다.

### DimensionF(DimensionF d) {#DimensionF-com.aspose.page.DimensionF-}
```
public DimensionF(DimensionF d)
```


지정된 차원과 동일한 너비와 높이를 갖는 `Dimension` 인스턴스를 생성합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| d | [DimensionF](../../com.aspose.page/dimensionf) | `width`와 `height` 값에 대한 지정된 차원 |

### DimensionF(float width, float height) {#DimensionF-float-float-}
```
public DimensionF(float width, float height)
```


`Dimension`을 생성하고 지정된 너비와 높이로 초기화합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| 너비 | float | 지정된 너비 |
| 높이 | float | 지정된 높이 |

### height {#height}
```
public float height
```


높이 차원; 음수 값을 사용할 수 있습니다.

### width {#width}
```
public float width
```


너비 차원; 음수 값을 사용할 수 있습니다.

### clone() {#clone--}
```
public Object clone()
```




**Returns:**
java.lang.Object
### equals(Object obj) {#equals-java.lang.Object-}
```
public boolean equals(Object obj)
```


두 차원 객체가 동일한 값을 갖는지 확인합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| obj | java.lang.Object |  |

**Returns:**
boolean
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getHeight() {#getHeight--}
```
public double getHeight()
```




**Returns:**
double
### getSize() {#getSize--}
```
public DimensionF getSize()
```


이 `Dimension` 객체의 크기를 가져옵니다. 이 메서드는 완전성을 위해 포함되었으며, `Component`에 정의된 `getSize` 메서드와 일치합니다.

**Returns:**
[DimensionF](../../com.aspose.page/dimensionf) - the size of this dimension, a new instance of `Dimension` with the same width and height
### getWidth() {#getWidth--}
```
public double getWidth()
```




**Returns:**
double
### hashCode() {#hashCode--}
```
public int hashCode()
```


이 `Dimension`의 해시 코드를 반환합니다.

**Returns:**
int - 이 `Dimension`에 대한 해시 코드
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### setSize(DimensionF d) {#setSize-com.aspose.page.DimensionF-}
```
public void setSize(DimensionF d)
```


이 `Dimension` 객체의 크기를 지정된 크기로 설정합니다. 이 메서드는 완전성을 위해 포함되었으며, `Component`에 정의된 `setSize` 메서드와 일치합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| d | [DimensionF](../../com.aspose.page/dimensionf) | 이 `Dimension` 객체의 새로운 크기 |

### setSize(double width, double height) {#setSize-double-double-}
```
public void setSize(double width, double height)
```


이 `Dimension` 객체의 크기를 지정된 너비와 높이(두 배 정밀도)로 설정합니다. `width` 또는 `height`가 `Integer.MAX_VALUE`보다 큰 경우 `Integer.MAX_VALUE`로 재설정됩니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| 너비 | double | `Dimension` 객체의 새로운 너비 |
| 높이 | double | `Dimension` 객체의 새로운 높이 |

### setSize(float width, float height) {#setSize-float-float-}
```
public void setSize(float width, float height)
```


이 `Dimension` 객체의 크기를 지정된 너비와 높이로 설정합니다. 이 메서드는 완전성을 위해 포함되었으며, `Component`에 정의된 `setSize` 메서드와 일치합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| 너비 | float | 이 `Dimension` 객체의 새로운 너비 |
| 높이 | float | 이 `Dimension` 객체의 새로운 높이 |

### setSize(Dimension2D arg0) {#setSize-java.awt.geom.Dimension2D-}
```
public void setSize(Dimension2D arg0)
```




**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| arg0 | java.awt.geom.Dimension2D |  |

### toString() {#toString--}
```
public String toString()
```


이 `Dimension` 객체의 `height` 및 `width` 필드 값을 문자열로 반환합니다. 이 메서드는 디버깅 목적으로만 사용하도록 설계되었으며, 반환되는 문자열의 내용과 형식은 구현마다 다를 수 있습니다. 반환된 문자열은 비어 있을 수 있지만 `null`은 될 수 없습니다.

**Returns:**
java.lang.String - 이 `Dimension` 객체의 문자열 표현
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

