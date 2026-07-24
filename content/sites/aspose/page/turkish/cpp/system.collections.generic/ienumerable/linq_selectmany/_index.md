---
title: "System::Collections::Generic::IEnumerable::LINQ_SelectMany yöntemi"
linktitle: "LINQ_SelectMany"
second_title: "Aspose.Page için C++"
description: "C++'da System::Collections::Generic::IEnumerable sınıfının LINQ_SelectMany yöntemini nasıl kullanılır."
type: docs
weight: 2700
url: /tr/cpp/system.collections.generic/ienumerable/linq_selectmany/
---
## IEnumerable::LINQ_SelectMany(const Func\<Source, SharedPtr\<IEnumerable\<Result\>\>\>\&) method




```cpp
template<typename Result> SharedPtr<IEnumerable<Result>> System::Collections::Generic::IEnumerable<T>::LINQ_SelectMany(const Func<Source, SharedPtr<IEnumerable<Result>>> &selector)
```

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../)
* Class [Func](../../../system/func/)
* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
## IEnumerable::LINQ_SelectMany(const Func\<T, SharedPtr\<IEnumerable\<ResultType\>\>\>\&) method


Bir dizinin her elemanını projekte eder ve ortaya çıkan dizileri tek bir diziye birleştirir.

```cpp
template<typename ResultType> SharedPtr<IEnumerable<ResultType>> System::Collections::Generic::IEnumerable<T>::LINQ_SelectMany(const Func<T, SharedPtr<IEnumerable<ResultType>>> &selector)
```


| Parameter | Açıklama |
| --- | --- |
| ResultType | **selector** tarafından döndürülen değerin türü. |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| selector | const Func\<T, SharedPtr\<IEnumerable\<ResultType\>\>\>\& | Bir dönüşüm işlevi. |

### ReturnValue

Girdi dizisinin her öğesi üzerinde bir bir-çok projeksiyon işlevi çağrılarak elde edilen sonucu içeren bir [IEnumerable](../).

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../)
* Class [Func](../../../system/func/)
* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
