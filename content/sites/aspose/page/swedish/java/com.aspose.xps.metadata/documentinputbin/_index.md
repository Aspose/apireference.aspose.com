---
title: "DocumentInputBin"
second_title: "Aspose.Page för Java API-referens"
description: "Beskriver den installerade inmatningsbehållaren i en enhet eller den fullständiga listan över stödjade behållare för en enhet."
type: docs
weight: 27
url: /sv/java/com.aspose.xps.metadata/documentinputbin/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Feature](../../com.aspose.xps.metadata/feature), [com.aspose.xps.metadata.InputBin](../../com.aspose.xps.metadata/inputbin)

**All Implemented Interfaces:**
[com.aspose.xps.metadata.IJobPrintTicketItem](../../com.aspose.xps.metadata/ijobprintticketitem), [com.aspose.xps.metadata.IDocumentPrintTicketItem](../../com.aspose.xps.metadata/idocumentprintticketitem)
```
public final class DocumentInputBin extends InputBin implements IJobPrintTicketItem, IDocumentPrintTicketItem
```

Beskriver den installerade inmatningsbehållaren i en enhet eller den fullständiga listan över stödjade behållare för en enhet. Nyckelorden  JobInputBin ,  DocumentInputBin , och  PageInputBin  är ömsesidigt uteslutande. Båda bör inte anges samtidigt i ett PrintTicket- eller Print Capabilities-dokument. https://docs.microsoft.com/en-us/windows/win32/printdocs/documentinputbin
## Konstruktörer

| Konstruktor | Beskrivning |
| --- | --- |
| [DocumentInputBin(InputBin.IInputBinItem[] items)](#DocumentInputBin-com.aspose.xps.metadata.InputBin.IInputBinItem...-) | Skapar en ny instans. |
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
### DocumentInputBin(InputBin.IInputBinItem[] items) {#DocumentInputBin-com.aspose.xps.metadata.InputBin.IInputBinItem...-}
```
public DocumentInputBin(InputBin.IInputBinItem[] items)
```


Skapar en ny instans.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| items | [IInputBinItem\[\]](../../com.aspose.xps.metadata/iinputbinitem) | En matris av objekt specifika för funktionen. |

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

