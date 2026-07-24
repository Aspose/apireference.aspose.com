---
title: "XpsArcSegment"
second_title: "Справочник API Aspose.Page для Java"
description: "Класс, инкапсулирующий особенности элемента ArcSegment."
type: docs
weight: 13
url: /ru/java/com.aspose.xps/xpsarcsegment/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject), [com.aspose.xps.XpsPathSegment](../../com.aspose.xps/xpspathsegment)
```
public class XpsArcSegment extends XpsPathSegment
```

Класс, инкапсулирующий свойства элемента ArcSegment. Этот элемент описывает эллиптическую дугу.
## Методы

| Метод | Описание |
| --- | --- |
| [deepClone()](#deepClone--) | Создаёт копию этого сегмента дуги. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getPoint()](#getPoint--) | Возвращает конечную точку эллиптической дуги. |
| [getRotationAngle()](#getRotationAngle--) | Возвращает значение, указывающее, как эллипс вращён относительно текущей системы координат. |
| [getSize()](#getSize--) | Возвращает радиусы x и y эллиптической дуги в виде пары x,y. |
| [getSweepDirection()](#getSweepDirection--) | Возвращает значение, определяющее направление, в котором рисуется дуга. |
| [hashCode()](#hashCode--) |  |
| [isLargeArc()](#isLargeArc--) | Возвращает значение, определяющее, рисуется ли дуга с охватом 180 градусов или более. |
| [isStroked()](#isStroked--) | Возвращает значение, определяющее, рисуется ли обводка для этого сегмента пути. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setLargeArc(boolean value)](#setLargeArc-boolean-) | Устанавливает значение, определяющее, будет ли дуга нарисована с охватом 180 градусов или более. |
| [setPoint(Point2D value)](#setPoint-java.awt.geom.Point2D-) | Устанавливает конечную точку эллиптической дуги. |
| [setRotationAngle(float value)](#setRotationAngle-float-) | Устанавливает значение, указывающее, как эллипс вращается относительно текущей системы координат. |
| [setSize(Dimension2D value)](#setSize-java.awt.geom.Dimension2D-) | Устанавливает радиусы x и y эллиптической дуги в виде пары x,y. |
| [setStroked(boolean value)](#setStroked-boolean-) | Устанавливает значение, определяющее, рисуется ли обводка для этого сегмента пути. |
| [setSweepDirection(XpsSweepDirection value)](#setSweepDirection-com.aspose.xps.XpsSweepDirection-) | Устанавливает значение, определяющее направление, в котором рисуется дуга. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### deepClone() {#deepClone--}
```
public XpsArcSegment deepClone()
```


Создаёт копию этого сегмента дуги.

**Returns:**
[XpsArcSegment](../../com.aspose.xps/xpsarcsegment) - Clone of this arc segment.
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
### getPoint() {#getPoint--}
```
public Point2D getPoint()
```


Возвращает конечную точку эллиптической дуги.

**Returns:**
java.awt.geom.Point2D — конечная точка эллиптической дуги.
### getRotationAngle() {#getRotationAngle--}
```
public float getRotationAngle()
```


Возвращает значение, указывающее, как эллипс вращён относительно текущей системы координат.

**Returns:**
float — значение, указывающее, как эллипс вращается относительно текущей системы координат.
### getSize() {#getSize--}
```
public Dimension2D getSize()
```


Возвращает радиусы x и y эллиптической дуги в виде пары x,y.

**Returns:**
java.awt.geom.Dimension2D — радиусы x и y эллиптической дуги в виде пары x,y.
### getSweepDirection() {#getSweepDirection--}
```
public XpsSweepDirection getSweepDirection()
```


Возвращает значение, определяющее направление, в котором рисуется дуга.

**Returns:**
[XpsSweepDirection](../../com.aspose.xps/xpssweepdirection) - The value specifying the direction in which the arc is drawn.
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### isLargeArc() {#isLargeArc--}
```
public boolean isLargeArc()
```


Возвращает значение, определяющее, рисуется ли дуга с охватом 180 градусов или более.

**Returns:**
boolean — значение, определяющее, будет ли дуга нарисована с охватом 180 градусов или более.
### isStroked() {#isStroked--}
```
public boolean isStroked()
```


Возвращает значение, определяющее, рисуется ли обводка для этого сегмента пути.

**Returns:**
boolean - Значение, определяющее, рисуется ли обводка для этого сегмента пути.
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### setLargeArc(boolean value) {#setLargeArc-boolean-}
```
public void setLargeArc(boolean value)
```


Устанавливает значение, определяющее, будет ли дуга нарисована с охватом 180 градусов или более.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| значение | boolean | Значение, определяющее, будет ли дуга нарисована с охватом 180 градусов или более. |

### setPoint(Point2D value) {#setPoint-java.awt.geom.Point2D-}
```
public void setPoint(Point2D value)
```


Устанавливает конечную точку эллиптической дуги.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| значение | java.awt.geom.Point2D | Конечная точка эллиптической дуги. |

### setRotationAngle(float value) {#setRotationAngle-float-}
```
public void setRotationAngle(float value)
```


Устанавливает значение, указывающее, как эллипс вращается относительно текущей системы координат.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| значение | float | Значение, указывающее, как эллипс вращается относительно текущей системы координат. |

### setSize(Dimension2D value) {#setSize-java.awt.geom.Dimension2D-}
```
public void setSize(Dimension2D value)
```


Устанавливает радиусы x и y эллиптической дуги в виде пары x,y.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| значение | java.awt.geom.Dimension2D | Радиусы x и y эллиптической дуги в виде пары x,y. |

### setStroked(boolean value) {#setStroked-boolean-}
```
public void setStroked(boolean value)
```


Устанавливает значение, определяющее, рисуется ли обводка для этого сегмента пути.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| значение | boolean | Значение, определяющее, рисуется ли обводка для этого сегмента пути. |

### setSweepDirection(XpsSweepDirection value) {#setSweepDirection-com.aspose.xps.XpsSweepDirection-}
```
public void setSweepDirection(XpsSweepDirection value)
```


Устанавливает значение, определяющее направление, в котором рисуется дуга.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| value | [XpsSweepDirection](../../com.aspose.xps/xpssweepdirection) | Значение, определяющее направление, в котором рисуется дуга. |

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

