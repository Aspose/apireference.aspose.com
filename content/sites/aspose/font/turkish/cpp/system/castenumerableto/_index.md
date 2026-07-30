---
title: "System::CastEnumerableTo yöntemi"
linktitle: "CastEnumerableTo"
second_title: "Aspose.Font için C++"
description: "System::CastEnumerableTo yöntemi. Belirtilen enumerable nesnesinin öğelerinin farklı bir türe açıkça dönüştürülmesini C++'da gerçekleştirir."
type: docs
weight: 15600
url: /tr/cpp/system/castenumerableto/
---
## System::CastEnumerableTo(const From\&) method


Belirtilen enumerable nesnesinin öğelerinin farklı bir türe açıkça dönüştürülmesini gerçekleştirir.

```cpp
template<class To,class From> std::enable_if<!System::detail::has_method_get_Count<From>::value, Collections::Generic::ListPtr<To>>::type System::CastEnumerableTo(const From &enumerable)
```


| Parametre | Açıklama |
| --- | --- |
| Şu | Enumerable nesnesinin öğelerinin statik olarak dönüştürüleceği tür |
| From | Enumerable nesnenin türü |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| enumerable | const From\& | Öğeleri dönüştürmek için içeren Enumerable nesnesi |

### ReturnValue

Yeni bir koleksiyona işaretçi, **To** tipindeki öğeleri **enumerable** öğelerine eşdeğer olarak içerir.

## Ayrıca Bakınız

* Class [ListPtr](../../system.collections.generic/listptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::CastEnumerableTo(const From\&) method


Belirtilen enumerable nesnesinin öğelerinin farklı bir türe açıkça dönüştürülmesini gerçekleştirir.

```cpp
template<class To,class From> std::enable_if<System::detail::has_method_get_Count<From>::value, Collections::Generic::ListPtr<To>>::type System::CastEnumerableTo(const From &enumerable)
```


| Parametre | Açıklama |
| --- | --- |
| Şu | Enumerable nesnesinin öğelerinin statik olarak dönüştürüleceği tür |
| From | Enumerable nesnenin türü |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| enumerable | const From\& | Enumerable nesnesinin tanımlı get_Count metoduna sahip ve dönüştürülecek öğeleri içeren bir türevdir. |

### ReturnValue

Yeni bir koleksiyona işaretçi, **To** tipindeki öğeleri **enumerable** öğelerine eşdeğer olarak içerir.

## Ayrıca Bakınız

* Class [ListPtr](../../system.collections.generic/listptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
