---
title: "System::Globalization::SortKey class"
linktitle: "SortKey"
second_title: "Aspose.Page C++ के लिए"
description: "System::Globalization::SortKey class. स्ट्रिंग को उसके सॉर्ट की में मैप करना। इस क्लास की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ होंगी। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को आर्ग्यूमेंट के रूप में पास करने के लिए करें।"
type: docs
weight: 2200
url: /hi/cpp/system.globalization/sortkey/
---
## SortKey class


स्ट्रिंग को उसके सॉर्ट की में मैप करना। इस क्लास की वस्तुओं को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ होंगी। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को आर्ग्यूमेंट के रूप में पास करने के लिए करें।

```cpp
class SortKey : public System::Object
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| static [Compare](./compare/)(const SortKeyPtr\&, const SortKeyPtr\&) | दो सॉर्ट की की तुलना करता है। |
| [Equals](./equals/)(SharedPtr\<Object\>) override | जाँचता है कि निर्दिष्ट वस्तु वर्तमान [SortKey](./) वस्तु के बराबर है या नहीं। |
| virtual [get_KeyData](./get_keydata/)() | वर्तमान वस्तु का प्रतिनिधित्व करने वाला बाइट एरे प्राप्त करता है। |
| virtual [get_OriginalString](./get_originalstring/)() | इस वस्तु को बनाने के लिए उपयोग की गई मूल स्ट्रिंग प्राप्त करता है। |
| [GetHashCode](./gethashcode/)() const override | वर्तमान [SortKey](./) वस्तु के लिए हैश कोड प्राप्त करता है। |
| [operator=](./operator=/)(const SortKey\&) |  |
| [SortKey](./sortkey/)(const SortKey\&) |  |
| [ToString](./tostring/)() const override | वर्तमान वस्तु को उसकी स्ट्रिंग प्रतिनिधित्व में परिवर्तित करता है। |
## संबंधित देखें

* Class [Object](../../system/object/)
* Namespace [System::Globalization](../)
* Library [Aspose.Page for C++](../../)
