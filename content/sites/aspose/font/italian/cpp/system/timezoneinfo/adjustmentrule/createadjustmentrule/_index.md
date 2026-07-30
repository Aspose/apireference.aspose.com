---
title: "System::TimeZoneInfo::AdjustmentRule::CreateAdjustmentRule metodo"
linktitle: "CreateAdjustmentRule"
second_title: "Aspose.Font per C++"
description: "System::TimeZoneInfo::AdjustmentRule::CreateAdjustmentRule metodo. Costruisce un'istanza della classe AdjustmentRule che rappresenta una regola di aggiustamento del tempo descritta con i parametri specificati in C++."
type: docs
weight: 1000
url: /it/cpp/system/timezoneinfo/adjustmentrule/createadjustmentrule/
---
## AdjustmentRule::CreateAdjustmentRule(DateTime, DateTime, TimeSpan, const TransitionTime\&, const TransitionTime\&) method


Costruisce un'istanza della classe [AdjustmentRule](../) che rappresenta una regola di aggiustamento del tempo descritta con i parametri specificati.

```cpp
static AdjustmentRulePtr System::TimeZoneInfo::AdjustmentRule::CreateAdjustmentRule(DateTime date_start, DateTime date_end, TimeSpan daylight_delta, const TransitionTime &daylight_transition_start, const TransitionTime &daylight_transition_end)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| date_start | DateTime | La data e l'ora in cui la regola di aggiustamento entra in vigore. |
| date_end | DateTime | La data e l'ora in cui la regola di aggiustamento cessa di essere efficace. |
| daylight_delta | TimeSpan | La quantità di tempo necessaria per impostare l'ora legale del fuso orario. |
| daylight_transition_start | const TransitionTime\& | Le informazioni sulla transizione dall'ora legale all'ora standard. |
| daylight_transition_end | const TransitionTime\& | Le informazioni sulla transizione dall'ora standard all'ora legale. |

### ReturnValue

Un'istanza della classe [AdjustmentRule](../) che rappresenta la regola di aggiustamento del fuso orario descritta.

## Vedi anche

* Typedef [AdjustmentRulePtr](../../adjustmentruleptr/)
* Class [DateTime](../../../datetime/)
* Class [TimeSpan](../../../timespan/)
* Class [TransitionTime](../../transitiontime/)
* Class [AdjustmentRule](../)
* Class [TimeZoneInfo](../../)
* Namespace [System](../../../)
* Library [Aspose.Font for C++](../../../../)
## AdjustmentRule::CreateAdjustmentRule(DateTime, DateTime, TimeSpan, const TransitionTime\&, const TransitionTime\&, TimeSpan, bool) method


Costruisce un'istanza della classe [AdjustmentRule](../) che rappresenta una regola di aggiustamento del tempo descritta con i parametri specificati.

```cpp
static AdjustmentRulePtr System::TimeZoneInfo::AdjustmentRule::CreateAdjustmentRule(DateTime date_start, DateTime date_end, TimeSpan daylight_delta, const TransitionTime &daylight_transition_start, const TransitionTime &daylight_transition_end, TimeSpan base_utc_offset_delta, bool no_daylight_transitions)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| date_start | DateTime | La data e l'ora in cui la regola di aggiustamento entra in vigore. |
| date_end | DateTime | La data e l'ora in cui la regola di aggiustamento cessa di essere efficace. |
| daylight_delta | TimeSpan | La quantità di tempo necessaria per impostare l'ora legale del fuso orario. |
| daylight_transition_start | const TransitionTime\& | Le informazioni sulla transizione dall'ora legale all'ora standard. |
| daylight_transition_end | const TransitionTime\& | Le informazioni sulla transizione dall'ora standard all'ora legale. |
| base_utc_offset_delta | TimeSpan | Il delta dall'offset UTC predefinito. |
| no_daylight_transitions | bool | Specifica se la regola di aggiustamento prevede la transizione all'ora legale. |

### ReturnValue

Un'istanza della classe [AdjustmentRule](../) che rappresenta la regola di aggiustamento del fuso orario descritta.

## Vedi anche

* Typedef [AdjustmentRulePtr](../../adjustmentruleptr/)
* Class [DateTime](../../../datetime/)
* Class [TimeSpan](../../../timespan/)
* Class [TransitionTime](../../transitiontime/)
* Class [AdjustmentRule](../)
* Class [TimeZoneInfo](../../)
* Namespace [System](../../../)
* Library [Aspose.Font for C++](../../../../)
