---
title: "PageScaling.PageScalingOption"
second_title: "Aspose.Page for Java API-Referenz"
description: "Beschreibt die Optionen der PageScaling‑Funktionen."
type: docs
weight: 10
url: /de/java/com.aspose.xps.metadata/pagescaling.pagescalingoption/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Option](../../com.aspose.xps.metadata/option)

**All Implemented Interfaces:**
[com.aspose.xps.metadata.PageScaling.IPageScalingItem](../../com.aspose.xps.metadata/ipagescalingitem)
```
public static final class PageScaling.PageScalingOption extends Option implements PageScaling.IPageScalingItem
```

Beschreibt die Feature-Optionen für  PageScaling .
## Felder

| Feld | Beschreibung |
| --- | --- |
| [Custom](#Custom) | Gibt an, dass eine benutzerdefinierte Skalierung auf die Application Media Size angewendet werden soll. |
| [CustomSquare](#CustomSquare) | Gibt an, dass eine benutzerdefinierte quadratische Skalierung auf die Application Media Size angewendet werden soll. |
| [FitApplicationBleedSizeToPageImageableSize](#FitApplicationBleedSizeToPageImageableSize) | Gibt an, dass die Anwendungs‑Beschnittgröße auf die  PageImageableSize  skaliert werden soll, wobei das Seitenverhältnis erhalten bleibt. |
| [FitApplicationContentSizeToPageImageableSize](#FitApplicationContentSizeToPageImageableSize) | Gibt an, dass die Anwendungs‑Inhaltsgröße auf die  PageImageableSize  skaliert werden soll, wobei das Seitenverhältnis erhalten bleibt. |
| [FitApplicationMediaSizeToPageImageableSize](#FitApplicationMediaSizeToPageImageableSize) | Gibt an, dass die Anwendungs‑Mediengröße auf die  PageImageableSize  skaliert werden soll, wobei das Seitenverhältnis erhalten bleibt. |
| [FitApplicationMediaSizeToPageMediaSize](#FitApplicationMediaSizeToPageMediaSize) | Gibt an, dass die Anwendungs‑Mediengröße auf die  PageMediaSize  skaliert werden soll, wobei das Seitenverhältnis erhalten bleibt. |
| [None](#None) | Gibt an, dass keine Skalierung angewendet werden soll. |
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
public static PageScaling.PageScalingOption Custom
```


Gibt an, dass eine benutzerdefinierte Skalierung auf die Application Media Size angewendet werden soll.

### CustomSquare {#CustomSquare}
```
public static PageScaling.PageScalingOption CustomSquare
```


Gibt an, dass eine benutzerdefinierte quadratische Skalierung auf die Application Media Size angewendet werden soll.

### FitApplicationBleedSizeToPageImageableSize {#FitApplicationBleedSizeToPageImageableSize}
```
public static PageScaling.PageScalingOption FitApplicationBleedSizeToPageImageableSize
```


Gibt an, dass die Anwendungs‑Beschnittgröße auf die  PageImageableSize  skaliert werden soll, wobei das Seitenverhältnis erhalten bleibt.

### FitApplicationContentSizeToPageImageableSize {#FitApplicationContentSizeToPageImageableSize}
```
public static PageScaling.PageScalingOption FitApplicationContentSizeToPageImageableSize
```


Gibt an, dass die Anwendungs‑Inhaltsgröße auf die  PageImageableSize  skaliert werden soll, wobei das Seitenverhältnis erhalten bleibt.

### FitApplicationMediaSizeToPageImageableSize {#FitApplicationMediaSizeToPageImageableSize}
```
public static PageScaling.PageScalingOption FitApplicationMediaSizeToPageImageableSize
```


Gibt an, dass die Anwendungs‑Mediengröße auf die  PageImageableSize  skaliert werden soll, wobei das Seitenverhältnis erhalten bleibt.

### FitApplicationMediaSizeToPageMediaSize {#FitApplicationMediaSizeToPageMediaSize}
```
public static PageScaling.PageScalingOption FitApplicationMediaSizeToPageMediaSize
```


Gibt an, dass die Anwendungs‑Mediengröße auf die  PageMediaSize  skaliert werden soll, wobei das Seitenverhältnis erhalten bleibt.

### None {#None}
```
public static PageScaling.PageScalingOption None
```


Gibt an, dass keine Skalierung angewendet werden soll.

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

