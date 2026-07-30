---
title: "System::Globalization::DateTimeStyles énum"
linktitle: "DateTimeStyles"
second_title: "Aspose.Font pour C++"
description: "System::Globalization::DateTimeStyles enum. Définit les options de formatage de la date et de l'heure. Indicateurs binaires en C++."
type: docs
weight: 3500
url: /fr/cpp/system.globalization/datetimestyles/
---
## DateTimeStyles enum


Définit les options de formatage de date et d'heure. Indicateurs binaires.

```cpp
enum class DateTimeStyles : int32_t
```

### Valeurs

| Nom | Valeur | Description |
| --- | --- | --- |
| Aucun | 0 | Par défaut. |
| AllowLeadingWhite | 1 | Ignore les espaces blancs en début. |
| AllowTrailingWhite | 2 | Ignore les espaces blancs en fin. |
| AllowInnerWhite | 4 | Ignore les espaces blancs internes. |
| AllowWhiteSpaces | n/a | Ignorer tous les espaces blancs. |
| NoCurrentDateDefault | 8 | Lors de l'analyse d'une chaîne date/heure, si l'année, le mois et le jour sont tous manquants, définir la date par défaut à 0001/1/1, au lieu de l'année/mois/jour actuels. |
| AdjustToUniversal | 16 | Lors de l'analyse d'une chaîne date/heure, si un spécificateur de fuseau horaire ("GMT","Z","+xxxx", "-xxxx") existe, nous ajusterons l'heure analysée en fonction de GMT. |
| AssumeLocal | 32 | Si aucun fuseau horaire n'est fourni, utilisez le fuseau horaire local. |
| AssumeUniversal | 64 | Si aucun fuseau horaire n'est fourni, utilisez UTC. |
| RoundtripKind | 128 | Tenter de préserver si l'entrée est non spécifiée, locale ou UTC. |

## Voir aussi

* Namespace [System::Globalization](../)
* Library [Aspose.Font for C++](../../)
