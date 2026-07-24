---
title: "System::Globalization::DateTimeFormatInfo クラス"
linktitle: "DateTimeFormatInfo"
second_title: "C++ 用 Aspose.Page"
description: "System::Globalization::DateTimeFormatInfo クラス。日付と時刻の書式設定パラメータのセット。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうしないと実行時エラーやアサーション失敗が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、C++ で関数の引数としてこのポインタを使用してください。"
type: docs
weight: 600
url: /ja/cpp/system.globalization/datetimeformatinfo/
---
## DateTimeFormatInfo class


日付と時刻の書式設定パラメータのセット。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうしないと実行時エラーやアサーション失敗が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、関数の引数としてこのポインタを使用してください。

```cpp
class DateTimeFormatInfo : public virtual System::Object,
                           public System::IFormatProvider,
                           public System::ICloneable
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [Clone](./clone/)() override | 書式情報をクローンします。 |
| [DateTimeFormatInfo](./datetimeformatinfo/)() | デフォルトコンストラクタ。不変の書式情報を構築します。 |
| [get_AbbreviatedDayNames](./get_abbreviateddaynames/)() const | 省略形の曜日名を取得します。 |
| [get_AbbreviatedMonthGenitiveNames](./get_abbreviatedmonthgenitivenames/)() const | 属格形の省略形月名を取得します。 |
| [get_AbbreviatedMonthNames](./get_abbreviatedmonthnames/)() const | 省略形の月名を取得します。 |
| [get_AMDesignator](./get_amdesignator/)() const | AM デザインターを取得します。 |
| [get_Calendar](./get_calendar/)() const | フォーマッタに関連付けられたカレンダーを取得します。 |
| [get_CalendarWeekRule](./get_calendarweekrule/)() const | フォーマッタに関連付けられたカレンダー週ルールを取得します。 |
| static [get_CurrentInfo](./get_currentinfo/)() | 現在のスレッドの日時フォーマッタを取得します。 |
| [get_DateSeparator](./get_dateseparator/)() const | 日付区切り文字を取得します。 |
| [get_DayNames](./get_daynames/)() const | 曜日名を取得します。 |
| [get_FirstDayOfWeek](./get_firstdayofweek/)() const | 週の最初の日を取得します。 |
| [get_FullDateTimePattern](./get_fulldatetimepattern/)() const | 完全な日付と時刻のパターンを取得します。 |
| static [get_InvariantInfo](./get_invariantinfo/)() | 不変の日付と時刻のフォーマッタを取得します。 |
| [get_IsReadOnly](./get_isreadonly/)() const | フォーマッタが読み取り専用かどうかを確認します。 |
| [get_LongDatePattern](./get_longdatepattern/)() const | 長形式の日付パターンを取得します。 |
| [get_LongTimePattern](./get_longtimepattern/)() const | 長形式の時刻パターンを取得します。 |
| [get_MonthDayPattern](./get_monthdaypattern/)() const | 月日パターンを取得します。 |
| [get_MonthGenitiveNames](./get_monthgenitivenames/)() const | 属格形の月名を取得します。 |
| [get_MonthNames](./get_monthnames/)() const | 月名を取得します。 |
| [get_NativeCalendarName](./get_nativecalendarname/)() const | 利用可能な場合、ネイティブカレンダー名を取得します。 |
| [get_PMDesignator](./get_pmdesignator/)() const | PM デザインターを取得します。 |
| [get_RFC1123Pattern](./get_rfc1123pattern/)() const | RFC1123 パターンを取得します。 |
| [get_ShortDatePattern](./get_shortdatepattern/)() const | 短形式の日付パターンを取得します。 |
| [get_ShortestDayNames](./get_shortestdaynames/)() const | 可能な限り最短の曜日名を取得します。 |
| [get_ShortTimePattern](./get_shorttimepattern/)() const | 短形式の時刻パターンを取得します。 |
| [get_SortableDateTimePattern](./get_sortabledatetimepattern/)() const | ソート可能な日付と時刻のパターンを取得します。 |
| [get_TimeSeparator](./get_timeseparator/)() const | 時刻区切り文字を取得します。 |
| [get_UniversalSortableDateTimePattern](./get_universalsortabledatetimepattern/)() const | ユニバーサルにソート可能な日付と時刻のパターンを取得します。 |
| [get_YearMonthPattern](./get_yearmonthpattern/)() const | 年と月のパターンを取得します。 |
| [GetAbbreviatedDayName](./getabbreviateddayname/)(DayOfWeek) const | 省略形の曜日名を取得します。 |
| [GetAbbreviatedEraName](./getabbreviatederaname/)(int) const | 省略形の元号名を取得します。 |
| [GetAbbreviatedMonthName](./getabbreviatedmonthname/)(int) const | 省略形の月名を取得します。 |
| [GetAllDateTimePatterns](./getalldatetimepatterns/)() const | 日付と時刻の値をフォーマットできるすべてのパターンを取得します。 |
| [GetAllDateTimePatterns](./getalldatetimepatterns/)(char16_t) const | 指定された書式文字列を使用して、日付と時刻の値をフォーマットできるすべてのパターンを取得します。 |
| [GetDayName](./getdayname/)(DayOfWeek) const | 曜日名を取得します。 |
| [GetEra](./getera/)(const String\&) const | 名前で元号を取得します。 |
| [GetEraName](./geteraname/)(int) const | 元号名を取得します。 |
| [GetFormat](./getformat/)(const TypeInfo\&) override | 特定のタイプのフォーマッタを取得します。 |
| static [GetInstance](./getinstance/)(const IFormatProviderPtr\&) | フォーマットプロバイダーに関連付けられたフォーマッタを取得します。 |
| [GetLeapYearMonthName](./getleapyearmonthname/)(int) const | 閏年の月名を取得します。 |
| [GetMonthGenitiveName](./getmonthgenitivename/)(int) const | 属格の月名を取得します。 |
| [GetMonthName](./getmonthname/)(int) const | 月名を取得します。 |
| [GetShortestDayName](./getshortestdayname/)(DayOfWeek) const | 指定された曜日の最短名を取得します。 |
| [operator=](./operator=/)(const DateTimeFormatInfo\&) |  |
| static [ReadOnly](./readonly/)(const DateTimeFormatInfoPtr\&) | フォーマッタの読み取り専用バージョンを取得します。 |
| [set_AbbreviatedDayNames](./set_abbreviateddaynames/)(const ArrayPtr\<String\>\&) | 省略形の曜日名を設定します。 |
| [set_AbbreviatedMonthGenitiveNames](./set_abbreviatedmonthgenitivenames/)(const ArrayPtr\<String\>\&) | 属格形の省略形月名を設定します。 |
| [set_AbbreviatedMonthNames](./set_abbreviatedmonthnames/)(const ArrayPtr\<String\>\&) | 省略形の月名を設定します。 |
| [set_AMDesignator](./set_amdesignator/)(const String\&) | AM 表示を設定します。 |
| [set_Calendar](./set_calendar/)(const SharedPtr\<Calendar\>\&) | フォーマッタに関連付けられたカレンダーを設定します。 |
| [set_CalendarWeekRule](./set_calendarweekrule/)(CalendarWeekRule) | フォーマッタに関連付けられたカレンダー週ルールを設定します。 |
| [set_DateSeparator](./set_dateseparator/)(const String\&) | 日付区切り文字を設定します。 |
| [set_DayNames](./set_daynames/)(const ArrayPtr\<String\>\&) | 曜日名を設定します。 |
| [set_FirstDayOfWeek](./set_firstdayofweek/)(DayOfWeek) | 週の開始曜日を設定します。 |
| [set_FullDateTimePattern](./set_fulldatetimepattern/)(const String\&) | 完全な日付と時刻のパターンを設定します。 |
| [set_LongDatePattern](./set_longdatepattern/)(const String\&) | 長い日付パターンを設定します。 |
| [set_LongTimePattern](./set_longtimepattern/)(const String\&) | 長い時刻パターンを設定します。 |
| [set_MonthDayPattern](./set_monthdaypattern/)(const String\&) | 月日パターンを設定します。 |
| [set_MonthGenitiveNames](./set_monthgenitivenames/)(const ArrayPtr\<String\>\&) | 属格形の月名を設定します。 |
| [set_MonthNames](./set_monthnames/)(const ArrayPtr\<String\>\&) | 月名を設定します。 |
| [set_PMDesignator](./set_pmdesignator/)(const String\&) | PM 表示を設定します。 |
| [set_ShortDatePattern](./set_shortdatepattern/)(const String\&) | 短い日付パターンを設定します。 |
| [set_ShortestDayNames](./set_shortestdaynames/)(const ArrayPtr\<String\>\&) | 可能な限り最短の曜日名を設定します。 |
| [set_ShortTimePattern](./set_shorttimepattern/)(const String\&) | 短時間パターンを設定します。 |
| [set_TimeSeparator](./set_timeseparator/)(const String\&) | 時間区切り文字を設定します。 |
| [set_YearMonthPattern](./set_yearmonthpattern/)(const String\&) | 年と月のパターンを設定します。 |
| [SetAllDateTimePatterns](./setalldatetimepatterns/)(const ArrayPtr\<String\>\&, char16_t) | 指定された形式のパターンを設定します。 |
## 参照

* Class [Object](../../system/object/)
* Class [IFormatProvider](../../system/iformatprovider/)
* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Globalization](../)
* Library [Aspose.Page for C++](../../)
