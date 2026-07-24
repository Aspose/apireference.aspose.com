---
title: "System::Net::Sockets::NetworkStream::BeginRead 方法"
linktitle: "BeginRead"
second_title: "Aspose.Page 适用于 C++"
description: "System::Net::Sockets::NetworkStream::BeginRead 方法。在 C++ 中启动异步读取操作。"
type: docs
weight: 300
url: /zh/cpp/system.net.sockets/networkstream/beginread/
---
## NetworkStream::BeginRead method


启动异步读取操作。

```cpp
System::SharedPtr<IAsyncResult> System::Net::Sockets::NetworkStream::BeginRead(System::ArrayPtr<uint8_t> buffer, int32_t offset, int32_t size, AsyncCallback callback, System::SharedPtr<Object> state) override
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| 缓冲区 | System::ArrayPtr\<uint8_t\> | 读取的字节将被写入的字节数组。 |
| offset | int32_t | 指定数组中的字节偏移量。 |
| size | int32_t | 要读取的字节数。 |
| 回调 | AsyncCallback | 操作完成时将被调用的回调函数。 |
| 状态 | System::SharedPtr\<Object\> | 用户提供的数据，用于唯一标识每个异步读取操作。 |

### ReturnValue

表示已启动的异步读取操作的[IAsyncResult](../../../system/iasyncresult/)对象。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [AsyncCallback](../../../system/asynccallback/)
* Class [Object](../../../system/object/)
* Class [NetworkStream](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
