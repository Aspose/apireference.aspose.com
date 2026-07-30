---
title: "System::TimeZoneInfo::TransitionTime::CreateFloatingDateRule metodo"
linktitle: "CreateFloatingDateRule"
second_title: "Aspose.Font per C++"
description: "System::TimeZoneInfo::TransitionTime::CreateFloatingDateRule metodo. Costruisce un'istanza della classe TransitionTime che rappresenta una regola a data mobile (cambiamento di orario che avviene in un giorno specifico di una settimana specifica di un mese specifico) in C++."
type: docs
weight: 1100
url: /it/cpp/system/timezoneinfo/transitiontime/createfloatingdaterule/
---
## TransitionTime::CreateFloatingDateRule method


Costruisce un'istanza della classe [TransitionTime](../) che rappresenta una regola a data mobile (cambiamento di orario che avviene in un giorno specifico di una settimana specifica di un mese specifico).

```cpp
static TransitionTime System::TimeZoneInfo::TransitionTime::CreateFloatingDateRule(DateTime time_of_day, int month, int week, DayOfWeek day_of_week)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| time_of_day | DateTime | L'ora specifica in cui avviene il cambiamento di orario. |
| mese | int | Il mese dell'anno in cui avviene il cambiamento di orario. |
| week | int | La settimana del mese in cui avviene il cambiamento di orario. |
| day_of_week | DayOfWeek | Il giorno della settimana in cui avviene il cambiamento di orario. |

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
