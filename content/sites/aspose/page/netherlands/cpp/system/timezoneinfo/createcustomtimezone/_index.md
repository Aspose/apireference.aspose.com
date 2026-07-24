---
title: "System::TimeZoneInfo::CreateCustomTimeZone methode"
linktitle: "CreateCustomTimeZone"
second_title: "Aspose.Page voor C++"
description: "System::TimeZoneInfo::CreateCustomTimeZone methode. Maakt een aangepaste tijdzone aan in C++."
type: docs
weight: 700
url: /nl/cpp/system/timezoneinfo/createcustomtimezone/
---
## TimeZoneInfo::CreateCustomTimeZone(const String\&, TimeSpan, const String\&, const String\&) method


Maakt een aangepaste tijdzone.

```cpp
static TimeZoneInfoPtr System::TimeZoneInfo::CreateCustomTimeZone(const String &id, TimeSpan base_utc_offset, const String &display_name, const String &standard_display_name)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| id | const String\& | Tijdzone-identificatie. |
| base_utc_offset | TimeSpan | Tijdsinterval tussen de standaardtijd van de huidige tijdzone en UTC-tijd. |
| display_name | const String\& | Weergavenaam. |
| standard_display_name | const String\& | Naam van standaardtijd. |

### ReturnValue

Nieuwe tijdzone.

## Zie ook

* Typedef [TimeZoneInfoPtr](../../timezoneinfoptr/)
* Class [String](../../string/)
* Class [TimeSpan](../../timespan/)
* Class [TimeZoneInfo](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## TimeZoneInfo::CreateCustomTimeZone(const String\&, TimeSpan, const String\&, const String\&, const String\&, const ArrayPtr\<AdjustmentRulePtr\>\&) method


Maakt een aangepaste tijdzone.

```cpp
static TimeZoneInfoPtr System::TimeZoneInfo::CreateCustomTimeZone(const String &id, TimeSpan base_utc_offset, const String &display_name, const String &standard_display_name, const String &daylight_display_name, const ArrayPtr<AdjustmentRulePtr> &adjustment_rules)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| id | const String\& | Tijdzone-identificatie. |
| base_utc_offset | TimeSpan | Tijdsinterval tussen de standaardtijd van de huidige tijdzone en UTC-tijd. |
| display_name | const String\& | Weergavenaam. |
| standard_display_name | const String\& | Naam van standaardtijd. |
| daylight_display_name | const String\& | Naam van zomertijd. |
| adjustment_rules | const ArrayPtr\<AdjustmentRulePtr\>\& | [Array](../../array/) van aanpassingsregels. |

### ReturnValue

Nieuwe tijdzone.

## Zie ook

* Typedef [TimeZoneInfoPtr](../../timezoneinfoptr/)
* Class [String](../../string/)
* Class [TimeSpan](../../timespan/)
* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [AdjustmentRulePtr](../adjustmentruleptr/)
* Class [TimeZoneInfo](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## TimeZoneInfo::CreateCustomTimeZone(const String\&, TimeSpan, const String\&, const String\&, const String\&, const ArrayPtr\<AdjustmentRulePtr\>\&, bool) method


Maakt een aangepaste tijdzone.

```cpp
static TimeZoneInfoPtr System::TimeZoneInfo::CreateCustomTimeZone(const String &id, TimeSpan base_utc_offset, const String &display_name, const String &standard_display_name, const String &daylight_display_name, const ArrayPtr<AdjustmentRulePtr> &adjustment_rules, bool disable_daylight_saving_time)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| id | const String\& | Tijdzone-identificatie. |
| base_utc_offset | TimeSpan | Tijdsinterval tussen de standaardtijd van de huidige tijdzone en UTC-tijd. |
| display_name | const String\& | Weergavenaam. |
| standard_display_name | const String\& | Naam van standaardtijd. |
| daylight_display_name | const String\& | Naam van zomertijd. |
| adjustment_rules | const ArrayPtr\<AdjustmentRulePtr\>\& | [Array](../../array/) van aanpassingsregels. |
| disable_daylight_saving_time | bool | Waar om alle zomertijdinformatie die aanwezig is in adjustment_rules te negeren. |

### ReturnValue

Nieuwe tijdzone.

## Zie ook

* Typedef [TimeZoneInfoPtr](../../timezoneinfoptr/)
* Class [String](../../string/)
* Class [TimeSpan](../../timespan/)
* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [AdjustmentRulePtr](../adjustmentruleptr/)
* Class [TimeZoneInfo](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
