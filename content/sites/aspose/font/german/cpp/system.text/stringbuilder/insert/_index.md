---
title: "System::Text::StringBuilder::Insert Methode"
linktitle: "Einfügen"
second_title: "Aspose.Font für C++"
description: "System::Text::StringBuilder::Insert Methode. Fügt Zeichen an der festen Position des Builders in C++ ein."
type: docs
weight: 1200
url: /de/cpp/system.text/stringbuilder/insert/
---
## StringBuilder::Insert(int, const System::ArrayPtr\<char_t\>\&, int, int) method


Fügt Zeichen an einer festen Position des Builders ein.

```cpp
StringBuilder * System::Text::StringBuilder::Insert(int index, const System::ArrayPtr<char_t> &chars, int startIndex, int charCount)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Index | int | Position, in die Zeichen eingefügt werden sollen. |
| chars | const System::ArrayPtr\<char_t\>\& | [Array](../../../system/array/) von dem ein Slice eingefügt werden soll. |
| startIndex | int | [Array](../../../system/array/) Slice‑Startindex. |
| charCount | int | [Array](../../../system/array/) Slice‑Länge. |

### ReturnValue

Dieser Zeiger.

## Siehe auch

* Class [StringBuilder](../)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [StringBuilder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## StringBuilder::Insert(int, char_t) method


Fügt ein Zeichen an einer festen Position des Builders ein.

```cpp
StringBuilder * System::Text::StringBuilder::Insert(int startIndex, char_t ch)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| startIndex | int | Position, in die Zeichen eingefügt werden sollen. |
| ch | char_t | Zeichen zum Einfügen. |

### ReturnValue

Dieser Zeiger.

## Siehe auch

* Class [StringBuilder](../)
* Class [StringBuilder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## StringBuilder::Insert(int, const String\&) method


Fügt eine Zeichenkette an einer festen Position des Builders ein.

```cpp
StringBuilder * System::Text::StringBuilder::Insert(int startIndex, const String &str)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| startIndex | int | Position, in die Zeichen eingefügt werden sollen. |
| str | const String\& | [String](../../../system/string/) zum Einfügen. |

### ReturnValue

Dieser Zeiger.

## Siehe auch

* Class [StringBuilder](../)
* Class [String](../../../system/string/)
* Class [StringBuilder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## StringBuilder::Insert(int, T) method


Fügt einen Wert an einer festen Position des Builders ein.

```cpp
template<typename T> std::enable_if<std::is_arithmetic<T>::value, StringBuilder *>::type System::Text::StringBuilder::Insert(int startIndex, T value)
```


| Parameter | Beschreibung |
| --- | --- |
| Parameter | Typ. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| startIndex | int | Position, in die Zeichen eingefügt werden sollen. |
| Wert | T | Wert zum Formatieren und Einfügen. |

### ReturnValue

Dieser Zeiger.

## Siehe auch

* Class [StringBuilder](../)
* Class [StringBuilder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## StringBuilder::Insert(int32_t, const String\&, int32_t) method


Fügt eine wiederholte Zeichenkette an einer festen Position des Builders ein.

```cpp
StringBuilder * System::Text::StringBuilder::Insert(int32_t index, const String &value, int32_t count)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Index | int32_t | Position, in die Zeichen eingefügt werden sollen. |
| value | const String\& | [String](../../../system/string/) zum Einfügen. |
| count | int32_t | Wie oft soll die **value**-Zeichenkette wiederholt werden. |

### ReturnValue

Dieser Zeiger.

## Siehe auch

* Class [StringBuilder](../)
* Class [String](../../../system/string/)
* Class [StringBuilder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
