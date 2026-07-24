---
title: "System::Net::Sockets::Socket::BeginSend विधि"
linktitle: "BeginSend"
second_title: "Aspose.Page C++ के लिए"
description: "System::Net::Sockets::Socket::BeginSend विधि. C++ में एक असिंक्रोनस भेजने का ऑपरेशन शुरू करता है।"
type: docs
weight: 900
url: /hi/cpp/system.net.sockets/socket/beginsend/
---
## Socket::BeginSend method


एक असिंक्रोनस सेंड ऑपरेशन शुरू करता है।

```cpp
System::SharedPtr<IAsyncResult> System::Net::Sockets::Socket::BeginSend(System::ArrayPtr<uint8_t> buffer, int32_t offset, int32_t size, SocketFlags socketFlags, AsyncCallback callback, System::SharedPtr<Object> state)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| बफ़र | System::ArrayPtr\<uint8_t\> | डेटा पढ़ने के लिए एक बफ़र। |
| offset | int32_t | निर्दिष्ट एरे में बाइट्स में ऑफ़सेट। |
| size | int32_t | निर्दिष्ट एरे में 'ऑफ़सेट' पैरामीटर से शुरू होने वाले बाइट्स की संख्या। |
| socketFlags | SocketFlags | भेजने का व्यवहार। |
| कॉलबैक | AsyncCallback | एक कॉलबैक जो ऑपरेशन के पूरा होने पर बुलाया जाएगा। |
| स्थिति | System::SharedPtr\<Object\> | प्रत्येक असिंक्रोनस भेजने के ऑपरेशन को विशिष्ट रूप से पहचानने के लिए उपयोगकर्ता द्वारा प्रदान किया गया डेटा। |

### ReturnValue

एक [IAsyncResult](../../../system/iasyncresult/) ऑब्जेक्ट जो शुरू किए गए असिंक्रोनस भेजने के ऑपरेशन का प्रतिनिधित्व करता है।

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
