---
title: "JobErrorSheet"
second_title: "Aspose.Page voor Java API-referentie"
description: "Beschrijft de uitvoer van het foutblad."
type: docs
weight: 53
url: /nl/java/com.aspose.xps.metadata/joberrorsheet/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Feature](../../com.aspose.xps.metadata/feature)

**All Implemented Interfaces:**
[com.aspose.xps.metadata.IJobPrintTicketItem](../../com.aspose.xps.metadata/ijobprintticketitem)
```
public final class JobErrorSheet extends Feature implements IJobPrintTicketItem
```

Beschrijft de uitvoer van het foutblad. De volledige taak zal één enkel foutblad hebben. Het foutblad moet worden afgedrukt op de standaard  PageMediaSize  en met het standaard  PageMediaType . Het foutblad moet geïsoleerd worden van de rest van de taak. Dit betekent dat eventuele afwerkings‑ of verwerkingsopties (zoals  JobDuplex ,  JobStaple , of  JobBinding ) het foutblad niet mogen opnemen. Het foutblad moet verschijnen als het laatste blad van de taak. https://docs.microsoft.com/en-us/windows/win32/printdocs/joberrorsheet
## Constructors

| Constructor | Beschrijving |
| --- | --- |
| [JobErrorSheet(JobErrorSheet.IJobErrorSheetItem[] items)](#JobErrorSheet-com.aspose.xps.metadata.JobErrorSheet.IJobErrorSheetItem...-) | Maakt een nieuw exemplaar aan. |
## Methoden

| Methode | Beschrijving |
| --- | --- |
| [add(IFeatureItem[] items)](#add-com.aspose.xps.metadata.IFeatureItem...-) | Voegt een lijst met items toe aan het einde van de itemslijst van deze functie. |
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
### JobErrorSheet(JobErrorSheet.IJobErrorSheetItem[] items) {#JobErrorSheet-com.aspose.xps.metadata.JobErrorSheet.IJobErrorSheetItem...-}
```
public JobErrorSheet(JobErrorSheet.IJobErrorSheetItem[] items)
```


Maakt een nieuw exemplaar aan.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| items | [IJobErrorSheetItem\[\]](../../com.aspose.xps.metadata/ijoberrorsheetitem) | Een array van items specifiek voor de functie. |

### add(IFeatureItem[] items) {#add-com.aspose.xps.metadata.IFeatureItem...-}
```
public void add(IFeatureItem[] items)
```


Voegt een lijst met items toe aan het einde van de itemlijst van deze functie. Elk item moet een  Feature , een  Option , of een  Property  instantie zijn.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| items | [IFeatureItem\[\]](../../com.aspose.xps.metadata/ifeatureitem) | Lijst met toe te voegen items. |

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

