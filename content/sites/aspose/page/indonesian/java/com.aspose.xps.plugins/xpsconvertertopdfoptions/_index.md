---
title: "XpsConverterToPdfOptions"
second_title: "Aspose.Page for Java Referensi API"
description: "Mewakili opsi konverter XPS ke PDF untuk plugin."
type: docs
weight: 13
url: /id/java/com.aspose.xps.plugins/xpsconvertertopdfoptions/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.plugins.XpsConverterOptions](../../com.aspose.xps.plugins/xpsconverteroptions)
```
public class XpsConverterToPdfOptions extends XpsConverterOptions
```

Mewakili opsi konverter XPS ke PDF untuk plugin [XpsConverter](../../com.aspose.xps.plugins/xpsconverter).
## Konstruktor

| Konstruktor | Deskripsi |
| --- | --- |
| [XpsConverterToPdfOptions()](#XpsConverterToPdfOptions--) | Menginisialisasi instance baru dari objek [XpsConverterToPdfOptions](../../com.aspose.xps.plugins/xpsconvertertopdfoptions). |
## Metode

| Metode | Deskripsi |
| --- | --- |
| [addDataSource(IDataSource dataSource)](#addDataSource-com.aspose.page.plugins.IDataSource-) | Menambahkan sumber data baru ke koleksi data plugin XpsConverter. |
| [addSaveDataSource(IDataSource saveDataSource)](#addSaveDataSource-com.aspose.page.plugins.IDataSource-) | Menambahkan sumber data baru ke koleksi data plugin XpsConverterOptions. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getDataCollection()](#getDataCollection--) | Mengembalikan koleksi data plugin XpsConverterOptions. |
| [getJpegQualityLevel()](#getJpegQualityLevel--) | Mengembalikan nilai yang menentukan tingkat kompresi untuk sebuah gambar. |
| [getOperationName()](#getOperationName--) | Mengembalikan nama operasi. |
| [getPageNumbers()](#getPageNumbers--) | Mendapatkan array nomor halaman dalam dokumen XPS yang akan dikonversi. |
| [getSaveTargetsCollection()](#getSaveTargetsCollection--) | Mendapatkan koleksi target yang ditambahkan untuk menyimpan hasil operasi. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setJpegQualityLevel(int value)](#setJpegQualityLevel-int-) | Mengatur nilai yang menentukan tingkat kompresi untuk sebuah gambar. |
| [setPageNumbers(int[] pageNumbers)](#setPageNumbers-int---) | Mengatur array jumlah halaman dalam dokumen XPS yang akan dikonversi. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### XpsConverterToPdfOptions() {#XpsConverterToPdfOptions--}
```
public XpsConverterToPdfOptions()
```


Menginisialisasi instance baru dari objek [XpsConverterToPdfOptions](../../com.aspose.xps.plugins/xpsconvertertopdfoptions).

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
### getSaveTargetsCollection() {#getSaveTargetsCollection--}
```
public final List<IDataSource> getSaveTargetsCollection()
```


Mendapatkan koleksi target yang ditambahkan untuk menyimpan hasil operasi.

**Returns:**
java.util.List<com.aspose.page.plugins.IDataSource>
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

