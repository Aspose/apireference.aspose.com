---
title: "System::Globalization::TaiwanLunisolarCalendar 클래스"
linktitle: "TaiwanLunisolarCalendar"
second_title: "C++용 Aspose.Page"
description: "System::Globalization::TaiwanLunisolarCalendar 클래스. 대만 음양력. 구현되지 않음. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 이 타입의 인스턴스를 만들거나 operator new를 사용하면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고 해당 포인터를 함수 인수로 전달하십시오. C++에서."
type: docs
weight: 2600
url: /ko/cpp/system.globalization/taiwanlunisolarcalendar/
---
## TaiwanLunisolarCalendar class


대만 음양력. 구현되지 않음. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 이 타입의 인스턴스를 만들거나 operator new를 사용하면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고 해당 포인터를 함수 인수로 전달하십시오.

```cpp
class TaiwanLunisolarCalendar : public System::Globalization::EastAsianLunisolarCalendar
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [Clone](./clone/)() override | RTTI 정보. |
| [get_Eras](./get_eras/)() const override | 달력에 존재하는 연호 목록을 가져옵니다. |
| [get_MaxSupportedDateTime](./get_maxsupporteddatetime/)() const override | 달력이 지원하는 최대 시점. |
| [get_MinSupportedDateTime](./get_minsupporteddatetime/)() const override | 달력이 지원하는 최소 시점. |
| [GetDaysInMonth](./getdaysinmonth/)(int, int, int) const override | 특정 월의 일 수를 가져옵니다. |
| virtual [GetDaysInMonth](./getdaysinmonth/)(int, int) const | 특정 월의 일 수를 가져옵니다. |
| [GetEra](./getera/)(DateTime) const override | 지정된 시점에 대한 연호를 가져옵니다. |
| [GetLeapMonth](./getleapmonth/)(int, int) const override | 지정된 연도에 대한 윤달을 가져옵니다. |
| virtual [GetLeapMonth](./getleapmonth/)(int) const | 지정된 연도에 대한 윤달을 가져옵니다. |
| [GetMonthsInYear](./getmonthsinyear/)(int, int) const override | 지정된 연도에 대한 월 수를 가져옵니다. |
| virtual [GetMonthsInYear](./getmonthsinyear/)(int) const | RTTI 정보. |
| [IsLeapDay](./isleapday/)(int, int, int, int) const override | 날이 윤년인지 확인합니다. |
| virtual [IsLeapDay](./isleapday/)(int, int, int) const | 날이 윤년인지 확인합니다. |
| [IsLeapYear](./isleapyear/)(int, int) const override | 년이 윤년인지 확인합니다. |
| virtual [IsLeapYear](./isleapyear/)(int) const | 년이 윤년인지 확인합니다. |
| [TaiwanLunisolarCalendar](./taiwanlunisolarcalendar/)() | 생성자. |
## 또 보기

* Class [EastAsianLunisolarCalendar](../eastasianlunisolarcalendar/)
* Namespace [System::Globalization](../)
* Library [Aspose.Page for C++](../../)
