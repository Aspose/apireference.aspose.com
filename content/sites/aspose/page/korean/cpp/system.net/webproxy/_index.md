---
title: "System::Net::WebProxy 클래스"
linktitle: "WebProxy"
second_title: "C++용 Aspose.Page"
description: "System::Net::WebProxy 클래스. HTTP 웹 프록시 서버를 나타냅니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, 해당 포인터를 사용하여 C++에서 함수 인수로 전달하십시오."
type: docs
weight: 3700
url: /ko/cpp/system.net/webproxy/
---
## WebProxy class


HTTP 웹 프록시 서버를 나타냅니다. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 해당 포인터를 사용하여 함수 인수로 전달하십시오.

```cpp
class WebProxy : public System::Net::IWebProxy
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [get_Address](./get_address/)() | 현재 프록시 서버의 주소를 가져옵니다. |
| [get_BypassList](./get_bypasslist/)() | 프록시 서버를 사용하지 않는 주소 목록을 가져옵니다. |
| [get_BypassProxyOnLocal](./get_bypassproxyonlocal/)() | 프록시 서버를 로컬 주소에 사용해야 하는지를 나타내는 값을 가져옵니다. |
| virtual [get_Credentials](./get_credentials/)() | 인증을 위해 프록시 서버에 전송되는 자격 증명을 가져옵니다. |
| [get_UseDefaultCredentials](./get_usedefaultcredentials/)() | 요청과 함께 기본 자격 증명을 전송해야 하는지를 나타내는 값을 가져옵니다. |
| static [GetDefaultProxy](./getdefaultproxy/)() | Internet Explorer의 비동적 설정을 사용하는 프록시를 반환합니다. |
| virtual [GetProxy](./getproxy/)(System::SharedPtr\<Uri\>) | 웹 요청에 대한 프록시된 URI를 반환합니다. |
| virtual [IsBypassed](./isbypassed/)(System::SharedPtr\<Uri\>) | 지정된 URI에 대해 프록시 서버가 사용되지 않는지 확인합니다. |
| [set_Address](./set_address/)(System::SharedPtr\<Uri\>) | 현재 프록시 서버의 주소를 설정합니다. |
| [set_BypassList](./set_bypasslist/)(System::ArrayPtr\<String\>) | 프록시 서버를 사용하지 않는 주소 목록을 설정합니다. |
| [set_BypassProxyOnLocal](./set_bypassproxyonlocal/)(bool) | 프록시 서버를 로컬 주소에 사용해야 하는지 여부를 나타내는 값을 설정합니다. |
| virtual [set_Credentials](./set_credentials/)(System::SharedPtr\<ICredentials\>) | 프록시 서버에 인증을 위해 전송되는 자격 증명을 설정합니다. |
| [set_UseDefaultCredentials](./set_usedefaultcredentials/)(bool) | 요청과 함께 기본 자격 증명을 전송해야 하는지 여부를 나타내는 값을 설정합니다. |
| [WebProxy](./webproxy/)() | 새 인스턴스를 생성합니다. |
| [WebProxy](./webproxy/)(System::SharedPtr\<Uri\>) | 새 인스턴스를 생성합니다. |
| [WebProxy](./webproxy/)(System::SharedPtr\<Uri\>, bool) | 새 인스턴스를 생성합니다. |
| [WebProxy](./webproxy/)(System::SharedPtr\<Uri\>, bool, System::ArrayPtr\<String\>) | 새 인스턴스를 생성합니다. |
| [WebProxy](./webproxy/)(System::SharedPtr\<Uri\>, bool, System::ArrayPtr\<String\>, System::SharedPtr\<ICredentials\>) | 새 인스턴스를 생성합니다. |
| [WebProxy](./webproxy/)(String, int32_t) | 새 인스턴스를 생성합니다. |
| [WebProxy](./webproxy/)(String) | 새 인스턴스를 생성합니다. |
| [WebProxy](./webproxy/)(String, bool) | 새 인스턴스를 생성합니다. |
| [WebProxy](./webproxy/)(String, bool, System::ArrayPtr\<String\>) | 새 인스턴스를 생성합니다. |
| [WebProxy](./webproxy/)(String, bool, System::ArrayPtr\<String\>, System::SharedPtr\<ICredentials\>) | 새 인스턴스를 생성합니다. |
## 또 보기

* Class [IWebProxy](../iwebproxy/)
* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)
