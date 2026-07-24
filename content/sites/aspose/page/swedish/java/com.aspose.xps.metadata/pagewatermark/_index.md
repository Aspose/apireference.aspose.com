---
title: "PageWatermark"
second_title: "Aspose.Page för Java API-referens"
description: "Beskriver vattenstämpelinställningarna för utdata och vattenstämpelns egenskaper."
type: docs
weight: 131
url: /sv/java/com.aspose.xps.metadata/pagewatermark/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Feature](../../com.aspose.xps.metadata/feature)

**All Implemented Interfaces:**
[com.aspose.xps.metadata.IJobPrintTicketItem](../../com.aspose.xps.metadata/ijobprintticketitem), [com.aspose.xps.metadata.IDocumentPrintTicketItem](../../com.aspose.xps.metadata/idocumentprintticketitem), [com.aspose.xps.metadata.IPagePrintTicketItem](../../com.aspose.xps.metadata/ipageprintticketitem)
```
public final class PageWatermark extends Feature implements IJobPrintTicketItem, IDocumentPrintTicketItem, IPagePrintTicketItem
```

Beskriver vattenstämpelinställningen för utskriften och vattenstämpelns egenskaper. Vattenstämplar tillämpas på den logiska sidan, inte den fysiska sidan. Till exempel, om  DocumentDuplex  är aktiverat, kommer en vattenstämpel att visas på varje  NUp  sida på varje ark. Om  DocumentDuplex ,  PagesPerSheet =2, så kommer varje ark att ha 2 vattenstämplar. https://docs.microsoft.com/en-us/windows/win32/printdocs/pagewatermark
## Konstruktörer

| Konstruktor | Beskrivning |
| --- | --- |
| [PageWatermark(PageWatermark.IPageWatermarkItem[] items)](#PageWatermark-com.aspose.xps.metadata.PageWatermark.IPageWatermarkItem...-) | Skapar en ny instans. |
## Metoder

| Metod | Beskrivning |
| --- | --- |
| [add(IFeatureItem[] items)](#add-com.aspose.xps.metadata.IFeatureItem...-) | Lägger till en lista med objekt i slutet av den här funktionens objektlista. |
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
### PageWatermark(PageWatermark.IPageWatermarkItem[] items) {#PageWatermark-com.aspose.xps.metadata.PageWatermark.IPageWatermarkItem...-}
```
public PageWatermark(PageWatermark.IPageWatermarkItem[] items)
```


Skapar en ny instans.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| items | [IPageWatermarkItem\[\]](../../com.aspose.xps.metadata/ipagewatermarkitem) | En matris av objekt specifika för funktionen. |

### add(IFeatureItem[] items) {#add-com.aspose.xps.metadata.IFeatureItem...-}
```
public void add(IFeatureItem[] items)
```


Lägger till en lista med objekt i slutet av den här funktionens objektlista. Var och en måste vara ett Feature, ett Option eller ett Property‑instans.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| items | [IFeatureItem\[\]](../../com.aspose.xps.metadata/ifeatureitem) | Lista med objekt att lägga till. |

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

