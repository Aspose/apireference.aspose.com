---
title: "System::Text::RegularExpressions::Regex::Replace-Methode"
linktitle: "Ersetzen"
second_title: "Aspose.Page für C++"
description: "System::Text::RegularExpressions::Regex::Replace-Methode. Ersetzt alle Treffer des regulären Ausdrucks in einem String durch einen Ersetzungsstring in C++."
type: docs
weight: 800
url: /de/cpp/system.text.regularexpressions/regex/replace/
---
## Regex::Replace(const String\&, const char_t *) method


Ersetzt alle Treffer des Regex in einem String durch den Ersetzungsstring.

```cpp
String System::Text::RegularExpressions::Regex::Replace(const String &input, const char_t *replacement)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Eingabe | const String\& | Eingabezeichenkette. |
| Ersetzung | const char_t * | Ersetzungs-String. |

### ReturnValue

Eingabe-String, bei dem alle Treffer des regulären Ausdrucks durch den Ersetzungs-String ersetzt wurden.

## Siehe auch

* Class [String](../../../system/string/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
## Regex::Replace(const String\&, const MatchEvaluator\&) method


Ersetzt alle Treffer in einer Zeichenkette durch vom Delegaten erzeugte Ersetzungszeichenketten.

```cpp
String System::Text::RegularExpressions::Regex::Replace(const String &input, const MatchEvaluator &evaluator)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Eingabe | const String\& | Eingabezeichenkette. |
| Auswerter | const MatchEvaluator\& | Delegat zur Erzeugung von Ersetzungs-Strings basierend auf Treffern. |

### ReturnValue

Eingabe-Strings, bei denen alle Treffer ersetzt wurden.

## Siehe auch

