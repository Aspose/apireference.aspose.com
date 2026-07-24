---
title: "CompositePrintTicketElement"
second_title: "Aspose.Page for Java Referensi API"
description: "Kelas dasar untuk kelas yang dapat menjadi elemen Print Schema komposit, yaitu yang berisi elemen lain."
type: docs
weight: 11
url: /id/java/com.aspose.xps.metadata/compositeprintticketelement/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement)
```
public abstract class CompositePrintTicketElement extends PrintTicketElement
```

Kelas dasar untuk kelas yang dapat menjadi elemen Print Schema komposit (yaitu yang berisi elemen lain).
## Konstruktor

| Konstruktor | Deskripsi |
| --- | --- |
| [CompositePrintTicketElement(String name, IPrintTicketElementChild[] items)](#CompositePrintTicketElement-java.lang.String-com.aspose.xps.metadata.IPrintTicketElementChild...-) | Membuat sebuah instance baru. |
| [CompositePrintTicketElement(CompositePrintTicketElement element)](#CompositePrintTicketElement-com.aspose.xps.metadata.CompositePrintTicketElement-) | Menggandakan instance elemen ini. |
## Metode

| Metode | Deskripsi |
| --- | --- |
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
### CompositePrintTicketElement(String name, IPrintTicketElementChild[] items) {#CompositePrintTicketElement-java.lang.String-com.aspose.xps.metadata.IPrintTicketElementChild...-}
```
public CompositePrintTicketElement(String name, IPrintTicketElementChild[] items)
```


Membuat sebuah instance baru.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| nama | java.lang.String | Nama elemen menurut beberapa skema XML (Microsoft Print Schema Framework atau lainnya). |
| items | [IPrintTicketElementChild\[\]](../../com.aspose.xps.metadata/iprintticketelementchild) | Array sembarang dari item anak. |

### CompositePrintTicketElement(CompositePrintTicketElement element) {#CompositePrintTicketElement-com.aspose.xps.metadata.CompositePrintTicketElement-}
```
public CompositePrintTicketElement(CompositePrintTicketElement element)
```


Menggandakan instance elemen ini.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| element | [CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement) | Instance elemen untuk digandakan. |

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

