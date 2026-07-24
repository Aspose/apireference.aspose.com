---
title: "System::Net::PathList क्लास"
linktitle: "PathList"
second_title: "Aspose.Page C++ के लिए"
description: "System::Net::PathList क्लास। CookieCollection क्लास के उदाहरणों की सूची का प्रतिनिधित्व करता है। इस क्लास की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का उदाहरण स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ उत्पन्न होंगी। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग करके C++ में फ़ंक्शन को तर्क के रूप में पास करें।"
type: docs
weight: 3000
url: /hi/cpp/system.net/pathlist/
---
## PathList class


[CookieCollection](../cookiecollection/) क्लास के उदाहरणों की सूची का प्रतिनिधित्व करता है। इस क्लास की वस्तुओं को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का उदाहरण स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ उत्पन्न होंगी। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग करके फ़ंक्शन को तर्क के रूप में पास करें।

```cpp
class PathList : public System::Object
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| static [Create](./create/)() | एक नया इंस्टेंस बनाता है। |
| [get_Count](./get_count/)() const | आइटमों की संख्या लौटाता है। |
| [get_SyncRoot](./get_syncroot/)() const | वह वस्तु लौटाता है जिसके माध्यम से संग्रह समक्रमित किया जा रहा है। |
| [GetCookiesCount](./getcookiescount/)() | सभी संग्रह आइटमों के कुकीज़ की संख्या लौटाता है। |
| [GetEnumerator](./getenumerator/)() | वर्तमान संग्रह के लिए एन्यूमरेटर लौटाता है। |
| [idx_get](./idx_get/)(String) | निर्दिष्ट पथ द्वारा कुकी संग्रह प्राप्त करता है। |
| [idx_set](./idx_set/)(String, System::SharedPtr\<CookieCollection\>) | निर्दिष्ट पथ द्वारा कुकी संग्रह सेट करता है। |
## संबंधित देखें

* Class [Object](../../system/object/)
* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)
