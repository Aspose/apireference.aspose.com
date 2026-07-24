---
title: "System::Net::FileWebRequest::EndGetRequestStream 方法"
linktitle: "EndGetRequestStream"
second_title: "Aspose.Page 适用于 C++"
description: "System::Net::FileWebRequest::EndGetRequestStream 方法。 在 C++ 中等待指定的获取流的异步操作完成。"
type: docs
weight: 500
url: /zh/cpp/system.net/filewebrequest/endgetrequeststream/
---
## FileWebRequest::EndGetRequestStream method


等待指定的获取流的异步操作完成。

```cpp
System::SharedPtr<IO::Stream> System::Net::FileWebRequest::EndGetRequestStream(System::SharedPtr<IAsyncResult> asyncResult) override
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| asyncResult | System::SharedPtr\<IAsyncResult\> | 一个 [IAsyncResult](../../../system/iasyncresult/) 对象，表示获取流的异步操作。 |

### ReturnValue

用于向资源写入数据的流。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Class [FileWebRequest](../)
* Namespace [System::Net](../../)
* Library [Aspose.Page for C++](../../../)
