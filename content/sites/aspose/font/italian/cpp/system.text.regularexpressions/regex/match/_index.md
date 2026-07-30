---
title: "System::Text::RegularExpressions::Regex::Match method"
linktitle: "Match"
second_title: "Aspose.Font per C++"
description: "System::Text::RegularExpressions::Regex::Match method. Confronta l'espressione regolare con la stringa in C++."
type: docs
weight: 600
url: /it/cpp/system.text.regularexpressions/regex/match/
---
## Regex::Match(const String\&) method


Confronta la regex con la stringa.

```cpp
MatchPtr System::Text::RegularExpressions::Regex::Match(const String &input)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| input | const String\& | Stringa di destinazione. |

### ReturnValue

[Match](../../match/) value containing match status and submatches.

## Vedi anche

* Typedef [MatchPtr](../../matchptr/)
* Class [String](../../../system/string/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Font for C++](../../../)
## Regex::Match(const String\&, int, int) method


Confronta la regex con la stringa.

```cpp
MatchPtr System::Text::RegularExpressions::Regex::Match(const String &input, int startat, int length=0)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| input | const String\& | Stringa di destinazione. |
| startat | int | Indice iniziale. |
| lunghezza | int | Numero di caratteri da esaminare (0 per esaminare l'intera stringa). |

### ReturnValue

[Match](../../match/) value containing match status and submatches.

## Vedi anche

* Typedef [MatchPtr](../../matchptr/)
* Class [String](../../../system/string/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Font for C++](../../../)
## Regex::Match(const String\&, const String\&, RegexOptions, TimeSpan, int, int) method


Confronta stringa e modello.

```cpp
static MatchPtr System::Text::RegularExpressions::Regex::Match(const String &input, const String &pattern, RegexOptions options=RegexOptions::None, TimeSpan matchTimeout=InfiniteMatchTimeout, int startat=0, int length=0)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| input | const String\& | Stringa di input. |
| pattern | const String\& | Pattern Regexp. |
| opzioni | RegexOptions | Opzioni di matching. |
| matchTimeout | TimeSpan | Timeout. |
| startat | int | [Match](../../match/) posizione iniziale. |
| lunghezza | int | Numero di caratteri da esaminare (0 disabilita il limite). |

### ReturnValue

Prima corrispondenza trovata.

## Vedi anche

* Typedef [MatchPtr](../../matchptr/)
* Class [String](../../../system/string/)
* Enum [RegexOptions](../../regexoptions/)
* Class [TimeSpan](../../../system/timespan/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Font for C++](../../../)
