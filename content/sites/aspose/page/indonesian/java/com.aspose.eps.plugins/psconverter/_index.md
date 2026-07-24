---
title: "PsConverter"
second_title: "Aspose.Page for Java Referensi API"
description: "Mewakili plugin PsConverter."
type: docs
weight: 10
url: /id/java/com.aspose.eps.plugins/psconverter/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
[com.aspose.page.plugins.IPlugin](../../com.aspose.page.plugins/iplugin)
```
public class PsConverter implements IPlugin
```

Mewakili plugin PsConverter.

Contoh ini menunjukkan cara mengonversi file PS/EPS ke dokumen PDF.

// buat PsConverter PsConverter converter = new PsConverter(); // buat objek PsConverterToPdfOptions untuk mengatur tipe data output sebagai file PsConverterToPdfOptions opt = new PsConverterToPdfOptions(); // tambahkan path file input opt.addDataSource(new FileDataSource(inputPath)); // atur path file output opt.addSaveDataSource(new FileDataSource(outputPath)); // jalankan proses konversi ResultContainer results = converter.process(opt);

Contoh ini menunjukkan cara mengonversi file PS/EPS ke gambar dengan output file.

// buat PsConverter PsConverter converter = new PsConverter(); // buat PsConverterToImageOptions dengan format gambar target JPEG. Format gambar default untuk gambar hasil adalah PNG. // Selain itu kita dapat mengatur ukuran gambar hasil, resolusi, mode smoothing, dan tingkat kualitas JPEG untuk format gambar JPEG hasil. PsConverterToImageOptions opt = new PsConverterToImageOptions(ImageFormat.Jpeg); // tambahkan path file input opt.addDataSource(new FileDataSource(inputPath)); // jika file PS input memiliki banyak halaman, hasilnya akan berupa sekumpulan file gambar dengan nama: ["outputPath" tanpa ekstensi][pageNumber dimulai dari 0].[ekstensi dari "outputPath"] opt.addSaveDataSource(new FileDataSource(outputPath)); // jalankan proses konversi converter.process(opt);

Contoh ini menunjukkan cara mengonversi file PS/EPS ke gambar dengan output array byte.

Dalam datasource output array byte (byte [][]) satu array byte berisi gambar satu halaman. Dengan demikian, untuk dokumen satu halaman hasilnya akan berisi array [1][], untuk dokumen multi halaman hasilnya akan berisi array [jumlah halaman dalam dokumen PS input][] . // buat PsConverter PsConverter converter = new PsConverter(); // buat PsConverterToImageOptions dengan format gambar target JPEG. Format gambar default untuk gambar hasil adalah PNG. // Selain itu kita dapat mengatur ukuran gambar hasil, resolusi, mode smoothing, dan tingkat kualitas JPEG untuk format gambar JPEG hasil. PsConverterToImageOptions opt = new PsConverterToImageOptions(ImageFormat.Jpeg); // tambahkan path file input opt.addDataSource(new FileDataSource(inputPath)); // jika file PS input memiliki banyak halaman, hasilnya akan berupa sekumpulan file gambar dengan nama: ["outputPath" tanpa ekstensi][pageNumber dimulai dari 0].[ekstensi dari "outputPath"] opt.addSaveDataSource(new ByteArrayDataSource()); // jalankan proses konversi converter.process(opt); // dapatkan array byte hasil byte[][] imagesBytes = (byte [][]) ((ByteArrayResult)results.ResultCollection[0]).Data;
## Konstruktor

| Konstruktor | Deskripsi |
| --- | --- |
| [PsConverter()](#PsConverter--) |  |
## Metode

| Metode | Deskripsi |
| --- | --- |
| [dispose()](#dispose--) | Implementasi IDisposable. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [process(IPluginOptions options)](#process-com.aspose.page.plugins.IPluginOptions-) | Memulai pemrosesan PsConverter dengan parameter yang ditentukan. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### PsConverter() {#PsConverter--}
```
public PsConverter()
```


### dispose() {#dispose--}
```
public final void dispose()
```


Implementasi IDisposable.

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




### process(IPluginOptions options) {#process-com.aspose.page.plugins.IPluginOptions-}
```
public final ResultContainer process(IPluginOptions options)
```


Memulai pemrosesan PsConverter dengan parameter yang ditentukan.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| options | [IPluginOptions](../../com.aspose.page.plugins/ipluginoptions) | Objek opsi yang berisi instruksi untuk PsConverter. |

**Returns:**
[ResultContainer](../../com.aspose.page.plugins/resultcontainer) - An ResultContainer object containing the result of the operation.
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

