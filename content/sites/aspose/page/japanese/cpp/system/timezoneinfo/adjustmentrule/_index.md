---
title: "System::TimeZoneInfo::AdjustmentRule クラス"
linktitle: "AdjustmentRule"
second_title: "C++ 用 Aspose.Page"
description: "System::TimeZoneInfo::AdjustmentRule クラス。タイムゾーンの調整に関する情報を提供します。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使ってインスタンスを作成しないでください。そうしないと実行時エラーやアサーション障害が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを C++ の関数に引数として渡すようにしてください。"
type: docs
weight: 3300
url: /ja/cpp/system/timezoneinfo/adjustmentrule/
---
## AdjustmentRule class


タイムゾーンの調整に関する情報を提供します。このクラスのオブジェクトは [System::MakeObject()](../../makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使ってインスタンスを作成しないでください。そうしないと実行時エラーやアサーション障害が発生します。常にこのクラスを [System::SmartPtr](../../smartptr/) ポインタでラップし、そのポインタを関数の引数として渡すようにしてください。

```cpp
class AdjustmentRule : public System::IEquatable<AdjustmentRulePtr>
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| static [CreateAdjustmentRule](./createadjustmentrule/)(DateTime, DateTime, TimeSpan, const TransitionTime\&, const TransitionTime\&) | 指定されたパラメータで記述された時間調整ルールを表す [AdjustmentRule](./) クラスのインスタンスを作成します。 |
| static [CreateAdjustmentRule](./createadjustmentrule/)(DateTime, DateTime, TimeSpan, const TransitionTime\&, const TransitionTime\&, TimeSpan, bool) | 指定されたパラメータで記述された時間調整ルールを表す [AdjustmentRule](./) クラスのインスタンスを作成します。 |
| [Equals](./equals/)(AdjustmentRulePtr) override |  |
| [get_BaseUtcOffsetDelta](./get_baseutcoffsetdelta/)() const | デフォルトの UTC オフセットからの差分を返します。 |
| [get_DateEnd](./get_dateend/)() const | 調整ルールが無効になる日時を表す [DateTime](../../datetime/) オブジェクトを返します。 |
| [get_DateStart](./get_datestart/)() const | 調整ルールが有効になる日時を表す [DateTime](../../datetime/) オブジェクトを返します。 |
| [get_DaylightDelta](./get_daylightdelta/)() const | タイムゾーンのサマータイムを形成するのに必要な時間量を表す [TimeSpan](../../timespan/) オブジェクトを返します。 |
| [get_DaylightTransitionEnd](./get_daylighttransitionend/)() const | 標準時からサマータイムへの移行に関する情報を返します。 |
| [get_DaylightTransitionStart](./get_daylighttransitionstart/)() const | サマータイムから標準時への移行に関する情報を返します。 |
| [get_HasDaylightSaving](./get_hasdaylightsaving/)() const | 内部使用のみ。 |
| [GetHashCode](./gethashcode/)() const override | C# の [Object.GetHashCode()](../../object/gethashcode/) メソッドの類似です。カスタムオブジェクトのハッシュ化を可能にします。 |
## 参照

* Class [IEquatable](../../iequatable/)
* Class [TimeZoneInfo](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
