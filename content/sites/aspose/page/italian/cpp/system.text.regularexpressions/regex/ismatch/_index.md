---
title: "System::Text::RegularExpressions::Regex::IsMatch metodo"
linktitle: "IsMatch"
second_title: "Aspose.Page per C++"
description: "System::Text::RegularExpressions::Regex::IsMatch metodo. Confronta l'espressione regolare con la stringa in C++."
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
* Library [Aspose.Page for C++](../../../)
## Regex::IsMatch(const String\&, const String\&, RegexOptions, TimeSpan, int) method


Verifica se la stringa corrisponde al modello.

```cpp
static bool System::Text::RegularExpressions::Regex::IsMatch(const String &input, const String &pattern, RegexOptions options=RegexOptions::None, TimeSpan matchTimeout=InfiniteMatchTimeout, int startat=0)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| input | const String\& | Stringa di input. |
| modello | const String\& | Pattern Regexp. |
| options | RegexOptions | Opzioni di corrispondenza. |
| matchTimeout | TimeSpan | Timeout. |
| startat | int | [Match](../../match/) posizione iniziale. |

### ReturnValue

Vero se viene trovata una corrispondenza, falso altrimenti.

## Vedi anche

* Class [String](../../../system/string/)
* Enum [RegexOptions](../../regexoptions/)
* Class [TimeSpan](../../../system/timespan/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
