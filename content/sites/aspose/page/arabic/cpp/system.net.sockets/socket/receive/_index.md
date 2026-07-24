---
title: "طريقة System::Net::Sockets::Socket::Receive"
linktitle: "استلام"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::Net::Sockets::Socket::Receive. تستقبل البيانات من المقبس وتكتبها إلى مصفوفة البايت المحددة في C++."
type: docs
weight: 4300
url: /ar/cpp/system.net.sockets/socket/receive/
---
## Socket::Receive(System::ArrayPtr\<uint8_t\>) method


يتلقى البيانات من المقبس ويكتبها إلى مصفوفة البايت المحددة.

```cpp
int32_t System::Net::Sockets::Socket::Receive(System::ArrayPtr<uint8_t> buffer)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| المخزن المؤقت | System::ArrayPtr\<uint8_t\> | مصفوفة البايت التي سيتم تعيين البيانات المستلمة فيها. |

### ReturnValue

عدد البايتات المستلمة.

## انظر أيضًا

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Receive(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags) method


يتلقى البيانات من المقبس ويكتبها إلى مصفوفة البايت المحددة.

```cpp
int32_t System::Net::Sockets::Socket::Receive(System::ArrayPtr<uint8_t> buffer, int32_t offset, int32_t size, SocketFlags socketFlags)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| المخزن المؤقت | System::ArrayPtr\<uint8_t\> | مصفوفة البايت التي سيتم تعيين البيانات المستلمة فيها. |
| الإزاحة | int32_t | الإزاحة بالبايت في المصفوفة المحددة. |
| size | int32_t | عدد البايتات التي سيتم استقبالها وتعيينها إلى مصفوفة البايت المحددة بدءًا من الفهرس 'offset'. |
| socketFlags | SocketFlags | سلوك الاستقبال. |

### ReturnValue

عدد البايتات المستلمة.

## انظر أيضًا

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Receive(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags, SocketError\&) method


يتلقى البيانات من المقبس ويكتبها إلى مصفوفة البايت المحددة.

```cpp
int32_t System::Net::Sockets::Socket::Receive(System::ArrayPtr<uint8_t> buffer, int32_t offset, int32_t size, SocketFlags socketFlags, SocketError &errorCode)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| المخزن المؤقت | System::ArrayPtr\<uint8_t\> | مصفوفة البايت التي سيتم تعيين البيانات المستلمة فيها. |
| الإزاحة | int32_t | الإزاحة بالبايت في المصفوفة المحددة. |
| size | int32_t | عدد البايتات التي سيتم استقبالها وتعيينها إلى مصفوفة البايت المحددة بدءًا من الفهرس 'offset'. |
| socketFlags | SocketFlags | سلوك الاستقبال. |
| errorCode | SocketError\& | معامل الإخراج الذي سيتم تعيين رمز الخطأ فيه عندما تفشل عملية الاستقبال. |

### ReturnValue

عدد البايتات المستلمة.

## انظر أيضًا

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Enum [SocketError](../../socketerror/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Receive(System::ArrayPtr\<uint8_t\>, int32_t, SocketFlags) method


يتلقى البيانات من المقبس ويكتبها إلى مصفوفة البايت المحددة.

```cpp
int32_t System::Net::Sockets::Socket::Receive(System::ArrayPtr<uint8_t> buffer, int32_t size, SocketFlags socketFlags)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| المخزن المؤقت | System::ArrayPtr\<uint8_t\> | مصفوفة البايت التي سيتم تعيين البيانات المستلمة فيها. |
| size | int32_t | عدد البايتات التي سيتم استقبالها. |
| socketFlags | SocketFlags | سلوك الاستقبال. |

### ReturnValue

عدد البايتات المستلمة.

## انظر أيضًا

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Receive(System::ArrayPtr\<uint8_t\>, SocketFlags) method


يتلقى البيانات من المقبس ويكتبها إلى مصفوفة البايت المحددة.

```cpp
int32_t System::Net::Sockets::Socket::Receive(System::ArrayPtr<uint8_t> buffer, SocketFlags socketFlags)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| المخزن المؤقت | System::ArrayPtr\<uint8_t\> | مصفوفة البايت التي سيتم تعيين البيانات المستلمة فيها. |
| socketFlags | SocketFlags | سلوك الاستقبال. |

### ReturnValue

عدد البايتات المستلمة.

## انظر أيضًا

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Receive(System::Details::ArrayView\<uint8_t\>) method


يتلقى البيانات من المقبس ويكتبها إلى مصفوفة البايت المحددة.

```cpp
int32_t System::Net::Sockets::Socket::Receive(System::Details::ArrayView<uint8_t> buffer)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| المخزن المؤقت | System::Details::ArrayView\<uint8_t\> | مصفوفة البايت التي سيتم تعيين البيانات المستلمة فيها. |

### ReturnValue

عدد البايتات المستلمة.

