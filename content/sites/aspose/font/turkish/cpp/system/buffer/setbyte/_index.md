---
title: "System::Buffer::SetByte yöntemi"
linktitle: "SetByte"
second_title: "Aspose.Font için C++"
description: "System::Buffer::SetByte yöntemi. Belirtilen tipli diziyi ham bayt dizisi olarak yorumlar ve C++'da belirtilen bayt ofsetinde belirtilen bayt değerini ayarlar."
type: docs
weight: 400
url: /tr/cpp/system/buffer/setbyte/
---
## Buffer::SetByte(const SharedPtr\<Array\<T\>\>\&, int, uint8_t) method


Belirtilen tipli dizi, ham bayt dizisi olarak yorumlanır ve belirtilen bayt ofsetindeki bayt değeri ayarlanır.

```cpp
template<typename T> static void System::Buffer::SetByte(const SharedPtr<Array<T>> &array, int index, uint8_t value)
```


| Parametre | Açıklama |
| --- | --- |
| T | Dizinin öğelerinin tipi |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| dizi | const SharedPtr\<Array\<T\>\>\& | Hedef dizi |
| indeks | int | Ayarlanacak baytin sıfır tabanlı ofseti |
| değer | uint8_t | Ayarlanacak bayt değeri |

## Ayrıca Bakınız

* Typedef [SharedPtr](../../sharedptr/)
* Class [Array](../../array/)
* Class [Buffer](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Buffer::SetByte(const System::Details::ArrayView\<T\>\&, int, uint8_t) method


Belirtilen tipli dizi, ham bayt dizisi olarak yorumlanır ve belirtilen bayt ofsetindeki bayt değeri ayarlanır.

```cpp
template<typename T> static void System::Buffer::SetByte(const System::Details::ArrayView<T> &array, int index, uint8_t value)
```


| Parametre | Açıklama |
| --- | --- |
| T | Dizinin öğelerinin tipi |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| dizi | const System::Details::ArrayView\<T\>\& | Hedef dizi görünümü |
| indeks | int | Ayarlanacak baytin sıfır tabanlı ofseti |
| değer | uint8_t | Ayarlanacak bayt değeri |

## Ayrıca Bakınız

* Class [Buffer](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Buffer::SetByte(const System::Details::StackArray\<T, N\>\&, int, uint8_t) method


Belirtilen tipli dizi, ham bayt dizisi olarak yorumlanır ve belirtilen bayt ofsetindeki bayt değeri ayarlanır.

```cpp
template<typename T,std::size_t> static void System::Buffer::SetByte(const System::Details::StackArray<T, N> &array, int index, uint8_t value)
```


| Parametre | Açıklama |
| --- | --- |
| T | Dizinin öğelerinin tipi |
| N | Yığın dizisinin boyutu |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| dizi | const System::Details::StackArray\<T, N\>\& | Hedef yığın dizisi |
| indeks | int | Ayarlanacak baytin sıfır tabanlı ofseti |
| değer | uint8_t | Ayarlanacak bayt değeri |

## Ayrıca Bakınız

* Class [Buffer](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
