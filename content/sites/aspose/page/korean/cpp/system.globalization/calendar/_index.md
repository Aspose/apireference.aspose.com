---
title: "System::Globalization::Calendar 클래스"
linktitle: "캘린더"
second_title: "C++용 Aspose.Page"
description: "System::Globalization::Calendar 클래스. 날짜가 처리, 계산, 형식 지정되는 방식을 정의하는 캘린더입니다. 설정자 연산은 읽기 전용이 아닌 객체에서만 사용할 수 있습니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들지 마십시오. 이렇게 하면 런타임 오류 및/또는 어설션 오류가 발생할 수 있습니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, C++에서 함수 인자로 전달할 때 해당 포인터를 사용하십시오."
type: docs
weight: 100
url: /ko/cpp/system.globalization/calendar/
---
## Calendar class


[Calendar](./) which defines how the dates are handled, calculated, formatted, etc. Setter operations are only enabled on non-read-only objects. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class Calendar : public System::ICloneable
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| virtual [AddDays](./adddays/)(DateTime, int) const | 시간 지점에 일수를 추가합니다. |
| virtual [AddHours](./addhours/)(DateTime, int) const | 시간 지점에 시간을 추가합니다. |
| virtual [AddMilliseconds](./addmilliseconds/)(DateTime, double) const | 시간 지점에 밀리초를 추가합니다. |
| virtual [AddMinutes](./addminutes/)(DateTime, int) const | 시간 지점에 분을 추가합니다. |
| virtual [AddMonths](./addmonths/)(DateTime, int) const | 시간 지점에 월을 추가합니다. |
| virtual [AddSeconds](./addseconds/)(DateTime, int) const | 시간 지점에 초를 추가합니다. |
| virtual [AddWeeks](./addweeks/)(DateTime, int) const | 시간 지점에 주를 추가합니다. |
| virtual [AddYears](./addyears/)(DateTime, int) const | 시간 지점에 연도를 추가합니다. |
| [Calendar](./calendar/)(const Calendar\&) | RTTI 정보. |
| virtual [get_AlgorithmType](./get_algorithmtype/)() const | 알고리즘 유형을 가져옵니다. |
| [get_CurrentEra](./get_currentera/)() const | 현재 연대의 인덱스를 가져옵니다. |
| [get_CurrentEraValue](./get_currenteravalue/)() const | 현재 연대의 값을 가져옵니다. |
| virtual [get_Eras](./get_eras/)() const | 달력에 존재하는 연호 목록을 가져옵니다. |
| virtual [get_ID](./get_id/)() const | 캘린더 식별자를 가져옵니다. |
| [get_IsReadOnly](./get_isreadonly/)() const | 캘린더가 읽기 전용인지 확인합니다. |
| virtual [get_MaxSupportedDateTime](./get_maxsupporteddatetime/)() const | 달력이 지원하는 최대 시점. |
| virtual [get_MinSupportedDateTime](./get_minsupporteddatetime/)() const | 달력이 지원하는 최소 시점. |
| virtual [get_TwoDigitYearMax](./get_twodigityearmax/)() const | 2자리 숫자로 표현할 수 있는 마지막 연도를 가져옵니다. |
| virtual [GetDayOfMonth](./getdayofmonth/)(DateTime) const | 지정된 시점에 대한 월 일자를 가져옵니다. |
| virtual [GetDayOfWeek](./getdayofweek/)(DateTime) const | 지정된 시점에 대한 요일을 가져옵니다. |
| virtual [GetDayOfYear](./getdayofyear/)(DateTime) const | 지정된 시점에 대한 연중 일자를 가져옵니다. |
| virtual [GetDaysInMonth](./getdaysinmonth/)(int, int) const | 특정 월의 일 수를 가져옵니다. |
| virtual [GetDaysInMonth](./getdaysinmonth/)(int, int, int) const | 특정 월의 일 수를 가져옵니다. |
| virtual [GetDaysInYear](./getdaysinyear/)(int) const | 특정 연도의 일 수를 가져옵니다. |
| virtual [GetDaysInYear](./getdaysinyear/)(int, int) const | 특정 연도의 일 수를 가져옵니다. |
| virtual [GetEra](./getera/)(DateTime) const | 지정된 시점에 대한 연호를 가져옵니다. |
| virtual [GetHour](./gethour/)(DateTime) const | 지정된 시간 지점의 시간을 가져옵니다. |
| virtual [GetLeapMonth](./getleapmonth/)(int) const | 지정된 연도에 대한 윤달을 가져옵니다. |
| virtual [GetLeapMonth](./getleapmonth/)(int, int) const | 지정된 연도에 대한 윤달을 가져옵니다. |
| virtual [GetMilliseconds](./getmilliseconds/)(DateTime) const | 지정된 시간 지점의 밀리초를 가져옵니다. |
| virtual [GetMinute](./getminute/)(DateTime) const | 지정된 시간 지점의 분을 가져옵니다. |
| virtual [GetMonth](./getmonth/)(DateTime) const | 지정된 시점에 대한 월을 가져옵니다. |
| virtual [GetMonthsInYear](./getmonthsinyear/)(int) const | 지정된 연도에 대한 월 수를 가져옵니다. |
| virtual [GetMonthsInYear](./getmonthsinyear/)(int, int) const | 지정된 연도에 대한 월 수를 가져옵니다. |
| virtual [GetSecond](./getsecond/)(DateTime) const | 지정된 시간 지점의 초를 가져옵니다. |
| virtual [GetWeekOfYear](./getweekofyear/)(DateTime, CalendarWeekRule, DayOfWeek) const | 지정된 시간 지점의 연도 주를 가져옵니다. |
| virtual [GetYear](./getyear/)(DateTime) const | 지정된 시점에 대한 연도를 가져옵니다. |
| virtual [IsLeapDay](./isleapday/)(int, int, int) const | 날이 윤년인지 확인합니다. |
| virtual [IsLeapDay](./isleapday/)(int, int, int, int) const | 날이 윤년인지 확인합니다. |
| virtual [IsLeapMonth](./isleapmonth/)(int, int) const | 월이 윤월인지 확인합니다. |
| virtual [IsLeapMonth](./isleapmonth/)(int, int, int) const | 월이 윤월인지 확인합니다. |
| virtual [IsLeapYear](./isleapyear/)(int) const | 년이 윤년인지 확인합니다. |
| virtual [IsLeapYear](./isleapyear/)(int, int) const | 년이 윤년인지 확인합니다. |
| [IsValidDay](./isvalidday/)(int, int, int, int) const | 연도, 월, 일 및 연대 값을 확인합니다. |
| [operator=](./operator=/)(const Calendar\&) |  |
| static [ReadOnly](./readonly/)(const CalendarPtr\&) | 캘린더의 읽기 전용 버전을 가져옵니다. |
| virtual [set_TwoDigitYearMax](./set_twodigityearmax/)(int) | 2자리 숫자로 표현할 수 있는 마지막 연도를 설정합니다. |
| virtual [ToDateTime](./todatetime/)(int, int, int, int, int, int, int) const | 구성 요소로부터 [DateTime](../../system/datetime/) 객체를 생성합니다. |
| virtual [ToDateTime](./todatetime/)(int, int, int, int, int, int, int, int) const | 구성 요소로부터 [DateTime](../../system/datetime/) 객체를 생성합니다. |
| virtual [ToFourDigitYear](./tofourdigityear/)(int) const | TwoDigitYearMax 속성을 사용하여 연도를 4자리 연도로 변환합니다. |
## 또 보기

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Globalization](../)
* Library [Aspose.Page for C++](../../)
