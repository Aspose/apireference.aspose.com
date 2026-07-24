---
title: "System::Net::Sockets::Socket::SendTo विधि"
linktitle: "SendTo"
second_title: "Aspose.Page C++ के लिए"
description: "System::Net::Sockets::Socket::SendTo विधि। निर्दिष्ट डेटा को निर्दिष्ट अंत बिंदु पर C++ में भेजता है।"
type: docs
weight: 4700
url: /hi/cpp/system.net.sockets/socket/sendto/
---
## Socket::SendTo(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>) method


निर्दिष्ट डेटा को निर्दिष्ट एंडपॉइंट को भेजता है।

```cpp
int32_t System::Net::Sockets::Socket::SendTo(System::ArrayPtr<uint8_t> buffer, int32_t offset, int32_t size, SocketFlags socketFlags, System::SharedPtr<EndPoint> remoteEP)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| बफ़र | System::ArrayPtr\<uint8_t\> | भेजने के लिए डेटा। |
| offset | int32_t | निर्दिष्ट एरे में बाइट्स में ऑफ़सेट। |
| size | int32_t | निर्दिष्ट एरे में 'ऑफ़सेट' पैरामीटर से शुरू होने वाले बाइट्स की संख्या। |
| socketFlags | SocketFlags | भेजने का व्यवहार। |
| remoteEP | System::SharedPtr\<EndPoint\> | दूरस्थ एंडपॉइंट। |

### ReturnValue

भेजे गए बाइट्स की संख्या।

## संबंधित देखें

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::SendTo(System::ArrayPtr\<uint8_t\>, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>) method


निर्दिष्ट डेटा को निर्दिष्ट एंडपॉइंट को भेजता है।

```cpp
int32_t System::Net::Sockets::Socket::SendTo(System::ArrayPtr<uint8_t> buffer, int32_t size, SocketFlags socketFlags, System::SharedPtr<EndPoint> remoteEP)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| बफ़र | System::ArrayPtr\<uint8_t\> | भेजने के लिए डेटा। |
| size | int32_t | निर्दिष्ट सरणी में बाइट्स की संख्या। |
| socketFlags | SocketFlags | भेजने का व्यवहार। |
| remoteEP | System::SharedPtr\<EndPoint\> | दूरस्थ एंडपॉइंट। |

### ReturnValue

भेजे गए बाइट्स की संख्या।

## संबंधित देखें

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::SendTo(System::ArrayPtr\<uint8_t\>, SocketFlags, System::SharedPtr\<EndPoint\>) method


निर्दिष्ट डेटा को निर्दिष्ट एंडपॉइंट को भेजता है।

```cpp
int32_t System::Net::Sockets::Socket::SendTo(System::ArrayPtr<uint8_t> buffer, SocketFlags socketFlags, System::SharedPtr<EndPoint> remoteEP)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| बफ़र | System::ArrayPtr\<uint8_t\> | भेजने के लिए डेटा। |
| socketFlags | SocketFlags | भेजने का व्यवहार। |
| remoteEP | System::SharedPtr\<EndPoint\> | दूरस्थ एंडपॉइंट। |

### ReturnValue

भेजे गए बाइट्स की संख्या।

## संबंधित देखें

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::SendTo(System::ArrayPtr\<uint8_t\>, System::SharedPtr\<EndPoint\>) method


निर्दिष्ट डेटा को निर्दिष्ट एंडपॉइंट को भेजता है।

```cpp
int32_t System::Net::Sockets::Socket::SendTo(System::ArrayPtr<uint8_t> buffer, System::SharedPtr<EndPoint> remoteEP)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| बफ़र | System::ArrayPtr\<uint8_t\> | भेजने के लिए डेटा। |
| remoteEP | System::SharedPtr\<EndPoint\> | दूरस्थ एंडपॉइंट। |

### ReturnValue

भेजे गए बाइट्स की संख्या।

## संबंधित देखें

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::SendTo(System::Details::ArrayView\<uint8_t\>, int32_t, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>) method


निर्दिष्ट डेटा को निर्दिष्ट एंडपॉइंट को भेजता है।

```cpp
int32_t System::Net::Sockets::Socket::SendTo(System::Details::ArrayView<uint8_t> buffer, int32_t offset, int32_t size, SocketFlags socketFlags, System::SharedPtr<EndPoint> remoteEP)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| बफ़र | System::Details::ArrayView\<uint8_t\> | भेजने के लिए डेटा। |
| offset | int32_t | निर्दिष्ट एरे में बाइट्स में ऑफ़सेट। |
| size | int32_t | निर्दिष्ट एरे में 'ऑफ़सेट' पैरामीटर से शुरू होने वाले बाइट्स की संख्या। |
| socketFlags | SocketFlags | भेजने का व्यवहार। |
| remoteEP | System::SharedPtr\<EndPoint\> | दूरस्थ एंडपॉइंट। |

### ReturnValue

भेजे गए बाइट्स की संख्या।

## संबंधित देखें

* Enum [SocketFlags](../../socketflags/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::SendTo(System::Details::ArrayView\<uint8_t\>, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>) method


निर्दिष्ट डेटा को निर्दिष्ट एंडपॉइंट को भेजता है।

```cpp
int32_t System::Net::Sockets::Socket::SendTo(System::Details::ArrayView<uint8_t> buffer, int32_t size, SocketFlags socketFlags, System::SharedPtr<EndPoint> remoteEP)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| बफ़र | System::Details::ArrayView\<uint8_t\> | भेजने के लिए डेटा। |
| size | int32_t | निर्दिष्ट सरणी में बाइट्स की संख्या। |
| socketFlags | SocketFlags | भेजने का व्यवहार। |
| remoteEP | System::SharedPtr\<EndPoint\> | दूरस्थ एंडपॉइंट। |

