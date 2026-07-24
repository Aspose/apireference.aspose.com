---
title: "XpsContentElement"
second_title: "Aspose.Page용 Java API 참조"
description: "XPS 콘텐츠 요소인 Canvas, Path 및 Glyphs의 기능을 캡슐화합니다."
type: docs
weight: 18
url: /ko/java/com.aspose.xps/xpscontentelement/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject), [com.aspose.xps.XpsElement](../../com.aspose.xps/xpselement), [com.aspose.xps.XpsHyperlinkElement](../../com.aspose.xps/xpshyperlinkelement)
```
public abstract class XpsContentElement extends XpsHyperlinkElement
```

XPS 콘텐츠 요소인 Canvas, Path 및 Glyphs의 기능을 캡슐화합니다.
## 메서드

| 메서드 | 설명 |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [get(int i)](#get-int-) | 인덱스 i 로 요소의 자식에 접근할 수 있습니다. |
| [getClass()](#getClass--) |  |
| [getClip()](#getClip--) | 요소의 렌더링 영역을 제한하는 경로 기하학을 반환합니다. |
| [getHyperlinkTarget()](#getHyperlinkTarget--) | 하이퍼링크 대상 객체를 반환합니다. |
| [getOpacity()](#getOpacity--) | 요소의 균일한 투명성을 정의하는 값을 반환합니다. |
| [getOpacityMask()](#getOpacityMask--) | Opacity 속성과 동일한 방식으로 요소에 적용되는 알파 값 마스크를 지정하는 브러시를 반환하지만, 요소의 서로 다른 영역에 대해 서로 다른 알파 값을 허용합니다. |
| [getRenderTransform()](#getRenderTransform--) | 요소와 모든 자식 요소(있는 경우)의 모든 속성에 대한 새로운 좌표계를 설정하는 아핀 변환 행렬을 반환합니다. |
| [hashCode()](#hashCode--) |  |
| [iterator()](#iterator--) | Iterable 인터페이스의 구현. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setClip(XpsPathGeometry value)](#setClip-com.aspose.xps.XpsPathGeometry-) | 요소의 렌더링 영역을 제한하는 경로 기하학을 설정합니다. |
| [setHyperlinkTarget(XpsHyperlinkTarget value)](#setHyperlinkTarget-com.aspose.xps.XpsHyperlinkTarget-) | 하이퍼링크 대상 객체를 설정합니다. |
| [setOpacity(float value)](#setOpacity-float-) | 요소의 균일한 투명성을 정의하는 값을 설정합니다. |
| [setOpacityMask(XpsBrush value)](#setOpacityMask-com.aspose.xps.XpsBrush-) | Opacity 속성과 동일한 방식으로 요소에 적용되는 알파 값 마스크를 지정하는 브러시를 설정하지만, 요소의 서로 다른 영역에 대해 다른 알파 값을 허용합니다. |
| [setRenderTransform(XpsMatrix value)](#setRenderTransform-com.aspose.xps.XpsMatrix-) | 요소 및 모든 하위 요소(있는 경우)의 모든 속성에 대한 새로운 좌표 프레임을 설정하는 아핀 변환 행렬을 설정합니다. |
| [size()](#size--) | 하위 요소의 수를 반환합니다. |
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

