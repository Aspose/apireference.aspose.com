---
title: "System::Ref yöntemi"
linktitle: "Ref"
second_title: "Aspose.Page için C++"
description: "System::Ref yöntemi. Ref(std::ref(DynamicWeakPtr))'in C++'ta çalışmasını sağlamak için sarmalayıcı."
type: docs
weight: 36600
url: /tr/cpp/system/ref/
---
## System::Ref(const std::reference_wrapper\<T\>\&) method


Ref(std::ref(DynamicWeakPtr))'in çalışmasını sağlamak için sarmalayıcı.

```cpp
template<typename T> decltype(Ref(std::declval<T &>())) System::Ref(const std::reference_wrapper<T> &wrapper)
```


| Parameter | Açıklama |
| --- | --- |
| T | Referans alınan tip. |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| sarmalayıcı | const std::reference_wrapper\<T\>\& | std sarmalayıcıyı açmak için. |

### ReturnValue

std yerine [System](../):: içinde tanımlı referans tipi.

## Ayrıca Bakınız

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::Ref(DynamicWeakPtr\<T, trunkMode, weakLeafs...\>\&) method


[DynamicWeakPtr](../dynamicweakptr/) nesnesine referans oluşturur. Fonksiyon argümanlarını referans olarak geçirirken çevirmen tarafından kullanılır.

```cpp
template<typename T,SmartPtrMode,unsigned int ...> DynamicWeakPtr<T, trunkMode, weakLeafs...>::Reference System::Ref(DynamicWeakPtr<T, trunkMode, weakLeafs...> &ptr)
```


| Parameter | Açıklama |
| --- | --- |
| T | İşaret edilen tip. |
| trunkMode | Akıllı işaretçinin kendisinin modu. |
| weakLeafs | SetTemplateWeakPtr yönteminin çağrılması gereken şablon argümanlarının indeksleri. |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| ptr | DynamicWeakPtr\<T, trunkMode, weakLeafs...\>\& | Referans oluşturulacak akıllı işaretçi. |

### ReturnValue

Akıllı işaretçi referansı.

## Ayrıca Bakınız

* Class [DynamicWeakPtr](../dynamicweakptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::Ref(T\&) method


Nesnelere referans edinmek için yardımcı işlev. [System::DynamicWeakPtr](../dynamicweakptr/) nesnesinin atamalardan sonra referans verilen nesneyi güncellemesini garanti etmek için kullanılır.

```cpp
template<typename T> T & System::Ref(T &value)
```


| Parameter | Açıklama |
| --- | --- |
| T | Referans oluşturulacak tip. |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| değer | T\& | Referans oluşturulacak değer. |

### ReturnValue

Bu işleve geçirilen değere referans.

## Ayrıca Bakınız

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
