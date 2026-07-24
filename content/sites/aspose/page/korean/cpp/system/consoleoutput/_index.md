---
title: "System::ConsoleOutput 클래스"
linktitle: "ConsoleOutput"
second_title: "C++용 Aspose.Page"
description: "System::ConsoleOutput 클래스. 표준 출력 스트림을 나타냅니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 래핑하고 해당 포인터를 C++에서 함수 인수로 전달하도록 사용하십시오."
type: docs
weight: 1500
url: /ko/cpp/system/consoleoutput/
---
## ConsoleOutput class


표준 출력 스트림을 나타냅니다. 이 클래스의 객체는 [System::MakeObject()](../makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들지 마십시오. 이렇게 하면 런타임 오류 및/또는 어설션 오류가 발생할 수 있습니다. 항상 이 클래스를 [System::SmartPtr](../smartptr/) 포인터로 감싸고, 해당 포인터를 함수 인수로 전달하십시오.

```cpp
class ConsoleOutput : public System::IO::TextWriter
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [get_Encoding](./get_encoding/)() override | 항상 ASCII 인코딩을 반환합니다. |
| [Write](./write/)(bool) override | 지정된 bool 값의 문자열 표현을 현재 객체가 나타내는 출력 스트림에 출력합니다. |
| [Write](./write/)(const SharedPtr\<Object\>\&) override | 지정된 객체의 문자열 표현을 현재 객체가 나타내는 출력 스트림에 출력합니다. |
| [Write](./write/)(char_t) override | 지정된 문자 값을 현재 객체가 나타내는 출력 스트림에 출력합니다. |
| [Write](./write/)(Decimal) override | 현재 객체가 나타내는 출력 스트림에 [Decimal](../decimal/) 값의 문자열 표현을 출력합니다. |
| [Write](./write/)(double) override | 현재 객체가 나타내는 출력 스트림에 배정밀도 부동소수점 값의 문자열 표현을 출력합니다. |
| [Write](./write/)(int32_t) override | 현재 객체가 나타내는 출력 스트림에 32비트 정수 값의 문자열 표현을 출력합니다. |
| [Write](./write/)(int64_t) override | 현재 객체가 나타내는 출력 스트림에 64비트 정수 값의 문자열 표현을 출력합니다. |
| [Write](./write/)(float) override | 현재 객체가 나타내는 출력 스트림에 단정밀도 부동소수점 값의 문자열 표현을 출력합니다. |
| [Write](./write/)(const String\&) override | 지정된 문자열 객체를 현재 객체가 나타내는 출력 스트림에 출력합니다. |
| [Write](./write/)(uint32_t) override | 현재 객체가 나타내는 출력 스트림에 부호 없는 32비트 정수 값의 문자열 표현을 출력합니다. |
| [Write](./write/)(uint64_t) override | 현재 객체가 나타내는 출력 스트림에 부호 없는 64비트 정수 값의 문자열 표현을 출력합니다. |
| [Write](./write/)(const ArrayPtr\<char_t\>\&) override | 지정된 문자 배열의 문자열 표현을 현재 객체가 나타내는 출력 스트림에 출력합니다. |
| [Write](./write/)(const ArrayPtr\<char_t\>\&, int32_t, int32_t) override | 지정된 문자 배열의 값 범위에 대한 문자열 표현을 현재 객체가 나타내는 출력 스트림에 출력합니다. |
| [Write](./write/)(const char_t *) override | 지정된 C 문자열을 현재 객체가 나타내는 출력 스트림에 출력합니다. |
| [Write](./write/)(const TypeInfo\&) override | 지정된 [TypeInfo](../typeinfo/) 객체의 문자열 표현을 현재 객체가 나타내는 출력 스트림에 출력합니다. |
| [Write](./write/)(const char *) |  |
| [WriteLine](./writeline/)() override | 현재 줄 구분자를 현재 객체가 나타내는 출력 스트림에 출력합니다. |
| [WriteLine](./writeline/)(const SharedPtr\<Object\>\&) override | 지정된 객체의 문자열 표현 뒤에 현재 줄 구분자를 붙여 현재 객체가 나타내는 출력 스트림에 출력합니다. |
| [WriteLine](./writeline/)(bool) override | 지정된 bool 값의 문자열 표현 뒤에 현재 줄 구분자를 붙여 현재 객체가 나타내는 출력 스트림에 출력합니다. |
| [WriteLine](./writeline/)(char_t) override | 지정된 문자 값 뒤에 현재 줄 구분자를 붙여 현재 객체가 나타내는 출력 스트림에 출력합니다. |
| [WriteLine](./writeline/)(Decimal) override | [Decimal](../decimal/) 값의 문자열 표현 뒤에 현재 줄 구분자를 붙여 현재 객체가 나타내는 출력 스트림에 출력합니다. |
| [WriteLine](./writeline/)(double) override | 배정밀도 부동소수점 값의 문자열 표현 뒤에 현재 줄 구분자를 붙여 현재 객체가 나타내는 출력 스트림에 출력합니다. |
| [WriteLine](./writeline/)(int) override | 32비트 정수 값의 문자열 표현 뒤에 현재 줄 구분자를 붙여 현재 객체가 나타내는 출력 스트림에 출력합니다. |
| [WriteLine](./writeline/)(int64_t) override | 64비트 정수 값의 문자열 표현 뒤에 현재 줄 구분자를 붙여 현재 객체가 나타내는 출력 스트림에 출력합니다. |
| [WriteLine](./writeline/)(float) override | 단정도 부동소수점 값의 문자열 표현을 현재 줄 구분자와 함께 현재 객체가 나타내는 출력 스트림에 출력합니다. |
| [WriteLine](./writeline/)(const String\&) override | 지정된 문자열 객체를 현재 줄 구분자와 함께 현재 객체가 나타내는 출력 스트림에 출력합니다. |
| [WriteLine](./writeline/)(uint32_t) override | 부호 없는 32비트 정수 값의 문자열 표현을 현재 줄 구분자와 함께 현재 객체가 나타내는 출력 스트림에 출력합니다. |
| [WriteLine](./writeline/)(uint64_t) override | 부호 없는 64비트 정수 값의 문자열 표현을 현재 줄 구분자와 함께 현재 객체가 나타내는 출력 스트림에 출력합니다. |
| [WriteLine](./writeline/)(const ArrayPtr\<char_t\>\&) override | 지정된 문자 배열의 문자열 표현을 현재 줄 구분자와 함께 현재 객체가 나타내는 출력 스트림에 출력합니다. |
| [WriteLine](./writeline/)(const ArrayPtr\<char_t\>\&, int32_t, int32_t) override | 지정된 문자 배열의 값 범위에 대한 문자열 표현을 현재 줄 구분자와 함께 현재 객체가 나타내는 출력 스트림에 출력합니다. |
| [WriteLine](./writeline/)(const char_t *) override | 지정된 C 문자열을 현재 줄 구분자와 함께 현재 객체가 나타내는 출력 스트림에 출력합니다. |
| [WriteLine](./writeline/)(const TypeInfo\&) override | 지정된 [TypeInfo](../typeinfo/) 객체의 문자열 표현을 현재 줄 구분자와 함께 현재 객체가 나타내는 출력 스트림에 출력합니다. |
| [WriteLine](./writeline/)(const char *) |  |
## 또 보기

* Class [TextWriter](../../system.io/textwriter/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
