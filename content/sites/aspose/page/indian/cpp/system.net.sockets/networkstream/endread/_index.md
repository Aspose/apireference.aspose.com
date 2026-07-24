---
title: "System::Net::Sockets::NetworkStream::EndRead मेथड"
linktitle: "EndRead"
second_title: "Aspose.Page C++ के लिए"
description: "System::Net::Sockets::NetworkStream::EndRead मेथड। निर्दिष्ट असिंक्रोनस रीड ऑपरेशन के C++ में पूर्ण होने तक प्रतीक्षा करता है।"
type: docs
weight: 600
url: /hi/cpp/system.net.sockets/networkstream/endread/
---
## NetworkStream::EndRead method


निर्दिष्ट असिंक्रोनस रीड ऑपरेशन के पूरा होने तक प्रतीक्षा करता है।

```cpp
int32_t System::Net::Sockets::NetworkStream::EndRead(System::SharedPtr<IAsyncResult> asyncResult) override
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| asyncResult | System::SharedPtr\<IAsyncResult\> | एक [IAsyncResult](../../../system/iasyncresult/) ऑब्जेक्ट जो एक असिंक्रोनस रीड ऑपरेशन का प्रतिनिधित्व करता है |

### ReturnValue

रीड ऑपरेशन के दौरान पढ़े गए बाइट्स की संख्या जो **asyncResult** द्वारा प्रतिनिधित्व किया गया है

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Class [NetworkStream](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
