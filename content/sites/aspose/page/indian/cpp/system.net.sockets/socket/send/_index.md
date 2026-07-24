---
title: "System::Net::Sockets::Socket::Send method"
linktitle: "भेजें"
second_title: "Aspose.Page C++ के लिए"
description: "System::Net::Sockets::Socket::Send method. निर्दिष्ट डेटा को C++ में सॉकेट पर भेजता है।"
type: docs
weight: 4600
url: /hi/cpp/system.net.sockets/socket/send/
---
## Socket::Send(System::ArrayPtr\<uint8_t\>) method


निर्दिष्ट डेटा को सॉकेट को भेजता है।

```cpp
int32_t System::Net::Sockets::Socket::Send(System::ArrayPtr<uint8_t> buffer)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| बफ़र | System::ArrayPtr\<uint8_t\> | भेजने के लिए डेटा। |

### ReturnValue

भेजे गए बाइट्स की संख्या।

## संबंधित देखें

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Send(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags) method


निर्दिष्ट डेटा को सॉकेट को भेजता है।

```cpp
int32_t System::Net::Sockets::Socket::Send(System::ArrayPtr<uint8_t> buffer, int32_t offset, int32_t size, SocketFlags socketFlags)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| बफ़र | System::ArrayPtr\<uint8_t\> | भेजने के लिए डेटा। |
| offset | int32_t | निर्दिष्ट एरे में बाइट्स में ऑफ़सेट। |
| size | int32_t | निर्दिष्ट एरे में 'ऑफ़सेट' पैरामीटर से शुरू होने वाले बाइट्स की संख्या। |
| socketFlags | SocketFlags | भेजने का व्यवहार। |

### ReturnValue

भेजे गए बाइट्स की संख्या।

## संबंधित देखें

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Send(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags, SocketError\&) method


निर्दिष्ट डेटा को सॉकेट को भेजता है।

```cpp
int32_t System::Net::Sockets::Socket::Send(System::ArrayPtr<uint8_t> buffer, int32_t offset, int32_t size, SocketFlags socketFlags, SocketError &errorCode)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| बफ़र | System::ArrayPtr\<uint8_t\> | भेजने के लिए डेटा। |
| offset | int32_t | निर्दिष्ट एरे में बाइट्स में ऑफ़सेट। |
| size | int32_t | निर्दिष्ट एरे में 'ऑफ़सेट' पैरामीटर से शुरू होने वाले बाइट्स की संख्या। |
| socketFlags | SocketFlags | भेजने का व्यवहार। |
| errorCode | SocketError\& | आउटपुट पैरामीटर जहाँ त्रुटि कोड असाइन किया जाएगा जब भेजने वाला ऑपरेशन विफल हो जाता है। |

### ReturnValue

भेजे गए बाइट्स की संख्या।

## संबंधित देखें

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Enum [SocketError](../../socketerror/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Send(System::ArrayPtr\<uint8_t\>, int32_t, SocketFlags) method


निर्दिष्ट डेटा को सॉकेट को भेजता है।

```cpp
int32_t System::Net::Sockets::Socket::Send(System::ArrayPtr<uint8_t> buffer, int32_t size, SocketFlags socketFlags)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| बफ़र | System::ArrayPtr\<uint8_t\> | भेजने के लिए डेटा। |
| size | int32_t | निर्दिष्ट डेटा से भेजे जाने वाले बाइट्स की संख्या। |
| socketFlags | SocketFlags | भेजने का व्यवहार। |

### ReturnValue

भेजे गए बाइट्स की संख्या।

## संबंधित देखें

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Send(System::ArrayPtr\<uint8_t\>, SocketFlags) method


निर्दिष्ट डेटा को सॉकेट को भेजता है।

```cpp
int32_t System::Net::Sockets::Socket::Send(System::ArrayPtr<uint8_t> buffer, SocketFlags socketFlags)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| बफ़र | System::ArrayPtr\<uint8_t\> | भेजने के लिए डेटा। |
| socketFlags | SocketFlags | भेजने का व्यवहार। |

### ReturnValue

भेजे गए बाइट्स की संख्या।

## संबंधित देखें

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Send(System::Details::ArrayView\<uint8_t\>) method


निर्दिष्ट डेटा को सॉकेट को भेजता है।

```cpp
int32_t System::Net::Sockets::Socket::Send(System::Details::ArrayView<uint8_t> buffer)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| बफ़र | System::Details::ArrayView\<uint8_t\> | भेजने के लिए डेटा। |

### ReturnValue

भेजे गए बाइट्स की संख्या।

## संबंधित देखें

* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Send(System::Details::ArrayView\<uint8_t\>, int32_t, int32_t, SocketFlags) method


निर्दिष्ट डेटा को सॉकेट को भेजता है।

```cpp
int32_t System::Net::Sockets::Socket::Send(System::Details::ArrayView<uint8_t> buffer, int32_t offset, int32_t size, SocketFlags socketFlags)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| बफ़र | System::Details::ArrayView\<uint8_t\> | भेजने के लिए डेटा। |
| offset | int32_t | निर्दिष्ट एरे में बाइट्स में ऑफ़सेट। |
| size | int32_t | निर्दिष्ट एरे में 'ऑफ़सेट' पैरामीटर से शुरू होने वाले बाइट्स की संख्या। |
| socketFlags | SocketFlags | भेजने का व्यवहार। |

### ReturnValue

भेजे गए बाइट्स की संख्या।

## संबंधित देखें

* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Send(System::Details::ArrayView\<uint8_t\>, int32_t, int32_t, SocketFlags, SocketError\&) method


निर्दिष्ट डेटा को सॉकेट को भेजता है।

```cpp
int32_t System::Net::Sockets::Socket::Send(System::Details::ArrayView<uint8_t> buffer, int32_t offset, int32_t size, SocketFlags socketFlags, SocketError &errorCode)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| बफ़र | System::Details::ArrayView\<uint8_t\> | भेजने के लिए डेटा। |
| offset | int32_t | निर्दिष्ट एरे में बाइट्स में ऑफ़सेट। |
| size | int32_t | निर्दिष्ट एरे में 'ऑफ़सेट' पैरामीटर से शुरू होने वाले बाइट्स की संख्या। |
| socketFlags | SocketFlags | भेजने का व्यवहार। |
| errorCode | SocketError\& | आउटपुट पैरामीटर जहाँ त्रुटि कोड असाइन किया जाएगा जब भेजने वाला ऑपरेशन विफल हो जाता है। |

### ReturnValue

भेजे गए बाइट्स की संख्या।

## संबंधित देखें

