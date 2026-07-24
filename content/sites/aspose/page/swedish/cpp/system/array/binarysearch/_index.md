---
title: "System::Array::BinarySearch-metod"
linktitle: "BinarySearch"
second_title: "Aspose.Page för C++"
description: "System::Array::BinarySearch-metod. Utför binärsökning i den sorterade arrayen i C++."
type: docs
weight: 4600
url: /sv/cpp/system/array/binarysearch/
---
## Array::BinarySearch(System::ArrayPtr\<T\>, const T\&) method


Utför binärsökning i den sorterade arrayen.

```cpp
static int System::Array<T>::BinarySearch(System::ArrayPtr<T> arr, const T &item)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| arr | System::ArrayPtr\<T\> | Sorterad array att söka i |
| objekt | const T\& | Ett objekt att söka efter |

### ReturnValue

Index för det sökta objektet om det hittas, annars ett negativt heltal som är bitkomplementet till indexet för nästa objekt som är större än det sökta objektet eller, om det inte finns något större objekt, bitkomplementet till antalet element i arrayen.

## Se även

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::BinarySearch(System::ArrayPtr\<T\>, const Y\&, const SharedPtr\<Collections::Generic::IComparer\<Z\>\>\&) method


INTE IMPLEMENTERAT.

```cpp
template<typename Y,typename Z> static int System::Array<T>::BinarySearch(System::ArrayPtr<T> arr, const Y &item, const SharedPtr<Collections::Generic::IComparer<Z>> &comparer)
```


## Se även

* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IComparer](../../../system.collections.generic/icomparer/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
