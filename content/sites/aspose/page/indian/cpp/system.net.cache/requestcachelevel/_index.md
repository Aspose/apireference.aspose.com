---
title: "System::Net::Cache::RequestCacheLevel enum"
linktitle: "RequestCacheLevel"
second_title: "Aspose.Page C++ के लिए"
description: "System::Net::Cache::RequestCacheLevel enum. यह enum किसी भी C++ WebRequest के लिए लागू कैश सेटिंग्स का वर्णन करता है।"
type: docs
weight: 500
url: /hi/cpp/system.net.cache/requestcachelevel/
---
## RequestCacheLevel enum


यह enum किसी भी [WebRequest](../../system.net/webrequest/) के लिए लागू कैश सेटिंग्स का वर्णन करता है।

```cpp
enum class RequestCacheLevel
```

### मान

| नाम | मान | विवरण |
| --- | --- | --- |
| Default | 0 | संसाधन के लिए अनुरोध को या तो संसाधन की कैश की गई प्रति का उपयोग करके या सर्वर को संसाधन के लिए अनुरोध भेजकर पूरा करता है। |
| BypassCache | 1 | सर्वर का उपयोग करके अनुरोध को पूरा करता है। कैश से कोई प्रविष्टि नहीं ली जाती। |
| CacheOnly | 2 | संसाधन के लिए अनुरोध को केवल कैश से पूरा करता है। जब कोई संसाधन क्लाइंट कैश में नहीं होता है तो [WebException](../../system.net/webexception/) फेंका जाएगा। |
| CacheIfAvailable | 3 | यदि संसाधन उपलब्ध है तो कैश से संसाधन के लिए अनुरोध को पूरा करता है, अन्यथा सर्वर को अनुरोध भेजता है। |
| पुनः मान्य करें | 4 | यदि क्लाइंट टाइमस्टैम्प सर्वर पर संसाधन के टाइमस्टैम्प के समान है तो संसाधन की स्थानीय प्रति का उपयोग किया जाता है। अन्यथा, सर्वर से संसाधन डाउनलोड किया जाता है। |
| पुनः लोड करें | 5 | संसाधन हमेशा सर्वर से डाउनलोड किया जाता है। |
| NoCacheNoStore | 6 | कैश से संसाधनों का उपयोग करके कभी भी अनुरोध को पूरा नहीं करता और संसाधनों को कैश नहीं करता। |

## संबंधित देखें

* Namespace [System::Net::Cache](../)
* Library [Aspose.Page for C++](../../)
