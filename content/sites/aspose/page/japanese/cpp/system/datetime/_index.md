---
title: "System::DateTime クラス"
linktitle: "DateTime"
second_title: "C++ 用 Aspose.Page"
description: "System::DateTime クラス。時間連続体上の特定の日付と時刻の値を表します。この型はスタック上に割り当て、値または参照で関数に渡すべきです。C++ でこの型のオブジェクトを管理するために System::SmartPtr クラスを使用しないでください。"
type: docs
weight: 1600
url: /ja/cpp/system/datetime/
---
## DateTime class


時間連続体上の特定の日付と時刻の値を表します。この型はスタック上に割り当て、値または参照で関数に渡すべきです。[System::SmartPtr](../smartptr/) クラスを使用してこの型のオブジェクトを管理しないでください。

```cpp
class DateTime
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [Add](./add/)(TimeSpan) const | 現在のオブジェクトが表す日付と時刻に指定された時間間隔を加算した結果の日時を表す、[DateTime](./) クラスの新しいインスタンスを返します。 |
| [AddDays](./adddays/)(double) const | 現在のオブジェクトが表す値と指定された日数の合計となる日時を表す、[DateTime](./) クラスの新しいインスタンスを返します。 |
| [AddHours](./addhours/)(double) const | 現在のオブジェクトが表す値と指定された時間数の合計となる日時を表す、[DateTime](./) クラスの新しいインスタンスを返します。 |
| [AddMilliseconds](./addmilliseconds/)(double) const | 現在のオブジェクトが表す値と指定されたミリ秒数の合計となる日時を表す、[DateTime](./) クラスの新しいインスタンスを返します。 |
| [AddMinutes](./addminutes/)(double) const | 現在のオブジェクトが表す値と指定された分数の合計となる日時を表す、[DateTime](./) クラスの新しいインスタンスを返します。 |
| [AddMonths](./addmonths/)(int) const | 現在のオブジェクトが表す値と指定された月数の合計となる日時を表す、[DateTime](./) クラスの新しいインスタンスを返します。 |
| [AddSeconds](./addseconds/)(double) const | 現在のオブジェクトが表す値と指定された秒数の合計となる日時を表す、[DateTime](./) クラスの新しいインスタンスを返します。 |
| [AddTicks](./addticks/)(int64_t) const | 現在のオブジェクトが表す値と指定された 100 ナノ秒間隔の合計となる日時を表す、[DateTime](./) クラスの新しいインスタンスを返します。 |
| [AddYears](./addyears/)(int) const | 現在のオブジェクトが表す日時の年コンポーネントを指定された数だけ増加させた日時を表す、[DateTime](./) クラスの新しいインスタンスを返します。 |
| static [Compare](./compare/)(DateTime, DateTime) | 指定された [DateTime](./) クラスのインスタンスが表す2つの値を比較し、時間軸上での相対的な位置を示す値を返します。 |
| [CompareTo](./compareto/)(DateTime) const | 現在のオブジェクトと指定された [DateTime](./) クラスのインスタンスが表す2つの日付時刻値を比較し、時間軸上での相対的な位置を示す値を返します。 |
| [DateTime](./datetime/)() | 最小可能な日時である MinValue と等しいインスタンスを構築します。 |
| [DateTime](./datetime/)(int, int, int) | 特定の年、月、日で指定された日時を表すインスタンスを構築します。 |
| [DateTime](./datetime/)(int, int, int, const SharedPtr\<Globalization::Calendar\>\&) | 指定されたカレンダーで特定の年、月、日で指定された日時を表すインスタンスを構築します。 |
| [DateTime](./datetime/)(int, int, int, int, int, int) | 特定の年、月、日、時、分、秒で指定された日時値を表すインスタンスを作成します。 |
| [DateTime](./datetime/)(int, int, int, int, int, int, DateTimeKind) | 特定の年、月、日、時、分、秒で指定された日時値を表すインスタンスを作成します。 |
| [DateTime](./datetime/)(int, int, int, int, int, int, const SharedPtr\<Globalization::Calendar\>\&) | 指定されたカレンダーで、特定の年、月、日、時、分、秒で指定された日時値を表すインスタンスを作成します。 |
| [DateTime](./datetime/)(int, int, int, int, int, int, int, DateTimeKind) | 特定の年、月、日、時、分、秒、ミリ秒で指定された日時値を表すインスタンスを作成します。 |
| [DateTime](./datetime/)(int, int, int, int, int, int, int, const SharedPtr\<Globalization::Calendar\>\&, DateTimeKind) | 指定されたカレンダーで、特定の年、月、日、時、分、秒、ミリ秒で指定された日時値を表すインスタンスを作成します。 |
| [DateTime](./datetime/)(int64_t, DateTimeKind) | ティック数で指定された日時値を表すインスタンスを作成します。 |
| [DateTime](./datetime/)(int64_t, DateTimeKind, bool) | ティック数で指定された日時値を表すインスタンスを作成します。内部使用専用。 |
| [DateTime](./datetime/)(const DateTime\&) | インスタンスをコピー構築します。 |
| static [DaysInMonth](./daysinmonth/)(int, int) | 指定された年の指定された月の日数を返します。 |
| static [Equals](./equals/)(DateTime, DateTime) | [DateTime](./) クラスの指定されたインスタンスが同じ日時値を表すかどうかを判断します。 |
| [Equals](./equals/)(DateTime) const | [DateTime](./) クラスの指定されたインスタンスが現在のオブジェクトと同じ日時値を表すかどうかを判断します。 |
| static [FromBinary](./frombinary/)(int64_t) | 指定された符号なし 64 ビット整数から日時値をデシリアライズし、その値で新しい [DateTime](./) クラスのインスタンスを設定します。 |
| static [FromFileTime](./fromfiletime/)(int64_t) | 指定されたファイル時間を、ローカル時間と同じ日時値を表す [DateTime](./) クラスのインスタンスに変換します。 |
| static [FromFileTimeUtc](./fromfiletimeutc/)(int64_t) | 指定されたファイル時間を、UTC 時間と同じ日時値を表す [DateTime](./) クラスのインスタンスに変換します。 |
| static [FromOADate](./fromoadate/)(double) | 指定された OLE Automation Date と等価な日時値を表す [DateTime](./) クラスのインスタンスを返します。 |
| static [FromUnixTime](./fromunixtime/)(time_t) | 指定された Unix 時間値を [DateTime](./) クラスのインスタンスに変換します。内部使用専用。 |
| [get_Date](./get_date/)() const | 現在のオブジェクトが表す日時のうち、時間部分の各コンポーネントを 0 に設定した日付部分だけを表す新しい [DateTime](./) クラスのインスタンスを返します。 |
| [get_Day](./get_day/)() const | 現在のオブジェクトが表す月における日の序数を返します。 |
| [get_DayOfWeek](./get_dayofweek/)() const | 現在のオブジェクトが表す曜日を表す値を返します。 |
| [get_DayOfYear](./get_dayofyear/)() const | 現在のオブジェクトが表す年における日の序数を返します。 |
| [get_Hour](./get_hour/)() const | 現在のオブジェクトが表す日時値の時間コンポーネントを返します。 |
| [get_Kind](./get_kind/)() const | 現在のオブジェクトが表す日時がローカルか UTC か、あるいはどちらでもないかを表す値を返します。 |
| [get_Millisecond](./get_millisecond/)() const | 現在のオブジェクトが表す日時値のミリ秒コンポーネントを返します。 |
| [get_Minute](./get_minute/)() const | 現在のオブジェクトが表す日時値の分コンポーネントを返します。 |
| [get_Month](./get_month/)() const | 現在のオブジェクトが表す年における月の序数を返します。 |
| static [get_Now](./get_now/)() | 現在時刻をローカル時間として表す [DateTime](./) クラスのインスタンスを返します。 |
| [get_Second](./get_second/)() const | 現在のオブジェクトが表す日時値の秒コンポーネントを返します。 |
| [get_Ticks](./get_ticks/)() const | 現在のオブジェクトが表す日時まで、グレゴリオ暦の紀元元年1月1日 0:00:00 UTC から経過した 100 ナノ秒間隔の数を返します。 |
| [get_TimeOfDay](./get_timeofday/)() const | 現在のオブジェクトが表す日の開始時点から同オブジェクトが表す日時までの時間間隔を表す値を返します。 |
| static [get_Today](./get_today/)() | [DateTime](./) クラスのインスタンスを返します。このインスタンスは、オブジェクトが表す値の時間部分の各コンポーネントを 0 に設定した、現在の日付を表します。 |
| static [get_UtcNow](./get_utcnow/)() | [DateTime](./) クラスのインスタンスを返します。このインスタンスは、現在の時刻を UTC として表します。 |
| [get_Year](./get_year/)() const | 現在のオブジェクトが表す年を返します。 |
| [GetDateComponents](./getdatecomponents/)(int\&, int\&, int\&) const | 日付の部分を取得します。内部使用のみ。 |
| [GetDateTimeFormats](./getdatetimeformats/)() const | 標準の日付時刻書式指定子のいずれかでフォーマットされた、現在のオブジェクトの文字列表現を要素とする文字列配列を返します。 |
| [GetDateTimeFormats](./getdatetimeformats/)(char_t) const | 指定された標準の日付時刻書式指定子でフォーマットされた、現在のオブジェクトの文字列表現を要素とする文字列配列を返します。 |
| [GetDateTimeFormats](./getdatetimeformats/)(const SharedPtr\<IFormatProvider\>\&) const | 標準の日付時刻書式指定子のいずれかと、指定された書式プロバイダーを使用してフォーマットされた、現在のオブジェクトの文字列表現を要素とする文字列配列を返します。 |
| [GetDateTimeFormats](./getdatetimeformats/)(char_t, const SharedPtr\<IFormatProvider\>\&) const | 指定された標準の日付時刻書式指定子と書式プロバイダーでフォーマットされた、現在のオブジェクトの文字列表現を要素とする文字列配列を返します。 |
| [GetHashCode](./gethashcode/)() const | 現在のオブジェクトのハッシュコードを返します。 |
| [IsDaylightSavingTime](./isdaylightsavingtime/)() const | 現在のオブジェクトが表す日時が、現在のタイムゾーンのサマータイム（夏時間）範囲に含まれるかどうかを判定します。 |
| static [IsLeapYear](./isleapyear/)(int) | 指定された年がうるう年かどうかを判定します。 |
| [IsNull](./isnull/)() const |  |
| [operator!=](./operator!=/)(DateTime) const | 現在のオブジェクトと指定された [DateTime](./) オブジェクトが異なる日時値を表すかどうかを判定します。 |
| [operator!=](./operator!=/)(std::nullptr_t) const |  |
| [operator+](./operator+/)(TimeSpan) const | [DateTime](./) クラスの新しいインスタンスを返します。このインスタンスは、現在のオブジェクトが表す値と指定された時間間隔の合計を表す日時値です。 |
| [operator+=](./operator+=/)(TimeSpan) | 現在のオブジェクトを、現在のオブジェクトが表す値と指定された時間間隔の合計である日時値に設定します。 |
| [operator-](./operator-/)(TimeSpan) const | [DateTime](./) クラスの新しいインスタンスを返します。このインスタンスは、現在のオブジェクトが表す値から指定された時間間隔を減算した結果の日時値を表します。 |
| [operator-](./operator-/)(DateTime) const | 現在のオブジェクトと指定されたオブジェクトが表す日時値間の時間間隔を表す [TimeSpan](../timespan/) クラスのインスタンスを返します。 |
| [operator-=](./operator-=/)(TimeSpan) | 現在のオブジェクトを、現在のオブジェクトが表す日時値から指定された時間間隔を減算した結果の日時値に設定します。 |
| [operator<](./operator_/)(DateTime) const | 現在のオブジェクトが、指定された [DateTime](./) オブジェクトが表す値よりも早い日時値を表すかどうかを判定します。 |
| [operator<](./operator_/)(std::nullptr_t) const |  |
| [operator<=](./operator_=/)(DateTime) const | 現在のオブジェクトが、指定された [DateTime](./) オブジェクトが表す値と同じかそれよりも早い日時値を表すかどうかを判定します。 |
| [operator<=](./operator_=/)(std::nullptr_t) const |  |
| [operator=](./operator=/)(const DateTime\&) | 指定された [DateTime](./) インスタンスが表す値を現在のオブジェクトに代入します。 |
| [operator==](./operator==/)(DateTime) const | 現在のオブジェクトと指定された [DateTime](./) オブジェクトが同じ日時値を表すかどうかを判定します。 |
| [operator==](./operator==/)(std::nullptr_t) const |  |
| [operator>](./operator_/)(DateTime) const | 現在のオブジェクトが、指定された [DateTime](./) オブジェクトが表す値よりも後の日時値を表すかどうかを判定します。 |
| [operator>](./operator_/)(std::nullptr_t) const |  |
| [operator>=](./operator_=/)(DateTime) const | 現在のオブジェクトが、指定された [DateTime](./) オブジェクトが表す値と同じかそれよりも後の日時値を表すかどうかを判定します。 |
| [operator>=](./operator_=/)(std::nullptr_t) const |  |
| static [Parse](./parse/)(const String\&) | 指定された日時値の文字列表現を、同等の [DateTime](./) オブジェクトに変換します。 |
| static [Parse](./parse/)(const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles) | 指定された日付と時刻値の文字列表現を、カルチャ固有の書式情報を使用して同等の [DateTime](./) オブジェクトに変換します。 |
| static [Parse](./parse/)(const String\&, const SharedPtr\<Globalization::CultureInfo\>\&, Globalization::DateTimeStyles) |  |
| static [Parse](./parse/)(const String\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, Globalization::DateTimeStyles) |  |
| static [Parse](./parse/)(const String\&, std::nullptr_t, Globalization::DateTimeStyles) |  |
| static [ParseExact](./parseexact/)(const String\&, const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles) | 指定された書式とカルチャ固有の書式情報を使用して、指定された日付と時刻値の文字列表現を同等の [DateTime](./) オブジェクトに変換します。文字列の書式は指定された書式と完全に一致している必要があります。変換に失敗した場合は例外をスローします。 |
| static [ParseExact](./parseexact/)(const String\&, const String\&, const SharedPtr\<Globalization::CultureInfo\>\&, Globalization::DateTimeStyles) |  |
| static [ParseExact](./parseexact/)(const String\&, const String\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, Globalization::DateTimeStyles) |  |
| static [ParseExact](./parseexact/)(const String\&, const String\&, std::nullptr_t, Globalization::DateTimeStyles) |  |
| static [ParseExact](./parseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles) | 指定された書式群、カルチャ固有の書式情報、およびスタイルを使用して、指定された日付と時刻値の文字列表現を同等の [DateTime](./) オブジェクトに変換します。文字列の書式は指定された書式のいずれかと完全に一致している必要があります。変換に失敗した場合は例外をスローします。 |
| static [ParseExact](./parseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<Globalization::CultureInfo\>\&, Globalization::DateTimeStyles) |  |
| static [ParseExact](./parseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, Globalization::DateTimeStyles) |  |
| static [ParseExact](./parseexact/)(const String\&, const ArrayPtr\<String\>\&, std::nullptr_t, Globalization::DateTimeStyles) |  |
| static [SpecifyKind](./specifykind/)(DateTime, DateTimeKind) | 指定された [DateTime](./) オブジェクトと同じティック数を表し、引数 **kind** で指定されたとおりにローカル時間、UTC 時間、またはどちらでもない時間を表す新しい [DateTime](./) オブジェクトを構築します。 |
| [Subtract](./subtract/)(TimeSpan) const | [DateTime](./) クラスの新しいインスタンスを返します。このインスタンスは、現在のオブジェクトが表す値から指定された時間間隔を減算した結果の日時値を表します。 |
| [Subtract](./subtract/)(DateTime) const | 現在のオブジェクトと指定されたオブジェクトが表す日付と時刻の値の間の時間間隔を表す [TimeSpan](../timespan/) クラスのインスタンスを返します。 |
| [ToBinary](./tobinary/)() const | 現在のオブジェクトをシリアライズします。 |
| [ToFileTime](./tofiletime/)() const | 現在のオブジェクトが表す日付と時刻の値をファイル時間として表す値を返します。 |
| [ToFileTimeUtc](./tofiletimeutc/)() const | 現在のオブジェクトが表す日付と時刻の値を UTC のファイル時間に変換します。 |
| [ToLocalTime](./tolocaltime/)() const | 現在のオブジェクトが表す日付と時刻の値をローカル時間として表す新しい [DateTime](./) クラスのインスタンスを返します。 |
| [ToLongDateString](./tolongdatestring/)() const | 現在のオブジェクトの長い日付文字列表現を含む文字列を返します。 |
| [ToLongTimeString](./tolongtimestring/)() const | 現在のオブジェクトの長い時刻文字列表現を含む文字列を返します。 |
| [ToOADate](./tooadate/)() const | 現在のオブジェクトが表す日付と時刻の値を OLE Automation Date として返します。 |
| [ToShortDateString](./toshortdatestring/)() const | 現在のオブジェクトの短い日付文字列表現を含む文字列を返します。 |
| [ToShortTimeString](./toshorttimestring/)() const | 現在のオブジェクトの短い時刻文字列表現を含む文字列を返します。 |
| [ToString](./tostring/)() const | 現在のオブジェクトが表す日付と時刻の値を、現在のカルチャで定義された書式規則を使用して文字列として返します。 |
| [ToString](./tostring/)(const String\&) const | 現在のオブジェクトが表す日付と時刻の値を、指定された書式と現在のカルチャで定義された書式規則を使用して文字列として返します。 |
| [ToString](./tostring/)(const SharedPtr\<IFormatProvider\>\&) const | 現在のオブジェクトが表す日付と時刻の値を、指定された書式情報を使用して文字列として返します。 |
| [ToString](./tostring/)(const SharedPtr\<Globalization::CultureInfo\>\&) const |  |
| [ToString](./tostring/)(const SharedPtr\<Globalization::DateTimeFormatInfo\>\&) const |  |
| [ToString](./tostring/)(std::nullptr_t) const |  |
| [ToString](./tostring/)(const String\&, const SharedPtr\<IFormatProvider\>\&) const | 現在のオブジェクトが表す日付と時刻の値を、指定された書式情報を使用して文字列として返します。 |
| [ToString](./tostring/)(const String\&, const SharedPtr\<Globalization::CultureInfo\>\&) const |  |
| [ToString](./tostring/)(const String\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&) const |  |
| [ToString](./tostring/)(const String\&, std::nullptr_t) const |  |
| [ToUniversalTime](./touniversaltime/)() const | 現在のオブジェクトが表す日付と時刻の値を UTC として表す新しい [DateTime](./) クラスのインスタンスを返します。 |
| [ToUnixTime](./tounixtime/)() const | 現在のオブジェクトが表す日付と時刻の値を Unix 時間として表す値を返します。内部使用のみ。 |
| static [TryParse](./tryparse/)(const String\&, DateTime\&) | 指定された日時値の文字列表現を、同等の [DateTime](./) オブジェクトに変換します。 |
| static [TryParse](./tryparse/)(const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles, DateTime\&) | 指定されたカルチャ固有の書式情報とスタイルを使用して、指定された日付と時刻値の文字列表現を同等の [DateTime](./) オブジェクトに変換します。 |
| static [TryParse](./tryparse/)(const String\&, const SharedPtr\<Globalization::CultureInfo\>\&, Globalization::DateTimeStyles, DateTime\&) |  |
| static [TryParse](./tryparse/)(const String\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, Globalization::DateTimeStyles, DateTime\&) |  |
| static [TryParse](./tryparse/)(const String\&, std::nullptr_t, Globalization::DateTimeStyles, DateTime\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles, DateTime\&) | 指定された書式、カルチャ固有の書式情報、およびスタイルを使用して、指定された日付と時刻値の文字列表現を同等の [DateTime](./) オブジェクトに変換します。文字列の書式は指定された書式と完全に一致している必要があります。 |
| static [TryParseExact](./tryparseexact/)(const String\&, const String\&, const SharedPtr\<Globalization::CultureInfo\>\&, Globalization::DateTimeStyles, DateTime\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const String\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, Globalization::DateTimeStyles, DateTime\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const String\&, std::nullptr_t, Globalization::DateTimeStyles, DateTime\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles, DateTime\&) | 指定された書式群、カルチャ固有の書式情報、およびスタイルを使用して、指定された日付と時刻値の文字列表現を同等の [DateTime](./) オブジェクトに変換します。文字列の書式は指定された書式のいずれかと完全に一致している必要があります。 |
| static [TryParseExact](./tryparseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<Globalization::CultureInfo\>\&, Globalization::DateTimeStyles, DateTime\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, Globalization::DateTimeStyles, DateTime\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const ArrayPtr\<String\>\&, std::nullptr_t, Globalization::DateTimeStyles, DateTime\&) |  |
| static [Type](./type/)() | このクラスに関する情報を含む [TypeInfo](../typeinfo/) オブジェクトを返します。 |
## フィールド

| フィールド | 説明 |
| --- | --- |
| static constexpr [MaxTicks](./maxticks/) | 最小可能な [DateTime](./) 値と最大可能な [DateTime](./) 値の間の時間間隔を表す 100 ナノ秒単位の数です。 |
| static [MaxValue](./maxvalue/) | 最大可能な日付と時刻の値を表す [DateTime](./) クラスのインスタンスです。 |
| static constexpr [MinTicks](./minticks/) | [DateTime](./) クラスのインスタンスが表すことのできる最小のティック数です。 |
| static [MinValue](./minvalue/) | [DateTime](./) クラスのインスタンスで、可能な最小の日付と時刻の値を表します。 |
| static constexpr [TicksPerDay](./ticksperday/) | 1日あたりのティック数です。 |
| static constexpr [TicksPerHour](./ticksperhour/) | 1時間あたりのティック数です。 |
| static constexpr [TicksPerMicrosecond](./tickspermicrosecond/) | 1マイクロ秒あたりのティック数です。 |
| static constexpr [TicksPerMillisecond](./tickspermillisecond/) | 1ミリ秒あたりのティック数です。 |
| static constexpr [TicksPerMinute](./ticksperminute/) | 1分あたりのティック数です。 |
| static constexpr [TicksPerSecond](./tickspersecond/) | 1秒あたりのティック数です。 |
| static [UnixEpoch](./unixepoch/) | [DateTime](./) クラスのインスタンスで、Unix エポック開始 (1970.01.01 00:00:00) を表します。 |
## 備考



```cpp
#include "system/console.h"
#include "system/date_time.h"

int main()
{
  using namespace System;

  // 'DateTime' クラスのインスタンスを作成します。
  DateTime dateTime{1990, 10, 30};

  // インスタンスを複数の形式で出力します。
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

## 参照

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
