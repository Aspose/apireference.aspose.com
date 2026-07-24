---
title: "PagePhotoPrintingIntent.PagePhotoPrintingIntentOption"
second_title: "Aspose.Page for Java API-Referenz"
description: "Definiert Optionen für das Feature PagePhotoPrintingIntent."
type: docs
weight: 10
url: /de/java/com.aspose.xps.metadata/pagephotoprintingintent.pagephotoprintingintentoption/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Option](../../com.aspose.xps.metadata/option)
```
public static final class PagePhotoPrintingIntent.PagePhotoPrintingIntentOption extends Option
```

Definiert die Feature-Optionen für  PagePhotoPrintingIntent .
## Felder

| Feld | Beschreibung |
| --- | --- |
| [None](#None) | Kein Fotodruck-Intent (Ermöglicht der Anwendung, keine Intent-Auflösung anzugeben. |
| [PhotoBest](#PhotoBest) | Beste Qualität Fotodruck (Meist aus Marketinggründen bereitgestellt; nutzt die höchsten Fähigkeiten des Geräts) |
| [PhotoDraft](#PhotoDraft) | Entwurfsqualität Fotodruck (Schneller Druck mit geringem Tintenverbrauch für Proofing-Zwecke) |
| [PhotoStandard](#PhotoStandard) | Standardqualität Fotodruck (Vom OEM empfohlene Einstellungen für Standard-Fotodruck) |
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
### None {#None}
```
public static PagePhotoPrintingIntent.PagePhotoPrintingIntentOption None
```


Kein Fotodruck-Intent (Ermöglicht der Anwendung, keine Intent-Auflösung anzugeben. PrintTicket-Einstellungen sollten nicht geändert werden)

### PhotoBest {#PhotoBest}
```
public static PagePhotoPrintingIntent.PagePhotoPrintingIntentOption PhotoBest
```


Beste Qualität Fotodruck (Meist aus Marketinggründen bereitgestellt; nutzt die höchsten Fähigkeiten des Geräts)

### PhotoDraft {#PhotoDraft}
```
public static PagePhotoPrintingIntent.PagePhotoPrintingIntentOption PhotoDraft
```


Entwurfsqualität Fotodruck (Schneller Druck mit geringem Tintenverbrauch für Proofing-Zwecke)

### PhotoStandard {#PhotoStandard}
```
public static PagePhotoPrintingIntent.PagePhotoPrintingIntentOption PhotoStandard
```


Standardqualität Fotodruck (Vom OEM empfohlene Einstellungen für Standard-Fotodruck)

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

