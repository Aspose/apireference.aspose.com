---
title: "XpsImageBrush"
second_title: "Aspose.Page for Java Referensi API"
description: "Kelas yang mengenkapsulasi fitur elemen properti ImageBrush."
type: docs
weight: 33
url: /id/java/com.aspose.xps/xpsimagebrush/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject), [com.aspose.xps.XpsBrush](../../com.aspose.xps/xpsbrush), [com.aspose.xps.XpsTransformableBrush](../../com.aspose.xps/xpstransformablebrush), [com.aspose.xps.XpsTilingBrush](../../com.aspose.xps/xpstilingbrush)
```
public final class XpsImageBrush extends XpsTilingBrush
```

Kelas yang menginkapsulasi fitur elemen properti ImageBrush. Elemen ini digunakan untuk mengisi wilayah dengan gambar.
## Metode

| Metode | Deskripsi |
| --- | --- |
| [deepClone()](#deepClone--) | Mengkloning kuas gambar ini. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getImage()](#getImage--) | Mengembalikan sumber daya gambar yang digunakan untuk kuas. |
| [getImageSource()](#getImageSource--) | Mengembalikan URI dari sumber daya gambar. |
| [getOpacity()](#getOpacity--) | Mengembalikan nilai yang mendefinisikan transparansi seragam dari isian kuas. |
| [getTileMode()](#getTileMode--) | Mengembalikan nilai yang menentukan bagaimana penataan ubin dilakukan pada geometri yang diisi. |
| [getTransform()](#getTransform--) | Mengembalikan transformasi matriks yang diterapkan pada ruang koordinat kuas. |
| [getViewbox()](#getViewbox--) | Mengembalikan wilayah konten sumber kuas yang akan dipetakan ke viewport. |
| [getViewport()](#getViewport--) | Mengembalikan posisi dan dimensi ubin kuas pertama. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setOpacity(float value)](#setOpacity-float-) | Mengatur nilai yang mendefinisikan transparansi seragam dari isian kuas. |
| [setTileMode(XpsTileMode value)](#setTileMode-com.aspose.xps.XpsTileMode-) | Mengatur nilai yang menentukan bagaimana penataan ubin dilakukan pada geometri yang diisi. |
| [setTransform(XpsMatrix value)](#setTransform-com.aspose.xps.XpsMatrix-) | Mengatur transformasi matriks yang diterapkan pada ruang koordinat kuas. |
| [setViewbox(Rectangle2D value)](#setViewbox-java.awt.geom.Rectangle2D-) | Mengatur wilayah konten sumber kuas yang akan dipetakan ke viewport. |
| [setViewport(Rectangle2D value)](#setViewport-java.awt.geom.Rectangle2D-) | Mengatur posisi dan dimensi ubin kuas pertama. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### deepClone() {#deepClone--}
```
public XpsImageBrush deepClone()
```


Mengkloning kuas gambar ini.

**Returns:**
[XpsImageBrush](../../com.aspose.xps/xpsimagebrush) - Clone of this image brush.
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
### getImage() {#getImage--}
```
public XpsImage getImage()
```


Mengembalikan sumber daya gambar yang digunakan untuk kuas.

**Returns:**
[XpsImage](../../com.aspose.xps/xpsimage) - Image resource used to for the brush.
### getImageSource() {#getImageSource--}
```
public String getImageSource()
```


Mengembalikan URI dari sumber daya gambar.

**Returns:**
java.lang.String - URI dari sumber daya gambar.
### getOpacity() {#getOpacity--}
```
public float getOpacity()
```


Mengembalikan nilai yang mendefinisikan transparansi seragam dari isian kuas.

**Returns:**
float - Nilai yang mendefinisikan transparansi seragam dari isian kuas.
### getTileMode() {#getTileMode--}
```
public XpsTileMode getTileMode()
```


Mengembalikan nilai yang menentukan bagaimana penataan ubin dilakukan pada geometri yang diisi.

**Returns:**
[XpsTileMode](../../com.aspose.xps/xpstilemode) - Value specifying how tiling is performed in the filled geometry.
### getTransform() {#getTransform--}
```
public XpsMatrix getTransform()
```


Mengembalikan transformasi matriks yang diterapkan pada ruang koordinat kuas. Properti Transform digabungkan dengan transformasi render efektif saat ini untuk menghasilkan transformasi render efektif yang lokal pada kuas. Viewport untuk kuas ditransformasikan menggunakan transformasi render efektif lokal.

**Returns:**
[XpsMatrix](../../com.aspose.xps/xpsmatrix) - The matrix transformation applied to the coordinate space of the brush.
### getViewbox() {#getViewbox--}
```
public Rectangle2D getViewbox()
```


Mengembalikan wilayah konten sumber kuas yang akan dipetakan ke viewport.

**Returns:**
java.awt.geom.Rectangle2D - Wilayah konten sumber kuas yang akan dipetakan ke viewport.
### getViewport() {#getViewport--}
```
public Rectangle2D getViewport()
```


Mengembalikan posisi dan dimensi ubin kuas pertama. Ubin-ubin berikutnya diposisikan relatif terhadap ubin ini, sebagaimana ditentukan oleh mode ubin.

**Returns:**
java.awt.geom.Rectangle2D - Posisi dan dimensi ubin kuas pertama.
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




### setOpacity(float value) {#setOpacity-float-}
```
public void setOpacity(float value)
```


Mengatur nilai yang mendefinisikan transparansi seragam dari isian kuas.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| nilai | float | Nilai yang mendefinisikan transparansi seragam dari isian kuas. |

### setTileMode(XpsTileMode value) {#setTileMode-com.aspose.xps.XpsTileMode-}
```
public void setTileMode(XpsTileMode value)
```


Mengatur nilai yang menentukan bagaimana penataan ubin dilakukan pada geometri yang diisi.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| value | [XpsTileMode](../../com.aspose.xps/xpstilemode) | Nilai yang menentukan bagaimana penataan ubin dilakukan pada geometri yang diisi. |

### setTransform(XpsMatrix value) {#setTransform-com.aspose.xps.XpsMatrix-}
```
public void setTransform(XpsMatrix value)
```


Mengatur transformasi matriks yang diterapkan pada ruang koordinat kuas. Properti Transform digabungkan dengan transformasi render efektif saat ini untuk menghasilkan transformasi render efektif yang lokal pada kuas. Viewport untuk kuas ditransformasikan menggunakan transformasi render efektif lokal.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| value | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | Transformasi matriks yang diterapkan pada ruang koordinat kuas. |

### setViewbox(Rectangle2D value) {#setViewbox-java.awt.geom.Rectangle2D-}
```
public void setViewbox(Rectangle2D value)
```


Mengatur wilayah konten sumber kuas yang akan dipetakan ke viewport.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| nilai | java.awt.geom.Rectangle2D | Wilayah konten sumber kuas yang akan dipetakan ke viewport. |

### setViewport(Rectangle2D value) {#setViewport-java.awt.geom.Rectangle2D-}
```
public void setViewport(Rectangle2D value)
```


Mengatur posisi dan dimensi ubin kuas pertama. Ubin-ubin berikutnya diposisikan relatif terhadap ubin ini, sebagaimana ditentukan oleh mode ubin.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| nilai | java.awt.geom.Rectangle2D | Posisi dan dimensi ubin kuas pertama. |

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

