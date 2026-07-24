---
title: "System::Net::Http::Headers::ViaHeaderValue क्लास"
linktitle: "ViaHeaderValue"
second_title: "Aspose.Page C++ के लिए"
description: "System::Net::Http::Headers::ViaHeaderValue क्लास। ''Via'' हेडर का मान दर्शाता है। इस क्लास की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ उत्पन्न होंगी। हमेशा इस क्लास को System::SmartPtr पॉइंटर में रैप करें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें C++ में।"
type: docs
weight: 2600
url: /hi/cpp/system.net.http.headers/viaheadervalue/
---
## ViaHeaderValue class


'Via' हेडर का मान दर्शाता है। इस क्लास की वस्तुओं को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ उत्पन्न होंगी। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में रैप करें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।

```cpp
class ViaHeaderValue : public System::ICloneable
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | वस्तुओं की तुलना C# [Object.Equals](../../system/object/equals/) सेमांटिक्स का उपयोग करके करता है। |
| [get_Comment](./get_comment/)() | 'Via' हेडर मान से टिप्पणी लौटाता है। |
| [get_ProtocolName](./get_protocolname/)() | RTTI जानकारी। |
| [get_ProtocolVersion](./get_protocolversion/)() | 'Via' हेडर मान से प्रोटोकॉल संस्करण लौटाता है। |
| [get_ReceivedBy](./get_receivedby/)() | अनुरोध या प्रतिक्रिया द्वारा प्राप्त होस्ट और पोर्ट लौटाता है। |
| [GetHashCode](./gethashcode/)() const override | C# के [Object.GetHashCode()](../../system/object/gethashcode/) मेथड का समानांतर। कस्टम ऑब्जेक्ट्स की हैशिंग को सक्षम करता है। |
| static [GetViaLength](./getvialength/)(String, int32_t, System::SharedPtr\<Object\>\&) | निर्दिष्ट इंडेक्स से पास की गई स्ट्रिंग को [ViaHeaderValue](./) क्लास के एक इंस्टेंस में परिवर्तित करता है। |
| static [Parse](./parse/)(String) | पास की गई स्ट्रिंग को [ViaHeaderValue](./) क्लास के एक इंस्टेंस में परिवर्तित करता है। |
| [ToString](./tostring/)() const override | C# के [Object.ToString()](../../system/object/tostring/) विधि का समानांतर। कस्टम वस्तुओं को स्ट्रिंग में परिवर्तित करने में सक्षम बनाता है। |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<ViaHeaderValue\>\&) | पास की गई स्ट्रिंग को [ViaHeaderValue](./) क्लास के एक इंस्टेंस में परिवर्तित करने का प्रयास करता है। |
| [ViaHeaderValue](./viaheadervalue/)(String, String) | एक नया उदाहरण बनाता है। |
| [ViaHeaderValue](./viaheadervalue/)(String, String, String) | एक नया उदाहरण बनाता है। |
| [ViaHeaderValue](./viaheadervalue/)(String, String, String, String) | एक नया उदाहरण बनाता है। |
## संबंधित देखें

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Page for C++](../../)
