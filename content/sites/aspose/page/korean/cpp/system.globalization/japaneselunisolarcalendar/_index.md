---
title: "System::Globalization::JapaneseLunisolarCalendar class"
linktitle: "JapaneseLunisolarCalendar"
second_title: "C++용 Aspose.Page"
description: "System::Globalization::JapaneseLunisolarCalendar 클래스. 일본 음력 달력. 구현되지 않음. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들지 마세요. 이렇게 하면 런타임 오류 및/또는 어설션 오류가 발생할 수 있습니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, C++에서 함수 인자로 전달할 때 이 포인터를 사용하세요."
type: docs
weight: 1500
url: /ko/cpp/system.globalization/japaneselunisolarcalendar/
---
## JapaneseLunisolarCalendar class


일본 음력 달력. 구현되지 않음. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들지 마세요, 이는 런타임 오류 및/또는 어설션 오류를 초래할 수 있습니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 함수 인자로 전달할 때 이 포인터를 사용하세요.

```cpp
class JapaneseLunisolarCalendar : public System::Globalization::EastAsianLunisolarCalendar
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [Clone](./clone/)() override | RTTI 정보. |
| [get_Eras](./get_eras/)() const override | 달력에 존재하는 연호 목록을 가져옵니다. |
| [get_MaxSupportedDateTime](./get_maxsupporteddatetime/)() const override | 달력이 지원하는 최대 시점. |
| [get_MinSupportedDateTime](./get_minsupporteddatetime/)() const override | 달력이 지원하는 최소 시점. |
| [GetEra](./getera/)(DateTime) const override | 지정된 시점에 대한 연호를 가져옵니다. |
| [GetLeapMonth](./getleapmonth/)(int, int) const override | 지정된 연도에 대한 윤달을 가져옵니다. |
| virtual [GetLeapMonth](./getleapmonth/)(int) const | RTTI 정보. |
| [GetYear](./getyear/)(DateTime) const override | 지정된 시점에 대한 연도를 가져옵니다. |
| [IsLeapDay](./isleapday/)(int, int, int, int) const override | 날이 윤년인지 확인합니다. |
| virtual [IsLeapDay](./isleapday/)(int, int, int) const | 날이 윤년인지 확인합니다. |
| [IsLeapYear](./isleapyear/)(int, int) const override | 년이 윤년인지 확인합니다. |
| virtual [IsLeapYear](./isleapyear/)(int) const | 년이 윤년인지 확인합니다. |
| [JapaneseLunisolarCalendar](./japaneselunisolarcalendar/)() | 생성자. |
## 필드

| 필드 | 설명 |
| --- | --- |
| static constexpr [JapaneseEra](./japaneseera/) | 현재 일본 연호. |
## 또 보기

* Class [EastAsianLunisolarCalendar](../eastasianlunisolarcalendar/)
* Namespace [System::Globalization](../)
* Library [Aspose.Page for C++](../../)
