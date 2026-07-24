---
title: "ImageSaveOptions"
second_title: "Aspose.Page for Java Referensi API"
description: "Kelas ini berisi opsi yang diperlukan untuk mengelola proses konversi."
type: docs
weight: 10
url: /id/java/com.aspose.eps.device/imagesaveoptions/
---
**Inheritance:**
java.lang.Object, [com.aspose.page.SaveOptions](../../com.aspose.page/saveoptions)
```
public class ImageSaveOptions extends SaveOptions
```

Kelas ini berisi opsi yang diperlukan untuk mengelola proses konversi.
## Konstruktor

| Konstruktor | Deskripsi |
| --- | --- |
| [ImageSaveOptions()](#ImageSaveOptions--) | Inisialisasi instance baru dari kelas  ImageSaveOptions  dengan nilai default untuk flag  suppressErrors  (true) dan  debug  (false). |
| [ImageSaveOptions(ImageFormat imageFormat)](#ImageSaveOptions-com.aspose.page.ImageFormat-) | Menginisialisasi instance baru dari  ImageSaveOptions  dengan format gambar yang ditentukan. |
| [ImageSaveOptions(Dimension size)](#ImageSaveOptions-java.awt.Dimension-) | Menginisialisasi instance baru dari  ImageSaveOptions  dengan ukuran gambar yang ditentukan. |
| [ImageSaveOptions(Dimension size, ImageFormat imageFormat)](#ImageSaveOptions-java.awt.Dimension-com.aspose.page.ImageFormat-) | Menginisialisasi instance baru dari  ImageSaveOptions  dengan ukuran gambar dan format gambar yang ditentukan. |
| [ImageSaveOptions(ImageFormat imageFormat, boolean supressErrors)](#ImageSaveOptions-com.aspose.page.ImageFormat-boolean-) | Menginisialisasi instance baru dari  ImageSaveOptions  dengan format gambar dan flag suppressErrors yang ditentukan. |
| [ImageSaveOptions(Dimension size, boolean supressErrors)](#ImageSaveOptions-java.awt.Dimension-boolean-) | Menginisialisasi instance baru dari  ImageSaveOptions  dengan ukuran gambar dan flag suppressErrors yang ditentukan. |
| [ImageSaveOptions(Dimension size, ImageFormat imageFormat, boolean supressErrors)](#ImageSaveOptions-java.awt.Dimension-com.aspose.page.ImageFormat-boolean-) | Menginisialisasi instance baru dari  ImageSaveOptions  dengan ukuran gambar, format gambar, dan flag suppressErrors yang ditentukan. |
| [ImageSaveOptions(boolean supressErrors)](#ImageSaveOptions-boolean-) | Inisialisasi instance baru dari kelas  ImageSaveOptions  dengan nilai default untuk flag  debug  (false). |
## Metode

| Metode | Deskripsi |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getAdditionalFontsFolders()](#getAdditionalFontsFolders--) | Mengembalikan folder font tambahan di mana konverter harus menemukan font untuk dokumen masukan. |
| [getClass()](#getClass--) |  |
| [getConvertFontsToTTF()](#getConvertFontsToTTF--) | Mendapatkan flag yang menunjukkan apakah perlu menyimpan font non-TrueType ke TTF. |
| [getExceptions()](#getExceptions--) | Mengembalikan daftar kesalahan non-kritis. |
| [getImageFormat()](#getImageFormat--) | Mendapatkan format gambar untuk gambar hasil. |
| [getJpegQualityLevel()](#getJpegQualityLevel--) | Mengembalikan nilai yang menentukan tingkat kompresi untuk sebuah gambar. |
| [getResolution()](#getResolution--) | Mengembalikan resolusi gambar hasil. |
| [getSize()](#getSize--) | Mendapatkan ukuran halaman atau gambar. |
| [getSmoothingMode()](#getSmoothingMode--) | Mendapatkan mode penghalusan. |
| [getTryJoinImageFragments()](#getTryJoinImageFragments--) | Menunjukkan apakah perpustakaan akan mencoba menggabungkan fragmen gambar. |
| [hashCode()](#hashCode--) |  |
| [isDebug()](#isDebug--) | Mendapatkan flag yang memungkinkan keluaran peringatan dan pesan selama konversi. |
| [isSupressErrors()](#isSupressErrors--) | Mengembalikan nilai yang menunjukkan apakah kesalahan akan ditekan selama konversi. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setAdditionalFontsFolders(String[] fontsFolders)](#setAdditionalFontsFolders-java.lang.String---) | Menentukan folder font tambahan di mana konverter harus menemukan font untuk dokumen masukan. |
| [setConvertFontsToTTF(boolean value)](#setConvertFontsToTTF-boolean-) | Menentukan apakah menyimpan font non-TrueType ke TTF. |
| [setDebug(boolean debug)](#setDebug-boolean-) | Menentukan flag yang memungkinkan keluaran peringatan dan pesan selama konversi. |
| [setImageFormat(ImageFormat imageFormat)](#setImageFormat-com.aspose.page.ImageFormat-) | Menentukan format gambar untuk gambar hasil. |
| [setJpegQualityLevel(int value)](#setJpegQualityLevel-int-) | Mengatur nilai yang menentukan tingkat kompresi untuk sebuah gambar. |
| [setResolution(float resolution)](#setResolution-float-) | Menentukan resolusi gambar hasil. |
| [setSize(Dimension size)](#setSize-java.awt.Dimension-) | Menentukan ukuran halaman atau gambar. |
| [setSmoothingMode(SmoothingMode smoothingMode)](#setSmoothingMode-com.aspose.eps.device.SmoothingMode-) | Mengatur mode penghalusan. |
| [setSupressErrors(boolean supressErrors)](#setSupressErrors-boolean-) | Menentukan flag yang menunjukkan apakah kesalahan akan ditekan selama konversi. |
| [setTryJoinImageFragments(boolean tryJoinImageFragments)](#setTryJoinImageFragments-boolean-) | Menentukan apakah perpustakaan harus mencoba menggabungkan fragmen gambar. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### ImageSaveOptions() {#ImageSaveOptions--}
```
public ImageSaveOptions()
```


Inisialisasi instance baru dari kelas  ImageSaveOptions  dengan nilai default untuk flag  suppressErrors  (true) dan  debug  (false).

### ImageSaveOptions(ImageFormat imageFormat) {#ImageSaveOptions-com.aspose.page.ImageFormat-}
```
public ImageSaveOptions(ImageFormat imageFormat)
```


Menginisialisasi instance baru dari  ImageSaveOptions  dengan format gambar yang ditentukan.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| imageFormat | [ImageFormat](../../com.aspose.page/imageformat) | Format gambar. |

### ImageSaveOptions(Dimension size) {#ImageSaveOptions-java.awt.Dimension-}
```
public ImageSaveOptions(Dimension size)
```


Menginisialisasi instance baru dari  ImageSaveOptions  dengan ukuran gambar yang ditentukan.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| ukuran | java.awt.Dimension | Ukuran gambar. |

### ImageSaveOptions(Dimension size, ImageFormat imageFormat) {#ImageSaveOptions-java.awt.Dimension-com.aspose.page.ImageFormat-}
```
public ImageSaveOptions(Dimension size, ImageFormat imageFormat)
```


Menginisialisasi instance baru dari  ImageSaveOptions  dengan ukuran gambar dan format gambar yang ditentukan.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| ukuran | java.awt.Dimension | Ukuran gambar. |
| imageFormat | [ImageFormat](../../com.aspose.page/imageformat) | Format gambar. |

### ImageSaveOptions(ImageFormat imageFormat, boolean supressErrors) {#ImageSaveOptions-com.aspose.page.ImageFormat-boolean-}
```
public ImageSaveOptions(ImageFormat imageFormat, boolean supressErrors)
```


Menginisialisasi instance baru dari  ImageSaveOptions  dengan format gambar dan flag suppressErrors yang ditentukan.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| imageFormat | [ImageFormat](../../com.aspose.page/imageformat) | Format gambar. |
| supressErrors | boolean | Jika true, konversi akan dilanjutkan meskipun ada kesalahan non-kritis. |

### ImageSaveOptions(Dimension size, boolean supressErrors) {#ImageSaveOptions-java.awt.Dimension-boolean-}
```
public ImageSaveOptions(Dimension size, boolean supressErrors)
```


Menginisialisasi instance baru dari  ImageSaveOptions  dengan ukuran gambar dan flag suppressErrors yang ditentukan.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| ukuran | java.awt.Dimension | Ukuran gambar. |
| supressErrors | boolean | Jika true, konversi akan dilanjutkan meskipun ada kesalahan non-kritis. |

### ImageSaveOptions(Dimension size, ImageFormat imageFormat, boolean supressErrors) {#ImageSaveOptions-java.awt.Dimension-com.aspose.page.ImageFormat-boolean-}
```
public ImageSaveOptions(Dimension size, ImageFormat imageFormat, boolean supressErrors)
```


Menginisialisasi instance baru dari  ImageSaveOptions  dengan ukuran gambar, format gambar, dan flag suppressErrors yang ditentukan.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| ukuran | java.awt.Dimension | Ukuran gambar. |
| imageFormat | [ImageFormat](../../com.aspose.page/imageformat) | Format gambar. |
| supressErrors | boolean | Jika true, konversi akan dilanjutkan meskipun ada kesalahan non-kritis. |

### ImageSaveOptions(boolean supressErrors) {#ImageSaveOptions-boolean-}
```
public ImageSaveOptions(boolean supressErrors)
```


Inisialisasi instance baru dari kelas  ImageSaveOptions  dengan nilai default untuk flag  debug  (false).

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
### getImageFormat() {#getImageFormat--}
```
public ImageFormat getImageFormat()
```


Mendapatkan format gambar untuk gambar hasil.

**Returns:**
[ImageFormat](../../com.aspose.page/imageformat) - An output image format.
### getJpegQualityLevel() {#getJpegQualityLevel--}
```
public int getJpegQualityLevel()
```


Mengembalikan nilai yang menentukan tingkat kompresi untuk sebuah gambar. Nilai yang tersedia adalah 0 hingga 100. Semakin rendah angka yang ditentukan, semakin tinggi kompresi dan oleh karena itu kualitas gambar semakin rendah. Nilai 0 menghasilkan gambar dengan kualitas terendah, sementara 100 menghasilkan kualitas tertinggi.

**Returns:**
int - Nilai yang menentukan tingkat kompresi untuk sebuah gambar.
### getResolution() {#getResolution--}
```
public float getResolution()
```


Mengembalikan resolusi gambar hasil.

**Returns:**
float - Resolusi gambar.
### getSize() {#getSize--}
```
public Dimension getSize()
```


Mendapatkan ukuran halaman atau gambar.

**Returns:**
java.awt.Dimension - Ukuran halaman atau gambar.
### getSmoothingMode() {#getSmoothingMode--}
```
public SmoothingMode getSmoothingMode()
```


Mendapatkan mode penghalusan.

**Returns:**
[SmoothingMode](../../com.aspose.eps.device/smoothingmode) - the smoothingMode.
### getTryJoinImageFragments() {#getTryJoinImageFragments--}
```
public boolean getTryJoinImageFragments()
```


Menunjukkan apakah perpustakaan akan mencoba menggabungkan fragmen gambar. Ini digunakan ketika gambar dalam file PS/EPS sumber dipotong menjadi fragmen. Dalam kasus ini, tanpa flag ini, celah tipis akan tertinggal di antara fragmen.

**Returns:**
boolean - nilai flag.
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

### setImageFormat(ImageFormat imageFormat) {#setImageFormat-com.aspose.page.ImageFormat-}
```
public void setImageFormat(ImageFormat imageFormat)
```


Menentukan format gambar untuk gambar hasil.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| imageFormat | [ImageFormat](../../com.aspose.page/imageformat) | Format gambar output. |

### setJpegQualityLevel(int value) {#setJpegQualityLevel-int-}
```
public void setJpegQualityLevel(int value)
```


Mengatur nilai yang menentukan tingkat kompresi untuk sebuah gambar. Nilai yang tersedia adalah 0 hingga 100. Semakin rendah angka yang ditentukan, semakin tinggi kompresi dan oleh karena itu kualitas gambar semakin rendah. Nilai 0 menghasilkan gambar dengan kualitas terendah, sementara 100 menghasilkan kualitas tertinggi.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| nilai | int | Nilai yang menentukan tingkat kompresi untuk sebuah gambar. |

### setResolution(float resolution) {#setResolution-float-}
```
public void setResolution(float resolution)
```


Menentukan resolusi gambar hasil.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| resolusi | float | Resolusi gambar. |

### setSize(Dimension size) {#setSize-java.awt.Dimension-}
```
public void setSize(Dimension size)
```


Menentukan ukuran halaman atau gambar.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| ukuran | java.awt.Dimension | Ukuran halaman atau gambar. |

### setSmoothingMode(SmoothingMode smoothingMode) {#setSmoothingMode-com.aspose.eps.device.SmoothingMode-}
```
public void setSmoothingMode(SmoothingMode smoothingMode)
```


Mengatur mode penghalusan.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| smoothingMode | [SmoothingMode](../../com.aspose.eps.device/smoothingmode) | smoothingMode yang akan diatur |

### setSupressErrors(boolean supressErrors) {#setSupressErrors-boolean-}
```
public void setSupressErrors(boolean supressErrors)
```


Menentukan flag yang menunjukkan apakah kesalahan akan ditekan selama konversi.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| supressErrors | boolean | Nilai Boolean. |

### setTryJoinImageFragments(boolean tryJoinImageFragments) {#setTryJoinImageFragments-boolean-}
```
public void setTryJoinImageFragments(boolean tryJoinImageFragments)
```


Menentukan apakah perpustakaan harus mencoba menggabungkan fragmen gambar. Ini digunakan ketika gambar dalam file PS/EPS sumber dipotong menjadi fragmen. Dalam kasus ini, tanpa flag ini, celah tipis akan tertinggal di antara fragmen.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| tryJoinImageFragments | boolean | nilai flag. |

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

