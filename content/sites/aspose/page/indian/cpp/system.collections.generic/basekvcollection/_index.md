---
title: "System::Collections::Generic::BaseKVCollection क्लास"
linktitle: "BaseKVCollection"
second_title: "Aspose.Page C++ के लिए"
description: "System::Collections::Generic::BaseKVCollection क्लास। कुंजियों या मानों के संग्रहों के लिए सामान्य कोड रखता है। इस क्लास की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस कभी भी स्टैक पर या operator new का उपयोग करके न बनाएं, क्योंकि इससे रनटाइम त्रुटियां और/या असर्शन त्रुटियां उत्पन्न हो सकती हैं। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग करके इसे फ़ंक्शनों को तर्क के रूप में पास करें C++ में।"
type: docs
weight: 700
url: /hi/cpp/system.collections.generic/basekvcollection/
---
## BaseKVCollection class


कुंजियों या मानों के संग्रहों के लिए सामान्य कोड रखता है। इस क्लास की वस्तुओं को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस कभी भी स्टैक पर या operator new का उपयोग करके न बनाएं, क्योंकि इससे रनटाइम त्रुटियां और/या असर्शन त्रुटियां उत्पन्न हो सकती हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग करके इसे फ़ंक्शनों को तर्क के रूप में पास करें।

```cpp
template<typename Dict,typename KV>class BaseKVCollection : public System::Collections::Generic::IKVCollection<KV>
```


| पैरामीटर | विवरण |
| --- | --- |
| Dict | [Dictionary](../dictionary/) प्रकार। |
| KV | कुंजी या मान प्रकार, जिस इंटरफ़ेस के लिए उपयोग किया जाता है। |
## विधियाँ

| विधि | विवरण |
| --- | --- |
| [BaseKVCollection](./basekvcollection/)(const typename Dict::Ptr\&) | संग्रह बनाता है। |
| [CopyTo](./copyto/)(ArrayPtr\<KV\>, int) override | डेटा को मौजूदा एरे तत्वों में कॉपी करता है। |
| [get_Count](./get_count/)() const override | तत्वों की संख्या प्राप्त करता है। |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | संकलन को सक्षम करता है, लेकिन वास्तव में कुछ नहीं करता क्योंकि यह संरचना डेटा का मालिक नहीं है। |

## संबंधित देखें

* Class [IKVCollection](../ikvcollection/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
