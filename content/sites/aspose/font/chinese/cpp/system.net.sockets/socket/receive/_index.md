---
title: "System::Net::Sockets::Socket::Receive 方法"
linktitle: "接收"
second_title: "Aspose.Font 适用于 C++"
description: "System::Net::Sockets::Socket::Receive 方法。从套接字接收数据并将其写入 C++ 中指定的字节数组。"
type: docs
weight: 4300
url: /zh/cpp/system.net.sockets/socket/receive/
---
## Socket::Receive(System::ArrayPtr\<uint8_t\>) method


从套接字接收数据并写入指定的字节数组。

```cpp
int32_t System::Net::Sockets::Socket::Receive(System::ArrayPtr<uint8_t> buffer)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| buffer | System::ArrayPtr\<uint8_t\> | 接收的数据将被分配的字节数组。 |

### ReturnValue

接收的字节数。

## 另见

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::Receive(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags) method


从套接字接收数据并写入指定的字节数组。

```cpp
int32_t System::Net::Sockets::Socket::Receive(System::ArrayPtr<uint8_t> buffer, int32_t offset, int32_t size, SocketFlags socketFlags)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| buffer | System::ArrayPtr\<uint8_t\> | 接收的数据将被分配的字节数组。 |
| offset | int32_t | 指定数组中的字节偏移量。 |
| size | int32_t | 要接收的字节数，这些字节将从 'offset' 索引开始分配到指定的字节数组。 |
| socketFlags | SocketFlags | 接收行为。 |

### ReturnValue

接收的字节数。

## 另见

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::Receive(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags, SocketError\&) method


从套接字接收数据并写入指定的字节数组。

```cpp
int32_t System::Net::Sockets::Socket::Receive(System::ArrayPtr<uint8_t> buffer, int32_t offset, int32_t size, SocketFlags socketFlags, SocketError &errorCode)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| buffer | System::ArrayPtr\<uint8_t\> | 接收的数据将被分配的字节数组。 |
| offset | int32_t | 指定数组中的字节偏移量。 |
| size | int32_t | 要接收的字节数，这些字节将从 'offset' 索引开始分配到指定的字节数组。 |
| socketFlags | SocketFlags | 接收行为。 |
| errorCode | SocketError\& | 当接收操作失败时，错误代码将被分配的输出参数。 |

### ReturnValue

接收的字节数。

## 另见

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Enum [SocketError](../../socketerror/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::Receive(System::ArrayPtr\<uint8_t\>, int32_t, SocketFlags) method


从套接字接收数据并写入指定的字节数组。

```cpp
int32_t System::Net::Sockets::Socket::Receive(System::ArrayPtr<uint8_t> buffer, int32_t size, SocketFlags socketFlags)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| buffer | System::ArrayPtr\<uint8_t\> | 接收的数据将被分配的字节数组。 |
| size | int32_t | 要接收的字节数。 |
| socketFlags | SocketFlags | 接收行为。 |

### ReturnValue

接收的字节数。

## 另见

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::Receive(System::ArrayPtr\<uint8_t\>, SocketFlags) method


从套接字接收数据并写入指定的字节数组。

```cpp
int32_t System::Net::Sockets::Socket::Receive(System::ArrayPtr<uint8_t> buffer, SocketFlags socketFlags)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| buffer | System::ArrayPtr\<uint8_t\> | 接收的数据将被分配的字节数组。 |
| socketFlags | SocketFlags | 接收行为。 |

### ReturnValue

接收的字节数。

## 另见

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::Receive(System::Details::ArrayView\<uint8_t\>) method


从套接字接收数据并写入指定的字节数组。

```cpp
int32_t System::Net::Sockets::Socket::Receive(System::Details::ArrayView<uint8_t> buffer)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| buffer | System::Details::ArrayView\<uint8_t\> | 接收的数据将被分配的字节数组。 |

### ReturnValue

接收的字节数。

