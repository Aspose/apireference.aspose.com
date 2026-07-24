---
title: "System::Net::Sockets::Socket::Receive मेथड"
linktitle: "प्राप्त करें"
second_title: "Aspose.Page C++ के लिए"
description: "System::Net::Sockets::Socket::Receive मेथड। सॉकेट से डेटा प्राप्त करता है और इसे C++ में निर्दिष्ट बाइट एरे में लिखता है।"
type: docs
weight: 4300
url: /hi/cpp/system.net.sockets/socket/receive/
---
## Socket::Receive(System::ArrayPtr\<uint8_t\>) method


सॉकेट से डेटा प्राप्त करता है और उसे निर्दिष्ट बाइट एरे में लिखता है।

```cpp
int32_t System::Net::Sockets::Socket::Receive(System::ArrayPtr<uint8_t> buffer)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| बफ़र | System::ArrayPtr\<uint8_t\> | बाइट एरे जहाँ प्राप्त डेटा असाइन किया जाएगा। |

### ReturnValue

प्राप्त बाइट्स की संख्या।

## संबंधित देखें

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Receive(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags) method


सॉकेट से डेटा प्राप्त करता है और उसे निर्दिष्ट बाइट एरे में लिखता है।

```cpp
int32_t System::Net::Sockets::Socket::Receive(System::ArrayPtr<uint8_t> buffer, int32_t offset, int32_t size, SocketFlags socketFlags)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| बफ़र | System::ArrayPtr\<uint8_t\> | बाइट एरे जहाँ प्राप्त डेटा असाइन किया जाएगा। |
| offset | int32_t | निर्दिष्ट एरे में बाइट्स में ऑफ़सेट। |
| size | int32_t | बाइट्स की संख्या जिसे प्राप्त किया जाएगा और 'ऑफ़सेट' इंडेक्स से निर्दिष्ट बाइट एरे में असाइन किया जाएगा। |
| socketFlags | SocketFlags | प्राप्ति व्यवहार। |

### ReturnValue

प्राप्त बाइट्स की संख्या।

## संबंधित देखें

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Receive(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags, SocketError\&) method


सॉकेट से डेटा प्राप्त करता है और उसे निर्दिष्ट बाइट एरे में लिखता है।

```cpp
int32_t System::Net::Sockets::Socket::Receive(System::ArrayPtr<uint8_t> buffer, int32_t offset, int32_t size, SocketFlags socketFlags, SocketError &errorCode)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| बफ़र | System::ArrayPtr\<uint8_t\> | बाइट एरे जहाँ प्राप्त डेटा असाइन किया जाएगा। |
| offset | int32_t | निर्दिष्ट एरे में बाइट्स में ऑफ़सेट। |
| size | int32_t | बाइट्स की संख्या जिसे प्राप्त किया जाएगा और 'ऑफ़सेट' इंडेक्स से निर्दिष्ट बाइट एरे में असाइन किया जाएगा। |
| socketFlags | SocketFlags | प्राप्ति व्यवहार। |
| errorCode | SocketError\& | आउटपुट पैरामीटर जहाँ त्रुटि कोड असाइन किया जाएगा जब प्राप्ति ऑपरेशन विफल हो जाता है। |

### ReturnValue

प्राप्त बाइट्स की संख्या।

## संबंधित देखें

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Enum [SocketError](../../socketerror/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Receive(System::ArrayPtr\<uint8_t\>, int32_t, SocketFlags) method


सॉकेट से डेटा प्राप्त करता है और उसे निर्दिष्ट बाइट एरे में लिखता है।

```cpp
int32_t System::Net::Sockets::Socket::Receive(System::ArrayPtr<uint8_t> buffer, int32_t size, SocketFlags socketFlags)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| बफ़र | System::ArrayPtr\<uint8_t\> | बाइट एरे जहाँ प्राप्त डेटा असाइन किया जाएगा। |
| size | int32_t | प्राप्त करने के लिए बाइट्स की संख्या। |
| socketFlags | SocketFlags | प्राप्ति व्यवहार। |

