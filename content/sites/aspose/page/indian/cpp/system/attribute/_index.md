---
title: "System::Attribute क्लास"
linktitle: "Attribute"
second_title: "Aspose.Page C++ के लिए"
description: "System::Attribute क्लास। कस्टम एट्रिब्यूट्स के लिए एक बेस क्लास। इस क्लास की ऑब्जेक्ट्स को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस कभी भी स्टैक पर या operator new का उपयोग करके न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन फॉल्ट्स हो सकते हैं। हमेशा इस क्लास को System::SmartPtr पॉइंटर में रैप करें और इस पॉइंटर का उपयोग करके इसे फ़ंक्शन्स में आर्ग्यूमेंट के रूप में पास करें।"
type: docs
weight: 400
url: /hi/cpp/system/attribute/
---
## Attribute class


कस्टम एट्रिब्यूट्स के लिए एक बेस क्लास। इस क्लास की ऑब्जेक्ट्स को केवल [System::MakeObject()](../makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस कभी भी स्टैक पर या operator new का उपयोग करके न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन फॉल्ट्स हो सकते हैं। हमेशा इस क्लास को [System::SmartPtr](../smartptr/) पॉइंटर में रैप करें और इस पॉइंटर का उपयोग करके इसे फ़ंक्शन्स में आर्ग्यूमेंट के रूप में पास करें।

```cpp
class Attribute : public System::Object
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| static [GetCustomAttribute](./getcustomattribute/)(const TypeInfo\&, const TypeInfo\&) | निर्दिष्ट प्रकार पर लागू एक कस्टम एट्रिब्यूट को निर्दिष्ट प्रकार के रूप में लौटाता है। |
| static [GetCustomAttributes](./getcustomattributes/)(const TypeInfo\&) | निर्दिष्ट प्रकार पर लागू सभी कस्टम एट्रिब्यूट्स को लौटाता है। |
## संबंधित देखें

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
