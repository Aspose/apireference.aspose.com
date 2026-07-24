---
title: "System::Globalization::TaiwanCalendar 클래스"
linktitle: "TaiwanCalendar"
second_title: "C++용 Aspose.Page"
description: "System::Globalization::TaiwanCalendar 클래스. 대만 달력. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들면 런타임 오류 또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, 해당 포인터를 사용하여 C++에서 함수 인수로 전달하십시오."
type: docs
weight: 2500
url: /ko/cpp/system.globalization/taiwancalendar/
---
## TaiwanCalendar class


대만 달력. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들면 런타임 오류 또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 해당 포인터를 사용하여 함수 인수로 전달하십시오.

```cpp
class TaiwanCalendar : public System::Globalization::Calendar
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [Clone](./clone/)() override | RTTI 정보. |
| [get_AlgorithmType](./get_algorithmtype/)() const override | 알고리즘 유형을 가져옵니다. |
| [get_Eras](./get_eras/)() const override | 달력에 존재하는 연호 목록을 가져옵니다. |
| [get_MaxSupportedDateTime](./get_maxsupporteddatetime/)() const override | 달력이 지원하는 최대 시점. |
| [get_MinSupportedDateTime](./get_minsupporteddatetime/)() const override | 달력이 지원하는 최소 시점. |
| [GetDayOfMonth](./getdayofmonth/)(DateTime) const override | 지정된 시점에 대한 월 일자를 가져옵니다. |
| [GetDayOfWeek](./getdayofweek/)(DateTime) const override | 지정된 시점에 대한 요일을 가져옵니다. |
| [GetDayOfYear](./getdayofyear/)(DateTime) const override | 지정된 시점에 대한 연중 일자를 가져옵니다. |
| [GetDaysInMonth](./getdaysinmonth/)(int, int, int) const override | 특정 월의 일 수를 가져옵니다. |
| virtual [GetDaysInMonth](./getdaysinmonth/)(int, int) const | 특정 월의 일 수를 가져옵니다. |
| [GetDaysInYear](./getdaysinyear/)(int, int) const override | 특정 연도의 일 수를 가져옵니다. |
| virtual [GetDaysInYear](./getdaysinyear/)(int) const | 특정 연도의 일 수를 가져옵니다. |
| [GetEra](./getera/)(DateTime) const override | 지정된 시점에 대한 연호를 가져옵니다. |
| [GetLeapMonth](./getleapmonth/)(int, int) const override | 지정된 연도에 대한 윤달을 가져옵니다. |
| virtual [GetLeapMonth](./getleapmonth/)(int) const | 지정된 연도에 대한 윤달을 가져옵니다. |
| [GetMonth](./getmonth/)(DateTime) const override | 지정된 시점에 대한 월을 가져옵니다. |
| [GetMonthsInYear](./getmonthsinyear/)(int, int) const override | 지정된 연도에 대한 월 수를 가져옵니다. |
| virtual [GetMonthsInYear](./getmonthsinyear/)(int) const | RTTI 정보. |
| [GetYear](./getyear/)(DateTime) const override | 지정된 시점에 대한 연도를 가져옵니다. |
| [IsLeapDay](./isleapday/)(int, int, int, int) const override | 날이 윤년인지 확인합니다. |
| virtual [IsLeapDay](./isleapday/)(int, int, int) const | 날이 윤년인지 확인합니다. |
| [IsLeapMonth](./isleapmonth/)(int, int, int) const override | 월이 윤월인지 확인합니다. |
| virtual [IsLeapMonth](./isleapmonth/)(int, int) const | 월이 윤월인지 확인합니다. |
| [IsLeapYear](./isleapyear/)(int, int) const override | 년이 윤년인지 확인합니다. |
| virtual [IsLeapYear](./isleapyear/)(int) const | 년이 윤년인지 확인합니다. |
| [TaiwanCalendar](./taiwancalendar/)() | 생성자. |
| [ToDateTime](./todatetime/)(int, int, int, int, int, int, int, int) const override | 구성 요소로부터 [DateTime](../../system/datetime/) 객체를 생성합니다. |
| virtual [ToDateTime](./todatetime/)(int, int, int, int, int, int, int) const | 구성 요소로부터 [DateTime](../../system/datetime/) 객체를 생성합니다. |
## 또 보기

* Class [Calendar](../calendar/)
* Namespace [System::Globalization](../)
* Library [Aspose.Page for C++](../../)
