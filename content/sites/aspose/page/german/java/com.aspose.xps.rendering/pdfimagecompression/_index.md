---
title: "PdfImageCompression"
second_title: "Aspose.Page for Java API-Referenz"
description: "Gibt den Kompressionstyp an, der auf Bilder in der PDF-Datei angewendet wird."
type: docs
weight: 22
url: /de/java/com.aspose.xps.rendering/pdfimagecompression/
---
**Inheritance:**
java.lang.Object, java.lang.Enum
```
public enum PdfImageCompression extends Enum<PdfImageCompression>
```

Gibt den Kompressionstyp an, der auf Bilder in der PDF-Datei angewendet wird.
## Felder

| Feld | Beschreibung |
| --- | --- |
| [Auto](#Auto) | Wählt automatisch die am besten geeignete Kompression für jedes Bild aus. |
| [Flate](#Flate) | Flate‑Kompression. |
| [Jpeg](#Jpeg) | JPEG‑Kompression. |
| [LzwBaselinePredictor](#LzwBaselinePredictor) | Die Auswahl des Prädiktors ist auf den PNG‑Paeth‑Prädiktor beschränkt, um den Vorgang zu beschleunigen. |
| [LzwOptimizedPredictor](#LzwOptimizedPredictor) | Die Auswahl des Prädiktors ist komplexer und sollte zu kleineren Bildgrößen führen, dauert jedoch länger. |
| [None](#None) | Speichert Rohbildbytes, was zu größeren PDF-Dateigrößen führt. |
| [Rle](#Rle) | Run‑Length‑Kompression. |
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
### Auto {#Auto}
```
public static final PdfImageCompression Auto
```


Wählt automatisch die am besten geeignete Kompression für jedes Bild aus.

### Flate {#Flate}
```
public static final PdfImageCompression Flate
```


Flate‑Kompression.

### Jpeg {#Jpeg}
```
public static final PdfImageCompression Jpeg
```


JPEG‑Kompression. Unterstützt keine Transparenz.

### LzwBaselinePredictor {#LzwBaselinePredictor}
```
public static final PdfImageCompression LzwBaselinePredictor
```


Die Auswahl des Prädiktors ist auf den PNG‑Paeth‑Prädiktor beschränkt, um den Vorgang zu beschleunigen. In der Praxis liefert er überraschend gute Ergebnisse. Besser als LzwOptimizedPredictor.

### LzwOptimizedPredictor {#LzwOptimizedPredictor}
```
public static final PdfImageCompression LzwOptimizedPredictor
```


Die Auswahl des Prädiktors ist komplexer und sollte zu kleineren Bildgrößen führen, dauert jedoch länger.

### None {#None}
```
public static final PdfImageCompression None
```


Speichert Rohbildbytes, was zu größeren PDF-Dateigrößen führt.

### Rle {#Rle}
```
public static final PdfImageCompression Rle
```


Run‑Length‑Kompression.

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
public static PdfImageCompression valueOf(String name)
```




**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Name | java.lang.String |  |

**Returns:**
[PdfImageCompression](../../com.aspose.xps.rendering/pdfimagecompression)
### values() {#values--}
```
public static PdfImageCompression[] values()
```




**Returns:**
com.aspose.xps.rendering.PdfImageCompression[]
### wait() {#wait--}
```
public final void wait()
```




### wait(long arg0) {#wait-long-}
```
public final native void wait(long arg0)
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