## 另见

* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::Receive(System::Details::ArrayView\<uint8_t\>, int32_t, int32_t, SocketFlags) method


从套接字接收数据并写入指定的字节数组。

```cpp
int32_t System::Net::Sockets::Socket::Receive(System::Details::ArrayView<uint8_t> buffer, int32_t offset, int32_t size, SocketFlags socketFlags)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| buffer | System::Details::ArrayView\<uint8_t\> | 接收的数据将被分配的字节数组。 |
| offset | int32_t | 指定数组中的字节偏移量。 |
| size | int32_t | 要接收的字节数，这些字节将从 'offset' 索引开始分配到指定的字节数组。 |
| socketFlags | SocketFlags | 接收行为。 |

### ReturnValue

接收的字节数。

## 另见

* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::Receive(System::Details::ArrayView\<uint8_t\>, int32_t, int32_t, SocketFlags, SocketError\&) method


从套接字接收数据并写入指定的字节数组。

```cpp
int32_t System::Net::Sockets::Socket::Receive(System::Details::ArrayView<uint8_t> buffer, int32_t offset, int32_t size, SocketFlags socketFlags, SocketError &errorCode)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| buffer | System::Details::ArrayView\<uint8_t\> | 接收的数据将被分配的字节数组。 |
| offset | int32_t | 指定数组中的字节偏移量。 |
| size | int32_t | 要接收的字节数，这些字节将从 'offset' 索引开始分配到指定的字节数组。 |
| socketFlags | SocketFlags | 接收行为。 |
| errorCode | SocketError\& | 当接收操作失败时，错误代码将被分配的输出参数。 |

### ReturnValue

接收的字节数。

## 另见

