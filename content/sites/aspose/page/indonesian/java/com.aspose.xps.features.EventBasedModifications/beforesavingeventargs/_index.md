---
title: "BeforeSavingEventArgs"
second_title: "Aspose.Page for Java Referensi API"
description: "Mendefinisikan kelas dasar untuk argumen berbagai peristiwa sebelum penyimpanan."
type: docs
weight: 11
url: /id/java/com.aspose.xps.features.eventbasedmodifications/beforesavingeventargs/
---
**Inheritance:**
java.lang.Object
```
public class BeforeSavingEventArgs<T>
```

Mendefinisikan kelas dasar untuk argumen berbagai peristiwa sebelum penyimpanan.
## Metode

| Metode | Deskripsi |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getAbsolutePageNumber()](#getAbsolutePageNumber--) | Mengembalikan nomor halaman absolut saat ini di seluruh dokumen dalam paket XPS. |
| [getClass()](#getClass--) |  |
| [getDocumentNumber()](#getDocumentNumber--) | Mengembalikan nomor dokumen saat ini dalam paket XPS. |
| [getElementAPI()](#getElementAPI--) | Mengembalikan API modifikasi elemen yang akan disimpan. |
| [getOutputPageNumber()](#getOutputPageNumber--) | Mengembalikan nomor output saat ini. |
| [getRelativePageNumber()](#getRelativePageNumber--) | Mengembalikan nomor halaman saat ini relatif terhadap dokumen saat ini dalam paket XPS. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
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
### getAbsolutePageNumber() {#getAbsolutePageNumber--}
```
public int getAbsolutePageNumber()
```


Mengembalikan nomor halaman absolut saat ini di seluruh dokumen dalam paket XPS.

**Returns:**
int - Nomor halaman absolut saat ini di seluruh dokumen dalam paket XPS.
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getDocumentNumber() {#getDocumentNumber--}
```
public int getDocumentNumber()
```


Mengembalikan nomor dokumen saat ini dalam paket XPS.

**Returns:**
int - Nomor dokumen saat ini dalam paket XPS.
### getElementAPI() {#getElementAPI--}
```
public T getElementAPI()
```


Mengembalikan API modifikasi elemen yang akan disimpan.

**Returns:**
T - API modifikasi elemen yang akan disimpan.
### getOutputPageNumber() {#getOutputPageNumber--}
```
public int getOutputPageNumber()
```


Mengembalikan nomor output saat ini. Ini berbeda dari **AbsolutePageNumber** jika opsi penyimpanan **PageNumbers** ditentukan.

**Returns:**
int - Nomor output saat ini.
### getRelativePageNumber() {#getRelativePageNumber--}
```
public int getRelativePageNumber()
```


Mengembalikan nomor halaman saat ini relatif terhadap dokumen saat ini dalam paket XPS.

**Returns:**
int - Nomor halaman saat ini relatif terhadap dokumen saat ini dalam paket XPS.
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

