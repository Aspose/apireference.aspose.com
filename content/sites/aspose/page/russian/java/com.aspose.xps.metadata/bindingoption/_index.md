---
title: "JobBindAllDocuments.BindingOption"
second_title: "Справочник API Aspose.Page для Java"
description: "Описывает параметры функции JobBindAllDocuments."
type: docs
weight: 11
url: /ru/java/com.aspose.xps.metadata/jobbindalldocuments.bindingoption/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Option](../../com.aspose.xps.metadata/option)
```
public static final class JobBindAllDocuments.BindingOption extends Option
```

Описывает параметры функции JobBindAllDocuments.
## Конструкторы

| Конструктор | Описание |
| --- | --- |
| [BindingOption(String name, JobBindAllDocuments.IBindingOptionItem[] items)](#BindingOption-java.lang.String-com.aspose.xps.metadata.JobBindAllDocuments.IBindingOptionItem...-) | Создаёт новый экземпляр. |
## Поля

| Поле | Описание |
| --- | --- |
| [Bale](#Bale) | Указывает привязку к связке. |
| [BindBottom](#BindBottom) | Указывает привязку вдоль нижнего края. |
| [BindLeft](#BindLeft) | Указывает привязку вдоль левого края. |
| [BindRight](#BindRight) | Указывает привязку вдоль правого края. |
| [BindTop](#BindTop) | Указывает привязку вдоль верхнего края. |
| [Booklet](#Booklet) | Указывает привязку брошюры. |
| [EdgeStitchBottom](#EdgeStitchBottom) | Указывает прошивку кромки вдоль нижнего края. |
| [EdgeStitchLeft](#EdgeStitchLeft) | Указывает прошивку кромки вдоль левого края. |
| [EdgeStitchRight](#EdgeStitchRight) | Указывает прошивку кромки вдоль правого края. |
| [EdgeStitchTop](#EdgeStitchTop) | Указывает прошивку кромки вдоль верхнего края. |
| [Fold](#Fold) | Указывает сложенную привязку. |
| [JogOffset](#JogOffset) | Указывает привязку с смещением. |
| [None](#None) | Указывает отсутствие привязки. |
| [Trim](#Trim) | Указывает обрезную привязку. |
## Методы

| Метод | Описание |
| --- | --- |
| [add(IOptionItem[] items)](#add-com.aspose.xps.metadata.IOptionItem...-) | Добавляет список элементов в конец списка элементов этой опции. |
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
### BindingOption(String name, JobBindAllDocuments.IBindingOptionItem[] items) {#BindingOption-java.lang.String-com.aspose.xps.metadata.JobBindAllDocuments.IBindingOptionItem...-}
```
public BindingOption(String name, JobBindAllDocuments.IBindingOptionItem[] items)
```


Создаёт новый экземпляр.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| имя | java.lang.String | Имя параметра. |
| items | [IBindingOptionItem\[\]](../../com.aspose.xps.metadata/ibindingoptionitem) | Массив допустимых дочерних элементов. |

### Bale {#Bale}
```
public static final JobBindAllDocuments.BindingOption Bale
```


Указывает привязку к связке.

### BindBottom {#BindBottom}
```
public static final JobBindAllDocuments.BindingOption BindBottom
```


Указывает привязку вдоль нижнего края.

### BindLeft {#BindLeft}
```
public static final JobBindAllDocuments.BindingOption BindLeft
```


Указывает привязку вдоль левого края.

### BindRight {#BindRight}
```
public static final JobBindAllDocuments.BindingOption BindRight
```


Указывает привязку вдоль правого края.

### BindTop {#BindTop}
```
public static final JobBindAllDocuments.BindingOption BindTop
```


Указывает привязку вдоль верхнего края.

### Booklet {#Booklet}
```
public static final JobBindAllDocuments.BindingOption Booklet
```


Указывает привязку брошюры.

### EdgeStitchBottom {#EdgeStitchBottom}
```
public static final JobBindAllDocuments.BindingOption EdgeStitchBottom
```


Указывает прошивку кромки вдоль нижнего края.

### EdgeStitchLeft {#EdgeStitchLeft}
```
public static final JobBindAllDocuments.BindingOption EdgeStitchLeft
```


Указывает прошивку кромки вдоль левого края.

### EdgeStitchRight {#EdgeStitchRight}
```
public static final JobBindAllDocuments.BindingOption EdgeStitchRight
```


Указывает прошивку кромки вдоль правого края.

### EdgeStitchTop {#EdgeStitchTop}
```
public static final JobBindAllDocuments.BindingOption EdgeStitchTop
```


Указывает прошивку кромки вдоль верхнего края.

### Fold {#Fold}
```
public static final JobBindAllDocuments.BindingOption Fold
```


Указывает сложенную привязку.

### JogOffset {#JogOffset}
```
public static final JobBindAllDocuments.BindingOption JogOffset
```


Указывает привязку с смещением.

### None {#None}
```
public static final JobBindAllDocuments.BindingOption None
```


Указывает отсутствие привязки.

### Trim {#Trim}
```
public static final JobBindAllDocuments.BindingOption Trim
```


Указывает обрезную привязку.

### add(IOptionItem[] items) {#add-com.aspose.xps.metadata.IOptionItem...-}
```
public void add(IOptionItem[] items)
```


Добавляет список элементов в конец списка элементов этой опции. Каждый из них должен быть экземпляром  ScoredProperty  или  Property  instance.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| items | [IOptionItem\[\]](../../com.aspose.xps.metadata/ioptionitem) | Список элементов для добавления. |

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

