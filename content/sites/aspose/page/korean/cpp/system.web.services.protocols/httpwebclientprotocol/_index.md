---
title: "System::Web::Services::Protocols::HttpWebClientProtocol 클래스"
linktitle: "HttpWebClientProtocol"
second_title: "C++용 Aspose.Page"
description: "System::Web::Services::Protocols::HttpWebClientProtocol 클래스. 이 기본 클래스는 HTTP를 사용하는 모든 XML 웹 서비스 클라이언트 프록시에서 사용됩니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들지 마십시오. 이렇게 하면 런타임 오류 및/또는 어설션 오류가 발생할 수 있습니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, 해당 포인터를 C++에서 함수 인수로 전달하도록 사용하십시오."
type: docs
weight: 100
url: /ko/cpp/system.web.services.protocols/httpwebclientprotocol/
---
## HttpWebClientProtocol class


이 기본 클래스는 HTTP를 사용하는 모든 XML [Web](../../system.web/) 서비스 클라이언트 프록시에서 사용됩니다. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들지 마십시오. 이렇게 하면 런타임 오류 및/또는 어설션 오류가 발생할 수 있습니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 해당 포인터를 함수 인수로 전달하도록 사용하십시오.

```cpp
class HttpWebClientProtocol : public System::Web::Services::Protocols::WebClientProtocol
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| virtual [CheckForCookies](./checkforcookies/)(System::SharedPtr\<Net::HttpWebResponse\>) | 지정된 요청에서 쿠키를 내부 쿠키 컨테이너에 추가합니다. |
| [get_AllowAutoRedirect](./get_allowautoredirect/)() | 클라이언트가 서버 리다이렉트를 따르는지 여부를 나타내는 값을 가져옵니다. |
| [get_ClientCertificates](./get_clientcertificates/)() | 클라이언트 인증서 컬렉션을 반환합니다. |
| [get_CookieContainer](./get_cookiecontainer/)() | 쿠키를 저장하는 데 사용되는 컨테이너를 가져옵니다. |
| [get_EnableDecompression](./get_enabledecompression/)() | 압축 해제가 활성화되어 있는지 여부를 나타내는 값을 가져옵니다. |
| [get_Proxy](./get_proxy/)() | 프록시 정보를 가져옵니다. |
| [get_UnsafeAuthenticatedConnectionSharing](./get_unsafeauthenticatedconnectionsharing/)() | 클라이언트가 NTLM 인증을 사용할 때 연결 공유가 활성화되어 있는지 여부를 나타내는 값을 가져옵니다. |
| [get_UserAgent](./get_useragent/)() | 'User-Agent' 헤더의 값을 가져옵니다. |
| [set_AllowAutoRedirect](./set_allowautoredirect/)(bool) | 클라이언트가 서버 리다이렉트를 따르는지 여부를 나타내는 값을 설정합니다. |
| [set_CookieContainer](./set_cookiecontainer/)(System::SharedPtr\<System::Net::CookieContainer\>) | 쿠키를 저장하는 데 사용되는 컨테이너를 설정합니다. |
| [set_EnableDecompression](./set_enabledecompression/)(bool) | 압축 해제가 활성화되어 있는지 여부를 나타내는 값을 설정합니다. |
| [set_Proxy](./set_proxy/)(System::SharedPtr\<Net::IWebProxy\>) | 프록시 정보를 설정합니다. |
| [set_UnsafeAuthenticatedConnectionSharing](./set_unsafeauthenticatedconnectionsharing/)(bool) | 클라이언트가 NTLM 인증을 사용할 때 연결 공유가 활성화되어 있는지 여부를 나타내는 값을 설정합니다. |
| [set_UserAgent](./set_useragent/)(String) | 'User-Agent' 헤더의 값을 설정합니다. |
| [UnregisterMapping](./unregistermapping/)(System::SharedPtr\<Object\>) |  |
## 또 보기

* Class [WebClientProtocol](../webclientprotocol/)
* Namespace [System::Web::Services::Protocols](../)
* Library [Aspose.Page for C++](../../)
