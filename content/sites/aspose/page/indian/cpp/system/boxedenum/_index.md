---
title: "System::BoxedEnum class"
linktitle: "BoxedEnum"
second_title: "Aspose.Page C++ के लिए"
description: "System::BoxedEnum class। बॉक्स्ड एन्यूमरेशन वैल्यू का प्रतिनिधित्व करता है। इस क्लास की ऑब्जेक्ट्स को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन फॉल्ट हो सकते हैं। हमेशा इस क्लास को System::SmartPtr पॉइंटर में रैप करें और इस पॉइंटर का उपयोग फ़ंक्शनों को आर्ग्यूमेंट के रूप में पास करने के लिए करें।"
type: docs
weight: 700
url: /hi/cpp/system/boxedenum/
---
## BoxedEnum class


बॉक्स्ड एन्यूमरेशन वैल्यू का प्रतिनिधित्व करता है। इस क्लास की ऑब्जेक्ट्स को केवल [System::MakeObject()](../makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन फॉल्ट हो सकते हैं। हमेशा इस क्लास को [System::SmartPtr](../smartptr/) पॉइंटर में रैप करें और इस पॉइंटर का उपयोग फ़ंक्शनों को आर्ग्यूमेंट के रूप में पास करने के लिए करें।

```cpp
template<typename E,typename UT>class BoxedEnum : public System::BoxedValue<typename std::underlying_type<E>::type>
```


| पैरामीटर | विवरण |
| --- | --- |
| E | एन्यूमरेशन वैल्यू का प्रकार |
| UT | एन्यूमरेशन **E** का अंतर्निहित प्रकार |
## विधियाँ

| विधि | विवरण |
| --- | --- |
| [BoxedEnum](./boxedenum/)(E) | निर्दिष्ट एन्यूमरेशन मान का प्रतिनिधित्व करने वाला एक इंस्टेंस बनाता है। |
| [GetUnsignedLongLongValue](./getunsignedlonglongvalue/)() const override | बॉक्स्ड एन्यूमरेशन कॉन्स्टेंट के मान को 64-बिट पूर्णांक मान में परिवर्तित करता है। |
| [IsBoxedEnum](./isboxedenum/)() override | निर्धारित करता है कि वर्तमान ऑब्जेक्ट एन्यूम प्रकार के बॉक्स्ड मान का प्रतिनिधित्व करता है या नहीं। |
| [ToString](./tostring/)() const override | वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए बॉक्स्ड मान को स्ट्रिंग में परिवर्तित करता है। |

## संबंधित देखें

* Class [BoxedValue](../boxedvalue/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
