---
title: "Méthode System::TimeZoneInfo::TransitionTime::CreateFloatingDateRule"
linktitle: "CreateFloatingDateRule"
second_title: "Aspose.Font pour C++"
description: "Méthode System::TimeZoneInfo::TransitionTime::CreateFloatingDateRule. Construit une instance de la classe TransitionTime qui représente une règle à date flottante (changement d'heure qui se produit un jour précis d'une semaine précise d'un mois précis) en C++."
type: docs
weight: 1100
url: /fr/cpp/system/timezoneinfo/transitiontime/createfloatingdaterule/
---
## TransitionTime::CreateFloatingDateRule method


Construit une instance de la classe [TransitionTime](../) qui représente une règle à date flottante (changement d'heure qui se produit un jour précis d'une semaine précise d'un mois précis).

```cpp
static TransitionTime System::TimeZoneInfo::TransitionTime::CreateFloatingDateRule(DateTime time_of_day, int month, int week, DayOfWeek day_of_week)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| time_of_day | DateTime | L'heure précise à laquelle le changement d'heure se produit. |
| mois | int | Le mois de l'année où le changement d'heure se produit. |
| semaine | int | La semaine du mois où le changement d'heure se produit. |
| jour_de_la_semaine | JourDeLaSemaine | Le jour de la semaine où le changement d'heure se produit. |

### ReturnValue

Une instance de la classe [TransitionTime](../) qui représente le changement d'heure décrit.

## Voir aussi

* Class [TransitionTime](../)
* Class [DateTime](../../../datetime/)
* Enum [DayOfWeek](../../../dayofweek/)
* Class [TransitionTime](../)
* Class [TimeZoneInfo](../../)
* Namespace [System](../../../)
* Library [Aspose.Font for C++](../../../../)
