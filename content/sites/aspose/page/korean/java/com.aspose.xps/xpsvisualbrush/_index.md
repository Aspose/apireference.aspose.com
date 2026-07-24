---
title: "XpsVisualBrush"
second_title: "Aspose.Page용 Java API 참조"
description: "VisualBrush 속성 요소 기능을 캡슐화하는 클래스."
type: docs
weight: 54
url: /ko/java/com.aspose.xps/xpsvisualbrush/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject), [com.aspose.xps.XpsBrush](../../com.aspose.xps/xpsbrush), [com.aspose.xps.XpsTransformableBrush](../../com.aspose.xps/xpstransformablebrush), [com.aspose.xps.XpsTilingBrush](../../com.aspose.xps/xpstilingbrush)
```
public final class XpsVisualBrush extends XpsTilingBrush
```

VisualBrush 속성 요소 기능을 캡슐화하는 클래스입니다. 이 요소는 그림으로 영역을 채우는 데 사용됩니다.
## 메서드

| 메서드 | 설명 |
| --- | --- |
| [deepClone()](#deepClone--) | 이 비주얼 브러시를 복제합니다. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getOpacity()](#getOpacity--) | 브러시 채우기의 균일한 투명성을 정의하는 값을 반환합니다. |
| [getTileMode()](#getTileMode--) | 채워진 기하학에서 타일링이 수행되는 방식을 지정하는 값을 반환합니다. |
| [getTransform()](#getTransform--) | 브러시 좌표 공간에 적용된 행렬 변환을 반환합니다. |
| [getViewbox()](#getViewbox--) | 뷰포트에 매핑될 브러시 소스 콘텐츠 영역을 반환합니다. |
| [getViewport()](#getViewport--) | 첫 번째 브러시 타일의 위치와 크기를 반환합니다. |
| [getVisual()](#getVisual--) | brush\\u2019s 소스 콘텐츠를 그리는 데 사용되는 Path, Glyphs 또는 Canvas 요소를 반환합니다. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setOpacity(float value)](#setOpacity-float-) | 브러시 채우기의 균일한 투명성을 정의하는 값을 설정합니다. |
| [setTileMode(XpsTileMode value)](#setTileMode-com.aspose.xps.XpsTileMode-) | 채워진 기하학에서 타일링이 수행되는 방식을 지정하는 값을 설정합니다. |
| [setTransform(XpsMatrix value)](#setTransform-com.aspose.xps.XpsMatrix-) | 브러시 좌표 공간에 적용된 행렬 변환을 설정합니다. |
| [setViewbox(Rectangle2D value)](#setViewbox-java.awt.geom.Rectangle2D-) | 뷰포트에 매핑될 브러시 소스 콘텐츠 영역을 설정합니다. |
| [setViewport(Rectangle2D value)](#setViewport-java.awt.geom.Rectangle2D-) | 첫 번째 브러시 타일의 위치와 크기를 설정합니다. |
| [setVisual(XpsContentElement visual)](#setVisual-com.aspose.xps.XpsContentElement-) | visual을 visual brush의 Visual 요소로 설정합니다. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### deepClone() {#deepClone--}
```
public XpsVisualBrush deepClone()
```


이 비주얼 브러시를 복제합니다.

**Returns:**
[XpsVisualBrush](../../com.aspose.xps/xpsvisualbrush) - Clone of this visual brush.
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
### getTileMode() {#getTileMode--}
```
public XpsTileMode getTileMode()
```


채워진 기하학에서 타일링이 수행되는 방식을 지정하는 값을 반환합니다.

**Returns:**
[XpsTileMode](../../com.aspose.xps/xpstilemode) - Value specifying how tiling is performed in the filled geometry.
### getTransform() {#getTransform--}
```
public XpsMatrix getTransform()
```


브러시 좌표 공간에 적용된 행렬 변환을 반환합니다. Transform 속성은 현재 유효한 렌더 변환과 연결되어 브러시 로컬의 유효한 렌더 변환을 생성합니다. 브러시의 뷰포트는 로컬 유효 렌더 변환을 사용하여 변환됩니다.

**Returns:**
[XpsMatrix](../../com.aspose.xps/xpsmatrix) - The matrix transformation applied to the coordinate space of the brush.
### getViewbox() {#getViewbox--}
```
public Rectangle2D getViewbox()
```


뷰포트에 매핑될 브러시 소스 콘텐츠 영역을 반환합니다.

**Returns:**
java.awt.geom.Rectangle2D - 뷰포트에 매핑될 브러시 소스 콘텐츠 영역.
### getViewport() {#getViewport--}
```
public Rectangle2D getViewport()
```


첫 번째 브러시 타일의 위치와 크기를 반환합니다. 이후 타일은 타일 모드에 지정된 대로 이 타일을 기준으로 배치됩니다.

**Returns:**
java.awt.geom.Rectangle2D - 첫 번째 브러시 타일의 위치와 크기.
### getVisual() {#getVisual--}
```
public XpsContentElement getVisual()
```


brush\\u2019s 소스 콘텐츠를 그리는 데 사용되는 Path, Glyphs 또는 Canvas 요소를 반환합니다.

**Returns:**
[XpsContentElement](../../com.aspose.xps/xpscontentelement) - A Path, Glyphs, or Canvas element used to draw the brush\\u2019s source content.
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

### setTileMode(XpsTileMode value) {#setTileMode-com.aspose.xps.XpsTileMode-}
```
public void setTileMode(XpsTileMode value)
```


채워진 기하학에서 타일링이 수행되는 방식을 지정하는 값을 설정합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| value | [XpsTileMode](../../com.aspose.xps/xpstilemode) | 채워진 기하학에서 타일링이 수행되는 방식을 지정하는 값. |

### setTransform(XpsMatrix value) {#setTransform-com.aspose.xps.XpsMatrix-}
```
public void setTransform(XpsMatrix value)
```


브러시 좌표 공간에 적용된 행렬 변환을 설정합니다. Transform 속성은 현재 유효한 렌더 변환과 연결되어 브러시 로컬의 유효한 렌더 변환을 생성합니다. 브러시의 뷰포트는 로컬 유효 렌더 변환을 사용하여 변환됩니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| value | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | 브러시 좌표 공간에 적용된 행렬 변환. |

### setViewbox(Rectangle2D value) {#setViewbox-java.awt.geom.Rectangle2D-}
```
public void setViewbox(Rectangle2D value)
```


뷰포트에 매핑될 브러시 소스 콘텐츠 영역을 설정합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| 값 | java.awt.geom.Rectangle2D | 뷰포트에 매핑될 브러시 소스 콘텐츠 영역. |

### setViewport(Rectangle2D value) {#setViewport-java.awt.geom.Rectangle2D-}
```
public void setViewport(Rectangle2D value)
```


첫 번째 브러시 타일의 위치와 크기를 설정합니다. 이후 타일은 타일 모드에 지정된 대로 이 타일을 기준으로 배치됩니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| 값 | java.awt.geom.Rectangle2D | 첫 번째 브러시 타일의 위치와 크기. |

### setVisual(XpsContentElement visual) {#setVisual-com.aspose.xps.XpsContentElement-}
```
public void setVisual(XpsContentElement visual)
```


visual을 visual brush의 Visual 요소로 설정합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| visual | [XpsContentElement](../../com.aspose.xps/xpscontentelement) | 요소. |

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

