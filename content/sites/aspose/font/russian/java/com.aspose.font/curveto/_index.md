---
title: "CurveTo"
second_title: "Справочник API Aspose.Font for Java"
description: "Представляет операцию CurveTo."
type: docs
weight: 29
url: /ru/java/com.aspose.font/curveto/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
[com.aspose.font.IPathSegment](../../com.aspose.font/ipathsegment)
```
public class CurveTo implements IPathSegment
```

Представляет операцию CurveTo.
## Методы

| Метод | Описание |
| --- | --- |
| [clone()](#clone--) | Создаёт новый объект, являющийся копией текущего экземпляра. |
| [copy()](#copy--) | Создаёт копию объекта сегмента. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getX1()](#getX1--) | Получает координату x1. |
| [getX2()](#getX2--) | Получает координату x2. |
| [getX3()](#getX3--) | Получает координату x3. |
| [getY1()](#getY1--) | Получает координату y1. |
| [getY2()](#getY2--) | Получает координату y2. |
| [getY3()](#getY3--) | Получает координату y3. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [shift(double dx, double dy)](#shift-double-double-) | Выполняет сдвиг по координатам x и y. |
| [toString()](#toString--) |  |
| [transform(TransformationMatrix matrix)](#transform-com.aspose.font.TransformationMatrix-) | Преобразует координаты с помощью матрицы преобразования. |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### clone() {#clone--}
```
public Object clone()
```


Создаёт новый объект, являющийся копией текущего экземпляра.

**Returns:**
java.lang.Object - Новый объект, являющийся копией этого экземпляра.
### copy() {#copy--}
```
public IPathSegment copy()
```


Создаёт копию объекта сегмента.

**Returns:**
[IPathSegment](../../com.aspose.font/ipathsegment) - Copy of the segment object.
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
### getX1() {#getX1--}
```
public double getX1()
```


Получает координату x1.

**Returns:**
double - Координата x1.
### getX2() {#getX2--}
```
public double getX2()
```


Получает координату x2.

**Returns:**
double - Координата x2.
### getX3() {#getX3--}
```
public double getX3()
```


Получает координату x3.

**Returns:**
double - Координата x3.
### getY1() {#getY1--}
```
public double getY1()
```


Получает координату y1.

**Returns:**
double - Координата y1.
### getY2() {#getY2--}
```
public double getY2()
```


Получает координату y2.

**Returns:**
double - Координата y2.
### getY3() {#getY3--}
```
public double getY3()
```


Получает координату y3.

**Returns:**
double - Координата y3.
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




### shift(double dx, double dy) {#shift-double-double-}
```
public void shift(double dx, double dy)
```


Выполняет сдвиг по координатам x и y.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| dx | double | Значение dx. |
| dy | double | Значение dy. |

### toString() {#toString--}
```
public String toString()
```




**Returns:**
java.lang.String
### transform(TransformationMatrix matrix) {#transform-com.aspose.font.TransformationMatrix-}
```
public void transform(TransformationMatrix matrix)
```


Преобразует координаты с помощью матрицы преобразования.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| matrix | [TransformationMatrix](../../com.aspose.font/transformationmatrix) | Матрица преобразования. |

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

