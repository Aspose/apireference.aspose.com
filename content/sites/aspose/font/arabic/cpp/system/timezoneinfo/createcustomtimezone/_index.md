---
title: "System::TimeZoneInfo::CreateCustomTimeZone method"
linktitle: "CreateCustomTimeZone"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::TimeZoneInfo::CreateCustomTimeZone. تنشئ منطقة زمنية مخصصة في C++."
type: docs
weight: 700
url: /ar/cpp/system/timezoneinfo/createcustomtimezone/
---
## TimeZoneInfo::CreateCustomTimeZone(const String\&, TimeSpan, const String\&, const String\&) method


ينشئ منطقة زمنية مخصصة.

```cpp
static TimeZoneInfoPtr System::TimeZoneInfo::CreateCustomTimeZone(const String &id, TimeSpan base_utc_offset, const String &display_name, const String &standard_display_name)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| المعرّف | const String\& | معرّف المنطقة الزمنية. |
| base_utc_offset | TimeSpan | الفاصل الزمني بين الوقت القياسي للمنطقة الزمنية الحالية والوقت بتوقيت UTC. |
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
* Library [Aspose.Font for C++](../../../)
## TimeZoneInfo::CreateCustomTimeZone(const String\&, TimeSpan, const String\&, const String\&, const String\&, const ArrayPtr\<AdjustmentRulePtr\>\&) method


ينشئ منطقة زمنية مخصصة.

```cpp
static TimeZoneInfoPtr System::TimeZoneInfo::CreateCustomTimeZone(const String &id, TimeSpan base_utc_offset, const String &display_name, const String &standard_display_name, const String &daylight_display_name, const ArrayPtr<AdjustmentRulePtr> &adjustment_rules)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| المعرّف | const String\& | معرّف المنطقة الزمنية. |
| base_utc_offset | TimeSpan | الفاصل الزمني بين الوقت القياسي للمنطقة الزمنية الحالية والوقت بتوقيت UTC. |
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
* Library [Aspose.Font for C++](../../../)
## TimeZoneInfo::CreateCustomTimeZone(const String\&, TimeSpan, const String\&, const String\&, const String\&, const ArrayPtr\<AdjustmentRulePtr\>\&, bool) method


ينشئ منطقة زمنية مخصصة.

```cpp
static TimeZoneInfoPtr System::TimeZoneInfo::CreateCustomTimeZone(const String &id, TimeSpan base_utc_offset, const String &display_name, const String &standard_display_name, const String &daylight_display_name, const ArrayPtr<AdjustmentRulePtr> &adjustment_rules, bool disable_daylight_saving_time)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| المعرّف | const String\& | معرّف المنطقة الزمنية. |
| base_utc_offset | TimeSpan | الفاصل الزمني بين الوقت القياسي للمنطقة الزمنية الحالية والوقت بتوقيت UTC. |
| display_name | const String\& | الاسم المعروض. |
| standard_display_name | const String\& | اسم الوقت القياسي. |
| daylight_display_name | const String\& | اسم التوقيت الصيفي. |
| adjustment_rules | const ArrayPtr\<AdjustmentRulePtr\>\& | [Array](../../array/) لقواعد التعديل. |
| disable_daylight_saving_time | bool | صحيح لتجاهل أي معلومات توفير الوقت الصيفي موجودة في adjustment_rules. |

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
* Library [Aspose.Font for C++](../../../)
