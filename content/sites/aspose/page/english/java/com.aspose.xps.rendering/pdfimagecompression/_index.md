---
title: PdfImageCompression
second_title: Aspose.Page for Java API Reference
description: Specifies the type of compression applied to images in the PDF file.
type: docs
weight: 22
url: /java/com.aspose.xps.rendering/pdfimagecompression/
---
**Inheritance:**
java.lang.Object, java.lang.Enum
```
public enum PdfImageCompression extends Enum<PdfImageCompression>
```

Specifies the type of compression applied to images in the PDF file.
## Fields

| Field | Description |
| --- | --- |
| [Auto](#Auto) | Automatically selects the most appropriate compression for each image. |
| [Flate](#Flate) | Flate compression. |
| [Jpeg](#Jpeg) | JPEG compression. |
| [LzwBaselinePredictor](#LzwBaselinePredictor) | Predictor selection is restricted to PNG Paeth predictor to speed-up the process. |
| [LzwOptimizedPredictor](#LzwOptimizedPredictor) | Predictor selection is more complicated and should result in smaller image sizes but taking more time. |
| [None](#None) | Saves raw image bytes resulting in bigger PDF file sizes. |
| [Rle](#Rle) | Run Length compression. |
## Methods

| Method | Description |
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


Automatically selects the most appropriate compression for each image.

### Flate {#Flate}
```
public static final PdfImageCompression Flate
```


Flate compression.

### Jpeg {#Jpeg}
```
public static final PdfImageCompression Jpeg
```


JPEG compression. Does not support transparency.

### LzwBaselinePredictor {#LzwBaselinePredictor}
```
public static final PdfImageCompression LzwBaselinePredictor
```


Predictor selection is restricted to PNG Paeth predictor to speed-up the process. In practice performs surprisingly good. Better than  LzwOptimizedPredictor .

### LzwOptimizedPredictor {#LzwOptimizedPredictor}
```
public static final PdfImageCompression LzwOptimizedPredictor
```


Predictor selection is more complicated and should result in smaller image sizes but taking more time.

### None {#None}
```
public static final PdfImageCompression None
```


Saves raw image bytes resulting in bigger PDF file sizes.

### Rle {#Rle}
```
public static final PdfImageCompression Rle
```


Run Length compression.

### <T>valueOf(Class<T> arg0, String arg1) {#-T-valueOf-java.lang.Class-T--java.lang.String-}
```
public static T <T>valueOf(Class<T> arg0, String arg1)
```




**Parameters:**
| Parameter | Type | Description |
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
| Parameter | Type | Description |
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
| Parameter | Type | Description |
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
| Parameter | Type | Description |
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
| Parameter | Type | Description |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

