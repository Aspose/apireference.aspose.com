---
title: "System::Collections::Generic::IEnumerable::LINQ_Min metodu"
linktitle: "LINQ_Min"
second_title: "Aspose.Font için C++"
description: "C++'da System::Collections::Generic::IEnumerable sınıfının LINQ_Min metodunu nasıl kullanılır."
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
* Library [Aspose.Font for C++](../../../)
## IEnumerable::LINQ_Min(const Func\<T, ResultType\>\&) method


Genel bir dizinin her öğesine bir dönüşüm fonksiyonu uygular ve elde edilen en küçük değeri döndürür.

```cpp
template<typename ResultType> ResultType System::Collections::Generic::IEnumerable<T>::LINQ_Min(const Func<T, ResultType> &selector)
```


| Parametre | Açıklama |
| --- | --- |
| ResultType | Seçici tarafından döndürülen değerin türü. |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| selector | const Func\<T, ResultType\>\& | Her öğeye uygulanacak bir dönüştürme işlevi. |

### ReturnValue

Dizideki minimum değer.

## Ayrıca Bakınız

* Class [Func](../../../system/func/)
* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Font for C++](../../../)
