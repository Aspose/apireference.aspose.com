---
title: "XpsPathFigure"
second_title: "Справочник API Aspose.Page для Java"
description: "Класс, инкапсулирующий свойства элемента PathFigure."
type: docs
weight: 41
url: /ru/java/com.aspose.xps/xpspathfigure/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject), com.aspose.xps.XpsArray
```
public class XpsPathFigure extends XpsArray<XpsPathSegment>
```

Класс, инкапсулирующий свойства элемента PathFigure. Этот элемент состоит из набора из одной или более линейных или криволинейных сегментов.
## Методы

| Метод | Описание |
| --- | --- |
| [add(T obj)](#add-T-) | Добавляет новый объект в массив. |
| [deepClone()](#deepClone--) | Клонирует эту path figure. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [get(int i)](#get-int-) | Обеспечивает доступ к элементу массива по индексу  i . |
| [getClass()](#getClass--) |  |
| [getSegments()](#getSegments--) | Возвращает список дочерних сегментов пути. |
| [getStartPoint()](#getStartPoint--) | Возвращает начальную точку первого сегмента path figure. |
| [hashCode()](#hashCode--) |  |
| [insert(int index, T obj)](#insert-int-T-) | Вставляет новый объект в массив в указанную позицию. |
| [isClosed()](#isClosed--) | Возвращает значение, указывающее, закрыт ли path figure. |
| [isFilled()](#isFilled--) | Возвращает значение, указывающее, используется ли path figure при вычислении площади содержащей геометрии пути. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [remove(T obj)](#remove-T-) | Удаляет объект из массива. |
| [removeAt(int index)](#removeAt-int-) | Удаляет объект из массива в указанной позиции. |
| [setClosed(boolean value)](#setClosed-boolean-) | Устанавливает значение, указывающее, закрыт ли path figure. |
| [setFilled(boolean value)](#setFilled-boolean-) | Устанавливает значение, указывающее, используется ли path figure при вычислении площади содержащей геометрии пути. |
| [setStartPoint(Point2D value)](#setStartPoint-java.awt.geom.Point2D-) | Устанавливает начальную точку первого сегмента path figure. |
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
### deepClone() {#deepClone--}
```
public XpsPathFigure deepClone()
```


Клонирует эту path figure.

**Returns:**
[XpsPathFigure](../../com.aspose.xps/xpspathfigure) - Clone of this path figure.
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
### getSegments() {#getSegments--}
```
public List<XpsPathSegment> getSegments()
```


Возвращает список дочерних сегментов пути.

**Returns:**
java.util.List<com.aspose.xps.XpsPathSegment> - Список дочерних сегментов пути.
### getStartPoint() {#getStartPoint--}
```
public Point2D getStartPoint()
```


Возвращает начальную точку первого сегмента path figure.

**Returns:**
java.awt.geom.Point2D - Начальная точка первого сегмента path figure.
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
### isClosed() {#isClosed--}
```
public boolean isClosed()
```


Возвращает значение, указывающее, закрыт ли path figure.

**Returns:**
boolean - Значение, указывающее, закрыта ли фигура пути.
### isFilled() {#isFilled--}
```
public boolean isFilled()
```


Возвращает значение, указывающее, используется ли path figure при вычислении площади содержащей геометрии пути.

**Returns:**
boolean - Значение, указывающее, используется ли фигура пути при вычислении площади содержащей геометрии пути.
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
### setClosed(boolean value) {#setClosed-boolean-}
```
public void setClosed(boolean value)
```


Устанавливает значение, указывающее, закрыт ли path figure.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| значение | boolean | Значение, указывающее, закрыта ли фигура пути. |

### setFilled(boolean value) {#setFilled-boolean-}
```
public void setFilled(boolean value)
```


Устанавливает значение, указывающее, используется ли path figure при вычислении площади содержащей геометрии пути.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| значение | boolean | Значение, указывающее, используется ли фигура пути при вычислении площади содержащей геометрии пути. |

### setStartPoint(Point2D value) {#setStartPoint-java.awt.geom.Point2D-}
```
public void setStartPoint(Point2D value)
```


Устанавливает начальную точку первого сегмента path figure.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| значение | java.awt.geom.Point2D | Начальная точка первого сегмента фигуры пути. |

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

