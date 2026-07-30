---
title: "System::Net::Http::Headers::HttpRequestHeaders 类"
linktitle: "HttpRequestHeaders"
second_title: "Aspose.Font 适用于 C++"
description: "System::Net::Http::Headers::HttpRequestHeaders 类。表示 ''Request'' 头的集合。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 函数。"
type: docs
weight: 1000
url: /zh/cpp/system.net.http.headers/httprequestheaders/
---
## HttpRequestHeaders class


表示 'Request' 头的集合。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class HttpRequestHeaders : public System::Net::Http::Headers::HttpHeaders
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [AddHeaders](./addheaders/)(System::SharedPtr\<HttpHeaders\>) override | 将指定的 HttpHeaders 类实例与当前实例连接。 |
| static [AddKnownHeaders](./addknownheaders/)(System::SharedPtr\<Collections::Generic::HashSet\<String\>\>) | 将已知的标头添加到指定的集合中。 |
| [get_Accept](./get_accept/)() | RTTI 信息。 |
| [get_AcceptCharset](./get_acceptcharset/)() | 返回 'Accept-Charset' 标头的值。 |
| [get_AcceptEncoding](./get_acceptencoding/)() | 返回 'Accept-Encoding' 标头的值。 |
| [get_AcceptLanguage](./get_acceptlanguage/)() | 返回 'Accept-Language' 标头的值。 |
| [get_Authorization](./get_authorization/)() | 获取 'Authorization' 标头的值。 |
| [get_CacheControl](./get_cachecontrol/)() | 获取 'Cache-Control' 标头的值。 |
| [get_Connection](./get_connection/)() | 返回 'Connection' 标头的值。 |
| [get_ConnectionClose](./get_connectionclose/)() | 获取一个值，指示 'Connection' 标头的值是否包含 'Close'。 |
| [get_Date](./get_date/)() | 获取 'Date' 标头的值。 |
| [get_Expect](./get_expect/)() | 返回 'Expect' 标头的值。 |
| [get_ExpectContinue](./get_expectcontinue/)() | 获取一个值，指示 'Expect' 标头的值是否包含 'Continue'。 |
| [get_From](./get_from/)() | 获取 'From' 标头的值。 |
| [get_Host](./get_host/)() | 获取 'Host' 标头的值。 |
| [get_IfMatch](./get_ifmatch/)() | 返回 'If-Match' 标头的值。 |
| [get_IfModifiedSince](./get_ifmodifiedsince/)() | 获取 'If-Modified-Since' 标头的值。 |
| [get_IfNoneMatch](./get_ifnonematch/)() | 返回 'If-None-Match' 标头的值。 |
| [get_IfRange](./get_ifrange/)() | 获取 'If-Range' 标头的值。 |
| [get_IfUnmodifiedSince](./get_ifunmodifiedsince/)() | 获取 'If-Unmodified-Since' 标头的值。 |
| [get_MaxForwards](./get_maxforwards/)() | 获取 'Max-Forwards' 标头的值。 |
| [get_Pragma](./get_pragma/)() | 返回 'Pragma' 标头的值。 |
| [get_ProxyAuthorization](./get_proxyauthorization/)() | 获取 'Proxy-Authorization' 标头的值。 |
| [get_Range](./get_range/)() | 获取 'Range' 标头的值。 |
| [get_Referrer](./get_referrer/)() | 获取 'Referer' 头的值。 |
| [get_TE](./get_te/)() | 返回 'TE' 标头的值。 |
| [get_Trailer](./get_trailer/)() | 返回 'Trailer' 标头的值。 |
| [get_TransferEncoding](./get_transferencoding/)() | 返回 'Transfer-Encoding' 标头的值。 |
| [get_TransferEncodingChunked](./get_transferencodingchunked/)() | 获取一个值，指示 'Transfer-Encoding' 标头的值是否包含 'Chunked'。 |
| [get_Upgrade](./get_upgrade/)() | 返回 'Upgrade' 标头的值。 |
| [get_UserAgent](./get_useragent/)() | 返回 'User-Agent' 标头的值。 |
| [get_Via](./get_via/)() | 返回 'Via' 标头的值。 |
| [get_Warning](./get_warning/)() | 返回 'Warning' 标头的值。 |
| [HttpRequestHeaders](./httprequestheaders/)() | 构造一个新实例。 |
| [set_Authorization](./set_authorization/)(System::SharedPtr\<AuthenticationHeaderValue\>) | 设置 'Authorization' 标头的值。 |
| [set_CacheControl](./set_cachecontrol/)(System::SharedPtr\<CacheControlHeaderValue\>) | 设置 'Cache-Control' 标头的值。 |
| [set_ConnectionClose](./set_connectionclose/)(Nullable\<bool\>) | 设置一个值，指示 'Connection' 标头的值是否包含 'Close'。 |
| [set_Date](./set_date/)(Nullable\<DateTimeOffset\>) | 设置 'Date' 标头的值。 |
| [set_ExpectContinue](./set_expectcontinue/)(Nullable\<bool\>) | 设置一个值，指示 'Expect' 标头的值是否包含 'Continue'。 |
| [set_From](./set_from/)(String) | 设置 'From' 标头的值。 |
| [set_Host](./set_host/)(String) | 设置 'Host' 标头的值。 |
| [set_IfModifiedSince](./set_ifmodifiedsince/)(Nullable\<DateTimeOffset\>) | 设置 'If-Modified-Since' 标头的值。 |
| [set_IfRange](./set_ifrange/)(System::SharedPtr\<RangeConditionHeaderValue\>) | 设置 'If-Range' 标头的值。 |
| [set_IfUnmodifiedSince](./set_ifunmodifiedsince/)(Nullable\<DateTimeOffset\>) | 设置 'If-Unmodified-Since' 标头的值。 |
| [set_MaxForwards](./set_maxforwards/)(Nullable\<int32_t\>) | 设置 'Max-Forwards' 标头的值。 |
| [set_ProxyAuthorization](./set_proxyauthorization/)(System::SharedPtr\<AuthenticationHeaderValue\>) | 设置 'Proxy-Authorization' 标头的值。 |
| [set_Range](./set_range/)(System::SharedPtr\<RangeHeaderValue\>) | 设置 'Range' 标头的值。 |
| [set_Referrer](./set_referrer/)(System::SharedPtr\<Uri\>) | 设置 'Referer' 头部的值。 |
| [set_TransferEncodingChunked](./set_transferencodingchunked/)(Nullable\<bool\>) | 设置一个值，指示 'Transfer-Encoding' 标头的值是否包含 'Chunked'。 |
## 另见

* Class [HttpHeaders](../httpheaders/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Font for C++](../../)
