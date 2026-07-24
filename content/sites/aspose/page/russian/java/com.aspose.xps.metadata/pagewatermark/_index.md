---
title: "PageWatermark"
second_title: "Справочник API Aspose.Page для Java"
description: "Описывает настройку водяного знака вывода и характеристики водяного знака."
type: docs
weight: 131
url: /ru/java/com.aspose.xps.metadata/pagewatermark/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Feature](../../com.aspose.xps.metadata/feature)

**All Implemented Interfaces:**
[com.aspose.xps.metadata.IJobPrintTicketItem](../../com.aspose.xps.metadata/ijobprintticketitem), [com.aspose.xps.metadata.IDocumentPrintTicketItem](../../com.aspose.xps.metadata/idocumentprintticketitem), [com.aspose.xps.metadata.IPagePrintTicketItem](../../com.aspose.xps.metadata/ipageprintticketitem)
```
public final class PageWatermark extends Feature implements IJobPrintTicketItem, IDocumentPrintTicketItem, IPagePrintTicketItem
```

Описывает настройки водяного знака вывода и характеристики водяного знака. Водяные знаки применяются к логической странице, а не к физической странице. Например, если  DocumentDuplex  включен, водяной знак будет отображаться на каждой странице  NUp  на каждом листе. Если  DocumentDuplex ,  PagesPerSheet =2, то каждый лист будет иметь 2 водяных знака. https://docs.microsoft.com/en-us/windows/win32/printdocs/pagewatermark
## Конструкторы

| Конструктор | Описание |
| --- | --- |
| [PageWatermark(PageWatermark.IPageWatermarkItem[] items)](#PageWatermark-com.aspose.xps.metadata.PageWatermark.IPageWatermarkItem...-) | Создаёт новый экземпляр. |
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
### PageWatermark(PageWatermark.IPageWatermarkItem[] items) {#PageWatermark-com.aspose.xps.metadata.PageWatermark.IPageWatermarkItem...-}
```
public PageWatermark(PageWatermark.IPageWatermarkItem[] items)
```


Создаёт новый экземпляр.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| items | [IPageWatermarkItem\[\]](../../com.aspose.xps.metadata/ipagewatermarkitem) | Массив элементов, специфичных для функции. |

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

