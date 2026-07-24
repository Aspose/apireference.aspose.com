---
title: "metode System::Buffer::GetByte"
linktitle: "GetByte"
second_title: "Aspose.Page untuk C++"
description: "metode System::Buffer::GetByte. Menginterpretasikan array bertipe yang ditentukan sebagai array byte mentah dan mengambil nilai byte pada offset byte yang ditentukan dalam C++."
type: docs
weight: 300
url: /id/cpp/system/buffer/getbyte/
---
## Buffer::GetByte(const SharedPtr\<Array\<T\>\>\&, int) method


Menginterpretasikan array bertipe yang ditentukan sebagai array byte mentah dan mengambil nilai byte pada offset byte yang ditentukan.

```cpp
template<typename T> static uint8_t System::Buffer::GetByte(const SharedPtr<Array<T>> &array, int index)
```


| Parameter | Deskripsi |
| --- | --- |
| T | Tipe elemen array |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| array | const SharedPtr\<Array\<T\>\>\& | Array target |
| indeks | int | Offset berbasis nol dari byte yang akan diambil |

### ReturnValue

Nilai byte pada indeks yang ditentukan

## Lihat Juga

* Typedef [SharedPtr](../../sharedptr/)
* Class [Array](../../array/)
* Class [Buffer](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Buffer::GetByte(const System::Details::ArrayView\<T\>\&, int) method


Menginterpretasikan array bertipe yang ditentukan sebagai array byte mentah dan mengambil nilai byte pada offset byte yang ditentukan.

```cpp
template<typename T> static uint8_t System::Buffer::GetByte(const System::Details::ArrayView<T> &array, int index)
```


| Parameter | Deskripsi |
| --- | --- |
| T | Tipe elemen dari tampilan array |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| array | const System::Details::ArrayView\<T\>\& | Tampilan array target |
| indeks | int | Offset berbasis nol dari byte yang akan diambil |

### ReturnValue

Nilai byte pada indeks yang ditentukan

## Lihat Juga

* Class [Buffer](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Buffer::GetByte(const System::Details::StackArray\<T, N\>\&, int) method


Menginterpretasikan array bertipe yang ditentukan sebagai array byte mentah dan mengambil nilai byte pada offset byte yang ditentukan.

```cpp
template<typename T,std::size_t> static uint8_t System::Buffer::GetByte(const System::Details::StackArray<T, N> &array, int index)
```


| Parameter | Deskripsi |
| --- | --- |
| T | Tipe elemen dari array stack |
| N | Ukuran stack array |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| array | const System::Details::StackArray\<T, N\>\& | Stack array target |
| indeks | int | Offset berbasis nol dari byte yang akan diambil |

### ReturnValue

Nilai byte pada indeks yang ditentukan

## Lihat Juga

* Class [Buffer](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
