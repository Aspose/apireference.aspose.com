---
title: "JobStapleAllDocuments"
second_title: "Aspose.Page voor Java API-referentie"
description: "Beschrijft de nietkenmerken van de uitvoer."
type: docs
weight: 72
url: /nl/java/com.aspose.xps.metadata/jobstaplealldocuments/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Feature](../../com.aspose.xps.metadata/feature), [com.aspose.xps.metadata.Staple](../../com.aspose.xps.metadata/staple)

**All Implemented Interfaces:**
[com.aspose.xps.metadata.IJobPrintTicketItem](../../com.aspose.xps.metadata/ijobprintticketitem)
```
public final class JobStapleAllDocuments extends Staple implements IJobPrintTicketItem
```

Beschrijft de nietkenmerken van de uitvoer. Alle documenten in de taak worden samengeniet. De trefwoorden  JobStapleAllDocuments  en  DocumentStaple  zijn wederzijds exclusief. Het is aan de driver om de afhandeling van beperkingen tussen deze trefwoorden te bepalen. https://docs.microsoft.com/en-us/windows/win32/printdocs/jobstaplealldocuments
## Constructors

| Constructor | Beschrijving |
| --- | --- |
| [JobStapleAllDocuments(Staple.StapleOption[] options)](#JobStapleAllDocuments-com.aspose.xps.metadata.Staple.StapleOption...-) | Maakt een nieuw exemplaar aan. |
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
### JobStapleAllDocuments(Staple.StapleOption[] options) {#JobStapleAllDocuments-com.aspose.xps.metadata.Staple.StapleOption...-}
```
public JobStapleAllDocuments(Staple.StapleOption[] options)
```


Maakt een nieuw exemplaar aan.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| options | [StapleOption\[\]](../../com.aspose.xps.metadata/stapleoption) | Een array van opties specifiek voor de functie. |

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

