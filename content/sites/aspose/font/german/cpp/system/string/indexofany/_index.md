---
title: "System::String::IndexOfAny Methode"
linktitle: "IndexOfAny"
second_title: "Aspose.Font für C++"
description: "System::String::IndexOfAny Methode. Vorwärtsnachschlagen von Zeichen in C++."
type: docs
weight: 1600
url: /de/cpp/system/string/indexofany/
---
## String::IndexOfAny(char_t, int) const method


Vorwärtssuche nach Zeichen.

```cpp
int System::String::IndexOfAny(char_t c, int startIndex=0) const
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| c | char_t | Zu suchendes Zeichen. |
| startIndex | int | Index, bei dem die Suche beginnt. |

### ReturnValue

Index der ersten Zeichenposition seit startIndex oder -1, wenn nicht gefunden.

## Siehe auch

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::IndexOfAny(const ArrayPtr\<char_t\>\&) const method


Sucht nach beliebigen der übergebenen Zeichen im gesamten String. Vergleicht das erste Zeichen des Strings mit allen Zeichen in anyOf, dann das zweite usw. Gibt den Index des ersten Zeichens zurück, das einem der Zielzeichen entspricht.

```cpp
int System::String::IndexOfAny(const ArrayPtr<char_t> &anyOf) const
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| anyOf | const ArrayPtr\<char_t\>\& | [Array](../../array/) von zu suchenden Zeichen. Die Reihenfolge ist egal. |

### ReturnValue

Index des ersten passenden Zeichens oder -1, wenn nicht gefunden.

## Siehe auch

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::IndexOfAny(const ArrayPtr\<char_t\>\&, int32_t) const method


Sucht nach beliebigen der übergebenen Zeichen im Teilstring. Vergleicht das erste Zeichen des Strings mit allen Zeichen in anyOf, dann das zweite usw. Gibt den Index des ersten Zeichens zurück, das einem der Zielzeichen entspricht.

```cpp
int System::String::IndexOfAny(const ArrayPtr<char_t> &anyOf, int32_t startindex) const
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| anyOf | const ArrayPtr\<char_t\>\& | [Array](../../array/) von zu suchenden Zeichen. Die Reihenfolge ist egal. |
| startindex | int32_t | Index, von dem die Suche gestartet wird. |

### ReturnValue

Index des ersten passenden Zeichens oder -1, wenn nicht gefunden.

## Siehe auch

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::IndexOfAny(const ArrayPtr\<char_t\>\&, int32_t, int32_t) const method


Sucht nach beliebigen der übergebenen Zeichen im Teilstring. Vergleicht das erste Zeichen des Strings mit allen Zeichen in anyOf, dann das zweite usw. Gibt den Index des ersten Zeichens zurück, das einem der Zielzeichen entspricht.

```cpp
int System::String::IndexOfAny(const ArrayPtr<char_t> &anyOf, int32_t startindex, int32_t count) const
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| anyOf | const ArrayPtr\<char_t\>\& | [Array](../../array/) von zu suchenden Zeichen. Die Reihenfolge ist egal. |
| startindex | int32_t | Index, von dem die Suche gestartet wird. |
| count | int32_t | Anzahl der zu durchsuchenden Zeichen. |

### ReturnValue

Index des ersten passenden Zeichens oder -1, wenn nicht gefunden.

## Siehe auch

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::IndexOfAny(const String\&, int) const method


Sucht folglich nach allen Zeichen von str in diesem. Wenn das erste Zeichen gefunden wird, wird seine Position zurückgegeben, andernfalls wird nach dem zweiten gesucht usw.

```cpp
int System::String::IndexOfAny(const String &str, int startIndex=0) const
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| str | const String\& | [String](../) der zu suchenden Zeichen. Die Reihenfolge der Zeichen ist wichtig. |
| startIndex | int | Position, ab der die Suche gestartet wird. |

### ReturnValue

Index des zuerst gefundenen Zeichens oder -1, wenn keines gefunden wird.

## Siehe auch

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
