---
title: "PageDeviceColorSpaceUsage.PageDeviceColorSpaceUsageOption"
second_title: "Aspose.Page for Java Referensi API"
description: "Menjelaskan opsi fitur PageDeviceColorSpaceUsage."
type: docs
weight: 10
url: /id/java/com.aspose.xps.metadata/pagedevicecolorspaceusage.pagedevicecolorspaceusageoption/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Option](../../com.aspose.xps.metadata/option)
```
public static final class PageDeviceColorSpaceUsage.PageDeviceColorSpaceUsageOption extends Option
```

Menjelaskan opsi fitur  PageDeviceColorSpaceUsage .
## Bidang

| Bidang | Deskripsi |
| --- | --- |
| [MatchToDefault](#MatchToDefault) | Jika perangkat menentukan bahwa profil yang ditentukan oleh parameter  PageDeviceColorSpaceProfileURI  dapat digunakan sebagai profil ruang warna perangkat, semua elemen yang menggunakan profil yang sama diperlakukan seolah-olah sudah ditentukan dalam ruang warna perangkat. |
| [OverrideDeviceDefault](#OverrideDeviceDefault) | Jika profil yang ditentukan oleh parameter PageDeviceColorSpaceProfileURI memiliki jumlah saluran yang cocok dengan jumlah primer perangkat, profil tersebut SHOULD digunakan sebagai pengganti manajemen warna internal perangkat untuk semua elemen. |
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
### MatchToDefault {#MatchToDefault}
```
public static PageDeviceColorSpaceUsage.PageDeviceColorSpaceUsageOption MatchToDefault
```


Jika perangkat menentukan bahwa profil yang ditentukan oleh parameter  PageDeviceColorSpaceProfileURI  dapat digunakan sebagai profil ruang warna perangkat, semua elemen yang menggunakan profil yang sama diperlakukan seolah-olah sudah ditentukan dalam ruang warna perangkat. Semua elemen lainnya HARUS menggunakan profil yang ditentukan untuk elemen tersebut. Jika profil tidak dapat digunakan sebagai profil ruang warna perangkat, elemen yang menggunakan profil HARUS dikelola warnanya seperti elemen lain yang menggunakan profil warna.

### OverrideDeviceDefault {#OverrideDeviceDefault}
```
public static PageDeviceColorSpaceUsage.PageDeviceColorSpaceUsageOption OverrideDeviceDefault
```


Jika profil yang ditentukan oleh parameter PageDeviceColorSpaceProfileURI memiliki jumlah saluran yang cocok dengan jumlah primer perangkat, profil tersebut SEHARUSNYA digunakan menggantikan manajemen warna internal perangkat untuk semua elemen. Elemen yang menggunakan profil ini diasumsikan berada dalam ruang warna perangkat dan tidak akan dikelola warnanya lebih lanjut.

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

