---
title: "DocumentUtils"
second_title: "Aspose.Page용 Java API 참조"
description: "이 클래스는 공식 XPS 조작 API를 넘어서는 유틸리티를 제공합니다."
type: docs
weight: 10
url: /ko/java/com.aspose.xps/documentutils/
---
**Inheritance:**
java.lang.Object
```
public class DocumentUtils
```

이 클래스는 공식 XPS 조작 API를 넘어서는 유틸리티를 제공합니다.
## 메서드

| 메서드 | 설명 |
| --- | --- |
| [createCircle(Point2D center, float radius)](#createCircle-java.awt.geom.Point2D-float-) | 원을 나타내는 경로 기하학을 생성합니다. |
| [createCircularSegment(Point2D center, float radius, float startAngle, float endAngle)](#createCircularSegment-java.awt.geom.Point2D-float-float-float-) | 두 각도 사이의 원호 구간을 나타내는 경로 기하학을 생성합니다. |
| [createEllipse(Point2D center, float radiusX, float radiusY)](#createEllipse-java.awt.geom.Point2D-float-float-) | 타원을 나타내는 경로 기하학을 생성합니다. |
| [createImage(String fileName, Rectangle2D imageBox)](#createImage-java.lang.String-java.awt.geom.Rectangle2D-) | 이미지로 채워진 사각형 경로를 생성합니다. |
| [createImage(String fileName, Rectangle2D imageBox, ImageMode mode)](#createImage-java.lang.String-java.awt.geom.Rectangle2D-com.aspose.xps.ImageMode-) | 이미지로 채워진 사각형 경로를 생성합니다. |
| [createPieSlice(Point2D center, float radius, float startAngle, float endAngle)](#createPieSlice-java.awt.geom.Point2D-float-float-float-) | 두 방사선 사이의 원 조각을 나타내는 경로 기하학을 생성합니다. |
| [createRectangle(Rectangle2D rectangle)](#createRectangle-java.awt.geom.Rectangle2D-) | 사각형을 나타내는 경로 기하학을 생성합니다. |
| [createRegularCircumscribedNGon(int n, Point2D center, float radius)](#createRegularCircumscribedNGon-int-java.awt.geom.Point2D-float-) | 원을 외접하는 정n각형을 나타내는 경로 기하학을 생성합니다. |
| [createRegularInscribedNGon(int n, Point2D center, float radius)](#createRegularInscribedNGon-int-java.awt.geom.Point2D-float-) | 원을 내접하는 정n각형을 나타내는 경로 기하학을 생성합니다. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### createCircle(Point2D center, float radius) {#createCircle-java.awt.geom.Point2D-float-}
```
public XpsPathGeometry createCircle(Point2D center, float radius)
```


원을 나타내는 경로 기하학을 생성합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| center | java.awt.geom.Point2D | 원의 중심점. |
| 반지름 | float | 원의 반지름. |

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - The XPS path geometry.
### createCircularSegment(Point2D center, float radius, float startAngle, float endAngle) {#createCircularSegment-java.awt.geom.Point2D-float-float-float-}
```
public XpsPathGeometry createCircularSegment(Point2D center, float radius, float startAngle, float endAngle)
```


두 각도 사이의 원호 구간을 나타내는 경로 기하학을 생성합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| center | java.awt.geom.Point2D | 원의 중심. |
| 반지름 | float | 원의 반지름. |
| startAngle | float | 시작 광선의 각도(도). |
| endAngle | float | 끝 광선의 각도(도). |

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - The XPS path geometry.
### createEllipse(Point2D center, float radiusX, float radiusY) {#createEllipse-java.awt.geom.Point2D-float-float-}
```
public XpsPathGeometry createEllipse(Point2D center, float radiusX, float radiusY)
```


타원을 나타내는 경로 기하학을 생성합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| center | java.awt.geom.Point2D | 타원의 중심점. |
| radiusX | float | 타원의 가로 반지름. |
| radiusY | float | 타원의 세로 반지름. |

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - The XPS path geometry.
### createImage(String fileName, Rectangle2D imageBox) {#createImage-java.lang.String-java.awt.geom.Rectangle2D-}
```
public XpsPath createImage(String fileName, Rectangle2D imageBox)
```


이미지로 채워진 사각형 경로를 생성합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| fileName | java.lang.String | 이미지 파일의 이름. |
| imageBox | java.awt.geom.Rectangle2D | 이미지를 채울 이미지 박스. |

**Returns:**
[XpsPath](../../com.aspose.xps/xpspath) - The XPS path.
### createImage(String fileName, Rectangle2D imageBox, ImageMode mode) {#createImage-java.lang.String-java.awt.geom.Rectangle2D-com.aspose.xps.ImageMode-}
```
public XpsPath createImage(String fileName, Rectangle2D imageBox, ImageMode mode)
```


이미지로 채워진 사각형 경로를 생성합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| fileName | java.lang.String | 이미지 파일의 이름. |
| imageBox | java.awt.geom.Rectangle2D | 이미지를 채울 이미지 박스. |
| mode | [ImageMode](../../com.aspose.xps/imagemode) | 이미지 맞춤 모드. |

**Returns:**
[XpsPath](../../com.aspose.xps/xpspath) - The XPS path.
### createPieSlice(Point2D center, float radius, float startAngle, float endAngle) {#createPieSlice-java.awt.geom.Point2D-float-float-float-}
```
public XpsPathGeometry createPieSlice(Point2D center, float radius, float startAngle, float endAngle)
```


두 방사선 사이의 원 조각을 나타내는 경로 기하학을 생성합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| center | java.awt.geom.Point2D | 원의 중심. |
| 반지름 | float | 원의 반지름. |
| startAngle | float | 시작 광선의 각도(도). |
| endAngle | float | 끝 광선의 각도(도). |

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - The XPS path geometry.
### createRectangle(Rectangle2D rectangle) {#createRectangle-java.awt.geom.Rectangle2D-}
```
public XpsPathGeometry createRectangle(Rectangle2D rectangle)
```


사각형을 나타내는 경로 기하학을 생성합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| rectangle | java.awt.geom.Rectangle2D | 사각형. |

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - The XPS path geometry.
### createRegularCircumscribedNGon(int n, Point2D center, float radius) {#createRegularCircumscribedNGon-int-java.awt.geom.Point2D-float-}
```
public XpsPathGeometry createRegularCircumscribedNGon(int n, Point2D center, float radius)
```


원을 외접하는 정n각형을 나타내는 경로 기하학을 생성합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| n | int | 정점의 수. |
| center | java.awt.geom.Point2D | 원의 중심. |
| 반지름 | float | 원의 반지름. |

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - The XPS path geometry.
### createRegularInscribedNGon(int n, Point2D center, float radius) {#createRegularInscribedNGon-int-java.awt.geom.Point2D-float-}
```
public XpsPathGeometry createRegularInscribedNGon(int n, Point2D center, float radius)
```


원을 내접하는 정n각형을 나타내는 경로 기하학을 생성합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| n | int | 정점의 수. |
| center | java.awt.geom.Point2D | 원의 중심. |
| 반지름 | float | 원의 반지름. |

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - The XPS path geometry.
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

