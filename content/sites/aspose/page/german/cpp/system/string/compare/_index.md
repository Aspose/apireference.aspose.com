---
title: "System::String::Compare Methode"
linktitle: "Compare"
second_title: "Aspose.Page für C++"
description: "System::String::Compare Methode. Weniger-gleich-großer vergleicht zwei Zeichenketten in C++."
type: docs
weight: 6200
url: /de/cpp/system/string/compare/
---
## String::Compare(const String\&, const String\&, bool, const SharedPtr\<System::Globalization::CultureInfo\>\&) method


Less-equal-greater vergleicht zwei Zeichenketten.

```cpp
static int System::String::Compare(const String &strA, const String &strB, bool ignoreCase, const SharedPtr<System::Globalization::CultureInfo> &ci)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| strA | const String\& | Erste Zeichenkette zum Vergleichen. |
| strB | const String\& | Zweite Zeichenkette zum Vergleichen. |
| ignoreCase | bool | Gibt an, ob der Vergleich Groß-/Kleinschreibung ignoriert. |
| ci | const SharedPtr\<System::Globalization::CultureInfo\>\& | Kultur, die für den Vergleich verwendet wird. |

### ReturnValue

Negativer Wert, wenn das erste Teilstring kleiner als das zweite ist, Null, wenn sie übereinstimmen, sonst ein positiver Wert.

## Siehe auch

* Class [String](../)
* Typedef [SharedPtr](../../sharedptr/)
* Class [CultureInfo](../../../system.globalization/cultureinfo/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::Compare(const String\&, const String\&, bool) method


Less-equal-greater vergleicht zwei Zeichenketten.

```cpp
static int System::String::Compare(const String &strA, const String &strB, bool ignoreCase=false)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| strA | const String\& | Erste Zeichenkette zum Vergleichen. |
| strB | const String\& | Zweite Zeichenkette zum Vergleichen. |
| ignoreCase | bool | Gibt an, ob der Vergleich Groß-/Kleinschreibung ignoriert. |

### ReturnValue

Negativer Wert, wenn das erste Teilstring kleiner als das zweite ist, Null, wenn sie übereinstimmen, sonst ein positiver Wert.

## Siehe auch

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::Compare(const String\&, const String\&, System::StringComparison) method


Less-equal-greater vergleicht zwei Zeichenketten.

```cpp
static int System::String::Compare(const String &strA, const String &strB, System::StringComparison comparison_type)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| strA | const String\& | Erste Zeichenkette zum Vergleichen. |
| strB | const String\& | Zweite Zeichenkette zum Vergleichen. |
| comparison_type | System::StringComparison | [Comparison](../../comparison/) Modus. |

### ReturnValue

Negativer Wert, wenn das erste Teilstring kleiner als das zweite ist, Null, wenn sie übereinstimmen, sonst ein positiver Wert.

## Siehe auch

* Class [String](../)
* Enum [StringComparison](../../stringcomparison/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::Compare(const String\&, int, const String\&, int, int, bool, const SharedPtr\<System::Globalization::CultureInfo\>\&) method


Less-equal-greater vergleicht zwei Teilzeichenketten.

```cpp
static int System::String::Compare(const String &strA, int indexA, const String &strB, int indexB, int length, bool ignoreCase, const SharedPtr<System::Globalization::CultureInfo> &ci)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| strA | const String\& | Erste Zeichenkette zum Vergleichen. |
| indexA | int | Beginn des ersten Teilstrings. |
| strB | const String\& | Zweite Zeichenkette zum Vergleichen. |
| indexB | int | Beginn des zweiten Teilstrings. |
| Länge | int | Anzahl der zu vergleichenden Zeichen. |
| ignoreCase | bool | Gibt an, ob der Vergleich Groß-/Kleinschreibung ignoriert. |
| ci | const SharedPtr\<System::Globalization::CultureInfo\>\& | Kultur, die für den Vergleich verwendet wird. |

### ReturnValue

Negativer Wert, wenn das erste Teilstring kleiner als das zweite ist, Null, wenn sie übereinstimmen, sonst ein positiver Wert.

## Siehe auch

* Class [String](../)
* Typedef [SharedPtr](../../sharedptr/)
* Class [CultureInfo](../../../system.globalization/cultureinfo/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::Compare(const String\&, int, const String\&, int, int, bool) method


Less-equal-greater vergleicht zwei Teilzeichenketten.

```cpp
static int System::String::Compare(const String &strA, int indexA, const String &strB, int indexB, int length, bool ignoreCase=false)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| strA | const String\& | Erste Zeichenkette zum Vergleichen. |
| indexA | int | Beginn des ersten Teilstrings. |
| strB | const String\& | Zweite Zeichenkette zum Vergleichen. |
| indexB | int | Beginn des zweiten Teilstrings. |
| Länge | int | Anzahl der zu vergleichenden Zeichen. |
| ignoreCase | bool | Gibt an, ob der Vergleich Groß-/Kleinschreibung ignoriert. |

### ReturnValue

Negativer Wert, wenn das erste Teilstring kleiner als das zweite ist, Null, wenn sie übereinstimmen, sonst ein positiver Wert.

## Siehe auch

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::Compare(const String\&, int, const String\&, int, int, System::StringComparison) method


Less-equal-greater vergleicht zwei Zeichenketten.

```cpp
static int System::String::Compare(const String &strA, int indexA, const String &strB, int indexB, int length, System::StringComparison comparison_type)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| strA | const String\& | Erste Zeichenkette zum Vergleichen. |
| indexA | int | Beginn des ersten Teilstrings. |
| strB | const String\& | Zweite Zeichenkette zum Vergleichen. |
| indexB | int | Beginn des zweiten Teilstrings. |
| Länge | int | Anzahl der zu vergleichenden Zeichen. |
| comparison_type | System::StringComparison | [Comparison](../../comparison/) Modus. |

### ReturnValue

Negativer Wert, wenn das erste Teilstring kleiner als das zweite ist, Null, wenn sie übereinstimmen, sonst ein positiver Wert.

## Siehe auch

* Class [String](../)
* Enum [StringComparison](../../stringcomparison/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
