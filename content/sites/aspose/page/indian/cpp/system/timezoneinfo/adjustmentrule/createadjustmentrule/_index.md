---
title: "System::TimeZoneInfo::AdjustmentRule::CreateAdjustmentRule विधि"
linktitle: "CreateAdjustmentRule"
second_title: "Aspose.Page C++ के लिए"
description: "System::TimeZoneInfo::AdjustmentRule::CreateAdjustmentRule विधि। निर्दिष्ट पैरामीटरों के साथ वर्णित समय समायोजन नियम का प्रतिनिधित्व करने वाले AdjustmentRule वर्ग का एक उदाहरण बनाता है C++ में।"
type: docs
weight: 1000
url: /hi/cpp/system/timezoneinfo/adjustmentrule/createadjustmentrule/
---
## AdjustmentRule::CreateAdjustmentRule(DateTime, DateTime, TimeSpan, const TransitionTime\&, const TransitionTime\&) method


निर्दिष्ट पैरामीटरों के साथ वर्णित समय समायोजन नियम का प्रतिनिधित्व करने वाले [AdjustmentRule](../) वर्ग का एक उदाहरण बनाता है।

```cpp
static AdjustmentRulePtr System::TimeZoneInfo::AdjustmentRule::CreateAdjustmentRule(DateTime date_start, DateTime date_end, TimeSpan daylight_delta, const TransitionTime &daylight_transition_start, const TransitionTime &daylight_transition_end)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| date_start | DateTime | समायोजन नियम के प्रभावी होने की तिथि और समय। |
| date_end | DateTime | समायोजन नियम के प्रभाव समाप्त होने की तिथि और समय। |
| daylight_delta | TimeSpan | समय क्षेत्र के डेलाइट सेविंग टाइम को बनाने के लिए आवश्यक समय की मात्रा। |
| daylight_transition_start | const TransitionTime\& | डेलाइट सेविंग टाइम से स्टैंडर्ड टाइम में परिवर्तन की जानकारी। |
| daylight_transition_end | const TransitionTime\& | स्टैंडर्ड टाइम से डेलाइट सेविंग टाइम में परिवर्तन की जानकारी। |

### ReturnValue

वर्णित समय क्षेत्र समायोजन नियम का प्रतिनिधित्व करने वाले [AdjustmentRule](../) वर्ग का एक उदाहरण।

## संबंधित देखें

* Typedef [AdjustmentRulePtr](../../adjustmentruleptr/)
* Class [DateTime](../../../datetime/)
* Class [TimeSpan](../../../timespan/)
* Class [TransitionTime](../../transitiontime/)
* Class [AdjustmentRule](../)
* Class [TimeZoneInfo](../../)
* Namespace [System](../../../)
* Library [Aspose.Page for C++](../../../../)
## AdjustmentRule::CreateAdjustmentRule(DateTime, DateTime, TimeSpan, const TransitionTime\&, const TransitionTime\&, TimeSpan, bool) method


निर्दिष्ट पैरामीटरों के साथ वर्णित समय समायोजन नियम का प्रतिनिधित्व करने वाले [AdjustmentRule](../) वर्ग का एक उदाहरण बनाता है।

```cpp
static AdjustmentRulePtr System::TimeZoneInfo::AdjustmentRule::CreateAdjustmentRule(DateTime date_start, DateTime date_end, TimeSpan daylight_delta, const TransitionTime &daylight_transition_start, const TransitionTime &daylight_transition_end, TimeSpan base_utc_offset_delta, bool no_daylight_transitions)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| date_start | DateTime | समायोजन नियम के प्रभावी होने की तिथि और समय। |
| date_end | DateTime | समायोजन नियम के प्रभाव समाप्त होने की तिथि और समय। |
| daylight_delta | TimeSpan | समय क्षेत्र के डेलाइट सेविंग टाइम को बनाने के लिए आवश्यक समय की मात्रा। |
| daylight_transition_start | const TransitionTime\& | डेलाइट सेविंग टाइम से स्टैंडर्ड टाइम में परिवर्तन की जानकारी। |
| daylight_transition_end | const TransitionTime\& | स्टैंडर्ड टाइम से डेलाइट सेविंग टाइम में परिवर्तन की जानकारी। |
| base_utc_offset_delta | TimeSpan | डिफ़ॉल्ट UTC ऑफ़सेट से अंतर। |
| no_daylight_transitions | bool | निर्दिष्ट करता है कि समायोजन नियम डेलाइट सेविंग टाइम में परिवर्तन को मानता है या नहीं. |

### ReturnValue

वर्णित समय क्षेत्र समायोजन नियम का प्रतिनिधित्व करने वाले [AdjustmentRule](../) वर्ग का एक उदाहरण।

## संबंधित देखें

* Typedef [AdjustmentRulePtr](../../adjustmentruleptr/)
* Class [DateTime](../../../datetime/)
* Class [TimeSpan](../../../timespan/)
* Class [TransitionTime](../../transitiontime/)
* Class [AdjustmentRule](../)
* Class [TimeZoneInfo](../../)
* Namespace [System](../../../)
* Library [Aspose.Page for C++](../../../../)
