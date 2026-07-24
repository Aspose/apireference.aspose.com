---
title: "System::Net::CookieComparer क्लास"
linktitle: "CookieComparer"
second_title: "Aspose.Page C++ के लिए"
description: "System::Net::CookieComparer क्लास। Cookie क्लास के इंस्टेंस की तुलना करने के लिए उपयोग किया जाता है। इस क्लास की ऑब्जेक्ट्स को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार की इंस्टेंस को स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन फॉल्ट्स हो सकते हैं। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग करके इसे C++ में फ़ंक्शनों को आर्ग्यूमेंट के रूप में पास करें।"
type: docs
weight: 300
url: /hi/cpp/system.net/cookiecomparer/
---
## CookieComparer class


[Cookie](../cookie/) क्लास के इंस्टेंस की तुलना करने के लिए उपयोग किया जाता है। इस क्लास की ऑब्जेक्ट्स को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार की इंस्टेंस को स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन फॉल्ट्स हो सकते हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग करके इसे फ़ंक्शनों को आर्ग्यूमेंट के रूप में पास करें।

```cpp
class CookieComparer : public System::Collections::Generic::IComparer<System::SharedPtr<System::Net::Cookie>>
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [Compare](./compare/)(args_type, args_type) const override | निर्दिष्ट ऑब्जेक्ट्स की तुलना करता है। |
| static [get_Instance](./get_instance/)() | RTTI जानकारी। |
## संबंधित देखें

* Class [IComparer](../../system.collections.generic/icomparer/)
* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)
