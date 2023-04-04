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
| [add(PageOutputColor.IPageOutputColorOptionItem[] items)](#add-com.aspose.xps.metadata.PageOutputColor.IPageOutputColorOptionItem...-) | Adds an array of  IPageOutputColorOptionItem  instances to the option. |
| [setDeviceBitsPerPixel(int deviceBitsPerPixel)](#setDeviceBitsPerPixel-int-) | Sets a  DeviceBitsPerPixel  scored property value. |
| [setDriverBitsPerPixel(int driverBitsPerPixel)](#setDriverBitsPerPixel-int-) | Sets a  DriverBitsPerPixel  scored property value. |
| [clone()](#clone--) | Clones this option instance. |
### PageOutputColorOption(String optionName, PageOutputColor.IPageOutputColorOptionItem[] items) {#PageOutputColorOption-java.lang.String-com.aspose.xps.metadata.PageOutputColor.IPageOutputColorOptionItem...-}
```
public PageOutputColorOption(String optionName, PageOutputColor.IPageOutputColorOptionItem[] items)
```


Creates a new instance.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| optionName | java.lang.String | An options name. |
| items | com.aspose.xps.metadata.PageOutputColor.IPageOutputColorOptionItem[] | An arbitrary array of  IPageOutputColorOptionItem  instances. |

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

### add(PageOutputColor.IPageOutputColorOptionItem[] items) {#add-com.aspose.xps.metadata.PageOutputColor.IPageOutputColorOptionItem...-}
```
public PageOutputColor.PageOutputColorOption add(PageOutputColor.IPageOutputColorOptionItem[] items)
```

Adds an array of  IPageOutputColorOptionItem  instances to the option.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| items | com.aspose.xps.metadata.PageOutputColor.IPageOutputColorOptionItem[] | An arbitrary array of  IPageOutputColorOptionItem  instances. |

**Returns:**
[PageOutputColorOption](../../com.aspose.xps.metadata/pageoutputcoloroption) - This options instance.
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
### clone() {#clone--}
```
public PageOutputColor.PageOutputColorOption clone()
```


Clones this option instance. The shortcut to the cloneing constructor.

**Returns:**
[PageOutputColorOption](../../com.aspose.xps.metadata/pageoutputcoloroption) - The clone of this option instance.
