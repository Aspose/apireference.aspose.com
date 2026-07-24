---
title: "XpsLinearGradientBrush"
second_title: "Aspose.Page용 Java API 참조"
description: "LinearGradientBrush 속성 요소 기능을 캡슐화하는 클래스."
type: docs
weight: 34
url: /ko/java/com.aspose.xps/xpslineargradientbrush/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject), [com.aspose.xps.XpsBrush](../../com.aspose.xps/xpsbrush), [com.aspose.xps.XpsTransformableBrush](../../com.aspose.xps/xpstransformablebrush), [com.aspose.xps.XpsGradientBrush](../../com.aspose.xps/xpsgradientbrush)
```
public final class XpsLinearGradientBrush extends XpsGradientBrush
```

LinearGradientBrush 속성 요소 기능을 캡슐화하는 클래스. 이 요소는 벡터를 따라 선형 그라디언트 브러시를 지정하는 데 사용됩니다.
## 메서드

| 메서드 | 설명 |
| --- | --- |
| [deepClone()](#deepClone--) | 이 선형 그라디언트 브러시를 복제합니다. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getColorInterpolationMode()](#getColorInterpolationMode--) | 색상 보간을 위한 감마 함수 값을 반환합니다. |
| [getEndPoint()](#getEndPoint--) | 선형 그라디언트의 끝점을 반환합니다. |
| [getGradientStops()](#getGradientStops--) | 그라디언트를 구성하는 그라디언트 스톱 목록을 반환합니다. |
| [getOpacity()](#getOpacity--) | 브러시 채우기의 균일한 투명성을 정의하는 값을 반환합니다. |
| [getSpreadMethod()](#getSpreadMethod--) | 주요 초기 그라디언트 영역 외부의 콘텐츠 영역을 브러시가 어떻게 채워야 하는지를 설명하는 값을 반환합니다. |
| [getStartPoint()](#getStartPoint--) | 선형 그라디언트의 시작점을 반환합니다. |
| [getTransform()](#getTransform--) | 브러시 좌표 공간에 적용된 행렬 변환을 반환합니다. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setColorInterpolationMode(XpsColorInterpolationMode value)](#setColorInterpolationMode-com.aspose.xps.XpsColorInterpolationMode-) | 색상 보간을 위한 감마 함수 값을 설정합니다. |
| [setEndPoint(Point2D value)](#setEndPoint-java.awt.geom.Point2D-) | 선형 그라디언트의 끝점을 반환/설정합니다. |
| [setGradientStops(List<XpsGradientStop> value)](#setGradientStops-java.util.List-com.aspose.xps.XpsGradientStop--) | 그라디언트를 구성하는 그라디언트 스톱 목록을 설정합니다. |
| [setOpacity(float value)](#setOpacity-float-) | 브러시 채우기의 균일한 투명성을 정의하는 값을 설정합니다. |
| [setSpreadMethod(XpsSpreadMethod value)](#setSpreadMethod-com.aspose.xps.XpsSpreadMethod-) | 주요 초기 그라디언트 영역 외부의 콘텐츠 영역을 브러시가 어떻게 채워야 하는지를 설명하는 값을 설정합니다. |
| [setStartPoint(Point2D value)](#setStartPoint-java.awt.geom.Point2D-) | 선형 그라디언트의 시작점을 설정합니다. |
| [setTransform(XpsMatrix value)](#setTransform-com.aspose.xps.XpsMatrix-) | 브러시 좌표 공간에 적용된 행렬 변환을 설정합니다. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### deepClone() {#deepClone--}
```
public XpsLinearGradientBrush deepClone()
```


이 선형 그라디언트 브러시를 복제합니다.

**Returns:**
[XpsLinearGradientBrush](../../com.aspose.xps/xpslineargradientbrush) - Clone of this linear gradient brush.
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
### getColorInterpolationMode() {#getColorInterpolationMode--}
```
public XpsColorInterpolationMode getColorInterpolationMode()
```


색상 보간을 위한 감마 함수 값을 반환합니다. 지정된 경우 감마 조정은 알파 구성 요소에 적용되지 않아야 합니다.

**Returns:**
[XpsColorInterpolationMode](../../com.aspose.xps/xpscolorinterpolationmode) - Value specifying the gamma function for color interpolation.
### getEndPoint() {#getEndPoint--}
```
public Point2D getEndPoint()
```


선형 그라디언트의 끝점을 반환합니다.

**Returns:**
java.awt.geom.Point2D - 선형 그라디언트의 끝점.
### getGradientStops() {#getGradientStops--}
```
public List<XpsGradientStop> getGradientStops()
```


그라디언트를 구성하는 그라디언트 스톱 목록을 반환합니다.

**Returns:**
java.util.List<com.aspose.xps.XpsGradientStop> - 그라디언트를 구성하는 그라디언트 스톱 목록.
### getOpacity() {#getOpacity--}
```
public float getOpacity()
```


브러시 채우기의 균일한 투명성을 정의하는 값을 반환합니다.

**Returns:**
float - 브러시 채우기의 균일한 투명성을 정의하는 값.
### getSpreadMethod() {#getSpreadMethod--}
```
public XpsSpreadMethod getSpreadMethod()
```


주요 초기 그라디언트 영역 외부의 콘텐츠 영역을 브러시가 어떻게 채워야 하는지를 설명하는 값을 반환합니다.

**Returns:**
[XpsSpreadMethod](../../com.aspose.xps/xpsspreadmethod) - Value describing how the brush should fill the content area outside of the primary, initial gradient area.
### getStartPoint() {#getStartPoint--}
```
public Point2D getStartPoint()
```


선형 그라디언트의 시작점을 반환합니다.

**Returns:**
java.awt.geom.Point2D - 선형 그라디언트의 시작점.
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




### setColorInterpolationMode(XpsColorInterpolationMode value) {#setColorInterpolationMode-com.aspose.xps.XpsColorInterpolationMode-}
```
public void setColorInterpolationMode(XpsColorInterpolationMode value)
```


색 보간을 위한 감마 함수를 지정하는 값을 설정합니다. 지정된 경우 감마 조정은 알파 구성 요소에 적용되지 않아야 합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| value | [XpsColorInterpolationMode](../../com.aspose.xps/xpscolorinterpolationmode) | 색 보간을 위한 감마 함수를 지정하는 값. |

### setEndPoint(Point2D value) {#setEndPoint-java.awt.geom.Point2D-}
```
public void setEndPoint(Point2D value)
```


선형 그라디언트의 끝점을 반환/설정합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| 값 | java.awt.geom.Point2D | 선형 그라디언트의 끝점입니다. |

### setGradientStops(List<XpsGradientStop> value) {#setGradientStops-java.util.List-com.aspose.xps.XpsGradientStop--}
```
public void setGradientStops(List<XpsGradientStop> value)
```


그라디언트를 구성하는 그라디언트 스톱 목록을 설정합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| 값 | java.util.List<com.aspose.xps.XpsGradientStop> | 그라디언트를 구성하는 그라디언트 스톱 목록. |

### setOpacity(float value) {#setOpacity-float-}
```
public void setOpacity(float value)
```


브러시 채우기의 균일한 투명성을 정의하는 값을 설정합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| 값 | float | 브러시 채우기의 균일한 투명성을 정의하는 값. |

### setSpreadMethod(XpsSpreadMethod value) {#setSpreadMethod-com.aspose.xps.XpsSpreadMethod-}
```
public void setSpreadMethod(XpsSpreadMethod value)
```


주요 초기 그라디언트 영역 외부의 콘텐츠 영역을 브러시가 어떻게 채워야 하는지를 설명하는 값을 설정합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| value | [XpsSpreadMethod](../../com.aspose.xps/xpsspreadmethod) | 브러시가 기본 초기 그라디언트 영역 외부의 콘텐츠 영역을 채우는 방법을 설명하는 값. |

### setStartPoint(Point2D value) {#setStartPoint-java.awt.geom.Point2D-}
```
public void setStartPoint(Point2D value)
```


선형 그라디언트의 시작점을 설정합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| 값 | java.awt.geom.Point2D | 선형 그라디언트의 시작점입니다. |

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

