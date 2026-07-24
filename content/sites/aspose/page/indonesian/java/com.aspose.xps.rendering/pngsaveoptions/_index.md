---
title: "PngSaveOptions"
second_title: "Aspose.Page for Java Referensi API"
description: "Kelas untuk opsi penyimpanan XPS-as-PNG."
type: docs
weight: 15
url: /id/java/com.aspose.xps.rendering/pngsaveoptions/
---
**Inheritance:**
java.lang.Object, [com.aspose.page.SaveOptions](../../com.aspose.page/saveoptions), [com.aspose.xps.rendering.ImageSaveOptions](../../com.aspose.xps.rendering/imagesaveoptions)
```
public class PngSaveOptions extends ImageSaveOptions
```

Kelas untuk opsi penyimpanan XPS-as-PNG.
## Konstruktor

| Konstruktor | Deskripsi |
| --- | --- |
| [PngSaveOptions()](#PngSaveOptions--) | Membuat instance baru dari opsi. |
## Metode

| Metode | Deskripsi |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getAdditionalFontsFolders()](#getAdditionalFontsFolders--) | Mengembalikan folder font tambahan di mana konverter harus menemukan font untuk dokumen masukan. |
| [getBatchSize()](#getBatchSize--) | Mengembalikan ukuran bagian halaman yang akan dipindahkan dari node ke node. |
| [getBeforePageSavingEventHandlers()](#getBeforePageSavingEventHandlers--) | Mengembalikan koleksi event handler yang melakukan modifikasi pada halaman XPS tepat sebelum disimpan. |
| [getClass()](#getClass--) |  |
| [getConvertFontsToTTF()](#getConvertFontsToTTF--) | Mendapatkan flag yang menunjukkan apakah perlu menyimpan font non-TrueType ke TTF. |
| [getExceptions()](#getExceptions--) | Mengembalikan daftar kesalahan non-kritis. |
| [getImageSize()](#getImageSize--) | Mendapatkan ukuran gambar keluaran dalam piksel. |
| [getInterpolationMode()](#getInterpolationMode--) | Mendapatkan mode interpolasi. |
| [getJpegQualityLevel()](#getJpegQualityLevel--) | Mengembalikan nilai yang menentukan tingkat kompresi untuk sebuah gambar. |
| [getPageNumbers()](#getPageNumbers--) | Mendapatkan array jumlah halaman yang akan dirender. |
| [getResolution()](#getResolution--) | Mendapatkan resolusi gambar. |
| [getSize()](#getSize--) | Mendapatkan ukuran halaman atau gambar. |
| [getSmoothingMode()](#getSmoothingMode--) | Mendapatkan mode penghalusan. |
| [getTextRenderingHint()](#getTextRenderingHint--) | Mendapatkan petunjuk rendering teks. |
| [hashCode()](#hashCode--) |  |
| [isDebug()](#isDebug--) | Mendapatkan flag yang memungkinkan keluaran peringatan dan pesan selama konversi. |
| [isSupressErrors()](#isSupressErrors--) | Mengembalikan nilai yang menunjukkan apakah kesalahan akan ditekan selama konversi. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setAdditionalFontsFolders(String[] fontsFolders)](#setAdditionalFontsFolders-java.lang.String---) | Menentukan folder font tambahan di mana konverter harus menemukan font untuk dokumen masukan. |
| [setBatchSize(int value)](#setBatchSize-int-) | Mengatur ukuran bagian halaman yang akan dipindahkan dari node ke node. |
| [setConvertFontsToTTF(boolean value)](#setConvertFontsToTTF-boolean-) | Menentukan apakah menyimpan font non-TrueType ke TTF. |
| [setDebug(boolean debug)](#setDebug-boolean-) | Menentukan flag yang memungkinkan keluaran peringatan dan pesan selama konversi. |
| [setImageSize(Dimension value)](#setImageSize-java.awt.Dimension-) | Mengatur ukuran gambar keluaran dalam piksel. |
| [setInterpolationMode(InterpolationMode value)](#setInterpolationMode-com.aspose.xps.rendering.InterpolationMode-) | Mengatur mode interpolasi. |
| [setJpegQualityLevel(int value)](#setJpegQualityLevel-int-) | Mengatur nilai yang menentukan tingkat kompresi untuk sebuah gambar. |
| [setPageNumbers(int[] value)](#setPageNumbers-int---) | Mengatur array jumlah halaman yang akan dirender. |
| [setResolution(float value)](#setResolution-float-) | Mengatur resolusi gambar. |
| [setSize(Dimension size)](#setSize-java.awt.Dimension-) | Menentukan ukuran halaman atau gambar. |
| [setSmoothingMode(SmoothingMode value)](#setSmoothingMode-com.aspose.xps.rendering.SmoothingMode-) | Mengatur mode penghalusan. |
| [setSupressErrors(boolean supressErrors)](#setSupressErrors-boolean-) | Menentukan flag yang menunjukkan apakah kesalahan akan ditekan selama konversi. |
| [setTextRenderingHint(TextRenderingHint value)](#setTextRenderingHint-com.aspose.xps.rendering.TextRenderingHint-) | Mengatur petunjuk rendering teks. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### PngSaveOptions() {#PngSaveOptions--}
```
public PngSaveOptions()
```


Membuat instance baru dari opsi.

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
### getBatchSize() {#getBatchSize--}
```
public int getBatchSize()
```


Mengembalikan ukuran bagian halaman yang akan dipindahkan dari node ke node.

**Returns:**
int - Ukuran bagian halaman yang akan dipindahkan dari node ke node.
### getBeforePageSavingEventHandlers() {#getBeforePageSavingEventHandlers--}
```
public List<EventBasedModifications.BeforePageSavingEventHandler> getBeforePageSavingEventHandlers()
```


Mengembalikan koleksi event handler yang melakukan modifikasi pada halaman XPS tepat sebelum disimpan.

**Returns:**
java.util.List<com.aspose.xps.features.EventBasedModifications.BeforePageSavingEventHandler>
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
### getImageSize() {#getImageSize--}
```
public Dimension getImageSize()
```


Mendapatkan ukuran gambar keluaran dalam piksel.

**Returns:**
java.awt.Dimension - Ukuran gambar keluaran dalam piksel.
### getInterpolationMode() {#getInterpolationMode--}
```
public InterpolationMode getInterpolationMode()
```


Mendapatkan mode interpolasi.

**Returns:**
[InterpolationMode](../../com.aspose.xps.rendering/interpolationmode) - The interpolation mode.
### getJpegQualityLevel() {#getJpegQualityLevel--}
```
public int getJpegQualityLevel()
```


Mengembalikan nilai yang menentukan tingkat kompresi untuk sebuah gambar. Nilai yang tersedia adalah 0 hingga 100. Semakin rendah angka yang ditentukan, semakin tinggi kompresi dan oleh karena itu kualitas gambar semakin rendah. Nilai 0 menghasilkan gambar dengan kualitas terendah, sementara 100 menghasilkan kualitas tertinggi.

**Returns:**
int - Nilai yang menentukan tingkat kompresi untuk sebuah gambar.
### getPageNumbers() {#getPageNumbers--}
```
public int[] getPageNumbers()
```


Mendapatkan array jumlah halaman yang akan dirender.

**Returns:**
int[] - Jumlah halaman.
### getResolution() {#getResolution--}
```
public float getResolution()
```


Mendapatkan resolusi gambar.

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
[SmoothingMode](../../com.aspose.xps.rendering/smoothingmode) - The smoothing mode.
### getTextRenderingHint() {#getTextRenderingHint--}
```
public TextRenderingHint getTextRenderingHint()
```


Mendapatkan petunjuk rendering teks.

**Returns:**
[TextRenderingHint](../../com.aspose.xps.rendering/textrenderinghint) - The text rendering hint.
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

### setBatchSize(int value) {#setBatchSize-int-}
```
public void setBatchSize(int value)
```


Mengatur ukuran bagian halaman yang akan dipindahkan dari node ke node.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| nilai | int | Ukuran bagian halaman yang akan dipindahkan dari node ke node. |

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

### setImageSize(Dimension value) {#setImageSize-java.awt.Dimension-}
```
public void setImageSize(Dimension value)
```


Mengatur ukuran gambar keluaran dalam piksel.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| nilai | java.awt.Dimension | Ukuran gambar output dalam piksel. |

### setInterpolationMode(InterpolationMode value) {#setInterpolationMode-com.aspose.xps.rendering.InterpolationMode-}
```
public void setInterpolationMode(InterpolationMode value)
```


Mengatur mode interpolasi.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| value | [InterpolationMode](../../com.aspose.xps.rendering/interpolationmode) | Mode interpolasi. |

### setJpegQualityLevel(int value) {#setJpegQualityLevel-int-}
```
public void setJpegQualityLevel(int value)
```


Mengatur nilai yang menentukan tingkat kompresi untuk sebuah gambar. Nilai yang tersedia adalah 0 hingga 100. Semakin rendah angka yang ditentukan, semakin tinggi kompresi dan oleh karena itu kualitas gambar semakin rendah. Nilai 0 menghasilkan gambar dengan kualitas terendah, sementara 100 menghasilkan kualitas tertinggi.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| nilai | int | Nilai yang menentukan tingkat kompresi untuk sebuah gambar. |

### setPageNumbers(int[] value) {#setPageNumbers-int---}
```
public void setPageNumbers(int[] value)
```


Mengatur array jumlah halaman yang akan dirender.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| nilai | int[] | Jumlah halaman. |

### setResolution(float value) {#setResolution-float-}
```
public void setResolution(float value)
```


Mengatur resolusi gambar.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| nilai | float | Resolusi gambar. |

### setSize(Dimension size) {#setSize-java.awt.Dimension-}
```
public void setSize(Dimension size)
```


Menentukan ukuran halaman atau gambar.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| ukuran | java.awt.Dimension | Ukuran halaman atau gambar. |

### setSmoothingMode(SmoothingMode value) {#setSmoothingMode-com.aspose.xps.rendering.SmoothingMode-}
```
public void setSmoothingMode(SmoothingMode value)
```


Mengatur mode penghalusan.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| value | [SmoothingMode](../../com.aspose.xps.rendering/smoothingmode) | Mode penghalusan. |

### setSupressErrors(boolean supressErrors) {#setSupressErrors-boolean-}
```
public void setSupressErrors(boolean supressErrors)
```


Menentukan flag yang menunjukkan apakah kesalahan akan ditekan selama konversi.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| supressErrors | boolean | Nilai Boolean. |

### setTextRenderingHint(TextRenderingHint value) {#setTextRenderingHint-com.aspose.xps.rendering.TextRenderingHint-}
```
public void setTextRenderingHint(TextRenderingHint value)
```


Mengatur petunjuk rendering teks.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| value | [TextRenderingHint](../../com.aspose.xps.rendering/textrenderinghint) | Petunjuk rendering teks. |

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