* Enum [SocketFlags](../../socketflags/)
* Enum [SocketError](../../socketerror/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::Receive(System::Details::ArrayView\<uint8_t\>, int32_t, SocketFlags) method


从套接字接收数据并写入指定的字节数组。

```cpp
int32_t System::Net::Sockets::Socket::Receive(System::Details::ArrayView<uint8_t> buffer, int32_t size, SocketFlags socketFlags)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| buffer | System::Details::ArrayView\<uint8_t\> | 接收的数据将被分配的字节数组。 |
| size | int32_t | 要接收的字节数。 |
| socketFlags | SocketFlags | 接收行为。 |

### ReturnValue

接收的字节数。

## 另见

* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::Receive(System::Details::ArrayView\<uint8_t\>, SocketFlags) method


从套接字接收数据并写入指定的字节数组。

```cpp
int32_t System::Net::Sockets::Socket::Receive(System::Details::ArrayView<uint8_t> buffer, SocketFlags socketFlags)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| buffer | System::Details::ArrayView\<uint8_t\> | 接收的数据将被分配的字节数组。 |
| socketFlags | SocketFlags | 接收行为。 |

### ReturnValue

接收的字节数。

## 另见

* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::Receive(System::Details::StackArray\<uint8_t, N\>\&) method


从套接字接收数据并写入指定的字节数组。

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::Receive(System::Details::StackArray<uint8_t, N> &buffer)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| buffer | System::Details::StackArray\<uint8_t, N\>\& | 接收的数据将被分配的字节数组。 |

### ReturnValue

接收的字节数。

## 另见

* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::Receive(System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t, SocketFlags) method


从套接字接收数据并写入指定的字节数组。

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::Receive(System::Details::StackArray<uint8_t, N> &buffer, int32_t offset, int32_t size, SocketFlags socketFlags)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| buffer | System::Details::StackArray\<uint8_t, N\>\& | 接收的数据将被分配的字节数组。 |
| offset | int32_t | 指定数组中的字节偏移量。 |
| size | int32_t | 要接收的字节数，这些字节将从 'offset' 索引开始分配到指定的字节数组。 |
| socketFlags | SocketFlags | 接收行为。 |

### ReturnValue

接收的字节数。

## 另见

* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::Receive(System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t, SocketFlags, SocketError\&) method


从套接字接收数据并写入指定的字节数组。

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::Receive(System::Details::StackArray<uint8_t, N> &buffer, int32_t offset, int32_t size, SocketFlags socketFlags, SocketError &errorCode)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| buffer | System::Details::StackArray\<uint8_t, N\>\& | 接收的数据将被分配的字节数组。 |
| offset | int32_t | 指定数组中的字节偏移量。 |
| size | int32_t | 要接收的字节数，这些字节将从 'offset' 索引开始分配到指定的字节数组。 |
| socketFlags | SocketFlags | 接收行为。 |
| errorCode | SocketError\& | 当接收操作失败时，错误代码将被分配的输出参数。 |

### ReturnValue

接收的字节数。

## 另见

* Enum [SocketFlags](../../socketflags/)
* Enum [SocketError](../../socketerror/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::Receive(System::Details::StackArray\<uint8_t, N\>\&, int32_t, SocketFlags) method


从套接字接收数据并写入指定的字节数组。

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::Receive(System::Details::StackArray<uint8_t, N> &buffer, int32_t size, SocketFlags socketFlags)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| buffer | System::Details::StackArray\<uint8_t, N\>\& | 接收的数据将被分配的字节数组。 |
| size | int32_t | 要接收的字节数。 |
| socketFlags | SocketFlags | 接收行为。 |

### ReturnValue

接收的字节数。

## 另见

* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::Receive(System::Details::StackArray\<uint8_t, N\>\&, SocketFlags) method


从套接字接收数据并写入指定的字节数组。

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::Receive(System::Details::StackArray<uint8_t, N> &buffer, SocketFlags socketFlags)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| buffer | System::Details::StackArray\<uint8_t, N\>\& | 接收的数据将被分配的字节数组。 |
| socketFlags | SocketFlags | 接收行为。 |

### ReturnValue

接收的字节数。

## 另见

* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::Receive(System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\>) method


从套接字接收数据并写入指定的字节数组集合。

```cpp
int32_t System::Net::Sockets::Socket::Receive(System::SharedPtr<Collections::Generic::IList<ArraySegment<uint8_t>>> buffers)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 缓冲区 | System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\> | 接收的数据将被分配的字节数组。 |

### ReturnValue

已接收的字节数。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IList](../../../system.collections.generic/ilist/)
* Class [ArraySegment](../../../system/arraysegment/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::Receive(System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\>, SocketFlags) method


从套接字接收数据并写入指定的字节数组集合。

```cpp
int32_t System::Net::Sockets::Socket::Receive(System::SharedPtr<Collections::Generic::IList<ArraySegment<uint8_t>>> buffers, SocketFlags socketFlags)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 缓冲区 | System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\> | 接收的数据将被分配的字节数组。 |
| socketFlags | SocketFlags | 接收行为。 |

### ReturnValue

接收的字节数。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IList](../../../system.collections.generic/ilist/)
* Class [ArraySegment](../../../system/arraysegment/)
* Enum [SocketFlags](../../socketflags/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::Receive(System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\>, SocketFlags, SocketError\&) method


从套接字接收数据并写入指定的字节数组集合。

```cpp
int32_t System::Net::Sockets::Socket::Receive(System::SharedPtr<Collections::Generic::IList<ArraySegment<uint8_t>>> buffers, SocketFlags socketFlags, SocketError &errorCode)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 缓冲区 | System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\> | 接收的数据将被分配的字节数组。 |
| socketFlags | SocketFlags | 接收行为。 |
| errorCode | SocketError\& | 当接收操作失败时，错误代码将被分配的输出参数。 |

### ReturnValue

接收的字节数。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IList](../../../system.collections.generic/ilist/)
* Class [ArraySegment](../../../system/arraysegment/)
* Enum [SocketFlags](../../socketflags/)
* Enum [SocketError](../../socketerror/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
