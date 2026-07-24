---
title: "DimensionF"
second_title: "Справочник API Aspose.Page для Java"
description: "Класс Dimension инкапсулирует ширину и высоту компонента в одинарной точности в одном объекте."
type: docs
weight: 11
url: /ru/java/com.aspose.page/dimensionf/
---
**Inheritance:**
java.lang.Object, java.awt.geom.Dimension2D

**All Implemented Interfaces:**
java.io.Serializable
```
public class DimensionF extends Dimension2D implements Serializable
```

Класс `Dimension` инкапсулирует ширину и высоту компонента (в одинарной точности) в одном объекте.

Обычно значения `width` и `height` являются неотрицательными целыми числами. Конструкторы, позволяющие создавать объект измерения, не препятствуют установке отрицательного значения для этих свойств. Если значение `width` или `height` отрицательно, поведение некоторых методов, определённых другими объектами, не определено.
## Конструкторы

| Конструктор | Описание |
| --- | --- |
| [DimensionF()](#DimensionF--) | Создаёт экземпляр `Dimension` с нулевой шириной и нулевой высотой. |
| [DimensionF(DimensionF d)](#DimensionF-com.aspose.page.DimensionF-) | Создаёт экземпляр `Dimension`, ширина и высота которого совпадают с указанным измерением. |
| [DimensionF(float width, float height)](#DimensionF-float-float-) | Создаёт `Dimension` и инициализирует его указанной шириной и указанной высотой. |
## Поля

| Поле | Описание |
| --- | --- |
| [height](#height) | Размер высоты; могут использоваться отрицательные значения. |
| [width](#width) | Размер ширины; могут использоваться отрицательные значения. |
## Методы

| Метод | Описание |
| --- | --- |
| [clone()](#clone--) |  |
| [equals(Object obj)](#equals-java.lang.Object-) | Проверяет, имеют ли два объекта измерения одинаковые значения. |
| [getClass()](#getClass--) |  |
| [getHeight()](#getHeight--) | \{@inheritDoc\} |
| [getSize()](#getSize--) | Получает размер этого объекта `Dimension`. |
| [getWidth()](#getWidth--) | \{@inheritDoc\} |
| [hashCode()](#hashCode--) | Возвращает хеш‑код для этого `Dimension`. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setSize(DimensionF d)](#setSize-com.aspose.page.DimensionF-) | Устанавливает размер этого объекта `Dimension` в указанное значение. |
| [setSize(double width, double height)](#setSize-double-double-) | Устанавливает размер этого объекта `Dimension` в указанную ширину и высоту с двойной точностью. |
| [setSize(float width, float height)](#setSize-float-float-) | Устанавливает размер этого объекта `Dimension` в указанную ширину и высоту. |
| [setSize(Dimension2D arg0)](#setSize-java.awt.geom.Dimension2D-) |  |
| [toString()](#toString--) | Возвращает строковое представление значений полей `height` и `width` этого объекта `Dimension`. |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### DimensionF() {#DimensionF--}
```
public DimensionF()
```


Создаёт экземпляр `Dimension` с нулевой шириной и нулевой высотой.

### DimensionF(DimensionF d) {#DimensionF-com.aspose.page.DimensionF-}
```
public DimensionF(DimensionF d)
```


Создаёт экземпляр `Dimension`, ширина и высота которого совпадают с указанным измерением.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| d | [DimensionF](../../com.aspose.page/dimensionf) | указанное измерение для значений `width` и `height` |

### DimensionF(float width, float height) {#DimensionF-float-float-}
```
public DimensionF(float width, float height)
```


Создаёт `Dimension` и инициализирует его указанной шириной и указанной высотой.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| ширина | float | указанная ширина |
| высота | float | указанная высота |

### height {#height}
```
public float height
```


Размер высоты; могут использоваться отрицательные значения.

### width {#width}
```
public float width
```


Размер ширины; могут использоваться отрицательные значения.

### clone() {#clone--}
```
public Object clone()
```




**Returns:**
java.lang.Object
### equals(Object obj) {#equals-java.lang.Object-}
```
public boolean equals(Object obj)
```


Проверяет, имеют ли два объекта измерения одинаковые значения.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| obj | java.lang.Object |  |

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
public double getHeight()
```




**Returns:**
double
### getSize() {#getSize--}
```
public DimensionF getSize()
```


Получает размер этого объекта `Dimension`. Этот метод включён для полноты, чтобы соответствовать методу `getSize`, определённому в `Component`.

**Returns:**
[DimensionF](../../com.aspose.page/dimensionf) - the size of this dimension, a new instance of `Dimension` with the same width and height
### getWidth() {#getWidth--}
```
public double getWidth()
```




**Returns:**
double
### hashCode() {#hashCode--}
```
public int hashCode()
```


Возвращает хеш‑код для этого `Dimension`.

**Returns:**
int — хеш‑код для этого `Dimension`
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### setSize(DimensionF d) {#setSize-com.aspose.page.DimensionF-}
```
public void setSize(DimensionF d)
```


Устанавливает размер этого объекта `Dimension` в указанное значение. Этот метод включён для полноты, чтобы соответствовать методу `setSize`, определённому в `Component`.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| d | [DimensionF](../../com.aspose.page/dimensionf) | новый размер для этого объекта `Dimension` |

### setSize(double width, double height) {#setSize-double-double-}
```
public void setSize(double width, double height)
```


Устанавливает размер этого объекта `Dimension` в указанные ширину и высоту с двойной точностью. Обратите внимание, что если `width` или `height` превышают `Integer.MAX_VALUE`, они будут сброшены до `Integer.MAX_VALUE`.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| ширина | double | новая ширина для объекта `Dimension` |
| высота | double | новая высота для объекта `Dimension` |

### setSize(float width, float height) {#setSize-float-float-}
```
public void setSize(float width, float height)
```


Устанавливает размер этого объекта `Dimension` в указанные ширину и высоту. Этот метод включён для полноты, чтобы соответствовать методу `setSize`, определённому в `Component`.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| ширина | float | новая ширина для этого объекта `Dimension` |
| высота | float | новая высота для этого объекта `Dimension` |

### setSize(Dimension2D arg0) {#setSize-java.awt.geom.Dimension2D-}
```
public void setSize(Dimension2D arg0)
```




**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| arg0 | java.awt.geom.Dimension2D |  |

### toString() {#toString--}
```
public String toString()
```


Возвращает строковое представление значений полей `height` и `width` этого объекта `Dimension`. Этот метод предназначен только для отладки, и содержимое и формат возвращаемой строки могут различаться между реализациями. Возвращаемая строка может быть пустой, но не может быть `null`.

**Returns:**
java.lang.String — строковое представление этого объекта `Dimension`
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

