---
title: "XpsPathGeometry"
second_title: "Aspose.Page for Java Referensi API"
description: "Kelas yang mengenkapsulasi fitur elemen properti PathGeometry."
type: docs
weight: 42
url: /id/java/com.aspose.xps/xpspathgeometry/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject), com.aspose.xps.XpsArray

**All Implemented Interfaces:**
com.aspose.xps.ITransformableProperty
```
public final class XpsPathGeometry extends XpsArray<XpsPathFigure> implements ITransformableProperty
```

Kelas yang mengenkapsulasi fitur elemen properti PathGeometry. Elemen ini berisi sekumpulan path figure yang ditentukan baik dengan atribut Figures atau dengan elemen PathFigure anak.
## Metode

| Metode | Deskripsi |
| --- | --- |
| [add(T obj)](#add-T-) | Menambahkan objek baru ke dalam array. |
| [addSegment(XpsPathSegment segment)](#addSegment-com.aspose.xps.XpsPathSegment-) | Menambahkan segmen jalur ke daftar segmen anak dari figure jalur terakhir. |
| [deepClone()](#deepClone--) | Mengkloning path geometry ini. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [get(int i)](#get-int-) | Menyediakan akses ke elemen array berdasarkan indeks i. |
| [getClass()](#getClass--) |  |
| [getFillRule()](#getFillRule--) | Mengembalikan nilai yang menentukan bagaimana area yang berpotongan dari bentuk geometris digabungkan menjadi sebuah wilayah. |
| [getPathFigures()](#getPathFigures--) | Mengembalikan daftar figure jalur anak. |
| [getTransform()](#getTransform--) | Mengembalikan matriks transformasi afinnya yang menetapkan transformasi matriks lokal yang diterapkan pada semua elemen anak dan keturunan dari path geometry sebelum digunakan untuk mengisi, memotong, atau menggambar garis. |
| [hashCode()](#hashCode--) |  |
| [insert(int index, T obj)](#insert-int-T-) | Menyisipkan objek baru ke dalam array pada posisi yang ditentukan. |
| [insertSegment(int index, XpsPathSegment segment)](#insertSegment-int-com.aspose.xps.XpsPathSegment-) | Menyisipkan segmen jalur ke daftar segmen anak dari figure jalur terakhir pada posisi indeks. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [remove(T obj)](#remove-T-) | Menghapus objek dari array. |
| [removeAt(int index)](#removeAt-int-) | Menghapus objek dari array pada posisi yang ditentukan. |
| [removeSegment(XpsPathSegment segment)](#removeSegment-com.aspose.xps.XpsPathSegment-) | Menghapus segmen jalur dari daftar segmen anak dari figure jalur terakhir. |
| [removeSegmentAt(int index)](#removeSegmentAt-int-) | Menghapus segmen jalur dari daftar segmen anak dari figure jalur terakhir pada posisi indeks. |
| [setFillRule(XpsFillRule value)](#setFillRule-com.aspose.xps.XpsFillRule-) | Menetapkan nilai yang menentukan bagaimana area yang berpotongan dari bentuk geometris digabungkan menjadi sebuah wilayah. |
| [setTransform(XpsMatrix value)](#setTransform-com.aspose.xps.XpsMatrix-) | Menetapkan matriks transformasi afinnya yang menetapkan transformasi matriks lokal yang diterapkan pada semua elemen anak dan keturunan dari path geometry sebelum digunakan untuk mengisi, memotong, atau menggambar garis. |
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
### addSegment(XpsPathSegment segment) {#addSegment-com.aspose.xps.XpsPathSegment-}
```
public XpsPathSegment addSegment(XpsPathSegment segment)
```


Menambahkan segmen jalur ke daftar segmen anak dari figure jalur terakhir.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| segment | [XpsPathSegment](../../com.aspose.xps/xpspathsegment) | Segmen jalur yang akan ditambahkan. |

**Returns:**
[XpsPathSegment](../../com.aspose.xps/xpspathsegment) - Added path segment.
### deepClone() {#deepClone--}
```
public XpsPathGeometry deepClone()
```


Mengkloning path geometry ini.

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - Clone of this path geometry.
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
### getFillRule() {#getFillRule--}
```
public XpsFillRule getFillRule()
```


Mengembalikan nilai yang menentukan bagaimana area yang berpotongan dari bentuk geometris digabungkan menjadi sebuah wilayah.

**Returns:**
[XpsFillRule](../../com.aspose.xps/xpsfillrule) - The value specifying how the intersecting areas of geometric shapes are combined to form a region.
### getPathFigures() {#getPathFigures--}
```
public List<XpsPathFigure> getPathFigures()
```


Mengembalikan daftar figure jalur anak.

**Returns:**
java.util.List<com.aspose.xps.XpsPathFigure> - Daftar figure jalur anak.
### getTransform() {#getTransform--}
```
public XpsMatrix getTransform()
```


Mengembalikan matriks transformasi afinnya yang menetapkan transformasi matriks lokal yang diterapkan pada semua elemen anak dan keturunan dari path geometry sebelum digunakan untuk mengisi, memotong, atau menggambar garis.

**Returns:**
[XpsMatrix](../../com.aspose.xps/xpsmatrix) - The affine transformation matrix.
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
### insertSegment(int index, XpsPathSegment segment) {#insertSegment-int-com.aspose.xps.XpsPathSegment-}
```
public XpsPathSegment insertSegment(int index, XpsPathSegment segment)
```


Menyisipkan segmen jalur ke daftar segmen anak dari figure jalur terakhir pada posisi indeks.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| indeks | int | Posisi di mana segmen harus disisipkan. |
| segment | [XpsPathSegment](../../com.aspose.xps/xpspathsegment) | Sebuah segmen jalur yang akan disisipkan. |

**Returns:**
[XpsPathSegment](../../com.aspose.xps/xpspathsegment) - Inserted path segment.
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
### removeSegment(XpsPathSegment segment) {#removeSegment-com.aspose.xps.XpsPathSegment-}
```
public XpsPathSegment removeSegment(XpsPathSegment segment)
```


Menghapus segmen jalur dari daftar segmen anak dari figure jalur terakhir.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| segment | [XpsPathSegment](../../com.aspose.xps/xpspathsegment) | Segmen jalur yang akan dihapus. |

**Returns:**
[XpsPathSegment](../../com.aspose.xps/xpspathsegment) - Removed path segment.
### removeSegmentAt(int index) {#removeSegmentAt-int-}
```
public XpsPathSegment removeSegmentAt(int index)
```


Menghapus segmen jalur dari daftar segmen anak dari figure jalur terakhir pada posisi indeks.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| indeks | int | Posisi di mana segmen jalur harus dihapus. |

**Returns:**
[XpsPathSegment](../../com.aspose.xps/xpspathsegment) - Removed path segment.
### setFillRule(XpsFillRule value) {#setFillRule-com.aspose.xps.XpsFillRule-}
```
public void setFillRule(XpsFillRule value)
```


Menetapkan nilai yang menentukan bagaimana area yang berpotongan dari bentuk geometris digabungkan menjadi sebuah wilayah.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| value | [XpsFillRule](../../com.aspose.xps/xpsfillrule) | Nilai yang menentukan bagaimana area yang berpotongan dari bentuk geometris digabungkan menjadi sebuah wilayah. |

### setTransform(XpsMatrix value) {#setTransform-com.aspose.xps.XpsMatrix-}
```
public void setTransform(XpsMatrix value)
```


Menetapkan matriks transformasi afinnya yang menetapkan transformasi matriks lokal yang diterapkan pada semua elemen anak dan keturunan dari path geometry sebelum digunakan untuk mengisi, memotong, atau menggambar garis.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| value | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | Matriks transformasi afinnya. |

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

