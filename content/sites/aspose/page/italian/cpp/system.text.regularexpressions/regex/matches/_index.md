---
title: "System::Text::RegularExpressions::Regex::Matches metodo"
linktitle: "Corrispondenze"
second_title: "Aspose.Page per C++"
description: "System::Text::RegularExpressions::Regex::Matches metodo. Ottiene tutte le corrispondenze dell'espressione regolare nella stringa fornita eseguendo il confronto ripetutamente in C++."
type: docs
weight: 700
url: /it/cpp/system.text.regularexpressions/regex/matches/
---
## Regex::Matches(const String\&, int) method


Restituisce tutte le corrispondenze della regex nella stringa fornita effettuando il matching ripetutamente.

```cpp
MatchCollectionPtr System::Text::RegularExpressions::Regex::Matches(const String &input, int startat=0)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| input | const String\& | Stringa di input. |
| startat | int | Indice da cui iniziare il confronto. |

### ReturnValue

Raccolta di tutte le corrispondenze trovate.

## Vedi anche

* Typedef [MatchCollectionPtr](../../matchcollectionptr/)
* Class [String](../../../system/string/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
## Regex::Matches(const String\&, const String\&, RegexOptions, TimeSpan, int, int) method


Restituisce tutte le corrispondenze tra stringa e modello.

```cpp
static MatchCollectionPtr System::Text::RegularExpressions::Regex::Matches(const String &input, const String &pattern, RegexOptions options=RegexOptions::None, TimeSpan matchTimeout=InfiniteMatchTimeout, int startat=0, int length=0)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| input | const String\& | Stringa di input. |
| modello | const String\& | Pattern Regexp. |
| options | RegexOptions | Opzioni di corrispondenza. |
| matchTimeout | TimeSpan | Timeout. |
| startat | int | [Match](../../match/) posizione iniziale. |
| length | int | Numero di caratteri da esaminare (0 disabilita il limite). |

### ReturnValue

Tutte le corrispondenze trovate eseguendo il confronto ripetutamente.

## Vedi anche

* Typedef [MatchCollectionPtr](../../matchcollectionptr/)
* Class [String](../../../system/string/)
* Enum [RegexOptions](../../regexoptions/)
* Class [TimeSpan](../../../system/timespan/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
