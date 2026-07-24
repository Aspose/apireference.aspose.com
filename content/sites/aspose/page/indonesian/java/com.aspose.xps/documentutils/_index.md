---
title: "DocumentUtils"
second_title: "Aspose.Page for Java Referensi API"
description: "Kelas ini menyediakan utilitas di luar API manipulasi XPS formal."
type: docs
weight: 10
url: /id/java/com.aspose.xps/documentutils/
---
**Inheritance:**
java.lang.Object
```
public class DocumentUtils
```

Kelas ini menyediakan utilitas di luar API manipulasi XPS formal.
## Metode

| Metode | Deskripsi |
| --- | --- |
| [createCircle(Point2D center, float radius)](#createCircle-java.awt.geom.Point2D-float-) | Membuat geometri jalur yang merepresentasikan sebuah lingkaran. |
| [createCircularSegment(Point2D center, float radius, float startAngle, float endAngle)](#createCircularSegment-java.awt.geom.Point2D-float-float-float-) | Membuat geometri jalur yang merepresentasikan segmen melingkar antara dua sudut. |
| [createEllipse(Point2D center, float radiusX, float radiusY)](#createEllipse-java.awt.geom.Point2D-float-float-) | Membuat geometri jalur yang merepresentasikan sebuah elips. |
| [createImage(String fileName, Rectangle2D imageBox)](#createImage-java.lang.String-java.awt.geom.Rectangle2D-) | Membuat jalur persegi panjang yang diisi dengan gambar. |
| [createImage(String fileName, Rectangle2D imageBox, ImageMode mode)](#createImage-java.lang.String-java.awt.geom.Rectangle2D-com.aspose.xps.ImageMode-) | Membuat jalur persegi panjang yang diisi dengan gambar. |
| [createPieSlice(Point2D center, float radius, float startAngle, float endAngle)](#createPieSlice-java.awt.geom.Point2D-float-float-float-) | Membuat geometri jalur yang merepresentasikan irisan lingkaran antara dua sinar radial. |
| [createRectangle(Rectangle2D rectangle)](#createRectangle-java.awt.geom.Rectangle2D-) | Membuat geometri jalur yang merepresentasikan sebuah persegi panjang. |
| [createRegularCircumscribedNGon(int n, Point2D center, float radius)](#createRegularCircumscribedNGon-int-java.awt.geom.Point2D-float-) | Membuat geometri jalur yang merepresentasikan n-gon reguler yang mengelilingi sebuah lingkaran. |
| [createRegularInscribedNGon(int n, Point2D center, float radius)](#createRegularInscribedNGon-int-java.awt.geom.Point2D-float-) | Membuat geometri jalur yang merepresentasikan n-gon reguler yang terinskripsi dalam sebuah lingkaran. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### createCircle(Point2D center, float radius) {#createCircle-java.awt.geom.Point2D-float-}
```
public XpsPathGeometry createCircle(Point2D center, float radius)
```


Membuat geometri jalur yang merepresentasikan sebuah lingkaran.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| center | java.awt.geom.Point2D | Titik pusat lingkaran. |
| jari-jari | float | Jari-jari lingkaran. |

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - The XPS path geometry.
### createCircularSegment(Point2D center, float radius, float startAngle, float endAngle) {#createCircularSegment-java.awt.geom.Point2D-float-float-float-}
```
public XpsPathGeometry createCircularSegment(Point2D center, float radius, float startAngle, float endAngle)
```


Membuat geometri jalur yang merepresentasikan segmen melingkar antara dua sudut.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| center | java.awt.geom.Point2D | Pusat lingkaran. |
| jari-jari | float | Jari-jari lingkaran. |
| startAngle | float | Sudut (derajat) dari sinar awal. |
| endAngle | float | Sudut (derajat) dari sinar akhir. |

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - The XPS path geometry.
### createEllipse(Point2D center, float radiusX, float radiusY) {#createEllipse-java.awt.geom.Point2D-float-float-}
```
public XpsPathGeometry createEllipse(Point2D center, float radiusX, float radiusY)
```


Membuat geometri jalur yang merepresentasikan sebuah elips.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| center | java.awt.geom.Point2D | Titik pusat elips. |
| radiusX | float | Jari-jari horizontal elips. |
| radiusY | float | Jari-jari vertikal elips. |

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - The XPS path geometry.
### createImage(String fileName, Rectangle2D imageBox) {#createImage-java.lang.String-java.awt.geom.Rectangle2D-}
```
public XpsPath createImage(String fileName, Rectangle2D imageBox)
```


Membuat jalur persegi panjang yang diisi dengan gambar.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| fileName | java.lang.String | Nama berkas gambar. |
| imageBox | java.awt.geom.Rectangle2D | Kotak gambar untuk diisi dengan gambar. |

**Returns:**
[XpsPath](../../com.aspose.xps/xpspath) - The XPS path.
### createImage(String fileName, Rectangle2D imageBox, ImageMode mode) {#createImage-java.lang.String-java.awt.geom.Rectangle2D-com.aspose.xps.ImageMode-}
```
public XpsPath createImage(String fileName, Rectangle2D imageBox, ImageMode mode)
```


Membuat jalur persegi panjang yang diisi dengan gambar.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| fileName | java.lang.String | Nama berkas gambar. |
| imageBox | java.awt.geom.Rectangle2D | Kotak gambar untuk diisi dengan gambar. |
| mode | [ImageMode](../../com.aspose.xps/imagemode) | Mode penyesuaian gambar. |

**Returns:**
[XpsPath](../../com.aspose.xps/xpspath) - The XPS path.
### createPieSlice(Point2D center, float radius, float startAngle, float endAngle) {#createPieSlice-java.awt.geom.Point2D-float-float-float-}
```
public XpsPathGeometry createPieSlice(Point2D center, float radius, float startAngle, float endAngle)
```


Membuat geometri jalur yang merepresentasikan irisan lingkaran antara dua sinar radial.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| center | java.awt.geom.Point2D | Pusat lingkaran. |
| jari-jari | float | Jari-jari lingkaran. |
| startAngle | float | Sudut (derajat) dari sinar awal. |
| endAngle | float | Sudut (derajat) dari sinar akhir. |

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - The XPS path geometry.
### createRectangle(Rectangle2D rectangle) {#createRectangle-java.awt.geom.Rectangle2D-}
```
public XpsPathGeometry createRectangle(Rectangle2D rectangle)
```


Membuat geometri jalur yang merepresentasikan sebuah persegi panjang.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| rectangle | java.awt.geom.Rectangle2D | Persegi panjang. |

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - The XPS path geometry.
### createRegularCircumscribedNGon(int n, Point2D center, float radius) {#createRegularCircumscribedNGon-int-java.awt.geom.Point2D-float-}
```
public XpsPathGeometry createRegularCircumscribedNGon(int n, Point2D center, float radius)
```


Membuat geometri jalur yang merepresentasikan n-gon reguler yang mengelilingi sebuah lingkaran.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| n | int | Jumlah titik sudut. |
| center | java.awt.geom.Point2D | Pusat lingkaran. |
| jari-jari | float | Jari-jari lingkaran. |

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - The XPS path geometry.
### createRegularInscribedNGon(int n, Point2D center, float radius) {#createRegularInscribedNGon-int-java.awt.geom.Point2D-float-}
```
public XpsPathGeometry createRegularInscribedNGon(int n, Point2D center, float radius)
```


Membuat geometri jalur yang merepresentasikan n-gon reguler yang terinskripsi dalam sebuah lingkaran.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| n | int | Jumlah titik sudut. |
| center | java.awt.geom.Point2D | Pusat lingkaran. |
| jari-jari | float | Jari-jari lingkaran. |

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - The XPS path geometry.
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
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




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

