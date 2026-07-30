---
title: "System::Net::WebProxy class"
linktitle: "WebProxy"
second_title: "Aspose.Font 适用于 C++"
description: "System::Net::WebProxy class。表示一个 http web-proxy 服务器。此类的对象应仅使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 System::SmartPtr 指针中，并使用该指针在 C++ 中将其作为参数传递给函数。"
type: docs
weight: 3700
url: /zh/cpp/system.net/webproxy/
---
## WebProxy class


表示一个 http web-proxy 服务器。此类的对象应仅使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针在函数调用时作为参数传递。

```cpp
class WebProxy : public System::Net::IWebProxy
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [get_Address](./get_address/)() | 获取当前代理服务器的地址。 |
| [get_BypassList](./get_bypasslist/)() | 获取不使用代理服务器的地址列表。 |
| [get_BypassProxyOnLocal](./get_bypassproxyonlocal/)() | 获取指示是否必须对本地地址使用代理服务器的值。 |
| virtual [get_Credentials](./get_credentials/)() | 获取发送到代理服务器进行身份验证的凭据。 |
| [get_UseDefaultCredentials](./get_usedefaultcredentials/)() | 获取指示是否必须在请求中发送默认凭据的值。 |
| static [GetDefaultProxy](./getdefaultproxy/)() | 返回使用 Internet Explorer 非动态设置的代理。 |
| virtual [GetProxy](./getproxy/)(System::SharedPtr\<Uri\>) | 返回针对 Web 请求的代理 URI。 |
| virtual [IsBypassed](./isbypassed/)(System::SharedPtr\<Uri\>) | 检查是否未对指定的 URI 使用代理服务器。 |
| [set_Address](./set_address/)(System::SharedPtr\<Uri\>) | 设置当前代理服务器的地址。 |
| [set_BypassList](./set_bypasslist/)(System::ArrayPtr\<String\>) | 设置不使用代理服务器的地址列表。 |
| [set_BypassProxyOnLocal](./set_bypassproxyonlocal/)(bool) | 设置一个值，指示是否必须对本地地址使用代理服务器。 |
| virtual [set_Credentials](./set_credentials/)(System::SharedPtr\<ICredentials\>) | 设置发送到代理服务器进行身份验证的凭据。 |
| [set_UseDefaultCredentials](./set_usedefaultcredentials/)(bool) | 设置一个值，指示是否必须随请求发送默认凭据。 |
| [WebProxy](./webproxy/)() | 构造一个新实例。 |
| [WebProxy](./webproxy/)(System::SharedPtr\<Uri\>) | 构造一个新实例。 |
| [WebProxy](./webproxy/)(System::SharedPtr\<Uri\>, bool) | 构造一个新实例。 |
| [WebProxy](./webproxy/)(System::SharedPtr\<Uri\>, bool, System::ArrayPtr\<String\>) | 构造一个新实例。 |
| [WebProxy](./webproxy/)(System::SharedPtr\<Uri\>, bool, System::ArrayPtr\<String\>, System::SharedPtr\<ICredentials\>) | 构造一个新实例。 |
| [WebProxy](./webproxy/)(String, int32_t) | 构造一个新实例。 |
| [WebProxy](./webproxy/)(String) | 构造一个新实例。 |
| [WebProxy](./webproxy/)(String, bool) | 构造一个新实例。 |
| [WebProxy](./webproxy/)(String, bool, System::ArrayPtr\<String\>) | 构造一个新实例。 |
| [WebProxy](./webproxy/)(String, bool, System::ArrayPtr\<String\>, System::SharedPtr\<ICredentials\>) | 构造一个新实例。 |
## 另见

* Class [IWebProxy](../iwebproxy/)
* Namespace [System::Net](../)
* Library [Aspose.Font for C++](../../)
