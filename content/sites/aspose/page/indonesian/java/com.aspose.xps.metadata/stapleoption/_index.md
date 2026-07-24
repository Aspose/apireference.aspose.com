---
title: "Staple.StapleOption"
second_title: "Aspose.Page for Java Referensi API"
description: "Menggambarkan opsi fitur JobStapleAllDocuments dan DocumentStaple."
type: docs
weight: 10
url: /id/java/com.aspose.xps.metadata/staple.stapleoption/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Option](../../com.aspose.xps.metadata/option)
```
public static final class Staple.StapleOption extends Option
```

Menjelaskan opsi fitur JobStapleAllDocuments dan DocumentStaple.
## Konstruktor

| Konstruktor | Deskripsi |
| --- | --- |
| [StapleOption(String optionName, Staple.IStapleOptionItem[] items)](#StapleOption-java.lang.String-com.aspose.xps.metadata.Staple.IStapleOptionItem...-) | Membuat sebuah instance baru. |
## Bidang

| Bidang | Deskripsi |
| --- | --- |
| [None](#None) | Menentukan tidak ada penjepitan. |
| [SaddleStitch](#SaddleStitch) | Menentukan penjepitan jahitan sadel. |
| [StapleBottomLeft](#StapleBottomLeft) | Menentukan satu paku di sudut kiri bawah. |
| [StapleBottomRight](#StapleBottomRight) | Menentukan satu paku di sudut kanan bawah. |
| [StapleDualBottom](#StapleDualBottom) | Menentukan dua paku sepanjang tepi bawah. |
| [StapleDualLeft](#StapleDualLeft) | Menentukan dua paku sepanjang tepi kiri. |
| [StapleDualRight](#StapleDualRight) | Menentukan dua paku sepanjang tepi kanan. |
| [StapleDualTop](#StapleDualTop) | Menentukan dua paku sepanjang tepi atas |
| [StapleTopLeft](#StapleTopLeft) | Menentukan satu paku di sudut kiri atas. |
| [StapleTopRight](#StapleTopRight) | Menentukan satu paku di sudut kanan atas. |
## Metode

| Metode | Deskripsi |
| --- | --- |
| [add(IOptionItem[] items)](#add-com.aspose.xps.metadata.IOptionItem...-) | Menambahkan daftar item ke akhir daftar item opsi ini. |
| [add(Staple.IStapleOptionItem[] items)](#add-com.aspose.xps.metadata.Staple.IStapleOptionItem...-) | Menambahkan array dari  IStapleOptionItem  ke fitur. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getName()](#getName--) | Mendapatkan nama elemen. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setAngle(int angle)](#setAngle-int-) | Mengatur nilai properti terukur  Angle . |
| [setSheetCapacity(int sheetCapacity)](#setSheetCapacity-int-) | Mengatur nilai properti terukur  SheetCapacity . |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### StapleOption(String optionName, Staple.IStapleOptionItem[] items) {#StapleOption-java.lang.String-com.aspose.xps.metadata.Staple.IStapleOptionItem...-}
```
public StapleOption(String optionName, Staple.IStapleOptionItem[] items)
```


Membuat sebuah instance baru.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| optionName | java.lang.String | Nama opsi. |
| items | [IStapleOptionItem\[\]](../../com.aspose.xps.metadata/istapleoptionitem) | Array sewenang-wenang dari  IStapleOptionItem . |

### None {#None}
```
public static final Staple.StapleOption None
```


Menentukan tidak ada penjepitan.

### SaddleStitch {#SaddleStitch}
```
public static final Staple.StapleOption SaddleStitch
```


Menentukan penjepitan jahitan sadel.

### StapleBottomLeft {#StapleBottomLeft}
```
public static final Staple.StapleOption StapleBottomLeft
```


Menentukan satu paku di sudut kiri bawah.

### StapleBottomRight {#StapleBottomRight}
```
public static final Staple.StapleOption StapleBottomRight
```


Menentukan satu paku di sudut kanan bawah.

### StapleDualBottom {#StapleDualBottom}
```
public static final Staple.StapleOption StapleDualBottom
```


Menentukan dua paku sepanjang tepi bawah.

### StapleDualLeft {#StapleDualLeft}
```
public static final Staple.StapleOption StapleDualLeft
```


Menentukan dua paku sepanjang tepi kiri.

### StapleDualRight {#StapleDualRight}
```
public static final Staple.StapleOption StapleDualRight
```


Menentukan dua paku sepanjang tepi kanan.

### StapleDualTop {#StapleDualTop}
```
public static final Staple.StapleOption StapleDualTop
```


Menentukan dua paku sepanjang tepi atas

### StapleTopLeft {#StapleTopLeft}
```
public static final Staple.StapleOption StapleTopLeft
```


Menentukan satu paku di sudut kiri atas.

### StapleTopRight {#StapleTopRight}
```
public static final Staple.StapleOption StapleTopRight
```


Menentukan satu paku di sudut kanan atas.

### add(IOptionItem[] items) {#add-com.aspose.xps.metadata.IOptionItem...-}
```
public void add(IOptionItem[] items)
```


Menambahkan daftar item ke akhir daftar item opsi ini. Setiap item harus berupa instance  ScoredProperty  atau  Property .

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| items | [IOptionItem\[\]](../../com.aspose.xps.metadata/ioptionitem) | Daftar item untuk ditambahkan. |

### add(Staple.IStapleOptionItem[] items) {#add-com.aspose.xps.metadata.Staple.IStapleOptionItem...-}
```
public Staple.StapleOption add(Staple.IStapleOptionItem[] items)
```


Menambahkan array dari  IStapleOptionItem  ke fitur.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| items | [IStapleOptionItem\[\]](../../com.aspose.xps.metadata/istapleoptionitem) | Array sewenang-wenang dari  IStapleOptionItem . |

**Returns:**
[StapleOption](../../com.aspose.xps.metadata/stapleoption) - This options instance.
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




### setAngle(int angle) {#setAngle-int-}
```
public final Staple.StapleOption setAngle(int angle)
```


Mengatur nilai properti terukur  Angle .

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| angle | int | Nilai properti terukur  Angle . |

**Returns:**
[StapleOption](../../com.aspose.xps.metadata/stapleoption) - This option instance.
### setSheetCapacity(int sheetCapacity) {#setSheetCapacity-int-}
```
public final Staple.StapleOption setSheetCapacity(int sheetCapacity)
```


Mengatur nilai properti terukur  SheetCapacity .

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| sheetCapacity | int | Nilai properti terukur  SheetCapacity . |

**Returns:**
[StapleOption](../../com.aspose.xps.metadata/stapleoption) - This option instance.
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

