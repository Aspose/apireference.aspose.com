---
title: "System::Globalization::CompareInfo::Compare Methode"
linktitle: "Compare"
second_title: "Aspose.Font für C++"
description: "System::Globalization::CompareInfo::Compare Methode. Vergleicht Zeichenketten. Nur die Modi Ordinal und OrdinalIgnoreCase werden in C++ unterstützt."
type: docs
weight: 200
url: /de/cpp/system.globalization/compareinfo/compare/
---
## CompareInfo::Compare(const String\&, const String\&, CompareOptions) const method


Vergleicht Zeichenketten. Nur die Modi Ordinal und OrdinalIgnoreCase werden unterstützt.

```cpp
virtual int System::Globalization::CompareInfo::Compare(const String &a, const String &b, CompareOptions options) const
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| a | const String\& | LHS-Zeichenkette. |
| b | const String\& | RHS-Zeichenkette. |
| options | CompareOptions | [String](../../../system/string/) Vergleichstyp. |

### ReturnValue

Negativer Wert, wenn die LHS-Zeichenkette der RHS-Zeichenkette vorausgeht, null wenn sie übereinstimmen, sonst ein positiver Wert.

## Siehe auch

* Class [String](../../../system/string/)
* Enum [CompareOptions](../../compareoptions/)
* Class [CompareInfo](../)
* Namespace [System::Globalization](../../)
* Library [Aspose.Font for C++](../../../)
## CompareInfo::Compare(const String\&, const String\&) const method


Vergleicht Zeichenketten. Nicht implementiert.

```cpp
virtual int System::Globalization::CompareInfo::Compare(const String &string1, const String &string2) const
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| string1 | const String\& | LHS-Zeichenkette. |
| string2 | const String\& | RHS-Zeichenkette. |

### ReturnValue

Negativer Wert, wenn die LHS-Zeichenkette der RHS-Zeichenkette vorausgeht, null wenn sie übereinstimmen, sonst ein positiver Wert.

## Siehe auch

* Class [String](../../../system/string/)
* Class [CompareInfo](../)
* Namespace [System::Globalization](../../)
* Library [Aspose.Font for C++](../../../)
## CompareInfo::Compare(const String\&, int, const String\&, int) const method


Vergleicht das Endsegment einer Zeichenkette mit dem Endsegment einer zweiten Zeichenkette. Nicht implementiert.

```cpp
virtual int System::Globalization::CompareInfo::Compare(const String &string1, int offset1, const String &string2, int offset2) const
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| string1 | const String\& | Erste Zeichenkette. |
| offset1 | int | Startindex der Zeichen in **string1**. |
| string2 | const String\& | Zweite Zeichenkette. |
| offset2 | int | Startindex der Zeichen in **string2**. |

### ReturnValue

Negativer Wert, wenn der erste Zeichenkettenabschnitt dem zweiten Zeichenkettenabschnitt vorausgeht, Null, wenn sie übereinstimmen, sonst ein positiver Wert.

## Siehe auch

* Class [String](../../../system/string/)
* Class [CompareInfo](../)
* Namespace [System::Globalization](../../)
* Library [Aspose.Font for C++](../../../)
## CompareInfo::Compare(const String\&, int, const String\&, int, CompareOptions) const method


Vergleicht das Endsegment einer Zeichenkette mit dem Endsegment einer zweiten Zeichenkette mittels Zeichenkettenvergleichsmethoden. Nicht implementiert.

```cpp
virtual int System::Globalization::CompareInfo::Compare(const String &string1, int offset1, const String &string2, int offset2, CompareOptions options) const
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| string1 | const String\& | Erste Zeichenkette. |
| offset1 | int | Startindex der Zeichen in **string1**. |
| string2 | const String\& | Zweite Zeichenkette. |
| offset2 | int | Startindex der Zeichen in **string2**. |
| options | CompareOptions | Vergleichsoptionen für [String](../../../system/string/). |

### ReturnValue

Negativer Wert, wenn der erste Zeichenkettenabschnitt dem zweiten Zeichenkettenabschnitt vorausgeht, Null, wenn sie übereinstimmen, sonst ein positiver Wert.

## Siehe auch

* Class [String](../../../system/string/)
* Enum [CompareOptions](../../compareoptions/)
* Class [CompareInfo](../)
* Namespace [System::Globalization](../../)
* Library [Aspose.Font for C++](../../../)
## CompareInfo::Compare(const String\&, int, int, const String\&, int, int) const method


Vergleicht einen Abschnitt einer Zeichenkette mit einem Abschnitt einer zweiten Zeichenkette. Nicht implementiert.

```cpp
virtual int System::Globalization::CompareInfo::Compare(const String &string1, int offset1, int length1, const String &string2, int offset2, int length2) const
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| string1 | const String\& | Erste Zeichenkette. |
| offset1 | int | Startindex der Zeichen in **string1**. |
| length1 | int | Anzahl der Zeichen in **string1**, die verglichen werden sollen. |
| string2 | const String\& | Zweite Zeichenkette. |
| offset2 | int | Startindex der Zeichen in **string2**. |
| length2 | int | Anzahl der Zeichen in **string2**, die verglichen werden sollen. |

### ReturnValue

Negativer Wert, wenn der erste Zeichenkettenabschnitt dem zweiten Zeichenkettenabschnitt vorausgeht, Null, wenn sie übereinstimmen, sonst ein positiver Wert.

## Siehe auch

* Class [String](../../../system/string/)
* Class [CompareInfo](../)
* Namespace [System::Globalization](../../)
* Library [Aspose.Font for C++](../../../)
## CompareInfo::Compare(const String\&, int, int, const String\&, int, int, CompareOptions) const method


Vergleicht einen Abschnitt einer Zeichenkette mit einem Abschnitt einer zweiten Zeichenkette mittels Zeichenkettenvergleichsmethoden. Nicht implementiert.

```cpp
virtual int System::Globalization::CompareInfo::Compare(const String &string1, int offset1, int length1, const String &string2, int offset2, int length2, CompareOptions options) const
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| string1 | const String\& | Erste Zeichenkette. |
| offset1 | int | Startindex der Zeichen in **string1**. |
| length1 | int | Anzahl der Zeichen in **string1**, die verglichen werden sollen. |
| string2 | const String\& | Zweite Zeichenkette. |
| offset2 | int | Startindex der Zeichen in **string2**. |
| length2 | int | Anzahl der Zeichen in **string2**, die verglichen werden sollen. |
| options | CompareOptions | Vergleichsoptionen für [String](../../../system/string/). |

### ReturnValue

Negativer Wert, wenn der erste Zeichenkettenabschnitt dem zweiten Zeichenkettenabschnitt vorausgeht, Null, wenn sie übereinstimmen, sonst ein positiver Wert.

## Siehe auch

* Class [String](../../../system/string/)
* Enum [CompareOptions](../../compareoptions/)
* Class [CompareInfo](../)
* Namespace [System::Globalization](../../)
* Library [Aspose.Font for C++](../../../)
