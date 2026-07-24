---
title: "DocumentPrintTicket"
second_title: "Справочник API Aspose.Page для Java"
description: "Класс, который инкапсулирует печатный билет уровня документа."
type: docs
weight: 32
url: /ru/java/com.aspose.xps.metadata/documentprintticket/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicket](../../com.aspose.xps.metadata/printticket)
```
public final class DocumentPrintTicket extends PrintTicket
```

Класс, который инкапсулирует печатный билет уровня документа.
## Конструкторы

| Конструктор | Описание |
| --- | --- |
| [DocumentPrintTicket(IDocumentPrintTicketItem[] items)](#DocumentPrintTicket-com.aspose.xps.metadata.IDocumentPrintTicketItem...-) | Создаёт экземпляр печатного билета уровня документа. |
## Методы

| Метод | Описание |
| --- | --- |
| [add(IDocumentPrintTicketItem[] items)](#add-com.aspose.xps.metadata.IDocumentPrintTicketItem...-) | Добавляет массив элементов в конец списка элементов этого PrintTicket. |
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
### DocumentPrintTicket(IDocumentPrintTicketItem[] items) {#DocumentPrintTicket-com.aspose.xps.metadata.IDocumentPrintTicketItem...-}
```
public DocumentPrintTicket(IDocumentPrintTicketItem[] items)
```


Создаёт экземпляр печатного билета уровня документа.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| items | [IDocumentPrintTicketItem\[\]](../../com.aspose.xps.metadata/idocumentprintticketitem) | Произвольный массив экземпляров  IDocumentPrintTicketItem . Каждый должен быть экземпляром  Feature ,  ParameterInit  или  Property . |

### add(IDocumentPrintTicketItem[] items) {#add-com.aspose.xps.metadata.IDocumentPrintTicketItem...-}
```
public void add(IDocumentPrintTicketItem[] items)
```


Добавляет массив элементов в конец списка элементов этого PrintTicket. Каждый может быть экземпляром  Feature ,  Option  или  Property .

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| items | [IDocumentPrintTicketItem\[\]](../../com.aspose.xps.metadata/idocumentprintticketitem) | Массив элементов для добавления. |

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

