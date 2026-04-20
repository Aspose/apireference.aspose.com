---
title: "System::Net::Sockets::Socket::SendTo طريقة"
linktitle: "SendTo"
second_title: "Aspose.Font لـ C++"
description: "System::Net::Sockets::Socket::SendTo طريقة. يرسل البيانات المحددة إلى النقطة النهاية المحددة في C++."
type: docs
weight: 4700
url: /ar/cpp/system.net.sockets/socket/sendto/
---
## Socket::SendTo(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>) method


يرسل البيانات المحددة إلى نقطة النهاية المحددة.

```cpp
int32_t System::Net::Sockets::Socket::SendTo(System::ArrayPtr<uint8_t> buffer, int32_t offset, int32_t size, SocketFlags socketFlags, System::SharedPtr<EndPoint> remoteEP)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| buffer | System::ArrayPtr\<uint8_t\> | البيانات المراد إرسالها. |
| إزاحة | int32_t | الإزاحة بالبايت في المصفوفة المحددة. |
| size | int32_t | عدد البايتات في المصفوفة المحددة بدءًا من المعامل 'offset'. |
| socketFlags | SocketFlags | سلوك الإرسال. |
| remoteEP | System::SharedPtr\<EndPoint\> | النقطة النهائية البعيدة. |

### ReturnValue

عدد البايتات المرسلة.

## انظر أيضًا

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::SendTo(System::ArrayPtr\<uint8_t\>, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>) method


يرسل البيانات المحددة إلى نقطة النهاية المحددة.

```cpp
int32_t System::Net::Sockets::Socket::SendTo(System::ArrayPtr<uint8_t> buffer, int32_t size, SocketFlags socketFlags, System::SharedPtr<EndPoint> remoteEP)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| buffer | System::ArrayPtr\<uint8_t\> | البيانات المراد إرسالها. |
| size | int32_t | عدد البايتات في المصفوفة المحددة. |
| socketFlags | SocketFlags | سلوك الإرسال. |
| remoteEP | System::SharedPtr\<EndPoint\> | النقطة النهائية البعيدة. |

### ReturnValue

عدد البايتات المرسلة.

## انظر أيضًا

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::SendTo(System::ArrayPtr\<uint8_t\>, SocketFlags, System::SharedPtr\<EndPoint\>) method


يرسل البيانات المحددة إلى نقطة النهاية المحددة.

```cpp
int32_t System::Net::Sockets::Socket::SendTo(System::ArrayPtr<uint8_t> buffer, SocketFlags socketFlags, System::SharedPtr<EndPoint> remoteEP)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| buffer | System::ArrayPtr\<uint8_t\> | البيانات المراد إرسالها. |
| socketFlags | SocketFlags | سلوك الإرسال. |
| remoteEP | System::SharedPtr\<EndPoint\> | النقطة النهائية البعيدة. |

### ReturnValue

عدد البايتات المرسلة.

## انظر أيضًا

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::SendTo(System::ArrayPtr\<uint8_t\>, System::SharedPtr\<EndPoint\>) method


يرسل البيانات المحددة إلى نقطة النهاية المحددة.

```cpp
int32_t System::Net::Sockets::Socket::SendTo(System::ArrayPtr<uint8_t> buffer, System::SharedPtr<EndPoint> remoteEP)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| buffer | System::ArrayPtr\<uint8_t\> | البيانات المراد إرسالها. |
| remoteEP | System::SharedPtr\<EndPoint\> | النقطة النهائية البعيدة. |

### ReturnValue

عدد البايتات المرسلة.

## انظر أيضًا

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::SendTo(System::Details::ArrayView\<uint8_t\>, int32_t, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>) method


يرسل البيانات المحددة إلى نقطة النهاية المحددة.

```cpp
int32_t System::Net::Sockets::Socket::SendTo(System::Details::ArrayView<uint8_t> buffer, int32_t offset, int32_t size, SocketFlags socketFlags, System::SharedPtr<EndPoint> remoteEP)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| buffer | System::Details::ArrayView\<uint8_t\> | البيانات المراد إرسالها. |
| إزاحة | int32_t | الإزاحة بالبايت في المصفوفة المحددة. |
| size | int32_t | عدد البايتات في المصفوفة المحددة بدءًا من المعامل 'offset'. |
| socketFlags | SocketFlags | سلوك الإرسال. |
| remoteEP | System::SharedPtr\<EndPoint\> | النقطة النهائية البعيدة. |

### ReturnValue

عدد البايتات المرسلة.

## انظر أيضًا

* Enum [SocketFlags](../../socketflags/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::SendTo(System::Details::ArrayView\<uint8_t\>, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>) method


يرسل البيانات المحددة إلى نقطة النهاية المحددة.

```cpp
int32_t System::Net::Sockets::Socket::SendTo(System::Details::ArrayView<uint8_t> buffer, int32_t size, SocketFlags socketFlags, System::SharedPtr<EndPoint> remoteEP)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| buffer | System::Details::ArrayView\<uint8_t\> | البيانات المراد إرسالها. |
| size | int32_t | عدد البايتات في المصفوفة المحددة. |
| socketFlags | SocketFlags | سلوك الإرسال. |
| remoteEP | System::SharedPtr\<EndPoint\> | النقطة النهائية البعيدة. |

