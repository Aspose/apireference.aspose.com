---
title: "System::Collections::Generic::IEnumerable::LINQ_Max metodu"
linktitle: "LINQ_Max"
second_title: "Aspose.Page için C++"
description: "C++'da System::Collections::Generic::IEnumerable sınıfının LINQ_Max metodunu nasıl kullanılır."
type: docs
weight: 2000
url: /tr/cpp/system.collections.generic/ienumerable/linq_max/
---
## IEnumerable::LINQ_Max(const Func\<Source, ResultType\>\&) method




```cpp
template<typename ResultType> ResultType System::Collections::Generic::IEnumerable<T>::LINQ_Max(const Func<Source, ResultType> &selector)
```

## Ayrıca Bakınız

* Class [Func](../../../system/func/)
* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
## IEnumerable::LINQ_Max(const Func\<T, ResultType\>\&) method


Genel bir dizinin her elemanına bir dönüşüm işlevi uygular ve elde edilen maksimum değeri döndürür.

```cpp
template<typename ResultType> ResultType System::Collections::Generic::IEnumerable<T>::LINQ_Max(const Func<T, ResultType> &selector)
```


| Parameter | Açıklama |
| --- | --- |
| ResultType | Seçici tarafından döndürülen değerin türü. |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| selector | const Func\<T, ResultType\>\& | Her öğeye uygulanacak bir dönüştürme işlevi. |

### ReturnValue

Dizideki maksimum değer.

## Ayrıca Bakınız

* Class [Func](../../../system/func/)
* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
