---
title: "System::String::Equals yöntemi"
linktitle: "Eşittir"
second_title: "Aspose.Font için C++"
description: "System::String::Equals yöntemi. String eşitliği karşılaştırması. C++'da System::StringComparison::Ordinal karşılaştırma modunu kullanır."
type: docs
weight: 1100
url: /tr/cpp/system/string/equals/
---
## String::Equals(const String\&) const method


[String](../) equality comparison. Uses [System::StringComparison::Ordinal](../../stringcomparison/) comparison mode.

```cpp
bool System::String::Equals(const String &str) const
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| str | const String\& | [String](../) mevcut olanla karşılaştırmak için. |

### ReturnValue

Eşleşen dizeler varsa doğru, aksi takdirde yanlış.

## Ayrıca Bakınız

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::Equals(const String\&, System::StringComparison) const method


[String](../) equality comparison. Several modes provided by [StringComparison](../../stringcomparison/) enumeration are supported.

```cpp
bool System::String::Equals(const String &str, System::StringComparison comparison_type) const
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| str | const String\& | [String](../) mevcut olanla karşılaştırmak için. |
| comparison_type | System::StringComparison | [Comparison](../../comparison/) modu (detaylar için [System::StringComparison](../../stringcomparison/) bakınız). |

### ReturnValue

Seçilen karşılaştırma türüyle string'ler eşleşiyorsa true, aksi takdirde false.

## Ayrıca Bakınız

* Class [String](../)
* Enum [StringComparison](../../stringcomparison/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::Equals(const String\&, const String\&) method


Equal iki dizeyi Ordial karşılaştırma modunu kullanarak karşılaştırır.

```cpp
static bool System::String::Equals(const String &strA, const String &strB)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| strA | const String\& | Karşılaştırılacak ilk dize. |
| strB | const String\& | Karşılaştırılacak ikinci dize. |

### ReturnValue

Eşleşen dizeler varsa doğru, aksi takdirde yanlış.

## Ayrıca Bakınız

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::Equals(const String\&, const String\&, System::StringComparison) method


Equal iki dizeyi karşılaştırır.

```cpp
static bool System::String::Equals(const String &strA, const String &strB, System::StringComparison comparison_type)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| strA | const String\& | Karşılaştırılacak ilk dize. |
| strB | const String\& | Karşılaştırılacak ikinci dize. |
| comparison_type | System::StringComparison | [Comparison](../../comparison/) modu. |

### ReturnValue

Eşleşen dizeler varsa doğru, aksi takdirde yanlış.

## Ayrıca Bakınız

* Class [String](../)
* Enum [StringComparison](../../stringcomparison/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
