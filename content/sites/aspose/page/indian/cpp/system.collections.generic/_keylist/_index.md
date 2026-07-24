---
title: "System::Collections::Generic::_KeyList क्लास"
linktitle: "_KeyList"
second_title: "Aspose.Page C++ के लिए"
description: "System::Collections::Generic::_KeyList क्लास। शब्दकोश की कुंजियों की सूची को लागू करता है। इस क्लास की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके आवंटित किया जाना चाहिए। इस प्रकार का उदाहरण कभी भी स्टैक पर या operator new का उपयोग करके न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन फॉल्ट्स हो सकते हैं। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग C++ में फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।"
type: docs
weight: 200
url: /hi/cpp/system.collections.generic/_keylist/
---
## _KeyList class


शब्दकोश की कुंजियों की सूची को लागू करता है। इस क्लास की वस्तुओं को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके आवंटित किया जाना चाहिए। इस प्रकार का उदाहरण कभी भी स्टैक पर या operator new का उपयोग करके न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन फॉल्ट्स हो सकते हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।

```cpp
template<typename Dict>class _KeyList : public System::Collections::Generic::_KeyCollection<Dict>
```


| पैरामीटर | विवरण |
| --- | --- |
| Dict | [Dictionary](../dictionary/) प्रकार। |
## विधियाँ

| विधि | विवरण |
| --- | --- |
| [_KeyList](./_keylist/)(const typename Dict::Ptr\&) | निर्दिष्ट शब्दकोश को संदर्भित करने वाला संग्रह प्रारंभ करता है। |
| [Contains](./contains/)(const TKey\&) const override | जाँचता है कि निर्दिष्ट कुंजी संग्रह में मौजूद है या नहीं। |
| [idx_get](./idx_get/)(int) const override | निर्दिष्ट स्थिति पर कुंजी प्राप्त करता है। |
## Typedefs

| टाइपडिफ़ | विवरण |
| --- | --- |
| [TKey](./tkey/) | कुंजी प्रकार। |

## संबंधित देखें

* Class [_KeyCollection](../_keycollection/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
