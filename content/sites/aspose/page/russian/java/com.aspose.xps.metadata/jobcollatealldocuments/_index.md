---
title: "JobCollateAllDocuments"
second_title: "Справочник API Aspose.Page для Java"
description: "Описывает характеристики сортировки вывода."
type: docs
weight: 47
url: /ru/java/com.aspose.xps.metadata/jobcollatealldocuments/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Feature](../../com.aspose.xps.metadata/feature), [com.aspose.xps.metadata.Collate](../../com.aspose.xps.metadata/collate)

**All Implemented Interfaces:**
[com.aspose.xps.metadata.IJobPrintTicketItem](../../com.aspose.xps.metadata/ijobprintticketitem)
```
public final class JobCollateAllDocuments extends Collate implements IJobPrintTicketItem
```

Описывает характеристики сортировки вывода. Все документы в каждом отдельном задании сортируются.  DocumentCollate  и  JobCollateAllDocuments  взаимно исключают друг друга. Поведение и реализация того, реализованы ли оба или только один из этих ключевых слов, оставляются на усмотрение драйвера. https://docs.microsoft.com/en-us/windows/win32/printdocs/jobcollatealldocuments
## Конструкторы

| Конструктор | Описание |
| --- | --- |
| [JobCollateAllDocuments(Collate.CollateOption[] options)](#JobCollateAllDocuments-com.aspose.xps.metadata.Collate.CollateOption...-) | Создаёт новый экземпляр. |
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
### JobCollateAllDocuments(Collate.CollateOption[] options) {#JobCollateAllDocuments-com.aspose.xps.metadata.Collate.CollateOption...-}
```
public JobCollateAllDocuments(Collate.CollateOption[] options)
```


Создаёт новый экземпляр.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| options | [CollateOption\[\]](../../com.aspose.xps.metadata/collateoption) | Массив параметров, специфичных для функции. |

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

