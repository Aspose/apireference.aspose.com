---
title: "System::Net::ServicePointManager 클래스"
linktitle: "ServicePointManager"
second_title: "C++용 Aspose.Page"
description: "System::Net::ServicePointManager 클래스. ServicePoint 클래스 인스턴스의 수명 주기 단계(생성, 유지, 삭제)를 관리합니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용해서 인스턴스를 만들지 마세요. 그렇지 않으면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, 해당 포인터를 C++에서 함수 인수로 전달하세요."
type: docs
weight: 3200
url: /ko/cpp/system.net/servicepointmanager/
---
## ServicePointManager class


Manages the lifecycle stages (creating, maintaining, and deleting) of the [ServicePoint](../servicepoint/) class instances. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class ServicePointManager : public System::Object
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| static [get_CertificatePolicy](./get_certificatepolicy/)() | 인증서 정책을 가져옵니다. |
| static [get_CheckCertificateRevocationList](./get_checkcertificaterevocationlist/)() | 인증서를 인증 기관 폐기 목록과 대조해야 하는지 여부를 나타내는 값을 가져옵니다. |
| static [get_DefaultConnectionLimit](./get_defaultconnectionlimit/)() | ServicePoint 클래스 인스턴스에서 허용되는 최대 동시 연결 수를 가져옵니다. |
| static [get_DnsRefreshTimeout](./get_dnsrefreshtimeout/)() | DNS 해석이 유효하다고 간주되는 시간(밀리초)을 가져옵니다. |
| static [get_EnableDnsRoundRobin](./get_enablednsroundrobin/)() | DNS 해석이 적용 가능한 IP 주소들 사이에서 순환하는지 여부를 나타내는 값을 가져옵니다. |
| static [get_EncryptionPolicy](./get_encryptionpolicy/)() | 현재 인스턴스에서 사용되는 암호화 정책을 반환합니다. |
| static [get_Expect100Continue](./get_expect100continue/)() | ServicePoint 클래스 인스턴스가 100-Continue 동작을 사용하는지 여부를 나타내는 값을 가져옵니다. |
| static [get_MaxServicePointIdleTime](./get_maxservicepointidletime/)() | ServicePoint 클래스 인스턴스의 최대 유휴 시간을 가져옵니다. |
| static [get_MaxServicePoints](./get_maxservicepoints/)() | 현재 인스턴스가 관리할 수 있는 ServicePoint 클래스 인스턴스의 최대 수를 가져옵니다. |
| static [get_ReusePort](./get_reuseport/)() | 출력 연결 소켓이 'SO_REUSE_UNICASTPORT' 옵션을 사용하는지 여부를 나타내는 값을 가져옵니다. |
| static [get_SecurityProtocol](./get_securityprotocol/)() | 현재 인스턴스가 관리하는 ServicePoint 클래스 인스턴스에서 사용되는 보안 프로토콜 유형을 가져옵니다. |
| static [get_ServerCertificateValidationCallback](./get_servercertificatevalidationcallback/)() | 서버 인증서를 검증하는 데 사용되는 콜백을 가져옵니다. |
| static [get_UseNagleAlgorithm](./get_usenaglealgorithm/)() | ServicePoint 클래스 인스턴스가 Nagle 알고리즘을 사용하는지 여부를 나타내는 값을 가져옵니다. |
| static [set_CertificatePolicy](./set_certificatepolicy/)(System::SharedPtr\<ICertificatePolicy\>) | 인증서 정책을 설정합니다. |
| static [set_CheckCertificateRevocationList](./set_checkcertificaterevocationlist/)(bool) | 인증서를 인증 기관 폐기 목록과 대조해야 하는지 여부를 나타내는 값을 설정합니다. |
| static [set_DefaultConnectionLimit](./set_defaultconnectionlimit/)(int32_t) | ServicePoint 클래스 인스턴스에서 허용되는 최대 동시 연결 수를 설정합니다. |
| static [set_DnsRefreshTimeout](./set_dnsrefreshtimeout/)(int32_t) | DNS 해석이 유효하다고 간주되는 시간(밀리초)을 설정합니다. |
| static [set_EnableDnsRoundRobin](./set_enablednsroundrobin/)(bool) | DNS 해석이 적용 가능한 IP 주소들 사이에서 순환하는지 여부를 나타내는 값을 설정합니다. |
| static [set_Expect100Continue](./set_expect100continue/)(bool) | ServicePoint-class 인스턴스가 100-Continue 동작을 사용하는지 여부를 나타내는 값을 설정합니다. |
| static [set_MaxServicePointIdleTime](./set_maxservicepointidletime/)(int32_t) | ServicePoint-class 인스턴스의 최대 유휴 시간을 설정합니다. |
| static [set_MaxServicePoints](./set_maxservicepoints/)(int32_t) | 현재 인스턴스가 관리할 수 있는 ServicePoint-class 인스턴스의 최대 개수를 설정합니다. |
| static [set_ReusePort](./set_reuseport/)(bool) | 출력 연결 소켓이 'SO_REUSE_UNICASTPORT' 옵션을 사용하는지 여부를 나타내는 값을 설정합니다. |
| static [set_SecurityProtocol](./set_securityprotocol/)(SecurityProtocolType) | 현재 인스턴스가 관리하는 ServicePoint-class 인스턴스에서 사용되는 보안 프로토콜 유형을 설정합니다. |
| static [set_ServerCertificateValidationCallback](./set_servercertificatevalidationcallback/)(Security::RemoteCertificateValidationCallback) | 서버 인증서를 검증하는 데 사용되는 콜백을 설정합니다. |
| static [set_UseNagleAlgorithm](./set_usenaglealgorithm/)(bool) | ServicePoint-class 인스턴스가 Nagle 알고리즘을 사용하는지 여부를 나타내는 값을 설정합니다. |
| static [SetTcpKeepAlive](./settcpkeepalive/)(bool, int32_t, int32_t) | 'Keep-Alive' 옵션이 활성화되어 있는지 여부를 나타내는 값을 설정합니다. |
## 필드

| 필드 | 설명 |
| --- | --- |
| static [DefaultNonPersistentConnectionLimit](./defaultnonpersistentconnectionlimit/) | RTTI 정보. |
| static [DefaultPersistentConnectionLimit](./defaultpersistentconnectionlimit/) | 지속 연결의 기본 개수입니다. |
## 또 보기

* Class [Object](../../system/object/)
* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)
