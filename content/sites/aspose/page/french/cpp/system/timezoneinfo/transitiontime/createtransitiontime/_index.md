---
title: "Méthode CreateTransitionTime de System::TimeZoneInfo::TransitionTime"
linktitle: "CreateTransitionTime"
second_title: "Aspose.Page pour C++"
description: "Méthode CreateTransitionTime de System::TimeZoneInfo::TransitionTime. Construit une instance de la classe TransitionTime qui représente un changement d'heure décrit avec les paramètres spécifiés en C++."
type: docs
weight: 1200
url: /fr/cpp/system/timezoneinfo/transitiontime/createtransitiontime/
---
## TransitionTime::CreateTransitionTime method


Construit une instance de la classe [TransitionTime](../) qui représente un changement d'heure décrit avec les paramètres spécifiés.

```cpp
static TransitionTime System::TimeZoneInfo::TransitionTime::CreateTransitionTime(DateTime time_of_day, int month, int week, int day, DayOfWeek day_of_week, bool is_fixed_date_rule)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| time_of_day | DateTime | L'heure spécifique à laquelle le changement d'heure se produit. |
| mois | int | Le mois de l'année auquel le changement d'heure se produit. |
| week | int | La semaine du mois à laquelle le changement d'heure se produit. |
| jour | int | Le jour où le changement d'heure se produit. |
| day_of_week | DayOfWeek | Le jour de la semaine auquel le changement d'heure se produit. |
| is_fixed_date_rule | bool | Valeur indiquant si le changement d'heure se produit à une date et heure fixes ou à une date et heure flottantes. |

### ReturnValue

Une instance de la classe [TransitionTime](../) qui représente le changement d'heure décrit.

## Voir aussi

* Class [TransitionTime](../)
* Class [DateTime](../../../datetime/)
* Enum [DayOfWeek](../../../dayofweek/)
* Class [TransitionTime](../)
* Class [TimeZoneInfo](../../)
* Namespace [System](../../../)
* Library [Aspose.Page for C++](../../../../)
