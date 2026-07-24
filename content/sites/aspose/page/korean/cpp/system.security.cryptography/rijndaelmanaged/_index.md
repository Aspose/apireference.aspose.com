---
title: "System::Security::Cryptography::RijndaelManaged 클래스"
linktitle: "RijndaelManaged"
second_title: "C++용 Aspose.Page"
description: "System::Security::Cryptography::RijndaelManaged 클래스. 관리되는 Rijndael 알고리즘. None 패딩을 사용하는 ECB 및 CFB 모드와, None 및 Zeros 패딩을 사용하는 CBC 모드만 지원합니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용해 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, 해당 포인터를 사용해 C++에서 함수 인수로 전달하십시오."
type: docs
weight: 3100
url: /ko/cpp/system.security.cryptography/rijndaelmanaged/
---
## RijndaelManaged class


관리되는 [Rijndael](../rijndael/) 알고리즘. None 패딩을 사용하는 ECB 및 CFB 모드와, None 및 Zeros 패딩을 사용하는 CBC 모드만 지원합니다. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용해 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 해당 포인터를 사용해 함수 인수로 전달하십시오.

```cpp
class RijndaelManaged : public System::Security::Cryptography::Rijndael
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

* Class [Rijndael](../rijndael/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
