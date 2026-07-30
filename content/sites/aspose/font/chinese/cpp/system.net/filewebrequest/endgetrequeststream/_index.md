---
title: "System::Net::FileWebRequest::EndGetRequestStream 方法"
linktitle: "EndGetRequestStream"
second_title: "Aspose.Font 适用于 C++"
description: "System::Net::FileWebRequest::EndGetRequestStream 方法。等待指定的获取流的异步操作完成（C++）。"
type: docs
weight: 500
url: /zh/cpp/system.net/filewebrequest/endgetrequeststream/
---
## FileWebRequest::EndGetRequestStream method


等待指定的获取流的异步操作完成。

```cpp
System::SharedPtr<IO::Stream> System::Net::FileWebRequest::EndGetRequestStream(System::SharedPtr<IAsyncResult> asyncResult) override
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
* Class [FileWebRequest](../)
* Namespace [System::Net](../../)
* Library [Aspose.Font for C++](../../../)
