---
title: "System::Net::Http::Headers::NameValueHeaderValue::GetNameValueLength method"
linktitle: "GetNameValueLength"
second_title: "Aspose.Page C++ के लिए"
description: "System::Net::Http::Headers::NameValueHeaderValue::GetNameValueLength method. निर्दिष्ट अनुक्रमणिका से पास की गई स्ट्रिंग को C++ में NameValueHeaderValue क्लास के उदाहरण में परिवर्तित करता है।"
type: docs
weight: 900
url: /hi/cpp/system.net.http.headers/namevalueheadervalue/getnamevaluelength/
---
## NameValueHeaderValue::GetNameValueLength(String, int32_t, HeaderFunc\<System::SharedPtr\<NameValueHeaderValue\>\>, System::SharedPtr\<NameValueHeaderValue\>\&) method


निर्दिष्ट इंडेक्स से पास किए गए स्ट्रिंग को [NameValueHeaderValue](../) क्लास की एक इंस्टेंस में परिवर्तित करता है।

```cpp
static int32_t System::Net::Http::Headers::NameValueHeaderValue::GetNameValueLength(String input, int32_t startIndex, HeaderFunc<System::SharedPtr<NameValueHeaderValue>> nameValueCreator, System::SharedPtr<NameValueHeaderValue> &parsedValue)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| इनपुट | String | पार्स करने के लिए एक स्ट्रिंग। |
| startIndex | int32_t | पार्सिंग के लिए प्रारंभिक स्थिति। |
| nameValueCreator | HeaderFunc\<System::SharedPtr\<NameValueHeaderValue\>\> | एक फ़ंक्शन जो [NameValueHeaderValue](../) क्लास की नई इंस्टेंस बनाने के लिए उपयोग किया जाता है। |
| parsedValue | System::SharedPtr\<NameValueHeaderValue\>\& | एक इंस्टेंस जहाँ पार्स किया गया ऑब्जेक्ट असाइन किया जाएगा। |

### ReturnValue

पार्स किए गए उपस्ट्रिंग की लंबाई लौटाता है, अन्यथा 0।

## संबंधित देखें

* Class [String](../../../system/string/)
* Typedef [HeaderFunc](../../headerfunc/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [NameValueHeaderValue](../)
* Class [NameValueHeaderValue](../)
* Namespace [System::Net::Http::Headers](../../)
* Library [Aspose.Page for C++](../../../)
## NameValueHeaderValue::GetNameValueLength(String, int32_t, System::SharedPtr\<NameValueHeaderValue\>\&) method


निर्दिष्ट इंडेक्स से पास किए गए स्ट्रिंग को [NameValueHeaderValue](../) क्लास की एक इंस्टेंस में परिवर्तित करता है।

```cpp
static int32_t System::Net::Http::Headers::NameValueHeaderValue::GetNameValueLength(String input, int32_t startIndex, System::SharedPtr<NameValueHeaderValue> &parsedValue)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| इनपुट | String | पार्स करने के लिए एक स्ट्रिंग। |
| startIndex | int32_t | पार्सिंग के लिए प्रारंभिक स्थिति। |
| parsedValue | System::SharedPtr\<NameValueHeaderValue\>\& | एक इंस्टेंस जहाँ पार्स किया गया ऑब्जेक्ट असाइन किया जाएगा। |

### ReturnValue

पार्स किए गए उपस्ट्रिंग की लंबाई लौटाता है, अन्यथा 0।

## संबंधित देखें

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [NameValueHeaderValue](../)
* Class [NameValueHeaderValue](../)
* Namespace [System::Net::Http::Headers](../../)
* Library [Aspose.Page for C++](../../../)
