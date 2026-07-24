---
title: "PdfImageCompression"
second_title: "Aspose.Page voor Java API-referentie"
description: "Specificeert het type compressie dat wordt toegepast op afbeeldingen in het PDF-bestand."
type: docs
weight: 22
url: /nl/java/com.aspose.xps.rendering/pdfimagecompression/
---
**Inheritance:**
java.lang.Object, java.lang.Enum
```
public enum PdfImageCompression extends Enum<PdfImageCompression>
```

Specificeert het type compressie dat wordt toegepast op afbeeldingen in het PDF-bestand.
## Velden

| Veld | Beschrijving |
| --- | --- |
| [Auto](#Auto) | Selecteert automatisch de meest geschikte compressie voor elke afbeelding. |
| [Flate](#Flate) | Flate-compressie. |
| [Jpeg](#Jpeg) | JPEG-compressie. |
| [LzwBaselinePredictor](#LzwBaselinePredictor) | Predictor-selectie is beperkt tot de PNG Paeth-predictor om het proces te versnellen. |
| [LzwOptimizedPredictor](#LzwOptimizedPredictor) | Predictor-selectie is ingewikkelder en zou moeten resulteren in kleinere afbeeldingsgroottes, maar kost meer tijd. |
| [None](#None) | Slaat ruwe afbeeldingsbytes op, wat resulteert in grotere PDF-bestandsgroottes. |
| [Rle](#Rle) | Run Length-compressie. |
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
### Auto {#Auto}
```
public static final PdfImageCompression Auto
```


Selecteert automatisch de meest geschikte compressie voor elke afbeelding.

### Flate {#Flate}
```
public static final PdfImageCompression Flate
```


Flate-compressie.

### Jpeg {#Jpeg}
```
public static final PdfImageCompression Jpeg
```


JPEG-compressie. Ondersteunt geen transparantie.

### LzwBaselinePredictor {#LzwBaselinePredictor}
```
public static final PdfImageCompression LzwBaselinePredictor
```


Predictor-selectie is beperkt tot de PNG Paeth-predictor om het proces te versnellen. In de praktijk presteert dit verrassend goed. Beter dan LzwOptimizedPredictor.

### LzwOptimizedPredictor {#LzwOptimizedPredictor}
```
public static final PdfImageCompression LzwOptimizedPredictor
```


Predictor-selectie is ingewikkelder en zou moeten resulteren in kleinere afbeeldingsgroottes, maar kost meer tijd.

### None {#None}
```
public static final PdfImageCompression None
```


Slaat ruwe afbeeldingsbytes op, wat resulteert in grotere PDF-bestandsgroottes.

### Rle {#Rle}
```
public static final PdfImageCompression Rle
```


Run Length-compressie.

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
public static PdfImageCompression valueOf(String name)
```




**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| naam | java.lang.String |  |

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

