---
title: "PageAPI"
second_title: "Справочник API Aspose.Page для Java"
description: "API модификации элемента Page."
type: docs
weight: 12
url: /ru/java/com.aspose.xps.features.eventbasedmodifications/pageapi/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
[com.aspose.xps.features.EventBasedModifications.IModificationAPI](../../com.aspose.xps.features.eventbasedmodifications/imodificationapi)
```
public class PageAPI implements EventBasedModifications.IModificationAPI
```

API модификации элемента **Page**.
## Методы

| Метод | Описание |
| --- | --- |
| [<T>add(T element)](#-T-add-T-) | Добавляет элемент содержимого (Canvas, Path или Glyphs) |
| [<T>insert(int index, T element)](#-T-insert-int-T-) | Вставляет элемент (Canvas, Path или Glyphs) на страницу в позицию индекса. |
| [<T>remove(T element)](#-T-remove-T-) | Удаляет элемент со страницы. |
| [addCanvas()](#addCanvas--) | Добавляет новый canvas на страницу. |
| [addGlyphs(XpsFont font, float fontRenderingEmSize, float originX, float originY, String unicodeString)](#addGlyphs-com.aspose.xps.XpsFont-float-float-float-java.lang.String-) | Добавляет новые glyphs на страницу. |
| [addGlyphs(String fontFamily, float fontRenderingEmSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)](#addGlyphs-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-) | Добавляет новые glyphs на страницу. |
| [addOutlineEntry(String description, int outlineLevel, int targetPageNumber)](#addOutlineEntry-java.lang.String-int-int-) | Добавляет запись оглавления в документ. |
| [addPath(XpsPathGeometry data)](#addPath-com.aspose.xps.XpsPathGeometry-) | Добавляет новый path на страницу. |
| [createArcSegment(Point2D point, Dimension2D size, float rotationAngle, boolean isLargeArc, XpsSweepDirection sweepDirection)](#createArcSegment-java.awt.geom.Point2D-java.awt.geom.Dimension2D-float-boolean-com.aspose.xps.XpsSweepDirection-) | Создаёт новый сегмент эллиптической дуги с обводкой. |
| [createArcSegment(Point2D point, Dimension2D size, float rotationAngle, boolean isLargeArc, XpsSweepDirection sweepDirection, boolean isStroked)](#createArcSegment-java.awt.geom.Point2D-java.awt.geom.Dimension2D-float-boolean-com.aspose.xps.XpsSweepDirection-boolean-) | Создаёт новый сегмент эллиптической дуги. |
| [createCanvas()](#createCanvas--) | Создаёт новый canvas. |
| [createColor(XpsIccProfile iccProfile, float[] components)](#createColor-com.aspose.xps.XpsIccProfile-float...-) | Создаёт новый цвет в цветовом пространстве на основе ICC. |
| [createColor(float r, float g, float b)](#createColor-float-float-float-) | Создаёт новый цвет в цветовом пространстве scRGB. |
| [createColor(float a, float r, float g, float b)](#createColor-float-float-float-float-) | Создаёт новый цвет в цветовом пространстве scRGB. |
| [createColor(int r, int g, int b)](#createColor-int-int-int-) | Создаёт новый цвет в цветовом пространстве sRGB. |
| [createColor(int a, int r, int g, int b)](#createColor-int-int-int-int-) | Создаёт новый цвет в цветовом пространстве sRGB. |
| [createColor(Color color)](#createColor-java.awt.Color-) | Создаёт новый цвет. |
| [createColor(String path, float[] components)](#createColor-java.lang.String-float...-) | Создаёт новый цвет в цветовом пространстве на основе ICC. |
| [createGlyphs(XpsFont font, float fontRenderingEmSize, float originX, float originY, String unicodeString)](#createGlyphs-com.aspose.xps.XpsFont-float-float-float-java.lang.String-) | Создаёт новые glyphs. |
| [createGlyphs(String fontFamily, float fontRenderingEmSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)](#createGlyphs-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-) | Создаёт новые glyphs. |
| [createGradientStop(XpsColor color, float offset)](#createGradientStop-com.aspose.xps.XpsColor-float-) | Создаёт новую градиентную остановку. |
| [createGradientStop(Color color, float offset)](#createGradientStop-java.awt.Color-float-) | Создаёт новую градиентную остановку. |
| [createImageBrush(XpsImage image, Rectangle2D viewbox, Rectangle2D viewport)](#createImageBrush-com.aspose.xps.XpsImage-java.awt.geom.Rectangle2D-java.awt.geom.Rectangle2D-) | Создаёт новую кисть изображения. |
| [createImageBrush(String imagePath, Rectangle2D viewbox, Rectangle2D viewport)](#createImageBrush-java.lang.String-java.awt.geom.Rectangle2D-java.awt.geom.Rectangle2D-) | Создаёт новую кисть изображения. |
| [createLinearGradientBrush(Point2D startPoint, Point2D endPoint)](#createLinearGradientBrush-java.awt.geom.Point2D-java.awt.geom.Point2D-) | Создаёт новую линейную градиентную кисть. |
| [createLinearGradientBrush(List<XpsGradientStop> gradientStops, Point2D startPoint, Point2D endPoint)](#createLinearGradientBrush-java.util.List-com.aspose.xps.XpsGradientStop--java.awt.geom.Point2D-java.awt.geom.Point2D-) | Создаёт новую линейную градиентную кисть. |
| [createMatrix(float m11, float m12, float m21, float m22, float m31, float m32)](#createMatrix-float-float-float-float-float-float-) | Создаёт новую аффинную матрицу преобразования. |
| [createPath(XpsPathGeometry data)](#createPath-com.aspose.xps.XpsPathGeometry-) | Создаёт новый path. |
| [createPathFigure(Point2D startPoint)](#createPathFigure-java.awt.geom.Point2D-) | Создаёт новую открытую фигуру пути. |
| [createPathFigure(Point2D startPoint, boolean isClosed)](#createPathFigure-java.awt.geom.Point2D-boolean-) | Создаёт новую фигуру пути. |
| [createPathFigure(Point2D startPoint, List<XpsPathSegment> segments)](#createPathFigure-java.awt.geom.Point2D-java.util.List-com.aspose.xps.XpsPathSegment--) | Создаёт новую открытую фигуру пути. |
| [createPathFigure(Point2D startPoint, List<XpsPathSegment> segments, boolean isClosed)](#createPathFigure-java.awt.geom.Point2D-java.util.List-com.aspose.xps.XpsPathSegment--boolean-) | Создаёт новую фигуру пути. |
| [createPathGeometry()](#createPathGeometry--) | Создаёт новую геометрию пути. |
| [createPathGeometry(String abbreviatedGeometry)](#createPathGeometry-java.lang.String-) | Создает новую геометрию пути, указанную в сокращенной форме. |
| [createPathGeometry(List<XpsPathFigure> pathFigures)](#createPathGeometry-java.util.List-com.aspose.xps.XpsPathFigure--) | Создает новую геометрию пути с указанным списком фигур пути. |
| [createPolyBezierSegment(Point2D[] points)](#createPolyBezierSegment-java.awt.geom.Point2D---) | Создает новый набор обведенных кубических B?zier кривых. |
| [createPolyBezierSegment(Point2D[] points, boolean isStroked)](#createPolyBezierSegment-java.awt.geom.Point2D---boolean-) | Создает новый набор кубических B?zier кривых. |
| [createPolyLineSegment(Point2D[] points)](#createPolyLineSegment-java.awt.geom.Point2D---) | Создает новое обведенное полигональное изображение, содержащее произвольное количество отдельных вершин. |
| [createPolyLineSegment(Point2D[] points, boolean isStroked)](#createPolyLineSegment-java.awt.geom.Point2D---boolean-) | Создает новое полигональное изображение, содержащее произвольное количество отдельных вершин. |
| [createPolyQuadraticBezierSegment(Point2D[] points)](#createPolyQuadraticBezierSegment-java.awt.geom.Point2D---) | Создает новый набор обведенных квадратичных B?zier кривых от предыдущей точки в фигуре пути через набор вершин, используя указанные контрольные точки. |
| [createPolyQuadraticBezierSegment(Point2D[] points, boolean isStroked)](#createPolyQuadraticBezierSegment-java.awt.geom.Point2D---boolean-) | Создает новый набор квадратичных B?zier кривых от предыдущей точки в фигуре пути через набор вершин, используя указанные контрольные точки. |
| [createRadialGradientBrush(Point2D center, Point2D gradientOrigin, float radiusX, float radiusY)](#createRadialGradientBrush-java.awt.geom.Point2D-java.awt.geom.Point2D-float-float-) | Создает новую кисть радиального градиента. |
| [createRadialGradientBrush(List<XpsGradientStop> gradientStops, Point2D center, Point2D gradientOrigin, float radiusX, float radiusY)](#createRadialGradientBrush-java.util.List-com.aspose.xps.XpsGradientStop--java.awt.geom.Point2D-java.awt.geom.Point2D-float-float-) | Создает новую кисть радиального градиента. |
| [createSolidColorBrush(XpsColor color)](#createSolidColorBrush-com.aspose.xps.XpsColor-) | Создает новую кисть сплошного цвета. |
| [createSolidColorBrush(Color color)](#createSolidColorBrush-java.awt.Color-) | Создает новую кисть сплошного цвета. |
| [createVisualBrush(XpsContentElement element, Rectangle2D viewbox, Rectangle2D viewport)](#createVisualBrush-com.aspose.xps.XpsContentElement-java.awt.geom.Rectangle2D-java.awt.geom.Rectangle2D-) | Создает новую визуальную кисть. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getHeight()](#getHeight--) | Возвращает высоту страницы, выраженную в виде действительного числа в единицах эффективного координатного пространства. |
| [getPageCount()](#getPageCount--) | Возвращает количество страниц в активном документе. |
| [getTotalPageCount()](#getTotalPageCount--) | Возвращает общее количество страниц во всех документах внутри XPS‑документа. |
| [getUtils()](#getUtils--) | Получает объект, предоставляющий утилиты, выходящие за рамки официального API манипуляции XPS. |
| [getWidth()](#getWidth--) | Возвращает ширину страницы, выраженную в виде действительного числа в единицах эффективного координатного пространства. |
| [hashCode()](#hashCode--) |  |
| [insertCanvas(int index)](#insertCanvas-int-) | Вставляет новый холст на страницу в позиции  index  . |
| [insertGlyphs(int index, XpsFont font, float fontSize, float originX, float originY, String unicodeString)](#insertGlyphs-int-com.aspose.xps.XpsFont-float-float-float-java.lang.String-) | Вставляет новые глифы на страницу в позиции  index  . |
| [insertGlyphs(int index, String fontFamily, float fontSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)](#insertGlyphs-int-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-) | Вставляет новые глифы на страницу в позиции  index  . |
| [insertPath(int index, XpsPathGeometry data)](#insertPath-int-com.aspose.xps.XpsPathGeometry-) | Вставляет новый путь на страницу в позиции  index  . |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [removeAt(int index)](#removeAt-int-) | Удаляет элемент в позиции  index  со страницы. |
| [setHeight(float value)](#setHeight-float-) | Устанавливает высоту страницы, выраженную в виде действительного числа в единицах эффективного координатного пространства. |
| [setWidth(float value)](#setWidth-float-) | Устанавливает ширину страницы, выраженную в виде действительного числа в единицах эффективного координатного пространства. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### <T>add(T element) {#-T-add-T-}
```
public T <T>add(T element)
```


Добавляет элемент содержимого (Canvas, Path или Glyphs)

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| элемент | T | Элемент для добавления. |

**Returns:**
T - Добавленный элемент.
### <T>insert(int index, T element) {#-T-insert-int-T-}
```
public T <T>insert(int index, T element)
```


Вставляет элемент (Canvas, Path или Glyphs) на страницу в позицию индекса.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| индекс | int | Позиция, в которой элемент должен быть вставлен. |
| элемент | T | Элемент для вставки. |

**Returns:**
T - Вставленный элемент.
### <T>remove(T element) {#-T-remove-T-}
```
public T <T>remove(T element)
```


Удаляет элемент со страницы.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| элемент | T | Элемент для удаления. |

**Returns:**
T - Удалённый элемент.
### addCanvas() {#addCanvas--}
```
public XpsCanvas addCanvas()
```


Добавляет новый canvas на страницу.

**Returns:**
[XpsCanvas](../../com.aspose.xps/xpscanvas) - Added canvas.
### addGlyphs(XpsFont font, float fontRenderingEmSize, float originX, float originY, String unicodeString) {#addGlyphs-com.aspose.xps.XpsFont-float-float-float-java.lang.String-}
```
public XpsGlyphs addGlyphs(XpsFont font, float fontRenderingEmSize, float originX, float originY, String unicodeString)
```


Добавляет новые glyphs на страницу.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| font | [XpsFont](../../com.aspose.xps/xpsfont) | Ресурс шрифта. |
| fontRenderingEmSize | float | Размер шрифта. |
| originX | float | Координата X начала глифов. |
| originY | float | Координата Y начала глифов. |
| unicodeString | java.lang.String | Строка для печати. |

**Returns:**
[XpsGlyphs](../../com.aspose.xps/xpsglyphs) - Added glyphs.
### addGlyphs(String fontFamily, float fontRenderingEmSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString) {#addGlyphs-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-}
```
public XpsGlyphs addGlyphs(String fontFamily, float fontRenderingEmSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)
```


Добавляет новые glyphs на страницу.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| fontFamily | java.lang.String | Семейство шрифтов. |
| fontRenderingEmSize | float | Размер шрифта. |
| fontStyle | [XpsFontStyle](../../com.aspose.xps/xpsfontstyle) | Стиль шрифта. |
| originX | float | Координата X начала глифов. |
| originY | float | Координата Y начала глифов. |
| unicodeString | java.lang.String | Строка для печати. |

**Returns:**
[XpsGlyphs](../../com.aspose.xps/xpsglyphs) - Added glyphs.
### addOutlineEntry(String description, int outlineLevel, int targetPageNumber) {#addOutlineEntry-java.lang.String-int-int-}
```
public void addOutlineEntry(String description, int outlineLevel, int targetPageNumber)
```


Добавляет запись оглавления в документ.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| описание | java.lang.String | Описание записи. |
| outlineLevel | int | Уровень структуры. |
| targetPageNumber | int | Номер целевой страницы. |

### addPath(XpsPathGeometry data) {#addPath-com.aspose.xps.XpsPathGeometry-}
```
public XpsPath addPath(XpsPathGeometry data)
```


Добавляет новый path на страницу.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| data | [XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) | Геометрия пути. |

**Returns:**
[XpsPath](../../com.aspose.xps/xpspath) - Added path.
### createArcSegment(Point2D point, Dimension2D size, float rotationAngle, boolean isLargeArc, XpsSweepDirection sweepDirection) {#createArcSegment-java.awt.geom.Point2D-java.awt.geom.Dimension2D-float-boolean-com.aspose.xps.XpsSweepDirection-}
```
public XpsArcSegment createArcSegment(Point2D point, Dimension2D size, float rotationAngle, boolean isLargeArc, XpsSweepDirection sweepDirection)
```


Создаёт новый сегмент эллиптической дуги с обводкой.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| точка | java.awt.geom.Point2D | Конечная точка эллиптической дуги. |
| размер | java.awt.geom.Dimension2D | Радиусы x и y эллиптической дуги в виде пары x,y. |
| rotationAngle | float | Указывает, как эллипс вращается относительно текущей системы координат. |
| isLargeArc | boolean | Определяет, рисуется ли дуга с охватом 180 градусов или более. |
| sweepDirection | [XpsSweepDirection](../../com.aspose.xps/xpssweepdirection) | Направление, в котором рисуется дуга. |

**Returns:**
[XpsArcSegment](../../com.aspose.xps/xpsarcsegment) - New elliptical arc segment.
### createArcSegment(Point2D point, Dimension2D size, float rotationAngle, boolean isLargeArc, XpsSweepDirection sweepDirection, boolean isStroked) {#createArcSegment-java.awt.geom.Point2D-java.awt.geom.Dimension2D-float-boolean-com.aspose.xps.XpsSweepDirection-boolean-}
```
public XpsArcSegment createArcSegment(Point2D point, Dimension2D size, float rotationAngle, boolean isLargeArc, XpsSweepDirection sweepDirection, boolean isStroked)
```


Создаёт новый сегмент эллиптической дуги.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| точка | java.awt.geom.Point2D | Конечная точка эллиптической дуги. |
| размер | java.awt.geom.Dimension2D | Радиусы x и y эллиптической дуги в виде пары x,y. |
| rotationAngle | float | Указывает, как эллипс вращается относительно текущей системы координат. |
| isLargeArc | boolean | Определяет, рисуется ли дуга с охватом 180 градусов или более. |
| sweepDirection | [XpsSweepDirection](../../com.aspose.xps/xpssweepdirection) | Направление, в котором рисуется дуга. |
| isStroked | boolean | Указывает, будет ли нарисован обводка для этого сегмента пути. |

**Returns:**
[XpsArcSegment](../../com.aspose.xps/xpsarcsegment) - New elliptical arc segment.
### createCanvas() {#createCanvas--}
```
public XpsCanvas createCanvas()
```


Создаёт новый canvas.

**Returns:**
[XpsCanvas](../../com.aspose.xps/xpscanvas) - New canvas.
### createColor(XpsIccProfile iccProfile, float[] components) {#createColor-com.aspose.xps.XpsIccProfile-float...-}
```
public XpsColor createColor(XpsIccProfile iccProfile, float[] components)
```


Создаёт новый цвет в цветовом пространстве на основе ICC.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| iccProfile | [XpsIccProfile](../../com.aspose.xps/xpsiccprofile) | Ресурс ICC‑профиля. |
| components | float[] | Компоненты цвета. |

**Returns:**
[XpsColor](../../com.aspose.xps/xpscolor) - New color.
### createColor(float r, float g, float b) {#createColor-float-float-float-}
```
public XpsColor createColor(float r, float g, float b)
```


Создаёт новый цвет в цветовом пространстве scRGB.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| r | float | Красный компонент цвета. |
| g | float | Зелёный компонент цвета. |
| b | float | Синий компонент цвета. |

**Returns:**
[XpsColor](../../com.aspose.xps/xpscolor) - New color.
### createColor(float a, float r, float g, float b) {#createColor-float-float-float-float-}
```
public XpsColor createColor(float a, float r, float g, float b)
```


Создаёт новый цвет в цветовом пространстве scRGB.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| a | float | Альфа‑компонент цвета. |
| r | float | Красный компонент цвета. |
| g | float | Зелёный компонент цвета. |
| b | float | Синий компонент цвета. |

**Returns:**
[XpsColor](../../com.aspose.xps/xpscolor) - New color.
### createColor(int r, int g, int b) {#createColor-int-int-int-}
```
public XpsColor createColor(int r, int g, int b)
```


Создаёт новый цвет в цветовом пространстве sRGB.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| r | int | Красный компонент цвета. |
| g | int | Зелёный компонент цвета. |
| b | int | Синий компонент цвета. |

**Returns:**
[XpsColor](../../com.aspose.xps/xpscolor) - New color.
### createColor(int a, int r, int g, int b) {#createColor-int-int-int-int-}
```
public XpsColor createColor(int a, int r, int g, int b)
```


Создаёт новый цвет в цветовом пространстве sRGB.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| a | int | Альфа‑компонент цвета. |
| r | int | Красный компонент цвета. |
| g | int | Зелёный компонент цвета. |
| b | int | Синий компонент цвета. |

**Returns:**
[XpsColor](../../com.aspose.xps/xpscolor) - New color.
### createColor(Color color) {#createColor-java.awt.Color-}
```
public XpsColor createColor(Color color)
```


Создаёт новый цвет.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| color | java.awt.Color | Нативный объект цвета для RGB. |

**Returns:**
[XpsColor](../../com.aspose.xps/xpscolor) - New color.
### createColor(String path, float[] components) {#createColor-java.lang.String-float...-}
```
public XpsColor createColor(String path, float[] components)
```


Создаёт новый цвет в цветовом пространстве на основе ICC.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| path | java.lang.String | Путь к ICC‑профилю. |
| components | float[] | Компоненты цвета. |

**Returns:**
[XpsColor](../../com.aspose.xps/xpscolor) - New color.
### createGlyphs(XpsFont font, float fontRenderingEmSize, float originX, float originY, String unicodeString) {#createGlyphs-com.aspose.xps.XpsFont-float-float-float-java.lang.String-}
```
public XpsGlyphs createGlyphs(XpsFont font, float fontRenderingEmSize, float originX, float originY, String unicodeString)
```


Создаёт новые glyphs.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| font | [XpsFont](../../com.aspose.xps/xpsfont) | Ресурс шрифта. |
| fontRenderingEmSize | float | Размер шрифта. |
| originX | float | Координата X начала глифов. |
| originY | float | Координата Y начала глифов. |
| unicodeString | java.lang.String | Строка для печати. |

**Returns:**
[XpsGlyphs](../../com.aspose.xps/xpsglyphs) - New glyphs.
### createGlyphs(String fontFamily, float fontRenderingEmSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString) {#createGlyphs-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-}
```
public XpsGlyphs createGlyphs(String fontFamily, float fontRenderingEmSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)
```


Создаёт новые glyphs.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| fontFamily | java.lang.String | Семейство шрифтов. |
| fontRenderingEmSize | float | Размер шрифта. |
| fontStyle | [XpsFontStyle](../../com.aspose.xps/xpsfontstyle) | Стиль шрифта. |
| originX | float | Координата X начала глифов. |
| originY | float | Координата Y начала глифов. |
| unicodeString | java.lang.String | Строка для печати. |

**Returns:**
[XpsGlyphs](../../com.aspose.xps/xpsglyphs) - New glyphs.
### createGradientStop(XpsColor color, float offset) {#createGradientStop-com.aspose.xps.XpsColor-float-}
```
public XpsGradientStop createGradientStop(XpsColor color, float offset)
```


Создаёт новую градиентную остановку.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| color | [XpsColor](../../com.aspose.xps/xpscolor) | Цвет остановки градиента. |
| смещение | float | Смещение градиента. |

**Returns:**
[XpsGradientStop](../../com.aspose.xps/xpsgradientstop) - New gradient stop.
### createGradientStop(Color color, float offset) {#createGradientStop-java.awt.Color-float-}
```
public XpsGradientStop createGradientStop(Color color, float offset)
```


Создаёт новую градиентную остановку.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| color | java.awt.Color | Цвет остановки градиента. |
| смещение | float | Смещение градиента. |

**Returns:**
[XpsGradientStop](../../com.aspose.xps/xpsgradientstop) - New gradient stop.
### createImageBrush(XpsImage image, Rectangle2D viewbox, Rectangle2D viewport) {#createImageBrush-com.aspose.xps.XpsImage-java.awt.geom.Rectangle2D-java.awt.geom.Rectangle2D-}
```
public XpsImageBrush createImageBrush(XpsImage image, Rectangle2D viewbox, Rectangle2D viewport)
```


Создаёт новую кисть изображения.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| image | [XpsImage](../../com.aspose.xps/xpsimage) | Ресурс изображения. |
| viewbox | java.awt.geom.Rectangle2D | Позиция и размеры исходного содержимого кисти. |
| viewport | java.awt.geom.Rectangle2D | Область в содержащем координатном пространстве основной плитки кисти, которая (возможно многократно) применяется для заполнения области, к которой применяется кисть. |

**Returns:**
[XpsImageBrush](../../com.aspose.xps/xpsimagebrush) - New image brush.
### createImageBrush(String imagePath, Rectangle2D viewbox, Rectangle2D viewport) {#createImageBrush-java.lang.String-java.awt.geom.Rectangle2D-java.awt.geom.Rectangle2D-}
```
public XpsImageBrush createImageBrush(String imagePath, Rectangle2D viewbox, Rectangle2D viewport)
```


Создаёт новую кисть изображения.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| imagePath | java.lang.String | Путь к изображению, используемому в качестве плитки кисти. |
| viewbox | java.awt.geom.Rectangle2D | Позиция и размеры исходного содержимого кисти. |
| viewport | java.awt.geom.Rectangle2D | Область в содержащем координатном пространстве основной плитки кисти, которая (возможно многократно) применяется для заполнения области, к которой применяется кисть. |

**Returns:**
[XpsImageBrush](../../com.aspose.xps/xpsimagebrush) - New image brush.
### createLinearGradientBrush(Point2D startPoint, Point2D endPoint) {#createLinearGradientBrush-java.awt.geom.Point2D-java.awt.geom.Point2D-}
```
public XpsLinearGradientBrush createLinearGradientBrush(Point2D startPoint, Point2D endPoint)
```


Создаёт новую линейную градиентную кисть.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| startPoint | java.awt.geom.Point2D | Начальная точка линейного градиента. |
| endPoint | java.awt.geom.Point2D | Конечная точка линейного градиента. |

**Returns:**
[XpsLinearGradientBrush](../../com.aspose.xps/xpslineargradientbrush) - New linear gradient brush.
### createLinearGradientBrush(List<XpsGradientStop> gradientStops, Point2D startPoint, Point2D endPoint) {#createLinearGradientBrush-java.util.List-com.aspose.xps.XpsGradientStop--java.awt.geom.Point2D-java.awt.geom.Point2D-}
```
public XpsLinearGradientBrush createLinearGradientBrush(List<XpsGradientStop> gradientStops, Point2D startPoint, Point2D endPoint)
```


Создаёт новую линейную градиентную кисть.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| gradientStops | java.util.List<com.aspose.xps.XpsGradientStop> | Список остановок градиента. |
| startPoint | java.awt.geom.Point2D | Начальная точка линейного градиента. |
| endPoint | java.awt.geom.Point2D | Конечная точка линейного градиента. |

**Returns:**
[XpsLinearGradientBrush](../../com.aspose.xps/xpslineargradientbrush) - New linear gradient brush.
### createMatrix(float m11, float m12, float m21, float m22, float m31, float m32) {#createMatrix-float-float-float-float-float-float-}
```
public XpsMatrix createMatrix(float m11, float m12, float m21, float m22, float m31, float m32)
```


Создаёт новую аффинную матрицу преобразования.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| m11 | float | Элемент 11. |
| m12 | float | Элемент 12. |
| m21 | float | Элемент 21. |
| m22 | float | Элемент 22. |
| m31 | float | Элемент 31. |
| m32 | float | Элемент 32. |

**Returns:**
[XpsMatrix](../../com.aspose.xps/xpsmatrix) - New affine transformation matrix.
### createPath(XpsPathGeometry data) {#createPath-com.aspose.xps.XpsPathGeometry-}
```
public XpsPath createPath(XpsPathGeometry data)
```


Создаёт новый path.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| data | [XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) | Геометрия пути. |

**Returns:**
[XpsPath](../../com.aspose.xps/xpspath) - New path.
### createPathFigure(Point2D startPoint) {#createPathFigure-java.awt.geom.Point2D-}
```
public XpsPathFigure createPathFigure(Point2D startPoint)
```


Создаёт новую открытую фигуру пути.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| startPoint | java.awt.geom.Point2D | Начальная точка первого сегмента фигуры пути. |

**Returns:**
[XpsPathFigure](../../com.aspose.xps/xpspathfigure) - New path figure.
### createPathFigure(Point2D startPoint, boolean isClosed) {#createPathFigure-java.awt.geom.Point2D-boolean-}
```
public XpsPathFigure createPathFigure(Point2D startPoint, boolean isClosed)
```


Создаёт новую фигуру пути.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| startPoint | java.awt.geom.Point2D | Начальная точка первого сегмента фигуры пути. |
| isClosed | boolean | Указывает, замкнут ли путь. Если установлено значение true, штрих рисуется "замкнутым", то есть последняя точка последнего сегмента фигуры пути соединяется с точкой, указанной в атрибуте StartPoint, иначе штрих рисуется "открытым", и последняя точка не соединяется с начальной точкой. Применяется только если фигура пути используется в элементе Path, который задает штрих. |

**Returns:**
[XpsPathFigure](../../com.aspose.xps/xpspathfigure) - New path figure.
### createPathFigure(Point2D startPoint, List<XpsPathSegment> segments) {#createPathFigure-java.awt.geom.Point2D-java.util.List-com.aspose.xps.XpsPathSegment--}
```
public XpsPathFigure createPathFigure(Point2D startPoint, List<XpsPathSegment> segments)
```


Создаёт новую открытую фигуру пути.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| startPoint | java.awt.geom.Point2D | Начальная точка первого сегмента фигуры пути. |
| segments | java.util.List<com.aspose.xps.XpsPathSegment> | Список сегментов пути. |

**Returns:**
[XpsPathFigure](../../com.aspose.xps/xpspathfigure) - New path figure.
### createPathFigure(Point2D startPoint, List<XpsPathSegment> segments, boolean isClosed) {#createPathFigure-java.awt.geom.Point2D-java.util.List-com.aspose.xps.XpsPathSegment--boolean-}
```
public XpsPathFigure createPathFigure(Point2D startPoint, List<XpsPathSegment> segments, boolean isClosed)
```


Создаёт новую фигуру пути.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| startPoint | java.awt.geom.Point2D | Начальная точка первого сегмента фигуры пути. |
| segments | java.util.List<com.aspose.xps.XpsPathSegment> | Список сегментов пути. |
| isClosed | boolean | Указывает, замкнут ли путь. Если установлено значение true, штрих рисуется "замкнутым", то есть последняя точка последнего сегмента фигуры пути соединяется с точкой, указанной в атрибуте StartPoint, иначе штрих рисуется "открытым", и последняя точка не соединяется с начальной точкой. Применяется только если фигура пути используется в элементе Path, который задает штрих. |

**Returns:**
[XpsPathFigure](../../com.aspose.xps/xpspathfigure) - New path figure.
### createPathGeometry() {#createPathGeometry--}
```
public XpsPathGeometry createPathGeometry()
```


Создаёт новую геометрию пути.

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - New path geometry.
### createPathGeometry(String abbreviatedGeometry) {#createPathGeometry-java.lang.String-}
```
public XpsPathGeometry createPathGeometry(String abbreviatedGeometry)
```


Создает новую геометрию пути, указанную в сокращенной форме.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| abbreviatedGeometry | java.lang.String | Сокращённая форма геометрии пути. |

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - New path geometry.
### createPathGeometry(List<XpsPathFigure> pathFigures) {#createPathGeometry-java.util.List-com.aspose.xps.XpsPathFigure--}
```
public XpsPathGeometry createPathGeometry(List<XpsPathFigure> pathFigures)
```


Создает новую геометрию пути с указанным списком фигур пути.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| pathFigures | java.util.List<com.aspose.xps.XpsPathFigure> | Список фигур пути. |

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - New path geometry.
### createPolyBezierSegment(Point2D[] points) {#createPolyBezierSegment-java.awt.geom.Point2D---}
```
public XpsPolyBezierSegment createPolyBezierSegment(Point2D[] points)
```


Создает новый набор обведенных кубических B?zier кривых.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| points | java.awt.geom.Point2D[] | Контрольные точки для нескольких B?bezier сегментов. |

**Returns:**
[XpsPolyBezierSegment](../../com.aspose.xps/xpspolybeziersegment) - New cubic B?zier curves segment.
### createPolyBezierSegment(Point2D[] points, boolean isStroked) {#createPolyBezierSegment-java.awt.geom.Point2D---boolean-}
```
public XpsPolyBezierSegment createPolyBezierSegment(Point2D[] points, boolean isStroked)
```


Создает новый набор кубических B?zier кривых.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| points | java.awt.geom.Point2D[] | Контрольные точки для нескольких B?bezier сегментов. |
| isStroked | boolean | Указывает, будет ли нарисован обводка для этого сегмента пути. |

**Returns:**
[XpsPolyBezierSegment](../../com.aspose.xps/xpspolybeziersegment) - New cubic B?zier curves segment.
### createPolyLineSegment(Point2D[] points) {#createPolyLineSegment-java.awt.geom.Point2D---}
```
public XpsPolyLineSegment createPolyLineSegment(Point2D[] points)
```


Создает новое обведенное полигональное изображение, содержащее произвольное количество отдельных вершин.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| points | java.awt.geom.Point2D[] | Набор координат для нескольких сегментов, определяющих сегмент полилинии. |

**Returns:**
[XpsPolyLineSegment](../../com.aspose.xps/xpspolylinesegment) - New polygonal drawing segment.
### createPolyLineSegment(Point2D[] points, boolean isStroked) {#createPolyLineSegment-java.awt.geom.Point2D---boolean-}
```
public XpsPolyLineSegment createPolyLineSegment(Point2D[] points, boolean isStroked)
```


Создает новое полигональное изображение, содержащее произвольное количество отдельных вершин.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| points | java.awt.geom.Point2D[] | Набор координат для нескольких сегментов, определяющих сегмент полилинии. |
| isStroked | boolean | Указывает, будет ли нарисован обводка для этого сегмента пути. |

**Returns:**
[XpsPolyLineSegment](../../com.aspose.xps/xpspolylinesegment) - New polygonal drawing segment.
### createPolyQuadraticBezierSegment(Point2D[] points) {#createPolyQuadraticBezierSegment-java.awt.geom.Point2D---}
```
public XpsPolyQuadraticBezierSegment createPolyQuadraticBezierSegment(Point2D[] points)
```


Создает новый набор обведенных квадратичных B?zier кривых от предыдущей точки в фигуре пути через набор вершин, используя указанные контрольные точки.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| points | java.awt.geom.Point2D[] | Контрольные точки для нескольких квадратичных B?bezier сегментов. |

**Returns:**
[XpsPolyQuadraticBezierSegment](../../com.aspose.xps/xpspolyquadraticbeziersegment) - New quadratic B?zier curves segment.
### createPolyQuadraticBezierSegment(Point2D[] points, boolean isStroked) {#createPolyQuadraticBezierSegment-java.awt.geom.Point2D---boolean-}
```
public XpsPolyQuadraticBezierSegment createPolyQuadraticBezierSegment(Point2D[] points, boolean isStroked)
```


Создает новый набор квадратичных B?zier кривых от предыдущей точки в фигуре пути через набор вершин, используя указанные контрольные точки.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| points | java.awt.geom.Point2D[] | Контрольные точки для нескольких квадратичных B?bezier сегментов. |
| isStroked | boolean | Указывает, будет ли нарисован обводка для этого сегмента пути. |

**Returns:**
[XpsPolyQuadraticBezierSegment](../../com.aspose.xps/xpspolyquadraticbeziersegment) - New quadratic B?zier curves segment.
### createRadialGradientBrush(Point2D center, Point2D gradientOrigin, float radiusX, float radiusY) {#createRadialGradientBrush-java.awt.geom.Point2D-java.awt.geom.Point2D-float-float-}
```
public XpsRadialGradientBrush createRadialGradientBrush(Point2D center, Point2D gradientOrigin, float radiusX, float radiusY)
```


Создает новую кисть радиального градиента.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| center | java.awt.geom.Point2D | Центральная точка радиального градиента (то есть центр эллипса). |
| gradientOrigin | java.awt.geom.Point2D | Исходная точка радиального градиента. |
| radiusX | float | Радиус в измерении x эллипса, определяющего радиальный градиент. |
| radiusY | float | Радиус в измерении y эллипса, определяющего радиальный градиент. |

**Returns:**
[XpsRadialGradientBrush](../../com.aspose.xps/xpsradialgradientbrush) - New radial gradient brush.
### createRadialGradientBrush(List<XpsGradientStop> gradientStops, Point2D center, Point2D gradientOrigin, float radiusX, float radiusY) {#createRadialGradientBrush-java.util.List-com.aspose.xps.XpsGradientStop--java.awt.geom.Point2D-java.awt.geom.Point2D-float-float-}
```
public XpsRadialGradientBrush createRadialGradientBrush(List<XpsGradientStop> gradientStops, Point2D center, Point2D gradientOrigin, float radiusX, float radiusY)
```


Создает новую кисть радиального градиента.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| gradientStops | java.util.List<com.aspose.xps.XpsGradientStop> | Список остановок градиента. |
| center | java.awt.geom.Point2D | Центральная точка радиального градиента (то есть центр эллипса). |
| gradientOrigin | java.awt.geom.Point2D | Исходная точка радиального градиента. |
| radiusX | float | Радиус в измерении x эллипса, определяющего радиальный градиент. |
| radiusY | float | Радиус в измерении y эллипса, определяющего радиальный градиент. |

**Returns:**
[XpsRadialGradientBrush](../../com.aspose.xps/xpsradialgradientbrush) - New radial gradient brush.
### createSolidColorBrush(XpsColor color) {#createSolidColorBrush-com.aspose.xps.XpsColor-}
```
public XpsSolidColorBrush createSolidColorBrush(XpsColor color)
```


Создает новую кисть сплошного цвета.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| color | [XpsColor](../../com.aspose.xps/xpscolor) | Цвет для заполненных элементов. |

**Returns:**
[XpsSolidColorBrush](../../com.aspose.xps/xpssolidcolorbrush) - New solid color brush.
### createSolidColorBrush(Color color) {#createSolidColorBrush-java.awt.Color-}
```
public XpsSolidColorBrush createSolidColorBrush(Color color)
```


Создает новую кисть сплошного цвета.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| color | java.awt.Color | Цвет для заполненных элементов. |

**Returns:**
[XpsSolidColorBrush](../../com.aspose.xps/xpssolidcolorbrush) - New solid color brush.
### createVisualBrush(XpsContentElement element, Rectangle2D viewbox, Rectangle2D viewport) {#createVisualBrush-com.aspose.xps.XpsContentElement-java.awt.geom.Rectangle2D-java.awt.geom.Rectangle2D-}
```
public XpsVisualBrush createVisualBrush(XpsContentElement element, Rectangle2D viewbox, Rectangle2D viewport)
```


Создает новую визуальную кисть.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| element | [XpsContentElement](../../com.aspose.xps/xpscontentelement) | Элемент XPS (Canvas, Path, or Glyphs) для свойства Visual visual brush. |
| viewbox | java.awt.geom.Rectangle2D | Позиция и размеры исходного содержимого кисти. |
| viewport | java.awt.geom.Rectangle2D | Область в содержащем координатном пространстве основной плитки кисти, которая (возможно многократно) применяется для заполнения области, к которой применяется кисть. |

**Returns:**
[XpsVisualBrush](../../com.aspose.xps/xpsvisualbrush) - New visual brush.
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
### getHeight() {#getHeight--}
```
public float getHeight()
```


Возвращает высоту страницы, выраженную в виде действительного числа в единицах эффективного координатного пространства.

**Returns:**
float - Высота страницы.
### getPageCount() {#getPageCount--}
```
public int getPageCount()
```


Возвращает количество страниц в активном документе.

**Returns:**
int - Количество страниц в активном документе.
### getTotalPageCount() {#getTotalPageCount--}
```
public int getTotalPageCount()
```


Возвращает общее количество страниц во всех документах внутри XPS‑документа.

**Returns:**
int - Общее количество страниц во всех документах внутри XPS-документа.
### getUtils() {#getUtils--}
```
public DocumentUtils getUtils()
```


Получает объект, предоставляющий утилиты, выходящие за рамки официального API манипуляции XPS.

**Returns:**
[DocumentUtils](../../com.aspose.xps/documentutils) - The object that provides utilities beyond the formal XPS manipulation API.
### getWidth() {#getWidth--}
```
public float getWidth()
```


Возвращает ширину страницы, выраженную в виде действительного числа в единицах эффективного координатного пространства.

**Returns:**
float - Ширина страницы.
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


Вставляет новый холст на страницу в позиции  index  .

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| индекс | int | Позиция, в которой следует вставить новый canvas. |

**Returns:**
[XpsCanvas](../../com.aspose.xps/xpscanvas) - Inserted canvas.
### insertGlyphs(int index, XpsFont font, float fontSize, float originX, float originY, String unicodeString) {#insertGlyphs-int-com.aspose.xps.XpsFont-float-float-float-java.lang.String-}
```
public XpsGlyphs insertGlyphs(int index, XpsFont font, float fontSize, float originX, float originY, String unicodeString)
```


Вставляет новые глифы на страницу в позиции  index  .

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| индекс | int | Позиция, в которой следует вставить новые glyphs. |
| font | [XpsFont](../../com.aspose.xps/xpsfont) | Ресурс шрифта. |
| fontSize | float | Размер шрифта. |
| originX | float | Координата X начала глифов. |
| originY | float | Координата Y начала глифов. |
| unicodeString | java.lang.String | Строка для печати. |

**Returns:**
[XpsGlyphs](../../com.aspose.xps/xpsglyphs) - Inserted glyphs.
### insertGlyphs(int index, String fontFamily, float fontSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString) {#insertGlyphs-int-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-}
```
public XpsGlyphs insertGlyphs(int index, String fontFamily, float fontSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)
```


Вставляет новые глифы на страницу в позиции  index  .

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| индекс | int | Позиция, в которой следует вставить новые glyphs. |
| fontFamily | java.lang.String | Семейство шрифтов. |
| fontSize | float | Размер шрифта. |
| fontStyle | [XpsFontStyle](../../com.aspose.xps/xpsfontstyle) | Стиль шрифта. |
| originX | float | Координата X начала глифов. |
| originY | float | Координата Y начала глифов. |
| unicodeString | java.lang.String | Строка для печати. |

**Returns:**
[XpsGlyphs](../../com.aspose.xps/xpsglyphs) - Inserted glyphs.
### insertPath(int index, XpsPathGeometry data) {#insertPath-int-com.aspose.xps.XpsPathGeometry-}
```
public XpsPath insertPath(int index, XpsPathGeometry data)
```


Вставляет новый путь на страницу в позиции  index  .

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| индекс | int | Позиция, в которой следует вставить новый path. |
| data | [XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) | Геометрия пути. |

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


Удаляет элемент в позиции  index  со страницы.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| индекс | int | Позиция, в которой следует удалить элемент. |

**Returns:**
[XpsContentElement](../../com.aspose.xps/xpscontentelement) - Removed element.
### setHeight(float value) {#setHeight-float-}
```
public void setHeight(float value)
```


Устанавливает высоту страницы, выраженную в виде действительного числа в единицах эффективного координатного пространства.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| значение | float | Высота страницы. |

### setWidth(float value) {#setWidth-float-}
```
public void setWidth(float value)
```


Устанавливает ширину страницы, выраженную в виде действительного числа в единицах эффективного координатного пространства.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| значение | float | Ширина страницы. |

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

