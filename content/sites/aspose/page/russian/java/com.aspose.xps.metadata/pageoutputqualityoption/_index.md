---
title: "PageOutputQuality.PageOutputQualityOption"
second_title: "Справочник API Aspose.Page для Java"
description: "Определяет параметры функции PageOutputQuality."
type: docs
weight: 10
url: /ru/java/com.aspose.xps.metadata/pageoutputquality.pageoutputqualityoption/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Option](../../com.aspose.xps.metadata/option)
```
public static final class PageOutputQuality.PageOutputQualityOption extends Option
```

Определяет  PageOutputQuality  опции функции.
## Поля

| Поле | Описание |
| --- | --- |
| [Automatic](#Automatic) | Указывает намерение автоматического вывода (позволяет клиенту автоматически выбирать наилучшие настройки). |
| [Draft](#Draft) | Указывает намерение чернового вывода (сбалансировано для текста и графики чернового качества). |
| [Fax](#Fax) | Указывает намерение вывода факса (сбалансировано для стандартного качества факса). |
| [High](#High) | Указывает намерение вывода высокого качества (сбалансировано для текста и графики высокого качества). |
| [Normal](#Normal) | Указывает цель обычного вывода (сбалансированного для хорошего качества текста и графики). |
| [Photographic](#Photographic) | Указывает цель фотовывода (изображения должны иметь наивысшее качество). |
| [Text](#Text) | Указывает цель вывода только текста (графика может выводиться плохо или вовсе не выводиться). |
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
### Automatic {#Automatic}
```
public static PageOutputQuality.PageOutputQualityOption Automatic
```


Указывает намерение автоматического вывода (позволяет клиенту автоматически выбирать наилучшие настройки).

### Draft {#Draft}
```
public static PageOutputQuality.PageOutputQualityOption Draft
```


Указывает намерение чернового вывода (сбалансировано для текста и графики чернового качества).

### Fax {#Fax}
```
public static PageOutputQuality.PageOutputQualityOption Fax
```


Указывает намерение вывода факса (сбалансировано для стандартного качества факса).

### High {#High}
```
public static PageOutputQuality.PageOutputQualityOption High
```


Указывает намерение вывода высокого качества (сбалансировано для текста и графики высокого качества).

### Normal {#Normal}
```
public static PageOutputQuality.PageOutputQualityOption Normal
```


Указывает цель обычного вывода (сбалансированного для хорошего качества текста и графики).

### Photographic {#Photographic}
```
public static PageOutputQuality.PageOutputQualityOption Photographic
```


Указывает цель фотовывода (изображения должны иметь наивысшее качество).

### Text {#Text}
```
public static PageOutputQuality.PageOutputQualityOption Text
```


Указывает цель вывода только текста (графика может выводиться плохо или вовсе не выводиться).

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

