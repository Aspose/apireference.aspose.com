---
title: "System::Collections::Generic::DefaultComparer क्लास"
linktitle: "DefaultComparer"
second_title: "Aspose.Page C++ के लिए"
description: "System::Collections::Generic::DefaultComparer क्लास। डिफ़ॉल्ट तुलना क्लास। मानों की तुलना के लिए operator < और operator == का उपयोग करता है। इस क्लास की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन फॉल्ट हो सकते हैं। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग C++ में फ़ंक्शन को आर्ग्यूमेंट के रूप में पास करने के लिए करें।"
type: docs
weight: 1000
url: /hi/cpp/system.collections.generic/defaultcomparer/
---
## DefaultComparer class


डिफ़ॉल्ट तुलना क्लास। मानों की तुलना के लिए operator < और operator == का उपयोग करता है। इस क्लास की वस्तुओं को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन फॉल्ट हो सकते हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शन को आर्ग्यूमेंट के रूप में पास करने के लिए करें।

```cpp
template<class T>class DefaultComparer : public System::Collections::Generic::IComparer<T>
```


| पैरामीटर | विवरण |
| --- | --- |
| T | तुलना किया जा रहा प्रकार। |
## विधियाँ

| विधि | विवरण |
| --- | --- |
| [Compare](./compare/)(typename ThisType::args_type, typename ThisType::args_type) const override | RTTI जानकारी। |
## Typedefs

| टाइपडिफ़ | विवरण |
| --- | --- |
| [BaseType](./basetype/) | इम्प्लीमेंट किया गया इंटरफ़ेस। |
| [ThisType](./thistype/) | वर्तमान प्रकार। |

## संबंधित देखें

* Class [IComparer](../icomparer/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
