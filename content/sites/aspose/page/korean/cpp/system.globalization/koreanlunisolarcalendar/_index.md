---
title: "System::Globalization::KoreanLunisolarCalendar class"
linktitle: "KoreanLunisolarCalendar"
second_title: "C++용 Aspose.Page"
description: "System::Globalization::KoreanLunisolarCalendar 클래스. 한국 음력 달력. 구현되지 않았습니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 이 타입의 인스턴스를 만들거나 operator new를 사용하지 마세요. 그렇지 않으면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, C++에서 함수 인자로 전달할 때 이 포인터를 사용하세요."
type: docs
weight: 1800
url: /ko/cpp/system.globalization/koreanlunisolarcalendar/
---
## KoreanLunisolarCalendar class


한국 음력 달력. 구현되지 않았습니다. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 이 타입의 인스턴스를 만들거나 operator new를 사용하지 마세요. 그렇지 않으면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 함수 인자로 전달할 때 이 포인터를 사용하세요.

```cpp
class KoreanLunisolarCalendar : public System::Globalization::EastAsianLunisolarCalendar
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [Clone](./clone/)() override | RTTI 정보. |
| [get_Eras](./get_eras/)() const override | 달력에 존재하는 연호 목록을 가져옵니다. |
| [get_MaxSupportedDateTime](./get_maxsupporteddatetime/)() const override | 달력이 지원하는 최대 시점. |
| [get_MinSupportedDateTime](./get_minsupporteddatetime/)() const override | 달력이 지원하는 최소 시점. |
| [GetLeapMonth](./getleapmonth/)(int, int) const override | 지정된 연도에 대한 윤달을 가져옵니다. |
| virtual [GetLeapMonth](./getleapmonth/)(int) const | RTTI 정보. |
| [IsLeapDay](./isleapday/)(int, int, int, int) const override | 날이 윤년인지 확인합니다. |
| virtual [IsLeapDay](./isleapday/)(int, int, int) const | 날이 윤년인지 확인합니다. |
| [IsLeapYear](./isleapyear/)(int, int) const override | 년이 윤년인지 확인합니다. |
| virtual [IsLeapYear](./isleapyear/)(int) const | 년이 윤년인지 확인합니다. |
| [KoreanLunisolarCalendar](./koreanlunisolarcalendar/)() | 생성자. |
## 필드

| 필드 | 설명 |
| --- | --- |
| static constexpr [GregorianEra](./gregorianera/) | 현재 그레고리오 달력 시대. |
## 또 보기

* Class [EastAsianLunisolarCalendar](../eastasianlunisolarcalendar/)
* Namespace [System::Globalization](../)
* Library [Aspose.Page for C++](../../)
