---
title: "XpsConverterToImageOptions"
second_title: "Aspose.Page for Java Referensi API"
description: "Mewakili opsi konverter XPS ke Gambar untuk plugin."
type: docs
weight: 12
url: /id/java/com.aspose.xps.plugins/xpsconvertertoimageoptions/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.plugins.XpsConverterOptions](../../com.aspose.xps.plugins/xpsconverteroptions)
```
public class XpsConverterToImageOptions extends XpsConverterOptions
```

Mewakili opsi konverter XPS ke Gambar untuk plugin [XpsConverter](../../com.aspose.xps.plugins/xpsconverter).
## Konstruktor

| Konstruktor | Deskripsi |
| --- | --- |
| [XpsConverterToImageOptions()](#XpsConverterToImageOptions--) | Menginisialisasi instance baru dari objek [XpsConverterToImageOptions](../../com.aspose.xps.plugins/xpsconvertertoimageoptions). |
| [XpsConverterToImageOptions(ImageFormat imageFormat)](#XpsConverterToImageOptions-com.aspose.page.ImageFormat-) | Menginisialisasi instance baru dari objek [XpsConverterToImageOptions](../../com.aspose.xps.plugins/xpsconvertertoimageoptions) dengan format gambar. |
| [XpsConverterToImageOptions(Dimension size)](#XpsConverterToImageOptions-java.awt.Dimension-) | Menginisialisasi instance baru dari objek [XpsConverterToImageOptions](../../com.aspose.xps.plugins/xpsconvertertoimageoptions) dengan ukuran gambar hasil. |
| [XpsConverterToImageOptions(ImageFormat imageFormat, Dimension size)](#XpsConverterToImageOptions-com.aspose.page.ImageFormat-java.awt.Dimension-) | Menginisialisasi instance baru dari objek [XpsConverterToImageOptions](../../com.aspose.xps.plugins/xpsconvertertoimageoptions) dengan format gambar. |
## Metode

| Metode | Deskripsi |
| --- | --- |
| [addDataSource(IDataSource dataSource)](#addDataSource-com.aspose.page.plugins.IDataSource-) | Menambahkan sumber data baru ke koleksi data plugin XpsConverter. |
| [addSaveDataSource(IDataSource saveDataSource)](#addSaveDataSource-com.aspose.page.plugins.IDataSource-) | Menambahkan sumber data baru ke koleksi data plugin XpsConverterOptions. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getDataCollection()](#getDataCollection--) | Mengembalikan koleksi data plugin XpsConverterOptions. |
| [getImageFormat()](#getImageFormat--) | Mendapatkan format gambar. |
| [getJpegQualityLevel()](#getJpegQualityLevel--) | Mengembalikan nilai yang menentukan tingkat kompresi untuk sebuah gambar. |
| [getOperationName()](#getOperationName--) | Mengembalikan nama operasi. |
| [getPageNumbers()](#getPageNumbers--) | Mendapatkan array nomor halaman dalam dokumen XPS yang akan dikonversi. |
| [getResolution()](#getResolution--) | Mendapatkan resolusi gambar. |
| [getSaveTargetsCollection()](#getSaveTargetsCollection--) | Mendapatkan koleksi target yang ditambahkan untuk menyimpan hasil operasi. |
| [getSize()](#getSize--) | Mendapatkan ukuran gambar hasil. |
| [getSmoothingMode()](#getSmoothingMode--) | Mendapatkan mode penghalusan untuk merender gambar. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setImageFormat(ImageFormat imageFormat)](#setImageFormat-com.aspose.page.ImageFormat-) | Mendapatkan format gambar. |
| [setJpegQualityLevel(int value)](#setJpegQualityLevel-int-) | Mengatur nilai yang menentukan tingkat kompresi untuk sebuah gambar. |
| [setPageNumbers(int[] pageNumbers)](#setPageNumbers-int---) | Mengatur array jumlah halaman dalam dokumen XPS yang akan dikonversi. |
| [setResolution(int resolution)](#setResolution-int-) | Mengatur resolusi gambar. |
| [setSize(Dimension size)](#setSize-java.awt.Dimension-) | Mengatur ukuran gambar hasil. |
| [setSmoothingMode(SmoothingMode smoothingMode)](#setSmoothingMode-com.aspose.xps.rendering.SmoothingMode-) | Mengatur mode penghalusan untuk merender gambar. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### XpsConverterToImageOptions() {#XpsConverterToImageOptions--}
```
public XpsConverterToImageOptions()
```


Menginisialisasi instance baru dari objek [XpsConverterToImageOptions](../../com.aspose.xps.plugins/xpsconvertertoimageoptions).

### XpsConverterToImageOptions(ImageFormat imageFormat) {#XpsConverterToImageOptions-com.aspose.page.ImageFormat-}
```
public XpsConverterToImageOptions(ImageFormat imageFormat)
```


Menginisialisasi instance baru dari objek [XpsConverterToImageOptions](../../com.aspose.xps.plugins/xpsconvertertoimageoptions) dengan format gambar.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| imageFormat | [ImageFormat](../../com.aspose.page/imageformat) | Format gambar hasil. |

### XpsConverterToImageOptions(Dimension size) {#XpsConverterToImageOptions-java.awt.Dimension-}
```
public XpsConverterToImageOptions(Dimension size)
```


Menginisialisasi instance baru dari objek [XpsConverterToImageOptions](../../com.aspose.xps.plugins/xpsconvertertoimageoptions) dengan ukuran gambar hasil.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| ukuran | java.awt.Dimension | Ukuran gambar hasil. |

### XpsConverterToImageOptions(ImageFormat imageFormat, Dimension size) {#XpsConverterToImageOptions-com.aspose.page.ImageFormat-java.awt.Dimension-}
```
public XpsConverterToImageOptions(ImageFormat imageFormat, Dimension size)
```


Menginisialisasi instance baru dari objek [XpsConverterToImageOptions](../../com.aspose.xps.plugins/xpsconvertertoimageoptions) dengan format gambar.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| imageFormat | [ImageFormat](../../com.aspose.page/imageformat) | Format gambar hasil. |
| ukuran | java.awt.Dimension |  |

### addDataSource(IDataSource dataSource) {#addDataSource-com.aspose.page.plugins.IDataSource-}
```
public final void addDataSource(IDataSource dataSource)
```


Menambahkan sumber data baru ke koleksi data plugin XpsConverter.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| dataSource | [IDataSource](../../com.aspose.page.plugins/idatasource) | Sumber data untuk ditambahkan. |

### addSaveDataSource(IDataSource saveDataSource) {#addSaveDataSource-com.aspose.page.plugins.IDataSource-}
```
public final void addSaveDataSource(IDataSource saveDataSource)
```


Menambahkan sumber data baru ke koleksi data plugin XpsConverterOptions.

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


Mengembalikan koleksi data plugin XpsConverterOptions.

**Returns:**
java.util.List<com.aspose.page.plugins.IDataSource>
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
### getPageNumbers() {#getPageNumbers--}
```
public int[] getPageNumbers()
```


Mendapatkan array nomor halaman dalam dokumen XPS yang akan dikonversi.

**Returns:**
int[] - Array jumlah halaman dalam dokumen XPS.
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
[SmoothingMode](../../com.aspose.xps.rendering/smoothingmode) - A smoothing mode.
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

### setPageNumbers(int[] pageNumbers) {#setPageNumbers-int---}
```
public void setPageNumbers(int[] pageNumbers)
```


Mengatur array jumlah halaman dalam dokumen XPS yang akan dikonversi. Jika tidak diatur, semua halaman akan dikonversi.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| pageNumbers | int[] | Sebuah array berisi nomor halaman dalam dokumen XPS. |

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

### setSmoothingMode(SmoothingMode smoothingMode) {#setSmoothingMode-com.aspose.xps.rendering.SmoothingMode-}
```
public void setSmoothingMode(SmoothingMode smoothingMode)
```


Mengatur mode penghalusan untuk merender gambar.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| smoothingMode | [SmoothingMode](../../com.aspose.xps.rendering/smoothingmode) | Mode penghalusan. |

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

