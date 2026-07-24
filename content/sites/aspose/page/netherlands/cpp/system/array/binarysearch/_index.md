---
title: "System::Array::BinarySearch-methode"
linktitle: "BinarySearch"
second_title: "Aspose.Page voor C++"
description: "System::Array::BinarySearch-methode. Voert een binaire zoekopdracht uit in de gesorteerde array in C++."
type: docs
weight: 4600
url: /nl/cpp/system/array/binarysearch/
---
## Array::BinarySearch(System::ArrayPtr\<T\>, const T\&) method


Voert een binaire zoekopdracht uit in de gesorteerde array.

```cpp
static int System::Array<T>::BinarySearch(System::ArrayPtr<T> arr, const T &item)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| arr | System::ArrayPtr\<T\> | Gesorteerde array waarin gezocht moet worden |
| item | const T\& | Een item om naar te zoeken |

### ReturnValue

Index van het gezochte item als het gevonden wordt, anders een negatief geheel getal dat het bitwise complement is van de index van het volgende item dat groter is dan het gezochte item of, als er geen groter item is, het bitwise complement van het aantal elementen in de array.

## Zie ook

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::BinarySearch(System::ArrayPtr\<T\>, const Y\&, const SharedPtr\<Collections::Generic::IComparer\<Z\>\>\&) method


NOG NIET GEÏMPLENTEERD.

```cpp
template<typename Y,typename Z> static int System::Array<T>::BinarySearch(System::ArrayPtr<T> arr, const Y &item, const SharedPtr<Collections::Generic::IComparer<Z>> &comparer)
```


## Zie ook

* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IComparer](../../../system.collections.generic/icomparer/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
