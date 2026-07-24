---
title: "InputBin.InputBinOption"
second_title: "Aspose.Page for Java Referensi API"
description: "Menjelaskan opsi fitur JobInputBin, DocumentInputBin, dan PageInputBin."
type: docs
weight: 14
url: /id/java/com.aspose.xps.metadata/inputbin.inputbinoption/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Option](../../com.aspose.xps.metadata/option)

**All Implemented Interfaces:**
[com.aspose.xps.metadata.InputBin.IInputBinItem](../../com.aspose.xps.metadata/iinputbinitem)
```
public static final class InputBin.InputBinOption extends Option implements InputBin.IInputBinItem
```

Menjelaskan opsi fitur JobInputBin, DocumentInputBin, dan PageInputBin.
## Konstruktor

| Konstruktor | Deskripsi |
| --- | --- |
| [InputBinOption(String optionName, InputBin.IInputBinOptionItem[] items)](#InputBinOption-java.lang.String-com.aspose.xps.metadata.InputBin.IInputBinOptionItem...-) | Membuat sebuah instance baru. |
## Bidang

| Bidang | Deskripsi |
| --- | --- |
| [AutoSelect](#AutoSelect) | Perangkat akan secara otomatis memilih opsi terbaik berdasarkan konfigurasi. |
| [AutoSheetFeeder](#AutoSheetFeeder) | Baki Input Perangkat untuk Printer Inkjet. |
| [Cassette](#Cassette) | Menentukan bahwa baki umpan adalah kaset. |
| [Manual](#Manual) | Menentukan baki umpan manual default. |
| [Tractor](#Tractor) | Menentukan bahwa baki umpan adalah traktor. |
## Metode

| Metode | Deskripsi |
| --- | --- |
| [add(IOptionItem[] items)](#add-com.aspose.xps.metadata.IOptionItem...-) | Menambahkan daftar item ke akhir daftar item opsi ini. |
| [add(InputBin.IInputBinOptionItem[] items)](#add-com.aspose.xps.metadata.InputBin.IInputBinOptionItem...-) | Menambahkan sebuah array dari  IInputBinOptionItem  instance ke opsi. |
| [clone()](#clone--) | Menggandakan instance opsi ini. |
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
### InputBinOption(String optionName, InputBin.IInputBinOptionItem[] items) {#InputBinOption-java.lang.String-com.aspose.xps.metadata.InputBin.IInputBinOptionItem...-}
```
public InputBinOption(String optionName, InputBin.IInputBinOptionItem[] items)
```


Membuat sebuah instance baru.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| optionName | java.lang.String | Nama opsi. |
| items | [IInputBinOptionItem\[\]](../../com.aspose.xps.metadata/iinputbinoptionitem) | Sebuah array sewenang-wenang dari  IInputBinOptionItem  instance. |

### AutoSelect {#AutoSelect}
```
public static final InputBin.InputBinOption AutoSelect
```


Perangkat akan secara otomatis memilih opsi terbaik berdasarkan konfigurasi.

### AutoSheetFeeder {#AutoSheetFeeder}
```
public static final InputBin.InputBinOption AutoSheetFeeder
```


Baki Input Perangkat untuk Printer Inkjet.

### Cassette {#Cassette}
```
public static final InputBin.InputBinOption Cassette
```


Menentukan bahwa baki umpan adalah kaset.

### Manual {#Manual}
```
public static final InputBin.InputBinOption Manual
```


Menentukan baki umpan manual default.

### Tractor {#Tractor}
```
public static final InputBin.InputBinOption Tractor
```


Menentukan bahwa baki umpan adalah traktor.

### add(IOptionItem[] items) {#add-com.aspose.xps.metadata.IOptionItem...-}
```
public void add(IOptionItem[] items)
```


Menambahkan daftar item ke akhir daftar item opsi ini. Setiap item harus berupa instance  ScoredProperty  atau  Property .

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| items | [IOptionItem\[\]](../../com.aspose.xps.metadata/ioptionitem) | Daftar item untuk ditambahkan. |

### add(InputBin.IInputBinOptionItem[] items) {#add-com.aspose.xps.metadata.InputBin.IInputBinOptionItem...-}
```
public InputBin.InputBinOption add(InputBin.IInputBinOptionItem[] items)
```


Menambahkan sebuah array dari  IInputBinOptionItem  instance ke opsi.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| items | [IInputBinOptionItem\[\]](../../com.aspose.xps.metadata/iinputbinoptionitem) | Sebuah array sewenang-wenang dari  IInputBinOptionItem  instance. |

**Returns:**
[InputBinOption](../../com.aspose.xps.metadata/inputbinoption) - This options instance.
### clone() {#clone--}
```
public InputBin.InputBinOption clone()
```


Menggandakan instance opsi ini.

**Returns:**
[InputBinOption](../../com.aspose.xps.metadata/inputbinoption) - The clone of this option instance.
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

