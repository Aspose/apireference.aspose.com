---
title: "XpsPathGeometry"
second_title: "Справочник API Aspose.Page для Java"
description: "Класс, инкапсулирующий свойства элемента PathGeometry."
type: docs
weight: 42
url: /ru/java/com.aspose.xps/xpspathgeometry/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject), com.aspose.xps.XpsArray

**All Implemented Interfaces:**
com.aspose.xps.ITransformableProperty
```
public final class XpsPathGeometry extends XpsArray<XpsPathFigure> implements ITransformableProperty
```

Класс, инкапсулирующий свойства элементов PathGeometry. Этот элемент содержит набор фигур пути, указанных либо атрибутом Figures, либо дочерним элементом PathFigure.
## Методы

| Метод | Описание |
| --- | --- |
| [add(T obj)](#add-T-) | Добавляет новый объект в массив. |
| [addSegment(XpsPathSegment segment)](#addSegment-com.aspose.xps.XpsPathSegment-) | Добавляет сегмент пути в список дочерних сегментов последней фигуры пути. |
| [deepClone()](#deepClone--) | Клонирует эту геометрию пути. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [get(int i)](#get-int-) | Обеспечивает доступ к элементу массива по индексу  i . |
| [getClass()](#getClass--) |  |
| [getFillRule()](#getFillRule--) | Возвращает значение, определяющее, как пересекающиеся области геометрических фигур объединяются в регион. |
| [getPathFigures()](#getPathFigures--) | Возвращает список дочерних фигур пути. |
| [getTransform()](#getTransform--) | Возвращает матрицу аффинного преобразования, определяющую локальное матричное преобразование, которое применяется ко всем дочерним и потомковым элементам геометрии пути перед использованием для заполнения, обрезки или обводки. |
| [hashCode()](#hashCode--) |  |
| [insert(int index, T obj)](#insert-int-T-) | Вставляет новый объект в массив в указанную позицию. |
| [insertSegment(int index, XpsPathSegment segment)](#insertSegment-int-com.aspose.xps.XpsPathSegment-) | Вставляет сегмент пути в список дочерних сегментов последней фигуры пути в позицию индекса. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [remove(T obj)](#remove-T-) | Удаляет объект из массива. |
| [removeAt(int index)](#removeAt-int-) | Удаляет объект из массива в указанной позиции. |
| [removeSegment(XpsPathSegment segment)](#removeSegment-com.aspose.xps.XpsPathSegment-) | Удаляет сегмент пути из списка дочерних сегментов последней фигуры пути. |
| [removeSegmentAt(int index)](#removeSegmentAt-int-) | Удаляет сегмент пути из списка дочерних сегментов последней фигуры пути в позицию индекса. |
| [setFillRule(XpsFillRule value)](#setFillRule-com.aspose.xps.XpsFillRule-) | Устанавливает значение, определяющее, как пересекающиеся области геометрических фигур объединяются в регион. |
| [setTransform(XpsMatrix value)](#setTransform-com.aspose.xps.XpsMatrix-) | Устанавливает матрицу аффинного преобразования, определяющую локальное матричное преобразование, которое применяется ко всем дочерним и потомковым элементам геометрии пути перед использованием для заполнения, обрезки или обводки. |
| [size()](#size--) | Возвращает количество элементов. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### add(T obj) {#add-T-}
```
public T add(T obj)
```


Добавляет новый объект в массив.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| obj | T | Объект для добавления. |

**Returns:**
T - Добавленный объект.
### addSegment(XpsPathSegment segment) {#addSegment-com.aspose.xps.XpsPathSegment-}
```
public XpsPathSegment addSegment(XpsPathSegment segment)
```


Добавляет сегмент пути в список дочерних сегментов последней фигуры пути.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| segment | [XpsPathSegment](../../com.aspose.xps/xpspathsegment) | Сегмент пути, который будет добавлен. |

**Returns:**
[XpsPathSegment](../../com.aspose.xps/xpspathsegment) - Added path segment.
### deepClone() {#deepClone--}
```
public XpsPathGeometry deepClone()
```


Клонирует эту геометрию пути.

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - Clone of this path geometry.
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
### get(int i) {#get-int-}
```
public T get(int i)
```


Обеспечивает доступ к элементу массива по индексу  i .

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| i | int | Индекс элемента. |

**Returns:**
T - Элемент в позиции  i .
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getFillRule() {#getFillRule--}
```
public XpsFillRule getFillRule()
```


Возвращает значение, определяющее, как пересекающиеся области геометрических фигур объединяются в регион.

**Returns:**
[XpsFillRule](../../com.aspose.xps/xpsfillrule) - The value specifying how the intersecting areas of geometric shapes are combined to form a region.
### getPathFigures() {#getPathFigures--}
```
public List<XpsPathFigure> getPathFigures()
```


Возвращает список дочерних фигур пути.

**Returns:**
java.util.List<com.aspose.xps.XpsPathFigure> — список дочерних фигур пути.
### getTransform() {#getTransform--}
```
public XpsMatrix getTransform()
```


Возвращает матрицу аффинного преобразования, определяющую локальное матричное преобразование, которое применяется ко всем дочерним и потомковым элементам геометрии пути перед использованием для заполнения, обрезки или обводки.

**Returns:**
[XpsMatrix](../../com.aspose.xps/xpsmatrix) - The affine transformation matrix.
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### insert(int index, T obj) {#insert-int-T-}
```
public T insert(int index, T obj)
```


Вставляет новый объект в массив в указанную позицию.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| индекс | int | Позиция, в которую вставляется объект. |
| obj | T | Объект для вставки. |

**Returns:**
T - Вставленный объект.
### insertSegment(int index, XpsPathSegment segment) {#insertSegment-int-com.aspose.xps.XpsPathSegment-}
```
public XpsPathSegment insertSegment(int index, XpsPathSegment segment)
```


Вставляет сегмент пути в список дочерних сегментов последней фигуры пути в позицию индекса.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| индекс | int | Позиция, в которую следует вставить сегмент. |
| segment | [XpsPathSegment](../../com.aspose.xps/xpspathsegment) | Сегмент пути, который будет вставлен. |

**Returns:**
[XpsPathSegment](../../com.aspose.xps/xpspathsegment) - Inserted path segment.
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### remove(T obj) {#remove-T-}
```
public T remove(T obj)
```


Удаляет объект из массива.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| obj | T | Объект для удаления. |

**Returns:**
T - Удалённый объект.
### removeAt(int index) {#removeAt-int-}
```
public T removeAt(int index)
```


Удаляет объект из массива в указанной позиции.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| индекс | int | Позиция, в которой удаляется объект. |

**Returns:**
T - Удалённый объект.
### removeSegment(XpsPathSegment segment) {#removeSegment-com.aspose.xps.XpsPathSegment-}
```
public XpsPathSegment removeSegment(XpsPathSegment segment)
```


Удаляет сегмент пути из списка дочерних сегментов последней фигуры пути.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| segment | [XpsPathSegment](../../com.aspose.xps/xpspathsegment) | Сегмент пути, который будет удалён. |

**Returns:**
[XpsPathSegment](../../com.aspose.xps/xpspathsegment) - Removed path segment.
### removeSegmentAt(int index) {#removeSegmentAt-int-}
```
public XpsPathSegment removeSegmentAt(int index)
```


Удаляет сегмент пути из списка дочерних сегментов последней фигуры пути в позицию индекса.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| индекс | int | Позиция, из которой следует удалить сегмент пути. |

**Returns:**
[XpsPathSegment](../../com.aspose.xps/xpspathsegment) - Removed path segment.
### setFillRule(XpsFillRule value) {#setFillRule-com.aspose.xps.XpsFillRule-}
```
public void setFillRule(XpsFillRule value)
```


Устанавливает значение, определяющее, как пересекающиеся области геометрических фигур объединяются в регион.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| value | [XpsFillRule](../../com.aspose.xps/xpsfillrule) | Значение, определяющее, как пересекающиеся области геометрических фигур объединяются в регион. |

### setTransform(XpsMatrix value) {#setTransform-com.aspose.xps.XpsMatrix-}
```
public void setTransform(XpsMatrix value)
```


Устанавливает матрицу аффинного преобразования, определяющую локальное матричное преобразование, которое применяется ко всем дочерним и потомковым элементам геометрии пути перед использованием для заполнения, обрезки или обводки.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| value | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | Аффинная матрица преобразования. |

### size() {#size--}
```
public int size()
```


Возвращает количество элементов.

**Returns:**
int - Количество элементов.
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

