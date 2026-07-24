---
title: "PageMediaType.PageMediaTypeOption"
second_title: "Referencia de API de Aspose.Page para Java"
description: "Describe las opciones de característica PageMediaType."
type: docs
weight: 13
url: /es/java/com.aspose.xps.metadata/pagemediatype.pagemediatypeoption/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Option](../../com.aspose.xps.metadata/option)

**All Implemented Interfaces:**
[com.aspose.xps.metadata.PageMediaType.IPageMediaTypeItem](../../com.aspose.xps.metadata/ipagemediatypeitem)
```
public static final class PageMediaType.PageMediaTypeOption extends Option implements PageMediaType.IPageMediaTypeItem
```

Describe las opciones de la característica  PageMediaType  .
## Constructores

| Constructor | Descripción |
| --- | --- |
| [PageMediaTypeOption(String optionName, PageMediaType.IPageMediaTypeOptionItem[] items)](#PageMediaTypeOption-java.lang.String-com.aspose.xps.metadata.PageMediaType.IPageMediaTypeOptionItem...-) | Crea una nueva instancia. |
| [PageMediaTypeOption(PageMediaType.PageMediaTypeOption option)](#PageMediaTypeOption-com.aspose.xps.metadata.PageMediaType.PageMediaTypeOption-) | Clona esta instancia de opción. |
## Campos

| Campo | Descripción |
| --- | --- |
| [Archival](#Archival) | Especifica medios de calidad de archivo. |
| [AutoSelect](#AutoSelect) | Especifica que el medio se seleccionará automáticamente. |
| [BackPrintFilm](#BackPrintFilm) | Especifica medios de película de impresión posterior especializados. |
| [Bond](#Bond) | Especifica medios de papel bond estándar. |
| [CardStock](#CardStock) | Especifica medios de cartulina estándar. |
| [Continous](#Continous) | Especifica medios de alimentación continua. |
| [EnvelopePlain](#EnvelopePlain) | Especifica medios de sobre estándar. |
| [EnvelopeWindow](#EnvelopeWindow) | Especifica medios de sobre con ventana. |
| [Fabric](#Fabric) | Especifica medios de tela. |
| [HighResolution](#HighResolution) | Especifica medios de alta resolución especializados. |
| [Label](#Label) | Especifica medios de etiqueta. |
| [MultiLayerForm](#MultiLayerForm) | Especifica medios de formularios multiparte adjuntos. |
| [MultiPartForm](#MultiPartForm) | Especifica medios de formularios multiparte separados. |
| [None](#None) | Especifica medios desconocidos o no listados. |
| [Photographic](#Photographic) | Especifica medios fotográficos estándar. |
| [PhotographicFilm](#PhotographicFilm) | Especifica medios fotográficos de película. |
| [PhotographicGlossy](#PhotographicGlossy) | Especifica medios fotográficos brillantes. |
| [PhotographicHighGloss](#PhotographicHighGloss) | Especifica medios fotográficos de alto brillo. |
| [PhotographicMatte](#PhotographicMatte) | Especifica medio fotográfico mate. |
| [PhotographicSatin](#PhotographicSatin) | Especifica medio fotográfico satinado. |
| [PhotographicSemiGloss](#PhotographicSemiGloss) | Especifica medio fotográfico semibrillante. |
| [Plain](#Plain) | Especifica medio de papel estándar. |
| [Screen](#Screen) | Especifica la salida a una pantalla de salida en forma continua. |
| [ScreenPaged](#ScreenPaged) | Especifica la salida a una pantalla de salida en forma paginada. |
| [Stationary](#Stationary) | Especifica medio de papelería especializado. |
| [TShirtTransfer](#TShirtTransfer) | Especifica medio de transferencia para camisetas especializado. |
| [TabStockFull](#TabStockFull) | Especifica medio de pestañas que no está precortado (pestañas individuales). |
| [TabStockPreCut](#TabStockPreCut) | Especifica medio de pestañas que está precortado (pestañas múltiples). |
| [Transparency](#Transparency) | Especifica medio de transparencia. |
## Métodos

| Método | Descripción |
| --- | --- |
| [add(IOptionItem[] items)](#add-com.aspose.xps.metadata.IOptionItem...-) | Agrega una lista de elementos al final de la lista de ítems de esta opción. |
| [add(PageMediaType.IPageMediaTypeOptionItem[] items)](#add-com.aspose.xps.metadata.PageMediaType.IPageMediaTypeOptionItem...-) | Agrega una matriz de  IPageMediaTypeOptionItem  instancias a la opción. |
| [clone()](#clone--) | Clona esta instancia de opción. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getName()](#getName--) | Obtiene el nombre del elemento. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setWeight(int weight)](#setWeight-int-) | Establece un valor de propiedad puntuado  Weight . |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### PageMediaTypeOption(String optionName, PageMediaType.IPageMediaTypeOptionItem[] items) {#PageMediaTypeOption-java.lang.String-com.aspose.xps.metadata.PageMediaType.IPageMediaTypeOptionItem...-}
```
public PageMediaTypeOption(String optionName, PageMediaType.IPageMediaTypeOptionItem[] items)
```


Crea una nueva instancia.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| optionName | java.lang.String | Un nombre de opción. |
| items | [IPageMediaTypeOptionItem\[\]](../../com.aspose.xps.metadata/ipagemediatypeoptionitem) | Una matriz arbitraria de  IPageMediaTypeOptionItem  instancias. |

### PageMediaTypeOption(PageMediaType.PageMediaTypeOption option) {#PageMediaTypeOption-com.aspose.xps.metadata.PageMediaType.PageMediaTypeOption-}
```
public PageMediaTypeOption(PageMediaType.PageMediaTypeOption option)
```


Clona esta instancia de opción.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| option | [PageMediaTypeOption](../../com.aspose.xps.metadata/pagemediatypeoption) | Una instancia para clonar. |

### Archival {#Archival}
```
public static PageMediaType.PageMediaTypeOption Archival
```


Especifica medios de calidad de archivo.

### AutoSelect {#AutoSelect}
```
public static PageMediaType.PageMediaTypeOption AutoSelect
```


Especifica que el medio se seleccionará automáticamente.

### BackPrintFilm {#BackPrintFilm}
```
public static PageMediaType.PageMediaTypeOption BackPrintFilm
```


Especifica medios de película de impresión posterior especializados.

### Bond {#Bond}
```
public static PageMediaType.PageMediaTypeOption Bond
```


Especifica medios de papel bond estándar.

### CardStock {#CardStock}
```
public static PageMediaType.PageMediaTypeOption CardStock
```


Especifica medios de cartulina estándar.

### Continous {#Continous}
```
public static PageMediaType.PageMediaTypeOption Continous
```


Especifica medios de alimentación continua.

### EnvelopePlain {#EnvelopePlain}
```
public static PageMediaType.PageMediaTypeOption EnvelopePlain
```


Especifica medios de sobre estándar.

### EnvelopeWindow {#EnvelopeWindow}
```
public static PageMediaType.PageMediaTypeOption EnvelopeWindow
```


Especifica medios de sobre con ventana.

### Fabric {#Fabric}
```
public static PageMediaType.PageMediaTypeOption Fabric
```


Especifica medios de tela.

### HighResolution {#HighResolution}
```
public static PageMediaType.PageMediaTypeOption HighResolution
```


Especifica medios de alta resolución especializados.

### Label {#Label}
```
public static PageMediaType.PageMediaTypeOption Label
```


Especifica medios de etiqueta.

### MultiLayerForm {#MultiLayerForm}
```
public static PageMediaType.PageMediaTypeOption MultiLayerForm
```


Especifica medios de formularios multiparte adjuntos.

### MultiPartForm {#MultiPartForm}
```
public static PageMediaType.PageMediaTypeOption MultiPartForm
```


Especifica medios de formularios multiparte separados.

### None {#None}
```
public static PageMediaType.PageMediaTypeOption None
```


Especifica medios desconocidos o no listados.

### Photographic {#Photographic}
```
public static PageMediaType.PageMediaTypeOption Photographic
```


Especifica medios fotográficos estándar.

### PhotographicFilm {#PhotographicFilm}
```
public static PageMediaType.PageMediaTypeOption PhotographicFilm
```


Especifica medios fotográficos de película.

### PhotographicGlossy {#PhotographicGlossy}
```
public static PageMediaType.PageMediaTypeOption PhotographicGlossy
```


Especifica medios fotográficos brillantes.

### PhotographicHighGloss {#PhotographicHighGloss}
```
public static PageMediaType.PageMediaTypeOption PhotographicHighGloss
```


Especifica medios fotográficos de alto brillo.

### PhotographicMatte {#PhotographicMatte}
```
public static PageMediaType.PageMediaTypeOption PhotographicMatte
```


Especifica medio fotográfico mate.

### PhotographicSatin {#PhotographicSatin}
```
public static PageMediaType.PageMediaTypeOption PhotographicSatin
```


Especifica medio fotográfico satinado.

### PhotographicSemiGloss {#PhotographicSemiGloss}
```
public static PageMediaType.PageMediaTypeOption PhotographicSemiGloss
```


Especifica medio fotográfico semibrillante.

### Plain {#Plain}
```
public static PageMediaType.PageMediaTypeOption Plain
```


Especifica medio de papel estándar.

### Screen {#Screen}
```
public static PageMediaType.PageMediaTypeOption Screen
```


Especifica la salida a una pantalla de salida en forma continua.

### ScreenPaged {#ScreenPaged}
```
public static PageMediaType.PageMediaTypeOption ScreenPaged
```


Especifica la salida a una pantalla de salida en forma paginada.

### Stationary {#Stationary}
```
public static PageMediaType.PageMediaTypeOption Stationary
```


Especifica medio de papelería especializado.

### TShirtTransfer {#TShirtTransfer}
```
public static PageMediaType.PageMediaTypeOption TShirtTransfer
```


Especifica medio de transferencia para camisetas especializado.

### TabStockFull {#TabStockFull}
```
public static PageMediaType.PageMediaTypeOption TabStockFull
```


Especifica medio de pestañas que no está precortado (pestañas individuales).

### TabStockPreCut {#TabStockPreCut}
```
public static PageMediaType.PageMediaTypeOption TabStockPreCut
```


Especifica medio de pestañas que está precortado (pestañas múltiples).

### Transparency {#Transparency}
```
public static PageMediaType.PageMediaTypeOption Transparency
```


Especifica medio de transparencia.

### add(IOptionItem[] items) {#add-com.aspose.xps.metadata.IOptionItem...-}
```
public void add(IOptionItem[] items)
```


Agrega una lista de elementos al final de la lista de ítems de esta opción. Cada uno debe ser una instancia de  ScoredProperty  o de  Property .

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| items | [IOptionItem\[\]](../../com.aspose.xps.metadata/ioptionitem) | Lista de elementos a agregar. |

### add(PageMediaType.IPageMediaTypeOptionItem[] items) {#add-com.aspose.xps.metadata.PageMediaType.IPageMediaTypeOptionItem...-}
```
public PageMediaType.PageMediaTypeOption add(PageMediaType.IPageMediaTypeOptionItem[] items)
```


Agrega una matriz de  IPageMediaTypeOptionItem  instancias a la opción.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| items | [IPageMediaTypeOptionItem\[\]](../../com.aspose.xps.metadata/ipagemediatypeoptionitem) | Una matriz arbitraria de  IPageMediaTypeOptionItem  instancias. |

**Returns:**
[PageMediaTypeOption](../../com.aspose.xps.metadata/pagemediatypeoption) - This options instance.
### clone() {#clone--}
```
public PageMediaType.PageMediaTypeOption clone()
```


Clona esta instancia de opción. El acceso directo al constructor de clonación.

**Returns:**
[PageMediaTypeOption](../../com.aspose.xps.metadata/pagemediatypeoption) - The clone of this option instance.
### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| Parámetro | Tipo | Descripción |
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


Obtiene el nombre del elemento.

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


Establece un valor de propiedad puntuado  Weight .

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| peso | int | Un valor de propiedad puntuado  Weight . |

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
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

