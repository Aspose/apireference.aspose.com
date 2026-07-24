---
title: "System::Collections::Generic::_net_binnary_search methode"
linktitle: "_net_binnary_search"
second_title: "Aspose.Page voor C++"
description: "System::Collections::Generic::_net_binnary_search methode. Implementeert binaire zoekopdracht in een random-access container. Specialisatie voor slimme pointers. Gebruikt System::Object::CompareTo methode in C++."
type: docs
weight: 4900
url: /nl/cpp/system.collections.generic/_net_binnary_search/
---
## System::Collections::Generic::_net_binnary_search(const containterT\<T, Allocator\>\&, int, int, T) method


Implementeert binaire zoekopdracht in een random-access container. Specialisatie voor slimme pointers. Gebruikt System::Object::CompareTo methode.

```cpp
template<template< typename, typename > class,class T,class Allocator> std::enable_if<IsSmartPtr<T>::value, int>::type System::Collections::Generic::_net_binnary_search(const containterT<T, Allocator> &container, int index, int count, T value)
```


| Parameter | Beschrijving |
| --- | --- |
| containerT | STL-achtige containertemplate-type met twee template-argumenten: elementtype en allocator-type. |
| T | Elementtype. |
| Allocator | Allocator-type. |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| container | const containterT\<T, Allocator\>\& | Container om in te zoeken. |
| index | int | Beginindex van zoekbereik. |
| count | int | Lengte van zoekbereik. |
| value | T | Waarde om naar te zoeken. |

### ReturnValue

Indien gevonden, index van het volgende element; anders, complement van de index waarop de zoekopdracht stopte.

## Zie ook

* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
## System::Collections::Generic::_net_binnary_search(const containterT\<T, Allocator\>\&, int, int, T) method


Implementeert binaire zoekopdracht in een random-access container. Specialisatie voor waardetypen. Gebruikt CompareTo methode.

```cpp
template<template< typename, typename > class,class T,class Allocator> std::enable_if<!IsSmartPtr<T>::value &&!std::is_scalar<T>::value, int>::type System::Collections::Generic::_net_binnary_search(const containterT<T, Allocator> &container, int index, int count, T value)
```


| Parameter | Beschrijving |
| --- | --- |
| containerT | STL-achtige containertemplate-type met twee template-argumenten: elementtype en allocator-type. |
| T | Elementtype. |
| Allocator | Allocator-type. |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| container | const containterT\<T, Allocator\>\& | Container om in te zoeken. |
| index | int | Beginindex van zoekbereik. |
| count | int | Lengte van zoekbereik. |
| value | T | Waarde om naar te zoeken. |

### ReturnValue

Indien gevonden, index van het volgende element; anders, complement van de index waarop de zoekopdracht stopte.

## Zie ook

* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
## System::Collections::Generic::_net_binnary_search(const containterT\<T, Allocator\>\&, int, int, T) method


Implementeert binaire zoekopdracht in een random-access container. Specialisatie voor scalairen. Vergelijkt elementen met behulp van groter- en kleiner-operatoren.

```cpp
template<template< typename, typename > class,class T,class Allocator> std::enable_if<std::is_scalar<T>::value, int>::type System::Collections::Generic::_net_binnary_search(const containterT<T, Allocator> &container, int index, int count, T value)
```


| Parameter | Beschrijving |
| --- | --- |
| containerT | STL-achtige containertemplate-type met twee template-argumenten: elementtype en allocator-type. |
| T | Elementtype. |
| Allocator | Allocator-type. |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| container | const containterT\<T, Allocator\>\& | Container om in te zoeken. |
| index | int | Beginindex van zoekbereik. |
| count | int | Lengte van zoekbereik. |
| value | T | Waarde om naar te zoeken. |

### ReturnValue

Indien gevonden, index van het volgende element; anders, complement van de index waarop de zoekopdracht stopte.

## Zie ook

* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
## System::Collections::Generic::_net_binnary_search(const containterT\<T, Allocator\>\&, int, int, T, const SharedPtr\<System::Collections::Generic::IComparer\<T\>\>\&) method


Implementeert binaire zoekopdracht in een random-access container.

```cpp
template<template< typename, typename > class,class T,class Allocator> int System::Collections::Generic::_net_binnary_search(const containterT<T, Allocator> &container, int index, int count, T value, const SharedPtr<System::Collections::Generic::IComparer<T>> &comparer)
```


| Parameter | Beschrijving |
| --- | --- |
| containerT | STL-achtige containertemplate-type met twee template-argumenten: elementtype en allocator-type. |
| T | Elementtype. |
| Allocator | Allocator-type. |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| container | const containterT\<T, Allocator\>\& | Container om in te zoeken. |
| index | int | Beginindex van zoekbereik. |
| count | int | Lengte van zoekbereik. |
| value | T | Waarde om naar te zoeken. |
| comparer | const SharedPtr\<System::Collections::Generic::IComparer\<T\>\>\& | [Comparer](../comparer/) object. |

### ReturnValue

Indien gevonden, index van het volgende element; anders, complement van de index waarop de zoekopdracht stopte.

## Zie ook

* Typedef [SharedPtr](../../system/sharedptr/)
* Class [IComparer](../icomparer/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
