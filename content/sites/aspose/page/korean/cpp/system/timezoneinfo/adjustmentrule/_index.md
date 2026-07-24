---
title: "System::TimeZoneInfo::AdjustmentRule 클래스"
linktitle: "AdjustmentRule"
second_title: "C++용 Aspose.Page"
description: "System::TimeZoneInfo::AdjustmentRule 클래스. 시간대 조정에 대한 정보를 제공합니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, 해당 포인터를 C++에서 함수 인수로 전달하는 데 사용하십시오."
type: docs
weight: 3300
url: /ko/cpp/system/timezoneinfo/adjustmentrule/
---
## AdjustmentRule class


시간대 조정에 대한 정보를 제공합니다. 이 클래스의 객체는 [System::MakeObject()](../../makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../smartptr/) 포인터로 감싸고, 해당 포인터를 함수 인수로 전달하는 데 사용하십시오.

```cpp
class AdjustmentRule : public System::IEquatable<AdjustmentRulePtr>
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| static [CreateAdjustmentRule](./createadjustmentrule/)(DateTime, DateTime, TimeSpan, const TransitionTime\&, const TransitionTime\&) | 지정된 매개변수로 설명된 시간 조정 규칙을 나타내는 [AdjustmentRule](./) 클래스의 인스턴스를 생성합니다. |
| static [CreateAdjustmentRule](./createadjustmentrule/)(DateTime, DateTime, TimeSpan, const TransitionTime\&, const TransitionTime\&, TimeSpan, bool) | 지정된 매개변수로 설명된 시간 조정 규칙을 나타내는 [AdjustmentRule](./) 클래스의 인스턴스를 생성합니다. |
| [Equals](./equals/)(AdjustmentRulePtr) override |  |
| [get_BaseUtcOffsetDelta](./get_baseutcoffsetdelta/)() const | 기본 UTC 오프셋으로부터의 차이를 반환합니다. |
| [get_DateEnd](./get_dateend/)() const | 조정 규칙이 효력을 잃는 날짜와 시간을 나타내는 [DateTime](../../datetime/) 객체를 반환합니다. |
| [get_DateStart](./get_datestart/)() const | 조정 규칙이 적용되는 날짜와 시간을 나타내는 [DateTime](../../datetime/) 객체를 반환합니다. |
| [get_DaylightDelta](./get_daylightdelta/)() const | 시간대의 일광 절약 시간을 형성하는 데 필요한 시간을 나타내는 [TimeSpan](../../timespan/) 객체를 반환합니다. |
| [get_DaylightTransitionEnd](./get_daylighttransitionend/)() const | 표준 시간에서 일광 절약 시간으로 전환되는 정보를 반환합니다. |
| [get_DaylightTransitionStart](./get_daylighttransitionstart/)() const | 일광 절약 시간에서 표준 시간으로 전환되는 정보를 반환합니다. |
| [get_HasDaylightSaving](./get_hasdaylightsaving/)() const | 내부 사용 전용. |
| [GetHashCode](./gethashcode/)() const override | C# [Object.GetHashCode()](../../object/gethashcode/) 메서드와 유사합니다. 사용자 정의 객체의 해싱을 가능하게 합니다. |
## 또 보기

* Class [IEquatable](../../iequatable/)
* Class [TimeZoneInfo](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
