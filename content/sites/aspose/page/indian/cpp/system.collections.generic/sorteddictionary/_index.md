---
title: "System::Collections::Generic::SortedDictionary वर्ग"
linktitle: "SortedDictionary"
second_title: "Aspose.Page C++ के लिए"
description: "System::Collections::Generic::SortedDictionary वर्ग। C++ में सॉर्टेड डिक्शनरी प्रकार की अग्र घोषणा।"
type: docs
weight: 4000
url: /hi/cpp/system.collections.generic/sorteddictionary/
---
## SortedDictionary class


सॉर्टेड डिक्शनरी प्रकार अग्र घोषणा।

```cpp
template<typename TKey,typename TValue>class SortedDictionary : public System::Collections::Generic::BaseDictionary<std::map<TKey, TValue, ComparerAdapter<BasePointerType<TKey>::type>, ASPOSE_MAP_ALLOCATOR_TYPE(TKey, TValue)>>
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
| [get_Comparer](./get_comparer/)() const | SortedDictionary<TKey,TValue> के तत्वों को क्रमबद्ध करने के लिए उपयोग किए जाने वाले [IComparer<TKey>](../icomparer/) को प्राप्त करता है। |
| static [GetDefaultKeyComparer](./getdefaultkeycomparer/)() | सिंगलटन एक्सेसर फ़ंक्शन। |
| [GetEnumerator](./getenumerator/)() override | वर्तमान डिक्शनरी के माध्यम से इटररेट करने के लिए एन्यूमरेटर प्राप्त करता है। |
| [rbegin](./rbegin/)() | कलेक्शन के अंतिम तत्व (रिवर्स में पहला) के लिए एक रिवर्स इटररेटर प्राप्त करता है। |
| [rbegin](./rbegin/)() const | कॉन्स्ट-योग्य कलेक्शन के अंतिम तत्व (रिवर्स में पहला) के लिए एक रिवर्स इटररेटर प्राप्त करता है। |
| [rend](./rend/)() | कलेक्शन की शुरुआत से पहले एक गैर-मौजूद तत्व के लिए रिवर्स इटररेटर प्राप्त करता है। |
| [rend](./rend/)() const | कॉन्स्ट-योग्य कलेक्शन की शुरुआत से पहले एक गैर-मौजूद तत्व के लिए रिवर्स इटररेटर प्राप्त करता है। |
| [SortedDictionary](./sorteddictionary/)() | खाली डिक्शनरी बनाता है। |
| [SortedDictionary](./sorteddictionary/)(const SharedPtr\<IComparer\<typename BasePointerType\<TKey\>::type\>\>\&) | खाली डिक्शनरी बनाता है। |
| [SortedDictionary](./sorteddictionary/)(const SharedPtr\<IDictionary\<TKey, TValue\>\>\&) | कॉपी कंस्ट्रक्टर। |
| [SortedDictionary](./sorteddictionary/)(const SharedPtr\<IDictionary\<TKey, TValue\>\>\&, const SharedPtr\<IComparer\<typename BasePointerType\<TKey\>::type\>\>\&) | कॉपी कंस्ट्रक्टर। |
## Typedefs

| टाइपडिफ़ | विवरण |
| --- | --- |
| [const_iterator](./const_iterator/) | कॉन्स्ट इटररेटर प्रकार। |
| [const_reverse_iterator](./const_reverse_iterator/) | कॉन्स्ट रिवर्स इटररेटर प्रकार। |
| [IEnumerablePtr](./ienumerableptr/) | समान तत्वों का संग्रह। |
| [IEnumeratorPtr](./ienumeratorptr/) | [Enumerator](./enumerator/) प्रकार। |
| [iterator](./iterator/) | इटररेटर प्रकार। |
| [KeyCollection](./keycollection/) | की संग्रह प्रकार। |
| [KVPair](./kvpair/) | की-वैल्यू जोड़ी प्रकार। |
| [map_t](./map_t/) | अधोस्थ डेटा प्रकार। |
| [Ptr](./ptr/) | पॉइंटर प्रकार। |
| [reverse_iterator](./reverse_iterator/) | रिवर्स इटररेटर प्रकार। |
| [this_t](./this_t/) | स्व प्रकार। |
| [ValueCollection](./valuecollection/) | वैल्यू संग्रह प्रकार। |
## टिप्पणियाँ


STL map को लपेटने वाली सॉर्टेड डिक्शनरी वर्ग। इस वर्ग की वस्तुओं को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का उदाहरण कभी भी स्टैक पर या operator new का उपयोग करके न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ उत्पन्न होंगी। हमेशा इस वर्ग को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।

## संबंधित देखें

* Class [BaseDictionary](../basedictionary/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
