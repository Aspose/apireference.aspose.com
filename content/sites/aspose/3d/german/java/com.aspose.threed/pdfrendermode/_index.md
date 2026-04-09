---
title: PdfRenderMode
second_title: Aspose.3D für Java API-Referenz
description: Rendermodus gibt den Stil an, in dem die 3D‑Grafik gerendert wird.
type: docs
weight: 289
url: /de/java/com.aspose.threed/pdfrendermode/
---

**Inheritance:**
java.lang.Object, java.lang.Enum
```
public enum PdfRenderMode extends Enum<PdfRenderMode>
```

Rendermodus gibt den Stil an, in dem die 3D‑Grafik gerendert wird.
## Felder

| Feld | Beschreibung |
| --- | --- |
| [BOUNDING_BOX](#BOUNDING-BOX) | Zeigt die Kanten der Begrenzungsbox jedes Knotens an, ausgerichtet an den Achsen des lokalen Koordinatenraums dieses Knotens. |
| [HIDDEN_WIREFRAME](#HIDDEN-WIREFRAME) | Zeigt Kanten in einer einzigen Farbe an, entfernt jedoch rückwärtsgerichtete und verdeckte Kanten. |
| [ILLUSTRATION](#ILLUSTRATION) | Zeigt Silhouettenkanten mit Oberflächen an, entfernt verdeckte Linien. |
| [SHADED_ILLUSTRATION](#SHADED-ILLUSTRATION) | Zeigt Silhouettenkanten mit beleuchteten und texturierten Oberflächen sowie einem zusätzlichen emittierenden Term an, um schlecht beleuchtete Bereiche des Kunstwerks zu entfernen. |
| [SHADED_VERTICES](#SHADED-VERTICES) | Zeigt nur Scheitelpunkte an, verwendet jedoch deren Scheitelpunktfarbe und wendet Beleuchtung an. |
| [SHADED_WIREFRAME](#SHADED-WIREFRAME) | Zeigt nur Kanten an, interpoliert jedoch deren Farbe zwischen den beiden Scheitelpunkten und wendet Beleuchtung an. |
| [SOLID](#SOLID) | Zeigt texturierte und beleuchtete geometrische Formen an. |
| [SOLID_OUTLINE](#SOLID-OUTLINE) | Zeigt Silhouettenkanten mit beleuchteten und texturierten Oberflächen an, entfernt verdeckte Linien. |
| [SOLID_WIREFRAME](#SOLID-WIREFRAME) | Zeigt texturierte und beleuchtete geometrische Formen (Dreiecke) mit einfarbigen Kanten darüber an. |
| [TRANSPARENT](#TRANSPARENT) | Zeigt texturierte und beleuchtete geometrische Formen (Dreiecke) mit einem zusätzlichen Transparenzgrad an. |
| [TRANSPARENT_BOUNDING_BOX](#TRANSPARENT-BOUNDING-BOX) | Zeigt die Flächen der Begrenzungsboxen jedes Knotens an, ausgerichtet an den Achsen des lokalen Koordinatenraums dieses Knotens, mit einem zusätzlichen Transparenzgrad. |
| [TRANSPARENT_BOUNDING_BOX_OUTLINE](#TRANSPARENT-BOUNDING-BOX-OUTLINE) | Zeigt die Kanten und Flächen der Begrenzungsboxen jedes Knotens an, ausgerichtet an den Achsen des lokalen Koordinatenraums dieses Knotens, mit einem zusätzlichen Transparenzgrad. |
| [TRANSPARENT_WIREFRAME](#TRANSPARENT-WIREFRAME) | Zeigt texturierte und beleuchtete geometrische Formen (Dreiecke) mit einem zusätzlichen Transparenzgrad an, mit einfarbigen undurchsichtigen Kanten darüber. |
| [VERTICES](#VERTICES) | Zeigt nur Scheitelpunkte in einer einzigen Farbe an. |
| [WIREFRAME](#WIREFRAME) | Zeigt nur Kanten in einer einzigen Farbe an. |
## Methoden

| Methode | Beschreibung |
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
### BOUNDING_BOX {#BOUNDING-BOX}
```
public static final PdfRenderMode BOUNDING_BOX
```


Zeigt die Kanten der Begrenzungsbox jedes Knotens an, ausgerichtet an den Achsen des lokalen Koordinatenraums dieses Knotens.

### HIDDEN_WIREFRAME {#HIDDEN-WIREFRAME}
```
public static final PdfRenderMode HIDDEN_WIREFRAME
```


Zeigt Kanten in einer einzigen Farbe an, entfernt jedoch rückwärtsgerichtete und verdeckte Kanten.

### ILLUSTRATION {#ILLUSTRATION}
```
public static final PdfRenderMode ILLUSTRATION
```


Zeigt Silhouettenkanten mit Oberflächen an, entfernt verdeckte Linien.

### SHADED_ILLUSTRATION {#SHADED-ILLUSTRATION}
```
public static final PdfRenderMode SHADED_ILLUSTRATION
```


Zeigt Silhouettenkanten mit beleuchteten und texturierten Oberflächen sowie einem zusätzlichen emittierenden Term an, um schlecht beleuchtete Bereiche des Kunstwerks zu entfernen.

### SHADED_VERTICES {#SHADED-VERTICES}
```
public static final PdfRenderMode SHADED_VERTICES
```


Zeigt nur Scheitelpunkte an, verwendet jedoch deren Scheitelpunktfarbe und wendet Beleuchtung an.

### SHADED_WIREFRAME {#SHADED-WIREFRAME}
```
public static final PdfRenderMode SHADED_WIREFRAME
```


Zeigt nur Kanten an, interpoliert jedoch deren Farbe zwischen den beiden Scheitelpunkten und wendet Beleuchtung an.

### SOLID {#SOLID}
```
public static final PdfRenderMode SOLID
```


Zeigt texturierte und beleuchtete geometrische Formen an.

### SOLID_OUTLINE {#SOLID-OUTLINE}
```
public static final PdfRenderMode SOLID_OUTLINE
```


Zeigt Silhouettenkanten mit beleuchteten und texturierten Oberflächen an, entfernt verdeckte Linien.

### SOLID_WIREFRAME {#SOLID-WIREFRAME}
```
public static final PdfRenderMode SOLID_WIREFRAME
```


Zeigt texturierte und beleuchtete geometrische Formen (Dreiecke) mit einfarbigen Kanten darüber an.

### TRANSPARENT {#TRANSPARENT}
```
public static final PdfRenderMode TRANSPARENT
```


Zeigt texturierte und beleuchtete geometrische Formen (Dreiecke) mit einem zusätzlichen Transparenzgrad an.

### TRANSPARENT_BOUNDING_BOX {#TRANSPARENT-BOUNDING-BOX}
```
public static final PdfRenderMode TRANSPARENT_BOUNDING_BOX
```


Zeigt die Flächen der Begrenzungsboxen jedes Knotens an, ausgerichtet an den Achsen des lokalen Koordinatenraums dieses Knotens, mit einem zusätzlichen Transparenzgrad.

### TRANSPARENT_BOUNDING_BOX_OUTLINE {#TRANSPARENT-BOUNDING-BOX-OUTLINE}
```
public static final PdfRenderMode TRANSPARENT_BOUNDING_BOX_OUTLINE
```


Zeigt die Kanten und Flächen der Begrenzungsboxen jedes Knotens an, ausgerichtet an den Achsen des lokalen Koordinatenraums dieses Knotens, mit einem zusätzlichen Transparenzgrad.

### TRANSPARENT_WIREFRAME {#TRANSPARENT-WIREFRAME}
```
public static final PdfRenderMode TRANSPARENT_WIREFRAME
```


Zeigt texturierte und beleuchtete geometrische Formen (Dreiecke) mit einem zusätzlichen Transparenzgrad an, mit einfarbigen undurchsichtigen Kanten darüber.

### VERTICES {#VERTICES}
```
public static final PdfRenderMode VERTICES
```


Zeigt nur Scheitelpunkte in einer einzigen Farbe an.

### WIREFRAME {#WIREFRAME}
```
public static final PdfRenderMode WIREFRAME
```


Zeigt nur Kanten in einer einzigen Farbe an.

### <T>valueOf(Class<T> arg0, String arg1) {#-T-valueOf-java.lang.Class-T--java.lang.String-}
```
public static T <T>valueOf(Class<T> arg0, String arg1)
```




**Parameters:**
| Parameter | Typ | Beschreibung |
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
| Parameter | Typ | Beschreibung |
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
| Parameter | Typ | Beschreibung |
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
public static PdfRenderMode valueOf(String name)
```




**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Name | java.lang.String |  |

**Returns:**
[PdfRenderMode](../../com.aspose.threed/pdfrendermode)
### values() {#values--}
```
public static PdfRenderMode[] values()
```




**Returns:**
com.aspose.threed.PdfRenderMode[]
### wait() {#wait--}
```
public final void wait()
```




### wait(long arg0) {#wait-long-}
```
public final void wait(long arg0)
```




**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

