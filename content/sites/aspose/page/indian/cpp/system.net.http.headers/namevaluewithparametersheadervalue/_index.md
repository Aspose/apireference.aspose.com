---
title: "System::Net::Http::Headers::NameValueWithParametersHeaderValue क्लास"
linktitle: "NameValueWithParametersHeaderValue"
second_title: "Aspose.Page C++ के लिए"
description: "System::Net::Http::Headers::NameValueWithParametersHeaderValue क्लास। हेडर्स में उपयोग के लिए पैरामीटर वाले कुंजी/मान जोड़े का प्रतिनिधित्व करता है। इस क्लास की ऑब्जेक्ट्स को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार की इंस्टेंस को स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ या असर्शन फॉल्ट हो सकते हैं। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर को फ़ंक्शन में आर्ग्यूमेंट के रूप में पास करें।"
type: docs
weight: 1500
url: /hi/cpp/system.net.http.headers/namevaluewithparametersheadervalue/
---
## NameValueWithParametersHeaderValue class


हेडर्स में उपयोग के लिए पैरामीटर वाले कुंजी/मान जोड़े का प्रतिनिधित्व करता है। इस क्लास की ऑब्जेक्ट्स को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार की इंस्टेंस को स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ या असर्शन फॉल्ट हो सकते हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर को फ़ंक्शन में आर्ग्यूमेंट के रूप में पास करें।

```cpp
class NameValueWithParametersHeaderValue : public System::Net::Http::Headers::NameValueHeaderValue
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | वस्तुओं की तुलना C# [Object.Equals](../../system/object/equals/) सेमांटिक्स का उपयोग करके करता है। |
| [get_Parameters](./get_parameters/)() | RTTI जानकारी। |
| [GetHashCode](./gethashcode/)() const override | C# के [Object.GetHashCode()](../../system/object/gethashcode/) मेथड का समानांतर। कस्टम ऑब्जेक्ट्स की हैशिंग को सक्षम करता है। |
| static [GetNameValueWithParametersLength](./getnamevaluewithparameterslength/)(String, int32_t, System::SharedPtr\<Object\>\&) | निर्दिष्ट इंडेक्स से पास किए गए स्ट्रिंग को [NameValueWithParametersHeaderValue](./) क्लास का एक इंस्टेंस में परिवर्तित करता है। |
| [NameValueWithParametersHeaderValue](./namevaluewithparametersheadervalue/)(String) | एक नया उदाहरण बनाता है। |
| [NameValueWithParametersHeaderValue](./namevaluewithparametersheadervalue/)(String, String) | एक नया उदाहरण बनाता है। |
| [NameValueWithParametersHeaderValue](./namevaluewithparametersheadervalue/)() | एक नया उदाहरण बनाता है। |
| static [Parse](./parse/)(String) | पास किए गए स्ट्रिंग को [NameValueWithParametersHeaderValue](./) क्लास का एक इंस्टेंस बनाता है। |
| [ToString](./tostring/)() const override | C# के [Object.ToString()](../../system/object/tostring/) विधि का समानांतर। कस्टम वस्तुओं को स्ट्रिंग में परिवर्तित करने में सक्षम बनाता है। |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<NameValueWithParametersHeaderValue\>\&) | पास किए गए स्ट्रिंग को [NameValueWithParametersHeaderValue](./) क्लास का एक इंस्टेंस बनाने का प्रयास करता है। |
## संबंधित देखें

* Class [NameValueHeaderValue](../namevalueheadervalue/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Page for C++](../../)
