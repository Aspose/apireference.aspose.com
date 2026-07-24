---
title: "System::Net::Sockets::Socket::ReceiveFrom विधि"
linktitle: "ReceiveFrom"
second_title: "Aspose.Page C++ के लिए"
description: "System::Net::Sockets::Socket::ReceiveFrom विधि. निर्दिष्ट एंडपॉइंट से डेटा प्राप्त करता है और इसे निर्दिष्ट बाइट एरे में C++ में लिखता है।"
type: docs
weight: 4400
url: /hi/cpp/system.net.sockets/socket/receivefrom/
---
## Socket::ReceiveFrom(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>\&) method


निर्दिष्ट एंडपॉइंट से डेटा प्राप्त करता है और उसे निर्दिष्ट बाइट एरे में लिखता है।

```cpp
int32_t System::Net::Sockets::Socket::ReceiveFrom(System::ArrayPtr<uint8_t> buffer, int32_t offset, int32_t size, SocketFlags socketFlags, System::SharedPtr<EndPoint> &remoteEP)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| बफ़र | System::ArrayPtr\<uint8_t\> | बाइट एरे जहाँ प्राप्त डेटा असाइन किया जाएगा। |
| offset | int32_t | निर्दिष्ट एरे में बाइट्स में ऑफ़सेट। |
| size | int32_t | बाइट्स की संख्या जिसे प्राप्त किया जाएगा और 'ऑफ़सेट' इंडेक्स से निर्दिष्ट बाइट एरे में असाइन किया जाएगा। |
| socketFlags | SocketFlags | प्राप्ति व्यवहार। |
| remoteEP | System::SharedPtr\<EndPoint\>\& | दूरस्थ एंडपॉइंट। |

### ReturnValue

प्राप्त बाइट्स की संख्या।

## संबंधित देखें

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::ReceiveFrom(System::ArrayPtr\<uint8_t\>, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>\&) method


निर्दिष्ट एंडपॉइंट से डेटा प्राप्त करता है और उसे निर्दिष्ट बाइट एरे में लिखता है।

```cpp
int32_t System::Net::Sockets::Socket::ReceiveFrom(System::ArrayPtr<uint8_t> buffer, int32_t size, SocketFlags socketFlags, System::SharedPtr<EndPoint> &remoteEP)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| बफ़र | System::ArrayPtr\<uint8_t\> | बाइट एरे जहाँ प्राप्त डेटा असाइन किया जाएगा। |
| size | int32_t | बाइट्स की संख्या जिसे प्राप्त किया जाएगा और 'ऑफ़सेट' इंडेक्स से निर्दिष्ट बाइट एरे में असाइन किया जाएगा। |
| socketFlags | SocketFlags | प्राप्ति व्यवहार। |
| remoteEP | System::SharedPtr\<EndPoint\>\& | दूरस्थ एंडपॉइंट। |

### ReturnValue

प्राप्त बाइट्स की संख्या।

## संबंधित देखें

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::ReceiveFrom(System::ArrayPtr\<uint8_t\>, SocketFlags, System::SharedPtr\<EndPoint\>\&) method


निर्दिष्ट एंडपॉइंट से डेटा प्राप्त करता है और उसे निर्दिष्ट बाइट एरे में लिखता है।

