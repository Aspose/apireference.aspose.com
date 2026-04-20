---
title: "System::Net::Sockets::Socket::ReceiveFrom طريقة"
linktitle: "ReceiveFrom"
second_title: "Aspose.Font لـ C++"
description: "System::Net::Sockets::Socket::ReceiveFrom طريقة. يستقبل البيانات من النقطة النهائية المحددة ويكتبها إلى مصفوفة البايت المحددة في C++."
type: docs
weight: 4400
url: /ar/cpp/system.net.sockets/socket/receivefrom/
---
## Socket::ReceiveFrom(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>\&) method


يتلقى البيانات من نقطة النهاية المحددة ويكتبها إلى مصفوفة البايت المحددة.

```cpp
int32_t System::Net::Sockets::Socket::ReceiveFrom(System::ArrayPtr<uint8_t> buffer, int32_t offset, int32_t size, SocketFlags socketFlags, System::SharedPtr<EndPoint> &remoteEP)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| buffer | System::ArrayPtr\<uint8_t\> | مصفوفة البايت التي سيتم تعيين البيانات المستلمة فيها. |
| إزاحة | int32_t | الإزاحة بالبايت في المصفوفة المحددة. |
| size | int32_t | عدد البايتات التي سيتم استقبالها وتعيينها إلى مصفوفة البايت المحددة بدءًا من الفهرس 'offset'. |
| socketFlags | SocketFlags | سلوك الاستقبال. |
| remoteEP | System::SharedPtr\<EndPoint\>\& | النقطة النهائية البعيدة. |

### ReturnValue

عدد البايتات المستلمة.

## انظر أيضًا

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::ReceiveFrom(System::ArrayPtr\<uint8_t\>, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>\&) method


يتلقى البيانات من نقطة النهاية المحددة ويكتبها إلى مصفوفة البايت المحددة.

```cpp
int32_t System::Net::Sockets::Socket::ReceiveFrom(System::ArrayPtr<uint8_t> buffer, int32_t size, SocketFlags socketFlags, System::SharedPtr<EndPoint> &remoteEP)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| buffer | System::ArrayPtr\<uint8_t\> | مصفوفة البايت التي سيتم تعيين البيانات المستلمة فيها. |
| size | int32_t | عدد البايتات التي سيتم استقبالها وتعيينها إلى مصفوفة البايت المحددة بدءًا من الفهرس 'offset'. |
| socketFlags | SocketFlags | سلوك الاستقبال. |
| remoteEP | System::SharedPtr\<EndPoint\>\& | النقطة النهائية البعيدة. |

### ReturnValue

عدد البايتات المستلمة.

## انظر أيضًا

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::ReceiveFrom(System::ArrayPtr\<uint8_t\>, SocketFlags, System::SharedPtr\<EndPoint\>\&) method


يتلقى البيانات من نقطة النهاية المحددة ويكتبها إلى مصفوفة البايت المحددة.

