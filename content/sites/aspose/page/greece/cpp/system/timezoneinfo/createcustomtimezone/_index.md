---
title: "System::TimeZoneInfo::CreateCustomTimeZone μέθοδος"
linktitle: "CreateCustomTimeZone"
second_title: "Aspose.Page για C++"
description: "System::TimeZoneInfo::CreateCustomTimeZone μέθοδος. Δημιουργεί μια προσαρμοσμένη ζώνη ώρας σε C++."
type: docs
weight: 700
url: /el/cpp/system/timezoneinfo/createcustomtimezone/
---
## TimeZoneInfo::CreateCustomTimeZone(const String\&, TimeSpan, const String\&, const String\&) method


Δημιουργεί προσαρμοσμένη ζώνη ώρας.

```cpp
static TimeZoneInfoPtr System::TimeZoneInfo::CreateCustomTimeZone(const String &id, TimeSpan base_utc_offset, const String &display_name, const String &standard_display_name)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| id | const String\& | Αναγνωριστικό ζώνης ώρας. |
| base_utc_offset | TimeSpan | Χρονικό διάστημα μεταξύ της τυπικής ώρας της τρέχουσας ζώνης ώρας και του χρόνου UTC. |
| display_name | const String\& | Όνομα εμφάνισης. |
| standard_display_name | const String\& | Όνομα τυπικής ώρας. |

### ReturnValue

Νέα ζώνη ώρας.

## Δείτε επίσης

* Typedef [TimeZoneInfoPtr](../../timezoneinfoptr/)
* Class [String](../../string/)
* Class [TimeSpan](../../timespan/)
* Class [TimeZoneInfo](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## TimeZoneInfo::CreateCustomTimeZone(const String\&, TimeSpan, const String\&, const String\&, const String\&, const ArrayPtr\<AdjustmentRulePtr\>\&) method


Δημιουργεί προσαρμοσμένη ζώνη ώρας.

```cpp
static TimeZoneInfoPtr System::TimeZoneInfo::CreateCustomTimeZone(const String &id, TimeSpan base_utc_offset, const String &display_name, const String &standard_display_name, const String &daylight_display_name, const ArrayPtr<AdjustmentRulePtr> &adjustment_rules)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| id | const String\& | Αναγνωριστικό ζώνης ώρας. |
| base_utc_offset | TimeSpan | Χρονικό διάστημα μεταξύ της τυπικής ώρας της τρέχουσας ζώνης ώρας και του χρόνου UTC. |
| display_name | const String\& | Όνομα εμφάνισης. |
| standard_display_name | const String\& | Όνομα τυπικής ώρας. |
| daylight_display_name | const String\& | Όνομα θερινής ώρας. |
| adjustment_rules | const ArrayPtr\<AdjustmentRulePtr\>\& | [Array](../../array/) των κανόνων προσαρμογής. |

### ReturnValue

Νέα ζώνη ώρας.

## Δείτε επίσης

* Typedef [TimeZoneInfoPtr](../../timezoneinfoptr/)
* Class [String](../../string/)
* Class [TimeSpan](../../timespan/)
* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [AdjustmentRulePtr](../adjustmentruleptr/)
* Class [TimeZoneInfo](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## TimeZoneInfo::CreateCustomTimeZone(const String\&, TimeSpan, const String\&, const String\&, const String\&, const ArrayPtr\<AdjustmentRulePtr\>\&, bool) method


Δημιουργεί προσαρμοσμένη ζώνη ώρας.

```cpp
static TimeZoneInfoPtr System::TimeZoneInfo::CreateCustomTimeZone(const String &id, TimeSpan base_utc_offset, const String &display_name, const String &standard_display_name, const String &daylight_display_name, const ArrayPtr<AdjustmentRulePtr> &adjustment_rules, bool disable_daylight_saving_time)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| id | const String\& | Αναγνωριστικό ζώνης ώρας. |
| base_utc_offset | TimeSpan | Χρονικό διάστημα μεταξύ της τυπικής ώρας της τρέχουσας ζώνης ώρας και του χρόνου UTC. |
| display_name | const String\& | Όνομα εμφάνισης. |
| standard_display_name | const String\& | Όνομα τυπικής ώρας. |
| daylight_display_name | const String\& | Όνομα θερινής ώρας. |
| adjustment_rules | const ArrayPtr\<AdjustmentRulePtr\>\& | [Array](../../array/) των κανόνων προσαρμογής. |
| disable_daylight_saving_time | bool | Αληθές για απόρριψη οποιασδήποτε πληροφορίας θερινής ώρας που υπάρχει στα adjustment_rules. |

### ReturnValue

Νέα ζώνη ώρας.

## Δείτε επίσης

* Typedef [TimeZoneInfoPtr](../../timezoneinfoptr/)
* Class [String](../../string/)
* Class [TimeSpan](../../timespan/)
* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [AdjustmentRulePtr](../adjustmentruleptr/)
* Class [TimeZoneInfo](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
