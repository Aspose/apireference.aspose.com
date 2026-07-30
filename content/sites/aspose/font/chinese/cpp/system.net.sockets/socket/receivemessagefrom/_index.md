---
title: "System::Net::Sockets::Socket::ReceiveMessageFrom 方法"
linktitle: "ReceiveMessageFrom"
second_title: "Aspose.Font 适用于 C++"
description: "System::Net::Sockets::Socket::ReceiveMessageFrom 方法。接收来自指定端点的数据并将其写入 C++ 中指定的字节数组。"
type: docs
weight: 4500
url: /zh/cpp/system.net.sockets/socket/receivemessagefrom/
---
## Socket::ReceiveMessageFrom(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags\&, System::SharedPtr\<EndPoint\>\&, IPPacketInformation\&) method


从指定的端点接收数据并写入指定的字节数组。

```cpp
int32_t System::Net::Sockets::Socket::ReceiveMessageFrom(System::ArrayPtr<uint8_t> buffer, int32_t offset, int32_t size, SocketFlags &socketFlags, System::SharedPtr<EndPoint> &remoteEP, IPPacketInformation &ipPacketInformation)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| buffer | System::ArrayPtr\<uint8_t\> | 接收的数据将被分配的字节数组。 |
| offset | int32_t | 指定数组中的字节偏移量。 |
| size | int32_t | 要接收的字节数，这些字节将从 'offset' 索引开始分配到指定的字节数组。 |
| socketFlags | SocketFlags\& | 接收行为。 |
| remoteEP | System::SharedPtr\<EndPoint\>\& | 远程端点。 |
| ipPacketInformation | IPPacketInformation\& | 输出参数，将在其中分配有关数据包的信息。 |

### ReturnValue

接收的字节数。

## 另见

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [IPPacketInformation](../../ippacketinformation/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::ReceiveMessageFrom(System::Details::ArrayView\<uint8_t\>, int32_t, int32_t, SocketFlags\&, System::SharedPtr\<EndPoint\>\&, IPPacketInformation\&) method


从指定的端点接收数据并写入指定的字节数组。

```cpp
int32_t System::Net::Sockets::Socket::ReceiveMessageFrom(System::Details::ArrayView<uint8_t> buffer, int32_t offset, int32_t size, SocketFlags &socketFlags, System::SharedPtr<EndPoint> &remoteEP, IPPacketInformation &ipPacketInformation)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| buffer | System::Details::ArrayView\<uint8_t\> | 接收的数据将被分配的字节数组。 |
| offset | int32_t | 指定数组中的字节偏移量。 |
| size | int32_t | 要接收的字节数，这些字节将从 'offset' 索引开始分配到指定的字节数组。 |
| socketFlags | SocketFlags\& | 接收行为。 |
| remoteEP | System::SharedPtr\<EndPoint\>\& | 远程端点。 |
| ipPacketInformation | IPPacketInformation\& | 输出参数，将在其中分配有关数据包的信息。 |

### ReturnValue

接收的字节数。

## 另见

* Enum [SocketFlags](../../socketflags/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [IPPacketInformation](../../ippacketinformation/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::ReceiveMessageFrom(System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t, SocketFlags\&, System::SharedPtr\<EndPoint\>\&, IPPacketInformation\&) method


从指定的端点接收数据并写入指定的字节数组。

```cpp
template<std::size_t> int32_t System::Net::Sockets::Socket::ReceiveMessageFrom(System::Details::StackArray<uint8_t, N> &buffer, int32_t offset, int32_t size, SocketFlags &socketFlags, System::SharedPtr<EndPoint> &remoteEP, IPPacketInformation &ipPacketInformation)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| buffer | System::Details::StackArray\<uint8_t, N\>\& | 接收的数据将被分配的字节数组。 |
| offset | int32_t | 指定数组中的字节偏移量。 |
| size | int32_t | 要接收的字节数，这些字节将从 'offset' 索引开始分配到指定的字节数组。 |
| socketFlags | SocketFlags\& | 接收行为。 |
| remoteEP | System::SharedPtr\<EndPoint\>\& | 远程端点。 |
| ipPacketInformation | IPPacketInformation\& | 输出参数，将在其中分配有关数据包的信息。 |

### ReturnValue

接收的字节数。

## 另见

* Enum [SocketFlags](../../socketflags/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../../system.net/endpoint/)
* Class [IPPacketInformation](../../ippacketinformation/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
