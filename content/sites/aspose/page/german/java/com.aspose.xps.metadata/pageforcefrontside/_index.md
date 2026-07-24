---
title: "PageForceFrontSide"
second_title: "Aspose.Page for Java API-Referenz"
description: "Erzwingt, dass die Ausgabe auf der Vorderseite eines Medienblatts erscheint."
type: docs
weight: 97
url: /de/java/com.aspose.xps.metadata/pageforcefrontside/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Feature](../../com.aspose.xps.metadata/feature)

**All Implemented Interfaces:**
[com.aspose.xps.metadata.IJobPrintTicketItem](../../com.aspose.xps.metadata/ijobprintticketitem), [com.aspose.xps.metadata.IDocumentPrintTicketItem](../../com.aspose.xps.metadata/idocumentprintticketitem), [com.aspose.xps.metadata.IPagePrintTicketItem](../../com.aspose.xps.metadata/ipageprintticketitem)
```
public final class PageForceFrontSide extends Feature implements IJobPrintTicketItem, IDocumentPrintTicketItem, IPagePrintTicketItem
```

Erzwingt, dass die Ausgabe auf der Vorderseite eines Medienblatts erscheint. Relevant für Medienblätter mit unterschiedlichen Oberflächen auf jeder Seite. In Fällen, in denen diese Funktion mit Verarbeitungsoptionen (wie DocumentDuplex) interferiert, hat PageForceFrontSide Vorrang für die jeweilige Seite, auf die die Funktion angewendet wird.
## Konstruktoren

| Konstruktor | Beschreibung |
| --- | --- |
| [PageForceFrontSide(PageForceFrontSide.PageForceFrontSideOption[] options)](#PageForceFrontSide-com.aspose.xps.metadata.PageForceFrontSide.PageForceFrontSideOption...-) | Erstellt eine neue Instanz. |
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [add(IFeatureItem[] items)](#add-com.aspose.xps.metadata.IFeatureItem...-) | Fügt eine Liste von Elementen am Ende der Elementliste dieses Features hinzu. |
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
### PageForceFrontSide(PageForceFrontSide.PageForceFrontSideOption[] options) {#PageForceFrontSide-com.aspose.xps.metadata.PageForceFrontSide.PageForceFrontSideOption...-}
```
public PageForceFrontSide(PageForceFrontSide.PageForceFrontSideOption[] options)
```


Erstellt eine neue Instanz.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| options | [PageForceFrontSideOption\[\]](../../com.aspose.xps.metadata/pageforcefrontsideoption) | Ein Array von Optionen, das spezifisch für das Feature ist. |

### add(IFeatureItem[] items) {#add-com.aspose.xps.metadata.IFeatureItem...-}
```
public void add(IFeatureItem[] items)
```


Fügt eine Liste von Elementen am Ende der Elementliste dieses Features hinzu. Jedes muss eine Feature-, eine Option- oder eine Property-Instanz sein.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| items | [IFeatureItem\[\]](../../com.aspose.xps.metadata/ifeatureitem) | Liste der hinzuzufügenden Elemente. |

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

