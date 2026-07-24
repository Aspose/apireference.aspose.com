---
title: "XpsGlyphs"
second_title: "Aspose.Page for Java Referensi API"
description: "Kelas yang mengenkapsulasi fitur elemen Glyphs."
type: docs
weight: 25
url: /id/java/com.aspose.xps/xpsglyphs/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject), [com.aspose.xps.XpsElement](../../com.aspose.xps/xpselement), [com.aspose.xps.XpsHyperlinkElement](../../com.aspose.xps/xpshyperlinkelement), [com.aspose.xps.XpsContentElement](../../com.aspose.xps/xpscontentelement)
```
public final class XpsGlyphs extends XpsContentElement
```

Kelas yang mengenkapsulasi fitur elemen Glyphs. Elemen ini mewakili rangkaian teks yang diformat secara seragam dari satu font. Ia menyediakan informasi yang diperlukan untuk rendering yang akurat dan mendukung fitur pencarian serta pemilihan pada konsumen tampilan.
## Metode

| Metode | Deskripsi |
| --- | --- |
| [deepClone()](#deepClone--) | Klon glyphs ini. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [get(int i)](#get-int-) | Menyediakan akses ke anak elemen berdasarkan indeks i. |
| [getBidiLevel()](#getBidiLevel--) | Mengembalikan nilai yang menentukan tingkat nesting bidirectional algoritma Unicode. |
| [getClass()](#getClass--) |  |
| [getClip()](#getClip--) | Mengembalikan geometri jalur yang membatasi wilayah yang dirender dari elemen. |
| [getFill()](#getFill--) | Mengembalikan kuas yang digunakan untuk mengisi bentuk glyphs yang dirender. |
| [getFont()](#getFont--) | Mengembalikan sumber daya font untuk font TrueType yang digunakan untuk menata teks elemen. |
| [getFontRenderingEmSize()](#getFontRenderingEmSize--) | Mengembalikan ukuran font dalam satuan permukaan gambar, dinyatakan sebagai float dalam satuan ruang koordinat efektif. |
| [getHyperlinkTarget()](#getHyperlinkTarget--) | Mengembalikan objek target hyperlink. |
| [getOpacity()](#getOpacity--) | Mengembalikan nilai yang menentukan transparansi seragam elemen. |
| [getOpacityMask()](#getOpacityMask--) | Mengembalikan kuas yang menentukan masker nilai alfa yang diterapkan pada elemen dengan cara yang sama seperti atribut Opacity, tetapi memungkinkan nilai alfa yang berbeda untuk area yang berbeda dari elemen. |
| [getOriginX()](#getOriginX--) | Mengembalikan koordinat x dari glyph pertama dalam rangkaian, dalam satuan ruang koordinat efektif. |
| [getOriginY()](#getOriginY--) | Mengembalikan koordinat y dari glyph pertama dalam rangkaian, dalam satuan ruang koordinat efektif. |
| [getRenderTransform()](#getRenderTransform--) | Mengembalikan matriks transformasi afinnya yang menetapkan kerangka koordinat baru untuk semua atribut elemen dan semua elemen anak (jika ada). |
| [getStyleSimulations()](#getStyleSimulations--) | Mengembalikan nilai yang menentukan simulasi gaya. |
| [getUnicodeString()](#getUnicodeString--) | Mengembalikan string teks yang dirender oleh elemen Glyphs. |
| [hashCode()](#hashCode--) |  |
| [isSideways()](#isSideways--) | Mengembalikan nilai yang menunjukkan bahwa sebuah glyph diputar ke samping, dengan asal yang didefinisikan sebagai tengah atas glyph yang tidak diputar. |
| [iterator()](#iterator--) | Implementasi antarmuka Iterable. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setBidiLevel(int value)](#setBidiLevel-int-) | Mengatur nilai yang menentukan tingkat nesting bidirectional algoritma Unicode. |
| [setClip(XpsPathGeometry value)](#setClip-com.aspose.xps.XpsPathGeometry-) | Mengatur geometri jalur yang membatasi wilayah yang dirender dari elemen. |
| [setFill(XpsBrush value)](#setFill-com.aspose.xps.XpsBrush-) | Mengatur kuas yang digunakan untuk mengisi bentuk glyphs yang dirender. |
| [setFontRenderingEmSize(float value)](#setFontRenderingEmSize-float-) | Mengatur ukuran font dalam satuan permukaan gambar, dinyatakan sebagai float dalam satuan ruang koordinat efektif. |
| [setHyperlinkTarget(XpsHyperlinkTarget value)](#setHyperlinkTarget-com.aspose.xps.XpsHyperlinkTarget-) | Mengatur objek target hyperlink. |
| [setOpacity(float value)](#setOpacity-float-) | Mengatur nilai yang mendefinisikan transparansi seragam elemen. |
| [setOpacityMask(XpsBrush value)](#setOpacityMask-com.aspose.xps.XpsBrush-) | Mengatur kuas yang menentukan masker nilai alfa yang diterapkan pada elemen dengan cara yang sama seperti atribut Opacity, tetapi memungkinkan nilai alfa yang berbeda untuk area yang berbeda dari elemen. |
| [setOriginX(float value)](#setOriginX-float-) | Mengatur koordinat x dari glyph pertama dalam rangkaian, dalam satuan ruang koordinat efektif. |
| [setOriginY(float value)](#setOriginY-float-) | Mengatur koordinat y dari glyph pertama dalam rangkaian, dalam satuan ruang koordinat efektif. |
| [setRenderTransform(XpsMatrix value)](#setRenderTransform-com.aspose.xps.XpsMatrix-) | Mengatur matriks transformasi afinnya yang menetapkan kerangka koordinat baru untuk semua atribut elemen dan untuk semua elemen anak (jika ada). |
| [setSideways(boolean value)](#setSideways-boolean-) | Mengatur nilai yang menunjukkan bahwa sebuah glyph diputar ke samping, dengan asal yang didefinisikan sebagai tengah atas glyph yang tidak diputar. |
| [setStyleSimulations(XpsStyleSimulations value)](#setStyleSimulations-com.aspose.xps.XpsStyleSimulations-) | Mengatur nilai yang menentukan simulasi gaya. |
| [setUnicodeString(String value)](#setUnicodeString-java.lang.String-) | Mengatur string teks yang dirender oleh elemen Glyphs. |
| [size()](#size--) | Mengembalikan jumlah elemen anak. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### deepClone() {#deepClone--}
```
public XpsGlyphs deepClone()
```


Klon glyphs ini.

**Returns:**
[XpsGlyphs](../../com.aspose.xps/xpsglyphs) - Clone of this glyphs.
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
### getBidiLevel() {#getBidiLevel--}
```
public int getBidiLevel()
```


Mengembalikan nilai yang menentukan tingkat nesting bidirectional algoritma Unicode. Nilai genap menunjukkan tata letak kiri-ke-kanan, nilai ganjil menunjukkan tata letak kanan-ke-kiri. Tata letak kanan-ke-kiri menempatkan asal rangkaian di sisi kanan glyph pertama, dengan lebar maju positif (mewakili pergerakan ke kiri) menempatkan glyph berikutnya di sebelah kiri glyph sebelumnya.

**Returns:**
int - Nilai yang menentukan tingkat nesting bidirectional algoritma Unicode.
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
### getFill() {#getFill--}
```
public XpsBrush getFill()
```


Mengembalikan kuas yang digunakan untuk mengisi bentuk glyphs yang dirender.

**Returns:**
[XpsBrush](../../com.aspose.xps/xpsbrush) - The brush used to fill the shape of the rendered glyphs.
### getFont() {#getFont--}
```
public XpsFont getFont()
```


Mengembalikan sumber daya font untuk font TrueType yang digunakan untuk menata teks elemen.

**Returns:**
[XpsFont](../../com.aspose.xps/xpsfont) - The font resource for the TrueType font used to typeset elements text.
### getFontRenderingEmSize() {#getFontRenderingEmSize--}
```
public float getFontRenderingEmSize()
```


Mengembalikan ukuran font dalam satuan permukaan gambar, dinyatakan sebagai float dalam satuan ruang koordinat efektif.

**Returns:**
float - Ukuran font.
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
### getOriginX() {#getOriginX--}
```
public float getOriginX()
```


Mengembalikan koordinat x dari glyph pertama dalam rangkaian, dalam satuan ruang koordinat efektif.

**Returns:**
float - Koordinat x dari glif pertama dalam urutan, dalam satuan ruang koordinat yang efektif.
### getOriginY() {#getOriginY--}
```
public float getOriginY()
```


Mengembalikan koordinat y dari glyph pertama dalam rangkaian, dalam satuan ruang koordinat efektif.

**Returns:**
float - Koordinat y dari glif pertama dalam urutan, dalam satuan ruang koordinat yang efektif.
### getRenderTransform() {#getRenderTransform--}
```
public XpsMatrix getRenderTransform()
```


Mengembalikan matriks transformasi afinnya yang menetapkan kerangka koordinat baru untuk semua atribut elemen dan semua elemen anak (jika ada).

**Returns:**
[XpsMatrix](../../com.aspose.xps/xpsmatrix) - The affine transformation matrix.
### getStyleSimulations() {#getStyleSimulations--}
```
public XpsStyleSimulations getStyleSimulations()
```


Mengembalikan nilai yang menentukan simulasi gaya.

**Returns:**
[XpsStyleSimulations](../../com.aspose.xps/xpsstylesimulations) - The value specifying a style simulation.
### getUnicodeString() {#getUnicodeString--}
```
public String getUnicodeString()
```


Mengembalikan string teks yang dirender oleh elemen Glyphs. Teks ditentukan sebagai titik kode Unicode.

**Returns:**
java.lang.String - String teks yang dirender oleh elemen Glyphs.
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### isSideways() {#isSideways--}
```
public boolean isSideways()
```


Mengembalikan nilai yang menunjukkan bahwa sebuah glyph diputar ke samping, dengan asal yang didefinisikan sebagai tengah atas glyph yang tidak diputar.

**Returns:**
boolean - Nilai yang menunjukkan bahwa sebuah glif diputar ke samping.
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




### setBidiLevel(int value) {#setBidiLevel-int-}
```
public void setBidiLevel(int value)
```


Menetapkan nilai yang menentukan tingkat penelusuran bersarang algoritma Unicode bidirectional. Nilai genap menunjukkan tata letak kiri-ke-kanan, nilai ganjil menunjukkan tata letak kanan-ke-kiri. Tata letak kanan-ke-kiri menempatkan asal urutan di sisi kanan glif pertama, dengan lebar maju positif (mewakili pergerakan ke kiri) menempatkan glif berikutnya ke kiri glif sebelumnya.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| nilai | int | Nilai yang menentukan tingkat penelusuran bersarang algoritma Unicode bidirectional. |

### setClip(XpsPathGeometry value) {#setClip-com.aspose.xps.XpsPathGeometry-}
```
public void setClip(XpsPathGeometry value)
```


Mengatur geometri jalur yang membatasi wilayah yang dirender dari elemen.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| value | [XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) | Geometri jalur yang membatasi wilayah yang dirender dari elemen. |

### setFill(XpsBrush value) {#setFill-com.aspose.xps.XpsBrush-}
```
public void setFill(XpsBrush value)
```


Mengatur kuas yang digunakan untuk mengisi bentuk glyphs yang dirender.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| value | [XpsBrush](../../com.aspose.xps/xpsbrush) | Kuas yang digunakan untuk mengisi bentuk glif yang dirender. |

### setFontRenderingEmSize(float value) {#setFontRenderingEmSize-float-}
```
public void setFontRenderingEmSize(float value)
```


Mengatur ukuran font dalam satuan permukaan gambar, dinyatakan sebagai float dalam satuan ruang koordinat efektif.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| nilai | float | Ukuran font. |

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

### setOriginX(float value) {#setOriginX-float-}
```
public void setOriginX(float value)
```


Mengatur koordinat x dari glyph pertama dalam rangkaian, dalam satuan ruang koordinat efektif.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| nilai | float | Koordinat x dari glif pertama dalam urutan, dalam satuan ruang koordinat yang efektif. |

### setOriginY(float value) {#setOriginY-float-}
```
public void setOriginY(float value)
```


Mengatur koordinat y dari glyph pertama dalam rangkaian, dalam satuan ruang koordinat efektif.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| nilai | float | Koordinat y dari glif pertama dalam urutan, dalam satuan ruang koordinat yang efektif. |

### setRenderTransform(XpsMatrix value) {#setRenderTransform-com.aspose.xps.XpsMatrix-}
```
public void setRenderTransform(XpsMatrix value)
```


Mengatur matriks transformasi afinnya yang menetapkan kerangka koordinat baru untuk semua atribut elemen dan untuk semua elemen anak (jika ada).

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| value | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | Matriks transformasi afinnya. |

### setSideways(boolean value) {#setSideways-boolean-}
```
public void setSideways(boolean value)
```


Mengatur nilai yang menunjukkan bahwa sebuah glyph diputar ke samping, dengan asal yang didefinisikan sebagai tengah atas glyph yang tidak diputar.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| nilai | boolean | Nilai yang menunjukkan bahwa sebuah glif diputar ke samping. |

### setStyleSimulations(XpsStyleSimulations value) {#setStyleSimulations-com.aspose.xps.XpsStyleSimulations-}
```
public void setStyleSimulations(XpsStyleSimulations value)
```


Mengatur nilai yang menentukan simulasi gaya.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| value | [XpsStyleSimulations](../../com.aspose.xps/xpsstylesimulations) | Nilai yang menentukan simulasi gaya. |

### setUnicodeString(String value) {#setUnicodeString-java.lang.String-}
```
public void setUnicodeString(String value)
```


Menetapkan string teks yang dirender oleh elemen Glyphs. Teks ditentukan sebagai titik kode Unicode.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| nilai | java.lang.String | String teks yang dirender oleh elemen Glyphs. |

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

