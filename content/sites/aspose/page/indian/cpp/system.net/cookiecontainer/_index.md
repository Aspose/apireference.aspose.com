---
title: "System::Net::CookieContainer क्लास"
linktitle: "CookieContainer"
second_title: "Aspose.Page C++ के लिए"
description: "System::Net::CookieContainer क्लास। CookieCollection‑क्लास के इंस्टेंस के लिए एक कंटेनर प्रदान करता है। इस क्लास की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रन‑टाइम त्रुटियाँ और/या असर्शन त्रुटियाँ उत्पन्न होंगी। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग करके इसे C++ में फ़ंक्शनों के तर्क के रूप में पास करें।"
type: docs
weight: 400
url: /hi/cpp/system.net/cookiecontainer/
---
## CookieContainer class


CookieCollection‑क्लास के इंस्टेंस के लिए एक कंटेनर प्रदान करता है। इस क्लास की वस्तुओं को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रन‑टाइम त्रुटियाँ और/या असर्शन त्रुटियाँ उत्पन्न होंगी। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग करके इसे फ़ंक्शनों के तर्क के रूप में पास करें।

```cpp
class CookieContainer : public System::Object
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [Add](./add/)(System::SharedPtr\<Cookie\>) | संग्रह में एक कुकी जोड़ता है। |
| [Add](./add/)(System::SharedPtr\<Cookie\>, bool) | संग्रह में एक कुकी जोड़ता है। |
| [Add](./add/)(System::SharedPtr\<CookieCollection\>) | निर्दिष्ट संग्रह से कुकीज़ को वर्तमान संग्रह में कॉपी करता है। |
| [Add](./add/)(System::SharedPtr\<Uri\>, System::SharedPtr\<Cookie\>) | निर्दिष्ट URI के लिए एक कुकी जोड़ता है। |
| [Add](./add/)(System::SharedPtr\<Uri\>, System::SharedPtr\<CookieCollection\>) | निर्दिष्ट URI के लिए निर्दिष्ट संग्रह से कुकीज़ को वर्तमान संग्रह में कॉपी करता है। |
| [CookieContainer](./cookiecontainer/)() | एक नया उदाहरण बनाता है। |
| [CookieContainer](./cookiecontainer/)(int32_t) | एक नया उदाहरण बनाता है। |
| [CookieContainer](./cookiecontainer/)(int32_t, int32_t, int32_t) | एक नया उदाहरण बनाता है। |
| [CookieCutter](./cookiecutter/)(System::SharedPtr\<Uri\>, String, String, bool) | निर्दिष्ट URI के लिए निर्दिष्ट HTTP हेडर से कुकीज़ को कॉपी करता है। |
| [get_Capacity](./get_capacity/)() | संग्रह क्षमता प्राप्त करता है। |
| [get_Count](./get_count/)() | संग्रह की वस्तुओं की संख्या लौटाता है। |
| [get_MaxCookieSize](./get_maxcookiesize/)() | अधिकतम कुकी आकार प्राप्त करता है। |
| [get_PerDomainCapacity](./get_perdomaincapacity/)() | डोमेन प्रति संग्रह क्षमता प्राप्त करता है। |
| [GetCookieHeader](./getcookieheader/)(System::SharedPtr\<Uri\>) | निर्दिष्ट URI से संबंधित कुकीज़ वाले एक HTTP हेडर को लौटाता है। |
| [GetCookieHeader](./getcookieheader/)(System::SharedPtr\<Uri\>, String\&) | निर्दिष्ट URI से संबंधित कुकीज़ वाले एक HTTP हेडर को लौटाता है। |
| [GetCookies](./getcookies/)(System::SharedPtr\<Uri\>) | निर्दिष्ट URI से संबंधित कुकीज़ का संग्रह लौटाता है। |
| [InternalGetCookies](./internalgetcookies/)(System::SharedPtr\<Uri\>) | निर्दिष्ट URI से संबंधित कुकीज़ का संग्रह लौटाता है। |
| [IsLocalDomain](./islocaldomain/)(String) | जाँचता है कि निर्दिष्ट डोमेन localhost है या नहीं। |
| [set_Capacity](./set_capacity/)(int32_t) | संग्रह क्षमता सेट करता है। |
| [set_MaxCookieSize](./set_maxcookiesize/)(int32_t) | अधिकतम कुकी आकार सेट करता है। |
| [set_PerDomainCapacity](./set_perdomaincapacity/)(int32_t) | डोमेन प्रति संग्रह क्षमता सेट करता है। |
| [SetCookies](./setcookies/)(System::SharedPtr\<Uri\>, String) | निर्दिष्ट हेडर से कुकीज़ को संग्रह में कॉपी करता है और उन्हें निर्दिष्ट URI से जोड़ता है। |
## फ़ील्ड्स

| फ़ील्ड | विवरण |
| --- | --- |
| static [DefaultCookieLengthLimit](./defaultcookielengthlimit/) | अधिकतम कुकी आकार। |
| static [DefaultCookieLimit](./defaultcookielimit/) | RTTI जानकारी। |
| static [DefaultPerDomainCookieLimit](./defaultperdomaincookielimit/) | डोमेन प्रति संग्रह वस्तुओं की अधिकतम संख्या। |
## संबंधित देखें

* Class [Object](../../system/object/)
* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)
