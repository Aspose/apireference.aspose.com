---
title: "System::IO::BasicSTDOStreamWrapper::Read metode"
linktitle: "Baca"
second_title: "Aspose.Page untuk C++"
description: "System::IO::BasicSTDOStreamWrapper::Read metode. Jika mode pembungkus adalah biner, membaca jumlah byte yang ditentukan dari aliran, jika tidak membaca jumlah karakter yang ditentukan dan mengonversinya ke tipe uint8_t. Menulis hasil pembacaan ke array byte yang ditentukan. Tidak didukung! dalam C++."
type: docs
weight: 400
url: /id/cpp/system.io/basicstdostreamwrapper/read/
---
## BasicSTDOStreamWrapper::Read(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) method


Jika mode pembungkus adalah biner, membaca jumlah byte yang ditentukan dari aliran, jika tidak membaca jumlah karakter yang ditentukan dan mengkonversinya ke tipe uint8_t. Menulis hasil pembacaan ke array byte yang ditentukan. Tidak didukung!

```cpp
virtual int32_t System::IO::BasicSTDOStreamWrapper<T, typename>::Read(const ArrayPtr<uint8_t> &buffer, int32_t offset, int32_t count) override
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| penyangga | const ArrayPtr\<uint8_t\>\& | Array byte untuk menuliskan byte yang dibaca ke |
| offset | int32_t | Posisi berbasis 0 dalam **buffer** untuk memulai penulisan |
| count | int32_t | Jumlah byte yang akan dibaca |

### ReturnValue

Jumlah byte atau karakter yang dibaca

## Lihat Juga

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [BasicSTDOStreamWrapper](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## BasicSTDOStreamWrapper::Read(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) method


Membaca sejumlah byte yang ditentukan dari aliran dan menuliskannya ke array byte yang ditentukan.

```cpp
virtual int32_t System::IO::BasicSTDOStreamWrapper<T, typename>::Read(const System::Details::ArrayView<uint8_t> &buffer, int32_t offset, int32_t count) override
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| penyangga | const System::Details::ArrayView\<uint8_t\>\& | Tampilan array byte untuk menuliskan byte yang dibaca |
| offset | int32_t | Posisi berbasis 0 dalam **buffer** untuk memulai penulisan |
| count | int32_t | Jumlah byte yang akan dibaca |

### ReturnValue

Jumlah byte yang dibaca

## Lihat Juga

* Class [BasicSTDOStreamWrapper](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
