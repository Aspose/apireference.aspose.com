---
title: "System::Net::WebRequest::EndGetRequestStream 方法"
linktitle: "EndGetRequestStream"
second_title: "Aspose.Font 适用于 C++"
description: "System::Net::WebRequest::EndGetRequestStream 方法。 在 C++ 中等待获取流的指定异步操作完成。"
type: docs
weight: 1200
url: /zh/cpp/system.net/webrequest/endgetrequeststream/
---
## WebRequest::EndGetRequestStream method


等待指定的获取流的异步操作完成。

```cpp
virtual System::SharedPtr<IO::Stream> System::Net::WebRequest::EndGetRequestStream(System::SharedPtr<IAsyncResult> asyncResult)=0
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| asyncResult | System::SharedPtr\<IAsyncResult\> | 一个表示获取流的异步操作的 [IAsyncResult](../../../system/iasyncresult/) 对象。 |

### ReturnValue

用于向资源写入数据的流。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Class [WebRequest](../)
* Namespace [System::Net](../../)
* Library [Aspose.Font for C++](../../../)
