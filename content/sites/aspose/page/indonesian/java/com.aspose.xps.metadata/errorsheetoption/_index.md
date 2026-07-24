---
title: "JobErrorSheet.ErrorSheetOption"
second_title: "Aspose.Page for Java Referensi API"
description: "Menjelaskan opsi fitur JobErrorSheet."
type: docs
weight: 10
url: /id/java/com.aspose.xps.metadata/joberrorsheet.errorsheetoption/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Option](../../com.aspose.xps.metadata/option)

**All Implemented Interfaces:**
[com.aspose.xps.metadata.JobErrorSheet.IJobErrorSheetItem](../../com.aspose.xps.metadata/ijoberrorsheetitem)
```
public static final class JobErrorSheet.ErrorSheetOption extends Option implements JobErrorSheet.IJobErrorSheetItem
```

Menjelaskan opsi fitur  JobErrorSheet .
## Bidang

| Bidang | Deskripsi |
| --- | --- |
| [Custom](#Custom) | Menentukan bahwa lembar kesalahan khusus harus dihasilkan. |
| [None](#None) | Menentukan tidak ada lembar kesalahan yang harus dikeluarkan. |
| [Standard](#Standard) | Menentukan lembar kesalahan standar (ditentukan perangkat) harus dikeluarkan. |
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
### Custom {#Custom}
```
public static final JobErrorSheet.ErrorSheetOption Custom
```


Menentukan lembar kesalahan khusus harus dikeluarkan. Jika elemen JobErrorSheetSource ParameterInit tidak ditentukan, Opsi ini harus diabaikan.

### None {#None}
```
public static final JobErrorSheet.ErrorSheetOption None
```


Menentukan tidak ada lembar kesalahan yang harus dikeluarkan.

### Standard {#Standard}
```
public static final JobErrorSheet.ErrorSheetOption Standard
```


Menentukan lembar kesalahan standar (ditentukan perangkat) harus dikeluarkan.

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

