---
title: "PageScaling.PageScalingOption"
second_title: "Aspose.Page for Java Referensi API"
description: "Menjelaskan opsi fitur PageScaling."
type: docs
weight: 10
url: /id/java/com.aspose.xps.metadata/pagescaling.pagescalingoption/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Option](../../com.aspose.xps.metadata/option)

**All Implemented Interfaces:**
[com.aspose.xps.metadata.PageScaling.IPageScalingItem](../../com.aspose.xps.metadata/ipagescalingitem)
```
public static final class PageScaling.PageScalingOption extends Option implements PageScaling.IPageScalingItem
```

Menjelaskan  PageScaling  opsi fitur.
## Bidang

| Bidang | Deskripsi |
| --- | --- |
| [Custom](#Custom) | Menentukan skala khusus harus diterapkan pada Application Media Size. |
| [CustomSquare](#CustomSquare) | Menentukan skala persegi khusus harus diterapkan pada Application Media Size. |
| [FitApplicationBleedSizeToPageImageableSize](#FitApplicationBleedSizeToPageImageableSize) | Menentukan ukuran bleed aplikasi harus diskalakan ke  PageImageableSize  sambil mempertahankan rasio aspek. |
| [FitApplicationContentSizeToPageImageableSize](#FitApplicationContentSizeToPageImageableSize) | Menentukan ukuran konten aplikasi harus diskalakan ke  PageImageableSize  sambil mempertahankan rasio aspek. |
| [FitApplicationMediaSizeToPageImageableSize](#FitApplicationMediaSizeToPageImageableSize) | Menentukan ukuran media aplikasi harus diskalakan ke  PageImageableSize  sambil mempertahankan rasio aspek. |
| [FitApplicationMediaSizeToPageMediaSize](#FitApplicationMediaSizeToPageMediaSize) | Menentukan ukuran media aplikasi harus diskalakan ke  PageMediaSize  sambil mempertahankan rasio aspek. |
| [None](#None) | Menentukan bahwa tidak ada skala yang harus diterapkan. |
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
public static PageScaling.PageScalingOption Custom
```


Menentukan skala khusus harus diterapkan pada Application Media Size.

### CustomSquare {#CustomSquare}
```
public static PageScaling.PageScalingOption CustomSquare
```


Menentukan skala persegi khusus harus diterapkan pada Application Media Size.

### FitApplicationBleedSizeToPageImageableSize {#FitApplicationBleedSizeToPageImageableSize}
```
public static PageScaling.PageScalingOption FitApplicationBleedSizeToPageImageableSize
```


Menentukan ukuran bleed aplikasi harus diskalakan ke  PageImageableSize  sambil mempertahankan rasio aspek.

### FitApplicationContentSizeToPageImageableSize {#FitApplicationContentSizeToPageImageableSize}
```
public static PageScaling.PageScalingOption FitApplicationContentSizeToPageImageableSize
```


Menentukan ukuran konten aplikasi harus diskalakan ke  PageImageableSize  sambil mempertahankan rasio aspek.

### FitApplicationMediaSizeToPageImageableSize {#FitApplicationMediaSizeToPageImageableSize}
```
public static PageScaling.PageScalingOption FitApplicationMediaSizeToPageImageableSize
```


Menentukan ukuran media aplikasi harus diskalakan ke  PageImageableSize  sambil mempertahankan rasio aspek.

### FitApplicationMediaSizeToPageMediaSize {#FitApplicationMediaSizeToPageMediaSize}
```
public static PageScaling.PageScalingOption FitApplicationMediaSizeToPageMediaSize
```


Menentukan ukuran media aplikasi harus diskalakan ke  PageMediaSize  sambil mempertahankan rasio aspek.

### None {#None}
```
public static PageScaling.PageScalingOption None
```


Menentukan bahwa tidak ada skala yang harus diterapkan.

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

