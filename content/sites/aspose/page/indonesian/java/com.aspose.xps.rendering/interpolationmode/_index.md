---
title: "InterpolationMode"
second_title: "Aspose.Page for Java Referensi API"
description: "Menentukan algoritma yang digunakan saat gambar diubah skala atau diputar."
type: docs
weight: 20
url: /id/java/com.aspose.xps.rendering/interpolationmode/
---
**Inheritance:**
java.lang.Object, java.lang.Enum
```
public enum InterpolationMode extends Enum<InterpolationMode>
```

Menentukan algoritma yang digunakan saat gambar diubah skala atau diputar.
## Bidang

| Bidang | Deskripsi |
| --- | --- |
| [Bicubic](#Bicubic) | Menentukan interpolasi bikubik. |
| [Bilinear](#Bilinear) | Menentukan interpolasi bilinear. |
| [Default](#Default) | Menentukan mode default. |
| [High](#High) | Menentukan interpolasi berkualitas tinggi. |
| [HighQualityBicubic](#HighQualityBicubic) | Menentukan interpolasi bikubik berkualitas tinggi. |
| [HighQualityBilinear](#HighQualityBilinear) | Menentukan interpolasi bilinear berkualitas tinggi. |
| [Low](#Low) | Menentukan interpolasi kualitas rendah. |
| [NearestNeighbor](#NearestNeighbor) | Menentukan interpolasi tetangga terdekat. |
## Metode

| Metode | Deskripsi |
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


Menentukan interpolasi bikubik. Tidak ada prefiltering yang dilakukan. Mode ini tidak cocok untuk memperkecil gambar di bawah 25 persen dari ukuran aslinya.

### Bilinear {#Bilinear}
```
public static final InterpolationMode Bilinear
```


Menentukan interpolasi bilinear. Tidak ada prefiltering yang dilakukan. Mode ini tidak cocok untuk memperkecil gambar di bawah 50 persen dari ukuran aslinya.

### Default {#Default}
```
public static final InterpolationMode Default
```


Menentukan mode default.

### High {#High}
```
public static final InterpolationMode High
```


Menentukan interpolasi berkualitas tinggi.

### HighQualityBicubic {#HighQualityBicubic}
```
public static final InterpolationMode HighQualityBicubic
```


Menentukan interpolasi bikubik berkualitas tinggi. Prefiltering dilakukan untuk memastikan pengecilan berkualitas tinggi. Mode ini menghasilkan gambar yang diubah dengan kualitas tertinggi.

### HighQualityBilinear {#HighQualityBilinear}
```
public static final InterpolationMode HighQualityBilinear
```


Menentukan interpolasi bilinear berkualitas tinggi. Prefiltering dilakukan untuk memastikan pengecilan berkualitas tinggi.

### Low {#Low}
```
public static final InterpolationMode Low
```


Menentukan interpolasi kualitas rendah.

### NearestNeighbor {#NearestNeighbor}
```
public static final InterpolationMode NearestNeighbor
```


Menentukan interpolasi tetangga terdekat.

### <T>valueOf(Class<T> arg0, String arg1) {#-T-valueOf-java.lang.Class-T--java.lang.String-}
```
public static T <T>valueOf(Class<T> arg0, String arg1)
```




**Parameters:**
| Parameter | Tipe | Deskripsi |
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
| Parameter | Tipe | Deskripsi |
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
| Parameter | Tipe | Deskripsi |
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
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| nama | java.lang.String |  |

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
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

