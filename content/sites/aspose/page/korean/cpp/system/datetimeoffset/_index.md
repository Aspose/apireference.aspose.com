---
title: "System::DateTimeOffset 클래스"
linktitle: "DateTimeOffset"
second_title: "C++용 Aspose.Page"
description: "System::DateTimeOffset 클래스. 협정 세계시(UTC)와 관련된 날짜와 시간을 포함합니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, C++에서 함수 인자로 전달할 때 해당 포인터를 사용하십시오."
type: docs
weight: 1700
url: /ko/cpp/system/datetimeoffset/
---
## DateTimeOffset class


협정 세계시(UTC)와 관련된 날짜와 시간을 포함합니다. 이 클래스의 객체는 [System::MakeObject()](../makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../smartptr/) 포인터로 감싸고, 함수 인자로 전달할 때 해당 포인터를 사용하십시오.

```cpp
class DateTimeOffset
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [Add](./add/)(TimeSpan) const | 지정된 시간 간격을 [DateTimeOffset](./) 객체에 추가합니다. |
| [AddDays](./adddays/)(double) const | 지정된 일 수를 [DateTimeOffset](./) 객체에 추가합니다. |
| [AddHours](./addhours/)(double) const | 지정된 시간 수를 [DateTimeOffset](./) 객체에 추가합니다. |
| [AddMilliseconds](./addmilliseconds/)(double) const | 지정된 밀리초 수를 [DateTimeOffset](./) 객체에 추가합니다. |
| [AddMinutes](./addminutes/)(double) const | 지정된 분 수를 [DateTimeOffset](./) 객체에 추가합니다. |
| [AddMonths](./addmonths/)(int) const | 지정된 개월 수를 [DateTimeOffset](./) 객체에 추가합니다. |
| [AddSeconds](./addseconds/)(double) const | 지정된 초 수를 [DateTimeOffset](./) 객체에 추가합니다. |
| [AddTicks](./addticks/)(int64_t) const | 지정된 틱 수를 [DateTimeOffset](./) 객체에 추가합니다. |
| [AddYears](./addyears/)(int) const | 지정된 연 수를 [DateTimeOffset](./) 객체에 추가합니다. |
| static [Compare](./compare/)(const DateTimeOffset\&, const DateTimeOffset\&) | 두 개의 [DateTimeOffset](./) 객체를 비교합니다. |
| [CompareTo](./compareto/)(const DateTimeOffset\&) const | 두 개의 [DateTimeOffset](./) 객체를 비교합니다. |
| [CompareTo](./compareto/)(const SharedPtr\<Object\>\&) const | 두 개의 [DateTimeOffset](./) 객체를 비교합니다. |
| [DateTimeOffset](./datetimeoffset/)() | 기본 생성자. |
| [DateTimeOffset](./datetimeoffset/)(DateTime) | 생성자. |
| [DateTimeOffset](./datetimeoffset/)(int64_t, TimeSpan) | 생성자. |
| [DateTimeOffset](./datetimeoffset/)(DateTime, TimeSpan) | 생성자. |
| [DateTimeOffset](./datetimeoffset/)(int, int, int, int, int, int, TimeSpan) | 생성자. |
| [DateTimeOffset](./datetimeoffset/)(int, int, int, int, int, int, int, TimeSpan) | 생성자. |
| [DateTimeOffset](./datetimeoffset/)(int, int, int, int, int, int, int, const SharedPtr\<Globalization::Calendar\>\&, TimeSpan) | 생성자. |
| static [Equals](./equals/)(const DateTimeOffset\&, const DateTimeOffset\&) | 두 개의 [DateTimeOffset](./) 객체가 동일한 시점을 나타내는지 확인합니다. |
| [Equals](./equals/)(const DateTimeOffset\&) const | 두 개의 [DateTimeOffset](./) 객체가 동일한 시점을 나타내는지 확인합니다. |
| [Equals](./equals/)(const SharedPtr\<Object\>\&) const | 두 개의 [DateTimeOffset](./) 객체가 동일한 시점을 나타내는지 확인합니다. |
| [EqualsExact](./equalsexact/)(const DateTimeOffset\&) const | 두 개의 [DateTimeOffset](./) 객체가 동일한 시점을 나타내고 동일한 오프셋을 갖는지 확인합니다. |
| [EqualsExact](./equalsexact/)(const SharedPtr\<Object\>\&) const | 두 개의 [DateTimeOffset](./) 객체가 동일한 시점을 나타내고 동일한 오프셋을 갖는지 확인합니다. |
| static [FromFileTime](./fromfiletime/)(int64_t) | [Convert](../convert/)[Windows](../../system.windows/) 파일 시간을 로컬 시간 오프셋이 적용된 날짜 및 시간으로 변환합니다. |
| static [FromUnixTimeMilliseconds](./fromunixtimemilliseconds/)(int64_t) | [Convert](../convert/) Unix 시간을 [DateTimeOffset](./) 객체로 변환합니다. |
| static [FromUnixTimeSeconds](./fromunixtimeseconds/)(int64_t) | [Convert](../convert/) Unix 시간을 [DateTimeOffset](./) 객체로 변환합니다. |
| [get_Date](./get_date/)() const | 현재 객체의 날짜 구성 요소를 가져옵니다. |
| [get_DateTime](./get_datetime/)() const | [DateTime](../datetime/) 값을 가져옵니다. |
| [get_Day](./get_day/)() const | 현재 객체의 월 일(day)을 가져옵니다. |
| [get_DayOfWeek](./get_dayofweek/)() const | 현재 객체의 요일을 가져옵니다. |
| [get_DayOfYear](./get_dayofyear/)() const | 현재 객체의 연중 일(day)을 가져옵니다. |
| [get_Hour](./get_hour/)() const | 현재 객체의 시간 구성 요소를 가져옵니다. |
| [get_LocalDateTime](./get_localdatetime/)() const | 로컬 날짜와 시간을 나타내는 [DateTime](../datetime/) 값을 가져옵니다. |
| [get_Millisecond](./get_millisecond/)() const | 현재 객체의 밀리초 구성 요소를 가져옵니다. |
| [get_Minute](./get_minute/)() const | 현재 객체의 분 구성 요소를 가져옵니다. |
| [get_Month](./get_month/)() const | 현재 객체의 월 구성 요소를 가져옵니다. |
| static [get_Now](./get_now/)() | [DateTimeOffset](./)을 가져오며, 날짜와 시간이 현재 로컬 시간으로 설정되고 오프셋은 로컬 시간의 오프셋으로 설정됩니다. |
| [get_Offset](./get_offset/)() const | UTC로부터의 오프셋을 가져옵니다. |
| [get_Second](./get_second/)() const | 현재 객체의 초 구성 요소를 가져옵니다. |
| [get_Ticks](./get_ticks/)() const | 현재 객체의 틱 수를 가져옵니다. |
| [get_TimeOfDay](./get_timeofday/)() const | 현재 객체의 하루 중 시간을 가져옵니다. |
| [get_UtcDateTime](./get_utcdatetime/)() const | UTC 날짜와 시간을 나타내는 [DateTime](../datetime/) 값을 가져옵니다. |
| static [get_UtcNow](./get_utcnow/)() | [DateTimeOffset](./)을 가져오며, 날짜와 시간이 현재 UTC 시간으로 설정되고 오프셋은 [TimeSpan::Zero](../timespan/zero/)입니다. |
| [get_UtcTicks](./get_utcticks/)() const | UTC 시간 기준으로 현재 객체의 틱 수를 가져옵니다. |
| [get_Year](./get_year/)() const | 현재 객체의 연도 구성 요소를 가져옵니다. |
| [GetHashCode](./gethashcode/)() const | 현재 [DateTimeOffset](./) 객체의 해시 코드를 가져옵니다. |
| [IsNull](./isnull/)() const |  |
| [operator!=](./operator!=/)(const DateTimeOffset\&) const | 현재 객체와 지정된 [DateTimeOffset](./) 객체가 서로 다른 날짜 및 시간 값을 나타내는지 확인합니다. |
| [operator!=](./operator!=/)(std::nullptr_t) const |  |
| [operator+](./operator+/)(TimeSpan) const | 현재 객체가 나타내는 값과 지정된 시간 간격의 합을 나타내는 날짜 및 시간 값을 표현하는 새로운 [DateTimeOffset](./) 클래스 인스턴스를 반환합니다. |
| [operator-](./operator-/)(TimeSpan) const | 현재 객체가 나타내는 값에서 지정된 시간 간격을 빼서 얻은 날짜 및 시간 값을 나타내는 새로운 [DateTimeOffset](./) 클래스 인스턴스를 반환합니다. |
| [operator-](./operator-/)(const DateTimeOffset\&) const | 현재 객체와 지정된 객체가 나타내는 날짜 및 시간 값 사이의 시간 간격을 나타내는 [TimeSpan](../timespan/) 클래스 인스턴스를 반환합니다. |
| [operator<](./operator_/)(const DateTimeOffset\&) const | 현재 객체가 지정된 [DateTimeOffset](./) 객체가 나타내는 값보다 이전의 날짜 및 시간 값을 나타내는지 확인합니다. |
| [operator<](./operator_/)(std::nullptr_t) const |  |
| [operator<=](./operator_=/)(const DateTimeOffset\&) const | 현재 객체가 지정된 [DateTimeOffset](./) 객체가 나타내는 값보다 이전이거나 동일한 날짜 및 시간 값을 나타내는지 확인합니다. |
| [operator<=](./operator_=/)(std::nullptr_t) const |  |
| [operator==](./operator==/)(const DateTimeOffset\&) const | 현재 객체와 지정된 [DateTimeOffset](./) 객체가 동일한 날짜 및 시간 값을 나타내는지 확인합니다. |
| [operator==](./operator==/)(std::nullptr_t) const |  |
| [operator>](./operator_/)(const DateTimeOffset\&) const | 현재 객체가 지정된 [DateTimeOffset](./) 객체가 나타내는 값보다 이후의 날짜 및 시간 값을 나타내는지 확인합니다. |
| [operator>](./operator_/)(std::nullptr_t) const |  |
| [operator>=](./operator_=/)(const DateTimeOffset\&) const | 현재 객체가 지정된 [DateTimeOffset](./) 객체가 나타내는 값보다 이후이거나 동일한 날짜 및 시간 값을 나타내는지 확인합니다. |
| [operator>=](./operator_=/)(std::nullptr_t) const |  |
| static [Parse](./parse/)(const String\&) | 지정된 문자열을 [DateTimeOffset](./) 형식으로 변환합니다. |
| static [Parse](./parse/)(const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles) | 지정된 문자열을 지정된 형식 제공자와 서식 스타일을 사용하여 [DateTimeOffset](./) 객체로 변환합니다. |
| static [ParseExact](./parseexact/)(const String\&, const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles) | 지정된 문자열을 지정된 형식, 형식 제공자 및 서식 스타일을 사용하여 [DateTimeOffset](./) 객체로 변환합니다. |
| static [ParseExact](./parseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles) | 지정된 문자열을 지정된 형식들, 형식 제공자 및 서식 스타일을 사용하여 [DateTimeOffset](./) 객체로 변환합니다. |
| [Subtract](./subtract/)(TimeSpan) const | 지정된 시간 간격을 현재 객체에서 빼습니다. |
| [Subtract](./subtract/)(const DateTimeOffset\&) const | 지정된 [DateTimeOffset](./) 값을 현재 객체에서 빼습니다. |
| [ToFileTime](./tofiletime/)() const | 현재 객체를 [Windows](../../system.windows/) 파일 시간으로 변환합니다. |
| [ToLocalTime](./tolocaltime/)() const | 현재 객체를 로컬 시간을 나타내는 객체로 변환합니다. |
| [ToOffset](./tooffset/)(TimeSpan) const | 현재 객체의 오프셋을 지정된 오프셋으로 교체합니다. |
| [ToString](./tostring/)(const String\&, const SharedPtr\<IFormatProvider\>\&) const | 지정된 형식과 형식 제공자를 사용하여 현재 객체를 문자열로 변환합니다. |
| [ToString](./tostring/)(const SharedPtr\<IFormatProvider\>\&) const | 지정된 형식 제공자를 사용하여 현재 객체를 문자열로 변환합니다. |
| [ToString](./tostring/)(const String\&) const | 지정된 형식을 사용하여 현재 객체를 문자열로 변환합니다. |
| [ToString](./tostring/)() const | 현재 객체를 문자열로 변환합니다. |
| [ToUniversalTime](./touniversaltime/)() const | 현재 객체를 UTC 시간을 나타내는 객체로 변환합니다. |
| [ToUnixTimeMilliseconds](./tounixtimemilliseconds/)() const | Unix epoch 시작부터 경과한 밀리초를 가져옵니다. |
| [ToUnixTimeSeconds](./tounixtimeseconds/)() const | Unix epoch 시작부터 경과한 초를 가져옵니다. |
| static [TryParse](./tryparse/)(const String\&, DateTimeOffset\&) | 지정된 문자열을 [DateTimeOffset](./) 객체로 변환하려고 시도합니다. |
| static [TryParse](./tryparse/)(const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles, DateTimeOffset\&) | 지정된 형식 제공자와 서식 스타일을 사용하여 지정된 문자열을 [DateTimeOffset](./) 객체로 변환하려고 시도합니다. |
| static [TryParseExact](./tryparseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles, DateTimeOffset\&) | 지정된 형식들, 형식 제공자 및 서식 스타일을 사용하여 지정된 문자열을 [DateTimeOffset](./) 객체로 변환하려고 시도합니다. |
| static [TryParseExact](./tryparseexact/)(const String\&, const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles, DateTimeOffset\&) | 지정된 형식, 형식 제공자 및 서식 스타일을 사용하여 지정된 문자열을 [DateTimeOffset](./) 객체로 변환하려고 시도합니다. |
| static [Type](./type/)() | [TimeSpan](../timespan/) 구조를 나타내는 [TypeInfo](../typeinfo/) 객체를 반환합니다. |
## 필드

| 필드 | 설명 |
| --- | --- |
| static constexpr [MaxOffset](./maxoffset/) | 틱 단위의 최대 오프셋을 가져옵니다. |
| static [MaxValue](./maxvalue/) | 가장 큰 [DateTimeOffset](./) 값을 가져옵니다. |
| static constexpr [MinOffset](./minoffset/) | 틱 단위의 최소 오프셋을 가져옵니다. |
| static [MinValue](./minvalue/) | 가장 이른 [DateTimeOffset](./) 값을 가져옵니다. |
| static [UnixEpoch](./unixepoch/) | Unix epoch 시작을 가져옵니다. |
## 또 보기

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
