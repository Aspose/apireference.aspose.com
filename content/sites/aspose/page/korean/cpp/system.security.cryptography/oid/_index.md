---
title: "System::Security::Cryptography::Oid 클래스"
linktitle: "Oid"
second_title: "C++용 Aspose.Page"
description: "System::Security::Cryptography::Oid 클래스. 암호화 객체 식별자입니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, 해당 포인터를 C++에서 함수 인수로 전달하는 데 사용하십시오."
type: docs
weight: 2500
url: /ko/cpp/system.security.cryptography/oid/
---
## Oid class


암호화 객체 식별자입니다. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 해당 포인터를 함수 인수로 전달하는 데 사용하십시오.

```cpp
class Oid : public System::Object
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| static [FromFriendlyName](./fromfriendlyname/)(const String\&, OidGroup) | 지정된 OID 친숙한 이름으로 OID 객체를 생성합니다. |
| static [FromOidValue](./fromoidvalue/)(const String\&, OidGroup) | 지정된 OID 값으로 OID 객체를 생성합니다. |
| [get_FriendlyName](./get_friendlyname/)() const | 객체의 사용자 친화적 이름을 가져옵니다. |
| [get_Value](./get_value/)() const | 객체 식별자 문자열을 가져옵니다. |
| [Oid](./oid/)() | RTTI 정보. |
| [Oid](./oid/)(const SharedPtr\<Oid\>\&) | 복사 생성자. |
| [Oid](./oid/)(const String\&) | 생성자. |
| [Oid](./oid/)(const String\&, const String\&) | 생성자. |
| [set_FriendlyName](./set_friendlyname/)(const String\&) | 객체의 사용자 친화적 이름을 설정합니다. |
| [set_Value](./set_value/)(const String\&) | 객체 식별자 문자열을 설정합니다. |
## 또 보기

* Class [Object](../../system/object/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
