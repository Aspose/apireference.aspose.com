---
title: "System::Net::Http::Headers::EntityTagHeaderValue class"
linktitle: "EntityTagHeaderValue"
second_title: "Aspose.Page C++ के लिए"
description: "System::Net::Http::Headers::EntityTagHeaderValue class. ''Entity-Tag'' हेडर का मान दर्शाता है। इस क्लास की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके आवंटित किया जाना चाहिए। इस प्रकार का उदाहरण स्टैक पर या operator new का उपयोग करके न बनाएँ, क्योंकि इससे रनटाइम त्रुटियां और/या असर्शन फॉल्ट हो सकते हैं। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें C++ में।"
type: docs
weight: 500
url: /hi/cpp/system.net.http.headers/entitytagheadervalue/
---
## EntityTagHeaderValue class


''Entity-Tag'' हेडर का मान दर्शाता है। इस क्लास की वस्तुओं को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके आवंटित किया जाना चाहिए। इस प्रकार का उदाहरण स्टैक पर या operator new का उपयोग करके न बनाएँ, क्योंकि इससे रनटाइम त्रुटियां और/या असर्शन फॉल्ट हो सकते हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।

```cpp
class EntityTagHeaderValue : public System::ICloneable
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [EntityTagHeaderValue](./entitytagheadervalue/)(String) | एक नया उदाहरण बनाता है। |
| [EntityTagHeaderValue](./entitytagheadervalue/)(String, bool) | एक नया उदाहरण बनाता है। |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | वस्तुओं की तुलना C# [Object.Equals](../../system/object/equals/) सेमांटिक्स का उपयोग करके करता है। |
| static [get_Any](./get_any/)() | ''ETag'' हेडर का मान प्राप्त करता है। |
| [get_IsWeak](./get_isweak/)() | वर्तमान उदाहरण एक कमजोर वैधकर्ता है या नहीं, यह दर्शाने वाला मान प्राप्त करता है। |
| [get_Tag](./get_tag/)() | RTTI जानकारी। |
| static [GetEntityTagLength](./getentitytaglength/)(String, int32_t, System::SharedPtr\<EntityTagHeaderValue\>\&) | एक पास की गई स्ट्रिंग को निर्दिष्ट इंडेक्स से लेकर [EntityTagHeaderValue](./) क्लास के एक उदाहरण में परिवर्तित करता है। |
| [GetHashCode](./gethashcode/)() const override | C# के [Object.GetHashCode()](../../system/object/gethashcode/) मेथड का समानांतर। कस्टम ऑब्जेक्ट्स की हैशिंग को सक्षम करता है। |
| static [Parse](./parse/)(String) | एक पास की गई स्ट्रिंग को [EntityTagHeaderValue](./) क्लास के एक उदाहरण में परिवर्तित करता है। |
| [ToString](./tostring/)() const override | C# के [Object.ToString()](../../system/object/tostring/) विधि का समानांतर। कस्टम वस्तुओं को स्ट्रिंग में परिवर्तित करने में सक्षम बनाता है। |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<EntityTagHeaderValue\>\&) | एक पास की गई स्ट्रिंग को [EntityTagHeaderValue](./) क्लास के एक उदाहरण में परिवर्तित करने का प्रयास करता है। |
## संबंधित देखें

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Page for C++](../../)
