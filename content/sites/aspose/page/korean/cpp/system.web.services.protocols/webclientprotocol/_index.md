---
title: "System::Web::Services::Protocols::WebClientProtocol 클래스"
linktitle: "WebClientProtocol"
second_title: "C++용 Aspose.Page"
description: "System::Web::Services::Protocols::WebClientProtocol 클래스. 이 기본 클래스는 ASP.NET을 사용하여 생성된 모든 XML Web 서비스 클라이언트 프록시에서 사용됩니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 인스턴스를 생성하거나 operator new를 사용하지 마십시오. 이렇게 하면 런타임 오류 및/또는 어설션 오류가 발생할 수 있습니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, C++에서 함수 인수로 전달할 때 이 포인터를 사용하십시오."
type: docs
weight: 1100
url: /ko/cpp/system.web.services.protocols/webclientprotocol/
---
## WebClientProtocol class


이 기본 클래스는 ASP.NET을 사용하여 생성된 모든 XML [Web](../../system.web/) 서비스 클라이언트 프록시에서 사용됩니다. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 인스턴스를 생성하거나 operator new를 사용하지 마십시오. 이렇게 하면 런타임 오류 및/또는 어설션 오류가 발생할 수 있습니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 함수 인수로 전달할 때 이 포인터를 사용하십시오.

```cpp
class WebClientProtocol : public virtual System::Object
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| virtual [Abort](./abort/)() | 요청을 취소합니다. |
| [get_ConnectionGroupName](./get_connectiongroupname/)() | 연결 그룹의 이름을 가져옵니다. |
| [get_Credentials](./get_credentials/)() | 인증 정보를 가져옵니다. |
| [get_PreAuthenticate](./get_preauthenticate/)() | 사전 인증이 활성화되어 있는지를 나타내는 값을 가져옵니다. |
| [get_RequestEncoding](./get_requestencoding/)() | 클라이언트 요청을 만들 때 사용되는 인코딩을 가져옵니다. |
| [get_Timeout](./get_timeout/)() | 요청이 시간 초과되기 전에 대기할 시간 간격을 가져옵니다. |
| [get_Uri](./get_uri/)() | XML [Web](../../system.web/) 서비스 URI를 가져옵니다. |
| [get_Url](./get_url/)() | XML [Web](../../system.web/) 서비스 URL을 가져옵니다. |
| [get_UseDefaultCredentials](./get_usedefaultcredentials/)() | 'Credential' 속성이 'DefaultCredentials' 속성과 같은지 여부를 나타내는 값을 가져옵니다. |
| [set_ConnectionGroupName](./set_connectiongroupname/)(String) | 연결 그룹의 이름을 설정합니다. |
| [set_Credentials](./set_credentials/)(System::SharedPtr\<Net::ICredentials\>) | 인증 정보를 설정합니다. |
| [set_PreAuthenticate](./set_preauthenticate/)(bool) | 사전 인증이 활성화되어 있는지를 나타내는 값을 설정합니다. |
| [set_RequestEncoding](./set_requestencoding/)(System::SharedPtr\<Text::Encoding\>) | 클라이언트 요청을 만들 때 사용되는 인코딩을 설정합니다. |
| [set_Timeout](./set_timeout/)(int32_t) | 요청이 시간 초과되기 전에 대기할 시간 간격을 설정합니다. |
| [set_Uri](./set_uri/)(System::SharedPtr\<Uri\>) | XML [Web](../../system.web/) 서비스 URI를 설정합니다. |
| [set_Url](./set_url/)(String) | XML [Web](../../system.web/) 서비스 URL을 설정합니다. |
| [set_UseDefaultCredentials](./set_usedefaultcredentials/)(bool) | 'Credential' 속성이 'DefaultCredentials' 속성과 같은지를 나타내는 값을 설정합니다. |
## 또 보기

* Class [Object](../../system/object/)
* Namespace [System::Web::Services::Protocols](../)
* Library [Aspose.Page for C++](../../)
