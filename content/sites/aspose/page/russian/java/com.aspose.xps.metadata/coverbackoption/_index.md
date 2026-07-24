---
title: "JobPrimaryCoverBack.CoverBackOption"
second_title: "Справочник API Aspose.Page для Java"
description: "Описывает параметры функции JobPrimaryCoverBack."
type: docs
weight: 10
url: /ru/java/com.aspose.xps.metadata/jobprimarycoverback.coverbackoption/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Option](../../com.aspose.xps.metadata/option)
```
public static final class JobPrimaryCoverBack.CoverBackOption extends Option
```

Описывает параметры функции  JobPrimaryCoverBack .
## Поля

| Поле | Описание |
| --- | --- |
| [BlankCover](#BlankCover) | Указывает, что должна быть напечатана пустая обложка. |
| [NoCover](#NoCover) | Указывает, что обложка не будет выводиться. |
| [PrintBack](#PrintBack) | Указывает, что обложка, указанная в "CoverBackSource", должна быть напечатана на обратной стороне листа обложки. |
| [PrintBoth](#PrintBoth) | Указывает, что обложка, указанная в "CoverBackSource", может быть напечатана на любой из сторон листа обложки. |
| [PrintFront](#PrintFront) | Указывает, что обложка, указанная в "CoverBackSource", должна быть напечатана на передней стороне листа обложки. |
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
### BlankCover {#BlankCover}
```
public static final JobPrimaryCoverBack.CoverBackOption BlankCover
```


Указывает, что должна быть напечатана пустая обложка.

### NoCover {#NoCover}
```
public static final JobPrimaryCoverBack.CoverBackOption NoCover
```


Указывает, что обложка не будет выводиться.

### PrintBack {#PrintBack}
```
public static final JobPrimaryCoverBack.CoverBackOption PrintBack
```


Указывает, что обложка, указанная в "CoverBackSource", должна быть напечатана на обратной стороне листа обложки. Если элемент  JobPrimaryCoverBackSource   ParameterInit  не указан, эту опцию следует игнорировать.

### PrintBoth {#PrintBoth}
```
public static final JobPrimaryCoverBack.CoverBackOption PrintBoth
```


Указывает, что обложка, указанная в "CoverBackSource", может быть напечатана на любой из сторон листа обложки. Если элемент  JobPrimaryCoverBackSource   ParameterInit  не указан, эту опцию следует игнорировать.

### PrintFront {#PrintFront}
```
public static final JobPrimaryCoverBack.CoverBackOption PrintFront
```


Указывает, что обложка, указанная в "CoverBackSource", должна быть напечатана на передней стороне листа обложки. Если элемент  JobPrimaryCoverBackSource   ParameterInit  не указан, эту опцию следует игнорировать.

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

