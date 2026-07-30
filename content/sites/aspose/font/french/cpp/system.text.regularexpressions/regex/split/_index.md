---
title: "System::Text::RegularExpressions::Regex::Split méthode"
linktitle: "Diviser"
second_title: "Aspose.Font pour C++"
description: "System::Text::RegularExpressions::Regex::Split méthode. Divise la chaîne par les correspondances du regex en C++."
type: docs
weight: 900
url: /fr/cpp/system.text.regularexpressions/regex/split/
---
## Regex::Split(const String\&) method


Divise la chaîne selon les correspondances d'expressions régulières.

```cpp
ArrayPtr<String> System::Text::RegularExpressions::Regex::Split(const String &input)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| input | const String\& | [String](../../../system/string/) à diviser. |

### ReturnValue

[Array](../../../system/array/) of substrings between matches.

## Voir aussi

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [String](../../../system/string/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Font for C++](../../../)
## Regex::Split(const String\&, int) method


Divise la chaîne selon les correspondances d'expressions régulières.

```cpp
ArrayPtr<String> System::Text::RegularExpressions::Regex::Split(const String &input, int count)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| input | const String\& | [String](../../../system/string/) à diviser. |
| count | int | Limite du nombre de sous-chaînes. |

### ReturnValue

[Array](../../../system/array/) of substrings between matches.

## Voir aussi

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [String](../../../system/string/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Font for C++](../../../)
## Regex::Split(const String\&, int, int) method


Divise une chaîne d'entrée un nombre maximum spécifié de fois en un tableau de sous‑chaînes, aux positions définies par une expression régulière spécifiée dans le constructeur [Regex](../). La recherche du motif d'expression régulière commence à une position de caractère spécifiée dans la chaîne d'entrée.

```cpp
ArrayPtr<String> System::Text::RegularExpressions::Regex::Split(const String &input, int count, int startat)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| input | const String\& | La chaîne à diviser. |
| count | int | Le nombre maximum de fois que la division peut se produire. |
| startat | int | La position du caractère dans la chaîne d'entrée où la recherche commencera. |

### ReturnValue

Un tableau de chaînes.

## Voir aussi

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [String](../../../system/string/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Font for C++](../../../)
## Regex::Split(const String\&, const String\&, int, RegexOptions, TimeSpan) method


Divise la chaîne selon l'expression régulière.

```cpp
static ArrayPtr<String> System::Text::RegularExpressions::Regex::Split(const String &input, const String &pattern, int count, RegexOptions options=RegexOptions::None, TimeSpan matchTimeout=InfiniteMatchTimeout)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| input | const String\& | Chaîne d'entrée. |
| motif | const String\& | Modèle Regexp. |
| count | int | Limite du nombre de [Match](../../match/). |
| options | RegexOptions | Options de correspondance. |
| matchTimeout | TimeSpan | Délai d'attente. |

### ReturnValue

[Array](../../../system/array/) of strings between matchse.

## Voir aussi

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [String](../../../system/string/)
* Enum [RegexOptions](../../regexoptions/)
* Class [TimeSpan](../../../system/timespan/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Font for C++](../../../)
## Regex::Split(const String\&, const String\&, RegexOptions, TimeSpan) method


Divise la chaîne selon l'expression régulière.

```cpp
static ArrayPtr<String> System::Text::RegularExpressions::Regex::Split(const String &input, const String &pattern, RegexOptions options=RegexOptions::None, TimeSpan matchTimeout=InfiniteMatchTimeout)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| input | const String\& | Chaîne d'entrée. |
| motif | const String\& | Modèle Regexp. |
| options | RegexOptions | Options de correspondance. |
| matchTimeout | TimeSpan | Délai d'attente. |

### ReturnValue

[Array](../../../system/array/) of strings between matchse.

## Voir aussi

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [String](../../../system/string/)
* Enum [RegexOptions](../../regexoptions/)
* Class [TimeSpan](../../../system/timespan/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Font for C++](../../../)
