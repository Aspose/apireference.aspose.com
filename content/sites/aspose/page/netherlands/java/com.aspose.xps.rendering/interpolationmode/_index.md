---
title: "InterpolationMode"
second_title: "Aspose.Page voor Java API-referentie"
description: "Specificeert het algoritme dat wordt gebruikt wanneer afbeeldingen worden geschaald of geroteerd."
type: docs
weight: 20
url: /nl/java/com.aspose.xps.rendering/interpolationmode/
---
**Inheritance:**
java.lang.Object, java.lang.Enum
```
public enum InterpolationMode extends Enum<InterpolationMode>
```

Specificeert het algoritme dat wordt gebruikt wanneer afbeeldingen worden geschaald of geroteerd.
## Velden

| Veld | Beschrijving |
| --- | --- |
| [Bicubic](#Bicubic) | Specificeert bicubische interpolatie. |
| [Bilinear](#Bilinear) | Specificeert bilineaire interpolatie. |
| [Default](#Default) | Specificeert standaardmodus. |
| [High](#High) | Specificeert interpolatie van hoge kwaliteit. |
| [HighQualityBicubic](#HighQualityBicubic) | Specificeert hoge-kwaliteit, bicubische interpolatie. |
| [HighQualityBilinear](#HighQualityBilinear) | Specificeert hoge-kwaliteit, bilineaire interpolatie. |
| [Low](#Low) | Specificeert interpolatie van lage kwaliteit. |
| [NearestNeighbor](#NearestNeighbor) | Specificeert nearest-neighbor interpolatie. |
## Methoden

| Methode | Beschrijving |
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


Specificeert bicubische interpolatie. Er wordt geen voorfiltering uitgevoerd. Deze modus is niet geschikt om een afbeelding te verkleinen tot minder dan 25 procent van de oorspronkelijke grootte.

### Bilinear {#Bilinear}
```
public static final InterpolationMode Bilinear
```


Specificeert bilineaire interpolatie. Er wordt geen voorfiltering uitgevoerd. Deze modus is niet geschikt om een afbeelding te verkleinen tot minder dan 50 procent van de oorspronkelijke grootte.

### Default {#Default}
```
public static final InterpolationMode Default
```


Specificeert standaardmodus.

### High {#High}
```
public static final InterpolationMode High
```


Specificeert interpolatie van hoge kwaliteit.

### HighQualityBicubic {#HighQualityBicubic}
```
public static final InterpolationMode HighQualityBicubic
```


Specificeert hoge-kwaliteit, bicubische interpolatie. Voorfiltering wordt uitgevoerd om een verkleining van hoge kwaliteit te garanderen. Deze modus levert de hoogste kwaliteit getransformeerde afbeeldingen.

### HighQualityBilinear {#HighQualityBilinear}
```
public static final InterpolationMode HighQualityBilinear
```


Specificeert hoge-kwaliteit, bilineaire interpolatie. Voorfiltering wordt uitgevoerd om een verkleining van hoge kwaliteit te garanderen.

### Low {#Low}
```
public static final InterpolationMode Low
```


Specificeert interpolatie van lage kwaliteit.

### NearestNeighbor {#NearestNeighbor}
```
public static final InterpolationMode NearestNeighbor
```


Specificeert nearest-neighbor interpolatie.

### <T>valueOf(Class<T> arg0, String arg1) {#-T-valueOf-java.lang.Class-T--java.lang.String-}
```
public static T <T>valueOf(Class<T> arg0, String arg1)
```




**Parameters:**
| Parameter | Type | Beschrijving |
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
| Parameter | Type | Beschrijving |
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
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| naam | java.lang.String |  |

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

