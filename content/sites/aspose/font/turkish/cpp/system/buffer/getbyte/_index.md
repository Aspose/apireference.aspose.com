---
title: "System::Buffer::GetByte metodu"
linktitle: "GetByte"
second_title: "Aspose.Font için C++"
description: "System::Buffer::GetByte metodu. Belirtilen tipli diziyi ham bayt dizisi olarak yorumlar ve C++'da belirtilen bayt ofsetindeki bayt değerini alır."
type: docs
weight: 300
url: /tr/cpp/system/buffer/getbyte/
---
## Buffer::GetByte(const SharedPtr\<Array\<T\>\>\&, int) method


Belirtilen tipli dizi, ham bayt dizisi olarak yorumlanır ve belirtilen bayt ofsetindeki bayt değeri alınır.

```cpp
template<typename T> static uint8_t System::Buffer::GetByte(const SharedPtr<Array<T>> &array, int index)
```


| Parametre | Açıklama |
| --- | --- |
| T | Dizinin öğelerinin tipi |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| dizi | const SharedPtr\<Array\<T\>\>\& | Hedef dizi |
| indeks | int | Alınacak baytın sıfır tabanlı ofseti |

### ReturnValue

Belirtilen indeksdeki bayt değeri

## Ayrıca Bakınız

* Typedef [SharedPtr](../../sharedptr/)
* Class [Array](../../array/)
* Class [Buffer](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Buffer::GetByte(const System::Details::ArrayView\<T\>\&, int) method


Belirtilen tipli dizi, ham bayt dizisi olarak yorumlanır ve belirtilen bayt ofsetindeki bayt değeri alınır.

```cpp
template<typename T> static uint8_t System::Buffer::GetByte(const System::Details::ArrayView<T> &array, int index)
```


| Parametre | Açıklama |
| --- | --- |
| T | Dizi görünümünün öğelerinin türü |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| dizi | const System::Details::ArrayView\<T\>\& | Hedef dizi görünümü |
| indeks | int | Alınacak baytın sıfır tabanlı ofseti |

### ReturnValue

Belirtilen indeksdeki bayt değeri

## Ayrıca Bakınız

* Class [Buffer](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Buffer::GetByte(const System::Details::StackArray\<T, N\>\&, int) method


Belirtilen tipli dizi, ham bayt dizisi olarak yorumlanır ve belirtilen bayt ofsetindeki bayt değeri alınır.

```cpp
template<typename T,std::size_t> static uint8_t System::Buffer::GetByte(const System::Details::StackArray<T, N> &array, int index)
```


| Parametre | Açıklama |
| --- | --- |
| T | Yığın dizisinin öğelerinin türü |
| N | Yığın dizisinin boyutu |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| dizi | const System::Details::StackArray\<T, N\>\& | Hedef yığın dizisi |
| indeks | int | Alınacak baytın sıfır tabanlı ofseti |

### ReturnValue

Belirtilen indeksdeki bayt değeri

## Ayrıca Bakınız

* Class [Buffer](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
