---
title: "TransformedStroke"
second_title: "Aspose.Page용 Java API 참조"
description: "변환을 포함하는 스트로크입니다."
type: docs
weight: 17
url: /ko/java/com.aspose.page/transformedstroke/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
java.awt.Stroke
```
public class TransformedStroke implements Stroke
```

변환을 포함하는 스트로크입니다.
## 생성자

| 생성자 | 설명 |
| --- | --- |
| [TransformedStroke(Stroke base, AffineTransform at)](#TransformedStroke-java.awt.Stroke-java.awt.geom.AffineTransform-) | 다른 Stroke와 AffineTransform을 기반으로 TransformedStroke를 생성합니다. |
## 메서드

| 메서드 | 설명 |
| --- | --- |
| [createStrokedShape(Shape s)](#createStrokedShape-java.awt.Shape-) | 주어진 Shape을 이 스트로크로 스트로크하여 외곽선을 생성합니다. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getBaseStroke()](#getBaseStroke--) | 기본 스트로크를 가져옵니다. |
| [getClass()](#getClass--) |  |
| [getTransform()](#getTransform--) | 변환을 가져옵니다. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### TransformedStroke(Stroke base, AffineTransform at) {#TransformedStroke-java.awt.Stroke-java.awt.geom.AffineTransform-}
```
public TransformedStroke(Stroke base, AffineTransform at)
```


다른 Stroke와 AffineTransform을 기반으로 TransformedStroke를 생성합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| 기본 | java.awt.Stroke | 스트로크 기본입니다. |
| at | java.awt.geom.AffineTransform | 아핀 변환입니다. |

### createStrokedShape(Shape s) {#createStrokedShape-java.awt.Shape-}
```
public Shape createStrokedShape(Shape s)
```


주어진 Shape을 이 스트로크로 스트로크하여 외곽선을 생성합니다. 이 외곽선은 기본 스트로크가 제공할 외곽선에 비해 우리의 AffineTransform에 의해 왜곡되는데, 이는 스케일링(즉, 선의 두께) 측면에서만 적용되며, 스트로크 후에 평행이동과 회전은 취소됩니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| s | java.awt.Shape | 외곽선을 만들 형상으로 사용합니다. |

**Returns:**
java.awt.Shape - 형상의 외곽선입니다.
### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
boolean
### getBaseStroke() {#getBaseStroke--}
```
public Stroke getBaseStroke()
```


기본 스트로크를 가져옵니다.

**Returns:**
java.awt.Stroke - 기본 스트로크입니다.
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getTransform() {#getTransform--}
```
public AffineTransform getTransform()
```


변환을 가져옵니다.

**Returns:**
java.awt.geom.AffineTransform - 변환입니다.
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### toString() {#toString--}
```
public String toString()
```




**Returns:**
java.lang.String
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

