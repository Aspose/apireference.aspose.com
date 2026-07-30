---
title: "System::Net::Sockets::Socket::SendTo 方法"
linktitle: "SendTo"
second_title: "Aspose.Font 适用于 C++"
description: "System::Net::Sockets::Socket::SendTo 方法。将指定的数据发送到 C++ 中指定的终结点。"
type: docs
weight: 4700
url: /zh/cpp/system.net.sockets/socket/sendto/
---
## Socket::SendTo(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>) method


将指定的数据发送到指定的端点。

```cpp
int32_t System::Net::Sockets::Socket::SendTo(System::ArrayPtr<uint8_t> buffer, int32_t offset, int32_t size, SocketFlags socketFlags, System::SharedPtr<EndPoint> remoteEP)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| buffer | System::ArrayPtr\<uint8_t\> | 要发送的数据。 |
| offset | int32_t | 指定数组中的字节偏移量。 |
| size | int32_t | 从 'offset' 参数开始的指定数组中的字节数。 |
| socketFlags | SocketFlags | 发送行为。 |
| remoteEP | System::SharedPtr\<EndPoint\> | 远程端点。 |

### ReturnValue

已发送字节的数量。

## 另见

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::SendTo(System::ArrayPtr\<uint8_t\>, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>) method


将指定的数据发送到指定的端点。

```cpp
int32_t System::Net::Sockets::Socket::SendTo(System::ArrayPtr<uint8_t> buffer, int32_t size, SocketFlags socketFlags, System::SharedPtr<EndPoint> remoteEP)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| buffer | System::ArrayPtr\<uint8_t\> | 要发送的数据。 |
| size | int32_t | 指定数组中的字节数。 |
| socketFlags | SocketFlags | 发送行为。 |
| remoteEP | System::SharedPtr\<EndPoint\> | 远程端点。 |

### ReturnValue

已发送字节的数量。

## 另见

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::SendTo(System::ArrayPtr\<uint8_t\>, SocketFlags, System::SharedPtr\<EndPoint\>) method


将指定的数据发送到指定的端点。

```cpp
int32_t System::Net::Sockets::Socket::SendTo(System::ArrayPtr<uint8_t> buffer, SocketFlags socketFlags, System::SharedPtr<EndPoint> remoteEP)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| buffer | System::ArrayPtr\<uint8_t\> | 要发送的数据。 |
| socketFlags | SocketFlags | 发送行为。 |
| remoteEP | System::SharedPtr\<EndPoint\> | 远程端点。 |

### ReturnValue

已发送字节的数量。

## 另见

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::SendTo(System::ArrayPtr\<uint8_t\>, System::SharedPtr\<EndPoint\>) method


将指定的数据发送到指定的端点。

```cpp
int32_t System::Net::Sockets::Socket::SendTo(System::ArrayPtr<uint8_t> buffer, System::SharedPtr<EndPoint> remoteEP)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| buffer | System::ArrayPtr\<uint8_t\> | 要发送的数据。 |
| remoteEP | System::SharedPtr\<EndPoint\> | 远程端点。 |

### ReturnValue

已发送字节的数量。

## 另见

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::SendTo(System::Details::ArrayView\<uint8_t\>, int32_t, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>) method


将指定的数据发送到指定的端点。

```cpp
int32_t System::Net::Sockets::Socket::SendTo(System::Details::ArrayView<uint8_t> buffer, int32_t offset, int32_t size, SocketFlags socketFlags, System::SharedPtr<EndPoint> remoteEP)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| buffer | System::Details::ArrayView\<uint8_t\> | 要发送的数据。 |
| offset | int32_t | 指定数组中的字节偏移量。 |
| size | int32_t | 从 'offset' 参数开始的指定数组中的字节数。 |
| socketFlags | SocketFlags | 发送行为。 |
| remoteEP | System::SharedPtr\<EndPoint\> | 远程端点。 |

### ReturnValue

已发送字节的数量。

## 另见

* Enum [SocketFlags](../../socketflags/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::SendTo(System::Details::ArrayView\<uint8_t\>, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>) method


将指定的数据发送到指定的端点。

```cpp
int32_t System::Net::Sockets::Socket::SendTo(System::Details::ArrayView<uint8_t> buffer, int32_t size, SocketFlags socketFlags, System::SharedPtr<EndPoint> remoteEP)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| buffer | System::Details::ArrayView\<uint8_t\> | 要发送的数据。 |
| size | int32_t | 指定数组中的字节数。 |
| socketFlags | SocketFlags | 发送行为。 |
| remoteEP | System::SharedPtr\<EndPoint\> | 远程端点。 |

