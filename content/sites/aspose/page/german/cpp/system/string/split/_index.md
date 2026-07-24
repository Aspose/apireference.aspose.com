---
title: "System::String::Split-Methode"
linktitle: "Split"
second_title: "Aspose.Page für C++"
description: "System::String::Split-Methode. Teilt den String nach Zeichen in C++."
type: docs
weight: 4300
url: /de/cpp/system/string/split/
---
## String::Split(char_t, int32_t, StringSplitOptions) const method


Teilt die Zeichenkette nach Zeichen.

```cpp
ArrayPtr<String> System::String::Split(char_t separator, int32_t count, StringSplitOptions opt=StringSplitOptions::None) const
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Trennzeichen | char_t | Zeichen, nach dem der String zu teilen ist. |
| count | int32_t | Die maximale Anzahl von Teilzeichenketten, die zurückgegeben werden sollen. |
| opt | StringSplitOptions | Aufteilungsoptionen. |

### ReturnValue

[Array](../../array/) of substrings.

## Siehe auch

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Enum [StringSplitOptions](../../stringsplitoptions/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::Split(char_t, StringSplitOptions) const method


Teilt die Zeichenkette nach Zeichen.

```cpp
ArrayPtr<String> System::String::Split(char_t separator=u' ', StringSplitOptions opt=StringSplitOptions::None) const
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Trennzeichen | char_t | Zeichen, nach dem der String zu teilen ist. |
| opt | StringSplitOptions | Aufteilungsoptionen. |

### ReturnValue

[Array](../../array/) of substrings.

## Siehe auch

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Enum [StringSplitOptions](../../stringsplitoptions/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::Split(char_t, char_t, StringSplitOptions) const method


Teilt die Zeichenkette nach einem von zwei Zeichen.

```cpp
ArrayPtr<String> System::String::Split(char_t separatorA, char_t separatorB, StringSplitOptions opt=StringSplitOptions::None) const
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| separatorA | char_t | Erstes Zeichen, nach dem die Zeichenkette aufgeteilt wird. |
| separatorB | char_t | Zweites Zeichen, nach dem die Zeichenkette aufgeteilt wird. |
| opt | StringSplitOptions | Aufteilungsoptionen. |

### ReturnValue

[Array](../../array/) of substrings.

## Siehe auch

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Enum [StringSplitOptions](../../stringsplitoptions/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::Split(const ArrayPtr\<char_t\>\&, int32_t, StringSplitOptions) const method


Teilt den String anhand eines der angegebenen Zeichen.

```cpp
ArrayPtr<String> System::String::Split(const ArrayPtr<char_t> &separators, int32_t count, StringSplitOptions opt=StringSplitOptions::None) const
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| separators | const ArrayPtr\<char_t\>\& | [Array](../../array/) von Trennzeichen. Wenn leer, wird jedes Leerzeichen als Trennzeichen betrachtet. |
| count | int32_t | Die maximale Anzahl von Teilzeichenketten, die zurückgegeben werden sollen. |
| opt | StringSplitOptions | Aufteilungsoptionen. |

### ReturnValue

[Array](../../array/) of substrings.

## Siehe auch

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Enum [StringSplitOptions](../../stringsplitoptions/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::Split(const ArrayPtr\<char_t\>\&, StringSplitOptions) const method


Teilt den String anhand eines der angegebenen Zeichen.

```cpp
ArrayPtr<String> System::String::Split(const ArrayPtr<char_t> &separators, StringSplitOptions opt=StringSplitOptions::None) const
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| separators | const ArrayPtr\<char_t\>\& | [Array](../../array/) von Trennzeichen. Wenn leer, wird jedes Leerzeichen als Trennzeichen betrachtet. |
| opt | StringSplitOptions | Aufteilungsoptionen. |

### ReturnValue

[Array](../../array/) of substrings.

## Siehe auch

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Enum [StringSplitOptions](../../stringsplitoptions/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::Split(const ArrayPtr\<String\>\&, int, StringSplitOptions) const method


Teilt den String anhand eines Teilstrings. Derzeit unterstützt es nur ein Trennzeichen-Array mit null oder einem Element.

```cpp
ArrayPtr<String> System::String::Split(const ArrayPtr<String> &separators, int count, StringSplitOptions opt=StringSplitOptions::None) const
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| separators | const ArrayPtr\<String\>\& | [Array](../../array/) von Trennzeichen‑Strings. Wenn leer, wird nicht aufgeteilt. |
| count | int | Maximale Anzahl von Elementen im Aufteilung‑Array. |
| opt | StringSplitOptions | Aufteilungsoptionen. |

### ReturnValue

[Array](../../array/) of substrings.

## Siehe auch

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Enum [StringSplitOptions](../../stringsplitoptions/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::Split(const ArrayPtr\<String\>\&, StringSplitOptions) const method


Teilt den String anhand eines Teilstrings.

```cpp
ArrayPtr<String> System::String::Split(const ArrayPtr<String> &separators, StringSplitOptions opt=StringSplitOptions::None) const
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| separators | const ArrayPtr\<String\>\& | [Array](../../array/) von Trennzeichen‑Strings. Wenn leer, wird nicht aufgeteilt. |
| opt | StringSplitOptions | Aufteilungsoptionen. |

### ReturnValue

[Array](../../array/) of substrings.

## Siehe auch

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Enum [StringSplitOptions](../../stringsplitoptions/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::Split(const String\&, int, StringSplitOptions) const method


Teilt den String anhand eines Teilstrings.

```cpp
ArrayPtr<String> System::String::Split(const String &separator, int count, StringSplitOptions opt=StringSplitOptions::None) const
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Trennzeichen | const String\& | Teilzeichenkette, die als Trennzeichen dient. Wenn leer, wirkt ein Leerzeichen als Trennzeichen. |
| count | int | Maximale Anzahl von Elementen im Aufteilung‑Array. |
| opt | StringSplitOptions | Aufteilungsoptionen. |

### ReturnValue

[Array](../../array/) of substrings.

## Siehe auch

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Enum [StringSplitOptions](../../stringsplitoptions/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::Split(const String\&, StringSplitOptions) const method


Teilt den String anhand eines Teilstrings.

```cpp
ArrayPtr<String> System::String::Split(const String &separator, StringSplitOptions opt=StringSplitOptions::None) const
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Trennzeichen | const String\& | Teilzeichenkette, die als Trennzeichen dient. Wenn leer, wirkt ein Leerzeichen als Trennzeichen. |
| opt | StringSplitOptions | Aufteilungsoptionen. |

### ReturnValue

[Array](../../array/) of substrings.

## Siehe auch

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Enum [StringSplitOptions](../../stringsplitoptions/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
