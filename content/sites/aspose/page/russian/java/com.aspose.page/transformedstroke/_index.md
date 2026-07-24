---
title: "TransformedStroke"
second_title: "Справочник API Aspose.Page для Java"
description: "Штрих, содержащий преобразование."
type: docs
weight: 17
url: /ru/java/com.aspose.page/transformedstroke/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
java.awt.Stroke
```
public class TransformedStroke implements Stroke
```

Штрих, содержащий преобразование.
## Конструкторы

| Конструктор | Описание |
| --- | --- |
| [TransformedStroke(Stroke base, AffineTransform at)](#TransformedStroke-java.awt.Stroke-java.awt.geom.AffineTransform-) | Создает TransformedStroke на основе другого Stroke и AffineTransform. |
## Методы

| Метод | Описание |
| --- | --- |
| [createStrokedShape(Shape s)](#createStrokedShape-java.awt.Shape-) | Обводит заданную Shape этим stroke, создавая контур. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getBaseStroke()](#getBaseStroke--) | Получает базовый stroke. |
| [getClass()](#getClass--) |  |
| [getTransform()](#getTransform--) | Получает трансформацию. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### TransformedStroke(Stroke base, AffineTransform at) {#TransformedStroke-java.awt.Stroke-java.awt.geom.AffineTransform-}
```
public TransformedStroke(Stroke base, AffineTransform at)
```


Создает TransformedStroke на основе другого Stroke и AffineTransform.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| база | java.awt.Stroke | База stroke. |
| в | java.awt.geom.AffineTransform | Аффинная трансформация. |

### createStrokedShape(Shape s) {#createStrokedShape-java.awt.Shape-}
```
public Shape createStrokedShape(Shape s)
```


Обводит заданную Shape этим stroke, создавая контур. Этот контур искажается нашим AffineTransform относительно контура, который был бы получен базовым stroke, но только в плане масштабирования (т. е. толщины линий), поскольку трансляция и вращение отменяются после обводки.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| s | java.awt.Shape | Как shape для обводки. |

**Returns:**
java.awt.Shape - Контур shape.
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
### getBaseStroke() {#getBaseStroke--}
```
public Stroke getBaseStroke()
```


Получает базовый stroke.

**Returns:**
java.awt.Stroke - Базовый stroke.
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getTransform() {#getTransform--}
```
public AffineTransform getTransform()
```


Получает трансформацию.

**Returns:**
java.awt.geom.AffineTransform - Трансформация.
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