## انظر أيضًا

* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Receive(System::Details::ArrayView\<uint8_t\>, int32_t, int32_t, SocketFlags) method


يتلقى البيانات من المقبس ويكتبها إلى مصفوفة البايت المحددة.

```cpp
int32_t System::Net::Sockets::Socket::Receive(System::Details::ArrayView<uint8_t> buffer, int32_t offset, int32_t size, SocketFlags socketFlags)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| المخزن المؤقت | System::Details::ArrayView\<uint8_t\> | مصفوفة البايت التي سيتم تعيين البيانات المستلمة فيها. |
| الإزاحة | int32_t | الإزاحة بالبايت في المصفوفة المحددة. |
| size | int32_t | عدد البايتات التي سيتم استقبالها وتعيينها إلى مصفوفة البايت المحددة بدءًا من الفهرس 'offset'. |
| socketFlags | SocketFlags | سلوك الاستقبال. |

### ReturnValue

عدد البايتات المستلمة.

## انظر أيضًا

* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Receive(System::Details::ArrayView\<uint8_t\>, int32_t, int32_t, SocketFlags, SocketError\&) method


يتلقى البيانات من المقبس ويكتبها إلى مصفوفة البايت المحددة.

```cpp
int32_t System::Net::Sockets::Socket::Receive(System::Details::ArrayView<uint8_t> buffer, int32_t offset, int32_t size, SocketFlags socketFlags, SocketError &errorCode)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| المخزن المؤقت | System::Details::ArrayView\<uint8_t\> | مصفوفة البايت التي سيتم تعيين البيانات المستلمة فيها. |
| الإزاحة | int32_t | الإزاحة بالبايت في المصفوفة المحددة. |
| size | int32_t | عدد البايتات التي سيتم استقبالها وتعيينها إلى مصفوفة البايت المحددة بدءًا من الفهرس 'offset'. |
| socketFlags | SocketFlags | سلوك الاستقبال. |
| errorCode | SocketError\& | معامل الإخراج الذي سيتم تعيين رمز الخطأ فيه عندما تفشل عملية الاستقبال. |

### ReturnValue

عدد البايتات المستلمة.

## انظر أيضًا

