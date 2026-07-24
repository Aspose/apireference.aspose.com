---
title: "Metered"
second_title: "Aspose.Page for Java Referensi API"
description: "Menyediakan metode untuk mengatur kunci terukur."
type: docs
weight: 15
url: /id/java/com.aspose.page/metered/
---
**Inheritance:**
java.lang.Object
```
public final class Metered
```

Menyediakan metode untuk mengatur kunci terukur.

--------------------

Dalam contoh ini, percobaan akan dilakukan untuk mengatur kunci publik dan privat metered.

```
The component jar file:
  
 	Metered matered = new Metered();
 	matered.setMeteredKey("PublicKey", "PrivateKey");
```
## Konstruktor

| Konstruktor | Deskripsi |
| --- | --- |
| [Metered()](#Metered--) | Menginisialisasi instance baru dari kelas ini. |
## Metode

| Metode | Deskripsi |
| --- | --- |
| [clearMeteredLicense()](#clearMeteredLicense--) | Membersihkan lisensi metered |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [flush()](#flush--) | Membuang data hitungan pada server. |
| [getClass()](#getClass--) |  |
| [getConsumptionCredit()](#getConsumptionCredit--) | Mendapatkan kredit konsumsi |
| [getConsumptionQuantity()](#getConsumptionQuantity--) | Mendapatkan ukuran file konsumsi |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setMeteredKey(String publicKey, String privateKey)](#setMeteredKey-java.lang.String-java.lang.String-) | Mengatur kunci publik dan privat yang terukur |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### Metered() {#Metered--}
```
public Metered()
```


Menginisialisasi instance baru dari kelas ini.

### clearMeteredLicense() {#clearMeteredLicense--}
```
public static void clearMeteredLicense()
```


Membersihkan lisensi metered

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
### flush() {#flush--}
```
public static void flush()
```


Mengosongkan data hitungan pada server. Hanya digunakan untuk tujuan debug.

### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getConsumptionCredit() {#getConsumptionCredit--}
```
public static double getConsumptionCredit()
```


Mendapatkan kredit konsumsi

**Returns:**
double - kuantitas konsumsi
### getConsumptionQuantity() {#getConsumptionQuantity--}
```
public static double getConsumptionQuantity()
```


Mendapatkan ukuran file konsumsi

**Returns:**
double - kuantitas konsumsi
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




### setMeteredKey(String publicKey, String privateKey) {#setMeteredKey-java.lang.String-java.lang.String-}
```
public void setMeteredKey(String publicKey, String privateKey)
```


Mengatur kunci publik dan privat yang terukur

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| publicKey | java.lang.String | kunci publik |
| privateKey | java.lang.String | kunci privat |

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

