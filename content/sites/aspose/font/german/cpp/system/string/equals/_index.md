---
title: "System::String::Equals Methode"
linktitle: "Gleich"
second_title: "Aspose.Font für C++"
description: "System::String::Equals Methode. Vergleich der Gleichheit von Strings. Verwendet den Vergleichsmodus System::StringComparison::Ordinal in C++."
type: docs
weight: 1100
url: /de/cpp/system/string/equals/
---
## String::Equals(const String\&) const method


[String](../) equality comparison. Uses [System::StringComparison::Ordinal](../../stringcomparison/) comparison mode.

```cpp
bool System::String::Equals(const String &str) const
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| str | const String\& | [String](../) zum Vergleich mit dem aktuellen. |

### ReturnValue

Wahr, wenn die Zeichenketten übereinstimmen, sonst falsch.

## Siehe auch

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::Equals(const String\&, System::StringComparison) const method


[String](../) equality comparison. Several modes provided by [StringComparison](../../stringcomparison/) enumeration are supported.

```cpp
bool System::String::Equals(const String &str, System::StringComparison comparison_type) const
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| str | const String\& | [String](../) zum Vergleich mit dem aktuellen. |
| comparison_type | System::StringComparison | [Comparison](../../comparison/) Modus (siehe [System::StringComparison](../../stringcomparison/) für Details). |

### ReturnValue

true, wenn die Strings mit dem ausgewählten Vergleichstyp übereinstimmen, sonst false.

## Siehe auch

* Class [String](../)
* Enum [StringComparison](../../stringcomparison/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::Equals(const String\&, const String\&) method


Equal vergleicht zwei Zeichenketten im Ordial-Vergleichsmodus.

```cpp
static bool System::String::Equals(const String &strA, const String &strB)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| strA | const String\& | Erster zu vergleichender String. |
| strB | const String\& | Zweiter zu vergleichender String. |

### ReturnValue

Wahr, wenn die Zeichenketten übereinstimmen, sonst falsch.

## Siehe auch

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::Equals(const String\&, const String\&, System::StringComparison) method


Equal vergleicht zwei Zeichenketten.

```cpp
static bool System::String::Equals(const String &strA, const String &strB, System::StringComparison comparison_type)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| strA | const String\& | Erster zu vergleichender String. |
| strB | const String\& | Zweiter zu vergleichender String. |
| comparison_type | System::StringComparison | [Comparison](../../comparison/) Modus. |

### ReturnValue

Wahr, wenn die Zeichenketten übereinstimmen, sonst falsch.

## Siehe auch

* Class [String](../)
* Enum [StringComparison](../../stringcomparison/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
