---
title: "System::TimeZoneInfo::AdjustmentRule क्लास"
linktitle: "AdjustmentRule"
second_title: "Aspose.Page C++ के लिए"
description: "System::TimeZoneInfo::AdjustmentRule क्लास। एक टाइम ज़ोन समायोजन के बारे में जानकारी प्रदान करता है। इस क्लास की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का उदाहरण कभी भी स्टैक पर या operator new का उपयोग करके न बनाएँ, क्योंकि इससे रनटाइम त्रुटियां और/या असर्शन त्रुटियां हो सकती हैं। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग करके इसे फ़ंक्शनों को तर्क के रूप में पास करें।"
type: docs
weight: 3300
url: /hi/cpp/system/timezoneinfo/adjustmentrule/
---
## AdjustmentRule class


एक टाइम ज़ोन समायोजन के बारे में जानकारी प्रदान करता है। इस क्लास की वस्तुओं को केवल [System::MakeObject()](../../makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का उदाहरण कभी भी स्टैक पर या operator new का उपयोग करके न बनाएँ, क्योंकि इससे रनटाइम त्रुटियां और/या असर्शन त्रुटियां हो सकती हैं। हमेशा इस क्लास को [System::SmartPtr](../../smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग करके इसे फ़ंक्शनों को तर्क के रूप में पास करें।

```cpp
class AdjustmentRule : public System::IEquatable<AdjustmentRulePtr>
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| static [CreateAdjustmentRule](./createadjustmentrule/)(DateTime, DateTime, TimeSpan, const TransitionTime\&, const TransitionTime\&) | [AdjustmentRule](./) क्लास का एक उदाहरण बनाता है जो निर्दिष्ट पैरामीटरों के साथ वर्णित समय समायोजन नियम को दर्शाता है। |
| static [CreateAdjustmentRule](./createadjustmentrule/)(DateTime, DateTime, TimeSpan, const TransitionTime\&, const TransitionTime\&, TimeSpan, bool) | [AdjustmentRule](./) क्लास का एक उदाहरण बनाता है जो निर्दिष्ट पैरामीटरों के साथ वर्णित समय समायोजन नियम को दर्शाता है। |
| [Equals](./equals/)(AdjustmentRulePtr) override |  |
| [get_BaseUtcOffsetDelta](./get_baseutcoffsetdelta/)() const | डिफ़ॉल्ट UTC ऑफ़सेट से एक डेल्टा लौटाता है। |
| [get_DateEnd](./get_dateend/)() const | एक [DateTime](../../datetime/) ऑब्जेक्ट लौटाता है जो उस तिथि और समय को दर्शाता है जब समायोजन नियम प्रभावी होना बंद कर देता है। |
| [get_DateStart](./get_datestart/)() const | एक [DateTime](../../datetime/) ऑब्जेक्ट लौटाता है जो उस तिथि और समय को दर्शाता है जब समायोजन नियम प्रभावी हो जाता है। |
| [get_DaylightDelta](./get_daylightdelta/)() const | एक [TimeSpan](../../timespan/) ऑब्जेक्ट लौटाता है जो टाइम ज़ोन के डेलाइट सेविंग टाइम को बनाने के लिए आवश्यक समय की मात्रा को दर्शाता है। |
| [get_DaylightTransitionEnd](./get_daylighttransitionend/)() const | मानक समय से डेलाइट सेविंग टाइम में परिवर्तन के बारे में जानकारी लौटाता है। |
| [get_DaylightTransitionStart](./get_daylighttransitionstart/)() const | डेलाइट सेविंग टाइम से मानक समय में परिवर्तन के बारे में जानकारी लौटाता है। |
| [get_HasDaylightSaving](./get_hasdaylightsaving/)() const | आंतरिक उपयोग के लिए। |
| [GetHashCode](./gethashcode/)() const override | C# के [Object.GetHashCode()](../../object/gethashcode/) मेथड का समानांतर। कस्टम ऑब्जेक्ट्स की हैशिंग को सक्षम करता है। |
## संबंधित देखें

* Class [IEquatable](../../iequatable/)
* Class [TimeZoneInfo](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
