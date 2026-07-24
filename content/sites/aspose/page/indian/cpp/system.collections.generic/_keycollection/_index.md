---
title: "System::Collections::Generic::_KeyCollection क्लास"
linktitle: "_KeyCollection"
second_title: "Aspose.Page C++ के लिए"
description: "System::Collections::Generic::_KeyCollection क्लास। Dictionary की कुंजियों का संग्रह। यह संग्रह को संदर्भित करता है, कोई भी चीज़ कॉपी नहीं करता। इस क्लास की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन दोष उत्पन्न हो सकते हैं। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग करके इसे C++ में फ़ंक्शनों के तर्क के रूप में पास करें।"
type: docs
weight: 100
url: /hi/cpp/system.collections.generic/_keycollection/
---
## _KeyCollection class


[Dictionary](../dictionary/) की कुंजियों का संग्रह। यह संग्रह को संदर्भित करता है, कोई भी चीज़ कॉपी नहीं करता। इस क्लास की वस्तुओं को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन दोष उत्पन्न हो सकते हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग करके इसे फ़ंक्शनों के तर्क के रूप में पास करें।

```cpp
template<typename Dict>class _KeyCollection : public System::Collections::Generic::BaseKVCollection<Dict, Dict::map_t::key_type>
```

## Nested classes

* Class [Enumerator](./enumerator/)
## विधियाँ

| विधि | विवरण |
| --- | --- |
| [_KeyCollection](./_keycollection/)(const typename Dict::Ptr\&) | निर्दिष्ट शब्दकोश को संदर्भित करने वाला संग्रह प्रारंभ करता है। |
| [Contains](./contains/)(const TKey\&) const override | जाँचता है कि आइटम कंटेनर में मौजूद है या नहीं। |
| [GetEnumerator](./getenumerator/)() override | कुंजियों के माध्यम से इटररेट करने वाला एन्यूमरेटर प्राप्त करता है। |
| [idx_get](./idx_get/)(int) const override | [IList](../ilist/) मेथड को लागू करता है। समर्थित नहीं है। |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | वर्तमान कंटेनर के लिए begin const इटररेटर का कार्यान्वयन प्राप्त करता है। |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | वर्तमान कंटेनर के लिए begin इटररेटर का कार्यान्वयन प्राप्त करता है। |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | वर्तमान कंटेनर के लिए end const इटररेटर का कार्यान्वयन प्राप्त करता है। |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | वर्तमान कंटेनर के लिए end इटररेटर का कार्यान्वयन प्राप्त करता है। |
## Typedefs

| टाइपडिफ़ | विवरण |
| --- | --- |
| [TKey](./tkey/) | कुंजी प्रकार। |

## संबंधित देखें

* Class [BaseKVCollection](../basekvcollection/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
