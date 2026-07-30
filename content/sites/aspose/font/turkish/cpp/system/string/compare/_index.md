---
title: "System::String::Compare yöntemi"
linktitle: "Compare"
second_title: "Aspose.Font için C++"
description: "System::String::Compare yöntemi. C++'da iki dizeyi küçüktür‑eşittir‑büyüktür karşılaştırır."
type: docs
weight: 6200
url: /tr/cpp/system/string/compare/
---
## String::Compare(const String\&, const String\&, bool, const SharedPtr\<System::Globalization::CultureInfo\>\&) method


Less-equal-greater iki dizeyi karşılaştırır.

```cpp
static int System::String::Compare(const String &strA, const String &strB, bool ignoreCase, const SharedPtr<System::Globalization::CultureInfo> &ci)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| strA | const String\& | Karşılaştırılacak ilk dize. |
| strB | const String\& | Karşılaştırılacak ikinci dize. |
| ignoreCase | bool | Karşılaştırmanın büyük/küçük harfe duyarlı olup olmadığını belirtir. |
| ci | const SharedPtr\<System::Globalization::CultureInfo\>\& | Karşılaştırma için kullanılacak kültür. |

### ReturnValue

İlk alt dize ikinci alt dizeden küçükse negatif değer, eşleşiyorsa sıfır, aksi takdirde pozitif değer.

## Ayrıca Bakınız

* Class [String](../)
* Typedef [SharedPtr](../../sharedptr/)
* Class [CultureInfo](../../../system.globalization/cultureinfo/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::Compare(const String\&, const String\&, bool) method


Less-equal-greater iki dizeyi karşılaştırır.

```cpp
static int System::String::Compare(const String &strA, const String &strB, bool ignoreCase=false)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| strA | const String\& | Karşılaştırılacak ilk dize. |
| strB | const String\& | Karşılaştırılacak ikinci dize. |
| ignoreCase | bool | Karşılaştırmanın büyük/küçük harfe duyarlı olup olmadığını belirtir. |

### ReturnValue

İlk alt dize ikinci alt dizeden küçükse negatif değer, eşleşiyorsa sıfır, aksi takdirde pozitif değer.

## Ayrıca Bakınız

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::Compare(const String\&, const String\&, System::StringComparison) method


Less-equal-greater iki dizeyi karşılaştırır.

```cpp
static int System::String::Compare(const String &strA, const String &strB, System::StringComparison comparison_type)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| strA | const String\& | Karşılaştırılacak ilk dize. |
| strB | const String\& | Karşılaştırılacak ikinci dize. |
| comparison_type | System::StringComparison | [Comparison](../../comparison/) modu. |

### ReturnValue

İlk alt dize ikinci alt dizeden küçükse negatif değer, eşleşiyorsa sıfır, aksi takdirde pozitif değer.

## Ayrıca Bakınız

* Class [String](../)
* Enum [StringComparison](../../stringcomparison/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::Compare(const String\&, int, const String\&, int, int, bool, const SharedPtr\<System::Globalization::CultureInfo\>\&) method


Less-equal-greater iki alt dizeyi karşılaştırır.

```cpp
static int System::String::Compare(const String &strA, int indexA, const String &strB, int indexB, int length, bool ignoreCase, const SharedPtr<System::Globalization::CultureInfo> &ci)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| strA | const String\& | Karşılaştırılacak ilk dize. |
| indexA | int | İlk string alt dizisinin başlangıcı. |
| strB | const String\& | Karşılaştırılacak ikinci dize. |
| indexB | int | İkinci string alt dizisinin başlangıcı. |
| uzunluk | int | Karşılaştırılacak karakter sayısı. |
| ignoreCase | bool | Karşılaştırmanın büyük/küçük harfe duyarlı olup olmadığını belirtir. |
| ci | const SharedPtr\<System::Globalization::CultureInfo\>\& | Karşılaştırma için kullanılacak kültür. |

### ReturnValue

İlk alt dize ikinci alt dizeden küçükse negatif değer, eşleşiyorsa sıfır, aksi takdirde pozitif değer.

## Ayrıca Bakınız

* Class [String](../)
* Typedef [SharedPtr](../../sharedptr/)
* Class [CultureInfo](../../../system.globalization/cultureinfo/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::Compare(const String\&, int, const String\&, int, int, bool) method


Less-equal-greater iki alt dizeyi karşılaştırır.

```cpp
static int System::String::Compare(const String &strA, int indexA, const String &strB, int indexB, int length, bool ignoreCase=false)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| strA | const String\& | Karşılaştırılacak ilk dize. |
| indexA | int | İlk string alt dizisinin başlangıcı. |
| strB | const String\& | Karşılaştırılacak ikinci dize. |
| indexB | int | İkinci string alt dizisinin başlangıcı. |
| uzunluk | int | Karşılaştırılacak karakter sayısı. |
| ignoreCase | bool | Karşılaştırmanın büyük/küçük harfe duyarlı olup olmadığını belirtir. |

### ReturnValue

İlk alt dize ikinci alt dizeden küçükse negatif değer, eşleşiyorsa sıfır, aksi takdirde pozitif değer.

## Ayrıca Bakınız

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::Compare(const String\&, int, const String\&, int, int, System::StringComparison) method


Less-equal-greater iki dizeyi karşılaştırır.

```cpp
static int System::String::Compare(const String &strA, int indexA, const String &strB, int indexB, int length, System::StringComparison comparison_type)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| strA | const String\& | Karşılaştırılacak ilk dize. |
| indexA | int | İlk string alt dizisinin başlangıcı. |
| strB | const String\& | Karşılaştırılacak ikinci dize. |
| indexB | int | İkinci string alt dizisinin başlangıcı. |
| uzunluk | int | Karşılaştırılacak karakter sayısı. |
| comparison_type | System::StringComparison | [Comparison](../../comparison/) modu. |

### ReturnValue

İlk alt dize ikinci alt dizeden küçükse negatif değer, eşleşiyorsa sıfır, aksi takdirde pozitif değer.

## Ayrıca Bakınız

* Class [String](../)
* Enum [StringComparison](../../stringcomparison/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
