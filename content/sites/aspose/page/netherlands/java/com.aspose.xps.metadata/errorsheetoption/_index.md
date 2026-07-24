---
title: "JobErrorSheet.ErrorSheetOption"
second_title: "Aspose.Page voor Java API-referentie"
description: "Beschrijft de JobErrorSheet-functieopties."
type: docs
weight: 10
url: /nl/java/com.aspose.xps.metadata/joberrorsheet.errorsheetoption/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Option](../../com.aspose.xps.metadata/option)

**All Implemented Interfaces:**
[com.aspose.xps.metadata.JobErrorSheet.IJobErrorSheetItem](../../com.aspose.xps.metadata/ijoberrorsheetitem)
```
public static final class JobErrorSheet.ErrorSheetOption extends Option implements JobErrorSheet.IJobErrorSheetItem
```

Beschrijft de  JobErrorSheet  functieopties.
## Velden

| Veld | Beschrijving |
| --- | --- |
| [Custom](#Custom) | Specificeert dat een aangepast foutblad moet worden uitgegeven. |
| [None](#None) | Geeft aan dat er geen foutblad moet worden afgedrukt. |
| [Standard](#Standard) | Geeft aan dat het standaard (apparaat‑gedefinieerde) foutblad moet worden afgedrukt. |
## Methoden

| Methode | Beschrijving |
| --- | --- |
| [add(IOptionItem[] items)](#add-com.aspose.xps.metadata.IOptionItem...-) | Voegt een lijst met items toe aan het einde van de itemslijst van deze optie. |
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
### Custom {#Custom}
```
public static final JobErrorSheet.ErrorSheetOption Custom
```


Geeft aan dat een aangepast foutblad moet worden afgedrukt. Als een  JobErrorSheetSource   ParameterInit  element niet is gespecificeerd, moet deze optie worden genegeerd.

### None {#None}
```
public static final JobErrorSheet.ErrorSheetOption None
```


Geeft aan dat er geen foutblad moet worden afgedrukt.

### Standard {#Standard}
```
public static final JobErrorSheet.ErrorSheetOption Standard
```


Geeft aan dat het standaard (apparaat‑gedefinieerde) foutblad moet worden afgedrukt.

### add(IOptionItem[] items) {#add-com.aspose.xps.metadata.IOptionItem...-}
```
public void add(IOptionItem[] items)
```


Voegt een lijst met items toe aan het einde van de itemslijst van deze optie. Elk item moet een  ScoredProperty  of een  Property  instantie zijn.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| items | [IOptionItem\[\]](../../com.aspose.xps.metadata/ioptionitem) | Lijst met toe te voegen items. |

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

