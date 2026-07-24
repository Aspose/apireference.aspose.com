---
title: "InterpolationMode"
second_title: "Aspose.Page för Java API-referens"
description: "Anger algoritmen som används när bilder skalas eller roteras."
type: docs
weight: 20
url: /sv/java/com.aspose.xps.rendering/interpolationmode/
---
**Inheritance:**
java.lang.Object, java.lang.Enum
```
public enum InterpolationMode extends Enum<InterpolationMode>
```

Anger algoritmen som används när bilder skalas eller roteras.
## Fält

| Fält | Beskrivning |
| --- | --- |
| [Bicubic](#Bicubic) | Anger bikubisk interpolation. |
| [Bilinear](#Bilinear) | Anger bilinjär interpolation. |
| [Default](#Default) | Anger standardläge. |
| [High](#High) | Anger högkvalitativ interpolation. |
| [HighQualityBicubic](#HighQualityBicubic) | Anger högkvalitativ, bikubisk interpolation. |
| [HighQualityBilinear](#HighQualityBilinear) | Anger högkvalitativ, bilinjär interpolation. |
| [Low](#Low) | Anger lågkvalitativ interpolation. |
| [NearestNeighbor](#NearestNeighbor) | Anger närmaste-granne interpolation. |
## Metoder

| Metod | Beskrivning |
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


Anger bikubisk interpolation. Ingen förfiltrering utförs. Detta läge är inte lämpligt för att minska en bild till under 25 procent av dess originalstorlek.

### Bilinear {#Bilinear}
```
public static final InterpolationMode Bilinear
```


Anger bilinjär interpolation. Ingen förfiltrering utförs. Detta läge är inte lämpligt för att minska en bild till under 50 procent av dess originalstorlek.

### Default {#Default}
```
public static final InterpolationMode Default
```


Anger standardläge.

### High {#High}
```
public static final InterpolationMode High
```


Anger högkvalitativ interpolation.

### HighQualityBicubic {#HighQualityBicubic}
```
public static final InterpolationMode HighQualityBicubic
```


Anger högkvalitativ, bikubisk interpolation. Förfiltrering utförs för att säkerställa högkvalitativ krympning. Detta läge producerar de högsta kvalitetstransformerade bilderna.

### HighQualityBilinear {#HighQualityBilinear}
```
public static final InterpolationMode HighQualityBilinear
```


Anger högkvalitativ, bilinjär interpolation. Förfiltrering utförs för att säkerställa högkvalitativ krympning.

### Low {#Low}
```
public static final InterpolationMode Low
```


Anger lågkvalitativ interpolation.

### NearestNeighbor {#NearestNeighbor}
```
public static final InterpolationMode NearestNeighbor
```


Anger närmaste-granne interpolation.

### <T>valueOf(Class<T> arg0, String arg1) {#-T-valueOf-java.lang.Class-T--java.lang.String-}
```
public static T <T>valueOf(Class<T> arg0, String arg1)
```




**Parameters:**
| Parameter | Typ | Beskrivning |
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
| Parameter | Typ | Beskrivning |
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
| Parameter | Typ | Beskrivning |
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

