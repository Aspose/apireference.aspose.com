---
title: "System::Security::Cryptography::SymmetricAlgorithm 클래스"
linktitle: "SymmetricAlgorithm"
second_title: "C++용 Aspose.Page"
description: "System::Security::Cryptography::SymmetricAlgorithm 클래스. 암호화와 복호화에 동일한 키를 사용하는 대칭 알고리즘의 기본 클래스입니다. 이 클래스의 객체는 반드시 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, 해당 포인터를 C++에서 함수 인수로 전달하는 데 사용하십시오."
type: docs
weight: 4900
url: /ko/cpp/system.security.cryptography/symmetricalgorithm/
---
## SymmetricAlgorithm class


암호화와 복호화에 동일한 키를 사용하는 대칭 알고리즘의 기본 클래스입니다. 이 클래스의 객체는 반드시 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용해 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 해당 포인터를 함수 인수로 전달하는 데 사용하십시오.

```cpp
class SymmetricAlgorithm : public virtual System::Object
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| static [Create](./create/)(const String\&) | 알고리즘 인스턴스를 생성합니다. |
| virtual [CreateDecryptor](./createdecryptor/)() | 알고리즘 객체와 연결된 매개변수로 복호화기를 생성합니다. |
| virtual [CreateDecryptor](./createdecryptor/)(System::ArrayPtr\<uint8_t\>, System::ArrayPtr\<uint8_t\>) | 명시적인 매개변수로 복호화기를 생성합니다. |
| virtual [CreateEncryptor](./createencryptor/)() | 알고리즘 객체와 연결된 매개변수로 암호화기를 생성합니다. |
| virtual [CreateEncryptor](./createencryptor/)(System::ArrayPtr\<uint8_t\>, System::ArrayPtr\<uint8_t\>) | 명시적인 매개변수로 암호화기를 생성합니다. |
| virtual [GenerateIV](./generateiv/)() | 알고리즘에 대한 무작위 초기 값을 생성합니다. 기존 값이 있으면 덮어씁니다(있는 경우). |
| virtual [GenerateKey](./generatekey/)() | 알고리즘에 대한 무작위 키를 생성합니다. 기존 키가 있으면 덮어씁니다(있는 경우). |
| virtual [get_BlockSize](./get_blocksize/)() | 암호화 작업의 블록 크기를 가져옵니다. |
| virtual [get_FeedbackSize](./get_feedbacksize/)() | 암호화 작업의 피드백 크기를 가져옵니다. |
| virtual [get_IV](./get_iv/)() | 암호화 작업의 초기 값을 가져옵니다. 아직 생성되지 않은 경우 새로 생성합니다. |
| virtual [get_Key](./get_key/)() | 암호화 작업의 키를 가져옵니다. 아직 생성되지 않은 경우 새로 생성합니다. |
| virtual [get_KeySize](./get_keysize/)() | 암호화 작업의 키 크기를 가져옵니다. |
| virtual [get_Mode](./get_mode/)() | 암호화 작업의 모드를 가져옵니다. |
| virtual [get_Padding](./get_padding/)() | 암호화 작업의 패딩을 가져옵니다. |
| virtual [set_BlockSize](./set_blocksize/)(int) | 암호화 작업의 블록 크기를 설정합니다. |
| virtual [set_FeedbackSize](./set_feedbacksize/)(int) | 암호화 작업의 피드백 크기를 설정합니다. |
| virtual [set_IV](./set_iv/)(System::ArrayPtr\<uint8_t\>) | 암호화 작업의 초기 값을 설정합니다. |
| virtual [set_Key](./set_key/)(System::ArrayPtr\<uint8_t\>) | 암호화 작업의 키를 설정합니다. |
| virtual [set_KeySize](./set_keysize/)(int) | 암호화 작업의 키 크기를 설정합니다. |
| virtual [set_Mode](./set_mode/)(CipherMode) | 암호화 작업의 모드를 설정합니다. |
| virtual [set_Padding](./set_padding/)(PaddingMode) | 암호화 작업의 패딩을 설정합니다. |
| [ValidKeySize](./validkeysize/)(int) | 키 크기가 유효한지 확인합니다. |
## 또 보기

* Class [Object](../../system/object/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
