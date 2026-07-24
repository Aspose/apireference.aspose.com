---
title: "JobAccountingSheet"
second_title: "Aspose.Page for Java Referensi API"
description: "Menjelaskan lembar akuntansi yang akan dikeluarkan untuk pekerjaan."
type: docs
weight: 44
url: /id/java/com.aspose.xps.metadata/jobaccountingsheet/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Feature](../../com.aspose.xps.metadata/feature)

**All Implemented Interfaces:**
[com.aspose.xps.metadata.IJobPrintTicketItem](../../com.aspose.xps.metadata/ijobprintticketitem)
```
public final class JobAccountingSheet extends Feature implements IJobPrintTicketItem
```

Menggambarkan lembar akuntansi yang akan dikeluarkan untuk pekerjaan. Lembar akuntansi harus dikeluarkan dengan  PageMediaSize  default dan menggunakan  PageMediaType  default. Lembar akuntansi harus terisolasi dari sisa pekerjaan. Ini berarti bahwa opsi penyelesaian atau pemrosesan apa pun (seperti  JobDuplex ,  JobStaple , atau  JobBinding ) tidak boleh menyertakan lembar akuntansi. Lembar akuntansi dapat muncul sebagai halaman pertama atau terakhir dari pekerjaan sesuai kebijakan implementer. https://docs.microsoft.com/en-us/windows/win32/printdocs/jobaccountingsheet
## Konstruktor

| Konstruktor | Deskripsi |
| --- | --- |
| [JobAccountingSheet(JobAccountingSheet.JobAccountingSheetOption[] options)](#JobAccountingSheet-com.aspose.xps.metadata.JobAccountingSheet.JobAccountingSheetOption...-) | Membuat sebuah instance baru. |
## Metode

| Metode | Deskripsi |
| --- | --- |
| [add(IFeatureItem[] items)](#add-com.aspose.xps.metadata.IFeatureItem...-) | Menambahkan daftar item ke akhir daftar item fitur ini. |
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
### JobAccountingSheet(JobAccountingSheet.JobAccountingSheetOption[] options) {#JobAccountingSheet-com.aspose.xps.metadata.JobAccountingSheet.JobAccountingSheetOption...-}
```
public JobAccountingSheet(JobAccountingSheet.JobAccountingSheetOption[] options)
```


Membuat sebuah instance baru.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| options | [JobAccountingSheetOption\[\]](../../com.aspose.xps.metadata/jobaccountingsheetoption) | Sebuah array opsi yang spesifik untuk fitur. |

### add(IFeatureItem[] items) {#add-com.aspose.xps.metadata.IFeatureItem...-}
```
public void add(IFeatureItem[] items)
```


Menambahkan daftar item ke akhir daftar item fitur ini. Setiap item harus berupa instance Feature, Option, atau Property.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| items | [IFeatureItem\[\]](../../com.aspose.xps.metadata/ifeatureitem) | Daftar item untuk ditambahkan. |

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

