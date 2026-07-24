---
title: "XpsContentElement"
second_title: "Aspose.Page for Java Referensi API"
description: "Mengkapsulkan fitur elemen konten XPS Canvas Path dan Glyphs."
type: docs
weight: 18
url: /id/java/com.aspose.xps/xpscontentelement/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject), [com.aspose.xps.XpsElement](../../com.aspose.xps/xpselement), [com.aspose.xps.XpsHyperlinkElement](../../com.aspose.xps/xpshyperlinkelement)
```
public abstract class XpsContentElement extends XpsHyperlinkElement
```

Mengkapsulasi fitur elemen konten XPS: Canvas, Path, dan Glyphs.
## Metode

| Metode | Deskripsi |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [get(int i)](#get-int-) | Menyediakan akses ke anak elemen berdasarkan indeks i. |
| [getClass()](#getClass--) |  |
| [getClip()](#getClip--) | Mengembalikan geometri jalur yang membatasi wilayah yang dirender dari elemen. |
| [getHyperlinkTarget()](#getHyperlinkTarget--) | Mengembalikan objek target hyperlink. |
| [getOpacity()](#getOpacity--) | Mengembalikan nilai yang menentukan transparansi seragam elemen. |
| [getOpacityMask()](#getOpacityMask--) | Mengembalikan kuas yang menentukan masker nilai alfa yang diterapkan pada elemen dengan cara yang sama seperti atribut Opacity, tetapi memungkinkan nilai alfa yang berbeda untuk area yang berbeda dari elemen. |
| [getRenderTransform()](#getRenderTransform--) | Mengembalikan matriks transformasi afinnya yang menetapkan kerangka koordinat baru untuk semua atribut elemen dan semua elemen anak (jika ada). |
| [hashCode()](#hashCode--) |  |
| [iterator()](#iterator--) | Implementasi antarmuka Iterable. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setClip(XpsPathGeometry value)](#setClip-com.aspose.xps.XpsPathGeometry-) | Mengatur geometri jalur yang membatasi wilayah yang dirender dari elemen. |
| [setHyperlinkTarget(XpsHyperlinkTarget value)](#setHyperlinkTarget-com.aspose.xps.XpsHyperlinkTarget-) | Mengatur objek target hyperlink. |
| [setOpacity(float value)](#setOpacity-float-) | Mengatur nilai yang mendefinisikan transparansi seragam elemen. |
| [setOpacityMask(XpsBrush value)](#setOpacityMask-com.aspose.xps.XpsBrush-) | Mengatur kuas yang menentukan masker nilai alfa yang diterapkan pada elemen dengan cara yang sama seperti atribut Opacity, tetapi memungkinkan nilai alfa yang berbeda untuk area yang berbeda dari elemen. |
| [setRenderTransform(XpsMatrix value)](#setRenderTransform-com.aspose.xps.XpsMatrix-) | Mengatur matriks transformasi afinnya yang menetapkan kerangka koordinat baru untuk semua atribut elemen dan untuk semua elemen anak (jika ada). |
| [size()](#size--) | Mengembalikan jumlah elemen anak. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
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

