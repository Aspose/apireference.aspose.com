---
title: "System::Globalization::IdnMapping クラス"
linktitle: "IdnMapping"
second_title: "C++ 用 Aspose.Page"
description: "System::Globalization::IdnMapping クラス。 IdnMapping は名前を Punycode にマッピングするために使用されます。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないと実行時エラーやアサーション失敗が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、C++ で関数に引数として渡す際にこのポインタを使用してください。"
type: docs
weight: 1300
url: /ja/cpp/system.globalization/idnmapping/
---
## IdnMapping class


[IdnMapping](./) used to map names to Punycode. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class IdnMapping : public System::Object
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [Equals](./equals/)(SharedPtr\<Object\>) override | [IdnMapping](./) オブジェクトを 2 つ比較します。 |
| [get_AllowUnassigned](./get_allowunassigned/)() const | 操作で未割り当てコードポイントが使用されたかどうかを示すフラグを取得します。 |
| [get_UseStd3AsciiRules](./get_usestd3asciirules/)() const | 操作で標準的な命名規則が使用されたかどうかを示すフラグを取得します。 |
| [GetAscii](./getascii/)(const String\&) const | [Convert](../../system/convert/) ユニコードドメイン名を ASCII 等価に変換します。 |
| [GetAscii](./getascii/)(const String\&, int) const | [Convert](../../system/convert/) ユニコードドメイン名を ASCII 等価に変換します。 |
| [GetAscii](./getascii/)(const String\&, int, int) const | [Convert](../../system/convert/) ユニコードドメイン名を ASCII 等価に変換します。 |
| [GetHashCode](./gethashcode/)() const override | 現在の [IdnMapping](./) オブジェクトのハッシュコードを取得します。 |
| [GetUnicode](./getunicode/)(const String\&) const | [Convert](../../system/convert/) ASCII ドメイン名をユニコード等価に変換します。 |
| [GetUnicode](./getunicode/)(const String\&, int) const | [Convert](../../system/convert/) ASCII ドメイン名をユニコード等価に変換します。 |
| [GetUnicode](./getunicode/)(const String\&, int, int) const | [Convert](../../system/convert/) ASCII ドメイン名をユニコード等価に変換します。 |
| [IdnMapping](./idnmapping/)() | RTTI 情報。 |
| [IdnMapping](./idnmapping/)(const IdnMapping\&) |  |
| [operator=](./operator=/)(const IdnMapping\&) |  |
| [set_AllowUnassigned](./set_allowunassigned/)(bool) | 操作で使用される未割り当てコードポイントを示すフラグを設定します。 |
| [set_UseStd3AsciiRules](./set_usestd3asciirules/)(bool) | 操作で使用される標準的な命名規則を示すフラグを設定します。 |
## 参照

* Class [Object](../../system/object/)
* Namespace [System::Globalization](../)
* Library [Aspose.Page for C++](../../)
