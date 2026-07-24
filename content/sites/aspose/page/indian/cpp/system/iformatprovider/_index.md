---
title: "System::IFormatProvider क्लास"
linktitle: "IFormatProvider"
second_title: "Aspose.Page C++ के लिए"
description: "System::IFormatProvider क्लास। यह एक मेथड परिभाषित करता है जो फ़ॉर्मेटिंग जानकारी प्रदान करता है। इस क्लास की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रन‑टाइम त्रुटियाँ और/या असर्शन त्रुटियाँ हो सकती हैं। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शन को आर्ग्यूमेंट के रूप में पास करने के लिए करें C++ में।"
type: docs
weight: 3800
url: /hi/cpp/system/iformatprovider/
---
## IFormatProvider class


फ़ॉर्मेटिंग जानकारी प्रदान करने वाला मेथड परिभाषित करता है। इस क्लास की वस्तुओं को केवल [System::MakeObject()](../makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रन‑टाइम त्रुटियाँ और/या असर्शन त्रुटियाँ हो सकती हैं। हमेशा इस क्लास को [System::SmartPtr](../smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शन को आर्ग्यूमेंट के रूप में पास करने के लिए करें।

```cpp
class IFormatProvider : public virtual System::Object
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| virtual [GetFormat](./getformat/)(const TypeInfo\&) | निर्दिष्ट प्रकार के लिए फ़ॉर्मेटिंग सेवाएँ प्रदान करने वाला ऑब्जेक्ट लौटाता है। |
## संबंधित देखें

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
