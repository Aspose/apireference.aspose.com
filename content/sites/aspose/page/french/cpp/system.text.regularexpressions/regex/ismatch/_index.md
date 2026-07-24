---
title: "Méthode System::Text::RegularExpressions::Regex::IsMatch"
linktitle: "IsMatch"
second_title: "Aspose.Page pour C++"
description: "Méthode System::Text::RegularExpressions::Regex::IsMatch. Correspond à l'expression régulière sur une chaîne en C++."
type: docs
weight: 500
url: /fr/cpp/system.text.regularexpressions/regex/ismatch/
---
## Regex::IsMatch(const String\&, int) method


Correspond l'expression régulière à la chaîne.

```cpp
bool System::Text::RegularExpressions::Regex::IsMatch(const String &input, int startat=0)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| entrée | const String\& | Chaîne cible. |
| startat | int | Indice de début. |

### ReturnValue

Vrai si la chaîne correspond à l'expression régulière, faux sinon.

## Voir aussi

* Class [String](../../../system/string/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
## Regex::IsMatch(const String\&, const String\&, RegexOptions, TimeSpan, int) method


Vérifie si la chaîne correspond au modèle.

```cpp
static bool System::Text::RegularExpressions::Regex::IsMatch(const String &input, const String &pattern, RegexOptions options=RegexOptions::None, TimeSpan matchTimeout=InfiniteMatchTimeout, int startat=0)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| entrée | const String\& | Chaîne d'entrée. |
| modèle | const String\& | Modèle Regexp. |
| options | RegexOptions | Options de correspondance. |
| matchTimeout | TimeSpan | Délai d'attente. |
| startat | int | [Match](../../match/) position de début. |

### ReturnValue

Vrai si une correspondance est trouvée, faux sinon.

## Voir aussi

* Class [String](../../../system/string/)
* Enum [RegexOptions](../../regexoptions/)
* Class [TimeSpan](../../../system/timespan/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Page for C++](../../../)
