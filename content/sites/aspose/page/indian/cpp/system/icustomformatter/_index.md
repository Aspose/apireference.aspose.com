---
title: "System::ICustomFormatter क्लास"
linktitle: "ICustomFormatter"
second_title: "Aspose.Page C++ के लिए"
description: "System::ICustomFormatter क्लास। एक विधि को परिभाषित करता है जो निर्दिष्ट ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए मान की स्ट्रिंग प्रतिनिधित्व को कस्टम फ़ॉर्मेटिंग करती है। इस क्लास की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियां और/या असर्शन त्रुटियां हो सकती हैं। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें C++ में।"
type: docs
weight: 3500
url: /hi/cpp/system/icustomformatter/
---
## ICustomFormatter class


एक विधि को परिभाषित करता है जो निर्दिष्ट ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए मान की स्ट्रिंग प्रतिनिधित्व को कस्टम फ़ॉर्मेटिंग करती है। इस क्लास की वस्तुओं को केवल [System::MakeObject()](../makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियां और/या असर्शन त्रुटियां हो सकती हैं। हमेशा इस क्लास को [System::SmartPtr](../smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।

```cpp
class ICustomFormatter : public virtual System::Object
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| virtual [Format](./format/)(System::String, System::SharedPtr\<System::Object\>, System::SharedPtr\<System::IFormatProvider\>) | वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए मान की स्ट्रिंग प्रतिनिधित्व को निर्दिष्ट फ़ॉर्मेट का उपयोग करके लौटाता है। |
## संबंधित देखें

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
