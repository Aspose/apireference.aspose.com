---
title: "PageOutputColor.PageOutputColorOption"
second_title: "Справочник API Aspose.Page для Java"
description: "Описывает варианты функции PageOutputColor."
type: docs
weight: 10
url: /ru/java/com.aspose.xps.metadata/pageoutputcolor.pageoutputcoloroption/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Option](../../com.aspose.xps.metadata/option)

**All Implemented Interfaces:**
[com.aspose.xps.metadata.PageOutputColor.IPageOutputColorItem](../../com.aspose.xps.metadata/ipageoutputcoloritem)
```
public static final class PageOutputColor.PageOutputColorOption extends Option implements PageOutputColor.IPageOutputColorItem
```

Описывает параметры функции  PageOutputColor .
## Конструкторы

| Конструктор | Описание |
| --- | --- |
| [PageOutputColorOption(String optionName, PageOutputColor.IPageOutputColorOptionItem[] items)](#PageOutputColorOption-java.lang.String-com.aspose.xps.metadata.PageOutputColor.IPageOutputColorOptionItem...-) | Создаёт новый экземпляр. |
## Методы

| Метод | Описание |
| --- | --- |
| [Color(int deviceBitsPerPixel, int driverBitsPerPixel)](#Color-int-int-) | Указывает, что вывод должен быть цветным. |
| [Grayscale(int deviceBitsPerPixel, int driverBitsPerPixel)](#Grayscale-int-int-) | Указывает, что вывод должен быть в градациях серого. |
| [Monochrome(int deviceBitsPerPixel, int driverBitsPerPixel)](#Monochrome-int-int-) | Указывает, что вывод должен быть монохромным (чёрный). |
| [add(IOptionItem[] items)](#add-com.aspose.xps.metadata.IOptionItem...-) | Добавляет список элементов в конец списка элементов этой опции. |
| [add(PageOutputColor.IPageOutputColorOptionItem[] items)](#add-com.aspose.xps.metadata.PageOutputColor.IPageOutputColorOptionItem...-) | Добавляет массив экземпляров IPageOutputColorOptionItem к параметру. |
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
### PageOutputColorOption(String optionName, PageOutputColor.IPageOutputColorOptionItem[] items) {#PageOutputColorOption-java.lang.String-com.aspose.xps.metadata.PageOutputColor.IPageOutputColorOptionItem...-}
```
public PageOutputColorOption(String optionName, PageOutputColor.IPageOutputColorOptionItem[] items)
```


Создаёт новый экземпляр.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| optionName | java.lang.String | Имя параметра. |
| items | [IPageOutputColorOptionItem\[\]](../../com.aspose.xps.metadata/ipageoutputcoloroptionitem) | Произвольный массив экземпляров IPageOutputColorOptionItem. |

### Color(int deviceBitsPerPixel, int driverBitsPerPixel) {#Color-int-int-}
```
public static final PageOutputColor.PageOutputColorOption Color(int deviceBitsPerPixel, int driverBitsPerPixel)
```


Указывает, что вывод должен быть цветным.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| deviceBitsPerPixel | int | Значение свойства DeviceBitsPerPixel, указывающее количество бит на пиксель цветных данных, поддерживаемое принтером. |
| driverBitsPerPixel | int | Значение свойства DriverBitsPerPixel, указывающее количество бит на пиксель, которое основной драйвер должен использовать для своего буфера рендеринга битмапа. |

**Returns:**
[PageOutputColorOption](../../com.aspose.xps.metadata/pageoutputcoloroption) - The  PageOutputColor  options.
### Grayscale(int deviceBitsPerPixel, int driverBitsPerPixel) {#Grayscale-int-int-}
```
public static final PageOutputColor.PageOutputColorOption Grayscale(int deviceBitsPerPixel, int driverBitsPerPixel)
```


Указывает, что вывод должен быть в градациях серого.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| deviceBitsPerPixel | int | Значение свойства DeviceBitsPerPixel, указывающее количество бит на пиксель цветных данных, поддерживаемое принтером. |
| driverBitsPerPixel | int | Значение свойства DriverBitsPerPixel, указывающее количество бит на пиксель, которое основной драйвер должен использовать для своего буфера рендеринга битмапа. |

**Returns:**
[PageOutputColorOption](../../com.aspose.xps.metadata/pageoutputcoloroption) - The  PageOutputColor  options.
### Monochrome(int deviceBitsPerPixel, int driverBitsPerPixel) {#Monochrome-int-int-}
```
public static final PageOutputColor.PageOutputColorOption Monochrome(int deviceBitsPerPixel, int driverBitsPerPixel)
```


Указывает, что вывод должен быть монохромным (чёрный).

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| deviceBitsPerPixel | int | Значение свойства DeviceBitsPerPixel, указывающее количество бит на пиксель цветных данных, поддерживаемое принтером. |
| driverBitsPerPixel | int | Значение свойства DriverBitsPerPixel, указывающее количество бит на пиксель, которое основной драйвер должен использовать для своего буфера рендеринга битмапа. |

**Returns:**
[PageOutputColorOption](../../com.aspose.xps.metadata/pageoutputcoloroption) - The  PageOutputColor  options.
### add(IOptionItem[] items) {#add-com.aspose.xps.metadata.IOptionItem...-}
```
public void add(IOptionItem[] items)
```


Добавляет список элементов в конец списка элементов этой опции. Каждый из них должен быть экземпляром  ScoredProperty  или  Property  instance.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| items | [IOptionItem\[\]](../../com.aspose.xps.metadata/ioptionitem) | Список элементов для добавления. |

### add(PageOutputColor.IPageOutputColorOptionItem[] items) {#add-com.aspose.xps.metadata.PageOutputColor.IPageOutputColorOptionItem...-}
```
public PageOutputColor.PageOutputColorOption add(PageOutputColor.IPageOutputColorOptionItem[] items)
```


Добавляет массив экземпляров IPageOutputColorOptionItem к параметру.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| items | [IPageOutputColorOptionItem\[\]](../../com.aspose.xps.metadata/ipageoutputcoloroptionitem) | Произвольный массив экземпляров IPageOutputColorOptionItem. |

**Returns:**
[PageOutputColorOption](../../com.aspose.xps.metadata/pageoutputcoloroption) - This options instance.
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

