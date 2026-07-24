---
title: "System::BoxedValue क्लास"
linktitle: "BoxedValue"
second_title: "Aspose.Page C++ के लिए"
description: "System::BoxedValue क्लास। एक बॉक्स्ड वैल्यू का प्रतिनिधित्व करता है। इस क्लास की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का उदाहरण कभी भी स्टैक पर या operator new का उपयोग करके न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन दोष उत्पन्न हो सकते हैं। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।"
type: docs
weight: 800
url: /hi/cpp/system/boxedvalue/
---
## BoxedValue class


एक बॉक्स्ड वैल्यू का प्रतिनिधित्व करता है। इस क्लास की वस्तुओं को केवल [System::MakeObject()](../makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का उदाहरण कभी भी स्टैक पर या operator new का उपयोग करके न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन दोष उत्पन्न हो सकते हैं। हमेशा इस क्लास को [System::SmartPtr](../smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।

```cpp
template<class T>class BoxedValue : public System::BoxedValueBase
```


| पैरामीटर | विवरण |
| --- | --- |
| T | क्लास द्वारा प्रतिनिधित्व किए गए बॉक्स्ड वैल्यू का प्रकार |
## विधियाँ

| विधि | विवरण |
| --- | --- |
| [BoxedValue](./boxedvalue/)(const T\&) | एक ऑब्जेक्ट बनाता है जो निर्दिष्ट बॉक्स्ड वैल्यू को दर्शाता है। |
| [Equals](./equals/)(ptr) override | वर्तमान और निर्दिष्ट ऑब्जेक्ट्स द्वारा प्रतिनिधित्व किए गए बॉक्स्ड वैल्यू की समानता निर्धारित करता है। |
| [GetHashCode](./gethashcode/)() const override | वर्तमान ऑब्जेक्ट के लिए हैश कोड लौटाता है। |
| [GetType](./gettype/)() const override | ऑब्जेक्ट का वास्तविक प्रकार प्राप्त करता है। |
| [GetTypeCode](./gettypecode/)() const override | वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए बॉक्स्ड वैल्यू के प्रकार को दर्शाने वाला मान लौटाता है। |
| [GetUnsignedLongLongValue](./getunsignedlonglongvalue/)() const override | यदि इसे कास्ट किया जा सकता है तो बॉक्स्ड ऑब्जेक्ट का संख्यात्मक मान लौटाता है, अन्यथा शून्य। |
| [is](./is/)() const | निर्धारित करता है कि वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए बॉक्स्ड वैल्यू का प्रकार **V** है या नहीं। |
| [IsBoxedEnum](./isboxedenum/)() override | निर्धारित करता है कि वर्तमान ऑब्जेक्ट enum प्रकार के बॉक्स्ड वैल्यू का प्रतिनिधित्व करता है या नहीं। |
| static [Parse](../boxedvaluebase/parse/)(const TypeInfo\&, const String\&, bool) | निर्दिष्ट नाम वाले enumeration के enumeration constant के मान को बॉक्स करता है। एक पैरामीटर यह निर्धारित करता है कि enumeration constant के नाम को दर्शाने वाली स्ट्रिंग की व्याख्या करते समय केस को अनदेखा किया जाना चाहिए या नहीं। |
| static [Parse](../boxedvaluebase/parse/)(const TypeInfo\&, const String\&) | निर्दिष्ट नाम वाले enumeration के enumeration constant के मान को बॉक्स करता है। |
| [ToString](./tostring/)() const override | वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए बॉक्स्ड वैल्यू को स्ट्रिंग में परिवर्तित करता है। |
| [ToString](../boxedvaluebase/tostring/)(const System::String\&) const | निर्दिष्ट फ़ॉर्मेट स्ट्रिंग का उपयोग करके बॉक्स्ड ऑब्जेक्ट को स्ट्रिंग में परिवर्तित करता है। |
| [unbox](./unbox/)() const | वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए मान को अनबॉक्स करता है। |

## संबंधित देखें

* Class [BoxedValueBase](../boxedvaluebase/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
