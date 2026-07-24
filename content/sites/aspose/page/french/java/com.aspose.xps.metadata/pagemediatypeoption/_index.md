---
title: "PageMediaType.PageMediaTypeOption"
second_title: "Référence API Aspose.Page pour Java"
description: "Décrit les options de la fonctionnalité PageMediaType."
type: docs
weight: 13
url: /fr/java/com.aspose.xps.metadata/pagemediatype.pagemediatypeoption/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Option](../../com.aspose.xps.metadata/option)

**All Implemented Interfaces:**
[com.aspose.xps.metadata.PageMediaType.IPageMediaTypeItem](../../com.aspose.xps.metadata/ipagemediatypeitem)
```
public static final class PageMediaType.PageMediaTypeOption extends Option implements PageMediaType.IPageMediaTypeItem
```

Décrit les options de la fonctionnalité  PageMediaType .
## Constructeurs

| Constructeur | Description |
| --- | --- |
| [PageMediaTypeOption(String optionName, PageMediaType.IPageMediaTypeOptionItem[] items)](#PageMediaTypeOption-java.lang.String-com.aspose.xps.metadata.PageMediaType.IPageMediaTypeOptionItem...-) | Crée une nouvelle instance. |
| [PageMediaTypeOption(PageMediaType.PageMediaTypeOption option)](#PageMediaTypeOption-com.aspose.xps.metadata.PageMediaType.PageMediaTypeOption-) | Clone cette instance d'option. |
## Champs

| Champ | Description |
| --- | --- |
| [Archival](#Archival) | Spécifie un support de qualité archivistique. |
| [AutoSelect](#AutoSelect) | Spécifie que le Media serait sélectionné automatiquement. |
| [BackPrintFilm](#BackPrintFilm) | Spécifie le Media film d'impression arrière spécialisé. |
| [Bond](#Bond) | Spécifie le Media de liaison standard. |
| [CardStock](#CardStock) | Spécifie le Media de papier cartonné standard. |
| [Continous](#Continous) | Spécifie le Media à alimentation continue. |
| [EnvelopePlain](#EnvelopePlain) | Spécifie le Media d'enveloppe standard. |
| [EnvelopeWindow](#EnvelopeWindow) | Spécifie le Media d'enveloppe à fenêtre. |
| [Fabric](#Fabric) | Spécifie le Media en tissu. |
| [HighResolution](#HighResolution) | Spécifie le Media haute résolution spécialisé. |
| [Label](#Label) | Spécifie le Media d'étiquette. |
| [MultiLayerForm](#MultiLayerForm) | Spécifie le Media de formulaires multiparties attachés. |
| [MultiPartForm](#MultiPartForm) | Spécifie le Media de formulaires multiparties séparés. |
| [None](#None) | Spécifie un Media inconnu ou non répertorié. |
| [Photographic](#Photographic) | Spécifie le Media photographique standard. |
| [PhotographicFilm](#PhotographicFilm) | Spécifie le Media photographique sur film. |
| [PhotographicGlossy](#PhotographicGlossy) | Spécifie le Media photographique brillant. |
| [PhotographicHighGloss](#PhotographicHighGloss) | Spécifie le Media photographique à haute brillance. |
| [PhotographicMatte](#PhotographicMatte) | Spécifie le Media photographique mat. |
| [PhotographicSatin](#PhotographicSatin) | Spécifie le Media photographique satiné. |
| [PhotographicSemiGloss](#PhotographicSemiGloss) | Spécifie le Media photographique semi-brillant. |
| [Plain](#Plain) | Spécifie le Media papier standard. |
| [Screen](#Screen) | Spécifie la sortie vers un affichage de sortie en forme continue. |
| [ScreenPaged](#ScreenPaged) | Spécifie la sortie vers un affichage de sortie en forme paginée. |
| [Stationary](#Stationary) | Spécifie le Media de papeterie spécialisé. |
| [TShirtTransfer](#TShirtTransfer) | Spécifie le Media de transfert pour T-shirt spécialisé. |
| [TabStockFull](#TabStockFull) | Spécifie le support de stock d'onglets qui n'est pas pré-découpé (onglets simples). |
| [TabStockPreCut](#TabStockPreCut) | Spécifie le support de stock d'onglets qui est pré-découpé (onglets multiples). |
| [Transparency](#Transparency) | Spécifie le support de transparence. |
## Méthodes

| Méthode | Description |
| --- | --- |
| [add(IOptionItem[] items)](#add-com.aspose.xps.metadata.IOptionItem...-) | Ajoute une liste d'éléments à la fin de la liste d'éléments de cette option. |
| [add(PageMediaType.IPageMediaTypeOptionItem[] items)](#add-com.aspose.xps.metadata.PageMediaType.IPageMediaTypeOptionItem...-) | Ajoute un tableau d'instances de  IPageMediaTypeOptionItem  à l'option. |
| [clone()](#clone--) | Clone cette instance d'option. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getName()](#getName--) | Obtient le nom de l'élément. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setWeight(int weight)](#setWeight-int-) | Définit une valeur de propriété notée  Weight . |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### PageMediaTypeOption(String optionName, PageMediaType.IPageMediaTypeOptionItem[] items) {#PageMediaTypeOption-java.lang.String-com.aspose.xps.metadata.PageMediaType.IPageMediaTypeOptionItem...-}
```
public PageMediaTypeOption(String optionName, PageMediaType.IPageMediaTypeOptionItem[] items)
```


Crée une nouvelle instance.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| optionName | java.lang.String | Un nom d'option. |
| items | [IPageMediaTypeOptionItem\[\]](../../com.aspose.xps.metadata/ipagemediatypeoptionitem) | Un tableau arbitraire d'instances de  IPageMediaTypeOptionItem . |

### PageMediaTypeOption(PageMediaType.PageMediaTypeOption option) {#PageMediaTypeOption-com.aspose.xps.metadata.PageMediaType.PageMediaTypeOption-}
```
public PageMediaTypeOption(PageMediaType.PageMediaTypeOption option)
```


Clone cette instance d'option.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| option | [PageMediaTypeOption](../../com.aspose.xps.metadata/pagemediatypeoption) | Une instance à cloner. |

### Archival {#Archival}
```
public static PageMediaType.PageMediaTypeOption Archival
```


Spécifie un support de qualité archivistique.

### AutoSelect {#AutoSelect}
```
public static PageMediaType.PageMediaTypeOption AutoSelect
```


Spécifie que le Media serait sélectionné automatiquement.

### BackPrintFilm {#BackPrintFilm}
```
public static PageMediaType.PageMediaTypeOption BackPrintFilm
```


Spécifie le Media film d'impression arrière spécialisé.

### Bond {#Bond}
```
public static PageMediaType.PageMediaTypeOption Bond
```


Spécifie le Media de liaison standard.

### CardStock {#CardStock}
```
public static PageMediaType.PageMediaTypeOption CardStock
```


Spécifie le Media de papier cartonné standard.

### Continous {#Continous}
```
public static PageMediaType.PageMediaTypeOption Continous
```


Spécifie le Media à alimentation continue.

### EnvelopePlain {#EnvelopePlain}
```
public static PageMediaType.PageMediaTypeOption EnvelopePlain
```


Spécifie le Media d'enveloppe standard.

### EnvelopeWindow {#EnvelopeWindow}
```
public static PageMediaType.PageMediaTypeOption EnvelopeWindow
```


Spécifie le Media d'enveloppe à fenêtre.

### Fabric {#Fabric}
```
public static PageMediaType.PageMediaTypeOption Fabric
```


Spécifie le Media en tissu.

### HighResolution {#HighResolution}
```
public static PageMediaType.PageMediaTypeOption HighResolution
```


Spécifie le Media haute résolution spécialisé.

### Label {#Label}
```
public static PageMediaType.PageMediaTypeOption Label
```


Spécifie le Media d'étiquette.

### MultiLayerForm {#MultiLayerForm}
```
public static PageMediaType.PageMediaTypeOption MultiLayerForm
```


Spécifie le Media de formulaires multiparties attachés.

### MultiPartForm {#MultiPartForm}
```
public static PageMediaType.PageMediaTypeOption MultiPartForm
```


Spécifie le Media de formulaires multiparties séparés.

### None {#None}
```
public static PageMediaType.PageMediaTypeOption None
```


Spécifie un Media inconnu ou non répertorié.

### Photographic {#Photographic}
```
public static PageMediaType.PageMediaTypeOption Photographic
```


Spécifie le Media photographique standard.

### PhotographicFilm {#PhotographicFilm}
```
public static PageMediaType.PageMediaTypeOption PhotographicFilm
```


Spécifie le Media photographique sur film.

### PhotographicGlossy {#PhotographicGlossy}
```
public static PageMediaType.PageMediaTypeOption PhotographicGlossy
```


Spécifie le Media photographique brillant.

### PhotographicHighGloss {#PhotographicHighGloss}
```
public static PageMediaType.PageMediaTypeOption PhotographicHighGloss
```


Spécifie le Media photographique à haute brillance.

### PhotographicMatte {#PhotographicMatte}
```
public static PageMediaType.PageMediaTypeOption PhotographicMatte
```


Spécifie le Media photographique mat.

### PhotographicSatin {#PhotographicSatin}
```
public static PageMediaType.PageMediaTypeOption PhotographicSatin
```


Spécifie le Media photographique satiné.

### PhotographicSemiGloss {#PhotographicSemiGloss}
```
public static PageMediaType.PageMediaTypeOption PhotographicSemiGloss
```


Spécifie le Media photographique semi-brillant.

### Plain {#Plain}
```
public static PageMediaType.PageMediaTypeOption Plain
```


Spécifie le Media papier standard.

### Screen {#Screen}
```
public static PageMediaType.PageMediaTypeOption Screen
```


Spécifie la sortie vers un affichage de sortie en forme continue.

### ScreenPaged {#ScreenPaged}
```
public static PageMediaType.PageMediaTypeOption ScreenPaged
```


Spécifie la sortie vers un affichage de sortie en forme paginée.

### Stationary {#Stationary}
```
public static PageMediaType.PageMediaTypeOption Stationary
```


Spécifie le Media de papeterie spécialisé.

### TShirtTransfer {#TShirtTransfer}
```
public static PageMediaType.PageMediaTypeOption TShirtTransfer
```


Spécifie le Media de transfert pour T-shirt spécialisé.

### TabStockFull {#TabStockFull}
```
public static PageMediaType.PageMediaTypeOption TabStockFull
```


Spécifie le support de stock d'onglets qui n'est pas pré-découpé (onglets simples).

### TabStockPreCut {#TabStockPreCut}
```
public static PageMediaType.PageMediaTypeOption TabStockPreCut
```


Spécifie le support de stock d'onglets qui est pré-découpé (onglets multiples).

### Transparency {#Transparency}
```
public static PageMediaType.PageMediaTypeOption Transparency
```


Spécifie le support de transparence.

### add(IOptionItem[] items) {#add-com.aspose.xps.metadata.IOptionItem...-}
```
public void add(IOptionItem[] items)
```


Ajoute une liste d'éléments à la fin de la liste d'éléments de cette option. Chaque élément doit être une instance de  ScoredProperty  ou de  Property .

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| items | [IOptionItem\[\]](../../com.aspose.xps.metadata/ioptionitem) | Liste des éléments à ajouter. |

### add(PageMediaType.IPageMediaTypeOptionItem[] items) {#add-com.aspose.xps.metadata.PageMediaType.IPageMediaTypeOptionItem...-}
```
public PageMediaType.PageMediaTypeOption add(PageMediaType.IPageMediaTypeOptionItem[] items)
```


Ajoute un tableau d'instances de  IPageMediaTypeOptionItem  à l'option.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| items | [IPageMediaTypeOptionItem\[\]](../../com.aspose.xps.metadata/ipagemediatypeoptionitem) | Un tableau arbitraire d'instances de  IPageMediaTypeOptionItem . |

**Returns:**
[PageMediaTypeOption](../../com.aspose.xps.metadata/pagemediatypeoption) - This options instance.
### clone() {#clone--}
```
public PageMediaType.PageMediaTypeOption clone()
```


Clone cette instance d'option. Le raccourci vers le constructeur de clonage.

**Returns:**
[PageMediaTypeOption](../../com.aspose.xps.metadata/pagemediatypeoption) - The clone of this option instance.
### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| Paramètre | Type | Description |
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


Obtient le nom de l'élément.

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


Définit une valeur de propriété notée  Weight .

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| poids | int | Une valeur de propriété notée  Weight . |

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
| Paramètre | Type | Description |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

