---
title: "System::Net::Sockets::Socket::Send طريقة"
linktitle: "إرسال"
second_title: "Aspose.Font لـ C++"
description: "System::Net::Sockets::Socket::Send طريقة. يرسل البيانات المحددة إلى المقبس في C++."
type: docs
weight: 4600
url: /ar/cpp/system.net.sockets/socket/send/
---
## Socket::Send(System::ArrayPtr\<uint8_t\>) method


يرسل البيانات المحددة إلى socket.

```cpp
int32_t System::Net::Sockets::Socket::Send(System::ArrayPtr<uint8_t> buffer)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| buffer | System::ArrayPtr\<uint8_t\> | البيانات المراد إرسالها. |

### ReturnValue

عدد البايتات المرسلة.

## انظر أيضًا

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::Send(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags) method


يرسل البيانات المحددة إلى socket.

```cpp
int32_t System::Net::Sockets::Socket::Send(System::ArrayPtr<uint8_t> buffer, int32_t offset, int32_t size, SocketFlags socketFlags)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| buffer | System::ArrayPtr\<uint8_t\> | البيانات المراد إرسالها. |
| إزاحة | int32_t | الإزاحة بالبايت في المصفوفة المحددة. |
| size | int32_t | عدد البايتات في المصفوفة المحددة بدءًا من المعامل 'offset'. |
| socketFlags | SocketFlags | سلوك الإرسال. |

### ReturnValue

عدد البايتات المرسلة.

## انظر أيضًا

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::Send(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags, SocketError\&) method


يرسل البيانات المحددة إلى socket.

```cpp
int32_t System::Net::Sockets::Socket::Send(System::ArrayPtr<uint8_t> buffer, int32_t offset, int32_t size, SocketFlags socketFlags, SocketError &errorCode)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| buffer | System::ArrayPtr\<uint8_t\> | البيانات المراد إرسالها. |
| إزاحة | int32_t | الإزاحة بالبايت في المصفوفة المحددة. |
| size | int32_t | عدد البايتات في المصفوفة المحددة بدءًا من المعامل 'offset'. |
| socketFlags | SocketFlags | سلوك الإرسال. |
| errorCode | SocketError\& | معامل الإخراج الذي سيتم تعيين رمز الخطأ فيه عندما تفشل عملية الإرسال. |

### ReturnValue

عدد البايتات المرسلة.

## انظر أيضًا

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Enum [SocketError](../../socketerror/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::Send(System::ArrayPtr\<uint8_t\>, int32_t, SocketFlags) method


يرسل البيانات المحددة إلى socket.

```cpp
int32_t System::Net::Sockets::Socket::Send(System::ArrayPtr<uint8_t> buffer, int32_t size, SocketFlags socketFlags)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| buffer | System::ArrayPtr\<uint8_t\> | البيانات المراد إرسالها. |
| size | int32_t | عدد البايتات من البيانات المحددة التي يجب إرسالها. |
| socketFlags | SocketFlags | سلوك الإرسال. |

### ReturnValue

عدد البايتات المرسلة.

## انظر أيضًا

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::Send(System::ArrayPtr\<uint8_t\>, SocketFlags) method


يرسل البيانات المحددة إلى socket.

```cpp
int32_t System::Net::Sockets::Socket::Send(System::ArrayPtr<uint8_t> buffer, SocketFlags socketFlags)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| buffer | System::ArrayPtr\<uint8_t\> | البيانات المراد إرسالها. |
| socketFlags | SocketFlags | سلوك الإرسال. |

### ReturnValue

عدد البايتات المرسلة.

## انظر أيضًا

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::Send(System::Details::ArrayView\<uint8_t\>) method


يرسل البيانات المحددة إلى socket.

```cpp
int32_t System::Net::Sockets::Socket::Send(System::Details::ArrayView<uint8_t> buffer)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| buffer | System::Details::ArrayView\<uint8_t\> | البيانات المراد إرسالها. |

### ReturnValue

عدد البايتات المرسلة.

## انظر أيضًا

* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::Send(System::Details::ArrayView\<uint8_t\>, int32_t, int32_t, SocketFlags) method


