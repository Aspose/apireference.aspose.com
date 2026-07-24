---
title: "TextRenderingHint"
second_title: "Aspose.Page for Java Referensi API"
description: "Menentukan kualitas rendering teks."
type: docs
weight: 25
url: /id/java/com.aspose.xps.rendering/textrenderinghint/
---
**Inheritance:**
java.lang.Object, java.lang.Enum
```
public enum TextRenderingHint extends Enum<TextRenderingHint>
```

Menentukan kualitas rendering teks.
## Bidang

| Bidang | Deskripsi |
| --- | --- |
| [AntiAlias](#AntiAlias) | Setiap karakter digambar menggunakan bitmap glif anti-aliased tanpa hinting. |
| [AntiAliasGridFit](#AntiAliasGridFit) | Setiap karakter digambar menggunakan bitmap glif anti-aliased dengan hinting. |
| [ClearTypeGridFit](#ClearTypeGridFit) | Setiap karakter digambar menggunakan bitmap glif ClearType dengan hinting. |
| [SingleBitPerPixel](#SingleBitPerPixel) | Setiap karakter digambar menggunakan bitmap glif. |
| [SingleBitPerPixelGridFit](#SingleBitPerPixelGridFit) | Setiap karakter digambar menggunakan bitmap glif. |
| [SystemDefault](#SystemDefault) | Setiap karakter digambar menggunakan bitmap glif, dengan hint rendering default sistem. |
## Metode

| Metode | Deskripsi |
| --- | --- |
| [<T>valueOf(Class<T> arg0, String arg1)](#-T-valueOf-java.lang.Class-T--java.lang.String-) |  |
| [compareTo(E arg0)](#compareTo-E-) |  |
| [describeConstable()](#describeConstable--) |  |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getDeclaringClass()](#getDeclaringClass--) |  |
| [hashCode()](#hashCode--) |  |
| [name()](#name--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [ordinal()](#ordinal--) |  |
| [toString()](#toString--) |  |
| [valueOf(String name)](#valueOf-java.lang.String-) |  |
| [values()](#values--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### AntiAlias {#AntiAlias}
```
public static final TextRenderingHint AntiAlias
```


Setiap karakter digambar menggunakan bitmap glif anti-aliased tanpa hinting. Kualitas lebih baik karena anti-aliasing. Perbedaan lebar batang dapat terlihat karena hinting dimatikan.

### AntiAliasGridFit {#AntiAliasGridFit}
```
public static final TextRenderingHint AntiAliasGridFit
```


Setiap karakter digambar menggunakan bitmap glif anti-aliased dengan hinting. Kualitas jauh lebih baik karena anti-aliasing, tetapi dengan biaya kinerja yang lebih tinggi.

### ClearTypeGridFit {#ClearTypeGridFit}
```
public static final TextRenderingHint ClearTypeGridFit
```


Setiap karakter digambar menggunakan bitmap glif ClearType dengan hinting. Pengaturan kualitas tertinggi. Digunakan untuk memanfaatkan fitur font ClearType.

### SingleBitPerPixel {#SingleBitPerPixel}
```
public static final TextRenderingHint SingleBitPerPixel
```


Setiap karakter digambar menggunakan bitmap glif. Hinting tidak digunakan.

### SingleBitPerPixelGridFit {#SingleBitPerPixelGridFit}
```
public static final TextRenderingHint SingleBitPerPixelGridFit
```


Setiap karakter digambar menggunakan bitmap glif. Hinting digunakan untuk meningkatkan tampilan karakter pada batang dan kelengkungan.

### SystemDefault {#SystemDefault}
```
public static final TextRenderingHint SystemDefault
```


Setiap karakter digambar menggunakan bitmap glif, dengan hint rendering default sistem. Teks akan digambar menggunakan pengaturan penyamaran font apa pun yang dipilih pengguna untuk sistem.

### <T>valueOf(Class<T> arg0, String arg1) {#-T-valueOf-java.lang.Class-T--java.lang.String-}
```
public static T <T>valueOf(Class<T> arg0, String arg1)
```




**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| arg0 | java.lang.Class<T> |  |
| arg1 | java.lang.String |  |

**Returns:**
T
### compareTo(E arg0) {#compareTo-E-}
```
public final int compareTo(E arg0)
```




**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| arg0 | E |  |

**Returns:**
int
### describeConstable() {#describeConstable--}
```
public final Optional<Enum.EnumDesc<E>> describeConstable()
```




**Returns:**
java.util.Optional<java.lang.Enum.EnumDesc<E>>
### equals(Object arg0) {#equals-java.lang.Object-}
```
public final boolean equals(Object arg0)
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
### getDeclaringClass() {#getDeclaringClass--}
```
public final Class<E> getDeclaringClass()
```




**Returns:**
java.lang.Class<E>
### hashCode() {#hashCode--}
```
public final int hashCode()
```




**Returns:**
int
### name() {#name--}
```
public final String name()
```




**Returns:**
java.lang.String
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### ordinal() {#ordinal--}
```
public final int ordinal()
```




**Returns:**
int
### toString() {#toString--}
```
public String toString()
```




**Returns:**
java.lang.String
### valueOf(String name) {#valueOf-java.lang.String-}
```
public static TextRenderingHint valueOf(String name)
```




**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| nama | java.lang.String |  |

**Returns:**
[TextRenderingHint](../../com.aspose.xps.rendering/textrenderinghint)
### values() {#values--}
```
public static TextRenderingHint[] values()
```




**Returns:**
com.aspose.xps.rendering.TextRenderingHint[]
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

