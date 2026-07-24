---
title: "System::Net::Http::Headers::AuthenticationHeaderValue class"
linktitle: "AuthenticationHeaderValue"
second_title: "Aspose.Page C++ के लिए"
description: "System::Net::Http::Headers::AuthenticationHeaderValue क्लास। ''Authorization'', ''ProxyAuthorization'', ''WWW-Authenticate'' और ''Proxy-Authenticate'' हेडरों के मान का प्रतिनिधित्व करता है। इस क्लास की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का उदाहरण स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ हो सकती हैं। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।"
type: docs
weight: 100
url: /hi/cpp/system.net.http.headers/authenticationheadervalue/
---
## AuthenticationHeaderValue class


''Authorization'', ''ProxyAuthorization'', ''WWW-Authenticate'' और ''Proxy-Authenticate'' हेडरों के मान का प्रतिनिधित्व करता है। इस क्लास की वस्तुओं को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का उदाहरण स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ हो सकती हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।

```cpp
class AuthenticationHeaderValue : public System::ICloneable
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [AuthenticationHeaderValue](./authenticationheadervalue/)(String) | निर्माता। |
| [AuthenticationHeaderValue](./authenticationheadervalue/)(String, String) | निर्माता। |
| [Clone](./clone/)() override | RTTI जानकारी। |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | वस्तुओं की तुलना C# [Object.Equals](../../system/object/equals/) सेमांटिक्स का उपयोग करके करता है। |
| [get_Parameter](./get_parameter/)() | प्रमाणीकरण जानकारी वाले क्रेडेंशियल प्राप्त करता है। |
| [get_Scheme](./get_scheme/)() | RTTI जानकारी। |
| static [GetAuthenticationLength](./getauthenticationlength/)(String, int32_t, System::SharedPtr\<Object\>\&) | निर्दिष्ट स्ट्रिंग को पार्स करता है और स्ट्रिंग प्रतिनिधित्व का अंतिम इंडेक्स लौटाता है। |
| [GetHashCode](./gethashcode/)() const override | C# के [Object.GetHashCode()](../../system/object/gethashcode/) मेथड का समानांतर। कस्टम ऑब्जेक्ट्स की हैशिंग को सक्षम करता है। |
| static [Parse](./parse/)(String) | प्रदान की गई स्ट्रिंग को [AuthenticationHeaderValue](./) क्लास की एक इंस्टेंस में परिवर्तित करता है। |
| [ToString](./tostring/)() const override | C# के [Object.ToString()](../../system/object/tostring/) विधि का समानांतर। कस्टम वस्तुओं को स्ट्रिंग में परिवर्तित करने में सक्षम बनाता है। |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<AuthenticationHeaderValue\>\&) | प्रदान की गई स्ट्रिंग को [AuthenticationHeaderValue](./) क्लास की एक इंस्टेंस में परिवर्तित करने का प्रयास कर रहा है। |
## संबंधित देखें

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Page for C++](../../)
