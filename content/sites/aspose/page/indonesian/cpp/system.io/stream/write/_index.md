---
title: "System::IO::Stream::Write method"
linktitle: "Write"
second_title: "Aspose.Page untuk C++"
description: "System::IO::Stream::Write method. Menulis subrentang byte yang ditentukan dari array byte yang ditentukan ke aliran dalam C++."
type: docs
weight: 2600
url: /id/cpp/system.io/stream/write/
---
## Stream::Write(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) method


Menulis subrentang byte yang ditentukan dari array byte yang ditentukan ke aliran.

```cpp
virtual void System::IO::Stream::Write(const ArrayPtr<uint8_t> &buffer, int32_t offset, int32_t count)=0
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| penyangga | const ArrayPtr\<uint8_t\>\& | Array yang berisi byte untuk ditulis |
| offset | int32_t | Indeks berbasis 0 dari elemen dalam **buffer** tempat subrentang yang akan ditulis dimulai |
| count | int32_t | Jumlah elemen dalam subrentang yang akan ditulis |

## Lihat Juga

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [Stream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## Stream::Write(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) method


Menulis subrentang byte yang ditentukan dari array byte yang ditentukan ke aliran.

```cpp
virtual void System::IO::Stream::Write(const System::Details::ArrayView<uint8_t> &buffer, int32_t offset, int32_t count)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| penyangga | const System::Details::ArrayView\<uint8_t\>\& | Tampilan array yang berisi byte yang akan ditulis |
| offset | int32_t | Indeks berbasis 0 dari elemen dalam **buffer** tempat subrentang yang akan ditulis dimulai |
| count | int32_t | Jumlah elemen dalam subrentang yang akan ditulis |

## Lihat Juga

* Class [Stream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## Stream::Write(const System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t) method


Menulis subrentang byte yang ditentukan dari array byte yang ditentukan ke aliran.

```cpp
template<std::size_t> void System::IO::Stream::Write(const System::Details::StackArray<uint8_t, N> &buffer, int32_t offset, int32_t count)
```


| Parameter | Deskripsi |
| --- | --- |
| N | Ukuran stack array |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| penyangga | const System::Details::StackArray\<uint8_t, N\>\& | Array stack yang berisi byte untuk ditulis |
| offset | int32_t | Indeks berbasis 0 dari elemen dalam **buffer** tempat subrentang yang akan ditulis dimulai |
| count | int32_t | Jumlah elemen dalam subrentang yang akan ditulis |

## Lihat Juga

* Class [Stream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
