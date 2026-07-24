---
title: "System::String::LastIndexOf‑Methode"
linktitle: "LastIndexOf"
second_title: "Aspose.Page für C++"
description: "System::String::LastIndexOf‑Methode. Rückwärtsnachschlagen eines Zeichens in C++."
type: docs
weight: 2400
url: /de/cpp/system/string/lastindexof/
---
## String::LastIndexOf(char_t) const method


Zeichen-Rückwärtssuche.

```cpp
int System::String::LastIndexOf(char_t value) const
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | char_t | Gesuchtes Zeichen. |

### ReturnValue

Index der letzten Zeichenposition oder -1, wenn nicht gefunden.

## Siehe auch

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::LastIndexOf(char_t, int32_t) const method


Zeichen-Rückwärtssuche.

```cpp
int System::String::LastIndexOf(char_t value, int32_t startIndex) const
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | char_t | Gesuchtes Zeichen. |
| startIndex | int32_t | Index, ab dem die Suche gestartet wird. |

### ReturnValue

Index der letzten Zeichenposition seit startIndex oder -1, wenn nicht gefunden.

## Siehe auch

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::LastIndexOf(char_t, int32_t, int32_t) const method


Zeichen-Rückwärtssuche.

```cpp
int System::String::LastIndexOf(char_t value, int32_t startIndex, int32_t count) const
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | char_t | Gesuchtes Zeichen. |
| startIndex | int32_t | Index, ab dem die Suche gestartet wird. |
| count | int32_t | Anzahl der zu durchsuchenden Zeichen |

### ReturnValue

Index der letzten Zeichenposition seit startIndex oder -1, wenn nicht gefunden.

## Siehe auch

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::LastIndexOf(const String\&, int, System::StringComparison) const method


Substring-Rückwärtssuche.

```cpp
int System::String::LastIndexOf(const String &str, int startIndex, System::StringComparison comparison_type) const
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| str | const String\& | Zu suchendes Substring. |
| startIndex | int | Position im Quellstring, ab der die Suche gestartet wird. |
| comparison_type | System::StringComparison | [Comparison](../../comparison/) Modus. |

### ReturnValue

Index des zuletzt gefundenen Substrings oder -1, wenn nicht gefunden. Für einen leeren Suchstring wird immer die Stringlänge zurückgegeben.

## Siehe auch

* Class [String](../)
* Enum [StringComparison](../../stringcomparison/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::LastIndexOf(const String\&, int) const method


Substring-Rückwärtssuche.

```cpp
int System::String::LastIndexOf(const String &str, int startIndex=INT32_MAX) const
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| str | const String\& | Zu suchendes Substring. |
| startIndex | int | Position im Quellstring, ab der die Suche gestartet wird. |

### ReturnValue

Index des zuletzt gefundenen Substrings oder -1, wenn nicht gefunden. Für einen leeren Suchstring wird immer die Stringlänge zurückgegeben.

## Siehe auch

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::LastIndexOf(const String\&, System::StringComparison) const method


Substring-Rückwärtssuche.

```cpp
int System::String::LastIndexOf(const String &str, System::StringComparison comparison_type) const
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| str | const String\& | Zu suchendes Substring. |
| comparison_type | System::StringComparison | [Comparison](../../comparison/) Modus. |

### ReturnValue

Index des zuletzt gefundenen Substrings oder -1, wenn nicht gefunden. Für einen leeren Suchstring wird immer die Stringlänge zurückgegeben.

## Siehe auch

* Class [String](../)
* Enum [StringComparison](../../stringcomparison/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::LastIndexOf(const String\&, int, int, StringComparison) const method


Substring-Rückwärtssuche.

```cpp
int System::String::LastIndexOf(const String &value, int startIndex, int count, StringComparison comparisonType) const
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | const String\& | Zu suchendes Substring. |
| startIndex | int | Position im Quellstring, ab der die Suche gestartet wird. |
| count | int | Anzahl der zu durchsuchenden Zeichen. |
| comparisonType | StringComparison | [Comparison](../../comparison/) Modus. |

### ReturnValue

Index des zuletzt gefundenen Substrings oder -1, wenn nicht gefunden. Für einen leeren Suchstring wird immer startIndex+count zurückgegeben.

## Siehe auch

* Class [String](../)
* Enum [StringComparison](../../stringcomparison/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
