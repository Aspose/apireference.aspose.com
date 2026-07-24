---
title: "System::Console 클래스"
linktitle: "Console"
second_title: "C++용 Aspose.Page"
description: "System::Console 클래스. 표준 출력 스트림에 데이터를 출력하는 메서드를 제공합니다. 이는 인스턴스 서비스를 갖지 않는 정적 타입이며, C++에서 어떤 방법으로도 인스턴스를 생성해서는 안 됩니다."
type: docs
weight: 1400
url: /ko/cpp/system/console/
---
## Console class


표준 출력 스트림에 데이터를 출력하는 메서드를 제공합니다. 인스턴스 서비스를 제공하지 않는 정적 타입이며, 어떤 방법으로도 인스턴스를 생성해서는 안 됩니다.

```cpp
class Console
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| static [Beep](./beep/)() | 구현되지 않음. |
| static [get_Error](./get_error/)() | 표준 오류 스트림을 나타내는 객체를 가리키는 공유 포인터를 반환합니다. |
| static [get_In](./get_in/)() | 표준 입력 스트림을 나타내는 객체를 가리키는 공유 포인터를 반환합니다. |
| static [get_Out](./get_out/)() | 표준 출력 스트림을 나타내는 객체를 가리키는 공유 포인터를 반환합니다. |
| static [Mute](./mute/)(bool) | 표준 출력 스트림을 음소거하거나 음소거 해제합니다. |
| static [ReadKey](./readkey/)() | 구현되지 않음. |
| static [SetError](./seterror/)(const SharedPtr\<System::IO::TextWriter\>\&) | 지정된 객체를 클래스의 Error 속성에 할당합니다. |
| static [SetIn](./setin/)(const SharedPtr\<System::IO::TextReader\>\&) | In 속성을 지정된 TextReader 객체로 설정합니다. |
| static [SetOut](./setout/)(const SharedPtr\<System::IO::TextWriter\>\&) | 지정된 객체를 클래스의 Out 속성에 할당합니다. |
| static [Write](./write/)(const SharedPtr\<T\>\&) | 지정된 객체의 문자열 표현을 표준 출력 스트림에 출력합니다. |
| static [Write](./write/)(bool) | bool 값의 문자열 표현을 표준 출력 스트림에 출력합니다. |
| static [Write](./write/)(char_t) | 지정된 문자 값을 표준 출력 스트림에 출력합니다. |
| static [Write](./write/)(const ArrayPtr\<char_t\>\&) | 지정된 문자 배열의 문자열 표현을 표준 출력 스트림에 출력합니다. |
| static [Write](./write/)(const Decimal\&) | [Decimal](../decimal/) 값의 문자열 표현을 표준 출력 스트림에 출력합니다. |
| static [Write](./write/)(double) | double 정밀 부동 소수점 값의 문자열 표현을 표준 출력 스트림에 출력합니다. |
| static [Write](./write/)(float) | single 정밀 부동 소수점 값의 문자열 표현을 표준 출력 스트림에 출력합니다. |
| static [Write](./write/)(int32_t) | 32비트 정수 값의 문자열 표현을 표준 출력 스트림에 출력합니다. |
| static [Write](./write/)(int64_t) | 64비트 정수 값의 문자열 표현을 표준 출력 스트림에 출력합니다. |
| static [Write](./write/)(const String\&) | 지정된 문자열 객체를 표준 출력 스트림에 출력합니다. |
| static [Write](./write/)(const char_t *) | 지정된 C 문자열을 표준 출력 스트림에 출력합니다. |
| static [Write](./write/)(const TypeInfo\&) | [TypeInfo](../typeinfo/) 값의 문자열 표현을 표준 출력 스트림에 출력합니다. |
| static [Write](./write/)(uint32_t) | 부호 없는 32비트 정수 값의 문자열 표현을 표준 출력 스트림에 출력합니다. |
| static [Write](./write/)(uint64_t) | 부호 없는 64비트 정수 값의 문자열 표현을 표준 출력 스트림에 출력합니다. |
| static [Write](./write/)(const ArrayPtr\<char_t\>\&, int32_t, int32_t) | 지정된 문자 배열의 지정된 범위에 대한 문자열 표현을 표준 출력 스트림에 출력합니다. |
| static [Write](./write/)(const String\&, Args\&&...) | 지정된 형식에 따라 포맷된 지정된 인수들의 문자열 표현을 표준 출력 스트림에 출력합니다. |
| static [Write](./write/)(const char *) |  |
| static [WriteLine](./writeline/)() | 현재 줄 구분자를 표준 출력 스트림에 출력합니다. |
| static [WriteLine](./writeline/)(const SharedPtr\<T\>\&) | 지정된 객체의 문자열 표현을 현재 줄 구분자와 함께 표준 출력 스트림에 출력합니다. |
| static [WriteLine](./writeline/)(bool) | bool 값의 문자열 표현을 현재 줄 구분자와 함께 표준 출력 스트림에 출력합니다. |
| static [WriteLine](./writeline/)(char_t) | 지정된 문자 값을 현재 줄 구분자와 함께 표준 출력 스트림에 출력합니다. |
| static [WriteLine](./writeline/)(const ArrayPtr\<char_t\>\&) | 지정된 문자 배열의 문자열 표현을 현재 행 구분자와 함께 표준 출력 스트림에 출력합니다. |
| static [WriteLine](./writeline/)(const Decimal\&) | [Decimal](../decimal/) 값의 문자열 표현을 현재 행 구분자와 함께 표준 출력 스트림에 출력합니다. |
| static [WriteLine](./writeline/)(double) | 배정밀도 부동 소수점 값의 문자열 표현을 현재 행 구분자와 함께 표준 출력 스트림에 출력합니다. |
| static [WriteLine](./writeline/)(float) | 단정밀도 부동 소수점 값의 문자열 표현을 현재 행 구분자와 함께 표준 출력 스트림에 출력합니다. |
| static [WriteLine](./writeline/)(int32_t) | 32비트 정수 값의 문자열 표현을 현재 행 구분자와 함께 표준 출력 스트림에 출력합니다. |
| static [WriteLine](./writeline/)(int64_t) | 64비트 정수 값의 문자열 표현을 현재 행 구분자와 함께 표준 출력 스트림에 출력합니다. |
| static [WriteLine](./writeline/)(const String\&) | 지정된 문자열 객체를 현재 행 구분자와 함께 표준 출력 스트림에 출력합니다. |
| static [WriteLine](./writeline/)(const char_t *) | 지정된 C 문자열을 현재 행 구분자와 함께 표준 출력 스트림에 출력합니다. |
| static [WriteLine](./writeline/)(const TypeInfo\&) | [TypeInfo](../typeinfo/) 값의 문자열 표현을 현재 행 구분자와 함께 표준 출력 스트림에 출력합니다. |
| static [WriteLine](./writeline/)(uint32_t) | 부호 없는 32비트 정수 값의 문자열 표현을 현재 행 구분자와 함께 표준 출력 스트림에 출력합니다. |
| static [WriteLine](./writeline/)(uint64_t) | 부호 없는 64비트 정수 값의 문자열 표현을 현재 행 구분자와 함께 표준 출력 스트림에 출력합니다. |
| static [WriteLine](./writeline/)(const ArrayPtr\<char_t\>\&, int, int) | 지정된 문자 배열의 지정된 범위에 대한 문자열 표현을 현재 행 구분자와 함께 표준 출력 스트림에 출력합니다. |
| static [WriteLine](./writeline/)(const Exception\&) | 지정된 [Exception](../exception/) 객체의 문자열 표현을 현재 행 구분자와 함께 표준 출력 스트림에 출력합니다. |
| static [WriteLine](./writeline/)(const String\&, Args\&&...) | 지정된 형식에 따라 포맷된 지정된 인수들의 문자열 표현을 현재 행 구분자와 함께 표준 출력 스트림에 출력합니다. |
| static [WriteLine](./writeline/)(const char *) |  |
## 비고



```cpp
#include "system/console.h"
#include <array>

int main()
{
  using namespace System;

  // hello 메시지를 출력합니다.
  Console::WriteLine(u"Hello, world!");

  // 'std::array' 클래스의 인스턴스를 생성합니다.
  std::array<int, 5> arr = {1, 2, 3, 4, 5};

  // 배열의 요소들을 출력합니다.
  for (auto el: arr)
  {
    Console::Write(u"{0} ", el);
  }
  Console::WriteLine();

  return 0;
}
/*
This code example produces the following output:
Hello, world!
1 2 3 4 5
*/
```

## 또 보기

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
