---
title: "StringResult"
second_title: "Aspose.Page for Java Referensi API"
description: "Menunjukkan hasil operasi dalam bentuk string."
type: docs
weight: 19
url: /id/java/com.aspose.page.plugins/stringresult/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
[com.aspose.page.plugins.IOperationResult](../../com.aspose.page.plugins/ioperationresult)
```
public final class StringResult implements IOperationResult
```

Menunjukkan hasil operasi dalam bentuk string.
## Konstruktor

| Konstruktor | Deskripsi |
| --- | --- |
| [StringResult(String result)](#StringResult-java.lang.String-) | Menginisialisasi instance StringResult baru dengan sebuah string. |
## Metode

| Metode | Deskripsi |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getData()](#getData--) | Mendapatkan data mentah. |
| [getText()](#getText--) | Mengembalikan representasi string dari hasil. |
| [hashCode()](#hashCode--) |  |
| [isByteArray()](#isByteArray--) | Menunjukkan apakah hasilnya berupa array byte. |
| [isFile()](#isFile--) | Menunjukkan apakah hasilnya berupa jalur ke berkas keluaran. |
| [isStream()](#isStream--) | Menunjukkan apakah hasilnya berupa jalur ke berkas keluaran. |
| [isString()](#isString--) | Menunjukkan apakah hasilnya berupa string. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toFile()](#toFile--) | Mencoba mengonversi hasil menjadi berkas. |
| [toStream()](#toStream--) | Mencoba mengonversi hasil menjadi objek aliran. |
| [toString()](#toString--) | Mencoba mengonversi hasil menjadi string. |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### StringResult(String result) {#StringResult-java.lang.String-}
```
public StringResult(String result)
```


Menginisialisasi instance StringResult baru dengan sebuah string.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| hasil | java.lang.String | String yang mewakili hasil |

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
### getText() {#getText--}
```
public final String getText()
```


Mengembalikan representasi string dari hasil.

**Returns:**
java.lang.String
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


Menunjukkan apakah hasilnya berupa jalur ke berkas keluaran.

**Returns:**
boolean -  true  jika hasilnya berupa objek aliran; sebaliknya  false .
### isString() {#isString--}
```
public final boolean isString()
```


Menunjukkan apakah hasilnya berupa string.

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


Mencoba mengonversi hasil menjadi string.

**Returns:**
java.lang.String - Sebuah string yang mewakili konten teks jika hasilnya berupa string; jika tidak, mengembalikan base.ToString().
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

