---
title: "System::IO::TextWriter 클래스"
linktitle: "TextWriter"
second_title: "C++용 Aspose.Page"
description: "System::IO::TextWriter 클래스. 다양한 대상에 문자 시퀀스를 쓰는 작가(writer)를 나타내는 클래스들의 기본 클래스입니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여만 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용해 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, 해당 포인터를 C++에서 함수 인수로 전달하는 데 사용하십시오."
type: docs
weight: 2700
url: /ko/cpp/system.io/textwriter/
---
## TextWriter class


다양한 대상에 문자 시퀀스를 쓰는 작가(writer)를 나타내는 클래스들의 기본 클래스입니다. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여만 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용해 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 해당 포인터를 함수 인수로 전달하는 데 사용하십시오.

```cpp
class TextWriter : public System::IDisposable
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| virtual [Close](./close/)() | 스트림을 닫고 획득한 리소스를 해제합니다. |
| [Dispose](./dispose/)() override | 현재 객체가 사용한 모든 리소스를 해제하고 기반 스트림을 닫습니다. |
| virtual [Flush](./flush/)() | 버퍼의 내용을 기반 스트림에 플러시합니다. |
| virtual [get_Encoding](./get_encoding/)() | 현재 사용 중인 인코딩을 반환합니다. |
| virtual [get_FormatProvider](./get_formatprovider/)() const | 현재 사용 중인 [IFormatProvider](../../system/iformatprovider/) 객체를 반환합니다. |
| [get_FormatProvider](./get_formatprovider/)() | 현재 사용 중인 [IFormatProvider](../../system/iformatprovider/) 객체를 반환합니다. |
| virtual [get_NewLine](./get_newline/)() const | 줄 구분자 문자열을 반환합니다. |
| [get_NewLine](./get_newline/)() | 줄 구분자 문자열을 반환합니다. |
| virtual [set_NewLine](./set_newline/)(const System::String\&) | 줄 구분자 문자열을 설정합니다. |
| virtual [Write](./write/)(const SharedPtr\<Object\>\&) | 지정된 객체의 문자열 표현을 스트림에 씁니다. |
| virtual [Write](./write/)(bool) | 지정된 부울 값의 문자열 표현을 스트림에 씁니다. |
| virtual [Write](./write/)(char_t) | 지정된 문자를 스트림에 씁니다. |
| virtual [Write](./write/)(Decimal) | 지정된 [Decimal](../../system/decimal/) 객체의 문자열 표현을 스트림에 씁니다. |
| virtual [Write](./write/)(double) | 지정된 배정밀도 부동소수점 값의 문자열 표현을 스트림에 씁니다. |
| virtual [Write](./write/)(int) | 지정된 32비트 정수 값의 문자열 표현을 스트림에 씁니다. |
| virtual [Write](./write/)(int64_t) | 지정된 64비트 정수 값의 문자열 표현을 스트림에 씁니다. |
| virtual [Write](./write/)(float) | 지정된 단정밀도 부동소수점 값의 문자열 표현을 스트림에 씁니다. |
| virtual [Write](./write/)(const String\&) | 지정된 문자열을 스트림에 씁니다. |
| virtual [Write](./write/)(uint32_t) | 지정된 부호 없는 32비트 정수 값의 문자열 표현을 스트림에 씁니다. |
| virtual [Write](./write/)(uint64_t) | 지정된 부호 없는 64비트 정수 값의 문자열 표현을 스트림에 씁니다. |
| virtual [Write](./write/)(const ArrayPtr\<char_t\>\&) | 지정된 배열의 모든 문자를 스트림에 씁니다. |
| virtual [Write](./write/)(const ArrayPtr\<char_t\>\&, int32_t, int32_t) | 지정된 문자 배열에서 지정된 UTF-16 문자 하위 범위를 스트림에 씁니다. |
| virtual [Write](./write/)(const char_t *) | 지정된 c-string을 스트림에 씁니다. |
| virtual [Write](./write/)(const TypeInfo\&) | 지정된 [TypeInfo](../../system/typeinfo/) 객체의 문자열 표현을 스트림에 씁니다. |
| [Write](./write/)(const String\&, const TArgs\&...) | 지정된 형식에 따라 포맷된 지정된 값을 스트림에 씁니다. |
| virtual [WriteLine](./writeline/)() | 줄 구분자 문자를 스트림에 씁니다. |
| virtual [WriteLine](./writeline/)(const SharedPtr\<Object\>\&) | 지정된 객체의 문자열 표현에 줄 구분자 문자를 추가하여 스트림에 씁니다. |
| virtual [WriteLine](./writeline/)(bool) | 지정된 부울 값의 문자열 표현에 줄 구분자 문자를 추가하여 스트림에 씁니다. |
| virtual [WriteLine](./writeline/)(char_t) | 지정된 문자에 줄 구분자 문자를 추가하여 스트림에 씁니다. |
| virtual [WriteLine](./writeline/)(Decimal) | 지정된 [Decimal](../../system/decimal/) 객체의 문자열 표현에 줄 구분자 문자를 추가하여 스트림에 씁니다. |
| virtual [WriteLine](./writeline/)(double) | 지정된 배정밀도 부동소수점 값의 문자열 표현에 줄 구분자 문자를 추가하여 스트림에 씁니다. |
| virtual [WriteLine](./writeline/)(int) | 지정된 32비트 정수 값의 문자열 표현에 줄 구분자 문자를 추가하여 스트림에 씁니다. |
| virtual [WriteLine](./writeline/)(int64_t) | 지정된 64비트 정수 값의 문자열 표현에 줄 구분자 문자를 추가하여 스트림에 씁니다. |
| virtual [WriteLine](./writeline/)(float) | 지정된 단정도 부동소수점 값의 문자열 표현을 줄 바꿈 문자와 함께 스트림에 씁니다. |
| virtual [WriteLine](./writeline/)(const String\&) | 지정된 문자열을 줄 바꿈 문자와 함께 스트림에 씁니다. |
| virtual [WriteLine](./writeline/)(uint32_t) | 지정된 부호 없는 32비트 정수 값의 문자열 표현을 줄 바꿈 문자와 함께 스트림에 씁니다. |
| virtual [WriteLine](./writeline/)(uint64_t) | 지정된 부호 없는 64비트 정수 값의 문자열 표현을 줄 바꿈 문자와 함께 스트림에 씁니다. |
| virtual [WriteLine](./writeline/)(const ArrayPtr\<char_t\>\&) | 지정된 배열의 모든 문자를 줄 바꿈 문자와 함께 스트림에 씁니다. |
| virtual [WriteLine](./writeline/)(const ArrayPtr\<char_t\>\&, int32_t, int32_t) | 지정된 문자 배열에서 지정된 UTF-16 문자 하위 범위를 줄 바꿈 문자와 함께 스트림에 씁니다. |
| virtual [WriteLine](./writeline/)(const char_t *) | 지정된 C 문자열을 줄 바꿈 문자와 함께 스트림에 씁니다. |
| virtual [WriteLine](./writeline/)(const TypeInfo\&) | 지정된 [TypeInfo](../../system/typeinfo/) 객체의 문자열 표현을 줄 바꿈 문자와 함께 스트림에 씁니다. |
| [WriteLine](./writeline/)(const String\&, const TArgs\&...) | 지정된 형식에 따라 포맷된 지정된 값을 줄 바꿈 문자와 함께 스트림에 씁니다. |
| virtual [~TextWriter](./~textwriter/)() | 소멸자. |
## Typedefs

| 타입 정의 | 설명 |
| --- | --- |
| [Ptr](./ptr/) | 이 클래스에 대한 shared pointer 별칭입니다. |
## 또 보기

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::IO](../)
* Library [Aspose.Page for C++](../../)
