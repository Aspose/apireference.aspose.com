---
title: "System::Net::Http::HttpClientHandler 클래스"
linktitle: "HttpClientHandler"
second_title: "C++용 Aspose.Page"
description: "System::Net::Http::HttpClientHandler 클래스. HttpClient 클래스에서 사용하는 기본 메시지 핸들러를 나타냅니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, 해당 포인터를 사용하여 C++에서 함수 인수로 전달하십시오."
type: docs
weight: 300
url: /ko/cpp/system.net.http/httpclienthandler/
---
## HttpClientHandler class


[HttpClient](../httpclient/) 클래스에서 사용하는 기본 메시지 핸들러를 나타냅니다. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 해당 포인터를 사용하여 함수 인수로 전달하십시오.

```cpp
class HttpClientHandler : public System::Net::Http::HttpMessageHandler
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [Dispose](./dispose/)() override | 아무 작업도 수행하지 않습니다. |
| [get_CookieContainer](./get_cookiecontainer/)() | 서버 쿠키를 저장하는 쿠키 컨테이너를 가져옵니다. |
| [get_Credentials](./get_credentials/)() | 인증 정보를 가져옵니다. |
| [HttpClientHandler](./httpclienthandler/)() | RTTI 정보. |
| [Send](./send/)(System::SharedPtr\<HttpRequestMessage\>) override | RTTI 정보. |
| [set_CookieContainer](./set_cookiecontainer/)(System::SharedPtr\<System::Net::CookieContainer\>) | 서버 쿠키를 저장하는 쿠키 컨테이너를 설정합니다. |
| [set_Credentials](./set_credentials/)(System::SharedPtr\<ICredentials\>) | 인증 정보를 설정합니다. |
| [set_Proxy](./set_proxy/)(System::SharedPtr\<IWebProxy\>) | 프록시 정보를 설정합니다. |
| [set_Timeout](./set_timeout/)(int32_t) | 요청이 시간 초과될 때까지의 밀리초 단위 시간을 가져옵니다. |
| [set_UseCookies](./set_usecookies/)(bool) | 현재 인스턴스가 서버 쿠키를 저장하기 위해 쿠키 컨테이너를 사용하는지, 그리고 요청을 보낼 때 서버 쿠키를 사용하는지를 나타내는 값을 설정합니다. |
| [set_UseProxy](./set_useproxy/)(bool) | 현재 인스턴스가 요청을 보낼 때 프록시를 사용하는지 여부를 나타내는 값을 설정합니다. |
## 또 보기

* Class [HttpMessageHandler](../httpmessagehandler/)
* Namespace [System::Net::Http](../)
* Library [Aspose.Page for C++](../../)
