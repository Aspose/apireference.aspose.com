---
title: "System::Collections::Generic::_ValueList क्लास"
linktitle: "_ValueList"
second_title: "Aspose.Page C++ के लिए"
description: "System::Collections::Generic::_ValueList क्लास। शब्दकोश के मानों की सूची को लागू करता है। इस क्लास की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके आवंटित किया जाना चाहिए। इस प्रकार का उदाहरण कभी भी स्टैक पर या operator new का उपयोग करके न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन फॉल्ट्स हो सकते हैं। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग C++ में फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।"
type: docs
weight: 400
url: /hi/cpp/system.collections.generic/_valuelist/
---
## _ValueList class


शब्दकोश के मानों की सूची को लागू करता है। इस क्लास की वस्तुओं को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके आवंटित किया जाना चाहिए। इस प्रकार का उदाहरण कभी भी स्टैक पर या operator new का उपयोग करके न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन फॉल्ट्स हो सकते हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।

```cpp
template<typename Dict>class _ValueList : public System::Collections::Generic::_ValueCollection<Dict>
```


| पैरामीटर | विवरण |
| --- | --- |
| Dict | [Dictionary](../dictionary/) प्रकार। |
## विधियाँ

| विधि | विवरण |
| --- | --- |
| [_ValueList](./_valuelist/)(const typename Dict::Ptr\&) | निर्दिष्ट शब्दकोश को संदर्भित करने वाला संग्रह प्रारंभ करता है। |
| virtual [idx_get](./idx_get/)(int) const | निर्दिष्ट स्थिति पर मान प्राप्त करता है। |
## Typedefs

| टाइपडिफ़ | विवरण |
| --- | --- |
| [TValue](./tvalue/) | वैल्यू टाइप। |

## संबंधित देखें

* Class [_ValueCollection](../_valuecollection/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
