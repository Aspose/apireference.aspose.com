---
title: "metode System::IO::Stream::Read"
linktitle: "Baca"
second_title: "Aspose.Page untuk C++"
description: "metode System::IO::Stream::Read. Membaca sejumlah byte yang ditentukan dari aliran dan menuliskannya ke array byte yang ditentukan dalam C++."
type: docs
weight: 1800
url: /id/cpp/system.io/stream/read/
---
## Stream::Read(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) method


Membaca sejumlah byte yang ditentukan dari aliran dan menuliskannya ke array byte yang ditentukan.

```cpp
virtual int32_t System::IO::Stream::Read(const ArrayPtr<uint8_t> &buffer, int32_t offset, int32_t count)=0
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| penyangga | const ArrayPtr\<uint8_t\>\& | Array byte untuk menuliskan byte yang dibaca ke |
| offset | int32_t | Posisi berbasis 0 dalam **buffer** untuk memulai penulisan |
| count | int32_t | Jumlah byte yang akan dibaca |

### ReturnValue

Jumlah byte yang dibaca

## Lihat Juga

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [Stream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## Stream::Read(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) method


Membaca sejumlah byte yang ditentukan dari aliran dan menuliskannya ke array byte yang ditentukan.

```cpp
virtual int32_t System::IO::Stream::Read(const System::Details::ArrayView<uint8_t> &buffer, int32_t offset, int32_t count)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| penyangga | const System::Details::ArrayView\<uint8_t\>\& | Tampilan array byte untuk menuliskan byte yang dibaca |
| offset | int32_t | Posisi berbasis 0 dalam **buffer** untuk memulai penulisan |
| count | int32_t | Jumlah byte yang akan dibaca |

### ReturnValue

Jumlah byte yang dibaca

## Lihat Juga

* Class [Stream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## Stream::Read(const System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t) method


Membaca sejumlah byte yang ditentukan dari aliran dan menuliskannya ke array byte yang ditentukan.

```cpp
template<std::size_t> int32_t System::IO::Stream::Read(const System::Details::StackArray<uint8_t, N> &buffer, int32_t offset, int32_t count)
```


| Parameter | Deskripsi |
| --- | --- |
| N | Ukuran stack array |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| penyangga | const System::Details::StackArray\<uint8_t, N\>\& | Array tumpukan byte untuk menuliskan byte yang dibaca |
| offset | int32_t | Posisi berbasis 0 dalam **buffer** untuk memulai penulisan |
| count | int32_t | Jumlah byte yang akan dibaca |

### ReturnValue

Jumlah byte yang dibaca

## Lihat Juga

* Class [Stream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
