---
title: "XpsMatrix"
second_title: "Aspose.Page for Java Referensi API"
description: "Kelas yang mengenkapsulasi fitur elemen properti MatrixTransform."
type: docs
weight: 36
url: /id/java/com.aspose.xps/xpsmatrix/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject)
```
public final class XpsMatrix extends XpsObject
```

Kelas yang mengenkapsulasi fitur elemen properti MatrixTransform. Elemen ini mendefinisikan transformasi matriks afine arbitrer yang digunakan untuk memanipulasi sistem koordinat elemen.
## Metode

| Metode | Deskripsi |
| --- | --- |
| [deepClone()](#deepClone--) | Mengkloning matriks transformasi ini. |
| [equals(XpsMatrix a, XpsMatrix b)](#equals-com.aspose.xps.XpsMatrix-com.aspose.xps.XpsMatrix-) | Implementasi sebenarnya. |
| [equals(Object obj)](#equals-java.lang.Object-) | Menentukan apakah objek yang ditentukan sama dengan instance ini. |
| [getClass()](#getClass--) |  |
| [getM11()](#getM11--) | Mendapatkan elemen M11. |
| [getM12()](#getM12--) | Mendapatkan elemen M12. |
| [getM21()](#getM21--) | Mendapatkan elemen M21. |
| [getM22()](#getM22--) | Mendapatkan elemen M22. |
| [getM31()](#getM31--) | Mendapatkan elemen M31. |
| [getM32()](#getM32--) | Mendapatkan elemen M32. |
| [hashCode()](#hashCode--) | Mengembalikan kode hash untuk instance ini. |
| [isIdentity()](#isIdentity--) | Mendapatkan nilai yang menunjukkan apakah instance ini adalah matriks identitas. |
| [multiply(XpsMatrix matrix)](#multiply-com.aspose.xps.XpsMatrix-) | Mengalikan matriks ini dengan matriks yang ditentukan oleh  matrix  dalam urutan default (Prepend). |
| [multiply(XpsMatrix matrix, XpsMatrix.MatrixOrder matrixOrder)](#multiply-com.aspose.xps.XpsMatrix-com.aspose.xps.XpsMatrix.MatrixOrder-) | Mengalikan matriks ini dengan matriks yang ditentukan oleh  matrix  dalam urutan yang ditentukan oleh  matrixOrder . |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [op_Equality(XpsMatrix a, XpsMatrix b)](#op-Equality-com.aspose.xps.XpsMatrix-com.aspose.xps.XpsMatrix-) | Mengimplementasikan operator ==. |
| [op_Inequality(XpsMatrix a, XpsMatrix b)](#op-Inequality-com.aspose.xps.XpsMatrix-com.aspose.xps.XpsMatrix-) | Mengimplementasikan operator !. |
| [reset()](#reset--) | Mengatur ulang Matrix ini ke matriks identitas. |
| [rotate(float angle)](#rotate-float-) | Menerapkan rotasi searah jarum jam sebesar  angle  ke Matrix ini dalam urutan default (Prepend). |
| [rotate(float angle, XpsMatrix.MatrixOrder matrixOrder)](#rotate-float-com.aspose.xps.XpsMatrix.MatrixOrder-) | Menerapkan rotasi searah jarum jam sebesar  angle  ke Matrix ini dalam urutan yang ditentukan oleh  matrixOrder . |
| [rotateAround(float angle, Point2D pivot)](#rotateAround-float-java.awt.geom.Point2D-) | Menerapkan rotasi searah jarum jam sebesar  angle  sekitar  pivot  ke Matrix ini dalam urutan default (Prepend). |
| [rotateAround(float angle, Point2D pivot, XpsMatrix.MatrixOrder matrixOrder)](#rotateAround-float-java.awt.geom.Point2D-com.aspose.xps.XpsMatrix.MatrixOrder-) | Menerapkan rotasi searah jarum jam sebesar  angle  sekitar  pivot  ke Matrix ini dalam urutan yang ditentukan oleh  matrixOrder . |
| [scale(float scaleX, float scaleY)](#scale-float-float-) | Menerapkan vektor skala yang ditentukan (scaleX dan scaleY) ke Matrix ini dalam urutan default (Prepend). |
| [scale(float scaleX, float scaleY, XpsMatrix.MatrixOrder matrixOrder)](#scale-float-float-com.aspose.xps.XpsMatrix.MatrixOrder-) | Menerapkan vektor skala yang ditentukan (scaleX dan scaleY) ke Matrix ini dalam urutan yang ditentukan oleh  matrixOrder . |
| [skew(double skewX, double skewY)](#skew-double-double-) | Menerapkan transformasi skew yang ditentukan ke Matrix ini. |
| [toString()](#toString--) | Mengembalikan representasi string dari instance  XpsMatrix  ini. |
| [transform(Rectangle2D rect)](#transform-java.awt.geom.Rectangle2D-) | Menerapkan transformasi afine yang direpresentasikan oleh Matrix ini ke persegi panjang yang ditentukan. |
| [transformPoint(Point2D point)](#transformPoint-java.awt.geom.Point2D-) | Menerapkan transformasi afine yang direpresentasikan oleh Matrix ini ke titik yang ditentukan. |
| [transformPoints(Point2D[] points)](#transformPoints-java.awt.geom.Point2D---) | Menerapkan transformasi afine yang direpresentasikan oleh Matrix ini ke array titik yang ditentukan. |
| [transformPoints(Point2D[] points, int startIndex, int numberOfPoints)](#transformPoints-java.awt.geom.Point2D---int-int-) | Menerapkan transformasi afine yang direpresentasikan oleh Matrix ini ke bagian tertentu dari array titik. |
| [translate(float offsetX, float offsetY)](#translate-float-float-) | Menerapkan vektor translasi yang ditentukan ke Matrix ini. |
| [translate(float offsetX, float offsetY, XpsMatrix.MatrixOrder matrixOrder)](#translate-float-float-com.aspose.xps.XpsMatrix.MatrixOrder-) | Menerapkan vektor translasi yang ditentukan ke Matrix ini dalam urutan yang ditentukan oleh  matrixOrder . |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### deepClone() {#deepClone--}
```
public XpsMatrix deepClone()
```


Mengkloning matriks transformasi ini.

**Returns:**
[XpsMatrix](../../com.aspose.xps/xpsmatrix) - Clone of this transformation matrix.
### equals(XpsMatrix a, XpsMatrix b) {#equals-com.aspose.xps.XpsMatrix-com.aspose.xps.XpsMatrix-}
```
public static boolean equals(XpsMatrix a, XpsMatrix b)
```


Implementasi sebenarnya.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| a | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | Matriks pertama. |
| b | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | Matriks kedua. |

**Returns:**
boolean - [true] jika matriks sama
### equals(Object obj) {#equals-java.lang.Object-}
```
public boolean equals(Object obj)
```


Menentukan apakah objek yang ditentukan sama dengan instance ini.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| obj | java.lang.Object | Objek untuk dibandingkan dengan instance ini. |

**Returns:**
boolean - true jika objek yang ditentukan sama dengan instance ini; jika tidak, false. Parameter obj adalah null.
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getM11() {#getM11--}
```
public float getM11()
```


Mendapatkan elemen M11.

**Returns:**
float - Elemen M11.
### getM12() {#getM12--}
```
public float getM12()
```


Mendapatkan elemen M12.

**Returns:**
float - Elemen M12.
### getM21() {#getM21--}
```
public float getM21()
```


Mendapatkan elemen M21.

**Returns:**
float - Elemen M21.
### getM22() {#getM22--}
```
public float getM22()
```


Mendapatkan elemen M22.

**Returns:**
float - Elemen M22.
### getM31() {#getM31--}
```
public float getM31()
```


Mendapatkan elemen M31.

**Returns:**
float - Elemen M31.
### getM32() {#getM32--}
```
public float getM32()
```


Mendapatkan elemen M32.

**Returns:**
float - Elemen M32.
### hashCode() {#hashCode--}
```
public int hashCode()
```


Mengembalikan kode hash untuk instance ini.

**Returns:**
int - Kode hash untuk instance ini, cocok untuk digunakan dalam algoritma hashing dan struktur data seperti tabel hash.
### isIdentity() {#isIdentity--}
```
public boolean isIdentity()
```


Mendapatkan nilai yang menunjukkan apakah instance ini adalah matriks identitas.

Nilai: True jika instance ini adalah matriks identitas; jika tidak, false.

**Returns:**
boolean - Nilai yang menunjukkan apakah instance ini adalah matriks identitas.
### multiply(XpsMatrix matrix) {#multiply-com.aspose.xps.XpsMatrix-}
```
public void multiply(XpsMatrix matrix)
```


Mengalikan matriks ini dengan matriks yang ditentukan oleh  matrix  dalam urutan default (Prepend).

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| matrix | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | Matriks. |

### multiply(XpsMatrix matrix, XpsMatrix.MatrixOrder matrixOrder) {#multiply-com.aspose.xps.XpsMatrix-com.aspose.xps.XpsMatrix.MatrixOrder-}
```
public void multiply(XpsMatrix matrix, XpsMatrix.MatrixOrder matrixOrder)
```


Mengalikan matriks ini dengan matriks yang ditentukan oleh  matrix  dalam urutan yang ditentukan oleh  matrixOrder .

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| matrix | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | Matriks. |
| matrixOrder | [MatrixOrder](../../com.aspose.xps/matrixorder) | Urutan. |

### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### op_Equality(XpsMatrix a, XpsMatrix b) {#op-Equality-com.aspose.xps.XpsMatrix-com.aspose.xps.XpsMatrix-}
```
public static boolean op_Equality(XpsMatrix a, XpsMatrix b)
```


Mengimplementasikan operator ==.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| a | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | Matriks pertama. |
| b | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | Matriks kedua. |

**Returns:**
boolean - Hasil operator.
### op_Inequality(XpsMatrix a, XpsMatrix b) {#op-Inequality-com.aspose.xps.XpsMatrix-com.aspose.xps.XpsMatrix-}
```
public static boolean op_Inequality(XpsMatrix a, XpsMatrix b)
```


Mengimplementasikan operator !=.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| a | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | Matriks pertama. |
| b | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | Matriks kedua. |

**Returns:**
boolean - Hasil operator.
### reset() {#reset--}
```
public void reset()
```


Mengatur ulang Matrix ini ke matriks identitas.

### rotate(float angle) {#rotate-float-}
```
public void rotate(float angle)
```


Menerapkan rotasi searah jarum jam sebesar  angle  ke Matrix ini dalam urutan default (Prepend).

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| angle | float | Sudut. |

### rotate(float angle, XpsMatrix.MatrixOrder matrixOrder) {#rotate-float-com.aspose.xps.XpsMatrix.MatrixOrder-}
```
public void rotate(float angle, XpsMatrix.MatrixOrder matrixOrder)
```


Menerapkan rotasi searah jarum jam sebesar  angle  ke Matrix ini dalam urutan yang ditentukan oleh  matrixOrder .

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| angle | float | Sudut. |
| matrixOrder | [MatrixOrder](../../com.aspose.xps/matrixorder) | Urutan. |

### rotateAround(float angle, Point2D pivot) {#rotateAround-float-java.awt.geom.Point2D-}
```
public void rotateAround(float angle, Point2D pivot)
```


Menerapkan rotasi searah jarum jam sebesar  angle  sekitar  pivot  ke Matrix ini dalam urutan default (Prepend).

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| angle | float | Sudut. |
| poros | java.awt.geom.Point2D | Titik poros. |

### rotateAround(float angle, Point2D pivot, XpsMatrix.MatrixOrder matrixOrder) {#rotateAround-float-java.awt.geom.Point2D-com.aspose.xps.XpsMatrix.MatrixOrder-}
```
public void rotateAround(float angle, Point2D pivot, XpsMatrix.MatrixOrder matrixOrder)
```


Menerapkan rotasi searah jarum jam sebesar  angle  sekitar  pivot  ke Matrix ini dalam urutan yang ditentukan oleh  matrixOrder .

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| angle | float | Sudut. |
| poros | java.awt.geom.Point2D | Titik poros. |
| matrixOrder | [MatrixOrder](../../com.aspose.xps/matrixorder) | Urutan. |

### scale(float scaleX, float scaleY) {#scale-float-float-}
```
public void scale(float scaleX, float scaleY)
```


Menerapkan vektor skala yang ditentukan (scaleX dan scaleY) ke Matrix ini dalam urutan default (Prepend).

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| scaleX | float | Skala x. |
| scaleY | float | Skala y. |

### scale(float scaleX, float scaleY, XpsMatrix.MatrixOrder matrixOrder) {#scale-float-float-com.aspose.xps.XpsMatrix.MatrixOrder-}
```
public void scale(float scaleX, float scaleY, XpsMatrix.MatrixOrder matrixOrder)
```


Menerapkan vektor skala yang ditentukan (scaleX dan scaleY) ke Matrix ini dalam urutan yang ditentukan oleh  matrixOrder .

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| scaleX | float | Skala X. |
| scaleY | float | Skala Y. |
| matrixOrder | [MatrixOrder](../../com.aspose.xps/matrixorder) | Urutan. |

### skew(double skewX, double skewY) {#skew-double-double-}
```
public void skew(double skewX, double skewY)
```


Menerapkan transformasi skew yang ditentukan ke Matrix ini.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| skewX | double | Skew x. |
| skewY | double | Skew y. |

### toString() {#toString--}
```
public String toString()
```


Mengembalikan representasi string dari instance  XpsMatrix  ini.

**Returns:**
java.lang.String - Representasi string
### transform(Rectangle2D rect) {#transform-java.awt.geom.Rectangle2D-}
```
public Rectangle2D transform(Rectangle2D rect)
```


Menerapkan transformasi afine yang direpresentasikan oleh Matrix ini ke persegi panjang yang ditentukan.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| rect | java.awt.geom.Rectangle2D | Persegi panjang. |

**Returns:**
java.awt.geom.Rectangle2D - Persegi panjang yang ditransformasi
### transformPoint(Point2D point) {#transformPoint-java.awt.geom.Point2D-}
```
public Point2D transformPoint(Point2D point)
```


Menerapkan transformasi afine yang direpresentasikan oleh Matrix ini ke titik yang ditentukan.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| titik | java.awt.geom.Point2D | Titik. |

**Returns:**
java.awt.geom.Point2D - Titik yang ditransformasi
### transformPoints(Point2D[] points) {#transformPoints-java.awt.geom.Point2D---}
```
public void transformPoints(Point2D[] points)
```


Menerapkan transformasi afine yang direpresentasikan oleh Matrix ini ke array titik yang ditentukan.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| points | java.awt.geom.Point2D[] | Titik-titik. |

### transformPoints(Point2D[] points, int startIndex, int numberOfPoints) {#transformPoints-java.awt.geom.Point2D---int-int-}
```
public void transformPoints(Point2D[] points, int startIndex, int numberOfPoints)
```


Menerapkan transformasi afine yang direpresentasikan oleh Matrix ini ke bagian tertentu dari array titik.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| points | java.awt.geom.Point2D[] | Titik-titik. |
| startIndex | int | Indeks mulai. |
| numberOfPoints | int | Jumlah titik. |

### translate(float offsetX, float offsetY) {#translate-float-float-}
```
public void translate(float offsetX, float offsetY)
```


Menerapkan vektor translasi yang ditentukan ke Matrix ini.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| offsetX | float | Offset X. |
| offsetY | float | Offset Y. |

### translate(float offsetX, float offsetY, XpsMatrix.MatrixOrder matrixOrder) {#translate-float-float-com.aspose.xps.XpsMatrix.MatrixOrder-}
```
public void translate(float offsetX, float offsetY, XpsMatrix.MatrixOrder matrixOrder)
```


Menerapkan vektor translasi yang ditentukan ke Matrix ini dalam urutan yang ditentukan oleh  matrixOrder .

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| offsetX | float | Offset X. |
| offsetY | float | Offset Y. |
| matrixOrder | [MatrixOrder](../../com.aspose.xps/matrixorder) | Urutan. |

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

