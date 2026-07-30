---
title: "System::TimeZoneInfo::AdjustmentRule::CreateAdjustmentRule méthode"
linktitle: "CreateAdjustmentRule"
second_title: "Aspose.Font pour C++"
description: "System::TimeZoneInfo::AdjustmentRule::CreateAdjustmentRule méthode. Construit une instance de la classe AdjustmentRule qui représente une règle d'ajustement horaire décrite avec les paramètres spécifiés en C++."
type: docs
weight: 1000
url: /fr/cpp/system/timezoneinfo/adjustmentrule/createadjustmentrule/
---
## AdjustmentRule::CreateAdjustmentRule(DateTime, DateTime, TimeSpan, const TransitionTime\&, const TransitionTime\&) method


Construit une instance de la classe [AdjustmentRule](../) qui représente une règle d'ajustement horaire décrite avec les paramètres spécifiés.

```cpp
static AdjustmentRulePtr System::TimeZoneInfo::AdjustmentRule::CreateAdjustmentRule(DateTime date_start, DateTime date_end, TimeSpan daylight_delta, const TransitionTime &daylight_transition_start, const TransitionTime &daylight_transition_end)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| date_start | DateTime | La date et l'heure auxquelles la règle d'ajustement entre en vigueur. |
| date_end | DateTime | La date et l'heure auxquelles la règle d'ajustement cesse d'être effective. |
| daylight_delta | TimeSpan | La durée requise pour établir l'heure d'été du fuseau horaire. |
| daylight_transition_start | const TransitionTime\& | Les informations sur la transition de l'heure d'été à l'heure standard. |
| daylight_transition_end | const TransitionTime\& | Les informations sur la transition de l'heure standard à l'heure d'été. |

### ReturnValue

Une instance de la classe [AdjustmentRule](../) qui représente la règle d'ajustement du fuseau horaire décrite.

## Voir aussi

* Typedef [AdjustmentRulePtr](../../adjustmentruleptr/)
* Class [DateTime](../../../datetime/)
* Class [TimeSpan](../../../timespan/)
* Class [TransitionTime](../../transitiontime/)
* Class [AdjustmentRule](../)
* Class [TimeZoneInfo](../../)
* Namespace [System](../../../)
* Library [Aspose.Font for C++](../../../../)
## AdjustmentRule::CreateAdjustmentRule(DateTime, DateTime, TimeSpan, const TransitionTime\&, const TransitionTime\&, TimeSpan, bool) method


Construit une instance de la classe [AdjustmentRule](../) qui représente une règle d'ajustement horaire décrite avec les paramètres spécifiés.

```cpp
static AdjustmentRulePtr System::TimeZoneInfo::AdjustmentRule::CreateAdjustmentRule(DateTime date_start, DateTime date_end, TimeSpan daylight_delta, const TransitionTime &daylight_transition_start, const TransitionTime &daylight_transition_end, TimeSpan base_utc_offset_delta, bool no_daylight_transitions)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| date_start | DateTime | La date et l'heure auxquelles la règle d'ajustement entre en vigueur. |
| date_end | DateTime | La date et l'heure auxquelles la règle d'ajustement cesse d'être effective. |
| daylight_delta | TimeSpan | La durée requise pour établir l'heure d'été du fuseau horaire. |
| daylight_transition_start | const TransitionTime\& | Les informations sur la transition de l'heure d'été à l'heure standard. |
| daylight_transition_end | const TransitionTime\& | Les informations sur la transition de l'heure standard à l'heure d'été. |
| base_utc_offset_delta | TimeSpan | Le delta par rapport au décalage UTC par défaut. |
| no_daylight_transitions | bool | Spécifie si la règle d'ajustement suppose la transition vers l'heure d'été. |

### ReturnValue

Une instance de la classe [AdjustmentRule](../) qui représente la règle d'ajustement du fuseau horaire décrite.

## Voir aussi

* Typedef [AdjustmentRulePtr](../../adjustmentruleptr/)
* Class [DateTime](../../../datetime/)
* Class [TimeSpan](../../../timespan/)
* Class [TransitionTime](../../transitiontime/)
* Class [AdjustmentRule](../)
* Class [TimeZoneInfo](../../)
* Namespace [System](../../../)
* Library [Aspose.Font for C++](../../../../)
