---
title: "System::CastEnumerableTo yöntemi"
linktitle: "CastEnumerableTo"
second_title: "Aspose.Page için C++"
description: "System::CastEnumerableTo yöntemi. Belirtilen enumerable nesnesinin elemanlarını C++'da farklı bir türe açıkça dönüştürür."
type: docs
weight: 15500
url: /tr/cpp/system/castenumerableto/
---
## System::CastEnumerableTo(const From\&) method


Belirtilen enumerable nesnesinin elemanlarını farklı bir türe açıkça dönüştürür.

```cpp
template<class To,class From> std::enable_if<!System::detail::has_method_get_Count<From>::value, Collections::Generic::ListPtr<To>>::type System::CastEnumerableTo(const From &enumerable)
```


| Parameter | Açıklama |
| --- | --- |
| To | Enumerable nesnesinin elemanlarını statik olarak dönüştürmek için hedef tür |
| From | Enumerable nesnenin türü |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| enumerable | const From\& | Dönüştürülecek öğeleri içeren Enumerable nesnesi |

### ReturnValue

**To** tipindeki öğeleri içeren ve **enumerable** öğelerine eşdeğer yeni bir koleksiyona işaretçi

## Ayrıca Bakınız

* Class [ListPtr](../../system.collections.generic/listptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::CastEnumerableTo(const From\&) method


Belirtilen enumerable nesnesinin elemanlarını farklı bir türe açıkça dönüştürür.

```cpp
template<class To,class From> std::enable_if<System::detail::has_method_get_Count<From>::value, Collections::Generic::ListPtr<To>>::type System::CastEnumerableTo(const From &enumerable)
```


| Parameter | Açıklama |
| --- | --- |
| To | Enumerable nesnesinin elemanlarını statik olarak dönüştürmek için hedef tür |
| From | Enumerable nesnenin türü |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| enumerable | const From\& | tanımlı get_Count metoduna sahip ve dönüştürülecek öğeleri içeren Enumerable nesnesinin türevidir |

### ReturnValue

**To** tipindeki öğeleri içeren ve **enumerable** öğelerine eşdeğer yeni bir koleksiyona işaretçi

## Ayrıca Bakınız

* Class [ListPtr](../../system.collections.generic/listptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
