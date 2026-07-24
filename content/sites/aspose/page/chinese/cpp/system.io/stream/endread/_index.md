---
title: "System::IO::Stream::EndRead 方法"
linktitle: "EndRead"
second_title: "Aspose.Page 适用于 C++"
description: "System::IO::Stream::EndRead 方法。等待指定的异步读取操作在 C++ 中完成。"
type: docs
weight: 600
url: /zh/cpp/system.io/stream/endread/
---
## Stream::EndRead method


等待指定的异步读取操作完成。

```cpp
virtual int System::IO::Stream::EndRead(System::SharedPtr<System::IAsyncResult> asyncResult)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| asyncResult | System::SharedPtr\<System::IAsyncResult\> | 一个表示异步读取操作的 [IAsyncResult](../../../system/iasyncresult/) 对象 |

### ReturnValue

在由 **asyncResult** 表示的读取操作期间读取的字节数

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Class [Stream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
