---
title: "System::StringComparer クラス"
linktitle: "StringComparer"
second_title: "C++ 用 Aspose.Page"
description: "System::StringComparer クラス。さまざまな比較モードを使用して文字列を比較します。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使ってインスタンスを作成しないでください。そうしないと実行時エラーやアサーション失敗が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを C++ の関数引数として渡すようにしてください。"
type: docs
weight: 5900
url: /ja/cpp/system/stringcomparer/
---
## StringComparer class


異なる比較モードを使用して文字列を比較します。このクラスのオブジェクトは [System::MakeObject()](../makeobject/) 関数を使用してのみ割り当てるべきです。このタイプのインスタンスをスタック上で作成したり operator new を使用したりしないでください。そうしないと実行時エラーやアサーション失敗が発生します。このクラスは常に [System::SmartPtr](../smartptr/) ポインタでラップし、そのポインタを関数への引数として渡してください。

```cpp
class StringComparer : public virtual System::Object,
                       public System::Collections::Generic::IComparer<String>,
                       public System::Collections::Generic::IEqualityComparer<String>
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [Compare](./compare/)(args_type, args_type) const override | 現在の設定を使用して2つの文字列を比較します。 |
| static [Create](./create/)(const System::SharedPtr\<System::Globalization::CultureInfo\>\&, bool) | カルチャ固有の比較子を作成します。 |
| [Equals](./equals/)(String, String) const override | 現在の設定を使用して2つの文字列が等しいかどうかを確認します。 |
| static [get_CurrentCulture](./get_currentculture/)() | 現在のカルチャ比較子シングルトン。 |
| static [get_CurrentCultureIgnoreCase](./get_currentcultureignorecase/)() | 現在のカルチャで大文字小文字を無視する比較子シングルトン。 |
| static [get_InvariantCulture](./get_invariantculture/)() | 不変カルチャ比較子シングルトン。 |
| static [get_InvariantCultureIgnoreCase](./get_invariantcultureignorecase/)() | 不変カルチャで大文字小文字を無視する比較子シングルトン。 |
| static [get_Ordinal](./get_ordinal/)() | 順序比較子シングルトン。 |
| static [get_OrdinalIgnoreCase](./get_ordinalignorecase/)() | 順序で大文字小文字を無視する比較子シングルトン。 |
| [GetHashCode](./gethashcode/)(String) const override | 文字列のハッシュコードを取得します。 |
## Typedefs

| 型定義 | 説明 |
| --- | --- |
| [args_type](./args_type/) | RTTI 情報。 |
## 参照

* Class [Object](../object/)
* Class [IComparer](../../system.collections.generic/icomparer/)
* Class [IEqualityComparer](../../system.collections.generic/iequalitycomparer/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
