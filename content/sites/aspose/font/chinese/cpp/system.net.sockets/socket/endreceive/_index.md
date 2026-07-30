---
title: "System::Net::Sockets::Socket::EndReceive 方法"
linktitle: "EndReceive"
second_title: "Aspose.Font 适用于 C++"
description: "System::Net::Sockets::Socket::EndReceive 方法。等待指定的异步接收操作在 C++ 中完成。"
type: docs
weight: 1500
url: /zh/cpp/system.net.sockets/socket/endreceive/
---
## Socket::EndReceive(System::SharedPtr\<IAsyncResult\>) method


等待指定的异步接收操作完成。

```cpp
int32_t System::Net::Sockets::Socket::EndReceive(System::SharedPtr<IAsyncResult> asyncResult)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| asyncResult | System::SharedPtr\<IAsyncResult\> | 一个表示异步接收操作的 [IAsyncResult](../../../system/iasyncresult/) 对象。 |

### ReturnValue

已接收的字节数。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::EndReceive(System::SharedPtr\<IAsyncResult\>, SocketError\&) method


等待指定的异步接收操作完成。

```cpp
int32_t System::Net::Sockets::Socket::EndReceive(System::SharedPtr<IAsyncResult> asyncResult, SocketError &errorCode)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| asyncResult | System::SharedPtr\<IAsyncResult\> | 一个表示异步接收操作的 [IAsyncResult](../../../system/iasyncresult/) 对象。 |
| errorCode | SocketError\& | 当接收操作失败时，错误代码将被分配的输出参数。 |

### ReturnValue

接收的字节数。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Enum [SocketError](../../socketerror/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
