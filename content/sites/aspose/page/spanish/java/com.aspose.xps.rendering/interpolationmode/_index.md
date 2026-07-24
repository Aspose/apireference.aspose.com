---
title: "InterpolationMode"
second_title: "Referencia de API de Aspose.Page para Java"
description: "Especifica el algoritmo que se utiliza cuando las imágenes se escalan o rotan."
type: docs
weight: 20
url: /es/java/com.aspose.xps.rendering/interpolationmode/
---
**Inheritance:**
java.lang.Object, java.lang.Enum
```
public enum InterpolationMode extends Enum<InterpolationMode>
```

Especifica el algoritmo que se utiliza cuando las imágenes se escalan o rotan.
## Campos

| Campo | Descripción |
| --- | --- |
| [Bicubic](#Bicubic) | Especifica interpolación bicúbica. |
| [Bilinear](#Bilinear) | Especifica interpolación bilineal. |
| [Default](#Default) | Especifica el modo predeterminado. |
| [High](#High) | Especifica interpolación de alta calidad. |
| [HighQualityBicubic](#HighQualityBicubic) | Especifica interpolación bicúbica de alta calidad. |
| [HighQualityBilinear](#HighQualityBilinear) | Especifica interpolación bilineal de alta calidad. |
| [Low](#Low) | Especifica interpolación de baja calidad. |
| [NearestNeighbor](#NearestNeighbor) | Especifica interpolación del vecino más cercano. |
## Métodos

| Método | Descripción |
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


Especifica interpolación bicúbica. No se realiza prefiltrado. Este modo no es adecuado para reducir una imagen por debajo del 25 % de su tamaño original.

### Bilinear {#Bilinear}
```
public static final InterpolationMode Bilinear
```


Especifica interpolación bilineal. No se realiza prefiltrado. Este modo no es adecuado para reducir una imagen por debajo del 50 % de su tamaño original.

### Default {#Default}
```
public static final InterpolationMode Default
```


Especifica el modo predeterminado.

### High {#High}
```
public static final InterpolationMode High
```


Especifica interpolación de alta calidad.

### HighQualityBicubic {#HighQualityBicubic}
```
public static final InterpolationMode HighQualityBicubic
```


Especifica interpolación bicúbica de alta calidad. Se realiza prefiltrado para garantizar una reducción de alta calidad. Este modo produce las imágenes transformadas de mayor calidad.

### HighQualityBilinear {#HighQualityBilinear}
```
public static final InterpolationMode HighQualityBilinear
```


Especifica interpolación bilineal de alta calidad. Se realiza prefiltrado para garantizar una reducción de alta calidad.

### Low {#Low}
```
public static final InterpolationMode Low
```


Especifica interpolación de baja calidad.

### NearestNeighbor {#NearestNeighbor}
```
public static final InterpolationMode NearestNeighbor
```


Especifica interpolación del vecino más cercano.

### <T>valueOf(Class<T> arg0, String arg1) {#-T-valueOf-java.lang.Class-T--java.lang.String-}
```
public static T <T>valueOf(Class<T> arg0, String arg1)
```




**Parameters:**
| Parámetro | Tipo | Descripción |
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
| Parámetro | Tipo | Descripción |
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
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| name | java.lang.String |  |

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

