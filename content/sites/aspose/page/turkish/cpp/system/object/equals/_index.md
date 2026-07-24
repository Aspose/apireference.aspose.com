---
title: "System::Object::Equals method"
linktitle: "Eşittir"
second_title: "Aspose.Page için C++"
description: "System::Object::Equals yöntemi. C++'da C# Object.Equals semantiğini kullanarak nesneleri karşılaştırır."
type: docs
weight: 300
url: /tr/cpp/system/object/equals/
---
## Object::Equals(ptr) method


C# [Object.Equals](./) semantiğini kullanarak nesneleri karşılaştırır.

```cpp
virtual bool System::Object::Equals(ptr obj)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| obj | ptr | Mevcut nesneyle karşılaştırmak için [Object](../). |

### ReturnValue

Nesneler eşit kabul edilirse doğru, aksi takdirde yanlıştır.

## Ayrıca Bakınız

* Typedef [ptr](../ptr/)
* Class [Object](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Object::Equals(double const\&, double const\&) method


IEC 60559:1989'a göre NaN'in herhangi bir değere, NaN dahil, eşit olmamasına rağmen, iki NaN'in eşit kabul edildiği C# tarzı kayan nokta karşılaştırmasını taklit eder.

```cpp
bool System::Object::Equals(double const &objA, double const &objB)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| objA | double const\& | Sol taraf (LHS) kayan nokta değeri. |
| objB | double const\& | Sağ taraf (RHS) kayan nokta değeri. |

### ReturnValue

Her iki **objA** ve **objB** NaN ise veya eşitse doğru, aksi takdirde yanlış.

## Ayrıca Bakınız

* Class [Object](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Object::Equals(float const\&, float const\&) method


IEC 60559:1989'a göre NaN'in herhangi bir değere, NaN dahil, eşit olmamasına rağmen, iki NaN'in eşit kabul edildiği C# tarzı kayan nokta karşılaştırmasını taklit eder.

```cpp
bool System::Object::Equals(float const &objA, float const &objB)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| objA | float const\& | Sol taraf (LHS) kayan nokta değeri. |
| objB | float const\& | Sağ taraf (RHS) kayan nokta değeri. |

### ReturnValue

Her iki **objA** ve **objB** NaN ise veya eşitse doğru, aksi takdirde yanlış.

## Ayrıca Bakınız

* Class [Object](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Object::Equals(T1 const\&, T2 const\&) method


C# tarzında referans türü nesnelerini karşılaştırır.

```cpp
template<typename T1,typename T2> static std::enable_if<IsSmartPtr<T1>::value &&IsSmartPtr<T2>::value, bool>::type System::Object::Equals(T1 const &objA, T2 const &objB)
```


| Parameter | Açıklama |
| --- | --- |
| T1 | Karşılaştırılacak ilk nesnenin türü. |
| T2 | Karşılaştırılacak ikinci nesnenin türü. |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| objA | T1 const\& | Karşılaştırılacak ilk nesne. |
| objB | T2 const\& | Karşılaştırılacak ikinci nesne. |

### ReturnValue

Nesneler referansla veya anlamsal olarak ([Object.Equals](./) benzeri karşılaştırma) eşleşiyorsa doğru, aksi takdirde yanlış.

## Ayrıca Bakınız

* Class [Object](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Object::Equals(T1 const\&, T2 const\&) method


C# tarzında değer türü nesnelerini karşılaştırır.

```cpp
template<typename T1,typename T2> static std::enable_if<!IsSmartPtr<T1>::value &&!IsSmartPtr<T2>::value, bool>::type System::Object::Equals(T1 const &objA, T2 const &objB)
```


| Parameter | Açıklama |
| --- | --- |
| T1 | Karşılaştırılacak ilk nesnenin türü. |
| T2 | Karşılaştırılacak ikinci nesnenin türü. |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| objA | T1 const\& | Karşılaştırılacak ilk nesne. |
| objB | T2 const\& | Karşılaştırılacak ikinci nesne. |

### ReturnValue

Nesneler mevcut eşitlik operatörüyle eşit kabul ediliyorsa doğru, aksi takdirinde yanlış.

## Ayrıca Bakınız

* Class [Object](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