### ReturnValue

भेजे गए बाइट्स की संख्या।

## संबंधित देखें

* Enum [SocketFlags](../../socketflags/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::SendTo(System::Details::ArrayView\<uint8_t\>, SocketFlags, System::SharedPtr\<EndPoint\>) method


निर्दिष्ट डेटा को निर्दिष्ट एंडपॉइंट को भेजता है।

```cpp
int32_t System::Net::Sockets::Socket::SendTo(System::Details::ArrayView<uint8_t> buffer, SocketFlags socketFlags, System::SharedPtr<EndPoint> remoteEP)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| बफ़र | System::Details::ArrayView\<uint8_t\> | भेजने के लिए डेटा। |
| socketFlags | SocketFlags | भेजने का व्यवहार। |
| remoteEP | System::SharedPtr\<EndPoint\> | दूरस्थ एंडपॉइंट। |

### ReturnValue

भेजे गए बाइट्स की संख्या।

## संबंधित देखें

* Enum [SocketFlags](../../socketflags/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::SendTo(System::Details::ArrayView\<uint8_t\>, System::SharedPtr\<EndPoint\>) method


निर्दिष्ट डेटा को निर्दिष्ट एंडपॉइंट को भेजता है।

```cpp
int32_t System::Net::Sockets::Socket::SendTo(System::Details::ArrayView<uint8_t> buffer, System::SharedPtr<EndPoint> remoteEP)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| बफ़र | System::Details::ArrayView\<uint8_t\> | भेजने के लिए डेटा। |
| remoteEP | System::SharedPtr\<EndPoint\> | दूरस्थ एंडपॉइंट। |

### ReturnValue

भेजे गए बाइट्स की संख्या।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::SendTo(System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>) method


निर्दिष्ट डेटा को निर्दिष्ट एंडपॉइंट को भेजता है।

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::SendTo(System::Details::StackArray<uint8_t, N> &buffer, int32_t offset, int32_t size, SocketFlags socketFlags, System::SharedPtr<EndPoint> remoteEP)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| बफ़र | System::Details::StackArray\<uint8_t, N\>\& | भेजने के लिए डेटा। |
| offset | int32_t | निर्दिष्ट एरे में बाइट्स में ऑफ़सेट। |
| size | int32_t | निर्दिष्ट एरे में 'ऑफ़सेट' पैरामीटर से शुरू होने वाले बाइट्स की संख्या। |
| socketFlags | SocketFlags | भेजने का व्यवहार। |
| remoteEP | System::SharedPtr\<EndPoint\> | दूरस्थ एंडपॉइंट। |

### ReturnValue

भेजे गए बाइट्स की संख्या।

## संबंधित देखें

* Enum [SocketFlags](../../socketflags/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::SendTo(System::Details::StackArray\<uint8_t, N\>\&, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>) method


निर्दिष्ट डेटा को निर्दिष्ट एंडपॉइंट को भेजता है।

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::SendTo(System::Details::StackArray<uint8_t, N> &buffer, int32_t size, SocketFlags socketFlags, System::SharedPtr<EndPoint> remoteEP)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| बफ़र | System::Details::StackArray\<uint8_t, N\>\& | भेजने के लिए डेटा। |
| size | int32_t | निर्दिष्ट सरणी में बाइट्स की संख्या। |
| socketFlags | SocketFlags | भेजने का व्यवहार। |
| remoteEP | System::SharedPtr\<EndPoint\> | दूरस्थ एंडपॉइंट। |

### ReturnValue

भेजे गए बाइट्स की संख्या।

## संबंधित देखें

* Enum [SocketFlags](../../socketflags/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::SendTo(System::Details::StackArray\<uint8_t, N\>\&, SocketFlags, System::SharedPtr\<EndPoint\>) method


निर्दिष्ट डेटा को निर्दिष्ट एंडपॉइंट को भेजता है।

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::SendTo(System::Details::StackArray<uint8_t, N> &buffer, SocketFlags socketFlags, System::SharedPtr<EndPoint> remoteEP)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| बफ़र | System::Details::StackArray\<uint8_t, N\>\& | भेजने के लिए डेटा। |
| socketFlags | SocketFlags | भेजने का व्यवहार। |
| remoteEP | System::SharedPtr\<EndPoint\> | दूरस्थ एंडपॉइंट। |

### ReturnValue

भेजे गए बाइट्स की संख्या।

## संबंधित देखें

* Enum [SocketFlags](../../socketflags/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::SendTo(System::Details::StackArray\<uint8_t, N\>\&, System::SharedPtr\<EndPoint\>) method


निर्दिष्ट डेटा को निर्दिष्ट एंडपॉइंट को भेजता है।

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::SendTo(System::Details::StackArray<uint8_t, N> &buffer, System::SharedPtr<EndPoint> remoteEP)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| बफ़र | System::Details::StackArray\<uint8_t, N\>\& | भेजने के लिए डेटा। |
| remoteEP | System::SharedPtr\<EndPoint\> | दूरस्थ एंडपॉइंट। |

### ReturnValue

भेजे गए बाइट्स की संख्या।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
