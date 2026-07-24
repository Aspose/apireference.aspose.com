---
title: "ExternalFontCache"
second_title: "Aspose.Page for Java Referensi API"
description: "Gunakan kelas ini untuk memperoleh enkapsulasi font dalam bentuk yang diterima oleh Device."
type: docs
weight: 13
url: /id/java/com.aspose.page/externalfontcache/
---
**Inheritance:**
java.lang.Object
```
public class ExternalFontCache
```

Gunakan kelas ini untuk memperoleh enkapsulasi font dalam bentuk yang diterima oleh Device.
## Konstruktor

| Konstruktor | Deskripsi |
| --- | --- |
| [ExternalFontCache()](#ExternalFontCache--) |  |
## Bidang

| Bidang | Deskripsi |
| --- | --- |
| [DEFAULT_SIZE](#DEFAULT-SIZE) | Ukuran font default. |
| [DEFAULT_STYLE](#DEFAULT-STYLE) | Gaya font default. |
## Metode

| Metode | Deskripsi |
| --- | --- |
| [FetchTrFont(String familyName)](#FetchTrFont-java.lang.String-) | Mengambil DrFont berdasarkan nama keluarga font, ukuran default (1), dan gaya default (PLAIN). |
| [FetchTrFont(String familyName, int style)](#FetchTrFont-java.lang.String-int-) | Mengambil DrFont berdasarkan nama keluarga font, ukuran default (1), dan gaya. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [fetchDrFont(String familyName, float sizePoints, int style)](#fetchDrFont-java.lang.String-float-int-) | Mengambil DrFont berdasarkan nama keluarga font, ukuran, dan gaya. |
| [fetchDrFont(String familyName, float sizePoints, int style, int fontCapitals)](#fetchDrFont-java.lang.String-float-int-int-) | Mengambil DrFont berdasarkan nama keluarga font, ukuran, gaya, dan kapitalisasi font. |
| [fetchDrFont(String familyName, float sizePoints, int style, String altFamilyName)](#fetchDrFont-java.lang.String-float-int-java.lang.String-) | Mengambil DrFont berdasarkan nama keluarga font, ukuran, gaya, dan nama keluarga font alternatif. |
| [fetchDrFont(String familyName, float sizePoints, int style, String altFamilyName, int fontCapitals)](#fetchDrFont-java.lang.String-float-int-java.lang.String-int-) | Mengambil DrFont berdasarkan nama keluarga font, ukuran, gaya, kapitalisasi font, dan nama keluarga font alternatif. |
| [fetchTTFont(String familyName, int style, String altFamilyName)](#fetchTTFont-java.lang.String-int-java.lang.String-) | Mengambil TTFont berdasarkan nama keluarga font, gaya, dan nama keluarga font alternatif. |
| [getClass()](#getClass--) |  |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setAdditionalFontsFolders(String[] additionalFontFolders)](#setAdditionalFontsFolders-java.lang.String---) | Menentukan folder font tambahan. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### ExternalFontCache() {#ExternalFontCache--}
```
public ExternalFontCache()
```


### DEFAULT_SIZE {#DEFAULT-SIZE}
```
public static final float DEFAULT_SIZE
```


Ukuran font default.

### DEFAULT_STYLE {#DEFAULT-STYLE}
```
public static final int DEFAULT_STYLE
```


Gaya font default.

### FetchTrFont(String familyName) {#FetchTrFont-java.lang.String-}
```
public DrFont FetchTrFont(String familyName)
```


Mengambil DrFont berdasarkan nama keluarga font, ukuran default (1), dan gaya default (PLAIN).

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| familyName | java.lang.String | Nama keluarga font. |

**Returns:**
com.aspose.foundation.drawing.DrFont - DrFont.
### FetchTrFont(String familyName, int style) {#FetchTrFont-java.lang.String-int-}
```
public DrFont FetchTrFont(String familyName, int style)
```


Mengambil DrFont berdasarkan nama keluarga font, ukuran default (1), dan gaya.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| familyName | java.lang.String | Nama keluarga font. |
| gaya | int | Gaya font. |

**Returns:**
com.aspose.foundation.drawing.DrFont - DrFont.
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
### fetchDrFont(String familyName, float sizePoints, int style) {#fetchDrFont-java.lang.String-float-int-}
```
public static DrFont fetchDrFont(String familyName, float sizePoints, int style)
```


Mengambil DrFont berdasarkan nama keluarga font, ukuran, dan gaya.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| familyName | java.lang.String | Nama keluarga font. |
| sizePoints | float | Ukuran font dalam poin (satu poin adalah 1/72 inci). |
| gaya | int | Gaya font. |

**Returns:**
com.aspose.foundation.drawing.DrFont - DrFont.
### fetchDrFont(String familyName, float sizePoints, int style, int fontCapitals) {#fetchDrFont-java.lang.String-float-int-int-}
```
public DrFont fetchDrFont(String familyName, float sizePoints, int style, int fontCapitals)
```


Mengambil DrFont berdasarkan nama keluarga font, ukuran, gaya, dan kapitalisasi font.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| familyName | java.lang.String | Nama keluarga font. |
| sizePoints | float | Ukuran font dalam poin (satu poin adalah 1/72 inci). |
| gaya | int | Gaya font. |
| fontCapitals | int | Huruf kapital font. |

**Returns:**
com.aspose.foundation.drawing.DrFont - DrFont.
### fetchDrFont(String familyName, float sizePoints, int style, String altFamilyName) {#fetchDrFont-java.lang.String-float-int-java.lang.String-}
```
public DrFont fetchDrFont(String familyName, float sizePoints, int style, String altFamilyName)
```


Mengambil DrFont berdasarkan nama keluarga font, ukuran, gaya, dan nama keluarga font alternatif.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| familyName | java.lang.String | Nama keluarga font. |
| sizePoints | float | Ukuran font dalam poin (satu poin adalah 1/72 inci). |
| gaya | int | Gaya font. |
| altFamilyName | java.lang.String | Nama keluarga font alternatif. |

**Returns:**
com.aspose.foundation.drawing.DrFont - DrFont.
### fetchDrFont(String familyName, float sizePoints, int style, String altFamilyName, int fontCapitals) {#fetchDrFont-java.lang.String-float-int-java.lang.String-int-}
```
public DrFont fetchDrFont(String familyName, float sizePoints, int style, String altFamilyName, int fontCapitals)
```


Mengambil DrFont berdasarkan nama keluarga font, ukuran, gaya, kapitalisasi font, dan nama keluarga font alternatif.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| familyName | java.lang.String | Nama keluarga font. |
| sizePoints | float | Ukuran font dalam poin (satu poin adalah 1/72 inci). |
| gaya | int | Gaya font. |
| altFamilyName | java.lang.String | Nama keluarga font alternatif. |
| fontCapitals | int | Huruf kapital font. |

**Returns:**
com.aspose.foundation.drawing.DrFont - DrFont.
### fetchTTFont(String familyName, int style, String altFamilyName) {#fetchTTFont-java.lang.String-int-java.lang.String-}
```
public TTFont fetchTTFont(String familyName, int style, String altFamilyName)
```


Mengambil TTFont berdasarkan nama keluarga font, gaya, dan nama keluarga font alternatif.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| familyName | java.lang.String | Nama keluarga font. |
| gaya | int | Gaya font. |
| altFamilyName | java.lang.String | Nama keluarga font alternatif. |

**Returns:**
com.aspose.foundation.truetype.TTFont - TTFont.
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




### setAdditionalFontsFolders(String[] additionalFontFolders) {#setAdditionalFontsFolders-java.lang.String---}
```
public static void setAdditionalFontsFolders(String[] additionalFontFolders)
```


Menentukan folder font tambahan. Folder font yang digunakan oleh OS secara default digunakan oleh ExternalFont Cache. Tidak perlu mendefinisikannya,

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| additionalFontFolders | java.lang.String[] | Array folder font tambahan. |

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

