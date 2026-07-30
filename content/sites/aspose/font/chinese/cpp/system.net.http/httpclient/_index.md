---
title: "System::Net::Http::HttpClient 类"
linktitle: "HttpClient"
second_title: "Aspose.Font 适用于 C++"
description: "System::Net::Http::HttpClient 类。表示用于发送请求和接收响应的 HTTP 客户端的基类。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 中的函数。"
type: docs
weight: 200
url: /zh/cpp/system.net.http/httpclient/
---
## HttpClient class


表示用于发送请求和接收响应的 HTTP 客户端的基类。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class HttpClient : public System::Net::Http::HttpMessageInvoker
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [CancelPendingRequests](./cancelpendingrequests/)() | 取消所有挂起的请求。 |
| [get_BaseAddress](./get_baseaddress/)() | 获取用于发送请求的资源的基地址。 |
| [get_DefaultRequestHeaders](./get_defaultrequestheaders/)() | RTTI 信息。 |
| [get_MaxResponseContentBufferSize](./get_maxresponsecontentbuffersize/)() | 获取响应内容的最大字节数。 |
| [get_Timeout](./get_timeout/)() | 获取请求超时前的等待时间间隔。 |
| [HttpClient](./httpclient/)() | 构造一个新实例。 |
| [HttpClient](./httpclient/)(System::SharedPtr\<HttpMessageHandler\>) | 构造一个新实例。 |
| [HttpClient](./httpclient/)(System::SharedPtr\<HttpMessageHandler\>, bool) | 构造一个新实例。 |
| [Send](./send/)(System::SharedPtr\<HttpRequestMessage\>, HttpCompletionOption) | 发送指定的 HTTP 请求。 |
| [set_BaseAddress](./set_baseaddress/)(System::SharedPtr\<Uri\>) | 设置用于发送请求的资源的基地址。 |
| [set_MaxResponseContentBufferSize](./set_maxresponsecontentbuffersize/)(int64_t) | 设置响应内容的最大字节数。 |
| [set_Timeout](./set_timeout/)(TimeSpan) | 设置请求超时前的等待时间间隔。 |
## 另见

* Class [HttpMessageInvoker](../httpmessageinvoker/)
* Namespace [System::Net::Http](../)
* Library [Aspose.Font for C++](../../)
