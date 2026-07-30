---
title: "System::Net::Sockets::Socket::BeginConnect 方法"
linktitle: "BeginConnect"
second_title: "Aspose.Font 适用于 C++"
description: "System::Net::Sockets::Socket::BeginConnect 方法。 在 C++ 中发起异步连接操作。"
type: docs
weight: 700
url: /zh/cpp/system.net.sockets/socket/beginconnect/
---
## Socket::BeginConnect(String, int32_t, AsyncCallback, System::SharedPtr\<Object\>) method


发起异步连接操作。

```cpp
System::SharedPtr<IAsyncResult> System::Net::Sockets::Socket::BeginConnect(String host, int32_t port, AsyncCallback requestCallback, System::SharedPtr<Object> state)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| host | String | 远程主机名。 |
| port | int32_t | 远程主机的端口号。 |
| requestCallback | AsyncCallback | 当操作完成时将被调用的回调。 |
| state | System::SharedPtr\<Object\> | 用户提供的数据，用于唯一标识每个异步连接操作。 |

### ReturnValue

表示已发起的异步连接操作的 [IAsyncResult](../../../system/iasyncresult/) 对象。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Class [String](../../../system/string/)
* Typedef [AsyncCallback](../../../system/asynccallback/)
* Class [Object](../../../system/object/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::BeginConnect(System::ArrayPtr\<System::SharedPtr\<IPAddress\>\>, int32_t, AsyncCallback, System::SharedPtr\<Object\>) method


发起异步连接操作。

```cpp
System::SharedPtr<IAsyncResult> System::Net::Sockets::Socket::BeginConnect(System::ArrayPtr<System::SharedPtr<IPAddress>> addresses, int32_t port, AsyncCallback requestCallback, System::SharedPtr<Object> state)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| addresses | System::ArrayPtr\<System::SharedPtr\<IPAddress\>\> | 远程主机的 IP 地址。 |
| port | int32_t | 远程主机的端口号。 |
| requestCallback | AsyncCallback | 当操作完成时将被调用的回调。 |
| state | System::SharedPtr\<Object\> | 用户提供的数据，用于唯一标识每个异步连接操作。 |

### ReturnValue

表示已发起的异步连接操作的 [IAsyncResult](../../../system/iasyncresult/) 对象。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [IPAddress](../../../system.net/ipaddress/)
* Typedef [AsyncCallback](../../../system/asynccallback/)
* Class [Object](../../../system/object/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::BeginConnect(System::SharedPtr\<EndPoint\>, AsyncCallback, System::SharedPtr\<Object\>) method


发起异步连接操作。

```cpp
System::SharedPtr<IAsyncResult> System::Net::Sockets::Socket::BeginConnect(System::SharedPtr<EndPoint> remoteEP, AsyncCallback callback, System::SharedPtr<Object> state)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| remoteEP | System::SharedPtr\<EndPoint\> | 远程端点。 |
| 回调 | AsyncCallback | 当操作完成时将被调用的回调。 |
| state | System::SharedPtr\<Object\> | 用户提供的数据，用于唯一标识每个异步连接操作。 |

### ReturnValue

表示已发起的异步连接操作的 [IAsyncResult](../../../system/iasyncresult/) 对象。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Class [EndPoint](../../../system.net/endpoint/)
* Typedef [AsyncCallback](../../../system/asynccallback/)
* Class [Object](../../../system/object/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::BeginConnect(System::SharedPtr\<IPAddress\>, int32_t, AsyncCallback, System::SharedPtr\<Object\>) method


发起异步连接操作。

```cpp
System::SharedPtr<IAsyncResult> System::Net::Sockets::Socket::BeginConnect(System::SharedPtr<IPAddress> address, int32_t port, AsyncCallback requestCallback, System::SharedPtr<Object> state)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 地址 | System::SharedPtr\<IPAddress\> | 远程主机 IP 地址。 |
| port | int32_t | 远程主机的端口号。 |
| requestCallback | AsyncCallback | 当操作完成时将被调用的回调。 |
| state | System::SharedPtr\<Object\> | 用户提供的数据，用于唯一标识每个异步连接操作。 |

### ReturnValue

表示已发起的异步连接操作的 [IAsyncResult](../../../system/iasyncresult/) 对象。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Class [IPAddress](../../../system.net/ipaddress/)
* Typedef [AsyncCallback](../../../system/asynccallback/)
* Class [Object](../../../system/object/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
