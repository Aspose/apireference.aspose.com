---
title: "DocumentCoverBack"
second_title: "Справочник API Aspose.Page для Java"
description: "Описывает заднюю (конечную) обложку листа."
type: docs
weight: 19
url: /ru/java/com.aspose.xps.metadata/documentcoverback/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Feature](../../com.aspose.xps.metadata/feature)

**All Implemented Interfaces:**
[com.aspose.xps.metadata.IJobPrintTicketItem](../../com.aspose.xps.metadata/ijobprintticketitem), [com.aspose.xps.metadata.IDocumentPrintTicketItem](../../com.aspose.xps.metadata/idocumentprintticketitem)
```
public final class DocumentCoverBack extends Feature implements IJobPrintTicketItem, IDocumentPrintTicketItem
```

Описывает заднюю (конечную) обложку. Каждый документ будет иметь отдельный лист. Обложка должна печататься на  PageMediaSize  и  PageMediaType , используемых для последней страницы документа. Обложка должна быть интегрирована в параметры обработки (например,  DocumentDuplex ,  DocumentNUp ), как указано в выбранной опции. https://docs.microsoft.com/en-us/windows/win32/printdocs/documentcoverback
## Конструкторы

| Конструктор | Описание |
| --- | --- |
| [DocumentCoverBack(DocumentCoverBack.CoverBackOption[] options)](#DocumentCoverBack-com.aspose.xps.metadata.DocumentCoverBack.CoverBackOption...-) | Создаёт новый экземпляр. |
## Методы

| Метод | Описание |
| --- | --- |
| [add(IFeatureItem[] items)](#add-com.aspose.xps.metadata.IFeatureItem...-) | Добавляет список элементов в конец списка элементов этой функции. |
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
### DocumentCoverBack(DocumentCoverBack.CoverBackOption[] options) {#DocumentCoverBack-com.aspose.xps.metadata.DocumentCoverBack.CoverBackOption...-}
```
public DocumentCoverBack(DocumentCoverBack.CoverBackOption[] options)
```


Создаёт новый экземпляр.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| options | [CoverBackOption\[\]](../../com.aspose.xps.metadata/coverbackoption) | Массив параметров, специфичных для функции. |

### add(IFeatureItem[] items) {#add-com.aspose.xps.metadata.IFeatureItem...-}
```
public void add(IFeatureItem[] items)
```


Добавляет список элементов в конец списка элементов этой функции. Каждый элемент должен быть экземпляром  Feature ,  Option  или  Property .

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| items | [IFeatureItem\[\]](../../com.aspose.xps.metadata/ifeatureitem) | Список элементов для добавления. |

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