يرسل البيانات المحددة إلى socket.

```cpp
int32_t System::Net::Sockets::Socket::Send(System::Details::ArrayView<uint8_t> buffer, int32_t offset, int32_t size, SocketFlags socketFlags)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| buffer | System::Details::ArrayView\<uint8_t\> | البيانات المراد إرسالها. |
| إزاحة | int32_t | الإزاحة بالبايت في المصفوفة المحددة. |
| size | int32_t | عدد البايتات في المصفوفة المحددة بدءًا من المعامل 'offset'. |
| socketFlags | SocketFlags | سلوك الإرسال. |

### ReturnValue

عدد البايتات المرسلة.

## انظر أيضًا

* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::Send(System::Details::ArrayView\<uint8_t\>, int32_t, int32_t, SocketFlags, SocketError\&) method


يرسل البيانات المحددة إلى socket.

```cpp
int32_t System::Net::Sockets::Socket::Send(System::Details::ArrayView<uint8_t> buffer, int32_t offset, int32_t size, SocketFlags socketFlags, SocketError &errorCode)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| buffer | System::Details::ArrayView\<uint8_t\> | البيانات المراد إرسالها. |
| إزاحة | int32_t | الإزاحة بالبايت في المصفوفة المحددة. |
| size | int32_t | عدد البايتات في المصفوفة المحددة بدءًا من المعامل 'offset'. |
| socketFlags | SocketFlags | سلوك الإرسال. |
| errorCode | SocketError\& | معامل الإخراج الذي سيتم تعيين رمز الخطأ فيه عندما تفشل عملية الإرسال. |

### ReturnValue

عدد البايتات المرسلة.

## انظر أيضًا

