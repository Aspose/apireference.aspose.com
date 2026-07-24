---
title: "System::Net::Http::Headers::NameValueHeaderValue::GetNameValueListLength method"
linktitle: "GetNameValueListLength"
second_title: "Aspose.Page C++ के लिए"
description: "System::Net::Http::Headers::NameValueHeaderValue::GetNameValueListLength method. निर्दिष्ट इंडेक्स से पास किए गए स्ट्रिंग को NameValueHeaderValue-क्लास की इंस्टेंसों के संग्रह में परिवर्तित करता है और C++ में पार्स किए गए सबस्ट्रिंग की लंबाई लौटाता है।"
type: docs
weight: 1000
url: /hi/cpp/system.net.http.headers/namevalueheadervalue/getnamevaluelistlength/
---
## NameValueHeaderValue::GetNameValueListLength method


निर्दिष्ट इंडेक्स से पास की गई स्ट्रिंग को NameValueHeaderValue-क्लास की इंस्टेंसों के संग्रह में परिवर्तित करता है और पार्स किए गए उपस्ट्रिंग की लंबाई लौटाता है।

```cpp
static int32_t System::Net::Http::Headers::NameValueHeaderValue::GetNameValueListLength(String input, int32_t startIndex, char16_t delimiter, System::SharedPtr<ObjectCollection<System::SharedPtr<NameValueHeaderValue>>> nameValueCollection)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| इनपुट | String | विश्लेषण करने के लिए एक स्ट्रिंग। |
| startIndex | int32_t | विश्लेषण के लिए प्रारंभिक स्थिति। |
| डिलिमिटर | char16_t | एक स्ट्रिंग जो निर्दिष्ट स्ट्रिंग में आइटम को विभाजित करने के लिए उपयोग की जाती है। |
| nameValueCollection | System::SharedPtr\<ObjectCollection\<System::SharedPtr\<NameValueHeaderValue\>\>\> | आउटपुट पैरामीटर जहाँ एक पार्स किया गया संग्रह असाइन किया जाएगा। |

### ReturnValue

पार्स किए गए सबस्ट्रिंग की लंबाई।

## संबंधित देखें

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [ObjectCollection](../../objectcollection/)
* Class [NameValueHeaderValue](../)
* Class [NameValueHeaderValue](../)
* Namespace [System::Net::Http::Headers](../../)
* Library [Aspose.Page for C++](../../../)
