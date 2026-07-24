---
title: "System::Net::Http::Headers::RangeItemHeaderValue::GetRangeItemListLength method"
linktitle: "GetRangeItemListLength"
second_title: "Aspose.Page C++ के लिए"
description: "System::Net::Http::Headers::RangeItemHeaderValue::GetRangeItemListLength method. पास की गई स्ट्रिंग को निर्दिष्ट पोजीशन से RangeItemHeaderValue-क्लास की इंस्टेंस की कलेक्शन में C++ में परिवर्तित करता है।"
type: docs
weight: 800
url: /hi/cpp/system.net.http.headers/rangeitemheadervalue/getrangeitemlistlength/
---
## RangeItemHeaderValue::GetRangeItemListLength method


निर्दिष्ट स्थिति से पास की गई स्ट्रिंग को RangeItemHeaderValue-क्लास के उदाहरणों के संग्रह में परिवर्तित करता है।

```cpp
static int32_t System::Net::Http::Headers::RangeItemHeaderValue::GetRangeItemListLength(String input, int32_t startIndex, System::SharedPtr<Collections::Generic::ICollection<System::SharedPtr<RangeItemHeaderValue>>> rangeCollection)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| इनपुट | String | पार्स करने के लिए एक स्ट्रिंग। |
| startIndex | int32_t | पार्सिंग के लिए प्रारंभिक स्थिति। |
| rangeCollection | System::SharedPtr\<Collections::Generic::ICollection\<System::SharedPtr\<RangeItemHeaderValue\>\>\> | एक इंस्टेंस जहाँ पार्स की गई कलेक्शन असाइन की जाएगी। |

### ReturnValue

पार्स किए गए सबस्ट्रिंग की लंबाई, अन्यथा 0।

## संबंधित देखें

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [ICollection](../../../system.collections.generic/icollection/)
* Class [RangeItemHeaderValue](../)
* Class [RangeItemHeaderValue](../)
* Namespace [System::Net::Http::Headers](../../)
* Library [Aspose.Page for C++](../../../)
