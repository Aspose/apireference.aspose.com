---
title: "System::Globalization::JapaneseLunisolarCalendar class"
linktitle: "JapaneseLunisolarCalendar"
second_title: "C++ 用 Aspose.Page"
description: "System::Globalization::JapaneseLunisolarCalendar class。日本の太陰太陽暦です。実装されていません。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうしないと実行時エラーやアサーション失敗が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、C++ で関数に引数として渡す際にそのポインタを使用してください。"
type: docs
weight: 1500
url: /ja/cpp/system.globalization/japaneselunisolarcalendar/
---
## JapaneseLunisolarCalendar class


日本の太陰太陽暦です。実装されていません。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないと実行時エラーやアサーション失敗が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、関数に引数として渡す際にそのポインタを使用してください。

```cpp
class JapaneseLunisolarCalendar : public System::Globalization::EastAsianLunisolarCalendar
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [Clone](./clone/)() override | RTTI 情報。 |
| [get_Eras](./get_eras/)() const override | カレンダーに存在する元号の一覧を取得します。 |
| [get_MaxSupportedDateTime](./get_maxsupporteddatetime/)() const override | カレンダーがサポートする最大の時点。 |
| [get_MinSupportedDateTime](./get_minsupporteddatetime/)() const override | カレンダーがサポートする最小の時点。 |
| [GetEra](./getera/)(DateTime) const override | 指定された時点の元号を取得します。 |
| [GetLeapMonth](./getleapmonth/)(int, int) const override | 指定された年の閏月を取得します。 |
| virtual [GetLeapMonth](./getleapmonth/)(int) const | RTTI 情報。 |
| [GetYear](./getyear/)(DateTime) const override | 指定された時点の年を取得します。 |
| [IsLeapDay](./isleapday/)(int, int, int, int) const override | 日がうるう年かどうかをチェックします。 |
| virtual [IsLeapDay](./isleapday/)(int, int, int) const | 日がうるう年かどうかをチェックします。 |
| [IsLeapYear](./isleapyear/)(int, int) const override | 年がうるう年かどうかをチェックします。 |
| virtual [IsLeapYear](./isleapyear/)(int) const | 年がうるう年かどうかをチェックします。 |
| [JapaneseLunisolarCalendar](./japaneselunisolarcalendar/)() | コンストラクタ。 |
## フィールド

| フィールド | 説明 |
| --- | --- |
| static constexpr [JapaneseEra](./japaneseera/) | 現在の日本の元号。 |
## 参照

* Class [EastAsianLunisolarCalendar](../eastasianlunisolarcalendar/)
* Namespace [System::Globalization](../)
* Library [Aspose.Page for C++](../../)
