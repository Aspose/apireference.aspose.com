---
title: "JobDigitalSignatureProcessing.JobDigitalSignatureProcessingOption"
second_title: "Aspose.Page for Java Referensi API"
description: "Menjelaskan opsi fitur JobDigitalSignatureProcessing."
type: docs
weight: 10
url: /id/java/com.aspose.xps.metadata/jobdigitalsignatureprocessing.jobdigitalsignatureprocessingoption/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Option](../../com.aspose.xps.metadata/option)
```
public static final class JobDigitalSignatureProcessing.JobDigitalSignatureProcessingOption extends Option
```

Menjelaskan opsi fitur  JobDigitalSignatureProcessing .
## Bidang

| Bidang | Deskripsi |
| --- | --- |
| [PrintInvalidSignatures](#PrintInvalidSignatures) | Cetak pekerjaan terlepas dari keabsahan tanda tangan digital. |
| [PrintInvalidSignaturesWithErrorReport](#PrintInvalidSignaturesWithErrorReport) | Cetak pekerjaan terlepas dari keabsahan tanda tangan digital. |
| [PrintOnlyValidSignatures](#PrintOnlyValidSignatures) | Cetak pekerjaan hanya jika semua tanda tangan digital valid. |
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
### PrintInvalidSignatures {#PrintInvalidSignatures}
```
public static final JobDigitalSignatureProcessing.JobDigitalSignatureProcessingOption PrintInvalidSignatures
```


Cetak pekerjaan terlepas dari keabsahan tanda tangan digital. Tanda tangan digital BISA diabaikan.

### PrintInvalidSignaturesWithErrorReport {#PrintInvalidSignaturesWithErrorReport}
```
public static final JobDigitalSignatureProcessing.JobDigitalSignatureProcessingOption PrintInvalidSignaturesWithErrorReport
```


Cetak pekerjaan terlepas dari keabsahan tanda tangan digital. Jika ditemukan tanda tangan yang tidak valid, halaman error harus dicetak di akhir pekerjaan. Tanda tangan digital HARUS tidak diabaikan.

### PrintOnlyValidSignatures {#PrintOnlyValidSignatures}
```
public static final JobDigitalSignatureProcessing.JobDigitalSignatureProcessingOption PrintOnlyValidSignatures
```


Cetak pekerjaan hanya jika semua tanda tangan digital valid. Tanda tangan digital HARUS tidak diabaikan.

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

