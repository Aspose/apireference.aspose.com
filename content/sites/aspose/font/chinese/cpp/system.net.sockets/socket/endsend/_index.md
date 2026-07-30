---
title: "System::Net::Sockets::Socket::EndSend method"
linktitle: "EndSend"
second_title: "Aspose.Font 适用于 C++"
description: "System::Net::Sockets::Socket::EndSend 方法。等待指定的异步发送操作在 C++ 中完成。"
type: docs
weight: 1600
url: /zh/cpp/system.net.sockets/socket/endsend/
---
## Socket::EndSend(System::SharedPtr\<IAsyncResult\>) method


等待指定的异步发送操作完成。

```cpp
int32_t System::Net::Sockets::Socket::EndSend(System::SharedPtr<IAsyncResult> asyncResult)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| asyncResult | System::SharedPtr\<IAsyncResult\> | 一个 [IAsyncResult](../../../system/iasyncresult/) 对象，表示异步发送操作。 |

### ReturnValue

已发送字节的数量。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## Socket::EndSend(System::SharedPtr\<IAsyncResult\>, SocketError\&) method


等待指定的异步发送操作完成。

```cpp
int32_t System::Net::Sockets::Socket::EndSend(System::SharedPtr<IAsyncResult> asyncResult, SocketError &errorCode)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| asyncResult | System::SharedPtr\<IAsyncResult\> | 一个 [IAsyncResult](../../../system/iasyncresult/) 对象，表示异步发送操作。 |
| errorCode | SocketError\& | 当发送操作失败时，错误代码将被分配到的输出参数。 |

### ReturnValue

已发送字节的数量。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Enum [SocketError](../../socketerror/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
