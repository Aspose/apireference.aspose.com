---
title: "ScoredProperty"
second_title: "Справочник API Aspose.Page для Java"
description: "Класс, реализующий общую PrintTicket ScoredProperty."
type: docs
weight: 146
url: /ru/java/com.aspose.xps.metadata/scoredproperty/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement)

**All Implemented Interfaces:**
[com.aspose.xps.metadata.IOptionItem](../../com.aspose.xps.metadata/ioptionitem), [com.aspose.xps.metadata.IScoredPropertyItem](../../com.aspose.xps.metadata/iscoredpropertyitem)
```
public class ScoredProperty extends CompositePrintTicketElement implements IOptionItem, IScoredPropertyItem
```

Класс, реализующий общую PrintTicket ScoredProperty. Базовый класс для всех определённых схемой scored‑properties. Элемент ScoredProperty объявляет свойство, которое является неотъемлемой частью определения Option. Такие свойства следует сравнивать при оценке того, насколько запрошенный Option соответствует поддерживаемому устройством Option. https://docs.microsoft.com/en-us/windows/win32/printdocs/scoredproperty
## Конструкторы

| Конструктор | Описание |
| --- | --- |
| [ScoredProperty(String name, ParameterRef parameterRef)](#ScoredProperty-java.lang.String-com.aspose.xps.metadata.ParameterRef-) | Создаёт новый экземпляр. |
| [ScoredProperty(String name, Value value, IScoredPropertyItem[] items)](#ScoredProperty-java.lang.String-com.aspose.xps.metadata.Value-com.aspose.xps.metadata.IScoredPropertyItem...-) | Создаёт новый экземпляр. |
## Методы

| Метод | Описание |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getName()](#getName--) | Получает имя элемента. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### ScoredProperty(String name, ParameterRef parameterRef) {#ScoredProperty-java.lang.String-com.aspose.xps.metadata.ParameterRef-}
```
public ScoredProperty(String name, ParameterRef parameterRef)
```


Создаёт новый экземпляр.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| имя | java.lang.String | Имя свойства. |
| parameterRef | [ParameterRef](../../com.aspose.xps.metadata/parameterref) | Экземпляр ParameterRef. |

### ScoredProperty(String name, Value value, IScoredPropertyItem[] items) {#ScoredProperty-java.lang.String-com.aspose.xps.metadata.Value-com.aspose.xps.metadata.IScoredPropertyItem...-}
```
public ScoredProperty(String name, Value value, IScoredPropertyItem[] items)
```


Создаёт новый экземпляр.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| имя | java.lang.String | Имя свойства. |
| value | [Value](../../com.aspose.xps.metadata/value) | Значение свойства. |
| items | [IScoredPropertyItem\[\]](../../com.aspose.xps.metadata/iscoredpropertyitem) | Произвольный массив экземпляров IScoredPropertyItem. Каждый из них должен быть экземпляром ScoredProperty, Property или Value. |

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
### getName() {#getName--}
```
public String getName()
```


Получает имя элемента.

**Returns:**
java.lang.String
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

