---
title: "System::Net::WebRequest::BeginGetResponse 方法"
linktitle: "BeginGetResponse"
second_title: "Aspose.Font 适用于 C++"
description: "System::Net::WebRequest::BeginGetResponse 方法。发起对资源的异步请求（C++）。"
type: docs
weight: 1100
url: /zh/cpp/system.net/webrequest/begingetresponse/
---
## WebRequest::BeginGetResponse method


启动对资源的异步请求。

```cpp
virtual System::SharedPtr<IAsyncResult> System::Net::WebRequest::BeginGetResponse(AsyncCallback callback, System::SharedPtr<Object> state)=0
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
* Class [WebRequest](../)
* Namespace [System::Net](../../)
* Library [Aspose.Font for C++](../../../)
