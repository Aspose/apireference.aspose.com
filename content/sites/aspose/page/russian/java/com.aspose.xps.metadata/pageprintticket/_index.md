---
title: "PagePrintTicket"
second_title: "Справочник API Aspose.Page для Java"
description: "Класс, который инкапсулирует печатный билет уровня страницы."
type: docs
weight: 119
url: /ru/java/com.aspose.xps.metadata/pageprintticket/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicket](../../com.aspose.xps.metadata/printticket)
```
public final class PagePrintTicket extends PrintTicket
```

Класс, который инкапсулирует печатный билет уровня страницы.
## Конструкторы

| Конструктор | Описание |
| --- | --- |
| [PagePrintTicket(IPagePrintTicketItem[] items)](#PagePrintTicket-com.aspose.xps.metadata.IPagePrintTicketItem...-) | Создает экземпляр печатного билета уровня страницы. |
## Методы

| Метод | Описание |
| --- | --- |
| [add(IPagePrintTicketItem[] items)](#add-com.aspose.xps.metadata.IPagePrintTicketItem...-) | Добавляет массив элементов в конец списка элементов этого PrintTicket. |
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
### PagePrintTicket(IPagePrintTicketItem[] items) {#PagePrintTicket-com.aspose.xps.metadata.IPagePrintTicketItem...-}
```
public PagePrintTicket(IPagePrintTicketItem[] items)
```


Создает экземпляр печатного билета уровня страницы.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| items | [IPagePrintTicketItem\[\]](../../com.aspose.xps.metadata/ipageprintticketitem) | Произвольный массив экземпляров  IPagePrintTicketItem . Каждый элемент должен быть экземпляром  Feature ,  ParameterInit  или  Property . |

### add(IPagePrintTicketItem[] items) {#add-com.aspose.xps.metadata.IPagePrintTicketItem...-}
```
public void add(IPagePrintTicketItem[] items)
```


Добавляет массив элементов в конец списка элементов этого PrintTicket. Каждый элемент может быть экземпляром  Feature ,  ParameterInit  или  Property .

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| items | [IPagePrintTicketItem\[\]](../../com.aspose.xps.metadata/ipageprintticketitem) | Массив элементов для добавления. |

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

