---
title: "Metodo System::TimeZoneInfo::TransitionTime::CreateTransitionTime"
linktitle: "CreateTransitionTime"
second_title: "Aspose.Font per C++"
description: "Metodo System::TimeZoneInfo::TransitionTime::CreateTransitionTime. Costruisce un'istanza della classe TransitionTime che rappresenta un cambiamento di orario descritto con i parametri specificati in C++."
type: docs
weight: 1200
url: /it/cpp/system/timezoneinfo/transitiontime/createtransitiontime/
---
## TransitionTime::CreateTransitionTime method


Costruisce un'istanza della classe [TransitionTime](../) che rappresenta un cambiamento di orario descritto con i parametri specificati.

```cpp
static TransitionTime System::TimeZoneInfo::TransitionTime::CreateTransitionTime(DateTime time_of_day, int month, int week, int day, DayOfWeek day_of_week, bool is_fixed_date_rule)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| time_of_day | DateTime | L'ora specifica in cui avviene il cambiamento di orario. |
| mese | int | Il mese dell'anno in cui avviene il cambiamento di orario. |
| week | int | La settimana del mese in cui avviene il cambiamento di orario. |
| giorno | int | Il giorno in cui avviene il cambiamento di orario. |
| day_of_week | DayOfWeek | Il giorno della settimana in cui avviene il cambiamento di orario. |
| is_fixed_date_rule | bool | Valore che indica se il cambiamento di orario avviene in una data e ora fissa o in una data e ora variabile. |

### ReturnValue

Un'istanza della classe [TransitionTime](../) che rappresenta il cambiamento di orario descritto.

## Vedi anche

* Class [TransitionTime](../)
* Class [DateTime](../../../datetime/)
* Enum [DayOfWeek](../../../dayofweek/)
* Class [TransitionTime](../)
* Class [TimeZoneInfo](../../)
* Namespace [System](../../../)
* Library [Aspose.Font for C++](../../../../)
