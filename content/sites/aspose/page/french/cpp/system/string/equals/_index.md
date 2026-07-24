---
title: "Méthode System::String::Equals"
linktitle: "Égal"
second_title: "Aspose.Page pour C++"
description: "Méthode System::String::Equals. Comparaison d'égalité de chaînes. Utilise le mode de comparaison System::StringComparison::Ordinal en C++."
type: docs
weight: 1100
url: /fr/cpp/system/string/equals/
---
## String::Equals(const String\&) const method


[String](../) equality comparison. Uses [System::StringComparison::Ordinal](../../stringcomparison/) comparison mode.

```cpp
bool System::String::Equals(const String &str) const
```


| Paramètre | Type | Description |
| --- | --- | --- |
| str | const String\& | [String](../) à comparer avec celle actuelle. |

### ReturnValue

vrai si les chaînes correspondent, sinon faux.

## Voir aussi

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::Equals(const String\&, System::StringComparison) const method


[String](../) equality comparison. Several modes provided by [StringComparison](../../stringcomparison/) enumeration are supported.

```cpp
bool System::String::Equals(const String &str, System::StringComparison comparison_type) const
```


| Paramètre | Type | Description |
| --- | --- | --- |
| str | const String\& | [String](../) à comparer avec celle actuelle. |
| comparison_type | System::StringComparison | Mode [Comparison](../../comparison/) (voir [System::StringComparison](../../stringcomparison/) pour plus de détails). |

### ReturnValue

true si les chaînes correspondent en utilisant le type de comparaison sélectionné, false sinon.

## Voir aussi

* Class [String](../)
* Enum [StringComparison](../../stringcomparison/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::Equals(const String\&, const String\&) method


Equal compare deux chaînes en utilisant le mode de comparaison Ordial.

```cpp
static bool System::String::Equals(const String &strA, const String &strB)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| strA | const String\& | Première chaîne à comparer. |
| strB | const String\& | Deuxième chaîne à comparer. |

### ReturnValue

vrai si les chaînes correspondent, sinon faux.

## Voir aussi

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::Equals(const String\&, const String\&, System::StringComparison) method


Equal compare deux chaînes.

```cpp
static bool System::String::Equals(const String &strA, const String &strB, System::StringComparison comparison_type)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| strA | const String\& | Première chaîne à comparer. |
| strB | const String\& | Deuxième chaîne à comparer. |
| comparison_type | System::StringComparison | [Comparison](../../comparison/) mode. |

### ReturnValue

vrai si les chaînes correspondent, sinon faux.

## Voir aussi

* Class [String](../)
* Enum [StringComparison](../../stringcomparison/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
