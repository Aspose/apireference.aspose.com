---
title: "System::Net::Http::HttpResponseMessage 类"
linktitle: "HttpResponseMessage"
second_title: "Aspose.Font 适用于 C++"
description: "System::Net::Http::HttpResponseMessage 类。表示 HTTP 响应消息。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 函数。"
type: docs
weight: 900
url: /zh/cpp/system.net.http/httpresponsemessage/
---
## HttpResponseMessage class


表示 HTTP 响应消息。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class HttpResponseMessage : public System::IDisposable
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [Dispose](./dispose/)() override | 释放当前实例。此方法还会释放 HTTP 响应的内容。 |
| [EnsureSuccessStatusCode](./ensuresuccessstatuscode/)() | 检查状态码。当状态码不属于 2xx 时，将抛出 [HttpRequestException](../httprequestexception/)。 |
| [get_Content](./get_content/)() const | 获取 HTTP 响应的内容。 |
| [get_Headers](./get_headers/)() const | 返回 HTTP 内容头。 |
| [get_IsSuccessStatusCode](./get_issuccessstatuscode/)() const | 检查状态码是否表明客户端请求的操作已被接收、理解并接受。 |
| [get_ReasonPhrase](./get_reasonphrase/)() const | 获取服务器随状态码一起发送的 Reason-Phrase。 |
| [get_RequestMessage](./get_requestmessage/)() const | 获取 HTTP 请求消息。 |
| [get_StatusCode](./get_statuscode/)() const | 获取 HTTP 状态码。 |
| [get_Version](./get_version/)() const | RTTI 信息。 |
| [HttpResponseMessage](./httpresponsemessage/)() | 构造一个新实例。 |
| [HttpResponseMessage](./httpresponsemessage/)(HttpStatusCode) | 构造一个新实例。 |
| [set_Content](./set_content/)(System::SharedPtr\<HttpContent\>) | 设置 HTTP 响应的内容。 |
| [set_ReasonPhrase](./set_reasonphrase/)(String) | 设置服务器随状态码一起发送的 Reason-Phrase。 |
| [set_RequestMessage](./set_requestmessage/)(System::SharedPtr\<HttpRequestMessage\>) | 设置 HTTP 请求消息。 |
| [set_StatusCode](./set_statuscode/)(HttpStatusCode) | 设置 HTTP 状态码。 |
| [set_Version](./set_version/)(System::Version) | 设置 HTTP 版本。 |
| [ToString](./tostring/)() const override | [System::Object::ToString](../../system/object/tostring/). |
## 另见

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Net::Http](../)
* Library [Aspose.Font for C++](../../)
