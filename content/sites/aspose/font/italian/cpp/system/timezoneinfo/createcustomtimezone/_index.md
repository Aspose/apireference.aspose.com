---
title: "System::TimeZoneInfo::CreateCustomTimeZone method"
linktitle: "CreateCustomTimeZone"
second_title: "Aspose.Font per C++"
description: "Metodo System::TimeZoneInfo::CreateCustomTimeZone. Crea un fuso orario personalizzato in C++."
type: docs
weight: 700
url: /it/cpp/system/timezoneinfo/createcustomtimezone/
---
## TimeZoneInfo::CreateCustomTimeZone(const String\&, TimeSpan, const String\&, const String\&) method


Crea un fuso orario personalizzato.

```cpp
static TimeZoneInfoPtr System::TimeZoneInfo::CreateCustomTimeZone(const String &id, TimeSpan base_utc_offset, const String &display_name, const String &standard_display_name)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| id | const String\& | Identificatore del fuso orario. |
| base_utc_offset | TimeSpan | Intervallo di tempo tra l'ora standard del fuso orario corrente e l'ora UTC. |
| display_name | const String\& | Nome visualizzato. |
| standard_display_name | const String\& | Nome dell'ora standard. |

### ReturnValue

Nuovo fuso orario.

## Vedi anche

* Typedef [TimeZoneInfoPtr](../../timezoneinfoptr/)
* Class [String](../../string/)
* Class [TimeSpan](../../timespan/)
* Class [TimeZoneInfo](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## TimeZoneInfo::CreateCustomTimeZone(const String\&, TimeSpan, const String\&, const String\&, const String\&, const ArrayPtr\<AdjustmentRulePtr\>\&) method


Crea un fuso orario personalizzato.

```cpp
static TimeZoneInfoPtr System::TimeZoneInfo::CreateCustomTimeZone(const String &id, TimeSpan base_utc_offset, const String &display_name, const String &standard_display_name, const String &daylight_display_name, const ArrayPtr<AdjustmentRulePtr> &adjustment_rules)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| id | const String\& | Identificatore del fuso orario. |
| base_utc_offset | TimeSpan | Intervallo di tempo tra l'ora standard del fuso orario corrente e l'ora UTC. |
| display_name | const String\& | Nome visualizzato. |
| standard_display_name | const String\& | Nome dell'ora standard. |
| daylight_display_name | const String\& | Nome dell'ora legale. |
| adjustment_rules | const ArrayPtr\<AdjustmentRulePtr\>\& | [Array](../../array/) di regole di adeguamento. |

### ReturnValue

Nuovo fuso orario.

## Vedi anche

* Typedef [TimeZoneInfoPtr](../../timezoneinfoptr/)
* Class [String](../../string/)
* Class [TimeSpan](../../timespan/)
* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [AdjustmentRulePtr](../adjustmentruleptr/)
* Class [TimeZoneInfo](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## TimeZoneInfo::CreateCustomTimeZone(const String\&, TimeSpan, const String\&, const String\&, const String\&, const ArrayPtr\<AdjustmentRulePtr\>\&, bool) method


Crea un fuso orario personalizzato.

```cpp
static TimeZoneInfoPtr System::TimeZoneInfo::CreateCustomTimeZone(const String &id, TimeSpan base_utc_offset, const String &display_name, const String &standard_display_name, const String &daylight_display_name, const ArrayPtr<AdjustmentRulePtr> &adjustment_rules, bool disable_daylight_saving_time)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| id | const String\& | Identificatore del fuso orario. |
| base_utc_offset | TimeSpan | Intervallo di tempo tra l'ora standard del fuso orario corrente e l'ora UTC. |
| display_name | const String\& | Nome visualizzato. |
| standard_display_name | const String\& | Nome dell'ora standard. |
| daylight_display_name | const String\& | Nome dell'ora legale. |
| adjustment_rules | const ArrayPtr\<AdjustmentRulePtr\>\& | [Array](../../array/) di regole di adeguamento. |
| disable_daylight_saving_time | bool | True per scartare qualsiasi informazione sull'ora legale presente in adjustment_rules. |

### ReturnValue

Nuovo fuso orario.

## Vedi anche

* Typedef [TimeZoneInfoPtr](../../timezoneinfoptr/)
* Class [String](../../string/)
* Class [TimeSpan](../../timespan/)
* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [AdjustmentRulePtr](../adjustmentruleptr/)
* Class [TimeZoneInfo](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
