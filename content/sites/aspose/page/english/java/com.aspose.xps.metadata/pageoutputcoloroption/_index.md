---
title: PageOutputColor.PageOutputColorOption
second_title: Aspose.Page for Java API Reference
description: Describes the PageOutputColor feature options.
type: docs
weight: 10
url: /java/com.aspose.xps.metadata/pageoutputcolor.pageoutputcoloroption/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Option](../../com.aspose.xps.metadata/option)

**All Implemented Interfaces:**
[com.aspose.xps.metadata.PageOutputColor.IPageOutputColorItem](../../com.aspose.xps.metadata/ipageoutputcoloritem)
```
public static final class PageOutputColor.PageOutputColorOption extends Option implements PageOutputColor.IPageOutputColorItem
```

Describes the  PageOutputColor  feature options.
## Constructors

| Constructor | Description |
| --- | --- |
| [PageOutputColorOption(String optionName, PageOutputColor.IPageOutputColorOptionItem[] items)](#PageOutputColorOption-java.lang.String-com.aspose.xps.metadata.PageOutputColor.IPageOutputColorOptionItem...-) | Creates a new instance. |
| [PageOutputColorOption(PageOutputColor.PageOutputColorOption option)](#PageOutputColorOption-com.aspose.xps.metadata.PageOutputColor.PageOutputColorOption-) | Clones this option instance. |
## Fields

| Field | Description |
| --- | --- |
| [Color](#Color) | Specifies the output should be in color. |
| [Grayscale](#Grayscale) | Specifies the output should be in grayscale. |
| [Monochrome](#Monochrome) | Specifies the output should be in monochrome (Black). |
## Methods

| Method | Description |
| --- | --- |
| [add(IOptionItem[] items)](#add-com.aspose.xps.metadata.IOptionItem...-) | Adds a list of items to the end of this option's item list. |
| [add(PageOutputColor.IPageOutputColorOptionItem[] items)](#add-com.aspose.xps.metadata.PageOutputColor.IPageOutputColorOptionItem...-) | Adds an array of  IPageOutputColorOptionItem  instances to the option. |
| [clone()](#clone--) | Clones this option instance. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getName()](#getName--) | Gets the element name. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setDeviceBitsPerPixel(int deviceBitsPerPixel)](#setDeviceBitsPerPixel-int-) | Sets a  DeviceBitsPerPixel  scored property value. |
| [setDriverBitsPerPixel(int driverBitsPerPixel)](#setDriverBitsPerPixel-int-) | Sets a  DriverBitsPerPixel  scored property value. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### PageOutputColorOption(String optionName, PageOutputColor.IPageOutputColorOptionItem[] items) {#PageOutputColorOption-java.lang.String-com.aspose.xps.metadata.PageOutputColor.IPageOutputColorOptionItem...-}
```
public PageOutputColorOption(String optionName, PageOutputColor.IPageOutputColorOptionItem[] items)
```


Creates a new instance.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| optionName | java.lang.String | An options name. |
| items | [IPageOutputColorOptionItem\[\]](../../com.aspose.xps.metadata/ipageoutputcoloroptionitem) | An arbitrary array of  IPageOutputColorOptionItem  instances. |

### PageOutputColorOption(PageOutputColor.PageOutputColorOption option) {#PageOutputColorOption-com.aspose.xps.metadata.PageOutputColor.PageOutputColorOption-}
```
public PageOutputColorOption(PageOutputColor.PageOutputColorOption option)
```


Clones this option instance.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| option | [PageOutputColorOption](../../com.aspose.xps.metadata/pageoutputcoloroption) | An instance to clone. |

### Color {#Color}
```
public static PageOutputColor.PageOutputColorOption Color
```


Specifies the output should be in color.

### Grayscale {#Grayscale}
```
public static PageOutputColor.PageOutputColorOption Grayscale
```


Specifies the output should be in grayscale.

### Monochrome {#Monochrome}
```
public static PageOutputColor.PageOutputColorOption Monochrome
```


Specifies the output should be in monochrome (Black).

### add(IOptionItem[] items) {#add-com.aspose.xps.metadata.IOptionItem...-}
```
public void add(IOptionItem[] items)
```


Adds a list of items to the end of this option's item list. Each one must be a  ScoredProperty  or a  Property  instance.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| items | [IOptionItem\[\]](../../com.aspose.xps.metadata/ioptionitem) | List of items to add. |

### add(PageOutputColor.IPageOutputColorOptionItem[] items) {#add-com.aspose.xps.metadata.PageOutputColor.IPageOutputColorOptionItem...-}
```
public PageOutputColor.PageOutputColorOption add(PageOutputColor.IPageOutputColorOptionItem[] items)
```


Adds an array of  IPageOutputColorOptionItem  instances to the option.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| items | [IPageOutputColorOptionItem\[\]](../../com.aspose.xps.metadata/ipageoutputcoloroptionitem) | An arbitrary array of  IPageOutputColorOptionItem  instances. |

**Returns:**
[PageOutputColorOption](../../com.aspose.xps.metadata/pageoutputcoloroption) - This options instance.
### clone() {#clone--}
```
public PageOutputColor.PageOutputColorOption clone()
```


Clones this option instance. The shortcut to the cloneing constructor.

**Returns:**
[PageOutputColorOption](../../com.aspose.xps.metadata/pageoutputcoloroption) - The clone of this option instance.
### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| Parameter | Type | Description |
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


Gets the element name.

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




### setDeviceBitsPerPixel(int deviceBitsPerPixel) {#setDeviceBitsPerPixel-int-}
```
public PageOutputColor.PageOutputColorOption setDeviceBitsPerPixel(int deviceBitsPerPixel)
```


Sets a  DeviceBitsPerPixel  scored property value.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| deviceBitsPerPixel | int | A  DeviceBitsPerPixel  scored property value. |

**Returns:**
[PageOutputColorOption](../../com.aspose.xps.metadata/pageoutputcoloroption) - This option instance.
### setDriverBitsPerPixel(int driverBitsPerPixel) {#setDriverBitsPerPixel-int-}
```
public PageOutputColor.PageOutputColorOption setDriverBitsPerPixel(int driverBitsPerPixel)
```


Sets a  DriverBitsPerPixel  scored property value.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| driverBitsPerPixel | int | A  DriverBitsPerPixel  scored property value. |

**Returns:**
[PageOutputColorOption](../../com.aspose.xps.metadata/pageoutputcoloroption) - This option instance.
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
| Parameter | Type | Description |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

