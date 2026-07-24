---
title: "PageMediaType.PageMediaTypeOption"
second_title: "Aspose.Page voor Java API-referentie"
description: "Beschrijft de opties voor de PageMediaType-functie."
type: docs
weight: 13
url: /nl/java/com.aspose.xps.metadata/pagemediatype.pagemediatypeoption/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Option](../../com.aspose.xps.metadata/option)

**All Implemented Interfaces:**
[com.aspose.xps.metadata.PageMediaType.IPageMediaTypeItem](../../com.aspose.xps.metadata/ipagemediatypeitem)
```
public static final class PageMediaType.PageMediaTypeOption extends Option implements PageMediaType.IPageMediaTypeItem
```

Beschrijft de opties van de functie PageMediaType.
## Constructors

| Constructor | Beschrijving |
| --- | --- |
| [PageMediaTypeOption(String optionName, PageMediaType.IPageMediaTypeOptionItem[] items)](#PageMediaTypeOption-java.lang.String-com.aspose.xps.metadata.PageMediaType.IPageMediaTypeOptionItem...-) | Maakt een nieuw exemplaar aan. |
| [PageMediaTypeOption(PageMediaType.PageMediaTypeOption option)](#PageMediaTypeOption-com.aspose.xps.metadata.PageMediaType.PageMediaTypeOption-) | Kloont deze optie-instantie. |
## Velden

| Veld | Beschrijving |
| --- | --- |
| [Archival](#Archival) | Specificeert archiefkwaliteit media. |
| [AutoSelect](#AutoSelect) | Specificeert Media zou automatisch worden geselecteerd. |
| [BackPrintFilm](#BackPrintFilm) | Specificeert speciale achterkant afdrukfilmmedia. |
| [Bond](#Bond) | Specificeert standaard bondmedia. |
| [CardStock](#CardStock) | Specificeert standaard kartonmedia. |
| [Continous](#Continous) | Specificeert continue invoermedia. |
| [EnvelopePlain](#EnvelopePlain) | Specificeert standaard envelopmedia. |
| [EnvelopeWindow](#EnvelopeWindow) | Specificeert vensterenvelopmedia. |
| [Fabric](#Fabric) | Specificeert stofmedia. |
| [HighResolution](#HighResolution) | Specificeert speciale hoge resolutie media. |
| [Label](#Label) | Specificeert labelmedia. |
| [MultiLayerForm](#MultiLayerForm) | Specificeert bijgevoegde multipartformulieren media. |
| [MultiPartForm](#MultiPartForm) | Specificeert afzonderlijke multipartformulieren media. |
| [None](#None) | Specificeert onbekende of niet-gespecificeerde media. |
| [Photographic](#Photographic) | Specificeert standaard fotografische media. |
| [PhotographicFilm](#PhotographicFilm) | Specificeert filmfotografische media. |
| [PhotographicGlossy](#PhotographicGlossy) | Specificeert glanzende fotografische media. |
| [PhotographicHighGloss](#PhotographicHighGloss) | Specificeert hoogglans fotografische media. |
| [PhotographicMatte](#PhotographicMatte) | Specificeert matte fotografische media. |
| [PhotographicSatin](#PhotographicSatin) | Specificeert satijnen fotografische media. |
| [PhotographicSemiGloss](#PhotographicSemiGloss) | Specificeert halfglans fotografische media. |
| [Plain](#Plain) | Specificeert standaard papiermedia. |
| [Screen](#Screen) | Specificeert uitvoer naar een weergave in continue vorm. |
| [ScreenPaged](#ScreenPaged) | Specificeert uitvoer naar een weergave in paginavorm. |
| [Stationary](#Stationary) | Specificeert speciale kantoorartikelen media. |
| [TShirtTransfer](#TShirtTransfer) | Specificeert speciale T-shirt overdrachtsmedia. |
| [TabStockFull](#TabStockFull) | Specificeert tabbladstockmedia die niet vooraf is gesneden (enkele tabbladen). |
| [TabStockPreCut](#TabStockPreCut) | Specificeert tabbladstockmedia die vooraf is gesneden (meerdere tabbladen). |
| [Transparency](#Transparency) | Specificeert transparantiemedia. |
## Methoden

| Methode | Beschrijving |
| --- | --- |
| [add(IOptionItem[] items)](#add-com.aspose.xps.metadata.IOptionItem...-) | Voegt een lijst met items toe aan het einde van de itemslijst van deze optie. |
| [add(PageMediaType.IPageMediaTypeOptionItem[] items)](#add-com.aspose.xps.metadata.PageMediaType.IPageMediaTypeOptionItem...-) | Voegt een array van IPageMediaTypeOptionItem-instanties toe aan de optie. |
| [clone()](#clone--) | Kloont deze optie-instantie. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getName()](#getName--) | Haalt de elementnaam op. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setWeight(int weight)](#setWeight-int-) | Stelt een Weight gescoorde eigenschapswaarde in. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### PageMediaTypeOption(String optionName, PageMediaType.IPageMediaTypeOptionItem[] items) {#PageMediaTypeOption-java.lang.String-com.aspose.xps.metadata.PageMediaType.IPageMediaTypeOptionItem...-}
```
public PageMediaTypeOption(String optionName, PageMediaType.IPageMediaTypeOptionItem[] items)
```


Maakt een nieuw exemplaar aan.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| optionName | java.lang.String | Een optienaam. |
| items | [IPageMediaTypeOptionItem\[\]](../../com.aspose.xps.metadata/ipagemediatypeoptionitem) | Een willekeurige array van IPageMediaTypeOptionItem-instanties. |

### PageMediaTypeOption(PageMediaType.PageMediaTypeOption option) {#PageMediaTypeOption-com.aspose.xps.metadata.PageMediaType.PageMediaTypeOption-}
```
public PageMediaTypeOption(PageMediaType.PageMediaTypeOption option)
```


Kloont deze optie-instantie.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| option | [PageMediaTypeOption](../../com.aspose.xps.metadata/pagemediatypeoption) | Een exemplaar om te klonen. |

### Archival {#Archival}
```
public static PageMediaType.PageMediaTypeOption Archival
```


Specificeert archiefkwaliteit media.

### AutoSelect {#AutoSelect}
```
public static PageMediaType.PageMediaTypeOption AutoSelect
```


Specificeert Media zou automatisch worden geselecteerd.

### BackPrintFilm {#BackPrintFilm}
```
public static PageMediaType.PageMediaTypeOption BackPrintFilm
```


Specificeert speciale achterkant afdrukfilmmedia.

### Bond {#Bond}
```
public static PageMediaType.PageMediaTypeOption Bond
```


Specificeert standaard bondmedia.

### CardStock {#CardStock}
```
public static PageMediaType.PageMediaTypeOption CardStock
```


Specificeert standaard kartonmedia.

### Continous {#Continous}
```
public static PageMediaType.PageMediaTypeOption Continous
```


Specificeert continue invoermedia.

### EnvelopePlain {#EnvelopePlain}
```
public static PageMediaType.PageMediaTypeOption EnvelopePlain
```


Specificeert standaard envelopmedia.

### EnvelopeWindow {#EnvelopeWindow}
```
public static PageMediaType.PageMediaTypeOption EnvelopeWindow
```


Specificeert vensterenvelopmedia.

### Fabric {#Fabric}
```
public static PageMediaType.PageMediaTypeOption Fabric
```


Specificeert stofmedia.

### HighResolution {#HighResolution}
```
public static PageMediaType.PageMediaTypeOption HighResolution
```


Specificeert speciale hoge resolutie media.

### Label {#Label}
```
public static PageMediaType.PageMediaTypeOption Label
```


Specificeert labelmedia.

### MultiLayerForm {#MultiLayerForm}
```
public static PageMediaType.PageMediaTypeOption MultiLayerForm
```


Specificeert bijgevoegde multipartformulieren media.

### MultiPartForm {#MultiPartForm}
```
public static PageMediaType.PageMediaTypeOption MultiPartForm
```


Specificeert afzonderlijke multipartformulieren media.

### None {#None}
```
public static PageMediaType.PageMediaTypeOption None
```


Specificeert onbekende of niet-gespecificeerde media.

### Photographic {#Photographic}
```
public static PageMediaType.PageMediaTypeOption Photographic
```


Specificeert standaard fotografische media.

### PhotographicFilm {#PhotographicFilm}
```
public static PageMediaType.PageMediaTypeOption PhotographicFilm
```


Specificeert filmfotografische media.

### PhotographicGlossy {#PhotographicGlossy}
```
public static PageMediaType.PageMediaTypeOption PhotographicGlossy
```


Specificeert glanzende fotografische media.

### PhotographicHighGloss {#PhotographicHighGloss}
```
public static PageMediaType.PageMediaTypeOption PhotographicHighGloss
```


Specificeert hoogglans fotografische media.

### PhotographicMatte {#PhotographicMatte}
```
public static PageMediaType.PageMediaTypeOption PhotographicMatte
```


Specificeert matte fotografische media.

### PhotographicSatin {#PhotographicSatin}
```
public static PageMediaType.PageMediaTypeOption PhotographicSatin
```


Specificeert satijnen fotografische media.

### PhotographicSemiGloss {#PhotographicSemiGloss}
```
public static PageMediaType.PageMediaTypeOption PhotographicSemiGloss
```


Specificeert halfglans fotografische media.

### Plain {#Plain}
```
public static PageMediaType.PageMediaTypeOption Plain
```


Specificeert standaard papiermedia.

### Screen {#Screen}
```
public static PageMediaType.PageMediaTypeOption Screen
```


Specificeert uitvoer naar een weergave in continue vorm.

### ScreenPaged {#ScreenPaged}
```
public static PageMediaType.PageMediaTypeOption ScreenPaged
```


Specificeert uitvoer naar een weergave in paginavorm.

### Stationary {#Stationary}
```
public static PageMediaType.PageMediaTypeOption Stationary
```


Specificeert speciale kantoorartikelen media.

### TShirtTransfer {#TShirtTransfer}
```
public static PageMediaType.PageMediaTypeOption TShirtTransfer
```


Specificeert speciale T-shirt overdrachtsmedia.

### TabStockFull {#TabStockFull}
```
public static PageMediaType.PageMediaTypeOption TabStockFull
```


Specificeert tabbladstockmedia die niet vooraf is gesneden (enkele tabbladen).

### TabStockPreCut {#TabStockPreCut}
```
public static PageMediaType.PageMediaTypeOption TabStockPreCut
```


Specificeert tabbladstockmedia die vooraf is gesneden (meerdere tabbladen).

### Transparency {#Transparency}
```
public static PageMediaType.PageMediaTypeOption Transparency
```


Specificeert transparantiemedia.

### add(IOptionItem[] items) {#add-com.aspose.xps.metadata.IOptionItem...-}
```
public void add(IOptionItem[] items)
```


Voegt een lijst met items toe aan het einde van de itemslijst van deze optie. Elk item moet een  ScoredProperty  of een  Property  instantie zijn.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| items | [IOptionItem\[\]](../../com.aspose.xps.metadata/ioptionitem) | Lijst met toe te voegen items. |

### add(PageMediaType.IPageMediaTypeOptionItem[] items) {#add-com.aspose.xps.metadata.PageMediaType.IPageMediaTypeOptionItem...-}
```
public PageMediaType.PageMediaTypeOption add(PageMediaType.IPageMediaTypeOptionItem[] items)
```


Voegt een array van IPageMediaTypeOptionItem-instanties toe aan de optie.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| items | [IPageMediaTypeOptionItem\[\]](../../com.aspose.xps.metadata/ipagemediatypeoptionitem) | Een willekeurige array van IPageMediaTypeOptionItem-instanties. |

**Returns:**
[PageMediaTypeOption](../../com.aspose.xps.metadata/pagemediatypeoption) - This options instance.
### clone() {#clone--}
```
public PageMediaType.PageMediaTypeOption clone()
```


Kloont dit optie‑exemplaar. De snelkoppeling naar de kloon‑constructor.

**Returns:**
[PageMediaTypeOption](../../com.aspose.xps.metadata/pagemediatypeoption) - The clone of this option instance.
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




### setWeight(int weight) {#setWeight-int-}
```
public PageMediaType.PageMediaTypeOption setWeight(int weight)
```


Stelt een Weight gescoorde eigenschapswaarde in.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| gewicht | int | Een Weight gescoorde eigenschapswaarde. |

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

