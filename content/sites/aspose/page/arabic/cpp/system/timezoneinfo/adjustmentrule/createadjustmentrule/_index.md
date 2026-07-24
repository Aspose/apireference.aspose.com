---
title: "System::TimeZoneInfo::AdjustmentRule::CreateAdjustmentRule method"
linktitle: "CreateAdjustmentRule"
second_title: "Aspose.Page لـ C++"
description: "System::TimeZoneInfo::AdjustmentRule::CreateAdjustmentRule method. يُنشئ مثيلاً من فئة AdjustmentRule التي تمثل قاعدة تعديل الوقت الموصوفة بالمعلمات المحددة في C++."
type: docs
weight: 1000
url: /ar/cpp/system/timezoneinfo/adjustmentrule/createadjustmentrule/
---
## AdjustmentRule::CreateAdjustmentRule(DateTime, DateTime, TimeSpan, const TransitionTime\&, const TransitionTime\&) method


يُنشئ مثيلاً من فئة [AdjustmentRule](../) التي تمثل قاعدة تعديل الوقت الموصوفة بالمعلمات المحددة.

```cpp
static AdjustmentRulePtr System::TimeZoneInfo::AdjustmentRule::CreateAdjustmentRule(DateTime date_start, DateTime date_end, TimeSpan daylight_delta, const TransitionTime &daylight_transition_start, const TransitionTime &daylight_transition_end)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| date_start | DateTime | التاريخ والوقت الذي يبدأ فيه سريان قاعدة التعديل. |
| date_end | DateTime | التاريخ والوقت الذي تنتهي فيه قاعدة التعديل. |
| daylight_delta | TimeSpan | المدة الزمنية المطلوبة لتطبيق التوقيت الصيفي للمنطقة الزمنية. |
| daylight_transition_start | const TransitionTime\& | المعلومات حول الانتقال من التوقيت الصيفي إلى التوقيت القياسي. |
| daylight_transition_end | const TransitionTime\& | المعلومات حول الانتقال من التوقيت القياسي إلى التوقيت الصيفي. |

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
* Library [Aspose.Page for C++](../../../../)
## AdjustmentRule::CreateAdjustmentRule(DateTime, DateTime, TimeSpan, const TransitionTime\&, const TransitionTime\&, TimeSpan, bool) method


يُنشئ مثيلاً من فئة [AdjustmentRule](../) التي تمثل قاعدة تعديل الوقت الموصوفة بالمعلمات المحددة.

```cpp
static AdjustmentRulePtr System::TimeZoneInfo::AdjustmentRule::CreateAdjustmentRule(DateTime date_start, DateTime date_end, TimeSpan daylight_delta, const TransitionTime &daylight_transition_start, const TransitionTime &daylight_transition_end, TimeSpan base_utc_offset_delta, bool no_daylight_transitions)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| date_start | DateTime | التاريخ والوقت الذي يبدأ فيه سريان قاعدة التعديل. |
| date_end | DateTime | التاريخ والوقت الذي تنتهي فيه قاعدة التعديل. |
| daylight_delta | TimeSpan | المدة الزمنية المطلوبة لتطبيق التوقيت الصيفي للمنطقة الزمنية. |
| daylight_transition_start | const TransitionTime\& | المعلومات حول الانتقال من التوقيت الصيفي إلى التوقيت القياسي. |
| daylight_transition_end | const TransitionTime\& | المعلومات حول الانتقال من التوقيت القياسي إلى التوقيت الصيفي. |
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
* Library [Aspose.Page for C++](../../../../)
