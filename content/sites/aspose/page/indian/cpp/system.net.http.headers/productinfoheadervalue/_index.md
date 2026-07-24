---
title: "System::Net::Http::Headers::ProductInfoHeaderValue क्लास"
linktitle: "ProductInfoHeaderValue"
second_title: "Aspose.Page C++ के लिए"
description: "System::Net::Http::Headers::ProductInfoHeaderValue क्लास। ''User-Agent'' हेडर के मान में उत्पाद या टिप्पणी दर्शाता है। इस क्लास की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ हो सकती हैं। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।"
type: docs
weight: 1800
url: /hi/cpp/system.net.http.headers/productinfoheadervalue/
---
## ProductInfoHeaderValue class


''User-Agent'' हेडर के मान में उत्पाद या टिप्पणी दर्शाता है। इस क्लास की वस्तुओं को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ हो सकती हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।

```cpp
class ProductInfoHeaderValue : public System::ICloneable
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | वस्तुओं की तुलना C# [Object.Equals](../../system/object/equals/) सेमांटिक्स का उपयोग करके करता है। |
| [get_Comment](./get_comment/)() | एक टिप्पणी लौटाता है। |
| [get_Product](./get_product/)() | RTTI जानकारी। |
| [GetHashCode](./gethashcode/)() const override | C# के [Object.GetHashCode()](../../system/object/gethashcode/) मेथड का समानांतर। कस्टम ऑब्जेक्ट्स की हैशिंग को सक्षम करता है। |
| static [GetProductInfoLength](./getproductinfolength/)(String, int32_t, System::SharedPtr\<ProductInfoHeaderValue\>\&) | निर्दिष्ट इंडेक्स से पास की गई स्ट्रिंग को [ProductInfoHeaderValue](./) क्लास के इंस्टेंस में परिवर्तित करता है। |
| static [Parse](./parse/)(String) | पास की गई स्ट्रिंग को [ProductInfoHeaderValue](./) क्लास के इंस्टेंस में परिवर्तित करता है। |
| [ProductInfoHeaderValue](./productinfoheadervalue/)(String, String) | एक नया उदाहरण बनाता है। |
| [ProductInfoHeaderValue](./productinfoheadervalue/)(System::SharedPtr\<ProductHeaderValue\>) | एक नया उदाहरण बनाता है। |
| [ProductInfoHeaderValue](./productinfoheadervalue/)(String) | एक नया उदाहरण बनाता है। |
| [ToString](./tostring/)() const override | C# के [Object.ToString()](../../system/object/tostring/) विधि का समानांतर। कस्टम वस्तुओं को स्ट्रिंग में परिवर्तित करने में सक्षम बनाता है। |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<ProductInfoHeaderValue\>\&) | पास की गई स्ट्रिंग को [ProductInfoHeaderValue](./) क्लास के इंस्टेंस में परिवर्तित करने का प्रयास करता है। |
## संबंधित देखें

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Page for C++](../../)