```cpp
int32_t System::Net::Sockets::Socket::ReceiveFrom(System::ArrayPtr<uint8_t> buffer, SocketFlags socketFlags, System::SharedPtr<EndPoint> &remoteEP)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| buffer | System::ArrayPtr\<uint8_t\> | مصفوفة البايت التي سيتم تعيين البيانات المستلمة فيها. |
| socketFlags | SocketFlags | سلوك الاستقبال. |
| remoteEP | System::SharedPtr\<EndPoint\>\& | النقطة النهائية البعيدة. |

### ReturnValue

عدد البايتات المستلمة.

## انظر أيضًا

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::ReceiveFrom(System::ArrayPtr\<uint8_t\>, SocketFlags, System::SharedPtr\<EndPoint\>\&) method


يتلقى البيانات من نقطة النهاية المحددة ويكتبها إلى مصفوفة البايت المحددة.

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::ReceiveFrom(System::ArrayPtr<uint8_t> buffer, SocketFlags socketFlags, System::SharedPtr<EndPoint> &remoteEP)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| buffer | System::ArrayPtr\<uint8_t\> | مصفوفة البايت التي سيتم تعيين البيانات المستلمة فيها. |
| socketFlags | SocketFlags | سلوك الاستقبال. |
| remoteEP | System::SharedPtr\<EndPoint\>\& | النقطة النهائية البعيدة. |

### ReturnValue

عدد البايتات المستلمة.

## انظر أيضًا

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::ReceiveFrom(System::ArrayPtr\<uint8_t\>, System::SharedPtr\<EndPoint\>\&) method


يتلقى البيانات من نقطة النهاية المحددة ويكتبها إلى مصفوفة البايت المحددة.

```cpp
int32_t System::Net::Sockets::Socket::ReceiveFrom(System::ArrayPtr<uint8_t> buffer, System::SharedPtr<EndPoint> &remoteEP)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| buffer | System::ArrayPtr\<uint8_t\> | مصفوفة البايت التي سيتم تعيين البيانات المستلمة فيها. |
| remoteEP | System::SharedPtr\<EndPoint\>\& | النقطة النهائية البعيدة. |

### ReturnValue

عدد البايتات المستلمة.

## انظر أيضًا

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::ReceiveFrom(System::Details::ArrayView\<uint8_t\>, int32_t, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>\&) method


يتلقى البيانات من نقطة النهاية المحددة ويكتبها إلى مصفوفة البايت المحددة.

```cpp
int32_t System::Net::Sockets::Socket::ReceiveFrom(System::Details::ArrayView<uint8_t> buffer, int32_t offset, int32_t size, SocketFlags socketFlags, System::SharedPtr<EndPoint> &remoteEP)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| buffer | System::Details::ArrayView\<uint8_t\> | مصفوفة البايت التي سيتم تعيين البيانات المستلمة فيها. |
| إزاحة | int32_t | الإزاحة بالبايت في المصفوفة المحددة. |
| size | int32_t | عدد البايتات التي سيتم استقبالها وتعيينها إلى مصفوفة البايت المحددة بدءًا من الفهرس 'offset'. |
| socketFlags | SocketFlags | سلوك الاستقبال. |
| remoteEP | System::SharedPtr\<EndPoint\>\& | النقطة النهائية البعيدة. |

### ReturnValue

عدد البايتات المستلمة.

## انظر أيضًا

* Enum [SocketFlags](../../socketflags/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::ReceiveFrom(System::Details::ArrayView\<uint8_t\>, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>\&) method


يتلقى البيانات من نقطة النهاية المحددة ويكتبها إلى مصفوفة البايت المحددة.

```cpp
int32_t System::Net::Sockets::Socket::ReceiveFrom(System::Details::ArrayView<uint8_t> buffer, int32_t size, SocketFlags socketFlags, System::SharedPtr<EndPoint> &remoteEP)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| buffer | System::Details::ArrayView\<uint8_t\> | مصفوفة البايت التي سيتم تعيين البيانات المستلمة فيها. |
| size | int32_t | عدد البايتات التي سيتم استقبالها وتعيينها إلى مصفوفة البايت المحددة بدءًا من الفهرس 'offset'. |
| socketFlags | SocketFlags | سلوك الاستقبال. |
| remoteEP | System::SharedPtr\<EndPoint\>\& | النقطة النهائية البعيدة. |

### ReturnValue

عدد البايتات المستلمة.

## انظر أيضًا

