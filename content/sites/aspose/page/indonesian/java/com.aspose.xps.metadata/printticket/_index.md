---
title: "PrintTicket"
second_title: "Aspose.Page for Java Referensi API"
description: "Kelas yang mengimplementasikan PrintTicket umum dengan ruang lingkup apa pun."
type: docs
weight: 141
url: /id/java/com.aspose.xps.metadata/printticket/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
java.lang.Iterable
```
public abstract class PrintTicket implements Iterable<String>
```

Kelas yang mengimplementasikan PrintTicket umum untuk semua lingkup. Kelas dasar untuk tiket cetak tingkat pekerjaan, dokumen, dan halaman. Sebuah elemen  PrintTicket  adalah elemen akar dari dokumen PrintTicket. Sebuah elemen  PrintTicket  berisi semua informasi pemformatan pekerjaan yang diperlukan untuk menghasilkan sebuah pekerjaan. https://docs.microsoft.com/en-us/windows/win32/printdocs/printticket
## Konstruktor

| Konstruktor | Deskripsi |
| --- | --- |
| [PrintTicket(IPrintTicketItem[] items)](#PrintTicket-com.aspose.xps.metadata.IPrintTicketItem...-) | Membuat sebuah instance baru. |
## Metode

| Metode | Deskripsi |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [hashCode()](#hashCode--) |  |
| [iterator()](#iterator--) | Mengembalikan iterator nama item tiket cetak. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [remove(String[] names)](#remove-java.lang.String...-) | Menghapus sebuah item dari daftar item PrintTicket ini. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### PrintTicket(IPrintTicketItem[] items) {#PrintTicket-com.aspose.xps.metadata.IPrintTicketItem...-}
```
public PrintTicket(IPrintTicketItem[] items)
```


Membuat sebuah instance baru.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| items | [IPrintTicketItem\[\]](../../com.aspose.xps.metadata/iprintticketitem) | Sebuah array sewenang-wenang dari  IPrintTicketItem  instance. Setiap satu harus berupa  Feature ,  ParameterInit , atau  Property  instance. |

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
### iterator() {#iterator--}
```
public Iterator<String> iterator()
```


Mengembalikan iterator nama item tiket cetak.

**Returns:**
java.util.Iterator<java.lang.String> - Mengembalikan iterator untuk daftar.
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### remove(String[] names) {#remove-java.lang.String...-}
```
public void remove(String[] names)
```


Menghapus sebuah item dari daftar item PrintTicket ini.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| nama | java.lang.String[] | Sebuah array nama item. |

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

