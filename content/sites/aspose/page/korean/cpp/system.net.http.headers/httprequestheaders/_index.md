---
title: "System::Net::Http::Headers::HttpRequestHeaders 클래스"
linktitle: "HttpRequestHeaders"
second_title: "C++용 Aspose.Page"
description: "System::Net::Http::Headers::HttpRequestHeaders 클래스. ''Request'' 헤더들의 컬렉션을 나타냅니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, 해당 포인터를 C++에서 함수 인수로 전달하도록 사용하십시오."
type: docs
weight: 1000
url: /ko/cpp/system.net.http.headers/httprequestheaders/
---
## HttpRequestHeaders class


'Request' 헤더들의 컬렉션을 나타냅니다. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 해당 포인터를 함수 인수로 전달하도록 사용하십시오.

```cpp
class HttpRequestHeaders : public System::Net::Http::Headers::HttpHeaders
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [AddHeaders](./addheaders/)(System::SharedPtr\<HttpHeaders\>) override | 지정된 HttpHeaders 클래스 인스턴스를 현재 인스턴스와 연결합니다. |
| static [AddKnownHeaders](./addknownheaders/)(System::SharedPtr\<Collections::Generic::HashSet\<String\>\>) | 알려진 헤더를 지정된 컬렉션에 추가합니다. |
| [get_Accept](./get_accept/)() | RTTI 정보. |
| [get_AcceptCharset](./get_acceptcharset/)() | 'Accept-Charset' 헤더의 값을 반환합니다. |
| [get_AcceptEncoding](./get_acceptencoding/)() | 'Accept-Encoding' 헤더의 값을 반환합니다. |
| [get_AcceptLanguage](./get_acceptlanguage/)() | 'Accept-Language' 헤더의 값을 반환합니다. |
| [get_Authorization](./get_authorization/)() | 'Authorization' 헤더의 값을 가져옵니다. |
| [get_CacheControl](./get_cachecontrol/)() | 'Cache-Control' 헤더의 값을 가져옵니다. |
| [get_Connection](./get_connection/)() | 'Connection' 헤더의 값을 반환합니다. |
| [get_ConnectionClose](./get_connectionclose/)() | 'Connection' 헤더 값에 'Close'가 포함되어 있는지 나타내는 값을 가져옵니다. |
| [get_Date](./get_date/)() | 'Date' 헤더의 값을 가져옵니다. |
| [get_Expect](./get_expect/)() | 'Expect' 헤더의 값을 반환합니다. |
| [get_ExpectContinue](./get_expectcontinue/)() | 'Expect' 헤더 값에 'Continue'가 포함되어 있는지 나타내는 값을 가져옵니다. |
| [get_From](./get_from/)() | 'From' 헤더의 값을 가져옵니다. |
| [get_Host](./get_host/)() | 'Host' 헤더의 값을 가져옵니다. |
| [get_IfMatch](./get_ifmatch/)() | 'If-Match' 헤더의 값을 반환합니다. |
| [get_IfModifiedSince](./get_ifmodifiedsince/)() | 'If-Modified-Since' 헤더의 값을 가져옵니다. |
| [get_IfNoneMatch](./get_ifnonematch/)() | 'If-None-Match' 헤더의 값을 반환합니다. |
| [get_IfRange](./get_ifrange/)() | 'If-Range' 헤더의 값을 가져옵니다. |
| [get_IfUnmodifiedSince](./get_ifunmodifiedsince/)() | 'If-Unmodified-Since' 헤더의 값을 가져옵니다. |
| [get_MaxForwards](./get_maxforwards/)() | 'Max-Forwards' 헤더의 값을 가져옵니다. |
| [get_Pragma](./get_pragma/)() | 'Pragma' 헤더의 값을 반환합니다. |
| [get_ProxyAuthorization](./get_proxyauthorization/)() | 'Proxy-Authorization' 헤더의 값을 가져옵니다. |
| [get_Range](./get_range/)() | 'Range' 헤더의 값을 가져옵니다. |
| [get_Referrer](./get_referrer/)() | 'Referer' 헤더 값을 가져옵니다. |
| [get_TE](./get_te/)() | 'TE' 헤더의 값을 반환합니다. |
| [get_Trailer](./get_trailer/)() | 'Trailer' 헤더의 값을 반환합니다. |
| [get_TransferEncoding](./get_transferencoding/)() | 'Transfer-Encoding' 헤더의 값을 반환합니다. |
| [get_TransferEncodingChunked](./get_transferencodingchunked/)() | 'Transfer-Encoding' 헤더 값에 'Chunked'가 포함되어 있는지 나타내는 값을 가져옵니다. |
| [get_Upgrade](./get_upgrade/)() | 'Upgrade' 헤더의 값을 반환합니다. |
| [get_UserAgent](./get_useragent/)() | 'User-Agent' 헤더의 값을 반환합니다. |
| [get_Via](./get_via/)() | 'Via' 헤더의 값을 반환합니다. |
| [get_Warning](./get_warning/)() | 'Warning' 헤더의 값을 반환합니다. |
| [HttpRequestHeaders](./httprequestheaders/)() | 새 인스턴스를 생성합니다. |
| [set_Authorization](./set_authorization/)(System::SharedPtr\<AuthenticationHeaderValue\>) | 'Authorization' 헤더의 값을 설정합니다. |
| [set_CacheControl](./set_cachecontrol/)(System::SharedPtr\<CacheControlHeaderValue\>) | 'Cache-Control' 헤더의 값을 설정합니다. |
| [set_ConnectionClose](./set_connectionclose/)(Nullable\<bool\>) | 'Connection' 헤더 값에 'Close'가 포함되어 있는지 나타내는 값을 설정합니다. |
| [set_Date](./set_date/)(Nullable\<DateTimeOffset\>) | 'Date' 헤더의 값을 설정합니다. |
| [set_ExpectContinue](./set_expectcontinue/)(Nullable\<bool\>) | 'Expect' 헤더 값에 'Continue'가 포함되어 있는지 나타내는 값을 설정합니다. |
| [set_From](./set_from/)(String) | 'From' 헤더의 값을 설정합니다. |
| [set_Host](./set_host/)(String) | 'Host' 헤더의 값을 설정합니다. |
| [set_IfModifiedSince](./set_ifmodifiedsince/)(Nullable\<DateTimeOffset\>) | 'If-Modified-Since' 헤더의 값을 설정합니다. |
| [set_IfRange](./set_ifrange/)(System::SharedPtr\<RangeConditionHeaderValue\>) | 'If-Range' 헤더의 값을 설정합니다. |
| [set_IfUnmodifiedSince](./set_ifunmodifiedsince/)(Nullable\<DateTimeOffset\>) | 'If-Unmodified-Since' 헤더의 값을 설정합니다. |
| [set_MaxForwards](./set_maxforwards/)(Nullable\<int32_t\>) | 'Max-Forwards' 헤더의 값을 설정합니다. |
| [set_ProxyAuthorization](./set_proxyauthorization/)(System::SharedPtr\<AuthenticationHeaderValue\>) | 'Proxy-Authorization' 헤더의 값을 설정합니다. |
| [set_Range](./set_range/)(System::SharedPtr\<RangeHeaderValue\>) | 'Range' 헤더의 값을 설정합니다. |
| [set_Referrer](./set_referrer/)(System::SharedPtr\<Uri\>) | 'Referer' 헤더의 값을 설정합니다. |
| [set_TransferEncodingChunked](./set_transferencodingchunked/)(Nullable\<bool\>) | 'Transfer-Encoding' 헤더 값에 'Chunked'가 포함되어 있는지 나타내는 값을 설정합니다. |
## 또 보기

* Class [HttpHeaders](../httpheaders/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Page for C++](../../)
