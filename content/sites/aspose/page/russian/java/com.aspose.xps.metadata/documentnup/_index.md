---
title: "DocumentNUp"
second_title: "Справочник API Aspose.Page для Java"
description: "Описывает вывод и формат нескольких логических страниц на один физический лист."
type: docs
weight: 28
url: /ru/java/com.aspose.xps.metadata/documentnup/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Feature](../../com.aspose.xps.metadata/feature), [com.aspose.xps.metadata.NUp](../../com.aspose.xps.metadata/nup)

**All Implemented Interfaces:**
[com.aspose.xps.metadata.IJobPrintTicketItem](../../com.aspose.xps.metadata/ijobprintticketitem), [com.aspose.xps.metadata.IDocumentPrintTicketItem](../../com.aspose.xps.metadata/idocumentprintticketitem)
```
public final class DocumentNUp extends NUp implements IJobPrintTicketItem, IDocumentPrintTicketItem
```

Описывает вывод и формат нескольких логических страниц на один физический лист. Каждый документ компилируется отдельно.  DocumentNUp  и  JobNUpAllDocumentsContiguously  взаимно исключают друг друга. Управление ограничениями между этими ключевыми словами определяется драйвером. https://docs.microsoft.com/en-us/windows/win32/printdocs/documentnup
## Конструкторы

| Конструктор | Описание |
| --- | --- |
| [DocumentNUp(NUp.INUpItem[] items)](#DocumentNUp-com.aspose.xps.metadata.NUp.INUpItem...-) | Создаёт новый экземпляр. |
## Методы

| Метод | Описание |
| --- | --- |
| [add(IFeatureItem[] items)](#add-com.aspose.xps.metadata.IFeatureItem...-) | Добавляет список элементов в конец списка элементов этой функции. |
| [addPagesPerSheetOption(int value)](#addPagesPerSheetOption-int-) | Добавляет параметр со значением свойства PagesPerSheet. |
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
### DocumentNUp(NUp.INUpItem[] items) {#DocumentNUp-com.aspose.xps.metadata.NUp.INUpItem...-}
```
public DocumentNUp(NUp.INUpItem[] items)
```


Создаёт новый экземпляр.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| items | [INUpItem\[\]](../../com.aspose.xps.metadata/inupitem) | Массив элементов, специфичных для функции. |

### add(IFeatureItem[] items) {#add-com.aspose.xps.metadata.IFeatureItem...-}
```
public void add(IFeatureItem[] items)
```


Добавляет список элементов в конец списка элементов этой функции. Каждый элемент должен быть экземпляром  Feature ,  Option  или  Property .

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| items | [IFeatureItem\[\]](../../com.aspose.xps.metadata/ifeatureitem) | Список элементов для добавления. |

### addPagesPerSheetOption(int value) {#addPagesPerSheetOption-int-}
```
public DocumentNUp addPagesPerSheetOption(int value)
```


Добавляет параметр со значением свойства PagesPerSheet. Указывает количество логических страниц на физический лист.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
|  | значение | int | A |

```
PagesPerSheet
```

оценочное значение свойства. Поддерживаемый набор может быть любым набором целых чисел, например \{1,2,4,6,8,9,16\}. |

**Returns:**
[DocumentNUp](../../com.aspose.xps.metadata/documentnup) - This feature instance.
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