* Enum [SocketFlags](../../socketflags/)
* Enum [SocketError](../../socketerror/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Receive(System::Details::ArrayView\<uint8_t\>, int32_t, SocketFlags) method


يتلقى البيانات من المقبس ويكتبها إلى مصفوفة البايت المحددة.

```cpp
int32_t System::Net::Sockets::Socket::Receive(System::Details::ArrayView<uint8_t> buffer, int32_t size, SocketFlags socketFlags)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| المخزن المؤقت | System::Details::ArrayView\<uint8_t\> | مصفوفة البايت التي سيتم تعيين البيانات المستلمة فيها. |
| size | int32_t | عدد البايتات التي سيتم استقبالها. |
| socketFlags | SocketFlags | سلوك الاستقبال. |

### ReturnValue

عدد البايتات المستلمة.

## انظر أيضًا

* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Receive(System::Details::ArrayView\<uint8_t\>, SocketFlags) method


يتلقى البيانات من المقبس ويكتبها إلى مصفوفة البايت المحددة.

```cpp
int32_t System::Net::Sockets::Socket::Receive(System::Details::ArrayView<uint8_t> buffer, SocketFlags socketFlags)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| المخزن المؤقت | System::Details::ArrayView\<uint8_t\> | مصفوفة البايت التي سيتم تعيين البيانات المستلمة فيها. |
| socketFlags | SocketFlags | سلوك الاستقبال. |

### ReturnValue

عدد البايتات المستلمة.

## انظر أيضًا

* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Receive(System::Details::StackArray\<uint8_t, N\>\&) method


يتلقى البيانات من المقبس ويكتبها إلى مصفوفة البايت المحددة.

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::Receive(System::Details::StackArray<uint8_t, N> &buffer)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| المخزن المؤقت | System::Details::StackArray\<uint8_t, N\>\& | مصفوفة البايت التي سيتم تعيين البيانات المستلمة فيها. |

### ReturnValue

عدد البايتات المستلمة.

## انظر أيضًا

* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Receive(System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t, SocketFlags) method


يتلقى البيانات من المقبس ويكتبها إلى مصفوفة البايت المحددة.

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::Receive(System::Details::StackArray<uint8_t, N> &buffer, int32_t offset, int32_t size, SocketFlags socketFlags)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| المخزن المؤقت | System::Details::StackArray\<uint8_t, N\>\& | مصفوفة البايت التي سيتم تعيين البيانات المستلمة فيها. |
| الإزاحة | int32_t | الإزاحة بالبايت في المصفوفة المحددة. |
| size | int32_t | عدد البايتات التي سيتم استقبالها وتعيينها إلى مصفوفة البايت المحددة بدءًا من الفهرس 'offset'. |
| socketFlags | SocketFlags | سلوك الاستقبال. |

### ReturnValue

عدد البايتات المستلمة.

## انظر أيضًا

* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Receive(System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t, SocketFlags, SocketError\&) method


يتلقى البيانات من المقبس ويكتبها إلى مصفوفة البايت المحددة.

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::Receive(System::Details::StackArray<uint8_t, N> &buffer, int32_t offset, int32_t size, SocketFlags socketFlags, SocketError &errorCode)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| المخزن المؤقت | System::Details::StackArray\<uint8_t, N\>\& | مصفوفة البايت التي سيتم تعيين البيانات المستلمة فيها. |
| الإزاحة | int32_t | الإزاحة بالبايت في المصفوفة المحددة. |
| size | int32_t | عدد البايتات التي سيتم استقبالها وتعيينها إلى مصفوفة البايت المحددة بدءًا من الفهرس 'offset'. |
| socketFlags | SocketFlags | سلوك الاستقبال. |
| errorCode | SocketError\& | معامل الإخراج الذي سيتم تعيين رمز الخطأ فيه عندما تفشل عملية الاستقبال. |

### ReturnValue

عدد البايتات المستلمة.

## انظر أيضًا

* Enum [SocketFlags](../../socketflags/)
* Enum [SocketError](../../socketerror/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Receive(System::Details::StackArray\<uint8_t, N\>\&, int32_t, SocketFlags) method


يتلقى البيانات من المقبس ويكتبها إلى مصفوفة البايت المحددة.

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::Receive(System::Details::StackArray<uint8_t, N> &buffer, int32_t size, SocketFlags socketFlags)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| المخزن المؤقت | System::Details::StackArray\<uint8_t, N\>\& | مصفوفة البايت التي سيتم تعيين البيانات المستلمة فيها. |
| size | int32_t | عدد البايتات التي سيتم استقبالها. |
| socketFlags | SocketFlags | سلوك الاستقبال. |

### ReturnValue

عدد البايتات المستلمة.

## انظر أيضًا

* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Receive(System::Details::StackArray\<uint8_t, N\>\&, SocketFlags) method


يتلقى البيانات من المقبس ويكتبها إلى مصفوفة البايت المحددة.

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::Receive(System::Details::StackArray<uint8_t, N> &buffer, SocketFlags socketFlags)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| المخزن المؤقت | System::Details::StackArray\<uint8_t, N\>\& | مصفوفة البايت التي سيتم تعيين البيانات المستلمة فيها. |
| socketFlags | SocketFlags | سلوك الاستقبال. |

### ReturnValue

عدد البايتات المستلمة.

## انظر أيضًا

* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Receive(System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\>) method


يتلقى البيانات من المقبس ويكتبها إلى مصفوفات البايت المحددة.

```cpp
int32_t System::Net::Sockets::Socket::Receive(System::SharedPtr<Collections::Generic::IList<ArraySegment<uint8_t>>> buffers)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| buffers | System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\> | مصفوفات البايت التي سيتم تعيين البيانات المستلمة فيها. |

### ReturnValue

عدد البايتات التي تم استلامها.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IList](../../../system.collections.generic/ilist/)
* Class [ArraySegment](../../../system/arraysegment/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Receive(System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\>, SocketFlags) method


يتلقى البيانات من المقبس ويكتبها إلى مصفوفات البايت المحددة.

```cpp
int32_t System::Net::Sockets::Socket::Receive(System::SharedPtr<Collections::Generic::IList<ArraySegment<uint8_t>>> buffers, SocketFlags socketFlags)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| buffers | System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\> | مصفوفات البايت التي سيتم تعيين البيانات المستلمة فيها. |
| socketFlags | SocketFlags | سلوك الاستقبال. |

### ReturnValue

عدد البايتات المستلمة.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IList](../../../system.collections.generic/ilist/)
* Class [ArraySegment](../../../system/arraysegment/)
* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::Receive(System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\>, SocketFlags, SocketError\&) method


يتلقى البيانات من المقبس ويكتبها إلى مصفوفات البايت المحددة.

```cpp
int32_t System::Net::Sockets::Socket::Receive(System::SharedPtr<Collections::Generic::IList<ArraySegment<uint8_t>>> buffers, SocketFlags socketFlags, SocketError &errorCode)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| buffers | System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\> | مصفوفات البايت التي سيتم تعيين البيانات المستلمة فيها. |
| socketFlags | SocketFlags | سلوك الاستقبال. |
| errorCode | SocketError\& | معامل الإخراج الذي سيتم تعيين رمز الخطأ فيه عندما تفشل عملية الاستقبال. |

### ReturnValue

عدد البايتات المستلمة.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IList](../../../system.collections.generic/ilist/)
* Class [ArraySegment](../../../system/arraysegment/)
* Enum [SocketFlags](../../socketflags/)
* Enum [SocketError](../../socketerror/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
