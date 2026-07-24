---
title: "System::Collections::Generic::IComparer क्लास"
linktitle: "IComparer"
second_title: "Aspose.Page C++ के लिए"
description: "System::Collections::Generic::IComparer क्लास। दो वस्तुओं की तुलना बड़े-बराबर-छोटे (greater-equal-less) संदर्भ में करने वाला इंटरफ़ेस। इस क्लास की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन दोष उत्पन्न हो सकते हैं। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग करके इसे C++ में फ़ंक्शनों के तर्क के रूप में पास करें।"
type: docs
weight: 2000
url: /hi/cpp/system.collections.generic/icomparer/
---
## IComparer class


बड़े-बराबर-छोटे (greater-equal-less) संदर्भ में दो वस्तुओं की तुलना करने वाला इंटरफ़ेस। इस क्लास की वस्तुओं को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन दोष उत्पन्न हो सकते हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग करके इसे फ़ंक्शनों के तर्क के रूप में पास करें।

```cpp
template<typename T>class IComparer : public virtual System::Object
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| virtual [Compare](./compare/)(args_type, args_type) const | [Comparison](../../system/comparison/) फ़ंक्शन। |
## Typedefs

| टाइपडिफ़ | विवरण |
| --- | --- |
| [args_type](./args_type/) | RTTI जानकारी। |

## संबंधित देखें

* Class [Object](../../system/object/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
