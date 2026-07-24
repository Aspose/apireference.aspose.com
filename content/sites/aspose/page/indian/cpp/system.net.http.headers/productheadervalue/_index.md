---
title: "System::Net::Http::Headers::ProductHeaderValue क्लास"
linktitle: "ProductHeaderValue"
second_title: "Aspose.Page C++ के लिए"
description: "System::Net::Http::Headers::ProductHeaderValue क्लास। ''User-Agent'' हेडर के मान में एक प्रोडक्ट टोकन का प्रतिनिधित्व करता है। इस क्लास की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन फॉल्ट हो सकते हैं। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों में तर्क के रूप में पास करने के लिए करें।"
type: docs
weight: 1700
url: /hi/cpp/system.net.http.headers/productheadervalue/
---
## ProductHeaderValue class


''User-Agent'' हेडर के मान में एक प्रोडक्ट टोकन का प्रतिनिधित्व करता है। इस क्लास की वस्तुओं को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन फॉल्ट हो सकते हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों में तर्क के रूप में पास करने के लिए करें।

```cpp
class ProductHeaderValue : public System::ICloneable
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | वस्तुओं की तुलना C# [Object.Equals](../../system/object/equals/) सेमांटिक्स का उपयोग करके करता है। |
| [get_Name](./get_name/)() | RTTI जानकारी। |
| [get_Version](./get_version/)() | प्रोडक्ट टोकन संस्करण लौटाता है। |
| [GetHashCode](./gethashcode/)() const override | C# के [Object.GetHashCode()](../../system/object/gethashcode/) मेथड का समानांतर। कस्टम ऑब्जेक्ट्स की हैशिंग को सक्षम करता है। |
| static [GetProductLength](./getproductlength/)(String, int32_t, System::SharedPtr\<ProductHeaderValue\>\&) | निर्दिष्ट इंडेक्स से पास किए गए स्ट्रिंग को [ProductHeaderValue](./) क्लास के एक इंस्टेंस में परिवर्तित करता है। |
| static [Parse](./parse/)(String) | पास किए गए स्ट्रिंग को [ProductHeaderValue](./) क्लास के एक इंस्टेंस में परिवर्तित करता है। |
| [ProductHeaderValue](./productheadervalue/)(String) | एक नया उदाहरण बनाता है। |
| [ProductHeaderValue](./productheadervalue/)(String, String) | एक नया उदाहरण बनाता है। |
| [ToString](./tostring/)() const override | C# के [Object.ToString()](../../system/object/tostring/) विधि का समानांतर। कस्टम वस्तुओं को स्ट्रिंग में परिवर्तित करने में सक्षम बनाता है। |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<ProductHeaderValue\>\&) | पास किए गए स्ट्रिंग को [ProductHeaderValue](./) क्लास के एक इंस्टेंस में परिवर्तित करने का प्रयास करता है। |
## संबंधित देखें

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Page for C++](../../)
