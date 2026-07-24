---
title: "System::Net::Http::Headers::TransferCodingHeaderValue::GetTransferCodingLength मेथड"
linktitle: "GetTransferCodingLength"
second_title: "Aspose.Page C++ के लिए"
description: "System::Net::Http::Headers::TransferCodingHeaderValue::GetTransferCodingLength मेथड। निर्दिष्ट अनुक्रमणिका से पास की गई स्ट्रिंग को C++ में TransferCodingHeaderValue क्लास की एक इंस्टेंस में परिवर्तित करता है।"
type: docs
weight: 700
url: /hi/cpp/system.net.http.headers/transfercodingheadervalue/gettransfercodinglength/
---
## TransferCodingHeaderValue::GetTransferCodingLength method


निर्दिष्ट अनुक्रमणिका से पास की गई स्ट्रिंग को [TransferCodingHeaderValue](../) क्लास की एक इंस्टेंस में परिवर्तित करता है।

```cpp
static int32_t System::Net::Http::Headers::TransferCodingHeaderValue::GetTransferCodingLength(String input, int32_t startIndex, const HeaderFunc<System::SharedPtr<TransferCodingHeaderValue>> &transferCodingCreator, System::SharedPtr<TransferCodingHeaderValue> &parsedValue)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| इनपुट | String | पार्स करने के लिए एक स्ट्रिंग। |
| startIndex | int32_t | पार्सिंग के लिए प्रारंभिक स्थिति। |
| parsedValue | const HeaderFunc\<System::SharedPtr\<TransferCodingHeaderValue\>\>\& | एक इंस्टेंस जहाँ पार्स किया गया ऑब्जेक्ट असाइन किया जाएगा। |
| transferCodingCreator | System::SharedPtr\<TransferCodingHeaderValue\>\& | डेलीगेट जो [TransferCodingHeaderValue](../) क्लास की इंस्टेंस बनाने के लिए उपयोग किया जाता है। |

### ReturnValue

पार्स किए गए उपस्ट्रिंग की लंबाई लौटाता है, अन्यथा 0।

## संबंधित देखें

* Class [String](../../../system/string/)
* Typedef [HeaderFunc](../../headerfunc/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [TransferCodingHeaderValue](../)
* Class [TransferCodingHeaderValue](../)
* Namespace [System::Net::Http::Headers](../../)
* Library [Aspose.Page for C++](../../../)
