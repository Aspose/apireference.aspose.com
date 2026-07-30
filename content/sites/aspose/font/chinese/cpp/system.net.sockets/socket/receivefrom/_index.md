---
title: "System::Net::Sockets::Socket::ReceiveFrom 方法"
linktitle: "ReceiveFrom"
second_title: "Aspose.Font 适用于 C++"
description: "System::Net::Sockets::Socket::ReceiveFrom 方法。从指定的端点接收数据并将其写入 C++ 中指定的字节数组。"
type: docs
weight: 4400
url: /zh/cpp/system.net.sockets/socket/receivefrom/
---
## Socket::ReceiveFrom(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>\&) method


从指定的端点接收数据并写入指定的字节数组。

```cpp
int32_t System::Net::Sockets::Socket::ReceiveFrom(System::ArrayPtr<uint8_t> buffer, int32_t offset, int32_t size, SocketFlags socketFlags, System::SharedPtr<EndPoint> &remoteEP)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| buffer | System::ArrayPtr\<uint8_t\> | 接收的数据将被分配的字节数组。 |
| offset | int32_t | 指定数组中的字节偏移量。 |
| size | int32_t | 要接收的字节数，这些字节将从 'offset' 索引开始分配到指定的字节数组。 |
| socketFlags | SocketFlags | 接收行为。 |
| remoteEP | System::SharedPtr\<EndPoint\>\& | 远程端点。 |

### ReturnValue

接收的字节数。

## 另见

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::ReceiveFrom(System::ArrayPtr\<uint8_t\>, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>\&) method


从指定的端点接收数据并写入指定的字节数组。

```cpp
int32_t System::Net::Sockets::Socket::ReceiveFrom(System::ArrayPtr<uint8_t> buffer, int32_t size, SocketFlags socketFlags, System::SharedPtr<EndPoint> &remoteEP)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| buffer | System::ArrayPtr\<uint8_t\> | 接收的数据将被分配的字节数组。 |
| size | int32_t | 要接收的字节数，这些字节将从 'offset' 索引开始分配到指定的字节数组。 |
| socketFlags | SocketFlags | 接收行为。 |
| remoteEP | System::SharedPtr\<EndPoint\>\& | 远程端点。 |

### ReturnValue

接收的字节数。

## 另见

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::ReceiveFrom(System::ArrayPtr\<uint8_t\>, SocketFlags, System::SharedPtr\<EndPoint\>\&) method


从指定的端点接收数据并写入指定的字节数组。

```cpp
int32_t System::Net::Sockets::Socket::ReceiveFrom(System::ArrayPtr<uint8_t> buffer, SocketFlags socketFlags, System::SharedPtr<EndPoint> &remoteEP)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| buffer | System::ArrayPtr\<uint8_t\> | 接收的数据将被分配的字节数组。 |
| socketFlags | SocketFlags | 接收行为。 |
| remoteEP | System::SharedPtr\<EndPoint\>\& | 远程端点。 |

### ReturnValue

接收的字节数。

## 另见

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::ReceiveFrom(System::ArrayPtr\<uint8_t\>, SocketFlags, System::SharedPtr\<EndPoint\>\&) method


从指定的端点接收数据并写入指定的字节数组。

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::ReceiveFrom(System::ArrayPtr<uint8_t> buffer, SocketFlags socketFlags, System::SharedPtr<EndPoint> &remoteEP)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| buffer | System::ArrayPtr\<uint8_t\> | 接收的数据将被分配的字节数组。 |
| socketFlags | SocketFlags | 接收行为。 |
| remoteEP | System::SharedPtr\<EndPoint\>\& | 远程端点。 |

### ReturnValue

接收的字节数。

## 另见

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::ReceiveFrom(System::ArrayPtr\<uint8_t\>, System::SharedPtr\<EndPoint\>\&) method


从指定的端点接收数据并写入指定的字节数组。

```cpp
int32_t System::Net::Sockets::Socket::ReceiveFrom(System::ArrayPtr<uint8_t> buffer, System::SharedPtr<EndPoint> &remoteEP)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| buffer | System::ArrayPtr\<uint8_t\> | 接收的数据将被分配的字节数组。 |
| remoteEP | System::SharedPtr\<EndPoint\>\& | 远程端点。 |

### ReturnValue

接收的字节数。

## 另见

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::ReceiveFrom(System::Details::ArrayView\<uint8_t\>, int32_t, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>\&) method


从指定的端点接收数据并写入指定的字节数组。

