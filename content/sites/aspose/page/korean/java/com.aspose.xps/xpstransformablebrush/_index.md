---
title: "XpsTransformableBrush"
second_title: "Aspose.Page용 Java API 참조"
description: "SolidColorBrush를 제외한 변형 가능한 브러시 요소의 공통 기능을 캡슐화하는 클래스."
type: docs
weight: 52
url: /ko/java/com.aspose.xps/xpstransformablebrush/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject), [com.aspose.xps.XpsBrush](../../com.aspose.xps/xpsbrush)

**All Implemented Interfaces:**
com.aspose.xps.ITransformableProperty
```
public abstract class XpsTransformableBrush extends XpsBrush implements ITransformableProperty
```

변환 가능한 브러시 요소(모두 SolidColorBrush 제외)의 공통 기능을 캡슐화하는 클래스.
## 메서드

| 메서드 | 설명 |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getOpacity()](#getOpacity--) | 브러시 채우기의 균일한 투명성을 정의하는 값을 반환합니다. |
| [getTransform()](#getTransform--) | 브러시 좌표 공간에 적용된 행렬 변환을 반환합니다. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setOpacity(float value)](#setOpacity-float-) | 브러시 채우기의 균일한 투명성을 정의하는 값을 설정합니다. |
| [setTransform(XpsMatrix value)](#setTransform-com.aspose.xps.XpsMatrix-) | 브러시 좌표 공간에 적용된 행렬 변환을 설정합니다. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
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
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getOpacity() {#getOpacity--}
```
public float getOpacity()
```


브러시 채우기의 균일한 투명성을 정의하는 값을 반환합니다.

**Returns:**
float - 브러시 채우기의 균일한 투명성을 정의하는 값.
### getTransform() {#getTransform--}
```
public XpsMatrix getTransform()
```


브러시 좌표 공간에 적용된 행렬 변환을 반환합니다. Transform 속성은 현재 유효한 렌더 변환과 연결되어 브러시 로컬의 유효한 렌더 변환을 생성합니다. 브러시의 뷰포트는 로컬 유효 렌더 변환을 사용하여 변환됩니다.

**Returns:**
[XpsMatrix](../../com.aspose.xps/xpsmatrix) - The matrix transformation applied to the coordinate space of the brush.
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




### setOpacity(float value) {#setOpacity-float-}
```
public void setOpacity(float value)
```


브러시 채우기의 균일한 투명성을 정의하는 값을 설정합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| 값 | float | 브러시 채우기의 균일한 투명성을 정의하는 값. |

### setTransform(XpsMatrix value) {#setTransform-com.aspose.xps.XpsMatrix-}
```
public void setTransform(XpsMatrix value)
```


브러시 좌표 공간에 적용된 행렬 변환을 설정합니다. Transform 속성은 현재 유효한 렌더 변환과 연결되어 브러시 로컬의 유효한 렌더 변환을 생성합니다. 브러시의 뷰포트는 로컬 유효 렌더 변환을 사용하여 변환됩니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| value | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | 브러시 좌표 공간에 적용된 행렬 변환. |

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

