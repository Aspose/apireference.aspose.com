---
title: "System::Net::Sockets::Socket::EndSend मेथड"
linktitle: "EndSend"
second_title: "Aspose.Page C++ के लिए"
description: "System::Net::Sockets::Socket::EndSend मेथड. C++ में निर्दिष्ट असिंक्रोनस भेजने वाले ऑपरेशन के पूरा होने तक प्रतीक्षा करता है।"
type: docs
weight: 1600
url: /hi/cpp/system.net.sockets/socket/endsend/
---
## Socket::EndSend(System::SharedPtr\<IAsyncResult\>) method


निर्दिष्ट असिंक्रोनस सेंड ऑपरेशन के पूरा होने तक प्रतीक्षा करता है।

```cpp
int32_t System::Net::Sockets::Socket::EndSend(System::SharedPtr<IAsyncResult> asyncResult)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| asyncResult | System::SharedPtr\<IAsyncResult\> | एक [IAsyncResult](../../../system/iasyncresult/) ऑब्जेक्ट जो एक असिंक्रोनस भेजने वाले ऑपरेशन का प्रतिनिधित्व करता है। |

### ReturnValue

भेजे गए बाइट्स की संख्या।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::EndSend(System::SharedPtr\<IAsyncResult\>, SocketError\&) method


निर्दिष्ट असिंक्रोनस सेंड ऑपरेशन के पूरा होने तक प्रतीक्षा करता है।

```cpp
int32_t System::Net::Sockets::Socket::EndSend(System::SharedPtr<IAsyncResult> asyncResult, SocketError &errorCode)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| asyncResult | System::SharedPtr\<IAsyncResult\> | एक [IAsyncResult](../../../system/iasyncresult/) ऑब्जेक्ट जो एक असिंक्रोनस भेजने वाले ऑपरेशन का प्रतिनिधित्व करता है। |
| errorCode | SocketError\& | आउटपुट पैरामीटर जहाँ त्रुटि कोड असाइन किया जाएगा जब भेजने वाला ऑपरेशन विफल हो जाता है। |

### ReturnValue

भेजे गए बाइट्स की संख्या।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Enum [SocketError](../../socketerror/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
