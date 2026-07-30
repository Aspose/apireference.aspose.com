---
title: "System::Web::Services::Protocols::WebClientProtocol 类"
linktitle: "WebClientProtocol"
second_title: "Aspose.Font 适用于 C++"
description: "System::Web::Services::Protocols::WebClientProtocol 类。此基类用于所有使用 ASP.NET 创建的 XML Web 服务客户端代理。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 中的函数。"
type: docs
weight: 1100
url: /zh/cpp/system.web.services.protocols/webclientprotocol/
---
## WebClientProtocol class


此基类用于所有使用 ASP.NET 创建的 XML [Web](../../system.web/) 服务客户端代理。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class WebClientProtocol : public virtual System::Object
```

## 方法

| 方法 | 描述 |
| --- | --- |
| virtual [Abort](./abort/)() | 取消请求。 |
| [get_ConnectionGroupName](./get_connectiongroupname/)() | 获取连接组的名称。 |
| [get_Credentials](./get_credentials/)() | 获取身份验证信息。 |
| [get_PreAuthenticate](./get_preauthenticate/)() | 获取一个值，指示是否启用了预身份验证。 |
| [get_RequestEncoding](./get_requestencoding/)() | 获取用于发起客户端请求的编码。 |
| [get_Timeout](./get_timeout/)() | 获取请求超时前的等待时间间隔。 |
| [get_Uri](./get_uri/)() | 获取 XML [Web](../../system.web/) 服务的 URI。 |
| [get_Url](./get_url/)() | 获取 XML [Web](../../system.web/) 服务的 URL。 |
| [get_UseDefaultCredentials](./get_usedefaultcredentials/)() | 获取一个指示 'Credential' 属性是否等于 'DefaultCredentials' 属性的值。 |
| [set_ConnectionGroupName](./set_connectiongroupname/)(String) | 设置连接组的名称。 |
| [set_Credentials](./set_credentials/)(System::SharedPtr\<Net::ICredentials\>) | 设置身份验证信息。 |
| [set_PreAuthenticate](./set_preauthenticate/)(bool) | 设置一个值，指示是否启用了预身份验证。 |
| [set_RequestEncoding](./set_requestencoding/)(System::SharedPtr\<Text::Encoding\>) | 设置用于发起客户端请求的编码。 |
| [set_Timeout](./set_timeout/)(int32_t) | 设置请求超时前的等待时间间隔。 |
| [set_Uri](./set_uri/)(System::SharedPtr\<Uri\>) | 设置 XML [Web](../../system.web/) 服务的 URI。 |
| [set_Url](./set_url/)(String) | 设置 XML [Web](../../system.web/) 服务的 URL。 |
| [set_UseDefaultCredentials](./set_usedefaultcredentials/)(bool) | 设置一个值，指示 'Credential' 属性是否等于 'DefaultCredentials' 属性。 |
## 另见

* Class [Object](../../system/object/)
* Namespace [System::Web::Services::Protocols](../)
* Library [Aspose.Font for C++](../../)
