---
title: "System::Collections::Generic::_net_binnary_search yöntemi"
linktitle: "_net_binnary_search"
second_title: "Aspose.Page için C++"
description: "System::Collections::Generic::_net_binnary_search yöntemi. Rastgele erişimli konteynerde ikili aramayı uygular. Akıllı işaretçiler için özelleştirme. C++'ta System::Object::CompareTo yöntemini kullanır."
type: docs
weight: 4900
url: /tr/cpp/system.collections.generic/_net_binnary_search/
---
## System::Collections::Generic::_net_binnary_search(const containterT\<T, Allocator\>\&, int, int, T) method


Rastgele erişimli konteynerde ikili aramayı uygular. Akıllı işaretçiler için özelleştirme. System::Object::CompareTo yöntemini kullanır.

```cpp
template<template< typename, typename > class,class T,class Allocator> std::enable_if<IsSmartPtr<T>::value, int>::type System::Collections::Generic::_net_binnary_search(const containterT<T, Allocator> &container, int index, int count, T value)
```


| Parameter | Açıklama |
| --- | --- |
| containerT | İki şablon bağımsız değişkeni olan STL tarzı konteyner şablon tipi: öğe türü ve ayırıcı (allocator) türü. |
| T | Öğe türü. |
| Allocator | Allocator türü. |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| konteyner | const containterT\<T, Allocator\>\& | Arama yapılacak konteyner. |
| indeks | int | Arama aralığının başlangıç indeksi. |
| count | int | Arama aralığının uzunluğu. |
| değer | T | Aranacak değer. |

### ReturnValue

Bulunursa, sonraki öğenin indeksi; aksi takdirde, aramanın durduğu indeksin tamamlayıcıları.

## Ayrıca Bakınız

* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
## System::Collections::Generic::_net_binnary_search(const containterT\<T, Allocator\>\&, int, int, T) method


Rastgele erişimli kapsayıcıda ikili aramayı uygular. Değer tipleri için özelleştirme. CompareTo metodunu kullanır.

```cpp
template<template< typename, typename > class,class T,class Allocator> std::enable_if<!IsSmartPtr<T>::value &&!std::is_scalar<T>::value, int>::type System::Collections::Generic::_net_binnary_search(const containterT<T, Allocator> &container, int index, int count, T value)
```


| Parameter | Açıklama |
| --- | --- |
| containerT | İki şablon bağımsız değişkeni olan STL tarzı konteyner şablon tipi: öğe türü ve ayırıcı (allocator) türü. |
| T | Öğe türü. |
| Allocator | Allocator türü. |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| konteyner | const containterT\<T, Allocator\>\& | Arama yapılacak konteyner. |
| indeks | int | Arama aralığının başlangıç indeksi. |
| count | int | Arama aralığının uzunluğu. |
| değer | T | Aranacak değer. |

### ReturnValue

Bulunursa, sonraki öğenin indeksi; aksi takdirde, aramanın durduğu indeksin tamamlayıcıları.

## Ayrıca Bakınız

* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
## System::Collections::Generic::_net_binnary_search(const containterT\<T, Allocator\>\&, int, int, T) method


Rastgele erişimli kapsayıcıda ikili aramayı uygular. Skaler tipler için özelleştirme. Öğeleri büyük ve küçük operatörleriyle karşılaştırır.

```cpp
template<template< typename, typename > class,class T,class Allocator> std::enable_if<std::is_scalar<T>::value, int>::type System::Collections::Generic::_net_binnary_search(const containterT<T, Allocator> &container, int index, int count, T value)
```


| Parameter | Açıklama |
| --- | --- |
| containerT | İki şablon bağımsız değişkeni olan STL tarzı konteyner şablon tipi: öğe türü ve ayırıcı (allocator) türü. |
| T | Öğe türü. |
| Allocator | Allocator türü. |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| konteyner | const containterT\<T, Allocator\>\& | Arama yapılacak konteyner. |
| indeks | int | Arama aralığının başlangıç indeksi. |
| count | int | Arama aralığının uzunluğu. |
| değer | T | Aranacak değer. |

### ReturnValue

Bulunursa, sonraki öğenin indeksi; aksi takdirde, aramanın durduğu indeksin tamamlayıcıları.

## Ayrıca Bakınız

* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
## System::Collections::Generic::_net_binnary_search(const containterT\<T, Allocator\>\&, int, int, T, const SharedPtr\<System::Collections::Generic::IComparer\<T\>\>\&) method


Rastgele erişimli kapsayıcıda ikili aramayı uygular.

```cpp
template<template< typename, typename > class,class T,class Allocator> int System::Collections::Generic::_net_binnary_search(const containterT<T, Allocator> &container, int index, int count, T value, const SharedPtr<System::Collections::Generic::IComparer<T>> &comparer)
```


| Parameter | Açıklama |
| --- | --- |
| containerT | İki şablon bağımsız değişkeni olan STL tarzı konteyner şablon tipi: öğe türü ve ayırıcı (allocator) türü. |
| T | Öğe türü. |
| Allocator | Allocator türü. |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| konteyner | const containterT\<T, Allocator\>\& | Arama yapılacak konteyner. |
| indeks | int | Arama aralığının başlangıç indeksi. |
| count | int | Arama aralığının uzunluğu. |
| değer | T | Aranacak değer. |
| comparer | const SharedPtr\<System::Collections::Generic::IComparer\<T\>\>\& | [Comparer](../comparer/) nesnesi. |

### ReturnValue

Bulunursa, sonraki öğenin indeksi; aksi takdirde, aramanın durduğu indeksin tamamlayıcıları.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../system/sharedptr/)
* Class [IComparer](../icomparer/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
