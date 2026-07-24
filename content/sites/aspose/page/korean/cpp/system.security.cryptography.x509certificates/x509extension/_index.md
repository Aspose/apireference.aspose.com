---
title: "System::Security::Cryptography::X509Certificates::X509Extension 클래스"
linktitle: "X509Extension"
second_title: "C++용 Aspose.Page"
description: "System::Security::Cryptography::X509Certificates::X509Extension 클래스. X.509 인증서와 연관된 추가 정보를 보관하는 확장 객체. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용해 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, 해당 포인터를 C++에서 함수 인수로 전달하도록 사용하십시오."
type: docs
weight: 1200
url: /ko/cpp/system.security.cryptography.x509certificates/x509extension/
---
## X509Extension class


X.509 인증서와 연관된 추가 정보를 보관하는 확장 객체. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용해 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 해당 포인터를 함수 인수로 전달하도록 사용하십시오.

```cpp
class X509Extension : public System::Security::Cryptography::AsnEncodedData
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [CopyFrom](./copyfrom/)(const SharedPtr\<AsnEncodedData\>\&) override | 다른 객체에서 확장 데이터를 복사합니다. |
| [get_Critical](./get_critical/)() const | 확장이 중요한지 확인합니다. |
| [set_Critical](./set_critical/)(bool) | 확장이 중요한지 정의합니다. |
| [X509Extension](./x509extension/)(const SharedPtr\<AsnEncodedData\>\&, bool) | RTTI 정보. |
| [X509Extension](./x509extension/)(const SharedPtr\<Oid\>\&, const ByteArrayPtr\&, bool) | 생성자. |
| [X509Extension](./x509extension/)(const String\&, const ByteArrayPtr\&, bool) | 생성자. |
## 또 보기

* Class [AsnEncodedData](../../system.security.cryptography/asnencodeddata/)
* Namespace [System::Security::Cryptography::X509Certificates](../)
* Library [Aspose.Page for C++](../../)
