---
title: "System::Collections::Generic::IEnumerable::LINQ_Min yöntemi"
linktitle: "LINQ_Min"
second_title: "Aspose.Page için C++"
description: "C++'da System::Collections::Generic::IEnumerable sınıfının LINQ_Min yönteminin nasıl kullanılacağını."
type: docs
weight: 2100
url: /tr/cpp/system.collections.generic/ienumerable/linq_min/
---
## IEnumerable::LINQ_Min(const Func\<Source, ResultType\>\&) method




```cpp
template<typename ResultType> ResultType System::Collections::Generic::IEnumerable<T>::LINQ_Min(const Func<Source, ResultType> &selector)
```

## Ayrıca Bakınız

* Class [Func](../../../system/func/)
* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
## IEnumerable::LINQ_Min(const Func\<T, ResultType\>\&) method


Genel bir dizinin her elemanına bir dönüşüm işlevi uygular ve elde edilen minimum değeri döndürür.

```cpp
template<typename ResultType> ResultType System::Collections::Generic::IEnumerable<T>::LINQ_Min(const Func<T, ResultType> &selector)
```


| Parameter | Açıklama |
| --- | --- |
| ResultType | Seçici tarafından döndürülen değerin türü. |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| selector | const Func\<T, ResultType\>\& | Her öğeye uygulanacak bir dönüştürme işlevi. |

### ReturnValue

Dizideki minimum değer.

## Ayrıca Bakınız

* Class [Func](../../../system/func/)
* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
