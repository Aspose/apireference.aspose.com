---
title: "System::Security::Cryptography::X509Certificates::X500DistinguishedName 클래스"
linktitle: "X500DistinguishedName"
second_title: "C++용 Aspose.Page"
description: "System::Security::Cryptography::X509Certificates::X500DistinguishedName 클래스. X509 인증서의 구별 이름을 나타냅니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용해 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, 해당 포인터를 C++에서 함수 인수로 전달하도록 사용하십시오."
type: docs
weight: 200
url: /ko/cpp/system.security.cryptography.x509certificates/x500distinguishedname/
---
## X500DistinguishedName class


X509 인증서의 구별 이름을 나타냅니다. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용해 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 해당 포인터를 함수 인수로 전달하도록 사용하십시오.

```cpp
class X500DistinguishedName : public System::Security::Cryptography::AsnEncodedData
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [Decode](./decode/)(X500DistinguishedNameFlags) const | 플래그로 지정된 매개변수를 사용하여 이름을 디코딩합니다. |
| [Format](./format/)(bool) const override | 인쇄용으로 이름을 포맷합니다. |
| [get_Name](./get_name/)() const | 인증서 구별 이름을 가져옵니다. |
| [X500DistinguishedName](./x500distinguishedname/)(const SharedPtr\<AsnEncodedData\>\&) | RTTI 정보. |
| [X500DistinguishedName](./x500distinguishedname/)(const ByteArrayPtr\&) | 생성자. |
| [X500DistinguishedName](./x500distinguishedname/)(const String\&) | 생성자. |
| [X500DistinguishedName](./x500distinguishedname/)(const SharedPtr\<X500DistinguishedName\>\&) | 복사 생성자. |
| [X500DistinguishedName](./x500distinguishedname/)(const String\&, X500DistinguishedNameFlags) | 생성자. |
## 또 보기

* Class [AsnEncodedData](../../system.security.cryptography/asnencodeddata/)
* Namespace [System::Security::Cryptography::X509Certificates](../)
* Library [Aspose.Page for C++](../../)
