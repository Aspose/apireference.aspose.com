---
title: "System::Net::Http::Headers::NameValueHeaderValue क्लास"
linktitle: "NameValueHeaderValue"
second_title: "Aspose.Page C++ के लिए"
description: "System::Net::Http::Headers::NameValueHeaderValue क्लास। हेडर में उपयोग के लिए एक कुंजी/मान जोड़ी दर्शाता है। इस क्लास की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का उदाहरण स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ हो सकती हैं। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।"
type: docs
weight: 1400
url: /hi/cpp/system.net.http.headers/namevalueheadervalue/
---
## NameValueHeaderValue class


हेडर में उपयोग के लिए एक कुंजी/मान जोड़ी दर्शाता है। इस क्लास की वस्तुओं को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का उदाहरण स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ हो सकती हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।

```cpp
class NameValueHeaderValue : public virtual System::ICloneable
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | वस्तुओं की तुलना C# [Object.Equals](../../system/object/equals/) सेमांटिक्स का उपयोग करके करता है। |
| static [Find](./find/)(System::SharedPtr\<ObjectCollection\<System::SharedPtr\<NameValueHeaderValue\>\>\>, String) | निर्दिष्ट नाम द्वारा संग्रह में NameValueHeaderValue-क्लास का उदाहरण खोजता है। |
| [get_Name](./get_name/)() | वर्तमान उदाहरण का नाम लौटाता है। |
| [get_Value](./get_value/)() | वर्तमान उदाहरण का मान प्राप्त करता है। |
| [GetHashCode](./gethashcode/)() const override | C# के [Object.GetHashCode()](../../system/object/gethashcode/) मेथड का समानांतर। कस्टम ऑब्जेक्ट्स की हैशिंग को सक्षम करता है। |
| static [GetHashCode](./gethashcode/)(System::SharedPtr\<ObjectCollection\<System::SharedPtr\<NameValueHeaderValue\>\>\>) | सभी संग्रह आइटम्स का हैश कोड लौटाता है। |
| static [GetNameValueLength](./getnamevaluelength/)(String, int32_t, System::SharedPtr\<NameValueHeaderValue\>\&) | निर्दिष्ट इंडेक्स से पास की गई स्ट्रिंग को [NameValueHeaderValue](./) क्लास की एक इंस्टेंस में परिवर्तित करता है। |
| static [GetNameValueLength](./getnamevaluelength/)(String, int32_t, HeaderFunc\<System::SharedPtr\<NameValueHeaderValue\>\>, System::SharedPtr\<NameValueHeaderValue\>\&) | निर्दिष्ट इंडेक्स से पास की गई स्ट्रिंग को [NameValueHeaderValue](./) क्लास की एक इंस्टेंस में परिवर्तित करता है। |
| static [GetNameValueListLength](./getnamevaluelistlength/)(String, int32_t, char16_t, System::SharedPtr\<ObjectCollection\<System::SharedPtr\<NameValueHeaderValue\>\>\>) | निर्दिष्ट इंडेक्स से पास की गई स्ट्रिंग को NameValueHeaderValue-क्लास की इंस्टेंसों के संग्रह में परिवर्तित करता है और पार्स किए गए उपस्ट्रिंग की लंबाई लौटाता है। |
| static [GetValueLength](./getvaluelength/)(String, int32_t) | निर्दिष्ट इंडेक्स से मान की लंबाई लौटाता है। |
| [NameValueHeaderValue](./namevalueheadervalue/)() | एक नया उदाहरण बनाता है। |
| [NameValueHeaderValue](./namevalueheadervalue/)(String) | एक नया उदाहरण बनाता है। |
| [NameValueHeaderValue](./namevalueheadervalue/)(String, String) | एक नया उदाहरण बनाता है। |
| static [Parse](./parse/)(String) | पास की गई स्ट्रिंग को [NameValueHeaderValue](./) क्लास की एक इंस्टेंस में परिवर्तित करता है। |
| [set_Value](./set_value/)(String) | वर्तमान इंस्टेंस का मान सेट करता है। |
| [ToString](./tostring/)() const override | C# के [Object.ToString()](../../system/object/tostring/) विधि का समानांतर। कस्टम वस्तुओं को स्ट्रिंग में परिवर्तित करने में सक्षम बनाता है। |
| static [ToString](./tostring/)(System::SharedPtr\<ObjectCollection\<System::SharedPtr\<NameValueHeaderValue\>\>\>, char16_t, bool, System::SharedPtr\<Text::StringBuilder\>) | NameValueHeaderValue-क्लास की इंस्टेंसों के संग्रह का स्ट्रिंग प्रतिनिधित्व लौटाता है। |
| static [ToString](./tostring/)(System::SharedPtr\<ObjectCollection\<System::SharedPtr\<NameValueHeaderValue\>\>\>, char16_t, bool) | NameValueHeaderValue-क्लास की इंस्टेंसों के संग्रह का स्ट्रिंग प्रतिनिधित्व लौटाता है। |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<NameValueHeaderValue\>\&) | पास की गई स्ट्रिंग को [NameValueHeaderValue](./) क्लास की एक इंस्टेंस में परिवर्तित करने का प्रयास करता है। |
## संबंधित देखें

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Page for C++](../../)
