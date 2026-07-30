---
title: "System::String::LastIndexOf Methode"
linktitle: "LastIndexOf"
second_title: "Aspose.Font für C++"
description: "System::String::LastIndexOf-Methode. Rückwärtsnachschlagen von Zeichen in C++."
type: docs
weight: 2400
url: /de/cpp/system/string/lastindexof/
---
## String::LastIndexOf(char_t) const method


Rückwärtssuche nach Zeichen.

```cpp
int System::String::LastIndexOf(char_t value) const
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | char_t | Zu suchendes Zeichen. |

### ReturnValue

Index der letzten Zeichenposition oder -1, falls nicht gefunden.

## Siehe auch

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::LastIndexOf(char_t, int32_t) const method


Rückwärtssuche nach Zeichen.

```cpp
int System::String::LastIndexOf(char_t value, int32_t startIndex) const
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | char_t | Zu suchendes Zeichen. |
| startIndex | int32_t | Index, bei dem die Suche beginnt. |

### ReturnValue

Index der letzten Zeichenposition seit startIndex oder -1, falls nicht gefunden.

## Siehe auch

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::LastIndexOf(char_t, int32_t, int32_t) const method


Rückwärtssuche nach Zeichen.

```cpp
int System::String::LastIndexOf(char_t value, int32_t startIndex, int32_t count) const
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | char_t | Zu suchendes Zeichen. |
| startIndex | int32_t | Index, bei dem die Suche beginnt. |
| count | int32_t | Anzahl der zu durchsuchenden Zeichen |

### ReturnValue

Index der letzten Zeichenposition seit startIndex oder -1, falls nicht gefunden.

## Siehe auch

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::LastIndexOf(const String\&, int, System::StringComparison) const method


Rückwärtssuche im Teilstring.

```cpp
int System::String::LastIndexOf(const String &str, int startIndex, System::StringComparison comparison_type) const
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| str | const String\& | Zu suchender Teilstring. |
| startIndex | int | Position im Quellstring, ab der die Suche beginnt. |
| comparison_type | System::StringComparison | [Comparison](../../comparison/) Modus. |

### ReturnValue

Index des zuletzt gefundenen Teilstrings oder -1, falls nicht gefunden. Für einen leeren Suchstring wird immer die Stringlänge zurückgegeben.

## Siehe auch

* Class [String](../)
* Enum [StringComparison](../../stringcomparison/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::LastIndexOf(const String\&, int) const method


Rückwärtssuche im Teilstring.

```cpp
int System::String::LastIndexOf(const String &str, int startIndex=INT32_MAX) const
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| str | const String\& | Zu suchender Teilstring. |
| startIndex | int | Position im Quellstring, ab der die Suche beginnt. |

### ReturnValue

Index des zuletzt gefundenen Teilstrings oder -1, falls nicht gefunden. Für einen leeren Suchstring wird immer die Stringlänge zurückgegeben.

## Siehe auch

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::LastIndexOf(const String\&, System::StringComparison) const method


Rückwärtssuche im Teilstring.

```cpp
int System::String::LastIndexOf(const String &str, System::StringComparison comparison_type) const
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| str | const String\& | Zu suchender Teilstring. |
| comparison_type | System::StringComparison | [Comparison](../../comparison/) Modus. |

### ReturnValue

Index des zuletzt gefundenen Teilstrings oder -1, falls nicht gefunden. Für einen leeren Suchstring wird immer die Stringlänge zurückgegeben.

## Siehe auch

* Class [String](../)
* Enum [StringComparison](../../stringcomparison/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::LastIndexOf(const String\&, int, int, StringComparison) const method


Rückwärtssuche im Teilstring.

```cpp
int System::String::LastIndexOf(const String &value, int startIndex, int count, StringComparison comparisonType) const
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | const String\& | Zu suchender Teilstring. |
| startIndex | int | Position im Quellstring, ab der die Suche beginnt. |
| count | int | Anzahl der zu durchsuchenden Zeichen. |
| comparisonType | StringComparison | [Comparison](../../comparison/) Modus. |

### ReturnValue

Index des zuletzt gefundenen Teilstrings oder -1, falls nicht gefunden. Für einen leeren Suchstring wird immer startIndex+count zurückgegeben.

## Siehe auch

* Class [String](../)
* Enum [StringComparison](../../stringcomparison/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
