---
title: "System::Collections::Generic::IEqualityComparer क्लास"
linktitle: "IEqualityComparer"
second_title: "Aspose.Page C++ के लिए"
description: "System::Collections::Generic::IEqualityComparer क्लास। समानता के लिए दो वस्तुओं की तुलना करने का साधन प्रदान करने वाला इंटरफ़ेस। इस क्लास की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन दोष उत्पन्न हो सकते हैं। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग करके इसे C++ में फ़ंक्शनों के तर्क के रूप में पास करें।"
type: docs
weight: 2400
url: /hi/cpp/system.collections.generic/iequalitycomparer/
---
## IEqualityComparer class


समानता के लिए दो वस्तुओं की तुलना करने का साधन प्रदान करने वाला इंटरफ़ेस। इस क्लास की वस्तुओं को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन दोष उत्पन्न हो सकते हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग करके इसे फ़ंक्शनों के तर्क के रूप में पास करें।

```cpp
template<typename T>class IEqualityComparer : public virtual System::Object
```


| पैरामीटर | विवरण |
| --- | --- |
| T | तुलना किया जा रहा प्रकार। |
## विधियाँ

| विधि | विवरण |
| --- | --- |
| virtual [Equals](./equals/)(T, T) const | RTTI जानकारी। |
| virtual [GetHashCode](./gethashcode/)(T) const | किसी ऑब्जेक्ट के लिए हैश कोड प्राप्त करता है। |

## संबंधित देखें

* Class [Object](../../system/object/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
