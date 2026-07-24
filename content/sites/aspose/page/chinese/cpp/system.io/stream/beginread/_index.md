---
title: "System::IO::Stream::BeginRead 方法"
linktitle: "BeginRead"
second_title: "Aspose.Page 适用于 C++"
description: "System::IO::Stream::BeginRead 方法。启动一个异步读取操作，在 C++ 中。"
type: docs
weight: 100
url: /zh/cpp/system.io/stream/beginread/
---
## Stream::BeginRead method


启动异步读取操作。

```cpp
virtual System::SharedPtr<System::IAsyncResult> System::IO::Stream::BeginRead(System::ArrayPtr<uint8_t> buffer, int offset, int count, System::AsyncCallback callback, System::SharedPtr<System::Object> state)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| 缓冲区 | System::ArrayPtr\<uint8_t\> | 用于读取的缓冲区 |
| offset | int | 在 **buffer** 中的 0 基偏移，指示从何处开始写入读取的数据位置 |
| count | int | 要读取的字节数 |
| 回调 | System::AsyncCallback | 操作完成时要调用的回调。 |
| 状态 | System::SharedPtr\<System::Object\> | 用于唯一标识每个异步读取操作的用户提供数据。 |

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
* Library [Aspose.Page for C++](../../../)
