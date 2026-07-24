---
title: "PdfEncryptionDetails"
second_title: "Aspose.Page for Java Referensi API"
description: "Berisi detail untuk enkripsi pdf."
type: docs
weight: 13
url: /id/java/com.aspose.xps.rendering/pdfencryptiondetails/
---
**Inheritance:**
java.lang.Object
```
public class PdfEncryptionDetails
```

Berisi detail untuk enkripsi pdf.
## Konstruktor

| Konstruktor | Deskripsi |
| --- | --- |
| [PdfEncryptionDetails(String userPassword, String ownerPassword, int permissions, PdfEncryptionAlgorithm encryptionAlgorithm)](#PdfEncryptionDetails-java.lang.String-java.lang.String-int-com.aspose.xps.rendering.PdfEncryptionAlgorithm-) | Menginisialisasi sebuah instance baru dari kelas  PdfEncryptionDetailsCore . |
## Metode

| Metode | Deskripsi |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getEncryptionAlgorithm()](#getEncryptionAlgorithm--) | Mengembalikan mode enkripsi. |
| [getOwnerPassword()](#getOwnerPassword--) | Mengembalikan kata sandi pemilik. |
| [getPermissions()](#getPermissions--) | Mengembalikan izin. |
| [getUserPassword()](#getUserPassword--) | Mengembalikan kata sandi pengguna. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setEncryptionAlgorithm(PdfEncryptionAlgorithm value)](#setEncryptionAlgorithm-com.aspose.xps.rendering.PdfEncryptionAlgorithm-) | Mengatur mode enkripsi. |
| [setOwnerPassword(String value)](#setOwnerPassword-java.lang.String-) | Mengatur kata sandi pemilik. |
| [setPermissions(int value)](#setPermissions-int-) | Mengatur izin. |
| [setUserPassword(String value)](#setUserPassword-java.lang.String-) | Mengatur kata sandi pengguna. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### PdfEncryptionDetails(String userPassword, String ownerPassword, int permissions, PdfEncryptionAlgorithm encryptionAlgorithm) {#PdfEncryptionDetails-java.lang.String-java.lang.String-int-com.aspose.xps.rendering.PdfEncryptionAlgorithm-}
```
public PdfEncryptionDetails(String userPassword, String ownerPassword, int permissions, PdfEncryptionAlgorithm encryptionAlgorithm)
```


Menginisialisasi sebuah instance baru dari kelas  PdfEncryptionDetailsCore .

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| userPassword | java.lang.String | Kata sandi pengguna. |
| ownerPassword | java.lang.String | Kata sandi pemilik. |
| permissions | int | Izin. |
| encryptionAlgorithm | [PdfEncryptionAlgorithm](../../com.aspose.xps.rendering/pdfencryptionalgorithm) | Algoritma enkripsi. |

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
### getEncryptionAlgorithm() {#getEncryptionAlgorithm--}
```
public PdfEncryptionAlgorithm getEncryptionAlgorithm()
```


Mengembalikan mode enkripsi.

**Returns:**
[PdfEncryptionAlgorithm](../../com.aspose.xps.rendering/pdfencryptionalgorithm) - The encryption algorithm.
### getOwnerPassword() {#getOwnerPassword--}
```
public String getOwnerPassword()
```


Mengembalikan kata sandi pemilik.

Membuka dokumen dengan kata sandi pemilik yang benar (dengan asumsi tidak sama dengan kata sandi pengguna) memungkinkan akses penuh (pemilik) ke dokumen. Akses tak terbatas ini mencakup kemampuan untuk mengubah kata sandi dokumen\u2019s dan izin akses.

**Returns:**
java.lang.String - Kata sandi pemilik.
### getPermissions() {#getPermissions--}
```
public int getPermissions()
```


Mengembalikan izin.

**Returns:**
int - Izin.
### getUserPassword() {#getUserPassword--}
```
public String getUserPassword()
```


Mengembalikan kata sandi pengguna.

Membuka dokumen dengan kata sandi pengguna yang benar (atau membuka dokumen yang tidak memiliki kata sandi pengguna) memungkinkan operasi tambahan dilakukan sesuai dengan izin akses pengguna yang ditentukan dalam kamus enkripsi dokumen\u2019s.

**Returns:**
java.lang.String - Kata sandi pengguna.
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




### setEncryptionAlgorithm(PdfEncryptionAlgorithm value) {#setEncryptionAlgorithm-com.aspose.xps.rendering.PdfEncryptionAlgorithm-}
```
public void setEncryptionAlgorithm(PdfEncryptionAlgorithm value)
```


Mengatur mode enkripsi.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| value | [PdfEncryptionAlgorithm](../../com.aspose.xps.rendering/pdfencryptionalgorithm) | Algoritma enkripsi. |

### setOwnerPassword(String value) {#setOwnerPassword-java.lang.String-}
```
public void setOwnerPassword(String value)
```


Mengatur kata sandi pemilik.

Membuka dokumen dengan kata sandi pemilik yang benar (dengan asumsi tidak sama dengan kata sandi pengguna) memungkinkan akses penuh (pemilik) ke dokumen. Akses tak terbatas ini mencakup kemampuan untuk mengubah kata sandi dokumen\u2019s dan izin akses.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| nilai | java.lang.String | Kata sandi pemilik. |

### setPermissions(int value) {#setPermissions-int-}
```
public void setPermissions(int value)
```


Mengatur izin.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| nilai | int | Izin. |

### setUserPassword(String value) {#setUserPassword-java.lang.String-}
```
public void setUserPassword(String value)
```


Mengatur kata sandi pengguna.

Membuka dokumen dengan kata sandi pengguna yang benar (atau membuka dokumen yang tidak memiliki kata sandi pengguna) memungkinkan operasi tambahan dilakukan sesuai dengan izin akses pengguna yang ditentukan dalam kamus enkripsi dokumen\u2019s.

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| nilai | java.lang.String | Kata sandi pengguna. |

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

