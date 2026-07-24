---
title: "System::Net::Http::Headers::StringWithQualityHeaderValue class"
linktitle: "StringWithQualityHeaderValue"
second_title: "Aspose.Page C++ के लिए"
description: "System::Net::Http::Headers::StringWithQualityHeaderValue क्लास। स्ट्रिंग हेडर के अतिरिक्त गुणवत्ता के साथ एक मान का प्रतिनिधित्व करता है। इस क्लास की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का उदाहरण स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ हो सकती हैं। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।"
type: docs
weight: 2300
url: /hi/cpp/system.net.http.headers/stringwithqualityheadervalue/
---
## StringWithQualityHeaderValue class


एक स्ट्रिंग हेडर की अतिरिक्त गुणवत्ता के साथ मान का प्रतिनिधित्व करता है। इस क्लास की वस्तुओं को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन फॉल्ट हो सकते हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों में तर्क के रूप में पास करने के लिए करें।

```cpp
class StringWithQualityHeaderValue : public System::ICloneable
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | वस्तुओं की तुलना C# [Object.Equals](../../system/object/equals/) सेमांटिक्स का उपयोग करके करता है। |
| [get_Quality](./get_quality/)() | एक गुणवत्ता लौटाता है। |
| [get_Value](./get_value/)() | RTTI जानकारी। |
| [GetHashCode](./gethashcode/)() const override | C# के [Object.GetHashCode()](../../system/object/gethashcode/) मेथड का समानांतर। कस्टम ऑब्जेक्ट्स की हैशिंग को सक्षम करता है। |
| static [GetStringWithQualityLength](./getstringwithqualitylength/)(String, int32_t, System::SharedPtr\<Object\>\&) | निर्दिष्ट इंडेक्स से पास किए गए स्ट्रिंग को [StringWithQualityHeaderValue](./) क्लास के एक इंस्टेंस में परिवर्तित करता है। |
| static [Parse](./parse/)(String) | पास किए गए स्ट्रिंग को [StringWithQualityHeaderValue](./) क्लास के एक इंस्टेंस में परिवर्तित करता है। |
| [StringWithQualityHeaderValue](./stringwithqualityheadervalue/)(String) | एक नया उदाहरण बनाता है। |
| [StringWithQualityHeaderValue](./stringwithqualityheadervalue/)(String, double) | एक नया उदाहरण बनाता है। |
| [ToString](./tostring/)() const override | C# के [Object.ToString()](../../system/object/tostring/) विधि का समानांतर। कस्टम वस्तुओं को स्ट्रिंग में परिवर्तित करने में सक्षम बनाता है। |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<StringWithQualityHeaderValue\>\&) | पास किए गए स्ट्रिंग को [StringWithQualityHeaderValue](./) क्लास के एक इंस्टेंस में परिवर्तित करने का प्रयास करता है। |
## संबंधित देखें

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Page for C++](../../)
