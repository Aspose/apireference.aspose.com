---
title: "System::Text::RegularExpressions::Regex::Match méthode"
linktitle: "Match"
second_title: "Aspose.Page pour C++"
description: "System::Text::RegularExpressions::Regex::Match méthode. Correspond à l'expression régulière sur la chaîne en C++."
type: docs
weight: 600
url: /fr/cpp/system.text.regularexpressions/regex/match/
---
## Regex::Match(const String\&) method


Correspond l'expression régulière à la chaîne.

```cpp
MatchPtr System::Text::RegularExpressions::Regex::Match(const String &input)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| entrée | const String\& | Chaîne cible. |

### ReturnValue

[Match](../../match/) value containing match status and submatches.

## Voir aussi

* Typedef [MatchPtr](../../matchptr/)
* Class [String](../../../system/string/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
## Regex::Match(const String\&, int, int) method


Correspond l'expression régulière à la chaîne.

```cpp
MatchPtr System::Text::RegularExpressions::Regex::Match(const String &input, int startat, int length=0)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| entrée | const String\& | Chaîne cible. |
| startat | int | Indice de début. |
| length | int | Nombre de caractères à parcourir (0 pour parcourir toute la chaîne). |

### ReturnValue

[Match](../../match/) value containing match status and submatches.

## Voir aussi

* Typedef [MatchPtr](../../matchptr/)
* Class [String](../../../system/string/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
## Regex::Match(const String\&, const String\&, RegexOptions, TimeSpan, int, int) method


Correspond la chaîne et le modèle.

```cpp
static MatchPtr System::Text::RegularExpressions::Regex::Match(const String &input, const String &pattern, RegexOptions options=RegexOptions::None, TimeSpan matchTimeout=InfiniteMatchTimeout, int startat=0, int length=0)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| entrée | const String\& | Chaîne d'entrée. |
| modèle | const String\& | Modèle Regexp. |
| options | RegexOptions | Options de correspondance. |
| matchTimeout | TimeSpan | Délai d'attente. |
| startat | int | [Match](../../match/) position de début. |
| length | int | Nombre de caractères à parcourir (0 désactive la limite). |

### ReturnValue

Première correspondance trouvée.

## Voir aussi

* Typedef [MatchPtr](../../matchptr/)
* Class [String](../../../system/string/)
* Enum [RegexOptions](../../regexoptions/)
* Class [TimeSpan](../../../system/timespan/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
