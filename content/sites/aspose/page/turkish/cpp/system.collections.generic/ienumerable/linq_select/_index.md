---
title: "System::Collections::Generic::IEnumerable::LINQ_Select metodu"
linktitle: "LINQ_Select"
second_title: "Aspose.Page için C++"
description: "C++'da System::Collections::Generic::IEnumerable sınıfının LINQ_Select yöntemini nasıl kullanılır?"
type: docs
weight: 2600
url: /tr/cpp/system.collections.generic/ienumerable/linq_select/
---
## IEnumerable::LINQ_Select(const Func\<Source, int32_t, Result\>\&) method




```cpp
template<typename Result> SharedPtr<IEnumerable<Result>> System::Collections::Generic::IEnumerable<T>::LINQ_Select(const Func<Source, int32_t, Result> &selector)
```

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../)
* Class [Func](../../../system/func/)
* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
## IEnumerable::LINQ_Select(const Func\<Source, Result\>\&) method




```cpp
template<typename Result> SharedPtr<IEnumerable<Result>> System::Collections::Generic::IEnumerable<T>::LINQ_Select(const Func<Source, Result> &selector)
```

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../)
* Class [Func](../../../system/func/)
* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
## IEnumerable::LINQ_Select(const Func\<T, int32_t, ResultType\>\&) method


Bir dizinin her elemanını, elemanın indeksini ekleyerek yeni bir forma dönüştürür.

```cpp
template<typename ResultType> SharedPtr<IEnumerable<ResultType>> System::Collections::Generic::IEnumerable<T>::LINQ_Select(const Func<T, int32_t, ResultType> &selector)
```


| Parameter | Açıklama |
| --- | --- |
| ResultType | **selector** tarafından döndürülen değerin türü. |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| selector | const Func\<T, int32_t, ResultType\>\& | Bir dönüşüm işlevi. |

### ReturnValue

Bir [IEnumerable](../) **selector** işlevi tarafından döndürülen öğeleri içerir.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../)
* Class [Func](../../../system/func/)
* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
## IEnumerable::LINQ_Select(const Func\<T, ResultType\>\&) method


Bir dizinin elemanlarını dönüştürür.

```cpp
template<typename ResultType> SharedPtr<IEnumerable<ResultType>> System::Collections::Generic::IEnumerable<T>::LINQ_Select(const Func<T, ResultType> &selector)
```


| Parameter | Açıklama |
| --- | --- |
| ResultType | **selector** tarafından döndürülen değerin türü. |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| selector | const Func\<T, ResultType\>\& | Bir dönüşüm işlevi. |

### ReturnValue

Bir [IEnumerable](../) **selector** işlevi tarafından döndürülen öğeleri içerir.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../)
* Class [Func](../../../system/func/)
* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
