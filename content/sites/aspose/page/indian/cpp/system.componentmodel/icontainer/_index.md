---
title: "System::ComponentModel::IContainer क्लास"
linktitle: "IContainer"
second_title: "Aspose.Page C++ के लिए"
description: "System::ComponentModel::IContainer क्लास। IContainer-उपयोग करने वाले कोड को संकलित करने के लिए डमी इंटरफ़ेस। इस क्लास की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ हो सकती हैं। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।"
type: docs
weight: 900
url: /hi/cpp/system.componentmodel/icontainer/
---
## IContainer class


IContainer-उपयोग करने वाले कोड को संकलित करने के लिए डमी इंटरफ़ेस। इस क्लास की वस्तुओं को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ हो सकती हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।

```cpp
class IContainer : public virtual System::Object
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| virtual [Add](./add/)(System::SharedPtr\<IComponent\>) | RTTI जानकारी। |
## संबंधित देखें

* Class [Object](../../system/object/)
* Namespace [System::ComponentModel](../)
* Library [Aspose.Page for C++](../../)
