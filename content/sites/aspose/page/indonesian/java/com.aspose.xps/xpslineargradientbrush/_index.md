---
title: "XpsLinearGradientBrush"
second_title: "Aspose.Page for Java Referensi API"
description: "Kelas yang mengenkapsulasi fitur elemen properti LinearGradientBrush."
type: docs
weight: 34
url: /id/java/com.aspose.xps/xpslineargradientbrush/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject), [com.aspose.xps.XpsBrush](../../com.aspose.xps/xpsbrush), [com.aspose.xps.XpsTransformableBrush](../../com.aspose.xps/xpstransformablebrush), [com.aspose.xps.XpsGradientBrush](../../com.aspose.xps/xpsgradientbrush)
```
public final class XpsLinearGradientBrush extends XpsGradientBrush
```

Kelas yang menginkapsulasi fitur elemen properti LinearGradientBrush. Elemen ini digunakan untuk menentukan kuas gradien linier sepanjang vektor.
## Metode

| Metode | Deskripsi |
| --- | --- |
| [deepClone()](#deepClone--) | Mengkloning kuas gradien linier ini. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getColorInterpolationMode()](#getColorInterpolationMode--) | Mengembalikan nilai yang menentukan fungsi gamma untuk interpolasi warna. |
| [getEndPoint()](#getEndPoint--) | Mengembalikan titik akhir dari gradien linier. |
| [getGradientStops()](#getGradientStops--) | Mengembalikan daftar titik henti gradien yang membentuk gradien. |
| [getOpacity()](#getOpacity--) | Mengembalikan nilai yang mendefinisikan transparansi seragam dari isian kuas. |
| [getSpreadMethod()](#getSpreadMethod--) | Mengembalikan nilai yang menjelaskan bagaimana kuas harus mengisi area konten di luar area gradien utama, awal. |
| [getStartPoint()](#getStartPoint--) | Mengembalikan titik awal dari gradien linier. |
| [getTransform()](#getTransform--) | Mengembalikan transformasi matriks yang diterapkan pada ruang koordinat kuas. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setColorInterpolationMode(XpsColorInterpolationMode value)](#setColorInterpolationMode-com.aspose.xps.XpsColorInterpolationMode-) | Mengatur nilai yang menentukan fungsi gamma untuk interpolasi warna. |
| [setEndPoint(Point2D value)](#setEndPoint-java.awt.geom.Point2D-) | Mengembalikan/mengatur titik akhir dari gradien linier. |
| [setGradientStops(List<XpsGradientStop> value)](#setGradientStops-java.util.List-com.aspose.xps.XpsGradientStop--) | Mengatur daftar titik henti gradien yang membentuk gradien. |
| [setOpacity(float value)](#setOpacity-float-) | Mengatur nilai yang mendefinisikan transparansi seragam dari isian kuas. |
| [setSpreadMethod(XpsSpreadMethod value)](#setSpreadMethod-com.aspose.xps.XpsSpreadMethod-) | Mengatur nilai yang menjelaskan bagaimana kuas harus mengisi area konten di luar area gradien utama, awal. |
| [setStartPoint(Point2D value)](#setStartPoint-java.awt.geom.Point2D-) | Mengatur titik awal dari gradien linier. |
| [setTransform(XpsMatrix value)](#setTransform-com.aspose.xps.XpsMatrix-) | Mengatur transformasi matriks yang diterapkan pada ruang koordinat kuas. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### deepClone() {#deepClone--}
```
public XpsLinearGradientBrush deepClone()
```


Mengkloning kuas gradien linier ini.

**Returns:**
[XpsLinearGradientBrush](../../com.aspose.xps/xpslineargradientbrush) - Clone of this linear gradient brush.
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
### getColorInterpolationMode() {#getColorInterpolationMode--}
```
public XpsColorInterpolationMode getColorInterpolationMode()
```


Mengembalikan nilai yang menentukan fungsi gamma untuk interpolasi warna. Penyesuaian gamma tidak boleh diterapkan pada komponen alfa, jika ditentukan.

**Returns:**
[XpsColorInterpolationMode](../../com.aspose.xps/xpscolorinterpolationmode) - Value specifying the gamma function for color interpolation.
### getEndPoint() {#getEndPoint--}
```
public Point2D getEndPoint()
```


Mengembalikan titik akhir dari gradien linier.

**Returns:**
java.awt.geom.Point2D - Titik akhir dari gradien linier.
### getGradientStops() {#getGradientStops--}
```
public List<XpsGradientStop> getGradientStops()
```


Mengembalikan daftar titik henti gradien yang membentuk gradien.

**Returns:**
java.util.List<com.aspose.xps.XpsGradientStop> - Daftar titik henti gradien yang membentuk gradien.
### getOpacity() {#getOpacity--}
```
public float getOpacity()
```


Mengembalikan nilai yang mendefinisikan transparansi seragam dari isian kuas.

**Returns:**
float - Nilai yang mendefinisikan transparansi seragam dari isian kuas.
### getSpreadMethod() {#getSpreadMethod--}
```
public XpsSpreadMethod getSpreadMethod()
```


Mengembalikan nilai yang menjelaskan bagaimana kuas harus mengisi area konten di luar area gradien utama, awal.

**Returns:**
[XpsSpreadMethod](../../com.aspose.xps/xpsspreadmethod) - Value describing how the brush should fill the content area outside of the primary, initial gradient area.
### getStartPoint() {#getStartPoint--}
```
public Point2D getStartPoint()
```


Mengembalikan titik awal dari gradien linier.

**Returns:**
java.awt.geom.Point2D - Titik awal dari gradien linier.
### getTransform() {#getTransform--}
```
public XpsMatrix getTransform()
```


Mengembalikan transformasi matriks yang diterapkan pada ruang koordinat kuas. Properti Transform digabungkan dengan transformasi render efektif saat ini untuk menghasilkan transformasi render efektif yang lokal pada kuas. Viewport untuk kuas ditransformasikan menggunakan transformasi render efektif lokal.

**Returns:**
[XpsMatrix](../../com.aspose.xps/xpsmatrix) - The matrix transformation applied to the coordinate space of the brush.
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




### setColorInterpolationMode(XpsColorInterpolationMode value) {#setColorInterpolationMode-com.aspose.xps.XpsColorInterpolationMode-}
```
public void setColorInterpolationMode(XpsColorInterpolationMode value)
```


Menetapkan nilai yang menentukan fungsi gamma untuk interpolasi warna. Penyesuaian gamma tidak boleh diterapkan pada komponen alfa, jika ditentukan.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| value | [XpsColorInterpolationMode](../../com.aspose.xps/xpscolorinterpolationmode) | Nilai yang menentukan fungsi gamma untuk interpolasi warna. |

### setEndPoint(Point2D value) {#setEndPoint-java.awt.geom.Point2D-}
```
public void setEndPoint(Point2D value)
```


Mengembalikan/mengatur titik akhir dari gradien linier.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| nilai | java.awt.geom.Point2D | Titik akhir gradien linier. |

### setGradientStops(List<XpsGradientStop> value) {#setGradientStops-java.util.List-com.aspose.xps.XpsGradientStop--}
```
public void setGradientStops(List<XpsGradientStop> value)
```


Mengatur daftar titik henti gradien yang membentuk gradien.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| nilai | java.util.List<com.aspose.xps.XpsGradientStop> | Daftar titik henti gradien yang membentuk gradien. |

### setOpacity(float value) {#setOpacity-float-}
```
public void setOpacity(float value)
```


Mengatur nilai yang mendefinisikan transparansi seragam dari isian kuas.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| nilai | float | Nilai yang mendefinisikan transparansi seragam dari isian kuas. |

### setSpreadMethod(XpsSpreadMethod value) {#setSpreadMethod-com.aspose.xps.XpsSpreadMethod-}
```
public void setSpreadMethod(XpsSpreadMethod value)
```


Mengatur nilai yang menjelaskan bagaimana kuas harus mengisi area konten di luar area gradien utama, awal.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| value | [XpsSpreadMethod](../../com.aspose.xps/xpsspreadmethod) | Nilai yang menggambarkan bagaimana kuas harus mengisi area konten di luar area gradien utama, awal. |

### setStartPoint(Point2D value) {#setStartPoint-java.awt.geom.Point2D-}
```
public void setStartPoint(Point2D value)
```


Mengatur titik awal dari gradien linier.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| nilai | java.awt.geom.Point2D | Titik awal gradien linier. |

### setTransform(XpsMatrix value) {#setTransform-com.aspose.xps.XpsMatrix-}
```
public void setTransform(XpsMatrix value)
```


Mengatur transformasi matriks yang diterapkan pada ruang koordinat kuas. Properti Transform digabungkan dengan transformasi render efektif saat ini untuk menghasilkan transformasi render efektif yang lokal pada kuas. Viewport untuk kuas ditransformasikan menggunakan transformasi render efektif lokal.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| value | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | Transformasi matriks yang diterapkan pada ruang koordinat kuas. |

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

