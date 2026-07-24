---
title: "System::Globalization::SortVersion क्लास"
linktitle: "SortVersion"
second_title: "Aspose.Page C++ के लिए"
description: "System::Globalization::SortVersion क्लास। स्ट्रिंग्स की तुलना और क्रमबद्ध करने के लिए उपयोग किए जाने वाले यूनिकोड संस्करण की जानकारी प्रदान करता है। इस क्लास की ऑब्जेक्ट्स को केवल System::MakeObject() फ़ंक्शन का उपयोग करके आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ उत्पन्न होंगी। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें C++ में।"
type: docs
weight: 2300
url: /hi/cpp/system.globalization/sortversion/
---
## SortVersion class


स्ट्रिंग्स की तुलना और क्रमबद्ध करने के लिए उपयोग किए जाने वाले यूनिकोड संस्करण की जानकारी प्रदान करता है। इस क्लास की ऑब्जेक्ट्स को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ उत्पन्न होंगी। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।

```cpp
class SortVersion : public System::IEquatable<SharedPtr<SortVersion>>
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [Equals](./equals/)(SharedPtr\<SortVersion\>) override | जाँचता है कि वर्तमान [SortVersion](./) इंस्टेंस निर्दिष्ट [SortVersion](./) ऑब्जेक्ट के बराबर है या नहीं। |
| [Equals](./equals/)(SharedPtr\<Object\>) override | जाँचता है कि वर्तमान [SortVersion](./) इंस्टेंस निर्दिष्ट [SortVersion](./) ऑब्जेक्ट के बराबर है या नहीं। |
| [get_FullVersion](./get_fullversion/)() | पूर्ण संस्करण संख्या प्राप्त करता है। |
| [get_SortId](./get_sortid/)() | इस वस्तु के लिए अद्वितीय पहचानकर्ता प्राप्त करता है। |
| [GetHashCode](./gethashcode/)() const override | वर्तमान वस्तु के लिए हैश कोड प्राप्त करता है। |
| [operator!=](./operator!=/)(const SortVersion\&) | जाँचता है कि वर्तमान [SortVersion](./) उदाहरण निर्दिष्ट [SortVersion](./) वस्तु के बराबर नहीं है। |
| [operator=](./operator=/)(const SortVersion\&) |  |
| [operator==](./operator==/)(const SortVersion\&) | जाँचता है कि वर्तमान [SortVersion](./) इंस्टेंस निर्दिष्ट [SortVersion](./) ऑब्जेक्ट के बराबर है या नहीं। |
| [SortVersion](./sortversion/)(int, const Guid\&) | RTTI जानकारी। |
| [SortVersion](./sortversion/)(const SortVersion\&) |  |
## संबंधित देखें

* Class [IEquatable](../../system/iequatable/)
* Namespace [System::Globalization](../)
* Library [Aspose.Page for C++](../../)
