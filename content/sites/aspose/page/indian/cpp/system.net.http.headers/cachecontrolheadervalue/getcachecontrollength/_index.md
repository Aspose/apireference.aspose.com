---
title: "System::Net::Http::Headers::CacheControlHeaderValue::GetCacheControlLength मेथड"
linktitle: "GetCacheControlLength"
second_title: "Aspose.Page C++ के लिए"
description: "System::Net::Http::Headers::CacheControlHeaderValue::GetCacheControlLength मेथड. निर्दिष्ट इंडेक्स से पास की गई स्ट्रिंग को C++ में CacheControlHeaderValue क्लास के एक इंस्टेंस में परिवर्तित करता है।"
type: docs
weight: 3400
url: /hi/cpp/system.net.http.headers/cachecontrolheadervalue/getcachecontrollength/
---
## CacheControlHeaderValue::GetCacheControlLength method


पास की गई स्ट्रिंग को निर्दिष्ट इंडेक्स से [CacheControlHeaderValue](../) क्लास के एक इंस्टेंस में परिवर्तित करता है।

```cpp
static int32_t System::Net::Http::Headers::CacheControlHeaderValue::GetCacheControlLength(String input, int32_t startIndex, System::SharedPtr<CacheControlHeaderValue> storeValue, System::SharedPtr<CacheControlHeaderValue> &parsedValue)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| इनपुट | String | पार्स करने के लिए एक स्ट्रिंग। |
| startIndex | int32_t | पार्सिंग के लिए प्रारंभिक स्थिति। |
| storeValue | System::SharedPtr\<CacheControlHeaderValue\> | एक मान जिसे पार्स किए गए ऑब्जेक्ट में जोड़ना आवश्यक है। |
| parsedValue | System::SharedPtr\<CacheControlHeaderValue\>\& | एक इंस्टेंस जहाँ पार्स किया गया ऑब्जेक्ट असाइन किया जाएगा। |

### ReturnValue

पार्स किए गए सबस्ट्रिंग की लंबाई, अन्यथा 0।

## संबंधित देखें

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [CacheControlHeaderValue](../)
* Class [CacheControlHeaderValue](../)
* Namespace [System::Net::Http::Headers](../../)
* Library [Aspose.Page for C++](../../../)
