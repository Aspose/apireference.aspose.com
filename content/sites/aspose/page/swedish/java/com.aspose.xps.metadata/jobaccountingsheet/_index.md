---
title: "JobAccountingSheet"
second_title: "Aspose.Page för Java API-referens"
description: "Beskriver redovisningsbladet som ska skrivas ut för jobbet."
type: docs
weight: 44
url: /sv/java/com.aspose.xps.metadata/jobaccountingsheet/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Feature](../../com.aspose.xps.metadata/feature)

**All Implemented Interfaces:**
[com.aspose.xps.metadata.IJobPrintTicketItem](../../com.aspose.xps.metadata/ijobprintticketitem)
```
public final class JobAccountingSheet extends Feature implements IJobPrintTicketItem
```

Beskriver bokföringsbladet som ska skrivas ut för jobbet. Bokföringsbladet ska skrivas ut med standard  PageMediaSize  och med standard  PageMediaType . Bokföringsbladet bör vara isolerat från resten av jobbet. Detta innebär att eventuella efterbehandlings- eller bearbetningsalternativ (såsom  JobDuplex ,  JobStaple , eller  JobBinding ) inte ska inkludera bokföringsbladet. Bokföringsbladet kan förekomma som den första eller sista sidan i jobbet enligt implementerarens bedömning. https://docs.microsoft.com/en-us/windows/win32/printdocs/jobaccountingsheet
## Konstruktörer

| Konstruktor | Beskrivning |
| --- | --- |
| [JobAccountingSheet(JobAccountingSheet.JobAccountingSheetOption[] options)](#JobAccountingSheet-com.aspose.xps.metadata.JobAccountingSheet.JobAccountingSheetOption...-) | Skapar en ny instans. |
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
### JobAccountingSheet(JobAccountingSheet.JobAccountingSheetOption[] options) {#JobAccountingSheet-com.aspose.xps.metadata.JobAccountingSheet.JobAccountingSheetOption...-}
```
public JobAccountingSheet(JobAccountingSheet.JobAccountingSheetOption[] options)
```


Skapar en ny instans.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| options | [JobAccountingSheetOption\[\]](../../com.aspose.xps.metadata/jobaccountingsheetoption) | En matris av alternativ specifika för funktionen. |

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

