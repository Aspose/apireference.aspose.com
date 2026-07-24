---
title: "PsConverterToImageOptions"
second_title: "Aspose.Page for Java Referensi API"
description: "Mewakili opsi konverter PS/EPS ke Gambar untuk plugin."
type: docs
weight: 12
url: /id/java/com.aspose.eps.plugins/psconvertertoimageoptions/
---
**Inheritance:**
java.lang.Object, [com.aspose.eps.plugins.PsConverterOptions](../../com.aspose.eps.plugins/psconverteroptions)
```
public class PsConverterToImageOptions extends PsConverterOptions
```

Mewakili opsi konverter PS/EPS ke Gambar untuk plugin [PsConverter](../../com.aspose.eps.plugins/psconverter).
## Konstruktor

| Konstruktor | Deskripsi |
| --- | --- |
| [PsConverterToImageOptions()](#PsConverterToImageOptions--) | Menginisialisasi instance baru dari objek [PsConverterToImageOptions](../../com.aspose.eps.plugins/psconvertertoimageoptions). |
| [PsConverterToImageOptions(ImageFormat imageFormat)](#PsConverterToImageOptions-com.aspose.page.ImageFormat-) | Menginisialisasi instance baru dari objek [PsConverterToImageOptions](../../com.aspose.eps.plugins/psconvertertoimageoptions) dengan format gambar. |
| [PsConverterToImageOptions(Dimension size)](#PsConverterToImageOptions-java.awt.Dimension-) | Menginisialisasi instance baru dari objek [PsConverterToImageOptions](../../com.aspose.eps.plugins/psconvertertoimageoptions) dengan ukuran gambar hasil. |
| [PsConverterToImageOptions(ImageFormat imageFormat, Dimension size)](#PsConverterToImageOptions-com.aspose.page.ImageFormat-java.awt.Dimension-) | Menginisialisasi instance baru dari objek [PsConverterToImageOptions](../../com.aspose.eps.plugins/psconvertertoimageoptions) dengan format gambar. |
## Metode

| Metode | Deskripsi |
| --- | --- |
| [addDataSource(IDataSource dataSource)](#addDataSource-com.aspose.page.plugins.IDataSource-) | Menambahkan sumber data baru ke koleksi data plugin PsConverter. |
| [addSaveDataSource(IDataSource saveDataSource)](#addSaveDataSource-com.aspose.page.plugins.IDataSource-) | Menambahkan sumber data baru ke koleksi data plugin PsConverterOptions. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getAdditionalFontsFolders()](#getAdditionalFontsFolders--) | Mengembalikan folder font tambahan di mana konverter harus menemukan font untuk dokumen masukan. |
| [getClass()](#getClass--) |  |
| [getDataCollection()](#getDataCollection--) | Mengembalikan koleksi data plugin PsConverterOptions. |
| [getExceptions()](#getExceptions--) | Mengembalikan daftar kesalahan non-kritis. |
| [getImageFormat()](#getImageFormat--) | Mendapatkan format gambar. |
| [getJpegQualityLevel()](#getJpegQualityLevel--) | Mengembalikan nilai yang menentukan tingkat kompresi untuk sebuah gambar. |
| [getOperationName()](#getOperationName--) | Mengembalikan nama operasi. |
| [getResolution()](#getResolution--) | Mendapatkan resolusi gambar. |
| [getSaveTargetsCollection()](#getSaveTargetsCollection--) | Mendapatkan koleksi target yang ditambahkan untuk menyimpan hasil operasi. |
| [getSize()](#getSize--) | Mendapatkan ukuran gambar hasil. |
| [getSmoothingMode()](#getSmoothingMode--) | Mendapatkan mode penghalusan untuk merender gambar. |
| [hashCode()](#hashCode--) |  |
| [isDebug()](#isDebug--) | Mendapatkan flag yang memungkinkan keluaran peringatan dan pesan selama konversi. |
| [isSupressErrors()](#isSupressErrors--) | Mengembalikan nilai yang menunjukkan apakah kesalahan akan ditekan selama konversi. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setAdditionalFontsFolders(String[] fontsFolders)](#setAdditionalFontsFolders-java.lang.String---) | Menentukan folder font tambahan di mana konverter harus menemukan font untuk dokumen masukan. |
| [setDebug(boolean debug)](#setDebug-boolean-) | Menentukan flag yang memungkinkan keluaran peringatan dan pesan selama konversi. |
| [setImageFormat(ImageFormat imageFormat)](#setImageFormat-com.aspose.page.ImageFormat-) | Mendapatkan format gambar. |
| [setJpegQualityLevel(int value)](#setJpegQualityLevel-int-) | Mengatur nilai yang menentukan tingkat kompresi untuk sebuah gambar. |
| [setResolution(int resolution)](#setResolution-int-) | Mengatur resolusi gambar. |
| [setSize(Dimension size)](#setSize-java.awt.Dimension-) | Mengatur ukuran gambar hasil. |
| [setSmoothingMode(SmoothingMode smoothingMode)](#setSmoothingMode-com.aspose.eps.device.SmoothingMode-) | Mengatur mode penghalusan untuk merender gambar. |
| [setSupressErrors(boolean supressErrors)](#setSupressErrors-boolean-) | Menentukan flag yang menunjukkan apakah kesalahan akan ditekan selama konversi. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### PsConverterToImageOptions() {#PsConverterToImageOptions--}
```
public PsConverterToImageOptions()
```


Menginisialisasi instance baru dari objek [PsConverterToImageOptions](../../com.aspose.eps.plugins/psconvertertoimageoptions).

### PsConverterToImageOptions(ImageFormat imageFormat) {#PsConverterToImageOptions-com.aspose.page.ImageFormat-}
```
public PsConverterToImageOptions(ImageFormat imageFormat)
```


Menginisialisasi instance baru dari objek [PsConverterToImageOptions](../../com.aspose.eps.plugins/psconvertertoimageoptions) dengan format gambar.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| imageFormat | [ImageFormat](../../com.aspose.page/imageformat) | Format gambar hasil. |

### PsConverterToImageOptions(Dimension size) {#PsConverterToImageOptions-java.awt.Dimension-}
```
public PsConverterToImageOptions(Dimension size)
```


Menginisialisasi instance baru dari objek [PsConverterToImageOptions](../../com.aspose.eps.plugins/psconvertertoimageoptions) dengan ukuran gambar hasil.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| ukuran | java.awt.Dimension | Ukuran gambar hasil. |

### PsConverterToImageOptions(ImageFormat imageFormat, Dimension size) {#PsConverterToImageOptions-com.aspose.page.ImageFormat-java.awt.Dimension-}
```
public PsConverterToImageOptions(ImageFormat imageFormat, Dimension size)
```


Menginisialisasi instance baru dari objek [PsConverterToImageOptions](../../com.aspose.eps.plugins/psconvertertoimageoptions) dengan format gambar.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| imageFormat | [ImageFormat](../../com.aspose.page/imageformat) | Format gambar hasil. |
| ukuran | java.awt.Dimension |  |

### addDataSource(IDataSource dataSource) {#addDataSource-com.aspose.page.plugins.IDataSource-}
```
public final void addDataSource(IDataSource dataSource)
```


Menambahkan sumber data baru ke koleksi data plugin PsConverter.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| dataSource | [IDataSource](../../com.aspose.page.plugins/idatasource) | Sumber data untuk ditambahkan. |

### addSaveDataSource(IDataSource saveDataSource) {#addSaveDataSource-com.aspose.page.plugins.IDataSource-}
```
public final void addSaveDataSource(IDataSource saveDataSource)
```


Menambahkan sumber data baru ke koleksi data plugin PsConverterOptions.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| saveDataSource | [IDataSource](../../com.aspose.page.plugins/idatasource) | Sumber data (file atau aliran) untuk menyimpan hasil operasi. |

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
### getDataCollection() {#getDataCollection--}
```
public final List<IDataSource> getDataCollection()
```


Mengembalikan koleksi data plugin PsConverterOptions.

**Returns:**
java.util.List<com.aspose.page.plugins.IDataSource>
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


Mendapatkan format gambar.

**Returns:**
[ImageFormat](../../com.aspose.page/imageformat) - An image format.
### getJpegQualityLevel() {#getJpegQualityLevel--}
```
public int getJpegQualityLevel()
```


Mengembalikan nilai yang menentukan tingkat kompresi untuk sebuah gambar. Nilai yang tersedia adalah 0 hingga 100. Semakin rendah angka yang ditentukan, semakin tinggi kompresi dan oleh karena itu kualitas gambar semakin rendah. Nilai 0 menghasilkan gambar dengan kualitas terendah, sementara 100 menghasilkan kualitas tertinggi.

**Returns:**
int - Nilai yang menentukan tingkat kompresi untuk sebuah gambar.
### getOperationName() {#getOperationName--}
```
public final String getOperationName()
```


Mengembalikan nama operasi.

**Returns:**
java.lang.String
### getResolution() {#getResolution--}
```
public int getResolution()
```


Mendapatkan resolusi gambar.

**Returns:**
int - Resolusi gambar.
### getSaveTargetsCollection() {#getSaveTargetsCollection--}
```
public final List<IDataSource> getSaveTargetsCollection()
```


Mendapatkan koleksi target yang ditambahkan untuk menyimpan hasil operasi.

**Returns:**
java.util.List<com.aspose.page.plugins.IDataSource>
### getSize() {#getSize--}
```
public Dimension getSize()
```


Mendapatkan ukuran gambar hasil.

**Returns:**
java.awt.Dimension - Ukuran gambar.
### getSmoothingMode() {#getSmoothingMode--}
```
public SmoothingMode getSmoothingMode()
```


Mendapatkan mode penghalusan untuk merender gambar.

**Returns:**
[SmoothingMode](../../com.aspose.eps.device/smoothingmode) - A smoothing mode.
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


Mendapatkan format gambar.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| imageFormat | [ImageFormat](../../com.aspose.page/imageformat) | Format gambar hasil. |

### setJpegQualityLevel(int value) {#setJpegQualityLevel-int-}
```
public void setJpegQualityLevel(int value)
```


Mengatur nilai yang menentukan tingkat kompresi untuk sebuah gambar. Nilai yang tersedia adalah 0 hingga 100. Semakin rendah angka yang ditentukan, semakin tinggi kompresi dan oleh karena itu kualitas gambar semakin rendah. Nilai 0 menghasilkan gambar dengan kualitas terendah, sementara 100 menghasilkan kualitas tertinggi.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| nilai | int | Nilai yang menentukan tingkat kompresi untuk sebuah gambar. |

### setResolution(int resolution) {#setResolution-int-}
```
public void setResolution(int resolution)
```


Mengatur resolusi gambar.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| resolusi | int | Resolusi gambar yang dihasilkan. |

### setSize(Dimension size) {#setSize-java.awt.Dimension-}
```
public void setSize(Dimension size)
```


Mengatur ukuran gambar hasil.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| ukuran | java.awt.Dimension | Ukuran gambar yang dihasilkan. |

### setSmoothingMode(SmoothingMode smoothingMode) {#setSmoothingMode-com.aspose.eps.device.SmoothingMode-}
```
public void setSmoothingMode(SmoothingMode smoothingMode)
```


Mengatur mode penghalusan untuk merender gambar.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| smoothingMode | [SmoothingMode](../../com.aspose.eps.device/smoothingmode) | Mode penghalusan. |

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

