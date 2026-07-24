---
title: "Metode System::IO::BinaryReader::Read"
linktitle: "Baca"
second_title: "Aspose.Page untuk C++"
description: "Metode System::IO::BinaryReader::Read. Membaca satu karakter dari aliran masukan dalam C++."
type: docs
weight: 700
url: /id/cpp/system.io/binaryreader/read/
---
## BinaryReader::Read() method


Membaca satu karakter dari aliran input.

```cpp
virtual int System::IO::BinaryReader::Read()
```


### ReturnValue

Baca karakter yang dienkode dengan enkoding UTF-16; jika karakter yang dibaca diwakili oleh dua kode poin dalam enkoding UTF-16 maka hanya surragate tinggi yang dikembalikan.

## Lihat Juga

* Class [BinaryReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## BinaryReader::Read(ArrayPtr\<char_t\>, int, int) method


Membaca sejumlah karakter yang ditentukan dari aliran input, mengonversinya ke enkoding UTF-16 dan menuliskan karakter UTF-16 yang dihasilkan ke array karakter yang ditentukan mulai dari posisi yang ditentukan.

```cpp
virtual int System::IO::BinaryReader::Read(ArrayPtr<char_t> buffer, int index, int count)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| penyangga | ArrayPtr\<char_t\> | Array karakter UTF-16 untuk menulis karakter yang dibaca dari aliran masukan ke |
| indeks | int | Indeks berbasis-0 dalam **buffer** tempat memulai penulisan |
| count | int | Jumlah karakter yang akan dibaca dari aliran |

### ReturnValue

Jumlah karakter yang dibaca dari aliran masukan

## Lihat Juga

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [BinaryReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## BinaryReader::Read(ArrayPtr\<uint8_t\>, int, int) method


Membaca sejumlah byte yang ditentukan dari aliran input dan menuliskannya ke array byte yang ditentukan.

```cpp
virtual int System::IO::BinaryReader::Read(ArrayPtr<uint8_t> buffer, int index, int count)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| penyangga | ArrayPtr\<uint8_t\> | Array byte untuk menuliskan byte yang dibaca ke |
| indeks | int | Posisi berbasis 0 dalam **buffer** untuk memulai penulisan |
| count | int | Jumlah byte yang akan dibaca |

### ReturnValue

Jumlah byte yang dibaca

## Lihat Juga

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [BinaryReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
