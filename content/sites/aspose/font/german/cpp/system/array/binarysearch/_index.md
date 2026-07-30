---
title: "System::Array::BinarySearch method"
linktitle: "BinarySearch"
second_title: "Aspose.Font für C++"
description: "System::Array::BinarySearch method. Führt eine binäre Suche im sortierten Array in C++ durch."
type: docs
weight: 4600
url: /de/cpp/system/array/binarysearch/
---
## Array::BinarySearch(System::ArrayPtr\<T\>, const T\&) method


Führt eine binäre Suche im sortierten Array durch.

```cpp
static int System::Array<T>::BinarySearch(System::ArrayPtr<T> arr, const T &item)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| arr | System::ArrayPtr\<T\> | Sortiertes Array, in dem gesucht werden soll |
| Element | const T\& | Ein zu suchendes Element |

### ReturnValue

Index des gesuchten Elements, falls es gefunden wird; andernfalls ein negativer Integer, der das bitweise Komplement des Index des nächsten Elements, das größer als das gesuchte Element ist, darstellt, oder, falls kein größeres Element existiert, das bitweise Komplement der Anzahl der Elemente im Array.

## Siehe auch

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Array::BinarySearch(System::ArrayPtr\<T\>, const Y\&, const SharedPtr\<Collections::Generic::IComparer\<Z\>\>\&) method


NICHT IMPLEMENTIERT.

```cpp
template<typename Y,typename Z> static int System::Array<T>::BinarySearch(System::ArrayPtr<T> arr, const Y &item, const SharedPtr<Collections::Generic::IComparer<Z>> &comparer)
```


## Siehe auch

* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IComparer](../../../system.collections.generic/icomparer/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
