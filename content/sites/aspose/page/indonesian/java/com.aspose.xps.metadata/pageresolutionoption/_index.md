---
title: "PageResolution.PageResolutionOption"
second_title: "Aspose.Page for Java Referensi API"
description: "Menjelaskan opsi fitur PageResolution."
type: docs
weight: 10
url: /id/java/com.aspose.xps.metadata/pageresolution.pageresolutionoption/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Option](../../com.aspose.xps.metadata/option)

**All Implemented Interfaces:**
[com.aspose.xps.metadata.PageResolution.IPageResolutionItem](../../com.aspose.xps.metadata/ipageresolutionitem)
```
public static final class PageResolution.PageResolutionOption extends Option implements PageResolution.IPageResolutionItem
```

Menjelaskan  PageResolution  opsi fitur.
## Konstruktor

| Konstruktor | Deskripsi |
| --- | --- |
| [PageResolutionOption(String optionName, PageResolution.IPageResolutionOptionItem[] items)](#PageResolutionOption-java.lang.String-com.aspose.xps.metadata.PageResolution.IPageResolutionOptionItem...-) | Membuat sebuah instance baru. |
## Metode

| Metode | Deskripsi |
| --- | --- |
| [add(IOptionItem[] items)](#add-com.aspose.xps.metadata.IOptionItem...-) | Menambahkan daftar item ke akhir daftar item opsi ini. |
| [add(PageResolution.IPageResolutionOptionItem[] items)](#add-com.aspose.xps.metadata.PageResolution.IPageResolutionOptionItem...-) | Menambahkan array dari instance  IPageResolutionOptionItem  ke opsi. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getName()](#getName--) | Mendapatkan nama elemen. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setResolutionX(int resolutionX)](#setResolutionX-int-) | Mengatur nilai properti yang diukur ResolutionX. |
| [setResolutionY(int resolutionY)](#setResolutionY-int-) | Mengatur nilai properti yang diukur ResolutionY. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### PageResolutionOption(String optionName, PageResolution.IPageResolutionOptionItem[] items) {#PageResolutionOption-java.lang.String-com.aspose.xps.metadata.PageResolution.IPageResolutionOptionItem...-}
```
public PageResolutionOption(String optionName, PageResolution.IPageResolutionOptionItem[] items)
```


Membuat sebuah instance baru.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| optionName | java.lang.String | Nama opsi. |
| items | [IPageResolutionOptionItem\[\]](../../com.aspose.xps.metadata/ipageresolutionoptionitem) | Array sembarang dari instance IPageResolutionOptionItem. |

### add(IOptionItem[] items) {#add-com.aspose.xps.metadata.IOptionItem...-}
```
public void add(IOptionItem[] items)
```


Menambahkan daftar item ke akhir daftar item opsi ini. Setiap item harus berupa instance  ScoredProperty  atau  Property .

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| items | [IOptionItem\[\]](../../com.aspose.xps.metadata/ioptionitem) | Daftar item untuk ditambahkan. |

### add(PageResolution.IPageResolutionOptionItem[] items) {#add-com.aspose.xps.metadata.PageResolution.IPageResolutionOptionItem...-}
```
public PageResolution.PageResolutionOption add(PageResolution.IPageResolutionOptionItem[] items)
```


Menambahkan array dari instance  IPageResolutionOptionItem  ke opsi.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| items | [IPageResolutionOptionItem\[\]](../../com.aspose.xps.metadata/ipageresolutionoptionitem) | Array sembarang dari instance IPageResolutionOptionItem. |

**Returns:**
[PageResolutionOption](../../com.aspose.xps.metadata/pageresolutionoption) - This options instance.
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




### setResolutionX(int resolutionX) {#setResolutionX-int-}
```
public PageResolution.PageResolutionOption setResolutionX(int resolutionX)
```


Mengatur nilai properti yang diukur ResolutionX.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| resolutionX | int | Nilai properti yang diukur ResolutionX. |

**Returns:**
[PageResolutionOption](../../com.aspose.xps.metadata/pageresolutionoption) - This option instance.
### setResolutionY(int resolutionY) {#setResolutionY-int-}
```
public PageResolution.PageResolutionOption setResolutionY(int resolutionY)
```


Mengatur nilai properti yang diukur ResolutionY.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| resolutionY | int | Nilai properti yang diukur ResolutionY. |

**Returns:**
[PageResolutionOption](../../com.aspose.xps.metadata/pageresolutionoption) - This option instance.
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

