---
title: "System::TimeZoneInfo クラス"
linktitle: "TimeZoneInfo"
second_title: "C++ 用 Aspose.Page"
description: "System::TimeZoneInfo クラス。特定のタイムゾーンを記述する情報を表します。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないと実行時エラーやアサーション失敗が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを C++ の関数への引数として使用してください。"
type: docs
weight: 6300
url: /ja/cpp/system/timezoneinfo/
---
## TimeZoneInfo class


特定のタイムゾーンを記述する情報を表します。このクラスのオブジェクトは [System::MakeObject()](../makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないと実行時エラーやアサーション失敗が発生します。常にこのクラスを [System::SmartPtr](../smartptr/) ポインタでラップし、そのポインタを関数への引数として使用してください。

```cpp
class TimeZoneInfo : public System::IEquatable<TimeZoneInfoPtr>
```

## Nested classes

* Class [AdjustmentRule](./adjustmentrule/)
* Class [TransitionTime](./transitiontime/)
## メソッド

| メソッド | 説明 |
| --- | --- |
| static [ClearCachedData](./clearcacheddata/)() | キャッシュされたタイムゾーンデータをクリアします。 |
| static [ConvertTime](./converttime/)(DateTime, const TimeZoneInfoPtr\&, const TimeZoneInfoPtr\&) | [Convert](../convert/) を使用して、あるタイムゾーンから別のタイムゾーンへ時間を変換します。 |
| static [ConvertTime](./converttime/)(const DateTimeOffset\&, const TimeZoneInfoPtr\&) | 指定されたタイムゾーンの時間に変換するには、[Convert](../convert/) を使用します。 |
| static [ConvertTime](./converttime/)(DateTime, const TimeZoneInfoPtr\&) | 指定されたタイムゾーンの時間に変換するには、[Convert](../convert/) を使用します。 |
| static [ConvertTimeBySystemTimeZoneId](./converttimebysystemtimezoneid/)(DateTime, const String\&) | 指定されたタイムゾーンの時間に変換するには、[Convert](../convert/) を使用します。 |
| static [ConvertTimeBySystemTimeZoneId](./converttimebysystemtimezoneid/)(const DateTimeOffset\&, const String\&) | 指定されたタイムゾーンの時間に変換するには、[Convert](../convert/) を使用します。 |
| static [ConvertTimeBySystemTimeZoneId](./converttimebysystemtimezoneid/)(DateTime, const String\&, const String\&) | 指定されたタイムゾーンの時間に変換するには、[Convert](../convert/) を使用します。 |
| static [ConvertTimeFromUtc](./converttimefromutc/)(DateTime, const TimeZoneInfoPtr\&) | UTC 時間を指定されたタイムゾーンの時間に変換します。 |
| static [ConvertTimeToUtc](./converttimetoutc/)(DateTime, const TimeZoneInfoPtr\&) | 時間を UTC 時間に変換します。 |
| static [ConvertTimeToUtc](./converttimetoutc/)(DateTime) | 時間を UTC 時間に変換します。 |
| static [ConvertTimeToUtcNoThrow](./converttimetoutcnothrow/)(DateTime) | 時間を UTC 時間に変換します。内部使用のみ。 |
| static [CreateCustomTimeZone](./createcustomtimezone/)(const String\&, TimeSpan, const String\&, const String\&, const String\&, const ArrayPtr\<AdjustmentRulePtr\>\&, bool) | カスタムタイムゾーンを作成します。 |
| static [CreateCustomTimeZone](./createcustomtimezone/)(const String\&, TimeSpan, const String\&, const String\&, const String\&, const ArrayPtr\<AdjustmentRulePtr\>\&) | カスタムタイムゾーンを作成します。 |
| static [CreateCustomTimeZone](./createcustomtimezone/)(const String\&, TimeSpan, const String\&, const String\&) | カスタムタイムゾーンを作成します。 |
| [Equals](./equals/)(SharedPtr\<Object\>) override |  |
| [Equals](./equals/)(TimeZoneInfoPtr) override | 現在のオブジェクトと指定されたオブジェクトが等しいかどうかを判定します。 |
| static [FindSystemTimeZoneById](./findsystemtimezonebyid/)(const String\&) | 指定された識別子のタイムゾーンを取得します。 |
| [get_BaseUtcOffset](./get_baseutcoffset/)() const | 現在のタイムゾーンの標準時と UTC 時間との間の時間間隔を表す [TimeSpan](../timespan/) のインスタンスを返します。 |
| [get_DaylightName](./get_daylightname/)() const | 現在のタイムゾーンのサマータイムの名前を取得します。 |
| [get_DisplayName](./get_displayname/)() const | 現在のタイムゾーンの名前を取得します。 |
| [get_Id](./get_id/)() const | 現在のオブジェクトが表すタイムゾーンの識別子を返します。 |
| static [get_Local](./get_local/)() | [TimeZoneInfo](./) のインスタンスを返します。これはローカルタイムゾーンを表します。 |
| [get_StandardName](./get_standardname/)() const | 現在のタイムゾーンの標準時の名前を取得します。 |
| [get_SupportsDaylightSavingTime](./get_supportsdaylightsavingtime/)() const | タイムゾーンにサマータイム規則があるかどうかを示すフラグを取得します。 |
| static [get_Utc](./get_utc/)() | [TimeZoneInfo](./) のインスタンスを返します。これは UTC タイムゾーンを表します。 |
| [GetAdjustmentRules](./getadjustmentrules/)() const | 現在の [TimeZoneInfo](./) オブジェクトに適用される調整規則を表す [AdjustmentRule](./adjustmentrule/) オブジェクトの配列を返します。 |
| [GetAmbiguousTimeOffsets](./getambiguoustimeoffsets/)(DateTime) const | 指定された日付と時刻にマッピングできる UTC の日付と時刻を取得します。 |
| [GetAmbiguousTimeOffsets](./getambiguoustimeoffsets/)(const DateTimeOffset\&) const | 指定された日付と時刻にマッピングできる UTC の日付と時刻を取得します。 |
| [GetHashCode](./gethashcode/)() const override | C# の [Object.GetHashCode()](../object/gethashcode/) メソッドの類似です。カスタムオブジェクトのハッシュ化を可能にします。 |
| static [GetSystemTimeZones](./getsystemtimezones/)() | ローカルシステムで利用可能なすべてのタイムゾーンのソートされたコレクションを取得します。 |
| [GetUtcOffset](./getutcoffset/)(DateTime) const | 指定された日時に対して、このタイムゾーンの時刻と UTC タイムゾーンの時刻との差を計算します。 |
| [GetUtcOffset](./getutcoffset/)(const DateTimeOffset\&) const | 指定された日時に対して、このタイムゾーンの時刻と UTC タイムゾーンの時刻との差を計算します。 |
| static [GetUtcOffsetFromUtc](./getutcoffsetfromutc/)(DateTime, const TimeZoneInfoPtr\&) | 指定されたタイムゾーンの UTC 日時に対する UTC オフセットを返す内部ヘルパー関数です。内部使用のみ。 |
| static [GetUtcOffsetFromUtc](./getutcoffsetfromutc/)(DateTime, const TimeZoneInfoPtr\&, bool\&, bool\&) | 指定されたタイムゾーンの UTC 日時に対する UTC オフセットを返す内部ヘルパー関数です。内部使用のみ。 |
| [GetUtcOffsetNoThrow](./getutcoffsetnothrow/)(DateTime) const | 指定された日時に対して、このタイムゾーンの時刻と UTC タイムゾーンの時刻との差を計算します。内部使用のみ。 |
| [HasSameRules](./hassamerules/)(const TimeZoneInfoPtr\&) const | 現在のタイムゾーンと別のタイムゾーンが同じ調整規則を持つかどうかをチェックします。 |
| [IsAmbiguousTime](./isambiguoustime/)(DateTime) const | 指定された日時が曖昧であり、複数の UTC 時間にマッピングできるかどうかをチェックします。 |
| [IsAmbiguousTime](./isambiguoustime/)(const DateTimeOffset\&) const | 指定された日時が曖昧であり、複数の UTC 時間にマッピングできるかどうかをチェックします。 |
| [IsDaylightSavingTime](./isdaylightsavingtime/)(DateTime) const | 指定された日時がサマータイムの範囲に入っているかどうかをチェックします。 |
| [IsDaylightSavingTime](./isdaylightsavingtime/)(const DateTimeOffset\&) const | 指定された日時がサマータイムの範囲に入っているかどうかをチェックします。 |
| [IsDaylightSavingTimeNoThrow](./isdaylightsavingtimenothrow/)(DateTime) const | 指定された日時がサマータイムの範囲に入っているかどうかをチェックします。 |
| [IsInvalidTime](./isinvalidtime/)(DateTime) const | 指定された日時が無効かどうかをチェックします。 |
| [ToString](./tostring/)() const override | C# の [Object.ToString()](../object/tostring/) メソッドの類似です。カスタムオブジェクトを文字列に変換できるようにします。 |
| static [TransitionTimeToDateTime](./transitiontimetodatetime/)(int32_t, const TransitionTime\&) | 年と [TransitionTime](./transitiontime/) を [DateTime](../datetime/) に変換するヘルパー関数です。 |
## Typedefs

| 型定義 | 説明 |
| --- | --- |
| [AdjustmentRulePtr](./adjustmentruleptr/) | [AdjustmentRule](./adjustmentrule/) クラスのインスタンスへの共有ポインタのエイリアスです。 |
## 参照

* Class [IEquatable](../iequatable/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
