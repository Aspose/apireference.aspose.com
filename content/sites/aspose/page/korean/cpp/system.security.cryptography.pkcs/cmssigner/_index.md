---
title: "System::Security::Cryptography::Pkcs::CmsSigner 클래스"
linktitle: "CmsSigner"
second_title: "C++용 Aspose.Page"
description: "System::Security::Cryptography::Pkcs::CmsSigner 클래스. CMS를 사용하여 객체에 서명하는 API를 제공합니다. 자체적으로 객체에 서명하지 않으며, 이를 위해 SignedCMS 클래스를 사용하십시오. 구현되지 않았습니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택이나 operator new를 사용하여 인스턴스를 생성하면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, 해당 포인터를 함수 인수로 전달하십시오. C++에서."
type: docs
weight: 100
url: /ko/cpp/system.security.cryptography.pkcs/cmssigner/
---
## CmsSigner class


CMS를 사용하여 객체에 서명하는 API를 제공합니다. 자체적으로 객체에 서명하지 않으며, 이를 위해 SignedCMS 클래스를 사용하십시오. 구현되지 않았습니다. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택이나 operator new를 사용하여 인스턴스를 생성하면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 해당 포인터를 함수 인수로 전달하십시오.

```cpp
class CmsSigner : public System::Object
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [CmsSigner](./cmssigner/)(const SharedPtr\<X509Certificates::X509Certificate2\>\&) | X509 인증서로 서명자를 초기화합니다. |
| [get_DigestAlgorithm](./get_digestalgorithm/)() const | 서명에 사용되는 해시 알고리즘을 가져옵니다. |
| [get_IncludeOption](./get_includeoption/)() const | 체인에서 서명에 포함될 인증서를 확인합니다. |
| [set_DigestAlgorithm](./set_digestalgorithm/)(const SharedPtr\<Oid\>\&) | 서명에 사용할 해시 알고리즘을 설정합니다. |
| [set_IncludeOption](./set_includeoption/)(X509Certificates::X509IncludeOption) | 체인에서 서명에 포함될 인증서를 지정합니다. |
## 또 보기

* Class [Object](../../system/object/)
* Namespace [System::Security::Cryptography::Pkcs](../)
* Library [Aspose.Page for C++](../../)
