---
title: "PageAPI"
second_title: "Aspose.Page용 Java API 참조"
description: "Page 요소 수정 API."
type: docs
weight: 12
url: /ko/java/com.aspose.xps.features.eventbasedmodifications/pageapi/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
[com.aspose.xps.features.EventBasedModifications.IModificationAPI](../../com.aspose.xps.features.eventbasedmodifications/imodificationapi)
```
public class PageAPI implements EventBasedModifications.IModificationAPI
```

이 **Page** 요소 수정 API.
## 메서드

| 메서드 | 설명 |
| --- | --- |
| [<T>add(T element)](#-T-add-T-) | 콘텐츠 요소 (Canvas, Path, 또는 Glyphs)를 추가합니다 |
| [<T>insert(int index, T element)](#-T-insert-int-T-) | 페이지에 요소 (Canvas, Path, 또는 Glyphs)를 인덱스 위치에 삽입합니다 |
| [<T>remove(T element)](#-T-remove-T-) | 페이지에서 요소를 제거합니다 |
| [addCanvas()](#addCanvas--) | 페이지에 새 canvas를 추가합니다 |
| [addGlyphs(XpsFont font, float fontRenderingEmSize, float originX, float originY, String unicodeString)](#addGlyphs-com.aspose.xps.XpsFont-float-float-float-java.lang.String-) | 페이지에 새 glyphs를 추가합니다 |
| [addGlyphs(String fontFamily, float fontRenderingEmSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)](#addGlyphs-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-) | 페이지에 새 glyphs를 추가합니다 |
| [addOutlineEntry(String description, int outlineLevel, int targetPageNumber)](#addOutlineEntry-java.lang.String-int-int-) | 문서에 개요 항목을 추가합니다 |
| [addPath(XpsPathGeometry data)](#addPath-com.aspose.xps.XpsPathGeometry-) | 페이지에 새 path를 추가합니다 |
| [createArcSegment(Point2D point, Dimension2D size, float rotationAngle, boolean isLargeArc, XpsSweepDirection sweepDirection)](#createArcSegment-java.awt.geom.Point2D-java.awt.geom.Dimension2D-float-boolean-com.aspose.xps.XpsSweepDirection-) | 새 스트로크된 타원 호 세그먼트를 생성합니다 |
| [createArcSegment(Point2D point, Dimension2D size, float rotationAngle, boolean isLargeArc, XpsSweepDirection sweepDirection, boolean isStroked)](#createArcSegment-java.awt.geom.Point2D-java.awt.geom.Dimension2D-float-boolean-com.aspose.xps.XpsSweepDirection-boolean-) | 새 타원 호 세그먼트를 생성합니다 |
| [createCanvas()](#createCanvas--) | 새 canvas를 생성합니다 |
| [createColor(XpsIccProfile iccProfile, float[] components)](#createColor-com.aspose.xps.XpsIccProfile-float...-) | ICC 기반 색 공간에서 새 색을 생성합니다 |
| [createColor(float r, float g, float b)](#createColor-float-float-float-) | scRGB 색 공간에서 새 색을 생성합니다 |
| [createColor(float a, float r, float g, float b)](#createColor-float-float-float-float-) | scRGB 색 공간에서 새 색을 생성합니다 |
| [createColor(int r, int g, int b)](#createColor-int-int-int-) | sRGB 색 공간에서 새 색을 생성합니다 |
| [createColor(int a, int r, int g, int b)](#createColor-int-int-int-int-) | sRGB 색 공간에서 새 색을 생성합니다 |
| [createColor(Color color)](#createColor-java.awt.Color-) | 새 색을 생성합니다 |
| [createColor(String path, float[] components)](#createColor-java.lang.String-float...-) | ICC 기반 색 공간에서 새 색을 생성합니다 |
| [createGlyphs(XpsFont font, float fontRenderingEmSize, float originX, float originY, String unicodeString)](#createGlyphs-com.aspose.xps.XpsFont-float-float-float-java.lang.String-) | 새 glyphs를 생성합니다 |
| [createGlyphs(String fontFamily, float fontRenderingEmSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)](#createGlyphs-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-) | 새 glyphs를 생성합니다 |
| [createGradientStop(XpsColor color, float offset)](#createGradientStop-com.aspose.xps.XpsColor-float-) | 새 그라디언트 스톱을 생성합니다 |
| [createGradientStop(Color color, float offset)](#createGradientStop-java.awt.Color-float-) | 새 그라디언트 스톱을 생성합니다 |
| [createImageBrush(XpsImage image, Rectangle2D viewbox, Rectangle2D viewport)](#createImageBrush-com.aspose.xps.XpsImage-java.awt.geom.Rectangle2D-java.awt.geom.Rectangle2D-) | 새 이미지 브러시를 생성합니다 |
| [createImageBrush(String imagePath, Rectangle2D viewbox, Rectangle2D viewport)](#createImageBrush-java.lang.String-java.awt.geom.Rectangle2D-java.awt.geom.Rectangle2D-) | 새 이미지 브러시를 생성합니다 |
| [createLinearGradientBrush(Point2D startPoint, Point2D endPoint)](#createLinearGradientBrush-java.awt.geom.Point2D-java.awt.geom.Point2D-) | 새 선형 그라디언트 브러시를 생성합니다 |
| [createLinearGradientBrush(List<XpsGradientStop> gradientStops, Point2D startPoint, Point2D endPoint)](#createLinearGradientBrush-java.util.List-com.aspose.xps.XpsGradientStop--java.awt.geom.Point2D-java.awt.geom.Point2D-) | 새 선형 그라디언트 브러시를 생성합니다 |
| [createMatrix(float m11, float m12, float m21, float m22, float m31, float m32)](#createMatrix-float-float-float-float-float-float-) | 새 어파인 변환 행렬을 생성합니다 |
| [createPath(XpsPathGeometry data)](#createPath-com.aspose.xps.XpsPathGeometry-) | 새 path를 생성합니다 |
| [createPathFigure(Point2D startPoint)](#createPathFigure-java.awt.geom.Point2D-) | 새 열린 path 피규어를 생성합니다 |
| [createPathFigure(Point2D startPoint, boolean isClosed)](#createPathFigure-java.awt.geom.Point2D-boolean-) | 새 path 피규어를 생성합니다 |
| [createPathFigure(Point2D startPoint, List<XpsPathSegment> segments)](#createPathFigure-java.awt.geom.Point2D-java.util.List-com.aspose.xps.XpsPathSegment--) | 새 열린 path 피규어를 생성합니다 |
| [createPathFigure(Point2D startPoint, List<XpsPathSegment> segments, boolean isClosed)](#createPathFigure-java.awt.geom.Point2D-java.util.List-com.aspose.xps.XpsPathSegment--boolean-) | 새 path 피규어를 생성합니다 |
| [createPathGeometry()](#createPathGeometry--) | 새 path 기하학을 생성합니다 |
| [createPathGeometry(String abbreviatedGeometry)](#createPathGeometry-java.lang.String-) | 축약형으로 지정된 새로운 경로 기하학을 생성합니다. |
| [createPathGeometry(List<XpsPathFigure> pathFigures)](#createPathGeometry-java.util.List-com.aspose.xps.XpsPathFigure--) | 지정된 경로 도형 목록으로 새로운 경로 기하학을 생성합니다. |
| [createPolyBezierSegment(Point2D[] points)](#createPolyBezierSegment-java.awt.geom.Point2D---) | 새로운 스트로크된 3차 베지어 곡선 집합을 생성합니다. |
| [createPolyBezierSegment(Point2D[] points, boolean isStroked)](#createPolyBezierSegment-java.awt.geom.Point2D---boolean-) | 새로운 3차 베지어 곡선 집합을 생성합니다. |
| [createPolyLineSegment(Point2D[] points)](#createPolyLineSegment-java.awt.geom.Point2D---) | 임의 개수의 개별 정점을 포함하는 새로운 스트로크된 다각형 그리기를 생성합니다. |
| [createPolyLineSegment(Point2D[] points, boolean isStroked)](#createPolyLineSegment-java.awt.geom.Point2D---boolean-) | 임의 개수의 개별 정점을 포함하는 새로운 다각형 그리기를 생성합니다. |
| [createPolyQuadraticBezierSegment(Point2D[] points)](#createPolyQuadraticBezierSegment-java.awt.geom.Point2D---) | 지정된 제어점을 사용하여 경로 도형의 이전 점에서 정점 집합을 통해 스트로크된 2차 베지어 곡선 집합을 생성합니다. |
| [createPolyQuadraticBezierSegment(Point2D[] points, boolean isStroked)](#createPolyQuadraticBezierSegment-java.awt.geom.Point2D---boolean-) | 지정된 제어점을 사용하여 경로 도형의 이전 점에서 정점 집합을 통해 2차 베지어 곡선 집합을 생성합니다. |
| [createRadialGradientBrush(Point2D center, Point2D gradientOrigin, float radiusX, float radiusY)](#createRadialGradientBrush-java.awt.geom.Point2D-java.awt.geom.Point2D-float-float-) | 새로운 방사형 그라디언트 브러시를 생성합니다. |
| [createRadialGradientBrush(List<XpsGradientStop> gradientStops, Point2D center, Point2D gradientOrigin, float radiusX, float radiusY)](#createRadialGradientBrush-java.util.List-com.aspose.xps.XpsGradientStop--java.awt.geom.Point2D-java.awt.geom.Point2D-float-float-) | 새로운 방사형 그라디언트 브러시를 생성합니다. |
| [createSolidColorBrush(XpsColor color)](#createSolidColorBrush-com.aspose.xps.XpsColor-) | 새로운 단색 브러시를 생성합니다. |
| [createSolidColorBrush(Color color)](#createSolidColorBrush-java.awt.Color-) | 새로운 단색 브러시를 생성합니다. |
| [createVisualBrush(XpsContentElement element, Rectangle2D viewbox, Rectangle2D viewport)](#createVisualBrush-com.aspose.xps.XpsContentElement-java.awt.geom.Rectangle2D-java.awt.geom.Rectangle2D-) | 새로운 비주얼 브러시를 생성합니다. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getHeight()](#getHeight--) | 페이지의 높이를 반환합니다. 높이는 유효 좌표 공간 단위의 실수값으로 표현됩니다. |
| [getPageCount()](#getPageCount--) | 활성 문서의 페이지 수를 반환합니다. |
| [getTotalPageCount()](#getTotalPageCount--) | XPS 문서 내부 모든 문서의 전체 페이지 수를 반환합니다. |
| [getUtils()](#getUtils--) | 공식 XPS 조작 API를 넘어서는 유틸리티를 제공하는 객체를 가져옵니다. |
| [getWidth()](#getWidth--) | 페이지의 너비를 반환합니다. 너비는 유효 좌표 공간 단위의 실수값으로 표현됩니다. |
| [hashCode()](#hashCode--) |  |
| [insertCanvas(int index)](#insertCanvas-int-) | 페이지의  index  위치에 새로운 캔버스를 삽입합니다. |
| [insertGlyphs(int index, XpsFont font, float fontSize, float originX, float originY, String unicodeString)](#insertGlyphs-int-com.aspose.xps.XpsFont-float-float-float-java.lang.String-) | 페이지의  index  위치에 새로운 글리프를 삽입합니다. |
| [insertGlyphs(int index, String fontFamily, float fontSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)](#insertGlyphs-int-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-) | 페이지의  index  위치에 새로운 글리프를 삽입합니다. |
| [insertPath(int index, XpsPathGeometry data)](#insertPath-int-com.aspose.xps.XpsPathGeometry-) | 페이지의  index  위치에 새로운 경로를 삽입합니다. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [removeAt(int index)](#removeAt-int-) | 페이지에서  index  위치에 있는 요소를 제거합니다. |
| [setHeight(float value)](#setHeight-float-) | 페이지의 높이를 설정합니다. 높이는 유효 좌표 공간 단위의 실수값으로 표현됩니다. |
| [setWidth(float value)](#setWidth-float-) | 페이지의 너비를 설정합니다. 너비는 유효 좌표 공간 단위의 실수값으로 표현됩니다. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### <T>add(T element) {#-T-add-T-}
```
public T <T>add(T element)
```


콘텐츠 요소 (Canvas, Path, 또는 Glyphs)를 추가합니다

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


페이지에 요소 (Canvas, Path, 또는 Glyphs)를 인덱스 위치에 삽입합니다

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| 인덱스 | int | 요소를 삽입해야 하는 위치. |
| 요소 | T | 삽입할 요소. |

**Returns:**
T - 삽입된 요소.
### <T>remove(T element) {#-T-remove-T-}
```
public T <T>remove(T element)
```


페이지에서 요소를 제거합니다

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| 요소 | T | 제거할 요소. |

**Returns:**
T - 제거된 요소.
### addCanvas() {#addCanvas--}
```
public XpsCanvas addCanvas()
```


페이지에 새 canvas를 추가합니다

**Returns:**
[XpsCanvas](../../com.aspose.xps/xpscanvas) - Added canvas.
### addGlyphs(XpsFont font, float fontRenderingEmSize, float originX, float originY, String unicodeString) {#addGlyphs-com.aspose.xps.XpsFont-float-float-float-java.lang.String-}
```
public XpsGlyphs addGlyphs(XpsFont font, float fontRenderingEmSize, float originX, float originY, String unicodeString)
```


페이지에 새 glyphs를 추가합니다

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| font | [XpsFont](../../com.aspose.xps/xpsfont) | 폰트 리소스. |
| fontRenderingEmSize | float | 폰트 크기. |
| originX | float | 글리프 원점 X 좌표. |
| originY | float | 글리프 원점 Y 좌표. |
| unicodeString | java.lang.String | 출력할 문자열. |

**Returns:**
[XpsGlyphs](../../com.aspose.xps/xpsglyphs) - Added glyphs.
### addGlyphs(String fontFamily, float fontRenderingEmSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString) {#addGlyphs-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-}
```
public XpsGlyphs addGlyphs(String fontFamily, float fontRenderingEmSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)
```


페이지에 새 glyphs를 추가합니다

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| fontFamily | java.lang.String | 폰트 패밀리. |
| fontRenderingEmSize | float | 폰트 크기. |
| fontStyle | [XpsFontStyle](../../com.aspose.xps/xpsfontstyle) | 글꼴 스타일. |
| originX | float | 글리프 원점 X 좌표. |
| originY | float | 글리프 원점 Y 좌표. |
| unicodeString | java.lang.String | 출력할 문자열. |

**Returns:**
[XpsGlyphs](../../com.aspose.xps/xpsglyphs) - Added glyphs.
### addOutlineEntry(String description, int outlineLevel, int targetPageNumber) {#addOutlineEntry-java.lang.String-int-int-}
```
public void addOutlineEntry(String description, int outlineLevel, int targetPageNumber)
```


문서에 개요 항목을 추가합니다

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| 설명 | java.lang.String | 항목 설명. |
| outlineLevel | int | 개요 수준. |
| targetPageNumber | int | 대상 페이지 번호. |

### addPath(XpsPathGeometry data) {#addPath-com.aspose.xps.XpsPathGeometry-}
```
public XpsPath addPath(XpsPathGeometry data)
```


페이지에 새 path를 추가합니다

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| data | [XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) | 경로의 기하학. |

**Returns:**
[XpsPath](../../com.aspose.xps/xpspath) - Added path.
### createArcSegment(Point2D point, Dimension2D size, float rotationAngle, boolean isLargeArc, XpsSweepDirection sweepDirection) {#createArcSegment-java.awt.geom.Point2D-java.awt.geom.Dimension2D-float-boolean-com.aspose.xps.XpsSweepDirection-}
```
public XpsArcSegment createArcSegment(Point2D point, Dimension2D size, float rotationAngle, boolean isLargeArc, XpsSweepDirection sweepDirection)
```


새 스트로크된 타원 호 세그먼트를 생성합니다

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| 포인트 | java.awt.geom.Point2D | 타원 호의 끝점. |
| 크기 | java.awt.geom.Dimension2D | 타원 호의 x와 y 반지름을 x,y 쌍으로 나타냅니다. |
| rotationAngle | float | 현재 좌표계에 대해 타원이 어떻게 회전되는지를 나타냅니다. |
| isLargeArc | boolean | 호가 180도 이상을 휘어 그려지는지 여부를 결정합니다. |
| sweepDirection | [XpsSweepDirection](../../com.aspose.xps/xpssweepdirection) | 호가 그려지는 방향입니다. |

**Returns:**
[XpsArcSegment](../../com.aspose.xps/xpsarcsegment) - New elliptical arc segment.
### createArcSegment(Point2D point, Dimension2D size, float rotationAngle, boolean isLargeArc, XpsSweepDirection sweepDirection, boolean isStroked) {#createArcSegment-java.awt.geom.Point2D-java.awt.geom.Dimension2D-float-boolean-com.aspose.xps.XpsSweepDirection-boolean-}
```
public XpsArcSegment createArcSegment(Point2D point, Dimension2D size, float rotationAngle, boolean isLargeArc, XpsSweepDirection sweepDirection, boolean isStroked)
```


새 타원 호 세그먼트를 생성합니다

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| 포인트 | java.awt.geom.Point2D | 타원 호의 끝점. |
| 크기 | java.awt.geom.Dimension2D | 타원 호의 x와 y 반지름을 x,y 쌍으로 나타냅니다. |
| rotationAngle | float | 현재 좌표계에 대해 타원이 어떻게 회전되는지를 나타냅니다. |
| isLargeArc | boolean | 호가 180도 이상을 휘어 그려지는지 여부를 결정합니다. |
| sweepDirection | [XpsSweepDirection](../../com.aspose.xps/xpssweepdirection) | 호가 그려지는 방향입니다. |
| isStroked | boolean | 경로의 이 구간에 대한 스트로크가 그려지는지 여부를 지정합니다. |

**Returns:**
[XpsArcSegment](../../com.aspose.xps/xpsarcsegment) - New elliptical arc segment.
### createCanvas() {#createCanvas--}
```
public XpsCanvas createCanvas()
```


새 canvas를 생성합니다

**Returns:**
[XpsCanvas](../../com.aspose.xps/xpscanvas) - New canvas.
### createColor(XpsIccProfile iccProfile, float[] components) {#createColor-com.aspose.xps.XpsIccProfile-float...-}
```
public XpsColor createColor(XpsIccProfile iccProfile, float[] components)
```


ICC 기반 색 공간에서 새 색을 생성합니다

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| iccProfile | [XpsIccProfile](../../com.aspose.xps/xpsiccprofile) | ICC 프로파일 리소스입니다. |
| components | float[] | 색상 구성 요소입니다. |

**Returns:**
[XpsColor](../../com.aspose.xps/xpscolor) - New color.
### createColor(float r, float g, float b) {#createColor-float-float-float-}
```
public XpsColor createColor(float r, float g, float b)
```


scRGB 색 공간에서 새 색을 생성합니다

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| r | float | 빨간색 구성 요소입니다. |
| g | float | 녹색 구성 요소입니다. |
| b | float | 파란색 구성 요소입니다. |

**Returns:**
[XpsColor](../../com.aspose.xps/xpscolor) - New color.
### createColor(float a, float r, float g, float b) {#createColor-float-float-float-float-}
```
public XpsColor createColor(float a, float r, float g, float b)
```


scRGB 색 공간에서 새 색을 생성합니다

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| a | float | 알파 색상 구성 요소입니다. |
| r | float | 빨간색 구성 요소입니다. |
| g | float | 녹색 구성 요소입니다. |
| b | float | 파란색 구성 요소입니다. |

**Returns:**
[XpsColor](../../com.aspose.xps/xpscolor) - New color.
### createColor(int r, int g, int b) {#createColor-int-int-int-}
```
public XpsColor createColor(int r, int g, int b)
```


sRGB 색 공간에서 새 색을 생성합니다

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| r | int | 빨간색 구성 요소입니다. |
| g | int | 녹색 구성 요소입니다. |
| b | int | 파란색 구성 요소입니다. |

**Returns:**
[XpsColor](../../com.aspose.xps/xpscolor) - New color.
### createColor(int a, int r, int g, int b) {#createColor-int-int-int-int-}
```
public XpsColor createColor(int a, int r, int g, int b)
```


sRGB 색 공간에서 새 색을 생성합니다

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| a | int | 알파 색상 구성 요소입니다. |
| r | int | 빨간색 구성 요소입니다. |
| g | int | 녹색 구성 요소입니다. |
| b | int | 파란색 구성 요소입니다. |

**Returns:**
[XpsColor](../../com.aspose.xps/xpscolor) - New color.
### createColor(Color color) {#createColor-java.awt.Color-}
```
public XpsColor createColor(Color color)
```


새 색을 생성합니다

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| color | java.awt.Color | RGB 색상에 대한 네이티브 색상 인스턴스입니다. |

**Returns:**
[XpsColor](../../com.aspose.xps/xpscolor) - New color.
### createColor(String path, float[] components) {#createColor-java.lang.String-float...-}
```
public XpsColor createColor(String path, float[] components)
```


ICC 기반 색 공간에서 새 색을 생성합니다

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| path | java.lang.String | ICC 프로파일 경로입니다. |
| components | float[] | 색상 구성 요소입니다. |

**Returns:**
[XpsColor](../../com.aspose.xps/xpscolor) - New color.
### createGlyphs(XpsFont font, float fontRenderingEmSize, float originX, float originY, String unicodeString) {#createGlyphs-com.aspose.xps.XpsFont-float-float-float-java.lang.String-}
```
public XpsGlyphs createGlyphs(XpsFont font, float fontRenderingEmSize, float originX, float originY, String unicodeString)
```


새 glyphs를 생성합니다

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| font | [XpsFont](../../com.aspose.xps/xpsfont) | 폰트 리소스. |
| fontRenderingEmSize | float | 폰트 크기. |
| originX | float | 글리프 원점 X 좌표. |
| originY | float | 글리프 원점 Y 좌표. |
| unicodeString | java.lang.String | 출력할 문자열. |

**Returns:**
[XpsGlyphs](../../com.aspose.xps/xpsglyphs) - New glyphs.
### createGlyphs(String fontFamily, float fontRenderingEmSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString) {#createGlyphs-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-}
```
public XpsGlyphs createGlyphs(String fontFamily, float fontRenderingEmSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)
```


새 glyphs를 생성합니다

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| fontFamily | java.lang.String | 폰트 패밀리. |
| fontRenderingEmSize | float | 폰트 크기. |
| fontStyle | [XpsFontStyle](../../com.aspose.xps/xpsfontstyle) | 글꼴 스타일. |
| originX | float | 글리프 원점 X 좌표. |
| originY | float | 글리프 원점 Y 좌표. |
| unicodeString | java.lang.String | 출력할 문자열. |

**Returns:**
[XpsGlyphs](../../com.aspose.xps/xpsglyphs) - New glyphs.
### createGradientStop(XpsColor color, float offset) {#createGradientStop-com.aspose.xps.XpsColor-float-}
```
public XpsGradientStop createGradientStop(XpsColor color, float offset)
```


새 그라디언트 스톱을 생성합니다

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| color | [XpsColor](../../com.aspose.xps/xpscolor) | 그라디언트 정지 색상입니다. |
| 오프셋 | float | 그라디언트 오프셋. |

**Returns:**
[XpsGradientStop](../../com.aspose.xps/xpsgradientstop) - New gradient stop.
### createGradientStop(Color color, float offset) {#createGradientStop-java.awt.Color-float-}
```
public XpsGradientStop createGradientStop(Color color, float offset)
```


새 그라디언트 스톱을 생성합니다

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| color | java.awt.Color | 그라디언트 정지 색상입니다. |
| 오프셋 | float | 그라디언트 오프셋. |

**Returns:**
[XpsGradientStop](../../com.aspose.xps/xpsgradientstop) - New gradient stop.
### createImageBrush(XpsImage image, Rectangle2D viewbox, Rectangle2D viewport) {#createImageBrush-com.aspose.xps.XpsImage-java.awt.geom.Rectangle2D-java.awt.geom.Rectangle2D-}
```
public XpsImageBrush createImageBrush(XpsImage image, Rectangle2D viewbox, Rectangle2D viewport)
```


새 이미지 브러시를 생성합니다

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| image | [XpsImage](../../com.aspose.xps/xpsimage) | 이미지 리소스입니다. |
| 뷰박스 | java.awt.geom.Rectangle2D | 브러시 소스 콘텐츠의 위치와 차원입니다. |
| 뷰포트 | java.awt.geom.Rectangle2D | 프라임 브러시 타일이 포함된 좌표 공간에서 (반복적으로) 적용되어 브러시가 적용되는 영역을 채우는 영역. |

**Returns:**
[XpsImageBrush](../../com.aspose.xps/xpsimagebrush) - New image brush.
### createImageBrush(String imagePath, Rectangle2D viewbox, Rectangle2D viewport) {#createImageBrush-java.lang.String-java.awt.geom.Rectangle2D-java.awt.geom.Rectangle2D-}
```
public XpsImageBrush createImageBrush(String imagePath, Rectangle2D viewbox, Rectangle2D viewport)
```


새 이미지 브러시를 생성합니다

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| imagePath | java.lang.String | 브러시 타일로 사용할 이미지의 경로입니다. |
| 뷰박스 | java.awt.geom.Rectangle2D | 브러시 소스 콘텐츠의 위치와 차원입니다. |
| 뷰포트 | java.awt.geom.Rectangle2D | 프라임 브러시 타일이 포함된 좌표 공간에서 (반복적으로) 적용되어 브러시가 적용되는 영역을 채우는 영역. |

**Returns:**
[XpsImageBrush](../../com.aspose.xps/xpsimagebrush) - New image brush.
### createLinearGradientBrush(Point2D startPoint, Point2D endPoint) {#createLinearGradientBrush-java.awt.geom.Point2D-java.awt.geom.Point2D-}
```
public XpsLinearGradientBrush createLinearGradientBrush(Point2D startPoint, Point2D endPoint)
```


새 선형 그라디언트 브러시를 생성합니다

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| startPoint | java.awt.geom.Point2D | 선형 그라디언트의 시작점입니다. |
| endPoint | java.awt.geom.Point2D | 선형 그라디언트의 끝점입니다. |

**Returns:**
[XpsLinearGradientBrush](../../com.aspose.xps/xpslineargradientbrush) - New linear gradient brush.
### createLinearGradientBrush(List<XpsGradientStop> gradientStops, Point2D startPoint, Point2D endPoint) {#createLinearGradientBrush-java.util.List-com.aspose.xps.XpsGradientStop--java.awt.geom.Point2D-java.awt.geom.Point2D-}
```
public XpsLinearGradientBrush createLinearGradientBrush(List<XpsGradientStop> gradientStops, Point2D startPoint, Point2D endPoint)
```


새 선형 그라디언트 브러시를 생성합니다

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| gradientStops | java.util.List<com.aspose.xps.XpsGradientStop> | 그라디언트 스톱 목록입니다. |
| startPoint | java.awt.geom.Point2D | 선형 그라디언트의 시작점입니다. |
| endPoint | java.awt.geom.Point2D | 선형 그라디언트의 끝점입니다. |

**Returns:**
[XpsLinearGradientBrush](../../com.aspose.xps/xpslineargradientbrush) - New linear gradient brush.
### createMatrix(float m11, float m12, float m21, float m22, float m31, float m32) {#createMatrix-float-float-float-float-float-float-}
```
public XpsMatrix createMatrix(float m11, float m12, float m21, float m22, float m31, float m32)
```


새 어파인 변환 행렬을 생성합니다

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| m11 | float | 요소 11. |
| m12 | float | 요소 12. |
| m21 | float | 요소 21. |
| m22 | float | 요소 22. |
| m31 | float | 요소 31. |
| m32 | float | 요소 32. |

**Returns:**
[XpsMatrix](../../com.aspose.xps/xpsmatrix) - New affine transformation matrix.
### createPath(XpsPathGeometry data) {#createPath-com.aspose.xps.XpsPathGeometry-}
```
public XpsPath createPath(XpsPathGeometry data)
```


새 path를 생성합니다

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| data | [XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) | 경로의 기하학. |

**Returns:**
[XpsPath](../../com.aspose.xps/xpspath) - New path.
### createPathFigure(Point2D startPoint) {#createPathFigure-java.awt.geom.Point2D-}
```
public XpsPathFigure createPathFigure(Point2D startPoint)
```


새 열린 path 피규어를 생성합니다

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| startPoint | java.awt.geom.Point2D | 경로 도형의 첫 번째 세그먼트 시작점. |

**Returns:**
[XpsPathFigure](../../com.aspose.xps/xpspathfigure) - New path figure.
### createPathFigure(Point2D startPoint, boolean isClosed) {#createPathFigure-java.awt.geom.Point2D-boolean-}
```
public XpsPathFigure createPathFigure(Point2D startPoint, boolean isClosed)
```


새 path 피규어를 생성합니다

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| startPoint | java.awt.geom.Point2D | 경로 도형의 첫 번째 세그먼트 시작점. |
| isClosed | boolean | 경로가 닫혀 있는지 여부를 지정합니다. true로 설정하면 스트로크가 "closed"로 그려지며, 즉 경로 도형의 마지막 세그먼트의 마지막 점이 StartPoint 속성에 지정된 점과 연결됩니다. 그렇지 않으면 스트로크가 "open"으로 그려지고 마지막 점이 시작점과 연결되지 않습니다. 이 속성은 스트로크를 지정하는 Path 요소에서 경로 도형이 사용될 때만 적용됩니다. |

**Returns:**
[XpsPathFigure](../../com.aspose.xps/xpspathfigure) - New path figure.
### createPathFigure(Point2D startPoint, List<XpsPathSegment> segments) {#createPathFigure-java.awt.geom.Point2D-java.util.List-com.aspose.xps.XpsPathSegment--}
```
public XpsPathFigure createPathFigure(Point2D startPoint, List<XpsPathSegment> segments)
```


새 열린 path 피규어를 생성합니다

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| startPoint | java.awt.geom.Point2D | 경로 도형의 첫 번째 세그먼트 시작점. |
| segments | java.util.List<com.aspose.xps.XpsPathSegment> | 경로 세그먼트 목록. |

**Returns:**
[XpsPathFigure](../../com.aspose.xps/xpspathfigure) - New path figure.
### createPathFigure(Point2D startPoint, List<XpsPathSegment> segments, boolean isClosed) {#createPathFigure-java.awt.geom.Point2D-java.util.List-com.aspose.xps.XpsPathSegment--boolean-}
```
public XpsPathFigure createPathFigure(Point2D startPoint, List<XpsPathSegment> segments, boolean isClosed)
```


새 path 피규어를 생성합니다

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| startPoint | java.awt.geom.Point2D | 경로 도형의 첫 번째 세그먼트 시작점. |
| segments | java.util.List<com.aspose.xps.XpsPathSegment> | 경로 세그먼트 목록. |
| isClosed | boolean | 경로가 닫혀 있는지 여부를 지정합니다. true로 설정하면 스트로크가 "closed"로 그려지며, 즉 경로 도형의 마지막 세그먼트의 마지막 점이 StartPoint 속성에 지정된 점과 연결됩니다. 그렇지 않으면 스트로크가 "open"으로 그려지고 마지막 점이 시작점과 연결되지 않습니다. 이 속성은 스트로크를 지정하는 Path 요소에서 경로 도형이 사용될 때만 적용됩니다. |

**Returns:**
[XpsPathFigure](../../com.aspose.xps/xpspathfigure) - New path figure.
### createPathGeometry() {#createPathGeometry--}
```
public XpsPathGeometry createPathGeometry()
```


새 path 기하학을 생성합니다

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - New path geometry.
### createPathGeometry(String abbreviatedGeometry) {#createPathGeometry-java.lang.String-}
```
public XpsPathGeometry createPathGeometry(String abbreviatedGeometry)
```


축약형으로 지정된 새로운 경로 기하학을 생성합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| abbreviatedGeometry | java.lang.String | 경로 기하학의 축약형. |

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - New path geometry.
### createPathGeometry(List<XpsPathFigure> pathFigures) {#createPathGeometry-java.util.List-com.aspose.xps.XpsPathFigure--}
```
public XpsPathGeometry createPathGeometry(List<XpsPathFigure> pathFigures)
```


지정된 경로 도형 목록으로 새로운 경로 기하학을 생성합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| pathFigures | java.util.List<com.aspose.xps.XpsPathFigure> | 경로 도형 목록. |

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - New path geometry.
### createPolyBezierSegment(Point2D[] points) {#createPolyBezierSegment-java.awt.geom.Point2D---}
```
public XpsPolyBezierSegment createPolyBezierSegment(Point2D[] points)
```


새로운 스트로크된 3차 베지어 곡선 집합을 생성합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| points | java.awt.geom.Point2D[] | 다중 B?베지어 세그먼트에 대한 제어점. |

**Returns:**
[XpsPolyBezierSegment](../../com.aspose.xps/xpspolybeziersegment) - New cubic B?zier curves segment.
### createPolyBezierSegment(Point2D[] points, boolean isStroked) {#createPolyBezierSegment-java.awt.geom.Point2D---boolean-}
```
public XpsPolyBezierSegment createPolyBezierSegment(Point2D[] points, boolean isStroked)
```


새로운 3차 베지어 곡선 집합을 생성합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| points | java.awt.geom.Point2D[] | 다중 B?베지어 세그먼트에 대한 제어점. |
| isStroked | boolean | 경로의 이 구간에 대한 스트로크가 그려지는지 여부를 지정합니다. |

**Returns:**
[XpsPolyBezierSegment](../../com.aspose.xps/xpspolybeziersegment) - New cubic B?zier curves segment.
### createPolyLineSegment(Point2D[] points) {#createPolyLineSegment-java.awt.geom.Point2D---}
```
public XpsPolyLineSegment createPolyLineSegment(Point2D[] points)
```


임의 개수의 개별 정점을 포함하는 새로운 스트로크된 다각형 그리기를 생성합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| points | java.awt.geom.Point2D[] | 폴리라인 세그먼트를 정의하는 다중 세그먼트에 대한 좌표 집합. |

**Returns:**
[XpsPolyLineSegment](../../com.aspose.xps/xpspolylinesegment) - New polygonal drawing segment.
### createPolyLineSegment(Point2D[] points, boolean isStroked) {#createPolyLineSegment-java.awt.geom.Point2D---boolean-}
```
public XpsPolyLineSegment createPolyLineSegment(Point2D[] points, boolean isStroked)
```


임의 개수의 개별 정점을 포함하는 새로운 다각형 그리기를 생성합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| points | java.awt.geom.Point2D[] | 폴리라인 세그먼트를 정의하는 다중 세그먼트에 대한 좌표 집합. |
| isStroked | boolean | 경로의 이 구간에 대한 스트로크가 그려지는지 여부를 지정합니다. |

**Returns:**
[XpsPolyLineSegment](../../com.aspose.xps/xpspolylinesegment) - New polygonal drawing segment.
### createPolyQuadraticBezierSegment(Point2D[] points) {#createPolyQuadraticBezierSegment-java.awt.geom.Point2D---}
```
public XpsPolyQuadraticBezierSegment createPolyQuadraticBezierSegment(Point2D[] points)
```


지정된 제어점을 사용하여 경로 도형의 이전 점에서 정점 집합을 통해 스트로크된 2차 베지어 곡선 집합을 생성합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| points | java.awt.geom.Point2D[] | 다중 2차 B?베지어 세그먼트에 대한 제어점. |

**Returns:**
[XpsPolyQuadraticBezierSegment](../../com.aspose.xps/xpspolyquadraticbeziersegment) - New quadratic B?zier curves segment.
### createPolyQuadraticBezierSegment(Point2D[] points, boolean isStroked) {#createPolyQuadraticBezierSegment-java.awt.geom.Point2D---boolean-}
```
public XpsPolyQuadraticBezierSegment createPolyQuadraticBezierSegment(Point2D[] points, boolean isStroked)
```


지정된 제어점을 사용하여 경로 도형의 이전 점에서 정점 집합을 통해 2차 베지어 곡선 집합을 생성합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| points | java.awt.geom.Point2D[] | 다중 2차 B?베지어 세그먼트에 대한 제어점. |
| isStroked | boolean | 경로의 이 구간에 대한 스트로크가 그려지는지 여부를 지정합니다. |

**Returns:**
[XpsPolyQuadraticBezierSegment](../../com.aspose.xps/xpspolyquadraticbeziersegment) - New quadratic B?zier curves segment.
### createRadialGradientBrush(Point2D center, Point2D gradientOrigin, float radiusX, float radiusY) {#createRadialGradientBrush-java.awt.geom.Point2D-java.awt.geom.Point2D-float-float-}
```
public XpsRadialGradientBrush createRadialGradientBrush(Point2D center, Point2D gradientOrigin, float radiusX, float radiusY)
```


새로운 방사형 그라디언트 브러시를 생성합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| center | java.awt.geom.Point2D | 방사형 그라디언트의 중심점(즉, 타원의 중심). |
| gradientOrigin | java.awt.geom.Point2D | 방사형 그라디언트의 원점. |
| radiusX | float | 방사형 그라디언트를 정의하는 타원의 x 차원 반경. |
| radiusY | float | 방사형 그라디언트를 정의하는 타원의 y 차원 반경. |

**Returns:**
[XpsRadialGradientBrush](../../com.aspose.xps/xpsradialgradientbrush) - New radial gradient brush.
### createRadialGradientBrush(List<XpsGradientStop> gradientStops, Point2D center, Point2D gradientOrigin, float radiusX, float radiusY) {#createRadialGradientBrush-java.util.List-com.aspose.xps.XpsGradientStop--java.awt.geom.Point2D-java.awt.geom.Point2D-float-float-}
```
public XpsRadialGradientBrush createRadialGradientBrush(List<XpsGradientStop> gradientStops, Point2D center, Point2D gradientOrigin, float radiusX, float radiusY)
```


새로운 방사형 그라디언트 브러시를 생성합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| gradientStops | java.util.List<com.aspose.xps.XpsGradientStop> | 그라디언트 스톱 목록입니다. |
| center | java.awt.geom.Point2D | 방사형 그라디언트의 중심점(즉, 타원의 중심). |
| gradientOrigin | java.awt.geom.Point2D | 방사형 그라디언트의 원점. |
| radiusX | float | 방사형 그라디언트를 정의하는 타원의 x 차원 반경. |
| radiusY | float | 방사형 그라디언트를 정의하는 타원의 y 차원 반경. |

**Returns:**
[XpsRadialGradientBrush](../../com.aspose.xps/xpsradialgradientbrush) - New radial gradient brush.
### createSolidColorBrush(XpsColor color) {#createSolidColorBrush-com.aspose.xps.XpsColor-}
```
public XpsSolidColorBrush createSolidColorBrush(XpsColor color)
```


새로운 단색 브러시를 생성합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| color | [XpsColor](../../com.aspose.xps/xpscolor) | 채워진 요소의 색상. |

**Returns:**
[XpsSolidColorBrush](../../com.aspose.xps/xpssolidcolorbrush) - New solid color brush.
### createSolidColorBrush(Color color) {#createSolidColorBrush-java.awt.Color-}
```
public XpsSolidColorBrush createSolidColorBrush(Color color)
```


새로운 단색 브러시를 생성합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| color | java.awt.Color | 채워진 요소의 색상. |

**Returns:**
[XpsSolidColorBrush](../../com.aspose.xps/xpssolidcolorbrush) - New solid color brush.
### createVisualBrush(XpsContentElement element, Rectangle2D viewbox, Rectangle2D viewport) {#createVisualBrush-com.aspose.xps.XpsContentElement-java.awt.geom.Rectangle2D-java.awt.geom.Rectangle2D-}
```
public XpsVisualBrush createVisualBrush(XpsContentElement element, Rectangle2D viewbox, Rectangle2D viewport)
```


새로운 비주얼 브러시를 생성합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| element | [XpsContentElement](../../com.aspose.xps/xpscontentelement) | 시각적 브러시의 Visual 속성을 위한 XPS 요소 (Canvas, Path, 또는 Glyphs). |
| 뷰박스 | java.awt.geom.Rectangle2D | 브러시 소스 콘텐츠의 위치와 차원입니다. |
| 뷰포트 | java.awt.geom.Rectangle2D | 프라임 브러시 타일이 포함된 좌표 공간에서 (반복적으로) 적용되어 브러시가 적용되는 영역을 채우는 영역. |

**Returns:**
[XpsVisualBrush](../../com.aspose.xps/xpsvisualbrush) - New visual brush.
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
### getHeight() {#getHeight--}
```
public float getHeight()
```


페이지의 높이를 반환합니다. 높이는 유효 좌표 공간 단위의 실수값으로 표현됩니다.

**Returns:**
float - 페이지의 높이.
### getPageCount() {#getPageCount--}
```
public int getPageCount()
```


활성 문서의 페이지 수를 반환합니다.

**Returns:**
int - 활성 문서의 페이지 수.
### getTotalPageCount() {#getTotalPageCount--}
```
public int getTotalPageCount()
```


XPS 문서 내부 모든 문서의 전체 페이지 수를 반환합니다.

**Returns:**
int - XPS 문서 내 모든 문서의 총 페이지 수.
### getUtils() {#getUtils--}
```
public DocumentUtils getUtils()
```


공식 XPS 조작 API를 넘어서는 유틸리티를 제공하는 객체를 가져옵니다.

**Returns:**
[DocumentUtils](../../com.aspose.xps/documentutils) - The object that provides utilities beyond the formal XPS manipulation API.
### getWidth() {#getWidth--}
```
public float getWidth()
```


페이지의 너비를 반환합니다. 너비는 유효 좌표 공간 단위의 실수값으로 표현됩니다.

**Returns:**
float - 페이지의 너비.
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


페이지의  index  위치에 새로운 캔버스를 삽입합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| 인덱스 | int | 새 캔버스를 삽입해야 하는 위치. |

**Returns:**
[XpsCanvas](../../com.aspose.xps/xpscanvas) - Inserted canvas.
### insertGlyphs(int index, XpsFont font, float fontSize, float originX, float originY, String unicodeString) {#insertGlyphs-int-com.aspose.xps.XpsFont-float-float-float-java.lang.String-}
```
public XpsGlyphs insertGlyphs(int index, XpsFont font, float fontSize, float originX, float originY, String unicodeString)
```


페이지의  index  위치에 새로운 글리프를 삽입합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| 인덱스 | int | 새 글리프를 삽입해야 하는 위치. |
| font | [XpsFont](../../com.aspose.xps/xpsfont) | 폰트 리소스. |
| fontSize | float | 폰트 크기. |
| originX | float | 글리프 원점 X 좌표. |
| originY | float | 글리프 원점 Y 좌표. |
| unicodeString | java.lang.String | 출력할 문자열. |

**Returns:**
[XpsGlyphs](../../com.aspose.xps/xpsglyphs) - Inserted glyphs.
### insertGlyphs(int index, String fontFamily, float fontSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString) {#insertGlyphs-int-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-}
```
public XpsGlyphs insertGlyphs(int index, String fontFamily, float fontSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)
```


페이지의  index  위치에 새로운 글리프를 삽입합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| 인덱스 | int | 새 글리프를 삽입해야 하는 위치. |
| fontFamily | java.lang.String | 폰트 패밀리. |
| fontSize | float | 폰트 크기. |
| fontStyle | [XpsFontStyle](../../com.aspose.xps/xpsfontstyle) | 글꼴 스타일. |
| originX | float | 글리프 원점 X 좌표. |
| originY | float | 글리프 원점 Y 좌표. |
| unicodeString | java.lang.String | 출력할 문자열. |

**Returns:**
[XpsGlyphs](../../com.aspose.xps/xpsglyphs) - Inserted glyphs.
### insertPath(int index, XpsPathGeometry data) {#insertPath-int-com.aspose.xps.XpsPathGeometry-}
```
public XpsPath insertPath(int index, XpsPathGeometry data)
```


페이지의  index  위치에 새로운 경로를 삽입합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| 인덱스 | int | 새 경로를 삽입해야 하는 위치. |
| data | [XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) | 경로의 기하학. |

**Returns:**
[XpsPath](../../com.aspose.xps/xpspath) - Inserted path.
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### removeAt(int index) {#removeAt-int-}
```
public XpsContentElement removeAt(int index)
```


페이지에서  index  위치에 있는 요소를 제거합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| 인덱스 | int | 요소를 제거해야 하는 위치. |

**Returns:**
[XpsContentElement](../../com.aspose.xps/xpscontentelement) - Removed element.
### setHeight(float value) {#setHeight-float-}
```
public void setHeight(float value)
```


페이지의 높이를 설정합니다. 높이는 유효 좌표 공간 단위의 실수값으로 표현됩니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| 값 | float | 페이지의 높이. |

### setWidth(float value) {#setWidth-float-}
```
public void setWidth(float value)
```


페이지의 너비를 설정합니다. 너비는 유효 좌표 공간 단위의 실수값으로 표현됩니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| 값 | float | 페이지의 너비. |

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

