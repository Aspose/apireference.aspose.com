---
title: "System::Security::Cryptography::HMACSHA512 클래스"
linktitle: "HMACSHA512"
second_title: "C++용 Aspose.Page"
description: "System::Security::Cryptography::HMACSHA512 클래스. SHA512 해시 함수를 사용하는 해시 기반 메시지 인증 코드입니다. 부분적으로 구현되었습니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, 해당 포인터를 C++에서 함수 인수로 전달하십시오."
type: docs
weight: 1900
url: /ko/cpp/system.security.cryptography/hmacsha512/
---
## HMACSHA512 class


해시 기반 메시지 [Authentication](../../system.security.authentication/) 코드는 [SHA512](../sha512/) 해시 함수를 사용합니다. 부분적으로 구현되었습니다. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 해당 포인터를 함수 인수로 전달하십시오.

```cpp
class HMACSHA512 : public System::Security::Cryptography::HashAlgorithm
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [ComputeHash](./computehash/)(const ArrayPtr\<uint8_t\>\&) | 계산합니다 [HMAC](../hmac/). |
| [HMACSHA512](./hmacsha512/)() | 생성자. |
| [HMACSHA512](./hmacsha512/)(const System::ArrayPtr\<uint8_t\>\&) | 생성자. |
## 또 보기

* Class [HashAlgorithm](../hashalgorithm/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
