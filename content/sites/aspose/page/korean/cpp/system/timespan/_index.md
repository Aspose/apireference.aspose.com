---
title: "System::TimeSpan class"
linktitle: "TimeSpan"
second_title: "C++용 Aspose.Page"
description: "System::TimeSpan class. 시간 간격을 나타냅니다. 이 타입은 스택에 할당하고 값이나 참조로 함수에 전달해야 합니다. C++에서 이 타입의 객체를 관리하기 위해 System::SmartPtr 클래스를 절대 사용하지 마세요."
type: docs
weight: 6100
url: /ko/cpp/system/timespan/
---
## TimeSpan class


시간 간격을 나타냅니다. 이 타입은 스택에 할당하고 값이나 참조로 함수에 전달해야 합니다. 이 타입의 객체를 관리하기 위해 [System::SmartPtr](../smartptr/) 클래스를 절대 사용하지 마세요.

```cpp
class TimeSpan
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [Add](./add/)(TimeSpan) const | 현재 객체와 지정된 객체가 나타내는 시간 간격을 합한 새로운 [TimeSpan](./) 클래스 인스턴스를 반환합니다. |
| static [Compare](./compare/)(TimeSpan, TimeSpan) | 두 개의 [TimeSpan](./) 객체를 비교합니다. |
| [CompareTo](./compareto/)(TimeSpan) const | 현재 객체와 지정된 객체를 비교합니다. |
| [CompareTo](./compareto/)(const SharedPtr\<Object\>\&) const | 현재 객체와 지정된 객체를 비교합니다. |
| [Duration](./duration/)() const | 현재 객체의 절대값인 값을 갖는 새로운 [TimeSpan](./) 객체 인스턴스를 반환합니다. |
| [Equals](./equals/)(TimeSpan) const | 현재 객체가 나타내는 시간 간격이 지정된 객체가 나타내는 시간 간격과 같은지 판단합니다. |
| [Equals](./equals/)(const SharedPtr\<Object\>\&) const | 현재 객체가 나타내는 시간 간격이 지정된 객체가 나타내는 시간 간격과 같은지 판단합니다. |
| static [Equals](./equals/)(TimeSpan, TimeSpan) | 지정된 객체들이 동일한 시간 간격을 나타내면 true를 반환하고, 그렇지 않으면 false를 반환합니다. |
| static [FromDays](./fromdays/)(double) | 지정된 간격을 나타내는 새로운 [TimeSpan](./) 객체를 반환합니다. |
| static [FromHours](./fromhours/)(double) | 지정된 간격을 나타내는 새로운 [TimeSpan](./) 객체를 반환합니다. |
| static [FromMilliseconds](./frommilliseconds/)(double) | 지정된 간격을 나타내는 새로운 [TimeSpan](./) 객체를 반환합니다. |
| static [FromMinutes](./fromminutes/)(double) | 지정된 간격을 나타내는 새로운 [TimeSpan](./) 객체를 반환합니다. |
| static [FromSeconds](./fromseconds/)(double) | 지정된 간격을 나타내는 새로운 [TimeSpan](./) 객체를 반환합니다. |
| static [FromTicks](./fromticks/)(int64_t) | 지정된 간격을 나타내는 새로운 [TimeSpan](./) 객체를 반환합니다. |
| [get_Days](./get_days/)() const | 현재 [TimeSpan](./) 객체가 나타내는 시간 간격의 일(day) 구성 요소를 반환합니다. |
| [get_Hours](./get_hours/)() const | 현재 [TimeSpan](./) 객체가 나타내는 시간 간격의 시간(hour) 구성 요소를 반환합니다. |
| [get_Milliseconds](./get_milliseconds/)() const | 현재 [TimeSpan](./) 객체가 나타내는 시간 간격의 밀리초 구성 요소를 반환합니다. |
| [get_Minutes](./get_minutes/)() const | 현재 [TimeSpan](./) 객체가 나타내는 시간 간격의 분(minute) 구성 요소를 반환합니다. |
| [get_Seconds](./get_seconds/)() const | 현재 [TimeSpan](./) 객체가 나타내는 시간 간격의 초(second) 구성 요소를 반환합니다. |
| [get_Ticks](./get_ticks/)() const | 현재 [TimeSpan](./) 객체가 나타내는 시간 간격을 구성하는 100나노초 간격의 개수를 반환합니다. |
| [get_TotalDays](./get_totaldays/)() const | 현재 [TimeSpan](./) 객체의 값을 정수 및 소수 일(day) 단위로 표현하여 반환합니다. |
| [get_TotalHours](./get_totalhours/)() const | 현재 [TimeSpan](./) 객체의 값을 정수 및 소수 시간(hour) 단위로 표현하여 반환합니다. |
| [get_TotalMilliseconds](./get_totalmilliseconds/)() const | 현재 [TimeSpan](./) 객체의 값을 정수 및 소수 밀리초 단위로 표현하여 반환합니다. |
| [get_TotalMinutes](./get_totalminutes/)() const | 현재 [TimeSpan](./) 객체의 값을 정수 및 소수 분(minute) 단위로 표현하여 반환합니다. |
| [get_TotalSeconds](./get_totalseconds/)() const | 현재 [TimeSpan](./) 객체의 값을 정수 및 소수 초(second) 단위로 표현하여 반환합니다. |
| [GetHashCode](./gethashcode/)() const | 현재 객체에 대한 해시 코드를 반환합니다. |
| [IsNull](./isnull/)() const |  |
| [Negate](./negate/)() const | 현재 [TimeSpan](./) 객체가 나타내는 값을 부정한 값을 나타내는 새로운 [TimeSpan](./) 객체 인스턴스를 반환합니다. |
| [operator!=](./operator!=/)(TimeSpan) const | 현재 객체가 나타내는 시간 간격이 지정된 객체가 나타내는 시간 간격과 같지 않은지 판단합니다. |
| [operator!=](./operator!=/)(std::nullptr_t) const |  |
| [operator+](./operator+/)(TimeSpan) const | 현재 객체와 지정된 객체가 나타내는 시간 간격을 합한 새로운 [TimeSpan](./) 클래스 인스턴스를 반환합니다. |
| [operator+](./operator+/)() const | 자신(self)을 반환합니다. |
| [operator+=](./operator+=/)(TimeSpan) | 현재 객체와 지정된 객체가 나타내는 시간 간격의 합을 현재 객체에 할당합니다. |
| [operator-](./operator-/)(TimeSpan) const | 현재 객체가 나타내는 시간 간격에서 지정된 객체가 나타내는 시간 간격을 빼서 얻은 결과 시간 간격을 나타내는 새로운 [TimeSpan](./) 클래스 인스턴스를 반환합니다. |
| [operator-](./operator-/)() const | 현재 [TimeSpan](./) 객체가 나타내는 값을 부정한 값을 나타내는 새로운 [TimeSpan](./) 객체 인스턴스를 반환합니다. |
| [operator-=](./operator-=/)(TimeSpan) | 현재 객체가 나타내는 시간 간격에서 지정된 객체가 나타내는 시간 간격을 빼서 얻은 결과 시간 간격을 현재 객체에 할당합니다. |
| [operator/](./operator//)(double) const |  |
| [operator/](./operator//)(TimeSpan) const |  |
| [operator/=](./operator/=/)(double) |  |
| [operator<](./operator_/)(TimeSpan) const | 현재 객체가 나타내는 시간 간격이 지정된 객체가 나타내는 시간 간격보다 짧은지 판단합니다. |
| [operator<](./operator_/)(std::nullptr_t) const |  |
| [operator<=](./operator_=/)(TimeSpan) const | 현재 객체가 나타내는 시간 간격이 지정된 객체가 나타내는 시간 간격보다 짧거나 같은지 판단합니다. |
| [operator<=](./operator_=/)(std::nullptr_t) const |  |
| [operator=](./operator=/)(const TimeSpan\&) | 지정된 [TimeSpan](./) 객체가 나타내는 시간 간격을 현재 [TimeSpan](./) 객체에 설정합니다. |
| [operator==](./operator==/)(TimeSpan) const | 현재 객체가 나타내는 시간 간격이 지정된 객체가 나타내는 시간 간격과 같은지 판단합니다. |
| [operator==](./operator==/)(std::nullptr_t) const |  |
| [operator>](./operator_/)(TimeSpan) const | 현재 객체가 나타내는 시간 간격이 지정된 객체가 나타내는 시간 간격보다 긴지 판단합니다. |
| [operator>](./operator_/)(std::nullptr_t) const |  |
| [operator>=](./operator_=/)(TimeSpan) const | 현재 객체가 나타내는 시간 간격이 지정된 객체가 나타내는 시간 간격보다 길거나 같은지 판단합니다. |
| [operator>=](./operator_=/)(std::nullptr_t) const |  |
| static [Parse](./parse/)(const String\&) | 문자열을 동등한 [TimeSpan](./) 객체로 변환합니다. |
| static [Parse](./parse/)(const String\&, const SharedPtr\<IFormatProvider\>\&) | 지정된 형식 제공자를 사용하여 문자열을 동등한 [TimeSpan](./) 객체로 변환합니다. |
| static [Parse](./parse/)(const String\&, const SharedPtr\<Globalization::CultureInfo\>\&) |  |
| static [Parse](./parse/)(const String\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&) |  |
| static [Parse](./parse/)(const String\&, std::nullptr_t) |  |
| static [ParseExact](./parseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<IFormatProvider\>\&, Globalization::TimeSpanStyles) | 지정된 형식들, 형식 제공자 및 스타일을 사용하여 문자열을 동등한 [TimeSpan](./) 객체로 변환합니다. |
| static [ParseExact](./parseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<Globalization::CultureInfo\>\&, Globalization::TimeSpanStyles) |  |
| static [ParseExact](./parseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, Globalization::TimeSpanStyles) |  |
| static [ParseExact](./parseexact/)(const String\&, const ArrayPtr\<String\>\&, std::nullptr_t, Globalization::TimeSpanStyles) |  |
| static [ParseExact](./parseexact/)(const String\&, const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::TimeSpanStyles) | 지정된 형식, 형식 제공자 및 스타일을 사용하여 문자열을 동등한 [TimeSpan](./) 객체로 변환합니다. |
| static [ParseExact](./parseexact/)(const String\&, const String\&, const SharedPtr\<Globalization::CultureInfo\>\&, Globalization::TimeSpanStyles) |  |
| static [ParseExact](./parseexact/)(const String\&, const String\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, Globalization::TimeSpanStyles) |  |
| static [ParseExact](./parseexact/)(const String\&, const String\&, std::nullptr_t, Globalization::TimeSpanStyles) |  |
| [Subtract](./subtract/)(TimeSpan) const | 현재 객체가 나타내는 시간 간격에서 지정된 객체가 나타내는 시간 간격을 빼서 얻은 결과 시간 간격을 나타내는 새로운 [TimeSpan](./) 클래스 인스턴스를 반환합니다. |
| [TimeSpan](./timespan/)() | 0 시간 간격을 나타내는 [TimeSpan](./) 객체를 생성합니다. |
| explicit [TimeSpan](./timespan/)(int64_t) | 지정된 시간 간격을 나타내는 [TimeSpan](./) 클래스의 인스턴스를 생성합니다. |
| [TimeSpan](./timespan/)(int, int, int) | 지정된 시간, 분 및 초의 합과 동일한 시간 간격을 나타내는 [TimeSpan](./) 클래스의 인스턴스를 생성합니다. |
| [TimeSpan](./timespan/)(int, int, int, int, int) | 지정된 시간, 분, 초 및 밀리초의 합과 동일한 시간 간격을 나타내는 [TimeSpan](./) 클래스의 인스턴스를 생성합니다. |
| [TimeSpan](./timespan/)(const TimeSpan\&) | 지정된 [TimeSpan](./) 객체가 나타내는 시간 간격과 동일한 시간 간격을 나타내는 [TimeSpan](./) 객체를 생성합니다. |
| [ToString](./tostring/)() const | 현재 객체가 나타내는 시간 간격의 문자열 표현을 반환합니다. |
| [ToString](./tostring/)(const String\&) const | 지정된 형식을 사용하여 현재 객체의 값을 동등한 문자열 표현으로 변환합니다. |
| [ToString](./tostring/)(const String\&, const SharedPtr\<IFormatProvider\>\&) const | 지정된 형식 및 형식 제공자를 사용하여 현재 객체의 값을 동등한 문자열 표현으로 변환합니다. |
| [ToString](./tostring/)(const String\&, const SharedPtr\<Globalization::CultureInfo\>\&) const |  |
| [ToString](./tostring/)(const String\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&) const |  |
| [ToString](./tostring/)(const String\&, std::nullptr_t) const |  |
| static [TryParse](./tryparse/)(const String\&, TimeSpan\&) | 문자열을 동등한 [TimeSpan](./) 객체로 변환하고 변환 결과를 반환합니다. |
| static [TryParse](./tryparse/)(const String\&, const SharedPtr\<IFormatProvider\>\&, TimeSpan\&) | 지정된 형식 제공자를 사용하여 문자열을 동등한 [TimeSpan](./) 객체로 변환하고 변환 결과를 반환합니다. |
| static [TryParse](./tryparse/)(const String\&, const SharedPtr\<Globalization::CultureInfo\>\&, TimeSpan\&) |  |
| static [TryParse](./tryparse/)(const String\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, TimeSpan\&) |  |
| static [TryParse](./tryparse/)(const String\&, std::nullptr_t, TimeSpan\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<IFormatProvider\>\&, TimeSpan\&) | 지정된 형식들 및 형식 제공자를 사용하여 문자열을 동등한 [TimeSpan](./) 객체로 변환하고 변환 결과를 반환합니다. |
| static [TryParseExact](./tryparseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<Globalization::CultureInfo\>\&, TimeSpan\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, TimeSpan\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const ArrayPtr\<String\>\&, std::nullptr_t, TimeSpan\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::TimeSpanStyles, TimeSpan\&) | 지정된 형식, 형식 제공자 및 스타일을 사용하여 문자열을 동등한 [TimeSpan](./) 객체로 변환하고 변환 결과를 반환합니다. |
| static [TryParseExact](./tryparseexact/)(const String\&, const String\&, const SharedPtr\<Globalization::CultureInfo\>\&, Globalization::TimeSpanStyles, TimeSpan\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const String\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, Globalization::TimeSpanStyles, TimeSpan\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const String\&, std::nullptr_t, Globalization::TimeSpanStyles, TimeSpan\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<IFormatProvider\>\&, Globalization::TimeSpanStyles, TimeSpan\&) | 지정된 형식들, 형식 제공자 및 스타일을 사용하여 문자열을 동등한 [TimeSpan](./) 객체로 변환하고 변환 결과를 반환합니다. |
| static [TryParseExact](./tryparseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<Globalization::CultureInfo\>\&, Globalization::TimeSpanStyles, TimeSpan\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, Globalization::TimeSpanStyles, TimeSpan\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const ArrayPtr\<String\>\&, std::nullptr_t, Globalization::TimeSpanStyles, TimeSpan\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const String\&, const SharedPtr\<IFormatProvider\>\&, TimeSpan\&) | 지정된 형식 및 형식 제공자를 사용하여 문자열을 동등한 [TimeSpan](./) 객체로 변환하고 변환 결과를 반환합니다. |
| static [TryParseExact](./tryparseexact/)(const String\&, const String\&, const SharedPtr\<Globalization::CultureInfo\>\&, TimeSpan\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const String\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, TimeSpan\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const String\&, std::nullptr_t, TimeSpan\&) |  |
| static [Type](./type/)() | [TimeSpan](./) 구조를 나타내는 [TypeInfo](../typeinfo/) 객체를 반환합니다. |
## 필드

| 필드 | 설명 |
| --- | --- |
| static [MaxValue](./maxvalue/) | 가능한 가장 긴 간격을 나타내는 [TimeSpan](./) 객체. |
| static [MinValue](./minvalue/) | /// 가능한 가장 짧은 간격을 나타내는 [TimeSpan](./) 객체. |
| static constexpr [TicksPerDay](./ticksperday/) | 하루(24시간) 동안의 100나노초 간격 수. |
| static constexpr [TicksPerHour](./ticksperhour/) | 한 시간 동안의 100나노초 간격 수. |
| static constexpr [TicksPerMillisecond](./tickspermillisecond/) | 한 밀리초 동안의 100나노초 간격 수. |
| static constexpr [TicksPerMinute](./ticksperminute/) | 분당 100나노초 간격의 수. |
| static constexpr [TicksPerSecond](./tickspersecond/) | 초당 100나노초 간격의 수. |
| static [Zero](./zero/) | 영(0) 간격을 나타내는 [TimeSpan](./) 객체. |
## 비고



```cpp
#include "system/datetime.h"
#include "system/timespan.h"
#include <iostream>

