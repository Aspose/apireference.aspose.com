---
title: "System::Net::Sockets::Socket::EndReceive मेथड"
linktitle: "EndReceive"
second_title: "Aspose.Page C++ के लिए"
description: "System::Net::Sockets::Socket::EndReceive मेथड। निर्दिष्ट असिंक्रोनस रिसीव ऑपरेशन के पूरा होने तक C++ में प्रतीक्षा करता है।"
type: docs
weight: 1500
url: /hi/cpp/system.net.sockets/socket/endreceive/
---
## Socket::EndReceive(System::SharedPtr\<IAsyncResult\>) method


निर्दिष्ट असिंक्रोनस रिसीव ऑपरेशन के पूरा होने तक प्रतीक्षा करता है।

```cpp
int32_t System::Net::Sockets::Socket::EndReceive(System::SharedPtr<IAsyncResult> asyncResult)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| asyncResult | System::SharedPtr\<IAsyncResult\> | एक [IAsyncResult](../../../system/iasyncresult/) ऑब्जेक्ट जो एक असिंक्रोनस रिसीव ऑपरेशन का प्रतिनिधित्व करता है। |

### ReturnValue

प्राप्त बाइट्स की संख्या।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::EndReceive(System::SharedPtr\<IAsyncResult\>, SocketError\&) method


निर्दिष्ट असिंक्रोनस रिसीव ऑपरेशन के पूरा होने तक प्रतीक्षा करता है।

```cpp
int32_t System::Net::Sockets::Socket::EndReceive(System::SharedPtr<IAsyncResult> asyncResult, SocketError &errorCode)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| asyncResult | System::SharedPtr\<IAsyncResult\> | एक [IAsyncResult](../../../system/iasyncresult/) ऑब्जेक्ट जो एक असिंक्रोनस रिसीव ऑपरेशन का प्रतिनिधित्व करता है। |
| errorCode | SocketError\& | आउटपुट पैरामीटर जहाँ त्रुटि कोड असाइन किया जाएगा जब प्राप्ति ऑपरेशन विफल हो जाता है। |

### ReturnValue

प्राप्त बाइट्स की संख्या।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Enum [SocketError](../../socketerror/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