```cpp
int32_t System::Net::Sockets::Socket::ReceiveFrom(System::ArrayPtr<uint8_t> buffer, SocketFlags socketFlags, System::SharedPtr<EndPoint> &remoteEP)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| बफ़र | System::ArrayPtr\<uint8_t\> | बाइट एरे जहाँ प्राप्त डेटा असाइन किया जाएगा। |
| socketFlags | SocketFlags | प्राप्ति व्यवहार। |
| remoteEP | System::SharedPtr\<EndPoint\>\& | दूरस्थ एंडपॉइंट। |

### ReturnValue

प्राप्त बाइट्स की संख्या।

## संबंधित देखें

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::ReceiveFrom(System::ArrayPtr\<uint8_t\>, SocketFlags, System::SharedPtr\<EndPoint\>\&) method


निर्दिष्ट एंडपॉइंट से डेटा प्राप्त करता है और उसे निर्दिष्ट बाइट एरे में लिखता है।

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::ReceiveFrom(System::ArrayPtr<uint8_t> buffer, SocketFlags socketFlags, System::SharedPtr<EndPoint> &remoteEP)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| बफ़र | System::ArrayPtr\<uint8_t\> | बाइट एरे जहाँ प्राप्त डेटा असाइन किया जाएगा। |
| socketFlags | SocketFlags | प्राप्ति व्यवहार। |
| remoteEP | System::SharedPtr\<EndPoint\>\& | दूरस्थ एंडपॉइंट। |

### ReturnValue

प्राप्त बाइट्स की संख्या।

## संबंधित देखें

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::ReceiveFrom(System::ArrayPtr\<uint8_t\>, System::SharedPtr\<EndPoint\>\&) method


निर्दिष्ट एंडपॉइंट से डेटा प्राप्त करता है और उसे निर्दिष्ट बाइट एरे में लिखता है।

```cpp
int32_t System::Net::Sockets::Socket::ReceiveFrom(System::ArrayPtr<uint8_t> buffer, System::SharedPtr<EndPoint> &remoteEP)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| बफ़र | System::ArrayPtr\<uint8_t\> | बाइट एरे जहाँ प्राप्त डेटा असाइन किया जाएगा। |
| remoteEP | System::SharedPtr\<EndPoint\>\& | दूरस्थ एंडपॉइंट। |

### ReturnValue

प्राप्त बाइट्स की संख्या।

## संबंधित देखें

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::ReceiveFrom(System::Details::ArrayView\<uint8_t\>, int32_t, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>\&) method


निर्दिष्ट एंडपॉइंट से डेटा प्राप्त करता है और उसे निर्दिष्ट बाइट एरे में लिखता है।

```cpp
int32_t System::Net::Sockets::Socket::ReceiveFrom(System::Details::ArrayView<uint8_t> buffer, int32_t offset, int32_t size, SocketFlags socketFlags, System::SharedPtr<EndPoint> &remoteEP)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| बफ़र | System::Details::ArrayView\<uint8_t\> | बाइट एरे जहाँ प्राप्त डेटा असाइन किया जाएगा। |
| offset | int32_t | निर्दिष्ट एरे में बाइट्स में ऑफ़सेट। |
| size | int32_t | बाइट्स की संख्या जिसे प्राप्त किया जाएगा और 'ऑफ़सेट' इंडेक्स से निर्दिष्ट बाइट एरे में असाइन किया जाएगा। |
| socketFlags | SocketFlags | प्राप्ति व्यवहार। |
| remoteEP | System::SharedPtr\<EndPoint\>\& | दूरस्थ एंडपॉइंट। |

### ReturnValue

प्राप्त बाइट्स की संख्या।

## संबंधित देखें

* Enum [SocketFlags](../../socketflags/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::ReceiveFrom(System::Details::ArrayView\<uint8_t\>, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>\&) method


निर्दिष्ट एंडपॉइंट से डेटा प्राप्त करता है और उसे निर्दिष्ट बाइट एरे में लिखता है।

```cpp
int32_t System::Net::Sockets::Socket::ReceiveFrom(System::Details::ArrayView<uint8_t> buffer, int32_t size, SocketFlags socketFlags, System::SharedPtr<EndPoint> &remoteEP)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| बफ़र | System::Details::ArrayView\<uint8_t\> | बाइट एरे जहाँ प्राप्त डेटा असाइन किया जाएगा। |
| size | int32_t | बाइट्स की संख्या जिसे प्राप्त किया जाएगा और 'ऑफ़सेट' इंडेक्स से निर्दिष्ट बाइट एरे में असाइन किया जाएगा। |
| socketFlags | SocketFlags | प्राप्ति व्यवहार। |
| remoteEP | System::SharedPtr\<EndPoint\>\& | दूरस्थ एंडपॉइंट। |

### ReturnValue

प्राप्त बाइट्स की संख्या।

## संबंधित देखें

