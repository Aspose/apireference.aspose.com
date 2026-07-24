---
title: "PdfImageCompression"
second_title: "Aspose.Page för Java API-referens"
description: "Anger typen av kompression som tillämpas på bilder i PDF‑filen."
type: docs
weight: 22
url: /sv/java/com.aspose.xps.rendering/pdfimagecompression/
---
**Inheritance:**
java.lang.Object, java.lang.Enum
```
public enum PdfImageCompression extends Enum<PdfImageCompression>
```

Anger typen av kompression som tillämpas på bilder i PDF‑filen.
## Fält

| Fält | Beskrivning |
| --- | --- |
| [Auto](#Auto) | Väljer automatiskt den mest lämpliga komprimeringen för varje bild. |
| [Flate](#Flate) | Flate-komprimering. |
| [Jpeg](#Jpeg) | JPEG-komprimering. |
| [LzwBaselinePredictor](#LzwBaselinePredictor) | Prediktorvalet är begränsat till PNG Paeth-prediktor för att påskynda processen. |
| [LzwOptimizedPredictor](#LzwOptimizedPredictor) | Prediktorvalet är mer komplicerat och bör resultera i mindre bildstorlekar men tar mer tid. |
| [None](#None) | Sparar råa bildbytes, vilket resulterar i större PDF-filstorlekar. |
| [Rle](#Rle) | Run Length-komprimering. |
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
### Auto {#Auto}
```
public static final PdfImageCompression Auto
```


Väljer automatiskt den mest lämpliga komprimeringen för varje bild.

### Flate {#Flate}
```
public static final PdfImageCompression Flate
```


Flate-komprimering.

### Jpeg {#Jpeg}
```
public static final PdfImageCompression Jpeg
```


JPEG-komprimering. Stöder inte transparens.

### LzwBaselinePredictor {#LzwBaselinePredictor}
```
public static final PdfImageCompression LzwBaselinePredictor
```


Prediktorvalet är begränsat till PNG Paeth-prediktor för att påskynda processen. I praktiken fungerar det förvånansvärt bra. Bättre än  LzwOptimizedPredictor .

### LzwOptimizedPredictor {#LzwOptimizedPredictor}
```
public static final PdfImageCompression LzwOptimizedPredictor
```


Prediktorvalet är mer komplicerat och bör resultera i mindre bildstorlekar men tar mer tid.

### None {#None}
```
public static final PdfImageCompression None
```


Sparar råa bildbytes, vilket resulterar i större PDF-filstorlekar.

### Rle {#Rle}
```
public static final PdfImageCompression Rle
```


Run Length-komprimering.

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
public static PdfImageCompression valueOf(String name)
```




**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| name | java.lang.String |  |

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

