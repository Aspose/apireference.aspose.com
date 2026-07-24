---
title: "System::Collections::Generic::IDictionary क्लास"
linktitle: "IDictionary"
second_title: "Aspose.Page C++ के लिए"
description: "System::Collections::Generic::IDictionary क्लास। डिक्शनरी-सम समान कंटेनरों के लिए इंटरफ़ेस। इस क्लास की ऑब्जेक्ट्स को केवल System::MakeObject() फ़ंक्शन का उपयोग करके आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन फॉल्ट्स हो सकते हैं। हमेशा इस क्लास को System::SmartPtr पॉइंटर में रैप करें और इस पॉइंटर का उपयोग C++ में फ़ंक्शनों को आर्ग्यूमेंट के रूप में पास करने के लिए करें।"
type: docs
weight: 2100
url: /hi/cpp/system.collections.generic/idictionary/
---
## IDictionary class


डिक्शनरी-सम समान कंटेनरों के लिए इंटरफ़ेस। इस क्लास की ऑब्जेक्ट्स को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन फॉल्ट्स हो सकते हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में रैप करें और इस पॉइंटर का उपयोग फ़ंक्शनों को आर्ग्यूमेंट के रूप में पास करने के लिए करें।

```cpp
template<typename TKey,typename TValue>class IDictionary : public System::Collections::Generic::ICollection<KeyValuePair<TKey, TValue>>
```


| पैरामीटर | विवरण |
| --- | --- |
| TKey | कुंजी प्रकार। |
| TValue | वैल्यू टाइप। |
## विधियाँ

| विधि | विवरण |
| --- | --- |
| virtual [Add](./add/)(const TKey\&, const TValue\&) | कंटेनर में कुंजी-मूल्य जोड़ी जोड़ता है। |
| virtual [ContainsKey](./containskey/)(const TKey\&) const | जाँचता है कि कंटेनर में कुंजी मौजूद है या नहीं। |
| [CopyTo](./copyto/)(ArrayPtr\<KeyValuePair\<TKey, TValue\>\>, int) override | डिक्शनरी की सामग्री को मौजूदा एरे तत्वों में कॉपी करता है। |
| virtual [get_Count](./get_count/)() const | get_Count सदस्य फ़ंक्शन को अनहाइड करता है। |
| [get_IsFixedSize](./get_isfixedsize/)() const | जाँचता है कि संग्रह का आकार स्थिर है या नहीं। |
| [get_IsSynchronized](./get_issynchronized/)() const | जाँचता है कि कंटेनर थ्रेड-सेफ़ है या नहीं। |
| virtual [get_Keys](./get_keys/)() const | कुंजी संग्रह तक पहुँचता है। |
| virtual [get_Values](./get_values/)() const | मूल्य संग्रह तक पहुँचता है। |
| virtual [GetValueOrDefault](./getvalueordefault/)(const TKey\&) const | यदि पाया जाए तो मान लौटाता है; अन्यथा **Value()**। |
| virtual [GetValueOrDefault](./getvalueordefault/)(const TKey\&, const TValue\&) const | यदि पाया जाए तो मान लौटाता है; अन्यथा **defaultValue**। |
| virtual [GetValueOrNull](./getvalueornull/)(const TKey\&) const | यदि मिला तो मान लौटाता है; या **null** अन्यथा, केवल संदर्भ प्रकारों के लिए अर्थपूर्ण होता है। |
| virtual [idx_get](./idx_get/)(const TKey\&) const | गेटर फ़ंक्शन। |
| virtual [idx_set](./idx_set/)(const TKey\&, TValue) | सेटर फ़ंक्शन। |
| virtual [Remove](./remove/)(const TKey\&) | कुंजी को कंटेनर से हटाता है। |
| virtual [TryGetValue](./trygetvalue/)(const TKey\&, TValue\&) const | मान की खोज करता है और यदि मिला तो उसे पुनः प्राप्त करता है। |
## Typedefs

| टाइपडिफ़ | विवरण |
| --- | --- |
| [BaseType](./basetype/) | RTTI जानकारी। |
| [KeyValuePairType](./keyvaluepairtype/) | कुंजी-मूल्य युग्म प्रकार। |

## संबंधित देखें

* Class [ICollection](../icollection/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
