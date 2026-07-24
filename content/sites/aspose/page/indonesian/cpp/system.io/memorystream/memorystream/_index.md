---
title: "System::IO::MemoryStream::MemoryStream constructor"
linktitle: "MemoryStream"
second_title: "Aspose.Page untuk C++"
description: "System::IO::MemoryStream::MemoryStream constructor. Membuat sebuah instance baru dari kelas MemoryStream dengan kapasitas awal sama dengan 0 dalam C++."
type: docs
weight: 100
url: /id/cpp/system.io/memorystream/memorystream/
---
## MemoryStream::MemoryStream() constructor


Membuat sebuah instance baru dari kelas [MemoryStream](../) dengan kapasitas awal sama dengan 0.

```cpp
System::IO::MemoryStream::MemoryStream()
```

## Lihat Juga

* Class [MemoryStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## MemoryStream::MemoryStream(const ArrayPtr\<uint8_t\>\&, bool) constructor


Membuat sebuah instance baru dari kelas [MemoryStream](../) yang mewakili aliran memori yang terhubung ke buffer memori yang ditentukan. Sebuah parameter menentukan apakah aliran dapat ditulisi.

```cpp
System::IO::MemoryStream::MemoryStream(const ArrayPtr<uint8_t> &content, bool writable=true)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| konten | const ArrayPtr\<uint8_t\>\& | Sebuah array byte yang akan digunakan sebagai buffer memori tempat aliran yang diwakili oleh objek yang sedang dibuat akan didasarkan |
| dapat ditulisi | bool | Menentukan apakah aliran harus dapat ditulisi |

## Lihat Juga

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [MemoryStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## MemoryStream::MemoryStream(const ArrayPtr\<uint8_t\>\&, int, int, bool, bool) constructor


Membuat sebuah instance baru dari kelas [MemoryStream](../) yang mewakili aliran memori yang terhubung ke segmen buffer memori yang ditentukan, dimulai pada indeks yang ditentukan dan mencakup sejumlah elemen yang ditentukan. Parameter menentukan apakah aliran dapat ditulisi dan apakah metode GetBytes() dapat dipanggil.

```cpp
System::IO::MemoryStream::MemoryStream(const ArrayPtr<uint8_t> &content, int index, int count, bool writable=true, bool publiclyVisible=false)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| konten | const ArrayPtr\<uint8_t\>\& | Sebuah array byte yang segmennya akan digunakan sebagai buffer memori tempat aliran yang diwakili oleh objek yang sedang dibuat akan didasarkan |
| indeks | int | Indeks berbasis 0 dari elemen dalam **content** tempat segmen dimulai |
| count | int | Jumlah elemen **content** yang termasuk dalam segmen |
| dapat ditulisi | bool | Menentukan apakah aliran harus dapat ditulisi |
| publiclyVisible | bool | Menentukan apakah buffer memori yang mendasari harus tersedia bagi pemanggil metode GetByte() |

## Lihat Juga

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [MemoryStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## MemoryStream::MemoryStream(int) constructor


Membuat sebuah instance baru dari kelas [MemoryStream](../) yang mewakili aliran berbasis pada buffer memori dengan ukuran yang ditentukan.

```cpp
System::IO::MemoryStream::MemoryStream(int capacity_)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| capacity_ | int | Ukuran dalam byte dari buffer memori yang terkait dengan aliran yang diwakili oleh objek yang sedang dibuat |

## Lihat Juga

* Class [MemoryStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
