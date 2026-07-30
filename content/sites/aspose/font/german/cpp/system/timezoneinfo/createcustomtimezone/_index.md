---
title: "System::TimeZoneInfo::CreateCustomTimeZone Methode"
linktitle: "CreateCustomTimeZone"
second_title: "Aspose.Font für C++"
description: "System::TimeZoneInfo::CreateCustomTimeZone Methode. Erstellt eine benutzerdefinierte Zeitzone in C++."
type: docs
weight: 700
url: /de/cpp/system/timezoneinfo/createcustomtimezone/
---
## TimeZoneInfo::CreateCustomTimeZone(const String\&, TimeSpan, const String\&, const String\&) method


Erstellt eine benutzerdefinierte Zeitzone.

```cpp
static TimeZoneInfoPtr System::TimeZoneInfo::CreateCustomTimeZone(const String &id, TimeSpan base_utc_offset, const String &display_name, const String &standard_display_name)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| id | const String\& | Zeitzonenbezeichner. |
| base_utc_offset | TimeSpan | Zeitintervall zwischen der Standardzeit der aktuellen Zeitzone und der UTC-Zeit. |
| display_name | const String\& | Anzeigename. |
| standard_display_name | const String\& | Standardzeitname. |

### ReturnValue

Neue Zeitzone.

## Siehe auch

* Typedef [TimeZoneInfoPtr](../../timezoneinfoptr/)
* Class [String](../../string/)
* Class [TimeSpan](../../timespan/)
* Class [TimeZoneInfo](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## TimeZoneInfo::CreateCustomTimeZone(const String\&, TimeSpan, const String\&, const String\&, const String\&, const ArrayPtr\<AdjustmentRulePtr\>\&) method


Erstellt eine benutzerdefinierte Zeitzone.

```cpp
static TimeZoneInfoPtr System::TimeZoneInfo::CreateCustomTimeZone(const String &id, TimeSpan base_utc_offset, const String &display_name, const String &standard_display_name, const String &daylight_display_name, const ArrayPtr<AdjustmentRulePtr> &adjustment_rules)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| id | const String\& | Zeitzonenbezeichner. |
| base_utc_offset | TimeSpan | Zeitintervall zwischen der Standardzeit der aktuellen Zeitzone und der UTC-Zeit. |
| display_name | const String\& | Anzeigename. |
| standard_display_name | const String\& | Standardzeitname. |
| daylight_display_name | const String\& | Sommerzeitname. |
| adjustment_rules | const ArrayPtr\<AdjustmentRulePtr\>\& | [Array](../../array/) der Anpassungsregeln. |

### ReturnValue

Neue Zeitzone.

## Siehe auch

* Typedef [TimeZoneInfoPtr](../../timezoneinfoptr/)
* Class [String](../../string/)
* Class [TimeSpan](../../timespan/)
* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [AdjustmentRulePtr](../adjustmentruleptr/)
* Class [TimeZoneInfo](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## TimeZoneInfo::CreateCustomTimeZone(const String\&, TimeSpan, const String\&, const String\&, const String\&, const ArrayPtr\<AdjustmentRulePtr\>\&, bool) method


Erstellt eine benutzerdefinierte Zeitzone.

```cpp
static TimeZoneInfoPtr System::TimeZoneInfo::CreateCustomTimeZone(const String &id, TimeSpan base_utc_offset, const String &display_name, const String &standard_display_name, const String &daylight_display_name, const ArrayPtr<AdjustmentRulePtr> &adjustment_rules, bool disable_daylight_saving_time)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| id | const String\& | Zeitzonenbezeichner. |
| base_utc_offset | TimeSpan | Zeitintervall zwischen der Standardzeit der aktuellen Zeitzone und der UTC-Zeit. |
| display_name | const String\& | Anzeigename. |
| standard_display_name | const String\& | Standardzeitname. |
| daylight_display_name | const String\& | Sommerzeitname. |
| adjustment_rules | const ArrayPtr\<AdjustmentRulePtr\>\& | [Array](../../array/) der Anpassungsregeln. |
| disable_daylight_saving_time | bool | True, um alle in adjustment_rules vorhandenen Sommerzeitinformationen zu verwerfen. |

### ReturnValue

Neue Zeitzone.

## Siehe auch

* Typedef [TimeZoneInfoPtr](../../timezoneinfoptr/)
* Class [String](../../string/)
* Class [TimeSpan](../../timespan/)
* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [AdjustmentRulePtr](../adjustmentruleptr/)
* Class [TimeZoneInfo](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
