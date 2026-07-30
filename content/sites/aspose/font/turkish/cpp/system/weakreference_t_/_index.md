---
title: "System::WeakReference< T > sınıfı"
linktitle: "WeakReference< T >"
second_title: "Aspose.Font için C++"
description: "System::WeakReference< T > sınıfı. Bir nesneyi referans alırken, o nesnenin C++'da silinmesine izin veren zayıf bir referansı temsil eder."
type: docs
weight: 7700
url: /tr/cpp/system/weakreference_t_/
---
## WeakReference< T > class


Bir nesneyi referans alırken yine de o nesnenin silinmesine izin veren zayıf bir referansı temsil eder.

```cpp
template<typename T>class WeakReference< T > : public System::Object
```


| Parametre | Açıklama |
| --- | --- |
| T | Referans alınan nesnenin türü. |
## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [operator!=](./operator!=/)(std::nullptr_t) const | Referans alınan nesnenin null olmadığını kontrol eder. |
| [operator!=](./operator!=/)(const WeakReference\<T\>\&) const | Referans alınan nesneyi başka bir [WeakReference](../weakreference/) sınıfı örneğiyle karşılaştırır. |
| [operator==](./operator==/)(std::nullptr_t) const | Referans alınan nesnenin null olup olmadığını kontrol eder. |
| [operator==](./operator==/)(const WeakReference\<T\>\&) const | Referans alınan nesneyi başka bir [WeakReference](../weakreference/) sınıfı örneğiyle karşılaştırır. |
| [reset](./reset/)() |  |
| [SetTarget](./settarget/)(const SmartPtr\<T\>\&) | Geçerli [WeakReference](../weakreference/) nesnesi tarafından referans verilen nesneyi (hedefi) ayarlar. |
| [TryGetTarget](./trygettarget/)(const SmartPtr\<T\>\&) const | Geçerli [WeakReference](../weakreference/) nesnesi tarafından referans verilen nesneyi (hedefi) alır. |
| [WeakReference](./weakreference/)() | Varsayılan yapıcı. |
| [WeakReference](./weakreference/)(std::nullptr_t) | nullptr'tan yapıcı. |
| [WeakReference](./weakreference/)(const SmartPtr\<T\>\&) | [WeakReference](../weakreference/) sınıfının yeni bir örneğini başlatır, belirtilen nesneyi referans alır. |
| [WeakReference](./weakreference/)(const SmartPtr\<T\>\&, bool) | [WeakReference](../weakreference/) sınıfının yeni bir örneğini başlatır, belirtilen nesneyi referans alır. |

## Ayrıca Bakınız

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
