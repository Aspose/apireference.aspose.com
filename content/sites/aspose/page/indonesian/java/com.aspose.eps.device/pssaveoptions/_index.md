---
title: "PsSaveOptions"
second_title: "Aspose.Page for Java Referensi API"
description: "Kelas ini berisi opsi yang diperlukan untuk mengelola proses konversi."
type: docs
weight: 12
url: /id/java/com.aspose.eps.device/pssaveoptions/
---
**Inheritance:**
java.lang.Object, [com.aspose.page.SaveOptions](../../com.aspose.page/saveoptions)
```
public class PsSaveOptions extends SaveOptions
```

Kelas ini berisi opsi yang diperlukan untuk mengelola proses konversi.
## Konstruktor

| Konstruktor | Deskripsi |
| --- | --- |
| [PsSaveOptions()](#PsSaveOptions--) | Inisialisasi instance baru dari kelas  PdfSaveOptions  dengan nilai default untuk flag  suppressErrors  (true) dan  debug  (false). |
| [PsSaveOptions(boolean supressErrors)](#PsSaveOptions-boolean-) | Inisialisasi instance baru dari kelas  PdfSaveOptions  dengan nilai default untuk flag  debug  (false). |
## Metode

| Metode | Deskripsi |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getAdditionalFontsFolders()](#getAdditionalFontsFolders--) | Mengembalikan folder font tambahan di mana konverter harus menemukan font untuk dokumen masukan. |
| [getBackgroundColor()](#getBackgroundColor--) |  |
| [getClass()](#getClass--) |  |
| [getConvertFontsToTTF()](#getConvertFontsToTTF--) | Mendapatkan flag yang menunjukkan apakah perlu menyimpan font non-TrueType ke TTF. |
| [getEmbedFontsAs()](#getEmbedFontsAs--) |  |
| [getExceptions()](#getExceptions--) | Mengembalikan daftar kesalahan non-kritis. |
| [getJpegQualityLevel()](#getJpegQualityLevel--) | Mengembalikan nilai yang menentukan tingkat kompresi untuk sebuah gambar. |
| [getMargins()](#getMargins--) |  |
| [getPageSize()](#getPageSize--) |  |
| [getSaveFormat()](#getSaveFormat--) |  |
| [getSize()](#getSize--) | Mendapatkan ukuran halaman atau gambar. |
| [hashCode()](#hashCode--) |  |
| [isDebug()](#isDebug--) | Mendapatkan flag yang memungkinkan keluaran peringatan dan pesan selama konversi. |
| [isEmbedFonts()](#isEmbedFonts--) | Menunjukkan apakah akan menyematkan font yang digunakan dalam dokumen PS |
| [isSupressErrors()](#isSupressErrors--) | Mengembalikan nilai yang menunjukkan apakah kesalahan akan ditekan selama konversi. |
| [isTransparent()](#isTransparent--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setAdditionalFontsFolders(String[] fontsFolders)](#setAdditionalFontsFolders-java.lang.String---) | Menentukan folder font tambahan di mana konverter harus menemukan font untuk dokumen masukan. |
| [setBackgroundColor(Color backgroundColor)](#setBackgroundColor-java.awt.Color-) |  |
| [setConvertFontsToTTF(boolean value)](#setConvertFontsToTTF-boolean-) | Menentukan apakah menyimpan font non-TrueType ke TTF. |
| [setDebug(boolean debug)](#setDebug-boolean-) | Menentukan flag yang memungkinkan keluaran peringatan dan pesan selama konversi. |
| [setEmbedFonts(boolean embedFonts)](#setEmbedFonts-boolean-) | Menentukan apakah akan menyematkan font yang digunakan dalam dokumen PS |
| [setEmbedFontsAs(String embedFontsAs)](#setEmbedFontsAs-java.lang.String-) | Tentukan jenis font untuk menyematkan font dalam dokumen PS |
| [setJpegQualityLevel(int value)](#setJpegQualityLevel-int-) | Mengatur nilai yang menentukan tingkat kompresi untuk sebuah gambar. |
| [setMargins(Insets margins)](#setMargins-java.awt.Insets-) |  |
| [setPageSize(Dimension pageSize)](#setPageSize-java.awt.Dimension-) |  |
| [setSaveFormat(PsSaveFormat saveFormat)](#setSaveFormat-com.aspose.eps.device.PsSaveFormat-) | Tentukan format penyimpanan file hasil |
| [setSize(Dimension size)](#setSize-java.awt.Dimension-) | Menentukan ukuran halaman atau gambar. |
| [setSupressErrors(boolean supressErrors)](#setSupressErrors-boolean-) | Menentukan flag yang menunjukkan apakah kesalahan akan ditekan selama konversi. |
| [setTransparent(boolean transparent)](#setTransparent-boolean-) |  |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### PsSaveOptions() {#PsSaveOptions--}
```
public PsSaveOptions()
```


Inisialisasi instance baru dari kelas  PdfSaveOptions  dengan nilai default untuk flag  suppressErrors  (true) dan  debug  (false).

### PsSaveOptions(boolean supressErrors) {#PsSaveOptions-boolean-}
```
public PsSaveOptions(boolean supressErrors)
```


Inisialisasi instance baru dari kelas  PdfSaveOptions  dengan nilai default untuk flag  debug  (false).

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| supressErrors | boolean | Jika true, konversi akan dilanjutkan meskipun ada kesalahan non-kritis. |

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
### getAdditionalFontsFolders() {#getAdditionalFontsFolders--}
```
public String[] getAdditionalFontsFolders()
```


Mengembalikan folder font tambahan tempat konverter harus menemukan font untuk dokumen input. Folder default adalah folder font standar tempat OS menemukan font untuk kebutuhan internal.

**Returns:**
java.lang.String[] - Sebuah array folder font.
### getBackgroundColor() {#getBackgroundColor--}
```
public Color getBackgroundColor()
```




**Returns:**
java.awt.Color - warna latar belakang
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getConvertFontsToTTF() {#getConvertFontsToTTF--}
```
public boolean getConvertFontsToTTF()
```


Mendapatkan flag yang menunjukkan apakah perlu menyimpan font non-TrueType ke TTF.

**Returns:**
boolean - Nilai flag.
### getEmbedFontsAs() {#getEmbedFontsAs--}
```
public String getEmbedFontsAs()
```




**Returns:**
java.lang.String - jenis font untuk menyematkan font dalam dokumen PS
### getExceptions() {#getExceptions--}
```
public List<Exception> getExceptions()
```


Mengembalikan daftar kesalahan non-kritis.

**Returns:**
java.util.List<java.lang.Exception> - Daftar pengecualian
### getJpegQualityLevel() {#getJpegQualityLevel--}
```
public int getJpegQualityLevel()
```


Mengembalikan nilai yang menentukan tingkat kompresi untuk sebuah gambar. Nilai yang tersedia adalah 0 hingga 100. Semakin rendah angka yang ditentukan, semakin tinggi kompresi dan oleh karena itu kualitas gambar semakin rendah. Nilai 0 menghasilkan gambar dengan kualitas terendah, sementara 100 menghasilkan kualitas tertinggi.

**Returns:**
int - Nilai yang menentukan tingkat kompresi untuk sebuah gambar.
### getMargins() {#getMargins--}
```
public Insets getMargins()
```




**Returns:**
java.awt.Insets - margin halaman
### getPageSize() {#getPageSize--}
```
public Dimension getPageSize()
```




**Returns:**
java.awt.Dimension - ukuran halaman
### getSaveFormat() {#getSaveFormat--}
```
public PsSaveFormat getSaveFormat()
```




**Returns:**
[PsSaveFormat](../../com.aspose.eps.device/pssaveformat) - save format of resulting file
### getSize() {#getSize--}
```
public Dimension getSize()
```


Mendapatkan ukuran halaman atau gambar.

**Returns:**
java.awt.Dimension - Ukuran halaman atau gambar.
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### isDebug() {#isDebug--}
```
public boolean isDebug()
```


Mendapatkan flag yang memungkinkan keluaran peringatan dan pesan selama konversi.

**Returns:**
boolean - nilai debug.
### isEmbedFonts() {#isEmbedFonts--}
```
public boolean isEmbedFonts()
```


Menunjukkan apakah akan menyematkan font yang digunakan dalam dokumen PS

**Returns:**
boolean - nilai flag embedFonts
### isSupressErrors() {#isSupressErrors--}
```
public boolean isSupressErrors()
```


Mengembalikan nilai yang menunjukkan apakah kesalahan akan ditekan selama konversi.

**Returns:**
boolean - nilai boolean
### isTransparent() {#isTransparent--}
```
public boolean isTransparent()
```




**Returns:**
boolean - Menunjukkan apakah latar belakang transparan
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### setAdditionalFontsFolders(String[] fontsFolders) {#setAdditionalFontsFolders-java.lang.String---}
```
public void setAdditionalFontsFolders(String[] fontsFolders)
```


Menentukan folder font tambahan tempat konverter harus menemukan font untuk dokumen input. Folder default adalah folder font standar tempat OS menemukan font untuk kebutuhan internal.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| fontsFolders | java.lang.String[] | Sebuah array folder font. |

### setBackgroundColor(Color backgroundColor) {#setBackgroundColor-java.awt.Color-}
```
public void setBackgroundColor(Color backgroundColor)
```




**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| backgroundColor | java.awt.Color | Menentukan warna latar belakang |

### setConvertFontsToTTF(boolean value) {#setConvertFontsToTTF-boolean-}
```
public void setConvertFontsToTTF(boolean value)
```


Menentukan apakah akan menyimpan font non-TrueType ke TTF. Hal ini secara signifikan mengurangi volume dokumen yang dihasilkan dalam konversi PS ke PDF dan meningkatkan kecepatan konversi file PS dengan jumlah teks yang besar dalam font non-TrueType ke format output apa pun. Namun terdapat sedikit pergeseran vertikal teks saat mengonversi file PostSctipt ke gambar.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| nilai | boolean | Nilai flag. |

### setDebug(boolean debug) {#setDebug-boolean-}
```
public void setDebug(boolean debug)
```


Menentukan flag yang memungkinkan keluaran peringatan dan pesan selama konversi.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| debug | boolean | Nilai Boolean. |

### setEmbedFonts(boolean embedFonts) {#setEmbedFonts-boolean-}
```
public void setEmbedFonts(boolean embedFonts)
```


Menentukan apakah akan menyematkan font yang digunakan dalam dokumen PS

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| embedFonts | boolean | flag embedFonts |

### setEmbedFontsAs(String embedFontsAs) {#setEmbedFontsAs-java.lang.String-}
```
public void setEmbedFontsAs(String embedFontsAs)
```


Tentukan jenis font untuk menyematkan font dalam dokumen PS

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| embedFontsAs | java.lang.String | Jenis font |

### setJpegQualityLevel(int value) {#setJpegQualityLevel-int-}
```
public void setJpegQualityLevel(int value)
```


Mengatur nilai yang menentukan tingkat kompresi untuk sebuah gambar. Nilai yang tersedia adalah 0 hingga 100. Semakin rendah angka yang ditentukan, semakin tinggi kompresi dan oleh karena itu kualitas gambar semakin rendah. Nilai 0 menghasilkan gambar dengan kualitas terendah, sementara 100 menghasilkan kualitas tertinggi.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| nilai | int | Nilai yang menentukan tingkat kompresi untuk sebuah gambar. |

### setMargins(Insets margins) {#setMargins-java.awt.Insets-}
```
public void setMargins(Insets margins)
```




**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| margin | java.awt.Insets | Menentukan margin halaman |

### setPageSize(Dimension pageSize) {#setPageSize-java.awt.Dimension-}
```
public void setPageSize(Dimension pageSize)
```




**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| pageSize | java.awt.Dimension | Menentukan ukuran halaman |

### setSaveFormat(PsSaveFormat saveFormat) {#setSaveFormat-com.aspose.eps.device.PsSaveFormat-}
```
public void setSaveFormat(PsSaveFormat saveFormat)
```


Tentukan format penyimpanan file hasil

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| saveFormat | [PsSaveFormat](../../com.aspose.eps.device/pssaveformat) | Format file hasil |

### setSize(Dimension size) {#setSize-java.awt.Dimension-}
```
public void setSize(Dimension size)
```


Menentukan ukuran halaman atau gambar.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| ukuran | java.awt.Dimension | Ukuran halaman atau gambar. |

### setSupressErrors(boolean supressErrors) {#setSupressErrors-boolean-}
```
public void setSupressErrors(boolean supressErrors)
```


Menentukan flag yang menunjukkan apakah kesalahan akan ditekan selama konversi.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| supressErrors | boolean | Nilai Boolean. |

### setTransparent(boolean transparent) {#setTransparent-boolean-}
```
public void setTransparent(boolean transparent)
```




**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| transparan | boolean | Menentukan apakah latar belakang transparan |

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

