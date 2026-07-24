---
title: "PdfImageCompression"
second_title: "Aspose.Page for Java Referensi API"
description: "Menentukan jenis kompresi yang diterapkan pada gambar dalam file PDF."
type: docs
weight: 22
url: /id/java/com.aspose.xps.rendering/pdfimagecompression/
---
**Inheritance:**
java.lang.Object, java.lang.Enum
```
public enum PdfImageCompression extends Enum<PdfImageCompression>
```

Menentukan jenis kompresi yang diterapkan pada gambar dalam file PDF.
## Bidang

| Bidang | Deskripsi |
| --- | --- |
| [Auto](#Auto) | Secara otomatis memilih kompresi paling tepat untuk setiap gambar. |
| [Flate](#Flate) | Kompresi Flate. |
| [Jpeg](#Jpeg) | Kompresi JPEG. |
| [LzwBaselinePredictor](#LzwBaselinePredictor) | Pemilihan predictor dibatasi pada predictor PNG Paeth untuk mempercepat proses. |
| [LzwOptimizedPredictor](#LzwOptimizedPredictor) | Pemilihan predictor lebih rumit dan seharusnya menghasilkan ukuran gambar yang lebih kecil tetapi memakan lebih banyak waktu. |
| [None](#None) | Menyimpan byte gambar mentah yang menghasilkan ukuran file PDF lebih besar. |
| [Rle](#Rle) | Kompresi Run Length. |
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
### Auto {#Auto}
```
public static final PdfImageCompression Auto
```


Secara otomatis memilih kompresi paling tepat untuk setiap gambar.

### Flate {#Flate}
```
public static final PdfImageCompression Flate
```


Kompresi Flate.

### Jpeg {#Jpeg}
```
public static final PdfImageCompression Jpeg
```


Kompresi JPEG. Tidak mendukung transparansi.

### LzwBaselinePredictor {#LzwBaselinePredictor}
```
public static final PdfImageCompression LzwBaselinePredictor
```


Pemilihan predictor dibatasi pada predictor PNG Paeth untuk mempercepat proses. Dalam praktiknya bekerja sangat baik. Lebih baik daripada LzwOptimizedPredictor.

### LzwOptimizedPredictor {#LzwOptimizedPredictor}
```
public static final PdfImageCompression LzwOptimizedPredictor
```


Pemilihan predictor lebih rumit dan seharusnya menghasilkan ukuran gambar yang lebih kecil tetapi memakan lebih banyak waktu.

### None {#None}
```
public static final PdfImageCompression None
```


Menyimpan byte gambar mentah yang menghasilkan ukuran file PDF lebih besar.

### Rle {#Rle}
```
public static final PdfImageCompression Rle
```


Kompresi Run Length.

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
public static PdfImageCompression valueOf(String name)
```




**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| nama | java.lang.String |  |

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

