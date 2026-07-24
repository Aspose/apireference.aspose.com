---
title: "Lisensi"
second_title: "Aspose.Page for Java Referensi API"
description: "Menyediakan metode untuk melisensikan komponen."
type: docs
weight: 14
url: /id/java/com.aspose.page/license/
---
**Inheritance:**
java.lang.Object
```
public class License
```

Menyediakan metode untuk melisensikan komponen.

Dalam contoh ini, akan dilakukan upaya untuk menemukan file lisensi bernama MyLicense.lic di folder yang berisi komponen, di folder yang berisi assembly pemanggil, di folder assembly entri, dan kemudian di sumber daya tersemat dari assembly pemanggil.

License license = new License();
license.setLicense("MyLicense.lic");
## Konstruktor

| Konstruktor | Deskripsi |
| --- | --- |
| [License()](#License--) | Menginisialisasi instance baru dari kelas ini. |
## Metode

| Metode | Deskripsi |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [hashCode()](#hashCode--) |  |
| [isInternalFIPSSecurity()](#isInternalFIPSSecurity--) | Secara default kami menggunakan keamanan jdk default. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setInternalFIPSSecurity(boolean internalFIPSSecurity)](#setInternalFIPSSecurity-boolean-) | Secara default kami menggunakan keamanan jre default. |
| [setLicense(InputStream stream)](#setLicense-java.io.InputStream-) | Memberi lisensi pada komponen. |
| [setLicense(String licenseName)](#setLicense-java.lang.String-) | Memberi lisensi pada komponen. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### License() {#License--}
```
public License()
```


Menginisialisasi instance baru dari kelas ini.

Dalam contoh ini, akan dilakukan upaya untuk menemukan file lisensi bernama MyLicense.lic di folder yang berisi komponen, di folder yang berisi assembly pemanggil, di folder assembly entri, dan kemudian di sumber daya tersemat dari assembly pemanggil.

License license = new License();
license.setLicense("MyLicense.lic");

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
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### isInternalFIPSSecurity() {#isInternalFIPSSecurity--}
```
public static boolean isInternalFIPSSecurity()
```


Secara default kami menggunakan keamanan jdk default. Nilai default == false. Dalam beberapa kasus lingkungan java yang disesuaikan tidak dapat mendukung algoritma yang diperlukan, sehingga kami dapat menyarankan untuk menggunakan keamanan FIPS internal bawaan.

**Returns:**
boolean - nilai boolean
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### setInternalFIPSSecurity(boolean internalFIPSSecurity) {#setInternalFIPSSecurity-boolean-}
```
public static void setInternalFIPSSecurity(boolean internalFIPSSecurity)
```


Secara default kami menggunakan keamanan jre default. Nilai default == false. Dalam beberapa kasus lingkungan java yang disesuaikan tidak dapat mendukung algoritma yang diperlukan, sehingga kami dapat menyarankan untuk menggunakan keamanan FIPS internal bawaan.

Perhatikan juga: Menurut algoritma JVM SecureRandom pada beberapa sistem operasi /dev/random menunggu sejumlah \\u201cnoise\\u201d tertentu dihasilkan pada mesin host sebelum mengembalikan hasil. Perpustakaan yang digunakan untuk menghasilkan angka acak di JVM Oracle\\u2019s mengandalkan /dev/random secara default untuk platform UNIX. Meskipun /dev/random lebih aman, disarankan untuk menggunakan /dev/urandom jika konfigurasi JVM default mengalami penundaan, atau menambahkan perangkat yang menghasilkan entropi untuk /dev/random.

Opsi java berikut dapat membantu menghindari penundaan dan mengganti pengaturan securerandom.source. -Djava.security.egd=file:/dev/./urandom

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| internalFIPSSecurity | boolean | nilai boolean |

### setLicense(InputStream stream) {#setLicense-java.io.InputStream-}
```
public void setLicense(InputStream stream)
```


Memberi lisensi pada komponen.

Aliran yang berisi lisensi.

Gunakan metode ini untuk memuat lisensi dari aliran.

License license = new License();
license.setLicense(myStream);

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| aliran | java.io.InputStream | Aliran lisensi |

### setLicense(String licenseName) {#setLicense-java.lang.String-}
```
public void setLicense(String licenseName)
```


Memberi lisensi pada komponen.

Mencoba menemukan lisensi di lokasi berikut:

1. Jalur eksplisit.

2. Folder file jar komponen.

Dalam contoh ini, akan dilakukan upaya untuk menemukan file lisensi bernama MyLicense.lic di folder yang berisi komponen, di folder yang berisi assembly pemanggil, di folder assembly entri, dan kemudian di sumber daya tersemat dari assembly pemanggil.

License license = new License();
license.setLicense("MyLicense.lic");

**Parameters:**
| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| licenseName | java.lang.String | Dapat berupa nama file lengkap atau pendek atau nama sumber daya tersemat. Gunakan string kosong untuk beralih ke mode evaluasi |

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

