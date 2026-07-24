---
title: "Metode System::IO::StreamReader::Read"
linktitle: "Baca"
second_title: "Aspose.Page untuk C++"
description: "Metode System::IO::StreamReader::Read. Membaca satu karakter dari aliran dalam C++."
type: docs
weight: 900
url: /id/cpp/system.io/streamreader/read/
---
## StreamReader::Read() method


Membaca satu karakter dari aliran.

```cpp
virtual int System::IO::StreamReader::Read() override
```


### ReturnValue

Baca karakter yang dienkode dengan enkoding UTF-16; jika karakter yang dibaca diwakili oleh dua kode poin dalam enkoding UTF-16 maka hanya surragate tinggi yang dikembalikan.

## Lihat Juga

* Class [StreamReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StreamReader::Read(ArrayPtr\<char_t\>, int, int) method


Membaca sejumlah karakter yang ditentukan dari aliran, mengonversinya ke enkoding UTF-16, dan menulis karakter UTF-16 yang dihasilkan ke array karakter yang ditentukan mulai dari posisi yang ditentukan.

```cpp
virtual int System::IO::StreamReader::Read(ArrayPtr<char_t> buffer, int index, int count) override
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| penyangga | ArrayPtr\<char_t\> | Array karakter UTF-16 untuk menulis karakter yang dibaca dari aliran ke |
| indeks | int | Indeks berbasis-0 dalam **buffer** tempat memulai penulisan |
| count | int | Jumlah karakter yang akan dibaca dari aliran |

### ReturnValue

Jumlah karakter yang dibaca dari aliran

## Lihat Juga

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [StreamReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
