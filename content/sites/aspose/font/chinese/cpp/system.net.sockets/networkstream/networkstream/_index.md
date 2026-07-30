---
title: "System::Net::Sockets::NetworkStream::NetworkStream 构造函数"
linktitle: "NetworkStream"
second_title: "Aspose.Font 适用于 C++"
description: "System::Net::Sockets::NetworkStream::NetworkStream 构造函数。构造一个新的实例（C++）。"
type: docs
weight: 100
url: /zh/cpp/system.net.sockets/networkstream/networkstream/
---
## NetworkStream::NetworkStream(System::SharedPtr\<System::Net::Sockets::Socket\>) constructor


构造一个新实例。

```cpp
System::Net::Sockets::NetworkStream::NetworkStream(System::SharedPtr<System::Net::Sockets::Socket> socket)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 套接字 | System::SharedPtr\<System::Net::Sockets::Socket\> | 用于发送和接收数据的套接字。 |

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Socket](../../socket/)
* Class [NetworkStream](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## NetworkStream::NetworkStream(System::SharedPtr\<System::Net::Sockets::Socket\>, bool) constructor


构造一个新实例。

```cpp
System::Net::Sockets::NetworkStream::NetworkStream(System::SharedPtr<System::Net::Sockets::Socket> socket, bool ownsSocket)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 套接字 | System::SharedPtr\<System::Net::Sockets::Socket\> | 用于发送和接收数据的套接字。 |
| ownsSocket | bool | 一个值，用于指示当该值为 true 时，当前实例是否获取对指定套接字的所有权。 |

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Socket](../../socket/)
* Class [NetworkStream](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## NetworkStream::NetworkStream(System::SharedPtr\<System::Net::Sockets::Socket\>, System::IO::FileAccess, bool) constructor


构造一个新实例。

```cpp
System::Net::Sockets::NetworkStream::NetworkStream(System::SharedPtr<System::Net::Sockets::Socket> socket, System::IO::FileAccess access, bool ownsSocket)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 套接字 | System::SharedPtr\<System::Net::Sockets::Socket\> | 用于发送和接收数据的套接字。 |
| 访问 | System::IO::FileAccess | 指定在指定套接字上分配给实例的访问类型。 |
| ownsSocket | bool | 一个值，用于指示当该值为 true 时，当前实例是否获取对指定套接字的所有权。 |

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Socket](../../socket/)
* Enum [FileAccess](../../../system.io/fileaccess/)
* Class [NetworkStream](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
