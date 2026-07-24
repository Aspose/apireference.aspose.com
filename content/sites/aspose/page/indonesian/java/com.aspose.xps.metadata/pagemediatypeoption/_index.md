---
title: "PageMediaType.PageMediaTypeOption"
second_title: "Aspose.Page for Java Referensi API"
description: "Menjelaskan opsi fitur PageMediaType."
type: docs
weight: 13
url: /id/java/com.aspose.xps.metadata/pagemediatype.pagemediatypeoption/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Option](../../com.aspose.xps.metadata/option)

**All Implemented Interfaces:**
[com.aspose.xps.metadata.PageMediaType.IPageMediaTypeItem](../../com.aspose.xps.metadata/ipagemediatypeitem)
```
public static final class PageMediaType.PageMediaTypeOption extends Option implements PageMediaType.IPageMediaTypeItem
```

Menjelaskan opsi fitur  PageMediaType .
## Konstruktor

| Konstruktor | Deskripsi |
| --- | --- |
| [PageMediaTypeOption(String optionName, PageMediaType.IPageMediaTypeOptionItem[] items)](#PageMediaTypeOption-java.lang.String-com.aspose.xps.metadata.PageMediaType.IPageMediaTypeOptionItem...-) | Membuat sebuah instance baru. |
| [PageMediaTypeOption(PageMediaType.PageMediaTypeOption option)](#PageMediaTypeOption-com.aspose.xps.metadata.PageMediaType.PageMediaTypeOption-) | Menggandakan instance opsi ini. |
## Bidang

| Bidang | Deskripsi |
| --- | --- |
| [Archival](#Archival) | Menentukan media kualitas arsip. |
| [AutoSelect](#AutoSelect) | Menentukan Media akan dipilih secara otomatis. |
| [BackPrintFilm](#BackPrintFilm) | Menentukan media film pencetakan belakang khusus. |
| [Bond](#Bond) | Menentukan media ikatan standar. |
| [CardStock](#CardStock) | Menentukan media kertas karton standar. |
| [Continous](#Continous) | Menentukan media umpan kontinu. |
| [EnvelopePlain](#EnvelopePlain) | Menentukan media amplop standar. |
| [EnvelopeWindow](#EnvelopeWindow) | Menentukan media amplop berjendela. |
| [Fabric](#Fabric) | Menentukan media kain. |
| [HighResolution](#HighResolution) | Menentukan media resolusi tinggi khusus. |
| [Label](#Label) | Menentukan media label. |
| [MultiLayerForm](#MultiLayerForm) | Menentukan media formulir multi-bagian terlampir. |
| [MultiPartForm](#MultiPartForm) | Menentukan media formulir multi-bagian terpisah. |
| [None](#None) | Menentukan media yang tidak diketahui atau tidak terdaftar. |
| [Photographic](#Photographic) | Menentukan media fotografi standar. |
| [PhotographicFilm](#PhotographicFilm) | Menentukan media fotografi film. |
| [PhotographicGlossy](#PhotographicGlossy) | Menentukan media fotografi mengkilap. |
| [PhotographicHighGloss](#PhotographicHighGloss) | Menentukan media fotografi kilap tinggi. |
| [PhotographicMatte](#PhotographicMatte) | Menentukan media fotografi matte. |
| [PhotographicSatin](#PhotographicSatin) | Menentukan media fotografi satin. |
| [PhotographicSemiGloss](#PhotographicSemiGloss) | Menentukan media fotografi semi-gloss. |
| [Plain](#Plain) | Menentukan media kertas standar. |
| [Screen](#Screen) | Menentukan output ke tampilan output dalam bentuk kontinu. |
| [ScreenPaged](#ScreenPaged) | Menentukan output ke tampilan output dalam bentuk berhalaman. |
| [Stationary](#Stationary) | Menentukan media alat tulis khusus. |
| [TShirtTransfer](#TShirtTransfer) | Menentukan media transfer kaos khusus. |
| [TabStockFull](#TabStockFull) | Menentukan media stok tab yang tidak dipotong sebelumnya (tab tunggal). |
| [TabStockPreCut](#TabStockPreCut) | Menentukan media stok tab yang dipotong sebelumnya (banyak tab). |
| [Transparency](#Transparency) | Menentukan media transparan. |
## Metode

| Metode | Deskripsi |
| --- | --- |
| [add(IOptionItem[] items)](#add-com.aspose.xps.metadata.IOptionItem...-) | Menambahkan daftar item ke akhir daftar item opsi ini. |
| [add(PageMediaType.IPageMediaTypeOptionItem[] items)](#add-com.aspose.xps.metadata.PageMediaType.IPageMediaTypeOptionItem...-) | Menambahkan array dari instance  IPageMediaTypeOptionItem  ke opsi. |
| [clone()](#clone--) | Menggandakan instance opsi ini. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getName()](#getName--) | Mendapatkan nama elemen. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setWeight(int weight)](#setWeight-int-) | Mengatur nilai properti skor  Weight . |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### PageMediaTypeOption(String optionName, PageMediaType.IPageMediaTypeOptionItem[] items) {#PageMediaTypeOption-java.lang.String-com.aspose.xps.metadata.PageMediaType.IPageMediaTypeOptionItem...-}
```
public PageMediaTypeOption(String optionName, PageMediaType.IPageMediaTypeOptionItem[] items)
```


Membuat sebuah instance baru.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| optionName | java.lang.String | Nama opsi. |
| items | [IPageMediaTypeOptionItem\[\]](../../com.aspose.xps.metadata/ipagemediatypeoptionitem) | Array sewenang-wenang dari instance  IPageMediaTypeOptionItem . |

### PageMediaTypeOption(PageMediaType.PageMediaTypeOption option) {#PageMediaTypeOption-com.aspose.xps.metadata.PageMediaType.PageMediaTypeOption-}
```
public PageMediaTypeOption(PageMediaType.PageMediaTypeOption option)
```


Menggandakan instance opsi ini.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| option | [PageMediaTypeOption](../../com.aspose.xps.metadata/pagemediatypeoption) | Instance untuk digandakan. |

### Archival {#Archival}
```
public static PageMediaType.PageMediaTypeOption Archival
```


Menentukan media kualitas arsip.

### AutoSelect {#AutoSelect}
```
public static PageMediaType.PageMediaTypeOption AutoSelect
```


Menentukan Media akan dipilih secara otomatis.

### BackPrintFilm {#BackPrintFilm}
```
public static PageMediaType.PageMediaTypeOption BackPrintFilm
```


Menentukan media film pencetakan belakang khusus.

### Bond {#Bond}
```
public static PageMediaType.PageMediaTypeOption Bond
```


Menentukan media ikatan standar.

### CardStock {#CardStock}
```
public static PageMediaType.PageMediaTypeOption CardStock
```


Menentukan media kertas karton standar.

### Continous {#Continous}
```
public static PageMediaType.PageMediaTypeOption Continous
```


Menentukan media umpan kontinu.

### EnvelopePlain {#EnvelopePlain}
```
public static PageMediaType.PageMediaTypeOption EnvelopePlain
```


Menentukan media amplop standar.

### EnvelopeWindow {#EnvelopeWindow}
```
public static PageMediaType.PageMediaTypeOption EnvelopeWindow
```


Menentukan media amplop berjendela.

### Fabric {#Fabric}
```
public static PageMediaType.PageMediaTypeOption Fabric
```


Menentukan media kain.

### HighResolution {#HighResolution}
```
public static PageMediaType.PageMediaTypeOption HighResolution
```


Menentukan media resolusi tinggi khusus.

### Label {#Label}
```
public static PageMediaType.PageMediaTypeOption Label
```


Menentukan media label.

### MultiLayerForm {#MultiLayerForm}
```
public static PageMediaType.PageMediaTypeOption MultiLayerForm
```


Menentukan media formulir multi-bagian terlampir.

### MultiPartForm {#MultiPartForm}
```
public static PageMediaType.PageMediaTypeOption MultiPartForm
```


Menentukan media formulir multi-bagian terpisah.

### None {#None}
```
public static PageMediaType.PageMediaTypeOption None
```


Menentukan media yang tidak diketahui atau tidak terdaftar.

### Photographic {#Photographic}
```
public static PageMediaType.PageMediaTypeOption Photographic
```


Menentukan media fotografi standar.

### PhotographicFilm {#PhotographicFilm}
```
public static PageMediaType.PageMediaTypeOption PhotographicFilm
```


Menentukan media fotografi film.

### PhotographicGlossy {#PhotographicGlossy}
```
public static PageMediaType.PageMediaTypeOption PhotographicGlossy
```


Menentukan media fotografi mengkilap.

### PhotographicHighGloss {#PhotographicHighGloss}
```
public static PageMediaType.PageMediaTypeOption PhotographicHighGloss
```


Menentukan media fotografi kilap tinggi.

### PhotographicMatte {#PhotographicMatte}
```
public static PageMediaType.PageMediaTypeOption PhotographicMatte
```


Menentukan media fotografi matte.

### PhotographicSatin {#PhotographicSatin}
```
public static PageMediaType.PageMediaTypeOption PhotographicSatin
```


Menentukan media fotografi satin.

### PhotographicSemiGloss {#PhotographicSemiGloss}
```
public static PageMediaType.PageMediaTypeOption PhotographicSemiGloss
```


Menentukan media fotografi semi-gloss.

### Plain {#Plain}
```
public static PageMediaType.PageMediaTypeOption Plain
```


Menentukan media kertas standar.

### Screen {#Screen}
```
public static PageMediaType.PageMediaTypeOption Screen
```


Menentukan output ke tampilan output dalam bentuk kontinu.

### ScreenPaged {#ScreenPaged}
```
public static PageMediaType.PageMediaTypeOption ScreenPaged
```


Menentukan output ke tampilan output dalam bentuk berhalaman.

### Stationary {#Stationary}
```
public static PageMediaType.PageMediaTypeOption Stationary
```


Menentukan media alat tulis khusus.

### TShirtTransfer {#TShirtTransfer}
```
public static PageMediaType.PageMediaTypeOption TShirtTransfer
```


Menentukan media transfer kaos khusus.

### TabStockFull {#TabStockFull}
```
public static PageMediaType.PageMediaTypeOption TabStockFull
```


Menentukan media stok tab yang tidak dipotong sebelumnya (tab tunggal).

### TabStockPreCut {#TabStockPreCut}
```
public static PageMediaType.PageMediaTypeOption TabStockPreCut
```


Menentukan media stok tab yang dipotong sebelumnya (banyak tab).

### Transparency {#Transparency}
```
public static PageMediaType.PageMediaTypeOption Transparency
```


Menentukan media transparan.

### add(IOptionItem[] items) {#add-com.aspose.xps.metadata.IOptionItem...-}
```
public void add(IOptionItem[] items)
```


Menambahkan daftar item ke akhir daftar item opsi ini. Setiap item harus berupa instance  ScoredProperty  atau  Property .

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| items | [IOptionItem\[\]](../../com.aspose.xps.metadata/ioptionitem) | Daftar item untuk ditambahkan. |

### add(PageMediaType.IPageMediaTypeOptionItem[] items) {#add-com.aspose.xps.metadata.PageMediaType.IPageMediaTypeOptionItem...-}
```
public PageMediaType.PageMediaTypeOption add(PageMediaType.IPageMediaTypeOptionItem[] items)
```


Menambahkan array dari instance  IPageMediaTypeOptionItem  ke opsi.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| items | [IPageMediaTypeOptionItem\[\]](../../com.aspose.xps.metadata/ipagemediatypeoptionitem) | Array sewenang-wenang dari instance  IPageMediaTypeOptionItem . |

**Returns:**
[PageMediaTypeOption](../../com.aspose.xps.metadata/pagemediatypeoption) - This options instance.
### clone() {#clone--}
```
public PageMediaType.PageMediaTypeOption clone()
```


Menggandakan instance opsi ini. Jalan pintas ke konstruktor kloning.

**Returns:**
[PageMediaTypeOption](../../com.aspose.xps.metadata/pagemediatypeoption) - The clone of this option instance.
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




### setWeight(int weight) {#setWeight-int-}
```
public PageMediaType.PageMediaTypeOption setWeight(int weight)
```


Mengatur nilai properti skor  Weight .

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| berat | int | Nilai properti skor  Weight . |

**Returns:**
[PageMediaTypeOption](../../com.aspose.xps.metadata/pagemediatypeoption) - This option instance.
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

