---
title: "XpsCanvas"
second_title: "Aspose.Page용 Java API 참조"
description: "Canvas 요소 기능을 캡슐화하는 클래스."
type: docs
weight: 16
url: /ko/java/com.aspose.xps/xpscanvas/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject), [com.aspose.xps.XpsElement](../../com.aspose.xps/xpselement), [com.aspose.xps.XpsHyperlinkElement](../../com.aspose.xps/xpshyperlinkelement), [com.aspose.xps.XpsContentElement](../../com.aspose.xps/xpscontentelement)
```
public final class XpsCanvas extends XpsContentElement
```

Canvas 요소 기능을 캡슐화하는 클래스입니다. 이 요소는 요소들을 함께 그룹화합니다. 예를 들어, Glyphs와 Path 요소를 캔버스에 그룹화하여 단위(하이퍼링크 대상)로 식별하거나 각 자식 및 조상 요소에 복합 속성 값을 적용할 수 있습니다.
## 메서드

| 메서드 | 설명 |
| --- | --- |
| [<T>add(T element)](#-T-add-T-) | 이 캔버스의 자식 목록에 요소를 추가합니다. |
| [<T>insert(int index, T element)](#-T-insert-int-T-) | 이 캔버스의 자식 목록에 요소를 인덱스 위치에 삽입합니다. |
| [addCanvas()](#addCanvas--) | 이 캔버스의 자식 목록에 새 캔버스를 추가합니다. |
| [addGlyphs(String fontFamily, float fontSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)](#addGlyphs-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-) | 이 캔버스의 자식 목록에 새 글리프를 추가합니다. |
| [addPath(XpsPathGeometry data)](#addPath-com.aspose.xps.XpsPathGeometry-) | 이 캔버스의 자식 목록에 새 경로를 추가합니다. |
| [deepClone()](#deepClone--) | 이 캔버스를 복제합니다. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [get(int i)](#get-int-) | 인덱스 i 로 요소의 자식에 접근할 수 있습니다. |
| [getClass()](#getClass--) |  |
| [getClip()](#getClip--) | 요소의 렌더링 영역을 제한하는 경로 기하학을 반환합니다. |
| [getEdgeMode()](#getEdgeMode--) | 캔버스 내 경로 가장자리의 렌더링 방식을 제어하는 값을 반환합니다. |
| [getHyperlinkTarget()](#getHyperlinkTarget--) | 하이퍼링크 대상 객체를 반환합니다. |
| [getOpacity()](#getOpacity--) | 요소의 균일한 투명성을 정의하는 값을 반환합니다. |
| [getOpacityMask()](#getOpacityMask--) | Opacity 속성과 동일한 방식으로 요소에 적용되는 알파 값 마스크를 지정하는 브러시를 반환하지만, 요소의 서로 다른 영역에 대해 서로 다른 알파 값을 허용합니다. |
| [getRenderTransform()](#getRenderTransform--) | 요소와 모든 자식 요소(있는 경우)의 모든 속성에 대한 새로운 좌표계를 설정하는 아핀 변환 행렬을 반환합니다. |
| [hashCode()](#hashCode--) |  |
| [insertCanvas(int index)](#insertCanvas-int-) | 이 캔버스의 자식 목록에 새 캔버스를 인덱스 위치에 삽입합니다. |
| [insertGlyphs(int index, String fontFamily, float fontSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)](#insertGlyphs-int-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-) | 이 캔버스의 자식 목록에 새 글리프를 인덱스 위치에 삽입합니다. |
| [insertPath(int index, XpsPathGeometry data)](#insertPath-int-com.aspose.xps.XpsPathGeometry-) | 이 캔버스의 자식 목록에 새 경로를 인덱스 위치에 삽입합니다. |
| [iterator()](#iterator--) | Iterable 인터페이스의 구현. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setClip(XpsPathGeometry value)](#setClip-com.aspose.xps.XpsPathGeometry-) | 요소의 렌더링 영역을 제한하는 경로 기하학을 설정합니다. |
| [setEdgeMode(XpsEdgeMode value)](#setEdgeMode-com.aspose.xps.XpsEdgeMode-) | 캔버스 내 경로 가장자리의 렌더링 방식을 제어하는 값을 설정합니다. |
| [setHyperlinkTarget(XpsHyperlinkTarget value)](#setHyperlinkTarget-com.aspose.xps.XpsHyperlinkTarget-) | 하이퍼링크 대상 객체를 설정합니다. |
| [setOpacity(float value)](#setOpacity-float-) | 요소의 균일한 투명성을 정의하는 값을 설정합니다. |
| [setOpacityMask(XpsBrush value)](#setOpacityMask-com.aspose.xps.XpsBrush-) | Opacity 속성과 동일한 방식으로 요소에 적용되는 알파 값 마스크를 지정하는 브러시를 설정하지만, 요소의 서로 다른 영역에 대해 다른 알파 값을 허용합니다. |
| [setRenderTransform(XpsMatrix value)](#setRenderTransform-com.aspose.xps.XpsMatrix-) | 요소 및 모든 하위 요소(있는 경우)의 모든 속성에 대한 새로운 좌표 프레임을 설정하는 아핀 변환 행렬을 설정합니다. |
| [size()](#size--) | 하위 요소의 수를 반환합니다. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### <T>add(T element) {#-T-add-T-}
```
public T <T>add(T element)
```


이 캔버스의 자식 목록에 요소를 추가합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| 요소 | T | 추가할 요소입니다. |

**Returns:**
T - 추가된 요소.
### <T>insert(int index, T element) {#-T-insert-int-T-}
```
public T <T>insert(int index, T element)
```


이 캔버스의 자식 목록에 요소를 인덱스 위치에 삽입합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| 인덱스 | int | 요소가 삽입되어야 할 위치. |
| 요소 | T | 삽입할 요소. |

**Returns:**
T - 삽입된 요소.
### addCanvas() {#addCanvas--}
```
public XpsCanvas addCanvas()
```


이 캔버스의 자식 목록에 새 캔버스를 추가합니다.

**Returns:**
[XpsCanvas](../../com.aspose.xps/xpscanvas) - Added canvas.
### addGlyphs(String fontFamily, float fontSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString) {#addGlyphs-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-}
```
public XpsGlyphs addGlyphs(String fontFamily, float fontSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)
```


이 캔버스의 자식 목록에 새 글리프를 추가합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| fontFamily | java.lang.String | 폰트 패밀리. |
| fontSize | float | 폰트 크기. |
| fontStyle | [XpsFontStyle](../../com.aspose.xps/xpsfontstyle) | 글꼴 스타일. |
| originX | float | 글리프 원점 X 좌표. |
| originY | float | 글리프 원점 T 좌표. |
| unicodeString | java.lang.String | 출력할 문자열. |

**Returns:**
[XpsGlyphs](../../com.aspose.xps/xpsglyphs) - Added glyphs.
### addPath(XpsPathGeometry data) {#addPath-com.aspose.xps.XpsPathGeometry-}
```
public XpsPath addPath(XpsPathGeometry data)
```


이 캔버스의 자식 목록에 새 경로를 추가합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| data | [XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) | 경로의 기하학. |

**Returns:**
[XpsPath](../../com.aspose.xps/xpspath) - Added path.
### deepClone() {#deepClone--}
```
public XpsCanvas deepClone()
```


이 캔버스를 복제합니다.

**Returns:**
[XpsCanvas](../../com.aspose.xps/xpscanvas) - Clone of this canvas.
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
### getEdgeMode() {#getEdgeMode--}
```
public XpsEdgeMode getEdgeMode()
```


캔버스 내 경로 가장자리의 렌더링 방식을 제어하는 값을 반환합니다.

**Returns:**
[XpsEdgeMode](../../com.aspose.xps/xpsedgemode) - The edge rendering mode.
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
### insertCanvas(int index) {#insertCanvas-int-}
```
public XpsCanvas insertCanvas(int index)
```


이 캔버스의 자식 목록에 새 캔버스를 인덱스 위치에 삽입합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| 인덱스 | int | 새 캔버스를 삽입해야 하는 위치. |

**Returns:**
[XpsCanvas](../../com.aspose.xps/xpscanvas) - Inserted canvas.
### insertGlyphs(int index, String fontFamily, float fontSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString) {#insertGlyphs-int-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-}
```
public XpsGlyphs insertGlyphs(int index, String fontFamily, float fontSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)
```


이 캔버스의 자식 목록에 새 글리프를 인덱스 위치에 삽입합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| 인덱스 | int | 새 글리프를 삽입해야 하는 위치. |
| fontFamily | java.lang.String | 폰트 패밀리. |
| fontSize | float | 폰트 크기. |
| fontStyle | [XpsFontStyle](../../com.aspose.xps/xpsfontstyle) | 글꼴 스타일. |
| originX | float | 글리프 원점 X 좌표. |
| originY | float | 글리프 원점 T 좌표. |
| unicodeString | java.lang.String | 출력할 문자열. |

**Returns:**
[XpsGlyphs](../../com.aspose.xps/xpsglyphs) - Added glyphs.
### insertPath(int index, XpsPathGeometry data) {#insertPath-int-com.aspose.xps.XpsPathGeometry-}
```
public XpsPath insertPath(int index, XpsPathGeometry data)
```


이 캔버스의 자식 목록에 새 경로를 인덱스 위치에 삽입합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| 인덱스 | int | 새 경로를 삽입해야 하는 위치. |
| data | [XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) | 경로의 기하학. |

**Returns:**
[XpsPath](../../com.aspose.xps/xpspath) - Inserted path.
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

### setEdgeMode(XpsEdgeMode value) {#setEdgeMode-com.aspose.xps.XpsEdgeMode-}
```
public void setEdgeMode(XpsEdgeMode value)
```


캔버스 내 경로 가장자리의 렌더링 방식을 제어하는 값을 설정합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| value | [XpsEdgeMode](../../com.aspose.xps/xpsedgemode) | 가장자리 렌더링 모드. |

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

