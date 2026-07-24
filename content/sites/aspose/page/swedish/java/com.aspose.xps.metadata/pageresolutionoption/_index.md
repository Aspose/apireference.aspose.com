---
title: "PageResolution.PageResolutionOption"
second_title: "Aspose.Page för Java API-referens"
description: "Beskriver alternativen för PageResolution-funktionerna."
type: docs
weight: 10
url: /sv/java/com.aspose.xps.metadata/pageresolution.pageresolutionoption/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Option](../../com.aspose.xps.metadata/option)

**All Implemented Interfaces:**
[com.aspose.xps.metadata.PageResolution.IPageResolutionItem](../../com.aspose.xps.metadata/ipageresolutionitem)
```
public static final class PageResolution.PageResolutionOption extends Option implements PageResolution.IPageResolutionItem
```

Beskriver  PageResolution  funktionsalternativ.
## Konstruktörer

| Konstruktor | Beskrivning |
| --- | --- |
| [PageResolutionOption(String optionName, PageResolution.IPageResolutionOptionItem[] items)](#PageResolutionOption-java.lang.String-com.aspose.xps.metadata.PageResolution.IPageResolutionOptionItem...-) | Skapar en ny instans. |
## Metoder

| Metod | Beskrivning |
| --- | --- |
| [add(IOptionItem[] items)](#add-com.aspose.xps.metadata.IOptionItem...-) | Lägger till en lista med objekt i slutet av detta alternativs objektlista. |
| [add(PageResolution.IPageResolutionOptionItem[] items)](#add-com.aspose.xps.metadata.PageResolution.IPageResolutionOptionItem...-) | Lägger till en array av  IPageResolutionOptionItem  -instanser till alternativet. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getName()](#getName--) | Hämtar elementets namn. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setResolutionX(int resolutionX)](#setResolutionX-int-) | Ställer in ett  ResolutionX  poängsatt egenskapsvärde. |
| [setResolutionY(int resolutionY)](#setResolutionY-int-) | Ställer in ett  ResolutionY  poängsatt egenskapsvärde. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### PageResolutionOption(String optionName, PageResolution.IPageResolutionOptionItem[] items) {#PageResolutionOption-java.lang.String-com.aspose.xps.metadata.PageResolution.IPageResolutionOptionItem...-}
```
public PageResolutionOption(String optionName, PageResolution.IPageResolutionOptionItem[] items)
```


Skapar en ny instans.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| optionName | java.lang.String | Ett alternativnamn. |
| items | [IPageResolutionOptionItem\[\]](../../com.aspose.xps.metadata/ipageresolutionoptionitem) | En godtycklig array av  IPageResolutionOptionItem  -instanser. |

### add(IOptionItem[] items) {#add-com.aspose.xps.metadata.IOptionItem...-}
```
public void add(IOptionItem[] items)
```


Lägger till en lista med objekt i slutet av detta alternativs objektlista. Varje objekt måste vara en  ScoredProperty  eller en  Property  -instans.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| items | [IOptionItem\[\]](../../com.aspose.xps.metadata/ioptionitem) | Lista med objekt att lägga till. |

### add(PageResolution.IPageResolutionOptionItem[] items) {#add-com.aspose.xps.metadata.PageResolution.IPageResolutionOptionItem...-}
```
public PageResolution.PageResolutionOption add(PageResolution.IPageResolutionOptionItem[] items)
```


Lägger till en array av  IPageResolutionOptionItem  -instanser till alternativet.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| items | [IPageResolutionOptionItem\[\]](../../com.aspose.xps.metadata/ipageresolutionoptionitem) | En godtycklig array av  IPageResolutionOptionItem  -instanser. |

**Returns:**
[PageResolutionOption](../../com.aspose.xps.metadata/pageresolutionoption) - This options instance.
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




### setResolutionX(int resolutionX) {#setResolutionX-int-}
```
public PageResolution.PageResolutionOption setResolutionX(int resolutionX)
```


Ställer in ett  ResolutionX  poängsatt egenskapsvärde.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| resolutionX | int | Ett  ResolutionX  poängsatt egenskapsvärde. |

**Returns:**
[PageResolutionOption](../../com.aspose.xps.metadata/pageresolutionoption) - This option instance.
### setResolutionY(int resolutionY) {#setResolutionY-int-}
```
public PageResolution.PageResolutionOption setResolutionY(int resolutionY)
```


Ställer in ett  ResolutionY  poängsatt egenskapsvärde.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| resolutionY | int | Ett  ResolutionY  poängsatt egenskapsvärde. |

**Returns:**
[PageResolutionOption](../../com.aspose.xps.metadata/pageresolutionoption) - This option instance.
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

