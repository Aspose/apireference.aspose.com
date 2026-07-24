---
title: "JobNUpAllDocumentsContiguously"
second_title: "Aspose.Page for Java API-Referenz"
description: "Beschreibt die Ausgabe mehrerer logischer Seiten auf ein einzelnes physisches Blatt."
type: docs
weight: 58
url: /de/java/com.aspose.xps.metadata/jobnupalldocumentscontiguously/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Feature](../../com.aspose.xps.metadata/feature), [com.aspose.xps.metadata.NUp](../../com.aspose.xps.metadata/nup)

**All Implemented Interfaces:**
[com.aspose.xps.metadata.IJobPrintTicketItem](../../com.aspose.xps.metadata/ijobprintticketitem)
```
public final class JobNUpAllDocumentsContiguously extends NUp implements IJobPrintTicketItem
```

Beschreibt die Ausgabe mehrerer logischer Seiten auf einem einzigen physischen Blatt. Alle Dokumente im Auftrag werden zusammenhängend zusammengestellt. JobNUpAllDocumentsContiguously und DocumentNUp schließen sich gegenseitig aus. Es liegt am Treiber zu bestimmen, wie die Einschränkungen zwischen diesen Schlüsselwörtern gehandhabt werden. https://docs.microsoft.com/en-us/windows/win32/printdocs/jobnupalldocumentscontiguously
## Konstruktoren

| Konstruktor | Beschreibung |
| --- | --- |
| [JobNUpAllDocumentsContiguously(NUp.INUpItem[] items)](#JobNUpAllDocumentsContiguously-com.aspose.xps.metadata.NUp.INUpItem...-) | Erstellt eine neue Instanz. |
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [add(IFeatureItem[] items)](#add-com.aspose.xps.metadata.IFeatureItem...-) | Fügt eine Liste von Elementen am Ende der Elementliste dieses Features hinzu. |
| [addPagesPerSheetOption(int value)](#addPagesPerSheetOption-int-) | Fügt eine Option mit einem PagesPerSheet-ScoredProperty-Wert hinzu. |
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
### JobNUpAllDocumentsContiguously(NUp.INUpItem[] items) {#JobNUpAllDocumentsContiguously-com.aspose.xps.metadata.NUp.INUpItem...-}
```
public JobNUpAllDocumentsContiguously(NUp.INUpItem[] items)
```


Erstellt eine neue Instanz.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| items | [INUpItem\[\]](../../com.aspose.xps.metadata/inupitem) | Ein Array von Elementen, die spezifisch für die Funktion sind. |

### add(IFeatureItem[] items) {#add-com.aspose.xps.metadata.IFeatureItem...-}
```
public void add(IFeatureItem[] items)
```


Fügt eine Liste von Elementen am Ende der Elementliste dieses Features hinzu. Jedes muss eine Feature-, eine Option- oder eine Property-Instanz sein.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| items | [IFeatureItem\[\]](../../com.aspose.xps.metadata/ifeatureitem) | Liste der hinzuzufügenden Elemente. |

### addPagesPerSheetOption(int value) {#addPagesPerSheetOption-int-}
```
public JobNUpAllDocumentsContiguously addPagesPerSheetOption(int value)
```


Fügt eine Option mit einem PagesPerSheet-ScoredProperty-Wert hinzu. Gibt die Anzahl logischer Seiten pro physischem Blatt an.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | int | Ein PagesPerSheet-ScoredProperty-Wert. Unterstützte Menge kann jede Menge von Ganzzahlen sein, z. B. \{1,2,4,6,8,9,16\}. |

**Returns:**
[JobNUpAllDocumentsContiguously](../../com.aspose.xps.metadata/jobnupalldocumentscontiguously) - This feature instance.
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

