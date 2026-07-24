---
title: "System::String::Compare yöntemi"
linktitle: "Compare"
second_title: "Aspose.Page için C++"
description: "System::String::Compare yöntemi. Küçük-eşit-büyük karşılaştırması C++'ta iki dizeyi karşılaştırır."
type: docs
weight: 6200
url: /tr/cpp/system/string/compare/
---
## String::Compare(const String\&, const String\&, bool, const SharedPtr\<System::Globalization::CultureInfo\>\&) method


Less-equal-greater iki dizeyi karşılaştırır.

```cpp
static int System::String::Compare(const String &strA, const String &strB, bool ignoreCase, const SharedPtr<System::Globalization::CultureInfo> &ci)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| strA | const String\& | Karşılaştırılacak ilk dize. |
| strB | const String\& | Karşılaştırılacak ikinci dize. |
| ignoreCase | bool | Karşılaştırmanın büyük/küçük harfe duyarlı olup olmadığını belirtir. |
| ci | const SharedPtr\<System::Globalization::CultureInfo\>\& | Karşılaştırma için kullanılacak kültür. |

### ReturnValue

İlk alt dize ikinci alt dizeden küçükse negatif değer, eşleşiyorlarsa sıfır, aksi takdirde pozitif değer.

## Ayrıca Bakınız

* Class [String](../)
* Typedef [SharedPtr](../../sharedptr/)
* Class [CultureInfo](../../../system.globalization/cultureinfo/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::Compare(const String\&, const String\&, bool) method


Less-equal-greater iki dizeyi karşılaştırır.

```cpp
static int System::String::Compare(const String &strA, const String &strB, bool ignoreCase=false)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| strA | const String\& | Karşılaştırılacak ilk dize. |
| strB | const String\& | Karşılaştırılacak ikinci dize. |
| ignoreCase | bool | Karşılaştırmanın büyük/küçük harfe duyarlı olup olmadığını belirtir. |

### ReturnValue

İlk alt dize ikinci alt dizeden küçükse negatif değer, eşleşiyorlarsa sıfır, aksi takdirde pozitif değer.

## Ayrıca Bakınız

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::Compare(const String\&, const String\&, System::StringComparison) method


Less-equal-greater iki dizeyi karşılaştırır.

```cpp
static int System::String::Compare(const String &strA, const String &strB, System::StringComparison comparison_type)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| strA | const String\& | Karşılaştırılacak ilk dize. |
| strB | const String\& | Karşılaştırılacak ikinci dize. |
| comparison_type | System::StringComparison | [Karşılaştırma](../../comparison/) modu. |

### ReturnValue

İlk alt dize ikinci alt dizeden küçükse negatif değer, eşleşiyorlarsa sıfır, aksi takdirde pozitif değer.

## Ayrıca Bakınız

* Class [String](../)
* Enum [StringComparison](../../stringcomparison/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::Compare(const String\&, int, const String\&, int, int, bool, const SharedPtr\<System::Globalization::CultureInfo\>\&) method


Less-equal-greater iki alt dizeyi karşılaştırır.

```cpp
static int System::String::Compare(const String &strA, int indexA, const String &strB, int indexB, int length, bool ignoreCase, const SharedPtr<System::Globalization::CultureInfo> &ci)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| strA | const String\& | Karşılaştırılacak ilk dize. |
| indexA | int | İlk dize alt dizisinin başlangıcı. |
| strB | const String\& | Karşılaştırılacak ikinci dize. |
| indexB | int | İkinci dize alt dizisinin başlangıcı. |
| length | int | Karşılaştırılacak karakter sayısı. |
| ignoreCase | bool | Karşılaştırmanın büyük/küçük harfe duyarlı olup olmadığını belirtir. |
| ci | const SharedPtr\<System::Globalization::CultureInfo\>\& | Karşılaştırma için kullanılacak kültür. |

### ReturnValue

İlk alt dize ikinci alt dizeden küçükse negatif değer, eşleşiyorlarsa sıfır, aksi takdirde pozitif değer.

## Ayrıca Bakınız

* Class [String](../)
* Typedef [SharedPtr](../../sharedptr/)
* Class [CultureInfo](../../../system.globalization/cultureinfo/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::Compare(const String\&, int, const String\&, int, int, bool) method


Less-equal-greater iki alt dizeyi karşılaştırır.

```cpp
static int System::String::Compare(const String &strA, int indexA, const String &strB, int indexB, int length, bool ignoreCase=false)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| strA | const String\& | Karşılaştırılacak ilk dize. |
| indexA | int | İlk dize alt dizisinin başlangıcı. |
| strB | const String\& | Karşılaştırılacak ikinci dize. |
| indexB | int | İkinci dize alt dizisinin başlangıcı. |
| length | int | Karşılaştırılacak karakter sayısı. |
| ignoreCase | bool | Karşılaştırmanın büyük/küçük harfe duyarlı olup olmadığını belirtir. |

### ReturnValue

İlk alt dize ikinci alt dizeden küçükse negatif değer, eşleşiyorlarsa sıfır, aksi takdirde pozitif değer.

## Ayrıca Bakınız

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::Compare(const String\&, int, const String\&, int, int, System::StringComparison) method


Less-equal-greater iki dizeyi karşılaştırır.

```cpp
static int System::String::Compare(const String &strA, int indexA, const String &strB, int indexB, int length, System::StringComparison comparison_type)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| strA | const String\& | Karşılaştırılacak ilk dize. |
| indexA | int | İlk dize alt dizisinin başlangıcı. |
| strB | const String\& | Karşılaştırılacak ikinci dize. |
| indexB | int | İkinci dize alt dizisinin başlangıcı. |
| length | int | Karşılaştırılacak karakter sayısı. |
| comparison_type | System::StringComparison | [Karşılaştırma](../../comparison/) modu. |

### ReturnValue

İlk alt dize ikinci alt dizeden küçükse negatif değer, eşleşiyorlarsa sıfır, aksi takdirde pozitif değer.

## Ayrıca Bakınız

* Class [String](../)
* Enum [StringComparison](../../stringcomparison/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
