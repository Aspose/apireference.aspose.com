---
title: "DimensionF"
second_title: "Aspose.Page per Java API Reference"
description: "La classe Dimension incapsula la larghezza e l'altezza di un componente in precisione singola in un unico oggetto."
type: docs
weight: 11
url: /it/java/com.aspose.page/dimensionf/
---
**Inheritance:**
java.lang.Object, java.awt.geom.Dimension2D

**All Implemented Interfaces:**
java.io.Serializable
```
public class DimensionF extends Dimension2D implements Serializable
```

La classe `Dimension` incapsula la larghezza e l'altezza di un componente (in precisione singola) in un unico oggetto.

Normalmente i valori di `width` e `height` sono interi non negativi. I costruttori che consentono di creare una dimensione non impediscono di impostare un valore negativo per queste proprietà. Se il valore di `width` o `height` è negativo, il comportamento di alcuni metodi definiti da altri oggetti è indefinito.
## Costruttori

| Costruttore | Descrizione |
| --- | --- |
| [DimensionF()](#DimensionF--) | Crea un'istanza di `Dimension` con una larghezza pari a zero e un'altezza pari a zero. |
| [DimensionF(DimensionF d)](#DimensionF-com.aspose.page.DimensionF-) | Crea un'istanza di `Dimension` la cui larghezza e altezza sono le stesse della dimensione specificata. |
| [DimensionF(float width, float height)](#DimensionF-float-float-) | Costruisce un `Dimension` e lo inizializza alla larghezza e all'altezza specificate. |
## Campi

| Campo | Descrizione |
| --- | --- |
| [height](#height) | La dimensione dell'altezza; è possibile utilizzare valori negativi. |
| [width](#width) | La dimensione della larghezza; è possibile utilizzare valori negativi. |
## Metodi

| Metodo | Descrizione |
| --- | --- |
| [clone()](#clone--) |  |
| [equals(Object obj)](#equals-java.lang.Object-) | Verifica se due oggetti dimensione hanno valori uguali. |
| [getClass()](#getClass--) |  |
| [getHeight()](#getHeight--) | \{@inheritDoc\} |
| [getSize()](#getSize--) | Ottiene la dimensione di questo oggetto `Dimension`. |
| [getWidth()](#getWidth--) | \{@inheritDoc\} |
| [hashCode()](#hashCode--) | Restituisce il codice hash per questo `Dimension`. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setSize(DimensionF d)](#setSize-com.aspose.page.DimensionF-) | Imposta la dimensione di questo oggetto `Dimension` alla dimensione specificata. |
| [setSize(double width, double height)](#setSize-double-double-) | Imposta la dimensione di questo oggetto `Dimension` alla larghezza e all'altezza specificate in precisione doppia. |
| [setSize(float width, float height)](#setSize-float-float-) | Imposta la dimensione di questo oggetto `Dimension` alla larghezza e all'altezza specificate. |
| [setSize(Dimension2D arg0)](#setSize-java.awt.geom.Dimension2D-) |  |
| [toString()](#toString--) | Restituisce una rappresentazione stringa dei valori dei campi `height` e `width` di questo oggetto `Dimension`. |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### DimensionF() {#DimensionF--}
```
public DimensionF()
```


Crea un'istanza di `Dimension` con una larghezza pari a zero e un'altezza pari a zero.

### DimensionF(DimensionF d) {#DimensionF-com.aspose.page.DimensionF-}
```
public DimensionF(DimensionF d)
```


Crea un'istanza di `Dimension` la cui larghezza e altezza sono le stesse della dimensione specificata.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| d | [DimensionF](../../com.aspose.page/dimensionf) | la dimensione specificata per i valori di `width` e `height` |

### DimensionF(float width, float height) {#DimensionF-float-float-}
```
public DimensionF(float width, float height)
```


Costruisce un `Dimension` e lo inizializza alla larghezza e all'altezza specificate.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| larghezza | float | la larghezza specificata |
| altezza | float | l'altezza specificata |

### height {#height}
```
public float height
```


La dimensione dell'altezza; è possibile utilizzare valori negativi.

### width {#width}
```
public float width
```


La dimensione della larghezza; è possibile utilizzare valori negativi.

### clone() {#clone--}
```
public Object clone()
```




**Returns:**
java.lang.Object
### equals(Object obj) {#equals-java.lang.Object-}
```
public boolean equals(Object obj)
```


Verifica se due oggetti dimensione hanno valori uguali.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| obj | java.lang.Object |  |

**Returns:**
boolean
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getHeight() {#getHeight--}
```
public double getHeight()
```




**Returns:**
double
### getSize() {#getSize--}
```
public DimensionF getSize()
```


Ottiene la dimensione di questo oggetto `Dimension`. Questo metodo è incluso per completezza, per parallelo al metodo `getSize` definito da `Component`.

**Returns:**
[DimensionF](../../com.aspose.page/dimensionf) - the size of this dimension, a new instance of `Dimension` with the same width and height
### getWidth() {#getWidth--}
```
public double getWidth()
```




**Returns:**
double
### hashCode() {#hashCode--}
```
public int hashCode()
```


Restituisce il codice hash per questo `Dimension`.

**Returns:**
int - un codice hash per questo `Dimension`
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### setSize(DimensionF d) {#setSize-com.aspose.page.DimensionF-}
```
public void setSize(DimensionF d)
```


Imposta la dimensione di questo oggetto `Dimension` alla dimensione specificata. Questo metodo è incluso per completezza, per parallelo al metodo `setSize` definito da `Component`.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| d | [DimensionF](../../com.aspose.page/dimensionf) | la nuova dimensione per questo oggetto `Dimension` |

### setSize(double width, double height) {#setSize-double-double-}
```
public void setSize(double width, double height)
```


Imposta la dimensione di questo oggetto `Dimension` alla larghezza e altezza specificate in precisione doppia. Nota che se `width` o `height` sono maggiori di `Integer.MAX_VALUE`, verranno riportati a `Integer.MAX_VALUE`.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| larghezza | double | la nuova larghezza per l'oggetto `Dimension` |
| altezza | double | la nuova altezza per l'oggetto `Dimension` |

### setSize(float width, float height) {#setSize-float-float-}
```
public void setSize(float width, float height)
```


Imposta la dimensione di questo oggetto `Dimension` alla larghezza e altezza specificate. Questo metodo è incluso per completezza, per parallelo al metodo `setSize` definito da `Component`.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| larghezza | float | la nuova larghezza per questo oggetto `Dimension` |
| altezza | float | la nuova altezza per questo oggetto `Dimension` |

### setSize(Dimension2D arg0) {#setSize-java.awt.geom.Dimension2D-}
```
public void setSize(Dimension2D arg0)
```




**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| arg0 | java.awt.geom.Dimension2D |  |

### toString() {#toString--}
```
public String toString()
```


Restituisce una rappresentazione stringa dei valori dei campi `height` e `width` di questo oggetto `Dimension`. Questo metodo è destinato ad essere usato solo a scopo di debug, e il contenuto e il formato della stringa restituita possono variare tra le implementazioni. La stringa restituita può essere vuota ma non può essere `null`.

**Returns:**
java.lang.String - una rappresentazione stringa di questo oggetto `Dimension`
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

