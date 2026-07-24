---
title: "System::Net::Sockets::NetworkStream::Read method"
linktitle: "Baca"
second_title: "Aspose.Page untuk C++"
description: "System::Net::Sockets::NetworkStream::Read method. Membaca sejumlah byte yang ditentukan dari aliran dan menuliskannya ke array byte yang ditentukan dalam C++."
type: docs
weight: 1900
url: /id/cpp/system.net.sockets/networkstream/read/
---
## NetworkStream::Read(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) method


Membaca sejumlah byte yang ditentukan dari aliran dan menuliskannya ke array byte yang ditentukan.

```cpp
int32_t System::Net::Sockets::NetworkStream::Read(const ArrayPtr<uint8_t> &buffer, int32_t offset, int32_t size) override
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| penyangga | const ArrayPtr\<uint8_t\>\& | Array byte tempat byte yang dibaca akan ditulis. |
| offset | int32_t | Offset dalam byte pada array yang ditentukan. |
| size | int32_t | Jumlah byte yang akan dibaca. |

### ReturnValue

Jumlah byte yang dibaca.

## Lihat Juga

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [NetworkStream](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## NetworkStream::Read(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) method


Membaca sejumlah byte yang ditentukan dari aliran dan menuliskannya ke array byte yang ditentukan.

```cpp
int32_t System::Net::Sockets::NetworkStream::Read(const System::Details::ArrayView<uint8_t> &buffer, int32_t offset, int32_t size) override
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| penyangga | const System::Details::ArrayView\<uint8_t\>\& | Tampilan array byte untuk menuliskan byte yang dibaca |
| offset | int32_t | Posisi berbasis 0 dalam **buffer** untuk memulai penulisan |
| size | int32_t | Jumlah byte yang akan dibaca |

### ReturnValue

Jumlah byte yang dibaca

## Lihat Juga

* Class [NetworkStream](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
