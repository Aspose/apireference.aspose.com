---
title: "System::Security::Cryptography::X509Certificates::X509KeyUsageExtension class"
linktitle: "X509KeyUsageExtension"
second_title: "C++용 Aspose.Page"
description: "System::Security::Cryptography::X509Certificates::X509KeyUsageExtension 클래스. 키 사용에 대한 추가 정보를 보관하는 확장 객체입니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 래핑하고 해당 포인터를 함수 인수로 전달하십시오. C++에서."
type: docs
weight: 1600
url: /ko/cpp/system.security.cryptography.x509certificates/x509keyusageextension/
---
## X509KeyUsageExtension class


키 사용에 대한 추가 정보를 보관하는 확장 객체입니다. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 래핑하고 해당 포인터를 함수 인수로 전달하십시오.

```cpp
class X509KeyUsageExtension : public System::Security::Cryptography::X509Certificates::X509Extension
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [CopyFrom](./copyfrom/)(const SharedPtr\<AsnEncodedData\>\&) override | 다른 객체에서 확장 데이터를 복사합니다. |
| [get_KeyUsages](./get_keyusages/)() | 키 사용 정보를 가져옵니다. |
| [X509KeyUsageExtension](./x509keyusageextension/)() | RTTI 정보. |
| [X509KeyUsageExtension](./x509keyusageextension/)(const SharedPtr\<AsnEncodedData\>\&, bool) | 생성자. |
| [X509KeyUsageExtension](./x509keyusageextension/)(X509KeyUsageFlags, bool) | 생성자. |
## 또 보기

* Class [X509Extension](../x509extension/)
* Namespace [System::Security::Cryptography::X509Certificates](../)
* Library [Aspose.Page for C++](../../)
