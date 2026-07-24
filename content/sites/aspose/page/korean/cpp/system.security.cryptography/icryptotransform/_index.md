---
title: "System::Security::Cryptography::ICryptoTransform 클래스"
linktitle: "ICryptoTransform"
second_title: "C++용 Aspose.Page"
description: "System::Security::Cryptography::ICryptoTransform 클래스. 암호 변환기의 기본 클래스입니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, 해당 포인터를 C++에서 함수 인자로 전달하는 데 사용하십시오."
type: docs
weight: 2000
url: /ko/cpp/system.security.cryptography/icryptotransform/
---
## ICryptoTransform class


암호 변환기의 기본 클래스입니다. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 해당 포인터를 함수 인자로 전달하는 데 사용하십시오.

```cpp
class ICryptoTransform : public virtual System::Object
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| virtual [get_InputBlockSize](./get_inputblocksize/)() | 입력 블록 크기. |
| virtual [get_OutputBlockSize](./get_outputblocksize/)() | 출력 블록 크기. |
| virtual [TransformBlock](./transformblock/)(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<uint8_t\>, int) | RTTI 정보. |
| virtual [TransformFinalBlock](./transformfinalblock/)(ArrayPtr\<uint8_t\>, int, int) | 마지막 데이터 블록을 처리하고 출력 값을 계산합니다. |
## 또 보기

* Class [Object](../../system/object/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
