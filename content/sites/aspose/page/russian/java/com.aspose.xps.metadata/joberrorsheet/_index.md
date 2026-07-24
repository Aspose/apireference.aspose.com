---
title: "JobErrorSheet"
second_title: "Справочник API Aspose.Page для Java"
description: "Описывает вывод листа ошибок."
type: docs
weight: 53
url: /ru/java/com.aspose.xps.metadata/joberrorsheet/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Feature](../../com.aspose.xps.metadata/feature)

**All Implemented Interfaces:**
[com.aspose.xps.metadata.IJobPrintTicketItem](../../com.aspose.xps.metadata/ijobprintticketitem)
```
public final class JobErrorSheet extends Feature implements IJobPrintTicketItem
```

Описывает вывод листа ошибки. Вся задача будет иметь один лист ошибки. Лист ошибки должен выводиться на значение по умолчанию  PageMediaSize  и с использованием значения по умолчанию  PageMediaType . Лист ошибки должен быть изолирован от остальной части задачи. Это означает, что любые варианты отделки или обработки (например,  JobDuplex ,  JobStaple , или  JobBinding ) не должны включать лист ошибки. Лист ошибки должен быть последним листом задачи. https://docs.microsoft.com/en-us/windows/win32/printdocs/joberrorsheet
## Конструкторы

| Конструктор | Описание |
| --- | --- |
| [JobErrorSheet(JobErrorSheet.IJobErrorSheetItem[] items)](#JobErrorSheet-com.aspose.xps.metadata.JobErrorSheet.IJobErrorSheetItem...-) | Создаёт новый экземпляр. |
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
### JobErrorSheet(JobErrorSheet.IJobErrorSheetItem[] items) {#JobErrorSheet-com.aspose.xps.metadata.JobErrorSheet.IJobErrorSheetItem...-}
```
public JobErrorSheet(JobErrorSheet.IJobErrorSheetItem[] items)
```


Создаёт новый экземпляр.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| items | [IJobErrorSheetItem\[\]](../../com.aspose.xps.metadata/ijoberrorsheetitem) | Массив элементов, специфичных для функции. |

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

