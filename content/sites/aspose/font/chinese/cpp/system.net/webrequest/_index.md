---
title: "System::Net::WebRequest 类"
linktitle: "WebRequest"
second_title: "Aspose.Font 适用于 C++"
description: "System::Net::WebRequest 类。表示一个 Web 请求。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 中的函数。"
type: docs
weight: 3800
url: /zh/cpp/system.net/webrequest/
---
## WebRequest class


表示一个 Web 请求。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class WebRequest : public virtual System::Object
```

## Nested classes

* Class [HttpRequestCreator](./httprequestcreator/)
* Class [WebRequestPrefixElement](./webrequestprefixelement/)
## 方法

| 方法 | 描述 |
| --- | --- |
| virtual [Abort](./abort/)() | 中止当前请求。 |
| virtual [BeginGetRequestStream](./begingetrequeststream/)(AsyncCallback, System::SharedPtr\<Object\>) | 启动异步操作以获取用于向资源写入数据的流。 |
| virtual [BeginGetResponse](./begingetresponse/)(AsyncCallback, System::SharedPtr\<Object\>) | 启动对资源的异步请求。 |
| static [Create](./create/)(String) | 使用指定的 URI 创建 [WebRequest](./) 类的新实例。 |
| static [Create](./create/)(System::SharedPtr\<Uri\>) | 使用指定的 URI 创建 [WebRequest](./) 类的新实例。 |
| static [CreateDefault](./createdefault/)(System::SharedPtr\<Uri\>) | 为指定的 URI 方案创建一个 [WebRequest](./) 派生类。 |
| static [CreateHttp](./createhttp/)(String) | 使用指定的 URI 创建 [WebRequest](./) 类的新实例。 |
| static [CreateHttp](./createhttp/)(System::SharedPtr\<Uri\>) | 使用指定的 URI 创建 [WebRequest](./) 类的新实例。 |
| virtual [EndGetRequestStream](./endgetrequeststream/)(System::SharedPtr\<IAsyncResult\>) | 等待指定的获取流的异步操作完成。 |
| virtual [EndGetResponse](./endgetresponse/)(System::SharedPtr\<IAsyncResult\>) | 等待指定的资源异步请求完成。 |
| virtual [get_CachePolicy](./get_cachepolicy/)() | 获取缓存策略。 |
| virtual [get_ConnectionGroupName](./get_connectiongroupname/)() | 获取连接组的名称。 |
| virtual [get_ContentLength](./get_contentlength/)() | 获取要发送的请求数据的字节数。 |
| virtual [get_ContentType](./get_contenttype/)() | 获取请求的 MIME 类型。 |
| virtual [get_Credentials](./get_credentials/)() | 获取与当前请求关联的身份验证信息。 |
| static [get_DefaultWebProxy](./get_defaultwebproxy/)() | 获取全局 HTTP 代理。 |
| virtual [get_Headers](./get_headers/)() | 获取 HTTP 标头的集合。 |
| virtual [get_Method](./get_method/)() | 获取 HTTP 方法。 |
| virtual [get_PreAuthenticate](./get_preauthenticate/)() | 获取一个指示请求是否必须预先认证的值。 |
| static [get_PrefixList](./get_prefixlist/)() | 获取前缀列表。 |
| virtual [get_Proxy](./get_proxy/)() | 获取 HTTP 代理。 |
| virtual [get_RequestUri](./get_requesturi/)() | 返回请求的 URI。 |
| virtual [get_Timeout](./get_timeout/)() | 获取请求超时的毫秒时间量。 |
| virtual [get_UseDefaultCredentials](./get_usedefaultcredentials/)() | 获取一个指示 'Credential' 属性是否等于 'DefaultCredentials' 属性的值。 |
| virtual [GetRequestStream](./getrequeststream/)() | 返回用于向资源写入数据的流。 |
| virtual [GetResponse](./getresponse/)() | 返回与当前 Web 请求关联的 Web 响应。 |
| static [RegisterPrefix](./registerprefix/)(String, System::SharedPtr\<IWebRequestCreate\>) | 为指定的 URI 注册 [WebRequest](./) 派生类。 |
| virtual [set_CachePolicy](./set_cachepolicy/)(System::SharedPtr\<System::Net::Cache::RequestCachePolicy\>) | 设置缓存策略。 |
| virtual [set_ConnectionGroupName](./set_connectiongroupname/)(System::String) | 设置连接组的名称。 |
| virtual [set_ContentLength](./set_contentlength/)(int64_t) | 设置要发送的请求数据的字节数。 |
| virtual [set_ContentType](./set_contenttype/)(String) | 设置请求的 MIME 类型。 |
| virtual [set_Credentials](./set_credentials/)(System::SharedPtr\<ICredentials\>) | 设置与当前请求关联的身份验证信息。 |
| static [set_DefaultWebProxy](./set_defaultwebproxy/)(System::SharedPtr\<IWebProxy\>) | 设置全局 HTTP 代理。 |
| virtual [set_Headers](./set_headers/)(System::SharedPtr\<WebHeaderCollection\>) | 设置 HTTP 头的集合。 |
| virtual [set_Method](./set_method/)(String) | 设置 HTTP 方法。 |
| virtual [set_PreAuthenticate](./set_preauthenticate/)(bool) | 设置一个值，指示请求是否必须预先认证。 |
| static [set_PrefixList](./set_prefixlist/)(System::SharedPtr\<Collections::Generic::List\<System::SharedPtr\<WebRequest::WebRequestPrefixElement\>\>\>) | 设置前缀列表。 |
| virtual [set_Proxy](./set_proxy/)(System::SharedPtr\<IWebProxy\>) | 设置 HTTP 代理。 |
| virtual [set_Timeout](./set_timeout/)(int32_t) | 设置请求超时的毫秒时间量。 |
| virtual [set_UseDefaultCredentials](./set_usedefaultcredentials/)(bool) | 设置一个值，指示 'Credential' 属性是否等于 'DefaultCredentials' 属性。 |
## 另见

* Class [Object](../../system/object/)
* Namespace [System::Net](../)
* Library [Aspose.Font for C++](../../)
