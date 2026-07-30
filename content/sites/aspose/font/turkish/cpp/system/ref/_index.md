---
title: "System::Ref yöntemi"
linktitle: "Ref"
second_title: "Aspose.Font için C++"
description: "System::Ref yöntemi. C++'ta Ref(std::ref(DynamicWeakPtr)) işlevinin çalışmasını sağlamak için sarmalayıcı."
type: docs
weight: 36700
url: /tr/cpp/system/ref/
---
## System::Ref(const std::reference_wrapper\<T\>\&) method


Ref(std::ref(DynamicWeakPtr)) işlevinin çalışmasını sağlamak için sarmalayıcı.

```cpp
template<typename T> decltype(Ref(std::declval<T &>())) System::Ref(const std::reference_wrapper<T> &wrapper)
```


| Parametre | Açıklama |
| --- | --- |
| T | Referans verilen tip. |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| sarmalayıcı | const std::reference_wrapper\<T\>\& | std sarmalayıcıyı açmak için. |

### ReturnValue

[System](../):: içinde tanımlı referans tipi, std içinde değil.

## Ayrıca Bakınız

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::Ref(DynamicWeakPtr\<T, trunkMode, weakLeafs...\>\&) method


[DynamicWeakPtr](../dynamicweakptr/) nesnesine referans oluşturur. Çevirmen tarafından fonksiyon argümanlarını referans olarak geçirirken kullanılır.

```cpp
template<typename T,SmartPtrMode,unsigned int ...> DynamicWeakPtr<T, trunkMode, weakLeafs...>::Reference System::Ref(DynamicWeakPtr<T, trunkMode, weakLeafs...> &ptr)
```


| Parametre | Açıklama |
| --- | --- |
| T | İşaret edilen tip. |
| trunkMode | Akıllı işaretçinin kendisinin modu. |
| weakLeafs | SetTemplateWeakPtr yönteminin çağrılması gereken şablon argümanlarının indeksleri. |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| ptr | DynamicWeakPtr\<T, trunkMode, weakLeafs...\>\& | Referans oluşturulacak akıllı işaretçi. |

### ReturnValue

Akıllı işaretçi referansı.

## Ayrıca Bakınız

* Class [DynamicWeakPtr](../dynamicweakptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::Ref(T\&) method


Nesnelere referans elde etmek için yardımcı işlev. Atamaların ardından [System::DynamicWeakPtr](../dynamicweakptr/) referans verilen nesneyi güncellemesini garanti etmek için kullanılır.

```cpp
template<typename T> T & System::Ref(T &value)
```


| Parametre | Açıklama |
| --- | --- |
| T | Referans oluşturulacak tip. |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| değer | T\& | Referans oluşturulacak değer. |

### ReturnValue

Bu işleve geçirilen değere referans.

## Ayrıca Bakınız

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
