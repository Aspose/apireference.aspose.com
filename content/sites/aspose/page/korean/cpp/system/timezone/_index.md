---
title: "System::TimeZone class"
linktitle: "TimeZone"
second_title: "C++용 Aspose.Page"
description: "System::TimeZone 클래스. 시간대를 나타냅니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여만 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, C++에서 함수 인수로 전달할 때 해당 포인터를 사용하십시오."
type: docs
weight: 6200
url: /ko/cpp/system/timezone/
---
## TimeZone class


시간대를 나타냅니다. 이 클래스의 객체는 [System::MakeObject()](../makeobject/) 함수를 사용하여만 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../smartptr/) 포인터로 감싸고, 함수 인수로 전달할 때 해당 포인터를 사용하십시오.

```cpp
class TimeZone : public System::Object
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| static [get_CurrentTimeZone](./get_currenttimezone/)() | 현재 시간대를 나타내는 [TimeZone](./) 클래스의 새 인스턴스를 반환합니다. |
| virtual [get_DaylightName](./get_daylightname/)() const | 현재 객체가 나타내는 시간대의 일광 절약 시간 이름을 반환합니다. |
| virtual [get_StandardName](./get_standardname/)() const | 현재 객체가 나타내는 시간대의 표준 시간 이름을 반환합니다. |
| virtual [GetDaylightChanges](./getdaylightchanges/)(int32_t) | 특정 연도의 일광 절약 시간 기간을 반환합니다. |
| virtual [GetUtcOffset](./getutcoffset/)(DateTime) | 지정된 현지 시간에 대한 UTC 오프셋을 반환합니다. |
| virtual [IsDaylightSavingTime](./isdaylightsavingtime/)(DateTime) | 지정된 [DateTime](../datetime/) 객체가 현재 [TimeZone](./) 객체가 나타내는 시간대의 일광 절약 시간 범위에 속하는지 여부를 판단합니다. |
## 또 보기

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
