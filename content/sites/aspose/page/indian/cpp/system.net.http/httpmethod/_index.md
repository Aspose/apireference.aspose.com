---
title: "System::Net::Http::HttpMethod क्लास"
linktitle: "HttpMethod"
second_title: "Aspose.Page C++ के लिए"
description: "System::Net::Http::HttpMethod क्लास। एक HTTP मेथड को दर्शाता है। इस क्लास की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ हो सकती हैं। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।"
type: docs
weight: 700
url: /hi/cpp/system.net.http/httpmethod/
---
## HttpMethod class


एक HTTP मेथड को दर्शाता है। इस क्लास की वस्तुओं को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके ही आवंटित किया जाना चाहिए। इस प्रकार का इंस्टेंस स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ हो सकती हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।

```cpp
class HttpMethod : public System::IEquatable<System::SharedPtr<System::Net::Http::HttpMethod>>
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [Equals](./equals/)(System::SharedPtr\<HttpMethod\>) override | वर्तमान और निर्दिष्ट वस्तुओं के बराबर होने का निर्धारण करता है। |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | वस्तुओं की तुलना C# [Object.Equals](../../system/object/equals/) सेमांटिक्स का उपयोग करके करता है। |
| static [get_Delete](./get_delete/)() | 'DELETE' HTTP मेथड को लौटाता है। |
| static [get_Get](./get_get/)() | 'GET' HTTP मेथड को लौटाता है। |
| static [get_Head](./get_head/)() | 'HEAD' HTTP मेथड को लौटाता है। |
| [get_Method](./get_method/)() | HTTP मेथड का स्ट्रिंग प्रतिनिधित्व लौटाता है। |
| static [get_Options](./get_options/)() | 'OPTIONS' HTTP मेथड को लौटाता है। |
| static [get_Post](./get_post/)() | 'POST' HTTP मेथड को लौटाता है। |
| static [get_Put](./get_put/)() | 'PUT' HTTP मेथड को लौटाता है। |
| static [get_Trace](./get_trace/)() | 'TRACE' HTTP मेथड को लौटाता है। |
| [GetHashCode](./gethashcode/)() const override | C# के [Object.GetHashCode()](../../system/object/gethashcode/) मेथड का समानांतर। कस्टम ऑब्जेक्ट्स की हैशिंग को सक्षम करता है। |
| [HttpMethod](./httpmethod/)(String) | एक नया उदाहरण बनाता है। |
| [ToString](./tostring/)() const override | C# के [Object.ToString()](../../system/object/tostring/) विधि का समानांतर। कस्टम वस्तुओं को स्ट्रिंग में परिवर्तित करने में सक्षम बनाता है। |
## संबंधित देखें

* Class [IEquatable](../../system/iequatable/)
* Namespace [System::Net::Http](../)
* Library [Aspose.Page for C++](../../)
