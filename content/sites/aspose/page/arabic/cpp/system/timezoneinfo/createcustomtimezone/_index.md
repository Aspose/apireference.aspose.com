---
title: "System::TimeZoneInfo::CreateCustomTimeZone طريقة"
linktitle: "CreateCustomTimeZone"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::TimeZoneInfo::CreateCustomTimeZone. ينشئ منطقة زمنية مخصصة في C++."
type: docs
weight: 700
url: /ar/cpp/system/timezoneinfo/createcustomtimezone/
---
## TimeZoneInfo::CreateCustomTimeZone(const String\&, TimeSpan, const String\&, const String\&) method


ينشئ منطقة زمنية مخصصة.

```cpp
static TimeZoneInfoPtr System::TimeZoneInfo::CreateCustomTimeZone(const String &id, TimeSpan base_utc_offset, const String &display_name, const String &standard_display_name)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| id | const String\& | معرّف المنطقة الزمنية. |
| base_utc_offset | TimeSpan | الفاصل الزمني بين الوقت القياسي للمنطقة الزمنية الحالية وتوقيت UTC. |
| display_name | const String\& | الاسم المعروض. |
| standard_display_name | const String\& | اسم الوقت القياسي. |

### ReturnValue

منطقة زمنية جديدة.

## انظر أيضًا

* Typedef [TimeZoneInfoPtr](../../timezoneinfoptr/)
* Class [String](../../string/)
* Class [TimeSpan](../../timespan/)
* Class [TimeZoneInfo](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## TimeZoneInfo::CreateCustomTimeZone(const String\&, TimeSpan, const String\&, const String\&, const String\&, const ArrayPtr\<AdjustmentRulePtr\>\&) method


ينشئ منطقة زمنية مخصصة.

```cpp
static TimeZoneInfoPtr System::TimeZoneInfo::CreateCustomTimeZone(const String &id, TimeSpan base_utc_offset, const String &display_name, const String &standard_display_name, const String &daylight_display_name, const ArrayPtr<AdjustmentRulePtr> &adjustment_rules)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| id | const String\& | معرّف المنطقة الزمنية. |
| base_utc_offset | TimeSpan | الفاصل الزمني بين الوقت القياسي للمنطقة الزمنية الحالية وتوقيت UTC. |
| display_name | const String\& | الاسم المعروض. |
| standard_display_name | const String\& | اسم الوقت القياسي. |
| daylight_display_name | const String\& | اسم التوقيت الصيفي. |
| adjustment_rules | const ArrayPtr\<AdjustmentRulePtr\>\& | [Array](../../array/) لقواعد التعديل. |

### ReturnValue

منطقة زمنية جديدة.

## انظر أيضًا

* Typedef [TimeZoneInfoPtr](../../timezoneinfoptr/)
* Class [String](../../string/)
* Class [TimeSpan](../../timespan/)
* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [AdjustmentRulePtr](../adjustmentruleptr/)
* Class [TimeZoneInfo](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## TimeZoneInfo::CreateCustomTimeZone(const String\&, TimeSpan, const String\&, const String\&, const String\&, const ArrayPtr\<AdjustmentRulePtr\>\&, bool) method


ينشئ منطقة زمنية مخصصة.

```cpp
static TimeZoneInfoPtr System::TimeZoneInfo::CreateCustomTimeZone(const String &id, TimeSpan base_utc_offset, const String &display_name, const String &standard_display_name, const String &daylight_display_name, const ArrayPtr<AdjustmentRulePtr> &adjustment_rules, bool disable_daylight_saving_time)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| id | const String\& | معرّف المنطقة الزمنية. |
| base_utc_offset | TimeSpan | الفاصل الزمني بين الوقت القياسي للمنطقة الزمنية الحالية وتوقيت UTC. |
| display_name | const String\& | الاسم المعروض. |
| standard_display_name | const String\& | اسم الوقت القياسي. |
| daylight_display_name | const String\& | اسم التوقيت الصيفي. |
| adjustment_rules | const ArrayPtr\<AdjustmentRulePtr\>\& | [Array](../../array/) لقواعد التعديل. |
| disable_daylight_saving_time | bool | صحيح لتجاهل أي معلومات حول التوقيت الصيفي موجودة في adjustment_rules. |

### ReturnValue

منطقة زمنية جديدة.

## انظر أيضًا

* Typedef [TimeZoneInfoPtr](../../timezoneinfoptr/)
* Class [String](../../string/)
* Class [TimeSpan](../../timespan/)
* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [AdjustmentRulePtr](../adjustmentruleptr/)
* Class [TimeZoneInfo](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
