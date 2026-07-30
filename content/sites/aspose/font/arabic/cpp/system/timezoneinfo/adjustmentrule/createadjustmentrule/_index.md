---
title: "System::TimeZoneInfo::AdjustmentRule::CreateAdjustmentRule طريقة"
linktitle: "CreateAdjustmentRule"
second_title: "Aspose.Font لـ C++"
description: "System::TimeZoneInfo::AdjustmentRule::CreateAdjustmentRule طريقة. تُنشئ مثيلاً من فئة AdjustmentRule التي تمثل قاعدة تعديل الوقت الموصوفة بالمعلمات المحددة في C++."
type: docs
weight: 1000
url: /ar/cpp/system/timezoneinfo/adjustmentrule/createadjustmentrule/
---
## AdjustmentRule::CreateAdjustmentRule(DateTime, DateTime, TimeSpan, const TransitionTime\&, const TransitionTime\&) method


تُنشئ مثيلاً من فئة [AdjustmentRule](../) التي تمثل قاعدة تعديل الوقت الموصوفة بالمعلمات المحددة.

```cpp
static AdjustmentRulePtr System::TimeZoneInfo::AdjustmentRule::CreateAdjustmentRule(DateTime date_start, DateTime date_end, TimeSpan daylight_delta, const TransitionTime &daylight_transition_start, const TransitionTime &daylight_transition_end)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| date_start | DateTime | التاريخ والوقت عندما تصبح قاعدة التعديل سارية. |
| date_end | DateTime | التاريخ والوقت عندما تتوقف قاعدة التعديل عن أن تكون سارية. |
| daylight_delta | TimeSpan | المدة الزمنية المطلوبة لتكوين التوقيت الصيفي للمنطقة الزمنية. |
| daylight_transition_start | const TransitionTime\\& | المعلومات حول الانتقال من التوقيت الصيفي إلى التوقيت القياسي. |
| daylight_transition_end | const TransitionTime\\& | المعلومات حول الانتقال من التوقيت القياسي إلى التوقيت الصيفي. |

### ReturnValue

مثيل من فئة [AdjustmentRule](../) التي تمثل قاعدة تعديل المنطقة الزمنية الموصوفة.

## انظر أيضًا

* Typedef [AdjustmentRulePtr](../../adjustmentruleptr/)
* Class [DateTime](../../../datetime/)
* Class [TimeSpan](../../../timespan/)
* Class [TransitionTime](../../transitiontime/)
* Class [AdjustmentRule](../)
* Class [TimeZoneInfo](../../)
* Namespace [System](../../../)
* Library [Aspose.Font for C++](../../../../)
## AdjustmentRule::CreateAdjustmentRule(DateTime, DateTime, TimeSpan, const TransitionTime\&, const TransitionTime\&, TimeSpan, bool) method


تُنشئ مثيلاً من فئة [AdjustmentRule](../) التي تمثل قاعدة تعديل الوقت الموصوفة بالمعلمات المحددة.

```cpp
static AdjustmentRulePtr System::TimeZoneInfo::AdjustmentRule::CreateAdjustmentRule(DateTime date_start, DateTime date_end, TimeSpan daylight_delta, const TransitionTime &daylight_transition_start, const TransitionTime &daylight_transition_end, TimeSpan base_utc_offset_delta, bool no_daylight_transitions)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| date_start | DateTime | التاريخ والوقت عندما تصبح قاعدة التعديل سارية. |
| date_end | DateTime | التاريخ والوقت عندما تتوقف قاعدة التعديل عن أن تكون سارية. |
| daylight_delta | TimeSpan | المدة الزمنية المطلوبة لتكوين التوقيت الصيفي للمنطقة الزمنية. |
| daylight_transition_start | const TransitionTime\\& | المعلومات حول الانتقال من التوقيت الصيفي إلى التوقيت القياسي. |
| daylight_transition_end | const TransitionTime\\& | المعلومات حول الانتقال من التوقيت القياسي إلى التوقيت الصيفي. |
| base_utc_offset_delta | TimeSpan | الفرق عن إزاحة UTC الافتراضية. |
| no_daylight_transitions | bool | يحدد ما إذا كانت قاعدة التعديل تفترض الانتقال إلى التوقيت الصيفي. |

### ReturnValue

مثيل من فئة [AdjustmentRule](../) التي تمثل قاعدة تعديل المنطقة الزمنية الموصوفة.

## انظر أيضًا

* Typedef [AdjustmentRulePtr](../../adjustmentruleptr/)
* Class [DateTime](../../../datetime/)
* Class [TimeSpan](../../../timespan/)
* Class [TransitionTime](../../transitiontime/)
* Class [AdjustmentRule](../)
* Class [TimeZoneInfo](../../)
* Namespace [System](../../../)
* Library [Aspose.Font for C++](../../../../)
