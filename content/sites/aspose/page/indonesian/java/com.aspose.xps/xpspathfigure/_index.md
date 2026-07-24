---
title: "XpsPathFigure"
second_title: "Aspose.Page for Java Referensi API"
description: "Kelas yang mengenkapsulasi fitur elemen PathFigure."
type: docs
weight: 41
url: /id/java/com.aspose.xps/xpspathfigure/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject), com.aspose.xps.XpsArray
```
public class XpsPathFigure extends XpsArray<XpsPathSegment>
```

Kelas yang mengenkapsulasi fitur elemen PathFigure. Elemen ini terdiri dari satu set satu atau lebih segmen garis atau kurva.
## Metode

| Metode | Deskripsi |
| --- | --- |
| [add(T obj)](#add-T-) | Menambahkan objek baru ke dalam array. |
| [deepClone()](#deepClone--) | Menggandakan path figure ini. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [get(int i)](#get-int-) | Menyediakan akses ke elemen array berdasarkan indeks i. |
| [getClass()](#getClass--) |  |
| [getSegments()](#getSegments--) | Mengembalikan daftar segmen path anak. |
| [getStartPoint()](#getStartPoint--) | Mengembalikan titik awal untuk segmen pertama dari path figure. |
| [hashCode()](#hashCode--) |  |
| [insert(int index, T obj)](#insert-int-T-) | Menyisipkan objek baru ke dalam array pada posisi yang ditentukan. |
| [isClosed()](#isClosed--) | Mengembalikan nilai yang menunjukkan apakah path figure tertutup. |
| [isFilled()](#isFilled--) | Mengembalikan nilai yang menunjukkan apakah path figure digunakan dalam menghitung area geometri path yang memuatnya. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [remove(T obj)](#remove-T-) | Menghapus objek dari array. |
| [removeAt(int index)](#removeAt-int-) | Menghapus objek dari array pada posisi yang ditentukan. |
| [setClosed(boolean value)](#setClosed-boolean-) | Mengatur nilai yang menunjukkan apakah path figure tertutup. |
| [setFilled(boolean value)](#setFilled-boolean-) | Mengatur nilai yang menunjukkan apakah path figure digunakan dalam menghitung area geometri path yang memuatnya. |
| [setStartPoint(Point2D value)](#setStartPoint-java.awt.geom.Point2D-) | Mengatur titik awal untuk segmen pertama dari path figure. |
| [size()](#size--) | Mengembalikan jumlah elemen. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### add(T obj) {#add-T-}
```
public T add(T obj)
```


Menambahkan objek baru ke dalam array.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| obj | T | Objek yang akan ditambahkan. |

**Returns:**
T - Objek yang ditambahkan.
### deepClone() {#deepClone--}
```
public XpsPathFigure deepClone()
```


Menggandakan path figure ini.

**Returns:**
[XpsPathFigure](../../com.aspose.xps/xpspathfigure) - Clone of this path figure.
### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
boolean
### get(int i) {#get-int-}
```
public T get(int i)
```


Menyediakan akses ke elemen array berdasarkan indeks i.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| i | int | Indeks elemen. |

**Returns:**
T - Elemen pada posisi i.
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getSegments() {#getSegments--}
```
public List<XpsPathSegment> getSegments()
```


Mengembalikan daftar segmen path anak.

**Returns:**
java.util.List<com.aspose.xps.XpsPathSegment> - Daftar segmen path anak.
### getStartPoint() {#getStartPoint--}
```
public Point2D getStartPoint()
```


Mengembalikan titik awal untuk segmen pertama dari path figure.

**Returns:**
java.awt.geom.Point2D - Titik awal untuk segmen pertama dari path figure.
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### insert(int index, T obj) {#insert-int-T-}
```
public T insert(int index, T obj)
```


Menyisipkan objek baru ke dalam array pada posisi yang ditentukan.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| indeks | int | Posisi untuk menyisipkan objek. |
| obj | T | Objek yang akan disisipkan. |

**Returns:**
T - Objek yang disisipkan.
### isClosed() {#isClosed--}
```
public boolean isClosed()
```


Mengembalikan nilai yang menunjukkan apakah path figure tertutup.

**Returns:**
boolean - Nilai yang menunjukkan apakah path figure ditutup.
### isFilled() {#isFilled--}
```
public boolean isFilled()
```


Mengembalikan nilai yang menunjukkan apakah path figure digunakan dalam menghitung area geometri path yang memuatnya.

**Returns:**
boolean - Nilai yang menunjukkan apakah path figure digunakan dalam menghitung area dari path geometry yang berisi.
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### remove(T obj) {#remove-T-}
```
public T remove(T obj)
```


Menghapus objek dari array.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| obj | T | Objek yang akan dihapus. |

**Returns:**
T - Objek yang dihapus.
### removeAt(int index) {#removeAt-int-}
```
public T removeAt(int index)
```


Menghapus objek dari array pada posisi yang ditentukan.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| indeks | int | Posisi untuk menghapus objek. |

**Returns:**
T - Objek yang dihapus.
### setClosed(boolean value) {#setClosed-boolean-}
```
public void setClosed(boolean value)
```


Mengatur nilai yang menunjukkan apakah path figure tertutup.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| nilai | boolean | Nilai yang menunjukkan apakah path figure ditutup. |

### setFilled(boolean value) {#setFilled-boolean-}
```
public void setFilled(boolean value)
```


Mengatur nilai yang menunjukkan apakah path figure digunakan dalam menghitung area geometri path yang memuatnya.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| nilai | boolean | Nilai yang menunjukkan apakah path figure digunakan dalam menghitung area dari path geometry yang berisi. |

### setStartPoint(Point2D value) {#setStartPoint-java.awt.geom.Point2D-}
```
public void setStartPoint(Point2D value)
```


Mengatur titik awal untuk segmen pertama dari path figure.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| nilai | java.awt.geom.Point2D | Titik awal untuk segmen pertama dari gambar jalur. |

### size() {#size--}
```
public int size()
```


Mengembalikan jumlah elemen.

**Returns:**
int - Jumlah elemen.
### toString() {#toString--}
```
public String toString()
```




**Returns:**
java.lang.String
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

