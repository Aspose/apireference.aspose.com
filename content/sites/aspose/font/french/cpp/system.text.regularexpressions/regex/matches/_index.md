---
title: "System::Text::RegularExpressions::Regex::Matches méthode"
linktitle: "Correspondances"
second_title: "Aspose.Font pour C++"
description: "System::Text::RegularExpressions::Regex::Matches méthode. Obtient toutes les correspondances du regex dans la chaîne donnée en effectuant des correspondances répétées en C++."
type: docs
weight: 700
url: /fr/cpp/system.text.regularexpressions/regex/matches/
---
## Regex::Matches(const String\&, int) method


Obtient toutes les correspondances de l'expression régulière dans la chaîne donnée en effectuant des correspondances répétées.

```cpp
MatchCollectionPtr System::Text::RegularExpressions::Regex::Matches(const String &input, int startat=0)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| input | const String\& | Chaîne d'entrée. |
| startat | int | Indice à partir duquel commencer la correspondance. |

### ReturnValue

Collection de toutes les correspondances trouvées.

## Voir aussi

* Typedef [MatchCollectionPtr](../../matchcollectionptr/)
* Class [String](../../../system/string/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Font for C++](../../../)
## Regex::Matches(const String\&, const String\&, RegexOptions, TimeSpan, int, int) method


Obtient toutes les correspondances entre la chaîne et le modèle.

```cpp
static MatchCollectionPtr System::Text::RegularExpressions::Regex::Matches(const String &input, const String &pattern, RegexOptions options=RegexOptions::None, TimeSpan matchTimeout=InfiniteMatchTimeout, int startat=0, int length=0)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| input | const String\& | Chaîne d'entrée. |
| motif | const String\& | Modèle Regexp. |
| options | RegexOptions | Options de correspondance. |
| matchTimeout | TimeSpan | Délai d'attente. |
| startat | int | [Match](../../match/) position de début. |
| longueur | int | Nombre de caractères à parcourir (0 désactive la limite). |

### ReturnValue

Toutes les correspondances trouvées par des correspondances répétées.

## Voir aussi

* Typedef [MatchCollectionPtr](../../matchcollectionptr/)
* Class [String](../../../system/string/)
* Enum [RegexOptions](../../regexoptions/)
* Class [TimeSpan](../../../system/timespan/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Font for C++](../../../)
