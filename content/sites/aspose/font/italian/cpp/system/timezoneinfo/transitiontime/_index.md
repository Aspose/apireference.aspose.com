---
title: "System::TimeZoneInfo::TransitionTime class"
linktitle: "TransitionTime"
second_title: "Aspose.Font per C++"
description: "System::TimeZoneInfo::TransitionTime class. Informazioni RTTI in C++."
type: docs
weight: 3400
url: /it/cpp/system/timezoneinfo/transitiontime/
---
## TransitionTime class


Informazioni RTTI.

```cpp
class TransitionTime
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| static [CreateFixedDateRule](./createfixeddaterule/)(DateTime, int, int) | Crea un'istanza della classe [TransitionTime](./) che rappresenta una regola a data fissa (cambio di orario che avviene in un giorno specifico di un mese specifico). |
| static [CreateFloatingDateRule](./createfloatingdaterule/)(DateTime, int, int, DayOfWeek) | Crea un'istanza della classe [TransitionTime](./) che rappresenta una regola a data variabile (cambio di orario che avviene in un giorno specifico di una settimana specifica di un mese specifico). |
| static [CreateTransitionTime](./createtransitiontime/)(DateTime, int, int, int, DayOfWeek, bool) | Crea un'istanza della classe [TransitionTime](./) che rappresenta un cambio di orario descritto con i parametri specificati. |
| [get_Day](./get_day/)() const | Restituisce il numero ordinale del giorno della settimana in cui avviene il cambio di orario. |
| [get_DayOfWeek](./get_dayofweek/)() const | Restituisce il valore che rappresenta il giorno della settimana in cui avviene il cambio di orario. |
| [get_IsFixedDateRule](./get_isfixeddaterule/)() const | Restituisce il valore che indica se il cambio di orario avviene in una data e ora fissa o in una data e ora variabile. |
| [get_Month](./get_month/)() const | Restituisce il numero ordinale del mese dell'anno in cui avviene il cambio di orario. |
| [get_TimeOfDay](./get_timeofday/)() const | Restituisce un oggetto [DateTime](../../datetime/) che rappresenta il momento specifico in cui avviene il cambio di orario. |
| [get_Week](./get_week/)() const | Restituisce il numero ordinale della settimana del mese in cui avviene il cambio di orario. |
| [operator!=](./operator!=/)(const TransitionTime\&) const |  |
| [operator==](./operator==/)(const TransitionTime\&) const |  |
| [TransitionTime](./transitiontime/)() | Costruttore predefinito. PER USO INTERNO. |
## Osservazioni


Fornisce informazioni su un cambio di orario in un fuso orario.
## Vedi anche

* Class [TimeZoneInfo](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
