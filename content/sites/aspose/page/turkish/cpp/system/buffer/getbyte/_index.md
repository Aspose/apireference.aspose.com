---
title: "System::Buffer::GetByte yöntemi"
linktitle: "GetByte"
second_title: "Aspose.Page için C++"
description: "System::Buffer::GetByte yöntemi. Belirtilen tipli diziyi ham bayt dizisi olarak yorumlar ve C++'da belirtilen bayt ofsetindeki bayt değerini alır."
type: docs
weight: 300
url: /tr/cpp/system/buffer/getbyte/
---
## Buffer::GetByte(const SharedPtr\<Array\<T\>\>\&, int) method


Belirtilen tipli diziyi ham bayt dizisi olarak yorumlar ve belirtilen bayt ofsetindeki bayt değerini alır.

```cpp
template<typename T> static uint8_t System::Buffer::GetByte(const SharedPtr<Array<T>> &array, int index)
```


| Parameter | Açıklama |
| --- | --- |
| T | Dizinin öğelerinin tipi |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| dizi | const SharedPtr\<Array\<T\>\>\& | Hedef dizi |
| indeks | int | Alınacak baytin sıfır tabanlı ofseti |

### ReturnValue

Belirtilen indeksdeki bayt değeri

## Ayrıca Bakınız

* Typedef [SharedPtr](../../sharedptr/)
* Class [Array](../../array/)
* Class [Buffer](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Buffer::GetByte(const System::Details::ArrayView\<T\>\&, int) method


Belirtilen tipli diziyi ham bayt dizisi olarak yorumlar ve belirtilen bayt ofsetindeki bayt değerini alır.

```cpp
template<typename T> static uint8_t System::Buffer::GetByte(const System::Details::ArrayView<T> &array, int index)
```


| Parameter | Açıklama |
| --- | --- |
| T | Dizi görünümünün öğelerinin türü |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| dizi | const System::Details::ArrayView\<T\>\& | Hedef dizi görünümü |
| indeks | int | Alınacak baytin sıfır tabanlı ofseti |

### ReturnValue

Belirtilen indeksdeki bayt değeri

## Ayrıca Bakınız

* Class [Buffer](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Buffer::GetByte(const System::Details::StackArray\<T, N\>\&, int) method


Belirtilen tipli diziyi ham bayt dizisi olarak yorumlar ve belirtilen bayt ofsetindeki bayt değerini alır.

```cpp
template<typename T,std::size_t> static uint8_t System::Buffer::GetByte(const System::Details::StackArray<T, N> &array, int index)
```


| Parameter | Açıklama |
| --- | --- |
| T | Yığın dizisinin öğelerinin türü |
| N | Yığın dizisinin boyutu |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| dizi | const System::Details::StackArray\<T, N\>\& | Hedef yığın dizisi |
| indeks | int | Alınacak baytin sıfır tabanlı ofseti |

### ReturnValue

Belirtilen indeksdeki bayt değeri

## Ayrıca Bakınız

* Class [Buffer](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
