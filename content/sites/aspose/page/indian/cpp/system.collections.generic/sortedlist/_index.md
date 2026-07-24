---
title: "System::Collections::Generic::SortedList क्लास"
linktitle: "SortedList"
second_title: "Aspose.Page C++ के लिए"
description: "System::Collections::Generic::SortedList क्लास। FlatMap संरचना को लपेटने वाली सॉर्टेड लिस्ट। इस क्लास की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का उदाहरण स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ हो सकती हैं। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग करके इसे C++ में फ़ंक्शनों के तर्क के रूप में पास करें।"
type: docs
weight: 4200
url: /hi/cpp/system.collections.generic/sortedlist/
---
## SortedList class


FlatMap संरचना को लपेटने वाली सॉर्टेड लिस्ट। इस क्लास की वस्तुओं को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का उदाहरण स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ हो सकती हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग करके इसे फ़ंक्शनों के तर्क के रूप में पास करें।

```cpp
template<typename TKey,typename TValue>class SortedList : public System::Collections::Generic::SortedListHelper<TKey, TValue>,
                                                          public System::Collections::Generic::BaseDictionary<Detail::FlatMap<TKey, TValue, ComparerAdapter<TKey>>>
```


| पैरामीटर | विवरण |
| --- | --- |
| TKey | कुंजी प्रकार। |
| TValue | वैल्यू टाइप। |
## Nested classes

* Class [Enumerator](./enumerator/)
## विधियाँ

| विधि | विवरण |
| --- | --- |
| [crbegin](./crbegin/)() const | संग्रह के अंतिम const-योग्य तत्व के लिए एक रिवर्स इटरेटर प्राप्त करता है (रिवर्स में पहला)। |
| [crend](./crend/)() const | संग्रह की शुरुआत से पहले एक गैर-मौजूद const-योग्य तत्व के लिए रिवर्स इटरेटर प्राप्त करता है। |
| [get_Capacity](./get_capacity/)() const | वर्तमान सूची क्षमता प्राप्त करता है। |
| virtual [get_Keys](./get_keys/)() const | कुंजी संग्रह तक पहुँचता है। |
| virtual [get_Values](./get_values/)() const | मूल्य संग्रह तक पहुँचता है। |
| [GetEnumerator](./getenumerator/)() override | वर्तमान सूची के माध्यम से इटररेट करने वाला एनेमरेटर प्राप्त करता है। |
| [IndexOfKey](./indexofkey/)(TKey) const | विशिष्ट कुंजी की तलाश करता है। |
| [IndexOfValue](./indexofvalue/)(TValue) const | विशिष्ट मान की तलाश करता है। |
| [rbegin](./rbegin/)() | कलेक्शन के अंतिम तत्व (रिवर्स में पहला) के लिए एक रिवर्स इटररेटर प्राप्त करता है। |
| [rbegin](./rbegin/)() const | कॉन्स्ट-योग्य कलेक्शन के अंतिम तत्व (रिवर्स में पहला) के लिए एक रिवर्स इटररेटर प्राप्त करता है। |
| [RemoveAt](./removeat/)(int) | निर्दिष्ट स्थिति पर आइटम हटाता है। |
| [rend](./rend/)() | कलेक्शन की शुरुआत से पहले एक गैर-मौजूद तत्व के लिए रिवर्स इटररेटर प्राप्त करता है। |
| [rend](./rend/)() const | कॉन्स्ट-योग्य कलेक्शन की शुरुआत से पहले एक गैर-मौजूद तत्व के लिए रिवर्स इटररेटर प्राप्त करता है। |
| [set_Capacity](./set_capacity/)(int) | वर्तमान सूची की क्षमता सेट करता है। |
| [SortedList](./sortedlist/)() | खाली सूची बनाता है। |
| [SortedList](./sortedlist/)(const SharedPtr\<IComparer\<TKey\>\>\&) | खाली सूची बनाता है। |
| [SortedList](./sortedlist/)(const SharedPtr\<IDictionary\<TKey, TValue\>\>\&) | कॉपी कंस्ट्रक्टर। |
| [SortedList](./sortedlist/)(const map_t\&) | कॉपी कंस्ट्रक्टर। |
| [SortedList](./sortedlist/)(int) | खाली सूची बनाता है। |
## Typedefs

| टाइपडिफ़ | विवरण |
| --- | --- |
| [const_iterator](./const_iterator/) | कॉन्स्ट इटररेटर प्रकार। |
| [const_reverse_iterator](./const_reverse_iterator/) | कॉन्स्ट रिवर्स इटररेटर प्रकार। |
| [IEnumerablePtr](./ienumerableptr/) | एक ही जोड़े प्रकार का संग्रह। |
| [IEnumeratorPtr](./ienumeratorptr/) | [Enumerator](./enumerator/) प्रकार। |
| [iterator](./iterator/) | इटररेटर प्रकार। |
| [KeyCollection](./keycollection/) | की संग्रह प्रकार। |
| [KVPair](./kvpair/) | कुंजी-मूल्य युग्म प्रकार। |
| [map_t](./map_t/) | अधोस्थ डेटा प्रकार। |
| [Ptr](./ptr/) | पॉइंटर प्रकार। |
| [reverse_iterator](./reverse_iterator/) | रिवर्स इटररेटर प्रकार। |
| [this_t](./this_t/) | यह प्रकार। |
| [ValueCollection](./valuecollection/) | वैल्यू संग्रह प्रकार। |

## संबंधित देखें

* Class [SortedListHelper](../sortedlisthelper/)
* Class [BaseDictionary](../basedictionary/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
