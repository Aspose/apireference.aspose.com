---
title: "Option"
second_title: "Aspose.Page for Java Referensi API"
description: "Kelas yang mengimplementasikan PrintTicket Option umum."
type: docs
weight: 76
url: /id/java/com.aspose.xps.metadata/option/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement)

**All Implemented Interfaces:**
[com.aspose.xps.metadata.IFeatureItem](../../com.aspose.xps.metadata/ifeatureitem)
```
public class Option extends CompositePrintTicketElement implements IFeatureItem
```

Kelas yang mengimplementasikan PrintTicket Option umum. Kelas dasar untuk semua opsi yang didefinisikan dalam skema. Elemen Option berisi semua elemen Property dan ScoredProperty yang terkait dengan opsi ini. https://docs.microsoft.com/en-us/windows/win32/printdocs/option
## Konstruktor

| Konstruktor | Deskripsi |
| --- | --- |
| [Option(String name, IOptionItem[] items)](#Option-java.lang.String-com.aspose.xps.metadata.IOptionItem...-) | Membuat instance opsi PrintTicket baru. |
| [Option(IOptionItem[] items)](#Option-com.aspose.xps.metadata.IOptionItem...-) | Membuat instance opsi PrintTicket baru. |
| [Option(Option option)](#Option-com.aspose.xps.metadata.Option-) | Membuat instance opsi klon. |
## Metode

| Metode | Deskripsi |
| --- | --- |
| [add(IOptionItem[] items)](#add-com.aspose.xps.metadata.IOptionItem...-) | Menambahkan daftar item ke akhir daftar item opsi ini. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getName()](#getName--) | Mendapatkan nama elemen. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### Option(String name, IOptionItem[] items) {#Option-java.lang.String-com.aspose.xps.metadata.IOptionItem...-}
```
public Option(String name, IOptionItem[] items)
```


Membuat instance opsi PrintTicket baru.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| nama | java.lang.String | Nama opsi sewenang-wenang. |
| items | [IOptionItem\[\]](../../com.aspose.xps.metadata/ioptionitem) | Array sewenang-wenang dari instance IOptionItem. Setiap item harus berupa instance ScoredProperty atau Property. |

### Option(IOptionItem[] items) {#Option-com.aspose.xps.metadata.IOptionItem...-}
```
public Option(IOptionItem[] items)
```


Membuat instance opsi PrintTicket baru.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| items | [IOptionItem\[\]](../../com.aspose.xps.metadata/ioptionitem) | Array sewenang-wenang dari instance IOptionItem. Setiap item harus berupa instance ScoredProperty atau Property. |

### Option(Option option) {#Option-com.aspose.xps.metadata.Option-}
```
public Option(Option option)
```


Membuat instance opsi klon.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| option | [Option](../../com.aspose.xps.metadata/option) | Instance opsi untuk diklon. |

### add(IOptionItem[] items) {#add-com.aspose.xps.metadata.IOptionItem...-}
```
public void add(IOptionItem[] items)
```


Menambahkan daftar item ke akhir daftar item opsi ini. Setiap item harus berupa instance  ScoredProperty  atau  Property .

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| items | [IOptionItem\[\]](../../com.aspose.xps.metadata/ioptionitem) | Daftar item untuk ditambahkan. |

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
### getName() {#getName--}
```
public String getName()
```


Mendapatkan nama elemen.

**Returns:**
java.lang.String
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

