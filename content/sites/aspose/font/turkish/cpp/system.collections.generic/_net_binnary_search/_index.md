---
title: "System::Collections::Generic::_net_binnary_search yöntemi"
linktitle: "_net_binnary_search"
second_title: "Aspose.Font için C++"
description: "System::Collections::Generic::_net_binnary_search yöntemi. Rastgele erişimli konteynerde ikili arama uygular. Akıllı işaretçiler için özelleştirme. C++'ta System::Object::CompareTo yöntemini kullanır."
type: docs
weight: 4900
url: /tr/cpp/system.collections.generic/_net_binnary_search/
---
## System::Collections::Generic::_net_binnary_search(const containterT\<T, Allocator\>\&, int, int, T) method


Rastgele erişimli konteynerde ikili arama uygular. Akıllı işaretçiler için özelleştirme. System::Object::CompareTo yöntemini kullanır.

```cpp
template<template< typename, typename > class,class T,class Allocator> std::enable_if<IsSmartPtr<T>::value, int>::type System::Collections::Generic::_net_binnary_search(const containterT<T, Allocator> &container, int index, int count, T value)
```


| Parametre | Açıklama |
| --- | --- |
| containerT | STL tarzı konteyner şablon tipi, iki şablon argümanı: öğe tipi ve ayırıcı tipi. |
| T | Eleman tipi. |
| Allocator | Allocator türü. |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| konteyner | const containterT\<T, Allocator\>\& | Arama yapılacak konteyner. |
| indeks | int | Arama aralığının başlangıç indeksi. |
| count | int | Arama aralığının uzunluğu. |
| değer | T | Aranacak değer. |

### ReturnValue

Eğer bulunursa, sonraki öğenin indeksi; aksi takdirde, aramanın durduğu indeksin tamamlayıcısı.

## Ayrıca Bakınız

* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
## System::Collections::Generic::_net_binnary_search(const containterT\<T, Allocator\>\&, int, int, T) method


Rastgele erişimli konteynerde ikili arama uygular. Değer tipleri için özelleştirme. CompareTo yöntemini kullanır.

```cpp
template<template< typename, typename > class,class T,class Allocator> std::enable_if<!IsSmartPtr<T>::value &&!std::is_scalar<T>::value, int>::type System::Collections::Generic::_net_binnary_search(const containterT<T, Allocator> &container, int index, int count, T value)
```


| Parametre | Açıklama |
| --- | --- |
| containerT | STL tarzı konteyner şablon tipi, iki şablon argümanı: öğe tipi ve ayırıcı tipi. |
| T | Eleman tipi. |
| Allocator | Allocator türü. |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| konteyner | const containterT\<T, Allocator\>\& | Arama yapılacak konteyner. |
| indeks | int | Arama aralığının başlangıç indeksi. |
| count | int | Arama aralığının uzunluğu. |
| değer | T | Aranacak değer. |

### ReturnValue

Eğer bulunursa, sonraki öğenin indeksi; aksi takdirde, aramanın durduğu indeksin tamamlayıcısı.

## Ayrıca Bakınız

* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
## System::Collections::Generic::_net_binnary_search(const containterT\<T, Allocator\>\&, int, int, T) method


Rastgele erişimli konteynerde ikili arama uygular. Skaler tipler için özelleştirme. Öğeleri büyük ve küçük operatörleriyle karşılaştırır.

```cpp
template<template< typename, typename > class,class T,class Allocator> std::enable_if<std::is_scalar<T>::value, int>::type System::Collections::Generic::_net_binnary_search(const containterT<T, Allocator> &container, int index, int count, T value)
```


| Parametre | Açıklama |
| --- | --- |
| containerT | STL tarzı konteyner şablon tipi, iki şablon argümanı: öğe tipi ve ayırıcı tipi. |
| T | Eleman tipi. |
| Allocator | Allocator türü. |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| konteyner | const containterT\<T, Allocator\>\& | Arama yapılacak konteyner. |
| indeks | int | Arama aralığının başlangıç indeksi. |
| count | int | Arama aralığının uzunluğu. |
| değer | T | Aranacak değer. |

### ReturnValue

Eğer bulunursa, sonraki öğenin indeksi; aksi takdirde, aramanın durduğu indeksin tamamlayıcısı.

## Ayrıca Bakınız

* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
## System::Collections::Generic::_net_binnary_search(const containterT\<T, Allocator\>\&, int, int, T, const SharedPtr\<System::Collections::Generic::IComparer\<T\>\>\&) method


Rastgele erişimli konteynerde ikili arama uygular.

```cpp
template<template< typename, typename > class,class T,class Allocator> int System::Collections::Generic::_net_binnary_search(const containterT<T, Allocator> &container, int index, int count, T value, const SharedPtr<System::Collections::Generic::IComparer<T>> &comparer)
```


| Parametre | Açıklama |
| --- | --- |
| containerT | STL tarzı konteyner şablon tipi, iki şablon argümanı: öğe tipi ve ayırıcı tipi. |
| T | Eleman tipi. |
| Allocator | Allocator türü. |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| konteyner | const containterT\<T, Allocator\>\& | Arama yapılacak konteyner. |
| indeks | int | Arama aralığının başlangıç indeksi. |
| count | int | Arama aralığının uzunluğu. |
| değer | T | Aranacak değer. |
| comparer | const SharedPtr\<System::Collections::Generic::IComparer\<T\>\>\& | [Comparer](../comparer/) nesnesi. |

### ReturnValue

Eğer bulunursa, sonraki öğenin indeksi; aksi takdirde, aramanın durduğu indeksin tamamlayıcısı.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../system/sharedptr/)
* Class [IComparer](../icomparer/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
