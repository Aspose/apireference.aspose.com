---
title: "System::String::LastIndexOfAny-Methode"
linktitle: "LastIndexOfAny"
second_title: "Aspose.Font für C++"
description: "System::String::LastIndexOfAny-Methode. Durchsucht die gesamte Zeichenkette rückwärts nach einem der übergebenen Zeichen. Vergleicht das letzte Zeichen der Zeichenkette mit allen Zeichen in anyOf, dann das vorherige usw. Gibt den Index der ersten gefundenen Übereinstimmung in C++ zurück."
type: docs
weight: 2500
url: /de/cpp/system/string/lastindexofany/
---
## String::LastIndexOfAny(const ArrayPtr\<char_t\>\&) const method


Sucht rückwärts nach beliebigen der übergebenen Zeichen im gesamten String. Vergleicht das letzte Zeichen des Strings mit allen Zeichen in anyOf, dann das vorherige usw. Gibt den Index des ersten gefundenen Treffers zurück.

```cpp
int System::String::LastIndexOfAny(const ArrayPtr<char_t> &anyOf) const
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| anyOf | const ArrayPtr\<char_t\>\& | [Array](../../array/) von zu suchenden Zeichen. Die Reihenfolge ist egal. |

### ReturnValue

Index des letzten passenden Zeichens oder -1, wenn nicht gefunden.

## Siehe auch

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::LastIndexOfAny(const ArrayPtr\<char_t\>\&, int32_t) const method


Sucht rückwärts nach beliebigen der übergebenen Zeichen im Teilstring. Vergleicht das letzte Zeichen des Strings mit allen Zeichen in anyOf, dann das vorherige usw. Gibt den Index des ersten gefundenen Treffers zurück.

```cpp
int System::String::LastIndexOfAny(const ArrayPtr<char_t> &anyOf, int32_t startindex) const
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| anyOf | const ArrayPtr\<char_t\>\& | [Array](../../array/) von zu suchenden Zeichen. Die Reihenfolge ist egal. |
| startindex | int32_t | Index, von dem die Suche gestartet wird. |

### ReturnValue

Index des letzten passenden Zeichens oder -1, wenn nicht gefunden.

## Siehe auch

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::LastIndexOfAny(const ArrayPtr\<char_t\>\&, int32_t, int32_t) const method


Sucht rückwärts nach beliebigen der übergebenen Zeichen im Teilstring. Vergleicht das letzte Zeichen des Strings mit allen Zeichen in anyOf, dann das vorherige usw. Gibt den Index des ersten gefundenen Treffers zurück.

```cpp
int System::String::LastIndexOfAny(const ArrayPtr<char_t> &anyOf, int32_t startindex, int32_t count) const
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| anyOf | const ArrayPtr\<char_t\>\& | [Array](../../array/) von zu suchenden Zeichen. Die Reihenfolge ist egal. |
| startindex | int32_t | Index, von dem die Suche gestartet wird. |
| count | int32_t | Anzahl der zu durchsuchenden Zeichen. |

### ReturnValue

Index des letzten passenden Zeichens oder -1, wenn nicht gefunden.

## Siehe auch

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
