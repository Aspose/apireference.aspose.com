---
title: "System::Net::Http::Headers::ContentRangeHeaderValue class"
linktitle: "ContentRangeHeaderValue"
second_title: "Aspose.Page C++ के लिए"
description: "System::Net::Http::Headers::ContentRangeHeaderValue class. ''Content-Range'' हेडर का मान दर्शाता है। इस क्लास की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ हो सकती हैं। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शन को तर्क के रूप में पास करने के लिए करें।"
type: docs
weight: 400
url: /hi/cpp/system.net.http.headers/contentrangeheadervalue/
---
## ContentRangeHeaderValue class


'Content-Range' हेडर का मान दर्शाता है। इस क्लास की वस्तुओं को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ हो सकती हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शन को तर्क के रूप में पास करने के लिए करें।

```cpp
class ContentRangeHeaderValue : public System::ICloneable
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [ContentRangeHeaderValue](./contentrangeheadervalue/)(int64_t, int64_t, int64_t) | एक नया उदाहरण बनाता है। |
| [ContentRangeHeaderValue](./contentrangeheadervalue/)(int64_t) | एक नया उदाहरण बनाता है। |
| [ContentRangeHeaderValue](./contentrangeheadervalue/)(int64_t, int64_t) | एक नया उदाहरण बनाता है। |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | वस्तुओं की तुलना C# [Object.Equals](../../system/object/equals/) सेमांटिक्स का उपयोग करके करता है। |
| [get_From](./get_from/)() | डेटा भेजना कब शुरू होना चाहिए, इसका स्थान प्राप्त करता है। |
| [get_HasLength](./get_haslength/)() const | वर्तमान हेडर के लिए लंबाई निर्दिष्ट है या नहीं, यह दर्शाने वाला मान प्राप्त करता है। |
| [get_HasRange](./get_hasrange/)() const | वर्तमान हेडर के लिए रेंज निर्दिष्ट है या नहीं, यह दर्शाने वाला मान प्राप्त करता है। |
| [get_Length](./get_length/)() | एक एंटिटी बॉडी की लंबाई प्राप्त करता है। |
| [get_To](./get_to/)() | डेटा भेजना जहाँ रोकना आवश्यक है, उस स्थिति को प्राप्त करता है। |
| [get_Unit](./get_unit/)() | RTTI जानकारी। |
| static [GetContentRangeLength](./getcontentrangelength/)(String, int32_t, System::SharedPtr\<Object\>\&) | एक पास की गई स्ट्रिंग को निर्दिष्ट स्थिति से लेकर [ContentRangeHeaderValue](./) क्लास के एक उदाहरण में परिवर्तित करता है। |
| [GetHashCode](./gethashcode/)() const override | C# के [Object.GetHashCode()](../../system/object/gethashcode/) मेथड का समानांतर। कस्टम ऑब्जेक्ट्स की हैशिंग को सक्षम करता है। |
| static [Parse](./parse/)(String) | एक पास की गई स्ट्रिंग को [ContentRangeHeaderValue](./) क्लास के एक उदाहरण में परिवर्तित करता है। |
| [set_Unit](./set_unit/)(String) | रेंज में उपयोग किए जाने वाले इकाइयों को सेट करता है। |
| [ToString](./tostring/)() const override | C# के [Object.ToString()](../../system/object/tostring/) विधि का समानांतर। कस्टम वस्तुओं को स्ट्रिंग में परिवर्तित करने में सक्षम बनाता है। |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<ContentRangeHeaderValue\>\&) | एक पास की गई स्ट्रिंग को [ContentRangeHeaderValue](./) क्लास के एक उदाहरण में परिवर्तित करने का प्रयास करता है। |
## संबंधित देखें

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Page for C++](../../)
