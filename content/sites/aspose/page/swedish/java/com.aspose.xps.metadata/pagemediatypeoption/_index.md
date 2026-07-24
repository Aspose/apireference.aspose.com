---
title: "PageMediaType.PageMediaTypeOption"
second_title: "Aspose.Page för Java API-referens"
description: "Beskriver alternativ för PageMediaType-funktionen."
type: docs
weight: 13
url: /sv/java/com.aspose.xps.metadata/pagemediatype.pagemediatypeoption/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Option](../../com.aspose.xps.metadata/option)

**All Implemented Interfaces:**
[com.aspose.xps.metadata.PageMediaType.IPageMediaTypeItem](../../com.aspose.xps.metadata/ipagemediatypeitem)
```
public static final class PageMediaType.PageMediaTypeOption extends Option implements PageMediaType.IPageMediaTypeItem
```

Beskriver  PageMediaType  funktionens alternativ.
## Konstruktörer

| Konstruktor | Beskrivning |
| --- | --- |
| [PageMediaTypeOption(String optionName, PageMediaType.IPageMediaTypeOptionItem[] items)](#PageMediaTypeOption-java.lang.String-com.aspose.xps.metadata.PageMediaType.IPageMediaTypeOptionItem...-) | Skapar en ny instans. |
| [PageMediaTypeOption(PageMediaType.PageMediaTypeOption option)](#PageMediaTypeOption-com.aspose.xps.metadata.PageMediaType.PageMediaTypeOption-) | Klonar den här alternativinstansen. |
## Fält

| Fält | Beskrivning |
| --- | --- |
| [Archival](#Archival) | Specificerar arkivkvalitetsmedia. |
| [AutoSelect](#AutoSelect) | Specificerar att media automatiskt ska väljas. |
| [BackPrintFilm](#BackPrintFilm) | Specificerar specialfilm för baktryck media. |
| [Bond](#Bond) | Specificerar standardbindningsmedia. |
| [CardStock](#CardStock) | Specificerar standardkortpappersmedia. |
| [Continous](#Continous) | Specificerar kontinuerlig matningsmedia. |
| [EnvelopePlain](#EnvelopePlain) | Specificerar standardkuvertmedia. |
| [EnvelopeWindow](#EnvelopeWindow) | Specificerar fönsterkuvertmedia. |
| [Fabric](#Fabric) | Specificerar tygmedia. |
| [HighResolution](#HighResolution) | Specificerar specialmedia med hög upplösning. |
| [Label](#Label) | Specificerar etikettmedia. |
| [MultiLayerForm](#MultiLayerForm) | Specificerar bifogade flerdelade formulärmedia. |
| [MultiPartForm](#MultiPartForm) | Specificerar separata flerdelade formulärmedia. |
| [None](#None) | Specificerar okänt eller olistat media. |
| [Photographic](#Photographic) | Specificerar standardfotografimedia. |
| [PhotographicFilm](#PhotographicFilm) | Specificerar filmfotografimedia. |
| [PhotographicGlossy](#PhotographicGlossy) | Specificerar glansigt fotografimedia. |
| [PhotographicHighGloss](#PhotographicHighGloss) | Specificerar högglansfotografimedia. |
| [PhotographicMatte](#PhotographicMatte) | Specificerar mattfotografimedia. |
| [PhotographicSatin](#PhotographicSatin) | Specificerar satinfotografimedia. |
| [PhotographicSemiGloss](#PhotographicSemiGloss) | Specificerar halvglansfotografimedia. |
| [Plain](#Plain) | Specificerar standardpappersmedia. |
| [Screen](#Screen) | Specificerar utskrift till en display i kontinuerlig form. |
| [ScreenPaged](#ScreenPaged) | Specificerar utskrift till en display i sidform. |
| [Stationary](#Stationary) | Specificerar specialkontorsmaterialmedia. |
| [TShirtTransfer](#TShirtTransfer) | Anger specialiserat T‑shirt‑överföringsmedia. |
| [TabStockFull](#TabStockFull) | Anger flik‑stockmedia som inte är förskuren (enkla flikar). |
| [TabStockPreCut](#TabStockPreCut) | Anger flik‑stockmedia som är förskuren (flera flikar). |
| [Transparency](#Transparency) | Anger transparensmedia. |
## Metoder

| Metod | Beskrivning |
| --- | --- |
| [add(IOptionItem[] items)](#add-com.aspose.xps.metadata.IOptionItem...-) | Lägger till en lista med objekt i slutet av detta alternativs objektlista. |
| [add(PageMediaType.IPageMediaTypeOptionItem[] items)](#add-com.aspose.xps.metadata.PageMediaType.IPageMediaTypeOptionItem...-) | Lägger till en matris av  IPageMediaTypeOptionItem  -instanser till alternativet. |
| [clone()](#clone--) | Klonar den här alternativinstansen. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getName()](#getName--) | Hämtar elementets namn. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setWeight(int weight)](#setWeight-int-) | Ställer in ett  Weight  poängegenskapsvärde. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### PageMediaTypeOption(String optionName, PageMediaType.IPageMediaTypeOptionItem[] items) {#PageMediaTypeOption-java.lang.String-com.aspose.xps.metadata.PageMediaType.IPageMediaTypeOptionItem...-}
```
public PageMediaTypeOption(String optionName, PageMediaType.IPageMediaTypeOptionItem[] items)
```


Skapar en ny instans.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| optionName | java.lang.String | Ett alternativnamn. |
| items | [IPageMediaTypeOptionItem\[\]](../../com.aspose.xps.metadata/ipagemediatypeoptionitem) | En godtycklig matris av  IPageMediaTypeOptionItem  -instanser. |

### PageMediaTypeOption(PageMediaType.PageMediaTypeOption option) {#PageMediaTypeOption-com.aspose.xps.metadata.PageMediaType.PageMediaTypeOption-}
```
public PageMediaTypeOption(PageMediaType.PageMediaTypeOption option)
```


Klonar den här alternativinstansen.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| option | [PageMediaTypeOption](../../com.aspose.xps.metadata/pagemediatypeoption) | En instans att klona. |

### Archival {#Archival}
```
public static PageMediaType.PageMediaTypeOption Archival
```


Specificerar arkivkvalitetsmedia.

### AutoSelect {#AutoSelect}
```
public static PageMediaType.PageMediaTypeOption AutoSelect
```


Specificerar att media automatiskt ska väljas.

### BackPrintFilm {#BackPrintFilm}
```
public static PageMediaType.PageMediaTypeOption BackPrintFilm
```


Specificerar specialfilm för baktryck media.

### Bond {#Bond}
```
public static PageMediaType.PageMediaTypeOption Bond
```


Specificerar standardbindningsmedia.

### CardStock {#CardStock}
```
public static PageMediaType.PageMediaTypeOption CardStock
```


Specificerar standardkortpappersmedia.

### Continous {#Continous}
```
public static PageMediaType.PageMediaTypeOption Continous
```


Specificerar kontinuerlig matningsmedia.

### EnvelopePlain {#EnvelopePlain}
```
public static PageMediaType.PageMediaTypeOption EnvelopePlain
```


Specificerar standardkuvertmedia.

### EnvelopeWindow {#EnvelopeWindow}
```
public static PageMediaType.PageMediaTypeOption EnvelopeWindow
```


Specificerar fönsterkuvertmedia.

### Fabric {#Fabric}
```
public static PageMediaType.PageMediaTypeOption Fabric
```


Specificerar tygmedia.

### HighResolution {#HighResolution}
```
public static PageMediaType.PageMediaTypeOption HighResolution
```


Specificerar specialmedia med hög upplösning.

### Label {#Label}
```
public static PageMediaType.PageMediaTypeOption Label
```


Specificerar etikettmedia.

### MultiLayerForm {#MultiLayerForm}
```
public static PageMediaType.PageMediaTypeOption MultiLayerForm
```


Specificerar bifogade flerdelade formulärmedia.

### MultiPartForm {#MultiPartForm}
```
public static PageMediaType.PageMediaTypeOption MultiPartForm
```


Specificerar separata flerdelade formulärmedia.

### None {#None}
```
public static PageMediaType.PageMediaTypeOption None
```


Specificerar okänt eller olistat media.

### Photographic {#Photographic}
```
public static PageMediaType.PageMediaTypeOption Photographic
```


Specificerar standardfotografimedia.

### PhotographicFilm {#PhotographicFilm}
```
public static PageMediaType.PageMediaTypeOption PhotographicFilm
```


Specificerar filmfotografimedia.

### PhotographicGlossy {#PhotographicGlossy}
```
public static PageMediaType.PageMediaTypeOption PhotographicGlossy
```


Specificerar glansigt fotografimedia.

### PhotographicHighGloss {#PhotographicHighGloss}
```
public static PageMediaType.PageMediaTypeOption PhotographicHighGloss
```


Specificerar högglansfotografimedia.

### PhotographicMatte {#PhotographicMatte}
```
public static PageMediaType.PageMediaTypeOption PhotographicMatte
```


Specificerar mattfotografimedia.

### PhotographicSatin {#PhotographicSatin}
```
public static PageMediaType.PageMediaTypeOption PhotographicSatin
```


Specificerar satinfotografimedia.

### PhotographicSemiGloss {#PhotographicSemiGloss}
```
public static PageMediaType.PageMediaTypeOption PhotographicSemiGloss
```


Specificerar halvglansfotografimedia.

### Plain {#Plain}
```
public static PageMediaType.PageMediaTypeOption Plain
```


Specificerar standardpappersmedia.

### Screen {#Screen}
```
public static PageMediaType.PageMediaTypeOption Screen
```


Specificerar utskrift till en display i kontinuerlig form.

### ScreenPaged {#ScreenPaged}
```
public static PageMediaType.PageMediaTypeOption ScreenPaged
```


Specificerar utskrift till en display i sidform.

### Stationary {#Stationary}
```
public static PageMediaType.PageMediaTypeOption Stationary
```


Specificerar specialkontorsmaterialmedia.

### TShirtTransfer {#TShirtTransfer}
```
public static PageMediaType.PageMediaTypeOption TShirtTransfer
```


Anger specialiserat T‑shirt‑överföringsmedia.

### TabStockFull {#TabStockFull}
```
public static PageMediaType.PageMediaTypeOption TabStockFull
```


Anger flik‑stockmedia som inte är förskuren (enkla flikar).

### TabStockPreCut {#TabStockPreCut}
```
public static PageMediaType.PageMediaTypeOption TabStockPreCut
```


Anger flik‑stockmedia som är förskuren (flera flikar).

### Transparency {#Transparency}
```
public static PageMediaType.PageMediaTypeOption Transparency
```


Anger transparensmedia.

### add(IOptionItem[] items) {#add-com.aspose.xps.metadata.IOptionItem...-}
```
public void add(IOptionItem[] items)
```


Lägger till en lista med objekt i slutet av detta alternativs objektlista. Varje objekt måste vara en  ScoredProperty  eller en  Property  -instans.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| items | [IOptionItem\[\]](../../com.aspose.xps.metadata/ioptionitem) | Lista med objekt att lägga till. |

### add(PageMediaType.IPageMediaTypeOptionItem[] items) {#add-com.aspose.xps.metadata.PageMediaType.IPageMediaTypeOptionItem...-}
```
public PageMediaType.PageMediaTypeOption add(PageMediaType.IPageMediaTypeOptionItem[] items)
```


Lägger till en matris av  IPageMediaTypeOptionItem  -instanser till alternativet.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| items | [IPageMediaTypeOptionItem\[\]](../../com.aspose.xps.metadata/ipagemediatypeoptionitem) | En godtycklig matris av  IPageMediaTypeOptionItem  -instanser. |

**Returns:**
[PageMediaTypeOption](../../com.aspose.xps.metadata/pagemediatypeoption) - This options instance.
### clone() {#clone--}
```
public PageMediaType.PageMediaTypeOption clone()
```


Klonar denna alternativinstans. Genvägen till kloningskonstruktorn.

**Returns:**
[PageMediaTypeOption](../../com.aspose.xps.metadata/pagemediatypeoption) - The clone of this option instance.
### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| Parameter | Typ | Beskrivning |
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


Hämtar elementets namn.

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


Ställer in ett  Weight  poängegenskapsvärde.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| vikt | int | Ett  Weight  poängegenskapsvärde. |

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
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

