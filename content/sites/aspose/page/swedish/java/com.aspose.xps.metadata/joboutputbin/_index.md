---
title: "JobOutputBin"
second_title: "Aspose.Page för Java API-referens"
description: "Beskriver den installerade utskriftsbehållaren i en enhet eller hela listan över stödjade behållare för en enhet."
type: docs
weight: 61
url: /sv/java/com.aspose.xps.metadata/joboutputbin/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Feature](../../com.aspose.xps.metadata/feature), [com.aspose.xps.metadata.OutputBin](../../com.aspose.xps.metadata/outputbin)

**All Implemented Interfaces:**
[com.aspose.xps.metadata.IJobPrintTicketItem](../../com.aspose.xps.metadata/ijobprintticketitem)
```
public final class JobOutputBin extends OutputBin implements IJobPrintTicketItem
```

Beskriver den installerade utmatningsbehållaren i en enhet eller den fullständiga listan över stödda behållare för en enhet. Nyckelorden  JobOutputBin ,  DocumentOutputBin  och  PageOutputBin  är ömsesidigt uteslutande; endast en bör specificeras i ett PrintTicket- eller Print Capabilities-dokument. https://docs.microsoft.com/en-us/windows/win32/printdocs/joboutputbin
## Konstruktörer

| Konstruktor | Beskrivning |
| --- | --- |
| [JobOutputBin(OutputBin.IOutputBinItem[] items)](#JobOutputBin-com.aspose.xps.metadata.OutputBin.IOutputBinItem...-) | Skapar en ny instans. |
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
### JobOutputBin(OutputBin.IOutputBinItem[] items) {#JobOutputBin-com.aspose.xps.metadata.OutputBin.IOutputBinItem...-}
```
public JobOutputBin(OutputBin.IOutputBinItem[] items)
```


Skapar en ny instans.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| items | [IOutputBinItem\[\]](../../com.aspose.xps.metadata/ioutputbinitem) | En matris av objekt specifika för funktionen. |

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

