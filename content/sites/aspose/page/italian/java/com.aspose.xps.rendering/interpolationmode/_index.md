---
title: "InterpolationMode"
second_title: "Aspose.Page per Java API Reference"
description: "Specifica l'algoritmo utilizzato quando le immagini vengono ridimensionate o ruotate."
type: docs
weight: 20
url: /it/java/com.aspose.xps.rendering/interpolationmode/
---
**Inheritance:**
java.lang.Object, java.lang.Enum
```
public enum InterpolationMode extends Enum<InterpolationMode>
```

Specifica l'algoritmo utilizzato quando le immagini vengono ridimensionate o ruotate.
## Campi

| Campo | Descrizione |
| --- | --- |
| [Bicubic](#Bicubic) | Specifica l'interpolazione bicubica. |
| [Bilinear](#Bilinear) | Specifica l'interpolazione bilineare. |
| [Default](#Default) | Specifica la modalità predefinita. |
| [High](#High) | Specifica l'interpolazione ad alta qualità. |
| [HighQualityBicubic](#HighQualityBicubic) | Specifica l'interpolazione bicubica ad alta qualità. |
| [HighQualityBilinear](#HighQualityBilinear) | Specifica l'interpolazione bilineare ad alta qualità. |
| [Low](#Low) | Specifica l'interpolazione a bassa qualità. |
| [NearestNeighbor](#NearestNeighbor) | Specifica l'interpolazione nearest-neighbor. |
## Metodi

| Metodo | Descrizione |
| --- | --- |
| [<T>valueOf(Class<T> arg0, String arg1)](#-T-valueOf-java.lang.Class-T--java.lang.String-) |  |
| [compareTo(E arg0)](#compareTo-E-) |  |
| [describeConstable()](#describeConstable--) |  |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getDeclaringClass()](#getDeclaringClass--) |  |
| [hashCode()](#hashCode--) |  |
| [name()](#name--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [ordinal()](#ordinal--) |  |
| [toString()](#toString--) |  |
| [valueOf(String name)](#valueOf-java.lang.String-) |  |
| [values()](#values--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### Bicubic {#Bicubic}
```
public static final InterpolationMode Bicubic
```


Specifica l'interpolazione bicubica. Non viene eseguito alcun prefiltraggio. Questa modalità non è adatta per ridurre un'immagine al di sotto del 25 percento della sua dimensione originale.

### Bilinear {#Bilinear}
```
public static final InterpolationMode Bilinear
```


Specifica l'interpolazione bilineare. Non viene eseguito alcun prefiltraggio. Questa modalità non è adatta per ridurre un'immagine al di sotto del 50 percento della sua dimensione originale.

### Default {#Default}
```
public static final InterpolationMode Default
```


Specifica la modalità predefinita.

### High {#High}
```
public static final InterpolationMode High
```


Specifica l'interpolazione ad alta qualità.

### HighQualityBicubic {#HighQualityBicubic}
```
public static final InterpolationMode HighQualityBicubic
```


Specifica l'interpolazione bicubica ad alta qualità. Viene eseguito il prefiltraggio per garantire una riduzione ad alta qualità. Questa modalità produce le immagini trasformate della massima qualità.

### HighQualityBilinear {#HighQualityBilinear}
```
public static final InterpolationMode HighQualityBilinear
```


Specifica l'interpolazione bilineare ad alta qualità. Viene eseguito il prefiltraggio per garantire una riduzione ad alta qualità.

### Low {#Low}
```
public static final InterpolationMode Low
```


Specifica l'interpolazione a bassa qualità.

### NearestNeighbor {#NearestNeighbor}
```
public static final InterpolationMode NearestNeighbor
```


Specifica l'interpolazione nearest-neighbor.

### <T>valueOf(Class<T> arg0, String arg1) {#-T-valueOf-java.lang.Class-T--java.lang.String-}
```
public static T <T>valueOf(Class<T> arg0, String arg1)
```




**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| arg0 | java.lang.Class<T> |  |
| arg1 | java.lang.String |  |

**Returns:**
T
### compareTo(E arg0) {#compareTo-E-}
```
public final int compareTo(E arg0)
```




**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| arg0 | E |  |

**Returns:**
int
### describeConstable() {#describeConstable--}
```
public final Optional<Enum.EnumDesc<E>> describeConstable()
```




**Returns:**
java.util.Optional<java.lang.Enum.EnumDesc<E>>
### equals(Object arg0) {#equals-java.lang.Object-}
```
public final boolean equals(Object arg0)
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
### getDeclaringClass() {#getDeclaringClass--}
```
public final Class<E> getDeclaringClass()
```




**Returns:**
java.lang.Class<E>
### hashCode() {#hashCode--}
```
public final int hashCode()
```




**Returns:**
int
### name() {#name--}
```
public final String name()
```




**Returns:**
java.lang.String
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### ordinal() {#ordinal--}
```
public final int ordinal()
```




**Returns:**
int
### toString() {#toString--}
```
public String toString()
```




**Returns:**
java.lang.String
### valueOf(String name) {#valueOf-java.lang.String-}
```
public static InterpolationMode valueOf(String name)
```




**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| nome | java.lang.String |  |

**Returns:**
[InterpolationMode](../../com.aspose.xps.rendering/interpolationmode)
### values() {#values--}
```
public static InterpolationMode[] values()
```




**Returns:**
com.aspose.xps.rendering.InterpolationMode[]
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

