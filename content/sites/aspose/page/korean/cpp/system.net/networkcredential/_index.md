---
title: "System::Net::NetworkCredential 클래스"
linktitle: "NetworkCredential"
second_title: "C++용 Aspose.Page"
description: "System::Net::NetworkCredential 클래스. 비밀번호 기반 인증 방식에 대한 자격 증명을 제공합니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택이나 operator new를 사용하여 인스턴스를 생성하면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, 해당 포인터를 인수로 함수에 전달하십시오. C++에서."
type: docs
weight: 2900
url: /ko/cpp/system.net/networkcredential/
---
## NetworkCredential class


비밀번호 기반 인증 방식에 대한 자격 증명을 제공합니다. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택이나 operator new를 사용하여 이 유형의 인스턴스를 생성하면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 해당 포인터를 함수에 인수로 전달하십시오.

```cpp
class NetworkCredential : public System::Net::ICredentials,
                          public System::Net::ICredentialsByHost,
                          public virtual System::Object
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [get_Domain](./get_domain/)() | 자격 증명을 확인하는 도메인을 가져옵니다. |
| [get_Password](./get_password/)() | 비밀번호를 가져옵니다. |
| [get_UserName](./get_username/)() | RTTI 정보. |
| [GetCredential](./getcredential/)(System::SharedPtr\<Uri\>, String) override | 지정된 URI 및 인증 유형에 대한 자격 증명을 반환합니다. |
| [GetCredential](./getcredential/)(String, int32_t, String) override | 지정된 호스트 이름, 포트 및 인증 유형에 대한 자격 증명을 반환합니다. |
| [NetworkCredential](./networkcredential/)() | 새 인스턴스를 생성합니다. |
| [NetworkCredential](./networkcredential/)(String, String) | 새 인스턴스를 생성합니다. |
| [NetworkCredential](./networkcredential/)(String, String, String) | 새 인스턴스를 생성합니다. |
| [set_Domain](./set_domain/)(String) | 자격 증명을 확인하는 도메인을 설정합니다. |
| [set_Password](./set_password/)(String) | 비밀번호를 설정합니다. |
| [set_UserName](./set_username/)(String) | 사용자 이름을 설정합니다. |
## 또 보기

* Class [ICredentials](../icredentials/)
* Class [ICredentialsByHost](../icredentialsbyhost/)
* Class [Object](../../system/object/)
* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)
