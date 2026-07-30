---
title: "System::Net::Sockets::Socket::Send 方法"
linktitle: "发送"
second_title: "Aspose.Font 适用于 C++"
description: "System::Net::Sockets::Socket::Send 方法。将指定的数据发送到套接字（C++）。"
type: docs
weight: 4600
url: /zh/cpp/system.net.sockets/socket/send/
---
## Socket::Send(System::ArrayPtr\<uint8_t\>) method


将指定的数据发送到套接字。

```cpp
int32_t System::Net::Sockets::Socket::Send(System::ArrayPtr<uint8_t> buffer)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| buffer | System::ArrayPtr\<uint8_t\> | 要发送的数据。 |

### ReturnValue

已发送字节的数量。

## 另见

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::Send(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags) method


将指定的数据发送到套接字。

```cpp
int32_t System::Net::Sockets::Socket::Send(System::ArrayPtr<uint8_t> buffer, int32_t offset, int32_t size, SocketFlags socketFlags)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| buffer | System::ArrayPtr\<uint8_t\> | 要发送的数据。 |
| offset | int32_t | 指定数组中的字节偏移量。 |
| size | int32_t | 从 'offset' 参数开始的指定数组中的字节数。 |
| socketFlags | SocketFlags | 发送行为。 |

### ReturnValue

已发送字节的数量。

## 另见

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::Send(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags, SocketError\&) method


将指定的数据发送到套接字。

```cpp
int32_t System::Net::Sockets::Socket::Send(System::ArrayPtr<uint8_t> buffer, int32_t offset, int32_t size, SocketFlags socketFlags, SocketError &errorCode)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| buffer | System::ArrayPtr\<uint8_t\> | 要发送的数据。 |
| offset | int32_t | 指定数组中的字节偏移量。 |
| size | int32_t | 从 'offset' 参数开始的指定数组中的字节数。 |
| socketFlags | SocketFlags | 发送行为。 |
| errorCode | SocketError\& | 当发送操作失败时，错误代码将被分配到的输出参数。 |

### ReturnValue

已发送字节的数量。

## 另见

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Enum [SocketError](../../socketerror/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::Send(System::ArrayPtr\<uint8_t\>, int32_t, SocketFlags) method


将指定的数据发送到套接字。

```cpp
int32_t System::Net::Sockets::Socket::Send(System::ArrayPtr<uint8_t> buffer, int32_t size, SocketFlags socketFlags)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| buffer | System::ArrayPtr\<uint8_t\> | 要发送的数据。 |
| size | int32_t | 必须发送的指定数据的字节数。 |
| socketFlags | SocketFlags | 发送行为。 |

### ReturnValue

已发送字节的数量。

## 另见

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::Send(System::ArrayPtr\<uint8_t\>, SocketFlags) method


将指定的数据发送到套接字。

```cpp
int32_t System::Net::Sockets::Socket::Send(System::ArrayPtr<uint8_t> buffer, SocketFlags socketFlags)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| buffer | System::ArrayPtr\<uint8_t\> | 要发送的数据。 |
| socketFlags | SocketFlags | 发送行为。 |

### ReturnValue

已发送字节的数量。

## 另见

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::Send(System::Details::ArrayView\<uint8_t\>) method


将指定的数据发送到套接字。

```cpp
int32_t System::Net::Sockets::Socket::Send(System::Details::ArrayView<uint8_t> buffer)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| buffer | System::Details::ArrayView\<uint8_t\> | 要发送的数据。 |

### ReturnValue

已发送字节的数量。

## 另见

* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::Send(System::Details::ArrayView\<uint8_t\>, int32_t, int32_t, SocketFlags) method


将指定的数据发送到套接字。

```cpp
int32_t System::Net::Sockets::Socket::Send(System::Details::ArrayView<uint8_t> buffer, int32_t offset, int32_t size, SocketFlags socketFlags)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| buffer | System::Details::ArrayView\<uint8_t\> | 要发送的数据。 |
| offset | int32_t | 指定数组中的字节偏移量。 |
| size | int32_t | 从 'offset' 参数开始的指定数组中的字节数。 |
| socketFlags | SocketFlags | 发送行为。 |

### ReturnValue

已发送字节的数量。

## 另见

* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::Send(System::Details::ArrayView\<uint8_t\>, int32_t, int32_t, SocketFlags, SocketError\&) method


将指定的数据发送到套接字。

```cpp
int32_t System::Net::Sockets::Socket::Send(System::Details::ArrayView<uint8_t> buffer, int32_t offset, int32_t size, SocketFlags socketFlags, SocketError &errorCode)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| buffer | System::Details::ArrayView\<uint8_t\> | 要发送的数据。 |
| offset | int32_t | 指定数组中的字节偏移量。 |
| size | int32_t | 从 'offset' 参数开始的指定数组中的字节数。 |
| socketFlags | SocketFlags | 发送行为。 |
| errorCode | SocketError\& | 当发送操作失败时，错误代码将被分配到的输出参数。 |

### ReturnValue

已发送字节的数量。

## 另见

