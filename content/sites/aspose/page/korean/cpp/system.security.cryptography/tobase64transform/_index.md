---
title: "System::Security::Cryptography::ToBase64Transform 클래스"
linktitle: "ToBase64Transform"
second_title: "C++용 Aspose.Page"
description: "System::Security::Cryptography::ToBase64Transform 클래스. CryptoStream 클래스 인스턴스를 base 64로 변환합니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, 해당 포인터를 사용하여 C++에서 함수 인수로 전달하십시오."
type: docs
weight: 5000
url: /ko/cpp/system.security.cryptography/tobase64transform/
---
## ToBase64Transform class


[CryptoStream](../cryptostream/) 클래스를 base 64로 변환합니다. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 해당 포인터를 사용하여 함수 인수로 전달하십시오.

```cpp
class ToBase64Transform : public System::Security::Cryptography::ICryptoTransform
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [Clear](./clear/)() | 모든 리소스를 해제합니다. |
| [Dispose](./dispose/)() | 현재 객체가 획득한 운영 체제 리소스를 해제합니다. |
| virtual [get_CanReuseTransform](./get_canreusetransform/)() | 현재 변환을 재사용할 수 있는지 여부를 나타내는 값을 가져옵니다. |
| [get_CanTransformMultipleBlocks](./get_cantransformmultipleblocks/)() | 여러 블록을 변환할 수 있는지 여부를 나타내는 값을 가져옵니다. |
| virtual [get_InputBlockSize](./get_inputblocksize/)() | 입력 블록 크기. |
| virtual [get_OutputBlockSize](./get_outputblocksize/)() | 출력 블록 크기. |
| [TransformBlock](./transformblock/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, System::ArrayPtr\<uint8_t\>, int32_t) | 데이터 블록을 처리하고 데이터를 출력 배열에 복사합니다. |
| [TransformFinalBlock](./transformfinalblock/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t) | 마지막 데이터 블록을 처리하고 출력 값을 계산합니다. |
| virtual [~ToBase64Transform](./~tobase64transform/)() | 소멸자. |
## 또 보기

* Class [ICryptoTransform](../icryptotransform/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