int main()
{
  const auto date1 = System::DateTime(2021, 01, 01);
  const auto date2 = System::DateTime(2021, 10, 30);

  const auto interval = date2 - date1;

  std::cout << "Number of ticks: " << interval.get_Ticks() << std::endl;
  std::cout << "Number of milliseconds: " << interval.get_Milliseconds() << std::endl;
  std::cout << "Total number of milliseconds: " << interval.get_TotalMilliseconds() << std::endl;
  std::cout << "Number of minutes: " << interval.get_Minutes() << std::endl;
  std::cout << "Total number of minutes: " << interval.get_TotalMinutes() << std::endl;
  std::cout << "Number of hours: " << interval.get_Hours() << std::endl;
  std::cout << "Total number of hours: " << interval.get_Hours() << std::endl;
  std::cout << "Number of days: " << interval.get_Days() << std::endl;
  std::cout << "Total number of days: " << interval.get_TotalDays() << std::endl;

  return 0;
}
/*
This code example produces the following output:
Number of ticks: 260928000000000
Number of milliseconds: 0
Total number of milliseconds: 2.60928e+10
Number of minutes: 0
Total number of minutes: 434880
Number of hours: 0
Total number of hours: 0
Number of days: 302
Total number of days: 302
*/
```

## 또 보기

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
