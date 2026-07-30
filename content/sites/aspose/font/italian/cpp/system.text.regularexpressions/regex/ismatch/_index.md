---
title: "System::Text::RegularExpressions::Regex::IsMatch method"
linktitle: "IsMatch"
second_title: "Aspose.Font per C++"
description: "System::Text::RegularExpressions::Regex::IsMatch method. Confronta l'espressione regolare con una stringa in C++."
type: docs
weight: 500
url: /it/cpp/system.text.regularexpressions/regex/ismatch/
---
## Regex::IsMatch(const String\&, int) method


Confronta la regex con la stringa.

```cpp
bool System::Text::RegularExpressions::Regex::IsMatch(const String &input, int startat=0)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| input | const String\& | Stringa di destinazione. |
| startat | int | Indice iniziale. |

### ReturnValue

Vero se la stringa corrisponde all'espressione regolare, falso altrimenti.

## Vedi anche

* Class [String](../../../system/string/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Font for C++](../../../)
## Regex::IsMatch(const String\&, const String\&, RegexOptions, TimeSpan, int) method


Verifica se la stringa corrisponde al modello.

```cpp
static bool System::Text::RegularExpressions::Regex::IsMatch(const String &input, const String &pattern, RegexOptions options=RegexOptions::None, TimeSpan matchTimeout=InfiniteMatchTimeout, int startat=0)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| input | const String\& | Stringa di input. |
| pattern | const String\& | Pattern Regexp. |
| opzioni | RegexOptions | Opzioni di matching. |
| matchTimeout | TimeSpan | Timeout. |
| startat | int | [Match](../../match/) posizione iniziale. |

### ReturnValue

Vero se è stata trovata una corrispondenza, falso altrimenti.

## Vedi anche

* Class [String](../../../system/string/)
* Enum [RegexOptions](../../regexoptions/)
* Class [TimeSpan](../../../system/timespan/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Font for C++](../../../)
