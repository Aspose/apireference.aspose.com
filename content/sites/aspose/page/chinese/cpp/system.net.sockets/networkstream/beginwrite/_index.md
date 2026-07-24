---
title: "System::Net::Sockets::NetworkStream::BeginWrite 方法"
linktitle: "BeginWrite"
second_title: "Aspose.Page 适用于 C++"
description: "System::Net::Sockets::NetworkStream::BeginWrite 方法。在 C++ 中启动异步写入操作。"
type: docs
weight: 400
url: /zh/cpp/system.net.sockets/networkstream/beginwrite/
---
## NetworkStream::BeginWrite method


启动异步写入操作。

```cpp
System::SharedPtr<IAsyncResult> System::Net::Sockets::NetworkStream::BeginWrite(System::ArrayPtr<uint8_t> buffer, int32_t offset, int32_t size, AsyncCallback callback, System::SharedPtr<Object> state) override
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| 缓冲区 | System::ArrayPtr\<uint8_t\> | 包含待写入数据的缓冲区。 |
| offset | int32_t | 指定数组中的字节偏移量。 |
| size | int32_t | 要写入的字节数。 |
| 回调 | AsyncCallback | 操作完成时将被调用的回调函数。 |
| 状态 | System::SharedPtr\<Object\> | 用户提供的数据，用于唯一标识每个异步写入操作。 |

### ReturnValue

一个表示已启动的异步写入操作的 [IAsyncResult](../../../system/iasyncresult/) 对象。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [AsyncCallback](../../../system/asynccallback/)
* Class [Object](../../../system/object/)
* Class [NetworkStream](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
