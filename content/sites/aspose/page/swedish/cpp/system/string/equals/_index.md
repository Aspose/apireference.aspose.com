---
title: "System::String::Equals metod"
linktitle: "Lika"
second_title: "Aspose.Page för C++"
description: "System::String::Equals metod. Jämförelse av stränglikhet. Använder jämförelseläget System::StringComparison::Ordinal i C++."
type: docs
weight: 1100
url: /sv/cpp/system/string/equals/
---
## String::Equals(const String\&) const method


[String](../) equality comparison. Uses [System::StringComparison::Ordinal](../../stringcomparison/) comparison mode.

```cpp
bool System::String::Equals(const String &str) const
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| str | const String\& | [String](../) att jämföra med den aktuella. |

### ReturnValue

Sant om strängarna matchar, annars falskt.

## Se även

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::Equals(const String\&, System::StringComparison) const method


[String](../) equality comparison. Several modes provided by [StringComparison](../../stringcomparison/) enumeration are supported.

```cpp
bool System::String::Equals(const String &str, System::StringComparison comparison_type) const
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| str | const String\& | [String](../) att jämföra med den aktuella. |
| comparison_type | System::StringComparison | [Comparison](../../comparison/) läge (se [System::StringComparison](../../stringcomparison/) för detaljer). |

### ReturnValue

true om strängarna matchar med den valda jämförelsetypen, false annars.

## Se även

* Class [String](../)
* Enum [StringComparison](../../stringcomparison/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::Equals(const String\&, const String\&) method


Equal-jämför två strängar med Ordial jämförelseläge.

```cpp
static bool System::String::Equals(const String &strA, const String &strB)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| strA | const String\& | Första strängen att jämföra. |
| strB | const String\& | Andra strängen att jämföra. |

### ReturnValue

Sant om strängarna matchar, annars falskt.

## Se även

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::Equals(const String\&, const String\&, System::StringComparison) method


Equal-jämför två strängar.

```cpp
static bool System::String::Equals(const String &strA, const String &strB, System::StringComparison comparison_type)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| strA | const String\& | Första strängen att jämföra. |
| strB | const String\& | Andra strängen att jämföra. |
| comparison_type | System::StringComparison | [Comparison](../../comparison/) läge. |

### ReturnValue

Sant om strängarna matchar, annars falskt.

## Se även

* Class [String](../)
* Enum [StringComparison](../../stringcomparison/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
