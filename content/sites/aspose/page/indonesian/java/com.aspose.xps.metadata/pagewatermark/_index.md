---
title: "PageWatermark"
second_title: "Aspose.Page for Java Referensi API"
description: "Menjelaskan pengaturan watermark output dan karakteristik watermark."
type: docs
weight: 131
url: /id/java/com.aspose.xps.metadata/pagewatermark/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Feature](../../com.aspose.xps.metadata/feature)

**All Implemented Interfaces:**
[com.aspose.xps.metadata.IJobPrintTicketItem](../../com.aspose.xps.metadata/ijobprintticketitem), [com.aspose.xps.metadata.IDocumentPrintTicketItem](../../com.aspose.xps.metadata/idocumentprintticketitem), [com.aspose.xps.metadata.IPagePrintTicketItem](../../com.aspose.xps.metadata/ipageprintticketitem)
```
public final class PageWatermark extends Feature implements IJobPrintTicketItem, IDocumentPrintTicketItem, IPagePrintTicketItem
```

Menjelaskan pengaturan watermark output dan karakteristik watermark. Watermark diterapkan pada halaman logis, bukan halaman fisik. Misalnya, jika DocumentDuplex diaktifkan, watermark akan muncul pada setiap halaman NUp pada setiap lembar. Jika DocumentDuplex, PagesPerSheet =2, maka setiap lembar akan memiliki 2 watermark. https://docs.microsoft.com/en-us/windows/win32/printdocs/pagewatermark
## Konstruktor

| Konstruktor | Deskripsi |
| --- | --- |
| [PageWatermark(PageWatermark.IPageWatermarkItem[] items)](#PageWatermark-com.aspose.xps.metadata.PageWatermark.IPageWatermarkItem...-) | Membuat sebuah instance baru. |
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
### PageWatermark(PageWatermark.IPageWatermarkItem[] items) {#PageWatermark-com.aspose.xps.metadata.PageWatermark.IPageWatermarkItem...-}
```
public PageWatermark(PageWatermark.IPageWatermarkItem[] items)
```


Membuat sebuah instance baru.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| items | [IPageWatermarkItem\[\]](../../com.aspose.xps.metadata/ipagewatermarkitem) | Sebuah array berisi item yang spesifik untuk fitur tersebut. |

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

