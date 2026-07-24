---
title: "DocumentPageRanges"
second_title: "Справочник API Aspose.Page для Java"
description: "Описывает диапазон вывода документа в страницах."
type: docs
weight: 31
url: /ru/java/com.aspose.xps.metadata/documentpageranges/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.ParameterInit](../../com.aspose.xps.metadata/parameterinit), [com.aspose.xps.metadata.StringParameterInit](../../com.aspose.xps.metadata/stringparameterinit)

**All Implemented Interfaces:**
[com.aspose.xps.metadata.IJobPrintTicketItem](../../com.aspose.xps.metadata/ijobprintticketitem), [com.aspose.xps.metadata.IDocumentPrintTicketItem](../../com.aspose.xps.metadata/idocumentprintticketitem)
```
public final class DocumentPageRanges extends StringParameterInit implements IJobPrintTicketItem, IDocumentPrintTicketItem
```

Описывает диапазон вывода документа в страницах. Значение параметра должно соответствовать следующей структуре: - PageRangeText: "PageRange" или "PageRange,PageRange" - PageRange: "PageNumber" или "PageNumber-PageNumber" - PageNumber: от 1 до N, где N — количество страниц в документе. Если PageNumber > N, то PageNumber = N. Пробелы в строке следует игнорировать. https://docs.microsoft.com/en-us/windows/win32/printdocs/documentpageranges
## Конструкторы

| Конструктор | Описание |
| --- | --- |
| [DocumentPageRanges(String value)](#DocumentPageRanges-java.lang.String-) | Создаёт новый экземпляр. |
## Методы

| Метод | Описание |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getMaxLength()](#getMaxLength--) | Для строковых значений определяет самую короткую и самую длинную строку. |
| [getMinLength()](#getMinLength--) | Для строковых значений определяет кратчайшую допустимую строку. |
| [getName()](#getName--) | Получает имя элемента. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### DocumentPageRanges(String value) {#DocumentPageRanges-java.lang.String-}
```
public DocumentPageRanges(String value)
```


Создаёт новый экземпляр.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| значение | java.lang.String | Значение параметра. |

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
### getMaxLength() {#getMaxLength--}
```
public int getMaxLength()
```


Для строковых значений определяет самую короткую и самую длинную строку.

**Returns:**
int - Наибольшая допустимая строка.
### getMinLength() {#getMinLength--}
```
public int getMinLength()
```


Для строковых значений определяет кратчайшую допустимую строку.

**Returns:**
int - Наименьшая допустимая строка.
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

