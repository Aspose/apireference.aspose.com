---
title: "System::Globalization::StringInfo クラス"
linktitle: "StringInfo"
second_title: "C++ 用 Aspose.Page"
description: "System::Globalization::StringInfo クラス。 文字列部分を反復処理するためのスプリッタ。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないと実行時エラーやアサーション失敗が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、C++ で関数に引数として渡す際にこのポインタを使用してください。"
type: docs
weight: 2400
url: /ja/cpp/system.globalization/stringinfo/
---
## StringInfo class


文字列部分を反復処理するためのスプリッタ。 このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。 スタック上や operator new を使用してインスタンスを作成しないでください。そうしないと実行時エラーやアサーション失敗が発生します。 常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、関数の引数としてこのポインタを使用してください。

```cpp
class StringInfo : public virtual System::Object
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [Equals](./equals/)(SharedPtr\<Object\>) override |  |
| [get_LengthInTextElements](./get_lengthintextelements/)() const | [StringInfo](./) オブジェクト内のテキスト項目数を取得します。 |
| [get_String](./get_string/)() const | [StringInfo](./) オブジェクトの値を取得します。 |
| [GetHashCode](./gethashcode/)() const override | C# の [Object.GetHashCode()](../../system/object/gethashcode/) メソッドの類似です。カスタムオブジェクトのハッシュ化を可能にします。 |
| static [GetNextTextElement](./getnexttextelement/)(const String\&) | 指定された文字列の最初の要素を取得します。 |
| static [GetNextTextElement](./getnexttextelement/)(const String\&, int) | 指定された文字列の指定インデックスにある要素を取得します。 |
| static [GetTextElementEnumerator](./gettextelementenumerator/)(const String\&) | 文字列の文字を反復処理する列挙子を作成します。 |
| static [GetTextElementEnumerator](./gettextelementenumerator/)(const String\&, int) | 指定されたインデックスから開始して文字列の文字を反復処理する列挙子を作成します。 |
| [operator=](./operator=/)(const StringInfo\&) |  |
| static [ParseCombiningCharacters](./parsecombiningcharacters/)(const String\&) | 基本文字、高サロゲート、制御文字のインデックスを取得します。 |
| [set_String](./set_string/)(const String\&) | [StringInfo](./) オブジェクトの値を設定します。 |
| [StringInfo](./stringinfo/)() | RTTI 情報。 |
| [StringInfo](./stringinfo/)(const String\&) | コンストラクタ。 |
| [StringInfo](./stringinfo/)(const StringInfo\&) |  |
| [SubstringByTextElements](./substringbytextelements/)(int) const | 指定されたテキスト要素から最後のテキスト要素までのテキスト要素の部分文字列を取得します。 |
| [SubstringByTextElements](./substringbytextelements/)(int, int) const | 指定されたテキスト要素から指定された数のテキスト要素までのテキスト要素の部分文字列を取得します。 |
## 参照

* Class [Object](../../system/object/)
* Namespace [System::Globalization](../)
* Library [Aspose.Page for C++](../../)
