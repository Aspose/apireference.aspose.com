---
title: "System::DateTime class"
linktitle: "DateTime"
second_title: "C++용 Aspose.Page"
description: "System::DateTime class. 시간 연속선에서 특정 날짜와 시간 값을 나타냅니다. 이 타입은 스택에 할당하고 값이나 참조로 함수에 전달해야 합니다. C++에서 이 타입의 객체를 관리하기 위해 System::SmartPtr 클래스를 절대 사용하지 마세요."
type: docs
weight: 1600
url: /ko/cpp/system/datetime/
---
## DateTime class


시간 연속선에서 특정 날짜와 시간 값을 나타냅니다. 이 타입은 스택에 할당하고 값이나 참조로 함수에 전달해야 합니다. 이 타입의 객체를 관리하기 위해 [System::SmartPtr](../smartptr/) 클래스를 절대 사용하지 마세요.

```cpp
class DateTime
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [Add](./add/)(TimeSpan) const | 현재 객체가 나타내는 날짜와 시간 값에 지정된 시간 간격을 더한 결과인 날짜와 시간 값을 나타내는 새로운 [DateTime](./) 클래스 인스턴스를 반환합니다. |
| [AddDays](./adddays/)(double) const | 현재 객체가 나타내는 값과 지정된 일 수의 합계인 날짜와 시간 값을 나타내는 새로운 [DateTime](./) 클래스 인스턴스를 반환합니다. |
| [AddHours](./addhours/)(double) const | 현재 객체가 나타내는 값과 지정된 시간 수의 합계인 날짜와 시간 값을 나타내는 새로운 [DateTime](./) 클래스 인스턴스를 반환합니다. |
| [AddMilliseconds](./addmilliseconds/)(double) const | 현재 객체가 나타내는 값과 지정된 밀리초 수의 합계인 날짜와 시간 값을 나타내는 새로운 [DateTime](./) 클래스 인스턴스를 반환합니다. |
| [AddMinutes](./addminutes/)(double) const | 현재 객체가 나타내는 값과 지정된 분 수의 합계인 날짜와 시간 값을 나타내는 새로운 [DateTime](./) 클래스 인스턴스를 반환합니다. |
| [AddMonths](./addmonths/)(int) const | 현재 객체가 나타내는 값과 지정된 월 수의 합계인 날짜와 시간 값을 나타내는 새로운 [DateTime](./) 클래스 인스턴스를 반환합니다. |
| [AddSeconds](./addseconds/)(double) const | 현재 객체가 나타내는 값과 지정된 초 수의 합계인 날짜와 시간 값을 나타내는 새로운 [DateTime](./) 클래스 인스턴스를 반환합니다. |
| [AddTicks](./addticks/)(int64_t) const | 현재 객체가 나타내는 값과 지정된 100나노초 간격 수의 합계인 날짜와 시간 값을 나타내는 새로운 [DateTime](./) 클래스 인스턴스를 반환합니다. |
| [AddYears](./addyears/)(int) const | 현재 객체가 나타내는 값에 연도 구성 요소를 지정된 수만큼 증가시킨 날짜와 시간 값과 동일한 새로운 [DateTime](./) 클래스 인스턴스를 반환합니다. |
| static [Compare](./compare/)(DateTime, DateTime) | 지정된 [DateTime](./) 클래스 인스턴스 두 개가 나타내는 값을 비교하고, 시간선에서 값들의 상대적 위치를 나타내는 값을 반환합니다. |
| [CompareTo](./compareto/)(DateTime) const | 현재 객체와 지정된 [DateTime](./) 클래스 인스턴스가 나타내는 두 날짜 및 시간 값을 비교하고, 시간선에서 값들의 상대적 위치를 나타내는 값을 반환합니다. |
| [DateTime](./datetime/)() | MinValue와 동일한 가장 작은 날짜 및 시간 값을 나타내는 인스턴스를 생성합니다. |
| [DateTime](./datetime/)(int, int, int) | 특정 연도, 월, 일로 지정된 날짜 및 시간 값을 나타내는 인스턴스를 생성합니다. |
| [DateTime](./datetime/)(int, int, int, const SharedPtr\<Globalization::Calendar\>\&) | 지정된 달력에서 특정 연도, 월, 일로 지정된 날짜 및 시간 값을 나타내는 인스턴스를 생성합니다. |
| [DateTime](./datetime/)(int, int, int, int, int, int) | 특정 연도, 월, 일, 시, 분 및 초로 지정된 날짜 및 시간 값을 나타내는 인스턴스를 생성합니다. |
| [DateTime](./datetime/)(int, int, int, int, int, int, DateTimeKind) | 특정 연도, 월, 일, 시, 분 및 초로 지정된 날짜 및 시간 값을 나타내는 인스턴스를 생성합니다. |
| [DateTime](./datetime/)(int, int, int, int, int, int, const SharedPtr\<Globalization::Calendar\>\&) | 지정된 달력에서 특정 연도, 월, 일, 시, 분 및 초로 지정된 날짜 및 시간 값을 나타내는 인스턴스를 생성합니다. |
| [DateTime](./datetime/)(int, int, int, int, int, int, int, DateTimeKind) | 특정 연도, 월, 일, 시, 분, 초 및 밀리초로 지정된 날짜 및 시간 값을 나타내는 인스턴스를 생성합니다. |
| [DateTime](./datetime/)(int, int, int, int, int, int, int, const SharedPtr\<Globalization::Calendar\>\&, DateTimeKind) | 지정된 달력에서 특정 연도, 월, 일, 시, 분, 초 및 밀리초로 지정된 날짜 및 시간 값을 나타내는 인스턴스를 생성합니다. |
| [DateTime](./datetime/)(int64_t, DateTimeKind) | 틱 수로 지정된 날짜 및 시간 값을 나타내는 인스턴스를 생성합니다. |
| [DateTime](./datetime/)(int64_t, DateTimeKind, bool) | 틱 수로 지정된 날짜 및 시간 값을 나타내는 인스턴스를 생성합니다. 내부 사용용. |
| [DateTime](./datetime/)(const DateTime\&) | 인스턴스를 복사 생성합니다. |
| static [DaysInMonth](./daysinmonth/)(int, int) | 지정된 연도의 지정된 월에 포함된 일 수를 반환합니다. |
| static [Equals](./equals/)(DateTime, DateTime) | 지정된 [DateTime](./) 클래스 인스턴스가 동일한 날짜 및 시간 값을 나타내는지 확인합니다. |
| [Equals](./equals/)(DateTime) const | 지정된 [DateTime](./) 클래스 인스턴스가 현재 객체와 동일한 날짜 및 시간 값을 나타내는지 확인합니다. |
| static [FromBinary](./frombinary/)(int64_t) | 지정된 부호 없는 64비트 정수에서 날짜 시간 값을 역직렬화하고, 새로운 [DateTime](./) 클래스 인스턴스를 해당 값으로 설정합니다. |
| static [FromFileTime](./fromfiletime/)(int64_t) | 지정된 파일 시간을 로컬 시간과 동일한 날짜 및 시간 값을 나타내는 [DateTime](./) 클래스 인스턴스로 변환합니다. |
| static [FromFileTimeUtc](./fromfiletimeutc/)(int64_t) | 지정된 파일 시간을 UTC 시간과 동일한 날짜 및 시간 값을 나타내는 [DateTime](./) 클래스 인스턴스로 변환합니다. |
| static [FromOADate](./fromoadate/)(double) | 지정된 OLE Automation 날짜와 동등한 날짜 및 시간 값을 나타내는 [DateTime](./) 클래스 인스턴스를 반환합니다. |
| static [FromUnixTime](./fromunixtime/)(time_t) | 지정된 Unix 시간 값을 [DateTime](./) 클래스 인스턴스로 변환합니다. 내부 사용용. |
| [get_Date](./get_date/)() const | 현재 객체가 나타내는 날짜 및 시간 중 날짜 부분만을 나타내고 시간 부분의 각 구성 요소를 0으로 설정한 새로운 [DateTime](./) 클래스 인스턴스를 반환합니다. |
| [get_Day](./get_day/)() const | 현재 객체가 나타내는 월에서 일의 서수 번호를 반환합니다. |
| [get_DayOfWeek](./get_dayofweek/)() const | 현재 객체가 나타내는 요일을 나타내는 값을 반환합니다. |
| [get_DayOfYear](./get_dayofyear/)() const | 현재 객체가 나타내는 연도에서 일의 서수 번호를 반환합니다. |
| [get_Hour](./get_hour/)() const | 현재 객체가 나타내는 날짜 및 시간 값의 시 구성 요소를 반환합니다. |
| [get_Kind](./get_kind/)() const | 현재 객체가 나타내는 날짜 및 시간이 로컬인지 UTC인지, 혹은 둘 다 아닌지를 나타내는 값을 반환합니다. |
| [get_Millisecond](./get_millisecond/)() const | 현재 객체가 나타내는 날짜 및 시간 값의 밀리초 구성 요소를 반환합니다. |
| [get_Minute](./get_minute/)() const | 현재 객체가 나타내는 날짜 및 시간 값의 분 구성 요소를 반환합니다. |
| [get_Month](./get_month/)() const | 현재 객체가 나타내는 연도에서 월의 서수 번호를 반환합니다. |
| static [get_Now](./get_now/)() | 현재 시간을 로컬 시간으로 나타내는 [DateTime](./) 클래스 인스턴스를 반환합니다. |
| [get_Second](./get_second/)() const | 현재 객체가 나타내는 날짜 및 시간 값의 초 구성 요소를 반환합니다. |
| [get_Ticks](./get_ticks/)() const | 현재 객체가 나타내는 날짜 및 시간까지 그레고리력에서 0001년 1월 1일 0시 0분 0초 UTC 이후 경과한 100나노초 간격의 수를 반환합니다. |
| [get_TimeOfDay](./get_timeofday/)() const | 현재 객체가 나타내는 하루의 시작부터 현재 객체가 나타내는 날짜 및 시간 값까지의 시간 간격을 나타내는 값을 반환합니다. |
| static [get_Today](./get_today/)() | [DateTime](./) 클래스의 인스턴스를 반환하며, 이는 객체가 나타내는 값의 시간 부분 각 구성 요소를 0으로 설정한 현재 날짜를 나타냅니다. |
| static [get_UtcNow](./get_utcnow/)() | [DateTime](./) 클래스의 인스턴스를 반환하며, 이는 현재 시간을 UTC로 나타냅니다. |
| [get_Year](./get_year/)() const | 현재 객체가 나타내는 연도를 반환합니다. |
| [GetDateComponents](./getdatecomponents/)(int\&, int\&, int\&) const | 날짜 부분을 가져옵니다. 내부 사용용. |
| [GetDateTimeFormats](./getdatetimeformats/)() const | 표준 날짜 및 시간 형식 지정자 중 하나로 포맷된 현재 객체의 문자열 표현을 각 요소로 하는 문자열 배열을 반환합니다. |
| [GetDateTimeFormats](./getdatetimeformats/)(char_t) const | 지정된 표준 날짜 및 시간 형식 지정자로 포맷된 현재 객체의 문자열 표현을 각 요소로 하는 문자열 배열을 반환합니다. |
| [GetDateTimeFormats](./getdatetimeformats/)(const SharedPtr\<IFormatProvider\>\&) const | 표준 날짜 및 시간 형식 지정자 중 하나와 지정된 형식 제공자를 사용해 포맷된 현재 객체의 문자열 표현을 각 요소로 하는 문자열 배열을 반환합니다. |
| [GetDateTimeFormats](./getdatetimeformats/)(char_t, const SharedPtr\<IFormatProvider\>\&) const | 지정된 표준 날짜 및 시간 형식 지정자와 형식 제공자를 사용해 포맷된 현재 객체의 문자열 표현을 각 요소로 하는 문자열 배열을 반환합니다. |
| [GetHashCode](./gethashcode/)() const | 현재 객체에 대한 해시 코드를 반환합니다. |
| [IsDaylightSavingTime](./isdaylightsavingtime/)() const | 현재 객체가 나타내는 날짜 및 시간 값이 현재 표준시의 일광 절약 시간 범위에 속하는지 여부를 결정합니다. |
| static [IsLeapYear](./isleapyear/)(int) | 지정된 연도가 윤년인지 여부를 결정합니다. |
| [IsNull](./isnull/)() const |  |
| [operator!=](./operator!=/)(DateTime) const | 현재 객체와 지정된 [DateTime](./) 객체가 서로 다른 날짜 및 시간 값을 나타내는지 여부를 결정합니다. |
| [operator!=](./operator!=/)(std::nullptr_t) const |  |
| [operator+](./operator+/)(TimeSpan) const | [DateTime](./) 클래스의 새 인스턴스를 반환하며, 이는 현재 객체가 나타내는 값과 지정된 시간 간격의 합인 날짜 및 시간 값을 나타냅니다. |
| [operator+=](./operator+=/)(TimeSpan) | 현재 객체를 현재 객체가 나타내는 값과 지정된 시간 간격의 합인 날짜 및 시간 값으로 설정합니다. |
| [operator-](./operator-/)(TimeSpan) const | [DateTime](./) 클래스의 새 인스턴스를 반환하며, 이는 현재 객체가 나타내는 값에서 지정된 시간 간격을 빼서 얻은 날짜 및 시간 값을 나타냅니다. |
| [operator-](./operator-/)(DateTime) const | 현재 객체와 지정된 객체가 나타내는 날짜 및 시간 값 사이의 시간 간격을 나타내는 [TimeSpan](../timespan/) 클래스 인스턴스를 반환합니다. |
| [operator-=](./operator-=/)(TimeSpan) | 현재 객체를 현재 객체가 나타내는 날짜 및 시간 값에서 지정된 시간 간격을 빼서 얻은 결과 날짜 및 시간 값으로 설정합니다. |
| [operator<](./operator_/)(DateTime) const | 현재 객체가 지정된 [DateTime](./) 객체가 나타내는 값보다 이전인 날짜 및 시간 값을 나타내는지 여부를 결정합니다. |
| [operator<](./operator_/)(std::nullptr_t) const |  |
| [operator<=](./operator_=/)(DateTime) const | 현재 객체가 지정된 [DateTime](./) 객체가 나타내는 값보다 이전이거나 동일한 날짜 및 시간 값을 나타내는지 여부를 결정합니다. |
| [operator<=](./operator_=/)(std::nullptr_t) const |  |
| [operator=](./operator=/)(const DateTime\&) | 지정된 [DateTime](./) 인스턴스가 나타내는 값을 현재 객체에 할당합니다. |
| [operator==](./operator==/)(DateTime) const | 현재 객체와 지정된 [DateTime](./) 객체가 동일한 날짜 및 시간 값을 나타내는지 여부를 결정합니다. |
| [operator==](./operator==/)(std::nullptr_t) const |  |
| [operator>](./operator_/)(DateTime) const | 현재 객체가 지정된 [DateTime](./) 객체가 나타내는 값보다 이후인 날짜 및 시간 값을 나타내는지 여부를 결정합니다. |
| [operator>](./operator_/)(std::nullptr_t) const |  |
| [operator>=](./operator_=/)(DateTime) const | 현재 객체가 지정된 [DateTime](./) 객체가 나타내는 값보다 이후이거나 동일한 날짜 및 시간 값을 나타내는지 여부를 결정합니다. |
| [operator>=](./operator_=/)(std::nullptr_t) const |  |
| static [Parse](./parse/)(const String\&) | 지정된 날짜 및 시간 값의 문자열 표현을 동등한 [DateTime](./) 객체로 변환합니다. |
| static [Parse](./parse/)(const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles) | 지정된 날짜 및 시간 값의 문자열 표현을 문화별 형식 정보를 사용하여 동등한 [DateTime](./) 객체로 변환합니다. |
| static [Parse](./parse/)(const String\&, const SharedPtr\<Globalization::CultureInfo\>\&, Globalization::DateTimeStyles) |  |
| static [Parse](./parse/)(const String\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, Globalization::DateTimeStyles) |  |
| static [Parse](./parse/)(const String\&, std::nullptr_t, Globalization::DateTimeStyles) |  |
| static [ParseExact](./parseexact/)(const String\&, const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles) | 지정된 날짜 및 시간 값의 문자열 표현을 지정된 형식 및 문화별 형식 정보를 사용하여 동등한 [DateTime](./) 객체로 변환합니다. 문자열 표현의 형식은 지정된 형식과 정확히 일치해야 합니다. 변환에 실패하면 예외를 발생시킵니다. |
| static [ParseExact](./parseexact/)(const String\&, const String\&, const SharedPtr\<Globalization::CultureInfo\>\&, Globalization::DateTimeStyles) |  |
| static [ParseExact](./parseexact/)(const String\&, const String\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, Globalization::DateTimeStyles) |  |
| static [ParseExact](./parseexact/)(const String\&, const String\&, std::nullptr_t, Globalization::DateTimeStyles) |  |
| static [ParseExact](./parseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles) | 지정된 날짜 및 시간 값의 문자열 표현을 지정된 형식들, 문화별 형식 정보 및 스타일을 사용하여 동등한 [DateTime](./) 객체로 변환합니다. 문자열 표현의 형식은 지정된 형식 중 하나와 정확히 일치해야 합니다. 변환에 실패하면 예외를 발생시킵니다. |
| static [ParseExact](./parseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<Globalization::CultureInfo\>\&, Globalization::DateTimeStyles) |  |
| static [ParseExact](./parseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, Globalization::DateTimeStyles) |  |
| static [ParseExact](./parseexact/)(const String\&, const ArrayPtr\<String\>\&, std::nullptr_t, Globalization::DateTimeStyles) |  |
| static [SpecifyKind](./specifykind/)(DateTime, DateTimeKind) | 지정된 [DateTime](./) 객체와 동일한 틱 수를 나타내며, 인수 **kind**에 따라 로컬 시간, UTC 시간 또는 둘 다 아닌 시간을 나타내는 새 [DateTime](./) 객체를 생성합니다. |
| [Subtract](./subtract/)(TimeSpan) const | [DateTime](./) 클래스의 새 인스턴스를 반환하며, 이는 현재 객체가 나타내는 값에서 지정된 시간 간격을 빼서 얻은 날짜 및 시간 값을 나타냅니다. |
| [Subtract](./subtract/)(DateTime) const | 현재 객체와 지정된 객체가 나타내는 날짜 및 시간 값 사이의 시간 간격을 나타내는 [TimeSpan](../timespan/) 클래스의 인스턴스를 반환합니다. |
| [ToBinary](./tobinary/)() const | 현재 객체를 직렬화합니다. |
| [ToFileTime](./tofiletime/)() const | 현재 객체가 나타내는 날짜 및 시간 값을 파일 시간으로 나타내는 값을 반환합니다. |
| [ToFileTimeUtc](./tofiletimeutc/)() const | 현재 객체가 나타내는 날짜 및 시간 값을 파일 시간 UTC로 변환합니다. |
| [ToLocalTime](./tolocaltime/)() const | 현재 객체가 나타내는 날짜 및 시간 값을 로컬 시간으로 나타내는 새 [DateTime](./) 클래스 인스턴스를 반환합니다. |
| [ToLongDateString](./tolongdatestring/)() const | 현재 객체의 긴 날짜 문자열 표현을 포함하는 문자열을 반환합니다. |
| [ToLongTimeString](./tolongtimestring/)() const | 현재 객체의 긴 시간 문자열 표현을 포함하는 문자열을 반환합니다. |
| [ToOADate](./tooadate/)() const | 현재 객체가 나타내는 날짜 및 시간 값을 OLE 자동화 날짜로 반환합니다. |
| [ToShortDateString](./toshortdatestring/)() const | 현재 객체의 짧은 날짜 문자열 표현을 포함하는 문자열을 반환합니다. |
| [ToShortTimeString](./toshorttimestring/)() const | 현재 객체의 짧은 시간 문자열 표현을 포함하는 문자열을 반환합니다. |
| [ToString](./tostring/)() const | 현재 문화에서 정의된 서식 규칙을 사용하여 현재 객체가 나타내는 날짜 및 시간 값의 문자열 표현을 반환합니다. |
| [ToString](./tostring/)(const String\&) const | 현재 문화에서 정의된 서식 규칙과 지정된 형식을 사용하여 현재 객체가 나타내는 날짜 및 시간 값의 문자열 표현을 반환합니다. |
| [ToString](./tostring/)(const SharedPtr\<IFormatProvider\>\&) const | 지정된 형식 정보를 사용하여 현재 객체가 나타내는 날짜 및 시간 값의 문자열 표현을 반환합니다. |
| [ToString](./tostring/)(const SharedPtr\<Globalization::CultureInfo\>\&) const |  |
| [ToString](./tostring/)(const SharedPtr\<Globalization::DateTimeFormatInfo\>\&) const |  |
| [ToString](./tostring/)(std::nullptr_t) const |  |
| [ToString](./tostring/)(const String\&, const SharedPtr\<IFormatProvider\>\&) const | 지정된 형식 정보를 사용하여 현재 객체가 나타내는 날짜 및 시간 값의 문자열 표현을 반환합니다. |
| [ToString](./tostring/)(const String\&, const SharedPtr\<Globalization::CultureInfo\>\&) const |  |
| [ToString](./tostring/)(const String\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&) const |  |
| [ToString](./tostring/)(const String\&, std::nullptr_t) const |  |
| [ToUniversalTime](./touniversaltime/)() const | 현재 객체가 나타내는 날짜 및 시간 값을 UTC로 나타내는 새 [DateTime](./) 클래스 인스턴스를 반환합니다. |
| [ToUnixTime](./tounixtime/)() const | 현재 객체가 나타내는 날짜 및 시간 값을 Unix 시간으로 나타내는 값을 반환합니다. 내부 사용용. |
| static [TryParse](./tryparse/)(const String\&, DateTime\&) | 지정된 날짜 및 시간 값의 문자열 표현을 동등한 [DateTime](./) 객체로 변환합니다. |
| static [TryParse](./tryparse/)(const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles, DateTime\&) | 지정된 날짜 및 시간 값의 문자열 표현을 지정된 문화별 형식 정보와 스타일을 사용하여 동등한 [DateTime](./) 객체로 변환합니다. |
| static [TryParse](./tryparse/)(const String\&, const SharedPtr\<Globalization::CultureInfo\>\&, Globalization::DateTimeStyles, DateTime\&) |  |
| static [TryParse](./tryparse/)(const String\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, Globalization::DateTimeStyles, DateTime\&) |  |
| static [TryParse](./tryparse/)(const String\&, std::nullptr_t, Globalization::DateTimeStyles, DateTime\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles, DateTime\&) | 지정된 날짜 및 시간 값의 문자열 표현을 지정된 형식, 문화별 형식 정보 및 스타일을 사용하여 동등한 [DateTime](./) 객체로 변환합니다. 문자열 표현의 형식은 지정된 형식과 정확히 일치해야 합니다. |
| static [TryParseExact](./tryparseexact/)(const String\&, const String\&, const SharedPtr\<Globalization::CultureInfo\>\&, Globalization::DateTimeStyles, DateTime\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const String\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, Globalization::DateTimeStyles, DateTime\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const String\&, std::nullptr_t, Globalization::DateTimeStyles, DateTime\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles, DateTime\&) | 지정된 날짜 및 시간 값의 문자열 표현을 지정된 형식들, 문화별 형식 정보 및 스타일을 사용하여 동등한 [DateTime](./) 객체로 변환합니다. 문자열 표현의 형식은 지정된 형식 중 하나와 정확히 일치해야 합니다. |
| static [TryParseExact](./tryparseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<Globalization::CultureInfo\>\&, Globalization::DateTimeStyles, DateTime\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, Globalization::DateTimeStyles, DateTime\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const ArrayPtr\<String\>\&, std::nullptr_t, Globalization::DateTimeStyles, DateTime\&) |  |
| static [Type](./type/)() | 이 클래스에 대한 정보를 포함하는 [TypeInfo](../typeinfo/) 객체를 반환합니다. |
## 필드

| 필드 | 설명 |
| --- | --- |
| static constexpr [MaxTicks](./maxticks/) | 가능한 최소값과 최대값 사이의 시간 간격을 100나노초 단위로 나타낸 [DateTime](./) 값의 수입니다. |
| static [MaxValue](./maxvalue/) | 가능한 최대 날짜 및 시간 값을 나타내는 [DateTime](./) 클래스의 인스턴스입니다. |
| static constexpr [MinTicks](./minticks/) | 인스턴스인 [DateTime](./) 클래스가 나타낼 수 있는 최소 틱 수. |
| static [MinValue](./minvalue/) | [DateTime](./) 클래스의 인스턴스로, 가능한 최소 날짜 및 시간 값을 나타냅니다. |
| static constexpr [TicksPerDay](./ticksperday/) | 하루에 포함된 틱 수. |
| static constexpr [TicksPerHour](./ticksperhour/) | 한 시간에 포함된 틱 수. |
| static constexpr [TicksPerMicrosecond](./tickspermicrosecond/) | 마이크로초당 틱 수. |
| static constexpr [TicksPerMillisecond](./tickspermillisecond/) | 밀리초당 틱 수. |
| static constexpr [TicksPerMinute](./ticksperminute/) | 분당 틱 수. |
| static constexpr [TicksPerSecond](./tickspersecond/) | 초당 틱 수. |
| static [UnixEpoch](./unixepoch/) | [DateTime](./) 클래스의 인스턴스로, Unix epoch 시작(1970.01.01 00:00:00)을 나타냅니다. |
## 비고



```cpp
#include "system/console.h"
#include "system/date_time.h"

int main()
{
  using namespace System;

  // 'DateTime' 클래스 인스턴스를 생성합니다.
  DateTime dateTime{1990, 10, 30};

  // 인스턴스를 여러 형식으로 출력합니다.
  Console::WriteLine(dateTime.ToShortDateString());
  Console::WriteLine(dateTime.ToShortTimeString());
  Console::WriteLine(dateTime.ToString());

  return 0;
}
/*
This code example produces the following output:
30.10.1990
0:00
30.10.1990 0:00:00
*/
```

## 또 보기

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
