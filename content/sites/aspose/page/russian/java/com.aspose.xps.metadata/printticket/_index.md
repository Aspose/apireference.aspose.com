---
title: "PrintTicket"
second_title: "Справочник API Aspose.Page для Java"
description: "Класс, реализующий общий PrintTicket любого уровня."
type: docs
weight: 141
url: /ru/java/com.aspose.xps.metadata/printticket/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
java.lang.Iterable
```
public abstract class PrintTicket implements Iterable<String>
```

Класс, реализующий общий PrintTicket любого уровня. Базовый класс для печатных билетов уровня задания, документа и страницы. Элемент  PrintTicket  является корневым элементом документа PrintTicket. Элемент  PrintTicket  содержит всю информацию о форматировании задания, необходимую для вывода задания. https://docs.microsoft.com/en-us/windows/win32/printdocs/printticket
## Конструкторы

| Конструктор | Описание |
| --- | --- |
| [PrintTicket(IPrintTicketItem[] items)](#PrintTicket-com.aspose.xps.metadata.IPrintTicketItem...-) | Создаёт новый экземпляр. |
## Методы

| Метод | Описание |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [hashCode()](#hashCode--) |  |
| [iterator()](#iterator--) | Возвращает итератор имён элементов печатного билета. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [remove(String[] names)](#remove-java.lang.String...-) | Удаляет элемент из списка элементов этого PrintTicket. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### PrintTicket(IPrintTicketItem[] items) {#PrintTicket-com.aspose.xps.metadata.IPrintTicketItem...-}
```
public PrintTicket(IPrintTicketItem[] items)
```


Создаёт новый экземпляр.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| items | [IPrintTicketItem\[\]](../../com.aspose.xps.metadata/iprintticketitem) | Произвольный массив экземпляров  IPrintTicketItem . Каждый из них должен быть экземпляром  Feature ,  ParameterInit  или  Property . |

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
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### iterator() {#iterator--}
```
public Iterator<String> iterator()
```


Возвращает итератор имён элементов печатного билета.

**Returns:**
java.util.Iterator<java.lang.String> - Возвращает итератор для списка.
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### remove(String[] names) {#remove-java.lang.String...-}
```
public void remove(String[] names)
```


Удаляет элемент из списка элементов этого PrintTicket.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| имена | java.lang.String[] | Массив имён элементов. |

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

