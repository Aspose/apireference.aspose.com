---
title: "System::Runtime::Serialization::SerializationInfo क्लास"
linktitle: "SerializationInfo"
second_title: "Aspose.Page C++ के लिए"
description: "System::Runtime::Serialization::SerializationInfo क्लास। सीरियलाइज़्ड ऑब्जेक्ट का प्रतिनिधित्व करने वाले नामित फ़ील्ड्स का सेट रखता है। लागू नहीं किया गया है। इस क्लास की ऑब्जेक्ट्स को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new से कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ उत्पन्न होंगी। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को आर्ग्यूमेंट के रूप में पास करने के लिए करें।"
type: docs
weight: 400
url: /hi/cpp/system.runtime.serialization/serializationinfo/
---
## SerializationInfo class


सीरियलाइज़्ड ऑब्जेक्ट का प्रतिनिधित्व करने वाले नामित फ़ील्ड्स का सेट रखता है। अभी लागू नहीं किया गया है। इस क्लास की ऑब्जेक्ट्स को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन फॉल्ट्स हो सकते हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शन के आर्ग्यूमेंट के रूप में पास करने के लिए करें।

```cpp
class SerializationInfo : public System::Object
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [AddValue](./addvalue/)(const System::String\&, float) | फ़्लोट मान डालता है। अभी लागू नहीं किया गया है। |
| [AddValue](./addvalue/)(const System::String\&, short) | शॉर्ट मान डालता है। अभी लागू नहीं किया गया है। |
| [AddValue](./addvalue/)(const System::String\&, bool) | बूलियन मान डालता है। अभी लागू नहीं किया गया है। |
| [AddValue](./addvalue/)(const System::String\&, const System::SharedPtr\<System::Object\>\&) | ऑब्जेक्ट मान डालता है। अभी लागू नहीं किया गया है। |
| [AddValue](./addvalue/)(const System::String\&, const System::SharedPtr\<System::Object\>\&, const System::TypeInfo\&) | निर्दिष्ट प्रकार के साथ ऑब्जेक्ट मान डालता है। अभी लागू नहीं किया गया है। |
| [GetValue](./getvalue/)(const System::String\&, const System::TypeInfo\&) | [SerializationInfo](./) स्टोर से मान पुनः प्राप्त करता है। अभी लागू नहीं किया गया है। |
| [SerializationInfo](./serializationinfo/)(const System::TypeInfo\&, const System::SharedPtr\<IFormatterConverter\>\&) | RTTI जानकारी। |
## संबंधित देखें

* Class [Object](../../system/object/)
* Namespace [System::Runtime::Serialization](../)
* Library [Aspose.Page for C++](../../)
