---
title: "System::IO::FileStream::Read metode"
linktitle: "Baca"
second_title: "Aspose.Page untuk C++"
description: "System::IO::FileStream::Read metode. Membaca sejumlah byte yang ditentukan dari aliran dan menuliskannya ke array byte yang ditentukan dalam C++."
type: docs
weight: 1300
url: /id/cpp/system.io/filestream/read/
---
## FileStream::Read(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) method


Membaca sejumlah byte yang ditentukan dari aliran dan menuliskannya ke array byte yang ditentukan.

```cpp
int32_t System::IO::FileStream::Read(const ArrayPtr<uint8_t> &buffer, int32_t offset, int32_t count) override
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| penyangga | const ArrayPtr\<uint8_t\>\& | Array byte untuk menulis byte yang dibaca ke dalamnya. |
| offset | int32_t | Posisi berbasis 0 dalam **buffer** untuk memulai penulisan. |
| count | int32_t | Jumlah byte yang akan dibaca. |

### ReturnValue

Jumlah byte yang dibaca.

## Lihat Juga

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [FileStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## FileStream::Read(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) method


Membaca sejumlah byte yang ditentukan dari aliran dan menuliskannya ke array byte yang ditentukan.

```cpp
int32_t System::IO::FileStream::Read(const System::Details::ArrayView<uint8_t> &buffer, int32_t offset, int32_t count) override
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| penyangga | const System::Details::ArrayView\<uint8_t\>\& | Tampilan array byte untuk menulis byte yang dibaca. |
| offset | int32_t | Posisi berbasis 0 dalam **buffer** untuk memulai penulisan. |
| count | int32_t | Jumlah byte yang akan dibaca. |

### ReturnValue

Jumlah byte yang dibaca.

## Lihat Juga

* Class [FileStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
