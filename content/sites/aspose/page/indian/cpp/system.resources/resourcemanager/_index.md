---
title: "System::Resources::ResourceManager क्लास"
linktitle: "ResourceManager"
second_title: "Aspose.Page C++ के लिए"
description: "System::Resources::ResourceManager क्लास। संसाधनों को प्रबंधित करने के लिए API प्रदान करता है। लागू नहीं किया गया है। इस क्लास की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस कभी भी स्टैक पर या operator new का उपयोग करके न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन फॉल्ट्स हो सकते हैं। हमेशा इस क्लास को System::SmartPtr पॉइंटर में रैप करें और इस पॉइंटर का उपयोग करके इसे फ़ंक्शनों में तर्क के रूप में पास करें C++ में।"
type: docs
weight: 100
url: /hi/cpp/system.resources/resourcemanager/
---
## ResourceManager class


संसाधनों को प्रबंधित करने के लिए API प्रदान करता है। लागू नहीं किया गया है। इस क्लास की वस्तुओं को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस कभी भी स्टैक पर या operator new का उपयोग करके न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन फॉल्ट्स हो सकते हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में रैप करें और इस पॉइंटर का उपयोग करके इसे फ़ंक्शनों में तर्क के रूप में पास करें।

```cpp
class ResourceManager : public System::Object
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| virtual [GetObject__](./getobject__/)(String) | संसाधन से ऑब्जेक्ट प्राप्त करता है। नाम GetObject() नहीं है ताकि GetObjectA परिभाषा समस्या से निपटा जा सके। |
| virtual [GetObject__](./getobject__/)(String, SharedPtr\<System::Globalization::CultureInfo\>) | संसाधन से ऑब्जेक्ट प्राप्त करता है। नाम GetObject() नहीं है ताकि GetObjectA परिभाषा समस्या से निपटा जा सके। |
| virtual [GetString](./getstring/)(String) | स्ट्रिंग संसाधन प्राप्त करता है। |
| virtual [GetString](./getstring/)(String, SharedPtr\<System::Globalization::CultureInfo\>) | स्ट्रिंग संसाधन प्राप्त करता है। |
| [ResourceManager](./resourcemanager/)(const String\&, const SharedPtr\<Reflection::Assembly\>\&) | RTTI जानकारी। |
## संबंधित देखें

* Class [Object](../../system/object/)
* Namespace [System::Resources](../)
* Library [Aspose.Page for C++](../../)
