---
title: "PageBlendColorSpace.PageBlendColorSpaceOption"
second_title: "Aspose.Page for Java API-Referenz"
description: "Beschreibt die Optionen des PageBlendColorSpace‑Features."
type: docs
weight: 10
url: /de/java/com.aspose.xps.metadata/pageblendcolorspace.pageblendcolorspaceoption/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Option](../../com.aspose.xps.metadata/option)
```
public static final class PageBlendColorSpace.PageBlendColorSpaceOption extends Option
```

Beschreibt die Optionen der Funktion PageBlendColorSpace.
## Felder

| Feld | Beschreibung |
| --- | --- |
| [ICCProfile](#ICCProfile) | Gibt ein ICC‑Profil an, das den Farbraum definiert, der für das Blending verwendet werden SOLLTE. |
| [sRGB](#sRGB) | Der sRGB-Farbraum SOLL für das Mischen verwendet werden. |
| [scRGB](#scRGB) | Der scRGB-Farbraum SOLL für das Mischen verwendet werden. |
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
### ICCProfile {#ICCProfile}
```
public static PageBlendColorSpace.PageBlendColorSpaceOption ICCProfile
```


Gibt ein ICC-Profil an, das den Farbraum definiert, der für das Mischen SOLL verwendet werden. Hinweis: Dies gilt nur für XPS-Dokumente und sollte nicht in beliebigen PrintTickets verwendet werden.

### sRGB {#sRGB}
```
public static PageBlendColorSpace.PageBlendColorSpaceOption sRGB
```


Der sRGB-Farbraum SOLL für das Mischen verwendet werden.

### scRGB {#scRGB}
```
public static PageBlendColorSpace.PageBlendColorSpaceOption scRGB
```


Der scRGB-Farbraum SOLL für das Mischen verwendet werden.

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

