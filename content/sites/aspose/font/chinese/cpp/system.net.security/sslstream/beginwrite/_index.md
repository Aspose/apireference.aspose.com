---
title: "System::Net::Security::SslStream::BeginWrite 方法"
linktitle: "BeginWrite"
second_title: "Aspose.Font 适用于 C++"
description: "System::Net::Security::SslStream::BeginWrite 方法。启动在 C++ 中的异步写入操作。"
type: docs
weight: 400
url: /zh/cpp/system.net.security/sslstream/beginwrite/
---
## SslStream::BeginWrite method


发起异步写入操作。

```cpp
System::SharedPtr<IAsyncResult> System::Net::Security::SslStream::BeginWrite(System::ArrayPtr<uint8_t> buffer, int32_t offset, int32_t count, AsyncCallback asyncCallback, System::SharedPtr<Object> asyncState) override
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| buffer | System::ArrayPtr\<uint8_t\> | 用于写入数据的字节数组。 |
| offset | int32_t | 指定数组中的字节偏移量。 |
| count | int32_t | 要写入的字节数。 |
| asyncCallback | AsyncCallback | 操作完成时调用的回调函数。 |
| asyncState | System::SharedPtr\<Object\> | 用户提供的数据，用于唯一标识每个异步写入操作。 |

### ReturnValue

一个 [IAsyncResult](../../../system/iasyncresult/) 对象，表示已启动的异步写入操作。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [AsyncCallback](../../../system/asynccallback/)
* Class [Object](../../../system/object/)
* Class [SslStream](../)
* Namespace [System::Net::Security](../../)
* Library [Aspose.Font for C++](../../../)
