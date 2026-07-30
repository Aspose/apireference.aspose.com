---
title: "System::IO::Stream::BeginRead 方法"
linktitle: "BeginRead"
second_title: "Aspose.Font 适用于 C++"
description: "System::IO::Stream::BeginRead 方法。在 C++ 中启动异步读取操作。"
type: docs
weight: 100
url: /zh/cpp/system.io/stream/beginread/
---
## Stream::BeginRead method


发起异步读取操作。

```cpp
virtual System::SharedPtr<System::IAsyncResult> System::IO::Stream::BeginRead(System::ArrayPtr<uint8_t> buffer, int offset, int count, System::AsyncCallback callback, System::SharedPtr<System::Object> state)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| buffer | System::ArrayPtr\<uint8_t\> | 用于读取的缓冲区 |
| offset | int | 在 **buffer** 中的 0 基偏移，指示开始写入读取数据的位置。 |
| count | int | 要读取的字节数 |
| 回调 | System::AsyncCallback | 操作完成时要调用的回调函数 |
| state | System::SharedPtr\<System::Object\> | 用户提供的数据，用于唯一标识每个异步读取操作 |

### ReturnValue

一个表示已启动的异步读取操作的 [IAsyncResult](../../../system/iasyncresult/) 对象

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [AsyncCallback](../../../system/asynccallback/)
* Class [Object](../../../system/object/)
* Class [Stream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
