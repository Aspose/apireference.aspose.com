---
title: "System::Net::CookieCollection क्लास"
linktitle: "CookieCollection"
second_title: "Aspose.Page C++ के लिए"
description: "System::Net::CookieCollection क्लास। क्रमबद्ध कुकीज़ की सूची का प्रतिनिधित्व करता है। इस क्लास की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का उदाहरण स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ उत्पन्न होंगी। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग करके C++ में फ़ंक्शन को तर्क के रूप में पास करें।"
type: docs
weight: 200
url: /hi/cpp/system.net/cookiecollection/
---
## CookieCollection class


क्रमबद्ध कुकीज़ की सूची का प्रतिनिधित्व करता है। इस क्लास की वस्तुओं को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का उदाहरण स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ उत्पन्न होंगी। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग करके फ़ंक्शन को तर्क के रूप में पास करें।

```cpp
class CookieCollection : public System::Collections::Generic::ICollection<System::SharedPtr<System::Net::Cookie>>
```

## Enums

| एनम | विवरण |
| --- | --- |
| [Stamp](./stamp/) | RTTI जानकारी। |
## विधियाँ

| विधि | विवरण |
| --- | --- |
| [Add](./add/)(const System::SharedPtr\<Cookie\>\&) override | संग्रह में एक कुकी जोड़ता है। |
| [Add](./add/)(System::SharedPtr\<CookieCollection\>) | निर्दिष्ट संग्रह से कुकीज़ को वर्तमान संग्रह में जोड़ता है। |
| [Clear](./clear/)() override | संग्रह से सभी कुकीज़ को हटाता है। |
| [Contains](./contains/)(const System::SharedPtr\<Cookie\>\&) const override | जाँचता है कि संग्रह में निर्दिष्ट कुकी मौजूद है या नहीं। |
| [CookieCollection](./cookiecollection/)() | एक नया उदाहरण बनाता है। |
| [get_Count](./get_count/)() const override | संग्रह में तत्वों की संख्या प्राप्त करता है। |
| [get_IsOtherVersionSeen](./get_isotherversionseen/)() | एक मान लौटाता है जो दर्शाता है कि संग्रह में ऐसा कुकी है जिसका संस्करण [Cookie::MaxSupportedVersion](../cookie/maxsupportedversion/) के बराबर नहीं है। |
| [GetEnumerator](./getenumerator/)() override | एन्यूमरेटर प्राप्त करता है। |
| [idx_get](./idx_get/)(int32_t) | निर्दिष्ट अनुक्रमांक पर कुकी संग्रह से एक कुकी लौटाता है। |
| [idx_get](./idx_get/)(String) | निर्दिष्ट नाम द्वारा कुकी संग्रह से एक कुकी लौटाता है। |
| [IndexOf](./indexof/)(System::SharedPtr\<Cookie\>) | निर्दिष्ट कुकी का सूचकांक लौटाता है। |
| [InternalAdd](./internaladd/)(System::SharedPtr\<Cookie\>, bool) | निर्दिष्ट कुकी को संग्रह में जोड़ता है। |
| [Remove](./remove/)(const System::SharedPtr\<Cookie\>\&) override | निर्दिष्ट कुकी को संग्रह से हटाता है। |
| [RemoveAt](./removeat/)(int32_t) | निर्दिष्ट सूचकांक पर कुकी को हटाता है। |
| [TimeStamp](./timestamp/)(CookieCollection::Stamp) | निर्दिष्ट परिदृश्य के अनुसार टाइमस्टैम्प अपडेट करता है और नया मान लौटाता है। |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | वर्तमान कंटेनर के लिए begin const इटररेटर का कार्यान्वयन प्राप्त करता है। |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | वर्तमान कंटेनर के लिए begin इटररेटर का कार्यान्वयन प्राप्त करता है। |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | वर्तमान कंटेनर के लिए end const इटररेटर का कार्यान्वयन प्राप्त करता है। |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | वर्तमान कंटेनर के लिए end इटररेटर का कार्यान्वयन प्राप्त करता है। |
## संबंधित देखें

* Class [ICollection](../../system.collections.generic/icollection/)
* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)
