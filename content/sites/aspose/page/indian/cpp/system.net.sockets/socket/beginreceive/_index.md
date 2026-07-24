---
title: "System::Net::Sockets::Socket::BeginReceive मेथड"
linktitle: "BeginReceive"
second_title: "Aspose.Page C++ के लिए"
description: "System::Net::Sockets::Socket::BeginReceive मेथड. C++ में एक असिंक्रोनस लिखने वाला ऑपरेशन शुरू करता है।"
type: docs
weight: 800
url: /hi/cpp/system.net.sockets/socket/beginreceive/
---
## Socket::BeginReceive method


एक असिंक्रोनस राइट ऑपरेशन शुरू करता है।

```cpp
System::SharedPtr<IAsyncResult> System::Net::Sockets::Socket::BeginReceive(System::ArrayPtr<uint8_t> buffer, int32_t offset, int32_t size, SocketFlags socketFlags, AsyncCallback callback, System::SharedPtr<Object> state)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| बफ़र | System::ArrayPtr\<uint8_t\> | एक बफ़र जहाँ प्राप्त डेटा असाइन किया जाएगा। |
| offset | int32_t | निर्दिष्ट एरे में बाइट्स में ऑफ़सेट। |
| size | int32_t | निर्दिष्ट एरे में 'ऑफ़सेट' पैरामीटर से शुरू होने वाले बाइट्स की संख्या। |
| socketFlags | SocketFlags | प्राप्ति व्यवहार। |
| कॉलबैक | AsyncCallback | एक कॉलबैक जो ऑपरेशन के पूरा होने पर बुलाया जाएगा। |
| स्थिति | System::SharedPtr\<Object\> | उपयोगकर्ता द्वारा प्रदान किया गया डेटा जो प्रत्येक असिंक्रोनस प्राप्ति ऑपरेशन को विशिष्ट रूप से पहचानने के लिए उपयोग होता है। |

### ReturnValue

एक [IAsyncResult](../../../system/iasyncresult/) ऑब्जेक्ट जो प्रारंभ किए गए असिंक्रोनस रिसीव ऑपरेशन का प्रतिनिधित्व करता है।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Typedef [AsyncCallback](../../../system/asynccallback/)
* Class [Object](../../../system/object/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