```cpp
int32_t System::Net::Sockets::Socket::ReceiveFrom(System::Details::ArrayView<uint8_t> buffer, int32_t offset, int32_t size, SocketFlags socketFlags, System::SharedPtr<EndPoint> &remoteEP)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| buffer | System::Details::ArrayView\<uint8_t\> | 接收的数据将被分配的字节数组。 |
| offset | int32_t | 指定数组中的字节偏移量。 |
| size | int32_t | 要接收的字节数，这些字节将从 'offset' 索引开始分配到指定的字节数组。 |
| socketFlags | SocketFlags | 接收行为。 |
| remoteEP | System::SharedPtr\<EndPoint\>\& | 远程端点。 |

### ReturnValue

接收的字节数。

## 另见

* Enum [SocketFlags](../../socketflags/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::ReceiveFrom(System::Details::ArrayView\<uint8_t\>, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>\&) method


从指定的端点接收数据并写入指定的字节数组。

```cpp
int32_t System::Net::Sockets::Socket::ReceiveFrom(System::Details::ArrayView<uint8_t> buffer, int32_t size, SocketFlags socketFlags, System::SharedPtr<EndPoint> &remoteEP)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| buffer | System::Details::ArrayView\<uint8_t\> | 接收的数据将被分配的字节数组。 |
| size | int32_t | 要接收的字节数，这些字节将从 'offset' 索引开始分配到指定的字节数组。 |
| socketFlags | SocketFlags | 接收行为。 |
| remoteEP | System::SharedPtr\<EndPoint\>\& | 远程端点。 |

### ReturnValue

接收的字节数。

## 另见

* Enum [SocketFlags](../../socketflags/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::ReceiveFrom(System::Details::ArrayView\<uint8_t\>, SocketFlags, System::SharedPtr\<EndPoint\>\&) method


从指定的端点接收数据并写入指定的字节数组。

```cpp
int32_t System::Net::Sockets::Socket::ReceiveFrom(System::Details::ArrayView<uint8_t> buffer, SocketFlags socketFlags, System::SharedPtr<EndPoint> &remoteEP)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| buffer | System::Details::ArrayView\<uint8_t\> | 接收的数据将被分配的字节数组。 |
| socketFlags | SocketFlags | 接收行为。 |
| remoteEP | System::SharedPtr\<EndPoint\>\& | 远程端点。 |

### ReturnValue

接收的字节数。

## 另见

* Enum [SocketFlags](../../socketflags/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::ReceiveFrom(System::Details::ArrayView\<uint8_t\>, System::SharedPtr\<EndPoint\>\&) method


从指定的端点接收数据并写入指定的字节数组。

```cpp
int32_t System::Net::Sockets::Socket::ReceiveFrom(System::Details::ArrayView<uint8_t> buffer, System::SharedPtr<EndPoint> &remoteEP)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| buffer | System::Details::ArrayView\<uint8_t\> | 接收的数据将被分配的字节数组。 |
| remoteEP | System::SharedPtr\<EndPoint\>\& | 远程端点。 |

### ReturnValue

接收的字节数。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::ReceiveFrom(System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>\&) method


从指定的端点接收数据并写入指定的字节数组。

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::ReceiveFrom(System::Details::StackArray<uint8_t, N> &buffer, int32_t offset, int32_t size, SocketFlags socketFlags, System::SharedPtr<EndPoint> &remoteEP)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| buffer | System::Details::StackArray\<uint8_t, N\>\& | 接收的数据将被分配的字节数组。 |
| offset | int32_t | 指定数组中的字节偏移量。 |
| size | int32_t | 要接收的字节数，这些字节将从 'offset' 索引开始分配到指定的字节数组。 |
| socketFlags | SocketFlags | 接收行为。 |
| remoteEP | System::SharedPtr\<EndPoint\>\& | 远程端点。 |

### ReturnValue

接收的字节数。

## 另见

* Enum [SocketFlags](../../socketflags/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::ReceiveFrom(System::Details::StackArray\<uint8_t, N\>\&, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>\&) method


从指定的端点接收数据并写入指定的字节数组。

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::ReceiveFrom(System::Details::StackArray<uint8_t, N> &buffer, int32_t size, SocketFlags socketFlags, System::SharedPtr<EndPoint> &remoteEP)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| buffer | System::Details::StackArray\<uint8_t, N\>\& | 接收的数据将被分配的字节数组。 |
| size | int32_t | 要接收的字节数，这些字节将从 'offset' 索引开始分配到指定的字节数组。 |
| socketFlags | SocketFlags | 接收行为。 |
| remoteEP | System::SharedPtr\<EndPoint\>\& | 远程端点。 |

### ReturnValue

接收的字节数。

## 另见

* Enum [SocketFlags](../../socketflags/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::ReceiveFrom(System::Details::StackArray\<uint8_t, N\>\&, System::SharedPtr\<EndPoint\>\&) method


从指定的端点接收数据并写入指定的字节数组。

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::ReceiveFrom(System::Details::StackArray<uint8_t, N> &buffer, System::SharedPtr<EndPoint> &remoteEP)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| buffer | System::Details::StackArray\<uint8_t, N\>\& | 接收的数据将被分配的字节数组。 |
| remoteEP | System::SharedPtr\<EndPoint\>\& | 远程端点。 |

### ReturnValue

接收的字节数。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
