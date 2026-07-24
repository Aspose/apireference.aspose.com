---
title: "System::TimeZoneInfo 클래스"
linktitle: "TimeZoneInfo"
second_title: "C++용 Aspose.Page"
description: "System::TimeZoneInfo 클래스. 특정 시간대를 설명하는 정보를 나타냅니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, 해당 포인터를 C++에서 함수 인자로 전달하는 데 사용하십시오."
type: docs
weight: 6300
url: /ko/cpp/system/timezoneinfo/
---
## TimeZoneInfo class


특정 시간대를 설명하는 정보를 나타냅니다. 이 클래스의 객체는 [System::MakeObject()](../makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../smartptr/) 포인터로 감싸고, 해당 포인터를 함수 인자로 전달하는 데 사용하십시오.

```cpp
class TimeZoneInfo : public System::IEquatable<TimeZoneInfoPtr>
```

## Nested classes

* Class [AdjustmentRule](./adjustmentrule/)
* Class [TransitionTime](./transitiontime/)
## 메서드

| 메서드 | 설명 |
| --- | --- |
| static [ClearCachedData](./clearcacheddata/)() | 캐시된 시간대 데이터를 지웁니다. |
| static [ConvertTime](./converttime/)(DateTime, const TimeZoneInfoPtr\&, const TimeZoneInfoPtr\&) | [Convert](../convert/) 한 시간대에서 다른 시간대로 변환합니다. |
| static [ConvertTime](./converttime/)(const DateTimeOffset\&, const TimeZoneInfoPtr\&) | [Convert](../convert/) 지정된 시간대의 시간으로 변환합니다. |
| static [ConvertTime](./converttime/)(DateTime, const TimeZoneInfoPtr\&) | [Convert](../convert/) 지정된 시간대의 시간으로 변환합니다. |
| static [ConvertTimeBySystemTimeZoneId](./converttimebysystemtimezoneid/)(DateTime, const String\&) | [Convert](../convert/) 지정된 시간대의 시간으로 변환합니다. |
| static [ConvertTimeBySystemTimeZoneId](./converttimebysystemtimezoneid/)(const DateTimeOffset\&, const String\&) | [Convert](../convert/) 지정된 시간대의 시간으로 변환합니다. |
| static [ConvertTimeBySystemTimeZoneId](./converttimebysystemtimezoneid/)(DateTime, const String\&, const String\&) | [Convert](../convert/) 지정된 시간대의 시간으로 변환합니다. |
| static [ConvertTimeFromUtc](./converttimefromutc/)(DateTime, const TimeZoneInfoPtr\&) | UTC 시간을 지정된 시간대의 시간으로 변환합니다. |
| static [ConvertTimeToUtc](./converttimetoutc/)(DateTime, const TimeZoneInfoPtr\&) | 시간을 UTC 시간으로 변환합니다. |
| static [ConvertTimeToUtc](./converttimetoutc/)(DateTime) | 시간을 UTC 시간으로 변환합니다. |
| static [ConvertTimeToUtcNoThrow](./converttimetoutcnothrow/)(DateTime) | 시간을 UTC 시간으로 변환합니다. 내부 사용용. |
| static [CreateCustomTimeZone](./createcustomtimezone/)(const String\&, TimeSpan, const String\&, const String\&, const String\&, const ArrayPtr\<AdjustmentRulePtr\>\&, bool) | 사용자 정의 시간대를 생성합니다. |
| static [CreateCustomTimeZone](./createcustomtimezone/)(const String\&, TimeSpan, const String\&, const String\&, const String\&, const ArrayPtr\<AdjustmentRulePtr\>\&) | 사용자 정의 시간대를 생성합니다. |
| static [CreateCustomTimeZone](./createcustomtimezone/)(const String\&, TimeSpan, const String\&, const String\&) | 사용자 정의 시간대를 생성합니다. |
| [Equals](./equals/)(SharedPtr\<Object\>) override |  |
| [Equals](./equals/)(TimeZoneInfoPtr) override | 현재 및 지정된 객체가 같은지 여부를 결정합니다. |
| static [FindSystemTimeZoneById](./findsystemtimezonebyid/)(const String\&) | 지정된 식별자를 가진 시간대를 가져옵니다. |
| [get_BaseUtcOffset](./get_baseutcoffset/)() const | 현재 시간대의 표준 시간과 UTC 시간 사이의 시간 간격을 나타내는 [TimeSpan](../timespan/) 인스턴스를 반환합니다. |
| [get_DaylightName](./get_daylightname/)() const | 현재 시간대의 일광 절약 시간 이름을 가져옵니다. |
| [get_DisplayName](./get_displayname/)() const | 현재 시간대의 이름을 가져옵니다. |
| [get_Id](./get_id/)() const | 현재 객체가 나타내는 시간대의 식별자를 반환합니다. |
| static [get_Local](./get_local/)() | [TimeZoneInfo](./) 로컬 시간대를 나타내는 인스턴스를 반환합니다. |
| [get_StandardName](./get_standardname/)() const | 현재 시간대의 표준 시간 이름을 가져옵니다. |
| [get_SupportsDaylightSavingTime](./get_supportsdaylightsavingtime/)() const | 시간대에 일광 절약 시간 규칙이 있는지 여부를 나타내는 플래그를 가져옵니다. |
| static [get_Utc](./get_utc/)() | [TimeZoneInfo](./) UTC 시간대를 나타내는 인스턴스를 반환합니다. |
| [GetAdjustmentRules](./getadjustmentrules/)() const | [AdjustmentRule](./adjustmentrule/) 객체 배열을 반환합니다. 이 객체들은 현재 [TimeZoneInfo](./) 객체에 적용되는 조정 규칙을 나타냅니다. |
| [GetAmbiguousTimeOffsets](./getambiguoustimeoffsets/)(DateTime) const | 지정된 날짜와 시간에 매핑될 수 있는 UTC 날짜와 시간을 가져옵니다. |
| [GetAmbiguousTimeOffsets](./getambiguoustimeoffsets/)(const DateTimeOffset\&) const | 지정된 날짜와 시간에 매핑될 수 있는 UTC 날짜와 시간을 가져옵니다. |
| [GetHashCode](./gethashcode/)() const override | C# [Object.GetHashCode()](../object/gethashcode/) 메서드와 유사합니다. 사용자 정의 객체의 해싱을 가능하게 합니다. |
| static [GetSystemTimeZones](./getsystemtimezones/)() | 로컬 시스템에서 사용 가능한 모든 시간대의 정렬된 컬렉션을 가져옵니다. |
| [GetUtcOffset](./getutcoffset/)(DateTime) const | 지정된 날짜와 시간에 대해 이 시간대와 UTC 시간대 간의 차이를 계산합니다. |
| [GetUtcOffset](./getutcoffset/)(const DateTimeOffset\&) const | 지정된 날짜와 시간에 대해 이 시간대와 UTC 시간대 간의 차이를 계산합니다. |
| static [GetUtcOffsetFromUtc](./getutcoffsetfromutc/)(DateTime, const TimeZoneInfoPtr\&) | 지정된 시간대의 UTC 날짜시간에 대한 UTC 오프셋을 반환하는 내부 도우미 함수입니다. 내부 전용. |
| static [GetUtcOffsetFromUtc](./getutcoffsetfromutc/)(DateTime, const TimeZoneInfoPtr\&, bool\&, bool\&) | 지정된 시간대의 UTC 날짜시간에 대한 UTC 오프셋을 반환하는 내부 도우미 함수입니다. 내부 전용. |
| [GetUtcOffsetNoThrow](./getutcoffsetnothrow/)(DateTime) const | 지정된 날짜와 시간에 대해 이 시간대와 UTC 시간대 간의 차이를 계산합니다. 내부 전용. |
| [HasSameRules](./hassamerules/)(const TimeZoneInfoPtr\&) const | 현재 시간대와 다른 시간대가 동일한 조정 규칙을 갖는지 확인합니다. |
| [IsAmbiguousTime](./isambiguoustime/)(DateTime) const | 지정된 날짜와 시간이 모호하여 여러 UTC 시간에 매핑될 수 있는지 확인합니다. |
| [IsAmbiguousTime](./isambiguoustime/)(const DateTimeOffset\&) const | 지정된 날짜와 시간이 모호하여 여러 UTC 시간에 매핑될 수 있는지 확인합니다. |
| [IsDaylightSavingTime](./isdaylightsavingtime/)(DateTime) const | 지정된 날짜와 시간이 일광 절약 시간 범위에 해당하는지 확인합니다. |
| [IsDaylightSavingTime](./isdaylightsavingtime/)(const DateTimeOffset\&) const | 지정된 날짜와 시간이 일광 절약 시간 범위에 해당하는지 확인합니다. |
| [IsDaylightSavingTimeNoThrow](./isdaylightsavingtimenothrow/)(DateTime) const | 지정된 날짜와 시간이 일광 절약 시간 범위에 해당하는지 확인합니다. |
| [IsInvalidTime](./isinvalidtime/)(DateTime) const | 지정된 날짜와 시간이 유효하지 않은지 확인합니다. |
| [ToString](./tostring/)() const override | C# [Object.ToString()](../object/tostring/) 메서드와 유사합니다. 사용자 정의 객체를 문자열로 변환할 수 있게 합니다. |
| static [TransitionTimeToDateTime](./transitiontimetodatetime/)(int32_t, const TransitionTime\&) | 연도와 [TransitionTime](./transitiontime/)을 [DateTime](../datetime/)으로 변환하는 도우미 함수입니다. |
## Typedefs

| 타입 정의 | 설명 |
| --- | --- |
| [AdjustmentRulePtr](./adjustmentruleptr/) | [AdjustmentRule](./adjustmentrule/) 클래스 인스턴스에 대한 공유 포인터 별칭입니다. |
## 또 보기

* Class [IEquatable](../iequatable/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
