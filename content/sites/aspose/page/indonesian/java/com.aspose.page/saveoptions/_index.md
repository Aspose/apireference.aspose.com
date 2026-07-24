---
title: "SaveOptions"
second_title: "Aspose.Page for Java Referensi API"
description: "Kelas ini berisi opsi yang diperlukan untuk mengelola proses konversi."
type: docs
weight: 16
url: /id/java/com.aspose.page/saveoptions/
---
**Inheritance:**
java.lang.Object
```
public class SaveOptions
```

Kelas ini berisi opsi yang diperlukan untuk mengelola proses konversi.
## Konstruktor

| Konstruktor | Deskripsi |
| --- | --- |
| [SaveOptions()](#SaveOptions--) | Inisialisasi instance SaveOptions baru dengan nilai default untuk flag  suppressErrors  (true) dan  debug  (false). |
| [SaveOptions(boolean supressErrors)](#SaveOptions-boolean-) | Inisialisasi instance SaveOptions baru dengan nilai default untuk flag  debug  (false). |
| [SaveOptions(Dimension size)](#SaveOptions-java.awt.Dimension-) | Menginisialisasi instance baru dari  SaveOptions  dengan ukuran yang ditentukan. |
| [SaveOptions(boolean supressErrors, Dimension size)](#SaveOptions-boolean-java.awt.Dimension-) | Inisialisasi instance SaveOptions baru dengan nilai default untuk flag  debug  (false) dan dengan ukuran yang ditentukan. |
## Metode

| Metode | Deskripsi |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getAdditionalFontsFolders()](#getAdditionalFontsFolders--) | Mengembalikan folder font tambahan di mana konverter harus menemukan font untuk dokumen masukan. |
| [getClass()](#getClass--) |  |
| [getConvertFontsToTTF()](#getConvertFontsToTTF--) | Mendapatkan flag yang menunjukkan apakah perlu menyimpan font non-TrueType ke TTF. |
| [getExceptions()](#getExceptions--) | Mengembalikan daftar kesalahan non-kritis. |
| [getJpegQualityLevel()](#getJpegQualityLevel--) | Mengembalikan nilai yang menentukan tingkat kompresi untuk sebuah gambar. |
| [getSize()](#getSize--) | Mendapatkan ukuran halaman atau gambar. |
| [hashCode()](#hashCode--) |  |
| [isDebug()](#isDebug--) | Mendapatkan flag yang memungkinkan keluaran peringatan dan pesan selama konversi. |
| [isSupressErrors()](#isSupressErrors--) | Mengembalikan nilai yang menunjukkan apakah kesalahan akan ditekan selama konversi. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setAdditionalFontsFolders(String[] fontsFolders)](#setAdditionalFontsFolders-java.lang.String---) | Menentukan folder font tambahan di mana konverter harus menemukan font untuk dokumen masukan. |
| [setConvertFontsToTTF(boolean value)](#setConvertFontsToTTF-boolean-) | Menentukan apakah menyimpan font non-TrueType ke TTF. |
| [setDebug(boolean debug)](#setDebug-boolean-) | Menentukan flag yang memungkinkan keluaran peringatan dan pesan selama konversi. |
| [setJpegQualityLevel(int value)](#setJpegQualityLevel-int-) | Mengatur nilai yang menentukan tingkat kompresi untuk sebuah gambar. |
| [setSize(Dimension size)](#setSize-java.awt.Dimension-) | Menentukan ukuran halaman atau gambar. |
| [setSupressErrors(boolean supressErrors)](#setSupressErrors-boolean-) | Menentukan flag yang menunjukkan apakah kesalahan akan ditekan selama konversi. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### SaveOptions() {#SaveOptions--}
```
public SaveOptions()
```


Inisialisasi instance SaveOptions baru dengan nilai default untuk flag  suppressErrors  (true) dan  debug  (false).

### SaveOptions(boolean supressErrors) {#SaveOptions-boolean-}
```
public SaveOptions(boolean supressErrors)
```


Inisialisasi instance SaveOptions baru dengan nilai default untuk flag  debug  (false).

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| supressErrors | boolean | Jika true, konversi akan dilanjutkan meskipun ada kesalahan non-kritis. |

### SaveOptions(Dimension size) {#SaveOptions-java.awt.Dimension-}
```
public SaveOptions(Dimension size)
```


Menginisialisasi instance baru dari  SaveOptions  dengan ukuran yang ditentukan.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| ukuran | java.awt.Dimension | Ukuran. |

### SaveOptions(boolean supressErrors, Dimension size) {#SaveOptions-boolean-java.awt.Dimension-}
```
public SaveOptions(boolean supressErrors, Dimension size)
```


Inisialisasi instance SaveOptions baru dengan nilai default untuk flag  debug  (false) dan dengan ukuran yang ditentukan.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| supressErrors | boolean | Jika true, konversi akan dilanjutkan meskipun ada kesalahan non-kritis. |
| ukuran | java.awt.Dimension | Ukuran. |

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
### isSupressErrors() {#isSupressErrors--}
```
public boolean isSupressErrors()
```


Mengembalikan nilai yang menunjukkan apakah kesalahan akan ditekan selama konversi.

**Returns:**
boolean - nilai boolean
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

### setJpegQualityLevel(int value) {#setJpegQualityLevel-int-}
```
public void setJpegQualityLevel(int value)
```


Mengatur nilai yang menentukan tingkat kompresi untuk sebuah gambar. Nilai yang tersedia adalah 0 hingga 100. Semakin rendah angka yang ditentukan, semakin tinggi kompresi dan oleh karena itu kualitas gambar semakin rendah. Nilai 0 menghasilkan gambar dengan kualitas terendah, sementara 100 menghasilkan kualitas tertinggi.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| nilai | int | Nilai yang menentukan tingkat kompresi untuk sebuah gambar. |

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

