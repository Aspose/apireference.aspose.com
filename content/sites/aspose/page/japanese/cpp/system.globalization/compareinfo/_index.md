---
title: "System::Globalization::CompareInfo class"
linktitle: "CompareInfo"
second_title: "C++ 用 Aspose.Page"
description: "System::Globalization::CompareInfo クラス。カルチャーに依存した文字列比較を行います。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうしないと実行時エラーやアサーション障害が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、C++ で関数の引数としてこのポインタを使用してください。"
type: docs
weight: 400
url: /ja/cpp/system.globalization/compareinfo/
---
## CompareInfo class


カルチャーに依存した文字列比較を行います。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうしないと実行時エラーやアサーション障害が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、関数の引数としてこのポインタを使用してください。

```cpp
class CompareInfo : public virtual System::Object
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| virtual [Compare](./compare/)(const String\&, const String\&) const | 文字列を比較します。未実装です。 |
| virtual [Compare](./compare/)(const String\&, const String\&, CompareOptions) const | 文字列を比較します。Ordinal と OrdinalIgnoreCase モードのみがサポートされています。 |
| virtual [Compare](./compare/)(const String\&, int, int, const String\&, int, int) const | 1 つの文字列の一部と別の文字列の一部を比較します。未実装です。 |
| virtual [Compare](./compare/)(const String\&, int, const String\&, int, CompareOptions) const | 文字列比較メソッドを使用して、1 つの文字列の末尾部分と別の文字列の末尾部分を比較します。未実装です。 |
| virtual [Compare](./compare/)(const String\&, int, const String\&, int) const | 1 つの文字列の末尾部分と別の文字列の末尾部分を比較します。未実装です。 |
| virtual [Compare](./compare/)(const String\&, int, int, const String\&, int, int, CompareOptions) const | 文字列比較メソッドを使用して、1 つの文字列の一部と別の文字列の一部を比較します。未実装です。 |
| [CompareInfo](./compareinfo/)(const CompareInfo\&) | RTTI 情報。 |
| [Equals](./equals/)(SharedPtr\<Object\>) override |  |
| [get_LCID](./get_lcid/)() const | 比較対象に関連付けられたカルチャーの LCID を取得します。 |
| virtual [get_Name](./get_name/)() const | 比較対象に関連付けられたカルチャーの名前を取得します。 |
| [get_Version](./get_version/)() const | ソート バージョンに関する情報を取得します。 |
| static [GetCompareInfo](./getcompareinfo/)(int, const SharedPtr\<Reflection::Assembly\>\&) | 指定されたカルチャーに関連付けられた [CompareInfo](./) を取得し、指定されたアセンブリの文字列比較メソッドを使用します。 |
| static [GetCompareInfo](./getcompareinfo/)(const String\&, const SharedPtr\<Reflection::Assembly\>\&) | 指定されたカルチャーに関連付けられた [CompareInfo](./) を取得し、指定されたアセンブリの文字列比較メソッドを使用します。 |
| static [GetCompareInfo](./getcompareinfo/)(int) | 指定されたカルチャーに関連付けられた [CompareInfo](./) を取得します。 |
| static [GetCompareInfo](./getcompareinfo/)(const String\&) | 指定されたカルチャーに関連付けられた [CompareInfo](./) を取得します。 |
| virtual [GetHashCode](./gethashcode/)(const String\&, CompareOptions) const | 指定された比較オプションに基づく文字列のハッシュコードを取得します。 |
| [GetHashCode](./gethashcode/)() const override | C# の [Object.GetHashCode()](../../system/object/gethashcode/) メソッドの類似です。カスタムオブジェクトのハッシュ化を可能にします。 |
| virtual [GetSortKey](./getsortkey/)(const String\&, CompareOptions) const | 指定された比較オプションを使用して、指定された文字列の [SortKey](../sortkey/) オブジェクトを取得します。 |
| virtual [GetSortKey](./getsortkey/)(const String\&) const | 指定された文字列の [SortKey](../sortkey/) オブジェクトを取得します。 |
| virtual [IndexOf](./indexof/)(const String\&, const String\&, int, int) const | 部分文字列を検索します。 |
| virtual [IndexOf](./indexof/)(const String\&, const String\&, int, CompareOptions) const | 部分文字列を検索します。Ordinal モードのみがサポートされています。 |
| virtual [IndexOf](./indexof/)(const String\&, const String\&, int, int, CompareOptions) const | 部分文字列を検索します。Ordinal モードのみがサポートされています。 |
| virtual [IndexOf](./indexof/)(const String\&, char16_t, int, int, CompareOptions) const | 指定された文字を検索します。Ordinal モードのみがサポートされています。 |
| virtual [IndexOf](./indexof/)(const String\&, const String\&, int) const | 部分文字列を検索します。 |
| virtual [IndexOf](./indexof/)(const String\&, char16_t) const | 指定された文字を検索します。 |
| virtual [IndexOf](./indexof/)(const String\&, const String\&) const | 部分文字列を検索します。 |
| virtual [IndexOf](./indexof/)(const String\&, char16_t, int, CompareOptions) const | 指定された文字を検索します。Ordinal モードのみがサポートされています。 |
| virtual [IndexOf](./indexof/)(const String\&, char16_t, int, int) const | 指定された文字を検索します。 |
| virtual [IndexOf](./indexof/)(const String\&, char16_t, int) const | 指定された文字を検索します。 |
| virtual [IndexOf](./indexof/)(const String\&, const String\&, CompareOptions) const | 部分文字列を検索します。Ordinal モードのみがサポートされています。 |
| virtual [IndexOf](./indexof/)(const String\&, char16_t, CompareOptions) const | 指定された文字を検索します。Ordinal モードのみがサポートされています。 |
| virtual [IsPrefix](./isprefix/)(const String\&, const String\&, CompareOptions) const | 指定された比較オプションを使用して、指定された文字列が指定されたプレフィックスで始まるかどうかを確認します。 |
| virtual [IsPrefix](./isprefix/)(const String\&, const String\&) const | 指定された文字列が指定されたプレフィックスで始まるかどうかを確認します。 |
| static [IsSortable](./issortable/)(char16_t) | 指定された文字が並べ替え可能かどうかを確認します。 |
| static [IsSortable](./issortable/)(const String\&) | 指定された文字列が並べ替え可能かどうかを確認します。 |
| virtual [IsSuffix](./issuffix/)(const String\&, const String\&, CompareOptions) const | 指定された比較オプションを使用して、指定された文字列が指定されたサフィックスで終わるかどうかを確認します。 |
| virtual [IsSuffix](./issuffix/)(const String\&, const String\&) const | 指定された文字列が指定されたサフィックスで終わるかどうかを確認します。 |
| virtual [LastIndexOf](./lastindexof/)(const String\&, const String\&) const | 指定された部分文字列の最後の出現箇所を検索します。 |
| virtual [LastIndexOf](./lastindexof/)(const String\&, const String\&, int, int, CompareOptions) const | 指定された比較オプションを使用して、指定された部分文字列の最後の出現箇所を検索します。 |
| virtual [LastIndexOf](./lastindexof/)(const String\&, char16_t, int, int, CompareOptions) const | 指定された比較オプションを使用して、指定された文字の最後の出現箇所を検索します。 |
| virtual [LastIndexOf](./lastindexof/)(const String\&, const String\&, int, int) const | 指定された文字列の最後の出現箇所を検索します。 |
| virtual [LastIndexOf](./lastindexof/)(const String\&, const String\&, int, CompareOptions) const | 指定された比較オプションを使用して、指定された文字列の最後の出現箇所を検索します。 |
| virtual [LastIndexOf](./lastindexof/)(const String\&, char16_t, int, CompareOptions) const | 指定された比較オプションを使用して、指定された文字の最後の出現箇所を検索します。 |
| virtual [LastIndexOf](./lastindexof/)(const String\&, const String\&, int) const | 指定された文字列の最後の出現箇所を検索します。 |
| virtual [LastIndexOf](./lastindexof/)(const String\&, char16_t, int) const | 指定された文字の最後の出現箇所を検索します。 |
| virtual [LastIndexOf](./lastindexof/)(const String\&, const String\&, CompareOptions) const | 指定された比較オプションを使用して、指定された文字列の最後の出現箇所を検索します。 |
| virtual [LastIndexOf](./lastindexof/)(const String\&, char16_t, CompareOptions) const | 指定された比較オプションを使用して、指定された文字の最後の出現箇所を検索します。 |
| virtual [LastIndexOf](./lastindexof/)(const String\&, char16_t) const | 指定された文字の最後の出現箇所を検索します。 |
| virtual [LastIndexOf](./lastindexof/)(const String\&, char16_t, int, int) const | 指定された文字の最後の出現箇所を検索します。 |
| [operator=](./operator=/)(const CompareInfo\&) |  |
| [ToString](./tostring/)() const override | C# の [Object.ToString()](../../system/object/tostring/) メソッドに相当します。カスタムオブジェクトを文字列に変換できるようにします。 |
## 参照

* Class [Object](../../system/object/)
* Namespace [System::Globalization](../)
* Library [Aspose.Page for C++](../../)
