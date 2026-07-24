---
title: "System::Net::Http::Headers::RangeHeaderValue क्लास"
linktitle: "RangeHeaderValue"
second_title: "Aspose.Page C++ के लिए"
description: "System::Net::Http::Headers::RangeHeaderValue क्लास। ''Range'' हेडर का मान दर्शाता है। इस क्लास की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ होंगी। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें C++ में।"
type: docs
weight: 2000
url: /hi/cpp/system.net.http.headers/rangeheadervalue/
---
## RangeHeaderValue class


'Range' हेडर का मान दर्शाता है। इस क्लास की वस्तुओं को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ होंगी। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।

```cpp
class RangeHeaderValue : public System::ICloneable
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | वस्तुओं की तुलना C# [Object.Equals](../../system/object/equals/) सेमांटिक्स का उपयोग करके करता है। |
| [get_Ranges](./get_ranges/)() | रेंजों का संग्रह लौटाता है। |
| [get_Unit](./get_unit/)() | RTTI जानकारी। |
| [GetHashCode](./gethashcode/)() const override | C# के [Object.GetHashCode()](../../system/object/gethashcode/) मेथड का समानांतर। कस्टम ऑब्जेक्ट्स की हैशिंग को सक्षम करता है। |
| static [GetRangeLength](./getrangelength/)(String, int32_t, System::SharedPtr\<Object\>\&) | निर्दिष्ट इंडेक्स से पास की गई स्ट्रिंग को [RangeHeaderValue](./) क्लास के एक इंस्टेंस में परिवर्तित करता है। |
| static [Parse](./parse/)(String) | दिए गए स्ट्रिंग को [RangeHeaderValue](./) क्लास का एक उदाहरण में परिवर्तित करता है। |
| [RangeHeaderValue](./rangeheadervalue/)() | एक नया उदाहरण बनाता है। |
| [RangeHeaderValue](./rangeheadervalue/)(Nullable\<int64_t\>, Nullable\<int64_t\>) | एक नया उदाहरण बनाता है। |
| [set_Unit](./set_unit/)(String) | एक इकाई सेट करता है। |
| [ToString](./tostring/)() const override | C# के [Object.ToString()](../../system/object/tostring/) विधि का समानांतर। कस्टम वस्तुओं को स्ट्रिंग में परिवर्तित करने में सक्षम बनाता है। |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<RangeHeaderValue\>\&) | दिए गए स्ट्रिंग को [RangeHeaderValue](./) क्लास का एक उदाहरण में परिवर्तित करने का प्रयास करता है। |
## संबंधित देखें

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Page for C++](../../)