### ReturnValue

प्राप्त बाइट्स की संख्या।

## संबंधित देखें

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Receive(System::ArrayPtr\<uint8_t\>, SocketFlags) method


सॉकेट से डेटा प्राप्त करता है और उसे निर्दिष्ट बाइट एरे में लिखता है।

```cpp
int32_t System::Net::Sockets::Socket::Receive(System::ArrayPtr<uint8_t> buffer, SocketFlags socketFlags)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| बफ़र | System::ArrayPtr\<uint8_t\> | बाइट एरे जहाँ प्राप्त डेटा असाइन किया जाएगा। |
| socketFlags | SocketFlags | प्राप्ति व्यवहार। |

### ReturnValue

प्राप्त बाइट्स की संख्या।

## संबंधित देखें

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Receive(System::Details::ArrayView\<uint8_t\>) method


सॉकेट से डेटा प्राप्त करता है और उसे निर्दिष्ट बाइट एरे में लिखता है।

```cpp
int32_t System::Net::Sockets::Socket::Receive(System::Details::ArrayView<uint8_t> buffer)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| बफ़र | System::Details::ArrayView\<uint8_t\> | बाइट एरे जहाँ प्राप्त डेटा असाइन किया जाएगा। |

### ReturnValue

प्राप्त बाइट्स की संख्या।

## संबंधित देखें

* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Receive(System::Details::ArrayView\<uint8_t\>, int32_t, int32_t, SocketFlags) method


सॉकेट से डेटा प्राप्त करता है और उसे निर्दिष्ट बाइट एरे में लिखता है।

```cpp
int32_t System::Net::Sockets::Socket::Receive(System::Details::ArrayView<uint8_t> buffer, int32_t offset, int32_t size, SocketFlags socketFlags)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| बफ़र | System::Details::ArrayView\<uint8_t\> | बाइट एरे जहाँ प्राप्त डेटा असाइन किया जाएगा। |
| offset | int32_t | निर्दिष्ट एरे में बाइट्स में ऑफ़सेट। |
| size | int32_t | बाइट्स की संख्या जिसे प्राप्त किया जाएगा और 'ऑफ़सेट' इंडेक्स से निर्दिष्ट बाइट एरे में असाइन किया जाएगा। |
| socketFlags | SocketFlags | प्राप्ति व्यवहार। |

### ReturnValue

प्राप्त बाइट्स की संख्या।

## संबंधित देखें

* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Receive(System::Details::ArrayView\<uint8_t\>, int32_t, int32_t, SocketFlags, SocketError\&) method


सॉकेट से डेटा प्राप्त करता है और उसे निर्दिष्ट बाइट एरे में लिखता है।

```cpp
int32_t System::Net::Sockets::Socket::Receive(System::Details::ArrayView<uint8_t> buffer, int32_t offset, int32_t size, SocketFlags socketFlags, SocketError &errorCode)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| बफ़र | System::Details::ArrayView\<uint8_t\> | बाइट एरे जहाँ प्राप्त डेटा असाइन किया जाएगा। |
| offset | int32_t | निर्दिष्ट एरे में बाइट्स में ऑफ़सेट। |
| size | int32_t | बाइट्स की संख्या जिसे प्राप्त किया जाएगा और 'ऑफ़सेट' इंडेक्स से निर्दिष्ट बाइट एरे में असाइन किया जाएगा। |
| socketFlags | SocketFlags | प्राप्ति व्यवहार। |
| errorCode | SocketError\& | आउटपुट पैरामीटर जहाँ त्रुटि कोड असाइन किया जाएगा जब प्राप्ति ऑपरेशन विफल हो जाता है। |

### ReturnValue

प्राप्त बाइट्स की संख्या।

## संबंधित देखें

