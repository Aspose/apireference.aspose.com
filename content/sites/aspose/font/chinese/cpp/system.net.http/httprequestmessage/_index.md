---
title: "System::Net::Http::HttpRequestMessage 类"
linktitle: "HttpRequestMessage"
second_title: "Aspose.Font 适用于 C++"
description: "System::Net::Http::HttpRequestMessage 类。表示 HTTP 请求消息。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 中的函数。"
type: docs
weight: 800
url: /zh/cpp/system.net.http/httprequestmessage/
---
## HttpRequestMessage class


表示 HTTP 请求消息。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class HttpRequestMessage : public System::IDisposable
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [Dispose](./dispose/)() override | 释放当前实例。此方法还会释放 HTTP 请求的内容。 |
| [get_Content](./get_content/)() | 获取 HTTP 请求的内容。 |
| [get_Headers](./get_headers/)() | 返回 HTTP 内容头。 |
| [get_Method](./get_method/)() | 获取 HTTP 请求方法。 |
| [get_Properties](./get_properties/)() | 返回 HTTP 请求属性的集合。 |
| [get_RequestUri](./get_requesturi/)() | 获取请求资源的 URI。 |
| [get_Version](./get_version/)() | RTTI 信息。 |
| [HttpRequestMessage](./httprequestmessage/)() | 构造一个新实例。 |
| [HttpRequestMessage](./httprequestmessage/)(System::SharedPtr\<HttpMethod\>, System::SharedPtr\<Uri\>) | 构造一个新实例。 |
| [HttpRequestMessage](./httprequestmessage/)(System::SharedPtr\<HttpMethod\>, String) | 构造一个新实例。 |
| [MarkAsSent](./markassent/)() | 将当前请求标记为已发送。 |
| [set_Content](./set_content/)(System::SharedPtr\<HttpContent\>) | 设置 HTTP 请求的内容。 |
| [set_Method](./set_method/)(System::SharedPtr\<HttpMethod\>) | 设置 HTTP 请求方法。 |
| [set_RequestUri](./set_requesturi/)(System::SharedPtr\<Uri\>) | 设置请求资源的 URI。 |
| [set_Version](./set_version/)(System::Version) | 设置 HTTP 版本。 |
| [ToString](./tostring/)() const override | 相当于 C# 的 [Object.ToString()](../../system/object/tostring/) 方法。用于将自定义对象转换为字符串。 |
## 另见

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Net::Http](../)
* Library [Aspose.Font for C++](../../)
