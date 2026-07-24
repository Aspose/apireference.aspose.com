---
title: "System::Text::RegularExpressions::Regex::Split metodo"
linktitle: "Dividi"
second_title: "Aspose.Page per C++"
description: "System::Text::RegularExpressions::Regex::Split metodo. Divide la stringa in base alle corrispondenze regex in C++."
type: docs
weight: 900
url: /it/cpp/system.text.regularexpressions/regex/split/
---
## Regex::Split(const String\&) method


Dividi la stringa per corrispondenze regex.

```cpp
ArrayPtr<String> System::Text::RegularExpressions::Regex::Split(const String &input)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| input | const String\& | [String](../../../system/string/) da dividere. |

### ReturnValue

[Array](../../../system/array/) of substrings between matches.

## Vedi anche

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [String](../../../system/string/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
## Regex::Split(const String\&, int) method


Dividi la stringa per corrispondenze regex.

```cpp
ArrayPtr<String> System::Text::RegularExpressions::Regex::Split(const String &input, int count)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| input | const String\& | [String](../../../system/string/) da dividere. |
| count | int | Limite del numero di sottostringhe. |

### ReturnValue

[Array](../../../system/array/) of substrings between matches.

## Vedi anche

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [String](../../../system/string/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
## Regex::Split(const String\&, int, int) method


Divide una stringa di input un numero massimo specificato di volte in un array di sottostringhe, nelle posizioni definite da un'espressione regolare specificata nel costruttore [Regex](../). La ricerca del modello dell'espressione regolare inizia a una posizione di carattere specificata nella stringa di input.

```cpp
ArrayPtr<String> System::Text::RegularExpressions::Regex::Split(const String &input, int count, int startat)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| input | const String\& | La stringa da dividere. |
| count | int | Il numero massimo di volte in cui la divisione può avvenire. |
| startat | int | La posizione del carattere nella stringa di input dove inizierà la ricerca. |

### ReturnValue

Un array di stringhe.

## Vedi anche

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [String](../../../system/string/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
## Regex::Split(const String\&, const String\&, int, RegexOptions, TimeSpan) method


Dividi la stringa per regexp.

```cpp
static ArrayPtr<String> System::Text::RegularExpressions::Regex::Split(const String &input, const String &pattern, int count, RegexOptions options=RegexOptions::None, TimeSpan matchTimeout=InfiniteMatchTimeout)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| input | const String\& | Stringa di input. |
| modello | const String\& | Pattern Regexp. |
| count | int | [Match](../../match/) limite del numero. |
| options | RegexOptions | Opzioni di corrispondenza. |
| matchTimeout | TimeSpan | Timeout. |

### ReturnValue

[Array](../../../system/array/) of strings between matchse.

## Vedi anche

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [String](../../../system/string/)
* Enum [RegexOptions](../../regexoptions/)
* Class [TimeSpan](../../../system/timespan/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
## Regex::Split(const String\&, const String\&, RegexOptions, TimeSpan) method


Dividi la stringa per regexp.

```cpp
static ArrayPtr<String> System::Text::RegularExpressions::Regex::Split(const String &input, const String &pattern, RegexOptions options=RegexOptions::None, TimeSpan matchTimeout=InfiniteMatchTimeout)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| input | const String\& | Stringa di input. |
| modello | const String\& | Pattern Regexp. |
| options | RegexOptions | Opzioni di corrispondenza. |
| matchTimeout | TimeSpan | Timeout. |

### ReturnValue

[Array](../../../system/array/) of strings between matchse.

## Vedi anche

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [String](../../../system/string/)
* Enum [RegexOptions](../../regexoptions/)
* Class [TimeSpan](../../../system/timespan/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
