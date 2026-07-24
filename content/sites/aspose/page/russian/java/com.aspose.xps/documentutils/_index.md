---
title: "DocumentUtils"
second_title: "Справочник API Aspose.Page для Java"
description: "Этот класс предоставляет утилиты, выходящие за рамки официального API манипуляции XPS."
type: docs
weight: 10
url: /ru/java/com.aspose.xps/documentutils/
---
**Inheritance:**
java.lang.Object
```
public class DocumentUtils
```

Этот класс предоставляет утилиты, выходящие за рамки официального API манипуляции XPS.
## Методы

| Метод | Описание |
| --- | --- |
| [createCircle(Point2D center, float radius)](#createCircle-java.awt.geom.Point2D-float-) | Создаёт геометрию пути, представляющую круг. |
| [createCircularSegment(Point2D center, float radius, float startAngle, float endAngle)](#createCircularSegment-java.awt.geom.Point2D-float-float-float-) | Создаёт геометрию пути, представляющую сегмент круга между двумя углами. |
| [createEllipse(Point2D center, float radiusX, float radiusY)](#createEllipse-java.awt.geom.Point2D-float-float-) | Создаёт геометрию пути, представляющую эллипс. |
| [createImage(String fileName, Rectangle2D imageBox)](#createImage-java.lang.String-java.awt.geom.Rectangle2D-) | Создаёт прямоугольный путь, заполненный изображением. |
| [createImage(String fileName, Rectangle2D imageBox, ImageMode mode)](#createImage-java.lang.String-java.awt.geom.Rectangle2D-com.aspose.xps.ImageMode-) | Создаёт прямоугольный путь, заполненный изображением. |
| [createPieSlice(Point2D center, float radius, float startAngle, float endAngle)](#createPieSlice-java.awt.geom.Point2D-float-float-float-) | Создаёт геометрию пути, представляющую кусок круга между двумя радиальными лучами. |
| [createRectangle(Rectangle2D rectangle)](#createRectangle-java.awt.geom.Rectangle2D-) | Создаёт геометрию пути, представляющую прямоугольник. |
| [createRegularCircumscribedNGon(int n, Point2D center, float radius)](#createRegularCircumscribedNGon-int-java.awt.geom.Point2D-float-) | Создаёт геометрию пути, представляющую правильный n-угольник, описанный вокруг круга. |
| [createRegularInscribedNGon(int n, Point2D center, float radius)](#createRegularInscribedNGon-int-java.awt.geom.Point2D-float-) | Создаёт геометрию пути, представляющую правильный n-угольник, вписанный в круг. |
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


Создаёт геометрию пути, представляющую круг.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| center | java.awt.geom.Point2D | Точка центра круга. |
| радиус | float | Радиус круга. |

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - The XPS path geometry.
### createCircularSegment(Point2D center, float radius, float startAngle, float endAngle) {#createCircularSegment-java.awt.geom.Point2D-float-float-float-}
```
public XpsPathGeometry createCircularSegment(Point2D center, float radius, float startAngle, float endAngle)
```


Создаёт геометрию пути, представляющую сегмент круга между двумя углами.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| center | java.awt.geom.Point2D | Центр круга. |
| радиус | float | Радиус круга. |
| startAngle | float | Угол (в градусах) начального луча. |
| endAngle | float | Угол (в градусах) конечного луча. |

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - The XPS path geometry.
### createEllipse(Point2D center, float radiusX, float radiusY) {#createEllipse-java.awt.geom.Point2D-float-float-}
```
public XpsPathGeometry createEllipse(Point2D center, float radiusX, float radiusY)
```


Создаёт геометрию пути, представляющую эллипс.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| center | java.awt.geom.Point2D | Центральная точка эллипса. |
| radiusX | float | Горизонтальный радиус эллипса. |
| radiusY | float | Вертикальный радиус эллипса. |

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - The XPS path geometry.
### createImage(String fileName, Rectangle2D imageBox) {#createImage-java.lang.String-java.awt.geom.Rectangle2D-}
```
public XpsPath createImage(String fileName, Rectangle2D imageBox)
```


Создаёт прямоугольный путь, заполненный изображением.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| fileName | java.lang.String | Имя файла изображения. |
| imageBox | java.awt.geom.Rectangle2D | Область изображения, заполняемая изображением. |

**Returns:**
[XpsPath](../../com.aspose.xps/xpspath) - The XPS path.
### createImage(String fileName, Rectangle2D imageBox, ImageMode mode) {#createImage-java.lang.String-java.awt.geom.Rectangle2D-com.aspose.xps.ImageMode-}
```
public XpsPath createImage(String fileName, Rectangle2D imageBox, ImageMode mode)
```


Создаёт прямоугольный путь, заполненный изображением.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| fileName | java.lang.String | Имя файла изображения. |
| imageBox | java.awt.geom.Rectangle2D | Область изображения, заполняемая изображением. |
| mode | [ImageMode](../../com.aspose.xps/imagemode) | Режим подгонки изображения. |

**Returns:**
[XpsPath](../../com.aspose.xps/xpspath) - The XPS path.
### createPieSlice(Point2D center, float radius, float startAngle, float endAngle) {#createPieSlice-java.awt.geom.Point2D-float-float-float-}
```
public XpsPathGeometry createPieSlice(Point2D center, float radius, float startAngle, float endAngle)
```


Создаёт геометрию пути, представляющую кусок круга между двумя радиальными лучами.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| center | java.awt.geom.Point2D | Центр круга. |
| радиус | float | Радиус круга. |
| startAngle | float | Угол (в градусах) начального луча. |
| endAngle | float | Угол (в градусах) конечного луча. |

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - The XPS path geometry.
### createRectangle(Rectangle2D rectangle) {#createRectangle-java.awt.geom.Rectangle2D-}
```
public XpsPathGeometry createRectangle(Rectangle2D rectangle)
```


Создаёт геометрию пути, представляющую прямоугольник.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| rectangle | java.awt.geom.Rectangle2D | Прямоугольник. |

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - The XPS path geometry.
### createRegularCircumscribedNGon(int n, Point2D center, float radius) {#createRegularCircumscribedNGon-int-java.awt.geom.Point2D-float-}
```
public XpsPathGeometry createRegularCircumscribedNGon(int n, Point2D center, float radius)
```


Создаёт геометрию пути, представляющую правильный n-угольник, описанный вокруг круга.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| n | int | Количество вершин. |
| center | java.awt.geom.Point2D | Центр круга. |
| радиус | float | Радиус круга. |

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - The XPS path geometry.
### createRegularInscribedNGon(int n, Point2D center, float radius) {#createRegularInscribedNGon-int-java.awt.geom.Point2D-float-}
```
public XpsPathGeometry createRegularInscribedNGon(int n, Point2D center, float radius)
```


Создаёт геометрию пути, представляющую правильный n-угольник, вписанный в круг.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| n | int | Количество вершин. |
| center | java.awt.geom.Point2D | Центр круга. |
| радиус | float | Радиус круга. |

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - The XPS path geometry.
### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| Параметр | Тип | Описание |
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
| Параметр | Тип | Описание |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

