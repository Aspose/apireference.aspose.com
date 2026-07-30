---
title: "MoveTo"
second_title: "Справочник API Aspose.Font for Java"
description: "Представляет операцию MoveTo."
type: docs
weight: 65
url: /ru/java/com.aspose.font/moveto/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
[com.aspose.font.IPathSegment](../../com.aspose.font/ipathsegment)
```
public class MoveTo implements IPathSegment
```

Представляет операцию MoveTo.
## Методы

| Метод | Описание |
| --- | --- |
| [clone()](#clone--) | Создаёт новый объект, являющийся копией текущего экземпляра. |
| [copy()](#copy--) | Создаёт копию объекта сегмента. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getX()](#getX--) | Получает координату x. |
| [getY()](#getY--) | Получает координату y. |
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
### getX() {#getX--}
```
public double getX()
```


Получает координату x.

**Returns:**
double - Координата x.
### getY() {#getY--}
```
public double getY()
```


Получает координату y.

**Returns:**
double - Координата y.
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

