---
title: "System::IO::Stream::BeginWrite 方法"
linktitle: "BeginWrite"
second_title: "Aspose.Font 适用于 C++"
description: "System::IO::Stream::BeginWrite 方法。在 C++ 中启动异步写入操作。"
type: docs
weight: 200
url: /zh/cpp/system.io/stream/beginwrite/
---
## Stream::BeginWrite method


发起异步写入操作。

```cpp
virtual System::SharedPtr<System::IAsyncResult> System::IO::Stream::BeginWrite(System::ArrayPtr<uint8_t> buffer, int offset, int count, System::AsyncCallback callback, System::SharedPtr<System::Object> state)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| buffer | System::ArrayPtr\<uint8_t\> | 包含待写入数据的缓冲区 |
| offset | int | 在 **buffer** 中的 0 基偏移，指示写入数据的起始位置 |
| count | int | 要写入的字节数 |
| 回调 | System::AsyncCallback | 操作完成时要调用的回调函数 |
| state | System::SharedPtr\<System::Object\> | 用户提供的数据，用于唯一标识每个异步写入操作 |

### ReturnValue

一个 [IAsyncResult](../../../system/iasyncresult/) 对象，表示已启动的异步写入操作

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [AsyncCallback](../../../system/asynccallback/)
* Class [Object](../../../system/object/)
* Class [Stream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
