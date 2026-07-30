---
title: "System::Net::HttpWebRequest::EndGetResponse 方法"
linktitle: "EndGetResponse"
second_title: "Aspose.Font 适用于 C++"
description: "System::Net::HttpWebRequest::EndGetResponse 方法。等待在 C++ 中指定的资源异步请求完成。"
type: docs
weight: 700
url: /zh/cpp/system.net/httpwebrequest/endgetresponse/
---
## HttpWebRequest::EndGetResponse method


等待指定的资源异步请求完成。

```cpp
System::SharedPtr<WebResponse> System::Net::HttpWebRequest::EndGetResponse(System::SharedPtr<IAsyncResult> asyncResult) override
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
* Class [HttpWebRequest](../)
* Namespace [System::Net](../../)
* Library [Aspose.Font for C++](../../../)
