---
title: "Metodo System::Text::RegularExpressions::Regex::Matches"
linktitle: "Corrispondenze"
second_title: "Aspose.Font per C++"
description: "Metodo System::Text::RegularExpressions::Regex::Matches. Ottiene tutte le corrispondenze della regex nella stringa fornita eseguendo il matching ripetuto in C++."
type: docs
weight: 700
url: /it/cpp/system.text.regularexpressions/regex/matches/
---
## Regex::Matches(const String\&, int) method


Restituisce tutte le corrispondenze della regex nella stringa fornita eseguendo il matching ripetutamente.

```cpp
MatchCollectionPtr System::Text::RegularExpressions::Regex::Matches(const String &input, int startat=0)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| input | const String\& | Stringa di input. |
| startat | int | Indice da cui iniziare il matching. |

### ReturnValue

Raccolta di tutte le corrispondenze trovate.

## Vedi anche

* Typedef [MatchCollectionPtr](../../matchcollectionptr/)
* Class [String](../../../system/string/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Font for C++](../../../)
## Regex::Matches(const String\&, const String\&, RegexOptions, TimeSpan, int, int) method


Restituisce tutte le corrispondenze tra stringa e modello.

```cpp
static MatchCollectionPtr System::Text::RegularExpressions::Regex::Matches(const String &input, const String &pattern, RegexOptions options=RegexOptions::None, TimeSpan matchTimeout=InfiniteMatchTimeout, int startat=0, int length=0)
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

Tutte le corrispondenze trovate tramite matching ripetuto.

## Vedi anche

* Typedef [MatchCollectionPtr](../../matchcollectionptr/)
* Class [String](../../../system/string/)
* Enum [RegexOptions](../../regexoptions/)
* Class [TimeSpan](../../../system/timespan/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Font for C++](../../../)