* Class [String](../../../system/string/)
* Typedef [MatchEvaluator](../../matchevaluator/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
## Regex::Replace(const String\&, const MatchEvaluator\&, int) method


Ersetzt alle Treffer in einer Zeichenkette durch vom Delegaten erzeugte Ersetzungszeichenketten.

```cpp
String System::Text::RegularExpressions::Regex::Replace(const String &input, const MatchEvaluator &evaluator, int count)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Eingabe | const String\& | Eingabezeichenkette. |
| Auswerter | const MatchEvaluator\& | Delegat zur Erzeugung von Ersetzungs-Strings basierend auf Treffern. |
| count | int | Begrenzung der Ersetzungsanzahl. |

### ReturnValue

Eingabe-Strings, bei denen alle Treffer ersetzt wurden.

## Siehe auch

* Class [String](../../../system/string/)
* Typedef [MatchEvaluator](../../matchevaluator/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
## Regex::Replace(const String\&, const MatchEvaluator\&, int, int) method


Ersetzt alle Treffer in einer Zeichenkette durch vom Delegaten erzeugte Ersetzungszeichenketten.

```cpp
String System::Text::RegularExpressions::Regex::Replace(const String &input, const MatchEvaluator &evaluator, int count, int startat)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Eingabe | const String\& | Eingabezeichenkette. |
| Auswerter | const MatchEvaluator\& | Delegat zur Erzeugung von Ersetzungs-Strings basierend auf Treffern. |
| count | int | Begrenzung der Ersetzungsanzahl. |
| startat | int | Index im Eingabestring, an dem die Ersetzung beginnen soll. |

### ReturnValue

Eingabe-Strings, bei denen alle Treffer ersetzt wurden.

## Siehe auch

* Class [String](../../../system/string/)
* Typedef [MatchEvaluator](../../matchevaluator/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
## Regex::Replace(const String\&, const String\&) method


Ersetzt alle Treffer des Regex in einem String durch den Ersetzungsstring.

```cpp
String System::Text::RegularExpressions::Regex::Replace(const String &input, const String &replacement)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Eingabe | const String\& | Eingabezeichenkette. |
| Ersetzung | const String\& | Ersetzungs-String. |

### ReturnValue

Eingabe-String, bei dem alle Treffer des regulären Ausdrucks durch den Ersetzungs-String ersetzt wurden.

## Siehe auch

* Class [String](../../../system/string/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
## Regex::Replace(const String\&, const String\&, int) method


Ersetzt Teilzeichenketten in einer Zeichenkette. Nicht implementiert.

```cpp
String System::Text::RegularExpressions::Regex::Replace(const String &input, const String &replacement, int count)
```

## Siehe auch

* Class [String](../../../system/string/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
## Regex::Replace(const String\&, const String\&, int, int) method


Ersetzt Teilzeichenketten in einer Zeichenkette. Nicht implementiert.

```cpp
String System::Text::RegularExpressions::Regex::Replace(const String &input, const String &replacement, int count, int startat)
```

## Siehe auch

* Class [String](../../../system/string/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
## Regex::Replace(const String\&, const char_t *, const char_t *) method


Ersetzt alle Treffer des Regex in einem String durch den Ersetzungsstring.

```cpp
static String System::Text::RegularExpressions::Regex::Replace(const String &input, const char_t *pattern, const char_t *replacement)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Eingabe | const String\& | Eingabezeichenkette. |
| pattern | const char_t * | [Regex](../) Muster. |
| Ersetzung | const char_t * | Ersetzungs-String. |

### ReturnValue

Eingabe-String, bei dem alle Treffer des regulären Ausdrucks durch den Ersetzungs-String ersetzt wurden.

## Siehe auch

* Class [String](../../../system/string/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
## Regex::Replace(const String\&, const String\&, const char_t *) method


Ersetzt alle Treffer des Regex in einem String durch den Ersetzungsstring.

```cpp
static String System::Text::RegularExpressions::Regex::Replace(const String &input, const String &pattern, const char_t *replacement)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Eingabe | const String\& | Eingabezeichenkette. |
| pattern | const String\& | [Regex](../) Muster. |
| Ersetzung | const char_t * | Ersetzungs-String. |

### ReturnValue

Eingabe-String, bei dem alle Treffer des regulären Ausdrucks durch den Ersetzungs-String ersetzt wurden.

## Siehe auch

* Class [String](../../../system/string/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
## Regex::Replace(const String\&, const String\&, const MatchEvaluator\&) method


Ersetzt Regex‑Treffer.

```cpp
static String System::Text::RegularExpressions::Regex::Replace(const String &input, const String &pattern, const MatchEvaluator &evaluator)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Eingabe | const String\& | Eingabezeichenkette. |
| Muster | const String\& | Regexp-Muster. |
| Auswerter | const MatchEvaluator\& | Delegate zum Erzeugen des Ersetzungsstrings für jeden Treffer. |

### ReturnValue

[String](../../../system/string/) with all matches replaced.

## Siehe auch

* Class [String](../../../system/string/)
* Typedef [MatchEvaluator](../../matchevaluator/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
## Regex::Replace(const String\&, const String\&, const MatchEvaluator\&, RegexOptions) method


Ersetzt alle Treffer in einer Zeichenkette durch vom Delegaten erzeugte Ersetzungszeichenketten (statische Funktion).

```cpp
static String System::Text::RegularExpressions::Regex::Replace(const String &input, const String &pattern, const MatchEvaluator &evaluator, RegexOptions options)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Eingabe | const String\& | Eingabezeichenkette. |
| pattern | const String\& | [Regex](../) Muster. |
| Auswerter | const MatchEvaluator\& | Delegat zur Erzeugung von Ersetzungs-Strings basierend auf Treffern. |
| options | RegexOptions | [Regex](../) Optionen. |

### ReturnValue

Eingabe-Strings, bei denen alle Treffer ersetzt wurden.

## Siehe auch

* Class [String](../../../system/string/)
* Typedef [MatchEvaluator](../../matchevaluator/)
* Enum [RegexOptions](../../regexoptions/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
## Regex::Replace(const String\&, const String\&, const String\&) method


Ersetzt Regex‑Treffer.

```cpp
static String System::Text::RegularExpressions::Regex::Replace(const String &input, const String &pattern, const String &replacement)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Eingabe | const String\& | Eingabezeichenkette. |
| Muster | const String\& | Regexp-Muster. |
| Ersetzung | const String\& | Ersetzungs-String. |

### ReturnValue

[String](../../../system/string/) with all matches replaced.

## Siehe auch

* Class [String](../../../system/string/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
## Regex::Replace(const String\&, const String\&, const String\&, RegexOptions) method


Ersetzt alle Treffer des Regex in einem String durch den Ersetzungsstring.

```cpp
static String System::Text::RegularExpressions::Regex::Replace(const String &input, const String &pattern, const String &replacement, RegexOptions options)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Eingabe | const String\& | Eingabezeichenkette. |
| pattern | const String\& | [Regex](../) Muster. |
| Ersetzung | const String\& | Ersetzungs-String. |
| options | RegexOptions | [Regex](../) Optionen. |

### ReturnValue

Eingabe-String, bei dem alle Treffer des regulären Ausdrucks durch den Ersetzungs-String ersetzt wurden.

## Siehe auch

* Class [String](../../../system/string/)
* Enum [RegexOptions](../../regexoptions/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
