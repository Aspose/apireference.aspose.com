---
title: "System::Text::RegularExpressions::Regex::IsMatch méthode"
linktitle: "IsMatch"
second_title: "Aspose.Font pour C++"
description: "System::Text::RegularExpressions::Regex::IsMatch méthode. Correspond le regex à une chaîne en C++."
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
| input | const String\& | Chaîne cible. |
| startat | int | Indice de début. |

### ReturnValue

Vrai si la chaîne correspond au regex, faux sinon.

## Voir aussi

* Class [String](../../../system/string/)
* Class [Regex](../)
* Namespace [System::Text::RegularExpressions](../../)
* Library [Aspose.Font for C++](../../../)
## Regex::IsMatch(const String\&, const String\&, RegexOptions, TimeSpan, int) method


Vérifie si la chaîne correspond au modèle.

```cpp
static bool System::Text::RegularExpressions::Regex::IsMatch(const String &input, const String &pattern, RegexOptions options=RegexOptions::None, TimeSpan matchTimeout=InfiniteMatchTimeout, int startat=0)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| input | const String\& | Chaîne d'entrée. |
| motif | const String\& | Modèle Regexp. |
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
* Library [Aspose.Font for C++](../../../)
