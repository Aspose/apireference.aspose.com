---
title: "System::Net::Http::Headers::CacheControlHeaderValue class"
linktitle: "CacheControlHeaderValue"
second_title: "Aspose.Page C++ के लिए"
description: "System::Net::Http::Headers::CacheControlHeaderValue class. ''Cache-Control'' हेडर का मान दर्शाता है। इस क्लास की वस्तुओं को केवल System::MakeObject() फ़ंक्शन का उपयोग करके आवंटित किया जाना चाहिए। इस प्रकार का उदाहरण स्टैक पर या operator new का उपयोग करके न बनाएँ, क्योंकि इससे रनटाइम त्रुटियां और/या असर्शन फॉल्ट हो सकते हैं। हमेशा इस क्लास को System::SmartPtr पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें C++ में।"
type: docs
weight: 200
url: /hi/cpp/system.net.http.headers/cachecontrolheadervalue/
---
## CacheControlHeaderValue class


''Cache-Control'' हेडर का मान दर्शाता है। इस क्लास की वस्तुओं को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके आवंटित किया जाना चाहिए। इस प्रकार का उदाहरण स्टैक पर या operator new का उपयोग करके न बनाएँ, क्योंकि इससे रनटाइम त्रुटियां और/या असर्शन फॉल्ट हो सकते हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में लपेटें और इस पॉइंटर का उपयोग फ़ंक्शनों को तर्क के रूप में पास करने के लिए करें।

