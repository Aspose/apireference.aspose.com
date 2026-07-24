---
title: "ParameterRef"
second_title: "Справочник API Aspose.Page для Java"
description: "Класс, реализующий общую ссылку на параметр PrintTicket."
type: docs
weight: 140
url: /ru/java/com.aspose.xps.metadata/parameterref/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement)

**All Implemented Interfaces:**
[com.aspose.xps.metadata.IPrintTicketItem](../../com.aspose.xps.metadata/iprintticketitem)
```
public class ParameterRef extends PrintTicketElement implements IPrintTicketItem
```

Класс, реализующий общую ссылку на параметр PrintTicket. Элемент  ParameterRef  определяет ссылку на элемент  ParameterInit . Элемент  ScoredProperty , содержащий элемент ParameterRef, не имеет явно установленного элемента  Value . Вместо этого элемент  ScoredProperty  получает своё значение из элемента  ParameterInit , на который ссылается элемент  ParameterRef . https://docs.microsoft.com/en-us/windows/win32/printdocs/parameterref
## Конструкторы

| Конструктор | Описание |
| --- | --- |
| [ParameterRef(String name)](#ParameterRef-java.lang.String-) | Создаёт новый экземпляр. |
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
### ParameterRef(String name) {#ParameterRef-java.lang.String-}
```
public ParameterRef(String name)
```


Создаёт новый экземпляр.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| имя | java.lang.String | Имя параметра. |

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

