---
title: "System::Security::Cryptography::RandomNumberGenerator 클래스"
linktitle: "RandomNumberGenerator"
second_title: "C++용 Aspose.Page"
description: "System::Security::Cryptography::RandomNumberGenerator 클래스. 랜덤 번호 생성기가 상속받는 추상 클래스. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택이나 operator new를 사용하여 이 유형의 인스턴스를 생성하면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 래핑하고 해당 포인터를 C++에서 함수 인수로 전달하십시오."
type: docs
weight: 2600
url: /ko/cpp/system.security.cryptography/randomnumbergenerator/
---
## RandomNumberGenerator class


랜덤 번호 생성기가 상속받는 추상 클래스. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택이나 operator new를 사용하여 이 유형의 인스턴스를 생성하면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 래핑하고 해당 포인터를 함수 인수로 전달하십시오.

```cpp
class RandomNumberGenerator : public virtual System::Object
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| static [Create](./create/)() | 암호화 랜덤 번호 생성기의 기본 구현 인스턴스를 생성합니다. 이 인스턴스는 랜덤 데이터를 생성하는 데 사용할 수 있습니다. 구현되지 않음. |
| virtual [GetBytes](./getbytes/)(ArrayPtr\<uint8_t\>) | 기존 배열 요소를 랜덤 바이트로 채웁니다. |
| virtual [GetBytes](./getbytes/)(ArrayPtr\<uint8_t\>, int, int) | 기존 배열 슬라이스를 랜덤 바이트로 채웁니다. |
| virtual [GetBytes](./getbytes/)(System::Details::ArrayView\<uint8_t\>) | 기존 배열 뷰 요소를 랜덤 바이트로 채웁니다. |
| virtual [GetBytes](./getbytes/)(System::Details::ArrayView\<uint8_t\>, int, int) | 기존 배열 뷰 슬라이스를 랜덤 바이트로 채웁니다. |
| [GetBytes](./getbytes/)(System::Details::StackArray\<uint8_t, N\>\&) | 기존 스택 배열 요소를 랜덤 바이트로 채웁니다. |
| [GetBytes](./getbytes/)(System::Details::StackArray\<uint8_t, N\>\&, int, int) | 기존 스택 배열 슬라이스를 랜덤 바이트로 채웁니다. |
| virtual [GetNonZeroBytes](./getnonzerobytes/)(ArrayPtr\<uint8_t\>) | 기존 배열 요소를 랜덤 0이 아닌 바이트로 채웁니다. |
| virtual [GetNonZeroBytes](./getnonzerobytes/)(System::Details::ArrayView\<uint8_t\>) | 기존 배열 뷰 요소를 랜덤 0이 아닌 바이트로 채웁니다. |
| [GetNonZeroBytes](./getnonzerobytes/)(System::Details::StackArray\<uint8_t, N\>\&) | 기존 스택 배열 요소를 랜덤 0이 아닌 바이트로 채웁니다. |
## 또 보기

* Class [Object](../../system/object/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
