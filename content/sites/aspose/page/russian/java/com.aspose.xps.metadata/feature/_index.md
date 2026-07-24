---
title: "Функция"
second_title: "Справочник API Aspose.Page для Java"
description: "Класс, который инкапсулирует общую функцию Print Schema."
type: docs
weight: 38
url: /ru/java/com.aspose.xps.metadata/feature/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement)

**All Implemented Interfaces:**
[com.aspose.xps.metadata.IPrintTicketItem](../../com.aspose.xps.metadata/iprintticketitem), [com.aspose.xps.metadata.IFeatureItem](../../com.aspose.xps.metadata/ifeatureitem)
```
public class Feature extends CompositePrintTicketElement implements IPrintTicketItem, IFeatureItem
```

Класс, инкапсулирующий общую функцию Print Schema. Базовый класс для всех функций, определённых схемой. Элемент  Feature  содержит полный список элементов  Option  и  Property  , полностью описывающих атрибут устройства, настройку форматирования задания или другую соответствующую характеристику. https://docs.microsoft.com/en-us/windows/win32/printdocs/feature
## Конструкторы

| Конструктор | Описание |
| --- | --- |
| [Feature(String name, Option option, IFeatureItem[] items)](#Feature-java.lang.String-com.aspose.xps.metadata.Option-com.aspose.xps.metadata.IFeatureItem...-) | Создаёт новый экземпляр функции PrintTicket. |
| [Feature(String name, Feature feature, IFeatureItem[] items)](#Feature-java.lang.String-com.aspose.xps.metadata.Feature-com.aspose.xps.metadata.IFeatureItem...-) | Создаёт новый экземпляр функции PrintTicket. |
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
### Feature(String name, Option option, IFeatureItem[] items) {#Feature-java.lang.String-com.aspose.xps.metadata.Option-com.aspose.xps.metadata.IFeatureItem...-}
```
public Feature(String name, Option option, IFeatureItem[] items)
```


Создаёт новый экземпляр функции PrintTicket.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| имя | java.lang.String | Имя функции. |
| option | [Option](../../com.aspose.xps.metadata/option) | Требуемый  Option  экземпляр. |
| items | [IFeatureItem\[\]](../../com.aspose.xps.metadata/ifeatureitem) | Произвольный массив экземпляров  IFeatureItem  . Каждый из них должен быть экземпляром  Feature ,  Option  или  Property  . |

### Feature(String name, Feature feature, IFeatureItem[] items) {#Feature-java.lang.String-com.aspose.xps.metadata.Feature-com.aspose.xps.metadata.IFeatureItem...-}
```
public Feature(String name, Feature feature, IFeatureItem[] items)
```


Создаёт новый экземпляр функции PrintTicket.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| имя | java.lang.String | Имя функции. |
| feature | [Feature](../../com.aspose.xps.metadata/feature) | Требуемый экземпляр Feature. |
| items | [IFeatureItem\[\]](../../com.aspose.xps.metadata/ifeatureitem) | Произвольный массив экземпляров Property. Каждый элемент должен быть экземпляром Feature, Option или Property. |

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

