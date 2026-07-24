---
title: "System::Text::RegularExpressions::Regex::Split-Methode"
linktitle: "Split"
second_title: "Aspose.Page für C++"
description: "System::Text::RegularExpressions::Regex::Split-Methode. Teilt die Zeichenkette anhand von Regex-Übereinstimmungen in C++."
type: docs
weight: 900
url: /de/cpp/system.text.regularexpressions/regex/split/
---
## Regex::Split(const String\&) method


Teilt die Zeichenkette anhand von Regex‑Treffern.

```cpp
ArrayPtr<String> System::Text::RegularExpressions::Regex::Split(const String &input)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| input | const String\& | [String](../../../system/string/) zum Aufteilen. |

### ReturnValue

[Array](../../../system/array/) of substrings between matches.

## Siehe auch

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [String](../../../system/string/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
## Regex::Split(const String\&, int) method


Teilt die Zeichenkette anhand von Regex‑Treffern.

```cpp
ArrayPtr<String> System::Text::RegularExpressions::Regex::Split(const String &input, int count)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| input | const String\& | [String](../../../system/string/) zum Aufteilen. |
| count | int | Begrenzung der Teilzeichenfolgenanzahl. |

### ReturnValue

[Array](../../../system/array/) of substrings between matches.

## Siehe auch

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [String](../../../system/string/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
## Regex::Split(const String\&, int, int) method


Teilt einen Eingabestring bis zu einer angegebenen maximalen Anzahl von Malen in ein Array von Teilzeichenfolgen, an den Positionen, die durch einen regulären Ausdruck definiert sind, der im [Regex](../)-Konstruktor angegeben wird. Die Suche nach dem Muster des regulären Ausdrucks beginnt an einer angegebenen Zeichenposition im Eingabestring.

```cpp
ArrayPtr<String> System::Text::RegularExpressions::Regex::Split(const String &input, int count, int startat)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Eingabe | const String\& | Der zu teilende String. |
| count | int | Die maximale Anzahl, wie oft die Teilung auftreten kann. |
| startat | int | Die Zeichenposition im Eingabestring, an der die Suche beginnt. |

### ReturnValue

Ein Array von Strings.

## Siehe auch

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [String](../../../system/string/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
## Regex::Split(const String\&, const String\&, int, RegexOptions, TimeSpan) method


Teilt die Zeichenkette anhand von Regexp.

```cpp
static ArrayPtr<String> System::Text::RegularExpressions::Regex::Split(const String &input, const String &pattern, int count, RegexOptions options=RegexOptions::None, TimeSpan matchTimeout=InfiniteMatchTimeout)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Eingabe | const String\& | Eingabezeichenkette. |
| Muster | const String\& | Regexp-Muster. |
| count | int | Begrenzung der [Match](../../match/)-Anzahl. |
| Optionen | RegexOptions | Übereinstimmungsoptionen. |
| matchTimeout | TimeSpan | Zeitlimit. |

### ReturnValue

[Array](../../../system/array/) of strings between matchse.

## Siehe auch

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [String](../../../system/string/)
* Enum [RegexOptions](../../regexoptions/)
* Class [TimeSpan](../../../system/timespan/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
## Regex::Split(const String\&, const String\&, RegexOptions, TimeSpan) method


Teilt die Zeichenkette anhand von Regexp.

```cpp
static ArrayPtr<String> System::Text::RegularExpressions::Regex::Split(const String &input, const String &pattern, RegexOptions options=RegexOptions::None, TimeSpan matchTimeout=InfiniteMatchTimeout)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Eingabe | const String\& | Eingabezeichenkette. |
| Muster | const String\& | Regexp-Muster. |
| Optionen | RegexOptions | Übereinstimmungsoptionen. |
| matchTimeout | TimeSpan | Zeitlimit. |

### ReturnValue

[Array](../../../system/array/) of strings between matchse.

## Siehe auch

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [String](../../../system/string/)
* Enum [RegexOptions](../../regexoptions/)
* Class [TimeSpan](../../../system/timespan/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
