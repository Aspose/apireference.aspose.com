---
title: "System::IO::BasicSTDOStreamWrapper::Write metode"
linktitle: "Write"
second_title: "Aspose.Page untuk C++"
description: "System::IO::BasicSTDOStreamWrapper::Write metode. Jika mode pembungkus adalah biner, menulis ke stream subrentang byte yang ditentukan dari array byte yang ditentukan, jika tidak mengonversi subrentang byte yang ditentukan dari array byte yang ditentukan ke tipe char_type dan kemudian menulis hasil ke stream dalam C++."
type: docs
weight: 700
url: /id/cpp/system.io/basicstdostreamwrapper/write/
---
## BasicSTDOStreamWrapper::Write(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) method


Jika mode pembungkus adalah biner, menulis ke stream subrentang byte yang ditentukan dari array byte yang ditentukan, jika tidak mengonversi subrentang byte yang ditentukan dari array byte yang ditentukan ke tipe [char_type](../char_type/) dan kemudian menulis hasil ke stream.

```cpp
virtual void System::IO::BasicSTDOStreamWrapper<T, typename>::Write(const ArrayPtr<uint8_t> &buffer, int32_t offset, int32_t count) override
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| penyangga | const ArrayPtr\<uint8_t\>\& | Array yang berisi byte untuk ditulis |
| offset | int32_t | Indeks berbasis 0 dari elemen dalam **buffer** di mana subrentang yang akan ditulis dimulai |
| count | int32_t | Jumlah elemen dalam subrentang yang akan ditulis |

## Lihat Juga

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [BasicSTDOStreamWrapper](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## BasicSTDOStreamWrapper::Write(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) method


Menulis subrentang byte yang ditentukan dari array byte yang ditentukan ke aliran.

```cpp
virtual void System::IO::BasicSTDOStreamWrapper<T, typename>::Write(const System::Details::ArrayView<uint8_t> &buffer, int32_t offset, int32_t count) override
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| penyangga | const System::Details::ArrayView\<uint8_t\>\& | Tampilan array yang berisi byte yang akan ditulis |
| offset | int32_t | Indeks berbasis 0 dari elemen dalam **buffer** tempat subrentang yang akan ditulis dimulai |
| count | int32_t | Jumlah elemen dalam subrentang yang akan ditulis |

## Lihat Juga

* Class [BasicSTDOStreamWrapper](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
