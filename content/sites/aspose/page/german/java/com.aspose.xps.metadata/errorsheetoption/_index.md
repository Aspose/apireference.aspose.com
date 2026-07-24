---
title: "JobErrorSheet.ErrorSheetOption"
second_title: "Aspose.Page for Java API-Referenz"
description: "Beschreibt die Feature‑Optionen von JobErrorSheet."
type: docs
weight: 10
url: /de/java/com.aspose.xps.metadata/joberrorsheet.errorsheetoption/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Option](../../com.aspose.xps.metadata/option)

**All Implemented Interfaces:**
[com.aspose.xps.metadata.JobErrorSheet.IJobErrorSheetItem](../../com.aspose.xps.metadata/ijoberrorsheetitem)
```
public static final class JobErrorSheet.ErrorSheetOption extends Option implements JobErrorSheet.IJobErrorSheetItem
```

Beschreibt die Optionen des Features JobErrorSheet.
## Felder

| Feld | Beschreibung |
| --- | --- |
| [Custom](#Custom) | Gibt an, dass ein benutzerdefiniertes Fehlblatt ausgegeben werden soll. |
| [None](#None) | Gibt an, dass kein Fehlblatt ausgegeben werden soll. |
| [Standard](#Standard) | Gibt an, dass das Standard‑Fehlblatt (gerätespezifisch definiert) ausgegeben werden soll. |
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [add(IOptionItem[] items)](#add-com.aspose.xps.metadata.IOptionItem...-) | Fügt eine Liste von Elementen am Ende der Elementliste dieser Option hinzu. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getName()](#getName--) | Ermittelt den Elementnamen. |
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


Gibt an, dass ein benutzerdefiniertes Fehlblatt ausgegeben werden soll. Wenn ein  JobErrorSheetSource   ParameterInit  Element nicht angegeben ist, sollte diese Option ignoriert werden.

### None {#None}
```
public static final JobErrorSheet.ErrorSheetOption None
```


Gibt an, dass kein Fehlblatt ausgegeben werden soll.

### Standard {#Standard}
```
public static final JobErrorSheet.ErrorSheetOption Standard
```


Gibt an, dass das Standard‑Fehlblatt (gerätespezifisch definiert) ausgegeben werden soll.

### add(IOptionItem[] items) {#add-com.aspose.xps.metadata.IOptionItem...-}
```
public void add(IOptionItem[] items)
```


Fügt eine Liste von Elementen am Ende der Elementliste dieser Option hinzu. Jedes muss eine Instanz von  ScoredProperty  oder  Property  sein.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| items | [IOptionItem\[\]](../../com.aspose.xps.metadata/ioptionitem) | Liste der hinzuzufügenden Elemente. |

### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| Parameter | Typ | Beschreibung |
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


Ermittelt den Elementnamen.

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
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

