---
title: "System::TimeZone class"
linktitle: "TimeZone"
second_title: "C++ 用 Aspose.Page"
description: "System::TimeZone クラス。タイムゾーンを表します。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないと実行時エラーやアサーション違反が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを C++ で関数の引数として渡すようにしてください。"
type: docs
weight: 6200
url: /ja/cpp/system/timezone/
---
## TimeZone class


タイムゾーンを表します。このクラスのオブジェクトは [System::MakeObject()](../makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないと実行時エラーやアサーション違反が発生します。常にこのクラスを [System::SmartPtr](../smartptr/) ポインタでラップし、そのポインタを関数の引数として渡すようにしてください。

```cpp
class TimeZone : public System::Object
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| static [get_CurrentTimeZone](./get_currenttimezone/)() | 現在のタイムゾーンを表す [TimeZone](./) クラスの新しいインスタンスを返します。 |
| virtual [get_DaylightName](./get_daylightname/)() const | 現在のオブジェクトが表すタイムゾーンの夏時間の名称を返します。 |
| virtual [get_StandardName](./get_standardname/)() const | 現在のオブジェクトが表すタイムゾーンの標準時の名称を返します。 |
| virtual [GetDaylightChanges](./getdaylightchanges/)(int32_t) | 特定の年の夏時間期間を返します。 |
| virtual [GetUtcOffset](./getutcoffset/)(DateTime) | 指定されたローカル時間に対する UTC オフセットを返します。 |
| virtual [IsDaylightSavingTime](./isdaylightsavingtime/)(DateTime) | 指定された [DateTime](../datetime/) オブジェクトが表す日時が、現在の [TimeZone](./) オブジェクトが表すタイムゾーンの夏時間範囲に含まれるかどうかを判定します。 |
## 参照

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
