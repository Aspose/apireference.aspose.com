---
title: "XpsPath"
second_title: "Aspose.Page for Java Referensi API"
description: "Kelas yang mengenkapsulasi fitur elemen Path."
type: docs
weight: 40
url: /id/java/com.aspose.xps/xpspath/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject), [com.aspose.xps.XpsElement](../../com.aspose.xps/xpselement), [com.aspose.xps.XpsHyperlinkElement](../../com.aspose.xps/xpshyperlinkelement), [com.aspose.xps.XpsContentElement](../../com.aspose.xps/xpscontentelement)
```
public final class XpsPath extends XpsContentElement
```

Kelas yang mengenkapsulasi fitur elemen Path. Elemen ini adalah satu-satunya cara untuk menambahkan grafik vektor dan gambar ke halaman tetap. Ini mendefinisikan satu grafik vektor yang akan dirender pada halaman.
## Metode

| Metode | Deskripsi |
| --- | --- |
| [deepClone()](#deepClone--) | Mengkloning path ini. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [get(int i)](#get-int-) | Menyediakan akses ke anak elemen berdasarkan indeks i. |
| [getClass()](#getClass--) |  |
| [getClip()](#getClip--) | Mengembalikan geometri jalur yang membatasi wilayah yang dirender dari elemen. |
| [getData()](#getData--) | Mengembalikan geometri path. |
| [getFill()](#getFill--) | Mengembalikan kuas yang digunakan untuk melukis geometri yang ditentukan oleh properti Data dari path. |
| [getHyperlinkTarget()](#getHyperlinkTarget--) | Mengembalikan objek target hyperlink. |
| [getOpacity()](#getOpacity--) | Mengembalikan nilai yang menentukan transparansi seragam elemen. |
| [getOpacityMask()](#getOpacityMask--) | Mengembalikan kuas yang menentukan masker nilai alfa yang diterapkan pada elemen dengan cara yang sama seperti atribut Opacity, tetapi memungkinkan nilai alfa yang berbeda untuk area yang berbeda dari elemen. |
| [getRenderTransform()](#getRenderTransform--) | Mengembalikan matriks transformasi afinnya yang menetapkan kerangka koordinat baru untuk semua atribut elemen dan semua elemen anak (jika ada). |
| [getStroke()](#getStroke--) | Mengembalikan kuas yang digunakan untuk menggambar goresan. |
| [getStrokeDashArray()](#getStrokeDashArray--) | Mengembalikan array yang menentukan panjang dash dan celah dari goresan outline. |
| [getStrokeDashCap()](#getStrokeDashCap--) | Mengembalikan nilai yang menentukan bagaimana ujung setiap dash digambar. |
| [getStrokeDashOffset()](#getStrokeDashOffset--) | Mengembalikan titik awal untuk mengulang pola array dash. |
| [getStrokeEndLineCap()](#getStrokeEndLineCap--) | Mengembalikan nilai yang mendefinisikan bentuk ujung dash terakhir dalam goresan. |
| [getStrokeLineJoin()](#getStrokeLineJoin--) | Mengembalikan nilai yang mendefinisikan bentuk awal dash pertama dalam goresan. |
| [getStrokeMiterLimit()](#getStrokeMiterLimit--) | Mengembalikan rasio antara panjang miter maksimum dan setengah ketebalan goresan. |
| [getStrokeStartLineCap()](#getStrokeStartLineCap--) | Mengembalikan nilai yang mendefinisikan bentuk awal dash pertama dalam goresan. |
| [getStrokeThickness()](#getStrokeThickness--) | Mengembalikan ketebalan goresan, dalam satuan ruang koordinat efektif (termasuk transformasi render path). |
| [hashCode()](#hashCode--) |  |
| [iterator()](#iterator--) | Implementasi antarmuka Iterable. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setClip(XpsPathGeometry value)](#setClip-com.aspose.xps.XpsPathGeometry-) | Mengatur geometri jalur yang membatasi wilayah yang dirender dari elemen. |
| [setData(XpsPathGeometry value)](#setData-com.aspose.xps.XpsPathGeometry-) | Mengatur geometri path. |
| [setFill(XpsBrush value)](#setFill-com.aspose.xps.XpsBrush-) | Mengatur kuas yang digunakan untuk melukis geometri yang ditentukan oleh properti Data dari path. |
| [setHyperlinkTarget(XpsHyperlinkTarget value)](#setHyperlinkTarget-com.aspose.xps.XpsHyperlinkTarget-) | Mengatur objek target hyperlink. |
| [setOpacity(float value)](#setOpacity-float-) | Mengatur nilai yang mendefinisikan transparansi seragam elemen. |
| [setOpacityMask(XpsBrush value)](#setOpacityMask-com.aspose.xps.XpsBrush-) | Mengatur kuas yang menentukan masker nilai alfa yang diterapkan pada elemen dengan cara yang sama seperti atribut Opacity, tetapi memungkinkan nilai alfa yang berbeda untuk area yang berbeda dari elemen. |
| [setRenderTransform(XpsMatrix value)](#setRenderTransform-com.aspose.xps.XpsMatrix-) | Mengatur matriks transformasi afinnya yang menetapkan kerangka koordinat baru untuk semua atribut elemen dan untuk semua elemen anak (jika ada). |
| [setStroke(XpsBrush value)](#setStroke-com.aspose.xps.XpsBrush-) | Mengatur kuas yang digunakan untuk menggambar goresan. |
| [setStrokeDashArray(float[] value)](#setStrokeDashArray-float---) | Mengatur array yang menentukan panjang dash dan celah dari goresan outline. |
| [setStrokeDashCap(XpsDashCap value)](#setStrokeDashCap-com.aspose.xps.XpsDashCap-) | Mengatur nilai yang menentukan bagaimana ujung setiap dash digambar. |
| [setStrokeDashOffset(float value)](#setStrokeDashOffset-float-) | Mengatur titik awal untuk mengulang pola array dash. |
| [setStrokeEndLineCap(XpsLineCap value)](#setStrokeEndLineCap-com.aspose.xps.XpsLineCap-) | Mengatur nilai yang mendefinisikan bentuk ujung dash terakhir dalam goresan. |
| [setStrokeLineJoin(XpsLineJoin value)](#setStrokeLineJoin-com.aspose.xps.XpsLineJoin-) | Mengatur nilai yang mendefinisikan bentuk awal dash pertama dalam goresan. |
| [setStrokeMiterLimit(float value)](#setStrokeMiterLimit-float-) | Mengatur rasio antara panjang miter maksimum dan setengah ketebalan goresan. |
| [setStrokeStartLineCap(XpsLineCap value)](#setStrokeStartLineCap-com.aspose.xps.XpsLineCap-) | Mengatur nilai yang mendefinisikan bentuk awal dash pertama dalam goresan. |
| [setStrokeThickness(float value)](#setStrokeThickness-float-) | Mengatur ketebalan goresan, dalam satuan ruang koordinat efektif (termasuk transformasi render path). |
| [size()](#size--) | Mengembalikan jumlah elemen anak. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### deepClone() {#deepClone--}
```
public XpsPath deepClone()
```


Mengkloning path ini.

**Returns:**
[XpsPath](../../com.aspose.xps/xpspath) - Clone this path.
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
public XpsContentElement get(int i)
```


Menyediakan akses ke anak elemen berdasarkan indeks i.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| i | int | Indeks elemen anak. |

**Returns:**
[XpsContentElement](../../com.aspose.xps/xpscontentelement) - Child element at  i  position.
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getClip() {#getClip--}
```
public XpsPathGeometry getClip()
```


Mengembalikan geometri jalur yang membatasi wilayah yang dirender dari elemen.

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - The path geometry limiting the rendered region of the element.
### getData() {#getData--}
```
public XpsPathGeometry getData()
```


Mengembalikan geometri path.

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - The geometry of the path.
### getFill() {#getFill--}
```
public XpsBrush getFill()
```


Mengembalikan kuas yang digunakan untuk melukis geometri yang ditentukan oleh properti Data dari path.

**Returns:**
[XpsBrush](../../com.aspose.xps/xpsbrush) - The brush used to paint the geometry specified
### getHyperlinkTarget() {#getHyperlinkTarget--}
```
public XpsHyperlinkTarget getHyperlinkTarget()
```


Mengembalikan objek target hyperlink.

**Returns:**
[XpsHyperlinkTarget](../../com.aspose.xps/xpshyperlinktarget) - Hyperlink target object.
### getOpacity() {#getOpacity--}
```
public float getOpacity()
```


Mengembalikan nilai yang menentukan transparansi seragam elemen.

**Returns:**
float - Nilai yang mendefinisikan transparansi seragam elemen.
### getOpacityMask() {#getOpacityMask--}
```
public XpsBrush getOpacityMask()
```


Mengembalikan kuas yang menentukan masker nilai alfa yang diterapkan pada elemen dengan cara yang sama seperti atribut Opacity, tetapi memungkinkan nilai alfa yang berbeda untuk area yang berbeda dari elemen.

**Returns:**
[XpsBrush](../../com.aspose.xps/xpsbrush) - The brush specifying a mask.
### getRenderTransform() {#getRenderTransform--}
```
public XpsMatrix getRenderTransform()
```


Mengembalikan matriks transformasi afinnya yang menetapkan kerangka koordinat baru untuk semua atribut elemen dan semua elemen anak (jika ada).

**Returns:**
[XpsMatrix](../../com.aspose.xps/xpsmatrix) - The affine transformation matrix.
### getStroke() {#getStroke--}
```
public XpsBrush getStroke()
```


Mengembalikan kuas yang digunakan untuk menggambar goresan.

**Returns:**
[XpsBrush](../../com.aspose.xps/xpsbrush) - The brush used to draw the stroke.
### getStrokeDashArray() {#getStrokeDashArray--}
```
public float[] getStrokeDashArray()
```


Mengembalikan array yang menentukan panjang dash dan celah dari goresan outline.

**Returns:**
float[] - Array yang menentukan panjang dash dan celah dari goresan outline.
### getStrokeDashCap() {#getStrokeDashCap--}
```
public XpsDashCap getStrokeDashCap()
```


Mengembalikan nilai yang menentukan bagaimana ujung setiap dash digambar.

**Returns:**
[XpsDashCap](../../com.aspose.xps/xpsdashcap) - The value specifying how the ends of each dash are drawn.
### getStrokeDashOffset() {#getStrokeDashOffset--}
```
public float getStrokeDashOffset()
```


Mengembalikan titik awal untuk mengulang pola array dash. Jika nilai ini dihilangkan, array dash akan sejajar dengan asal goresan.

**Returns:**
float - Titik awal untuk mengulangi pola array dash.
### getStrokeEndLineCap() {#getStrokeEndLineCap--}
```
public XpsLineCap getStrokeEndLineCap()
```


Mengembalikan nilai yang mendefinisikan bentuk ujung dash terakhir dalam goresan.

**Returns:**
[XpsLineCap](../../com.aspose.xps/xpslinecap) - The value defining the shape of the end of the last dash in a stroke.
### getStrokeLineJoin() {#getStrokeLineJoin--}
```
public XpsLineJoin getStrokeLineJoin()
```


Mengembalikan nilai yang mendefinisikan bentuk awal dash pertama dalam goresan.

**Returns:**
[XpsLineJoin](../../com.aspose.xps/xpslinejoin) - The value defining the shape of the beginning of the first dash in a stroke.
### getStrokeMiterLimit() {#getStrokeMiterLimit--}
```
public float getStrokeMiterLimit()
```


Mengembalikan rasio antara panjang miter maksimum dan setengah ketebalan goresan. Nilai ini signifikan hanya jika atribut  StrokeLineJoin  menentukan  Miter .

**Returns:**
float - Rasio antara panjang miter maksimum dan setengah ketebalan goresan.
### getStrokeStartLineCap() {#getStrokeStartLineCap--}
```
public XpsLineCap getStrokeStartLineCap()
```


Mengembalikan nilai yang mendefinisikan bentuk awal dash pertama dalam goresan.

**Returns:**
[XpsLineCap](../../com.aspose.xps/xpslinecap) - The value defining the shape of the beginning of the first dash in a stroke.
### getStrokeThickness() {#getStrokeThickness--}
```
public float getStrokeThickness()
```


Mengembalikan ketebalan goresan, dalam satuan ruang koordinat efektif (termasuk transformasi render jalur). Goresan digambar di atas batas geometri yang ditentukan oleh properti Data elemen Path\\u2019s. Setengah dari StrokeThickness berada di luar geometri yang ditentukan oleh properti Data dan setengah lainnya berada di dalam geometri.

**Returns:**
float - Ketebalan goresan.
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### iterator() {#iterator--}
```
public Iterator<XpsContentElement> iterator()
```


Implementasi antarmuka Iterable.

**Returns:**
java.util.Iterator<com.aspose.xps.XpsContentElement> - Mengembalikan enumerator untuk daftar.
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### setClip(XpsPathGeometry value) {#setClip-com.aspose.xps.XpsPathGeometry-}
```
public void setClip(XpsPathGeometry value)
```


Mengatur geometri jalur yang membatasi wilayah yang dirender dari elemen.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| value | [XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) | Geometri jalur yang membatasi wilayah yang dirender dari elemen. |

### setData(XpsPathGeometry value) {#setData-com.aspose.xps.XpsPathGeometry-}
```
public void setData(XpsPathGeometry value)
```


Mengatur geometri path.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| value | [XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) | Geometri jalur. |

### setFill(XpsBrush value) {#setFill-com.aspose.xps.XpsBrush-}
```
public void setFill(XpsBrush value)
```


Mengatur kuas yang digunakan untuk melukis geometri yang ditentukan oleh properti Data dari path.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| value | [XpsBrush](../../com.aspose.xps/xpsbrush) | Kuas yang digunakan untuk melukis geometri yang ditentukan |

### setHyperlinkTarget(XpsHyperlinkTarget value) {#setHyperlinkTarget-com.aspose.xps.XpsHyperlinkTarget-}
```
public void setHyperlinkTarget(XpsHyperlinkTarget value)
```


Mengatur objek target hyperlink.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| value | [XpsHyperlinkTarget](../../com.aspose.xps/xpshyperlinktarget) | Objek target hyperlink. |

### setOpacity(float value) {#setOpacity-float-}
```
public void setOpacity(float value)
```


Mengatur nilai yang mendefinisikan transparansi seragam elemen.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| nilai | float | Nilai yang mendefinisikan transparansi seragam elemen. |

### setOpacityMask(XpsBrush value) {#setOpacityMask-com.aspose.xps.XpsBrush-}
```
public void setOpacityMask(XpsBrush value)
```


Mengatur kuas yang menentukan masker nilai alfa yang diterapkan pada elemen dengan cara yang sama seperti atribut Opacity, tetapi memungkinkan nilai alfa yang berbeda untuk area yang berbeda dari elemen.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| value | [XpsBrush](../../com.aspose.xps/xpsbrush) | Kuas yang menentukan masker. |

### setRenderTransform(XpsMatrix value) {#setRenderTransform-com.aspose.xps.XpsMatrix-}
```
public void setRenderTransform(XpsMatrix value)
```


Mengatur matriks transformasi afinnya yang menetapkan kerangka koordinat baru untuk semua atribut elemen dan untuk semua elemen anak (jika ada).

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| value | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | Matriks transformasi afinnya. |

### setStroke(XpsBrush value) {#setStroke-com.aspose.xps.XpsBrush-}
```
public void setStroke(XpsBrush value)
```


Mengatur kuas yang digunakan untuk menggambar goresan.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| value | [XpsBrush](../../com.aspose.xps/xpsbrush) | Kuas yang digunakan untuk menggambar goresan. |

### setStrokeDashArray(float[] value) {#setStrokeDashArray-float---}
```
public void setStrokeDashArray(float[] value)
```


Mengatur array yang menentukan panjang dash dan celah dari goresan outline.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| nilai | float[] | Array yang menentukan panjang dash dan celah dari goresan outline. |

### setStrokeDashCap(XpsDashCap value) {#setStrokeDashCap-com.aspose.xps.XpsDashCap-}
```
public void setStrokeDashCap(XpsDashCap value)
```


Mengatur nilai yang menentukan bagaimana ujung setiap dash digambar.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| value | [XpsDashCap](../../com.aspose.xps/xpsdashcap) | Nilai yang menentukan bagaimana ujung setiap dash digambar. |

### setStrokeDashOffset(float value) {#setStrokeDashOffset-float-}
```
public void setStrokeDashOffset(float value)
```


Mengatur titik awal untuk mengulangi pola array dash. Jika nilai ini dihilangkan, array dash akan sejajar dengan asal goresan.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| nilai | float | Titik awal untuk mengulangi pola array dash. |

### setStrokeEndLineCap(XpsLineCap value) {#setStrokeEndLineCap-com.aspose.xps.XpsLineCap-}
```
public void setStrokeEndLineCap(XpsLineCap value)
```


Mengatur nilai yang mendefinisikan bentuk ujung dash terakhir dalam goresan.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| value | [XpsLineCap](../../com.aspose.xps/xpslinecap) | Nilai yang mendefinisikan bentuk ujung dash terakhir dalam sebuah goresan. |

### setStrokeLineJoin(XpsLineJoin value) {#setStrokeLineJoin-com.aspose.xps.XpsLineJoin-}
```
public void setStrokeLineJoin(XpsLineJoin value)
```


Mengatur nilai yang mendefinisikan bentuk awal dash pertama dalam goresan.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| value | [XpsLineJoin](../../com.aspose.xps/xpslinejoin) | Nilai yang mendefinisikan bentuk awal dash pertama dalam sebuah goresan. |

### setStrokeMiterLimit(float value) {#setStrokeMiterLimit-float-}
```
public void setStrokeMiterLimit(float value)
```


Mengatur rasio antara panjang miter maksimum dan setengah ketebalan goresan. Nilai ini signifikan hanya jika atribut  StrokeLineJoin  menentukan  Miter .

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| nilai | float | Rasio antara panjang miter maksimum dan setengah ketebalan goresan. |

### setStrokeStartLineCap(XpsLineCap value) {#setStrokeStartLineCap-com.aspose.xps.XpsLineCap-}
```
public void setStrokeStartLineCap(XpsLineCap value)
```


Mengatur nilai yang mendefinisikan bentuk awal dash pertama dalam goresan.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| value | [XpsLineCap](../../com.aspose.xps/xpslinecap) | Nilai yang mendefinisikan bentuk awal dash pertama dalam sebuah goresan. |

### setStrokeThickness(float value) {#setStrokeThickness-float-}
```
public void setStrokeThickness(float value)
```


Mengatur ketebalan goresan, dalam satuan ruang koordinat efektif (termasuk transformasi render jalur). Goresan digambar di atas batas geometri yang ditentukan oleh properti Data elemen Path\\u2019s. Setengah dari StrokeThickness berada di luar geometri yang ditentukan oleh properti Data dan setengah lainnya berada di dalam geometri.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| nilai | float | Ketebalan goresan. |

### size() {#size--}
```
public int size()
```


Mengembalikan jumlah elemen anak.

**Returns:**
int - Jumlah elemen anak.
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

