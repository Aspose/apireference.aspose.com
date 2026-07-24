---
title: "System::Net::CredentialCache 클래스"
linktitle: "CredentialCache"
second_title: "C++용 Aspose.Page"
description: "System::Net::CredentialCache 클래스. 자격 증명 저장소를 제공합니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들지 마세요. 그렇지 않으면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 래핑하고, 해당 포인터를 사용하여 C++에서 함수 인수로 전달하십시오."
type: docs
weight: 600
url: /ko/cpp/system.net/credentialcache/
---
## CredentialCache class


자격 증명 저장소를 제공합니다. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들지 마세요. 그렇지 않으면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 래핑하고, 해당 포인터를 사용하여 함수 인수로 전달하십시오.

```cpp
class CredentialCache : public System::Net::ICredentials,
                        public System::Net::ICredentialsByHost
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [Add](./add/)(System::SharedPtr\<Uri\>, String, System::SharedPtr\<NetworkCredential\>) | 지정된 네트워크 자격 증명을 캐시에 추가합니다. |
| [Add](./add/)(String, int32_t, String, System::SharedPtr\<NetworkCredential\>) | 지정된 네트워크 자격 증명을 캐시에 추가합니다. |
| [CredentialCache](./credentialcache/)() | 새 인스턴스를 생성합니다. |
| static [get_DefaultCredentials](./get_defaultcredentials/)() | RTTI 정보. |
| static [get_DefaultNetworkCredentials](./get_defaultnetworkcredentials/)() | 현재 사용자 또는 애플리케이션의 네트워크 자격 증명을 반환합니다. |
| [GetCredential](./getcredential/)(System::SharedPtr\<Uri\>, String) override | 지정된 URI 접두사와 인증 유형에 대한 자격 증명을 반환합니다. |
| [GetCredential](./getcredential/)(String, int32_t, String) override | 지정된 호스트 이름, 포트 및 인증 유형에 대한 자격 증명을 반환합니다. |
| [Remove](./remove/)(System::SharedPtr\<Uri\>, String) | 지정된 URI 접두사와 인증 유형에 대한 네트워크 자격 증명을 제거합니다. |
| [Remove](./remove/)(String, int32_t, String) | 지정된 호스트 이름, 포트 및 인증 유형에 대한 네트워크 자격 증명을 제거합니다. |
## 또 보기

* Class [ICredentials](../icredentials/)
* Class [ICredentialsByHost](../icredentialsbyhost/)
* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)
