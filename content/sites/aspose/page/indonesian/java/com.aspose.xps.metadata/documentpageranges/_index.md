---
title: "DocumentPageRanges"
second_title: "Aspose.Page for Java Referensi API"
description: "Menjelaskan rentang output dokumen dalam halaman."
type: docs
weight: 31
url: /id/java/com.aspose.xps.metadata/documentpageranges/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.ParameterInit](../../com.aspose.xps.metadata/parameterinit), [com.aspose.xps.metadata.StringParameterInit](../../com.aspose.xps.metadata/stringparameterinit)

**All Implemented Interfaces:**
[com.aspose.xps.metadata.IJobPrintTicketItem](../../com.aspose.xps.metadata/ijobprintticketitem), [com.aspose.xps.metadata.IDocumentPrintTicketItem](../../com.aspose.xps.metadata/idocumentprintticketitem)
```
public final class DocumentPageRanges extends StringParameterInit implements IJobPrintTicketItem, IDocumentPrintTicketItem
```

Menjelaskan rentang output dokumen dalam halaman. Nilai parameter harus sesuai dengan struktur berikut: - PageRangeText: "PageRange" atau "PageRange,PageRange" - PageRange: "PageNumber" atau "PageNumber-PageNumber" - PageNumber: 1 hingga N, dimana N adalah jumlah halaman dalam dokumen. Jika PageNumber > N, maka PageNumber = N. Spasi dalam string harus diabaikan. https://docs.microsoft.com/en-us/windows/win32/printdocs/documentpageranges
## Konstruktor

| Konstruktor | Deskripsi |
| --- | --- |
| [DocumentPageRanges(String value)](#DocumentPageRanges-java.lang.String-) | Membuat sebuah instance baru. |
## Metode

| Metode | Deskripsi |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getMaxLength()](#getMaxLength--) | Untuk nilai string, mendefinisikan string terpendek terpanjang. |
| [getMinLength()](#getMinLength--) | Untuk nilai string, mendefinisikan string terpendek yang diizinkan. |
| [getName()](#getName--) | Mendapatkan nama elemen. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### DocumentPageRanges(String value) {#DocumentPageRanges-java.lang.String-}
```
public DocumentPageRanges(String value)
```


Membuat sebuah instance baru.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| nilai | java.lang.String | Nilai parameter. |

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
### getMaxLength() {#getMaxLength--}
```
public int getMaxLength()
```


Untuk nilai string, mendefinisikan string terpendek terpanjang.

**Returns:**
int - String terpanjang yang diizinkan.
### getMinLength() {#getMinLength--}
```
public int getMinLength()
```


Untuk nilai string, mendefinisikan string terpendek yang diizinkan.

**Returns:**
int - String terpendek yang diizinkan.
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

