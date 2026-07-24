---
title: "System::Globalization::SortVersion クラス"
linktitle: "SortVersion"
second_title: "C++ 用 Aspose.Page"
description: "System::Globalization::SortVersion クラス。文字列の比較および順序付けに使用される Unicode バージョンに関する情報を提供します。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないと実行時エラーやアサーション障害が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、C++ で関数に引数として渡す際はそのポインタを使用してください。"
type: docs
weight: 2300
url: /ja/cpp/system.globalization/sortversion/
---
## SortVersion class


文字列の比較および順序付けに使用される Unicode バージョンに関する情報を提供します。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないと実行時エラーやアサーション障害が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、関数に引数として渡す際はそのポインタを使用してください。

```cpp
class SortVersion : public System::IEquatable<SharedPtr<SortVersion>>
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [Equals](./equals/)(SharedPtr\<SortVersion\>) override | 現在の [SortVersion](./) インスタンスが指定された [SortVersion](./) オブジェクトと等しいか確認します。 |
| [Equals](./equals/)(SharedPtr\<Object\>) override | 現在の [SortVersion](./) インスタンスが指定された [SortVersion](./) オブジェクトと等しいか確認します。 |
| [get_FullVersion](./get_fullversion/)() | 完全なバージョン番号を取得します。 |
| [get_SortId](./get_sortid/)() | このオブジェクトの一意の識別子を取得します。 |
| [GetHashCode](./gethashcode/)() const override | 現在のオブジェクトのハッシュコードを取得します。 |
| [operator!=](./operator!=/)(const SortVersion\&) | 現在の [SortVersion](./) インスタンスが指定された [SortVersion](./) オブジェクトと等しくないかどうかをチェックします。 |
| [operator=](./operator=/)(const SortVersion\&) |  |
| [operator==](./operator==/)(const SortVersion\&) | 現在の [SortVersion](./) インスタンスが指定された [SortVersion](./) オブジェクトと等しいか確認します。 |
| [SortVersion](./sortversion/)(int, const Guid\&) | RTTI 情報。 |
| [SortVersion](./sortversion/)(const SortVersion\&) |  |
## 参照

* Class [IEquatable](../../system/iequatable/)
* Namespace [System::Globalization](../)
* Library [Aspose.Page for C++](../../)
