---
title: "System::Net::Sockets::Socket::ReceiveMessageFrom मेथड"
linktitle: "ReceiveMessageFrom"
second_title: "Aspose.Page C++ के लिए"
description: "System::Net::Sockets::Socket::ReceiveMessageFrom मेथड। निर्दिष्ट एंडपॉइंट से डेटा प्राप्त करता है और इसे C++ में निर्दिष्ट बाइट एरे में लिखता है।"
type: docs
weight: 4500
url: /hi/cpp/system.net.sockets/socket/receivemessagefrom/
---
## Socket::ReceiveMessageFrom(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags\&, System::SharedPtr\<EndPoint\>\&, IPPacketInformation\&) method


निर्दिष्ट एंडपॉइंट से डेटा प्राप्त करता है और उसे निर्दिष्ट बाइट एरे में लिखता है।

```cpp
int32_t System::Net::Sockets::Socket::ReceiveMessageFrom(System::ArrayPtr<uint8_t> buffer, int32_t offset, int32_t size, SocketFlags &socketFlags, System::SharedPtr<EndPoint> &remoteEP, IPPacketInformation &ipPacketInformation)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| बफ़र | System::ArrayPtr\<uint8_t\> | बाइट एरे जहाँ प्राप्त डेटा असाइन किया जाएगा। |
| offset | int32_t | निर्दिष्ट एरे में बाइट्स में ऑफ़सेट। |
| size | int32_t | बाइट्स की संख्या जिसे प्राप्त किया जाएगा और 'ऑफ़सेट' इंडेक्स से निर्दिष्ट बाइट एरे में असाइन किया जाएगा। |
| socketFlags | SocketFlags\& | प्राप्ति व्यवहार। |
| remoteEP | System::SharedPtr\<EndPoint\>\& | दूरस्थ एंडपॉइंट। |
| ipPacketInformation | IPPacketInformation\& | आउटपुट पैरामीटर जहाँ पैकेट की जानकारी असाइन की जाएगी। |

### ReturnValue

प्राप्त बाइट्स की संख्या।

## संबंधित देखें

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [IPPacketInformation](../../ippacketinformation/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::ReceiveMessageFrom(System::Details::ArrayView\<uint8_t\>, int32_t, int32_t, SocketFlags\&, System::SharedPtr\<EndPoint\>\&, IPPacketInformation\&) method


निर्दिष्ट एंडपॉइंट से डेटा प्राप्त करता है और उसे निर्दिष्ट बाइट एरे में लिखता है।

```cpp
int32_t System::Net::Sockets::Socket::ReceiveMessageFrom(System::Details::ArrayView<uint8_t> buffer, int32_t offset, int32_t size, SocketFlags &socketFlags, System::SharedPtr<EndPoint> &remoteEP, IPPacketInformation &ipPacketInformation)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| बफ़र | System::Details::ArrayView\<uint8_t\> | बाइट एरे जहाँ प्राप्त डेटा असाइन किया जाएगा। |
| offset | int32_t | निर्दिष्ट एरे में बाइट्स में ऑफ़सेट। |
| size | int32_t | बाइट्स की संख्या जिसे प्राप्त किया जाएगा और 'ऑफ़सेट' इंडेक्स से निर्दिष्ट बाइट एरे में असाइन किया जाएगा। |
| socketFlags | SocketFlags\& | प्राप्ति व्यवहार। |
| remoteEP | System::SharedPtr\<EndPoint\>\& | दूरस्थ एंडपॉइंट। |
| ipPacketInformation | IPPacketInformation\& | आउटपुट पैरामीटर जहाँ पैकेट की जानकारी असाइन की जाएगी। |

### ReturnValue

प्राप्त बाइट्स की संख्या।

## संबंधित देखें

* Enum [SocketFlags](../../socketflags/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [IPPacketInformation](../../ippacketinformation/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::ReceiveMessageFrom(System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t, SocketFlags\&, System::SharedPtr\<EndPoint\>\&, IPPacketInformation\&) method


निर्दिष्ट एंडपॉइंट से डेटा प्राप्त करता है और उसे निर्दिष्ट बाइट एरे में लिखता है।

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::ReceiveMessageFrom(System::Details::StackArray<uint8_t, N> &buffer, int32_t offset, int32_t size, SocketFlags &socketFlags, System::SharedPtr<EndPoint> &remoteEP, IPPacketInformation &ipPacketInformation)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| बफ़र | System::Details::StackArray\<uint8_t, N\>\& | बाइट एरे जहाँ प्राप्त डेटा असाइन किया जाएगा। |
| offset | int32_t | निर्दिष्ट एरे में बाइट्स में ऑफ़सेट। |
| size | int32_t | बाइट्स की संख्या जिसे प्राप्त किया जाएगा और 'ऑफ़सेट' इंडेक्स से निर्दिष्ट बाइट एरे में असाइन किया जाएगा। |
| socketFlags | SocketFlags\& | प्राप्ति व्यवहार। |
| remoteEP | System::SharedPtr\<EndPoint\>\& | दूरस्थ एंडपॉइंट। |
| ipPacketInformation | IPPacketInformation\& | आउटपुट पैरामीटर जहाँ पैकेट की जानकारी असाइन की जाएगी। |

### ReturnValue

प्राप्त बाइट्स की संख्या।

## संबंधित देखें

* Enum [SocketFlags](../../socketflags/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [IPPacketInformation](../../ippacketinformation/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
