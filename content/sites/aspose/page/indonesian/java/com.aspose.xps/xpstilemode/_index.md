---
title: "XpsTileMode"
second_title: "Aspose.Page for Java Referensi API"
description: "Nilai yang valid untuk properti TileMode pada kuas ubin."
type: docs
weight: 66
url: /id/java/com.aspose.xps/xpstilemode/
---
**Inheritance:**
java.lang.Object, java.lang.Enum
```
public enum XpsTileMode extends Enum<XpsTileMode>
```

Nilai yang valid untuk properti TileMode kuas ubin.
## Bidang

| Bidang | Deskripsi |
| --- | --- |
| [FlipX](#FlipX) | Pengaturan ubin mirip dengan Tile tile mode, tetapi kolom ubin alternatif dibalik secara horizontal. |
| [FlipXY](#FlipXY) | Pengaturan ubin mirip dengan Tile tile mode, tetapi kolom ubin alternatif dibalik secara horizontal dan baris ubin alternatif dibalik secara vertikal. |
| [FlipY](#FlipY) | Pengaturan ubin mirip dengan Tile tile mode, tetapi baris ubin alternatif dibalik secara vertikal. |
| [None](#None) | Dalam mode ini, hanya ubin dasar tunggal yang digambar. |
| [Tile](#Tile) | Dalam mode ini, ubin dasar digambar dan area yang tersisa diisi dengan mengulang ubin dasar sehingga tepi kanan setiap ubin bersebelahan dengan tepi kiri ubin berikutnya, dan tepi bawah setiap ubin bersebelahan dengan tepi atas ubin berikutnya. |
## Metode

| Metode | Deskripsi |
| --- | --- |
| [<T>valueOf(Class<T> arg0, String arg1)](#-T-valueOf-java.lang.Class-T--java.lang.String-) |  |
| [compareTo(E arg0)](#compareTo-E-) |  |
| [describeConstable()](#describeConstable--) |  |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getDeclaringClass()](#getDeclaringClass--) |  |
| [hashCode()](#hashCode--) |  |
| [name()](#name--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [ordinal()](#ordinal--) |  |
| [toString()](#toString--) |  |
| [valueOf(String name)](#valueOf-java.lang.String-) |  |
| [values()](#values--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### FlipX {#FlipX}
```
public static final XpsTileMode FlipX
```


Pengaturan ubin mirip dengan Tile tile mode, tetapi kolom ubin alternatif dibalik secara horizontal. Ubin dasar diposisikan sesuai yang ditentukan oleh viewport. Ubin-ubin di kolom kiri dan kanan ubin ini dibalik secara horizontal.

### FlipXY {#FlipXY}
```
public static final XpsTileMode FlipXY
```


Pengaturan ubin mirip dengan Tile tile mode, tetapi kolom ubin alternatif dibalik secara horizontal dan baris ubin alternatif dibalik secara vertikal. Ubin dasar diposisikan sesuai yang ditentukan oleh viewport.

### FlipY {#FlipY}
```
public static final XpsTileMode FlipY
```


Pengaturan ubin mirip dengan Tile tile mode, tetapi baris ubin alternatif dibalik secara vertikal. Ubin dasar diposisikan sesuai yang ditentukan oleh viewport. Baris di atas dan di bawah dibalik secara vertikal.

### None {#None}
```
public static final XpsTileMode None
```


Dalam mode ini, hanya ubin dasar tunggal yang digambar. Area yang tersisa dibiarkan transparan.

### Tile {#Tile}
```
public static final XpsTileMode Tile
```


Dalam mode ini, ubin dasar digambar dan area yang tersisa diisi dengan mengulang ubin dasar sehingga tepi kanan setiap ubin bersebelahan dengan tepi kiri ubin berikutnya, dan tepi bawah setiap ubin bersebelahan dengan tepi atas ubin berikutnya.

### <T>valueOf(Class<T> arg0, String arg1) {#-T-valueOf-java.lang.Class-T--java.lang.String-}
```
public static T <T>valueOf(Class<T> arg0, String arg1)
```




**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| arg0 | java.lang.Class<T> |  |
| arg1 | java.lang.String |  |

**Returns:**
T
### compareTo(E arg0) {#compareTo-E-}
```
public final int compareTo(E arg0)
```




**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| arg0 | E |  |

**Returns:**
int
### describeConstable() {#describeConstable--}
```
public final Optional<Enum.EnumDesc<E>> describeConstable()
```




**Returns:**
java.util.Optional<java.lang.Enum.EnumDesc<E>>
### equals(Object arg0) {#equals-java.lang.Object-}
```
public final boolean equals(Object arg0)
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
### getDeclaringClass() {#getDeclaringClass--}
```
public final Class<E> getDeclaringClass()
```




**Returns:**
java.lang.Class<E>
### hashCode() {#hashCode--}
```
public final int hashCode()
```




**Returns:**
int
### name() {#name--}
```
public final String name()
```




**Returns:**
java.lang.String
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### ordinal() {#ordinal--}
```
public final int ordinal()
```




**Returns:**
int
### toString() {#toString--}
```
public String toString()
```




**Returns:**
java.lang.String
### valueOf(String name) {#valueOf-java.lang.String-}
```
public static XpsTileMode valueOf(String name)
```




**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| nama | java.lang.String |  |

**Returns:**
[XpsTileMode](../../com.aspose.xps/xpstilemode)
### values() {#values--}
```
public static XpsTileMode[] values()
```




**Returns:**
com.aspose.xps.XpsTileMode[]
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

