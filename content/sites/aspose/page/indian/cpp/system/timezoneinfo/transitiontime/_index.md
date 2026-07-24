---
title: "System::TimeZoneInfo::TransitionTime क्लास"
linktitle: "TransitionTime"
second_title: "Aspose.Page C++ के लिए"
description: "System::TimeZoneInfo::TransitionTime क्लास। C++ में RTTI जानकारी।"
type: docs
weight: 3400
url: /hi/cpp/system/timezoneinfo/transitiontime/
---
## TransitionTime class


RTTI जानकारी।

```cpp
class TransitionTime
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| static [CreateFixedDateRule](./createfixeddaterule/)(DateTime, int, int) | [TransitionTime](./) क्लास की एक इंस्टेंस बनाता है जो एक निश्चित-तारीख नियम का प्रतिनिधित्व करती है (समय परिवर्तन जो किसी विशिष्ट महीने के विशिष्ट दिन पर होता है)। |
| static [CreateFloatingDateRule](./createfloatingdaterule/)(DateTime, int, int, DayOfWeek) | [TransitionTime](./) क्लास की एक इंस्टेंस बनाता है जो एक फ्लोटिंग-डेट नियम का प्रतिनिधित्व करती है (समय परिवर्तन जो किसी विशिष्ट महीने के विशिष्ट सप्ताह के विशिष्ट दिन पर होता है)। |
| static [CreateTransitionTime](./createtransitiontime/)(DateTime, int, int, int, DayOfWeek, bool) | [TransitionTime](./) क्लास की एक इंस्टेंस बनाता है जो निर्दिष्ट पैरामीटरों के साथ वर्णित समय परिवर्तन का प्रतिनिधित्व करती है। |
| [get_Day](./get_day/)() const | समय परिवर्तन के होने वाले सप्ताह के दिन का क्रमांक लौटाता है। |
| [get_DayOfWeek](./get_dayofweek/)() const | समय परिवर्तन के होने वाले सप्ताह के दिन को दर्शाने वाला मान लौटाता है। |
| [get_IsFixedDateRule](./get_isfixeddaterule/)() const | समय परिवर्तन के निश्चित तिथि व समय या फ्लोटिंग तिथि व समय पर होने का संकेत देने वाला मान लौटाता है। |
| [get_Month](./get_month/)() const | समय परिवर्तन के होने वाले वर्ष के महीने का क्रमांक लौटाता है। |
| [get_TimeOfDay](./get_timeofday/)() const | समय परिवर्तन के होने वाले विशिष्ट समय को दर्शाने वाला एक [DateTime](../../datetime/) ऑब्जेक्ट लौटाता है। |
| [get_Week](./get_week/)() const | समय परिवर्तन के होने वाले महीने के सप्ताह का क्रमांक लौटाता है। |
| [operator!=](./operator!=/)(const TransitionTime\&) const |  |
| [operator==](./operator==/)(const TransitionTime\&) const |  |
| [TransitionTime](./transitiontime/)() | डिफ़ॉल्ट कंस्ट्रक्टर। आंतरिक उपयोग के लिए। |
## टिप्पणियाँ


एक टाइम ज़ोन में समय परिवर्तन के बारे में जानकारी प्रदान करता है।
## संबंधित देखें

* Class [TimeZoneInfo](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
