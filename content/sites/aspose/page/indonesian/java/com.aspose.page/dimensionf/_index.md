---
title: "DimensionF"
second_title: "Aspose.Page for Java Referensi API"
description: "Kelas Dimension mengenkapsulasi lebar dan tinggi sebuah komponen dalam presisi tunggal dalam satu objek."
type: docs
weight: 11
url: /id/java/com.aspose.page/dimensionf/
---
**Inheritance:**
java.lang.Object, java.awt.geom.Dimension2D

**All Implemented Interfaces:**
java.io.Serializable
```
public class DimensionF extends Dimension2D implements Serializable
```

Kelas `Dimension` mengenkapsulasi lebar dan tinggi sebuah komponen (dalam presisi tunggal) dalam satu objek.

Biasanya nilai `width` dan `height` adalah bilangan bulat non-negatif. Konstruktor yang memungkinkan Anda membuat sebuah dimensi tidak mencegah Anda menetapkan nilai negatif untuk properti ini. Jika nilai `width` atau `height` negatif, perilaku beberapa metode yang didefinisikan oleh objek lain tidak terdefinisi.
## Konstruktor

| Konstruktor | Deskripsi |
| --- | --- |
| [DimensionF()](#DimensionF--) | Membuat sebuah instance `Dimension` dengan lebar nol dan tinggi nol. |
| [DimensionF(DimensionF d)](#DimensionF-com.aspose.page.DimensionF-) | Membuat sebuah instance `Dimension` yang lebar dan tingginya sama dengan dimensi yang ditentukan. |
| [DimensionF(float width, float height)](#DimensionF-float-float-) | Membuat sebuah `Dimension` dan menginisialisasinya dengan lebar dan tinggi yang ditentukan. |
## Bidang

| Bidang | Deskripsi |
| --- | --- |
| [height](#height) | Dimensi tinggi; nilai negatif dapat digunakan. |
| [width](#width) | Dimensi lebar; nilai negatif dapat digunakan. |
## Metode

| Metode | Deskripsi |
| --- | --- |
| [clone()](#clone--) |  |
| [equals(Object obj)](#equals-java.lang.Object-) | Memeriksa apakah dua objek dimensi memiliki nilai yang sama. |
| [getClass()](#getClass--) |  |
| [getHeight()](#getHeight--) | \{@inheritDoc\} |
| [getSize()](#getSize--) | Mendapatkan ukuran objek `Dimension` ini. |
| [getWidth()](#getWidth--) | \{@inheritDoc\} |
| [hashCode()](#hashCode--) | Mengembalikan kode hash untuk `Dimension` ini. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setSize(DimensionF d)](#setSize-com.aspose.page.DimensionF-) | Mengatur ukuran objek `Dimension` ini ke ukuran yang ditentukan. |
| [setSize(double width, double height)](#setSize-double-double-) | Mengatur ukuran objek `Dimension` ini ke lebar dan tinggi yang ditentukan dalam presisi ganda. |
| [setSize(float width, float height)](#setSize-float-float-) | Mengatur ukuran objek `Dimension` ini ke lebar dan tinggi yang ditentukan. |
| [setSize(Dimension2D arg0)](#setSize-java.awt.geom.Dimension2D-) |  |
| [toString()](#toString--) | Mengembalikan representasi string dari nilai bidang `height` dan `width` objek `Dimension` ini. |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### DimensionF() {#DimensionF--}
```
public DimensionF()
```


Membuat sebuah instance `Dimension` dengan lebar nol dan tinggi nol.

### DimensionF(DimensionF d) {#DimensionF-com.aspose.page.DimensionF-}
```
public DimensionF(DimensionF d)
```


Membuat sebuah instance `Dimension` yang lebar dan tingginya sama dengan dimensi yang ditentukan.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| d | [DimensionF](../../com.aspose.page/dimensionf) | dimensi yang ditentukan untuk nilai `width` dan `height` |

### DimensionF(float width, float height) {#DimensionF-float-float-}
```
public DimensionF(float width, float height)
```


Membuat sebuah `Dimension` dan menginisialisasinya dengan lebar dan tinggi yang ditentukan.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| lebar | float | lebar yang ditentukan |
| tinggi | float | tinggi yang ditentukan |

### height {#height}
```
public float height
```


Dimensi tinggi; nilai negatif dapat digunakan.

### width {#width}
```
public float width
```


Dimensi lebar; nilai negatif dapat digunakan.

### clone() {#clone--}
```
public Object clone()
```




**Returns:**
java.lang.Object
### equals(Object obj) {#equals-java.lang.Object-}
```
public boolean equals(Object obj)
```


Memeriksa apakah dua objek dimensi memiliki nilai yang sama.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| obj | java.lang.Object |  |

**Returns:**
boolean
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getHeight() {#getHeight--}
```
public double getHeight()
```




**Returns:**
double
### getSize() {#getSize--}
```
public DimensionF getSize()
```


Mendapatkan ukuran objek `Dimension` ini. Metode ini disertakan untuk melengkapi, agar sejajar dengan metode `getSize` yang didefinisikan oleh `Component`.

**Returns:**
[DimensionF](../../com.aspose.page/dimensionf) - the size of this dimension, a new instance of `Dimension` with the same width and height
### getWidth() {#getWidth--}
```
public double getWidth()
```




**Returns:**
double
### hashCode() {#hashCode--}
```
public int hashCode()
```


Mengembalikan kode hash untuk `Dimension` ini.

**Returns:**
int - kode hash untuk `Dimension` ini
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### setSize(DimensionF d) {#setSize-com.aspose.page.DimensionF-}
```
public void setSize(DimensionF d)
```


Mengatur ukuran objek `Dimension` ini ke ukuran yang ditentukan. Metode ini disertakan untuk melengkapi, agar sejajar dengan metode `setSize` yang didefinisikan oleh `Component`.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| d | [DimensionF](../../com.aspose.page/dimensionf) | ukuran baru untuk objek `Dimension` ini |

### setSize(double width, double height) {#setSize-double-double-}
```
public void setSize(double width, double height)
```


Mengatur ukuran objek `Dimension` ini ke lebar dan tinggi yang ditentukan dengan presisi ganda. Perhatikan bahwa jika `width` atau `height` lebih besar dari `Integer.MAX_VALUE`, mereka akan direset ke `Integer.MAX_VALUE`.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| lebar | double | lebar baru untuk objek `Dimension` |
| tinggi | double | tinggi baru untuk objek `Dimension` |

### setSize(float width, float height) {#setSize-float-float-}
```
public void setSize(float width, float height)
```


Mengatur ukuran objek `Dimension` ini ke lebar dan tinggi yang ditentukan. Metode ini disertakan untuk melengkapi, agar sejajar dengan metode `setSize` yang didefinisikan oleh `Component`.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| lebar | float | lebar baru untuk objek `Dimension` ini |
| tinggi | float | tinggi baru untuk objek `Dimension` ini |

### setSize(Dimension2D arg0) {#setSize-java.awt.geom.Dimension2D-}
```
public void setSize(Dimension2D arg0)
```




**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| arg0 | java.awt.geom.Dimension2D |  |

### toString() {#toString--}
```
public String toString()
```


Mengembalikan representasi string dari nilai bidang `height` dan `width` objek `Dimension` ini. Metode ini dimaksudkan hanya untuk tujuan debugging, dan konten serta format string yang dikembalikan dapat bervariasi antar implementasi. String yang dikembalikan dapat kosong tetapi tidak boleh `null`.

**Returns:**
java.lang.String - representasi string dari objek `Dimension` ini
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

