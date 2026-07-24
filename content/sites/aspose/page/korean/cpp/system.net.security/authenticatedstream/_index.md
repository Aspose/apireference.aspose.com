---
title: "System::Net::Security::AuthenticatedStream 클래스"
linktitle: "AuthenticatedStream"
second_title: "C++용 Aspose.Page"
description: "System::Net::Security::AuthenticatedStream 클래스. 스트림을 통해 자격 증명을 전달하는 메서드를 포함합니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여만 할당해야 합니다. 스택에 인스턴스를 만들거나 operator new를 사용해서는 안 되며, 이는 런타임 오류 및/또는 어설션 오류를 일으킬 수 있습니다. 항상 이 클래스를 System::SmartPtr 포인터로 래핑하고 해당 포인터를 사용하여 함수에 인수로 전달하십시오. C++."
type: docs
weight: 100
url: /ko/cpp/system.net.security/authenticatedstream/
---
## AuthenticatedStream class


스트림을 통해 자격 증명을 전달하는 메서드를 포함합니다. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여만 할당해야 합니다. 스택에 인스턴스를 만들거나 operator new를 사용해서는 안 되며, 이는 런타임 오류 및/또는 어설션 오류를 일으킬 수 있습니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 래핑하고 해당 포인터를 사용하여 함수에 인수로 전달하십시오.

```cpp
class AuthenticatedStream : public System::IO::Stream
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| virtual [get_IsAuthenticated](./get_isauthenticated/)() const | 인증이 성공적으로 수행되었는지 여부를 나타내는 값을 반환합니다. |
| virtual [get_IsEncrypted](./get_isencrypted/)() const | 이 스트림을 사용하여 전송된 데이터가 암호화되었는지 여부를 나타내는 값을 반환합니다. |
| virtual [get_IsMutuallyAuthenticated](./get_ismutuallyauthenticated/)() const | 서버와 클라이언트가 인증되었는지 여부를 나타내는 값을 반환합니다. |
| virtual [get_IsServer](./get_isserver/)() const | 연결의 로컬 측이 서버인지 여부를 나타내는 값을 반환합니다. |
| virtual [get_IsSigned](./get_issigned/)() const | 이 스트림을 사용하여 전송된 데이터가 서명되었는지 여부를 나타내는 값을 반환합니다. |
| [get_LeaveInnerStreamOpen](./get_leaveinnerstreamopen/)() const | RTTI 정보. |
## 필드

| 필드 | 설명 |
| --- | --- |
| static [Null](../../system.io/stream/null/) | 기본 저장소가 없는 스트림입니다. |
## 또 보기

* Class [Stream](../../system.io/stream/)
* Namespace [System::Net::Security](../)
* Library [Aspose.Page for C++](../../)
