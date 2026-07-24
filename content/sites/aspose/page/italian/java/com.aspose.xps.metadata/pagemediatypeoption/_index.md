---
title: "PageMediaType.PageMediaTypeOption"
second_title: "Aspose.Page per Java API Reference"
description: "Descrive le opzioni della funzionalità PageMediaType."
type: docs
weight: 13
url: /it/java/com.aspose.xps.metadata/pagemediatype.pagemediatypeoption/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Option](../../com.aspose.xps.metadata/option)

**All Implemented Interfaces:**
[com.aspose.xps.metadata.PageMediaType.IPageMediaTypeItem](../../com.aspose.xps.metadata/ipagemediatypeitem)
```
public static final class PageMediaType.PageMediaTypeOption extends Option implements PageMediaType.IPageMediaTypeItem
```

Descrive le opzioni della funzionalità PageMediaType.
## Costruttori

| Costruttore | Descrizione |
| --- | --- |
| [PageMediaTypeOption(String optionName, PageMediaType.IPageMediaTypeOptionItem[] items)](#PageMediaTypeOption-java.lang.String-com.aspose.xps.metadata.PageMediaType.IPageMediaTypeOptionItem...-) | Crea una nuova istanza. |
| [PageMediaTypeOption(PageMediaType.PageMediaTypeOption option)](#PageMediaTypeOption-com.aspose.xps.metadata.PageMediaType.PageMediaTypeOption-) | Clona questa istanza dell'opzione. |
## Campi

| Campo | Descrizione |
| --- | --- |
| [Archival](#Archival) | Specifica supporti di qualità archivistica. |
| [AutoSelect](#AutoSelect) | Specifica che il supporto verrà selezionato automaticamente. |
| [BackPrintFilm](#BackPrintFilm) | Specifica supporto film per stampa posteriore specializzato. |
| [Bond](#Bond) | Specifica supporto bond standard. |
| [CardStock](#CardStock) | Specifica supporto cartoncino standard. |
| [Continous](#Continous) | Specifica supporto a alimentazione continua. |
| [EnvelopePlain](#EnvelopePlain) | Specifica supporto per buste standard. |
| [EnvelopeWindow](#EnvelopeWindow) | Specifica supporto per buste con finestra. |
| [Fabric](#Fabric) | Specifica supporto in tessuto. |
| [HighResolution](#HighResolution) | Specifica supporto specializzato ad alta risoluzione. |
| [Label](#Label) | Specifica supporto per etichette. |
| [MultiLayerForm](#MultiLayerForm) | Specifica supporto per moduli multipart collegati. |
| [MultiPartForm](#MultiPartForm) | Specifica supporto per moduli multipart separati. |
| [None](#None) | Specifica supporto sconosciuto o non elencato. |
| [Photographic](#Photographic) | Specifica supporto fotografico standard. |
| [PhotographicFilm](#PhotographicFilm) | Specifica supporto fotografico su pellicola. |
| [PhotographicGlossy](#PhotographicGlossy) | Specifica supporto fotografico lucido. |
| [PhotographicHighGloss](#PhotographicHighGloss) | Specifica supporto fotografico ad alto lucido. |
| [PhotographicMatte](#PhotographicMatte) | Specifica supporto fotografico opaco. |
| [PhotographicSatin](#PhotographicSatin) | Specifica supporto fotografico satinato. |
| [PhotographicSemiGloss](#PhotographicSemiGloss) | Specifica supporto fotografico semilucido. |
| [Plain](#Plain) | Specifica supporto carta standard. |
| [Screen](#Screen) | Specifica l'output a un display di output in forma continua. |
| [ScreenPaged](#ScreenPaged) | Specifica l'output a un display di output in forma paginata. |
| [Stationary](#Stationary) | Specifica supporto di cancelleria specializzata. |
| [TShirtTransfer](#TShirtTransfer) | Specifica supporto di trasferimento per T‑shirt specializzato. |
| [TabStockFull](#TabStockFull) | Specifica i supporti di stock per tabulatore che non sono pre-tagliati (tab singoli). |
| [TabStockPreCut](#TabStockPreCut) | Specifica i supporti di stock per tabulatore che sono pre-tagliati (tab multipli). |
| [Transparency](#Transparency) | Specifica supporti di trasparenza. |
## Metodi

| Metodo | Descrizione |
| --- | --- |
| [add(IOptionItem[] items)](#add-com.aspose.xps.metadata.IOptionItem...-) | Aggiunge un elenco di elementi alla fine dell'elenco degli elementi di questa opzione. |
| [add(PageMediaType.IPageMediaTypeOptionItem[] items)](#add-com.aspose.xps.metadata.PageMediaType.IPageMediaTypeOptionItem...-) | Aggiunge un array di  IPageMediaTypeOptionItem  istanze all'opzione. |
| [clone()](#clone--) | Clona questa istanza dell'opzione. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getName()](#getName--) | Ottiene il nome dell'elemento. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setWeight(int weight)](#setWeight-int-) | Imposta un valore della proprietà valutata  Weight . |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### PageMediaTypeOption(String optionName, PageMediaType.IPageMediaTypeOptionItem[] items) {#PageMediaTypeOption-java.lang.String-com.aspose.xps.metadata.PageMediaType.IPageMediaTypeOptionItem...-}
```
public PageMediaTypeOption(String optionName, PageMediaType.IPageMediaTypeOptionItem[] items)
```


Crea una nuova istanza.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| optionName | java.lang.String | Un nome dell'opzione. |
| items | [IPageMediaTypeOptionItem\[\]](../../com.aspose.xps.metadata/ipagemediatypeoptionitem) | Un array arbitrario di  IPageMediaTypeOptionItem  istanze. |

### PageMediaTypeOption(PageMediaType.PageMediaTypeOption option) {#PageMediaTypeOption-com.aspose.xps.metadata.PageMediaType.PageMediaTypeOption-}
```
public PageMediaTypeOption(PageMediaType.PageMediaTypeOption option)
```


Clona questa istanza dell'opzione.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| option | [PageMediaTypeOption](../../com.aspose.xps.metadata/pagemediatypeoption) | Un'istanza da clonare. |

### Archival {#Archival}
```
public static PageMediaType.PageMediaTypeOption Archival
```


Specifica supporti di qualità archivistica.

### AutoSelect {#AutoSelect}
```
public static PageMediaType.PageMediaTypeOption AutoSelect
```


Specifica che il supporto verrà selezionato automaticamente.

### BackPrintFilm {#BackPrintFilm}
```
public static PageMediaType.PageMediaTypeOption BackPrintFilm
```


Specifica supporto film per stampa posteriore specializzato.

### Bond {#Bond}
```
public static PageMediaType.PageMediaTypeOption Bond
```


Specifica supporto bond standard.

### CardStock {#CardStock}
```
public static PageMediaType.PageMediaTypeOption CardStock
```


Specifica supporto cartoncino standard.

### Continous {#Continous}
```
public static PageMediaType.PageMediaTypeOption Continous
```


Specifica supporto a alimentazione continua.

### EnvelopePlain {#EnvelopePlain}
```
public static PageMediaType.PageMediaTypeOption EnvelopePlain
```


Specifica supporto per buste standard.

### EnvelopeWindow {#EnvelopeWindow}
```
public static PageMediaType.PageMediaTypeOption EnvelopeWindow
```


Specifica supporto per buste con finestra.

### Fabric {#Fabric}
```
public static PageMediaType.PageMediaTypeOption Fabric
```


Specifica supporto in tessuto.

### HighResolution {#HighResolution}
```
public static PageMediaType.PageMediaTypeOption HighResolution
```


Specifica supporto specializzato ad alta risoluzione.

### Label {#Label}
```
public static PageMediaType.PageMediaTypeOption Label
```


Specifica supporto per etichette.

### MultiLayerForm {#MultiLayerForm}
```
public static PageMediaType.PageMediaTypeOption MultiLayerForm
```


Specifica supporto per moduli multipart collegati.

### MultiPartForm {#MultiPartForm}
```
public static PageMediaType.PageMediaTypeOption MultiPartForm
```


Specifica supporto per moduli multipart separati.

### None {#None}
```
public static PageMediaType.PageMediaTypeOption None
```


Specifica supporto sconosciuto o non elencato.

### Photographic {#Photographic}
```
public static PageMediaType.PageMediaTypeOption Photographic
```


Specifica supporto fotografico standard.

### PhotographicFilm {#PhotographicFilm}
```
public static PageMediaType.PageMediaTypeOption PhotographicFilm
```


Specifica supporto fotografico su pellicola.

### PhotographicGlossy {#PhotographicGlossy}
```
public static PageMediaType.PageMediaTypeOption PhotographicGlossy
```


Specifica supporto fotografico lucido.

### PhotographicHighGloss {#PhotographicHighGloss}
```
public static PageMediaType.PageMediaTypeOption PhotographicHighGloss
```


Specifica supporto fotografico ad alto lucido.

### PhotographicMatte {#PhotographicMatte}
```
public static PageMediaType.PageMediaTypeOption PhotographicMatte
```


Specifica supporto fotografico opaco.

### PhotographicSatin {#PhotographicSatin}
```
public static PageMediaType.PageMediaTypeOption PhotographicSatin
```


Specifica supporto fotografico satinato.

### PhotographicSemiGloss {#PhotographicSemiGloss}
```
public static PageMediaType.PageMediaTypeOption PhotographicSemiGloss
```


Specifica supporto fotografico semilucido.

### Plain {#Plain}
```
public static PageMediaType.PageMediaTypeOption Plain
```


Specifica supporto carta standard.

### Screen {#Screen}
```
public static PageMediaType.PageMediaTypeOption Screen
```


Specifica l'output a un display di output in forma continua.

### ScreenPaged {#ScreenPaged}
```
public static PageMediaType.PageMediaTypeOption ScreenPaged
```


Specifica l'output a un display di output in forma paginata.

### Stationary {#Stationary}
```
public static PageMediaType.PageMediaTypeOption Stationary
```


Specifica supporto di cancelleria specializzata.

### TShirtTransfer {#TShirtTransfer}
```
public static PageMediaType.PageMediaTypeOption TShirtTransfer
```


Specifica supporto di trasferimento per T‑shirt specializzato.

### TabStockFull {#TabStockFull}
```
public static PageMediaType.PageMediaTypeOption TabStockFull
```


Specifica i supporti di stock per tabulatore che non sono pre-tagliati (tab singoli).

### TabStockPreCut {#TabStockPreCut}
```
public static PageMediaType.PageMediaTypeOption TabStockPreCut
```


Specifica i supporti di stock per tabulatore che sono pre-tagliati (tab multipli).

### Transparency {#Transparency}
```
public static PageMediaType.PageMediaTypeOption Transparency
```


Specifica supporti di trasparenza.

### add(IOptionItem[] items) {#add-com.aspose.xps.metadata.IOptionItem...-}
```
public void add(IOptionItem[] items)
```


Aggiunge un elenco di elementi alla fine dell'elenco degli elementi di questa opzione. Ognuno deve essere un'istanza di  ScoredProperty  o di  Property .

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| items | [IOptionItem\[\]](../../com.aspose.xps.metadata/ioptionitem) | Elenco di elementi da aggiungere. |

### add(PageMediaType.IPageMediaTypeOptionItem[] items) {#add-com.aspose.xps.metadata.PageMediaType.IPageMediaTypeOptionItem...-}
```
public PageMediaType.PageMediaTypeOption add(PageMediaType.IPageMediaTypeOptionItem[] items)
```


Aggiunge un array di  IPageMediaTypeOptionItem  istanze all'opzione.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| items | [IPageMediaTypeOptionItem\[\]](../../com.aspose.xps.metadata/ipagemediatypeoptionitem) | Un array arbitrario di  IPageMediaTypeOptionItem  istanze. |

**Returns:**
[PageMediaTypeOption](../../com.aspose.xps.metadata/pagemediatypeoption) - This options instance.
### clone() {#clone--}
```
public PageMediaType.PageMediaTypeOption clone()
```


Clona questa istanza di opzione. La scorciatoia per il costruttore di clonazione.

**Returns:**
[PageMediaTypeOption](../../com.aspose.xps.metadata/pagemediatypeoption) - The clone of this option instance.
### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| Parametro | Tipo | Descrizione |
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


Ottiene il nome dell'elemento.

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


Imposta un valore della proprietà valutata  Weight .

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| peso | int | Un valore della proprietà valutata  Weight . |

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
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

