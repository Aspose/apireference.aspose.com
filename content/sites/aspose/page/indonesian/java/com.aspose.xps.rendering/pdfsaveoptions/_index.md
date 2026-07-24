---
title: "PdfSaveOptions"
second_title: "Aspose.Page for Java Referensi API"
description: "Kelas untuk opsi penyimpanan XPS-as-PDF."
type: docs
weight: 14
url: /id/java/com.aspose.xps.rendering/pdfsaveoptions/
---
**Inheritance:**
java.lang.Object, [com.aspose.page.SaveOptions](../../com.aspose.page/saveoptions)

**All Implemented Interfaces:**
[com.aspose.page.IMultiPageSaveOptions](../../com.aspose.page/imultipagesaveoptions), [com.aspose.xps.rendering.IXpsTextConversionOptions](../../com.aspose.xps.rendering/ixpstextconversionoptions), [com.aspose.xps.rendering.IPipelineOptions](../../com.aspose.xps.rendering/ipipelineoptions), [com.aspose.xps.rendering.IEventBasedModificationOptions](../../com.aspose.xps.rendering/ieventbasedmodificationoptions)
```
public class PdfSaveOptions extends SaveOptions implements IMultiPageSaveOptions, IXpsTextConversionOptions, IPipelineOptions, IEventBasedModificationOptions
```

Kelas untuk opsi penyimpanan XPS-as-PDF.
## Konstruktor