* Enum [SocketFlags](../../socketflags/)
* Enum [SocketError](../../socketerror/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Receive(System::Details::ArrayView\<uint8_t\>, int32_t, SocketFlags) method


सॉकेट से डेटा प्राप्त करता है और उसे निर्दिष्ट बाइट एरे में लिखता है।

```cpp
int32_t System::Net::Sockets::Socket::Receive(System::Details::ArrayView<uint8_t> buffer, int32_t size, SocketFlags socketFlags)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| बफ़र | System::Details::ArrayView\<uint8_t\> | बाइट एरे जहाँ प्राप्त डेटा असाइन किया जाएगा। |
| size | int32_t | प्राप्त करने के लिए बाइट्स की संख्या। |
| socketFlags | SocketFlags | प्राप्ति व्यवहार। |

### ReturnValue

प्राप्त बाइट्स की संख्या।

## संबंधित देखें

* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Receive(System::Details::ArrayView\<uint8_t\>, SocketFlags) method


सॉकेट से डेटा प्राप्त करता है और उसे निर्दिष्ट बाइट एरे में लिखता है।

```cpp
int32_t System::Net::Sockets::Socket::Receive(System::Details::ArrayView<uint8_t> buffer, SocketFlags socketFlags)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| बफ़र | System::Details::ArrayView\<uint8_t\> | बाइट एरे जहाँ प्राप्त डेटा असाइन किया जाएगा। |
| socketFlags | SocketFlags | प्राप्ति व्यवहार। |

### ReturnValue

प्राप्त बाइट्स की संख्या।

## संबंधित देखें

* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Receive(System::Details::StackArray\<uint8_t, N\>\&) method


सॉकेट से डेटा प्राप्त करता है और उसे निर्दिष्ट बाइट एरे में लिखता है।

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::Receive(System::Details::StackArray<uint8_t, N> &buffer)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| बफ़र | System::Details::StackArray\<uint8_t, N\>\& | बाइट एरे जहाँ प्राप्त डेटा असाइन किया जाएगा। |

### ReturnValue

प्राप्त बाइट्स की संख्या।

## संबंधित देखें

* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Receive(System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t, SocketFlags) method


सॉकेट से डेटा प्राप्त करता है और उसे निर्दिष्ट बाइट एरे में लिखता है।

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::Receive(System::Details::StackArray<uint8_t, N> &buffer, int32_t offset, int32_t size, SocketFlags socketFlags)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| बफ़र | System::Details::StackArray\<uint8_t, N\>\& | बाइट एरे जहाँ प्राप्त डेटा असाइन किया जाएगा। |
| offset | int32_t | निर्दिष्ट एरे में बाइट्स में ऑफ़सेट। |
| size | int32_t | बाइट्स की संख्या जिसे प्राप्त किया जाएगा और 'ऑफ़सेट' इंडेक्स से निर्दिष्ट बाइट एरे में असाइन किया जाएगा। |
| socketFlags | SocketFlags | प्राप्ति व्यवहार। |

### ReturnValue

प्राप्त बाइट्स की संख्या।

## संबंधित देखें

* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Receive(System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t, SocketFlags, SocketError\&) method


सॉकेट से डेटा प्राप्त करता है और उसे निर्दिष्ट बाइट एरे में लिखता है।

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::Receive(System::Details::StackArray<uint8_t, N> &buffer, int32_t offset, int32_t size, SocketFlags socketFlags, SocketError &errorCode)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| बफ़र | System::Details::StackArray\<uint8_t, N\>\& | बाइट एरे जहाँ प्राप्त डेटा असाइन किया जाएगा। |
| offset | int32_t | निर्दिष्ट एरे में बाइट्स में ऑफ़सेट। |
| size | int32_t | बाइट्स की संख्या जिसे प्राप्त किया जाएगा और 'ऑफ़सेट' इंडेक्स से निर्दिष्ट बाइट एरे में असाइन किया जाएगा। |
| socketFlags | SocketFlags | प्राप्ति व्यवहार। |
| errorCode | SocketError\& | आउटपुट पैरामीटर जहाँ त्रुटि कोड असाइन किया जाएगा जब प्राप्ति ऑपरेशन विफल हो जाता है। |

### ReturnValue

प्राप्त बाइट्स की संख्या।

## संबंधित देखें

* Enum [SocketFlags](../../socketflags/)
* Enum [SocketError](../../socketerror/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Receive(System::Details::StackArray\<uint8_t, N\>\&, int32_t, SocketFlags) method


सॉकेट से डेटा प्राप्त करता है और उसे निर्दिष्ट बाइट एरे में लिखता है।

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::Receive(System::Details::StackArray<uint8_t, N> &buffer, int32_t size, SocketFlags socketFlags)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| बफ़र | System::Details::StackArray\<uint8_t, N\>\& | बाइट एरे जहाँ प्राप्त डेटा असाइन किया जाएगा। |
| size | int32_t | प्राप्त करने के लिए बाइट्स की संख्या। |
| socketFlags | SocketFlags | प्राप्ति व्यवहार। |

### ReturnValue

प्राप्त बाइट्स की संख्या।

## संबंधित देखें

* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Receive(System::Details::StackArray\<uint8_t, N\>\&, SocketFlags) method


सॉकेट से डेटा प्राप्त करता है और उसे निर्दिष्ट बाइट एरे में लिखता है।

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::Receive(System::Details::StackArray<uint8_t, N> &buffer, SocketFlags socketFlags)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| बफ़र | System::Details::StackArray\<uint8_t, N\>\& | बाइट एरे जहाँ प्राप्त डेटा असाइन किया जाएगा। |
| socketFlags | SocketFlags | प्राप्ति व्यवहार। |

### ReturnValue

प्राप्त बाइट्स की संख्या।

## संबंधित देखें

* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Receive(System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\>) method


सॉकेट से डेटा प्राप्त करता है और उसे निर्दिष्ट बाइट एरेज़ में लिखता है।

```cpp
int32_t System::Net::Sockets::Socket::Receive(System::SharedPtr<Collections::Generic::IList<ArraySegment<uint8_t>>> buffers)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| buffers | System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\> | बाइट एरे जहाँ प्राप्त डेटा असाइन किया जाएगा। |

### ReturnValue

प्राप्त बाइट्स की संख्या।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IList](../../../system.collections.generic/ilist/)
* Class [ArraySegment](../../../system/arraysegment/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Receive(System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\>, SocketFlags) method


सॉकेट से डेटा प्राप्त करता है और उसे निर्दिष्ट बाइट एरेज़ में लिखता है।

```cpp
int32_t System::Net::Sockets::Socket::Receive(System::SharedPtr<Collections::Generic::IList<ArraySegment<uint8_t>>> buffers, SocketFlags socketFlags)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| buffers | System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\> | बाइट एरे जहाँ प्राप्त डेटा असाइन किया जाएगा। |
| socketFlags | SocketFlags | प्राप्ति व्यवहार। |

### ReturnValue

प्राप्त बाइट्स की संख्या।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IList](../../../system.collections.generic/ilist/)
* Class [ArraySegment](../../../system/arraysegment/)
* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Receive(System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\>, SocketFlags, SocketError\&) method


सॉकेट से डेटा प्राप्त करता है और उसे निर्दिष्ट बाइट एरेज़ में लिखता है।

```cpp
int32_t System::Net::Sockets::Socket::Receive(System::SharedPtr<Collections::Generic::IList<ArraySegment<uint8_t>>> buffers, SocketFlags socketFlags, SocketError &errorCode)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| buffers | System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\> | बाइट एरे जहाँ प्राप्त डेटा असाइन किया जाएगा। |
| socketFlags | SocketFlags | प्राप्ति व्यवहार। |
| errorCode | SocketError\& | आउटपुट पैरामीटर जहाँ त्रुटि कोड असाइन किया जाएगा जब प्राप्ति ऑपरेशन विफल हो जाता है। |

### ReturnValue

प्राप्त बाइट्स की संख्या।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IList](../../../system.collections.generic/ilist/)
* Class [ArraySegment](../../../system/arraysegment/)
* Enum [SocketFlags](../../socketflags/)
* Enum [SocketError](../../socketerror/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
