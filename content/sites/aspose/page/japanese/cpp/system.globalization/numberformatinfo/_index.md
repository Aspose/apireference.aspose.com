---
title: "System::Globalization::NumberFormatInfo クラス"
linktitle: "NumberFormatInfo"
second_title: "C++ 用 Aspose.Page"
description: "System::Globalization::NumberFormatInfo クラス。数値の書式設定方法に関する情報を保持します。セッター操作は読み取り専用でないオブジェクトでのみ有効です。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないとランタイムエラーやアサーション障害が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを C++ の関数に引数として渡す際に使用してください。"
type: docs
weight: 1900
url: /ja/cpp/system.globalization/numberformatinfo/
---
## NumberFormatInfo class


数値の書式設定方法に関する情報を保持します。セッター操作は読み取り専用でないオブジェクトでのみ有効です。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないとランタイムエラーやアサーション障害が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数に引数として渡す際に使用してください。

```cpp
class NumberFormatInfo : public virtual System::Object,
                         public System::IFormatProvider,
                         public System::ICloneable
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [Clone](./clone/)() override | 書式情報をクローンします。 |
| [get_CurrencyDecimalDigits](./get_currencydecimaldigits/)() const | 通貨の小数桁数を取得します。 |
| [get_CurrencyDecimalSeparator](./get_currencydecimalseparator/)() const | 通貨の小数点区切り文字を取得します。 |
| [get_CurrencyGroupSeparator](./get_currencygroupseparator/)() const | 通貨の桁区切り文字を取得します。 |
| [get_CurrencyGroupSizes](./get_currencygroupsizes/)() const | グループごとの通貨小数桁数を取得します。 |
| [get_CurrencyNegativePattern](./get_currencynegativepattern/)() const | 通貨の負のパターンを取得します。 |
| [get_CurrencyPositivePattern](./get_currencypositivepattern/)() const | 通貨の正のパターンを取得します。 |
| [get_CurrencySymbol](./get_currencysymbol/)() const | 通貨記号を取得します。 |
| static [get_CurrentInfo](./get_currentinfo/)() | 現在のスレッドのカルチャで定義された数値書式情報を取得します。 |
| [get_DigitSubstitution](./get_digitsubstitution/)() const | 数字の形状を表示する方法を指定する値を取得します。 |
| static [get_InvariantInfo](./get_invariantinfo/)() | 不変カルチャで定義された数値書式情報を取得します。 |
| [get_IsReadOnly](./get_isreadonly/)() const | 書式が読み取り専用かどうかを確認します。 |
| [get_NaNSymbol](./get_nansymbol/)() const | 非数（NaN）記号を取得します。 |
| [get_NativeDigits](./get_nativedigits/)() const | 数字記号（0 から 9）を取得します。 |
| [get_NegativeInfinitySymbol](./get_negativeinfinitysymbol/)() const | 負の無限大記号を取得します。 |
| [get_NegativeSign](./get_negativesign/)() const | 負の符号を取得します。 |
| [get_NumberDecimalDigits](./get_numberdecimaldigits/)() const | 小数桁数を取得します。 |
| [get_NumberDecimalSeparator](./get_numberdecimalseparator/)() const | 小数点区切り文字を取得します。 |
| [get_NumberGroupSeparator](./get_numbergroupseparator/)() const | 数値の桁区切り文字を取得します。 |
| [get_NumberGroupSizes](./get_numbergroupsizes/)() const | グループごとの桁数を取得します。 |
| [get_NumberNegativePattern](./get_numbernegativepattern/)() const | 数値の負のパターンを取得します。 |
| [get_PercentDecimalDigits](./get_percentdecimaldigits/)() const | パーセンテージ値の小数位数を取得します。 |
| [get_PercentDecimalSeparator](./get_percentdecimalseparator/)() const | パーセンテージ値の小数点区切り文字を取得します。 |
| [get_PercentGroupSeparator](./get_percentgroupseparator/)() const | パーセンテージ値の桁区切り文字を取得します。 |
| [get_PercentGroupSizes](./get_percentgroupsizes/)() const | パーセンテージ値グループごとの桁数を取得します。 |
| [get_PercentNegativePattern](./get_percentnegativepattern/)() const | パーセンテージの負のパターンを取得します。 |
| [get_PercentPositivePattern](./get_percentpositivepattern/)() const | パーセンテージの正のパターンを取得します。 |
| [get_PercentSymbol](./get_percentsymbol/)() const | パーセント記号を取得します。 |
| [get_PerMilleSymbol](./get_permillesymbol/)() const | パーミル記号を取得します。 |
| [get_PositiveInfinitySymbol](./get_positiveinfinitysymbol/)() const | 正の無限大記号を取得します。 |
| [get_PositiveSign](./get_positivesign/)() const | 正符号を取得します。 |
| [GetFormat](./getformat/)(const TypeInfo\&) override | 特定のタイプのフォーマッタを取得します。 |
| static [GetInstance](./getinstance/)(const IFormatProviderPtr\&) | フォーマットプロバイダーに関連付けられたフォーマッタを取得します。 |
| [NumberFormatInfo](./numberformatinfo/)() | デフォルトコンストラクタ（不変の[NumberFormatInfo](./)）。 |
| [operator=](./operator=/)(const NumberFormatInfo\&) |  |
| static [ReadOnly](./readonly/)(NumberFormatInfoPtr) | フォーマッタの読み取り専用バージョンを取得します。 |
| [set_CurrencyDecimalDigits](./set_currencydecimaldigits/)(int) | 通貨の小数桁数を設定します。 |
| [set_CurrencyDecimalSeparator](./set_currencydecimalseparator/)(const String\&) | 通貨の小数区切り記号を設定します。 |
| [set_CurrencyGroupSeparator](./set_currencygroupseparator/)(const String\&) | 通貨の桁区切り記号を設定します。 |
| [set_CurrencyGroupSizes](./set_currencygroupsizes/)(const ArrayPtr\<int\>\&) | グループごとの通貨小数桁数を設定します。 |
| [set_CurrencyNegativePattern](./set_currencynegativepattern/)(int) | 通貨の負のパターンを設定します。 |
| [set_CurrencyPositivePattern](./set_currencypositivepattern/)(int) | 通貨の正のパターンを設定します。 |
| [set_CurrencySymbol](./set_currencysymbol/)(const String\&) | 通貨記号を設定します。 |
| [set_DigitSubstitution](./set_digitsubstitution/)(DigitShapes) | 数字の形状表示方法を指定する値を設定します。 |
| [set_NaNSymbol](./set_nansymbol/)(const String\&) | 非数（NaN）記号を設定します。 |
| [set_NativeDigits](./set_nativedigits/)(const ArrayPtr\<String\>\&) | 数字記号（0〜9）を設定します。 |
| [set_NegativeInfinitySymbol](./set_negativeinfinitysymbol/)(const String\&) | 負の無限大記号を設定します。 |
| [set_NegativeSign](./set_negativesign/)(const String\&) | 負符号を設定します。 |
| [set_NumberDecimalDigits](./set_numberdecimaldigits/)(int) | 小数桁数を設定します。 |
| [set_NumberDecimalSeparator](./set_numberdecimalseparator/)(const String\&) | 小数区切り記号を設定します。 |
| [set_NumberGroupSeparator](./set_numbergroupseparator/)(const String\&) | 桁区切り記号を設定します。 |
| [set_NumberGroupSizes](./set_numbergroupsizes/)(const ArrayPtr\<int\>\&) | グループごとの桁数を設定します。 |
| [set_NumberNegativePattern](./set_numbernegativepattern/)(int) | 数値の負のパターンを設定します。 |
| [set_PercentDecimalDigits](./set_percentdecimaldigits/)(int) | パーセント値の小数点以下の桁数を設定します。 |
| [set_PercentDecimalSeparator](./set_percentdecimalseparator/)(const String\&) | パーセント値の小数点区切り文字を設定します。 |
| [set_PercentGroupSeparator](./set_percentgroupseparator/)(const String\&) | パーセント値の桁区切り文字を設定します。 |
| [set_PercentGroupSizes](./set_percentgroupsizes/)(const ArrayPtr\<int\>\&) | パーセント値のグループごとの桁数を設定します。 |
| [set_PercentNegativePattern](./set_percentnegativepattern/)(int) | パーセントの負のパターンを設定します。 |
| [set_PercentPositivePattern](./set_percentpositivepattern/)(int) | パーセントの正のパターンを設定します。 |
| [set_PercentSymbol](./set_percentsymbol/)(const String\&) | パーセント記号を設定します。 |
| [set_PerMilleSymbol](./set_permillesymbol/)(const String\&) | パーミル記号を設定します。 |
| [set_PositiveInfinitySymbol](./set_positiveinfinitysymbol/)(const String\&) | 正の無限大記号を設定します。 |
| [set_PositiveSign](./set_positivesign/)(const String\&) | 正の符号を設定します。 |
## 参照

* Class [Object](../../system/object/)
* Class [IFormatProvider](../../system/iformatprovider/)
* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Globalization](../)
* Library [Aspose.Page for C++](../../)
