---
title: "System::TimeZoneInfo::CreateCustomTimeZone méthode"
linktitle: "CreateCustomTimeZone"
second_title: "Aspose.Font pour C++"
description: "Méthode System::TimeZoneInfo::CreateCustomTimeZone. Crée un fuseau horaire personnalisé en C++."
type: docs
weight: 700
url: /fr/cpp/system/timezoneinfo/createcustomtimezone/
---
## TimeZoneInfo::CreateCustomTimeZone(const String\&, TimeSpan, const String\&, const String\&) method


Crée un fuseau horaire personnalisé.

```cpp
static TimeZoneInfoPtr System::TimeZoneInfo::CreateCustomTimeZone(const String &id, TimeSpan base_utc_offset, const String &display_name, const String &standard_display_name)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| id | const String\& | Identifiant du fuseau horaire. |
| base_utc_offset | TimeSpan | Intervalle de temps entre l'heure standard du fuseau horaire actuel et l'heure UTC. |
| display_name | const String\& | Nom d'affichage. |
| standard_display_name | const String\& | Nom de l'heure standard. |

### ReturnValue

Nouveau fuseau horaire.

## Voir aussi

* Typedef [TimeZoneInfoPtr](../../timezoneinfoptr/)
* Class [String](../../string/)
* Class [TimeSpan](../../timespan/)
* Class [TimeZoneInfo](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## TimeZoneInfo::CreateCustomTimeZone(const String\&, TimeSpan, const String\&, const String\&, const String\&, const ArrayPtr\<AdjustmentRulePtr\>\&) method


Crée un fuseau horaire personnalisé.

```cpp
static TimeZoneInfoPtr System::TimeZoneInfo::CreateCustomTimeZone(const String &id, TimeSpan base_utc_offset, const String &display_name, const String &standard_display_name, const String &daylight_display_name, const ArrayPtr<AdjustmentRulePtr> &adjustment_rules)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| id | const String\& | Identifiant du fuseau horaire. |
| base_utc_offset | TimeSpan | Intervalle de temps entre l'heure standard du fuseau horaire actuel et l'heure UTC. |
| display_name | const String\& | Nom d'affichage. |
| standard_display_name | const String\& | Nom de l'heure standard. |
| daylight_display_name | const String\& | Nom de l'heure d'été. |
| adjustment_rules | const ArrayPtr\<AdjustmentRulePtr\>\& | [Array](../../array/) des règles d'ajustement. |

### ReturnValue

Nouveau fuseau horaire.

## Voir aussi

* Typedef [TimeZoneInfoPtr](../../timezoneinfoptr/)
* Class [String](../../string/)
* Class [TimeSpan](../../timespan/)
* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [AdjustmentRulePtr](../adjustmentruleptr/)
* Class [TimeZoneInfo](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## TimeZoneInfo::CreateCustomTimeZone(const String\&, TimeSpan, const String\&, const String\&, const String\&, const ArrayPtr\<AdjustmentRulePtr\>\&, bool) method


Crée un fuseau horaire personnalisé.

```cpp
static TimeZoneInfoPtr System::TimeZoneInfo::CreateCustomTimeZone(const String &id, TimeSpan base_utc_offset, const String &display_name, const String &standard_display_name, const String &daylight_display_name, const ArrayPtr<AdjustmentRulePtr> &adjustment_rules, bool disable_daylight_saving_time)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| id | const String\& | Identifiant du fuseau horaire. |
| base_utc_offset | TimeSpan | Intervalle de temps entre l'heure standard du fuseau horaire actuel et l'heure UTC. |
| display_name | const String\& | Nom d'affichage. |
| standard_display_name | const String\& | Nom de l'heure standard. |
| daylight_display_name | const String\& | Nom de l'heure d'été. |
| adjustment_rules | const ArrayPtr\<AdjustmentRulePtr\>\& | [Array](../../array/) des règles d'ajustement. |
| disable_daylight_saving_time | bool | Vrai pour ignorer toute information d'heure d'été présente dans adjustment_rules. |

### ReturnValue

Nouveau fuseau horaire.

## Voir aussi

* Typedef [TimeZoneInfoPtr](../../timezoneinfoptr/)
* Class [String](../../string/)
* Class [TimeSpan](../../timespan/)
* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [AdjustmentRulePtr](../adjustmentruleptr/)
* Class [TimeZoneInfo](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
