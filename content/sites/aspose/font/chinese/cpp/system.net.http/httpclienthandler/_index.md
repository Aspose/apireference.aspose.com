---
title: "System::Net::Http::HttpClientHandler 类"
linktitle: "HttpClientHandler"
second_title: "Aspose.Font 适用于 C++"
description: "System::Net::Http::HttpClientHandler 类。表示 HttpClient 类使用的默认消息处理程序。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 函数。"
type: docs
weight: 300
url: /zh/cpp/system.net.http/httpclienthandler/
---
## HttpClientHandler class


表示 [HttpClient](../httpclient/) 类使用的默认消息处理程序。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class HttpClientHandler : public System::Net::Http::HttpMessageHandler
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [Dispose](./dispose/)() override | 不执行任何操作。 |
| [get_CookieContainer](./get_cookiecontainer/)() | 获取用于存储服务器 Cookie 的 Cookie 容器。 |
| [get_Credentials](./get_credentials/)() | 获取身份验证信息。 |
| [HttpClientHandler](./httpclienthandler/)() | RTTI 信息。 |
| [Send](./send/)(System::SharedPtr\<HttpRequestMessage\>) override | RTTI 信息。 |
| [set_CookieContainer](./set_cookiecontainer/)(System::SharedPtr\<System::Net::CookieContainer\>) | 设置用于存储服务器 Cookie 的 Cookie 容器。 |
| [set_Credentials](./set_credentials/)(System::SharedPtr\<ICredentials\>) | 设置身份验证信息。 |
| [set_Proxy](./set_proxy/)(System::SharedPtr\<IWebProxy\>) | 设置代理信息。 |
| [set_Timeout](./set_timeout/)(int32_t) | 获取请求超时的毫秒时间量。 |
| [set_UseCookies](./set_usecookies/)(bool) | 设置指示当前实例是否使用 Cookie 容器来存储服务器 Cookie，以及在发送请求时是否使用服务器 Cookie 的值。 |
| [set_UseProxy](./set_useproxy/)(bool) | 设置指示当前实例是否在发送请求时使用代理的值。 |
## 另见

* Class [HttpMessageHandler](../httpmessagehandler/)
* Namespace [System::Net::Http](../)
* Library [Aspose.Font for C++](../../)