### ReturnValue

عدد البايتات المرسلة.

## انظر أيضًا

* Enum [SocketFlags](../../socketflags/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::SendTo(System::Details::ArrayView\<uint8_t\>, SocketFlags, System::SharedPtr\<EndPoint\>) method


يرسل البيانات المحددة إلى نقطة النهاية المحددة.

```cpp
int32_t System::Net::Sockets::Socket::SendTo(System::Details::ArrayView<uint8_t> buffer, SocketFlags socketFlags, System::SharedPtr<EndPoint> remoteEP)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| buffer | System::Details::ArrayView\<uint8_t\> | البيانات المراد إرسالها. |
| socketFlags | SocketFlags | سلوك الإرسال. |
| remoteEP | System::SharedPtr\<EndPoint\> | النقطة النهائية البعيدة. |

### ReturnValue

عدد البايتات المرسلة.

## انظر أيضًا

* Enum [SocketFlags](../../socketflags/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::SendTo(System::Details::ArrayView\<uint8_t\>, System::SharedPtr\<EndPoint\>) method


يرسل البيانات المحددة إلى نقطة النهاية المحددة.

```cpp
int32_t System::Net::Sockets::Socket::SendTo(System::Details::ArrayView<uint8_t> buffer, System::SharedPtr<EndPoint> remoteEP)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| buffer | System::Details::ArrayView\<uint8_t\> | البيانات المراد إرسالها. |
| remoteEP | System::SharedPtr\<EndPoint\> | النقطة النهائية البعيدة. |

### ReturnValue

عدد البايتات المرسلة.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::SendTo(System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>) method


يرسل البيانات المحددة إلى نقطة النهاية المحددة.

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::SendTo(System::Details::StackArray<uint8_t, N> &buffer, int32_t offset, int32_t size, SocketFlags socketFlags, System::SharedPtr<EndPoint> remoteEP)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| buffer | System::Details::StackArray\<uint8_t, N\>\& | البيانات المراد إرسالها. |
| إزاحة | int32_t | الإزاحة بالبايت في المصفوفة المحددة. |
| size | int32_t | عدد البايتات في المصفوفة المحددة بدءًا من المعامل 'offset'. |
| socketFlags | SocketFlags | سلوك الإرسال. |
| remoteEP | System::SharedPtr\<EndPoint\> | النقطة النهائية البعيدة. |

### ReturnValue

عدد البايتات المرسلة.

## انظر أيضًا

* Enum [SocketFlags](../../socketflags/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::SendTo(System::Details::StackArray\<uint8_t, N\>\&, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>) method


يرسل البيانات المحددة إلى نقطة النهاية المحددة.

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::SendTo(System::Details::StackArray<uint8_t, N> &buffer, int32_t size, SocketFlags socketFlags, System::SharedPtr<EndPoint> remoteEP)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| buffer | System::Details::StackArray\<uint8_t, N\>\& | البيانات المراد إرسالها. |
| size | int32_t | عدد البايتات في المصفوفة المحددة. |
| socketFlags | SocketFlags | سلوك الإرسال. |
| remoteEP | System::SharedPtr\<EndPoint\> | النقطة النهائية البعيدة. |

### ReturnValue

عدد البايتات المرسلة.

## انظر أيضًا

* Enum [SocketFlags](../../socketflags/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::SendTo(System::Details::StackArray\<uint8_t, N\>\&, SocketFlags, System::SharedPtr\<EndPoint\>) method


يرسل البيانات المحددة إلى نقطة النهاية المحددة.

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::SendTo(System::Details::StackArray<uint8_t, N> &buffer, SocketFlags socketFlags, System::SharedPtr<EndPoint> remoteEP)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| buffer | System::Details::StackArray\<uint8_t, N\>\& | البيانات المراد إرسالها. |
| socketFlags | SocketFlags | سلوك الإرسال. |
| remoteEP | System::SharedPtr\<EndPoint\> | النقطة النهائية البعيدة. |

### ReturnValue

عدد البايتات المرسلة.

## انظر أيضًا

* Enum [SocketFlags](../../socketflags/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::SendTo(System::Details::StackArray\<uint8_t, N\>\&, System::SharedPtr\<EndPoint\>) method


يرسل البيانات المحددة إلى نقطة النهاية المحددة.

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::SendTo(System::Details::StackArray<uint8_t, N> &buffer, System::SharedPtr<EndPoint> remoteEP)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| buffer | System::Details::StackArray\<uint8_t, N\>\& | البيانات المراد إرسالها. |
| remoteEP | System::SharedPtr\<EndPoint\> | النقطة النهائية البعيدة. |

### ReturnValue

عدد البايتات المرسلة.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