### ReturnValue

已发送字节的数量。

## 另见

* Enum [SocketFlags](../../socketflags/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::SendTo(System::Details::ArrayView\<uint8_t\>, SocketFlags, System::SharedPtr\<EndPoint\>) method


将指定的数据发送到指定的端点。

```cpp
int32_t System::Net::Sockets::Socket::SendTo(System::Details::ArrayView<uint8_t> buffer, SocketFlags socketFlags, System::SharedPtr<EndPoint> remoteEP)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| buffer | System::Details::ArrayView\<uint8_t\> | 要发送的数据。 |
| socketFlags | SocketFlags | 发送行为。 |
| remoteEP | System::SharedPtr\<EndPoint\> | 远程端点。 |

### ReturnValue

已发送字节的数量。

## 另见

* Enum [SocketFlags](../../socketflags/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::SendTo(System::Details::ArrayView\<uint8_t\>, System::SharedPtr\<EndPoint\>) method


将指定的数据发送到指定的端点。

```cpp
int32_t System::Net::Sockets::Socket::SendTo(System::Details::ArrayView<uint8_t> buffer, System::SharedPtr<EndPoint> remoteEP)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| buffer | System::Details::ArrayView\<uint8_t\> | 要发送的数据。 |
| remoteEP | System::SharedPtr\<EndPoint\> | 远程端点。 |

### ReturnValue

已发送字节的数量。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::SendTo(System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>) method


将指定的数据发送到指定的端点。

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::SendTo(System::Details::StackArray<uint8_t, N> &buffer, int32_t offset, int32_t size, SocketFlags socketFlags, System::SharedPtr<EndPoint> remoteEP)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| buffer | System::Details::StackArray\<uint8_t, N\>\& | 要发送的数据。 |
| offset | int32_t | 指定数组中的字节偏移量。 |
| size | int32_t | 从 'offset' 参数开始的指定数组中的字节数。 |
| socketFlags | SocketFlags | 发送行为。 |
| remoteEP | System::SharedPtr\<EndPoint\> | 远程端点。 |

### ReturnValue

已发送字节的数量。

## 另见

* Enum [SocketFlags](../../socketflags/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::SendTo(System::Details::StackArray\<uint8_t, N\>\&, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>) method


将指定的数据发送到指定的端点。

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::SendTo(System::Details::StackArray<uint8_t, N> &buffer, int32_t size, SocketFlags socketFlags, System::SharedPtr<EndPoint> remoteEP)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| buffer | System::Details::StackArray\<uint8_t, N\>\& | 要发送的数据。 |
| size | int32_t | 指定数组中的字节数。 |
| socketFlags | SocketFlags | 发送行为。 |
| remoteEP | System::SharedPtr\<EndPoint\> | 远程端点。 |

### ReturnValue

已发送字节的数量。

## 另见

* Enum [SocketFlags](../../socketflags/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::SendTo(System::Details::StackArray\<uint8_t, N\>\&, SocketFlags, System::SharedPtr\<EndPoint\>) method


将指定的数据发送到指定的端点。

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::SendTo(System::Details::StackArray<uint8_t, N> &buffer, SocketFlags socketFlags, System::SharedPtr<EndPoint> remoteEP)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| buffer | System::Details::StackArray\<uint8_t, N\>\& | 要发送的数据。 |
| socketFlags | SocketFlags | 发送行为。 |
| remoteEP | System::SharedPtr\<EndPoint\> | 远程端点。 |

### ReturnValue

已发送字节的数量。

## 另见

* Enum [SocketFlags](../../socketflags/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::SendTo(System::Details::StackArray\<uint8_t, N\>\&, System::SharedPtr\<EndPoint\>) method


将指定的数据发送到指定的端点。

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::SendTo(System::Details::StackArray<uint8_t, N> &buffer, System::SharedPtr<EndPoint> remoteEP)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| buffer | System::Details::StackArray\<uint8_t, N\>\& | 要发送的数据。 |
| remoteEP | System::SharedPtr\<EndPoint\> | 远程端点。 |

### ReturnValue

已发送字节的数量。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
