---
title: "System::Net::FileWebRequest::BeginGetRequestStream 方法"
linktitle: "BeginGetRequestStream"
second_title: "Aspose.Font 适用于 C++"
description: "System::Net::FileWebRequest::BeginGetRequestStream 方法。发起异步操作以获取用于向资源写入数据的流（C++）。"
type: docs
weight: 300
url: /zh/cpp/system.net/filewebrequest/begingetrequeststream/
---
## FileWebRequest::BeginGetRequestStream method


启动异步操作以获取用于向资源写入数据的流。

```cpp
System::SharedPtr<IAsyncResult> System::Net::FileWebRequest::BeginGetRequestStream(AsyncCallback callback, System::SharedPtr<Object> state) override
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 回调 | AsyncCallback | 操作完成时调用的回调函数。 |
| state | System::SharedPtr\<Object\> | 用户提供的数据，用于唯一标识每个异步操作。 |

### ReturnValue

一个表示已启动异步操作的 [IAsyncResult](../../../system/iasyncresult/) 对象。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Typedef [AsyncCallback](../../../system/asynccallback/)
* Class [Object](../../../system/object/)
* Class [FileWebRequest](../)
* Namespace [System::Net](../../)
* Library [Aspose.Font for C++](../../../)
