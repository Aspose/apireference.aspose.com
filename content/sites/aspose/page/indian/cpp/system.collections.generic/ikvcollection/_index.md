---
title: "System::Collections::Generic::IKVCollection क्लास"
linktitle: "IKVCollection"
second_title: "Aspose.Page C++ के लिए"
description: "System::Collections::Generic::IKVCollection क्लास। डिक्शनरी-सम समान कंटेनर की कुंजियों या मानों को रखने वाले कंटेनर का इंटरफ़ेस। इस वर्ग की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का कोई उदाहरण स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ होंगी। हमेशा इस वर्ग को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग C++ में फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।"
type: docs
weight: 2500
url: /hi/cpp/system.collections.generic/ikvcollection/
---
## IKVCollection class


डिक्शनरी-सम समान कंटेनर की कुंजियों या मानों को रखने वाले कंटेनर का इंटरफ़ेस। इस वर्ग की वस्तुओं को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का कोई उदाहरण स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ होंगी। हमेशा इस वर्ग को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।

```cpp
template<typename T>class IKVCollection : public System::Collections::Generic::IList<T>
```


| पैरामीटर | विवरण |
| --- | --- |
| T | [KeyValuePair](../keyvaluepair/) प्रकार। |
## विधियाँ

| विधि | विवरण |
| --- | --- |
| [Add](./add/)(const T\&) override | कंटेनर में आइटम जोड़ता है। |
| [Clear](./clear/)() override | कंटेनर से सभी तत्वों को हटाता है। |
| [Contains](./contains/)(const T\&) const override | जाँचता है कि आइटम कंटेनर में मौजूद है या नहीं। |
| virtual [get_Count](./get_count/)() const | कंटेनर में तत्वों की संख्या प्राप्त करता है। |
| [get_IsReadOnly](./get_isreadonly/)() const override | जाँचता है कि कंटेनर केवल-पढ़ने योग्य है या नहीं। |
| virtual [GetEnumerator](./getenumerator/)() | RTTI जानकारी। |
| virtual [idx_get](./idx_get/)(int) const | गेटर फ़ंक्शन। |
| [idx_set](./idx_set/)(int, T) override | सेटर फ़ंक्शन। |
| [IndexOf](./indexof/)(const T\&) const override | कंटेनर में आइटम का सूचकांक प्राप्त करता है। |
| [Insert](./insert/)(int, const T\&) override | निर्दिष्ट स्थिति पर आइटम सम्मिलित करता है। |
| [Remove](./remove/)(const T\&) override | कंटेनर से आइटम हटाता है। |
| [RemoveAt](./removeat/)(int) override | निर्दिष्ट स्थिति पर आइटम हटाता है। |

## संबंधित देखें

* Class [IList](../ilist/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
