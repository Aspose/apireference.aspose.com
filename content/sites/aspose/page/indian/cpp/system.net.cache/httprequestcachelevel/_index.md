---
title: "System::Net::Cache::HttpRequestCacheLevel enum"
linktitle: "HttpRequestCacheLevel"
second_title: "Aspose.Page C++ के लिए"
description: "System::Net::Cache::HttpRequestCacheLevel enum. यह enum HTTP के लिए C++ में कैश सेटिंग्स का वर्णन करता है।"
type: docs
weight: 400
url: /hi/cpp/system.net.cache/httprequestcachelevel/
---
## HttpRequestCacheLevel enum


यह एनम HTTP के लिए कैश सेटिंग्स का वर्णन करता है।

```cpp
enum class HttpRequestCacheLevel
```

### मान

| नाम | मान | विवरण |
| --- | --- | --- |
| Default | 0 | संसाधन के लिए अनुरोध को या तो संसाधन की कैश की गई प्रति का उपयोग करके या सर्वर को संसाधन के लिए अनुरोध भेजकर पूरा करता है। |
| BypassCache | 1 | सर्वर का उपयोग करके अनुरोध को पूरा करता है। |
| CacheOnly | 2 | संसाधन प्राप्त करने के लिए हमेशा क्लाइंट कैश का उपयोग करता है। |
| CacheIfAvailable | 3 | यदि संसाधन उपलब्ध है तो कैश से संसाधन के लिए अनुरोध को पूरा करता है, अन्यथा सर्वर को अनुरोध भेजता है। |
| पुनः मान्य करें | 4 | यदि क्लाइंट टाइमस्टैम्प सर्वर पर संसाधन के टाइमस्टैम्प के समान है तो संसाधन की स्थानीय प्रति का उपयोग किया जाता है। अन्यथा, सर्वर से संसाधन डाउनलोड किया जाता है। |
| पुनः लोड करें | 5 | संसाधन हमेशा सर्वर से डाउनलोड किया जाता है। |
| NoCacheNoStore | 6 | कैश से संसाधनों का उपयोग करके कभी भी अनुरोध को पूरा नहीं करता और संसाधनों को कैश नहीं करता। |
| CacheOrNextCacheOnly | 7 | स्थानीय कंप्यूटर के कैश या LAN पर रिमोट कैश से किसी संसाधन के लिए अनुरोध को पूरा करता है। |
| Refresh | 8 | सर्वर या स्थानीय कैश के अलावा किसी अन्य कैश का उपयोग करके अनुरोध को पूरा करता है। |

## संबंधित देखें

* Namespace [System::Net::Cache](../)
* Library [Aspose.Page for C++](../../)
