---
title: "System::Web::Services::Protocols::HttpWebClientProtocol class"
linktitle: "HttpWebClientProtocol"
second_title: "Aspose.Font 适用于 C++"
description: "System::Web::Services::Protocols::HttpWebClientProtocol class. 此基类用于所有使用 HTTP 的 XML Web 服务客户端代理。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 中的函数。"
type: docs
weight: 100
url: /zh/cpp/system.web.services.protocols/httpwebclientprotocol/
---
## HttpWebClientProtocol class


此基类用于所有使用 HTTP 的 XML [Web](../../system.web/) 服务客户端代理。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class HttpWebClientProtocol : public System::Web::Services::Protocols::WebClientProtocol
```

## 方法

| 方法 | 描述 |
| --- | --- |
| virtual [CheckForCookies](./checkforcookies/)(System::SharedPtr\<Net::HttpWebResponse\>) | 将指定请求中的 cookie 附加到内部 cookie 容器中。 |
| [get_AllowAutoRedirect](./get_allowautoredirect/)() | 获取一个指示客户端是否遵循服务器重定向的值。 |
| [get_ClientCertificates](./get_clientcertificates/)() | 返回客户端证书的集合。 |
| [get_CookieContainer](./get_cookiecontainer/)() | 获取用于存储 cookie 的容器。 |
| [get_EnableDecompression](./get_enabledecompression/)() | 获取一个指示是否已启用解压缩的值。 |
| [get_Proxy](./get_proxy/)() | 获取代理信息。 |
| [get_UnsafeAuthenticatedConnectionSharing](./get_unsafeauthenticatedconnectionsharing/)() | 获取一个指示当客户端使用 NTLM 身份验证时是否启用连接共享的值。 |
| [get_UserAgent](./get_useragent/)() | 获取 'User-Agent' 头的值。 |
| [set_AllowAutoRedirect](./set_allowautoredirect/)(bool) | 设置一个指示客户端是否遵循服务器重定向的值。 |
| [set_CookieContainer](./set_cookiecontainer/)(System::SharedPtr\<System::Net::CookieContainer\>) | 设置用于存储 cookie 的容器。 |
| [set_EnableDecompression](./set_enabledecompression/)(bool) | 设置一个指示是否已启用解压缩的值。 |
| [set_Proxy](./set_proxy/)(System::SharedPtr\<Net::IWebProxy\>) | 设置代理信息。 |
| [set_UnsafeAuthenticatedConnectionSharing](./set_unsafeauthenticatedconnectionsharing/)(bool) | 设置一个指示当客户端使用 NTLM 身份验证时是否启用连接共享的值。 |
| [set_UserAgent](./set_useragent/)(String) | 设置 'User-Agent' 头部的值。 |
| [UnregisterMapping](./unregistermapping/)(System::SharedPtr\<Object\>) |  |
## 另见

* Class [WebClientProtocol](../webclientprotocol/)
* Namespace [System::Web::Services::Protocols](../)
* Library [Aspose.Font for C++](../../)
