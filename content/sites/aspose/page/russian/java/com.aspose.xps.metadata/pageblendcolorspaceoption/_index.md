---
title: "PageBlendColorSpace.PageBlendColorSpaceOption"
second_title: "Справочник API Aspose.Page для Java"
description: "Описывает параметры функции PageBlendColorSpace."
type: docs
weight: 10
url: /ru/java/com.aspose.xps.metadata/pageblendcolorspace.pageblendcolorspaceoption/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Option](../../com.aspose.xps.metadata/option)
```
public static final class PageBlendColorSpace.PageBlendColorSpaceOption extends Option
```

Описывает параметры функции PageBlendColorSpace.
## Поля

| Поле | Описание |
| --- | --- |
| [ICCProfile](#ICCProfile) | Указывает ICC‑профиль, определяющий цветовое пространство, которое ДОЛЖНО использоваться для смешивания. |
| [sRGB](#sRGB) | Для смешивания ДОЛЖНО использоваться цветовое пространство sRGB. |
| [scRGB](#scRGB) | Для смешивания ДОЛЖНО использоваться цветовое пространство scRGB. |
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
### ICCProfile {#ICCProfile}
```
public static PageBlendColorSpace.PageBlendColorSpaceOption ICCProfile
```


Указывает ICC‑профиль, определяющий цветовое пространство, которое ДОЛЖНО использоваться для смешивания. Примечание: Это применяется только к документам XPS и не должно использоваться в произвольных PrintTicket‑ах.

### sRGB {#sRGB}
```
public static PageBlendColorSpace.PageBlendColorSpaceOption sRGB
```


Для смешивания ДОЛЖНО использоваться цветовое пространство sRGB.

### scRGB {#scRGB}
```
public static PageBlendColorSpace.PageBlendColorSpaceOption scRGB
```


Для смешивания ДОЛЖНО использоваться цветовое пространство scRGB.

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

