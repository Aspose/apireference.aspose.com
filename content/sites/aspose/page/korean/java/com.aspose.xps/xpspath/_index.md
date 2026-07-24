---
title: "XpsPath"
second_title: "Aspose.Page용 Java API 참조"
description: "Path 요소 기능을 캡슐화하는 클래스."
type: docs
weight: 40
url: /ko/java/com.aspose.xps/xpspath/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject), [com.aspose.xps.XpsElement](../../com.aspose.xps/xpselement), [com.aspose.xps.XpsHyperlinkElement](../../com.aspose.xps/xpshyperlinkelement), [com.aspose.xps.XpsContentElement](../../com.aspose.xps/xpscontentelement)
```
public final class XpsPath extends XpsContentElement
```

Path 요소 기능을 캡슐화하는 클래스입니다. 이 요소는 고정 페이지에 벡터 그래픽 및 이미지를 추가하는 유일한 방법입니다. 페이지에 렌더링될 단일 벡터 그래픽을 정의합니다.
## 메서드

| 메서드 | 설명 |
| --- | --- |
| [deepClone()](#deepClone--) | 이 경로를 복제합니다. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [get(int i)](#get-int-) | 인덱스 i 로 요소의 자식에 접근할 수 있습니다. |
| [getClass()](#getClass--) |  |
| [getClip()](#getClip--) | 요소의 렌더링 영역을 제한하는 경로 기하학을 반환합니다. |
| [getData()](#getData--) | 경로의 기하학을 반환합니다. |
| [getFill()](#getFill--) | 경로의 Data 속성으로 지정된 기하학을 그리는 데 사용되는 브러시를 반환합니다. |
| [getHyperlinkTarget()](#getHyperlinkTarget--) | 하이퍼링크 대상 객체를 반환합니다. |
| [getOpacity()](#getOpacity--) | 요소의 균일한 투명성을 정의하는 값을 반환합니다. |
| [getOpacityMask()](#getOpacityMask--) | Opacity 속성과 동일한 방식으로 요소에 적용되는 알파 값 마스크를 지정하는 브러시를 반환하지만, 요소의 서로 다른 영역에 대해 서로 다른 알파 값을 허용합니다. |
| [getRenderTransform()](#getRenderTransform--) | 요소와 모든 자식 요소(있는 경우)의 모든 속성에 대한 새로운 좌표계를 설정하는 아핀 변환 행렬을 반환합니다. |
| [getStroke()](#getStroke--) | 스트로크를 그리는 데 사용되는 브러시를 반환합니다. |
| [getStrokeDashArray()](#getStrokeDashArray--) | 외곽선 스트로크의 대시 및 간격 길이를 지정하는 배열을 반환합니다. |
| [getStrokeDashCap()](#getStrokeDashCap--) | 각 대시의 끝이 그려지는 방식을 지정하는 값을 반환합니다. |
| [getStrokeDashOffset()](#getStrokeDashOffset--) | 대시 배열 패턴을 반복하기 위한 시작점을 반환합니다. |
| [getStrokeEndLineCap()](#getStrokeEndLineCap--) | 스트로크에서 마지막 대시의 끝 모양을 정의하는 값을 반환합니다. |
| [getStrokeLineJoin()](#getStrokeLineJoin--) | 스트로크에서 첫 번째 대시의 시작 모양을 정의하는 값을 반환합니다. |
| [getStrokeMiterLimit()](#getStrokeMiterLimit--) | 최대 마이터 길이와 스트로크 두께 절반 사이의 비율을 반환합니다. |
| [getStrokeStartLineCap()](#getStrokeStartLineCap--) | 스트로크에서 첫 번째 대시의 시작 모양을 정의하는 값을 반환합니다. |
| [getStrokeThickness()](#getStrokeThickness--) | 스트로크의 두께를 반환합니다. 단위는 실제 좌표 공간이며(경로의 렌더 변환을 포함합니다). |
| [hashCode()](#hashCode--) |  |
| [iterator()](#iterator--) | Iterable 인터페이스의 구현. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setClip(XpsPathGeometry value)](#setClip-com.aspose.xps.XpsPathGeometry-) | 요소의 렌더링 영역을 제한하는 경로 기하학을 설정합니다. |
| [setData(XpsPathGeometry value)](#setData-com.aspose.xps.XpsPathGeometry-) | 경로의 기하학을 설정합니다. |
| [setFill(XpsBrush value)](#setFill-com.aspose.xps.XpsBrush-) | 경로의 Data 속성으로 지정된 기하학을 그리는 데 사용되는 브러시를 설정합니다. |
| [setHyperlinkTarget(XpsHyperlinkTarget value)](#setHyperlinkTarget-com.aspose.xps.XpsHyperlinkTarget-) | 하이퍼링크 대상 객체를 설정합니다. |
| [setOpacity(float value)](#setOpacity-float-) | 요소의 균일한 투명성을 정의하는 값을 설정합니다. |
| [setOpacityMask(XpsBrush value)](#setOpacityMask-com.aspose.xps.XpsBrush-) | Opacity 속성과 동일한 방식으로 요소에 적용되는 알파 값 마스크를 지정하는 브러시를 설정하지만, 요소의 서로 다른 영역에 대해 다른 알파 값을 허용합니다. |
| [setRenderTransform(XpsMatrix value)](#setRenderTransform-com.aspose.xps.XpsMatrix-) | 요소 및 모든 하위 요소(있는 경우)의 모든 속성에 대한 새로운 좌표 프레임을 설정하는 아핀 변환 행렬을 설정합니다. |
| [setStroke(XpsBrush value)](#setStroke-com.aspose.xps.XpsBrush-) | 스트로크를 그리는 데 사용되는 브러시를 설정합니다. |
| [setStrokeDashArray(float[] value)](#setStrokeDashArray-float---) | 외곽선 스트로크의 대시 및 간격 길이를 지정하는 배열을 설정합니다. |
| [setStrokeDashCap(XpsDashCap value)](#setStrokeDashCap-com.aspose.xps.XpsDashCap-) | 각 대시의 끝이 그려지는 방식을 지정하는 값을 설정합니다. |
| [setStrokeDashOffset(float value)](#setStrokeDashOffset-float-) | 대시 배열 패턴을 반복하기 위한 시작점을 설정합니다. |
| [setStrokeEndLineCap(XpsLineCap value)](#setStrokeEndLineCap-com.aspose.xps.XpsLineCap-) | 스트로크에서 마지막 대시의 끝 모양을 정의하는 값을 설정합니다. |
| [setStrokeLineJoin(XpsLineJoin value)](#setStrokeLineJoin-com.aspose.xps.XpsLineJoin-) | 스트로크에서 첫 번째 대시의 시작 모양을 정의하는 값을 설정합니다. |
| [setStrokeMiterLimit(float value)](#setStrokeMiterLimit-float-) | 최대 마이터 길이와 스트로크 두께 절반 사이의 비율을 설정합니다. |
| [setStrokeStartLineCap(XpsLineCap value)](#setStrokeStartLineCap-com.aspose.xps.XpsLineCap-) | 스트로크에서 첫 번째 대시의 시작 모양을 정의하는 값을 설정합니다. |
| [setStrokeThickness(float value)](#setStrokeThickness-float-) | 스트로크의 두께를 설정합니다. 단위는 실제 좌표 공간이며(경로의 렌더 변환을 포함합니다). |
| [size()](#size--) | 하위 요소의 수를 반환합니다. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### deepClone() {#deepClone--}
```
public XpsPath deepClone()
```


이 경로를 복제합니다.

**Returns:**
[XpsPath](../../com.aspose.xps/xpspath) - Clone this path.
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
### get(int i) {#get-int-}
```
public XpsContentElement get(int i)
```


인덱스 i 로 요소의 자식에 접근할 수 있습니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| i | int | 하위 요소의 인덱스. |

**Returns:**
[XpsContentElement](../../com.aspose.xps/xpscontentelement) - Child element at  i  position.
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getClip() {#getClip--}
```
public XpsPathGeometry getClip()
```


요소의 렌더링 영역을 제한하는 경로 기하학을 반환합니다.

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - The path geometry limiting the rendered region of the element.
### getData() {#getData--}
```
public XpsPathGeometry getData()
```


경로의 기하학을 반환합니다.

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - The geometry of the path.
### getFill() {#getFill--}
```
public XpsBrush getFill()
```


경로의 Data 속성으로 지정된 기하학을 그리는 데 사용되는 브러시를 반환합니다.

**Returns:**
[XpsBrush](../../com.aspose.xps/xpsbrush) - The brush used to paint the geometry specified
### getHyperlinkTarget() {#getHyperlinkTarget--}
```
public XpsHyperlinkTarget getHyperlinkTarget()
```


하이퍼링크 대상 객체를 반환합니다.

**Returns:**
[XpsHyperlinkTarget](../../com.aspose.xps/xpshyperlinktarget) - Hyperlink target object.
### getOpacity() {#getOpacity--}
```
public float getOpacity()
```


요소의 균일한 투명성을 정의하는 값을 반환합니다.

**Returns:**
float - 요소의 균일한 투명성을 정의하는 값.
### getOpacityMask() {#getOpacityMask--}
```
public XpsBrush getOpacityMask()
```


Opacity 속성과 동일한 방식으로 요소에 적용되는 알파 값 마스크를 지정하는 브러시를 반환하지만, 요소의 서로 다른 영역에 대해 서로 다른 알파 값을 허용합니다.

**Returns:**
[XpsBrush](../../com.aspose.xps/xpsbrush) - The brush specifying a mask.
### getRenderTransform() {#getRenderTransform--}
```
public XpsMatrix getRenderTransform()
```


요소와 모든 자식 요소(있는 경우)의 모든 속성에 대한 새로운 좌표계를 설정하는 아핀 변환 행렬을 반환합니다.

**Returns:**
[XpsMatrix](../../com.aspose.xps/xpsmatrix) - The affine transformation matrix.
### getStroke() {#getStroke--}
```
public XpsBrush getStroke()
```


스트로크를 그리는 데 사용되는 브러시를 반환합니다.

**Returns:**
[XpsBrush](../../com.aspose.xps/xpsbrush) - The brush used to draw the stroke.
### getStrokeDashArray() {#getStrokeDashArray--}
```
public float[] getStrokeDashArray()
```


외곽선 스트로크의 대시 및 간격 길이를 지정하는 배열을 반환합니다.

**Returns:**
float[] - 외곽선 스트로크의 대시 및 간격 길이를 지정하는 배열.
### getStrokeDashCap() {#getStrokeDashCap--}
```
public XpsDashCap getStrokeDashCap()
```


각 대시의 끝이 그려지는 방식을 지정하는 값을 반환합니다.

**Returns:**
[XpsDashCap](../../com.aspose.xps/xpsdashcap) - The value specifying how the ends of each dash are drawn.
### getStrokeDashOffset() {#getStrokeDashOffset--}
```
public float getStrokeDashOffset()
```


대시 배열 패턴을 반복하기 위한 시작점을 반환합니다. 이 값을 생략하면 대시 배열이 스트로크의 원점에 맞춰집니다.

**Returns:**
float - 대시 배열 패턴을 반복하는 시작점.
### getStrokeEndLineCap() {#getStrokeEndLineCap--}
```
public XpsLineCap getStrokeEndLineCap()
```


스트로크에서 마지막 대시의 끝 모양을 정의하는 값을 반환합니다.

**Returns:**
[XpsLineCap](../../com.aspose.xps/xpslinecap) - The value defining the shape of the end of the last dash in a stroke.
### getStrokeLineJoin() {#getStrokeLineJoin--}
```
public XpsLineJoin getStrokeLineJoin()
```


스트로크에서 첫 번째 대시의 시작 모양을 정의하는 값을 반환합니다.

**Returns:**
[XpsLineJoin](../../com.aspose.xps/xpslinejoin) - The value defining the shape of the beginning of the first dash in a stroke.
### getStrokeMiterLimit() {#getStrokeMiterLimit--}
```
public float getStrokeMiterLimit()
```


최대 마이터 길이와 스트로크 두께의 절반 사이의 비율을 반환합니다. 이 값은  StrokeLineJoin  속성이  Miter 를 지정한 경우에만 의미가 있습니다.

**Returns:**
float - 최대 마이터 길이와 스트로크 두께의 절반 사이의 비율.
### getStrokeStartLineCap() {#getStrokeStartLineCap--}
```
public XpsLineCap getStrokeStartLineCap()
```


스트로크에서 첫 번째 대시의 시작 모양을 정의하는 값을 반환합니다.

**Returns:**
[XpsLineCap](../../com.aspose.xps/xpslinecap) - The value defining the shape of the beginning of the first dash in a stroke.
### getStrokeThickness() {#getStrokeThickness--}
```
public float getStrokeThickness()
```


스트로크의 두께를 반환합니다. 단위는 실제 좌표 공간(경로의 렌더 변환 포함)입니다. 스트로크는 Path 요소\\u2019s Data 속성으로 지정된 기하학 경계 위에 그려집니다. StrokeThickness의 절반은 Data 속성으로 지정된 기하학 외부로, 나머지 절반은 내부로 확장됩니다.

**Returns:**
float - 스트로크의 두께.
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### iterator() {#iterator--}
```
public Iterator<XpsContentElement> iterator()
```


Iterable 인터페이스의 구현.

**Returns:**
java.util.Iterator<com.aspose.xps.XpsContentElement> - 목록에 대한 열거자를 반환합니다.
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### setClip(XpsPathGeometry value) {#setClip-com.aspose.xps.XpsPathGeometry-}
```
public void setClip(XpsPathGeometry value)
```


요소의 렌더링 영역을 제한하는 경로 기하학을 설정합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| value | [XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) | 요소의 렌더링 영역을 제한하는 경로 기하학. |

### setData(XpsPathGeometry value) {#setData-com.aspose.xps.XpsPathGeometry-}
```
public void setData(XpsPathGeometry value)
```


경로의 기하학을 설정합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| value | [XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) | 경로의 기하학. |

### setFill(XpsBrush value) {#setFill-com.aspose.xps.XpsBrush-}
```
public void setFill(XpsBrush value)
```


경로의 Data 속성으로 지정된 기하학을 그리는 데 사용되는 브러시를 설정합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| value | [XpsBrush](../../com.aspose.xps/xpsbrush) | 지정된 기하학을 그리는 데 사용되는 브러시 |

### setHyperlinkTarget(XpsHyperlinkTarget value) {#setHyperlinkTarget-com.aspose.xps.XpsHyperlinkTarget-}
```
public void setHyperlinkTarget(XpsHyperlinkTarget value)
```


하이퍼링크 대상 객체를 설정합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| value | [XpsHyperlinkTarget](../../com.aspose.xps/xpshyperlinktarget) | 하이퍼링크 대상 객체. |

### setOpacity(float value) {#setOpacity-float-}
```
public void setOpacity(float value)
```


요소의 균일한 투명성을 정의하는 값을 설정합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| 값 | float | 요소의 균일한 투명성을 정의하는 값. |

### setOpacityMask(XpsBrush value) {#setOpacityMask-com.aspose.xps.XpsBrush-}
```
public void setOpacityMask(XpsBrush value)
```


Opacity 속성과 동일한 방식으로 요소에 적용되는 알파 값 마스크를 지정하는 브러시를 설정하지만, 요소의 서로 다른 영역에 대해 다른 알파 값을 허용합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| value | [XpsBrush](../../com.aspose.xps/xpsbrush) | 마스크를 지정하는 브러시. |

### setRenderTransform(XpsMatrix value) {#setRenderTransform-com.aspose.xps.XpsMatrix-}
```
public void setRenderTransform(XpsMatrix value)
```


요소 및 모든 하위 요소(있는 경우)의 모든 속성에 대한 새로운 좌표 프레임을 설정하는 아핀 변환 행렬을 설정합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| value | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | 아핀 변환 행렬. |

### setStroke(XpsBrush value) {#setStroke-com.aspose.xps.XpsBrush-}
```
public void setStroke(XpsBrush value)
```


스트로크를 그리는 데 사용되는 브러시를 설정합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| value | [XpsBrush](../../com.aspose.xps/xpsbrush) | 스트로크를 그리는 데 사용되는 브러시. |

### setStrokeDashArray(float[] value) {#setStrokeDashArray-float---}
```
public void setStrokeDashArray(float[] value)
```


외곽선 스트로크의 대시 및 간격 길이를 지정하는 배열을 설정합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| 값 | float[] | 외곽선 스트로크의 대시와 간격 길이를 지정하는 배열. |

### setStrokeDashCap(XpsDashCap value) {#setStrokeDashCap-com.aspose.xps.XpsDashCap-}
```
public void setStrokeDashCap(XpsDashCap value)
```


각 대시의 끝이 그려지는 방식을 지정하는 값을 설정합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| value | [XpsDashCap](../../com.aspose.xps/xpsdashcap) | 각 대시의 끝이 그려지는 방식을 지정하는 값. |

### setStrokeDashOffset(float value) {#setStrokeDashOffset-float-}
```
public void setStrokeDashOffset(float value)
```


대시 배열 패턴을 반복하는 시작점을 설정합니다. 이 값을 생략하면 대시 배열이 스트로크의 원점에 맞춰집니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| 값 | float | 대시 배열 패턴을 반복하는 시작점. |

### setStrokeEndLineCap(XpsLineCap value) {#setStrokeEndLineCap-com.aspose.xps.XpsLineCap-}
```
public void setStrokeEndLineCap(XpsLineCap value)
```


스트로크에서 마지막 대시의 끝 모양을 정의하는 값을 설정합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| value | [XpsLineCap](../../com.aspose.xps/xpslinecap) | 스트로크에서 마지막 대시의 끝 모양을 정의하는 값. |

### setStrokeLineJoin(XpsLineJoin value) {#setStrokeLineJoin-com.aspose.xps.XpsLineJoin-}
```
public void setStrokeLineJoin(XpsLineJoin value)
```


스트로크에서 첫 번째 대시의 시작 모양을 정의하는 값을 설정합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| value | [XpsLineJoin](../../com.aspose.xps/xpslinejoin) | 스트로크에서 첫 번째 대시의 시작 모양을 정의하는 값. |

### setStrokeMiterLimit(float value) {#setStrokeMiterLimit-float-}
```
public void setStrokeMiterLimit(float value)
```


최대 마이터 길이와 스트로크 두께의 절반 사이의 비율을 설정합니다. 이 값은  StrokeLineJoin  속성이  Mither 를 지정한 경우에만 의미가 있습니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| 값 | float | 최대 마이터 길이와 스트로크 두께의 절반 사이의 비율. |

### setStrokeStartLineCap(XpsLineCap value) {#setStrokeStartLineCap-com.aspose.xps.XpsLineCap-}
```
public void setStrokeStartLineCap(XpsLineCap value)
```


스트로크에서 첫 번째 대시의 시작 모양을 정의하는 값을 설정합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| value | [XpsLineCap](../../com.aspose.xps/xpslinecap) | 스트로크에서 첫 번째 대시의 시작 모양을 정의하는 값. |

### setStrokeThickness(float value) {#setStrokeThickness-float-}
```
public void setStrokeThickness(float value)
```


스트로크의 두께를 설정합니다. 단위는 실제 좌표 공간(경로의 렌더 변환 포함)입니다. 스트로크는 Path 요소\\u2019s Data 속성으로 지정된 기하학 경계 위에 그려집니다. StrokeThickness의 절반은 Data 속성으로 지정된 기하학 외부로, 나머지 절반은 내부로 확장됩니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| 값 | float | 스트로크의 두께. |

### size() {#size--}
```
public int size()
```


하위 요소의 수를 반환합니다.

**Returns:**
int - 하위 요소의 수.
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

