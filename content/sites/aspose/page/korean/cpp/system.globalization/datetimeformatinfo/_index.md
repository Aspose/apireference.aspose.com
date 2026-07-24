---
title: "System::Globalization::DateTimeFormatInfo 클래스"
linktitle: "DateTimeFormatInfo"
second_title: "C++용 Aspose.Page"
description: "System::Globalization::DateTimeFormatInfo 클래스. 날짜 및 시간 서식 매개변수 집합. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 이 타입의 인스턴스를 만들거나 operator new를 사용하면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고 해당 포인터를 C++에서 함수 인수로 전달하십시오."
type: docs
weight: 600
url: /ko/cpp/system.globalization/datetimeformatinfo/
---
## DateTimeFormatInfo class


날짜 및 시간 서식 매개변수 집합. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 이 타입의 인스턴스를 만들거나 operator new를 사용하면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고 해당 포인터를 함수 인수로 전달하십시오.

```cpp
class DateTimeFormatInfo : public virtual System::Object,
                           public System::IFormatProvider,
                           public System::ICloneable
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [Clone](./clone/)() override | 포맷 정보를 복제합니다. |
| [DateTimeFormatInfo](./datetimeformatinfo/)() | 기본 생성자, 불변 형식 정보를 구성합니다. |
| [get_AbbreviatedDayNames](./get_abbreviateddaynames/)() const | 축약된 요일 이름을 가져옵니다. |
| [get_AbbreviatedMonthGenitiveNames](./get_abbreviatedmonthgenitivenames/)() const | 소유격 형태의 축약된 월 이름을 가져옵니다. |
| [get_AbbreviatedMonthNames](./get_abbreviatedmonthnames/)() const | 축약된 월 이름을 가져옵니다. |
| [get_AMDesignator](./get_amdesignator/)() const | AM 표시자를 가져옵니다. |
| [get_Calendar](./get_calendar/)() const | 포맷터와 연결된 달력을 가져옵니다. |
| [get_CalendarWeekRule](./get_calendarweekrule/)() const | 포맷터와 연결된 달력 주 규칙을 가져옵니다. |
| static [get_CurrentInfo](./get_currentinfo/)() | 현재 스레드의 날짜 및 시간 포맷터를 가져옵니다. |
| [get_DateSeparator](./get_dateseparator/)() const | 날짜 구분자를 가져옵니다. |
| [get_DayNames](./get_daynames/)() const | 날 이름을 가져옵니다. |
| [get_FirstDayOfWeek](./get_firstdayofweek/)() const | 주 첫 번째 요일을 가져옵니다. |
| [get_FullDateTimePattern](./get_fulldatetimepattern/)() const | 전체 날짜 및 시간 패턴을 가져옵니다. |
| static [get_InvariantInfo](./get_invariantinfo/)() | 불변 날짜 및 시간 포맷터를 가져옵니다. |
| [get_IsReadOnly](./get_isreadonly/)() const | 포맷터가 읽기 전용인지 확인합니다. |
| [get_LongDatePattern](./get_longdatepattern/)() const | 긴 날짜 패턴을 가져옵니다. |
| [get_LongTimePattern](./get_longtimepattern/)() const | 긴 시간 패턴을 가져옵니다. |
| [get_MonthDayPattern](./get_monthdaypattern/)() const | 월 일 패턴을 가져옵니다. |
| [get_MonthGenitiveNames](./get_monthgenitivenames/)() const | 소유격 형태의 월 이름을 가져옵니다. |
| [get_MonthNames](./get_monthnames/)() const | 월 이름을 가져옵니다. |
| [get_NativeCalendarName](./get_nativecalendarname/)() const | 가능한 경우 기본 캘린더 이름을 가져옵니다. |
| [get_PMDesignator](./get_pmdesignator/)() const | 오후 표시자를 가져옵니다. |
| [get_RFC1123Pattern](./get_rfc1123pattern/)() const | RFC1123 패턴을 가져옵니다. |
| [get_ShortDatePattern](./get_shortdatepattern/)() const | 짧은 날짜 패턴을 가져옵니다. |
| [get_ShortestDayNames](./get_shortestdaynames/)() const | 가능한 가장 짧은 요일 이름을 가져옵니다. |
| [get_ShortTimePattern](./get_shorttimepattern/)() const | 짧은 시간 패턴을 가져옵니다. |
| [get_SortableDateTimePattern](./get_sortabledatetimepattern/)() const | 정렬 가능한 날짜 및 시간 패턴을 가져옵니다. |
| [get_TimeSeparator](./get_timeseparator/)() const | 시간 구분자를 가져옵니다. |
| [get_UniversalSortableDateTimePattern](./get_universalsortabledatetimepattern/)() const | 보편적인 정렬 가능한 날짜 및 시간 패턴을 가져옵니다. |
| [get_YearMonthPattern](./get_yearmonthpattern/)() const | 연도 및 월 패턴을 가져옵니다. |
| [GetAbbreviatedDayName](./getabbreviateddayname/)(DayOfWeek) const | 축약된 요일 이름을 가져옵니다. |
| [GetAbbreviatedEraName](./getabbreviatederaname/)(int) const | 축약된 연호 이름을 가져옵니다. |
| [GetAbbreviatedMonthName](./getabbreviatedmonthname/)(int) const | 축약된 월 이름을 가져옵니다. |
| [GetAllDateTimePatterns](./getalldatetimepatterns/)() const | 날짜 및 시간 값을 형식화할 수 있는 모든 패턴을 가져옵니다. |
| [GetAllDateTimePatterns](./getalldatetimepatterns/)(char16_t) const | 지정된 형식 문자열을 사용하여 날짜 및 시간 값을 형식화할 수 있는 모든 패턴을 가져옵니다. |
| [GetDayName](./getdayname/)(DayOfWeek) const | 요일 이름을 가져옵니다. |
| [GetEra](./getera/)(const String\&) const | 이름으로 시대를 가져옵니다. |
| [GetEraName](./geteraname/)(int) const | 시대 이름을 가져옵니다. |
| [GetFormat](./getformat/)(const TypeInfo\&) override | 특정 유형의 포맷터를 가져옵니다. |
| static [GetInstance](./getinstance/)(const IFormatProviderPtr\&) | 포맷 제공자와 연결된 포맷터를 가져옵니다. |
| [GetLeapYearMonthName](./getleapyearmonthname/)(int) const | 윤년 월 이름을 가져옵니다. |
| [GetMonthGenitiveName](./getmonthgenitivename/)(int) const | 소유격 월 이름을 가져옵니다. |
| [GetMonthName](./getmonthname/)(int) const | 월 이름을 가져옵니다. |
| [GetShortestDayName](./getshortestdayname/)(DayOfWeek) const | 지정된 요일에 대한 가장 짧은 이름을 가져옵니다. |
| [operator=](./operator=/)(const DateTimeFormatInfo\&) |  |
| static [ReadOnly](./readonly/)(const DateTimeFormatInfoPtr\&) | 포맷터의 읽기 전용 버전을 가져옵니다. |
| [set_AbbreviatedDayNames](./set_abbreviateddaynames/)(const ArrayPtr\<String\>\&) | 축약된 요일 이름을 설정합니다. |
| [set_AbbreviatedMonthGenitiveNames](./set_abbreviatedmonthgenitivenames/)(const ArrayPtr\<String\>\&) | 소유격 형태의 축약된 월 이름을 설정합니다. |
| [set_AbbreviatedMonthNames](./set_abbreviatedmonthnames/)(const ArrayPtr\<String\>\&) | 축약된 월 이름을 설정합니다. |
| [set_AMDesignator](./set_amdesignator/)(const String\&) | 오전 표시자를 설정합니다. |
| [set_Calendar](./set_calendar/)(const SharedPtr\<Calendar\>\&) | 포맷터와 연결된 달력을 설정합니다. |
| [set_CalendarWeekRule](./set_calendarweekrule/)(CalendarWeekRule) | 포맷터와 연결된 달력 주 규칙을 설정합니다. |
| [set_DateSeparator](./set_dateseparator/)(const String\&) | 날짜 구분자를 설정합니다. |
| [set_DayNames](./set_daynames/)(const ArrayPtr\<String\>\&) | 요일 이름을 설정합니다. |
| [set_FirstDayOfWeek](./set_firstdayofweek/)(DayOfWeek) | 주 첫 번째 요일을 설정합니다. |
| [set_FullDateTimePattern](./set_fulldatetimepattern/)(const String\&) | 전체 날짜 및 시간 형식을 설정합니다. |
| [set_LongDatePattern](./set_longdatepattern/)(const String\&) | 긴 날짜 형식을 설정합니다. |
| [set_LongTimePattern](./set_longtimepattern/)(const String\&) | 긴 시간 형식을 설정합니다. |
| [set_MonthDayPattern](./set_monthdaypattern/)(const String\&) | 월 일 형식을 설정합니다. |
| [set_MonthGenitiveNames](./set_monthgenitivenames/)(const ArrayPtr\<String\>\&) | 소유격 형태의 월 이름을 설정합니다. |
| [set_MonthNames](./set_monthnames/)(const ArrayPtr\<String\>\&) | 월 이름을 설정합니다. |
| [set_PMDesignator](./set_pmdesignator/)(const String\&) | 오후 표시자를 설정합니다. |
| [set_ShortDatePattern](./set_shortdatepattern/)(const String\&) | 짧은 날짜 형식을 설정합니다. |
| [set_ShortestDayNames](./set_shortestdaynames/)(const ArrayPtr\<String\>\&) | 가능한 가장 짧은 요일 이름을 설정합니다. |
| [set_ShortTimePattern](./set_shorttimepattern/)(const String\&) | 짧은 시간 형식을 설정합니다. |
| [set_TimeSeparator](./set_timeseparator/)(const String\&) | 시간 구분자를 설정합니다. |
| [set_YearMonthPattern](./set_yearmonthpattern/)(const String\&) | 연도 및 월 형식을 설정합니다. |
| [SetAllDateTimePatterns](./setalldatetimepatterns/)(const ArrayPtr\<String\>\&, char16_t) | 지정된 형식에 대한 패턴을 설정합니다. |
## 또 보기

* Class [Object](../../system/object/)
* Class [IFormatProvider](../../system/iformatprovider/)
* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Globalization](../)
* Library [Aspose.Page for C++](../../)
