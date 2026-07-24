---
title: "PageMediaType.PageMediaTypeOption"
second_title: "Aspose.Page for Java API-Referenz"
description: "Beschreibt die Optionen der PageMediaType-Funktion."
type: docs
weight: 13
url: /de/java/com.aspose.xps.metadata/pagemediatype.pagemediatypeoption/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Option](../../com.aspose.xps.metadata/option)

**All Implemented Interfaces:**
[com.aspose.xps.metadata.PageMediaType.IPageMediaTypeItem](../../com.aspose.xps.metadata/ipagemediatypeitem)
```
public static final class PageMediaType.PageMediaTypeOption extends Option implements PageMediaType.IPageMediaTypeItem
```

Beschreibt die  PageMediaType  Funktionsoptionen.
## Konstruktoren

| Konstruktor | Beschreibung |
| --- | --- |
| [PageMediaTypeOption(String optionName, PageMediaType.IPageMediaTypeOptionItem[] items)](#PageMediaTypeOption-java.lang.String-com.aspose.xps.metadata.PageMediaType.IPageMediaTypeOptionItem...-) | Erstellt eine neue Instanz. |
| [PageMediaTypeOption(PageMediaType.PageMediaTypeOption option)](#PageMediaTypeOption-com.aspose.xps.metadata.PageMediaType.PageMediaTypeOption-) | Klont diese Optionsinstanz. |
## Felder

| Feld | Beschreibung |
| --- | --- |
| [Archival](#Archival) | Gibt Medien von Archivqualität an. |
| [AutoSelect](#AutoSelect) | Gibt an, dass das Medium automatisch ausgewählt wird. |
| [BackPrintFilm](#BackPrintFilm) | Gibt an, dass Spezial‑Rückdruckfilm‑Medium verwendet wird. |
| [Bond](#Bond) | Gibt an, dass Standard‑Bond‑Medium verwendet wird. |
| [CardStock](#CardStock) | Gibt an, dass Standard‑Kartenkarton‑Medium verwendet wird. |
| [Continous](#Continous) | Gibt an, dass kontinuierlich zugeführtes Medium verwendet wird. |
| [EnvelopePlain](#EnvelopePlain) | Gibt an, dass Standard‑Umschlag‑Medium verwendet wird. |
| [EnvelopeWindow](#EnvelopeWindow) | Gibt an, dass Fenster‑Umschlag‑Medium verwendet wird. |
| [Fabric](#Fabric) | Gibt an, dass Stoff‑Medium verwendet wird. |
| [HighResolution](#HighResolution) | Gibt an, dass Spezial‑Hochauflösungs‑Medium verwendet wird. |
| [Label](#Label) | Gibt an, dass Etiketten‑Medium verwendet wird. |
| [MultiLayerForm](#MultiLayerForm) | Gibt an, dass angebundenes mehrteiliges Formular‑Medium verwendet wird. |
| [MultiPartForm](#MultiPartForm) | Gibt an, dass separates mehrteiliges Formular‑Medium verwendet wird. |
| [None](#None) | Gibt an, dass unbekanntes oder nicht gelistetes Medium verwendet wird. |
| [Photographic](#Photographic) | Gibt an, dass Standard‑Fotomedium verwendet wird. |
| [PhotographicFilm](#PhotographicFilm) | Gibt an, dass Film‑Fotomedium verwendet wird. |
| [PhotographicGlossy](#PhotographicGlossy) | Gibt an, dass glänzendes Fotomedium verwendet wird. |
| [PhotographicHighGloss](#PhotographicHighGloss) | Gibt an, dass hochglänzendes Fotomedium verwendet wird. |
| [PhotographicMatte](#PhotographicMatte) | Gibt an, dass mattes Fotomedium verwendet wird. |
| [PhotographicSatin](#PhotographicSatin) | Gibt an, dass Satin‑Fotomedium verwendet wird. |
| [PhotographicSemiGloss](#PhotographicSemiGloss) | Gibt an, dass halbglänzendes Fotomedium verwendet wird. |
| [Plain](#Plain) | Gibt an, dass Standard‑Papier‑Medium verwendet wird. |
| [Screen](#Screen) | Gibt an, dass die Ausgabe in kontinuierlicher Form auf einem Ausgabedisplay erfolgt. |
| [ScreenPaged](#ScreenPaged) | Gibt an, dass die Ausgabe in seitenweiser Form auf einem Ausgabedisplay erfolgt. |
| [Stationary](#Stationary) | Gibt an, dass Spezial‑Bürobedarf‑Medium verwendet wird. |
| [TShirtTransfer](#TShirtTransfer) | Gibt an, dass Spezial‑T‑Shirt‑Transfer‑Medium verwendet wird. |
| [TabStockFull](#TabStockFull) | Gibt das Tab‑Rohmaterial an, das nicht vorgeschnitten ist (einzelne Registerkarten). |
| [TabStockPreCut](#TabStockPreCut) | Gibt das Tab‑Rohmaterial an, das vorgeschnitten ist (mehrere Registerkarten). |
| [Transparency](#Transparency) | Gibt Transparenzmedien an. |
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [add(IOptionItem[] items)](#add-com.aspose.xps.metadata.IOptionItem...-) | Fügt eine Liste von Elementen am Ende der Elementliste dieser Option hinzu. |
| [add(PageMediaType.IPageMediaTypeOptionItem[] items)](#add-com.aspose.xps.metadata.PageMediaType.IPageMediaTypeOptionItem...-) | Fügt dem Parameter ein Array von IPageMediaTypeOptionItem‑Instanzen hinzu. |
| [clone()](#clone--) | Klont diese Optionsinstanz. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getName()](#getName--) | Ermittelt den Elementnamen. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setWeight(int weight)](#setWeight-int-) | Setzt einen Weight‑bewerteten Eigenschaftswert. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### PageMediaTypeOption(String optionName, PageMediaType.IPageMediaTypeOptionItem[] items) {#PageMediaTypeOption-java.lang.String-com.aspose.xps.metadata.PageMediaType.IPageMediaTypeOptionItem...-}
```
public PageMediaTypeOption(String optionName, PageMediaType.IPageMediaTypeOptionItem[] items)
```


Erstellt eine neue Instanz.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| optionName | java.lang.String | Ein Optionsname. |
| items | [IPageMediaTypeOptionItem\[\]](../../com.aspose.xps.metadata/ipagemediatypeoptionitem) | Ein beliebiges Array von IPageMediaTypeOptionItem‑Instanzen. |

### PageMediaTypeOption(PageMediaType.PageMediaTypeOption option) {#PageMediaTypeOption-com.aspose.xps.metadata.PageMediaType.PageMediaTypeOption-}
```
public PageMediaTypeOption(PageMediaType.PageMediaTypeOption option)
```


Klont diese Optionsinstanz.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| option | [PageMediaTypeOption](../../com.aspose.xps.metadata/pagemediatypeoption) | Eine Instanz zum Klonen. |

### Archival {#Archival}
```
public static PageMediaType.PageMediaTypeOption Archival
```


Gibt Medien von Archivqualität an.

### AutoSelect {#AutoSelect}
```
public static PageMediaType.PageMediaTypeOption AutoSelect
```


Gibt an, dass das Medium automatisch ausgewählt wird.

### BackPrintFilm {#BackPrintFilm}
```
public static PageMediaType.PageMediaTypeOption BackPrintFilm
```


Gibt an, dass Spezial‑Rückdruckfilm‑Medium verwendet wird.

### Bond {#Bond}
```
public static PageMediaType.PageMediaTypeOption Bond
```


Gibt an, dass Standard‑Bond‑Medium verwendet wird.

### CardStock {#CardStock}
```
public static PageMediaType.PageMediaTypeOption CardStock
```


Gibt an, dass Standard‑Kartenkarton‑Medium verwendet wird.

### Continous {#Continous}
```
public static PageMediaType.PageMediaTypeOption Continous
```


Gibt an, dass kontinuierlich zugeführtes Medium verwendet wird.

### EnvelopePlain {#EnvelopePlain}
```
public static PageMediaType.PageMediaTypeOption EnvelopePlain
```


Gibt an, dass Standard‑Umschlag‑Medium verwendet wird.

### EnvelopeWindow {#EnvelopeWindow}
```
public static PageMediaType.PageMediaTypeOption EnvelopeWindow
```


Gibt an, dass Fenster‑Umschlag‑Medium verwendet wird.

### Fabric {#Fabric}
```
public static PageMediaType.PageMediaTypeOption Fabric
```


Gibt an, dass Stoff‑Medium verwendet wird.

### HighResolution {#HighResolution}
```
public static PageMediaType.PageMediaTypeOption HighResolution
```


Gibt an, dass Spezial‑Hochauflösungs‑Medium verwendet wird.

### Label {#Label}
```
public static PageMediaType.PageMediaTypeOption Label
```


Gibt an, dass Etiketten‑Medium verwendet wird.

### MultiLayerForm {#MultiLayerForm}
```
public static PageMediaType.PageMediaTypeOption MultiLayerForm
```


Gibt an, dass angebundenes mehrteiliges Formular‑Medium verwendet wird.

### MultiPartForm {#MultiPartForm}
```
public static PageMediaType.PageMediaTypeOption MultiPartForm
```


Gibt an, dass separates mehrteiliges Formular‑Medium verwendet wird.

### None {#None}
```
public static PageMediaType.PageMediaTypeOption None
```


Gibt an, dass unbekanntes oder nicht gelistetes Medium verwendet wird.

### Photographic {#Photographic}
```
public static PageMediaType.PageMediaTypeOption Photographic
```


Gibt an, dass Standard‑Fotomedium verwendet wird.

### PhotographicFilm {#PhotographicFilm}
```
public static PageMediaType.PageMediaTypeOption PhotographicFilm
```


Gibt an, dass Film‑Fotomedium verwendet wird.

### PhotographicGlossy {#PhotographicGlossy}
```
public static PageMediaType.PageMediaTypeOption PhotographicGlossy
```


Gibt an, dass glänzendes Fotomedium verwendet wird.

### PhotographicHighGloss {#PhotographicHighGloss}
```
public static PageMediaType.PageMediaTypeOption PhotographicHighGloss
```


Gibt an, dass hochglänzendes Fotomedium verwendet wird.

### PhotographicMatte {#PhotographicMatte}
```
public static PageMediaType.PageMediaTypeOption PhotographicMatte
```


Gibt an, dass mattes Fotomedium verwendet wird.

### PhotographicSatin {#PhotographicSatin}
```
public static PageMediaType.PageMediaTypeOption PhotographicSatin
```


Gibt an, dass Satin‑Fotomedium verwendet wird.

### PhotographicSemiGloss {#PhotographicSemiGloss}
```
public static PageMediaType.PageMediaTypeOption PhotographicSemiGloss
```


Gibt an, dass halbglänzendes Fotomedium verwendet wird.

### Plain {#Plain}
```
public static PageMediaType.PageMediaTypeOption Plain
```


Gibt an, dass Standard‑Papier‑Medium verwendet wird.

### Screen {#Screen}
```
public static PageMediaType.PageMediaTypeOption Screen
```


Gibt an, dass die Ausgabe in kontinuierlicher Form auf einem Ausgabedisplay erfolgt.

### ScreenPaged {#ScreenPaged}
```
public static PageMediaType.PageMediaTypeOption ScreenPaged
```


Gibt an, dass die Ausgabe in seitenweiser Form auf einem Ausgabedisplay erfolgt.

### Stationary {#Stationary}
```
public static PageMediaType.PageMediaTypeOption Stationary
```


Gibt an, dass Spezial‑Bürobedarf‑Medium verwendet wird.

### TShirtTransfer {#TShirtTransfer}
```
public static PageMediaType.PageMediaTypeOption TShirtTransfer
```


Gibt an, dass Spezial‑T‑Shirt‑Transfer‑Medium verwendet wird.

### TabStockFull {#TabStockFull}
```
public static PageMediaType.PageMediaTypeOption TabStockFull
```


Gibt das Tab‑Rohmaterial an, das nicht vorgeschnitten ist (einzelne Registerkarten).

### TabStockPreCut {#TabStockPreCut}
```
public static PageMediaType.PageMediaTypeOption TabStockPreCut
```


Gibt das Tab‑Rohmaterial an, das vorgeschnitten ist (mehrere Registerkarten).

### Transparency {#Transparency}
```
public static PageMediaType.PageMediaTypeOption Transparency
```


Gibt Transparenzmedien an.

### add(IOptionItem[] items) {#add-com.aspose.xps.metadata.IOptionItem...-}
```
public void add(IOptionItem[] items)
```


Fügt eine Liste von Elementen am Ende der Elementliste dieser Option hinzu. Jedes muss eine Instanz von  ScoredProperty  oder  Property  sein.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| items | [IOptionItem\[\]](../../com.aspose.xps.metadata/ioptionitem) | Liste der hinzuzufügenden Elemente. |

### add(PageMediaType.IPageMediaTypeOptionItem[] items) {#add-com.aspose.xps.metadata.PageMediaType.IPageMediaTypeOptionItem...-}
```
public PageMediaType.PageMediaTypeOption add(PageMediaType.IPageMediaTypeOptionItem[] items)
```


Fügt dem Parameter ein Array von IPageMediaTypeOptionItem‑Instanzen hinzu.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| items | [IPageMediaTypeOptionItem\[\]](../../com.aspose.xps.metadata/ipagemediatypeoptionitem) | Ein beliebiges Array von IPageMediaTypeOptionItem‑Instanzen. |

**Returns:**
[PageMediaTypeOption](../../com.aspose.xps.metadata/pagemediatypeoption) - This options instance.
### clone() {#clone--}
```
public PageMediaType.PageMediaTypeOption clone()
```


Klont diese Optionsinstanz. Die Abkürzung für den Klon‑Konstruktor.

**Returns:**
[PageMediaTypeOption](../../com.aspose.xps.metadata/pagemediatypeoption) - The clone of this option instance.
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




### setWeight(int weight) {#setWeight-int-}
```
public PageMediaType.PageMediaTypeOption setWeight(int weight)
```


Setzt einen Weight‑bewerteten Eigenschaftswert.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Gewicht | int | Ein Weight‑bewerteter Eigenschaftswert. |

**Returns:**
[PageMediaTypeOption](../../com.aspose.xps.metadata/pagemediatypeoption) - This option instance.
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

