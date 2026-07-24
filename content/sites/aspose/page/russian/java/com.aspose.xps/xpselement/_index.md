---
title: "XpsElement"
second_title: "Справочник API Aspose.Page для Java"
description: "Класс, инкапсулирующий общие особенности элементов XPS."
type: docs
weight: 20
url: /ru/java/com.aspose.xps/xpselement/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject)

**All Implemented Interfaces:**
java.lang.Iterable
```
public abstract class XpsElement extends XpsObject implements Iterable<XpsContentElement>
```

Класс, инкапсулирующий общие особенности элементов XPS.
## Методы

| Метод | Описание |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [get(int i)](#get-int-) | Обеспечивает доступ к дочерним элементам по индексу i. |
| [getClass()](#getClass--) |  |
| [hashCode()](#hashCode--) |  |
| [iterator()](#iterator--) | Реализация интерфейса Iterable. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [size()](#size--) | Возвращает количество дочерних элементов. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
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
public XpsContentElement get(int i)
```


Обеспечивает доступ к дочерним элементам по индексу i.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| i | int | Индекс дочернего элемента. |

**Returns:**
[XpsContentElement](../../com.aspose.xps/xpscontentelement) - Child element at  i  position.
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
### iterator() {#iterator--}
```
public Iterator<XpsContentElement> iterator()
```


Реализация интерфейса Iterable.

**Returns:**
java.util.Iterator<com.aspose.xps.XpsContentElement> — возвращает перечислитель для списка.
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### size() {#size--}
```
public int size()
```


Возвращает количество дочерних элементов.

**Returns:**
int — количество дочерних элементов.
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