* Enum [SocketFlags](../../socketflags/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::ReceiveFrom(System::Details::ArrayView\<uint8_t\>, SocketFlags, System::SharedPtr\<EndPoint\>\&) method


निर्दिष्ट एंडपॉइंट से डेटा प्राप्त करता है और उसे निर्दिष्ट बाइट एरे में लिखता है।

```cpp
int32_t System::Net::Sockets::Socket::ReceiveFrom(System::Details::ArrayView<uint8_t> buffer, SocketFlags socketFlags, System::SharedPtr<EndPoint> &remoteEP)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| बफ़र | System::Details::ArrayView\<uint8_t\> | बाइट एरे जहाँ प्राप्त डेटा असाइन किया जाएगा। |
| socketFlags | SocketFlags | प्राप्ति व्यवहार। |
| remoteEP | System::SharedPtr\<EndPoint\>\& | दूरस्थ एंडपॉइंट। |

### ReturnValue

प्राप्त बाइट्स की संख्या।

## संबंधित देखें

* Enum [SocketFlags](../../socketflags/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::ReceiveFrom(System::Details::ArrayView\<uint8_t\>, System::SharedPtr\<EndPoint\>\&) method


निर्दिष्ट एंडपॉइंट से डेटा प्राप्त करता है और उसे निर्दिष्ट बाइट एरे में लिखता है।

```cpp
int32_t System::Net::Sockets::Socket::ReceiveFrom(System::Details::ArrayView<uint8_t> buffer, System::SharedPtr<EndPoint> &remoteEP)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| बफ़र | System::Details::ArrayView\<uint8_t\> | बाइट एरे जहाँ प्राप्त डेटा असाइन किया जाएगा। |
| remoteEP | System::SharedPtr\<EndPoint\>\& | दूरस्थ एंडपॉइंट। |

### ReturnValue

प्राप्त बाइट्स की संख्या।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::ReceiveFrom(System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>\&) method


निर्दिष्ट एंडपॉइंट से डेटा प्राप्त करता है और उसे निर्दिष्ट बाइट एरे में लिखता है।

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::ReceiveFrom(System::Details::StackArray<uint8_t, N> &buffer, int32_t offset, int32_t size, SocketFlags socketFlags, System::SharedPtr<EndPoint> &remoteEP)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| बफ़र | System::Details::StackArray\<uint8_t, N\>\& | बाइट एरे जहाँ प्राप्त डेटा असाइन किया जाएगा। |
| offset | int32_t | निर्दिष्ट एरे में बाइट्स में ऑफ़सेट। |
| size | int32_t | बाइट्स की संख्या जिसे प्राप्त किया जाएगा और 'ऑफ़सेट' इंडेक्स से निर्दिष्ट बाइट एरे में असाइन किया जाएगा। |
| socketFlags | SocketFlags | प्राप्ति व्यवहार। |
| remoteEP | System::SharedPtr\<EndPoint\>\& | दूरस्थ एंडपॉइंट। |

### ReturnValue

प्राप्त बाइट्स की संख्या।

## संबंधित देखें

* Enum [SocketFlags](../../socketflags/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::ReceiveFrom(System::Details::StackArray\<uint8_t, N\>\&, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>\&) method


निर्दिष्ट एंडपॉइंट से डेटा प्राप्त करता है और उसे निर्दिष्ट बाइट एरे में लिखता है।

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::ReceiveFrom(System::Details::StackArray<uint8_t, N> &buffer, int32_t size, SocketFlags socketFlags, System::SharedPtr<EndPoint> &remoteEP)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| बफ़र | System::Details::StackArray\<uint8_t, N\>\& | बाइट एरे जहाँ प्राप्त डेटा असाइन किया जाएगा। |
| size | int32_t | बाइट्स की संख्या जिसे प्राप्त किया जाएगा और 'ऑफ़सेट' इंडेक्स से निर्दिष्ट बाइट एरे में असाइन किया जाएगा। |
| socketFlags | SocketFlags | प्राप्ति व्यवहार। |
| remoteEP | System::SharedPtr\<EndPoint\>\& | दूरस्थ एंडपॉइंट। |

### ReturnValue

प्राप्त बाइट्स की संख्या।

## संबंधित देखें

* Enum [SocketFlags](../../socketflags/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::ReceiveFrom(System::Details::StackArray\<uint8_t, N\>\&, System::SharedPtr\<EndPoint\>\&) method


निर्दिष्ट एंडपॉइंट से डेटा प्राप्त करता है और उसे निर्दिष्ट बाइट एरे में लिखता है।

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::ReceiveFrom(System::Details::StackArray<uint8_t, N> &buffer, System::SharedPtr<EndPoint> &remoteEP)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| बफ़र | System::Details::StackArray\<uint8_t, N\>\& | बाइट एरे जहाँ प्राप्त डेटा असाइन किया जाएगा। |
| remoteEP | System::SharedPtr\<EndPoint\>\& | दूरस्थ एंडपॉइंट। |

### ReturnValue

प्राप्त बाइट्स की संख्या।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
