---
title: "System::Net::WebRequest::EndGetResponse 方法"
linktitle: "EndGetResponse"
second_title: "Aspose.Font 适用于 C++"
description: "System::Net::WebRequest::EndGetResponse 方法。等待指定的异步资源请求完成（C++）。"
type: docs
weight: 1300
url: /zh/cpp/system.net/webrequest/endgetresponse/
---
## WebRequest::EndGetResponse method


等待指定的资源异步请求完成。

```cpp
virtual System::SharedPtr<WebResponse> System::Net::WebRequest::EndGetResponse(System::SharedPtr<IAsyncResult> asyncResult)=0
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| asyncResult | System::SharedPtr\<IAsyncResult\> | 一个表示资源异步请求的 [IAsyncResult](../../../system/iasyncresult/) 对象。 |

### ReturnValue

Web 响应。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [WebResponse](../../webresponse/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Class [WebRequest](../)
* Namespace [System::Net](../../)
* Library [Aspose.Font for C++](../../../)
