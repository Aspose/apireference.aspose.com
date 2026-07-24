---
title: "System::Net::HttpWebRequest class"
linktitle: "HttpWebRequest"
second_title: "C++용 Aspose.Page"
description: "System::Net::HttpWebRequest 클래스. HTTP 웹 요청을 나타냅니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 래핑하고 해당 포인터를 C++에서 함수 인수로 전달하도록 사용하십시오."
type: docs
weight: 2000
url: /ko/cpp/system.net/httpwebrequest/
---
## HttpWebRequest class


HTTP 웹 요청을 나타냅니다. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 래핑하고 해당 포인터를 함수 인수로 전달하도록 사용하십시오.

```cpp
class HttpWebRequest : public System::Net::WebRequest
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [Abort](./abort/)() override | 현재 요청을 중단합니다. |
| virtual [AddRange](./addrange/)(int32_t) | 'Range' 헤더를 현재 요청에 추가합니다. |
| virtual [AddRange](./addrange/)(System::String, int32_t, int32_t) | 'Range' 헤더를 현재 요청에 추가합니다. |
| [BeginGetRequestStream](./begingetrequeststream/)(AsyncCallback, System::SharedPtr\<Object\>) override | 리소스에 데이터를 쓰기 위한 스트림을 가져오는 비동기 작업을 시작합니다. |
| [BeginGetResponse](./begingetresponse/)(AsyncCallback, System::SharedPtr\<Object\>) override | 리소스에 대한 비동기 요청을 시작합니다. |
| [EndGetRequestStream](./endgetrequeststream/)(System::SharedPtr\<IAsyncResult\>) override | 지정된 스트림을 가져오는 비동기 작업이 완료될 때까지 기다립니다. |
| [EndGetResponse](./endgetresponse/)(System::SharedPtr\<IAsyncResult\>) override | 지정된 리소스에 대한 비동기 요청이 완료될 때까지 기다립니다. |
| [get_Accept](./get_accept/)() | 'Accept' HTTP 헤더 값을 가져옵니다. |
| virtual [get_AllowAutoRedirect](./get_allowautoredirect/)() | 요청이 리디렉션을 따라야 하는지 여부를 나타내는 값을 가져옵니다. |
| virtual [get_AllowReadStreamBuffering](./get_allowreadstreambuffering/)() | 리소스로부터 받은 데이터를 버퍼링해야 하는지 여부를 나타내는 값을 가져옵니다. |
| virtual [get_AllowWriteStreamBuffering](./get_allowwritestreambuffering/)() | 데이터 전송을 위해 버퍼링이 활성화되어 있는지 여부를 나타내는 값을 가져옵니다. |
| virtual [get_ClientCertificates](./get_clientcertificates/)() | 현재 요청과 연결된 인증서 컬렉션을 가져옵니다. |
| [get_ConnectionGroupName](./get_connectiongroupname/)() override | 연결 그룹의 이름을 가져옵니다. |
| [get_ContentLength](./get_contentlength/)() override | 보낼 요청 데이터의 바이트 수를 가져옵니다. |
| [get_ContentType](./get_contenttype/)() override | 요청의 MIME 타입을 가져옵니다. |
| [get_ContinueTimeout](./get_continuetimeout/)() | 100-Continue 상태 코드가 수신될 때까지 기다릴 타임아웃을 가져옵니다. |
| virtual [get_CookieContainer](./get_cookiecontainer/)() | 현재 웹 요청과 연결된 쿠키 컨테이너를 가져옵니다. |
| [get_Credentials](./get_credentials/)() override | 현재 요청과 연결된 인증 정보를 가져옵니다. |
| virtual [get_HaveResponse](./get_haveresponse/)() | 응답이 수신되었는지 여부를 나타내는 값을 반환합니다. |
| [get_Headers](./get_headers/)() override | HTTP 헤더 컬렉션을 가져옵니다. |
| virtual [get_KeepAlive](./get_keepalive/)() | 현재 요청에 'Keep-Alive' 헤더가 포함되어야 하는지 여부를 나타내는 값을 가져옵니다. |
| virtual [get_MaximumAutomaticRedirections](./get_maximumautomaticredirections/)() | 허용되는 최대 리디렉션 수를 가져옵니다. |
| [get_Method](./get_method/)() override | HTTP 메서드를 가져옵니다. |
| [get_PreAuthenticate](./get_preauthenticate/)() override | 요청이 사전 인증되어야 하는지 여부를 나타내는 값을 가져옵니다. |
| [get_Proxy](./get_proxy/)() override | HTTP 프록시를 가져옵니다. |
| virtual [get_Referer](./get_referer/)() | 'Referer' 헤더 값을 가져옵니다. |
| [get_RequestUri](./get_requesturi/)() override | 요청 URI를 반환합니다. |
| virtual [get_SendChunked](./get_sendchunked/)() | 데이터를 세그먼트로 전송해야 하는지 여부를 나타내는 값을 가져옵니다. |
| [get_ServicePoint](./get_servicepoint/)() | 리소스에 대한 네트워크 연결을 나타내는 서비스 포인트를 반환합니다. |
| virtual [get_SupportsCookieContainer](./get_supportscookiecontainer/)() | 현재 요청이 쿠키 컨테이너를 사용할 수 있는지 여부를 나타내는 값을 반환합니다. |
| [get_Timeout](./get_timeout/)() override | 요청이 시간 초과될 때까지의 밀리초 단위 시간을 가져옵니다. |
| [get_UseDefaultCredentials](./get_usedefaultcredentials/)() override | 'Credential' 속성이 'DefaultCredentials' 속성과 같은지 여부를 나타내는 값을 가져옵니다. |
| virtual [get_UserAgent](./get_useragent/)() | 'User-Agent' 헤더의 값을 가져옵니다. |
| [GetRequestStream](./getrequeststream/)() override | 리소스에 데이터를 쓰기 위한 스트림을 반환합니다. |
| [GetResponse](./getresponse/)() override | 현재 웹 요청과 연결된 웹 응답을 반환합니다. |
| [HttpWebRequest](./httpwebrequest/)(System::SharedPtr\<Uri\>) | 새 인스턴스를 생성합니다. |
| [set_Accept](./set_accept/)(String) | 'Accept' HTTP 헤더 값을 설정합니다. |
| virtual [set_AllowAutoRedirect](./set_allowautoredirect/)(bool) | 요청이 리디렉션을 따라가야 하는지 여부를 나타내는 값을 설정합니다. |
| virtual [set_AllowReadStreamBuffering](./set_allowreadstreambuffering/)(bool) | 리소스에서 받은 데이터를 버퍼링해야 하는지 여부를 나타내는 값을 설정합니다. |
| virtual [set_AllowWriteStreamBuffering](./set_allowwritestreambuffering/)(bool) | 데이터 전송을 위해 버퍼링이 활성화되어 있는지 여부를 나타내는 값을 설정합니다. |
| virtual [set_ClientCertificates](./set_clientcertificates/)(System::SharedPtr\<System::Security::Cryptography::X509Certificates::X509CertificateCollection\>) | 현재 요청과 연결된 인증서 컬렉션을 설정합니다. |
| [set_ConnectionGroupName](./set_connectiongroupname/)(System::String) override | 연결 그룹의 이름을 설정합니다. |
| [set_ContentLength](./set_contentlength/)(int64_t) override | 전송할 요청 데이터의 바이트 수를 설정합니다. |
| [set_ContentType](./set_contenttype/)(String) override | 요청의 MIME 유형을 설정합니다. |
| [set_ContinueTimeout](./set_continuetimeout/)(int32_t) | 100-Continue 상태 코드가 수신될 때까지 대기하는 시간 제한을 설정합니다. |
| virtual [set_CookieContainer](./set_cookiecontainer/)(System::SharedPtr\<System::Net::CookieContainer\>) | 현재 웹 요청과 연결된 쿠키 컨테이너를 설정합니다. |
| [set_Credentials](./set_credentials/)(System::SharedPtr\<ICredentials\>) override | 현재 요청과 연결된 인증 정보를 설정합니다. |
| [set_Headers](./set_headers/)(System::SharedPtr\<WebHeaderCollection\>) override | HTTP 헤더 컬렉션을 설정합니다. |
| virtual [set_KeepAlive](./set_keepalive/)(bool) | 현재 요청에 'Keep-Alive' 헤더가 포함되어야 하는지 여부를 나타내는 값을 설정합니다. |
| virtual [set_MaximumAutomaticRedirections](./set_maximumautomaticredirections/)(int) | 허용되는 최대 리디렉션 수를 설정합니다. |
| [set_Method](./set_method/)(String) override | HTTP 메서드를 설정합니다. |
| [set_PreAuthenticate](./set_preauthenticate/)(bool) override | 요청이 사전 인증되어야 하는지 여부를 나타내는 값을 설정합니다. |
| [set_ProtocolVersion](./set_protocolversion/)(System::Version) | RTTI 정보. |
| [set_Proxy](./set_proxy/)(System::SharedPtr\<IWebProxy\>) override | HTTP 프록시를 설정합니다. |
| virtual [set_Referer](./set_referer/)(System::String) | 'Referer' 헤더의 값을 설정합니다. |
| virtual [set_SendChunked](./set_sendchunked/)(bool) | 데이터를 세그먼트로 전송해야 하는지를 나타내는 값을 설정합니다. |
| [set_Timeout](./set_timeout/)(int) override | 요청이 시간 초과될 때까지의 시간을 밀리초 단위로 설정합니다. |
| [set_UseDefaultCredentials](./set_usedefaultcredentials/)(bool) override | 'Credential' 속성이 'DefaultCredentials' 속성과 같은지를 나타내는 값을 설정합니다. |
| virtual [set_UserAgent](./set_useragent/)(System::String) | 'User-Agent' 헤더의 값을 설정합니다. |
## 또 보기

* Class [WebRequest](../webrequest/)
* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)
