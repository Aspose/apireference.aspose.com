---
title: "System::DateTimeOffset クラス"
linktitle: "DateTimeOffset"
second_title: "C++ 用 Aspose.Page"
description: "System::DateTimeOffset クラス。協定世界時 (UTC) に対する日付と時刻を含みます。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new でインスタンスを作成しないでください。そうしないと実行時エラーやアサーション違反が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを C++ の関数引数として渡してください。"
type: docs
weight: 1700
url: /ja/cpp/system/datetimeoffset/
---
## DateTimeOffset class


協定世界時 (UTC) に対する日付と時刻を含みます。このクラスのオブジェクトは [System::MakeObject()](../makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new でインスタンスを作成しないでください。そうしないと実行時エラーやアサーション違反が発生します。常にこのクラスを [System::SmartPtr](../smartptr/) ポインタでラップし、そのポインタを関数の引数として渡してください。

```cpp
class DateTimeOffset
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [Add](./add/)(TimeSpan) const | [DateTimeOffset](./) オブジェクトに指定された時間間隔を加算します。 |
| [AddDays](./adddays/)(double) const | [DateTimeOffset](./) オブジェクトに指定された日数を加算します。 |
| [AddHours](./addhours/)(double) const | [DateTimeOffset](./) オブジェクトに指定された時間数を加算します。 |
| [AddMilliseconds](./addmilliseconds/)(double) const | [DateTimeOffset](./) オブジェクトに指定されたミリ秒数を加算します。 |
| [AddMinutes](./addminutes/)(double) const | [DateTimeOffset](./) オブジェクトに指定された分数を加算します。 |
| [AddMonths](./addmonths/)(int) const | [DateTimeOffset](./) オブジェクトに指定された月数を加算します。 |
| [AddSeconds](./addseconds/)(double) const | [DateTimeOffset](./) オブジェクトに指定された秒数を加算します。 |
| [AddTicks](./addticks/)(int64_t) const | [DateTimeOffset](./) オブジェクトに指定されたティック数を加算します。 |
| [AddYears](./addyears/)(int) const | [DateTimeOffset](./) オブジェクトに指定された年数を加算します。 |
| static [Compare](./compare/)(const DateTimeOffset\&, const DateTimeOffset\&) | 2つの[DateTimeOffset](./)オブジェクトを比較します。 |
| [CompareTo](./compareto/)(const DateTimeOffset\&) const | 2つの[DateTimeOffset](./)オブジェクトを比較します。 |
| [CompareTo](./compareto/)(const SharedPtr\<Object\>\&) const | 2つの[DateTimeOffset](./)オブジェクトを比較します。 |
| [DateTimeOffset](./datetimeoffset/)() | デフォルトコンストラクタ。 |
| [DateTimeOffset](./datetimeoffset/)(DateTime) | コンストラクタ。 |
| [DateTimeOffset](./datetimeoffset/)(int64_t, TimeSpan) | コンストラクタ。 |
| [DateTimeOffset](./datetimeoffset/)(DateTime, TimeSpan) | コンストラクタ。 |
| [DateTimeOffset](./datetimeoffset/)(int, int, int, int, int, int, TimeSpan) | コンストラクタ。 |
| [DateTimeOffset](./datetimeoffset/)(int, int, int, int, int, int, int, TimeSpan) | コンストラクタ。 |
| [DateTimeOffset](./datetimeoffset/)(int, int, int, int, int, int, int, const SharedPtr\<Globalization::Calendar\>\&, TimeSpan) | コンストラクタ。 |
| static [Equals](./equals/)(const DateTimeOffset\&, const DateTimeOffset\&) | 2つの[DateTimeOffset](./)オブジェクトが同じ時点を表すかどうかを確認します。 |
| [Equals](./equals/)(const DateTimeOffset\&) const | 2つの[DateTimeOffset](./)オブジェクトが同じ時点を表すかどうかを確認します。 |
| [Equals](./equals/)(const SharedPtr\<Object\>\&) const | 2つの[DateTimeOffset](./)オブジェクトが同じ時点を表すかどうかを確認します。 |
| [EqualsExact](./equalsexact/)(const DateTimeOffset\&) const | 2つの[DateTimeOffset](./)オブジェクトが同じ時点を表し、かつ同じオフセットを持つかどうかを確認します。 |
| [EqualsExact](./equalsexact/)(const SharedPtr\<Object\>\&) const | 2つの[DateTimeOffset](./)オブジェクトが同じ時点を表し、かつ同じオフセットを持つかどうかを確認します。 |
| static [FromFileTime](./fromfiletime/)(int64_t) | [Convert](../convert/)[Windows](../../system.windows/) ファイル時間をローカル時刻オフセット付きの日付と時刻に変換します。 |
| static [FromUnixTimeMilliseconds](./fromunixtimemilliseconds/)(int64_t) | [Convert](../convert/) Unix 時間を[DateTimeOffset](./)オブジェクトに変換します。 |
| static [FromUnixTimeSeconds](./fromunixtimeseconds/)(int64_t) | [Convert](../convert/) Unix 時間を[DateTimeOffset](./)オブジェクトに変換します。 |
| [get_Date](./get_date/)() const | 現在のオブジェクトの日付コンポーネントを取得します。 |
| [get_DateTime](./get_datetime/)() const | [DateTime](../datetime/) の値を取得します。 |
| [get_Day](./get_day/)() const | 現在のオブジェクトの月の日を取得します。 |
| [get_DayOfWeek](./get_dayofweek/)() const | 現在のオブジェクトの曜日を取得します。 |
| [get_DayOfYear](./get_dayofyear/)() const | 現在のオブジェクトの年内の日を取得します。 |
| [get_Hour](./get_hour/)() const | 現在のオブジェクトの時間コンポーネントを取得します。 |
| [get_LocalDateTime](./get_localdatetime/)() const | ローカルの日付と時刻を表す[DateTime](../datetime/)の値を取得します。 |
| [get_Millisecond](./get_millisecond/)() const | 現在のオブジェクトのミリ秒コンポーネントを取得します。 |
| [get_Minute](./get_minute/)() const | 現在のオブジェクトの分コンポーネントを取得します。 |
| [get_Month](./get_month/)() const | 現在のオブジェクトの月コンポーネントを取得します。 |
| static [get_Now](./get_now/)() | 現在のローカル時間に設定された日付と時刻、そしてローカル時間のオフセットが設定された[DateTimeOffset](./)を取得します。 |
| [get_Offset](./get_offset/)() const | UTC からのオフセットを取得します。 |
| [get_Second](./get_second/)() const | 現在のオブジェクトの秒コンポーネントを取得します。 |
| [get_Ticks](./get_ticks/)() const | 現在のオブジェクトのティック数を取得します。 |
| [get_TimeOfDay](./get_timeofday/)() const | 現在のオブジェクトの1日の時間を取得します。 |
| [get_UtcDateTime](./get_utcdatetime/)() const | UTC の日付と時刻を表す[DateTime](../datetime/)の値を取得します。 |
| static [get_UtcNow](./get_utcnow/)() | 現在の UTC 時間に設定された日付と時刻、そしてオフセットが[TimeSpan::Zero](../timespan/zero/)である[DateTimeOffset](./)を取得します。 |
| [get_UtcTicks](./get_utcticks/)() const | UTC 時間での現在のオブジェクトのティック数を取得します。 |
| [get_Year](./get_year/)() const | 現在のオブジェクトの年コンポーネントを取得します。 |
| [GetHashCode](./gethashcode/)() const | 現在の [DateTimeOffset](./) オブジェクトのハッシュコードを取得します。 |
| [IsNull](./isnull/)() const |  |
| [operator!=](./operator!=/)(const DateTimeOffset\&) const | 現在のオブジェクトと指定された [DateTimeOffset](./) オブジェクトが異なる日付と時刻の値を表すかどうかを判断します。 |
| [operator!=](./operator!=/)(std::nullptr_t) const |  |
| [operator+](./operator+/)(TimeSpan) const | 現在のオブジェクトが表す値と指定された時間間隔の合計を表す日付と時刻の値を持つ、新しい [DateTimeOffset](./) クラスのインスタンスを返します。 |
| [operator-](./operator-/)(TimeSpan) const | 現在のオブジェクトが表す値から指定された時間間隔を減算した結果の日時値を表す、新しい [DateTimeOffset](./) クラスのインスタンスを返します。 |
| [operator-](./operator-/)(const DateTimeOffset\&) const | 現在のオブジェクトと指定されたオブジェクトが表す日時値間の時間間隔を表す [TimeSpan](../timespan/) クラスのインスタンスを返します。 |
| [operator<](./operator_/)(const DateTimeOffset\&) const | 現在のオブジェクトが、指定された [DateTimeOffset](./) オブジェクトが表す値よりも早い日時の値を表すかどうかを判断します。 |
| [operator<](./operator_/)(std::nullptr_t) const |  |
| [operator<=](./operator_=/)(const DateTimeOffset\&) const | 現在のオブジェクトが、指定された [DateTimeOffset](./) オブジェクトが表す値と同じかそれよりも早い日時の値を表すかどうかを判断します。 |
| [operator<=](./operator_=/)(std::nullptr_t) const |  |
| [operator==](./operator==/)(const DateTimeOffset\&) const | 現在のオブジェクトと指定された [DateTimeOffset](./) オブジェクトが同じ日時の値を表すかどうかを判断します。 |
| [operator==](./operator==/)(std::nullptr_t) const |  |
| [operator>](./operator_/)(const DateTimeOffset\&) const | 現在のオブジェクトが、指定された [DateTimeOffset](./) オブジェクトが表す値よりも遅い日時の値を表すかどうかを判断します。 |
| [operator>](./operator_/)(std::nullptr_t) const |  |
| [operator>=](./operator_=/)(const DateTimeOffset\&) const | 現在のオブジェクトが、指定された [DateTimeOffset](./) オブジェクトが表す値と同じかそれよりも遅い日時の値を表すかどうかを判断します。 |
| [operator>=](./operator_=/)(std::nullptr_t) const |  |
| static [Parse](./parse/)(const String\&) | 指定された文字列を [DateTimeOffset](./) に変換します。 |
| static [Parse](./parse/)(const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles) | 指定された文字列を、指定された書式プロバイダーと書式スタイルを使用して [DateTimeOffset](./) オブジェクトに変換します。 |
| static [ParseExact](./parseexact/)(const String\&, const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles) | 指定された文字列を、指定された書式、書式プロバイダー、および書式スタイルを使用して [DateTimeOffset](./) オブジェクトに変換します。 |
| static [ParseExact](./parseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles) | 指定された文字列を、指定された書式群、書式プロバイダー、および書式スタイルを使用して [DateTimeOffset](./) オブジェクトに変換します。 |
| [Subtract](./subtract/)(TimeSpan) const | 現在のオブジェクトから指定された時間間隔を減算します。 |
| [Subtract](./subtract/)(const DateTimeOffset\&) const | 現在のオブジェクトから指定された [DateTimeOffset](./) の値を減算します。 |
| [ToFileTime](./tofiletime/)() const | 現在のオブジェクトを [Windows](../../system.windows/) ファイル時間に変換します。 |
| [ToLocalTime](./tolocaltime/)() const | 現在のオブジェクトをローカル時間を表すオブジェクトに変換します。 |
| [ToOffset](./tooffset/)(TimeSpan) const | 現在のオブジェクトのオフセットを指定されたオフセットに置き換えます。 |
| [ToString](./tostring/)(const String\&, const SharedPtr\<IFormatProvider\>\&) const | 現在のオブジェクトを、指定された書式と書式プロバイダーを使用して文字列に変換します。 |
| [ToString](./tostring/)(const SharedPtr\<IFormatProvider\>\&) const | 現在のオブジェクトを、指定された書式プロバイダーを使用して文字列に変換します。 |
| [ToString](./tostring/)(const String\&) const | 現在のオブジェクトを、指定された書式を使用して文字列に変換します。 |
| [ToString](./tostring/)() const | 現在のオブジェクトを文字列に変換します。 |
| [ToUniversalTime](./touniversaltime/)() const | 現在のオブジェクトを UTC 時間を表すオブジェクトに変換します。 |
| [ToUnixTimeMilliseconds](./tounixtimemilliseconds/)() const | Unix エポック開始から経過したミリ秒を取得します。 |
| [ToUnixTimeSeconds](./tounixtimeseconds/)() const | Unixエポック開始から経過した秒数を取得します。 |
| static [TryParse](./tryparse/)(const String\&, DateTimeOffset\&) | 指定された文字列を [DateTimeOffset](./) オブジェクトに変換しようとします。 |
| static [TryParse](./tryparse/)(const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles, DateTimeOffset\&) | 指定された文字列を、指定されたフォーマットプロバイダーと書式設定スタイルを使用して [DateTimeOffset](./) オブジェクトに変換しようとします。 |
| static [TryParseExact](./tryparseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles, DateTimeOffset\&) | 指定された文字列を、指定されたフォーマット群、フォーマットプロバイダー、および書式設定スタイルを使用して [DateTimeOffset](./) オブジェクトに変換しようとします。 |
| static [TryParseExact](./tryparseexact/)(const String\&, const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles, DateTimeOffset\&) | 指定された文字列を、指定されたフォーマット、フォーマットプロバイダー、および書式設定スタイルを使用して [DateTimeOffset](./) オブジェクトに変換しようとします。 |
| static [Type](./type/)() | [TimeSpan](../timespan/) 構造体を表す [TypeInfo](../typeinfo/) オブジェクトを返します。 |
## フィールド

| フィールド | 説明 |
| --- | --- |
| static constexpr [MaxOffset](./maxoffset/) | ティック単位の最大オフセットを取得します。 |
| static [MaxValue](./maxvalue/) | 最大の [DateTimeOffset](./) 値を取得します。 |
| static constexpr [MinOffset](./minoffset/) | ティック単位の最小オフセットを取得します。 |
| static [MinValue](./minvalue/) | 最も早い [DateTimeOffset](./) 値を取得します。 |
| static [UnixEpoch](./unixepoch/) | Unixエポック開始時点を取得します。 |
## 参照

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
