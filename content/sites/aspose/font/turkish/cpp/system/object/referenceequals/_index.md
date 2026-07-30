---
title: "System::Object::ReferenceEquals metodu"
linktitle: "ReferenceEquals"
second_title: "Aspose.Font için C++"
description: "System::Object::ReferenceEquals metodu. C++'da string ve nullptr durumu için Object::ReferenceEquals'in özelleştirilmesidir."
type: docs
weight: 1200
url: /tr/cpp/system/object/referenceequals/
---
## Object::ReferenceEquals(String const\&, std::nullptr_t) method


[Object::ReferenceEquals](./) için string ve nullptr durumunun özelleştirilmesi.

```cpp
bool System::Object::ReferenceEquals(String const &str, std::nullptr_t)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| str | String const\& | nullptr ile karşılaştırmak için [String](../../string/). |

### ReturnValue

true eğer dize null ise, false aksi takdirde.

## Ayrıca Bakınız

* Class [String](../../string/)
* Class [Object](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Object::ReferenceEquals(String const\&, String const\&) method


[Object::ReferenceEquals](./) için string durumunun özelleştirilmesi.

```cpp
bool System::Object::ReferenceEquals(String const &str1, String const &str2)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| str1 | String const\& | Karşılaştırılacak ilk dize. |
| str2 | String const\& | Karşılaştırılacak ikinci dize. |

### ReturnValue

Eşleşen dizeler varsa doğru, aksi takdirde yanlış.

## Ayrıca Bakınız

* Class [String](../../string/)
* Class [Object](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Object::ReferenceEquals(ptr const\&, ptr const\&) method


Nesneleri referansla karşılaştırır.

```cpp
static bool System::Object::ReferenceEquals(ptr const &objA, ptr const &objB)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| objA | ptr const\& | Karşılaştırılacak ilk işaretçi. |
| objB | ptr const\& | Karşılaştırılacak ikinci işaretçi. |

### ReturnValue

İşaretçiler eşleşiyorsa doğru, aksi takdirde yanlış.

## Ayrıca Bakınız

* Typedef [ptr](../ptr/)
* Class [Object](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Object::ReferenceEquals(T const\&, std::nullptr_t) method


Değer türü nesneyi nullptr ile referans olarak karşılaştırır.

```cpp
template<typename T> static std::enable_if<!IsSmartPtr<T>::value, bool>::type System::Object::ReferenceEquals(T const &objA, std::nullptr_t)
```


| Parametre | Açıklama |
| --- | --- |
| T | Karşılaştırılacak nesnenin türü. |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| objA | T const\& | Karşılaştırılacak ilk nesne. |

### ReturnValue

Değer tipleri null olamayacağı için her zaman yanlış döndürür.

## Ayrıca Bakınız

* Class [Object](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Object::ReferenceEquals(T const\&, T const\&) method


Nesneleri referansla karşılaştırır.

```cpp
template<typename T> static std::enable_if<!IsSmartPtr<T>::value, bool>::type System::Object::ReferenceEquals(T const &objA, T const &objB)
```


| Parametre | Açıklama |
| --- | --- |
| T | Karşılaştırılacak nesnelerin türü. |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| objA | T const\& | Karşılaştırılacak ilk nesne. |
| objB | T const\& | Karşılaştırılacak ikinci nesne. |

### ReturnValue

Nesne adresleri eşleşiyorsa doğru, aksi takdirde yanlış.

## Ayrıca Bakınız

* Class [Object](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
