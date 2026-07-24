---
title: "System::Net::WebRequest 클래스"
linktitle: "WebRequest"
second_title: "C++용 Aspose.Page"
description: "System::Net::WebRequest 클래스. 웹 요청을 나타냅니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, 해당 포인터를 C++에서 함수 인수로 전달할 때 사용하십시오."
type: docs
weight: 3800
url: /ko/cpp/system.net/webrequest/
---
## WebRequest class


웹 요청을 나타냅니다. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 해당 포인터를 함수 인수로 전달할 때 사용하십시오.

```cpp
class WebRequest : public virtual System::Object
```

## Nested classes

* Class [HttpRequestCreator](./httprequestcreator/)
* Class [WebRequestPrefixElement](./webrequestprefixelement/)
## 메서드

| 메서드 | 설명 |
| --- | --- |
| virtual [Abort](./abort/)() | 현재 요청을 중단합니다. |
| virtual [BeginGetRequestStream](./begingetrequeststream/)(AsyncCallback, System::SharedPtr\<Object\>) | 리소스에 데이터를 쓰기 위한 스트림을 가져오는 비동기 작업을 시작합니다. |
| virtual [BeginGetResponse](./begingetresponse/)(AsyncCallback, System::SharedPtr\<Object\>) | 리소스에 대한 비동기 요청을 시작합니다. |
| static [Create](./create/)(String) | 지정된 URI를 사용하여 [WebRequest](./) 클래스의 새 인스턴스를 생성합니다. |
| static [Create](./create/)(System::SharedPtr\<Uri\>) | 지정된 URI를 사용하여 [WebRequest](./) 클래스의 새 인스턴스를 생성합니다. |
| static [CreateDefault](./createdefault/)(System::SharedPtr\<Uri\>) | 지정된 URI 스킴에 대한 [WebRequest](./) 파생 클래스를 생성합니다. |
| static [CreateHttp](./createhttp/)(String) | 지정된 URI를 사용하여 [WebRequest](./) 클래스의 새 인스턴스를 생성합니다. |
| static [CreateHttp](./createhttp/)(System::SharedPtr\<Uri\>) | 지정된 URI를 사용하여 [WebRequest](./) 클래스의 새 인스턴스를 생성합니다. |
| virtual [EndGetRequestStream](./endgetrequeststream/)(System::SharedPtr\<IAsyncResult\>) | 지정된 스트림을 가져오는 비동기 작업이 완료될 때까지 기다립니다. |
| virtual [EndGetResponse](./endgetresponse/)(System::SharedPtr\<IAsyncResult\>) | 지정된 리소스에 대한 비동기 요청이 완료될 때까지 기다립니다. |
| virtual [get_CachePolicy](./get_cachepolicy/)() | 캐시 정책을 가져옵니다. |
| virtual [get_ConnectionGroupName](./get_connectiongroupname/)() | 연결 그룹의 이름을 가져옵니다. |
| virtual [get_ContentLength](./get_contentlength/)() | 보낼 요청 데이터의 바이트 수를 가져옵니다. |
| virtual [get_ContentType](./get_contenttype/)() | 요청의 MIME 타입을 가져옵니다. |
| virtual [get_Credentials](./get_credentials/)() | 현재 요청과 연결된 인증 정보를 가져옵니다. |
| static [get_DefaultWebProxy](./get_defaultwebproxy/)() | 전역 HTTP 프록시를 가져옵니다. |
| virtual [get_Headers](./get_headers/)() | HTTP 헤더 컬렉션을 가져옵니다. |
| virtual [get_Method](./get_method/)() | HTTP 메서드를 가져옵니다. |
| virtual [get_PreAuthenticate](./get_preauthenticate/)() | 요청이 사전 인증되어야 하는지 여부를 나타내는 값을 가져옵니다. |
| static [get_PrefixList](./get_prefixlist/)() | 프리픽스 목록을 가져옵니다. |
| virtual [get_Proxy](./get_proxy/)() | HTTP 프록시를 가져옵니다. |
| virtual [get_RequestUri](./get_requesturi/)() | 요청 URI를 반환합니다. |
| virtual [get_Timeout](./get_timeout/)() | 요청이 시간 초과될 때까지의 밀리초 단위 시간을 가져옵니다. |
| virtual [get_UseDefaultCredentials](./get_usedefaultcredentials/)() | 'Credential' 속성이 'DefaultCredentials' 속성과 같은지 여부를 나타내는 값을 가져옵니다. |
| virtual [GetRequestStream](./getrequeststream/)() | 리소스에 데이터를 쓰기 위한 스트림을 반환합니다. |
| virtual [GetResponse](./getresponse/)() | 현재 웹 요청과 연결된 웹 응답을 반환합니다. |
| static [RegisterPrefix](./registerprefix/)(String, System::SharedPtr\<IWebRequestCreate\>) | 지정된 URI에 대해 [WebRequest](./) 파생 클래스를 등록합니다. |
| virtual [set_CachePolicy](./set_cachepolicy/)(System::SharedPtr\<System::Net::Cache::RequestCachePolicy\>) | 캐시 정책을 설정합니다. |
| virtual [set_ConnectionGroupName](./set_connectiongroupname/)(System::String) | 연결 그룹의 이름을 설정합니다. |
| virtual [set_ContentLength](./set_contentlength/)(int64_t) | 전송할 요청 데이터의 바이트 수를 설정합니다. |
| virtual [set_ContentType](./set_contenttype/)(String) | 요청의 MIME 유형을 설정합니다. |
| virtual [set_Credentials](./set_credentials/)(System::SharedPtr\<ICredentials\>) | 현재 요청과 연결된 인증 정보를 설정합니다. |
| static [set_DefaultWebProxy](./set_defaultwebproxy/)(System::SharedPtr\<IWebProxy\>) | 전역 HTTP 프록시를 설정합니다. |
| virtual [set_Headers](./set_headers/)(System::SharedPtr\<WebHeaderCollection\>) | HTTP 헤더 컬렉션을 설정합니다. |
| virtual [set_Method](./set_method/)(String) | HTTP 메서드를 설정합니다. |
| virtual [set_PreAuthenticate](./set_preauthenticate/)(bool) | 요청이 사전 인증되어야 하는지 여부를 나타내는 값을 설정합니다. |
| static [set_PrefixList](./set_prefixlist/)(System::SharedPtr\<Collections::Generic::List\<System::SharedPtr\<WebRequest::WebRequestPrefixElement\>\>\>) | 프리픽스 목록을 설정합니다. |
| virtual [set_Proxy](./set_proxy/)(System::SharedPtr\<IWebProxy\>) | HTTP 프록시를 설정합니다. |
| virtual [set_Timeout](./set_timeout/)(int32_t) | 요청이 시간 초과될 때까지의 시간을 밀리초 단위로 설정합니다. |
| virtual [set_UseDefaultCredentials](./set_usedefaultcredentials/)(bool) | 'Credential' 속성이 'DefaultCredentials' 속성과 같은지를 나타내는 값을 설정합니다. |
## 또 보기

* Class [Object](../../system/object/)
* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)
