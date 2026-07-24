---
title: "PageOutputQuality.PageOutputQualityOption"
second_title: "Aspose.Page per Java API Reference"
description: "Definisce le opzioni della funzionalità PageOutputQuality."
type: docs
weight: 10
url: /it/java/com.aspose.xps.metadata/pageoutputquality.pageoutputqualityoption/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Option](../../com.aspose.xps.metadata/option)
```
public static final class PageOutputQuality.PageOutputQualityOption extends Option
```

Definisce le opzioni della funzionalità PageOutputQuality.
## Campi

| Campo | Descrizione |
| --- | --- |
| [Automatic](#Automatic) | Specifica l'intento per l'output automatico (consente al client di scegliere automaticamente le impostazioni migliori). |
| [Draft](#Draft) | Specifica l'intento per l'output bozza (bilanciato per testo e grafica di qualità bozza). |
| [Fax](#Fax) | Specifica l'intento per l'output fax (bilanciato per la qualità fax standard). |
| [High](#High) | Specifica l'intento per l'output di alta qualità (bilanciato per testo e grafica di alta qualità). |
| [Normal](#Normal) | Specifica l'intento per l'output normale (bilanciato per testo e grafica di buona qualità). |
| [Photographic](#Photographic) | Specifica l'intento per l'output fotografico (le immagini dovrebbero avere la massima qualità). |
| [Text](#Text) | Specifica l'intento per l'output solo testo (la grafica potrebbe essere resa male o non essere resa affatto). |
## Metodi

| Metodo | Descrizione |
| --- | --- |
| [add(IOptionItem[] items)](#add-com.aspose.xps.metadata.IOptionItem...-) | Aggiunge un elenco di elementi alla fine dell'elenco degli elementi di questa opzione. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getName()](#getName--) | Ottiene il nome dell'elemento. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### Automatic {#Automatic}
```
public static PageOutputQuality.PageOutputQualityOption Automatic
```


Specifica l'intento per l'output automatico (consente al client di scegliere automaticamente le impostazioni migliori).

### Draft {#Draft}
```
public static PageOutputQuality.PageOutputQualityOption Draft
```


Specifica l'intento per l'output bozza (bilanciato per testo e grafica di qualità bozza).

### Fax {#Fax}
```
public static PageOutputQuality.PageOutputQualityOption Fax
```


Specifica l'intento per l'output fax (bilanciato per la qualità fax standard).

### High {#High}
```
public static PageOutputQuality.PageOutputQualityOption High
```


Specifica l'intento per l'output di alta qualità (bilanciato per testo e grafica di alta qualità).

### Normal {#Normal}
```
public static PageOutputQuality.PageOutputQualityOption Normal
```


Specifica l'intento per l'output normale (bilanciato per testo e grafica di buona qualità).

### Photographic {#Photographic}
```
public static PageOutputQuality.PageOutputQualityOption Photographic
```


Specifica l'intento per l'output fotografico (le immagini dovrebbero avere la massima qualità).

### Text {#Text}
```
public static PageOutputQuality.PageOutputQualityOption Text
```


Specifica l'intento per l'output solo testo (la grafica potrebbe essere resa male o non essere resa affatto).

### add(IOptionItem[] items) {#add-com.aspose.xps.metadata.IOptionItem...-}
```
public void add(IOptionItem[] items)
```


Aggiunge un elenco di elementi alla fine dell'elenco degli elementi di questa opzione. Ognuno deve essere un'istanza di  ScoredProperty  o di  Property .

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| items | [IOptionItem\[\]](../../com.aspose.xps.metadata/ioptionitem) | Elenco di elementi da aggiungere. |

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

