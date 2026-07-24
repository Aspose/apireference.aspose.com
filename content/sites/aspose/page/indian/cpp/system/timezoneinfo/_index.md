---
title: "System::TimeZoneInfo क्लास"
linktitle: "TimeZoneInfo"
second_title: "Aspose.Page C++ के लिए"
description: "System::TimeZoneInfo क्लास। एक विशेष टाइम ज़ोन का विवरण देने वाली जानकारी का प्रतिनिधित्व करता है। इस क्लास की ऑब्जेक्ट्स को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन फॉल्ट्स हो सकते हैं। हमेशा इस क्लास को System::SmartPtr पॉइंटर में रैप करें और इस पॉइंटर का उपयोग C++ में फ़ंक्शनों को आर्ग्युमेंट के रूप में पास करने के लिए करें।"
type: docs
weight: 6300
url: /hi/cpp/system/timezoneinfo/
---
## TimeZoneInfo class


एक विशेष टाइम ज़ोन का विवरण देने वाली जानकारी का प्रतिनिधित्व करता है। इस क्लास की ऑब्जेक्ट्स को केवल [System::MakeObject()](../makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन फॉल्ट्स हो सकते हैं। हमेशा इस क्लास को [System::SmartPtr](../smartptr/) पॉइंटर में रैप करें और इस पॉइंटर का उपयोग फ़ंक्शनों को आर्ग्युमेंट के रूप में पास करने के लिए करें।

```cpp
class TimeZoneInfo : public System::IEquatable<TimeZoneInfoPtr>
```

## Nested classes

* Class [AdjustmentRule](./adjustmentrule/)
* Class [TransitionTime](./transitiontime/)
## विधियाँ

| विधि | विवरण |
| --- | --- |
| static [ClearCachedData](./clearcacheddata/)() | कैश किए गए टाइम ज़ोन डेटा को साफ़ करें। |
| static [ConvertTime](./converttime/)(DateTime, const TimeZoneInfoPtr\&, const TimeZoneInfoPtr\&) | एक टाइम ज़ोन से दूसरे टाइम ज़ोन में समय को [Convert](../convert/) करें। |
| static [ConvertTime](./converttime/)(const DateTimeOffset\&, const TimeZoneInfoPtr\&) | निर्दिष्ट टाइम ज़ोन में समय को [Convert](../convert/) करें। |
| static [ConvertTime](./converttime/)(DateTime, const TimeZoneInfoPtr\&) | निर्दिष्ट टाइम ज़ोन में समय को [Convert](../convert/) करें। |
| static [ConvertTimeBySystemTimeZoneId](./converttimebysystemtimezoneid/)(DateTime, const String\&) | निर्दिष्ट टाइम ज़ोन में समय को [Convert](../convert/) करें। |
| static [ConvertTimeBySystemTimeZoneId](./converttimebysystemtimezoneid/)(const DateTimeOffset\&, const String\&) | निर्दिष्ट टाइम ज़ोन में समय को [Convert](../convert/) करें। |
| static [ConvertTimeBySystemTimeZoneId](./converttimebysystemtimezoneid/)(DateTime, const String\&, const String\&) | निर्दिष्ट टाइम ज़ोन में समय को [Convert](../convert/) करें। |
| static [ConvertTimeFromUtc](./converttimefromutc/)(DateTime, const TimeZoneInfoPtr\&) | UTC-समय को निर्दिष्ट टाइम ज़ोन में समय में परिवर्तित करता है। |
| static [ConvertTimeToUtc](./converttimetoutc/)(DateTime, const TimeZoneInfoPtr\&) | समय को UTC-समय में परिवर्तित करता है। |
| static [ConvertTimeToUtc](./converttimetoutc/)(DateTime) | समय को UTC-समय में परिवर्तित करता है। |
| static [ConvertTimeToUtcNoThrow](./converttimetoutcnothrow/)(DateTime) | समय को UTC-समय में परिवर्तित करता है। आंतरिक उपयोग के लिए। |
| static [CreateCustomTimeZone](./createcustomtimezone/)(const String\&, TimeSpan, const String\&, const String\&, const String\&, const ArrayPtr\<AdjustmentRulePtr\>\&, bool) | एक कस्टम टाइम ज़ोन बनाता है। |
| static [CreateCustomTimeZone](./createcustomtimezone/)(const String\&, TimeSpan, const String\&, const String\&, const String\&, const ArrayPtr\<AdjustmentRulePtr\>\&) | एक कस्टम टाइम ज़ोन बनाता है। |
| static [CreateCustomTimeZone](./createcustomtimezone/)(const String\&, TimeSpan, const String\&, const String\&) | एक कस्टम टाइम ज़ोन बनाता है। |
| [Equals](./equals/)(SharedPtr\<Object\>) override |  |
| [Equals](./equals/)(TimeZoneInfoPtr) override | वर्तमान और निर्दिष्ट वस्तुओं के बराबर होने का निर्धारण करता है। |
| static [FindSystemTimeZoneById](./findsystemtimezonebyid/)(const String\&) | निर्दिष्ट पहचानकर्ता वाला टाइम ज़ोन प्राप्त करता है। |
| [get_BaseUtcOffset](./get_baseutcoffset/)() const | वर्तमान टाइम ज़ोन के मानक समय और UTC समय के बीच समय अंतराल का प्रतिनिधित्व करने वाला [TimeSpan](../timespan/) का एक इंस्टेंस लौटाता है। |
| [get_DaylightName](./get_daylightname/)() const | वर्तमान टाइम ज़ोन के डेलाइट सेविंग टाइम का नाम प्राप्त करता है। |
| [get_DisplayName](./get_displayname/)() const | वर्तमान टाइम ज़ोन का नाम प्राप्त करता है। |
| [get_Id](./get_id/)() const | वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए टाइम ज़ोन की पहचानकर्ता लौटाता है। |
| static [get_Local](./get_local/)() | [TimeZoneInfo](./) का एक इंस्टेंस लौटाता है जो स्थानीय टाइम ज़ोन का प्रतिनिधित्व करता है। |
| [get_StandardName](./get_standardname/)() const | वर्तमान टाइम ज़ोन के मानक समय का नाम प्राप्त करता है। |
| [get_SupportsDaylightSavingTime](./get_supportsdaylightsavingtime/)() const | यह संकेत करने वाला फ़्लैग प्राप्त करता है कि टाइम ज़ोन के पास डेलाइट सेविंग टाइम नियम हैं या नहीं। |
| static [get_Utc](./get_utc/)() | [TimeZoneInfo](./) का एक इंस्टेंस लौटाता है जो UTC टाइम ज़ोन का प्रतिनिधित्व करता है। |
| [GetAdjustmentRules](./getadjustmentrules/)() const | [AdjustmentRule](./adjustmentrule/) ऑब्जेक्ट्स की एक एरे लौटाता है जो वर्तमान [TimeZoneInfo](./) ऑब्जेक्ट पर लागू होने वाले समायोजन नियमों का प्रतिनिधित्व करती है। |
| [GetAmbiguousTimeOffsets](./getambiguoustimeoffsets/)(DateTime) const | निर्दिष्ट तिथि और समय को मैप किया जा सकने वाले UTC तिथियों और समयों को प्राप्त करता है। |
| [GetAmbiguousTimeOffsets](./getambiguoustimeoffsets/)(const DateTimeOffset\&) const | निर्दिष्ट तिथि और समय को मैप किया जा सकने वाले UTC तिथियों और समयों को प्राप्त करता है। |
| [GetHashCode](./gethashcode/)() const override | C# [Object.GetHashCode()](../object/gethashcode/) मेथड का समानांतर। कस्टम ऑब्जेक्ट्स का हैशिंग सक्षम करता है। |
| static [GetSystemTimeZones](./getsystemtimezones/)() | स्थानीय सिस्टम पर उपलब्ध सभी टाइम ज़ोन की क्रमबद्ध संग्रह प्राप्त करता है। |
| [GetUtcOffset](./getutcoffset/)(DateTime) const | निर्दिष्ट तिथि और समय के लिए इस टाइम ज़ोन और UTC टाइम ज़ोन के बीच अंतर की गणना करता है। |
| [GetUtcOffset](./getutcoffset/)(const DateTimeOffset\&) const | निर्दिष्ट तिथि और समय के लिए इस टाइम ज़ोन और UTC टाइम ज़ोन के बीच अंतर की गणना करता है। |
| static [GetUtcOffsetFromUtc](./getutcoffsetfromutc/)(DateTime, const TimeZoneInfoPtr\&) | एक आंतरिक सहायक फ़ंक्शन जो निर्दिष्ट टाइम ज़ोन में UTC-डेटटाइम के लिए UTC ऑफ़सेट लौटाता है। केवल आंतरिक उपयोग के लिए। |
| static [GetUtcOffsetFromUtc](./getutcoffsetfromutc/)(DateTime, const TimeZoneInfoPtr\&, bool\&, bool\&) | एक आंतरिक सहायक फ़ंक्शन जो निर्दिष्ट टाइम ज़ोन में UTC-डेटटाइम के लिए UTC ऑफ़सेट लौटाता है। केवल आंतरिक उपयोग के लिए। |
| [GetUtcOffsetNoThrow](./getutcoffsetnothrow/)(DateTime) const | निर्दिष्ट तिथि और समय के लिए इस टाइम ज़ोन और UTC टाइम ज़ोन के बीच अंतर की गणना करता है। केवल आंतरिक उपयोग के लिए। |
| [HasSameRules](./hassamerules/)(const TimeZoneInfoPtr\&) const | जाँचता है कि वर्तमान और अन्य टाइम ज़ोन के पास समान समायोजन नियम हैं या नहीं। |
| [IsAmbiguousTime](./isambiguoustime/)(DateTime) const | जाँचता है कि निर्दिष्ट तिथि और समय अस्पष्ट है और कई UTC समयों में मैप किया जा सकता है या नहीं। |
| [IsAmbiguousTime](./isambiguoustime/)(const DateTimeOffset\&) const | जाँचता है कि निर्दिष्ट तिथि और समय अस्पष्ट है और कई UTC समयों में मैप किया जा सकता है या नहीं। |
| [IsDaylightSavingTime](./isdaylightsavingtime/)(DateTime) const | जाँचता है कि निर्दिष्ट तिथि और समय डेलाइट सेविंग टाइम की सीमा में आता है या नहीं। |
| [IsDaylightSavingTime](./isdaylightsavingtime/)(const DateTimeOffset\&) const | जाँचता है कि निर्दिष्ट तिथि और समय डेलाइट सेविंग टाइम की सीमा में आता है या नहीं। |
| [IsDaylightSavingTimeNoThrow](./isdaylightsavingtimenothrow/)(DateTime) const | जाँचता है कि निर्दिष्ट तिथि और समय डेलाइट सेविंग टाइम की सीमा में आता है या नहीं। |
| [IsInvalidTime](./isinvalidtime/)(DateTime) const | जाँचता है कि निर्दिष्ट तिथि और समय अमान्य है या नहीं। |
| [ToString](./tostring/)() const override | C# [Object.ToString()](../object/tostring/) मेथड का समानांतर। कस्टम ऑब्जेक्ट्स को स्ट्रिंग में परिवर्तित करने में सक्षम बनाता है। |
| static [TransitionTimeToDateTime](./transitiontimetodatetime/)(int32_t, const TransitionTime\&) | एक सहायक फ़ंक्शन जो वर्ष और [TransitionTime](./transitiontime/) को [DateTime](../datetime/) में परिवर्तित करता है। |
## Typedefs

| टाइपडिफ़ | विवरण |
| --- | --- |
| [AdjustmentRulePtr](./adjustmentruleptr/) | [AdjustmentRule](./adjustmentrule/) क्लास के एक इंस्टेंस के लिए साझा पॉइंटर का उपनाम। |
## संबंधित देखें

* Class [IEquatable](../iequatable/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
