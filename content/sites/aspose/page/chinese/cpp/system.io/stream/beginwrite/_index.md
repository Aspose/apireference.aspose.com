---
title: "System::IO::Stream::BeginWrite 方法"
linktitle: "BeginWrite"
second_title: "Aspose.Page 适用于 C++"
description: "System::IO::Stream::BeginWrite 方法。启动一个异步写入操作（C++）。"
type: docs
weight: 200
url: /zh/cpp/system.io/stream/beginwrite/
---
## Stream::BeginWrite method


启动异步写入操作。

```cpp
virtual System::SharedPtr<System::IAsyncResult> System::IO::Stream::BeginWrite(System::ArrayPtr<uint8_t> buffer, int offset, int count, System::AsyncCallback callback, System::SharedPtr<System::Object> state)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| 缓冲区 | System::ArrayPtr\<uint8_t\> | 包含待写入数据的缓冲区 |
| offset | int | 在 **buffer** 中的基于 0 的偏移量，指示写入数据开始的位置 |
| count | int | 要写入的字节数 |
| 回调 | System::AsyncCallback | 操作完成时要调用的回调。 |
| 状态 | System::SharedPtr\<System::Object\> | 用户提供的数据，用于唯一标识每个异步写入操作 |

### ReturnValue

一个表示已启动的异步写入操作的 [IAsyncResult](../../../system/iasyncresult/) 对象

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [AsyncCallback](../../../system/asynccallback/)
* Class [Object](../../../system/object/)
* Class [Stream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