* Enum [SocketFlags](../../socketflags/)
* Enum [SocketError](../../socketerror/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::Send(System::Details::ArrayView\<uint8_t\>, int32_t, SocketFlags) method


يرسل البيانات المحددة إلى socket.

```cpp
int32_t System::Net::Sockets::Socket::Send(System::Details::ArrayView<uint8_t> buffer, int32_t size, SocketFlags socketFlags)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| buffer | System::Details::ArrayView\<uint8_t\> | البيانات المراد إرسالها. |
| size | int32_t | عدد البايتات من البيانات المحددة التي يجب إرسالها. |
| socketFlags | SocketFlags | سلوك الإرسال. |

### ReturnValue

عدد البايتات المرسلة.

## انظر أيضًا

* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::Send(System::Details::ArrayView\<uint8_t\>, SocketFlags) method


يرسل البيانات المحددة إلى socket.

```cpp
int32_t System::Net::Sockets::Socket::Send(System::Details::ArrayView<uint8_t> buffer, SocketFlags socketFlags)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| buffer | System::Details::ArrayView\<uint8_t\> | البيانات المراد إرسالها. |
| socketFlags | SocketFlags | سلوك الإرسال. |

### ReturnValue

عدد البايتات المرسلة.

## انظر أيضًا

* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::Send(System::Details::StackArray\<uint8_t, N\>\&) method


يرسل البيانات المحددة إلى socket.

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::Send(System::Details::StackArray<uint8_t, N> &buffer)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| buffer | System::Details::StackArray\<uint8_t, N\>\& | البيانات المراد إرسالها. |

### ReturnValue

عدد البايتات المرسلة.

## انظر أيضًا

* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::Send(System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t, SocketFlags) method


يرسل البيانات المحددة إلى socket.

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::Send(System::Details::StackArray<uint8_t, N> &buffer, int32_t offset, int32_t size, SocketFlags socketFlags)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| buffer | System::Details::StackArray\<uint8_t, N\>\& | البيانات المراد إرسالها. |
| إزاحة | int32_t | الإزاحة بالبايت في المصفوفة المحددة. |
| size | int32_t | عدد البايتات في المصفوفة المحددة بدءًا من المعامل 'offset'. |
| socketFlags | SocketFlags | سلوك الإرسال. |

### ReturnValue

عدد البايتات المرسلة.

## انظر أيضًا

* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::Send(System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t, SocketFlags, SocketError\&) method


يرسل البيانات المحددة إلى socket.

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::Send(System::Details::StackArray<uint8_t, N> &buffer, int32_t offset, int32_t size, SocketFlags socketFlags, SocketError &errorCode)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| buffer | System::Details::StackArray\<uint8_t, N\>\& | البيانات المراد إرسالها. |
| إزاحة | int32_t | الإزاحة بالبايت في المصفوفة المحددة. |
| size | int32_t | عدد البايتات في المصفوفة المحددة بدءًا من المعامل 'offset'. |
| socketFlags | SocketFlags | سلوك الإرسال. |
| errorCode | SocketError\& | معامل الإخراج الذي سيتم تعيين رمز الخطأ فيه عندما تفشل عملية الإرسال. |

### ReturnValue

عدد البايتات المرسلة.

## انظر أيضًا

* Enum [SocketFlags](../../socketflags/)
* Enum [SocketError](../../socketerror/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::Send(System::Details::StackArray\<uint8_t, N\>\&, int32_t, SocketFlags) method


يرسل البيانات المحددة إلى socket.

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::Send(System::Details::StackArray<uint8_t, N> &buffer, int32_t size, SocketFlags socketFlags)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| buffer | System::Details::StackArray\<uint8_t, N\>\& | البيانات المراد إرسالها. |
| size | int32_t | عدد البايتات من البيانات المحددة التي يجب إرسالها. |
| socketFlags | SocketFlags | سلوك الإرسال. |

### ReturnValue

عدد البايتات المرسلة.

## انظر أيضًا

* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::Send(System::Details::StackArray\<uint8_t, N\>\&, SocketFlags) method


يرسل البيانات المحددة إلى socket.

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::Send(System::Details::StackArray<uint8_t, N> &buffer, SocketFlags socketFlags)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| buffer | System::Details::StackArray\<uint8_t, N\>\& | البيانات المراد إرسالها. |
| socketFlags | SocketFlags | سلوك الإرسال. |

### ReturnValue

عدد البايتات المرسلة.

## انظر أيضًا

* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::Send(System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\>) method


يرسل البيانات المحددة إلى socket.

```cpp
int32_t System::Net::Sockets::Socket::Send(System::SharedPtr<Collections::Generic::IList<ArraySegment<uint8_t>>> buffers)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| المخازن | System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\> | مجموعة من مصفوفات البايت التي يجب إرسال البيانات منها. |

### ReturnValue

عدد البايتات المرسلة.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IList](../../../system.collections.generic/ilist/)
* Class [ArraySegment](../../../system/arraysegment/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::Send(System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\>, SocketFlags) method


يرسل البيانات المحددة إلى socket.

```cpp
int32_t System::Net::Sockets::Socket::Send(System::SharedPtr<Collections::Generic::IList<ArraySegment<uint8_t>>> buffers, SocketFlags socketFlags)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| المخازن | System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\> | مجموعة من مصفوفات البايت التي يجب إرسال البيانات منها. |
| socketFlags | SocketFlags | سلوك الإرسال. |

### ReturnValue

عدد البايتات المرسلة.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IList](../../../system.collections.generic/ilist/)
* Class [ArraySegment](../../../system/arraysegment/)
* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::Send(System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\>, SocketFlags, SocketError\&) method


يرسل البيانات المحددة إلى socket.

```cpp
int32_t System::Net::Sockets::Socket::Send(System::SharedPtr<Collections::Generic::IList<ArraySegment<uint8_t>>> buffers, SocketFlags socketFlags, SocketError &errorCode)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| المخازن | System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\> | مجموعة من مصفوفات البايت التي يجب إرسال البيانات منها. |
| socketFlags | SocketFlags | سلوك الإرسال. |
| errorCode | SocketError\& | معامل الإخراج الذي سيتم تعيين رمز الخطأ فيه عندما تفشل عملية الإرسال. |

### ReturnValue

عدد البايتات المرسلة.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IList](../../../system.collections.generic/ilist/)
* Class [ArraySegment](../../../system/arraysegment/)
* Enum [SocketFlags](../../socketflags/)
* Enum [SocketError](../../socketerror/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
