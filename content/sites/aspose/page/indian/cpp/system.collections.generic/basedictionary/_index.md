---
title: "System::Collections::Generic::BaseDictionary क्लास"
linktitle: "BaseDictionary"
second_title: "Aspose.Page C++ के लिए"
description: "System::Collections::Generic::BaseDictionary क्लास। विभिन्न शब्दकोश-सम समान डेटा संरचनाओं (जैसे Dictionary, SortedDictionary) के लिए सामान्य कोड लागू करता है। इसे सीधे उपयोग नहीं करना चाहिए, केवल कंटेनर परिभाषित करते समय विरासत के लिए। इस क्लास की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएं, क्योंकि इससे रनटाइम त्रुटियां और/या असर्शन त्रुटियां उत्पन्न हो सकती हैं। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को आर्ग्यूमेंट के रूप में पास करने के लिए करें C++ में।"
type: docs
weight: 500
url: /hi/cpp/system.collections.generic/basedictionary/
---
## BaseDictionary class


विभिन्न शब्दकोश-सम समान डेटा संरचनाओं (जैसे [Dictionary](../dictionary/), [SortedDictionary](../sorteddictionary/)) के लिए सामान्य कोड लागू करता है। इसे सीधे उपयोग नहीं करना चाहिए, केवल कंटेनर परिभाषित करते समय विरासत के लिए। इस क्लास की वस्तुओं को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएं, क्योंकि इससे रनटाइम त्रुटियां और/या असर्शन त्रुटियां उत्पन्न हो सकती हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को आर्ग्यूमेंट के रूप में पास करने के लिए करें।

```cpp
template<typename Map>class BaseDictionary : public System::Collections::Generic::IDictionary<Map::key_type, Map::mapped_type>
```


| पैरामीटर | विवरण |
| --- | --- |
| Map | आधारभूत मैप प्रकार। |
## विधियाँ