| Konstruktor | Deskripsi |
| --- | --- |
| [PdfSaveOptions()](#PdfSaveOptions--) | Membuat instance baru dari opsi. |
## Metode

| Metode | Deskripsi |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getAdditionalFontsFolders()](#getAdditionalFontsFolders--) | Mengembalikan folder font tambahan di mana konverter harus menemukan font untuk dokumen masukan. |
| [getBatchSize()](#getBatchSize--) | Mengembalikan ukuran bagian halaman yang akan dipindahkan dari node ke node. |
| [getBeforePageSavingEventHandlers()](#getBeforePageSavingEventHandlers--) | Mengembalikan koleksi event handler yang melakukan modifikasi pada halaman XPS tepat sebelum disimpan. |
| [getClass()](#getClass--) |  |
| [getConvertFontsToTTF()](#getConvertFontsToTTF--) | Mendapatkan flag yang menunjukkan apakah perlu menyimpan font non-TrueType ke TTF. |
| [getEncryptionDetails()](#getEncryptionDetails--) | Mengembalikan detail enkripsi. |
| [getExceptions()](#getExceptions--) | Mengembalikan daftar kesalahan non-kritis. |
| [getImageCompression()](#getImageCompression--) | Mengembalikan tipe kompresi yang akan digunakan untuk semua gambar dalam dokumen. |
| [getJpegQualityLevel()](#getJpegQualityLevel--) | Mengembalikan nilai yang menentukan tingkat kompresi untuk sebuah gambar. |
| [getOutlineTreeExpansionLevel()](#getOutlineTreeExpansionLevel--) | Mendapatkan hingga level mana outline dokumen harus diperluas ketika file PDF dibuka di penampil. 1 - hanya item outline tingkat pertama yang ditampilkan, 2 - hanya item outline tingkat pertama dan kedua yang ditampilkan, dan seterusnya. |
| [getOutlineTreeHeight()](#getOutlineTreeHeight--) | Mendapatkan tinggi pohon outline dokumen yang akan disimpan. 0 - pohon outline tidak akan dikonversi, 1 - hanya item outline tingkat pertama yang akan dikonversi, dan seterusnya. |
| [getPageNumbers()](#getPageNumbers--) | Mendapatkan array jumlah halaman yang akan dirender. |
| [getSize()](#getSize--) | Mendapatkan ukuran halaman atau gambar. |
| [getTextCompression()](#getTextCompression--) | Mengembalikan tipe kompresi yang akan digunakan untuk semua aliran konten kecuali gambar. |
| [hashCode()](#hashCode--) |  |
| [isDebug()](#isDebug--) | Mendapatkan flag yang memungkinkan keluaran peringatan dan pesan selama konversi. |
| [isSupressErrors()](#isSupressErrors--) | Mengembalikan nilai yang menunjukkan apakah kesalahan akan ditekan selama konversi. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [preserveText()](#preserveText--) | Dalam XPS, beberapa elemen teks mungkin berisi referensi ke bentuk glif alternatif yang tidak sesuai dengan kode karakter apa pun dalam font. |
| [preserveText(boolean value)](#preserveText-boolean-) | Dalam XPS, beberapa elemen teks mungkin berisi referensi ke bentuk glif alternatif yang tidak sesuai dengan kode karakter apa pun dalam font. |
| [setAdditionalFontsFolders(String[] fontsFolders)](#setAdditionalFontsFolders-java.lang.String---) | Menentukan folder font tambahan di mana konverter harus menemukan font untuk dokumen masukan. |
| [setBatchSize(int value)](#setBatchSize-int-) | Mengatur ukuran bagian halaman yang akan dipindahkan dari node ke node. |
| [setConvertFontsToTTF(boolean value)](#setConvertFontsToTTF-boolean-) | Menentukan apakah menyimpan font non-TrueType ke TTF. |
| [setDebug(boolean debug)](#setDebug-boolean-) | Menentukan flag yang memungkinkan keluaran peringatan dan pesan selama konversi. |
| [setEncryptionDetails(PdfEncryptionDetails value)](#setEncryptionDetails-com.aspose.xps.rendering.PdfEncryptionDetails-) | Mengatur detail enkripsi. |
| [setImageCompression(PdfImageCompression value)](#setImageCompression-com.aspose.xps.rendering.PdfImageCompression-) | Mengatur tipe kompresi yang akan digunakan untuk semua gambar dalam dokumen. |
| [setJpegQualityLevel(int value)](#setJpegQualityLevel-int-) | Mengatur nilai yang menentukan tingkat kompresi untuk sebuah gambar. |
| [setOutlineTreeExpansionLevel(int value)](#setOutlineTreeExpansionLevel-int-) | Mengatur hingga level mana outline dokumen harus diperluas ketika file PDF dibuka di penampil. 1 - hanya item outline tingkat pertama yang ditampilkan, 2 - hanya item outline tingkat pertama dan kedua yang ditampilkan, dan seterusnya. |
| [setOutlineTreeHeight(int value)](#setOutlineTreeHeight-int-) | Mengatur tinggi pohon outline dokumen yang akan disimpan. 0 - pohon outline tidak akan dikonversi, 1 - hanya item outline tingkat pertama yang akan dikonversi, dan seterusnya. |
| [setPageNumbers(int[] value)](#setPageNumbers-int---) | Mengatur array jumlah halaman yang akan dirender. |
| [setSize(Dimension size)](#setSize-java.awt.Dimension-) | Menentukan ukuran halaman atau gambar. |
| [setSupressErrors(boolean supressErrors)](#setSupressErrors-boolean-) | Menentukan flag yang menunjukkan apakah kesalahan akan ditekan selama konversi. |
| [setTextCompression(PdfTextCompression value)](#setTextCompression-com.aspose.xps.rendering.PdfTextCompression-) | Mengatur tipe kompresi yang akan digunakan untuk semua aliran konten kecuali gambar. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### PdfSaveOptions() {#PdfSaveOptions--}
```
public PdfSaveOptions()
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
java.util.List<com.aspose.xps.features.EventBasedModifications.BeforePageSavingEventHandler> - Koleksi penangkap peristiwa yang melakukan modifikasi pada halaman XPS tepat sebelum disimpan.
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
### getEncryptionDetails() {#getEncryptionDetails--}
```
public PdfEncryptionDetails getEncryptionDetails()
```


Mengembalikan detail enkripsi. Jika tidak diatur, maka tidak ada enkripsi yang akan dilakukan.

**Returns:**
[PdfEncryptionDetails](../../com.aspose.xps.rendering/pdfencryptiondetails) - The encryption details.
### getExceptions() {#getExceptions--}
```
public List<Exception> getExceptions()
```


Mengembalikan daftar kesalahan non-kritis.

**Returns:**
java.util.List<java.lang.Exception> - Daftar pengecualian
### getImageCompression() {#getImageCompression--}
```
public PdfImageCompression getImageCompression()
```


Mengembalikan jenis kompresi yang akan digunakan untuk semua gambar dalam dokumen. Defaultnya adalah PdfImageCompression.Auto.

**Returns:**
[PdfImageCompression](../../com.aspose.xps.rendering/pdfimagecompression) - The compression type.
### getJpegQualityLevel() {#getJpegQualityLevel--}
```
public int getJpegQualityLevel()
```


Mengembalikan nilai yang menentukan tingkat kompresi untuk sebuah gambar. Nilai yang tersedia adalah 0 hingga 100. Semakin rendah angka yang ditentukan, semakin tinggi kompresi dan oleh karena itu kualitas gambar semakin rendah. Nilai 0 menghasilkan gambar dengan kualitas terendah, sementara 100 menghasilkan kualitas tertinggi.

**Returns:**
int - Nilai yang menentukan tingkat kompresi untuk sebuah gambar.
### getOutlineTreeExpansionLevel() {#getOutlineTreeExpansionLevel--}
```
public int getOutlineTreeExpansionLevel()
```


Mendapatkan hingga level mana outline dokumen harus diperluas ketika file PDF dibuka di penampil. 1 - hanya item outline tingkat pertama yang ditampilkan, 2 - hanya item outline tingkat pertama dan kedua yang ditampilkan, dan seterusnya.

**Returns:**
int - Tingkat perluasan pohon garis besar.
### getOutlineTreeHeight() {#getOutlineTreeHeight--}
```
public int getOutlineTreeHeight()
```


Memperoleh tinggi pohon garis besar dokumen yang akan disimpan. 0 - pohon garis besar tidak akan dikonversi, 1 - hanya item garis besar tingkat pertama yang akan dikonversi, dan seterusnya. Defaultnya adalah 10.

**Returns:**
int - Tinggi pohon garis besar.
### getPageNumbers() {#getPageNumbers--}
```
public int[] getPageNumbers()
```


Mendapatkan array jumlah halaman yang akan dirender.

**Returns:**
int[] - Jumlah halaman.
### getSize() {#getSize--}
```
public Dimension getSize()
```


Mendapatkan ukuran halaman atau gambar.

**Returns:**
java.awt.Dimension - Ukuran halaman atau gambar.
### getTextCompression() {#getTextCompression--}
```
public PdfTextCompression getTextCompression()
```


Mengembalikan jenis kompresi yang akan digunakan untuk semua aliran konten kecuali gambar. Defaultnya adalah PdfTextCompression.Flate.

**Returns:**
[PdfTextCompression](../../com.aspose.xps.rendering/pdftextcompression) - The compression type.
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




### preserveText() {#preserveText--}
```
public boolean preserveText()
```


Dalam XPS, beberapa elemen teks dapat berisi referensi ke bentuk glif alternatif yang tidak sesuai dengan kode karakter apa pun dalam font. Jika flag ini diatur ke true, teks dari elemen XPS tersebut dikonversi menjadi bentuk grafis. Kemudian teks itu sendiri muncul transparan di atasnya. Ini membuat teks elemen tersebut dapat dipilih. Namun efek sampingnya adalah file output mungkin jauh lebih besar daripada aslinya. Jika flag ini diatur ke false, karakter yang seharusnya ditampilkan sebagai bentuk alternatif diganti dengan karakter lain yang dipetakan ke bentuk glif alternatif. Oleh karena itu teks, meskipun masih dapat dipilih, akan dimodifikasi dan kemungkinan menjadi tidak dapat dibaca.

**Returns:**
boolean - Nilai flag.
### preserveText(boolean value) {#preserveText-boolean-}
```
public void preserveText(boolean value)
```


Dalam XPS, beberapa elemen teks dapat berisi referensi ke bentuk glif alternatif yang tidak sesuai dengan kode karakter apa pun dalam font. Jika flag ini diatur ke true, teks dari elemen XPS tersebut dikonversi menjadi bentuk grafis. Kemudian teks itu sendiri muncul transparan di atasnya. Ini membuat teks elemen tersebut dapat dipilih. Namun efek sampingnya adalah file output mungkin jauh lebih besar daripada aslinya. Jika flag ini diatur ke false, karakter yang seharusnya ditampilkan sebagai bentuk alternatif diganti dengan karakter lain yang dipetakan ke bentuk glif alternatif. Oleh karena itu teks, meskipun masih dapat dipilih, akan dimodifikasi dan kemungkinan menjadi tidak dapat dibaca.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| nilai | boolean | Nilai flag. |

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

### setEncryptionDetails(PdfEncryptionDetails value) {#setEncryptionDetails-com.aspose.xps.rendering.PdfEncryptionDetails-}
```
public void setEncryptionDetails(PdfEncryptionDetails value)
```


Mengatur detail enkripsi. Jika tidak diatur, maka tidak ada enkripsi yang akan dilakukan.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| value | [PdfEncryptionDetails](../../com.aspose.xps.rendering/pdfencryptiondetails) | Detail enkripsi. |

### setImageCompression(PdfImageCompression value) {#setImageCompression-com.aspose.xps.rendering.PdfImageCompression-}
```
public void setImageCompression(PdfImageCompression value)
```


Mengatur jenis kompresi yang akan digunakan untuk semua gambar dalam dokumen. Defaultnya adalah PdfImageCompression.Auto.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| value | [PdfImageCompression](../../com.aspose.xps.rendering/pdfimagecompression) | Jenis kompresi. |

### setJpegQualityLevel(int value) {#setJpegQualityLevel-int-}
```
public void setJpegQualityLevel(int value)
```


Mengatur nilai yang menentukan tingkat kompresi untuk sebuah gambar. Nilai yang tersedia adalah 0 hingga 100. Semakin rendah angka yang ditentukan, semakin tinggi kompresi dan oleh karena itu kualitas gambar semakin rendah. Nilai 0 menghasilkan gambar dengan kualitas terendah, sementara 100 menghasilkan kualitas tertinggi.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| nilai | int | Nilai yang menentukan tingkat kompresi untuk sebuah gambar. |

### setOutlineTreeExpansionLevel(int value) {#setOutlineTreeExpansionLevel-int-}
```
public void setOutlineTreeExpansionLevel(int value)
```


Mengatur hingga level mana outline dokumen harus diperluas ketika file PDF dibuka di penampil. 1 - hanya item outline tingkat pertama yang ditampilkan, 2 - hanya item outline tingkat pertama dan kedua yang ditampilkan, dan seterusnya.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| nilai | int | Tingkat perluasan pohon garis besar. |

### setOutlineTreeHeight(int value) {#setOutlineTreeHeight-int-}
```
public void setOutlineTreeHeight(int value)
```


Mengatur tinggi pohon outline dokumen yang akan disimpan. 0 - pohon outline tidak akan dikonversi, 1 - hanya item outline tingkat pertama yang akan dikonversi, dan seterusnya.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| nilai | int | Tinggi pohon garis besar. |

### setPageNumbers(int[] value) {#setPageNumbers-int---}
```
public void setPageNumbers(int[] value)
```


Mengatur array jumlah halaman yang akan dirender.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| nilai | int[] | Jumlah halaman. |

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

### setTextCompression(PdfTextCompression value) {#setTextCompression-com.aspose.xps.rendering.PdfTextCompression-}
```
public void setTextCompression(PdfTextCompression value)
```


Mengatur jenis kompresi yang akan digunakan untuk semua aliran konten kecuali gambar. Defaultnya adalah PdfTextCompression.Flate.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| value | [PdfTextCompression](../../com.aspose.xps.rendering/pdftextcompression) | Jenis kompresi. |

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

