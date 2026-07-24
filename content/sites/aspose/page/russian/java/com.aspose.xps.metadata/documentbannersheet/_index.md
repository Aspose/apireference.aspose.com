---
title: "DocumentBannerSheet"
second_title: "Справочник API Aspose.Page для Java"
description: "Описывает лист‑баннер, который будет выводиться для конкретного документа."
type: docs
weight: 13
url: /ru/java/com.aspose.xps.metadata/documentbannersheet/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Feature](../../com.aspose.xps.metadata/feature)

**All Implemented Interfaces:**
[com.aspose.xps.metadata.IJobPrintTicketItem](../../com.aspose.xps.metadata/ijobprintticketitem), [com.aspose.xps.metadata.IDocumentPrintTicketItem](../../com.aspose.xps.metadata/idocumentprintticketitem)
```
public final class DocumentBannerSheet extends Feature implements IJobPrintTicketItem, IDocumentPrintTicketItem
```

Описывает лист‑баннер, который выводится для конкретного документа. Лист‑баннер должен выводиться с использованием значения по умолчанию  PageMediaSize  и значения по умолчанию  PageMediaType . Лист‑баннер также должен быть изолирован от остальной части задания. Это означает, что любые параметры завершения или обработки (например,  DocumentDuplex ,  DocumentStaple , или  DocumentBinding ) не должны включать лист‑баннер. Лист‑баннер может быть изолирован или не изолирован от остальной части задания. Это означает, что любые параметры завершения или обработки задания могут включать лист‑баннер документа. Лист‑баннер должен быть первой страницей документа. https://docs.microsoft.com/en-us/windows/win32/printdocs/documentbannersheet
## Конструкторы

| Конструктор | Описание |
| --- | --- |
| [DocumentBannerSheet(DocumentBannerSheet.BannerSheetOption[] options)](#DocumentBannerSheet-com.aspose.xps.metadata.DocumentBannerSheet.BannerSheetOption...-) | Создаёт новый экземпляр. |
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
### DocumentBannerSheet(DocumentBannerSheet.BannerSheetOption[] options) {#DocumentBannerSheet-com.aspose.xps.metadata.DocumentBannerSheet.BannerSheetOption...-}
```
public DocumentBannerSheet(DocumentBannerSheet.BannerSheetOption[] options)
```


Создаёт новый экземпляр.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| options | [BannerSheetOption\[\]](../../com.aspose.xps.metadata/bannersheetoption) | Массив параметров, специфичных для функции. |

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