* Enum [SocketFlags](../../socketflags/)
* Enum [SocketError](../../socketerror/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Send(System::Details::ArrayView\<uint8_t\>, int32_t, SocketFlags) method


निर्दिष्ट डेटा को सॉकेट को भेजता है।

```cpp
int32_t System::Net::Sockets::Socket::Send(System::Details::ArrayView<uint8_t> buffer, int32_t size, SocketFlags socketFlags)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| बफ़र | System::Details::ArrayView\<uint8_t\> | भेजने के लिए डेटा। |
| size | int32_t | निर्दिष्ट डेटा से भेजे जाने वाले बाइट्स की संख्या। |
| socketFlags | SocketFlags | भेजने का व्यवहार। |

### ReturnValue

भेजे गए बाइट्स की संख्या।

## संबंधित देखें

* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Send(System::Details::ArrayView\<uint8_t\>, SocketFlags) method


निर्दिष्ट डेटा को सॉकेट को भेजता है।

```cpp
int32_t System::Net::Sockets::Socket::Send(System::Details::ArrayView<uint8_t> buffer, SocketFlags socketFlags)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| बफ़र | System::Details::ArrayView\<uint8_t\> | भेजने के लिए डेटा। |
| socketFlags | SocketFlags | भेजने का व्यवहार। |

### ReturnValue

भेजे गए बाइट्स की संख्या।

## संबंधित देखें

* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Send(System::Details::StackArray\<uint8_t, N\>\&) method


निर्दिष्ट डेटा को सॉकेट को भेजता है।

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::Send(System::Details::StackArray<uint8_t, N> &buffer)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| बफ़र | System::Details::StackArray\<uint8_t, N\>\& | भेजने के लिए डेटा। |

### ReturnValue

भेजे गए बाइट्स की संख्या।

## संबंधित देखें

* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Send(System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t, SocketFlags) method


निर्दिष्ट डेटा को सॉकेट को भेजता है।

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::Send(System::Details::StackArray<uint8_t, N> &buffer, int32_t offset, int32_t size, SocketFlags socketFlags)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| बफ़र | System::Details::StackArray\<uint8_t, N\>\& | भेजने के लिए डेटा। |
| offset | int32_t | निर्दिष्ट एरे में बाइट्स में ऑफ़सेट। |
| size | int32_t | निर्दिष्ट एरे में 'ऑफ़सेट' पैरामीटर से शुरू होने वाले बाइट्स की संख्या। |
| socketFlags | SocketFlags | भेजने का व्यवहार। |

### ReturnValue

भेजे गए बाइट्स की संख्या।

## संबंधित देखें

* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Send(System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t, SocketFlags, SocketError\&) method


निर्दिष्ट डेटा को सॉकेट को भेजता है।

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::Send(System::Details::StackArray<uint8_t, N> &buffer, int32_t offset, int32_t size, SocketFlags socketFlags, SocketError &errorCode)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| बफ़र | System::Details::StackArray\<uint8_t, N\>\& | भेजने के लिए डेटा। |
| offset | int32_t | निर्दिष्ट एरे में बाइट्स में ऑफ़सेट। |
| size | int32_t | निर्दिष्ट एरे में 'ऑफ़सेट' पैरामीटर से शुरू होने वाले बाइट्स की संख्या। |
| socketFlags | SocketFlags | भेजने का व्यवहार। |
| errorCode | SocketError\& | आउटपुट पैरामीटर जहाँ त्रुटि कोड असाइन किया जाएगा जब भेजने वाला ऑपरेशन विफल हो जाता है। |

### ReturnValue

भेजे गए बाइट्स की संख्या।

## संबंधित देखें

* Enum [SocketFlags](../../socketflags/)
* Enum [SocketError](../../socketerror/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Send(System::Details::StackArray\<uint8_t, N\>\&, int32_t, SocketFlags) method


निर्दिष्ट डेटा को सॉकेट को भेजता है।

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::Send(System::Details::StackArray<uint8_t, N> &buffer, int32_t size, SocketFlags socketFlags)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| बफ़र | System::Details::StackArray\<uint8_t, N\>\& | भेजने के लिए डेटा। |
| size | int32_t | निर्दिष्ट डेटा से भेजे जाने वाले बाइट्स की संख्या। |
| socketFlags | SocketFlags | भेजने का व्यवहार। |

### ReturnValue

भेजे गए बाइट्स की संख्या।

## संबंधित देखें

* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Send(System::Details::StackArray\<uint8_t, N\>\&, SocketFlags) method


निर्दिष्ट डेटा को सॉकेट को भेजता है।

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::Send(System::Details::StackArray<uint8_t, N> &buffer, SocketFlags socketFlags)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| बफ़र | System::Details::StackArray\<uint8_t, N\>\& | भेजने के लिए डेटा। |
| socketFlags | SocketFlags | भेजने का व्यवहार। |

### ReturnValue

भेजे गए बाइट्स की संख्या।

## संबंधित देखें

* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Send(System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\>) method


निर्दिष्ट डेटा को सॉकेट को भेजता है।

```cpp
int32_t System::Net::Sockets::Socket::Send(System::SharedPtr<Collections::Generic::IList<ArraySegment<uint8_t>>> buffers)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| buffers | System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\> | डेटा भेजे जाने वाले बाइट एरेज़ का एक संग्रह। |

### ReturnValue

भेजे गए बाइट्स की संख्या।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IList](../../../system.collections.generic/ilist/)
* Class [ArraySegment](../../../system/arraysegment/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Send(System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\>, SocketFlags) method


निर्दिष्ट डेटा को सॉकेट को भेजता है।

```cpp
int32_t System::Net::Sockets::Socket::Send(System::SharedPtr<Collections::Generic::IList<ArraySegment<uint8_t>>> buffers, SocketFlags socketFlags)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| buffers | System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\> | डेटा भेजे जाने वाले बाइट एरेज़ का एक संग्रह। |
| socketFlags | SocketFlags | भेजने का व्यवहार। |

### ReturnValue

भेजे गए बाइट्स की संख्या।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IList](../../../system.collections.generic/ilist/)
* Class [ArraySegment](../../../system/arraysegment/)
* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Send(System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\>, SocketFlags, SocketError\&) method


निर्दिष्ट डेटा को सॉकेट को भेजता है।

```cpp
int32_t System::Net::Sockets::Socket::Send(System::SharedPtr<Collections::Generic::IList<ArraySegment<uint8_t>>> buffers, SocketFlags socketFlags, SocketError &errorCode)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| buffers | System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\> | डेटा भेजे जाने वाले बाइट एरेज़ का एक संग्रह। |
| socketFlags | SocketFlags | भेजने का व्यवहार। |
| errorCode | SocketError\& | आउटपुट पैरामीटर जहाँ त्रुटि कोड असाइन किया जाएगा जब भेजने वाला ऑपरेशन विफल हो जाता है। |

### ReturnValue

भेजे गए बाइट्स की संख्या।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IList](../../../system.collections.generic/ilist/)
* Class [ArraySegment](../../../system/arraysegment/)
* Enum [SocketFlags](../../socketflags/)
* Enum [SocketError](../../socketerror/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
