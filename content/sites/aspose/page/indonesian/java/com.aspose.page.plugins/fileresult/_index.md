---
title: "FileResult"
second_title: "Aspose.Page for Java Referensi API"
description: "Menunjukkan hasil operasi dalam bentuk string jalur ke file."
type: docs
weight: 14
url: /id/java/com.aspose.page.plugins/fileresult/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
[com.aspose.page.plugins.IOperationResult](../../com.aspose.page.plugins/ioperationresult)
```
public final class FileResult implements IOperationResult
```

Menunjukkan hasil operasi dalam bentuk string jalur ke file.
## Konstruktor

| Konstruktor | Deskripsi |
| --- | --- |
| [FileResult(String path)](#FileResult-java.lang.String-) | Menginisialisasi instance baru dengan jalur yang ditentukan ke file output. |
## Metode

| Metode | Deskripsi |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getData()](#getData--) | Mendapatkan data mentah. |
| [hashCode()](#hashCode--) |  |
| [isByteArray()](#isByteArray--) | Menunjukkan apakah hasilnya berupa array byte. |
| [isFile()](#isFile--) | Menunjukkan apakah hasilnya berupa jalur ke berkas keluaran. |
| [isStream()](#isStream--) | Menunjukkan apakah hasilnya berupa aliran output. |
| [isString()](#isString--) | Menunjukkan apakah hasilnya berupa string teks. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toFile()](#toFile--) | Mencoba mengonversi hasil menjadi berkas. |
| [toStream()](#toStream--) | Mencoba mengonversi hasil menjadi objek aliran. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### FileResult(String path) {#FileResult-java.lang.String-}
```
public FileResult(String path)
```


Menginisialisasi instance baru dengan jalur yang ditentukan ke file output.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| path | java.lang.String | Jalur ke file. |

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
### getData() {#getData--}
```
public final Object getData()
```


Mendapatkan data mentah.

**Returns:**
java.lang.Object - Sebuah objek yang mewakili data keluaran.
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### isByteArray() {#isByteArray--}
```
public final boolean isByteArray()
```


Menunjukkan apakah hasilnya berupa array byte.

**Returns:**
boolean -  true  jika hasilnya berupa array byte; sebaliknya  false .
### isFile() {#isFile--}
```
public final boolean isFile()
```


Menunjukkan apakah hasilnya berupa jalur ke berkas keluaran.

**Returns:**
boolean -  true  jika hasilnya berupa berkas; sebaliknya  false .
### isStream() {#isStream--}
```
public final boolean isStream()
```


Menunjukkan apakah hasilnya berupa aliran output.

**Returns:**
boolean -  true  jika hasilnya berupa objek aliran; sebaliknya  false .
### isString() {#isString--}
```
public final boolean isString()
```


Menunjukkan apakah hasilnya berupa string teks.

**Returns:**
boolean -  true  jika hasilnya berupa string; sebaliknya  false .
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### toFile() {#toFile--}
```
public final String toFile()
```


Mencoba mengonversi hasil menjadi berkas.

**Returns:**
java.lang.String - Sebuah string yang mewakili jalur ke berkas keluaran jika hasilnya berkas; sebaliknya  null .
### toStream() {#toStream--}
```
public final OutputStream toStream()
```


Mencoba mengonversi hasil menjadi objek aliran.

**Returns:**
java.io.OutputStream - Sebuah objek aliran yang mewakili data keluaran jika hasilnya aliran; sebaliknya  null .
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

