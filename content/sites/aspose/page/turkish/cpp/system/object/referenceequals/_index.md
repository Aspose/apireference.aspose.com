---
title: "System::Object::ReferenceEquals yöntemi"
linktitle: "ReferenceEquals"
second_title: "Aspose.Page için C++"
description: "System::Object::ReferenceEquals yöntemi. C++'da string ve nullptr durumu için Object::ReferenceEquals özelleştirmesi."
type: docs
weight: 1200
url: /tr/cpp/system/object/referenceequals/
---
## Object::ReferenceEquals(String const\&, std::nullptr_t) method


String ve nullptr durumu için [Object::ReferenceEquals](./) özelleştirmesi.

```cpp
bool System::Object::ReferenceEquals(String const &str, std::nullptr_t)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| str | String const\& | [String](../../string/) nullptr ile karşılaştırmak için. |

### ReturnValue

Dize null ise doğru, aksi takdirde yanlış.

## Ayrıca Bakınız

* Class [String](../../string/)
* Class [Object](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Object::ReferenceEquals(String const\&, String const\&) method


Stringler durumu için [Object::ReferenceEquals](./) özelleştirmesi.

```cpp
bool System::Object::ReferenceEquals(String const &str1, String const &str2)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| str1 | String const\& | Karşılaştırılacak ilk dize. |
| str2 | String const\& | Karşılaştırılacak ikinci dize. |

### ReturnValue

dizeler eşleşiyorsa doğru, aksi takdirde yanlış.

## Ayrıca Bakınız

* Class [String](../../string/)
* Class [Object](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Object::ReferenceEquals(ptr const\&, ptr const\&) method


Nesneleri referansla karşılaştırır.

```cpp
static bool System::Object::ReferenceEquals(ptr const &objA, ptr const &objB)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| objA | ptr const\& | Karşılaştırılacak ilk işaretçi. |
| objB | ptr const\& | Karşılaştırılacak ikinci işaretçi. |

### ReturnValue

İşaretçiler eşleşiyorsa doğru, aksi takdirde yanlış.

## Ayrıca Bakınız

* Typedef [ptr](../ptr/)
* Class [Object](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Object::ReferenceEquals(T const\&, std::nullptr_t) method


Referans, değer türü nesneyi nullptr ile karşılaştırır.

```cpp
template<typename T> static std::enable_if<!IsSmartPtr<T>::value, bool>::type System::Object::ReferenceEquals(T const &objA, std::nullptr_t)
```


| Parameter | Açıklama |
| --- | --- |
| T | Karşılaştırılacak nesnenin türü. |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| objA | T const\& | Karşılaştırılacak ilk nesne. |

### ReturnValue

Değer tipleri boş bırakılamadığı için her zaman yanlış döndürür.

## Ayrıca Bakınız

* Class [Object](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Object::ReferenceEquals(T const\&, T const\&) method


Nesneleri referansla karşılaştırır.

```cpp
template<typename T> static std::enable_if<!IsSmartPtr<T>::value, bool>::type System::Object::ReferenceEquals(T const &objA, T const &objB)
```


| Parameter | Açıklama |
| --- | --- |
| T | Karşılaştırılacak nesnelerin türü. |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| objA | T const\& | Karşılaştırılacak ilk nesne. |
| objB | T const\& | Karşılaştırılacak ikinci nesne. |

### ReturnValue

Nesne adresleri eşleşiyorsa doğru, aksi takdirde yanlış.

## Ayrıca Bakınız

* Class [Object](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
