---
title: "System::Net::Sockets::NetworkStream::BeginWrite 方法"
linktitle: "BeginWrite"
second_title: "Aspose.Font 适用于 C++"
description: "System::Net::Sockets::NetworkStream::BeginWrite 方法。启动在 C++ 中的异步写入操作。"
type: docs
weight: 400
url: /zh/cpp/system.net.sockets/networkstream/beginwrite/
---
## NetworkStream::BeginWrite method


发起异步写入操作。

```cpp
System::SharedPtr<IAsyncResult> System::Net::Sockets::NetworkStream::BeginWrite(System::ArrayPtr<uint8_t> buffer, int32_t offset, int32_t size, AsyncCallback callback, System::SharedPtr<Object> state) override
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| buffer | System::ArrayPtr\<uint8_t\> | 包含待写入数据的缓冲区。 |
| offset | int32_t | 指定数组中的字节偏移量。 |
| size | int32_t | 要写入的字节数。 |
| 回调 | AsyncCallback | 操作完成时调用的回调函数。 |
| state | System::SharedPtr\<Object\> | 用户提供的数据，用于唯一标识每个异步写入操作。 |

### ReturnValue

一个 [IAsyncResult](../../../system/iasyncresult/) 对象，表示已启动的异步写入操作。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [AsyncCallback](../../../system/asynccallback/)
* Class [Object](../../../system/object/)
* Class [NetworkStream](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
