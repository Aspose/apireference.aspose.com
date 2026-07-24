---
title: "System::Net::Cache::HttpCacheAgeControl enum"
linktitle: "HttpCacheAgeControl"
second_title: "Aspose.Page C++ के लिए"
description: "System::Net::Cache::HttpCacheAgeControl enum. CacheAgeControl का उपयोग C++ में कैश किए गए आइटम की आयु और ताज़गी के संबंध में प्राथमिकताओं को निर्दिष्ट करने के लिए किया जाता है।"
type: docs
weight: 300
url: /hi/cpp/system.net.cache/httpcacheagecontrol/
---
## HttpCacheAgeControl enum


CacheAgeControl का उपयोग कैश किए गए आइटम की आयु और ताज़गी के संबंध में प्राथमिकताएँ निर्दिष्ट करने के लिए किया जाता है।

```cpp
enum class HttpCacheAgeControl
```

### मान

| नाम | मान | विवरण |
| --- | --- | --- |
| None | 0 | केवल आंतरिक उपयोग के लिए। |
| MinFresh | 1 | यदि समाप्ति से पहले शेष समय इस मान द्वारा निर्दिष्ट समय के बराबर या उससे अधिक है, तो सामग्री को कैश से लिया जा सकता है। |
| MaxAge | 2 | सामग्री को कैश से तब तक लिया जा सकता है जब तक वह इस मान द्वारा निर्दिष्ट आयु से अधिक नहीं हो जाता। |
| MaxStale | 4 | सामग्री को कैश से समाप्त होने के बाद तब तक लिया जा सकता है जब तक इस मान द्वारा निर्दिष्ट समय समाप्त नहीं हो जाता। |
| MaxAgeAndMinFresh | 3 | MaxAge और MinFresh। |
| MaxAgeAndMaxStale | 6 | MaxAge और MaxStale। |

## संबंधित देखें

* Namespace [System::Net::Cache](../)
* Library [Aspose.Page for C++](../../)
