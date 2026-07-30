---
title: "System::Net::Security::SslStream::EndRead 方法"
linktitle: "EndRead"
second_title: "Aspose.Font 适用于 C++"
description: "System::Net::Security::SslStream::EndRead 方法。等待指定的异步读取操作在 C++ 中完成。"
type: docs
weight: 700
url: /zh/cpp/system.net.security/sslstream/endread/
---
## SslStream::EndRead method


等待指定的异步读取操作完成。

```cpp
int32_t System::Net::Security::SslStream::EndRead(System::SharedPtr<IAsyncResult> asyncResult) override
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| asyncResult | System::SharedPtr\<IAsyncResult\> | 表示异步读取操作的 [IAsyncResult](../../../system/iasyncresult/) 对象 |

### ReturnValue

在 **asyncResult** 表示的读取操作期间读取的字节数

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Class [SslStream](../)
* Namespace [System::Net::Security](../../)
* Library [Aspose.Font for C++](../../../)
