---
title: "System::Net::Http::Headers::HttpResponseHeaders 클래스"
linktitle: "HttpResponseHeaders"
second_title: "C++용 Aspose.Page"
description: "System::Net::Http::Headers::HttpResponseHeaders 클래스. ''Response'' 헤더의 컬렉션을 나타냅니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고 해당 포인터를 C++에서 함수 인수로 전달하도록 사용하십시오."
type: docs
weight: 1100
url: /ko/cpp/system.net.http.headers/httpresponseheaders/
---
## HttpResponseHeaders class


 'Response' 헤더의 컬렉션을 나타냅니다. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고 해당 포인터를 함수 인수로 전달하도록 사용하십시오.

```cpp
class HttpResponseHeaders : public System::Net::Http::Headers::HttpHeaders
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [AddHeaders](./addheaders/)(System::SharedPtr\<HttpHeaders\>) override | 지정된 HttpHeaders 클래스 인스턴스를 현재 인스턴스와 연결합니다. |
| static [AddKnownHeaders](./addknownheaders/)(System::SharedPtr\<Collections::Generic::HashSet\<String\>\>) | 알려진 헤더를 지정된 컬렉션에 추가합니다. |
| [get_AcceptRanges](./get_acceptranges/)() | RTTI 정보. |
| [get_Age](./get_age/)() | 'Age' 헤더의 값을 가져옵니다. |
| [get_CacheControl](./get_cachecontrol/)() | 'Cache-Control' 헤더의 값을 가져옵니다. |
| [get_Connection](./get_connection/)() | 'Connection' 헤더의 값을 반환합니다. |
| [get_ConnectionClose](./get_connectionclose/)() | 'Connection' 헤더 값에 'Close'가 포함되어 있는지 나타내는 값을 가져옵니다. |
| [get_Date](./get_date/)() | 'Date' 헤더의 값을 가져옵니다. |
| [get_ETag](./get_etag/)() | 'ETag' 헤더의 값을 가져옵니다. |
| [get_Location](./get_location/)() | 'Location' 헤더의 값을 가져옵니다. |
| [get_Pragma](./get_pragma/)() | 'Pragma' 헤더의 값을 반환합니다. |
| [get_ProxyAuthenticate](./get_proxyauthenticate/)() | 'Proxy-Authenticate' 헤더의 값을 반환합니다. |
| [get_RetryAfter](./get_retryafter/)() | 'Retry-After' 헤더의 값을 가져옵니다. |
| [get_Server](./get_server/)() | 'Server' 헤더의 값을 반환합니다. |
| [get_Trailer](./get_trailer/)() | 'Trailer' 헤더의 값을 반환합니다. |
| [get_TransferEncoding](./get_transferencoding/)() | 'Transfer-Encoding' 헤더의 값을 반환합니다. |
| [get_TransferEncodingChunked](./get_transferencodingchunked/)() | 'Transfer-Encoding' 헤더 값에 'Chunked'가 포함되어 있는지 나타내는 값을 가져옵니다. |
| [get_Upgrade](./get_upgrade/)() | 'Upgrade' 헤더의 값을 반환합니다. |
| [get_Vary](./get_vary/)() | 'Vary' 헤더의 값을 반환합니다. |
| [get_Via](./get_via/)() | 'Via' 헤더의 값을 반환합니다. |
| [get_Warning](./get_warning/)() | 'Warning' 헤더의 값을 반환합니다. |
| [get_WwwAuthenticate](./get_wwwauthenticate/)() | 'WWW-Authenticate' 헤더의 값을 반환합니다. |
| [HttpResponseHeaders](./httpresponseheaders/)() | 새 인스턴스를 생성합니다. |
| [set_Age](./set_age/)(Nullable\<TimeSpan\>) | 'Age' 헤더의 값을 설정합니다. |
| [set_CacheControl](./set_cachecontrol/)(System::SharedPtr\<CacheControlHeaderValue\>) | 'Cache-Control' 헤더의 값을 설정합니다. |
| [set_ConnectionClose](./set_connectionclose/)(Nullable\<bool\>) | 'Connection' 헤더 값에 'Close'가 포함되어 있는지 나타내는 값을 설정합니다. |
| [set_Date](./set_date/)(Nullable\<DateTimeOffset\>) | 'Date' 헤더의 값을 설정합니다. |
| [set_ETag](./set_etag/)(System::SharedPtr\<EntityTagHeaderValue\>) | 'ETag' 헤더의 값을 설정합니다. |
| [set_Location](./set_location/)(System::SharedPtr\<Uri\>) | 'Location' 헤더의 값을 설정합니다. |
| [set_RetryAfter](./set_retryafter/)(System::SharedPtr\<RetryConditionHeaderValue\>) | 'Retry-After' 헤더의 값을 설정합니다. |
| [set_TransferEncodingChunked](./set_transferencodingchunked/)(Nullable\<bool\>) | 'Transfer-Encoding' 헤더 값에 'Chunked'가 포함되어 있는지 나타내는 값을 설정합니다. |
## 또 보기

* Class [HttpHeaders](../httpheaders/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Page for C++](../../)
