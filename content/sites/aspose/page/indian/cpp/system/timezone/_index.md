---
title: "System::TimeZone क्लास"
linktitle: "TimeZone"
second_title: "Aspose.Page C++ के लिए"
description: "System::TimeZone क्लास। एक समय क्षेत्र का प्रतिनिधित्व करता है। इस क्लास की ऑब्जेक्ट्स को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार की इंस्टेंस को स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ हो सकती हैं। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग C++ में फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।"
type: docs
weight: 6200
url: /hi/cpp/system/timezone/
---
## TimeZone class


एक समय क्षेत्र का प्रतिनिधित्व करता है। इस क्लास की ऑब्जेक्ट्स को केवल [System::MakeObject()](../makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार की इंस्टेंस को स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ हो सकती हैं। हमेशा इस क्लास को [System::SmartPtr](../smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।

```cpp
class TimeZone : public System::Object
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| static [get_CurrentTimeZone](./get_currenttimezone/)() | वर्तमान समय क्षेत्र का प्रतिनिधित्व करने वाले [TimeZone](./) क्लास की नई इंस्टेंस लौटाता है। |
| virtual [get_DaylightName](./get_daylightname/)() const | वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए समय क्षेत्र के डेलाइट सेविंग टाइम के लिए एक नाम लौटाता है। |
| virtual [get_StandardName](./get_standardname/)() const | वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए समय क्षेत्र के मानक समय के लिए एक नाम लौटाता है। |
| virtual [GetDaylightChanges](./getdaylightchanges/)(int32_t) | किसी विशेष वर्ष के लिए डेलाइट सेविंग टाइम अवधि लौटाता है। |
| virtual [GetUtcOffset](./getutcoffset/)(DateTime) | निर्दिष्ट स्थानीय समय के लिए UTC ऑफ़सेट लौटाता है। |
| virtual [IsDaylightSavingTime](./isdaylightsavingtime/)(DateTime) | निर्धारित करता है कि निर्दिष्ट [DateTime](../datetime/) ऑब्जेक्ट द्वारा प्रतिनिधित्व किया गया तिथि और समय मान वर्तमान [TimeZone](./) ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए समय क्षेत्र के डेलाइट सेविंग टाइम की सीमा में आता है या नहीं। |
## संबंधित देखें

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
