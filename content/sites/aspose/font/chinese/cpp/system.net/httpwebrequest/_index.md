---
title: "System::Net::HttpWebRequest 类"
linktitle: "HttpWebRequest"
second_title: "Aspose.Font 适用于 C++"
description: "System::Net::HttpWebRequest 类。表示 HTTP 网络请求。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 函数。"
type: docs
weight: 2000
url: /zh/cpp/system.net/httpwebrequest/
---
## HttpWebRequest class


表示 HTTP 网络请求。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class HttpWebRequest : public System::Net::WebRequest
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [Abort](./abort/)() override | 中止当前请求。 |
| virtual [AddRange](./addrange/)(int32_t) | 向当前请求添加 'Range' 标头。 |
| virtual [AddRange](./addrange/)(System::String, int32_t, int32_t) | 向当前请求添加 'Range' 标头。 |
| [BeginGetRequestStream](./begingetrequeststream/)(AsyncCallback, System::SharedPtr\<Object\>) override | 启动异步操作以获取用于向资源写入数据的流。 |
| [BeginGetResponse](./begingetresponse/)(AsyncCallback, System::SharedPtr\<Object\>) override | 启动对资源的异步请求。 |
| [EndGetRequestStream](./endgetrequeststream/)(System::SharedPtr\<IAsyncResult\>) override | 等待指定的获取流的异步操作完成。 |
| [EndGetResponse](./endgetresponse/)(System::SharedPtr\<IAsyncResult\>) override | 等待指定的资源异步请求完成。 |
| [get_Accept](./get_accept/)() | 获取 'Accept' HTTP 标头的值。 |
| virtual [get_AllowAutoRedirect](./get_allowautoredirect/)() | 获取指示请求是否应遵循重定向的值。 |
| virtual [get_AllowReadStreamBuffering](./get_allowreadstreambuffering/)() | 获取指示是否必须缓存从资源接收的数据的值。 |
| virtual [get_AllowWriteStreamBuffering](./get_allowwritestreambuffering/)() | 获取指示发送数据时是否启用缓冲的值。 |
| virtual [get_ClientCertificates](./get_clientcertificates/)() | 获取与当前请求关联的证书集合。 |
| [get_ConnectionGroupName](./get_connectiongroupname/)() override | 获取连接组的名称。 |
| [get_ContentLength](./get_contentlength/)() override | 获取要发送的请求数据的字节数。 |
| [get_ContentType](./get_contenttype/)() override | 获取请求的 MIME 类型。 |
| [get_ContinueTimeout](./get_continuetimeout/)() | 获取等待 100-Continue 状态码的超时时间。 |
| virtual [get_CookieContainer](./get_cookiecontainer/)() | 获取与当前 Web 请求关联的 Cookie 容器。 |
| [get_Credentials](./get_credentials/)() override | 获取与当前请求关联的身份验证信息。 |
| virtual [get_HaveResponse](./get_haveresponse/)() | 返回指示是否已收到响应的值。 |
| [get_Headers](./get_headers/)() override | 获取 HTTP 标头的集合。 |
| virtual [get_KeepAlive](./get_keepalive/)() | 获取指示当前请求是否必须包含 'Keep-Alive' 标头的值。 |
| virtual [get_MaximumAutomaticRedirections](./get_maximumautomaticredirections/)() | 获取允许的最大重定向次数。 |
| [get_Method](./get_method/)() override | 获取 HTTP 方法。 |
| [get_PreAuthenticate](./get_preauthenticate/)() override | 获取一个指示请求是否必须预先认证的值。 |
| [get_Proxy](./get_proxy/)() override | 获取 HTTP 代理。 |
| virtual [get_Referer](./get_referer/)() | 获取 'Referer' 头的值。 |
| [get_RequestUri](./get_requesturi/)() override | 返回请求的 URI。 |
| virtual [get_SendChunked](./get_sendchunked/)() | 获取一个指示数据是否必须分段发送的值。 |
| [get_ServicePoint](./get_servicepoint/)() | 返回表示到资源的网络连接的服务点。 |
| virtual [get_SupportsCookieContainer](./get_supportscookiecontainer/)() | 返回一个指示当前请求是否可以使用 cookie 容器的值。 |
| [get_Timeout](./get_timeout/)() override | 获取请求超时的毫秒时间量。 |
| [get_UseDefaultCredentials](./get_usedefaultcredentials/)() override | 获取一个指示 'Credential' 属性是否等于 'DefaultCredentials' 属性的值。 |
| virtual [get_UserAgent](./get_useragent/)() | 获取 'User-Agent' 头的值。 |
| [GetRequestStream](./getrequeststream/)() override | 返回用于向资源写入数据的流。 |
| [GetResponse](./getresponse/)() override | 返回与当前 Web 请求关联的 Web 响应。 |
| [HttpWebRequest](./httpwebrequest/)(System::SharedPtr\<Uri\>) | 构造一个新实例。 |
| [set_Accept](./set_accept/)(String) | 设置 'Accept' HTTP 头的值。 |
| virtual [set_AllowAutoRedirect](./set_allowautoredirect/)(bool) | 设置一个指示请求是否应遵循重定向的值。 |
| virtual [set_AllowReadStreamBuffering](./set_allowreadstreambuffering/)(bool) | 设置一个指示从资源接收的数据是否必须缓冲的值。 |
| virtual [set_AllowWriteStreamBuffering](./set_allowwritestreambuffering/)(bool) | 设置一个指示发送数据时是否启用缓冲的值。 |
| virtual [set_ClientCertificates](./set_clientcertificates/)(System::SharedPtr\<System::Security::Cryptography::X509Certificates::X509CertificateCollection\>) | 设置与当前请求关联的证书集合。 |
| [set_ConnectionGroupName](./set_connectiongroupname/)(System::String) override | 设置连接组的名称。 |
| [set_ContentLength](./set_contentlength/)(int64_t) override | 设置要发送的请求数据的字节数。 |
| [set_ContentType](./set_contenttype/)(String) override | 设置请求的 MIME 类型。 |
| [set_ContinueTimeout](./set_continuetimeout/)(int32_t) | 设置等待直到收到 100-Continue 状态码的超时时间。 |
| virtual [set_CookieContainer](./set_cookiecontainer/)(System::SharedPtr\<System::Net::CookieContainer\>) | 设置与当前 Web 请求关联的 cookie 容器。 |
| [set_Credentials](./set_credentials/)(System::SharedPtr\<ICredentials\>) override | 设置与当前请求关联的身份验证信息。 |
| [set_Headers](./set_headers/)(System::SharedPtr\<WebHeaderCollection\>) override | 设置 HTTP 头的集合。 |
| virtual [set_KeepAlive](./set_keepalive/)(bool) | 设置一个指示当前请求是否必须包含 'Keep-Alive' 头的值。 |
| virtual [set_MaximumAutomaticRedirections](./set_maximumautomaticredirections/)(int) | 设置允许的最大重定向次数。 |
| [set_Method](./set_method/)(String) override | 设置 HTTP 方法。 |
| [set_PreAuthenticate](./set_preauthenticate/)(bool) override | 设置一个值，指示请求是否必须预先认证。 |
| [set_ProtocolVersion](./set_protocolversion/)(System::Version) | RTTI 信息。 |
| [set_Proxy](./set_proxy/)(System::SharedPtr\<IWebProxy\>) override | 设置 HTTP 代理。 |
| virtual [set_Referer](./set_referer/)(System::String) | 设置 'Referer' 头部的值。 |
| virtual [set_SendChunked](./set_sendchunked/)(bool) | 设置一个值，指示数据是否必须分段发送。 |
| [set_Timeout](./set_timeout/)(int) override | 设置请求超时的毫秒时间量。 |
| [set_UseDefaultCredentials](./set_usedefaultcredentials/)(bool) override | 设置一个值，指示 'Credential' 属性是否等于 'DefaultCredentials' 属性。 |
| virtual [set_UserAgent](./set_useragent/)(System::String) | 设置 'User-Agent' 头部的值。 |
## 另见

* Class [WebRequest](../webrequest/)
* Namespace [System::Net](../)
* Library [Aspose.Font for C++](../../)
