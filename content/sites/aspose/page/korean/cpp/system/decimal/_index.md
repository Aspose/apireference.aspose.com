---
title: "System::Decimal 클래스"
linktitle: "Decimal"
second_title: "C++용 Aspose.Page"
description: "System::Decimal 클래스. 십진수를 나타냅니다. 이 타입은 스택에 할당하고 값이나 참조로 함수에 전달해야 합니다. C++에서 이 타입의 객체를 관리하기 위해 System::SmartPtr 클래스를 절대 사용하지 마세요."
type: docs
weight: 1900
url: /ko/cpp/system/decimal/
---
## Decimal class


십진수를 나타냅니다. 이 타입은 스택에 할당하고 값이나 참조로 함수에 전달해야 합니다. 이 타입의 객체를 관리하기 위해 [System::SmartPtr](../smartptr/) 클래스를 절대 사용하지 마세요.

```cpp
class Decimal
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| static [Add](./add/)(const Decimal\&, const Decimal\&) | 두 지정된 [Decimal](./) 값을 더합니다. |
| static [Ceiling](./ceiling/)(const Decimal\&) | 지정된 값보다 크거나 같은 가장 작은 정수 값을 반환합니다. |
| static [Compare](./compare/)(const Decimal\&, const Decimal\&) | 첫 번째 [Decimal](./) 객체가 나타내는 값이 두 번째 [Decimal](./) 객체가 나타내는 값보다 작거나, 같은지, 혹은 큰지를 판단합니다. |
| [CompareTo](./compareto/)(const Decimal\&) const | 현재 객체가 나타내는 값이 지정된 객체가 나타내는 값보다 작거나, 같은지, 혹은 큰지를 판단합니다. |
| [Decimal](./decimal/)() | 0을 나타내는 인스턴스를 생성합니다. |
| [Decimal](./decimal/)(std::int8_t) | 지정된 값을 나타내는 인스턴스를 생성합니다. |
| [Decimal](./decimal/)(std::int16_t) | 지정된 값을 나타내는 인스턴스를 생성합니다. |
| [Decimal](./decimal/)(std::int32_t) | 지정된 값을 나타내는 인스턴스를 생성합니다. |
| [Decimal](./decimal/)(std::int64_t) | 지정된 값을 나타내는 인스턴스를 생성합니다. |
| [Decimal](./decimal/)(std::uint8_t) | 지정된 값을 나타내는 인스턴스를 생성합니다. |
| [Decimal](./decimal/)(std::uint16_t) | 지정된 값을 나타내는 인스턴스를 생성합니다. |
| [Decimal](./decimal/)(std::uint32_t) | 지정된 값을 나타내는 인스턴스를 생성합니다. |
| [Decimal](./decimal/)(std::uint64_t) | 지정된 값을 나타내는 인스턴스를 생성합니다. |
| [Decimal](./decimal/)(float) | 지정된 값을 나타내는 인스턴스를 생성합니다. |
| [Decimal](./decimal/)(double) | 지정된 값을 나타내는 인스턴스를 생성합니다. |
| explicit [Decimal](./decimal/)(const std::string\&) | 문자열 표현이 std::string 클래스의 인스턴스로 지정된 값을 나타내는 인스턴스를 생성합니다. |
| [Decimal](./decimal/)(int32_t, int32_t, int32_t, bool, uint8_t) | 지정된 구성 요소들로부터 [Decimal](./) 객체를 생성합니다. |
| [Decimal](./decimal/)(const Decimal\&) | 지정된 [Decimal](./) 객체와 동일한 숫자를 나타내는 [Decimal](./) 클래스의 인스턴스를 생성합니다. |
| [Decimal](./decimal/)(const ArrayPtr\<int32_t\>\&) | 이진 표현을 포함하는 정수 배열에서 [Decimal](./) 클래스의 인스턴스를 생성합니다. |
| [Decimal](./decimal/)(std::nullptr_t) | 항상 ArgumentNullException을 발생시킵니다. |
| [Decimal](./decimal/)(const number_type\&) | 지정된 값을 나타내는 [Decimal](./) 클래스의 인스턴스를 생성합니다. |
| static [Divide](./divide/)(const Decimal\&, const Decimal\&) | 두 지정된 [Decimal](./) 값을 나눕니다. |
| [Equals](./equals/)(const Decimal\&) const | 현재 객체와 지정된 객체가 나타내는 값이 같은지 확인합니다. |
| [Equals](./equals/)(const SharedPtr\<Object\>\&) const | 현재 객체와 지정된 객체가 나타내는 값이 같은지 확인합니다. |
| static [Equals](./equals/)(const Decimal\&, const Decimal\&) | 지정된 객체들이 나타내는 값이 같은지 확인합니다. |
| static [Floor](./floor/)(const Decimal\&) | 지정된 값보다 작거나 같은 가장 큰 정수 값을 반환합니다. |
| static [FromOACurrency](./fromoacurrency/)(int64_t) | [Convert](../convert/) 지정된 OLE 통화 값을 동등한 [Decimal](./) 값으로 변환합니다. 구현되지 않음. |
| static [GetBits](./getbits/)(const Decimal\&) | 지정된 [Decimal](./) 객체를 해당 값의 이진 표현으로 변환합니다. |
| static [GetBytes](./getbytes/)(const Decimal\&, const System::ArrayPtr\<uint8_t\>\&) | [Convert](../convert/) 지정된 [Decimal](./) 값을 바이트 배열로 변환합니다. |
| [GetHashCode](./gethashcode/)() const | 현재 객체에 대한 해시 코드를 반환합니다. |
| [GetTypeCode](./gettypecode/)() const | 객체 유형 코드를 가져옵니다. |
| static [Multiply](./multiply/)(const Decimal\&, const Decimal\&) | 두 지정된 [Decimal](./) 값을 곱합니다. |
| static [Negate](./negate/)(const Decimal\&) | 지정된 객체가 나타내는 값을 부정한 결과값을 나타내는 새로운 [Decimal](./) 클래스 인스턴스를 반환합니다. |
| explicit [operator bool](./operatorbool/)() const | 현재 객체가 나타내는 값을 부울 값으로 변환합니다. |
| explicit [operator double](./operatordouble/)() const | 현재 객체가 나타내는 값을 배정밀도 부동소수점 값으로 변환합니다. |
| explicit [operator float](./operatorfloat/)() const | 현재 객체가 나타내는 값을 단정밀도 부동소수점 값으로 변환합니다. |
| [operator!=](./operator!=/)(const Decimal\&) const | 현재 객체와 지정된 객체가 나타내는 값이 같지 않은지 확인합니다. |
| [operator!=](./operator!=/)(std::nullptr_t) const | 현재 객체가 나타내는 값이 0과 다른지 확인합니다. |
| [operator%](./operator%/)(const Decimal\&) const | 현재 객체와 지정된 객체가 나타내는 값에 대한 모듈로 연산 결과값을 나타내는 새로운 [Decimal](./) 클래스 인스턴스를 반환합니다. |
| [operator%=](./operator%=/)(const Decimal\&) | 현재 객체에 현재와 지정된 객체가 나타내는 값에 대한 모듈로 연산 결과값을 새로운 값으로 할당합니다. |
| [operator*](./operator_/)(const Decimal\&) const | 현재와 지정된 객체가 나타내는 값의 곱셈 결과값을 나타내는 새로운 [Decimal](./) 클래스 인스턴스를 반환합니다. |
| [operator*=](./operator_=/)(const Decimal\&) | 현재 객체에 현재와 지정된 객체가 나타내는 값의 곱셈 결과값을 새로운 값으로 할당합니다. |
| [operator+](./operator+/)(const Decimal\&) const | 현재와 지정된 객체가 나타내는 값의 합을 나타내는 새로운 [Decimal](./) 클래스 인스턴스를 반환합니다. |
| [operator++](./operator++/)() | 현재 객체가 나타내는 값을 증가시킵니다. |
| [operator+=](./operator+=/)(const Decimal\&) | 현재 객체에 현재와 지정된 객체가 나타내는 값의 합을 새로운 값으로 할당합니다. |
| [operator-](./operator-/)(const Decimal\&) const | 현재 객체가 나타내는 값에서 지정된 객체가 나타내는 값을 빼서 얻은 결과값을 나타내는 새로운 [Decimal](./) 클래스 인스턴스를 반환합니다. |
| [operator-](./operator-/)() const | 현재 객체가 나타내는 값의 부정으로 얻어진 값을 나타내는 새로운 [Decimal](./) 클래스 인스턴스를 반환합니다. |
| [operator--](./operator--/)() | 현재 객체가 나타내는 값을 감소시킵니다. |
| [operator-=](./operator-=/)(const Decimal\&) | 지정된 객체가 나타내는 값을 현재 객체가 나타내는 값에서 빼서 얻은 결과를 새로운 값으로 현재 객체에 할당합니다. |
| [operator/](./operator//)(const Decimal\&) const | 현재 객체가 나타내는 값을 지정된 객체가 나타내는 값으로 나눈 결과 값을 나타내는 새로운 [Decimal](./) 클래스 인스턴스를 반환합니다. |
| [operator/=](./operator/=/)(const Decimal\&) | 현재 객체가 나타내는 값을 지정된 객체가 나타내는 값으로 나눈 결과를 새로운 값으로 현재 객체에 할당합니다. |
| [operator<](./operator_/)(const Decimal\&) const | 현재 객체가 나타내는 값이 지정된 객체가 나타내는 값보다 작은지 여부를 판단합니다. |
| [operator<=](./operator_=/)(const Decimal\&) const | 현재 객체가 나타내는 값이 지정된 객체가 나타내는 값보다 작거나 같은지 여부를 판단합니다. |
| [operator=](./operator=/)(const Decimal\&) | 지정된 객체가 나타내는 값을 현재 객체에 할당합니다. |
| [operator==](./operator==/)(const Decimal\&) const | 현재 객체와 지정된 객체가 나타내는 값이 같은지 확인합니다. |
| [operator==](./operator==/)(std::nullptr_t) const | 현재 객체가 나타내는 값이 0인지 여부를 판단합니다. |
| [operator>](./operator_/)(const Decimal\&) const | 현재 객체가 나타내는 값이 지정된 객체가 나타내는 값보다 큰지 여부를 판단합니다. |
| [operator>=](./operator_=/)(const Decimal\&) const | 현재 객체가 나타내는 값이 지정된 객체가 나타내는 값보다 크거나 같은지 여부를 판단합니다. |
| static [Parse](./parse/)(const String\&) | 10진수 숫자의 문자열 표현을 동등한 [Decimal](./) 클래스 인스턴스로 변환합니다. |
| static [Parse](./parse/)(const String\&, Globalization::NumberStyles) | 지정된 스타일을 사용하여 10진수 숫자의 문자열 표현을 동등한 [Decimal](./) 클래스 인스턴스로 변환합니다. |
| static [Parse](./parse/)(const String\&, const SharedPtr\<IFormatProvider\>\&) | 지정된 형식 제공자를 사용하여 10진수 숫자의 문자열 표현을 동등한 [Decimal](./) 클래스 인스턴스로 변환합니다. |
| static [Parse](./parse/)(const String\&, Globalization::NumberStyles, const SharedPtr\<IFormatProvider\>\&) | 지정된 스타일과 형식 제공자를 사용하여 10진수 숫자의 문자열 표현을 동등한 [Decimal](./) 클래스 인스턴스로 변환합니다. |
| static [Remainder](./remainder/)(const Decimal\&, const Decimal\&) | 두 [Decimal](./) 값을 나눈 후의 나머지를 계산합니다. |
| static [Round](./round/)(const Decimal\&, MidpointRounding) | 지정된 값을 가장 가까운 정수로 반올림합니다. 지정된 값이 두 가장 가까운 수와 동일하게 가까운 경우 함수의 동작을 지정하는 매개변수가 있습니다. |
| static [Round](./round/)(const Decimal\&, int, MidpointRounding) | 지정된 소수 자릿수로 지정된 값을 가장 가까운 값으로 반올림합니다. 지정된 값이 두 가장 가까운 수와 동일하게 가까운 경우 함수의 동작을 지정하는 매개변수가 있습니다. |
| static [Subtract](./subtract/)(const Decimal\&, const Decimal\&) | 지정된 하나의 [Decimal](./) 값을 다른 값에서 빼습니다. |
| static [ToByte](./tobyte/)(Decimal) | [Decimal](./) 값을 부호 없는 8비트 정수 값으로 변환합니다. |
| static [ToDouble](./todouble/)(Decimal) | [Decimal](./) 값을 배정밀도 부동소수점 숫자로 변환합니다. |
| static [ToInt16](./toint16/)(Decimal) | [Decimal](./) 값을 부호 있는 16비트 정수 값으로 변환합니다. |
| static [ToInt32](./toint32/)(Decimal) | [Decimal](./) 값을 부호 있는 32비트 정수 값으로 변환합니다. |
| static [ToInt64](./toint64/)(Decimal) | [Decimal](./) 값을 부호 있는 64비트 정수 값으로 변환합니다. |
| static [ToOACurrency](./tooacurrency/)(const Decimal\&) | [Convert](../convert/) 지정된 [Decimal](./) 값을 동등한 OLE 통화 값으로 변환합니다. 구현되지 않음. |
| static [ToSByte](./tosbyte/)(Decimal) | 지정된 [Decimal](./) 값을 부호가 있는 8비트 정수 값으로 변환합니다. |
| static [ToSingle](./tosingle/)(Decimal) | 지정된 [Decimal](./) 값을 단정밀도 부동소수점 숫자로 변환합니다. |
| [ToStdString](./tostdstring/)() const | 객체가 나타내는 값의 문자열 표현을 포함하는 std::string 인스턴스를 반환합니다. |
| [ToString](./tostring/)() const | 객체가 나타내는 값의 문자열 표현을 반환합니다. |
| [ToString](./tostring/)(const SharedPtr\<IFormatProvider\>\&) const | 현재 객체를 문화권별 형식 정보를 사용하여 문자열로 변환합니다. |
| [ToString](./tostring/)(const SharedPtr\<Globalization::CultureInfo\>\&) const |  |
| [ToString](./tostring/)(const SharedPtr\<Globalization::NumberFormatInfo\>\&) const |  |
| [ToString](./tostring/)(const Decimal\&, std::nullptr_t) const |  |
| [ToString](./tostring/)(const String\&, const SharedPtr\<IFormatProvider\>\&) const | 지정된 [IFormatProvider](../iformatprovider/) 객체가 제공하는 지정된 문자열 형식 및 문화권별 형식 정보를 사용하여 현재 객체를 문자열 표현으로 변환합니다. |
| [ToString](./tostring/)(const String\&, const SharedPtr\<Globalization::CultureInfo\>\&) const |  |
| [ToString](./tostring/)(const String\&, const SharedPtr\<Globalization::NumberFormatInfo\>\&) const |  |
| [ToString](./tostring/)(const String\&, std::nullptr_t) const |  |
| [ToStringInternal](./tostringinternal/)() const | 객체가 나타내는 값의 문자열 표현을 반환합니다. 내부용입니다. |
| static [ToUInt16](./touint16/)(Decimal) | 지정된 [Decimal](./) 값을 부호 없는 16비트 정수 값으로 변환합니다. |
| static [ToUInt32](./touint32/)(Decimal) | 지정된 [Decimal](./) 값을 부호 없는 32비트 정수 값으로 변환합니다. |
| static [ToUInt64](./touint64/)(Decimal) | 지정된 [Decimal](./) 값을 부호 없는 64비트 정수 값으로 변환합니다. |
| static [Truncate](./truncate/)(const Decimal\&) | 지정된 [Decimal](./) 객체가 나타내는 값과 동일한 정수 부분을 갖고, 모든 소수점 이하 자릿수를 버린 값을 나타내는 [Decimal](./) 객체를 반환합니다. |
| static [TryParse](./tryparse/)(const String\&, Decimal\&) | 숫자의 문자열 표현을 포함하는 지정된 문자열을 동등한 [Decimal](./) 값으로 변환합니다. |
| static [TryParse](./tryparse/)(const String\&, Globalization::NumberStyles, const SharedPtr\<IFormatProvider\>\&, Decimal\&) | 제공된 형식 정보와 숫자 스타일을 사용하여 숫자의 문자열 표현을 포함하는 지정된 문자열을 동등한 [Decimal](./) 값으로 변환합니다. |
| static [Type](./type/)() | [Decimal](./) 클래스의 형식 정보를 나타내는 [TypeInfo](../typeinfo/) 객체에 대한 참조를 반환합니다. |
| [~Decimal](./~decimal/)() | 소멸자. |
## 필드

| 필드 | 설명 |
| --- | --- |
| static [MaxValue](./maxvalue/) | [Decimal](./) 클래스가 나타낼 수 있는 가장 큰 숫자를 나타냅니다. |
| static [MinusOne](./minusone/) | -1 숫자를 나타냅니다. |
| static [MinValue](./minvalue/) | [Decimal](./) 클래스가 나타낼 수 있는 가장 작은 숫자를 나타냅니다. |
| static [One](./one/) | 1 숫자를 나타냅니다. |
| static [Zero](./zero/) | 0 숫자를 나타냅니다. |
## Typedefs

| 타입 정의 | 설명 |
| --- | --- |
| [number_type](./number_type/) | Detail::decimal_number_type의 별칭입니다. |
## 비고



```cpp
#include "system/console.h"
#include "system/decimal.h"

int main()
{
  using namespace System;

  Console::WriteLine(Decimal::MinValue);
  Console::WriteLine(Decimal::MaxValue);

  auto dividend = Decimal::One;
  auto divisor = 6;
  Console::WriteLine(dividend/divisor);

  return 0;
}
/*
This code example produces the following output:
-79228162514264337593543950335
79228162514264337593543950335
0,1666666666666666666666666667
*/
```

## 또 보기

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
