---
title: "System::Security::Cryptography::RC2Managed 클래스"
linktitle: "RC2Managed"
second_title: "C++용 Aspose.Page"
description: "System::Security::Cryptography::RC2Managed 클래스. 관리되는 RC2 알고리즘입니다. ECB, CFB 및 CBC 암호 모드만 지원됩니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, 해당 포인터를 C++에서 함수 인수로 전달하십시오."
type: docs
weight: 2800
url: /ko/cpp/system.security.cryptography/rc2managed/
---
## RC2Managed class


관리되는 [RC2](../rc2/) 알고리즘입니다. ECB, CFB 및 CBC 암호 모드만 지원됩니다. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 해당 포인터를 함수 인수로 전달하십시오.

```cpp
class RC2Managed : public System::Security::Cryptography::RC2
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [CreateDecryptor](./createdecryptor/)(System::ArrayPtr\<uint8_t\>, System::ArrayPtr\<uint8_t\>) override | 명시적인 매개변수를 사용하여 복호화 객체를 생성합니다. |
| virtual [CreateDecryptor](./createdecryptor/)() | 알고리즘 객체가 정의한 매개변수를 사용하여 복호화 객체를 생성합니다. |
| [CreateEncryptor](./createencryptor/)(System::ArrayPtr\<uint8_t\>, System::ArrayPtr\<uint8_t\>) override | 명시적인 매개변수를 사용하여 암호화 객체를 생성합니다. |
| virtual [CreateEncryptor](./createencryptor/)() | 알고리즘 객체가 정의한 매개변수를 사용하여 암호화 객체를 생성합니다. |
| [GenerateIV](./generateiv/)() override | 무작위 초기 값을 생성하여 알고리즘 내부에 저장합니다. |
| [GenerateKey](./generatekey/)() override | 무작위 키를 생성하여 알고리즘 내부에 저장합니다. |
## 또 보기

* Class [RC2](../rc2/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