* Enum [SocketFlags](../../socketflags/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::ReceiveFrom(System::Details::ArrayView\<uint8_t\>, SocketFlags, System::SharedPtr\<EndPoint\>\&) method


يتلقى البيانات من نقطة النهاية المحددة ويكتبها إلى مصفوفة البايت المحددة.

```cpp
int32_t System::Net::Sockets::Socket::ReceiveFrom(System::Details::ArrayView<uint8_t> buffer, SocketFlags socketFlags, System::SharedPtr<EndPoint> &remoteEP)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| buffer | System::Details::ArrayView\<uint8_t\> | مصفوفة البايت التي سيتم تعيين البيانات المستلمة فيها. |
| socketFlags | SocketFlags | سلوك الاستقبال. |
| remoteEP | System::SharedPtr\<EndPoint\>\& | النقطة النهائية البعيدة. |

### ReturnValue

عدد البايتات المستلمة.

## انظر أيضًا

* Enum [SocketFlags](../../socketflags/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::ReceiveFrom(System::Details::ArrayView\<uint8_t\>, System::SharedPtr\<EndPoint\>\&) method


يتلقى البيانات من نقطة النهاية المحددة ويكتبها إلى مصفوفة البايت المحددة.

```cpp
int32_t System::Net::Sockets::Socket::ReceiveFrom(System::Details::ArrayView<uint8_t> buffer, System::SharedPtr<EndPoint> &remoteEP)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| buffer | System::Details::ArrayView\<uint8_t\> | مصفوفة البايت التي سيتم تعيين البيانات المستلمة فيها. |
| remoteEP | System::SharedPtr\<EndPoint\>\& | النقطة النهائية البعيدة. |

### ReturnValue

عدد البايتات المستلمة.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::ReceiveFrom(System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>\&) method


يتلقى البيانات من نقطة النهاية المحددة ويكتبها إلى مصفوفة البايت المحددة.

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::ReceiveFrom(System::Details::StackArray<uint8_t, N> &buffer, int32_t offset, int32_t size, SocketFlags socketFlags, System::SharedPtr<EndPoint> &remoteEP)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| buffer | System::Details::StackArray\<uint8_t, N\>\& | مصفوفة البايت التي سيتم تعيين البيانات المستلمة فيها. |
| إزاحة | int32_t | الإزاحة بالبايت في المصفوفة المحددة. |
| size | int32_t | عدد البايتات التي سيتم استقبالها وتعيينها إلى مصفوفة البايت المحددة بدءًا من الفهرس 'offset'. |
| socketFlags | SocketFlags | سلوك الاستقبال. |
| remoteEP | System::SharedPtr\<EndPoint\>\& | النقطة النهائية البعيدة. |

### ReturnValue

عدد البايتات المستلمة.

## انظر أيضًا

* Enum [SocketFlags](../../socketflags/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::ReceiveFrom(System::Details::StackArray\<uint8_t, N\>\&, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>\&) method


يتلقى البيانات من نقطة النهاية المحددة ويكتبها إلى مصفوفة البايت المحددة.

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::ReceiveFrom(System::Details::StackArray<uint8_t, N> &buffer, int32_t size, SocketFlags socketFlags, System::SharedPtr<EndPoint> &remoteEP)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| buffer | System::Details::StackArray\<uint8_t, N\>\& | مصفوفة البايت التي سيتم تعيين البيانات المستلمة فيها. |
| size | int32_t | عدد البايتات التي سيتم استقبالها وتعيينها إلى مصفوفة البايت المحددة بدءًا من الفهرس 'offset'. |
| socketFlags | SocketFlags | سلوك الاستقبال. |
| remoteEP | System::SharedPtr\<EndPoint\>\& | النقطة النهائية البعيدة. |

### ReturnValue

عدد البايتات المستلمة.

## انظر أيضًا

* Enum [SocketFlags](../../socketflags/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::ReceiveFrom(System::Details::StackArray\<uint8_t, N\>\&, System::SharedPtr\<EndPoint\>\&) method


يتلقى البيانات من نقطة النهاية المحددة ويكتبها إلى مصفوفة البايت المحددة.

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::ReceiveFrom(System::Details::StackArray<uint8_t, N> &buffer, System::SharedPtr<EndPoint> &remoteEP)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| buffer | System::Details::StackArray\<uint8_t, N\>\& | مصفوفة البايت التي سيتم تعيين البيانات المستلمة فيها. |
| remoteEP | System::SharedPtr\<EndPoint\>\& | النقطة النهائية البعيدة. |

### ReturnValue

عدد البايتات المستلمة.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
