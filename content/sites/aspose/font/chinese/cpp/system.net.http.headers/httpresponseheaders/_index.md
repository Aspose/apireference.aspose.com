---
title: "System::Net::Http::Headers::HttpResponseHeaders 类"
linktitle: "HttpResponseHeaders"
second_title: "Aspose.Font 适用于 C++"
description: "System::Net::Http::Headers::HttpResponseHeaders 类。表示 ''Response'' 标头的集合。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 函数。"
type: docs
weight: 1100
url: /zh/cpp/system.net.http.headers/httpresponseheaders/
---
## HttpResponseHeaders class


表示 'Response' 标头的集合。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class HttpResponseHeaders : public System::Net::Http::Headers::HttpHeaders
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [AddHeaders](./addheaders/)(System::SharedPtr\<HttpHeaders\>) override | 将指定的 HttpHeaders 类实例与当前实例连接。 |
| static [AddKnownHeaders](./addknownheaders/)(System::SharedPtr\<Collections::Generic::HashSet\<String\>\>) | 将已知的标头添加到指定的集合中。 |
| [get_AcceptRanges](./get_acceptranges/)() | RTTI 信息。 |
| [get_Age](./get_age/)() | 获取 'Age' 标头的值。 |
| [get_CacheControl](./get_cachecontrol/)() | 获取 'Cache-Control' 标头的值。 |
| [get_Connection](./get_connection/)() | 返回 'Connection' 标头的值。 |
| [get_ConnectionClose](./get_connectionclose/)() | 获取一个值，指示 'Connection' 标头的值是否包含 'Close'。 |
| [get_Date](./get_date/)() | 获取 'Date' 标头的值。 |
| [get_ETag](./get_etag/)() | 获取 'ETag' 头的值。 |
| [get_Location](./get_location/)() | 获取 'Location' 标头的值。 |
| [get_Pragma](./get_pragma/)() | 返回 'Pragma' 标头的值。 |
| [get_ProxyAuthenticate](./get_proxyauthenticate/)() | 返回 'Proxy-Authenticate' 标头的值。 |
| [get_RetryAfter](./get_retryafter/)() | 获取 'Retry-After' 标头的值。 |
| [get_Server](./get_server/)() | 返回 'Server' 标头的值。 |
| [get_Trailer](./get_trailer/)() | 返回 'Trailer' 标头的值。 |
| [get_TransferEncoding](./get_transferencoding/)() | 返回 'Transfer-Encoding' 标头的值。 |
| [get_TransferEncodingChunked](./get_transferencodingchunked/)() | 获取一个值，指示 'Transfer-Encoding' 标头的值是否包含 'Chunked'。 |
| [get_Upgrade](./get_upgrade/)() | 返回 'Upgrade' 标头的值。 |
| [get_Vary](./get_vary/)() | 返回 'Vary' 标头的值。 |
| [get_Via](./get_via/)() | 返回 'Via' 标头的值。 |
| [get_Warning](./get_warning/)() | 返回 'Warning' 标头的值。 |
| [get_WwwAuthenticate](./get_wwwauthenticate/)() | 返回 'WWW-Authenticate' 标头的值。 |
| [HttpResponseHeaders](./httpresponseheaders/)() | 构造一个新实例。 |
| [set_Age](./set_age/)(Nullable\<TimeSpan\>) | 设置 'Age' 标头的值。 |
| [set_CacheControl](./set_cachecontrol/)(System::SharedPtr\<CacheControlHeaderValue\>) | 设置 'Cache-Control' 标头的值。 |
| [set_ConnectionClose](./set_connectionclose/)(Nullable\<bool\>) | 设置一个值，指示 'Connection' 标头的值是否包含 'Close'。 |
| [set_Date](./set_date/)(Nullable\<DateTimeOffset\>) | 设置 'Date' 标头的值。 |
| [set_ETag](./set_etag/)(System::SharedPtr\<EntityTagHeaderValue\>) | 设置 'ETag' 标头的值。 |
| [set_Location](./set_location/)(System::SharedPtr\<Uri\>) | 设置 'Location' 标头的值。 |
| [set_RetryAfter](./set_retryafter/)(System::SharedPtr\<RetryConditionHeaderValue\>) | 设置 'Retry-After' 标头的值。 |
| [set_TransferEncodingChunked](./set_transferencodingchunked/)(Nullable\<bool\>) | 设置一个值，指示 'Transfer-Encoding' 标头的值是否包含 'Chunked'。 |
## 另见

* Class [HttpHeaders](../httpheaders/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Font for C++](../../)
