---
title: "XpsGlyphs"
second_title: "Aspose.Page용 Java API 참조"
description: "Glyphs 요소 기능을 캡슐화하는 클래스."
type: docs
weight: 25
url: /ko/java/com.aspose.xps/xpsglyphs/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject), [com.aspose.xps.XpsElement](../../com.aspose.xps/xpselement), [com.aspose.xps.XpsHyperlinkElement](../../com.aspose.xps/xpshyperlinkelement), [com.aspose.xps.XpsContentElement](../../com.aspose.xps/xpscontentelement)
```
public final class XpsGlyphs extends XpsContentElement
```

Glyphs 요소의 기능을 캡슐화하는 클래스입니다. 이 요소는 단일 폰트에서 균일하게 형식이 지정된 텍스트 실행을 나타냅니다. 정확한 렌더링에 필요한 정보를 제공하며, 뷰어에서 검색 및 선택 기능을 지원합니다.
## 메서드

| 메서드 | 설명 |
| --- | --- |
| [deepClone()](#deepClone--) | 이 글리프를 복제합니다. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [get(int i)](#get-int-) | 인덱스 i 로 요소의 자식에 접근할 수 있습니다. |
| [getBidiLevel()](#getBidiLevel--) | Unicode 알고리즘 양방향 중첩 수준을 지정하는 값을 반환합니다. |
| [getClass()](#getClass--) |  |
| [getClip()](#getClip--) | 요소의 렌더링 영역을 제한하는 경로 기하학을 반환합니다. |
| [getFill()](#getFill--) | 렌더링된 글리프의 형태를 채우는 브러시를 반환합니다. |
| [getFont()](#getFont--) | 요소 텍스트를 조판하는 데 사용되는 TrueType 폰트의 폰트 리소스를 반환합니다. |
| [getFontRenderingEmSize()](#getFontRenderingEmSize--) | 그리기 표면 단위로 표현된 폰트 크기를 부동 소수점 값으로 반환합니다(유효 좌표 공간 단위). |
| [getHyperlinkTarget()](#getHyperlinkTarget--) | 하이퍼링크 대상 객체를 반환합니다. |
| [getOpacity()](#getOpacity--) | 요소의 균일한 투명성을 정의하는 값을 반환합니다. |
| [getOpacityMask()](#getOpacityMask--) | Opacity 속성과 동일한 방식으로 요소에 적용되는 알파 값 마스크를 지정하는 브러시를 반환하지만, 요소의 서로 다른 영역에 대해 서로 다른 알파 값을 허용합니다. |
| [getOriginX()](#getOriginX--) | 실행에서 첫 번째 글리프의 x 좌표를 유효 좌표 공간 단위로 반환합니다. |
| [getOriginY()](#getOriginY--) | 실행에서 첫 번째 글리프의 y 좌표를 유효 좌표 공간 단위로 반환합니다. |
| [getRenderTransform()](#getRenderTransform--) | 요소와 모든 자식 요소(있는 경우)의 모든 속성에 대한 새로운 좌표계를 설정하는 아핀 변환 행렬을 반환합니다. |
| [getStyleSimulations()](#getStyleSimulations--) | 스타일 시뮬레이션을 지정하는 값을 반환합니다. |
| [getUnicodeString()](#getUnicodeString--) | Glyphs 요소에 의해 렌더링된 텍스트 문자열을 반환합니다. |
| [hashCode()](#hashCode--) |  |
| [isSideways()](#isSideways--) | 글리프가 옆으로 회전했음을 나타내는 값을 반환합니다(원점은 회전되지 않은 글리프의 상단 중앙으로 정의됩니다). |
| [iterator()](#iterator--) | Iterable 인터페이스의 구현. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setBidiLevel(int value)](#setBidiLevel-int-) | Unicode 알고리즘 양방향 중첩 수준을 지정하는 값을 설정합니다. |
| [setClip(XpsPathGeometry value)](#setClip-com.aspose.xps.XpsPathGeometry-) | 요소의 렌더링 영역을 제한하는 경로 기하학을 설정합니다. |
| [setFill(XpsBrush value)](#setFill-com.aspose.xps.XpsBrush-) | 렌더링된 글리프의 형태를 채우는 브러시를 설정합니다. |
| [setFontRenderingEmSize(float value)](#setFontRenderingEmSize-float-) | 그리기 표면 단위로 표현된 폰트 크기를 부동 소수점 값으로 설정합니다(유효 좌표 공간 단위). |
| [setHyperlinkTarget(XpsHyperlinkTarget value)](#setHyperlinkTarget-com.aspose.xps.XpsHyperlinkTarget-) | 하이퍼링크 대상 객체를 설정합니다. |
| [setOpacity(float value)](#setOpacity-float-) | 요소의 균일한 투명성을 정의하는 값을 설정합니다. |
| [setOpacityMask(XpsBrush value)](#setOpacityMask-com.aspose.xps.XpsBrush-) | Opacity 속성과 동일한 방식으로 요소에 적용되는 알파 값 마스크를 지정하는 브러시를 설정하지만, 요소의 서로 다른 영역에 대해 다른 알파 값을 허용합니다. |
| [setOriginX(float value)](#setOriginX-float-) | 실행에서 첫 번째 글리프의 x 좌표를 유효 좌표 공간 단위로 설정합니다. |
| [setOriginY(float value)](#setOriginY-float-) | 실행에서 첫 번째 글리프의 y 좌표를 유효 좌표 공간 단위로 설정합니다. |
| [setRenderTransform(XpsMatrix value)](#setRenderTransform-com.aspose.xps.XpsMatrix-) | 요소 및 모든 하위 요소(있는 경우)의 모든 속성에 대한 새로운 좌표 프레임을 설정하는 아핀 변환 행렬을 설정합니다. |
| [setSideways(boolean value)](#setSideways-boolean-) | 글리프가 옆으로 회전했음을 나타내는 값을 설정합니다(원점은 회전되지 않은 글리프의 상단 중앙으로 정의됩니다). |
| [setStyleSimulations(XpsStyleSimulations value)](#setStyleSimulations-com.aspose.xps.XpsStyleSimulations-) | 스타일 시뮬레이션을 지정하는 값을 설정합니다. |
| [setUnicodeString(String value)](#setUnicodeString-java.lang.String-) | Glyphs 요소에 의해 렌더링된 텍스트 문자열을 설정합니다. |
| [size()](#size--) | 하위 요소의 수를 반환합니다. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### deepClone() {#deepClone--}
```
public XpsGlyphs deepClone()
```


이 글리프를 복제합니다.

**Returns:**
[XpsGlyphs](../../com.aspose.xps/xpsglyphs) - Clone of this glyphs.
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
### getBidiLevel() {#getBidiLevel--}
```
public int getBidiLevel()
```


Unicode 알고리즘 양방향 중첩 수준을 지정하는 값을 반환합니다. 짝수 값은 왼쪽에서 오른쪽으로 레이아웃됨을 의미하고, 홀수 값은 오른쪽에서 왼쪽으로 레이아웃됨을 의미합니다. 오른쪽에서 왼쪽 레이아웃에서는 실행의 원점을 첫 번째 글리프의 오른쪽에 두며, 양의 전진 폭(왼쪽으로 이동을 나타냄)은 이후 글리프들을 이전 글리프의 왼쪽에 배치합니다.

**Returns:**
int - Unicode 알고리즘 양방향 중첩 수준을 지정하는 값.
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
### getFill() {#getFill--}
```
public XpsBrush getFill()
```


렌더링된 글리프의 형태를 채우는 브러시를 반환합니다.

**Returns:**
[XpsBrush](../../com.aspose.xps/xpsbrush) - The brush used to fill the shape of the rendered glyphs.
### getFont() {#getFont--}
```
public XpsFont getFont()
```


요소 텍스트를 조판하는 데 사용되는 TrueType 폰트의 폰트 리소스를 반환합니다.

**Returns:**
[XpsFont](../../com.aspose.xps/xpsfont) - The font resource for the TrueType font used to typeset elements text.
### getFontRenderingEmSize() {#getFontRenderingEmSize--}
```
public float getFontRenderingEmSize()
```


그리기 표면 단위로 표현된 폰트 크기를 부동 소수점 값으로 반환합니다(유효 좌표 공간 단위).

**Returns:**
float - 글꼴 크기.
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
### getOriginX() {#getOriginX--}
```
public float getOriginX()
```


실행에서 첫 번째 글리프의 x 좌표를 유효 좌표 공간 단위로 반환합니다.

**Returns:**
float - 실행에서 첫 번째 글리프의 x 좌표, 유효 좌표 공간 단위.
### getOriginY() {#getOriginY--}
```
public float getOriginY()
```


실행에서 첫 번째 글리프의 y 좌표를 유효 좌표 공간 단위로 반환합니다.

**Returns:**
float - 실행에서 첫 번째 글리프의 y 좌표, 유효 좌표 공간 단위.
### getRenderTransform() {#getRenderTransform--}
```
public XpsMatrix getRenderTransform()
```


요소와 모든 자식 요소(있는 경우)의 모든 속성에 대한 새로운 좌표계를 설정하는 아핀 변환 행렬을 반환합니다.

**Returns:**
[XpsMatrix](../../com.aspose.xps/xpsmatrix) - The affine transformation matrix.
### getStyleSimulations() {#getStyleSimulations--}
```
public XpsStyleSimulations getStyleSimulations()
```


스타일 시뮬레이션을 지정하는 값을 반환합니다.

**Returns:**
[XpsStyleSimulations](../../com.aspose.xps/xpsstylesimulations) - The value specifying a style simulation.
### getUnicodeString() {#getUnicodeString--}
```
public String getUnicodeString()
```


Glyphs 요소에 의해 렌더링된 텍스트 문자열을 반환합니다. 텍스트는 Unicode 코드 포인트로 지정됩니다.

**Returns:**
java.lang.String - Glyphs 요소에 의해 렌더링된 텍스트 문자열.
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### isSideways() {#isSideways--}
```
public boolean isSideways()
```


글리프가 옆으로 회전했음을 나타내는 값을 반환합니다(원점은 회전되지 않은 글리프의 상단 중앙으로 정의됩니다).

**Returns:**
boolean - 글리프가 옆으로 회전했음을 나타내는 값.
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




### setBidiLevel(int value) {#setBidiLevel-int-}
```
public void setBidiLevel(int value)
```


Unicode 알고리즘 양방향 중첩 수준을 지정하는 값을 설정합니다. 짝수 값은 왼쪽에서 오른쪽 레이아웃을 의미하고, 홀수 값은 오른쪽에서 왼쪽 레이아웃을 의미합니다. 오른쪽에서 왼쪽 레이아웃은 실행 시작점을 첫 번째 글리프의 오른쪽에 두며, 양의 전진 폭(왼쪽으로 이동을 나타냄)은 이후 글리프들을 이전 글리프의 왼쪽에 배치합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| 값 | int | Unicode 알고리즘 양방향 중첩 수준을 지정하는 값. |

### setClip(XpsPathGeometry value) {#setClip-com.aspose.xps.XpsPathGeometry-}
```
public void setClip(XpsPathGeometry value)
```


요소의 렌더링 영역을 제한하는 경로 기하학을 설정합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| value | [XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) | 요소의 렌더링 영역을 제한하는 경로 기하학. |

### setFill(XpsBrush value) {#setFill-com.aspose.xps.XpsBrush-}
```
public void setFill(XpsBrush value)
```


렌더링된 글리프의 형태를 채우는 브러시를 설정합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| value | [XpsBrush](../../com.aspose.xps/xpsbrush) | 렌더링된 글리프의 형태를 채우는 데 사용되는 브러시. |

### setFontRenderingEmSize(float value) {#setFontRenderingEmSize-float-}
```
public void setFontRenderingEmSize(float value)
```


그리기 표면 단위로 표현된 폰트 크기를 부동 소수점 값으로 설정합니다(유효 좌표 공간 단위).

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| 값 | float | 글꼴 크기. |

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

### setOriginX(float value) {#setOriginX-float-}
```
public void setOriginX(float value)
```


실행에서 첫 번째 글리프의 x 좌표를 유효 좌표 공간 단위로 설정합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| 값 | float | 실행에서 첫 번째 글리프의 x 좌표, 유효 좌표 공간 단위. |

### setOriginY(float value) {#setOriginY-float-}
```
public void setOriginY(float value)
```


실행에서 첫 번째 글리프의 y 좌표를 유효 좌표 공간 단위로 설정합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| 값 | float | 실행에서 첫 번째 글리프의 y 좌표, 유효 좌표 공간 단위. |

### setRenderTransform(XpsMatrix value) {#setRenderTransform-com.aspose.xps.XpsMatrix-}
```
public void setRenderTransform(XpsMatrix value)
```


요소 및 모든 하위 요소(있는 경우)의 모든 속성에 대한 새로운 좌표 프레임을 설정하는 아핀 변환 행렬을 설정합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| value | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | 아핀 변환 행렬. |

### setSideways(boolean value) {#setSideways-boolean-}
```
public void setSideways(boolean value)
```


글리프가 옆으로 회전했음을 나타내는 값을 설정합니다(원점은 회전되지 않은 글리프의 상단 중앙으로 정의됩니다).

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| 값 | boolean | 글리프가 옆으로 회전했음을 나타내는 값. |

### setStyleSimulations(XpsStyleSimulations value) {#setStyleSimulations-com.aspose.xps.XpsStyleSimulations-}
```
public void setStyleSimulations(XpsStyleSimulations value)
```


스타일 시뮬레이션을 지정하는 값을 설정합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| value | [XpsStyleSimulations](../../com.aspose.xps/xpsstylesimulations) | 스타일 시뮬레이션을 지정하는 값. |

### setUnicodeString(String value) {#setUnicodeString-java.lang.String-}
```
public void setUnicodeString(String value)
```


Glyphs 요소에 의해 렌더링된 텍스트 문자열을 설정합니다. 텍스트는 Unicode 코드 포인트로 지정됩니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| 값 | java.lang.String | Glyphs 요소에 의해 렌더링된 텍스트 문자열. |

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

