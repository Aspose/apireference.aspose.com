---
title: "PageOutputColor.PageOutputColorOption"
second_title: "Aspose.Page voor Java API-referentie"
description: "Beschrijft de PageOutputColor-functie-opties."
type: docs
weight: 10
url: /nl/java/com.aspose.xps.metadata/pageoutputcolor.pageoutputcoloroption/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Option](../../com.aspose.xps.metadata/option)

**All Implemented Interfaces:**
[com.aspose.xps.metadata.PageOutputColor.IPageOutputColorItem](../../com.aspose.xps.metadata/ipageoutputcoloritem)
```
public static final class PageOutputColor.PageOutputColorOption extends Option implements PageOutputColor.IPageOutputColorItem
```

Beschrijft de opties van de functie PageOutputColor.
## Constructors

| Constructor | Beschrijving |
| --- | --- |
| [PageOutputColorOption(String optionName, PageOutputColor.IPageOutputColorOptionItem[] items)](#PageOutputColorOption-java.lang.String-com.aspose.xps.metadata.PageOutputColor.IPageOutputColorOptionItem...-) | Maakt een nieuw exemplaar aan. |
## Methoden

| Methode | Beschrijving |
| --- | --- |
| [Color(int deviceBitsPerPixel, int driverBitsPerPixel)](#Color-int-int-) | Specificeert dat de uitvoer in kleur moet zijn. |
| [Grayscale(int deviceBitsPerPixel, int driverBitsPerPixel)](#Grayscale-int-int-) | Specificeert dat de uitvoer in grijstinten moet zijn. |
| [Monochrome(int deviceBitsPerPixel, int driverBitsPerPixel)](#Monochrome-int-int-) | Specificeert dat de uitvoer monochroom (zwart) moet zijn. |
| [add(IOptionItem[] items)](#add-com.aspose.xps.metadata.IOptionItem...-) | Voegt een lijst met items toe aan het einde van de itemslijst van deze optie. |
| [add(PageOutputColor.IPageOutputColorOptionItem[] items)](#add-com.aspose.xps.metadata.PageOutputColor.IPageOutputColorOptionItem...-) | Voegt een array van  IPageOutputColorOptionItem  instanties toe aan de optie. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getName()](#getName--) | Haalt de elementnaam op. |
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


Maakt een nieuw exemplaar aan.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| optionName | java.lang.String | Een optienaam. |
| items | [IPageOutputColorOptionItem\[\]](../../com.aspose.xps.metadata/ipageoutputcoloroptionitem) | Een willekeurige array van  IPageOutputColorOptionItem  instanties. |

### Color(int deviceBitsPerPixel, int driverBitsPerPixel) {#Color-int-int-}
```
public static final PageOutputColor.PageOutputColorOption Color(int deviceBitsPerPixel, int driverBitsPerPixel)
```


Specificeert dat de uitvoer in kleur moet zijn.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| deviceBitsPerPixel | int | Een  DeviceBitsPerPixel  gescoorde eigenschapswaarde die het aantal bits per pixel van kleurdaten aangeeft dat door de printer wordt ondersteund. |
| driverBitsPerPixel | int | Een  DriverBitsPerPixel  gescoorde eigenschapswaarde die het aantal bits per pixel aangeeft dat de kernstuurprogramma moet gebruiken voor zijn bitmap-renderingbuffer. |

**Returns:**
[PageOutputColorOption](../../com.aspose.xps.metadata/pageoutputcoloroption) - The  PageOutputColor  options.
### Grayscale(int deviceBitsPerPixel, int driverBitsPerPixel) {#Grayscale-int-int-}
```
public static final PageOutputColor.PageOutputColorOption Grayscale(int deviceBitsPerPixel, int driverBitsPerPixel)
```


Specificeert dat de uitvoer in grijstinten moet zijn.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| deviceBitsPerPixel | int | Een  DeviceBitsPerPixel  gescoorde eigenschapswaarde die het aantal bits per pixel van kleurdaten aangeeft dat door de printer wordt ondersteund. |
| driverBitsPerPixel | int | Een  DriverBitsPerPixel  gescoorde eigenschapswaarde die het aantal bits per pixel aangeeft dat de kernstuurprogramma moet gebruiken voor zijn bitmap-renderingbuffer. |

**Returns:**
[PageOutputColorOption](../../com.aspose.xps.metadata/pageoutputcoloroption) - The  PageOutputColor  options.
### Monochrome(int deviceBitsPerPixel, int driverBitsPerPixel) {#Monochrome-int-int-}
```
public static final PageOutputColor.PageOutputColorOption Monochrome(int deviceBitsPerPixel, int driverBitsPerPixel)
```


Specificeert dat de uitvoer monochroom (zwart) moet zijn.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| deviceBitsPerPixel | int | Een  DeviceBitsPerPixel  gescoorde eigenschapswaarde die het aantal bits per pixel van kleurdaten aangeeft dat door de printer wordt ondersteund. |
| driverBitsPerPixel | int | Een  DriverBitsPerPixel  gescoorde eigenschapswaarde die het aantal bits per pixel aangeeft dat de kernstuurprogramma moet gebruiken voor zijn bitmap-renderingbuffer. |

**Returns:**
[PageOutputColorOption](../../com.aspose.xps.metadata/pageoutputcoloroption) - The  PageOutputColor  options.
### add(IOptionItem[] items) {#add-com.aspose.xps.metadata.IOptionItem...-}
```
public void add(IOptionItem[] items)
```


Voegt een lijst met items toe aan het einde van de itemslijst van deze optie. Elk item moet een  ScoredProperty  of een  Property  instantie zijn.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| items | [IOptionItem\[\]](../../com.aspose.xps.metadata/ioptionitem) | Lijst met toe te voegen items. |

### add(PageOutputColor.IPageOutputColorOptionItem[] items) {#add-com.aspose.xps.metadata.PageOutputColor.IPageOutputColorOptionItem...-}
```
public PageOutputColor.PageOutputColorOption add(PageOutputColor.IPageOutputColorOptionItem[] items)
```


Voegt een array van  IPageOutputColorOptionItem  instanties toe aan de optie.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| items | [IPageOutputColorOptionItem\[\]](../../com.aspose.xps.metadata/ipageoutputcoloroptionitem) | Een willekeurige array van  IPageOutputColorOptionItem  instanties. |

**Returns:**
[PageOutputColorOption](../../com.aspose.xps.metadata/pageoutputcoloroption) - This options instance.
### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| Parameter | Type | Beschrijving |
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


Haalt de elementnaam op.

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
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

