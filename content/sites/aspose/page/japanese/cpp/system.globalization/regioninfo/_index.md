---
title: "System::Globalization::RegionInfo クラス"
linktitle: "RegionInfo"
second_title: "C++ 用 Aspose.Page"
description: "System::Globalization::RegionInfo クラス。地域に関する情報を提供します。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないと実行時エラーやアサーション障害が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを C++ の関数への引数として使用してください。"
type: docs
weight: 2100
url: /ja/cpp/system.globalization/regioninfo/
---
## RegionInfo class


地域に関する情報を提供します。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないと実行時エラーやアサーション障害が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数への引数として使用してください。

```cpp
class RegionInfo : public virtual System::Object
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [Equals](./equals/)(SharedPtr\<Object\>) override |  |
| virtual [get_CurrencyEnglishName](./get_currencyenglishname/)() const | 通貨の英語名を取得します。 |
| virtual [get_CurrencyNativeName](./get_currencynativename/)() const | 通貨のローカル名を取得します。 |
| virtual [get_CurrencySymbol](./get_currencysymbol/)() const | 通貨記号を取得します。 |
| static [get_CurrentRegion](./get_currentregion/)() | システムで設定された地域を取得します。 |
| virtual [get_DisplayName](./get_displayname/)() const | 地域の完全名を取得します。 |
| virtual [get_EnglishName](./get_englishname/)() const | 地域の英語名を取得します。 |
| virtual [get_GeoId](./get_geoid/)() const | 地域の一意の識別子を取得します。 |
| virtual [get_IsMetric](./get_ismetric/)() const | 地域がメートル法を使用しているか確認します。 |
| virtual [get_ISOCurrencySymbol](./get_isocurrencysymbol/)() const | ISO 通貨記号を取得します。 |
| virtual [get_Name](./get_name/)() const | 地域名を取得します。 |
| virtual [get_NativeName](./get_nativename/)() const | 地域のローカル名を取得します。 |
| virtual [get_ThreeLetterISORegionName](./get_threeletterisoregionname/)() const | 3 文字の ISO 地域コードを取得します。 |
| virtual [get_ThreeLetterWindowsRegionName](./get_threeletterwindowsregionname/)() const | 3 文字の [Windows](../../system.windows/) 地域コードを取得します。 |
| virtual [get_TwoLetterISORegionName](./get_twoletterisoregionname/)() const | 2 文字の ISO 地域コードを取得します。 |
| [GetHashCode](./gethashcode/)() const override | C# の [Object.GetHashCode()](../../system/object/gethashcode/) メソッドの類似です。カスタムオブジェクトのハッシュ化を可能にします。 |
| [operator=](./operator=/)(const RegionInfo\&) |  |
| [RegionInfo](./regioninfo/)(const String\&) | RTTI 情報。 |
| [RegionInfo](./regioninfo/)(int) | コンストラクタ。 |
| [RegionInfo](./regioninfo/)(const RegionInfo\&) |  |
| [ToString](./tostring/)() const override | C# の [Object.ToString()](../../system/object/tostring/) メソッドに相当します。カスタムオブジェクトを文字列に変換できるようにします。 |
## 参照

* Class [Object](../../system/object/)
* Namespace [System::Globalization](../)
* Library [Aspose.Page for C++](../../)