| विधि | विवरण |
| --- | --- |
| [_add_range](./_add_range/)(std::initializer_list\<typename Map::value_type\>) | C++ विशिष्ट। |
| [Add](./add/)(const key_t\&, const mapped_t\&) override | डिक्शनरी में कुंजी-मूल्य जोड़ी जोड़ता है। |
| [BaseDictionary](./basedictionary/)() | खाली डेटा संरचना बनाता है। |
| [BaseDictionary](./basedictionary/)(int, const Args\&...) | आधारभूत मैप कंस्ट्रक्टर में तर्कों को पुश करने के लिए फ़ॉरवर्डिंग कंस्ट्रक्टर। |
| [BaseDictionary](./basedictionary/)(BaseType *, const Args\&...) | कॉपी कंस्ट्रक्टर। |
| [BaseDictionary](./basedictionary/)(BaseType *) | कॉपी कंस्ट्रक्टर। |
| [begin](./begin/)() const | कंटेनर के कुंजी-मूल्य-तत्व के लिए KVPair-रैपर पर एक इटररेटर लौटाता है। C# शैली में लागू किया गया - इटररेटर को KVPair-ऑब्जेक्ट को get_Key() और get_Value() इंटरफ़ेस के साथ लौटाना चाहिए। यदि कंटेनर खाली है, तो लौटाया गया इटररेटर [end()](../ienumerable/end/) के बराबर होगा। |
| [cbegin](./cbegin/)() const | कंटेनर के पहले तत्व पर एक इटररेटर लौटाता है। STL-शैली में लागू किया गया। यदि कंटेनर खाली है, तो लौटाया गया इटररेटर [end()](../ienumerable/end/) के बराबर होगा। |
| [cend](./cend/)() const | कंटेनर के अंतिम तत्व के बाद के तत्व पर एक इटररेटर लौटाता है। STL-शैली में लागू किया गया। यह तत्व एक प्लेसहोल्डर के रूप में कार्य करता है; इसे एक्सेस करने का प्रयास करने पर अपरिभाषित व्यवहार होता है। |
| [Clear](./clear/)() override | सभी तत्वों को हटाता है। |
| [ContainsKey](./containskey/)(const key_t\&) const override | जाँचता है कि कुंजी डिक्शनरी में मौजूद है या नहीं। |
| [ContainsValue](./containsvalue/)(const mapped_t\&) | जाँचता है कि मान डिक्शनरी में मौजूद है या नहीं। मानों की तुलना के लिए operator == का उपयोग करता है। |
| [data](./data/)() | आधारभूत डेटा स्टोरेज एक्सेसर। |
| [data](./data/)() const | आधारभूत डेटा स्टोरेज एक्सेसर। |
| [end](./end/)() const | कंटेनर के अंतिम तत्व के बाद आने वाले key-value-तत्व के KVPair-wrapper के लिए एक इटररेटर लौटाता है। C# शैली में लागू किया गया - इटररेटर को KVPair-ऑब्जेक्ट को get_Key() और get_Value() इंटरफ़ेस के साथ लौटाना चाहिए। यह तत्व एक प्लेसहोल्डर के रूप में कार्य करता है; इसे एक्सेस करने का प्रयास करने पर अपरिभाषित व्यवहार होता है। |
| [get_Count](./get_count/)() const override | तत्वों की गिनती प्राप्त करता है। |
| virtual [GetEnumerator](./getenumerator/)() | एन्यूमरेटर इंस्टेंस बनाता है, इसे सबक्लास द्वारा लागू किया जाना चाहिए। |
| [GetValueOrDefault](./getvalueordefault/)(const key_t\&) const override | यदि पाया जाए तो मान लौटाता है; अन्यथा **Value()**। |
| [GetValueOrDefault](./getvalueordefault/)(const key_t\&, const mapped_t\&) const override | यदि पाया जाए तो मान लौटाता है; अन्यथा **defaultValue**। |
| [GetValueOrNull](./getvalueornull/)(const key_t\&) const override | यदि मिला तो मान लौटाता है; अन्यथा **null**। केवल रेफ़रेंस प्रकारों के लिए ही अर्थपूर्ण है। |
| [idx_get](./idx_get/)(const key_t\&) const override | कीड गेटर फ़ंक्शन। |
| [idx_set](./idx_set/)(const key_t\&, mapped_t) override | कीड सेटर फ़ंक्शन। तत्व को बदलता या बनाता है। |
| virtual [operator[]](./operator[]/)(const key_t\&) | एक्सेसर फ़ंक्शन। |
| [Remove](./remove/)(const key_t\&) override | डिक्शनरी से विशिष्ट कुंजी को हटाता है। |
| [SetTemplateWeakPtr](./settemplateweakptr/)(unsigned int) override |  |
| [TryGetValue](./trygetvalue/)(const key_t\&, mapped_t\&) const override | कीड मान की खोज करता है और यदि मिला तो उसे पुनः प्राप्त करता है। |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | वर्तमान कंटेनर के लिए begin const इटररेटर का कार्यान्वयन प्राप्त करता है। |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | वर्तमान कंटेनर के लिए begin इटररेटर का कार्यान्वयन प्राप्त करता है। |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | वर्तमान कंटेनर के लिए end const इटररेटर का कार्यान्वयन प्राप्त करता है। |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | वर्तमान कंटेनर के लिए end इटररेटर का कार्यान्वयन प्राप्त करता है। |
## Typedefs

| टाइपडिफ़ | विवरण |
| --- | --- |
| [BaseType](./basetype/) | इम्प्लीमेंट किया गया इंटरफ़ेस। |
| [const_iterator](./const_iterator/) | कॉन्स्ट इटररेटर प्रकार। |
| [iterator](./iterator/) | इटररेटर प्रकार। |
| [KeyCollection](./keycollection/) | सुनिश्चित करें कि हम अंतर्निहित स्टोरेज प्रकार के साथ सही अलोकेटर का उपयोग करें। |
| [KVPair](./kvpair/) | की-वैल्यू जोड़ी प्रकार। |
| [map_t](./map_t/) | आंतरिक मैप प्रकार। |
| [ValueCollection](./valuecollection/) | मानों का संग्रह। |

## संबंधित देखें

* Class [IDictionary](../idictionary/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
