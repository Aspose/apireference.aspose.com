---
title: "XpsCanvas"
second_title: "Aspose.Page for Java Referensi API"
description: "Kelas yang mengenkapsulasi fitur elemen Canvas."
type: docs
weight: 16
url: /id/java/com.aspose.xps/xpscanvas/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject), [com.aspose.xps.XpsElement](../../com.aspose.xps/xpselement), [com.aspose.xps.XpsHyperlinkElement](../../com.aspose.xps/xpshyperlinkelement), [com.aspose.xps.XpsContentElement](../../com.aspose.xps/xpscontentelement)
```
public final class XpsCanvas extends XpsContentElement
```

Kelas yang mengenkapsulasi fitur elemen Canvas. Elemen ini mengelompokkan elemen‑elemen bersama. Misalnya, elemen Glyphs dan Path dapat dikelompokkan dalam sebuah canvas untuk diidentifikasi sebagai satu unit (sebagai tujuan hyperlink) atau untuk menerapkan nilai properti yang digabungkan ke setiap elemen anak dan leluhur.
## Metode

| Metode | Deskripsi |
| --- | --- |
| [<T>add(T element)](#-T-add-T-) | Menambahkan sebuah elemen ke daftar anak canvas ini. |
| [<T>insert(int index, T element)](#-T-insert-int-T-) | Menyisipkan sebuah elemen ke daftar anak canvas ini pada posisi indeks. |
| [addCanvas()](#addCanvas--) | Menambahkan sebuah canvas baru ke daftar anak canvas ini. |
| [addGlyphs(String fontFamily, float fontSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)](#addGlyphs-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-) | Menambahkan glyph baru ke daftar anak canvas ini. |
| [addPath(XpsPathGeometry data)](#addPath-com.aspose.xps.XpsPathGeometry-) | Menambahkan sebuah path baru ke daftar anak canvas ini. |
| [deepClone()](#deepClone--) | Mengkloning canvas ini. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [get(int i)](#get-int-) | Menyediakan akses ke anak elemen berdasarkan indeks i. |
| [getClass()](#getClass--) |  |
| [getClip()](#getClip--) | Mengembalikan geometri jalur yang membatasi wilayah yang dirender dari elemen. |
| [getEdgeMode()](#getEdgeMode--) | Mengembalikan nilai yang mengontrol bagaimana tepi path dalam canvas dirender. |
| [getHyperlinkTarget()](#getHyperlinkTarget--) | Mengembalikan objek target hyperlink. |
| [getOpacity()](#getOpacity--) | Mengembalikan nilai yang menentukan transparansi seragam elemen. |
| [getOpacityMask()](#getOpacityMask--) | Mengembalikan kuas yang menentukan masker nilai alfa yang diterapkan pada elemen dengan cara yang sama seperti atribut Opacity, tetapi memungkinkan nilai alfa yang berbeda untuk area yang berbeda dari elemen. |
| [getRenderTransform()](#getRenderTransform--) | Mengembalikan matriks transformasi afinnya yang menetapkan kerangka koordinat baru untuk semua atribut elemen dan semua elemen anak (jika ada). |
| [hashCode()](#hashCode--) |  |
| [insertCanvas(int index)](#insertCanvas-int-) | Menyisipkan sebuah canvas baru ke daftar anak canvas ini pada posisi indeks. |
| [insertGlyphs(int index, String fontFamily, float fontSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)](#insertGlyphs-int-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-) | Menyisipkan glyph baru ke daftar anak canvas ini pada posisi indeks. |
| [insertPath(int index, XpsPathGeometry data)](#insertPath-int-com.aspose.xps.XpsPathGeometry-) | Menyisipkan sebuah path baru ke daftar anak canvas ini pada posisi indeks. |
| [iterator()](#iterator--) | Implementasi antarmuka Iterable. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setClip(XpsPathGeometry value)](#setClip-com.aspose.xps.XpsPathGeometry-) | Mengatur geometri jalur yang membatasi wilayah yang dirender dari elemen. |
| [setEdgeMode(XpsEdgeMode value)](#setEdgeMode-com.aspose.xps.XpsEdgeMode-) | Mengatur nilai yang mengontrol bagaimana tepi path dalam canvas dirender. |
| [setHyperlinkTarget(XpsHyperlinkTarget value)](#setHyperlinkTarget-com.aspose.xps.XpsHyperlinkTarget-) | Mengatur objek target hyperlink. |
| [setOpacity(float value)](#setOpacity-float-) | Mengatur nilai yang mendefinisikan transparansi seragam elemen. |
| [setOpacityMask(XpsBrush value)](#setOpacityMask-com.aspose.xps.XpsBrush-) | Mengatur kuas yang menentukan masker nilai alfa yang diterapkan pada elemen dengan cara yang sama seperti atribut Opacity, tetapi memungkinkan nilai alfa yang berbeda untuk area yang berbeda dari elemen. |
| [setRenderTransform(XpsMatrix value)](#setRenderTransform-com.aspose.xps.XpsMatrix-) | Mengatur matriks transformasi afinnya yang menetapkan kerangka koordinat baru untuk semua atribut elemen dan untuk semua elemen anak (jika ada). |
| [size()](#size--) | Mengembalikan jumlah elemen anak. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### <T>add(T element) {#-T-add-T-}
```
public T <T>add(T element)
```


Menambahkan sebuah elemen ke daftar anak canvas ini.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| elemen | T | Elemen yang akan ditambahkan. |

**Returns:**
T - Elemen yang ditambahkan.
### <T>insert(int index, T element) {#-T-insert-int-T-}
```
public T <T>insert(int index, T element)
```


Menyisipkan sebuah elemen ke daftar anak canvas ini pada posisi indeks.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| indeks | int | Posisi di mana sebuah elemen harus disisipkan. |
| elemen | T | Elemen yang akan disisipkan. |

**Returns:**
T - Elemen yang disisipkan.
### addCanvas() {#addCanvas--}
```
public XpsCanvas addCanvas()
```


Menambahkan sebuah canvas baru ke daftar anak canvas ini.

**Returns:**
[XpsCanvas](../../com.aspose.xps/xpscanvas) - Added canvas.
### addGlyphs(String fontFamily, float fontSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString) {#addGlyphs-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-}
```
public XpsGlyphs addGlyphs(String fontFamily, float fontSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)
```


Menambahkan glyph baru ke daftar anak canvas ini.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| fontFamily | java.lang.String | Keluarga font. |
| fontSize | float | Ukuran font. |
| fontStyle | [XpsFontStyle](../../com.aspose.xps/xpsfontstyle) | Gaya font. |
| originX | float | Koordinat X asal glif. |
| originY | float | Koordinat T asal Glyphs. |
| unicodeString | java.lang.String | String yang akan dicetak. |

**Returns:**
[XpsGlyphs](../../com.aspose.xps/xpsglyphs) - Added glyphs.
### addPath(XpsPathGeometry data) {#addPath-com.aspose.xps.XpsPathGeometry-}
```
public XpsPath addPath(XpsPathGeometry data)
```


Menambahkan sebuah path baru ke daftar anak canvas ini.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| data | [XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) | Geometri jalur. |

**Returns:**
[XpsPath](../../com.aspose.xps/xpspath) - Added path.
### deepClone() {#deepClone--}
```
public XpsCanvas deepClone()
```


Mengkloning canvas ini.

**Returns:**
[XpsCanvas](../../com.aspose.xps/xpscanvas) - Clone of this canvas.
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
### getEdgeMode() {#getEdgeMode--}
```
public XpsEdgeMode getEdgeMode()
```


Mengembalikan nilai yang mengontrol bagaimana tepi path dalam canvas dirender.

**Returns:**
[XpsEdgeMode](../../com.aspose.xps/xpsedgemode) - The edge rendering mode.
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
### insertCanvas(int index) {#insertCanvas-int-}
```
public XpsCanvas insertCanvas(int index)
```


Menyisipkan sebuah canvas baru ke daftar anak canvas ini pada posisi indeks.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| indeks | int | Posisi di mana kanvas baru harus disisipkan. |

**Returns:**
[XpsCanvas](../../com.aspose.xps/xpscanvas) - Inserted canvas.
### insertGlyphs(int index, String fontFamily, float fontSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString) {#insertGlyphs-int-java.lang.String-float-com.aspose.xps.XpsFontStyle-float-float-java.lang.String-}
```
public XpsGlyphs insertGlyphs(int index, String fontFamily, float fontSize, XpsFontStyle fontStyle, float originX, float originY, String unicodeString)
```


Menyisipkan glyph baru ke daftar anak canvas ini pada posisi indeks.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| indeks | int | Posisi di mana glyph baru harus disisipkan. |
| fontFamily | java.lang.String | Keluarga font. |
| fontSize | float | Ukuran font. |
| fontStyle | [XpsFontStyle](../../com.aspose.xps/xpsfontstyle) | Gaya font. |
| originX | float | Koordinat X asal glif. |
| originY | float | Koordinat T asal Glyphs. |
| unicodeString | java.lang.String | String yang akan dicetak. |

**Returns:**
[XpsGlyphs](../../com.aspose.xps/xpsglyphs) - Added glyphs.
### insertPath(int index, XpsPathGeometry data) {#insertPath-int-com.aspose.xps.XpsPathGeometry-}
```
public XpsPath insertPath(int index, XpsPathGeometry data)
```


Menyisipkan sebuah path baru ke daftar anak canvas ini pada posisi indeks.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| indeks | int | Posisi di mana jalur baru harus disisipkan. |
| data | [XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) | Geometri jalur. |

**Returns:**
[XpsPath](../../com.aspose.xps/xpspath) - Inserted path.
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

### setEdgeMode(XpsEdgeMode value) {#setEdgeMode-com.aspose.xps.XpsEdgeMode-}
```
public void setEdgeMode(XpsEdgeMode value)
```


Mengatur nilai yang mengontrol bagaimana tepi path dalam canvas dirender.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| value | [XpsEdgeMode](../../com.aspose.xps/xpsedgemode) | Mode rendering tepi. |

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