```cpp
class CacheControlHeaderValue : public System::ICloneable
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [CacheControlHeaderValue](./cachecontrolheadervalue/)() | एक नया उदाहरण बनाता है। |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | वस्तुओं की तुलना C# [Object.Equals](../../system/object/equals/) सेमांटिक्स का उपयोग करके करता है। |
| [get_Extensions](./get_extensions/)() | कैश-एक्सटेंशन टोकन का संग्रह लौटाता है। |
| [get_MaxAge](./get_maxage/)() | अधिकतम आयु मान (सेकंड में) प्राप्त करता है जो निर्धारित करता है कि क्लाइंट कब तक प्रतिक्रिया स्वीकार करेगा। |
| [get_MaxStale](./get_maxstale/)() | यह निर्धारित करने वाला मान प्राप्त करता है कि क्लाइंट समाप्त हुई प्रतिक्रियाओं को स्वीकार करेगा या नहीं। |
| [get_MaxStaleLimit](./get_maxstalelimit/)() | सेकंड में वह मान प्राप्त करता है जो निर्धारित करता है कि क्लाइंट कब तक समाप्त हुई प्रतिक्रियाओं को स्वीकार करेगा। |
| [get_MinFresh](./get_minfresh/)() | ताज़ा रहने की अवधि निर्धारित करने वाला मान प्राप्त करता है। |
| [get_MustRevalidate](./get_mustrevalidate/)() | सर्वर को जब कैश एंट्री पुरानी हो जाए तो पुनः मान्यकरण की आवश्यकता है या नहीं, यह निर्धारित करने वाला मान प्राप्त करता है। |
| [get_NoCache](./get_nocache/)() | RTTI जानकारी। |
| [get_NoCacheHeaders](./get_nocacheheaders/)() | 'Cache-Control' हेडर में 'no-cache' निर्देश के फ़ील्डनामों का संग्रह प्राप्त करता है। |
| [get_NoStore](./get_nostore/)() | कैश को HTTP अनुरोध या प्रतिक्रिया के किसी भी भाग को संग्रहीत न करने की आवश्यकता है या नहीं, यह निर्धारित करने वाला मान प्राप्त करता है। |
| [get_NoTransform](./get_notransform/)() | कैश या प्रॉक्सी को एंटिटी बॉडी के किसी भी भाग को न बदलने की आवश्यकता है या नहीं, यह निर्धारित करने वाला मान प्राप्त करता है। |
| [get_OnlyIfCached](./get_onlyifcached/)() | क्लाइंट को केवल कैश किए गए एंट्रीज़ का उपयोग करना चाहिए या नहीं, यह निर्धारित करने वाला मान प्राप्त करता है। |
| [get_Private](./get_private/)() | HTTP प्रतिक्रिया संदेश या उसका भाग एकल उपयोगकर्ता के लिए है और साझा कैश द्वारा कैश नहीं किया जाना चाहिए, यह निर्धारित करने वाला मान प्राप्त करता है। |
| [get_PrivateHeaders](./get_privateheaders/)() | 'Cache-Control' हेडर में 'private' निर्देश के फ़ील्डनामों का संग्रह प्राप्त करता है। |
| [get_ProxyRevalidate](./get_proxyrevalidate/)() | सर्वर को साझा यूज़र एजेंट कैश के लिए जब कैश एंट्री पुरानी हो जाए तो पुनः मान्यकरण की आवश्यकता है या नहीं, यह निर्धारित करने वाला मान प्राप्त करता है। |
| [get_Public](./get_public/)() | किसी भी कैश द्वारा HTTP प्रतिक्रिया को कैश किया जा सकता है या नहीं, यह निर्धारित करने वाला मान प्राप्त करता है। |
| [get_SharedMaxAge](./get_sharedmaxage/)() | साझा कैश के लिए 'Cache-Control' हेडर में 'max-age' निर्देश या 'Expires' हेडर को ओवरराइड करने वाला अधिकतम आयु मान (सेकंड में) प्राप्त करता है। |
| static [GetCacheControlLength](./getcachecontrollength/)(String, int32_t, System::SharedPtr\<CacheControlHeaderValue\>, System::SharedPtr\<CacheControlHeaderValue\>\&) | दिए गए स्ट्रिंग को निर्दिष्ट इंडेक्स से लेकर [CacheControlHeaderValue](./) क्लास की एक इंस्टेंस में परिवर्तित करता है। |
| [GetHashCode](./gethashcode/)() const override | C# के [Object.GetHashCode()](../../system/object/gethashcode/) मेथड का समानांतर। कस्टम ऑब्जेक्ट्स की हैशिंग को सक्षम करता है। |
| static [Parse](./parse/)(String) | दिए गए स्ट्रिंग को [CacheControlHeaderValue](./) क्लास की एक इंस्टेंस में परिवर्तित करता है। |
| [set_MaxAge](./set_maxage/)(Nullable\<TimeSpan\>) | सेकंड में अधिकतम आयु मान सेट करता है जो निर्धारित करता है कि क्लाइंट कब तक प्रतिक्रिया स्वीकार करेगा। |
| [set_MaxStale](./set_maxstale/)(bool) | क्लाइंट को समाप्त हुई प्रतिक्रियाओं को स्वीकार करना चाहिए या नहीं, यह निर्धारित करने वाला मान सेट करता है। |
| [set_MaxStaleLimit](./set_maxstalelimit/)(Nullable\<TimeSpan\>) | सेकंड में वह मान सेट करता है जो निर्धारित करता है कि क्लाइंट कब तक समाप्त हुई प्रतिक्रियाओं को स्वीकार करेगा। |
| [set_MinFresh](./set_minfresh/)(Nullable\<TimeSpan\>) | ताज़ा रहने की अवधि निर्धारित करने वाला मान सेट करता है। |
| [set_MustRevalidate](./set_mustrevalidate/)(bool) | सर्वर को जब कैश एंट्री पुरानी हो जाए तो पुनः मान्यकरण की आवश्यकता है या नहीं, यह निर्धारित करने वाला मान सेट करता है। |
| [set_NoCache](./set_nocache/)(bool) | क्लाइंट को कैश की गई प्रतिक्रिया स्वीकार करनी चाहिए या नहीं, यह निर्धारित करने वाला मान सेट करता है। |
| [set_NoStore](./set_nostore/)(bool) | कैश को HTTP अनुरोध या प्रतिक्रिया के किसी भी भाग को संग्रहीत न करने की आवश्यकता है या नहीं, यह निर्धारित करने वाला मान सेट करता है। |
| [set_NoTransform](./set_notransform/)(bool) | कैश या प्रॉक्सी को एंटिटी बॉडी के किसी भी भाग को न बदलने की आवश्यकता है या नहीं, यह निर्धारित करने वाला मान सेट करता है। |
| [set_OnlyIfCached](./set_onlyifcached/)(bool) | क्लाइंट को केवल कैश किए गए एंट्रीज़ का उपयोग करना चाहिए या नहीं, यह निर्धारित करने वाला मान सेट करता है। |
| [set_Private](./set_private/)(bool) | HTTP प्रतिक्रिया संदेश या उसका भाग एकल उपयोगकर्ता के लिए है और साझा कैश द्वारा कैश नहीं किया जाना चाहिए, यह निर्धारित करने वाला मान सेट करता है। |
| [set_ProxyRevalidate](./set_proxyrevalidate/)(bool) | सर्वर को साझा यूज़र एजेंट कैश के लिए जब कैश एंट्री पुरानी हो जाए तो पुनः मान्यकरण की आवश्यकता है या नहीं, यह निर्धारित करने वाला मान सेट करता है। |
| [set_Public](./set_public/)(bool) | किसी भी कैश द्वारा HTTP प्रतिक्रिया को कैश किया जा सकता है या नहीं, यह निर्धारित करने वाला मान सेट करता है। |
| [set_SharedMaxAge](./set_sharedmaxage/)(Nullable\<TimeSpan\>) | सेकंड में साझा अधिकतम आयु मान सेट करता है जो 'max-age' निर्देश को 'Cache-Control' हेडर या 'Expires' हेडर में साझा कैश के लिए ओवरराइड करता है। |
| [ToString](./tostring/)() const override | C# के [Object.ToString()](../../system/object/tostring/) विधि का समानांतर। कस्टम वस्तुओं को स्ट्रिंग में परिवर्तित करने में सक्षम बनाता है। |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<CacheControlHeaderValue\>\&) | पास किए गए स्ट्रिंग को [CacheControlHeaderValue](./) क्लास का एक इंस्टेंस बनाने का प्रयास करता है। |
## संबंधित देखें

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Page for C++](../../)
