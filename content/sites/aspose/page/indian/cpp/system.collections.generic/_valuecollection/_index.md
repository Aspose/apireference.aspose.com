---
title: "System::Collections::Generic::_ValueCollection क्लास"
linktitle: "_ValueCollection"
second_title: "Aspose.Page C++ के लिए"
description: "System::Collections::Generic::_ValueCollection क्लास। Dictionary के मानों का संग्रह। संग्रह को संदर्भित करता है, कोई कॉपी नहीं बनाता। इस क्लास की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि यह रनटाइम त्रुटियों और/या असर्शन फॉल्ट्स का कारण बन सकता है। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को आर्ग्यूमेंट के रूप में पास करने के लिए करें।"
type: docs
weight: 300
url: /hi/cpp/system.collections.generic/_valuecollection/
---
## _ValueCollection class


Dictionary के मानों का संग्रह। संग्रह को संदर्भित करता है, कोई कॉपी नहीं बनाता। इस क्लास की वस्तुओं को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि यह रनटाइम त्रुटियों और/या असर्शन फॉल्ट्स का कारण बन सकता है। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को आर्ग्यूमेंट के रूप में पास करने के लिए करें।

```cpp
template<typename Dict>class _ValueCollection : public System::Collections::Generic::BaseKVCollection<Dict, Dict::map_t::mapped_type>
```

## Nested classes

* Class [Enumerator](./enumerator/)
## विधियाँ

| विधि | विवरण |
| --- | --- |
| [_ValueCollection](./_valuecollection/)(const typename Dict::Ptr\&) | निर्दिष्ट शब्दकोश को संदर्भित करने वाला संग्रह प्रारंभ करता है। |
| [Contains](./contains/)(const TValue\&) const override | जाँचता है कि आइटम कंटेनर में मौजूद है या नहीं। |
| [GetEnumerator](./getenumerator/)() override | मानों के माध्यम से इटररेट करने वाला एनोमरेटर प्राप्त करता है। |
| [idx_get](./idx_get/)(int) const override | [IList](../ilist/) मेथड को लागू करता है। समर्थित नहीं है। |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | वर्तमान कंटेनर के लिए begin const इटररेटर का कार्यान्वयन प्राप्त करता है। |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | वर्तमान कंटेनर के लिए begin इटररेटर का कार्यान्वयन प्राप्त करता है। |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | वर्तमान कंटेनर के लिए end const इटररेटर का कार्यान्वयन प्राप्त करता है। |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | वर्तमान कंटेनर के लिए end इटररेटर का कार्यान्वयन प्राप्त करता है। |
## Typedefs

| टाइपडिफ़ | विवरण |
| --- | --- |
| [TValue](./tvalue/) | वैल्यू टाइप। |

## संबंधित देखें

* Class [BaseKVCollection](../basekvcollection/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
