---
title: "System::BoxedValueBase क्लास"
linktitle: "BoxedValueBase"
second_title: "Aspose.Page C++ के लिए"
description: "System::BoxedValueBase क्लास। एक बेस क्लास जो एक इंटरफ़ेस को परिभाषित करती है और बॉक्स्ड वैल्यू का प्रतिनिधित्व करने वाली डीसेंडेंट क्लास के कुछ मूलभूत मेथड्स को लागू करती है। इस क्लास की ऑब्जेक्ट्स को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएं, क्योंकि इससे रनटाइम त्रुटियां और/या असर्शन फॉल्ट्स हो सकते हैं। हमेशा इस क्लास को System::SmartPtr पॉइंटर में रैप करें और इस पॉइंटर का उपयोग C++ में फ़ंक्शनों को आर्ग्यूमेंट के रूप में पास करने के लिए करें।"
type: docs
weight: 900
url: /hi/cpp/system/boxedvaluebase/
---
## BoxedValueBase class


एक बेस क्लास जो एक इंटरफ़ेस को परिभाषित करती है और बॉक्स्ड वैल्यू का प्रतिनिधित्व करने वाली डीसेंडेंट क्लास के कुछ मूलभूत मेथड्स को लागू करती है। इस क्लास की ऑब्जेक्ट्स को केवल [System::MakeObject()](../makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएं, क्योंकि इससे रनटाइम त्रुटियां और/या असर्शन फॉल्ट्स हो सकते हैं। हमेशा इस क्लास को [System::SmartPtr](../smartptr/) पॉइंटर में रैप करें और इस पॉइंटर का उपयोग फ़ंक्शनों को आर्ग्यूमेंट के रूप में पास करने के लिए करें।

```cpp
class BoxedValueBase : public System::Object
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| virtual [GetTypeCode](./gettypecode/)() const | वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए बॉक्स्ड वैल्यू के प्रकार को दर्शाने वाला मान लौटाता है। |
| virtual [GetUnsignedLongLongValue](./getunsignedlonglongvalue/)() const | वर्तमान ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए बॉक्स्ड को 64-बिट पूर्णांक मान में परिवर्तित करता है। |
| virtual [IsBoxedEnum](./isboxedenum/)() | निर्धारित करता है कि वर्तमान ऑब्जेक्ट enum प्रकार के बॉक्स्ड वैल्यू का प्रतिनिधित्व करता है या नहीं। |
| static [Parse](./parse/)(const TypeInfo\&, const String\&, bool) | निर्दिष्ट नाम वाले enumeration के enumeration constant के मान को बॉक्स करता है। एक पैरामीटर यह निर्धारित करता है कि enumeration constant के नाम को दर्शाने वाली स्ट्रिंग की व्याख्या करते समय केस को अनदेखा किया जाना चाहिए या नहीं। |
| static [Parse](./parse/)(const TypeInfo\&, const String\&) | निर्दिष्ट नाम वाले enumeration के enumeration constant के मान को बॉक्स करता है। |
| [ToString](./tostring/)(const System::String\&) const | निर्दिष्ट फ़ॉर्मेट स्ट्रिंग का उपयोग करके बॉक्स्ड ऑब्जेक्ट को स्ट्रिंग में परिवर्तित करता है। |
| virtual [ToString](./tostring/)() const | C# [Object.ToString()](../object/tostring/) मेथड का समानांतर। कस्टम ऑब्जेक्ट्स को स्ट्रिंग में परिवर्तित करने में सक्षम बनाता है। |
## संबंधित देखें

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
