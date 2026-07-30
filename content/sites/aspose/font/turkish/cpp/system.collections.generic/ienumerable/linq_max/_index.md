---
title: "System::Collections::Generic::IEnumerable::LINQ_Max yöntemi"
linktitle: "LINQ_Max"
second_title: "Aspose.Font için C++"
description: "C++'ta System::Collections::Generic::IEnumerable sınıfının LINQ_Max yöntemini nasıl kullanılır?"
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
* Library [Aspose.Font for C++](../../../)
## IEnumerable::LINQ_Max(const Func\<T, ResultType\>\&) method


Genel bir dizinin her öğesine bir dönüşüm fonksiyonu uygular ve elde edilen en büyük değeri döndürür.

```cpp
template<typename ResultType> ResultType System::Collections::Generic::IEnumerable<T>::LINQ_Max(const Func<T, ResultType> &selector)
```


| Parametre | Açıklama |
| --- | --- |
| ResultType | Seçici tarafından döndürülen değerin türü. |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| selector | const Func\<T, ResultType\>\& | Her öğeye uygulanacak bir dönüştürme işlevi. |

### ReturnValue

Dizideki maksimum değer.

## Ayrıca Bakınız

* Class [Func](../../../system/func/)
* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Font for C++](../../../)