* Enum [SocketFlags](../../socketflags/)
* Enum [SocketError](../../socketerror/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::Send(System::Details::ArrayView\<uint8_t\>, int32_t, SocketFlags) method


将指定的数据发送到套接字。

```cpp
int32_t System::Net::Sockets::Socket::Send(System::Details::ArrayView<uint8_t> buffer, int32_t size, SocketFlags socketFlags)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| buffer | System::Details::ArrayView\<uint8_t\> | 要发送的数据。 |
| size | int32_t | 必须发送的指定数据的字节数。 |
| socketFlags | SocketFlags | 发送行为。 |

### ReturnValue

已发送字节的数量。

## 另见

* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::Send(System::Details::ArrayView\<uint8_t\>, SocketFlags) method


将指定的数据发送到套接字。

```cpp
int32_t System::Net::Sockets::Socket::Send(System::Details::ArrayView<uint8_t> buffer, SocketFlags socketFlags)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| buffer | System::Details::ArrayView\<uint8_t\> | 要发送的数据。 |
| socketFlags | SocketFlags | 发送行为。 |

### ReturnValue

已发送字节的数量。

## 另见

* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::Send(System::Details::StackArray\<uint8_t, N\>\&) method


将指定的数据发送到套接字。

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::Send(System::Details::StackArray<uint8_t, N> &buffer)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| buffer | System::Details::StackArray\<uint8_t, N\>\& | 要发送的数据。 |

### ReturnValue

已发送字节的数量。

## 另见

* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::Send(System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t, SocketFlags) method


将指定的数据发送到套接字。

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::Send(System::Details::StackArray<uint8_t, N> &buffer, int32_t offset, int32_t size, SocketFlags socketFlags)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| buffer | System::Details::StackArray\<uint8_t, N\>\& | 要发送的数据。 |
| offset | int32_t | 指定数组中的字节偏移量。 |
| size | int32_t | 从 'offset' 参数开始的指定数组中的字节数。 |
| socketFlags | SocketFlags | 发送行为。 |

### ReturnValue

已发送字节的数量。

## 另见

* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::Send(System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t, SocketFlags, SocketError\&) method


将指定的数据发送到套接字。

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::Send(System::Details::StackArray<uint8_t, N> &buffer, int32_t offset, int32_t size, SocketFlags socketFlags, SocketError &errorCode)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| buffer | System::Details::StackArray\<uint8_t, N\>\& | 要发送的数据。 |
| offset | int32_t | 指定数组中的字节偏移量。 |
| size | int32_t | 从 'offset' 参数开始的指定数组中的字节数。 |
| socketFlags | SocketFlags | 发送行为。 |
| errorCode | SocketError\& | 当发送操作失败时，错误代码将被分配到的输出参数。 |

### ReturnValue

已发送字节的数量。

## 另见

* Enum [SocketFlags](../../socketflags/)
* Enum [SocketError](../../socketerror/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::Send(System::Details::StackArray\<uint8_t, N\>\&, int32_t, SocketFlags) method


将指定的数据发送到套接字。

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::Send(System::Details::StackArray<uint8_t, N> &buffer, int32_t size, SocketFlags socketFlags)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| buffer | System::Details::StackArray\<uint8_t, N\>\& | 要发送的数据。 |
| size | int32_t | 必须发送的指定数据的字节数。 |
| socketFlags | SocketFlags | 发送行为。 |

### ReturnValue

已发送字节的数量。

## 另见

* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::Send(System::Details::StackArray\<uint8_t, N\>\&, SocketFlags) method


将指定的数据发送到套接字。

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::Send(System::Details::StackArray<uint8_t, N> &buffer, SocketFlags socketFlags)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| buffer | System::Details::StackArray\<uint8_t, N\>\& | 要发送的数据。 |
| socketFlags | SocketFlags | 发送行为。 |

### ReturnValue

已发送字节的数量。

## 另见

* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::Send(System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\>) method


将指定的数据发送到套接字。

```cpp
int32_t System::Net::Sockets::Socket::Send(System::SharedPtr<Collections::Generic::IList<ArraySegment<uint8_t>>> buffers)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 缓冲区 | System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\> | 必须发送数据的字节数组集合。 |

### ReturnValue

已发送字节的数量。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IList](../../../system.collections.generic/ilist/)
* Class [ArraySegment](../../../system/arraysegment/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::Send(System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\>, SocketFlags) method


将指定的数据发送到套接字。

```cpp
int32_t System::Net::Sockets::Socket::Send(System::SharedPtr<Collections::Generic::IList<ArraySegment<uint8_t>>> buffers, SocketFlags socketFlags)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 缓冲区 | System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\> | 必须发送数据的字节数组集合。 |
| socketFlags | SocketFlags | 发送行为。 |

### ReturnValue

已发送字节的数量。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IList](../../../system.collections.generic/ilist/)
* Class [ArraySegment](../../../system/arraysegment/)
* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::Send(System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\>, SocketFlags, SocketError\&) method


将指定的数据发送到套接字。

```cpp
int32_t System::Net::Sockets::Socket::Send(System::SharedPtr<Collections::Generic::IList<ArraySegment<uint8_t>>> buffers, SocketFlags socketFlags, SocketError &errorCode)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 缓冲区 | System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\> | 必须发送数据的字节数组集合。 |
| socketFlags | SocketFlags | 发送行为。 |
| errorCode | SocketError\& | 当发送操作失败时，错误代码将被分配到的输出参数。 |

### ReturnValue

已发送字节的数量。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IList](../../../system.collections.generic/ilist/)
* Class [ArraySegment](../../../system/arraysegment/)
* Enum [SocketFlags](../../socketflags/)
* Enum [SocketError](../../socketerror/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
