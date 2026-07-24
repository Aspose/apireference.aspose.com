---
title: "PageOutputColor.PageOutputColorOption"
second_title: "Aspose.Page för Java API-referens"
description: "Beskriver PageOutputColor-funktionsalternativen."
type: docs
weight: 10
url: /sv/java/com.aspose.xps.metadata/pageoutputcolor.pageoutputcoloroption/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Option](../../com.aspose.xps.metadata/option)

**All Implemented Interfaces:**
[com.aspose.xps.metadata.PageOutputColor.IPageOutputColorItem](../../com.aspose.xps.metadata/ipageoutputcoloritem)
```
public static final class PageOutputColor.PageOutputColorOption extends Option implements PageOutputColor.IPageOutputColorItem
```

Beskriver  PageOutputColor  funktionsalternativ.
## Konstruktörer

| Konstruktor | Beskrivning |
| --- | --- |
| [PageOutputColorOption(String optionName, PageOutputColor.IPageOutputColorOptionItem[] items)](#PageOutputColorOption-java.lang.String-com.aspose.xps.metadata.PageOutputColor.IPageOutputColorOptionItem...-) | Skapar en ny instans. |
## Metoder

| Metod | Beskrivning |
| --- | --- |
| [Color(int deviceBitsPerPixel, int driverBitsPerPixel)](#Color-int-int-) | Anger att utdata ska vara i färg. |
| [Grayscale(int deviceBitsPerPixel, int driverBitsPerPixel)](#Grayscale-int-int-) | Anger att utdata ska vara i gråskala. |
| [Monochrome(int deviceBitsPerPixel, int driverBitsPerPixel)](#Monochrome-int-int-) | Anger att utdata ska vara i monokrom (svart). |
| [add(IOptionItem[] items)](#add-com.aspose.xps.metadata.IOptionItem...-) | Lägger till en lista med objekt i slutet av detta alternativs objektlista. |
| [add(PageOutputColor.IPageOutputColorOptionItem[] items)](#add-com.aspose.xps.metadata.PageOutputColor.IPageOutputColorOptionItem...-) | Lägger till en matris av  IPageOutputColorOptionItem  instanser till alternativet. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getName()](#getName--) | Hämtar elementets namn. |
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


Skapar en ny instans.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| optionName | java.lang.String | Ett alternativnamn. |
| items | [IPageOutputColorOptionItem\[\]](../../com.aspose.xps.metadata/ipageoutputcoloroptionitem) | En godtycklig matris av  IPageOutputColorOptionItem  instanser. |

### Color(int deviceBitsPerPixel, int driverBitsPerPixel) {#Color-int-int-}
```
public static final PageOutputColor.PageOutputColorOption Color(int deviceBitsPerPixel, int driverBitsPerPixel)
```


Anger att utdata ska vara i färg.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| deviceBitsPerPixel | int | Ett  DeviceBitsPerPixel  poängsatt egenskapsvärde som anger antalet bitar per pixel för färgdata som skrivaren stöder. |
| driverBitsPerPixel | int | Ett  DriverBitsPerPixel  poängsatt egenskapsvärde som anger antalet bitar per pixel som kärndrivrutinen bör använda för sin bitmap-renderingsbuffert. |

**Returns:**
[PageOutputColorOption](../../com.aspose.xps.metadata/pageoutputcoloroption) - The  PageOutputColor  options.
### Grayscale(int deviceBitsPerPixel, int driverBitsPerPixel) {#Grayscale-int-int-}
```
public static final PageOutputColor.PageOutputColorOption Grayscale(int deviceBitsPerPixel, int driverBitsPerPixel)
```


Anger att utdata ska vara i gråskala.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| deviceBitsPerPixel | int | Ett  DeviceBitsPerPixel  poängsatt egenskapsvärde som anger antalet bitar per pixel för färgdata som skrivaren stöder. |
| driverBitsPerPixel | int | Ett  DriverBitsPerPixel  poängsatt egenskapsvärde som anger antalet bitar per pixel som kärndrivrutinen bör använda för sin bitmap-renderingsbuffert. |

**Returns:**
[PageOutputColorOption](../../com.aspose.xps.metadata/pageoutputcoloroption) - The  PageOutputColor  options.
### Monochrome(int deviceBitsPerPixel, int driverBitsPerPixel) {#Monochrome-int-int-}
```
public static final PageOutputColor.PageOutputColorOption Monochrome(int deviceBitsPerPixel, int driverBitsPerPixel)
```


Anger att utdata ska vara i monokrom (svart).

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| deviceBitsPerPixel | int | Ett  DeviceBitsPerPixel  poängsatt egenskapsvärde som anger antalet bitar per pixel för färgdata som skrivaren stöder. |
| driverBitsPerPixel | int | Ett  DriverBitsPerPixel  poängsatt egenskapsvärde som anger antalet bitar per pixel som kärndrivrutinen bör använda för sin bitmap-renderingsbuffert. |

**Returns:**
[PageOutputColorOption](../../com.aspose.xps.metadata/pageoutputcoloroption) - The  PageOutputColor  options.
### add(IOptionItem[] items) {#add-com.aspose.xps.metadata.IOptionItem...-}
```
public void add(IOptionItem[] items)
```


Lägger till en lista med objekt i slutet av detta alternativs objektlista. Varje objekt måste vara en  ScoredProperty  eller en  Property  -instans.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| items | [IOptionItem\[\]](../../com.aspose.xps.metadata/ioptionitem) | Lista med objekt att lägga till. |

### add(PageOutputColor.IPageOutputColorOptionItem[] items) {#add-com.aspose.xps.metadata.PageOutputColor.IPageOutputColorOptionItem...-}
```
public PageOutputColor.PageOutputColorOption add(PageOutputColor.IPageOutputColorOptionItem[] items)
```


Lägger till en matris av  IPageOutputColorOptionItem  instanser till alternativet.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| items | [IPageOutputColorOptionItem\[\]](../../com.aspose.xps.metadata/ipageoutputcoloroptionitem) | En godtycklig matris av  IPageOutputColorOptionItem  instanser. |

**Returns:**
[PageOutputColorOption](../../com.aspose.xps.metadata/pageoutputcoloroption) - This options instance.
### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| Parameter | Typ | Beskrivning |
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


Hämtar elementets namn.

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
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

