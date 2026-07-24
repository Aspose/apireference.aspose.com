---
title: "System::Net::Cache::HttpRequestCachePolicy class"
linktitle: "HttpRequestCachePolicy"
second_title: "Aspose.Page C++ के लिए"
description: "System::Net::Cache::HttpRequestCachePolicy class. RFC2616 HTTP कैशिंग सेमांटिक को व्यक्त करने वाली HTTP कैश नीति। इस क्लास की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके आवंटित किया जाना चाहिए। इस प्रकार का उदाहरण स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ हो सकती हैं। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें C++ में।"
type: docs
weight: 100
url: /hi/cpp/system.net.cache/httprequestcachepolicy/
---
## HttpRequestCachePolicy class


RFC2616 HTTP कैशिंग सेमांटिक को व्यक्त करने वाली HTTP कैश नीति। इस क्लास की वस्तुओं को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके आवंटित किया जाना चाहिए। इस प्रकार का उदाहरण स्टैक पर या operator new का उपयोग करके कभी न बनाएँ, क्योंकि इससे रनटाइम त्रुटियाँ और/या असर्शन त्रुटियाँ हो सकती हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।

```cpp
class HttpRequestCachePolicy : public System::Net::Cache::RequestCachePolicy
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [get_CacheSyncDate](./get_cachesyncdate/)() const | कैश में संग्रहीत संसाधनों को पुनः मान्य करने का समय प्राप्त करता है। |
| [get_InternalCacheSyncDateUtc](./get_internalcachesyncdateutc/)() const | UTC प्रारूप में वह समय प्राप्त करता है जब कैश में संग्रहीत संसाधनों को पुनः मान्य करना आवश्यक होता है। केवल आंतरिक उपयोग के लिए। |
| [get_Level](./get_level/)() const | RTTI जानकारी। |
| [get_MaxAge](./get_maxage/)() const | संसाधन के लिए अनुमत अधिकतम आयु प्राप्त करता है। |
| [get_MaxStale](./get_maxstale/)() const | संसाधन के लिए अनुमत अधिकतम पुरातनता मान प्राप्त करता है। |
| [get_MinFresh](./get_minfresh/)() const | संसाधन के लिए अनुमत न्यूनतम आयु प्राप्त करता है। |
| [HttpRequestCachePolicy](./httprequestcachepolicy/)() | एक नया उदाहरण बनाता है। |
| [HttpRequestCachePolicy](./httprequestcachepolicy/)(HttpRequestCacheLevel) | एक नया उदाहरण बनाता है। |
| [HttpRequestCachePolicy](./httprequestcachepolicy/)(HttpCacheAgeControl, TimeSpan) | एक नया उदाहरण बनाता है। |
| [HttpRequestCachePolicy](./httprequestcachepolicy/)(HttpCacheAgeControl, TimeSpan, TimeSpan) | एक नया उदाहरण बनाता है। |
| [HttpRequestCachePolicy](./httprequestcachepolicy/)(DateTime) | एक नया उदाहरण बनाता है। |
| [HttpRequestCachePolicy](./httprequestcachepolicy/)(HttpCacheAgeControl, TimeSpan, TimeSpan, DateTime) | एक नया उदाहरण बनाता है। |
| [ToString](./tostring/)() const override | C# के [Object.ToString()](../../system/object/tostring/) विधि का समानांतर। कस्टम वस्तुओं को स्ट्रिंग में परिवर्तित करने में सक्षम बनाता है। |
## संबंधित देखें

* Class [RequestCachePolicy](../requestcachepolicy/)
* Namespace [System::Net::Cache](../)
* Library [Aspose.Page for C++](../../)
