---
title: "System::StaticCastArray yöntemi"
linktitle: "StaticCastArray"
second_title: "Aspose.Page için C++"
description: "System::StaticCastArray yöntemi. Belirtilen dizinin öğelerini farklı bir türe dönüştürür. C++'ta From bir SmartPtr nesnesi olduğunda geçersiz kılma."
type: docs
weight: 39800
url: /tr/cpp/system/staticcastarray/
---
## System::StaticCastArray(const System::SharedPtr\<System::Array\<From\>\>\&) method


Belirtilen dizinin öğelerini farklı bir türe dönüştürür. From bir [SmartPtr](../smartptr/) nesnesi olduğunda geçersiz kılma.

```cpp
template<typename To,typename From> std::enable_if_t<System::IsSmartPtr<From>::value, System::SharedPtr<System::Array<To>>> System::StaticCastArray(const System::SharedPtr<System::Array<From>> &from)
```


| Parameter | Açıklama |
| --- | --- |
| To | Belirtilen dizinin öğelerinin dönüştürüleceği tip |
| From | Dönüştürülecek öğelerin bulunduğu dizi öğelerinin tipi |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| from | const System::SharedPtr\<System::Array\<From\>\>\& | Dönüştürülecek öğeleri içeren diziye ait paylaşımlı gösterici |

### ReturnValue

**To** tipindeki öğeleri **from** öğelerine eşdeğer olarak içeren yeni bir diziye işaretçi

## Deprecated
Geriye dönük uyumluluk için eklendi. Bunun yerine ExplicitCast kullanın.

## Ayrıca Bakınız

* Typedef [SharedPtr](../sharedptr/)
* Class [Array](../array/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::StaticCastArray(const System::SharedPtr\<System::Array\<From\>\>\&) method


Belirtilen dizinin öğelerini farklı bir türe dönüştürür. From bir Boxable ve To bir [Object](../object/)[].

```cpp
template<typename To,typename From> std::enable_if_t<!System::IsSmartPtr<From>::value &&System::IsBoxable<From>::value &&std::is_same<To, System::SharedPtr<Object>>::value, System::SharedPtr<System::Array<To>>> System::StaticCastArray(const System::SharedPtr<System::Array<From>> &from)
```


| Parameter | Açıklama |
| --- | --- |
| To | Belirtilen dizinin öğelerinin dönüştürüleceği tip |
| From | Dönüştürülecek öğelerin bulunduğu dizi öğelerinin tipi |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| from | const System::SharedPtr\<System::Array\<From\>\>\& | Dönüştürülecek öğeleri içeren diziye ait paylaşımlı gösterici |

### ReturnValue

**To** tipindeki öğeleri **from** öğelerine eşdeğer olarak içeren yeni bir diziye işaretçi

## Deprecated
Geriye dönük uyumluluk için eklendi. Bunun yerine ExplicitCast kullanın.

## Ayrıca Bakınız

* Typedef [SharedPtr](../sharedptr/)
* Class [Object](../object/)
* Class [Array](../array/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
